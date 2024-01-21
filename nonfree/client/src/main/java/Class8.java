import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!e")
public final class Class8 implements Runnable {

	@OriginalMember(owner = "client!e", name = "i", descriptor = "[B")
	private byte[] aByteArray3;

	@OriginalMember(owner = "client!e", name = "j", descriptor = "I")
	private int anInt485;

	@OriginalMember(owner = "client!e", name = "k", descriptor = "I")
	private int anInt486;

	@OriginalMember(owner = "client!e", name = "a", descriptor = "I")
	private int anInt483 = -323;

	@OriginalMember(owner = "client!e", name = "b", descriptor = "I")
	private int anInt484 = -20292;

	@OriginalMember(owner = "client!e", name = "c", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!e", name = "g", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!e", name = "l", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!e", name = "m", descriptor = "Z")
	private boolean aBoolean117 = false;

	@OriginalMember(owner = "client!e", name = "h", descriptor = "Lclient!a;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!e", name = "f", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!e", name = "d", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream1;

	@OriginalMember(owner = "client!e", name = "e", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream1;

	@OriginalMember(owner = "client!e", name = "<init>", descriptor = "(ILjava/net/Socket;Lclient!a;)V")
	public Class8(@OriginalArg(0) int arg0, @OriginalArg(1) Socket arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg1;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream1 = this.aSocket2.getInputStream();
			this.anOutputStream1 = this.aSocket2.getOutputStream();
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("20619, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "()V")
	public void method247() {
		this.aBoolean115 = true;
		try {
			if (this.anInputStream1 != null) {
				this.anInputStream1.close();
			}
			if (this.anOutputStream1 != null) {
				this.anOutputStream1.close();
			}
			if (this.aSocket2 != null) {
				this.aSocket2.close();
			}
		} catch (@Pc(22) IOException local22) {
			System.out.println("Error closing stream");
		}
		this.aBoolean116 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray3 = null;
	}

	@OriginalMember(owner = "client!e", name = "b", descriptor = "()I")
	public int method248() throws IOException {
		return this.aBoolean115 ? 0 : this.anInputStream1.read();
	}

	@OriginalMember(owner = "client!e", name = "c", descriptor = "()I")
	public int method249() throws IOException {
		return this.aBoolean115 ? 0 : this.anInputStream1.available();
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "([BII)V")
	public void method250(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean115) {
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

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(IBI[B)V")
	public void method251(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) throws IOException {
		try {
			if (!this.aBoolean115) {
				if (this.aBoolean117) {
					this.aBoolean117 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray3 == null) {
					this.aByteArray3 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(34) int local34 = 0; local34 < arg0; local34++) {
						this.aByteArray3[this.anInt486] = arg1[local34 + 0];
						this.anInt486 = (this.anInt486 + 1) % 5000;
						if (this.anInt486 == (this.anInt485 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean116) {
						this.aBoolean116 = true;
						this.anApplet_Sub1_2.method95(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("56528, " + arg0 + ", " + 3 + ", " + 0 + ", " + arg1 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!e", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean116) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt486 == this.anInt485) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean116) {
					return;
				}
				local27 = this.anInt485;
				if (this.anInt486 >= this.anInt485) {
					local38 = this.anInt486 - this.anInt485;
				} else {
					local38 = 5000 - this.anInt485;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream1.write(this.aByteArray3, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean117 = true;
				}
				this.anInt485 = (this.anInt485 + local38) % 5000;
				try {
					if (this.anInt486 == this.anInt485) {
						this.anOutputStream1.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean117 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
	public void method252() {
		try {
			System.out.println("dummy:" + this.aBoolean115);
			System.out.println("tcycl:" + this.anInt485);
			System.out.println("tnum:" + this.anInt486);
			System.out.println("writer:" + this.aBoolean116);
			System.out.println("ioerror:" + this.aBoolean117);
			try {
				System.out.println("available:" + this.method249());
			} catch (@Pc(65) IOException local65) {
			}
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("82827, " + 3 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}
}
