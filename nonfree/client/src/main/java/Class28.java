import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!NTPVSATL")
public final class Class28 implements Runnable {

	@OriginalMember(owner = "client!NTPVSATL", name = "i", descriptor = "[B")
	private byte[] aByteArray11;

	@OriginalMember(owner = "client!NTPVSATL", name = "j", descriptor = "I")
	private int anInt406;

	@OriginalMember(owner = "client!NTPVSATL", name = "k", descriptor = "I")
	private int anInt407;

	@OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "B")
	private byte aByte34 = -68;

	@OriginalMember(owner = "client!NTPVSATL", name = "b", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!NTPVSATL", name = "c", descriptor = "I")
	private int anInt405 = 866;

	@OriginalMember(owner = "client!NTPVSATL", name = "g", descriptor = "Z")
	private boolean aBoolean122 = false;

	@OriginalMember(owner = "client!NTPVSATL", name = "l", descriptor = "Z")
	private boolean aBoolean123 = false;

	@OriginalMember(owner = "client!NTPVSATL", name = "m", descriptor = "Z")
	private boolean aBoolean124 = false;

	@OriginalMember(owner = "client!NTPVSATL", name = "h", descriptor = "Lclient!PKBEYUWN;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!NTPVSATL", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!NTPVSATL", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!NTPVSATL", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!NTPVSATL", name = "<init>", descriptor = "(Lclient!PKBEYUWN;Ljava/net/Socket;B)V")
	public Class28(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			if (arg2 != this.aByte34) {
				this.anInt405 = -97;
			}
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("65302, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "()V")
	public void method317() {
		this.aBoolean122 = true;
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
		this.aBoolean123 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray11 = null;
	}

	@OriginalMember(owner = "client!NTPVSATL", name = "b", descriptor = "()I")
	public int method318() throws IOException {
		return this.aBoolean122 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!NTPVSATL", name = "c", descriptor = "()I")
	public int method319() throws IOException {
		return this.aBoolean122 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "([BII)V")
	public void method320(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean122) {
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

	@OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "(I[BII)V")
	public void method321(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) throws IOException {
		try {
			if (arg2 < 0 && !this.aBoolean122) {
				if (this.aBoolean124) {
					this.aBoolean124 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray11 == null) {
					this.aByteArray11 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
						this.aByteArray11[this.anInt407] = arg0[local31 + 0];
						this.anInt407 = (this.anInt407 + 1) % 5000;
						if (this.anInt407 == (this.anInt406 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean123) {
						this.aBoolean123 = true;
						this.anApplet_Sub1_2.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("95447, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!NTPVSATL", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean123) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt407 == this.anInt406) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean123) {
					return;
				}
				local27 = this.anInt406;
				if (this.anInt407 >= this.anInt406) {
					local38 = this.anInt407 - this.anInt406;
				} else {
					local38 = 5000 - this.anInt406;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray11, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean124 = true;
				}
				this.anInt406 = (this.anInt406 + local38) % 5000;
				try {
					if (this.anInt407 == this.anInt406) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean124 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!NTPVSATL", name = "a", descriptor = "(I)V")
	public void method322() {
		try {
			System.out.println("dummy:" + this.aBoolean122);
			System.out.println("tcycl:" + this.anInt406);
			System.out.println("tnum:" + this.anInt407);
			System.out.println("writer:" + this.aBoolean123);
			System.out.println("ioerror:" + this.aBoolean124);
			try {
				System.out.println("available:" + this.method319());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("89455, " + -955 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
