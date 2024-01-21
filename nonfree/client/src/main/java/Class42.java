import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VAVAOKUB")
public final class Class42 implements Runnable {

	@OriginalMember(owner = "client!VAVAOKUB", name = "h", descriptor = "[B")
	private byte[] aByteArray19;

	@OriginalMember(owner = "client!VAVAOKUB", name = "i", descriptor = "I")
	private int anInt642;

	@OriginalMember(owner = "client!VAVAOKUB", name = "j", descriptor = "I")
	private int anInt643;

	@OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!VAVAOKUB", name = "b", descriptor = "I")
	private int anInt641 = 891;

	@OriginalMember(owner = "client!VAVAOKUB", name = "f", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!VAVAOKUB", name = "k", descriptor = "Z")
	private boolean aBoolean145 = false;

	@OriginalMember(owner = "client!VAVAOKUB", name = "l", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!VAVAOKUB", name = "g", descriptor = "Lclient!GRXJFORE;")
	private Applet_Sub1 anApplet_Sub1_2;

	@OriginalMember(owner = "client!VAVAOKUB", name = "e", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!VAVAOKUB", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!VAVAOKUB", name = "d", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!VAVAOKUB", name = "<init>", descriptor = "(Ljava/net/Socket;ILclient!GRXJFORE;)V")
	public Class42(@OriginalArg(0) Socket arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Applet_Sub1 arg2) throws IOException {
		try {
			this.anApplet_Sub1_2 = arg2;
			this.aSocket2 = arg0;
			this.aSocket2.setSoTimeout(30000);
			this.aSocket2.setTcpNoDelay(true);
			this.anInputStream2 = this.aSocket2.getInputStream();
			this.anOutputStream2 = this.aSocket2.getOutputStream();
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("71485, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "()V")
	public void method428() {
		this.aBoolean144 = true;
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
		this.aBoolean145 = false;
		synchronized (this) {
			this.notify();
		}
		this.aByteArray19 = null;
	}

	@OriginalMember(owner = "client!VAVAOKUB", name = "b", descriptor = "()I")
	public int method429() throws IOException {
		return this.aBoolean144 ? 0 : this.anInputStream2.read();
	}

	@OriginalMember(owner = "client!VAVAOKUB", name = "c", descriptor = "()I")
	public int method430() throws IOException {
		return this.aBoolean144 ? 0 : this.anInputStream2.available();
	}

	@OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "([BII)V")
	public void method431(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (this.aBoolean144) {
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

	@OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "([BIII)V")
	public void method432(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) throws IOException {
		try {
			if (!this.aBoolean144) {
				if (this.aBoolean146) {
					this.aBoolean146 = false;
					throw new IOException("Error in writer thread");
				}
				if (this.aByteArray19 == null) {
					this.aByteArray19 = new byte[5000];
				}
				synchronized (this) {
					for (@Pc(28) int local28 = 0; local28 < arg1; local28++) {
						this.aByteArray19[this.anInt643] = arg0[local28 + 0];
						this.anInt643 = (this.anInt643 + 1) % 5000;
						if (this.anInt643 == (this.anInt642 + 4900) % 5000) {
							throw new IOException("buffer overflow");
						}
					}
					if (!this.aBoolean145) {
						this.aBoolean145 = true;
						this.anApplet_Sub1_2.method586(this, 3);
					}
					this.notify();
				}
			}
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("61308, " + arg0 + ", " + 759 + ", " + 0 + ", " + arg1 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VAVAOKUB", name = "run", descriptor = "()V")
	@Override
	public void run() {
		while (this.aBoolean145) {
			@Pc(38) int local38;
			@Pc(27) int local27;
			synchronized (this) {
				if (this.anInt643 == this.anInt642) {
					try {
						this.wait();
					} catch (@Pc(16) InterruptedException local16) {
					}
				}
				if (!this.aBoolean145) {
					return;
				}
				local27 = this.anInt642;
				if (this.anInt643 >= this.anInt642) {
					local38 = this.anInt643 - this.anInt642;
				} else {
					local38 = 5000 - this.anInt642;
				}
			}
			if (local38 > 0) {
				try {
					this.anOutputStream2.write(this.aByteArray19, local27, local38);
				} catch (@Pc(62) IOException local62) {
					this.aBoolean146 = true;
				}
				this.anInt642 = (this.anInt642 + local38) % 5000;
				try {
					if (this.anInt643 == this.anInt642) {
						this.anOutputStream2.flush();
					}
				} catch (@Pc(83) IOException local83) {
					this.aBoolean146 = true;
				}
			}
		}
	}

	@OriginalMember(owner = "client!VAVAOKUB", name = "a", descriptor = "(Z)V")
	public void method433() {
		try {
			System.out.println("dummy:" + this.aBoolean144);
			System.out.println("tcycl:" + this.anInt642);
			System.out.println("tnum:" + this.anInt643);
			System.out.println("writer:" + this.aBoolean145);
			System.out.println("ioerror:" + this.aBoolean146);
			try {
				System.out.println("available:" + this.method430());
			} catch (@Pc(71) IOException local71) {
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("94803, " + true + ", " + local73.toString());
			throw new RuntimeException();
		}
	}
}
