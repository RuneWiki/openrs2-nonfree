import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MBMGIXGO")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!MBMGIXGO", name = "E", descriptor = "I")
	private static int anInt470;

	@OriginalMember(owner = "client!MBMGIXGO", name = "F", descriptor = "I")
	private static int anInt471;

	@OriginalMember(owner = "client!MBMGIXGO", name = "G", descriptor = "I")
	private static int anInt472;

	@OriginalMember(owner = "client!MBMGIXGO", name = "B", descriptor = "[I")
	private static int[] anIntArray80 = new int[256];

	@OriginalMember(owner = "client!MBMGIXGO", name = "C", descriptor = "[I")
	private static final int[] anIntArray81;

	@OriginalMember(owner = "client!MBMGIXGO", name = "H", descriptor = "Lclient!LHGXPZPG;")
	private static Class21 aClass21_6;

	@OriginalMember(owner = "client!MBMGIXGO", name = "I", descriptor = "Lclient!LHGXPZPG;")
	private static Class21 aClass21_7;

	@OriginalMember(owner = "client!MBMGIXGO", name = "J", descriptor = "Lclient!LHGXPZPG;")
	private static Class21 aClass21_8;

	@OriginalMember(owner = "client!MBMGIXGO", name = "K", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!MBMGIXGO", name = "y", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!MBMGIXGO", name = "z", descriptor = "I")
	public int anInt468;

	@OriginalMember(owner = "client!MBMGIXGO", name = "A", descriptor = "I")
	public int anInt469;

	@OriginalMember(owner = "client!MBMGIXGO", name = "D", descriptor = "Lclient!JOCFVBOI;")
	public Class19 aClass19_1;

	@OriginalMember(owner = "client!MBMGIXGO", name = "i", descriptor = "I")
	private int anInt461 = 891;

	@OriginalMember(owner = "client!MBMGIXGO", name = "j", descriptor = "I")
	private int anInt462 = 9;

	@OriginalMember(owner = "client!MBMGIXGO", name = "k", descriptor = "B")
	private byte aByte10 = 14;

	@OriginalMember(owner = "client!MBMGIXGO", name = "l", descriptor = "I")
	private int anInt463 = -29508;

	@OriginalMember(owner = "client!MBMGIXGO", name = "m", descriptor = "I")
	private int anInt464 = 881;

	@OriginalMember(owner = "client!MBMGIXGO", name = "n", descriptor = "B")
	private byte aByte11 = 8;

	@OriginalMember(owner = "client!MBMGIXGO", name = "o", descriptor = "I")
	private int anInt465 = 657;

	@OriginalMember(owner = "client!MBMGIXGO", name = "p", descriptor = "Z")
	private boolean aBoolean107 = false;

	@OriginalMember(owner = "client!MBMGIXGO", name = "q", descriptor = "I")
	private int anInt466 = -715;

	@OriginalMember(owner = "client!MBMGIXGO", name = "r", descriptor = "B")
	private byte aByte12 = -57;

	@OriginalMember(owner = "client!MBMGIXGO", name = "s", descriptor = "B")
	private byte aByte13 = 108;

	@OriginalMember(owner = "client!MBMGIXGO", name = "t", descriptor = "B")
	private byte aByte14 = 3;

	@OriginalMember(owner = "client!MBMGIXGO", name = "u", descriptor = "Z")
	private boolean aBoolean108 = false;

	@OriginalMember(owner = "client!MBMGIXGO", name = "v", descriptor = "I")
	private int anInt467 = -373;

	@OriginalMember(owner = "client!MBMGIXGO", name = "w", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!MBMGIXGO", name = "x", descriptor = "Z")
	private boolean aBoolean110 = true;

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
			anIntArray80[local4] = local7;
		}
		anIntArray81 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass21_6 = new Class21(169);
		aClass21_7 = new Class21(169);
		aClass21_8 = new Class21(169);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(II)Lclient!MBMGIXGO;")
	public static Class1_Sub1_Sub3 method256() {
		try {
			@Pc(3) Class21 local3 = aClass21_7;
			synchronized (aClass21_7) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt471 > 0) {
					anInt471--;
					local7 = (Class1_Sub1_Sub3) aClass21_7.method245();
				}
				if (local7 != null) {
					local7.anInt468 = 0;
					return local7;
				}
			}
			@Pc(79) Class1_Sub1_Sub3 local79 = new Class1_Sub1_Sub3(false);
			local79.anInt468 = 0;
			local79.aByteArray10 = new byte[5000];
			return local79;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("94514, " + 1 + ", " + 9 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "<init>", descriptor = "(Z)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray10 = arg0;
			this.anInt468 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("38214, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(BI)V")
	public void method257(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) (arg0 + this.aClass19_1.method227());
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("9884, " + 6 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(I)V")
	public void method258(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt468++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(I)V")
	public void method259(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt468++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(ZI)V")
	public void method260(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) arg0;
			this.aByteArray10[this.anInt468++] = 0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("83632, " + true + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "(I)V")
	public void method261(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 16);
		this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt468++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "(I)V")
	public void method262(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 24);
		this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 16);
		this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt468++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(II)V")
	public void method263(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) arg0;
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("9235, " + 0 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IJ)V")
	public void method264(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 56);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 48);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 40);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 32);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 24);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt468++] = (byte) arg0;
		} catch (@Pc(138) RuntimeException local138) {
			signlink.reporterror("14395, " + 5 + ", " + arg0 + ", " + local138.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method265(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray10, this.anInt468);
		this.anInt468 += arg0.length();
		this.aByteArray10[this.anInt468++] = 10;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "([BIZI)V")
	public void method266(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				this.aByteArray10[this.anInt468++] = arg0[local11];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("70990, " + arg0 + ", " + arg1 + ", " + true + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IB)V")
	public void method267(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt468 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("82134, " + arg0 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "()I")
	public int method268() {
		return this.aByteArray10[this.anInt468++] & 0xFF;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "()B")
	public byte method269() {
		return this.aByteArray10[this.anInt468++];
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "()I")
	public int method270() {
		this.anInt468 += 2;
		return ((this.aByteArray10[this.anInt468 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "f", descriptor = "()I")
	public int method271() {
		this.anInt468 += 2;
		@Pc(27) int local27 = ((this.aByteArray10[this.anInt468 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "g", descriptor = "()I")
	public int method272() {
		this.anInt468 += 3;
		return ((this.aByteArray10[this.anInt468 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt468 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "h", descriptor = "()I")
	public int method273() {
		this.anInt468 += 4;
		return ((this.aByteArray10[this.anInt468 - 4] & 0xFF) << 24) + ((this.aByteArray10[this.anInt468 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt468 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "(I)J")
	public long method274() {
		try {
			@Pc(5) long local5 = (long) this.method273() & 0xFFFFFFFFL;
			@Pc(22) long local22 = (long) this.method273() & 0xFFFFFFFFL;
			return (local5 << 32) + local22;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("20297, " + -35089 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "i", descriptor = "()Ljava/lang/String;")
	public String method275() {
		@Pc(2) int local2 = this.anInt468;
		while (this.aByteArray10[this.anInt468++] != 10) {
		}
		return new String(this.aByteArray10, local2, this.anInt468 - local2 - 1);
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(B)[B")
	public byte[] method276() {
		try {
			@Pc(2) int local2 = this.anInt468;
			while (this.aByteArray10[this.anInt468++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt468 - local2 - 1];
			for (@Pc(36) int local36 = local2; local36 < this.anInt468 - 1; local36++) {
				local23[local36 - local2] = this.aByteArray10[local36];
			}
			return local23;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("54420, " + 30 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IBI[B)V")
	public void method277(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(3) byte[] arg2) {
		try {
			@Pc(6) int local6;
			if (arg1 != 14) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = 0; local6 < arg0 + 0; local6++) {
				arg2[local6] = this.aByteArray10[this.anInt468++];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("47406, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "f", descriptor = "(I)V")
	public void method278(@OriginalArg(0) int arg0) {
		try {
			this.anInt469 = this.anInt468 * 8;
			if (arg0 != this.anInt463) {
				for (@Pc(11) int local11 = 1; local11 > 0; local11++) {
				}
			}
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("30072, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "(II)I")
	public int method279(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt469 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt469 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt469 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray10[local6++] & anIntArray81[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray10[local6] & anIntArray81[local13];
			} else {
				local15 += this.aByteArray10[local6] >> local13 - arg0 & anIntArray81[arg0];
			}
			return local15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("74666, " + arg0 + ", " + 0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(Z)V")
	public void method280() {
		try {
			this.anInt468 = (this.anInt469 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("96565, " + true + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "j", descriptor = "()I")
	public int method281() {
		@Pc(7) int local7 = this.aByteArray10[this.anInt468] & 0xFF;
		return local7 < 128 ? this.method268() - 64 : this.method270() - 49152;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "k", descriptor = "()I")
	public int method282() {
		@Pc(7) int local7 = this.aByteArray10[this.anInt468] & 0xFF;
		return local7 < 128 ? this.method268() : this.method270() - 32768;
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V")
	public void method283(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt468;
			this.anInt468 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method277(local2, this.aByte10, local8);
			@Pc(20) BigInteger local20 = new BigInteger(local8);
			@Pc(35) BigInteger local35 = local20.modPow(arg0, arg1);
			@Pc(38) byte[] local38 = local35.toByteArray();
			this.anInt468 = 0;
			this.method258(local38.length);
			this.method266(local38, local38.length);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("13312, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "(II)V")
	public void method284(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) -arg0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("41426, " + arg0 + ", " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "(II)V")
	public void method285(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) (128 - arg1);
			@Pc(17) boolean local17 = false;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("90775, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "g", descriptor = "(I)I")
	public int method286() {
		try {
			return this.aByteArray10[this.anInt468++] - 128 & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("58967, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(Z)I")
	public int method287() {
		try {
			return -this.aByteArray10[this.anInt468++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("92864, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "h", descriptor = "(I)I")
	public int method288() {
		try {
			return 128 - this.aByteArray10[this.anInt468++] & 0xFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("10465, " + 2 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(B)B")
	public byte method289() {
		try {
			if (this.aByte12 != -57) {
				throw new NullPointerException();
			}
			return (byte) -this.aByteArray10[this.anInt468++];
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("12463, " + -57 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "i", descriptor = "(I)B")
	public byte method290() {
		try {
			return (byte) (128 - this.aByteArray10[this.anInt468++]);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("7843, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "b", descriptor = "(ZI)V")
	public void method291(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) arg0;
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("38812, " + true + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "f", descriptor = "(II)V")
	public void method292(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 + 128);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("18114, " + -431 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "g", descriptor = "(II)V")
	public void method293(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt468++] = (byte) (arg0 + 128);
			this.aByteArray10[this.anInt468++] = (byte) (arg0 >> 8);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("91835, " + 0 + ", " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "(B)I")
	public int method294() {
		try {
			this.anInt468 += 2;
			return this.aByte13 == 108 ? ((this.aByteArray10[this.anInt468 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 2] & 0xFF) : 3;
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("82184, " + 108 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "c", descriptor = "(Z)I")
	public int method295() {
		try {
			this.anInt468 += 2;
			return ((this.aByteArray10[this.anInt468 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 1] - 128 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("52310, " + true + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "(B)I")
	public int method296() {
		try {
			this.anInt468 += 2;
			return ((this.aByteArray10[this.anInt468 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("92143, " + -74 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "j", descriptor = "(I)I")
	public int method297() {
		try {
			this.anInt468 += 2;
			@Pc(31) int local31 = ((this.aByteArray10[this.anInt468 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 2] & 0xFF);
			if (local31 > 32767) {
				local31 -= 65536;
			}
			return local31;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("19924, " + -665 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "d", descriptor = "(Z)I")
	public int method298() {
		try {
			this.anInt468 += 2;
			@Pc(38) int local38 = ((this.aByteArray10[this.anInt468 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 2] - 128 & 0xFF);
			if (local38 > 32767) {
				local38 -= 65536;
			}
			return local38;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("99952, " + false + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "(B)I")
	public int method299() {
		try {
			this.anInt468 += 4;
			return ((this.aByteArray10[this.anInt468 - 2] & 0xFF) << 24) + ((this.aByteArray10[this.anInt468 - 1] & 0xFF) << 16) + ((this.aByteArray10[this.anInt468 - 4] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 3] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("11599, " + 41 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "e", descriptor = "(Z)I")
	public int method300() {
		try {
			this.anInt468 += 4;
			return ((this.aByteArray10[this.anInt468 - 3] & 0xFF) << 24) + ((this.aByteArray10[this.anInt468 - 4] & 0xFF) << 16) + ((this.aByteArray10[this.anInt468 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt468 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("83720, " + true + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IB[BI)V")
	public void method301(@OriginalArg(1) byte arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 != 6) {
				this.aBoolean107 = !this.aBoolean107;
			}
			for (@Pc(16) int local16 = arg2 + 0 - 1; local16 >= 0; local16--) {
				this.aByteArray10[this.anInt468++] = (byte) (arg1[local16] + 128);
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("26182, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MBMGIXGO", name = "a", descriptor = "(IIZ[B)V")
	public void method302(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(15) int local15 = arg0 + 0 - 1; local15 >= 0; local15--) {
				arg1[local15] = this.aByteArray10[this.anInt468++];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("6879, " + arg0 + ", " + 0 + ", " + true + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
