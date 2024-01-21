import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.zip.CRC32;
import java.util.zip.GZIPInputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!VYNRIVYZ")
public final class Class9_Sub1 extends Class9 implements Runnable {

	@OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "Ljava/io/InputStream;")
	private InputStream anInputStream2;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "e", descriptor = "Lclient!client;")
	private client aClient4;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "f", descriptor = "I")
	private int anInt740;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "g", descriptor = "I")
	private int anInt741;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "h", descriptor = "[B")
	private byte[] aByteArray17;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "k", descriptor = "[I")
	private int[] anIntArray172;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "m", descriptor = "I")
	private int anInt743;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "n", descriptor = "Lclient!IIWNEACY;")
	private Class2_Sub1_Sub4 aClass2_Sub1_Sub4_1;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "o", descriptor = "I")
	public int anInt744;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "r", descriptor = "Ljava/net/Socket;")
	private Socket aSocket2;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "t", descriptor = "[I")
	private int[] anIntArray173;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "v", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "x", descriptor = "[I")
	private int[] anIntArray174;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "B", descriptor = "I")
	public int anInt746;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "C", descriptor = "Ljava/io/OutputStream;")
	private OutputStream anOutputStream2;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "E", descriptor = "I")
	public int anInt747;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "F", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "G", descriptor = "I")
	private int anInt749;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "N", descriptor = "[I")
	private int[] anIntArray175;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "O", descriptor = "[I")
	private int[] anIntArray176;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "P", descriptor = "[I")
	private int[] anIntArray177;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "Q", descriptor = "J")
	private long aLong24;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "R", descriptor = "I")
	private int anInt751;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "T", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "Lclient!ELLPUVEP;")
	private Class11 aClass11_2 = new Class11((byte) 5);

	@OriginalMember(owner = "client!VYNRIVYZ", name = "d", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "i", descriptor = "Lclient!FEIPMYNH;")
	private Class13 aClass13_5 = new Class13(true);

	@OriginalMember(owner = "client!VYNRIVYZ", name = "j", descriptor = "I")
	private int anInt742 = 2;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "l", descriptor = "Ljava/lang/String;")
	public String aString15 = "";

	@OriginalMember(owner = "client!VYNRIVYZ", name = "p", descriptor = "Lclient!FEIPMYNH;")
	private Class13 aClass13_6 = new Class13(true);

	@OriginalMember(owner = "client!VYNRIVYZ", name = "q", descriptor = "Z")
	private boolean aBoolean207 = false;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "s", descriptor = "[[I")
	private int[][] anIntArrayArray19 = new int[4][];

	@OriginalMember(owner = "client!VYNRIVYZ", name = "u", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "w", descriptor = "Lclient!FEIPMYNH;")
	private Class13 aClass13_7 = new Class13(true);

	@OriginalMember(owner = "client!VYNRIVYZ", name = "y", descriptor = "[B")
	private byte[] aByteArray18 = new byte[500];

	@OriginalMember(owner = "client!VYNRIVYZ", name = "z", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "A", descriptor = "Lclient!FEIPMYNH;")
	private Class13 aClass13_8 = new Class13(true);

	@OriginalMember(owner = "client!VYNRIVYZ", name = "D", descriptor = "B")
	private byte aByte53 = -33;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "H", descriptor = "[[B")
	private byte[][] aByteArrayArray4 = new byte[4][];

	@OriginalMember(owner = "client!VYNRIVYZ", name = "I", descriptor = "[[I")
	private int[][] anIntArrayArray20 = new int[4][];

	@OriginalMember(owner = "client!VYNRIVYZ", name = "J", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "K", descriptor = "Ljava/util/zip/CRC32;")
	private CRC32 aCRC32_1 = new CRC32();

	@OriginalMember(owner = "client!VYNRIVYZ", name = "L", descriptor = "[B")
	private byte[] aByteArray19 = new byte[65000];

	@OriginalMember(owner = "client!VYNRIVYZ", name = "M", descriptor = "I")
	private int anInt750 = -964;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "S", descriptor = "I")
	private int anInt752 = -198;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "U", descriptor = "I")
	private int anInt754 = -341;

	@OriginalMember(owner = "client!VYNRIVYZ", name = "V", descriptor = "Lclient!FEIPMYNH;")
	private Class13 aClass13_9 = new Class13(true);

	@OriginalMember(owner = "client!VYNRIVYZ", name = "run", descriptor = "()V")
	@Override
	public void run() {
		try {
			while (this.aBoolean206) {
				this.anInt747++;
				@Pc(11) byte local11 = 20;
				if (this.anInt751 == 0 && this.aClient4.aClass36Array1[0] != null) {
					local11 = 50;
				}
				try {
					Thread.sleep((long) local11);
				} catch (@Pc(27) Exception local27) {
				}
				this.aBoolean210 = true;
				for (@Pc(32) int local32 = 0; local32 < 100 && this.aBoolean210; local32++) {
					this.aBoolean210 = false;
					this.method510();
					this.method517();
					if (this.anInt740 == 0 && local32 >= 5) {
						break;
					}
					this.method520();
					if (this.anInputStream2 != null) {
						this.method515();
					}
				}
				@Pc(67) boolean local67 = false;
				@Pc(72) Class2_Sub1_Sub4 local72;
				for (local72 = (Class2_Sub1_Sub4) this.aClass13_9.method200(); local72 != null; local72 = (Class2_Sub1_Sub4) this.aClass13_9.method202()) {
					if (local72.aBoolean81) {
						local67 = true;
						local72.anInt230++;
						if (local72.anInt230 > 50) {
							local72.anInt230 = 0;
							this.method527(local72, this.anInt754);
						}
					}
				}
				if (!local67) {
					for (local72 = (Class2_Sub1_Sub4) this.aClass13_9.method200(); local72 != null; local72 = (Class2_Sub1_Sub4) this.aClass13_9.method202()) {
						local67 = true;
						local72.anInt230++;
						if (local72.anInt230 > 50) {
							local72.anInt230 = 0;
							this.method527(local72, this.anInt754);
						}
					}
				}
				if (local67) {
					this.anInt745++;
					if (this.anInt745 > 750) {
						try {
							this.aSocket2.close();
						} catch (@Pc(159) Exception local159) {
						}
						this.aSocket2 = null;
						this.anInputStream2 = null;
						this.anOutputStream2 = null;
						this.anInt749 = 0;
					}
				} else {
					this.anInt745 = 0;
					this.aString15 = "";
				}
				if (this.aClient4.aBoolean248 && this.aSocket2 != null && this.anOutputStream2 != null && (this.anInt751 > 0 || this.aClient4.aClass36Array1[0] == null)) {
					this.anInt753++;
					if (this.anInt753 > 500) {
						this.anInt753 = 0;
						this.aByteArray18[0] = 0;
						this.aByteArray18[1] = 0;
						this.aByteArray18[2] = 0;
						this.aByteArray18[3] = 10;
						try {
							this.anOutputStream2.write(this.aByteArray18, 0, 4);
						} catch (@Pc(240) IOException local240) {
							this.anInt745 = 5000;
						}
					}
				}
			}
		} catch (@Pc(249) Exception local249) {
			signlink.reporterror("od_ex " + local249.getMessage());
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(I)V")
	@Override
	public void method508(@OriginalArg(0) int arg0) {
		this.method526(0, arg0);
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(II)I")
	public int method509(@OriginalArg(0) int arg0) {
		try {
			return this.aByteArray17[arg0] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("51977, " + arg0 + ", " + -90 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(Z)V")
	private void method510() {
		try {
			@Pc(5) Class13 local5 = this.aClass13_6;
			@Pc(12) Class2_Sub1_Sub4 local12;
			synchronized (this.aClass13_6) {
				local12 = (Class2_Sub1_Sub4) this.aClass13_6.method199();
			}
			while (local12 != null) {
				this.aBoolean210 = true;
				@Pc(23) byte[] local23 = null;
				if (this.aClient4.aClass36Array1[0] != null) {
					local23 = this.aClient4.aClass36Array1[local12.anInt231 + 1].method496(local12.anInt232);
				}
				if (!this.method525(this.anIntArrayArray19[local12.anInt231][local12.anInt232], local23, this.anIntArrayArray20[local12.anInt231][local12.anInt232])) {
					local23 = null;
				}
				@Pc(68) Class13 local68 = this.aClass13_6;
				synchronized (this.aClass13_6) {
					if (local23 == null) {
						this.aClass13_7.method197(local12);
					} else {
						local12.aByteArray9 = local23;
						@Pc(84) Class13 local84 = this.aClass13_8;
						synchronized (this.aClass13_8) {
							this.aClass13_8.method197(local12);
						}
					}
					local12 = (Class2_Sub1_Sub4) this.aClass13_6.method199();
				}
			}
		} catch (@Pc(111) RuntimeException local111) {
			signlink.reporterror("98513, " + true + ", " + local111.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(IZII)I")
	public int method511(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(5) int local5 = (arg1 << 8) + arg2;
			for (@Pc(11) int local11 = 0; local11 < this.anIntArray177.length; local11++) {
				if (this.anIntArray177[local11] == local5) {
					if (arg0 == 0) {
						return this.anIntArray173[local11];
					}
					return this.anIntArray176[local11];
				}
			}
			return -1;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("32731, " + arg0 + ", " + false + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(B)I")
	public int method512() {
		try {
			if (this.aByte53 != -33) {
				this.aBoolean208 = !this.aBoolean208;
			}
			return this.anIntArray174.length;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("80273, " + -33 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "(II)Z")
	public boolean method513(@OriginalArg(0) int arg0) {
		try {
			return this.anIntArray172[arg0] == 1;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("78220, " + arg0 + ", " + 454 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "(II)I")
	public int method514(@OriginalArg(0) int arg0) {
		try {
			if (this.anInt742 > 2 || this.anInt742 < 2) {
				this.aBoolean207 = !this.aBoolean207;
			}
			return this.anIntArrayArray19[arg0].length;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("71559, " + arg0 + ", " + 2 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "(Z)V")
	private void method515() {
		try {
			try {
				@Pc(10) int local10 = this.anInputStream2.available();
				@Pc(45) int local45;
				@Pc(61) int local61;
				if (this.anInt749 == 0 && local10 >= 6) {
					this.aBoolean210 = true;
					for (@Pc(21) int local21 = 0; local21 < 6; local21 += this.anInputStream2.read(this.aByteArray18, local21, 6 - local21)) {
					}
					local45 = this.aByteArray18[0] & 0xFF;
					local61 = ((this.aByteArray18[1] & 0xFF) << 8) + (this.aByteArray18[2] & 0xFF);
					@Pc(77) int local77 = ((this.aByteArray18[3] & 0xFF) << 8) + (this.aByteArray18[4] & 0xFF);
					@Pc(84) int local84 = this.aByteArray18[5] & 0xFF;
					this.aClass2_Sub1_Sub4_1 = null;
					for (@Pc(92) Class2_Sub1_Sub4 local92 = (Class2_Sub1_Sub4) this.aClass13_9.method200(); local92 != null; local92 = (Class2_Sub1_Sub4) this.aClass13_9.method202()) {
						if (local92.anInt231 == local45 && local92.anInt232 == local61) {
							this.aClass2_Sub1_Sub4_1 = local92;
						}
						if (this.aClass2_Sub1_Sub4_1 != null) {
							local92.anInt230 = 0;
						}
					}
					if (this.aClass2_Sub1_Sub4_1 != null) {
						this.anInt745 = 0;
						if (local77 == 0) {
							signlink.reporterror("Rej: " + local45 + "," + local61);
							this.aClass2_Sub1_Sub4_1.aByteArray9 = null;
							if (this.aClass2_Sub1_Sub4_1.aBoolean81) {
								@Pc(150) Class13 local150 = this.aClass13_8;
								synchronized (this.aClass13_8) {
									this.aClass13_8.method197(this.aClass2_Sub1_Sub4_1);
								}
							} else {
								this.aClass2_Sub1_Sub4_1.method530();
							}
							this.aClass2_Sub1_Sub4_1 = null;
						} else {
							if (this.aClass2_Sub1_Sub4_1.aByteArray9 == null && local84 == 0) {
								this.aClass2_Sub1_Sub4_1.aByteArray9 = new byte[local77];
							}
							if (this.aClass2_Sub1_Sub4_1.aByteArray9 == null && local84 != 0) {
								throw new IOException("missing start of file");
							}
						}
					}
					this.anInt748 = local84 * 500;
					this.anInt749 = 500;
					if (this.anInt749 > local77 - local84 * 500) {
						this.anInt749 = local77 - local84 * 500;
					}
				}
				if (this.anInt749 > 0 && local10 >= this.anInt749) {
					this.aBoolean210 = true;
					@Pc(229) byte[] local229 = this.aByteArray18;
					local45 = 0;
					if (this.aClass2_Sub1_Sub4_1 != null) {
						local229 = this.aClass2_Sub1_Sub4_1.aByteArray9;
						local45 = this.anInt748;
					}
					for (local61 = 0; local61 < this.anInt749; local61 += this.anInputStream2.read(local229, local61 + local45, this.anInt749 - local61)) {
					}
					if (this.anInt749 + this.anInt748 >= local229.length && this.aClass2_Sub1_Sub4_1 != null) {
						if (this.aClient4.aClass36Array1[0] != null) {
							this.aClient4.aClass36Array1[this.aClass2_Sub1_Sub4_1.anInt231 + 1].method497(this.aClass2_Sub1_Sub4_1.anInt232, local229, local229.length, (byte) 1);
						}
						if (!this.aClass2_Sub1_Sub4_1.aBoolean81 && this.aClass2_Sub1_Sub4_1.anInt231 == 3) {
							this.aClass2_Sub1_Sub4_1.aBoolean81 = true;
							this.aClass2_Sub1_Sub4_1.anInt231 = 93;
						}
						if (this.aClass2_Sub1_Sub4_1.aBoolean81) {
							@Pc(322) Class13 local322 = this.aClass13_8;
							synchronized (this.aClass13_8) {
								this.aClass13_8.method197(this.aClass2_Sub1_Sub4_1);
							}
						} else {
							this.aClass2_Sub1_Sub4_1.method530();
						}
					}
					this.anInt749 = 0;
				}
			} catch (@Pc(343) IOException local343) {
				try {
					this.aSocket2.close();
				} catch (@Pc(348) Exception local348) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt749 = 0;
			}
		} catch (@Pc(362) RuntimeException local362) {
			signlink.reporterror("43951, " + true + ", " + local362.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "d", descriptor = "(II)Z")
	public boolean method516(@OriginalArg(1) int arg0) {
		try {
			for (@Pc(1) int local1 = 0; local1 < this.anIntArray177.length; local1++) {
				if (this.anIntArray176[local1] == arg0) {
					return true;
				}
			}
			return false;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("76240, " + 0 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "(I)V")
	private void method517() {
		try {
			this.anInt740 = 0;
			this.anInt741 = 0;
			@Pc(12) Class2_Sub1_Sub4 local12;
			for (local12 = (Class2_Sub1_Sub4) this.aClass13_9.method200(); local12 != null; local12 = (Class2_Sub1_Sub4) this.aClass13_9.method202()) {
				if (local12.aBoolean81) {
					this.anInt740++;
				} else {
					this.anInt741++;
				}
			}
			while (this.anInt740 < 10) {
				local12 = (Class2_Sub1_Sub4) this.aClass13_7.method199();
				if (local12 == null) {
					break;
				}
				if (this.aByteArrayArray4[local12.anInt231][local12.anInt232] != 0) {
					this.anInt743++;
				}
				this.aByteArrayArray4[local12.anInt231][local12.anInt232] = 0;
				this.aClass13_9.method197(local12);
				this.anInt740++;
				this.method527(local12, this.anInt754);
				this.aBoolean210 = true;
			}
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("16495, " + 5 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(IBII)V")
	public void method518(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) int arg2) {
		try {
			if (this.aClient4.aClass36Array1[0] != null && this.anIntArrayArray19[arg2][arg0] != 0) {
				@Pc(25) byte[] local25 = this.aClient4.aClass36Array1[arg2 + 1].method496(arg0);
				if (!this.method525(this.anIntArrayArray19[arg2][arg0], local25, this.anIntArrayArray20[arg2][arg0])) {
					this.aByteArrayArray4[arg2][arg0] = arg1;
					if (arg1 > this.anInt751) {
						this.anInt751 = arg1;
					}
					this.anInt746++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("73244, " + arg0 + ", " + arg1 + ", " + -198 + ", " + arg2 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(IIB)V")
	public void method519(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aClient4.aClass36Array1[0] != null && (this.anIntArrayArray19[arg0][arg1] != 0 && (this.aByteArrayArray4[arg0][arg1] != 0 && this.anInt751 != 0))) {
				@Pc(30) Class2_Sub1_Sub4 local30 = new Class2_Sub1_Sub4();
				local30.anInt231 = arg0;
				local30.anInt232 = arg1;
				local30.aBoolean81 = false;
				@Pc(46) Class13 local46 = this.aClass13_5;
				synchronized (this.aClass13_5) {
					this.aClass13_5.method197(local30);
				}
			}
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("11074, " + arg0 + ", " + arg1 + ", " + -23 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "(Z)V")
	private void method520() {
		try {
			while (this.anInt740 == 0) {
				if (this.anInt741 >= 10 || this.anInt751 == 0) {
					return;
				}
				@Pc(10) Class13 local10 = this.aClass13_5;
				@Pc(17) Class2_Sub1_Sub4 local17;
				synchronized (this.aClass13_5) {
					local17 = (Class2_Sub1_Sub4) this.aClass13_5.method199();
				}
				while (local17 != null) {
					if (this.aByteArrayArray4[local17.anInt231][local17.anInt232] != 0) {
						this.aByteArrayArray4[local17.anInt231][local17.anInt232] = 0;
						this.aClass13_9.method197(local17);
						this.method527(local17, this.anInt754);
						this.aBoolean210 = true;
						if (this.anInt743 < this.anInt746) {
							this.anInt743++;
						}
						this.aString15 = "Loading extra files - " + this.anInt743 * 100 / this.anInt746 + "%";
						this.anInt741++;
						if (this.anInt741 == 10) {
							return;
						}
					}
					local10 = this.aClass13_5;
					synchronized (this.aClass13_5) {
						local17 = (Class2_Sub1_Sub4) this.aClass13_5.method199();
					}
				}
				for (@Pc(112) int local112 = 0; local112 < 4; local112++) {
					@Pc(119) byte[] local119 = this.aByteArrayArray4[local112];
					@Pc(122) int local122 = local119.length;
					for (@Pc(124) int local124 = 0; local124 < local122; local124++) {
						if (local119[local124] == this.anInt751) {
							local119[local124] = 0;
							local17 = new Class2_Sub1_Sub4();
							local17.anInt231 = local112;
							local17.anInt232 = local124;
							local17.aBoolean81 = false;
							this.aClass13_9.method197(local17);
							this.method527(local17, this.anInt754);
							this.aBoolean210 = true;
							if (this.anInt743 < this.anInt746) {
								this.anInt743++;
							}
							this.aString15 = "Loading extra files - " + this.anInt743 * 100 / this.anInt746 + "%";
							this.anInt741++;
							if (this.anInt741 == 10) {
								return;
							}
						}
					}
				}
				this.anInt751--;
			}
		} catch (@Pc(223) RuntimeException local223) {
			signlink.reporterror("95283, " + false + ", " + local223.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "()Lclient!IIWNEACY;")
	public Class2_Sub1_Sub4 method521() {
		@Pc(4) Class13 local4 = this.aClass13_8;
		@Pc(11) Class2_Sub1_Sub4 local11;
		synchronized (this.aClass13_8) {
			local11 = (Class2_Sub1_Sub4) this.aClass13_8.method199();
		}
		if (local11 == null) {
			return null;
		}
		@Pc(24) Class11 local24 = this.aClass11_2;
		synchronized (this.aClass11_2) {
			local11.method487();
		}
		if (local11.aByteArray9 == null) {
			return local11;
		}
		@Pc(41) int local41 = 0;
		try {
			@Pc(50) GZIPInputStream local50 = new GZIPInputStream(new ByteArrayInputStream(local11.aByteArray9));
			while (true) {
				if (local41 == this.aByteArray19.length) {
					throw new RuntimeException("buffer overflow!");
				}
				@Pc(71) int local71 = local50.read(this.aByteArray19, local41, this.aByteArray19.length - local41);
				if (local71 == -1) {
					break;
				}
				local41 += local71;
			}
		} catch (@Pc(82) IOException local82) {
			throw new RuntimeException("error unzipping");
		}
		local11.aByteArray9 = new byte[local41];
		for (@Pc(93) int local93 = 0; local93 < local41; local93++) {
			local11.aByteArray9[local93] = this.aByteArray19[local93];
		}
		return local11;
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "b", descriptor = "()I")
	public int method522() {
		@Pc(2) Class11 local2 = this.aClass11_2;
		synchronized (this.aClass11_2) {
			return this.aClass11_2.method184();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(Lclient!SMIVAFST;Lclient!client;)V")
	public void method523(@OriginalArg(0) Class35 arg0, @OriginalArg(1) client arg1) {
		@Pc(20) String[] local20 = new String[] { "model_version", "anim_version", "midi_version", "map_version" };
		@Pc(36) int local36;
		@Pc(56) int local56;
		for (@Pc(22) int local22 = 0; local22 < 4; local22++) {
			@Pc(31) byte[] local31 = arg0.method485(local20[local22], null);
			local36 = local31.length / 2;
			@Pc(42) Class2_Sub1_Sub2 local42 = new Class2_Sub1_Sub2(local31, (byte) 3);
			this.anIntArrayArray19[local22] = new int[local36];
			this.aByteArrayArray4[local22] = new byte[local36];
			for (local56 = 0; local56 < local36; local56++) {
				this.anIntArrayArray19[local22][local56] = local42.method96();
			}
		}
		@Pc(93) String[] local93 = new String[] { "model_crc", "anim_crc", "midi_crc", "map_crc" };
		@Pc(104) byte[] local104;
		for (local36 = 0; local36 < 4; local36++) {
			local104 = arg0.method485(local93[local36], null);
			local56 = local104.length / 4;
			@Pc(115) Class2_Sub1_Sub2 local115 = new Class2_Sub1_Sub2(local104, (byte) 3);
			this.anIntArrayArray20[local36] = new int[local56];
			for (@Pc(123) int local123 = 0; local123 < local56; local123++) {
				this.anIntArrayArray20[local36][local123] = local115.method99();
			}
		}
		local104 = arg0.method485("model_index", null);
		local56 = this.anIntArrayArray19[0].length;
		this.aByteArray17 = new byte[local56];
		for (@Pc(158) int local158 = 0; local158 < local56; local158++) {
			if (local158 < local104.length) {
				this.aByteArray17[local158] = local104[local158];
			} else {
				this.aByteArray17[local158] = 0;
			}
		}
		local104 = arg0.method485("map_index", null);
		@Pc(193) Class2_Sub1_Sub2 local193 = new Class2_Sub1_Sub2(local104, (byte) 3);
		local56 = local104.length / 7;
		this.anIntArray177 = new int[local56];
		this.anIntArray173 = new int[local56];
		this.anIntArray176 = new int[local56];
		this.anIntArray175 = new int[local56];
		for (@Pc(216) int local216 = 0; local216 < local56; local216++) {
			this.anIntArray177[local216] = local193.method96();
			this.anIntArray173[local216] = local193.method96();
			this.anIntArray176[local216] = local193.method96();
			this.anIntArray175[local216] = local193.method94();
		}
		local104 = arg0.method485("anim_index", null);
		local193 = new Class2_Sub1_Sub2(local104, (byte) 3);
		local56 = local104.length / 2;
		this.anIntArray174 = new int[local56];
		for (@Pc(268) int local268 = 0; local268 < local56; local268++) {
			this.anIntArray174[local268] = local193.method96();
		}
		local104 = arg0.method485("midi_index", null);
		local193 = new Class2_Sub1_Sub2(local104, (byte) 3);
		local56 = local104.length;
		this.anIntArray172 = new int[local56];
		for (@Pc(300) int local300 = 0; local300 < local56; local300++) {
			this.anIntArray172[local300] = local193.method94();
		}
		this.aClient4 = arg1;
		this.aBoolean206 = true;
		this.aClient4.method587(this, 2);
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "(I)V")
	public void method524(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) Class13 local2 = this.aClass13_5;
			synchronized (this.aClass13_5) {
				this.aClass13_5.method204();
			}
			if (arg0 < 0 || arg0 > 0) {
				;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("90170, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(I[BIZ)Z")
	private boolean method525(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			if (arg1 == null || arg1.length < 2) {
				return false;
			}
			@Pc(22) int local22 = arg1.length - 2;
			@Pc(38) int local38 = ((arg1[local22] & 0xFF) << 8) + (arg1[local22 + 1] & 0xFF);
			this.aCRC32_1.reset();
			this.aCRC32_1.update(arg1, 0, local22);
			@Pc(52) int local52 = (int) this.aCRC32_1.getValue();
			if (local38 == arg0) {
				return local52 == arg2;
			} else {
				return false;
			}
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("40752, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "e", descriptor = "(II)V")
	public void method526(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg0 > this.anIntArrayArray19.length || arg1 < 0 || arg1 > this.anIntArrayArray19[arg0].length || this.anIntArrayArray19[arg0][arg1] == 0) {
			return;
		}
		@Pc(27) Class11 local27 = this.aClass11_2;
		synchronized (this.aClass11_2) {
			@Pc(34) Class2_Sub1_Sub4 local34;
			for (local34 = (Class2_Sub1_Sub4) this.aClass11_2.method182(); local34 != null; local34 = (Class2_Sub1_Sub4) this.aClass11_2.method183()) {
				if (local34.anInt231 == arg0 && local34.anInt232 == arg1) {
					return;
				}
			}
			local34 = new Class2_Sub1_Sub4();
			local34.anInt231 = arg0;
			local34.anInt232 = arg1;
			local34.aBoolean81 = true;
			@Pc(71) Class13 local71 = this.aClass13_6;
			synchronized (this.aClass13_6) {
				this.aClass13_6.method197(local34);
			}
			this.aClass11_2.method180(local34);
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(Lclient!IIWNEACY;I)V")
	private void method527(@OriginalArg(0) Class2_Sub1_Sub4 arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				this.aBoolean209 = !this.aBoolean209;
			}
			try {
				if (this.aSocket2 == null) {
					@Pc(18) long local18 = System.currentTimeMillis();
					if (local18 - this.aLong24 < 4000L) {
						return;
					}
					this.aLong24 = local18;
					this.aSocket2 = this.aClient4.method638(client.anInt1073 + 43594);
					this.anInputStream2 = this.aSocket2.getInputStream();
					this.anOutputStream2 = this.aSocket2.getOutputStream();
					this.anOutputStream2.write(15);
					for (@Pc(53) int local53 = 0; local53 < 8; local53++) {
						this.anInputStream2.read();
					}
					this.anInt745 = 0;
				}
				this.aByteArray18[0] = (byte) arg0.anInt231;
				this.aByteArray18[1] = (byte) (arg0.anInt232 >> 8);
				this.aByteArray18[2] = (byte) arg0.anInt232;
				if (arg0.aBoolean81) {
					this.aByteArray18[3] = 2;
				} else if (this.aClient4.aBoolean248) {
					this.aByteArray18[3] = 0;
				} else {
					this.aByteArray18[3] = 1;
				}
				this.anOutputStream2.write(this.aByteArray18, 0, 4);
				this.anInt753 = 0;
				this.anInt744 = -10000;
			} catch (@Pc(130) IOException local130) {
				try {
					this.aSocket2.close();
				} catch (@Pc(135) Exception local135) {
				}
				this.aSocket2 = null;
				this.anInputStream2 = null;
				this.anOutputStream2 = null;
				this.anInt749 = 0;
				this.anInt744++;
			}
		} catch (@Pc(155) RuntimeException local155) {
			signlink.reporterror("20952, " + arg0 + ", " + arg1 + ", " + local155.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "a", descriptor = "(IZ)V")
	public void method528(@OriginalArg(1) boolean arg0) {
		try {
			@Pc(3) int local3 = this.anIntArray177.length;
			for (@Pc(5) int local5 = 0; local5 < local3; local5++) {
				if (arg0 || this.anIntArray175[local5] != 0) {
					this.method518(this.anIntArray176[local5], (byte) 2, 3);
					this.method518(this.anIntArray173[local5], (byte) 2, 3);
				}
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("25251, " + 11404 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!VYNRIVYZ", name = "c", descriptor = "()V")
	public void method529() {
		this.aBoolean206 = false;
	}
}
