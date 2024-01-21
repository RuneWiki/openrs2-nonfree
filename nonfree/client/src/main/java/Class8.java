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

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private int anInt491;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "i", descriptor = "I")
	private int anInt492;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt493;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private int anInt490 = 2;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Z")
	private boolean aBoolean85 = false;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "Z")
	private boolean aBoolean86 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean87 = false;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Ljava/net/Socket;ZLclient!a;)V")
	public Class8(@OriginalArg(0) Socket arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket1 = arg0;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("47677, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method236() {
		this.aBoolean85 = true;
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
		this.aBoolean86 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method237() throws IOException {
		return this.aBoolean85 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method238() throws IOException {
		return this.aBoolean85 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method239(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean85) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BIIZ)V")
	public void method240(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) throws IOException {
		try {
			if (!this.aBoolean85) {
				if (this.aBoolean87) {
					this.aBoolean87 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
						this.aByteArray3[this.anInt493] = arg0[local31 + 0];
						this.anInt493 = (this.anInt493 + 1) % 5000;
						if (this.anInt493 == (this.anInt492 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean86) {
						this.aBoolean86 = true;
						this.anApplet_Sub1_2.method90(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("67627, " + arg0 + ", " + 0 + ", " + arg1 + ", " + false + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean86) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt493 == this.anInt492) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean86) {
					return;
				}
				local27 = this.anInt492;
				if (this.anInt493 >= this.anInt492) {
					local38 = this.anInt493 - this.anInt492;
				} else {
					local38 = 5000 - this.anInt492;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean87 = true;
				}
				this.anInt492 = (this.anInt492 + local38) % 5000;
				try {
					if (this.anInt493 == this.anInt492) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean87 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method241() {
		try {
			System.out.println("dummy:" + this.aBoolean85);
			System.out.println("tcycl:" + this.anInt492);
			System.out.println("tnum:" + this.anInt493);
			System.out.println("writer:" + this.aBoolean86);
			System.out.println("ioerror:" + this.aBoolean87);
			try {
				System.out.println("available:" + this.method238());
			} catch (@Pc(67) IOException local67) {
			}
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("33941, " + 30 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}
}
