import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 implements Runnable {

	@OriginalMember(owner = "client!e", name = "g", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "I")
	private int anInt483;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt484;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "B")
	private byte aByte11 = -28;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!a;ZLjava/net/Socket;)V")
	public Class8(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket2.getInputStream();
			this.anOutputStream1 = this.aSocket2.getOutputStream();
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("67356, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method247() {
		this.aBoolean105 = true;
		try {
			if (this.anInputStream1 != null) {
				this.anInputStream1.close();
			}
			if (this.anOutputStream1 != null) {
				this.anOutputStream1.close();
			}
			if (this.aSocket2 != null) {
				this.aSocket2.close();
			}
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean106 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method248() throws IOException {
		return this.aBoolean105 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method249() throws IOException {
		return this.aBoolean105 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method250(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean105) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream1.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BBII)V")
	public void method251(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (!this.aBoolean105) {
				if (this.aBoolean107) {
					this.aBoolean107 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					@Pc(30) int local30 = 0;
					while (true) {
						if (local30 >= arg1) {
							if (!this.aBoolean106) {
								this.aBoolean106 = true;
								this.anApplet_Sub1_2.method95(this, 3);
							}
							this.notify();
							break;
						}
						this.aByteArray3[this.anInt484] = arg0[local30 + 0];
						this.anInt484 = (this.anInt484 + 1) % 5000;
						if (this.anInt484 == (this.anInt483 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
						local30++;
					}
				}
				if (this.aByte11 != -28) {
					for (@Pc(94) int local94 = 1; local94 > 0; local94++) {
					}
				}
			}
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("27821, " + arg0 + ", " + -28 + ", " + arg1 + ", " + 0 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean106) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt484 == this.anInt483) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean106) {
					return;
				}
				local27 = this.anInt483;
				if (this.anInt484 >= this.anInt483) {
					local38 = this.anInt484 - this.anInt483;
				} else {
					local38 = 5000 - this.anInt483;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean107 = true;
				}
				this.anInt483 = (this.anInt483 + local38) % 5000;
				try {
					if (this.anInt484 == this.anInt483) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean107 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(Z)V")
	public void method252() {
		try {
			System.out.println("dummy:" + this.aBoolean105);
			System.out.println("tcycl:" + this.anInt483);
			System.out.println("tnum:" + this.anInt484);
			System.out.println("writer:" + this.aBoolean106);
			System.out.println("ioerror:" + this.aBoolean107);
			try {
				System.out.println("available:" + this.method249());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("98032, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
