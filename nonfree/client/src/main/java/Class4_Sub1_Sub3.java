import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EGCCHUZS")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!EGCCHUZS", name = "G", descriptor = "I")
	private static int anInt244;

	@OriginalMember(owner = "client!EGCCHUZS", name = "H", descriptor = "I")
	private static int anInt245;

	@OriginalMember(owner = "client!EGCCHUZS", name = "I", descriptor = "I")
	private static int anInt246;

	@OriginalMember(owner = "client!EGCCHUZS", name = "z", descriptor = "I")
	private static int anInt241 = 890;

	@OriginalMember(owner = "client!EGCCHUZS", name = "D", descriptor = "[I")
	private static int[] anIntArray32 = new int[256];

	@OriginalMember(owner = "client!EGCCHUZS", name = "E", descriptor = "[I")
	private static final int[] anIntArray33;

	@OriginalMember(owner = "client!EGCCHUZS", name = "J", descriptor = "Lclient!JQSVNFRT;")
	private static Class23 aClass23_6;

	@OriginalMember(owner = "client!EGCCHUZS", name = "K", descriptor = "Lclient!JQSVNFRT;")
	private static Class23 aClass23_7;

	@OriginalMember(owner = "client!EGCCHUZS", name = "L", descriptor = "Lclient!JQSVNFRT;")
	private static Class23 aClass23_8;

	@OriginalMember(owner = "client!EGCCHUZS", name = "M", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!EGCCHUZS", name = "s", descriptor = "I")
	private int anInt238;

	@OriginalMember(owner = "client!EGCCHUZS", name = "A", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!EGCCHUZS", name = "B", descriptor = "I")
	public int anInt242;

	@OriginalMember(owner = "client!EGCCHUZS", name = "C", descriptor = "I")
	public int anInt243;

	@OriginalMember(owner = "client!EGCCHUZS", name = "F", descriptor = "Lclient!QHNACLRF;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!EGCCHUZS", name = "i", descriptor = "I")
	private int anInt231 = 1;

	@OriginalMember(owner = "client!EGCCHUZS", name = "j", descriptor = "I")
	private int anInt232 = -380;

	@OriginalMember(owner = "client!EGCCHUZS", name = "k", descriptor = "I")
	private int anInt233 = -40923;

	@OriginalMember(owner = "client!EGCCHUZS", name = "l", descriptor = "B")
	private byte aByte8 = -2;

	@OriginalMember(owner = "client!EGCCHUZS", name = "m", descriptor = "I")
	private int anInt234 = 393;

	@OriginalMember(owner = "client!EGCCHUZS", name = "n", descriptor = "I")
	private int anInt235 = -361;

	@OriginalMember(owner = "client!EGCCHUZS", name = "o", descriptor = "Z")
	private boolean aBoolean58 = false;

	@OriginalMember(owner = "client!EGCCHUZS", name = "p", descriptor = "I")
	private int anInt236 = -549;

	@OriginalMember(owner = "client!EGCCHUZS", name = "q", descriptor = "B")
	private byte aByte9 = -105;

	@OriginalMember(owner = "client!EGCCHUZS", name = "r", descriptor = "I")
	private int anInt237 = -48141;

	@OriginalMember(owner = "client!EGCCHUZS", name = "t", descriptor = "I")
	private int anInt239 = 37931;

	@OriginalMember(owner = "client!EGCCHUZS", name = "u", descriptor = "Z")
	private boolean aBoolean59 = true;

	@OriginalMember(owner = "client!EGCCHUZS", name = "v", descriptor = "Z")
	private boolean aBoolean60 = false;

	@OriginalMember(owner = "client!EGCCHUZS", name = "w", descriptor = "Z")
	private boolean aBoolean61 = true;

	@OriginalMember(owner = "client!EGCCHUZS", name = "x", descriptor = "Z")
	private boolean aBoolean62 = true;

	@OriginalMember(owner = "client!EGCCHUZS", name = "y", descriptor = "I")
	private int anInt240 = 202;

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
			anIntArray32[local6] = local9;
		}
		anIntArray33 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass23_6 = new Class23(0);
		aClass23_7 = new Class23(0);
		aClass23_8 = new Class23(0);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(II)Lclient!EGCCHUZS;")
	public static Class4_Sub1_Sub3 method155() {
		try {
			@Pc(3) Class23 local3 = aClass23_7;
			synchronized (aClass23_7) {
				@Pc(7) Class4_Sub1_Sub3 local7 = null;
				if (anInt245 > 0) {
					anInt245--;
					local7 = (Class4_Sub1_Sub3) aClass23_7.method314();
				}
				if (local7 != null) {
					local7.anInt242 = 0;
					return local7;
				}
			}
			@Pc(69) Class4_Sub1_Sub3 local69 = new Class4_Sub1_Sub3(433);
			local69.anInt242 = 0;
			local69.aByteArray7 = new byte[5000];
			return local69;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("18975, " + 2 + ", " + 1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "<init>", descriptor = "(I)V")
	private Class4_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "<init>", descriptor = "([BZ)V")
	public Class4_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray7 = arg0;
			this.anInt242 = 0;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("12302, " + arg0 + ", " + arg1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "b", descriptor = "(II)V")
	public void method156(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt242++] = (byte) (arg0 + this.aClass37_1.method477());
			if (this.anInt231 > 1 || this.anInt231 < 1) {
				this.aBoolean62 = !this.aBoolean62;
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("87224, " + 1 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(I)V")
	public void method157(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt242++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "b", descriptor = "(I)V")
	public void method158(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt242++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(IB)V")
	public void method159(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt242++] = (byte) arg0;
			this.aByteArray7[this.anInt242++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("86925, " + arg0 + ", " + 5 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "c", descriptor = "(I)V")
	public void method160(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt242++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "d", descriptor = "(I)V")
	public void method161(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt242++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "c", descriptor = "(II)V")
	public void method162(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt242++] = (byte) arg0;
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 24);
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("93753, " + -25153 + ", " + arg0 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(IJ)V")
	public void method163(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 56);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 48);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 40);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 32);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 24);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt242++] = (byte) arg0;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("90309, " + 0 + ", " + arg0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method164(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray7, this.anInt242);
		this.anInt242 += arg0.length();
		this.aByteArray7[this.anInt242++] = 10;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "([BIIZ)V")
	public void method165(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1 + 0; local12++) {
				this.aByteArray7[this.anInt242++] = arg0[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("43311, " + arg0 + ", " + 0 + ", " + arg1 + ", " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "d", descriptor = "(II)V")
	public void method166(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt242 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("22653, " + -380 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "c", descriptor = "()I")
	public int method167() {
		return this.aByteArray7[this.anInt242++] & 0xFF;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "d", descriptor = "()B")
	public byte method168() {
		return this.aByteArray7[this.anInt242++];
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "e", descriptor = "()I")
	public int method169() {
		this.anInt242 += 2;
		return ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "f", descriptor = "()I")
	public int method170() {
		this.anInt242 += 2;
		@Pc(27) int local27 = ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "g", descriptor = "()I")
	public int method171() {
		this.anInt242 += 3;
		return ((this.aByteArray7[this.anInt242 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "h", descriptor = "()I")
	public int method172() {
		this.anInt242 += 4;
		return ((this.aByteArray7[this.anInt242 - 4] & 0xFF) << 24) + ((this.aByteArray7[this.anInt242 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(Z)J")
	public long method173() {
		try {
			@Pc(15) long local15 = (long) this.method172() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method172() & 0xFFFFFFFFL;
			return (local15 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("92981, " + false + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "i", descriptor = "()Ljava/lang/String;")
	public String method174() {
		@Pc(2) int local2 = this.anInt242;
		while (this.aByteArray7[this.anInt242++] != 10) {
		}
		return new String(this.aByteArray7, local2, this.anInt242 - local2 - 1);
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "b", descriptor = "(Z)[B")
	public byte[] method175() {
		try {
			@Pc(2) int local2 = this.anInt242;
			while (this.aByteArray7[this.anInt242++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt242 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt242 - 1; local30++) {
				local23[local30 - local2] = this.aByteArray7[local30];
			}
			return local23;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("45024, " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(II[BI)V")
	public void method176(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				arg1[local5] = this.aByteArray7[this.anInt242++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("81280, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 18677 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "c", descriptor = "(Z)V")
	public void method177() {
		try {
			this.anInt243 = this.anInt242 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("72348, " + false + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "b", descriptor = "(IB)I")
	public int method178(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt243 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt243 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt243 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray7[local6++] & anIntArray33[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray7[local6] & anIntArray33[local13];
			} else {
				local15 += this.aByteArray7[local6] >> local13 - arg0 & anIntArray33[arg0];
			}
			return local15;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("69183, " + arg0 + ", " + 0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(B)V")
	public void method179() {
		try {
			this.anInt242 = (this.anInt243 + 7) / 8;
			if (this.aByte8 == -2) {
				;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("93919, " + -2 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "j", descriptor = "()I")
	public int method180() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt242] & 0xFF;
		return local7 < 128 ? this.method167() - 64 : this.method169() - 49152;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "k", descriptor = "()I")
	public int method181() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt242] & 0xFF;
		return local7 < 128 ? this.method167() : this.method169() - 32768;
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method182(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt242;
			this.anInt242 = 0;
			@Pc(17) byte[] local17 = new byte[local2];
			this.method176(local2, local17);
			@Pc(28) BigInteger local28 = new BigInteger(local17);
			@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
			@Pc(36) byte[] local36 = local33.toByteArray();
			this.anInt242 = 0;
			this.method157(local36.length);
			this.method165(local36, local36.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("55933, " + arg0 + ", " + false + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "c", descriptor = "(IB)V")
	public void method183(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt242++] = (byte) -arg0;
			if (this.aByte9 == -105) {
				;
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("97529, " + arg0 + ", " + -105 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(BI)V")
	public void method184(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 5) {
				this.aBoolean61 = !this.aBoolean61;
			}
			this.aByteArray7[this.anInt242++] = (byte) (128 - arg1);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("49921, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "e", descriptor = "(I)I")
	public int method185() {
		try {
			return this.aByteArray7[this.anInt242++] - 128 & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("75236, " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "d", descriptor = "(Z)I")
	public int method186() {
		try {
			return -this.aByteArray7[this.anInt242++] & 0xFF;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("46068, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "e", descriptor = "(Z)I")
	public int method187() {
		try {
			return 128 - this.aByteArray7[this.anInt242++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("58277, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "b", descriptor = "(B)B")
	public byte method188() {
		try {
			return (byte) -this.aByteArray7[this.anInt242++];
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("20479, " + -95 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "c", descriptor = "(B)B")
	public byte method189() {
		try {
			return (byte) (128 - this.aByteArray7[this.anInt242++]);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("50790, " + 3 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "e", descriptor = "(II)V")
	public void method190(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt242++] = (byte) arg0;
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("156, " + arg0 + ", " + 33414 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(ZI)V")
	public void method191(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 + 128);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("37802, " + true + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "d", descriptor = "(IB)V")
	public void method192(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			@Pc(4) boolean local4 = false;
			this.aByteArray7[this.anInt242++] = (byte) (arg0 + 128);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("41036, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "f", descriptor = "(I)I")
	public int method193() {
		try {
			this.anInt242 += 2;
			return ((this.aByteArray7[this.anInt242 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 2] & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("15603, " + 5 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "g", descriptor = "(I)I")
	public int method194() {
		try {
			this.anInt242 += 2;
			return ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("57031, " + -36835 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "h", descriptor = "(I)I")
	public int method195() {
		try {
			this.anInt242 += 2;
			return ((this.aByteArray7[this.anInt242 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("52344, " + 0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "f", descriptor = "(Z)I")
	public int method196() {
		try {
			this.anInt242 += 2;
			@Pc(31) int local31 = ((this.aByteArray7[this.anInt242 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 2] & 0xFF);
			if (local31 > 32767) {
				local31 -= 65536;
			}
			return local31;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("60284, " + false + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "d", descriptor = "(B)I")
	public int method197() {
		try {
			this.anInt242 += 2;
			@Pc(29) int local29 = ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 1] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("52707, " + 92 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "i", descriptor = "(I)I")
	public int method198() {
		try {
			this.anInt242 += 2;
			@Pc(29) int local29 = ((this.aByteArray7[this.anInt242 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 2] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("15734, " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "j", descriptor = "(I)I")
	public int method199() {
		try {
			this.anInt242 += 3;
			return ((this.aByteArray7[this.anInt242 - 1] & 0xFF) << 16) + ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 3] & 0xFF);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("94780, " + -364 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(IZ)V")
	public void method200(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray7[this.anInt242++] = (byte) arg0;
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 16);
			if (arg1) {
				this.aByteArray7[this.anInt242++] = (byte) (arg0 >> 24);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("3089, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "g", descriptor = "(Z)I")
	public int method201() {
		try {
			this.anInt242 += 4;
			return ((this.aByteArray7[this.anInt242 - 1] & 0xFF) << 24) + ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 16) + ((this.aByteArray7[this.anInt242 - 3] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 4] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("51369, " + false + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "k", descriptor = "(I)I")
	public int method202(@OriginalArg(0) int arg0) {
		try {
			this.anInt242 += 4;
			return arg0 == 0 ? ((this.aByteArray7[this.anInt242 - 2] & 0xFF) << 24) + ((this.aByteArray7[this.anInt242 - 1] & 0xFF) << 16) + ((this.aByteArray7[this.anInt242 - 4] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 3] & 0xFF) : 3;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("30182, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "l", descriptor = "(I)I")
	public int method203() {
		try {
			this.anInt242 += 4;
			return ((this.aByteArray7[this.anInt242 - 3] & 0xFF) << 24) + ((this.aByteArray7[this.anInt242 - 4] & 0xFF) << 16) + ((this.aByteArray7[this.anInt242 - 1] & 0xFF) << 8) + (this.aByteArray7[this.anInt242 - 2] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("76040, " + 0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EGCCHUZS", name = "a", descriptor = "(Z[BII)V")
	public void method204(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(10) int local10 = arg1 + 0 - 1; local10 >= 0; local10--) {
				arg0[local10] = (byte) (this.aByteArray7[this.anInt242++] - 128);
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("1114, " + true + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}
}
