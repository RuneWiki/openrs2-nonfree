import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!AAVSEYUK")
public final class Class1 implements Runnable {

	@OriginalMember(owner = "client!AAVSEYUK", name = "g", descriptor = "[B")
	private byte[] aByteArray1;

	@OriginalMember(owner = "client!AAVSEYUK", name = "h", descriptor = "I")
	private int anInt1;

	@OriginalMember(owner = "client!AAVSEYUK", name = "i", descriptor = "I")
	private int anInt2;

	@OriginalMember(owner = "client!AAVSEYUK", name = "a", descriptor = "Z")
	private boolean aBoolean1 = true;

	@OriginalMember(owner = "client!AAVSEYUK", name = "e", descriptor = "Z")
	private boolean aBoolean2 = false;

	@OriginalMember(owner = "client!AAVSEYUK", name = "j", descriptor = "Z")
	private boolean aBoolean3 = false;

	@OriginalMember(owner = "client!AAVSEYUK", name = "k", descriptor = "Z")
	private boolean aBoolean4 = false;

	@OriginalMember(owner = "client!AAVSEYUK", name = "f", descriptor = "Lclient!EUDZGBGU;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!AAVSEYUK", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!AAVSEYUK", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!AAVSEYUK", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!AAVSEYUK", name = "<init>", descriptor = "(Lclient!EUDZGBGU;Ljava/net/Socket;B)V")
	public Class1(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) byte arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg0;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("36543, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AAVSEYUK", name = "a", descriptor = "()V")
	public void method1() {
		this.aBoolean2 = true;
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
		this.aBoolean3 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray1 = null;
	}

	@OriginalMember(owner = "client!AAVSEYUK", name = "b", descriptor = "()I")
	public int method2() throws IOException {
		return this.aBoolean2 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!AAVSEYUK", name = "c", descriptor = "()I")
	public int method3() throws IOException {
		return this.aBoolean2 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!AAVSEYUK", name = "a", descriptor = "([BII)V")
	public void method4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean2) {
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

	@OriginalMember(owner = "client!AAVSEYUK", name = "a", descriptor = "(I[BII)V")
	public void method5(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean2) {
				if (this.aBoolean4) {
					this.aBoolean4 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray1 == null) {
					this.aByteArray1 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
						this.aByteArray1[this.anInt2] = arg1[local28 + 0];
						this.anInt2 = (this.anInt2 + 1) % 5000;
						if (this.anInt2 == (this.anInt1 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean3) {
						this.aBoolean3 = true;
						this.anApplet_Sub1_1.method582(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("69283, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!AAVSEYUK", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean3) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt2 == this.anInt1) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean3) {
					return;
				}
				local27 = this.anInt1;
				if (this.anInt2 >= this.anInt1) {
					local38 = this.anInt2 - this.anInt1;
				} else {
					local38 = 5000 - this.anInt1;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray1, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean4 = true;
				}
				this.anInt1 = (this.anInt1 + local38) % 5000;
				try {
					if (this.anInt2 == this.anInt1) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean4 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!AAVSEYUK", name = "a", descriptor = "(Z)V")
	public void method6() {
		try {
			System.out.println("dummy:" + this.aBoolean2);
			System.out.println("tcycl:" + this.anInt1);
			System.out.println("tnum:" + this.anInt2);
			System.out.println("writer:" + this.aBoolean3);
			System.out.println("ioerror:" + this.aBoolean4);
			try {
				System.out.println("available:" + this.method3());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("87022, " + false + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
