import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MLYYHULT")
public final class Class3_Sub1_Sub2 extends Class3_Sub1 {

	@OriginalMember(owner = "client!MLYYHULT", name = "I", descriptor = "I")
	private static int anInt431;

	@OriginalMember(owner = "client!MLYYHULT", name = "J", descriptor = "I")
	private static int anInt432;

	@OriginalMember(owner = "client!MLYYHULT", name = "K", descriptor = "I")
	private static int anInt433;

	@OriginalMember(owner = "client!MLYYHULT", name = "i", descriptor = "B")
	private static byte aByte12 = -38;

	@OriginalMember(owner = "client!MLYYHULT", name = "B", descriptor = "I")
	private static int anInt428 = -389;

	@OriginalMember(owner = "client!MLYYHULT", name = "F", descriptor = "[I")
	private static int[] anIntArray128 = new int[256];

	@OriginalMember(owner = "client!MLYYHULT", name = "G", descriptor = "[I")
	private static final int[] anIntArray129;

	@OriginalMember(owner = "client!MLYYHULT", name = "L", descriptor = "Lclient!ZWZXPJNQ;")
	private static Class50 aClass50_6;

	@OriginalMember(owner = "client!MLYYHULT", name = "M", descriptor = "Lclient!ZWZXPJNQ;")
	private static Class50 aClass50_7;

	@OriginalMember(owner = "client!MLYYHULT", name = "N", descriptor = "Lclient!ZWZXPJNQ;")
	private static Class50 aClass50_8;

	@OriginalMember(owner = "client!MLYYHULT", name = "O", descriptor = "[C")
	private static char[] aCharArray3;

	@OriginalMember(owner = "client!MLYYHULT", name = "p", descriptor = "I")
	private int anInt423;

	@OriginalMember(owner = "client!MLYYHULT", name = "s", descriptor = "I")
	private int anInt424;

	@OriginalMember(owner = "client!MLYYHULT", name = "C", descriptor = "[B")
	public byte[] aByteArray14;

	@OriginalMember(owner = "client!MLYYHULT", name = "D", descriptor = "I")
	public int anInt429;

	@OriginalMember(owner = "client!MLYYHULT", name = "E", descriptor = "I")
	public int anInt430;

	@OriginalMember(owner = "client!MLYYHULT", name = "H", descriptor = "Lclient!SSCDCBAC;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!MLYYHULT", name = "j", descriptor = "B")
	private byte aByte13 = -38;

	@OriginalMember(owner = "client!MLYYHULT", name = "k", descriptor = "B")
	private byte aByte14 = 119;

	@OriginalMember(owner = "client!MLYYHULT", name = "l", descriptor = "Z")
	private boolean aBoolean107 = true;

	@OriginalMember(owner = "client!MLYYHULT", name = "m", descriptor = "I")
	private int anInt421 = 1;

	@OriginalMember(owner = "client!MLYYHULT", name = "n", descriptor = "Z")
	private boolean aBoolean108 = true;

	@OriginalMember(owner = "client!MLYYHULT", name = "o", descriptor = "I")
	private int anInt422 = 560;

	@OriginalMember(owner = "client!MLYYHULT", name = "q", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!MLYYHULT", name = "r", descriptor = "B")
	private byte aByte15 = -53;

	@OriginalMember(owner = "client!MLYYHULT", name = "t", descriptor = "B")
	private byte aByte16 = 2;

	@OriginalMember(owner = "client!MLYYHULT", name = "u", descriptor = "I")
	private int anInt425 = 5;

	@OriginalMember(owner = "client!MLYYHULT", name = "v", descriptor = "B")
	private byte aByte17 = 4;

	@OriginalMember(owner = "client!MLYYHULT", name = "w", descriptor = "I")
	private int anInt426 = 435;

	@OriginalMember(owner = "client!MLYYHULT", name = "x", descriptor = "Z")
	private boolean aBoolean110 = true;

	@OriginalMember(owner = "client!MLYYHULT", name = "y", descriptor = "I")
	private int anInt427 = 778;

	@OriginalMember(owner = "client!MLYYHULT", name = "z", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!MLYYHULT", name = "A", descriptor = "Z")
	private boolean aBoolean112 = false;

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
			anIntArray128[local8] = local11;
		}
		anIntArray129 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass50_6 = new Class50(708);
		aClass50_7 = new Class50(708);
		aClass50_8 = new Class50(708);
		aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(II)Lclient!MLYYHULT;")
	public static Class3_Sub1_Sub2 method188() {
		try {
			@Pc(3) Class50 local3 = aClass50_7;
			synchronized (aClass50_7) {
				@Pc(7) Class3_Sub1_Sub2 local7 = null;
				if (anInt432 > 0) {
					anInt432--;
					local7 = (Class3_Sub1_Sub2) aClass50_7.method570();
				}
				if (local7 != null) {
					local7.anInt429 = 0;
					return local7;
				}
			}
			@Pc(69) Class3_Sub1_Sub2 local69 = new Class3_Sub1_Sub2(aByte12);
			local69.anInt429 = 0;
			local69.aByteArray14 = new byte[5000];
			return local69;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("84169, " + 9448 + ", " + 1 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "<init>", descriptor = "(B)V")
	private Class3_Sub1_Sub2(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != this.aByte13) {
				throw new NullPointerException();
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("2988, " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "<init>", descriptor = "(Z[B)V")
	public Class3_Sub1_Sub2(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray14 = arg1;
			this.anInt429 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("24328, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "b", descriptor = "(II)V")
	public void method189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aByteArray14[this.anInt429++] = (byte) (arg0 + this.aClass32_1.method397());
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("25410, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(I)V")
	public void method190(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt429++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "b", descriptor = "(I)V")
	public void method191(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt429++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(BI)V")
	public void method192(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt429++] = (byte) arg0;
			this.aByteArray14[this.anInt429++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("73822, " + 7 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "c", descriptor = "(I)V")
	public void method193(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt429++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "d", descriptor = "(I)V")
	public void method194(@OriginalArg(0) int arg0) {
		this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 24);
		this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 16);
		this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 8);
		this.aByteArray14[this.anInt429++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(IB)V")
	public void method195(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray14[this.anInt429++] = (byte) arg0;
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 8);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 16);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("8828, " + arg0 + ", " + 2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(JB)V")
	public void method196(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != 45) {
				this.aBoolean111 = !this.aBoolean111;
			}
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 56);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 48);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 40);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 32);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 24);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 16);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 8);
			this.aByteArray14[this.anInt429++] = (byte) arg0;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("51049, " + arg0 + ", " + arg1 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method197(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray14, this.anInt429);
		this.anInt429 += arg0.length();
		this.aByteArray14[this.anInt429++] = 10;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(II[BI)V")
	public void method198(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray14[this.anInt429++] = arg0[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("92294, " + 399 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "c", descriptor = "(II)V")
	public void method199(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray14[this.anInt429 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("46663, " + arg0 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "c", descriptor = "()I")
	public int method200() {
		return this.aByteArray14[this.anInt429++] & 0xFF;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "d", descriptor = "()B")
	public byte method201() {
		return this.aByteArray14[this.anInt429++];
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "e", descriptor = "()I")
	public int method202() {
		this.anInt429 += 2;
		return ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "f", descriptor = "()I")
	public int method203() {
		this.anInt429 += 2;
		@Pc(27) int local27 = ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "g", descriptor = "()I")
	public int method204() {
		this.anInt429 += 3;
		return ((this.aByteArray14[this.anInt429 - 3] & 0xFF) << 16) + ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "h", descriptor = "()I")
	public int method205() {
		this.anInt429 += 4;
		return ((this.aByteArray14[this.anInt429 - 4] & 0xFF) << 24) + ((this.aByteArray14[this.anInt429 - 3] & 0xFF) << 16) + ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(B)J")
	public long method206(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			@Pc(16) long local16 = (long) this.method205() & 0xFFFFFFFFL;
			@Pc(22) long local22 = (long) this.method205() & 0xFFFFFFFFL;
			return (local16 << 32) + local22;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("41411, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "i", descriptor = "()Ljava/lang/String;")
	public String method207() {
		@Pc(2) int local2 = this.anInt429;
		while (this.aByteArray14[this.anInt429++] != 10) {
		}
		return new String(this.aByteArray14, local2, this.anInt429 - local2 - 1);
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "e", descriptor = "(I)[B")
	public byte[] method208() {
		try {
			@Pc(8) int local8 = this.anInt429;
			while (this.aByteArray14[this.anInt429++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt429 - local8 - 1];
			for (@Pc(31) int local31 = local8; local31 < this.anInt429 - 1; local31++) {
				local29[local31 - local8] = this.aByteArray14[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("70914, " + 337 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(II[BB)V")
	public void method209(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			if (this.aByte14 != 119) {
				this.aBoolean111 = !this.aBoolean111;
			}
			for (@Pc(13) int local13 = 0; local13 < arg0 + 0; local13++) {
				arg1[local13] = this.aByteArray14[this.anInt429++];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("43092, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 119 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "f", descriptor = "(I)V")
	public void method210() {
		try {
			this.anInt430 = this.anInt429 * 8;
		} catch (@Pc(9) RuntimeException local9) {
			signlink.reporterror("50383, " + 0 + ", " + local9.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "d", descriptor = "(II)I")
	public int method211(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt430 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt430 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt430 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray14[local6++] & anIntArray129[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray14[local6] & anIntArray129[local13];
			} else {
				local15 += this.aByteArray14[local6] >> local13 - arg0 & anIntArray129[arg0];
			}
			return local15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("85793, " + arg0 + ", " + 84 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "b", descriptor = "(B)V")
	public void method212() {
		try {
			this.anInt429 = (this.anInt430 + 7) / 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("93392, " + -108 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "j", descriptor = "()I")
	public int method213() {
		@Pc(7) int local7 = this.aByteArray14[this.anInt429] & 0xFF;
		return local7 < 128 ? this.method200() - 64 : this.method202() - 49152;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "k", descriptor = "()I")
	public int method214() {
		@Pc(7) int local7 = this.aByteArray14[this.anInt429] & 0xFF;
		return local7 < 128 ? this.method200() : this.method202() - 32768;
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method215(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt429;
			this.anInt429 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method209(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt429 = 0;
			this.method190(local27.length);
			this.method198(local27, local27.length);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("76991, " + 3 + ", " + arg0 + ", " + arg1 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(ZI)V")
	public void method216(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt429++] = (byte) (arg0 + 128);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("47309, " + false + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "e", descriptor = "(II)V")
	public void method217(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt429++] = (byte) -arg0;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("21399, " + 2 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "f", descriptor = "(II)V")
	public void method218(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt429++] = (byte) (128 - arg0);
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("62965, " + -746 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "g", descriptor = "(I)I")
	public int method219() {
		try {
			return this.aByteArray14[this.anInt429++] - 128 & 0xFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("39696, " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "h", descriptor = "(I)I")
	public int method220() {
		try {
			return -this.aByteArray14[this.anInt429++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("5455, " + 5715 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(Z)I")
	public int method221() {
		try {
			return 128 - this.aByteArray14[this.anInt429++] & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("16376, " + false + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "c", descriptor = "(B)B")
	public byte method222() {
		try {
			if (this.aByte15 != -53) {
				throw new NullPointerException();
			}
			return (byte) (this.aByteArray14[this.anInt429++] - 128);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("82919, " + -53 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "b", descriptor = "(Z)B")
	public byte method223() {
		try {
			return (byte) -this.aByteArray14[this.anInt429++];
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("36760, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "c", descriptor = "(Z)B")
	public byte method224() {
		try {
			return (byte) (128 - this.aByteArray14[this.anInt429++]);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("86055, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "b", descriptor = "(IB)V")
	public void method225(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray14[this.anInt429++] = (byte) arg0;
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("43167, " + arg0 + ", " + 1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "g", descriptor = "(II)V")
	public void method226(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 8);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 + 128);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("35164, " + arg0 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "b", descriptor = "(BI)V")
	public void method227(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray14[this.anInt429++] = (byte) (arg0 + 128);
			this.aByteArray14[this.anInt429++] = (byte) (arg0 >> 8);
			if (this.aByte16 != 2) {
				this.anInt423 = -169;
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("26091, " + 2 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "i", descriptor = "(I)I")
	public int method228() {
		try {
			this.anInt429 += 2;
			return ((this.aByteArray14[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("72529, " + -178 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "j", descriptor = "(I)I")
	public int method229() {
		try {
			this.anInt429 += 2;
			return ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 1] - 128 & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("4134, " + 584 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "k", descriptor = "(I)I")
	public int method230(@OriginalArg(0) int arg0) {
		try {
			this.anInt429 += 2;
			return arg0 < 0 ? ((this.aByteArray14[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 2] - 128 & 0xFF) : 3;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("21662, " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "l", descriptor = "(I)I")
	public int method231() {
		try {
			this.anInt429 += 2;
			@Pc(33) int local33 = ((this.aByteArray14[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 2] & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("93385, " + -957 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "d", descriptor = "(B)I")
	public int method232() {
		try {
			this.anInt429 += 2;
			@Pc(35) int local35 = ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 1] - 128 & 0xFF);
			if (local35 > 32767) {
				local35 -= 65536;
			}
			return local35;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("5436, " + -95 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "m", descriptor = "(I)I")
	public int method233() {
		try {
			this.anInt429 += 2;
			@Pc(34) int local34 = ((this.aByteArray14[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 2] - 128 & 0xFF);
			if (local34 > 32767) {
				local34 -= 65536;
			}
			return local34;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("77936, " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "n", descriptor = "(I)I")
	public int method234() {
		try {
			this.anInt429 += 3;
			return ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 16) + ((this.aByteArray14[this.anInt429 - 3] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 1] & 0xFF);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("59616, " + 42287 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "o", descriptor = "(I)I")
	public int method235() {
		try {
			this.anInt429 += 4;
			return ((this.aByteArray14[this.anInt429 - 1] & 0xFF) << 24) + ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 16) + ((this.aByteArray14[this.anInt429 - 3] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 4] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("18456, " + -32869 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "p", descriptor = "(I)I")
	public int method236() {
		try {
			this.anInt429 += 4;
			return ((this.aByteArray14[this.anInt429 - 2] & 0xFF) << 24) + ((this.aByteArray14[this.anInt429 - 1] & 0xFF) << 16) + ((this.aByteArray14[this.anInt429 - 4] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 3] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("31002, " + 891 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "d", descriptor = "(Z)I")
	public int method237() {
		try {
			this.anInt429 += 4;
			return ((this.aByteArray14[this.anInt429 - 3] & 0xFF) << 24) + ((this.aByteArray14[this.anInt429 - 4] & 0xFF) << 16) + ((this.aByteArray14[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray14[this.anInt429 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("91703, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "([BIII)V")
	public void method238(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray14[this.anInt429++] = (byte) (arg0[local5] + 128);
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("95969, " + arg0 + ", " + 4 + ", " + 0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MLYYHULT", name = "a", descriptor = "(IB[BI)V")
	public void method239(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(16) int local16 = arg1 + 0 - 1; local16 >= 0; local16--) {
				arg0[local16] = (byte) (this.aByteArray14[this.anInt429++] - 128);
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("64168, " + 0 + ", " + -35 + ", " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}
}
