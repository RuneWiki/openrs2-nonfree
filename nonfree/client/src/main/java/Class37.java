import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TVERLIYS")
public final class Class37 implements Runnable {

	@OriginalMember(owner = "client!TVERLIYS", name = "g", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!TVERLIYS", name = "h", descriptor = "I")
	private int anInt634;

	@OriginalMember(owner = "client!TVERLIYS", name = "i", descriptor = "I")
	private int anInt635;

	@OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "Z")
	private boolean aBoolean149 = false;

	@OriginalMember(owner = "client!TVERLIYS", name = "e", descriptor = "Z")
	private boolean aBoolean150 = false;

	@OriginalMember(owner = "client!TVERLIYS", name = "j", descriptor = "Z")
	private boolean aBoolean151 = false;

	@OriginalMember(owner = "client!TVERLIYS", name = "k", descriptor = "Z")
	private boolean aBoolean152 = false;

	@OriginalMember(owner = "client!TVERLIYS", name = "f", descriptor = "Lclient!HJHAUOBE;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!TVERLIYS", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!TVERLIYS", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!TVERLIYS", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!TVERLIYS", name = "<init>", descriptor = "(ZLjava/net/Socket;Lclient!HJHAUOBE;)V")
	public Class37(@OriginalArg(0) boolean arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			if (arg0) {
				throw new NullPointerException();
			}
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("44136, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "()V")
	public void method390() {
		this.aBoolean150 = true;
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
		this.aBoolean151 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray17 = null;
	}

	@OriginalMember(owner = "client!TVERLIYS", name = "b", descriptor = "()I")
	public int method391() throws IOException {
		return this.aBoolean150 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!TVERLIYS", name = "c", descriptor = "()I")
	public int method392() throws IOException {
		return this.aBoolean150 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "([BII)V")
	public void method393(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean150) {
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

	@OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "(II[BI)V")
	public void method394(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean150) {
				if (this.aBoolean152) {
					this.aBoolean152 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray17 == null) {
					this.aByteArray17 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray17[this.anInt635] = arg0[local28 + 0];
						this.anInt635 = (this.anInt635 + 1) % 5000;
						if (this.anInt635 == (this.anInt634 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean151) {
						this.aBoolean151 = true;
						this.anApplet_Sub1_2.method585(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("34664, " + 0 + ", " + 9 + ", " + arg0 + ", " + arg1 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TVERLIYS", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean151) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt635 == this.anInt634) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean151) {
					return;
				}
				local27 = this.anInt634;
				if (this.anInt635 >= this.anInt634) {
					local38 = this.anInt635 - this.anInt634;
				} else {
					local38 = 5000 - this.anInt634;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray17, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean152 = true;
				}
				this.anInt634 = (this.anInt634 + local38) % 5000;
				try {
					if (this.anInt635 == this.anInt634) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean152 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!TVERLIYS", name = "a", descriptor = "(I)V")
	public void method395(@OriginalArg(0) int arg0) {
		try {
			System.out.println("dummy:" + this.aBoolean150);
			System.out.println("tcycl:" + this.anInt634);
			System.out.println("tnum:" + this.anInt635);
			@Pc(33) boolean local33 = false;
			System.out.println("writer:" + this.aBoolean151);
			System.out.println("ioerror:" + this.aBoolean152);
			try {
				System.out.println("available:" + this.method392());
			} catch (@Pc(65) IOException local65) {
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("93064, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
