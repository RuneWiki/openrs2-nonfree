import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CLJPNHPC")
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!CLJPNHPC", name = "h", descriptor = "[B")
	private byte[] aByteArray8;

	@OriginalMember(owner = "client!CLJPNHPC", name = "i", descriptor = "I")
	private int anInt83;

	@OriginalMember(owner = "client!CLJPNHPC", name = "j", descriptor = "I")
	private int anInt84;

	@OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "Z")
	private boolean aBoolean37 = true;

	@OriginalMember(owner = "client!CLJPNHPC", name = "b", descriptor = "I")
	private int anInt82 = 192;

	@OriginalMember(owner = "client!CLJPNHPC", name = "f", descriptor = "Z")
	private boolean aBoolean38 = false;

	@OriginalMember(owner = "client!CLJPNHPC", name = "k", descriptor = "Z")
	private boolean aBoolean39 = false;

	@OriginalMember(owner = "client!CLJPNHPC", name = "l", descriptor = "Z")
	private boolean aBoolean40 = false;

	@OriginalMember(owner = "client!CLJPNHPC", name = "g", descriptor = "Lclient!UBLCAEEN;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!CLJPNHPC", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!CLJPNHPC", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!CLJPNHPC", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!CLJPNHPC", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!UBLCAEEN;I)V")
	public Class6(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg1;
			this.aSocket1 = arg0;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			if (arg2 <= 0) {
				throw new NullPointerException();
			}
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("65247, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "()V")
	public void method52() {
		this.aBoolean38 = true;
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
		this.aBoolean39 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray8 = null;
	}

	@OriginalMember(owner = "client!CLJPNHPC", name = "b", descriptor = "()I")
	public int method53() throws IOException {
		return this.aBoolean38 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!CLJPNHPC", name = "c", descriptor = "()I")
	public int method54() throws IOException {
		return this.aBoolean38 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "([BII)V")
	public void method55(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean38) {
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

	@OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "([BZII)V")
	public void method56(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (!arg1) {
				this.aBoolean37 = !this.aBoolean37;
			}
			if (!this.aBoolean38) {
				if (this.aBoolean40) {
					this.aBoolean40 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray8 == null) {
					this.aByteArray8 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(38) int local38 = 0; local38 < arg2; local38++) {
						this.aByteArray8[this.anInt84] = arg0[local38 + 0];
						this.anInt84 = (this.anInt84 + 1) % 5000;
						if (this.anInt84 == (this.anInt83 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean39) {
						this.aBoolean39 = true;
						this.anApplet_Sub1_1.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("93910, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CLJPNHPC", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean39) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt84 == this.anInt83) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean39) {
					return;
				}
				local27 = this.anInt83;
				if (this.anInt84 >= this.anInt83) {
					local38 = this.anInt84 - this.anInt83;
				} else {
					local38 = 5000 - this.anInt83;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray8, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean40 = true;
				}
				this.anInt83 = (this.anInt83 + local38) % 5000;
				try {
					if (this.anInt84 == this.anInt83) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean40 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!CLJPNHPC", name = "a", descriptor = "(Z)V")
	public void method57(@OriginalArg(0) boolean arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean38);
			System.out.println("tcycl:" + this.anInt83);
			System.out.println("tnum:" + this.anInt84);
			if (arg0) {
				System.out.println("writer:" + this.aBoolean39);
				System.out.println("ioerror:" + this.aBoolean40);
				try {
					System.out.println("available:" + this.method54());
				} catch (@Pc(64) IOException local64) {
				}
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("30340, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
