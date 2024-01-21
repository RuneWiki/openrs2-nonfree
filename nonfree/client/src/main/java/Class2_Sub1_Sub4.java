import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RSWRPCHR")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!RSWRPCHR", name = "G", descriptor = "I")
	private static int anInt558;

	@OriginalMember(owner = "client!RSWRPCHR", name = "H", descriptor = "I")
	private static int anInt559;

	@OriginalMember(owner = "client!RSWRPCHR", name = "I", descriptor = "I")
	private static int anInt560;

	@OriginalMember(owner = "client!RSWRPCHR", name = "D", descriptor = "[I")
	private static int[] anIntArray116 = new int[256];

	@OriginalMember(owner = "client!RSWRPCHR", name = "E", descriptor = "[I")
	private static final int[] anIntArray117;

	@OriginalMember(owner = "client!RSWRPCHR", name = "J", descriptor = "Lclient!EZXKBAZY;")
	private static Class12 aClass12_6;

	@OriginalMember(owner = "client!RSWRPCHR", name = "K", descriptor = "Lclient!EZXKBAZY;")
	private static Class12 aClass12_7;

	@OriginalMember(owner = "client!RSWRPCHR", name = "L", descriptor = "Lclient!EZXKBAZY;")
	private static Class12 aClass12_8;

	@OriginalMember(owner = "client!RSWRPCHR", name = "M", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "client!RSWRPCHR", name = "l", descriptor = "I")
	private int anInt546;

	@OriginalMember(owner = "client!RSWRPCHR", name = "w", descriptor = "I")
	private int anInt552;

	@OriginalMember(owner = "client!RSWRPCHR", name = "x", descriptor = "I")
	private int anInt553;

	@OriginalMember(owner = "client!RSWRPCHR", name = "y", descriptor = "I")
	private int anInt554;

	@OriginalMember(owner = "client!RSWRPCHR", name = "A", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!RSWRPCHR", name = "B", descriptor = "I")
	public int anInt556;

	@OriginalMember(owner = "client!RSWRPCHR", name = "C", descriptor = "I")
	public int anInt557;

	@OriginalMember(owner = "client!RSWRPCHR", name = "F", descriptor = "Lclient!NERZSWTZ;")
	public Class25 aClass25_1;

	@OriginalMember(owner = "client!RSWRPCHR", name = "h", descriptor = "Z")
	private boolean aBoolean134 = false;

	@OriginalMember(owner = "client!RSWRPCHR", name = "i", descriptor = "I")
	private int anInt545 = -12199;

	@OriginalMember(owner = "client!RSWRPCHR", name = "j", descriptor = "B")
	private byte aByte16 = -96;

	@OriginalMember(owner = "client!RSWRPCHR", name = "k", descriptor = "Z")
	private boolean aBoolean135 = false;

	@OriginalMember(owner = "client!RSWRPCHR", name = "m", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!RSWRPCHR", name = "n", descriptor = "I")
	private int anInt547 = 1798;

	@OriginalMember(owner = "client!RSWRPCHR", name = "o", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!RSWRPCHR", name = "p", descriptor = "Z")
	private boolean aBoolean138 = true;

	@OriginalMember(owner = "client!RSWRPCHR", name = "q", descriptor = "I")
	private int anInt548 = 804;

	@OriginalMember(owner = "client!RSWRPCHR", name = "r", descriptor = "I")
	private int anInt549 = 65;

	@OriginalMember(owner = "client!RSWRPCHR", name = "s", descriptor = "I")
	private int anInt550 = -227;

	@OriginalMember(owner = "client!RSWRPCHR", name = "t", descriptor = "B")
	private byte aByte17 = 3;

	@OriginalMember(owner = "client!RSWRPCHR", name = "u", descriptor = "I")
	private int anInt551 = 3;

	@OriginalMember(owner = "client!RSWRPCHR", name = "v", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!RSWRPCHR", name = "z", descriptor = "I")
	private int anInt555 = 37900;

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
			anIntArray116[local4] = local7;
		}
		anIntArray117 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass12_6 = new Class12(false);
		aClass12_7 = new Class12(false);
		aClass12_8 = new Class12(false);
		aCharArray4 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(II)Lclient!RSWRPCHR;")
	public static Class2_Sub1_Sub4 method328() {
		try {
			@Pc(3) Class12 local3 = aClass12_7;
			synchronized (aClass12_7) {
				@Pc(7) Class2_Sub1_Sub4 local7 = null;
				if (anInt559 > 0) {
					anInt559--;
					local7 = (Class2_Sub1_Sub4) aClass12_7.method110();
				}
				if (local7 != null) {
					local7.anInt556 = 0;
					return local7;
				}
			}
			@Pc(69) Class2_Sub1_Sub4 local69 = new Class2_Sub1_Sub4(523);
			local69.anInt556 = 0;
			local69.aByteArray17 = new byte[5000];
			return local69;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("72580, " + 1 + ", " + 446 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub4(@OriginalArg(0) int arg0) {
		try {
			@Pc(50) int local50 = 58 / arg0;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("49349, " + arg0 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "<init>", descriptor = "([BI)V")
	public Class2_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17 = arg0;
			this.anInt556 = 0;
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("93649, " + arg0 + ", " + arg1 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(II)V")
	public void method329(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) (arg1 + this.aClass25_1.method255());
			if (arg0 < 8 || arg0 > 8) {
				this.anInt554 = 118;
			}
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("99434, " + arg0 + ", " + arg1 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(I)V")
	public void method330(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt556++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(I)V")
	public void method331(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt556++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "(II)V")
	public void method332(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) arg0;
			this.aByteArray17[this.anInt556++] = 0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("83544, " + -818 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "(I)V")
	public void method333(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt556++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "d", descriptor = "(I)V")
	public void method334(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt556++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "d", descriptor = "(II)V")
	public void method335(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) arg1;
			if (arg0 != 0) {
				for (@Pc(15) int local15 = 1; local15 > 0; local15++) {
				}
			}
			this.aByteArray17[this.anInt556++] = (byte) (arg1 >> 8);
			this.aByteArray17[this.anInt556++] = (byte) (arg1 >> 16);
			this.aByteArray17[this.anInt556++] = (byte) (arg1 >> 24);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("89539, " + arg0 + ", " + arg1 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(JI)V")
	public void method336(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 56);
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 48);
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 40);
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 32);
			if (this.anInt545 == -12199) {
				this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 24);
				this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 16);
				this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 8);
				this.aByteArray17[this.anInt556++] = (byte) arg0;
			}
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("38589, " + arg0 + ", " + -12199 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method337(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray17, this.anInt556);
		this.anInt556 += arg0.length();
		this.aByteArray17[this.anInt556++] = 10;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(I[BBI)V")
	public void method338(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg0 + 0; local7++) {
				this.aByteArray17[this.anInt556++] = arg1[local7];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("71737, " + arg0 + ", " + arg1 + ", " + -83 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(IZ)V")
	public void method339(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt556 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("21640, " + arg0 + ", " + true + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "()I")
	public int method340() {
		return this.aByteArray17[this.anInt556++] & 0xFF;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "d", descriptor = "()B")
	public byte method341() {
		return this.aByteArray17[this.anInt556++];
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "e", descriptor = "()I")
	public int method342() {
		this.anInt556 += 2;
		return ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "f", descriptor = "()I")
	public int method343() {
		this.anInt556 += 2;
		@Pc(27) int local27 = ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "g", descriptor = "()I")
	public int method344() {
		this.anInt556 += 3;
		return ((this.aByteArray17[this.anInt556 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "h", descriptor = "()I")
	public int method345() {
		this.anInt556 += 4;
		return ((this.aByteArray17[this.anInt556 - 4] & 0xFF) << 24) + ((this.aByteArray17[this.anInt556 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(Z)J")
	public long method346() {
		try {
			@Pc(5) long local5 = (long) this.method345() & 0xFFFFFFFFL;
			@Pc(17) long local17 = (long) this.method345() & 0xFFFFFFFFL;
			return (local5 << 32) + local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("32466, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "i", descriptor = "()Ljava/lang/String;")
	public String method347() {
		@Pc(2) int local2 = this.anInt556;
		while (this.aByteArray17[this.anInt556++] != 10) {
		}
		return new String(this.aByteArray17, local2, this.anInt556 - local2 - 1);
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(Z)[B")
	public byte[] method348(@OriginalArg(0) boolean arg0) {
		try {
			@Pc(2) int local2 = this.anInt556;
			if (!arg0) {
				this.anInt555 = -425;
			}
			while (this.aByteArray17[this.anInt556++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt556 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt556 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray17[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("75824, " + arg0 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(Z[BII)V")
	public void method349(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				arg0[local4] = this.aByteArray17[this.anInt556++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("20367, " + true + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "e", descriptor = "(I)V")
	public void method350() {
		try {
			this.anInt557 = this.anInt556 * 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("12734, " + -313 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "e", descriptor = "(II)I")
	public int method351(@OriginalArg(1) int arg0) {
		try {
			@Pc(15) int local15 = this.anInt557 >> 3;
			@Pc(22) int local22 = 8 - (this.anInt557 & 0x7);
			@Pc(24) int local24 = 0;
			this.anInt557 += arg0;
			while (arg0 > local22) {
				local24 += (this.aByteArray17[local15++] & anIntArray117[local22]) << arg0 - local22;
				arg0 -= local22;
				local22 = 8;
			}
			if (arg0 == local22) {
				local24 += this.aByteArray17[local15] & anIntArray117[local22];
			} else {
				local24 += this.aByteArray17[local15] >> local22 - arg0 & anIntArray117[arg0];
			}
			return local24;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("70506, " + 0 + ", " + arg0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(B)V")
	public void method352() {
		try {
			this.anInt556 = (this.anInt557 + 7) / 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("40179, " + -67 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "j", descriptor = "()I")
	public int method353() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt556] & 0xFF;
		return local7 < 128 ? this.method340() - 64 : this.method342() - 49152;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "k", descriptor = "()I")
	public int method354() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt556] & 0xFF;
		return local7 < 128 ? this.method340() : this.method342() - 32768;
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method355(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt556;
			this.anInt556 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method349(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt556 = 0;
			this.method330(local27.length);
			this.method338(local27.length, local27);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("8721, " + arg0 + ", " + 0 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(IZ)V")
	public void method356(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) (arg0 + 128);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("52570, " + arg0 + ", " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "f", descriptor = "(II)V")
	public void method357(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) (128 - arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("13436, " + arg0 + ", " + 574 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "f", descriptor = "(I)I")
	public int method358() {
		try {
			return this.aByteArray17[this.anInt556++] - 128 & 0xFF;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("22172, " + 41312 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "g", descriptor = "(I)I")
	public int method359() {
		try {
			return -this.aByteArray17[this.anInt556++] & 0xFF;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("75745, " + 804 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "h", descriptor = "(I)I")
	public int method360(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return 128 - this.aByteArray17[this.anInt556++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("36997, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "i", descriptor = "(I)B")
	public byte method361() {
		try {
			return (byte) (this.aByteArray17[this.anInt556++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("95453, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "j", descriptor = "(I)B")
	public byte method362() {
		try {
			return (byte) -this.aByteArray17[this.anInt556++];
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("90229, " + -298 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "g", descriptor = "(II)V")
	public void method363(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) arg0;
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("97754, " + arg0 + ", " + 138 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "h", descriptor = "(II)V")
	public void method364(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt556++] = (byte) (arg0 + 128);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("51593, " + 628 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(ZI)V")
	public void method365(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) (arg1 + 128);
			if (!arg0) {
				this.aByteArray17[this.anInt556++] = (byte) (arg1 >> 8);
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("39350, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "k", descriptor = "(I)I")
	public int method366() {
		try {
			this.anInt556 += 2;
			return ((this.aByteArray17[this.anInt556 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 2] & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("13559, " + 6 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "l", descriptor = "(I)I")
	public int method367(@OriginalArg(0) int arg0) {
		try {
			this.anInt556 += 2;
			@Pc(9) boolean local9 = false;
			return ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 1] - 128 & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("67760, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "m", descriptor = "(I)I")
	public int method368() {
		try {
			this.anInt556 += 2;
			return ((this.aByteArray17[this.anInt556 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 2] - 128 & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("47240, " + -998 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "n", descriptor = "(I)I")
	public int method369() {
		try {
			this.anInt556 += 2;
			@Pc(27) int local27 = ((this.aByteArray17[this.anInt556 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("68154, " + -112 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "o", descriptor = "(I)I")
	public int method370(@OriginalArg(0) int arg0) {
		try {
			this.anInt556 += 2;
			@Pc(9) int local9 = 89 / arg0;
			@Pc(33) int local33 = ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 1] - 128 & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("84182, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "(Z)I")
	public int method371() {
		try {
			this.anInt556 += 2;
			@Pc(29) int local29 = ((this.aByteArray17[this.anInt556 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 2] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("69751, " + true + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "b", descriptor = "(B)I")
	public int method372() {
		try {
			this.anInt556 += 3;
			return ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 16) + ((this.aByteArray17[this.anInt556 - 3] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 1] & 0xFF);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("88072, " + 34 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "i", descriptor = "(II)V")
	public void method373(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 16);
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 24);
			this.aByteArray17[this.anInt556++] = (byte) arg0;
			this.aByteArray17[this.anInt556++] = (byte) (arg0 >> 8);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("55267, " + -913 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "p", descriptor = "(I)I")
	public int method374(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt556 += 4;
			return ((this.aByteArray17[this.anInt556 - 1] & 0xFF) << 24) + ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 16) + ((this.aByteArray17[this.anInt556 - 3] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 4] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("76608, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "c", descriptor = "(B)I")
	public int method375(@OriginalArg(0) byte arg0) {
		try {
			this.anInt556 += 4;
			@Pc(10) boolean local10 = false;
			return ((this.aByteArray17[this.anInt556 - 2] & 0xFF) << 24) + ((this.aByteArray17[this.anInt556 - 1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt556 - 4] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 3] & 0xFF);
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("96518, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "d", descriptor = "(Z)I")
	public int method376() {
		try {
			this.anInt556 += 4;
			return ((this.aByteArray17[this.anInt556 - 3] & 0xFF) << 24) + ((this.aByteArray17[this.anInt556 - 4] & 0xFF) << 16) + ((this.aByteArray17[this.anInt556 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt556 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("11270, " + true + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(III[B)V")
	public void method377(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		try {
			if (arg0 != 0) {
				this.anInt552 = 49;
			}
			for (@Pc(10) int local10 = arg1 + 0 - 1; local10 >= 0; local10--) {
				this.aByteArray17[this.anInt556++] = arg2[local10];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("54314, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RSWRPCHR", name = "a", descriptor = "(II[BI)V")
	public void method378(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(12) int local12 = arg1 + 0 - 1; local12 >= 0; local12--) {
				arg0[local12] = (byte) (this.aByteArray17[this.anInt556++] - 128);
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("54488, " + 0 + ", " + -197 + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
