import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LBXRBQZX")
public final class Class19 implements Runnable {

	@OriginalMember(owner = "client!LBXRBQZX", name = "h", descriptor = "[B")
	private byte[] aByteArray5;

	@OriginalMember(owner = "client!LBXRBQZX", name = "i", descriptor = "I")
	private int anInt322;

	@OriginalMember(owner = "client!LBXRBQZX", name = "j", descriptor = "I")
	private int anInt323;

	@OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "I")
	private int anInt321 = -161;

	@OriginalMember(owner = "client!LBXRBQZX", name = "b", descriptor = "Z")
	private boolean aBoolean70 = true;

	@OriginalMember(owner = "client!LBXRBQZX", name = "f", descriptor = "Z")
	private boolean aBoolean71 = false;

	@OriginalMember(owner = "client!LBXRBQZX", name = "k", descriptor = "Z")
	private boolean aBoolean72 = false;

	@OriginalMember(owner = "client!LBXRBQZX", name = "l", descriptor = "Z")
	private boolean aBoolean73 = false;

	@OriginalMember(owner = "client!LBXRBQZX", name = "g", descriptor = "Lclient!RMDQJLZZ;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!LBXRBQZX", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!LBXRBQZX", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!LBXRBQZX", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!LBXRBQZX", name = "<init>", descriptor = "(Ljava/net/Socket;Lclient!RMDQJLZZ;Z)V")
	public Class19(@OriginalArg(0) Socket arg0, @OriginalArg(1) Applet_Sub1 arg1, @OriginalArg(2) boolean arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg1;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("95761, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "()V")
	public void method163() {
		this.aBoolean71 = true;
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
		this.aBoolean72 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray5 = null;
	}

	@OriginalMember(owner = "client!LBXRBQZX", name = "b", descriptor = "()I")
	public int method164() throws IOException {
		return this.aBoolean71 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!LBXRBQZX", name = "c", descriptor = "()I")
	public int method165() throws IOException {
		return this.aBoolean71 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "([BII)V")
	public void method166(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean71) {
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

	@OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "(IBI[B)V")
	public void method167(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean71) {
				if (this.aBoolean73) {
					this.aBoolean73 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray5 == null) {
					this.aByteArray5 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(39) int local39 = 0; local39 < arg0; local39++) {
						this.aByteArray5[this.anInt323] = arg1[local39 + 0];
						this.anInt323 = (this.anInt323 + 1) % 5000;
						if (this.anInt323 == (this.anInt322 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean72) {
						this.aBoolean72 = true;
						this.anApplet_Sub1_2.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(98) RuntimeException local98) {
			signlink.reporterror("64413, " + arg0 + ", " + 5 + ", " + 0 + ", " + arg1 + ", " + local98.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LBXRBQZX", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean72) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt323 == this.anInt322) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean72) {
					return;
				}
				local27 = this.anInt322;
				if (this.anInt323 >= this.anInt322) {
					local38 = this.anInt323 - this.anInt322;
				} else {
					local38 = 5000 - this.anInt322;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray5, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean73 = true;
				}
				this.anInt322 = (this.anInt322 + local38) % 5000;
				try {
					if (this.anInt323 == this.anInt322) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean73 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!LBXRBQZX", name = "a", descriptor = "(I)V")
	public void method168() {
		try {
			System.out.println("dummy:" + this.aBoolean71);
			System.out.println("tcycl:" + this.anInt322);
			System.out.println("tnum:" + this.anInt323);
			System.out.println("writer:" + this.aBoolean72);
			System.out.println("ioerror:" + this.aBoolean73);
			try {
				System.out.println("available:" + this.method165());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("43784, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
