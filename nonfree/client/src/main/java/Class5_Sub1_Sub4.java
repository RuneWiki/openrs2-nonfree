import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XGRGMPUQ")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!XGRGMPUQ", name = "M", descriptor = "I")
	private static int anInt757;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "N", descriptor = "I")
	private static int anInt758;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "O", descriptor = "I")
	private static int anInt759;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "i", descriptor = "B")
	private static byte aByte28 = 74;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "j", descriptor = "B")
	private static byte aByte29 = 1;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "J", descriptor = "[I")
	private static int[] anIntArray191 = new int[256];

	@OriginalMember(owner = "client!XGRGMPUQ", name = "K", descriptor = "[I")
	private static final int[] anIntArray192;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "P", descriptor = "Lclient!VLUKUYNM;")
	private static Class42 aClass42_6;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "Q", descriptor = "Lclient!VLUKUYNM;")
	private static Class42 aClass42_7;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "R", descriptor = "Lclient!VLUKUYNM;")
	private static Class42 aClass42_8;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "S", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "o", descriptor = "I")
	private int anInt745;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "r", descriptor = "I")
	private int anInt748;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "z", descriptor = "I")
	private int anInt753;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "G", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "H", descriptor = "I")
	public int anInt755;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "I", descriptor = "I")
	public int anInt756;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "L", descriptor = "Lclient!ENXSCLLS;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "k", descriptor = "B")
	private byte aByte30 = 47;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "l", descriptor = "I")
	private int anInt742 = -211;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "m", descriptor = "I")
	private int anInt743 = -43215;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "n", descriptor = "I")
	private int anInt744 = -998;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "p", descriptor = "I")
	private int anInt746 = 33447;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "q", descriptor = "I")
	private int anInt747 = -263;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "s", descriptor = "Z")
	private boolean aBoolean206 = true;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "t", descriptor = "Z")
	private boolean aBoolean207 = true;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "u", descriptor = "I")
	private int anInt749 = -787;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "v", descriptor = "I")
	private int anInt750 = 5;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "w", descriptor = "I")
	private int anInt751 = 41364;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "x", descriptor = "I")
	private int anInt752 = -302;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "y", descriptor = "Z")
	private boolean aBoolean208 = true;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "A", descriptor = "I")
	private int anInt754 = 47424;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "B", descriptor = "Z")
	private boolean aBoolean209 = true;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "C", descriptor = "Z")
	private boolean aBoolean210 = false;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "D", descriptor = "Z")
	private boolean aBoolean211 = false;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "E", descriptor = "Z")
	private boolean aBoolean212 = true;

	@OriginalMember(owner = "client!XGRGMPUQ", name = "F", descriptor = "Z")
	private boolean aBoolean213 = true;

	static {
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray191[local8] = local11;
		}
		anIntArray192 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass42_6 = new Class42((byte) 0);
		aClass42_7 = new Class42((byte) 0);
		aClass42_8 = new Class42((byte) 0);
		aCharArray4 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(IB)Lclient!XGRGMPUQ;")
	public static Class5_Sub1_Sub4 method425(@OriginalArg(1) byte arg0) {
		try {
			@Pc(3) Class42 local3 = aClass42_7;
			synchronized (aClass42_7) {
				@Pc(7) Class5_Sub1_Sub4 local7 = null;
				if (anInt758 > 0) {
					anInt758--;
					local7 = (Class5_Sub1_Sub4) aClass42_7.method298();
				}
				if (local7 != null) {
					local7.anInt755 = 0;
					return local7;
				}
			}
			@Pc(69) Class5_Sub1_Sub4 local69 = new Class5_Sub1_Sub4(aByte29);
			if (arg0 != aByte28) {
				throw new NullPointerException();
			}
			local69.anInt755 = 0;
			local69.aByteArray20 = new byte[5000];
			return local69;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("56632, " + 1 + ", " + arg0 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "<init>", descriptor = "(B)V")
	private Class5_Sub1_Sub4(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != aByte29) {
				throw new NullPointerException();
			}
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("20899, " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "<init>", descriptor = "([BI)V")
	public Class5_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray20 = arg0;
			this.anInt755 = 0;
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("72272, " + arg0 + ", " + arg1 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(II)V")
	public void method426(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) (arg0 + this.aClass13_1.method81());
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("31304, " + 4 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(I)V")
	public void method427(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt755++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "b", descriptor = "(I)V")
	public void method428(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt755++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "b", descriptor = "(II)V")
	public void method429(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) arg0;
			this.aByteArray20[this.anInt755++] = 0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("51086, " + -48022 + ", " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "c", descriptor = "(I)V")
	public void method430(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt755++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "d", descriptor = "(I)V")
	public void method431(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt755++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "c", descriptor = "(II)V")
	public void method432(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) arg0;
			this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 16);
			this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("66966, " + arg0 + ", " + 750 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(BJ)V")
	public void method433(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) (arg1 >> 56);
			this.aByteArray20[this.anInt755++] = (byte) (arg1 >> 48);
			this.aByteArray20[this.anInt755++] = (byte) (arg1 >> 40);
			this.aByteArray20[this.anInt755++] = (byte) (arg1 >> 32);
			this.aByteArray20[this.anInt755++] = (byte) (arg1 >> 24);
			this.aByteArray20[this.anInt755++] = (byte) (arg1 >> 16);
			this.aByteArray20[this.anInt755++] = (byte) (arg1 >> 8);
			if (arg0 != 6) {
				this.anInt754 = 35;
			}
			this.aByteArray20[this.anInt755++] = (byte) arg1;
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("95238, " + arg0 + ", " + arg1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method434(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray20, this.anInt755);
		this.anInt755 += arg0.length();
		this.aByteArray20[this.anInt755++] = 10;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "([BIII)V")
	public void method435(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < arg1 + 0; local8++) {
				this.aByteArray20[this.anInt755++] = arg0[local8];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("29165, " + arg0 + ", " + 0 + ", " + -944 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(ZI)V")
	public void method436(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt755 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("84990, " + true + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "c", descriptor = "()I")
	public int method437() {
		return this.aByteArray20[this.anInt755++] & 0xFF;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "d", descriptor = "()B")
	public byte method438() {
		return this.aByteArray20[this.anInt755++];
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "e", descriptor = "()I")
	public int method439() {
		this.anInt755 += 2;
		return ((this.aByteArray20[this.anInt755 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "f", descriptor = "()I")
	public int method440() {
		this.anInt755 += 2;
		@Pc(27) int local27 = ((this.aByteArray20[this.anInt755 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "g", descriptor = "()I")
	public int method441() {
		this.anInt755 += 3;
		return ((this.aByteArray20[this.anInt755 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt755 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "h", descriptor = "()I")
	public int method442() {
		this.anInt755 += 4;
		return ((this.aByteArray20[this.anInt755 - 4] & 0xFF) << 24) + ((this.aByteArray20[this.anInt755 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt755 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "e", descriptor = "(I)J")
	public long method443() {
		try {
			@Pc(10) long local10 = (long) this.method442() & 0xFFFFFFFFL;
			@Pc(16) long local16 = (long) this.method442() & 0xFFFFFFFFL;
			return (local10 << 32) + local16;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("93329, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "i", descriptor = "()Ljava/lang/String;")
	public String method444() {
		@Pc(2) int local2 = this.anInt755;
		while (this.aByteArray20[this.anInt755++] != 10) {
		}
		return new String(this.aByteArray20, local2, this.anInt755 - local2 - 1);
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "f", descriptor = "(I)[B")
	public byte[] method445() {
		try {
			@Pc(4) int local4 = this.anInt755;
			while (this.aByteArray20[this.anInt755++] != 10) {
			}
			@Pc(32) byte[] local32 = new byte[this.anInt755 - local4 - 1];
			for (@Pc(34) int local34 = local4; local34 < this.anInt755 - 1; local34++) {
				local32[local34 - local4] = this.aByteArray20[local34];
			}
			return local32;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("86780, " + -211 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "b", descriptor = "([BIII)V")
	public void method446(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.anInt743 == -43215) {
				for (@Pc(6) int local6 = 0; local6 < arg1 + 0; local6++) {
					arg0[local6] = this.aByteArray20[this.anInt755++];
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("3183, " + arg0 + ", " + -43215 + ", " + arg1 + ", " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "g", descriptor = "(I)V")
	public void method447() {
		try {
			this.anInt756 = this.anInt755 * 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("74203, " + -998 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "d", descriptor = "(II)I")
	public int method448(@OriginalArg(0) int arg0) {
		try {
			@Pc(10) int local10 = this.anInt756 >> 3;
			@Pc(17) int local17 = 8 - (this.anInt756 & 0x7);
			@Pc(19) int local19 = 0;
			this.anInt756 += arg0;
			while (arg0 > local17) {
				local19 += (this.aByteArray20[local10++] & anIntArray192[local17]) << arg0 - local17;
				arg0 -= local17;
				local17 = 8;
			}
			if (arg0 == local17) {
				local19 += this.aByteArray20[local10] & anIntArray192[local17];
			} else {
				local19 += this.aByteArray20[local10] >> local17 - arg0 & anIntArray192[arg0];
			}
			return local19;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("20409, " + arg0 + ", " + 0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "h", descriptor = "(I)V")
	public void method449() {
		try {
			this.anInt755 = (this.anInt756 + 7) / 8;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("42352, " + -22110 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "j", descriptor = "()I")
	public int method450() {
		@Pc(7) int local7 = this.aByteArray20[this.anInt755] & 0xFF;
		return local7 < 128 ? this.method437() - 64 : this.method439() - 49152;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "k", descriptor = "()I")
	public int method451() {
		@Pc(7) int local7 = this.aByteArray20[this.anInt755] & 0xFF;
		return local7 < 128 ? this.method437() : this.method439() - 32768;
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method452(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt755;
			this.anInt755 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method446(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt755 = 0;
			this.method427(local27.length);
			this.method435(local27, local27.length);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("69902, " + arg0 + ", " + 4 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(BI)V")
	public void method453(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) (arg0 + 128);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("96503, " + -88 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "e", descriptor = "(II)V")
	public void method454(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) -arg1;
			if (arg0 == 19939) {
				;
			}
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("75669, " + arg0 + ", " + arg1 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "i", descriptor = "(I)I")
	public int method455() {
		try {
			return this.aByteArray20[this.anInt755++] - 128 & 0xFF;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("47700, " + -270 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "j", descriptor = "(I)I")
	public int method456() {
		try {
			return -this.aByteArray20[this.anInt755++] & 0xFF;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("92189, " + -241 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(Z)I")
	public int method457(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				this.anInt747 = 30;
			}
			return 128 - this.aByteArray20[this.anInt755++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("91781, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "b", descriptor = "(Z)B")
	public byte method458() {
		try {
			return (byte) (this.aByteArray20[this.anInt755++] - 128);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("39713, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "k", descriptor = "(I)B")
	public byte method459() {
		try {
			return (byte) -this.aByteArray20[this.anInt755++];
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("83681, " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "f", descriptor = "(II)V")
	public void method460(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) arg0;
			if (this.anInt751 != 41364) {
				this.anInt746 = 313;
			}
			this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 8);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("52746, " + arg0 + ", " + 41364 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "g", descriptor = "(II)V")
	public void method461(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt755++] = (byte) (arg0 + 128);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("14735, " + arg0 + ", " + 1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "h", descriptor = "(II)V")
	public void method462(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) (arg0 + 128);
			this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 8);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("47799, " + -302 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "l", descriptor = "(I)I")
	public int method463() {
		try {
			this.anInt755 += 2;
			return ((this.aByteArray20[this.anInt755 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 2] & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("74363, " + 455 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "m", descriptor = "(I)I")
	public int method464() {
		try {
			this.anInt755 += 2;
			return ((this.aByteArray20[this.anInt755 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("46272, " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "n", descriptor = "(I)I")
	public int method465() {
		try {
			this.anInt755 += 2;
			return ((this.aByteArray20[this.anInt755 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("95970, " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "o", descriptor = "(I)I")
	public int method466() {
		try {
			this.anInt755 += 2;
			@Pc(32) int local32 = ((this.aByteArray20[this.anInt755 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 2] & 0xFF);
			if (local32 > 32767) {
				local32 -= 65536;
			}
			return local32;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("557, " + 885 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "p", descriptor = "(I)I")
	public int method467() {
		try {
			this.anInt755 += 2;
			@Pc(33) int local33 = ((this.aByteArray20[this.anInt755 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 2] - 128 & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("78822, " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "q", descriptor = "(I)I")
	public int method468() {
		try {
			this.anInt755 += 3;
			return ((this.aByteArray20[this.anInt755 - 1] & 0xFF) << 16) + ((this.aByteArray20[this.anInt755 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 3] & 0xFF);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("61346, " + -976 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "i", descriptor = "(II)V")
	public void method469(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt755++] = (byte) arg0;
			if (arg1 == 0) {
				this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 24);
				this.aByteArray20[this.anInt755++] = (byte) (arg0 >> 16);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("6594, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "r", descriptor = "(I)I")
	public int method470() {
		try {
			this.anInt755 += 4;
			return ((this.aByteArray20[this.anInt755 - 1] & 0xFF) << 24) + ((this.aByteArray20[this.anInt755 - 2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt755 - 3] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 4] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("23735, " + -404 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "s", descriptor = "(I)I")
	public int method471() {
		try {
			if (this.anInt753 == 0) {
				this.anInt755 += 4;
				return ((this.aByteArray20[this.anInt755 - 2] & 0xFF) << 24) + ((this.aByteArray20[this.anInt755 - 1] & 0xFF) << 16) + ((this.aByteArray20[this.anInt755 - 4] & 0xFF) << 8) + (this.aByteArray20[this.anInt755 - 3] & 0xFF);
			} else {
				return 4;
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("10133, " + 0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XGRGMPUQ", name = "a", descriptor = "(IZI[B)V")
	public void method472(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(16) int local16 = arg0 + 0 - 1; local16 >= 0; local16--) {
				this.aByteArray20[this.anInt755++] = (byte) (arg1[local16] + 128);
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("23387, " + arg0 + ", " + true + ", " + 0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
