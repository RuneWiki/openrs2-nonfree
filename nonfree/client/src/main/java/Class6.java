import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!d")
public final class Class6 implements Runnable {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "I")
	private int anInt236;

	@OriginalMember(owner = "client!d", name = "g", descriptor = "[B")
	private byte[] aByteArray2;

	@OriginalMember(owner = "client!d", name = "h", descriptor = "I")
	private int anInt237;

	@OriginalMember(owner = "client!d", name = "i", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!d", name = "e", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!d", name = "j", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!d", name = "k", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!d", name = "f", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!d", name = "d", descriptor = "Ljava/net/Socket;")
	private Socket aSocket1;

	@OriginalMember(owner = "client!d", name = "b", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lclient!a;ILjava/net/Socket;)V")
	public Class6(@OriginalArg(0) Applet_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Socket arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg0;
			this.aSocket1 = arg2;
			this.aSocket1.setSoTimeout(30000);
			this.aSocket1.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket1.getInputStream();
			this.anOutputStream1 = this.aSocket1.getOutputStream();
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("67844, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "()V")
	public void method174() {
		this.aBoolean61 = true;
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
		this.aBoolean62 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray2 = null;
	}

	@OriginalMember(owner = "client!d", name = "b", descriptor = "()I")
	public int method175() throws IOException {
		return this.aBoolean61 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!d", name = "c", descriptor = "()I")
	public int method176() throws IOException {
		return this.aBoolean61 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BII)V")
	public void method177(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean61) {
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

	@OriginalMember(owner = "client!d", name = "a", descriptor = "([BIZI)V")
	public void method178(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) throws IOException {
		try {
			if (!this.aBoolean61) {
				if (this.aBoolean63) {
					this.aBoolean63 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray2 == null) {
					this.aByteArray2 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray2[this.anInt238] = arg0[local28];
						this.anInt238 = (this.anInt238 + 1) % 5000;
						if (this.anInt238 == (this.anInt237 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean62) {
						this.aBoolean62 = true;
						this.anApplet_Sub1_2.method65(this, 2);
					}
					this.notify();
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("36631, " + arg0 + ", " + arg1 + ", " + false + ", " + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!d", name = "run", descriptor = "()V")
	@Override
	public void run() {
		System.out.println("clientstream writer starting");
		while (this.aBoolean62) {
			@Pc(41) int local41;
			@Pc(30) int local30;
			synchronized (this) {
				if (this.anInt238 == this.anInt237) {
					try {
						this.wait();
					} catch (@Pc(19) InterruptedException local19) {
					}
				}
				if (!this.aBoolean62) {
					break;
				}
				local30 = this.anInt237;
				if (this.anInt238 >= this.anInt237) {
					local41 = this.anInt238 - this.anInt237;
				} else {
					local41 = 5000 - this.anInt237;
				}
			}
			if (local41 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray2, local30, local41);
				} catch (@Pc(65) IOException local65) {
					this.aBoolean63 = true;
				}
				this.anInt237 = (this.anInt237 + local41) % 5000;
				try {
					if (this.anInt238 == this.anInt237) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(86) IOException local86) {
					this.aBoolean63 = true;
				}
			}
		}
		System.out.println("clientstream writer stopping");
	}
}
