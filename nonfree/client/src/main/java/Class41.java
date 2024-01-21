import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!THBLNINF")
public final class Class41 implements Runnable {

	@OriginalMember(owner = "client!THBLNINF", name = "i", descriptor = "[B")
	private byte[] aByteArray18;

	@OriginalMember(owner = "client!THBLNINF", name = "j", descriptor = "I")
	private int anInt728;

	@OriginalMember(owner = "client!THBLNINF", name = "k", descriptor = "I")
	private int anInt729;

	@OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "I")
	private int anInt725 = -499;

	@OriginalMember(owner = "client!THBLNINF", name = "b", descriptor = "I")
	private int anInt726 = -26728;

	@OriginalMember(owner = "client!THBLNINF", name = "c", descriptor = "I")
	private int anInt727 = 22761;

	@OriginalMember(owner = "client!THBLNINF", name = "g", descriptor = "Z")
	private boolean aBoolean181 = false;

	@OriginalMember(owner = "client!THBLNINF", name = "l", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!THBLNINF", name = "m", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!THBLNINF", name = "h", descriptor = "Lclient!NHAOTYHM;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!THBLNINF", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!THBLNINF", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!THBLNINF", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!THBLNINF", name = "<init>", descriptor = "(Lclient!NHAOTYHM;ILjava/net/Socket;)V")
	public Class41(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg0;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("25403, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "()V")
	public void method461() {
		this.aBoolean181 = true;
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
		this.aBoolean182 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray18 = null;
	}

	@OriginalMember(owner = "client!THBLNINF", name = "b", descriptor = "()I")
	public int method462() throws IOException {
		return this.aBoolean181 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!THBLNINF", name = "c", descriptor = "()I")
	public int method463() throws IOException {
		return this.aBoolean181 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "([BII)V")
	public void method464(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean181) {
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

	@OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "(BII[B)V")
	public void method465(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean181) {
				if (this.aBoolean183) {
					this.aBoolean183 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray18 == null) {
					this.aByteArray18 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(32) int local32 = 0; local32 < arg0; local32++) {
						this.aByteArray18[this.anInt729] = arg1[local32 + 0];
						this.anInt729 = (this.anInt729 + 1) % 5000;
						if (this.anInt729 == (this.anInt728 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean182) {
						this.aBoolean182 = true;
						this.anApplet_Sub1_1.method586(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("50148, " + 68 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!THBLNINF", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean182) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt729 == this.anInt728) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean182) {
					return;
				}
				local27 = this.anInt728;
				if (this.anInt729 >= this.anInt728) {
					local38 = this.anInt729 - this.anInt728;
				} else {
					local38 = 5000 - this.anInt728;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray18, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean183 = true;
				}
				this.anInt728 = (this.anInt728 + local38) % 5000;
				try {
					if (this.anInt729 == this.anInt728) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean183 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!THBLNINF", name = "a", descriptor = "(I)V")
	public void method466() {
		try {
			System.out.println("dummy:" + this.aBoolean181);
			if (this.anInt726 == -26728) {
				System.out.println("tcycl:" + this.anInt728);
				System.out.println("tnum:" + this.anInt729);
				System.out.println("writer:" + this.aBoolean182);
				System.out.println("ioerror:" + this.aBoolean183);
				try {
					System.out.println("available:" + this.method463());
				} catch (@Pc(66) IOException local66) {
				}
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("33487, " + -26728 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
