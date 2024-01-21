import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CSJOZVFM")
public final class Class7 implements Runnable {

	@OriginalMember(owner = "client!CSJOZVFM", name = "h", descriptor = "[B")
	private byte[] aByteArray6;

	@OriginalMember(owner = "client!CSJOZVFM", name = "i", descriptor = "I")
	private int anInt27;

	@OriginalMember(owner = "client!CSJOZVFM", name = "j", descriptor = "I")
	private int anInt28;

	@OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "I")
	private int anInt25 = -296;

	@OriginalMember(owner = "client!CSJOZVFM", name = "b", descriptor = "I")
	private int anInt26 = 1;

	@OriginalMember(owner = "client!CSJOZVFM", name = "f", descriptor = "Z")
	private boolean aBoolean13 = false;

	@OriginalMember(owner = "client!CSJOZVFM", name = "k", descriptor = "Z")
	private boolean aBoolean14 = false;

	@OriginalMember(owner = "client!CSJOZVFM", name = "l", descriptor = "Z")
	private boolean aBoolean15 = false;

	@OriginalMember(owner = "client!CSJOZVFM", name = "g", descriptor = "Lclient!MKANHSMC;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!CSJOZVFM", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!CSJOZVFM", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!CSJOZVFM", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!CSJOZVFM", name = "<init>", descriptor = "(ZLjava/net/Socket;Lclient!MKANHSMC;)V")
	public Class7(@OriginalArg(0) boolean arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg2;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("68579, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "()V")
	public void method48() {
		this.aBoolean13 = true;
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
		this.aBoolean14 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray6 = null;
	}

	@OriginalMember(owner = "client!CSJOZVFM", name = "b", descriptor = "()I")
	public int method49() throws IOException {
		return this.aBoolean13 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!CSJOZVFM", name = "c", descriptor = "()I")
	public int method50() throws IOException {
		return this.aBoolean13 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "([BII)V")
	public void method51(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean13) {
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

	@OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "([BIII)V")
	public void method52(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (!this.aBoolean13) {
				if (this.aBoolean15) {
					this.aBoolean15 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray6 == null) {
					this.aByteArray6 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(31) int local31 = 0; local31 < arg1; local31++) {
						this.aByteArray6[this.anInt28] = arg0[local31 + 0];
						this.anInt28 = (this.anInt28 + 1) % 5000;
						if (this.anInt28 == (this.anInt27 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean14) {
						this.aBoolean14 = true;
						this.anApplet_Sub1_1.method585(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("78378, " + arg0 + ", " + arg1 + ", " + 0 + ", " + -296 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CSJOZVFM", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean14) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt28 == this.anInt27) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean14) {
					return;
				}
				local27 = this.anInt27;
				if (this.anInt28 >= this.anInt27) {
					local38 = this.anInt28 - this.anInt27;
				} else {
					local38 = 5000 - this.anInt27;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray6, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean15 = true;
				}
				this.anInt27 = (this.anInt27 + local38) % 5000;
				try {
					if (this.anInt28 == this.anInt27) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean15 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!CSJOZVFM", name = "a", descriptor = "(I)V")
	public void method53() {
		try {
			System.out.println("dummy:" + this.aBoolean13);
			System.out.println("tcycl:" + this.anInt27);
			System.out.println("tnum:" + this.anInt28);
			System.out.println("writer:" + this.aBoolean14);
			System.out.println("ioerror:" + this.aBoolean15);
			try {
				System.out.println("available:" + this.method50());
			} catch (@Pc(64) IOException local64) {
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("58875, " + 0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}
}
