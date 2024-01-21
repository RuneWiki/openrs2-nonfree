import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MFMVIYHT")
public final class Class10_Sub1_Sub3 extends Class10_Sub1 {

	@OriginalMember(owner = "client!MFMVIYHT", name = "F", descriptor = "I")
	private static int anInt430;

	@OriginalMember(owner = "client!MFMVIYHT", name = "G", descriptor = "I")
	private static int anInt431;

	@OriginalMember(owner = "client!MFMVIYHT", name = "H", descriptor = "I")
	private static int anInt432;

	@OriginalMember(owner = "client!MFMVIYHT", name = "x", descriptor = "Z")
	private static boolean aBoolean115 = true;

	@OriginalMember(owner = "client!MFMVIYHT", name = "C", descriptor = "[I")
	private static int[] anIntArray150 = new int[256];

	@OriginalMember(owner = "client!MFMVIYHT", name = "D", descriptor = "[I")
	private static final int[] anIntArray151;

	@OriginalMember(owner = "client!MFMVIYHT", name = "I", descriptor = "Lclient!BOHLFXVX;")
	private static Class6 aClass6_2;

	@OriginalMember(owner = "client!MFMVIYHT", name = "J", descriptor = "Lclient!BOHLFXVX;")
	private static Class6 aClass6_3;

	@OriginalMember(owner = "client!MFMVIYHT", name = "K", descriptor = "Lclient!BOHLFXVX;")
	private static Class6 aClass6_4;

	@OriginalMember(owner = "client!MFMVIYHT", name = "L", descriptor = "[C")
	private static char[] aCharArray2;

	@OriginalMember(owner = "client!MFMVIYHT", name = "r", descriptor = "I")
	private int anInt425;

	@OriginalMember(owner = "client!MFMVIYHT", name = "s", descriptor = "I")
	private int anInt426;

	@OriginalMember(owner = "client!MFMVIYHT", name = "z", descriptor = "[B")
	public byte[] aByteArray12;

	@OriginalMember(owner = "client!MFMVIYHT", name = "A", descriptor = "I")
	public int anInt428;

	@OriginalMember(owner = "client!MFMVIYHT", name = "B", descriptor = "I")
	public int anInt429;

	@OriginalMember(owner = "client!MFMVIYHT", name = "E", descriptor = "Lclient!KRGHNEZN;")
	public Class25 aClass25_1;

	@OriginalMember(owner = "client!MFMVIYHT", name = "h", descriptor = "Z")
	private boolean aBoolean109 = false;

	@OriginalMember(owner = "client!MFMVIYHT", name = "i", descriptor = "I")
	private int anInt421 = 8;

	@OriginalMember(owner = "client!MFMVIYHT", name = "j", descriptor = "Z")
	private boolean aBoolean110 = false;

	@OriginalMember(owner = "client!MFMVIYHT", name = "k", descriptor = "Z")
	private boolean aBoolean111 = true;

	@OriginalMember(owner = "client!MFMVIYHT", name = "l", descriptor = "B")
	private byte aByte22 = 5;

	@OriginalMember(owner = "client!MFMVIYHT", name = "m", descriptor = "I")
	private int anInt422 = -29290;

	@OriginalMember(owner = "client!MFMVIYHT", name = "n", descriptor = "Z")
	private boolean aBoolean112 = false;

	@OriginalMember(owner = "client!MFMVIYHT", name = "o", descriptor = "I")
	private int anInt423 = 217;

	@OriginalMember(owner = "client!MFMVIYHT", name = "p", descriptor = "I")
	private int anInt424 = 236;

	@OriginalMember(owner = "client!MFMVIYHT", name = "q", descriptor = "Z")
	private boolean aBoolean113 = false;

	@OriginalMember(owner = "client!MFMVIYHT", name = "t", descriptor = "B")
	private byte aByte23 = 17;

	@OriginalMember(owner = "client!MFMVIYHT", name = "u", descriptor = "B")
	private byte aByte24 = 89;

	@OriginalMember(owner = "client!MFMVIYHT", name = "v", descriptor = "B")
	private byte aByte25 = -16;

	@OriginalMember(owner = "client!MFMVIYHT", name = "w", descriptor = "Z")
	private boolean aBoolean114 = false;

	@OriginalMember(owner = "client!MFMVIYHT", name = "y", descriptor = "I")
	private int anInt427 = 1;

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
			anIntArray150[local6] = local9;
		}
		anIntArray151 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass6_2 = new Class6(true);
		aClass6_3 = new Class6(true);
		aClass6_4 = new Class6(true);
		aCharArray2 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(BI)Lclient!MFMVIYHT;")
	public static Class10_Sub1_Sub3 method299() {
		try {
			@Pc(3) Class6 local3 = aClass6_3;
			synchronized (aClass6_3) {
				@Pc(7) Class10_Sub1_Sub3 local7 = null;
				if (anInt431 > 0) {
					anInt431--;
					local7 = (Class10_Sub1_Sub3) aClass6_3.method5();
				}
				if (local7 != null) {
					local7.anInt428 = 0;
					return local7;
				}
			}
			@Pc(69) Class10_Sub1_Sub3 local69 = new Class10_Sub1_Sub3(-211);
			local69.anInt428 = 0;
			local69.aByteArray12 = new byte[5000];
			return local69;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("81898, " + 0 + ", " + 1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "<init>", descriptor = "(I)V")
	private Class10_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "<init>", descriptor = "(Z[B)V")
	public Class10_Sub1_Sub3(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray12 = arg1;
			this.anInt428 = 0;
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("60297, " + arg0 + ", " + arg1 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(BI)V")
	public void method300(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) (arg0 + this.aClass25_1.method245());
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("21317, " + 4 + ", " + arg0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(I)V")
	public void method301(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt428++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(I)V")
	public void method302(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt428++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(IZ)V")
	public void method303(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) arg0;
			this.aByteArray12[this.anInt428++] = 0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("2554, " + arg0 + ", " + false + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "(I)V")
	public void method304(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt428++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "d", descriptor = "(I)V")
	public void method305(@OriginalArg(0) int arg0) {
		this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 24);
		this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 16);
		this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 8);
		this.aByteArray12[this.anInt428++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(IZ)V")
	public void method306(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) arg0;
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 8);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 16);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 24);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("11872, " + arg0 + ", " + false + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(JZ)V")
	public void method307(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 56);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 48);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 40);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 32);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 24);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 16);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 8);
			this.aByteArray12[this.anInt428++] = (byte) arg0;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("88423, " + arg0 + ", " + true + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method308(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray12, this.anInt428);
		this.anInt428 += arg0.length();
		this.aByteArray12[this.anInt428++] = 10;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "([BIII)V")
	public void method309(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(9) int local9 = 0; local9 < arg1 + 0; local9++) {
				this.aByteArray12[this.anInt428++] = arg0[local9];
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("84054, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(II)V")
	public void method310(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt428 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("2308, " + arg0 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "()I")
	public int method311() {
		return this.aByteArray12[this.anInt428++] & 0xFF;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "d", descriptor = "()B")
	public byte method312() {
		return this.aByteArray12[this.anInt428++];
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "e", descriptor = "()I")
	public int method313() {
		this.anInt428 += 2;
		return ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "f", descriptor = "()I")
	public int method314() {
		this.anInt428 += 2;
		@Pc(27) int local27 = ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "g", descriptor = "()I")
	public int method315() {
		this.anInt428 += 3;
		return ((this.aByteArray12[this.anInt428 - 3] & 0xFF) << 16) + ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "h", descriptor = "()I")
	public int method316() {
		this.anInt428 += 4;
		return ((this.aByteArray12[this.anInt428 - 4] & 0xFF) << 24) + ((this.aByteArray12[this.anInt428 - 3] & 0xFF) << 16) + ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "e", descriptor = "(I)J")
	public long method317() {
		try {
			@Pc(5) long local5 = (long) this.method316() & 0xFFFFFFFFL;
			@Pc(17) long local17 = (long) this.method316() & 0xFFFFFFFFL;
			return (local5 << 32) + local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("36638, " + -149 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "i", descriptor = "()Ljava/lang/String;")
	public String method318() {
		@Pc(2) int local2 = this.anInt428;
		while (this.aByteArray12[this.anInt428++] != 10) {
		}
		return new String(this.aByteArray12, local2, this.anInt428 - local2 - 1);
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "f", descriptor = "(I)[B")
	public byte[] method319() {
		try {
			@Pc(2) int local2 = this.anInt428;
			while (this.aByteArray12[this.anInt428++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt428 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt428 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray12[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("60192, " + 621 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(III[B)V")
	private void method320(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg0 + 0; local11++) {
				arg1[local11] = this.aByteArray12[this.anInt428++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("36906, " + arg0 + ", " + 0 + ", " + -21 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(B)V")
	public void method321(@OriginalArg(0) byte arg0) {
		try {
			this.anInt429 = this.anInt428 * 8;
			@Pc(10) boolean local10 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("54917, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(II)I")
	public int method322(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt429 >> 3;
			@Pc(11) int local11 = 8 - (this.anInt429 & 0x7);
			@Pc(13) int local13 = 0;
			this.anInt429 += arg0;
			while (arg0 > local11) {
				local13 += (this.aByteArray12[local4++] & anIntArray151[local11]) << arg0 - local11;
				arg0 -= local11;
				local11 = 8;
			}
			if (arg0 == local11) {
				local13 += this.aByteArray12[local4] & anIntArray151[local11];
			} else {
				local13 += this.aByteArray12[local4] >> local11 - arg0 & anIntArray151[arg0];
			}
			return local13;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("57594, " + 402 + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "g", descriptor = "(I)V")
	public void method323() {
		try {
			if (this.anInt422 != -29290) {
				this.anInt422 = -448;
			}
			this.anInt428 = (this.anInt429 + 7) / 8;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("21652, " + -29290 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "j", descriptor = "()I")
	public int method324() {
		@Pc(7) int local7 = this.aByteArray12[this.anInt428] & 0xFF;
		return local7 < 128 ? this.method311() - 64 : this.method313() - 49152;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "k", descriptor = "()I")
	public int method325() {
		@Pc(7) int local7 = this.aByteArray12[this.anInt428] & 0xFF;
		return local7 < 128 ? this.method311() : this.method313() - 32768;
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method326(@OriginalArg(0) int arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
		try {
			@Pc(2) int local2 = this.anInt428;
			this.anInt428 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method320(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg2, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			if (arg0 >= 0 && arg0 <= 0) {
				this.anInt428 = 0;
				this.method301(local27.length);
				this.method309(local27, local27.length);
			}
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("76034, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(ZI)V")
	public void method327(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) (arg0 + 128);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("74948, " + false + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "(BI)V")
	public void method328(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) -arg0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("8237, " + 0 + ", " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "(II)V")
	public void method329(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) (128 - arg0);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("6939, " + arg0 + ", " + 1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "h", descriptor = "(I)I")
	public int method330() {
		try {
			return this.anInt425 == 0 ? this.aByteArray12[this.anInt428++] - 128 & 0xFF : this.anInt423;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("66623, " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "i", descriptor = "(I)I")
	public int method331() {
		try {
			return -this.aByteArray12[this.anInt428++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("68250, " + -34545 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "j", descriptor = "(I)I")
	public int method332(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = 77 / arg0;
			return 128 - this.aByteArray12[this.anInt428++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("25074, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "k", descriptor = "(I)B")
	public byte method333(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				for (@Pc(3) int local3 = 1; local3 > 0; local3++) {
				}
			}
			return (byte) (this.aByteArray12[this.anInt428++] - 128);
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("66305, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "l", descriptor = "(I)B")
	public byte method334() {
		try {
			return (byte) -this.aByteArray12[this.anInt428++];
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("28012, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "m", descriptor = "(I)B")
	public byte method335() {
		try {
			return (byte) (128 - this.aByteArray12[this.anInt428++]);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("38258, " + 43428 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "d", descriptor = "(II)V")
	public void method336(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) arg0;
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 8);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("9779, " + 0 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "e", descriptor = "(II)V")
	public void method337(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 8);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 + 128);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("9119, " + arg0 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "f", descriptor = "(II)V")
	public void method338(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray12[this.anInt428++] = (byte) (arg0 + 128);
			this.aByteArray12[this.anInt428++] = (byte) (arg0 >> 8);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("85432, " + 3 + ", " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "n", descriptor = "(I)I")
	public int method339() {
		try {
			this.anInt428 += 2;
			return ((this.aByteArray12[this.anInt428 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 2] & 0xFF);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("3023, " + -125 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "(B)I")
	public int method340() {
		try {
			this.anInt428 += 2;
			return ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 1] - 128 & 0xFF);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("71136, " + 9 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "o", descriptor = "(I)I")
	public int method341() {
		try {
			this.anInt428 += 2;
			return ((this.aByteArray12[this.anInt428 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 2] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("33768, " + -600 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "p", descriptor = "(I)I")
	public int method342() {
		try {
			this.anInt428 += 2;
			@Pc(29) int local29 = ((this.aByteArray12[this.anInt428 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 2] & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("15922, " + -63 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "c", descriptor = "(B)I")
	public int method343() {
		try {
			this.anInt428 += 2;
			if (this.aByte23 != 17) {
				this.aBoolean112 = !this.aBoolean112;
			}
			@Pc(41) int local41 = ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 1] - 128 & 0xFF);
			if (local41 > 32767) {
				local41 -= 65536;
			}
			return local41;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("62112, " + 17 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "q", descriptor = "(I)I")
	public int method344() {
		try {
			this.anInt428 += 3;
			return ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 16) + ((this.aByteArray12[this.anInt428 - 3] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 1] & 0xFF);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("72022, " + -737 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "r", descriptor = "(I)I")
	public int method345() {
		try {
			this.anInt428 += 4;
			return ((this.aByteArray12[this.anInt428 - 1] & 0xFF) << 24) + ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 16) + ((this.aByteArray12[this.anInt428 - 3] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 4] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("34629, " + 935 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "s", descriptor = "(I)I")
	public int method346() {
		try {
			this.anInt428 += 4;
			return ((this.aByteArray12[this.anInt428 - 2] & 0xFF) << 24) + ((this.aByteArray12[this.anInt428 - 1] & 0xFF) << 16) + ((this.aByteArray12[this.anInt428 - 4] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 3] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("90657, " + 3 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(Z)I")
	public int method347() {
		try {
			this.anInt428 += 4;
			return ((this.aByteArray12[this.anInt428 - 3] & 0xFF) << 24) + ((this.aByteArray12[this.anInt428 - 4] & 0xFF) << 16) + ((this.aByteArray12[this.anInt428 - 1] & 0xFF) << 8) + (this.aByteArray12[this.anInt428 - 2] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("74675, " + true + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "a", descriptor = "(B[BII)V")
	public void method348(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(9) int local9 = arg1 + 0 - 1; local9 >= 0; local9--) {
				arg0[local9] = this.aByteArray12[this.anInt428++];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("36655, " + -73 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MFMVIYHT", name = "b", descriptor = "([BIII)V")
	public void method349(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				arg0[local11] = (byte) (this.aByteArray12[this.anInt428++] - 128);
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("69666, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
