import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!RGCGKKUR")
public final class Class6_Sub1_Sub4 extends Class6_Sub1 {

	@OriginalMember(owner = "client!RGCGKKUR", name = "x", descriptor = "I")
	private static int anInt706;

	@OriginalMember(owner = "client!RGCGKKUR", name = "y", descriptor = "I")
	private static int anInt707;

	@OriginalMember(owner = "client!RGCGKKUR", name = "z", descriptor = "I")
	private static int anInt708;

	@OriginalMember(owner = "client!RGCGKKUR", name = "u", descriptor = "[I")
	private static int[] anIntArray190 = new int[256];

	@OriginalMember(owner = "client!RGCGKKUR", name = "v", descriptor = "[I")
	private static final int[] anIntArray191;

	@OriginalMember(owner = "client!RGCGKKUR", name = "A", descriptor = "Lclient!CEEJCAVA;")
	private static Class5 aClass5_7;

	@OriginalMember(owner = "client!RGCGKKUR", name = "B", descriptor = "Lclient!CEEJCAVA;")
	private static Class5 aClass5_8;

	@OriginalMember(owner = "client!RGCGKKUR", name = "C", descriptor = "Lclient!CEEJCAVA;")
	private static Class5 aClass5_9;

	@OriginalMember(owner = "client!RGCGKKUR", name = "D", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!RGCGKKUR", name = "j", descriptor = "I")
	private int anInt699;

	@OriginalMember(owner = "client!RGCGKKUR", name = "r", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!RGCGKKUR", name = "s", descriptor = "I")
	public int anInt704;

	@OriginalMember(owner = "client!RGCGKKUR", name = "t", descriptor = "I")
	public int anInt705;

	@OriginalMember(owner = "client!RGCGKKUR", name = "w", descriptor = "Lclient!JLGPBSNA;")
	public Class18 aClass18_1;

	@OriginalMember(owner = "client!RGCGKKUR", name = "k", descriptor = "I")
	private int anInt700 = 182;

	@OriginalMember(owner = "client!RGCGKKUR", name = "l", descriptor = "Z")
	private boolean aBoolean177 = true;

	@OriginalMember(owner = "client!RGCGKKUR", name = "m", descriptor = "I")
	private int anInt701 = 899;

	@OriginalMember(owner = "client!RGCGKKUR", name = "n", descriptor = "Z")
	private boolean aBoolean178 = false;

	@OriginalMember(owner = "client!RGCGKKUR", name = "o", descriptor = "I")
	private int anInt702 = 45492;

	@OriginalMember(owner = "client!RGCGKKUR", name = "p", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!RGCGKKUR", name = "q", descriptor = "I")
	private int anInt703 = 1;

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
			anIntArray190[local4] = local7;
		}
		anIntArray191 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass5_7 = new Class5(-7255);
		aClass5_8 = new Class5(-7255);
		aClass5_9 = new Class5(-7255);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(II)Lclient!RGCGKKUR;")
	public static Class6_Sub1_Sub4 method399() {
		try {
			@Pc(3) Class5 local3 = aClass5_8;
			synchronized (aClass5_8) {
				@Pc(7) Class6_Sub1_Sub4 local7 = null;
				if (anInt707 > 0) {
					anInt707--;
					local7 = (Class6_Sub1_Sub4) aClass5_8.method32();
				}
				if (local7 != null) {
					local7.anInt704 = 0;
					return local7;
				}
			}
			@Pc(69) Class6_Sub1_Sub4 local69 = new Class6_Sub1_Sub4(0);
			local69.anInt704 = 0;
			local69.aByteArray17 = new byte[5000];
			return local69;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("96257, " + 7 + ", " + 1 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "<init>", descriptor = "(I)V")
	private Class6_Sub1_Sub4(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "<init>", descriptor = "([BB)V")
	public Class6_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aByteArray17 = arg0;
			this.anInt704 = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("2736, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(ZI)V")
	public void method400(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) (arg1 + this.aClass18_1.method155());
			if (arg0) {
				this.anInt700 = 13;
			}
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("95150, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(I)V")
	public void method401(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(I)V")
	public void method402(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(IB)V")
	public void method403(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) arg0;
			this.aByteArray17[this.anInt704++] = 0;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("15921, " + arg0 + ", " + -40 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(I)V")
	public void method404(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "d", descriptor = "(I)V")
	public void method405(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt704++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(IZ)V")
	public void method406(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) arg0;
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 16);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 24);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("24892, " + arg0 + ", " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(JI)V")
	public void method407(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 56);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 48);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 40);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 32);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 24);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 16);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt704++] = (byte) arg0;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("88135, " + arg0 + ", " + 0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method408(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray17, this.anInt704);
		this.anInt704 += arg0.length();
		this.aByteArray17[this.anInt704++] = 10;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "([BIII)V")
	public void method409(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray17[this.anInt704++] = arg0[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("89700, " + arg0 + ", " + 501 + ", " + arg1 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(II)V")
	public void method410(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt704 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("13354, " + 0 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "()I")
	public int method411() {
		return this.aByteArray17[this.anInt704++] & 0xFF;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "d", descriptor = "()B")
	public byte method412() {
		return this.aByteArray17[this.anInt704++];
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "e", descriptor = "()I")
	public int method413() {
		this.anInt704 += 2;
		return ((this.aByteArray17[this.anInt704 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "f", descriptor = "()I")
	public int method414() {
		this.anInt704 += 2;
		@Pc(27) int local27 = ((this.aByteArray17[this.anInt704 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "g", descriptor = "()I")
	public int method415() {
		this.anInt704 += 3;
		return ((this.aByteArray17[this.anInt704 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt704 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "h", descriptor = "()I")
	public int method416() {
		this.anInt704 += 4;
		return ((this.aByteArray17[this.anInt704 - 4] & 0xFF) << 24) + ((this.aByteArray17[this.anInt704 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt704 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(Z)J")
	public long method417() {
		try {
			@Pc(11) long local11 = (long) this.method416() & 0xFFFFFFFFL;
			@Pc(17) long local17 = (long) this.method416() & 0xFFFFFFFFL;
			return (local11 << 32) + local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("39276, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "i", descriptor = "()Ljava/lang/String;")
	public String method418() {
		@Pc(2) int local2 = this.anInt704;
		while (this.aByteArray17[this.anInt704++] != 10) {
		}
		return new String(this.aByteArray17, local2, this.anInt704 - local2 - 1);
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(B)[B")
	public byte[] method419() {
		try {
			@Pc(8) int local8 = this.anInt704;
			while (this.aByteArray17[this.anInt704++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt704 - local8 - 1];
			for (@Pc(31) int local31 = local8; local31 < this.anInt704 - 1; local31++) {
				local29[local31 - local8] = this.aByteArray17[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("59233, " + 30 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(III[B)V")
	private void method420(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0 + 0; local12++) {
				arg1[local12] = this.aByteArray17[this.anInt704++];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("45276, " + arg0 + ", " + 807 + ", " + 0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "e", descriptor = "(I)V")
	public void method421(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 28 / arg0;
			this.anInt705 = this.anInt704 * 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("94186, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(IZ)I")
	public int method422(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt705 >> 3;
			@Pc(11) int local11 = 8 - (this.anInt705 & 0x7);
			@Pc(13) int local13 = 0;
			this.anInt705 += arg0;
			while (arg0 > local11) {
				local13 += (this.aByteArray17[local4++] & anIntArray191[local11]) << arg0 - local11;
				arg0 -= local11;
				local11 = 8;
			}
			if (arg0 == local11) {
				local13 += this.aByteArray17[local4] & anIntArray191[local11];
			} else {
				local13 += this.aByteArray17[local4] >> local11 - arg0 & anIntArray191[arg0];
			}
			return local13;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("55076, " + arg0 + ", " + true + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "f", descriptor = "(I)V")
	public void method423() {
		try {
			this.anInt704 = (this.anInt705 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("95041, " + 1 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "j", descriptor = "()I")
	public int method424() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt704] & 0xFF;
		return local7 < 128 ? this.method411() - 64 : this.method413() - 49152;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "k", descriptor = "()I")
	public int method425() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt704] & 0xFF;
		return local7 < 128 ? this.method411() : this.method413() - 32768;
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method426(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt704;
			this.anInt704 = 0;
			@Pc(11) byte[] local11 = new byte[local2];
			this.method420(local2, local11);
			@Pc(22) BigInteger local22 = new BigInteger(local11);
			@Pc(27) BigInteger local27 = local22.modPow(arg0, arg1);
			@Pc(30) byte[] local30 = local27.toByteArray();
			this.anInt704 = 0;
			this.method401(local30.length);
			this.method409(local30, local30.length);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("96988, " + arg0 + ", " + arg1 + ", " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(II)V")
	public void method427(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) (arg0 + 128);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("78758, " + arg0 + ", " + -506 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(ZI)V")
	public void method428(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) (128 - arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("64303, " + false + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(Z)I")
	public int method429() {
		try {
			return this.aByteArray17[this.anInt704++] - 128 & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("50931, " + false + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "g", descriptor = "(I)I")
	public int method430() {
		try {
			return -this.aByteArray17[this.anInt704++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("71110, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(Z)I")
	public int method431() {
		try {
			return 128 - this.aByteArray17[this.anInt704++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("96958, " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "h", descriptor = "(I)B")
	public byte method432() {
		try {
			return (byte) -this.aByteArray17[this.anInt704++];
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("21827, " + 7 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "i", descriptor = "(I)B")
	public byte method433() {
		try {
			return (byte) (128 - this.aByteArray17[this.anInt704++]);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("95415, " + -771 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "d", descriptor = "(II)V")
	public void method434(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) arg0;
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 8);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("322, " + arg0 + ", " + -48 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "e", descriptor = "(II)V")
	public void method435(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 + 128);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("43418, " + arg0 + ", " + 912 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "f", descriptor = "(II)V")
	public void method436(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) (arg1 + 128);
			if (arg0 != 23894) {
				this.anInt702 = 304;
			}
			this.aByteArray17[this.anInt704++] = (byte) (arg1 >> 8);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("4117, " + arg0 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "d", descriptor = "(Z)I")
	public int method437() {
		try {
			this.anInt704 += 2;
			return ((this.aByteArray17[this.anInt704 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("52350, " + false + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "j", descriptor = "(I)I")
	public int method438() {
		try {
			this.anInt704 += 2;
			return ((this.aByteArray17[this.anInt704 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("31247, " + 26085 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "k", descriptor = "(I)I")
	public int method439(@OriginalArg(0) int arg0) {
		try {
			this.anInt704 += 2;
			@Pc(9) int local9 = 47 / arg0;
			return ((this.aByteArray17[this.anInt704 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 2] - 128 & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("6702, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "e", descriptor = "(Z)I")
	public int method440() {
		try {
			this.anInt704 += 2;
			@Pc(36) int local36 = ((this.aByteArray17[this.anInt704 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 2] & 0xFF);
			if (local36 > 32767) {
				local36 -= 65536;
			}
			return local36;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("33156, " + false + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "l", descriptor = "(I)I")
	public int method441() {
		try {
			this.anInt704 += 2;
			@Pc(34) int local34 = ((this.aByteArray17[this.anInt704 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 2] - 128 & 0xFF);
			if (local34 > 32767) {
				local34 -= 65536;
			}
			return local34;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("45130, " + 324 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "m", descriptor = "(I)I")
	public int method442() {
		try {
			this.anInt704 += 3;
			return ((this.aByteArray17[this.anInt704 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt704 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 2] & 0xFF);
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("12248, " + 28209 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(ZI)V")
	public void method443(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt704++] = (byte) arg0;
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 24);
			this.aByteArray17[this.anInt704++] = (byte) (arg0 >> 16);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("94858, " + false + ", " + arg0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "f", descriptor = "(Z)I")
	public int method444() {
		try {
			this.anInt704 += 4;
			return ((this.aByteArray17[this.anInt704 - 1] & 0xFF) << 24) + ((this.aByteArray17[this.anInt704 - 2] & 0xFF) << 16) + ((this.aByteArray17[this.anInt704 - 3] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 4] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("6506, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(B)I")
	public int method445() {
		try {
			this.anInt704 += 4;
			return ((this.aByteArray17[this.anInt704 - 2] & 0xFF) << 24) + ((this.aByteArray17[this.anInt704 - 1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt704 - 4] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 3] & 0xFF);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("11807, " + -78 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "c", descriptor = "(B)I")
	public int method446() {
		try {
			this.anInt704 += 4;
			return ((this.aByteArray17[this.anInt704 - 3] & 0xFF) << 24) + ((this.aByteArray17[this.anInt704 - 4] & 0xFF) << 16) + ((this.aByteArray17[this.anInt704 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt704 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("26782, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "a", descriptor = "(Z[BII)V")
	public void method447(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1 + 0; local12++) {
				this.aByteArray17[this.anInt704++] = (byte) (arg0[local12] + 128);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("92086, " + false + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!RGCGKKUR", name = "b", descriptor = "(Z[BII)V")
	public void method448(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(8) int local8 = arg1 + 0 - 1; local8 >= 0; local8--) {
				arg0[local8] = this.aByteArray17[this.anInt704++];
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("16018, " + true + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}
}
