import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PGNBHFUF")
public final class Class4_Sub1_Sub4 extends Class4_Sub1 {

	@OriginalMember(owner = "client!PGNBHFUF", name = "m", descriptor = "I")
	private static int anInt499;

	@OriginalMember(owner = "client!PGNBHFUF", name = "I", descriptor = "I")
	private static int anInt508;

	@OriginalMember(owner = "client!PGNBHFUF", name = "J", descriptor = "I")
	private static int anInt509;

	@OriginalMember(owner = "client!PGNBHFUF", name = "K", descriptor = "I")
	private static int anInt510;

	@OriginalMember(owner = "client!PGNBHFUF", name = "i", descriptor = "I")
	private static int anInt496 = 581;

	@OriginalMember(owner = "client!PGNBHFUF", name = "F", descriptor = "[I")
	private static int[] anIntArray98 = new int[256];

	@OriginalMember(owner = "client!PGNBHFUF", name = "G", descriptor = "[I")
	private static final int[] anIntArray99;

	@OriginalMember(owner = "client!PGNBHFUF", name = "L", descriptor = "Lclient!FEPBPONH;")
	private static Class11 aClass11_7;

	@OriginalMember(owner = "client!PGNBHFUF", name = "M", descriptor = "Lclient!FEPBPONH;")
	private static Class11 aClass11_8;

	@OriginalMember(owner = "client!PGNBHFUF", name = "N", descriptor = "Lclient!FEPBPONH;")
	private static Class11 aClass11_9;

	@OriginalMember(owner = "client!PGNBHFUF", name = "O", descriptor = "[C")
	private static char[] aCharArray3;

	@OriginalMember(owner = "client!PGNBHFUF", name = "k", descriptor = "I")
	private int anInt498;

	@OriginalMember(owner = "client!PGNBHFUF", name = "y", descriptor = "I")
	private int anInt505;

	@OriginalMember(owner = "client!PGNBHFUF", name = "C", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!PGNBHFUF", name = "D", descriptor = "I")
	public int anInt506;

	@OriginalMember(owner = "client!PGNBHFUF", name = "E", descriptor = "I")
	public int anInt507;

	@OriginalMember(owner = "client!PGNBHFUF", name = "H", descriptor = "Lclient!BDQVRRZB;")
	public Class3 aClass3_1;

	@OriginalMember(owner = "client!PGNBHFUF", name = "j", descriptor = "I")
	private int anInt497 = -961;

	@OriginalMember(owner = "client!PGNBHFUF", name = "l", descriptor = "B")
	private byte aByte17 = 5;

	@OriginalMember(owner = "client!PGNBHFUF", name = "n", descriptor = "I")
	private int anInt500 = -47744;

	@OriginalMember(owner = "client!PGNBHFUF", name = "o", descriptor = "I")
	private int anInt501 = 35;

	@OriginalMember(owner = "client!PGNBHFUF", name = "p", descriptor = "I")
	private int anInt502 = 41;

	@OriginalMember(owner = "client!PGNBHFUF", name = "q", descriptor = "B")
	private byte aByte18 = 109;

	@OriginalMember(owner = "client!PGNBHFUF", name = "r", descriptor = "I")
	private int anInt503 = 951;

	@OriginalMember(owner = "client!PGNBHFUF", name = "s", descriptor = "Z")
	private boolean aBoolean126 = false;

	@OriginalMember(owner = "client!PGNBHFUF", name = "t", descriptor = "B")
	private byte aByte19 = -6;

	@OriginalMember(owner = "client!PGNBHFUF", name = "u", descriptor = "B")
	private byte aByte20 = 9;

	@OriginalMember(owner = "client!PGNBHFUF", name = "v", descriptor = "B")
	private byte aByte21 = 6;

	@OriginalMember(owner = "client!PGNBHFUF", name = "w", descriptor = "I")
	private int anInt504 = 407;

	@OriginalMember(owner = "client!PGNBHFUF", name = "x", descriptor = "Z")
	private boolean aBoolean127 = true;

	@OriginalMember(owner = "client!PGNBHFUF", name = "z", descriptor = "Z")
	private boolean aBoolean128 = true;

	@OriginalMember(owner = "client!PGNBHFUF", name = "A", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!PGNBHFUF", name = "B", descriptor = "Z")
	private boolean aBoolean130 = true;

	static {
		for (@Pc(6) int local6 = 0; local6 < 256; local6++) {
			@Pc(9) int local9 = local6;
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray98[local6] = local9;
		}
		anIntArray99 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass11_7 = new Class11(145);
		aClass11_8 = new Class11(145);
		aClass11_9 = new Class11(145);
		aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(BI)Lclient!PGNBHFUF;")
	public static Class4_Sub1_Sub4 method343() {
		try {
			@Pc(3) Class11 local3 = aClass11_8;
			synchronized (aClass11_8) {
				@Pc(7) Class4_Sub1_Sub4 local7 = null;
				if (anInt509 > 0) {
					anInt509--;
					local7 = (Class4_Sub1_Sub4) aClass11_8.method165();
				}
				if (local7 != null) {
					local7.anInt506 = 0;
					return local7;
				}
			}
			@Pc(69) Class4_Sub1_Sub4 local69 = new Class4_Sub1_Sub4(anInt496);
			local69.anInt506 = 0;
			local69.aByteArray10 = new byte[5000];
			return local69;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("83000, " + 47 + ", " + 1 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "<init>", descriptor = "(I)V")
	private Class4_Sub1_Sub4(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				throw new NullPointerException();
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("94278, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "<init>", descriptor = "(I[B)V")
	public Class4_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray10 = arg1;
			this.anInt506 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("96251, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "b", descriptor = "(BI)V")
	public void method344(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) (arg0 + this.aClass3_1.method51());
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("95468, " + -81 + ", " + arg0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(I)V")
	public void method345(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt506++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "b", descriptor = "(I)V")
	public void method346(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt506++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(II)V")
	public void method347(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) arg0;
			this.aByteArray10[this.anInt506++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("12688, " + -33050 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "c", descriptor = "(I)V")
	public void method348(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 16);
		this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt506++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "d", descriptor = "(I)V")
	public void method349(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 24);
		this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 16);
		this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt506++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "b", descriptor = "(II)V")
	public void method350(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) arg0;
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 24);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("91573, " + arg0 + ", " + -961 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(IJ)V")
	public void method351(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 56);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 48);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 40);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 32);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 24);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt506++] = (byte) arg0;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("3502, " + 30294 + ", " + arg0 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method352(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray10, this.anInt506);
		this.anInt506 += arg0.length();
		this.aByteArray10[this.anInt506++] = 10;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "([BIIB)V")
	public void method353(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray10[this.anInt506++] = arg0[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("89906, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 74 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "c", descriptor = "(BI)V")
	public void method354(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray10[this.anInt506 - arg1 - 1] = (byte) arg1;
			if (this.aByte17 == 5) {
				@Pc(16) boolean local16 = false;
			} else {
				for (@Pc(19) int local19 = 1; local19 > 0; local19++) {
				}
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("99510, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "c", descriptor = "()I")
	public int method355() {
		return this.aByteArray10[this.anInt506++] & 0xFF;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "d", descriptor = "()B")
	public byte method356() {
		return this.aByteArray10[this.anInt506++];
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "e", descriptor = "()I")
	public int method357() {
		this.anInt506 += 2;
		return ((this.aByteArray10[this.anInt506 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "f", descriptor = "()I")
	public int method358() {
		this.anInt506 += 2;
		@Pc(27) int local27 = ((this.aByteArray10[this.anInt506 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "g", descriptor = "()I")
	public int method359() {
		this.anInt506 += 3;
		return ((this.aByteArray10[this.anInt506 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt506 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "h", descriptor = "()I")
	public int method360() {
		this.anInt506 += 4;
		return ((this.aByteArray10[this.anInt506 - 4] & 0xFF) << 24) + ((this.aByteArray10[this.anInt506 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt506 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(Z)J")
	public long method361() {
		try {
			@Pc(5) long local5 = (long) this.method360() & 0xFFFFFFFFL;
			@Pc(15) long local15 = (long) this.method360() & 0xFFFFFFFFL;
			return (local5 << 32) + local15;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("81816, " + true + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "i", descriptor = "()Ljava/lang/String;")
	public String method362() {
		@Pc(2) int local2 = this.anInt506;
		while (this.aByteArray10[this.anInt506++] != 10) {
		}
		return new String(this.aByteArray10, local2, this.anInt506 - local2 - 1);
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(B)[B")
	public byte[] method363() {
		try {
			@Pc(9) int local9 = this.anInt506;
			while (this.aByteArray10[this.anInt506++] != 10) {
			}
			@Pc(30) byte[] local30 = new byte[this.anInt506 - local9 - 1];
			for (@Pc(32) int local32 = local9; local32 < this.anInt506 - 1; local32++) {
				local30[local32 - local9] = this.aByteArray10[local32];
			}
			return local30;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("71091, " + 2 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "([BIII)V")
	private void method364(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(10) int local10 = 0; local10 < arg1 + 0; local10++) {
				arg0[local10] = this.aByteArray10[this.anInt506++];
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("26719, " + arg0 + ", " + arg1 + ", " + 0 + ", " + -93 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "b", descriptor = "(Z)V")
	public void method365() {
		try {
			this.anInt507 = this.anInt506 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("53532, " + true + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(IZ)I")
	public int method366(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			if (arg1) {
				return 1;
			}
			@Pc(10) int local10 = this.anInt507 >> 3;
			@Pc(17) int local17 = 8 - (this.anInt507 & 0x7);
			@Pc(19) int local19 = 0;
			this.anInt507 += arg0;
			while (arg0 > local17) {
				local19 += (this.aByteArray10[local10++] & anIntArray99[local17]) << arg0 - local17;
				arg0 -= local17;
				local17 = 8;
			}
			if (arg0 == local17) {
				local19 += this.aByteArray10[local10] & anIntArray99[local17];
			} else {
				local19 += this.aByteArray10[local10] >> local17 - arg0 & anIntArray99[arg0];
			}
			return local19;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("76540, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "c", descriptor = "(Z)V")
	public void method367() {
		try {
			this.anInt506 = (this.anInt507 + 7) / 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("30636, " + true + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "j", descriptor = "()I")
	public int method368() {
		@Pc(7) int local7 = this.aByteArray10[this.anInt506] & 0xFF;
		return local7 < 128 ? this.method355() - 64 : this.method357() - 49152;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "k", descriptor = "()I")
	public int method369() {
		@Pc(7) int local7 = this.aByteArray10[this.anInt506] & 0xFF;
		return local7 < 128 ? this.method355() : this.method357() - 32768;
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method370(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt506;
			this.anInt506 = 0;
			@Pc(17) byte[] local17 = new byte[local2];
			this.method364(local17, local2);
			@Pc(28) BigInteger local28 = new BigInteger(local17);
			@Pc(33) BigInteger local33 = local28.modPow(arg0, arg1);
			@Pc(36) byte[] local36 = local33.toByteArray();
			this.anInt506 = 0;
			this.method345(local36.length);
			this.method353(local36, local36.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("3444, " + arg0 + ", " + arg1 + ", " + false + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "c", descriptor = "(II)V")
	public void method371(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) (arg0 + 128);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("67995, " + -601 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "b", descriptor = "(IZ)V")
	public void method372(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) -arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("47485, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "d", descriptor = "(Z)I")
	public int method373() {
		try {
			return this.aByteArray10[this.anInt506++] - 128 & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("38410, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "e", descriptor = "(I)I")
	public int method374() {
		try {
			return -this.aByteArray10[this.anInt506++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("19390, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "f", descriptor = "(I)I")
	public int method375() {
		try {
			return 128 - this.aByteArray10[this.anInt506++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("3240, " + 8 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "e", descriptor = "(Z)B")
	public byte method376() {
		try {
			return (byte) (this.aByteArray10[this.anInt506++] - 128);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("39850, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "f", descriptor = "(Z)B")
	public byte method377(@OriginalArg(0) boolean arg0) {
		try {
			if (!arg0) {
				this.anInt498 = -21;
			}
			return (byte) -this.aByteArray10[this.anInt506++];
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("96829, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "d", descriptor = "(II)V")
	public void method378(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) arg0;
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("43213, " + 26889 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "c", descriptor = "(IZ)V")
	public void method379(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 + 128);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("93045, " + arg0 + ", " + true + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(ZI)V")
	public void method380(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) (arg0 + 128);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("10087, " + false + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "g", descriptor = "(I)I")
	public int method381() {
		try {
			this.anInt506 += 2;
			return ((this.aByteArray10[this.anInt506 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 2] & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("81624, " + 895 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "b", descriptor = "(B)I")
	public int method382() {
		try {
			this.anInt506 += 2;
			return ((this.aByteArray10[this.anInt506 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 1] - 128 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("84613, " + -35 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "g", descriptor = "(Z)I")
	public int method383() {
		try {
			this.anInt506 += 2;
			return ((this.aByteArray10[this.anInt506 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 2] - 128 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("84292, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "c", descriptor = "(B)I")
	public int method384() {
		try {
			this.anInt506 += 2;
			@Pc(35) int local35 = ((this.aByteArray10[this.anInt506 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 1] - 128 & 0xFF);
			if (local35 > 32767) {
				local35 -= 65536;
			}
			return local35;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("31313, " + 2 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "d", descriptor = "(B)I")
	public int method385() {
		try {
			this.anInt506 += 2;
			@Pc(29) int local29 = ((this.aByteArray10[this.anInt506 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 2] - 128 & 0xFF);
			if (this.aByte19 != -6) {
				this.anInt501 = -488;
			}
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("51416, " + -6 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(IB)V")
	public void method386(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt506++] = (byte) arg0;
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 24);
			this.aByteArray10[this.anInt506++] = (byte) (arg0 >> 16);
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("44461, " + arg0 + ", " + 40 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "h", descriptor = "(Z)I")
	public int method387() {
		try {
			this.anInt506 += 4;
			return ((this.aByteArray10[this.anInt506 - 3] & 0xFF) << 24) + ((this.aByteArray10[this.anInt506 - 4] & 0xFF) << 16) + ((this.aByteArray10[this.anInt506 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt506 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("70468, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(I[BII)V")
	public void method388(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(14) int local14 = arg1 + 0 - 1; local14 >= 0; local14--) {
				this.aByteArray10[this.anInt506++] = arg0[local14];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("11052, " + 0 + ", " + arg0 + ", " + -969 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(I[BIB)V")
	public void method389(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(16) int local16 = arg1 + 0 - 1; local16 >= 0; local16--) {
				arg0[local16] = this.aByteArray10[this.anInt506++];
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("33089, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 3 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PGNBHFUF", name = "a", descriptor = "(IBI[B)V")
	public void method390(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(11) int local11 = arg0 + 0 - 1; local11 >= 0; local11--) {
				arg1[local11] = (byte) (this.aByteArray10[this.anInt506++] - 128);
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("94894, " + 0 + ", " + 42 + ", " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}
}
