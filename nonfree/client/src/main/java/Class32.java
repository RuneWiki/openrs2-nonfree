import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!OAGIEZRU")
public final class Class32 implements Runnable {

	@OriginalMember(owner = "client!OAGIEZRU", name = "g", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!OAGIEZRU", name = "h", descriptor = "I")
	private int anInt512;

	@OriginalMember(owner = "client!OAGIEZRU", name = "i", descriptor = "I")
	private int anInt513;

	@OriginalMember(owner = "client!OAGIEZRU", name = "a", descriptor = "Z")
	private boolean aBoolean135 = true;

	@OriginalMember(owner = "client!OAGIEZRU", name = "e", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!OAGIEZRU", name = "j", descriptor = "Z")
	private boolean aBoolean137 = false;

	@OriginalMember(owner = "client!OAGIEZRU", name = "k", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!OAGIEZRU", name = "f", descriptor = "Lclient!KISFBCOP;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!OAGIEZRU", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!OAGIEZRU", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!OAGIEZRU", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!OAGIEZRU", name = "<init>", descriptor = "(Lclient!KISFBCOP;BLjava/net/Socket;)V")
	public Class32(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg0;
			this.aSocket2 = arg2;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("81372, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OAGIEZRU", name = "a", descriptor = "()V")
	public void method318() {
		this.aBoolean136 = true;
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
		this.aBoolean137 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray12 = null;
	}

	@OriginalMember(owner = "client!OAGIEZRU", name = "b", descriptor = "()I")
	public int method319() throws IOException {
		return this.aBoolean136 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!OAGIEZRU", name = "c", descriptor = "()I")
	public int method320() throws IOException {
		return this.aBoolean136 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!OAGIEZRU", name = "a", descriptor = "([BII)V")
	public void method321(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean136) {
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

	@OriginalMember(owner = "client!OAGIEZRU", name = "a", descriptor = "(B[BII)V")
	public void method322(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean136) {
				if (this.aBoolean138) {
					this.aBoolean138 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray12 == null) {
					this.aByteArray12 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(32) int local32 = 0; local32 < arg1; local32++) {
						this.aByteArray12[this.anInt513] = arg0[local32 + 0];
						this.anInt513 = (this.anInt513 + 1) % 5000;
						if (this.anInt513 == (this.anInt512 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean137) {
						this.aBoolean137 = true;
						this.anApplet_Sub1_1.method584(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("80512, " + 55 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!OAGIEZRU", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean137) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt513 == this.anInt512) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean137) {
					return;
				}
				local27 = this.anInt512;
				if (this.anInt513 >= this.anInt512) {
					local38 = this.anInt513 - this.anInt512;
				} else {
					local38 = 5000 - this.anInt512;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray12, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean138 = true;
				}
				this.anInt512 = (this.anInt512 + local38) % 5000;
				try {
					if (this.anInt513 == this.anInt512) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean138 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!OAGIEZRU", name = "a", descriptor = "(Z)V")
	public void method323() {
		try {
			System.out.println("dummy:" + this.aBoolean136);
			System.out.println("tcycl:" + this.anInt512);
			System.out.println("tnum:" + this.anInt513);
			System.out.println("writer:" + this.aBoolean137);
			System.out.println("ioerror:" + this.aBoolean138);
			try {
				System.out.println("available:" + this.method320());
			} catch (@Pc(70) IOException local70) {
			}
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("92340, " + false + ", " + local72.toString());
			throw new RuntimeException();
		}
	}
}
