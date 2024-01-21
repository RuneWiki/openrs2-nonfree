import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GBBCHPEB")
public final class Class14 implements Runnable {

	@OriginalMember(owner = "client!GBBCHPEB", name = "g", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!GBBCHPEB", name = "h", descriptor = "I")
	private int anInt235;

	@OriginalMember(owner = "client!GBBCHPEB", name = "i", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "Z")
	private boolean aBoolean66 = false;

	@OriginalMember(owner = "client!GBBCHPEB", name = "e", descriptor = "Z")
	private boolean aBoolean67 = false;

	@OriginalMember(owner = "client!GBBCHPEB", name = "j", descriptor = "Z")
	private boolean aBoolean68 = false;

	@OriginalMember(owner = "client!GBBCHPEB", name = "k", descriptor = "Z")
	private boolean aBoolean69 = false;

	@OriginalMember(owner = "client!GBBCHPEB", name = "f", descriptor = "Lclient!EBSHSFRY;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!GBBCHPEB", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!GBBCHPEB", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!GBBCHPEB", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!GBBCHPEB", name = "<init>", descriptor = "(BLclient!EBSHSFRY;Ljava/net/Socket;)V")
	public Class14(@OriginalArg(0) byte arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg1;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("1253, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "()V")
	public void method187() {
		this.aBoolean67 = true;
		try {
			if (this.anInputStream2 != null) {
				this.anInputStream2.close();
			}
			if (this.anOutputStream2 != null) {
				this.anOutputStream2.close();
			}
			if (this.aSocket2 != null) {
				this.aSocket2.close();
			}
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean68 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray6 = null;
	}

	@OriginalMember(owner = "client!GBBCHPEB", name = "b", descriptor = "()I")
	public int method188() throws IOException {
		return this.aBoolean67 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!GBBCHPEB", name = "c", descriptor = "()I")
	public int method189() throws IOException {
		return this.aBoolean67 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "([BII)V")
	public void method190(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean67) {
			return;
		}
		while (arg2 > 0) {
			@Pc(11) int local11 = this.anInputStream2.read(arg0, arg1, arg2);
			if (local11 <= 0) {
				throw new IOException("EOF");
			}
			arg1 += local11;
			arg2 -= local11;
		}
	}

	@OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "(IZ[BI)V")
	public void method191(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean67) {
				if (this.aBoolean69) {
					this.aBoolean69 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray6 == null) {
					this.aByteArray6 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray6[this.anInt236] = arg0[local28 + 0];
						this.anInt236 = (this.anInt236 + 1) % 5000;
						if (this.anInt236 == (this.anInt235 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean68) {
						this.aBoolean68 = true;
						this.anApplet_Sub1_1.method586(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("65915, " + 0 + ", " + false + ", " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GBBCHPEB", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean68) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt236 == this.anInt235) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean68) {
					return;
				}
				local27 = this.anInt235;
				if (this.anInt236 >= this.anInt235) {
					local38 = this.anInt236 - this.anInt235;
				} else {
					local38 = 5000 - this.anInt235;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray6, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean69 = true;
				}
				this.anInt235 = (this.anInt235 + local38) % 5000;
				try {
					if (this.anInt236 == this.anInt235) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean69 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!GBBCHPEB", name = "a", descriptor = "(Z)V")
	public void method192() {
		try {
			System.out.println("dummy:" + this.aBoolean67);
			System.out.println("tcycl:" + this.anInt235);
			System.out.println("tnum:" + this.anInt236);
			System.out.println("writer:" + this.aBoolean68);
			System.out.println("ioerror:" + this.aBoolean69);
			try {
				System.out.println("available:" + this.method189());
			} catch (@Pc(70) IOException local70) {
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("48205, " + false + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
