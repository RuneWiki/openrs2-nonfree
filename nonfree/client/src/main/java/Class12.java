import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EUCYOSVT")
public final class Class12 implements Runnable {

	@OriginalMember(owner = "client!EUCYOSVT", name = "c", descriptor = "I")
	private int anInt167;

	@OriginalMember(owner = "client!EUCYOSVT", name = "i", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!EUCYOSVT", name = "j", descriptor = "I")
	private int anInt168;

	@OriginalMember(owner = "client!EUCYOSVT", name = "k", descriptor = "I")
	private int anInt169;

	@OriginalMember(owner = "client!EUCYOSVT", name = "a", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!EUCYOSVT", name = "b", descriptor = "I")
	private int anInt166 = 27854;

	@OriginalMember(owner = "client!EUCYOSVT", name = "g", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!EUCYOSVT", name = "l", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!EUCYOSVT", name = "m", descriptor = "Z")
	private boolean aBoolean46 = false;

	@OriginalMember(owner = "client!EUCYOSVT", name = "h", descriptor = "Lclient!UNXTKTRJ;")
	private Applet_Sub1 anApplet_Sub1_1;

	@OriginalMember(owner = "client!EUCYOSVT", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!EUCYOSVT", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!EUCYOSVT", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!EUCYOSVT", name = "<init>", descriptor = "(BLjava/net/Socket;Lclient!UNXTKTRJ;)V")
	public Class12(@OriginalArg(0) byte arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_1 = arg2;
			this.aSocket1 = arg1;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("4187, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EUCYOSVT", name = "a", descriptor = "()V")
	public void method102() {
		this.aBoolean44 = true;
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
		this.aBoolean45 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!EUCYOSVT", name = "b", descriptor = "()I")
	public int method103() throws IOException {
		return this.aBoolean44 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!EUCYOSVT", name = "c", descriptor = "()I")
	public int method104() throws IOException {
		return this.aBoolean44 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!EUCYOSVT", name = "a", descriptor = "([BII)V")
	public void method105(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean44) {
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

	@OriginalMember(owner = "client!EUCYOSVT", name = "a", descriptor = "(III[B)V")
	public void method106(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean44) {
				if (this.aBoolean46) {
					this.aBoolean46 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg0; local28++) {
						this.aByteArray3[this.anInt169] = arg1[local28 + 0];
						this.anInt169 = (this.anInt169 + 1) % 5000;
						if (this.anInt169 == (this.anInt168 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean45) {
						this.aBoolean45 = true;
						this.anApplet_Sub1_1.method578(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(99) RuntimeException local99) {
			signlink.reporterror("68057, " + 4 + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local99.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EUCYOSVT", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean45) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt169 == this.anInt168) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean45) {
					return;
				}
				local27 = this.anInt168;
				if (this.anInt169 >= this.anInt168) {
					local38 = this.anInt169 - this.anInt168;
				} else {
					local38 = 5000 - this.anInt168;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean46 = true;
				}
				this.anInt168 = (this.anInt168 + local38) % 5000;
				try {
					if (this.anInt169 == this.anInt168) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean46 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!EUCYOSVT", name = "a", descriptor = "(I)V")
	public void method107() {
		try {
			System.out.println("dummy:" + this.aBoolean44);
			System.out.println("tcycl:" + this.anInt168);
			System.out.println("tnum:" + this.anInt169);
			System.out.println("writer:" + this.aBoolean45);
			System.out.println("ioerror:" + this.aBoolean46);
			try {
				System.out.println("available:" + this.method104());
			} catch (@Pc(66) IOException local66) {
			}
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("57074, " + 0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}
}
