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

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt497;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private int anInt496 = 6;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "Z")
	private boolean aBoolean104 = false;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
	private boolean aBoolean105 = false;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Z")
	private boolean aBoolean106 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lclient!a;Ljava/net/Socket;I)V")
	public Class8(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
			if (arg2 < this.anInt496 || arg2 > this.anInt496) {
				throw new NullPointerException();
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("6838, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method244() {
		this.aBoolean106 = true;
		try {
			if (this.anInputStream1 != null) {
				this.anInputStream1.close();
			}
			if (this.anOutputStream1 != null) {
				this.anOutputStream1.close();
			}
			if (this.aSocket1 != null) {
				this.aSocket1.close();
			}
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean107 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method245() throws IOException {
		return this.aBoolean106 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method246() throws IOException {
		return this.aBoolean106 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method247(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean106) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BIII)V")
	public void method248(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean106) {
				if (this.aBoolean108) {
					this.aBoolean108 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray3[this.anInt498] = arg0[local28 + 0];
						this.anInt498 = (this.anInt498 + 1) % 5000;
						if (this.anInt498 == (this.anInt497 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean107) {
						this.aBoolean107 = true;
						this.anApplet_Sub1_2.method96(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("94752, " + arg0 + ", " + 0 + ", " + 0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean107) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt498 == this.anInt497) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean107) {
					return;
				}
				local27 = this.anInt497;
				if (this.anInt498 >= this.anInt497) {
					local38 = this.anInt498 - this.anInt497;
				} else {
					local38 = 5000 - this.anInt497;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean108 = true;
				}
				this.anInt497 = (this.anInt497 + local38) % 5000;
				try {
					if (this.anInt498 == this.anInt497) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean108 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V")
	public void method249() {
		try {
			System.out.println("dummy:" + this.aBoolean106);
			System.out.println("tcycl:" + this.anInt497);
			System.out.println("tnum:" + this.anInt498);
			System.out.println("writer:" + this.aBoolean107);
			System.out.println("ioerror:" + this.aBoolean108);
			try {
				System.out.println("available:" + this.method246());
			} catch (@Pc(73) IOException local73) {
			}
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("98587, " + -610 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}
}
