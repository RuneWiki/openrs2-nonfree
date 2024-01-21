import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!EMWAMCXW")
public final class Class2_Sub1_Sub3 extends Class2_Sub1 {

	@OriginalMember(owner = "client!EMWAMCXW", name = "C", descriptor = "I")
	private static int anInt138;

	@OriginalMember(owner = "client!EMWAMCXW", name = "D", descriptor = "I")
	private static int anInt139;

	@OriginalMember(owner = "client!EMWAMCXW", name = "E", descriptor = "I")
	private static int anInt140;

	@OriginalMember(owner = "client!EMWAMCXW", name = "z", descriptor = "[I")
	private static int[] anIntArray16 = new int[256];

	@OriginalMember(owner = "client!EMWAMCXW", name = "A", descriptor = "[I")
	private static final int[] anIntArray17;

	@OriginalMember(owner = "client!EMWAMCXW", name = "F", descriptor = "Lclient!WTGHTNMN;")
	private static Class41 aClass41_1;

	@OriginalMember(owner = "client!EMWAMCXW", name = "G", descriptor = "Lclient!WTGHTNMN;")
	private static Class41 aClass41_2;

	@OriginalMember(owner = "client!EMWAMCXW", name = "H", descriptor = "Lclient!WTGHTNMN;")
	private static Class41 aClass41_3;

	@OriginalMember(owner = "client!EMWAMCXW", name = "I", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!EMWAMCXW", name = "p", descriptor = "I")
	private int anInt134;

	@OriginalMember(owner = "client!EMWAMCXW", name = "w", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!EMWAMCXW", name = "x", descriptor = "I")
	public int anInt136;

	@OriginalMember(owner = "client!EMWAMCXW", name = "y", descriptor = "I")
	public int anInt137;

	@OriginalMember(owner = "client!EMWAMCXW", name = "B", descriptor = "Lclient!YJYHBEIS;")
	public Class44 aClass44_1;

	@OriginalMember(owner = "client!EMWAMCXW", name = "j", descriptor = "Z")
	private boolean aBoolean59 = false;

	@OriginalMember(owner = "client!EMWAMCXW", name = "k", descriptor = "B")
	private byte aByte9 = 119;

	@OriginalMember(owner = "client!EMWAMCXW", name = "l", descriptor = "Z")
	private boolean aBoolean60 = true;

	@OriginalMember(owner = "client!EMWAMCXW", name = "m", descriptor = "I")
	private int anInt132 = 7;

	@OriginalMember(owner = "client!EMWAMCXW", name = "n", descriptor = "I")
	private int anInt133 = 12497;

	@OriginalMember(owner = "client!EMWAMCXW", name = "o", descriptor = "Z")
	private boolean aBoolean61 = false;

	@OriginalMember(owner = "client!EMWAMCXW", name = "q", descriptor = "I")
	private int anInt135 = -899;

	@OriginalMember(owner = "client!EMWAMCXW", name = "r", descriptor = "Z")
	private boolean aBoolean62 = false;

	@OriginalMember(owner = "client!EMWAMCXW", name = "s", descriptor = "Z")
	private boolean aBoolean63 = false;

	@OriginalMember(owner = "client!EMWAMCXW", name = "t", descriptor = "Z")
	private boolean aBoolean64 = true;

	@OriginalMember(owner = "client!EMWAMCXW", name = "u", descriptor = "Z")
	private boolean aBoolean65 = true;

	@OriginalMember(owner = "client!EMWAMCXW", name = "v", descriptor = "Z")
	private boolean aBoolean66 = false;

	static {
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(7) int local7 = local4;
			for (@Pc(9) int local9 = 0; local9 < 8; local9++) {
				if ((local7 & 0x1) == 1) {
					local7 = local7 >>> 1 ^ 0xEDB88320;
				} else {
					local7 >>>= 0x1;
				}
			}
			anIntArray16[local4] = local7;
		}
		anIntArray17 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass41_1 = new Class41(36113);
		aClass41_2 = new Class41(36113);
		aClass41_3 = new Class41(36113);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(IB)Lclient!EMWAMCXW;")
	public static Class2_Sub1_Sub3 method85() {
		try {
			@Pc(3) Class41 local3 = aClass41_2;
			synchronized (aClass41_2) {
				@Pc(7) Class2_Sub1_Sub3 local7 = null;
				if (anInt139 > 0) {
					anInt139--;
					local7 = (Class2_Sub1_Sub3) aClass41_2.method413();
				}
				if (local7 != null) {
					local7.anInt136 = 0;
					return local7;
				}
			}
			@Pc(69) Class2_Sub1_Sub3 local69 = new Class2_Sub1_Sub3(1);
			local69.anInt136 = 0;
			local69.aByteArray10 = new byte[5000];
			return local69;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("11898, " + 1 + ", " + -102 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "<init>", descriptor = "([BZ)V")
	public Class2_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray10 = arg0;
			this.anInt136 = 0;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("55751, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(II)V")
	public void method86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) (arg0 + this.aClass44_1.method459());
			@Pc(19) boolean local19 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("49913, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(I)V")
	public void method87(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt136++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(I)V")
	public void method88(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt136++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(II)V")
	public void method89(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) arg0;
			this.aByteArray10[this.anInt136++] = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("12002, " + arg0 + ", " + 1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "(I)V")
	public void method90(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 16);
		this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt136++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "(I)V")
	public void method91(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 24);
		this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 16);
		this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt136++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "(II)V")
	public void method92(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) arg0;
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("22755, " + 679 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(JZ)V")
	public void method93(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 56);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 48);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 40);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 32);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 24);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt136++] = (byte) arg0;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("4536, " + arg0 + ", " + false + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method94(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray10, this.anInt136);
		this.anInt136 += arg0.length();
		this.aByteArray10[this.anInt136++] = 10;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "([BBII)V")
	public void method95(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1 + 0; local12++) {
				this.aByteArray10[this.anInt136++] = arg0[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("12731, " + arg0 + ", " + -18 + ", " + arg1 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(ZI)V")
	public void method96(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt136 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("44590, " + false + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "()I")
	public int method97() {
		return this.aByteArray10[this.anInt136++] & 0xFF;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "()B")
	public byte method98() {
		return this.aByteArray10[this.anInt136++];
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "e", descriptor = "()I")
	public int method99() {
		this.anInt136 += 2;
		return ((this.aByteArray10[this.anInt136 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "f", descriptor = "()I")
	public int method100() {
		this.anInt136 += 2;
		@Pc(27) int local27 = ((this.aByteArray10[this.anInt136 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "g", descriptor = "()I")
	public int method101() {
		this.anInt136 += 3;
		return ((this.aByteArray10[this.anInt136 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt136 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "h", descriptor = "()I")
	public int method102() {
		this.anInt136 += 4;
		return ((this.aByteArray10[this.anInt136 - 4] & 0xFF) << 24) + ((this.aByteArray10[this.anInt136 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt136 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "e", descriptor = "(I)J")
	public long method103() {
		try {
			@Pc(14) long local14 = (long) this.method102() & 0xFFFFFFFFL;
			@Pc(20) long local20 = (long) this.method102() & 0xFFFFFFFFL;
			return (local14 << 32) + local20;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("17125, " + 3 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "i", descriptor = "()Ljava/lang/String;")
	public String method104() {
		@Pc(2) int local2 = this.anInt136;
		while (this.aByteArray10[this.anInt136++] != 10) {
		}
		return new String(this.aByteArray10, local2, this.anInt136 - local2 - 1);
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "f", descriptor = "(I)[B")
	public byte[] method105() {
		try {
			@Pc(16) int local16 = this.anInt136;
			while (this.aByteArray10[this.anInt136++] != 10) {
			}
			@Pc(37) byte[] local37 = new byte[this.anInt136 - local16 - 1];
			for (@Pc(39) int local39 = local16; local39 < this.anInt136 - 1; local39++) {
				local37[local39 - local16] = this.aByteArray10[local39];
			}
			return local37;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("4363, " + -485 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "([BIII)V")
	public void method106(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				arg0[local4] = this.aByteArray10[this.anInt136++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("10788, " + arg0 + ", " + 0 + ", " + 0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(B)V")
	public void method107() {
		try {
			this.anInt137 = this.anInt136 * 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("48068, " + 31 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "(II)I")
	public int method108(@OriginalArg(0) int arg0) {
		try {
			@Pc(15) int local15 = this.anInt137 >> 3;
			@Pc(22) int local22 = 8 - (this.anInt137 & 0x7);
			@Pc(24) int local24 = 0;
			this.anInt137 += arg0;
			while (arg0 > local22) {
				local24 += (this.aByteArray10[local15++] & anIntArray17[local22]) << arg0 - local22;
				arg0 -= local22;
				local22 = 8;
			}
			if (arg0 == local22) {
				local24 += this.aByteArray10[local15] & anIntArray17[local22];
			} else {
				local24 += this.aByteArray10[local15] >> local22 - arg0 & anIntArray17[arg0];
			}
			return local24;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("60808, " + arg0 + ", " + 4 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(B)V")
	public void method109() {
		try {
			this.anInt136 = (this.anInt137 + 7) / 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("16165, " + 92 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "j", descriptor = "()I")
	public int method110() {
		@Pc(7) int local7 = this.aByteArray10[this.anInt136] & 0xFF;
		return local7 < 128 ? this.method97() - 64 : this.method99() - 49152;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "k", descriptor = "()I")
	public int method111() {
		@Pc(7) int local7 = this.aByteArray10[this.anInt136] & 0xFF;
		return local7 < 128 ? this.method97() : this.method99() - 32768;
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method112(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt136;
			this.anInt136 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method106(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt136 = 0;
			this.method87(local27.length);
			this.method95(local27, local27.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("87710, " + false + ", " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "e", descriptor = "(II)V")
	public void method113(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) (arg0 + 128);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("88391, " + -265 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(IZ)V")
	public void method114(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) -arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("10153, " + arg0 + ", " + true + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "f", descriptor = "(II)V")
	public void method115(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) (128 - arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("33972, " + 0 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "g", descriptor = "(I)I")
	public int method116() {
		try {
			return this.aByteArray10[this.anInt136++] - 128 & 0xFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("51356, " + 29396 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(Z)I")
	public int method117() {
		try {
			return -this.aByteArray10[this.anInt136++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("66935, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "(B)I")
	public int method118() {
		try {
			return 128 - this.aByteArray10[this.anInt136++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("47766, " + 93 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "h", descriptor = "(I)B")
	public byte method119(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 7085) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return (byte) (this.aByteArray10[this.anInt136++] - 128);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("16587, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(Z)B")
	public byte method120() {
		try {
			return (byte) -this.aByteArray10[this.anInt136++];
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("70315, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "i", descriptor = "(I)B")
	public byte method121() {
		try {
			return (byte) (128 - this.aByteArray10[this.anInt136++]);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("3251, " + -367 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "g", descriptor = "(II)V")
	public void method122(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) arg0;
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("50534, " + arg0 + ", " + 28989 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(BI)V")
	public void method123(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 + 128);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("35179, " + 15 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "b", descriptor = "(ZI)V")
	public void method124(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) (arg0 + 128);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("92464, " + true + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "j", descriptor = "(I)I")
	public int method125() {
		try {
			this.anInt136 += 2;
			return ((this.aByteArray10[this.anInt136 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 2] & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("55616, " + -485 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "k", descriptor = "(I)I")
	public int method126() {
		try {
			this.anInt136 += 2;
			return ((this.aByteArray10[this.anInt136 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 1] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("85522, " + 633 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "l", descriptor = "(I)I")
	public int method127() {
		try {
			this.anInt136 += 2;
			return ((this.aByteArray10[this.anInt136 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("83699, " + -110 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "(B)I")
	public int method128() {
		try {
			this.anInt136 += 2;
			@Pc(27) int local27 = ((this.aByteArray10[this.anInt136 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("37113, " + 93 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "m", descriptor = "(I)I")
	public int method129(@OriginalArg(0) int arg0) {
		try {
			this.anInt136 += 2;
			@Pc(29) int local29 = ((this.aByteArray10[this.anInt136 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 2] - 128 & 0xFF);
			@Pc(33) int local33 = 0 / arg0;
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("71818, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "e", descriptor = "(B)I")
	public int method130(@OriginalArg(0) byte arg0) {
		try {
			this.anInt136 += 3;
			@Pc(10) boolean local10 = false;
			return ((this.aByteArray10[this.anInt136 - 1] & 0xFF) << 16) + ((this.aByteArray10[this.anInt136 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 3] & 0xFF);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("67898, " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "h", descriptor = "(II)V")
	public void method131(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt136++] = (byte) arg0;
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 24);
			this.aByteArray10[this.anInt136++] = (byte) (arg0 >> 16);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("34428, " + 0 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "c", descriptor = "(Z)I")
	public int method132() {
		try {
			this.anInt136 += 4;
			return ((this.aByteArray10[this.anInt136 - 2] & 0xFF) << 24) + ((this.aByteArray10[this.anInt136 - 1] & 0xFF) << 16) + ((this.aByteArray10[this.anInt136 - 4] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 3] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("58977, " + false + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "d", descriptor = "(Z)I")
	public int method133() {
		try {
			this.anInt136 += 4;
			return ((this.aByteArray10[this.anInt136 - 3] & 0xFF) << 24) + ((this.aByteArray10[this.anInt136 - 4] & 0xFF) << 16) + ((this.aByteArray10[this.anInt136 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt136 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("23234, " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(IB[BI)V")
	public void method134(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(9) int local9 = arg1 + 0 - 1; local9 >= 0; local9--) {
				this.aByteArray10[this.anInt136++] = arg0[local9];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("66189, " + 0 + ", " + 8 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!EMWAMCXW", name = "a", descriptor = "(I[BII)V")
	public void method135(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				arg0[local5] = (byte) (this.aByteArray10[this.anInt136++] - 128);
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("34142, " + 0 + ", " + arg0 + ", " + arg1 + ", " + -18210 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
