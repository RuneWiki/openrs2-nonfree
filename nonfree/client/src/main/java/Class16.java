import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!KPIQNZMJ")
public final class Class16 implements Runnable {

	@OriginalMember(owner = "client!KPIQNZMJ", name = "h", descriptor = "[B")
	private byte[] aByteArray12;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "i", descriptor = "I")
	private int anInt363;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "j", descriptor = "I")
	private int anInt364;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "a", descriptor = "Z")
	private boolean aBoolean74 = false;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "b", descriptor = "Z")
	private boolean aBoolean75 = false;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "f", descriptor = "Z")
	private boolean aBoolean76 = false;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "k", descriptor = "Z")
	private boolean aBoolean77 = false;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "l", descriptor = "Z")
	private boolean aBoolean78 = false;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "g", descriptor = "Lclient!DZXWUJSL;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!KPIQNZMJ", name = "<init>", descriptor = "(BLjava/net/Socket;Lclient!DZXWUJSL;)V")
	public Class16(@OriginalArg(0) byte arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			@Pc(40) boolean local40 = false;
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("14426, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPIQNZMJ", name = "a", descriptor = "()V")
	public void method161() {
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
		this.aByteArray12 = null;
	}

	@OriginalMember(owner = "client!KPIQNZMJ", name = "b", descriptor = "()I")
	public int method162() throws IOException {
		return this.aBoolean76 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!KPIQNZMJ", name = "c", descriptor = "()I")
	public int method163() throws IOException {
		return this.aBoolean76 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!KPIQNZMJ", name = "a", descriptor = "([BII)V")
	public void method164(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
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

	@OriginalMember(owner = "client!KPIQNZMJ", name = "a", descriptor = "(II[BI)V")
	public void method165(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean76) {
				if (this.aBoolean78) {
					this.aBoolean78 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray12 == null) {
					this.aByteArray12 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(38) int local38 = 0; local38 < arg0; local38++) {
						this.aByteArray12[this.anInt364] = arg1[local38 + 0];
						this.anInt364 = (this.anInt364 + 1) % 5000;
						if (this.anInt364 == (this.anInt363 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean77) {
						this.aBoolean77 = true;
						this.anApplet_Sub1_2.method587(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(97) RuntimeException local97) {
			signlink.reporterror("81413, " + arg0 + ", " + 0 + ", " + arg1 + ", " + -184 + ", " + local97.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!KPIQNZMJ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean77) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt364 == this.anInt363) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean77) {
					return;
				}
				local27 = this.anInt363;
				if (this.anInt364 >= this.anInt363) {
					local38 = this.anInt364 - this.anInt363;
				} else {
					local38 = 5000 - this.anInt363;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray12, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean78 = true;
				}
				this.anInt363 = (this.anInt363 + local38) % 5000;
				try {
					if (this.anInt364 == this.anInt363) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean78 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!KPIQNZMJ", name = "a", descriptor = "(I)V")
	public void method166() {
		try {
			System.out.println("dummy:" + this.aBoolean76);
			System.out.println("tcycl:" + this.anInt363);
			System.out.println("tnum:" + this.anInt364);
			System.out.println("writer:" + this.aBoolean77);
			System.out.println("ioerror:" + this.aBoolean78);
			try {
				System.out.println("available:" + this.method163());
			} catch (@Pc(74) IOException local74) {
			}
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("85757, " + -36 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}
}
