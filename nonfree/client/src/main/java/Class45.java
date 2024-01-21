import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XFJQTFBV")
public final class Class45 implements Runnable {

	@OriginalMember(owner = "client!XFJQTFBV", name = "h", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!XFJQTFBV", name = "i", descriptor = "I")
	private int anInt694;

	@OriginalMember(owner = "client!XFJQTFBV", name = "j", descriptor = "I")
	private int anInt695;

	@OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "I")
	private int anInt692 = 969;

	@OriginalMember(owner = "client!XFJQTFBV", name = "b", descriptor = "I")
	private int anInt693 = 40071;

	@OriginalMember(owner = "client!XFJQTFBV", name = "f", descriptor = "Z")
	private boolean aBoolean160 = false;

	@OriginalMember(owner = "client!XFJQTFBV", name = "k", descriptor = "Z")
	private boolean aBoolean161 = false;

	@OriginalMember(owner = "client!XFJQTFBV", name = "l", descriptor = "Z")
	private boolean aBoolean162 = false;

	@OriginalMember(owner = "client!XFJQTFBV", name = "g", descriptor = "Lclient!BFZNZUKL;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!XFJQTFBV", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!XFJQTFBV", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!XFJQTFBV", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!XFJQTFBV", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!BFZNZUKL;Z)V")
	public Class45(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) boolean arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("2351, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "()V")
	public void method500() {
		this.aBoolean160 = true;
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
		this.aBoolean161 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray19 = null;
	}

	@OriginalMember(owner = "client!XFJQTFBV", name = "b", descriptor = "()I")
	public int method501() throws IOException {
		return this.aBoolean160 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!XFJQTFBV", name = "c", descriptor = "()I")
	public int method502() throws IOException {
		return this.aBoolean160 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "([BII)V")
	public void method503(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean160) {
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

	@OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "(IZ[BI)V")
	public void method504(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean160) {
				if (this.aBoolean162) {
					this.aBoolean162 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray19 == null) {
					this.aByteArray19 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
						this.aByteArray19[this.anInt695] = arg0[local31 + 0];
						this.anInt695 = (this.anInt695 + 1) % 5000;
						if (this.anInt695 == (this.anInt694 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean161) {
						this.aBoolean161 = true;
						this.anApplet_Sub1_2.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("26099, " + 0 + ", " + true + ", " + arg0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XFJQTFBV", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean161) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt695 == this.anInt694) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean161) {
					return;
				}
				local27 = this.anInt694;
				if (this.anInt695 >= this.anInt694) {
					local38 = this.anInt695 - this.anInt694;
				} else {
					local38 = 5000 - this.anInt694;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray19, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean162 = true;
				}
				this.anInt694 = (this.anInt694 + local38) % 5000;
				try {
					if (this.anInt695 == this.anInt694) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean162 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!XFJQTFBV", name = "a", descriptor = "(I)V")
	public void method505(@OriginalArg(0) int arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean160);
			System.out.println("tcycl:" + this.anInt694);
			System.out.println("tnum:" + this.anInt695);
			@Pc(33) boolean local33 = false;
			System.out.println("writer:" + this.aBoolean161);
			System.out.println("ioerror:" + this.aBoolean162);
			try {
				System.out.println("available:" + this.method502());
			} catch (@Pc(65) IOException local65) {
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("29792, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
