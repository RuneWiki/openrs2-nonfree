import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!YQNDWKQR")
public final class Class48 implements Runnable {

	@OriginalMember(owner = "client!YQNDWKQR", name = "h", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!YQNDWKQR", name = "i", descriptor = "I")
	private int anInt785;

	@OriginalMember(owner = "client!YQNDWKQR", name = "j", descriptor = "I")
	private int anInt786;

	@OriginalMember(owner = "client!YQNDWKQR", name = "a", descriptor = "Z")
	private boolean aBoolean184 = true;

	@OriginalMember(owner = "client!YQNDWKQR", name = "b", descriptor = "Z")
	private boolean aBoolean185 = false;

	@OriginalMember(owner = "client!YQNDWKQR", name = "f", descriptor = "Z")
	private boolean aBoolean186 = false;

	@OriginalMember(owner = "client!YQNDWKQR", name = "k", descriptor = "Z")
	private boolean aBoolean187 = false;

	@OriginalMember(owner = "client!YQNDWKQR", name = "l", descriptor = "Z")
	private boolean aBoolean188 = false;

	@OriginalMember(owner = "client!YQNDWKQR", name = "g", descriptor = "Lclient!AMZQHNGA;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!YQNDWKQR", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!YQNDWKQR", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!YQNDWKQR", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!YQNDWKQR", name = "<init>", descriptor = "(ILclient!AMZQHNGA;Ljava/net/Socket;)V")
	public Class48(@OriginalArg(0) int arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("99300, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YQNDWKQR", name = "a", descriptor = "()V")
	public void method555() {
		this.aBoolean186 = true;
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
		this.aBoolean187 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray19 = null;
	}

	@OriginalMember(owner = "client!YQNDWKQR", name = "b", descriptor = "()I")
	public int method556() throws IOException {
		return this.aBoolean186 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!YQNDWKQR", name = "c", descriptor = "()I")
	public int method557() throws IOException {
		return this.aBoolean186 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!YQNDWKQR", name = "a", descriptor = "([BII)V")
	public void method558(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean186) {
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

	@OriginalMember(owner = "client!YQNDWKQR", name = "a", descriptor = "(I[BII)V")
	public void method559(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean186) {
				if (this.aBoolean188) {
					this.aBoolean188 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray19 == null) {
					this.aByteArray19 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(39) int local39 = 0; local39 < arg1; local39++) {
						this.aByteArray19[this.anInt786] = arg0[local39 + 0];
						this.anInt786 = (this.anInt786 + 1) % 5000;
						if (this.anInt786 == (this.anInt785 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean187) {
						this.aBoolean187 = true;
						this.anApplet_Sub1_2.method585(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("73807, " + -39006 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!YQNDWKQR", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean187) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt786 == this.anInt785) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean187) {
					return;
				}
				local27 = this.anInt785;
				if (this.anInt786 >= this.anInt785) {
					local38 = this.anInt786 - this.anInt785;
				} else {
					local38 = 5000 - this.anInt785;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray19, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean188 = true;
				}
				this.anInt785 = (this.anInt785 + local38) % 5000;
				try {
					if (this.anInt786 == this.anInt785) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean188 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!YQNDWKQR", name = "a", descriptor = "(B)V")
	public void method560() {
		try {
			System.out.println("dummy:" + this.aBoolean186);
			System.out.println("tcycl:" + this.anInt785);
			System.out.println("tnum:" + this.anInt786);
			System.out.println("writer:" + this.aBoolean187);
			System.out.println("ioerror:" + this.aBoolean188);
			try {
				System.out.println("available:" + this.method557());
			} catch (@Pc(65) IOException local65) {
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("39857, " + -38 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
