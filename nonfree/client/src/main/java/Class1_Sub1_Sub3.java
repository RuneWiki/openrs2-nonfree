import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CMGGUSPR")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!CMGGUSPR", name = "H", descriptor = "I")
	private static int anInt80;

	@OriginalMember(owner = "client!CMGGUSPR", name = "I", descriptor = "I")
	private static int anInt81;

	@OriginalMember(owner = "client!CMGGUSPR", name = "J", descriptor = "I")
	private static int anInt82;

	@OriginalMember(owner = "client!CMGGUSPR", name = "z", descriptor = "I")
	private static int anInt77 = -12929;

	@OriginalMember(owner = "client!CMGGUSPR", name = "E", descriptor = "[I")
	private static int[] anIntArray14 = new int[256];

	@OriginalMember(owner = "client!CMGGUSPR", name = "F", descriptor = "[I")
	private static final int[] anIntArray15;

	@OriginalMember(owner = "client!CMGGUSPR", name = "K", descriptor = "Lclient!WCVCMGLX;")
	private static Class41 aClass41_1;

	@OriginalMember(owner = "client!CMGGUSPR", name = "L", descriptor = "Lclient!WCVCMGLX;")
	private static Class41 aClass41_2;

	@OriginalMember(owner = "client!CMGGUSPR", name = "M", descriptor = "Lclient!WCVCMGLX;")
	private static Class41 aClass41_3;

	@OriginalMember(owner = "client!CMGGUSPR", name = "N", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!CMGGUSPR", name = "l", descriptor = "I")
	private int anInt71;

	@OriginalMember(owner = "client!CMGGUSPR", name = "w", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!CMGGUSPR", name = "B", descriptor = "[B")
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!CMGGUSPR", name = "C", descriptor = "I")
	public int anInt78;

	@OriginalMember(owner = "client!CMGGUSPR", name = "D", descriptor = "I")
	public int anInt79;

	@OriginalMember(owner = "client!CMGGUSPR", name = "G", descriptor = "Lclient!RYDUASDW;")
	public Class32 aClass32_1;

	@OriginalMember(owner = "client!CMGGUSPR", name = "i", descriptor = "I")
	private int anInt69 = 536;

	@OriginalMember(owner = "client!CMGGUSPR", name = "j", descriptor = "B")
	private byte aByte3 = -20;

	@OriginalMember(owner = "client!CMGGUSPR", name = "k", descriptor = "I")
	private int anInt70 = -4554;

	@OriginalMember(owner = "client!CMGGUSPR", name = "m", descriptor = "Z")
	private boolean aBoolean24 = false;

	@OriginalMember(owner = "client!CMGGUSPR", name = "n", descriptor = "B")
	private byte aByte4 = 73;

	@OriginalMember(owner = "client!CMGGUSPR", name = "o", descriptor = "B")
	private byte aByte5 = 4;

	@OriginalMember(owner = "client!CMGGUSPR", name = "p", descriptor = "I")
	private int anInt72 = -784;

	@OriginalMember(owner = "client!CMGGUSPR", name = "q", descriptor = "B")
	private byte aByte6 = 7;

	@OriginalMember(owner = "client!CMGGUSPR", name = "r", descriptor = "I")
	private int anInt73 = -39668;

	@OriginalMember(owner = "client!CMGGUSPR", name = "s", descriptor = "Z")
	private boolean aBoolean25 = true;

	@OriginalMember(owner = "client!CMGGUSPR", name = "t", descriptor = "I")
	private int anInt74 = 8;

	@OriginalMember(owner = "client!CMGGUSPR", name = "u", descriptor = "B")
	private byte aByte7 = 6;

	@OriginalMember(owner = "client!CMGGUSPR", name = "v", descriptor = "Z")
	private boolean aBoolean26 = false;

	@OriginalMember(owner = "client!CMGGUSPR", name = "x", descriptor = "I")
	private int anInt76 = 890;

	@OriginalMember(owner = "client!CMGGUSPR", name = "y", descriptor = "Z")
	private boolean aBoolean27 = true;

	@OriginalMember(owner = "client!CMGGUSPR", name = "A", descriptor = "Z")
	private boolean aBoolean28 = false;

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
			anIntArray14[local6] = local9;
		}
		anIntArray15 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass41_1 = new Class41(-388);
		aClass41_2 = new Class41(-388);
		aClass41_3 = new Class41(-388);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(II)Lclient!CMGGUSPR;")
	public static Class1_Sub1_Sub3 method43() {
		try {
			@Pc(3) Class41 local3 = aClass41_2;
			synchronized (aClass41_2) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt81 > 0) {
					anInt81--;
					local7 = (Class1_Sub1_Sub3) aClass41_2.method533();
				}
				if (local7 != null) {
					local7.anInt78 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3(18493);
			local69.anInt78 = 0;
			local69.aByteArray8 = new byte[5000];
			return local69;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("40727, " + 1 + ", " + 893 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray8 = arg0;
			if (arg1 <= 0) {
				throw new NullPointerException();
			}
			this.anInt78 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("47720, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(II)V")
	public void method44(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = 92 / arg1;
			this.aByteArray8[this.anInt78++] = (byte) (arg0 + this.aClass32_1.method389());
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("17320, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(I)V")
	public void method45(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt78++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(I)V")
	public void method46(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
		this.aByteArray8[this.anInt78++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(II)V")
	public void method47(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray8[this.anInt78++] = (byte) arg0;
			this.aByteArray8[this.anInt78++] = 0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("18563, " + arg0 + ", " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(I)V")
	public void method48(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 16);
		this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
		this.aByteArray8[this.anInt78++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "(I)V")
	public void method49(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 24);
		this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 16);
		this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
		this.aByteArray8[this.anInt78++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(IZ)V")
	public void method50(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray8[this.anInt78++] = (byte) arg0;
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 16);
			if (arg1) {
				this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 24);
			}
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("99364, " + arg0 + ", " + arg1 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(IJ)V")
	public void method51(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 56);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 48);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 40);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 32);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 24);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 16);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
			this.aByteArray8[this.anInt78++] = (byte) arg0;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("8538, " + 5 + ", " + arg0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method52(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray8, this.anInt78);
		this.anInt78 += arg0.length();
		this.aByteArray8[this.anInt78++] = 10;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(B[BII)V")
	public void method53(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			if (this.aByte3 != -20) {
				this.anInt76 = -77;
			}
			for (@Pc(8) int local8 = 0; local8 < arg1 + 0; local8++) {
				this.aByteArray8[this.anInt78++] = arg0[local8];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("20406, " + -20 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(IZ)V")
	public void method54(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray8[this.anInt78 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("37624, " + arg0 + ", " + false + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "()I")
	public int method55() {
		return this.aByteArray8[this.anInt78++] & 0xFF;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "()B")
	public byte method56() {
		return this.aByteArray8[this.anInt78++];
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "e", descriptor = "()I")
	public int method57() {
		this.anInt78 += 2;
		return ((this.aByteArray8[this.anInt78 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "f", descriptor = "()I")
	public int method58() {
		this.anInt78 += 2;
		@Pc(27) int local27 = ((this.aByteArray8[this.anInt78 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "g", descriptor = "()I")
	public int method59() {
		this.anInt78 += 3;
		return ((this.aByteArray8[this.anInt78 - 3] & 0xFF) << 16) + ((this.aByteArray8[this.anInt78 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "h", descriptor = "()I")
	public int method60() {
		this.anInt78 += 4;
		return ((this.aByteArray8[this.anInt78 - 4] & 0xFF) << 24) + ((this.aByteArray8[this.anInt78 - 3] & 0xFF) << 16) + ((this.aByteArray8[this.anInt78 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "e", descriptor = "(I)J")
	public long method61() {
		try {
			@Pc(12) long local12 = (long) this.method60() & 0xFFFFFFFFL;
			@Pc(18) long local18 = (long) this.method60() & 0xFFFFFFFFL;
			return (local12 << 32) + local18;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("56945, " + 3838 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "i", descriptor = "()Ljava/lang/String;")
	public String method62() {
		@Pc(2) int local2 = this.anInt78;
		while (this.aByteArray8[this.anInt78++] != 10) {
		}
		return new String(this.aByteArray8, local2, this.anInt78 - local2 - 1);
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(Z)[B")
	public byte[] method63() {
		try {
			@Pc(2) int local2 = this.anInt78;
			while (this.aByteArray8[this.anInt78++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt78 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt78 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray8[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("54471, " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(II[BI)V")
	public void method64(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				arg0[local11] = this.aByteArray8[this.anInt78++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("53817, " + 956 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(B)V")
	public void method65() {
		try {
			this.anInt79 = this.anInt78 * 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("35841, " + -36 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "(II)I")
	public int method66(@OriginalArg(0) int arg0) {
		try {
			@Pc(15) int local15 = this.anInt79 >> 3;
			@Pc(22) int local22 = 8 - (this.anInt79 & 0x7);
			@Pc(24) int local24 = 0;
			this.anInt79 += arg0;
			while (arg0 > local22) {
				local24 += (this.aByteArray8[local15++] & anIntArray15[local22]) << arg0 - local22;
				arg0 -= local22;
				local22 = 8;
			}
			if (arg0 == local22) {
				local24 += this.aByteArray8[local15] & anIntArray15[local22];
			} else {
				local24 += this.aByteArray8[local15] >> local22 - arg0 & anIntArray15[arg0];
			}
			return local24;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("48619, " + arg0 + ", " + -359 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "f", descriptor = "(I)V")
	public void method67(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt78 = (this.anInt79 + 7) / 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("72042, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "j", descriptor = "()I")
	public int method68() {
		@Pc(7) int local7 = this.aByteArray8[this.anInt78] & 0xFF;
		return local7 < 128 ? this.method55() - 64 : this.method57() - 49152;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "k", descriptor = "()I")
	public int method69() {
		@Pc(7) int local7 = this.aByteArray8[this.anInt78] & 0xFF;
		return local7 < 128 ? this.method55() : this.method57() - 32768;
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method70(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt78;
			this.anInt78 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method64(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt78 = 0;
			this.method45(local27.length);
			this.method53(local27, local27.length);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("58990, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(IB)V")
	public void method71(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != this.aByte4) {
				this.anInt70 = 181;
			}
			this.aByteArray8[this.anInt78++] = (byte) (arg0 + 128);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("65580, " + arg0 + ", " + arg1 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(IB)V")
	public void method72(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray8[this.anInt78++] = (byte) (128 - arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("76883, " + arg0 + ", " + 51 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(Z)I")
	public int method73() {
		try {
			return this.aByteArray8[this.anInt78++] - 128 & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("45101, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(B)I")
	public int method74(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return -this.aByteArray8[this.anInt78++] & 0xFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("45630, " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(Z)I")
	public int method75() {
		try {
			return 128 - this.aByteArray8[this.anInt78++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("74386, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(B)B")
	public byte method76() {
		try {
			if (this.aByte5 != 4) {
				this.anInt76 = 349;
			}
			return (byte) (this.aByteArray8[this.anInt78++] - 128);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("71917, " + 4 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "(B)B")
	public byte method77() {
		try {
			return (byte) -this.aByteArray8[this.anInt78++];
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("12281, " + 7 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "e", descriptor = "(B)B")
	public byte method78(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != 2) {
				this.anInt71 = -401;
			}
			return (byte) (128 - this.aByteArray8[this.anInt78++]);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("90715, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "e", descriptor = "(II)V")
	public void method79(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray8[this.anInt78++] = (byte) arg0;
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("12204, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "f", descriptor = "(II)V")
	public void method80(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 + 128);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("85898, " + arg0 + ", " + 0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "g", descriptor = "(II)V")
	public void method81(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray8[this.anInt78++] = (byte) (arg0 + 128);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("95149, " + arg0 + ", " + -7774 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "g", descriptor = "(I)I")
	public int method82() {
		try {
			this.anInt78 += 2;
			return ((this.aByteArray8[this.anInt78 - 1] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 2] & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("67279, " + -474 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "h", descriptor = "(I)I")
	public int method83() {
		try {
			this.anInt78 += 2;
			return ((this.aByteArray8[this.anInt78 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 1] - 128 & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("20129, " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "i", descriptor = "(I)I")
	public int method84() {
		try {
			this.anInt78 += 2;
			return ((this.aByteArray8[this.anInt78 - 1] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 2] - 128 & 0xFF);
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("10446, " + 2 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "f", descriptor = "(B)I")
	public int method85(@OriginalArg(0) byte arg0) {
		try {
			this.anInt78 += 2;
			@Pc(29) int local29 = ((this.aByteArray8[this.anInt78 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 1] - 128 & 0xFF);
			if (arg0 != 6) {
				this.anInt69 = -39;
			}
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("35689, " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "j", descriptor = "(I)I")
	public int method86() {
		try {
			this.anInt78 += 3;
			return ((this.aByteArray8[this.anInt78 - 2] & 0xFF) << 16) + ((this.aByteArray8[this.anInt78 - 3] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 1] & 0xFF);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("35007, " + 17447 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "c", descriptor = "(IB)V")
	public void method87(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 8);
			this.aByteArray8[this.anInt78++] = (byte) arg0;
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 24);
			this.aByteArray8[this.anInt78++] = (byte) (arg0 >> 16);
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("59965, " + arg0 + ", " + -74 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "d", descriptor = "(Z)I")
	public int method88() {
		try {
			this.anInt78 += 4;
			return ((this.aByteArray8[this.anInt78 - 1] & 0xFF) << 24) + ((this.aByteArray8[this.anInt78 - 2] & 0xFF) << 16) + ((this.aByteArray8[this.anInt78 - 3] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 4] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("86107, " + false + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "k", descriptor = "(I)I")
	public int method89(@OriginalArg(0) int arg0) {
		try {
			this.anInt78 += 4;
			return arg0 == -39668 ? ((this.aByteArray8[this.anInt78 - 3] & 0xFF) << 24) + ((this.aByteArray8[this.anInt78 - 4] & 0xFF) << 16) + ((this.aByteArray8[this.anInt78 - 1] & 0xFF) << 8) + (this.aByteArray8[this.anInt78 - 2] & 0xFF) : this.anInt71;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("12314, " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "a", descriptor = "(BI[BI)V")
	public void method90(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(17) int local17 = arg0 + 0 - 1; local17 >= 0; local17--) {
				this.aByteArray8[this.anInt78++] = (byte) (arg1[local17] + 128);
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("29929, " + 6 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CMGGUSPR", name = "b", descriptor = "(II[BI)V")
	public void method91(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(9) int local9 = arg0 + 0 - 1; local9 >= 0; local9--) {
				arg1[local9] = (byte) (this.aByteArray8[this.anInt78++] - 128);
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("98573, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
