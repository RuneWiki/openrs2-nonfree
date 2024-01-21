import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!QIACHOJO")
public final class Class34 implements Runnable {

	@OriginalMember(owner = "client!QIACHOJO", name = "h", descriptor = "[B")
	private byte[] aByteArray10;

	@OriginalMember(owner = "client!QIACHOJO", name = "i", descriptor = "I")
	private int anInt461;

	@OriginalMember(owner = "client!QIACHOJO", name = "j", descriptor = "I")
	private int anInt462;

	@OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "I")
	private int anInt459 = 6;

	@OriginalMember(owner = "client!QIACHOJO", name = "b", descriptor = "I")
	private int anInt460 = -344;

	@OriginalMember(owner = "client!QIACHOJO", name = "f", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!QIACHOJO", name = "k", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!QIACHOJO", name = "l", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!QIACHOJO", name = "g", descriptor = "Lclient!EPVRYXOV;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!QIACHOJO", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!QIACHOJO", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!QIACHOJO", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!QIACHOJO", name = "<init>", descriptor = "(Ljava/net/Socket;BLclient!EPVRYXOV;)V")
	public Class34(@OriginalArg(0) Socket arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			@Pc(35) boolean local35 = false;
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("11781, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "()V")
	public void method347() {
		this.aBoolean143 = true;
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
		this.aBoolean144 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray10 = null;
	}

	@OriginalMember(owner = "client!QIACHOJO", name = "b", descriptor = "()I")
	public int method348() throws IOException {
		return this.aBoolean143 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!QIACHOJO", name = "c", descriptor = "()I")
	public int method349() throws IOException {
		return this.aBoolean143 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "([BII)V")
	public void method350(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean143) {
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

	@OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "(II[BI)V")
	public void method351(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean143) {
				if (this.aBoolean145) {
					this.aBoolean145 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray10 == null) {
					this.aByteArray10 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray10[this.anInt462] = arg0[local28 + 0];
						this.anInt462 = (this.anInt462 + 1) % 5000;
						if (this.anInt462 == (this.anInt461 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean144) {
						this.aBoolean144 = true;
						this.anApplet_Sub1_2.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("41423, " + 5 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!QIACHOJO", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean144) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt462 == this.anInt461) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean144) {
					return;
				}
				local27 = this.anInt461;
				if (this.anInt462 >= this.anInt461) {
					local38 = this.anInt462 - this.anInt461;
				} else {
					local38 = 5000 - this.anInt461;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray10, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean145 = true;
				}
				this.anInt461 = (this.anInt461 + local38) % 5000;
				try {
					if (this.anInt462 == this.anInt461) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean145 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!QIACHOJO", name = "a", descriptor = "(I)V")
	public void method352() {
		try {
			System.out.println("dummy:" + this.aBoolean143);
			System.out.println("tcycl:" + this.anInt461);
			System.out.println("tnum:" + this.anInt462);
			System.out.println("writer:" + this.aBoolean144);
			System.out.println("ioerror:" + this.aBoolean145);
			try {
				System.out.println("available:" + this.method349());
			} catch (@Pc(74) IOException local74) {
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("32027, " + 2 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
