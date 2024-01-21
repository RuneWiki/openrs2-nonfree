import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KMJQVYHB")
public final class Class21 implements Runnable {

	@OriginalMember(owner = "client!KMJQVYHB", name = "h", descriptor = "[B")
	private byte[] aByteArray14;

	@OriginalMember(owner = "client!KMJQVYHB", name = "i", descriptor = "I")
	private int anInt316;

	@OriginalMember(owner = "client!KMJQVYHB", name = "j", descriptor = "I")
	private int anInt317;

	@OriginalMember(owner = "client!KMJQVYHB", name = "b", descriptor = "Z")
	private boolean aBoolean75 = true;

	@OriginalMember(owner = "client!KMJQVYHB", name = "f", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!KMJQVYHB", name = "k", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!KMJQVYHB", name = "l", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!KMJQVYHB", name = "g", descriptor = "Lclient!AHZQVBFX;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!KMJQVYHB", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!KMJQVYHB", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!KMJQVYHB", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "I")
	private int anInt315;

	@OriginalMember(owner = "client!KMJQVYHB", name = "<init>", descriptor = "(Ljava/net/Socket;ILclient!AHZQVBFX;)V")
	public Class21(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("63008, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "()V")
	public void method186() {
		this.aBoolean76 = true;
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
		this.aBoolean77 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray14 = null;
	}

	@OriginalMember(owner = "client!KMJQVYHB", name = "b", descriptor = "()I")
	public int method187() throws IOException {
		return this.aBoolean76 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!KMJQVYHB", name = "c", descriptor = "()I")
	public int method188() throws IOException {
		return this.aBoolean76 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "([BII)V")
	public void method189(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean76) {
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

	@OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "(IZ[BI)V")
	public void method190(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean76) {
				if (this.aBoolean78) {
					this.aBoolean78 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray14 == null) {
					this.aByteArray14 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(31) int local31 = 0; local31 < arg0; local31++) {
						this.aByteArray14[this.anInt317] = arg1[local31 + 0];
						this.anInt317 = (this.anInt317 + 1) % 5000;
						if (this.anInt317 == (this.anInt316 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean77) {
						this.aBoolean77 = true;
						this.anApplet_Sub1_2.method586(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("9243, " + arg0 + ", " + true + ", " + arg1 + ", " + 0 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KMJQVYHB", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean77) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt317 == this.anInt316) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean77) {
					return;
				}
				local27 = this.anInt316;
				if (this.anInt317 >= this.anInt316) {
					local38 = this.anInt317 - this.anInt316;
				} else {
					local38 = 5000 - this.anInt316;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray14, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean78 = true;
				}
				this.anInt316 = (this.anInt316 + local38) % 5000;
				try {
					if (this.anInt317 == this.anInt316) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean78 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!KMJQVYHB", name = "a", descriptor = "(I)V")
	public void method191() {
		try {
			System.out.println("dummy:" + this.aBoolean76);
			System.out.println("tcycl:" + this.anInt316);
			System.out.println("tnum:" + this.anInt317);
			System.out.println("writer:" + this.aBoolean77);
			System.out.println("ioerror:" + this.aBoolean78);
			try {
				System.out.println("available:" + this.method188());
			} catch (@Pc(72) IOException local72) {
			}
		} catch (@Pc(74) RuntimeException local74) {
			signlink.reporterror("11032, " + -26491 + ", " + local74.toString());
			throw new RuntimeException();
		}
	}
}
