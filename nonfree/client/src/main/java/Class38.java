import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SRCZZRYO")
public final class Class38 implements Runnable {

	@OriginalMember(owner = "client!SRCZZRYO", name = "i", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!SRCZZRYO", name = "j", descriptor = "I")
	private int anInt536;

	@OriginalMember(owner = "client!SRCZZRYO", name = "k", descriptor = "I")
	private int anInt537;

	@OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "I")
	private int anInt534 = 9;

	@OriginalMember(owner = "client!SRCZZRYO", name = "b", descriptor = "I")
	private int anInt535 = 6187;

	@OriginalMember(owner = "client!SRCZZRYO", name = "c", descriptor = "Z")
	private boolean aBoolean158 = false;

	@OriginalMember(owner = "client!SRCZZRYO", name = "g", descriptor = "Z")
	private boolean aBoolean159 = false;

	@OriginalMember(owner = "client!SRCZZRYO", name = "l", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!SRCZZRYO", name = "m", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!SRCZZRYO", name = "h", descriptor = "Lclient!EOQQYERM;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!SRCZZRYO", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!SRCZZRYO", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!SRCZZRYO", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!SRCZZRYO", name = "<init>", descriptor = "(Ljava/net/Socket;ILclient!EOQQYERM;)V")
	public Class38(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("94952, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "()V")
	public void method389() {
		this.aBoolean159 = true;
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
		this.aBoolean160 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray12 = null;
	}

	@OriginalMember(owner = "client!SRCZZRYO", name = "b", descriptor = "()I")
	public int method390() throws IOException {
		return this.aBoolean159 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!SRCZZRYO", name = "c", descriptor = "()I")
	public int method391() throws IOException {
		return this.aBoolean159 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "([BII)V")
	public void method392(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean159) {
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

	@OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "(II[BI)V")
	public void method393(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) throws IOException {
		try {
			if (arg1 != this.anInt535) {
				for (@Pc(7) int local7 = 1; local7 > 0; local7++) {
				}
			}
			if (!this.aBoolean159) {
				if (this.aBoolean161) {
					this.aBoolean161 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray12 == null) {
					this.aByteArray12 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(41) int local41 = 0; local41 < arg0; local41++) {
						this.aByteArray12[this.anInt537] = arg2[local41 + 0];
						this.anInt537 = (this.anInt537 + 1) % 5000;
						if (this.anInt537 == (this.anInt536 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean160) {
						this.aBoolean160 = true;
						this.anApplet_Sub1_2.method588(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("53012, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SRCZZRYO", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean160) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt537 == this.anInt536) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean160) {
					return;
				}
				local27 = this.anInt536;
				if (this.anInt537 >= this.anInt536) {
					local38 = this.anInt537 - this.anInt536;
				} else {
					local38 = 5000 - this.anInt536;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray12, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean161 = true;
				}
				this.anInt536 = (this.anInt536 + local38) % 5000;
				try {
					if (this.anInt537 == this.anInt536) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean161 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!SRCZZRYO", name = "a", descriptor = "(B)V")
	public void method394(@OriginalArg(0) byte arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean159);
			System.out.println("tcycl:" + this.anInt536);
			System.out.println("tnum:" + this.anInt537);
			System.out.println("writer:" + this.aBoolean160);
			System.out.println("ioerror:" + this.aBoolean161);
			if (arg0 == -36) {
				try {
					System.out.println("available:" + this.method391());
				} catch (@Pc(65) IOException local65) {
				}
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("25623, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
