import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CFARFRSG")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!CFARFRSG", name = "K", descriptor = "I")
	private static int anInt155;

	@OriginalMember(owner = "client!CFARFRSG", name = "L", descriptor = "I")
	private static int anInt156;

	@OriginalMember(owner = "client!CFARFRSG", name = "M", descriptor = "I")
	private static int anInt157;

	@OriginalMember(owner = "client!CFARFRSG", name = "k", descriptor = "I")
	private static int anInt141 = 5;

	@OriginalMember(owner = "client!CFARFRSG", name = "C", descriptor = "I")
	private static int anInt152 = -524;

	@OriginalMember(owner = "client!CFARFRSG", name = "H", descriptor = "[I")
	private static int[] anIntArray18 = new int[256];

	@OriginalMember(owner = "client!CFARFRSG", name = "I", descriptor = "[I")
	private static final int[] anIntArray19;

	@OriginalMember(owner = "client!CFARFRSG", name = "N", descriptor = "Lclient!CLCMCMIN;")
	private static Class7 aClass7_1;

	@OriginalMember(owner = "client!CFARFRSG", name = "O", descriptor = "Lclient!CLCMCMIN;")
	private static Class7 aClass7_2;

	@OriginalMember(owner = "client!CFARFRSG", name = "P", descriptor = "Lclient!CLCMCMIN;")
	private static Class7 aClass7_3;

	@OriginalMember(owner = "client!CFARFRSG", name = "Q", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!CFARFRSG", name = "E", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!CFARFRSG", name = "F", descriptor = "I")
	public int anInt153;

	@OriginalMember(owner = "client!CFARFRSG", name = "G", descriptor = "I")
	public int anInt154;

	@OriginalMember(owner = "client!CFARFRSG", name = "J", descriptor = "Lclient!QKKVGPGN;")
	public Class37 aClass37_1;

	@OriginalMember(owner = "client!CFARFRSG", name = "l", descriptor = "I")
	private int anInt142 = 344;

	@OriginalMember(owner = "client!CFARFRSG", name = "m", descriptor = "I")
	private int anInt143 = 3;

	@OriginalMember(owner = "client!CFARFRSG", name = "n", descriptor = "I")
	private int anInt144 = -11820;

	@OriginalMember(owner = "client!CFARFRSG", name = "o", descriptor = "B")
	private byte aByte3 = 9;

	@OriginalMember(owner = "client!CFARFRSG", name = "p", descriptor = "B")
	private byte aByte4 = -32;

	@OriginalMember(owner = "client!CFARFRSG", name = "q", descriptor = "I")
	private int anInt145 = -482;

	@OriginalMember(owner = "client!CFARFRSG", name = "r", descriptor = "Z")
	private boolean aBoolean30 = true;

	@OriginalMember(owner = "client!CFARFRSG", name = "s", descriptor = "I")
	private int anInt146 = -164;

	@OriginalMember(owner = "client!CFARFRSG", name = "t", descriptor = "I")
	private int anInt147 = 743;

	@OriginalMember(owner = "client!CFARFRSG", name = "u", descriptor = "B")
	private byte aByte5 = 89;

	@OriginalMember(owner = "client!CFARFRSG", name = "v", descriptor = "Z")
	private boolean aBoolean31 = false;

	@OriginalMember(owner = "client!CFARFRSG", name = "w", descriptor = "I")
	private int anInt148 = 887;

	@OriginalMember(owner = "client!CFARFRSG", name = "x", descriptor = "B")
	private byte aByte6 = 4;

	@OriginalMember(owner = "client!CFARFRSG", name = "y", descriptor = "I")
	private int anInt149 = -642;

	@OriginalMember(owner = "client!CFARFRSG", name = "z", descriptor = "I")
	private int anInt150 = -962;

	@OriginalMember(owner = "client!CFARFRSG", name = "A", descriptor = "B")
	private byte aByte7 = 1;

	@OriginalMember(owner = "client!CFARFRSG", name = "B", descriptor = "I")
	private int anInt151 = -658;

	@OriginalMember(owner = "client!CFARFRSG", name = "D", descriptor = "Z")
	private boolean aBoolean32 = false;

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
			anIntArray18[local8] = local11;
		}
		anIntArray19 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass7_1 = new Class7(anInt152);
		aClass7_2 = new Class7(anInt152);
		aClass7_3 = new Class7(anInt152);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(II)Lclient!CFARFRSG;")
	public static Class1_Sub1_Sub2 method47() {
		try {
			if (anInt141 != 5) {
				for (@Pc(6) int local6 = 1; local6 > 0; local6++) {
				}
			}
			@Pc(13) Class7 local13 = aClass7_2;
			synchronized (aClass7_2) {
				@Pc(17) Class1_Sub1_Sub2 local17 = null;
				if (anInt156 > 0) {
					anInt156--;
					local17 = (Class1_Sub1_Sub2) aClass7_2.method99();
				}
				if (local17 != null) {
					local17.anInt153 = 0;
					return local17;
				}
			}
			@Pc(79) Class1_Sub1_Sub2 local79 = new Class1_Sub1_Sub2(753);
			local79.anInt153 = 0;
			local79.aByteArray1 = new byte[5000];
			return local79;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("48701, " + 1 + ", " + 5 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub2(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray1 = arg0;
			@Pc(62) int local62 = 30 / arg1;
			this.anInt153 = 0;
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("57821, " + arg0 + ", " + arg1 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "b", descriptor = "(II)V")
	public void method48(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt153++] = (byte) (arg0 + this.aClass37_1.method431());
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("70937, " + arg0 + ", " + 687 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(I)V")
	public void method49(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt153++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "b", descriptor = "(I)V")
	public void method50(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt153++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(IZ)V")
	public void method51(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt153++] = (byte) arg0;
			this.aByteArray1[this.anInt153++] = 0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("68060, " + arg0 + ", " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "c", descriptor = "(I)V")
	public void method52(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt153++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "d", descriptor = "(I)V")
	public void method53(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 24);
		this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt153++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "c", descriptor = "(II)V")
	public void method54(@OriginalArg(1) int arg0) {
		try {
			if (this.anInt143 > 3 || this.anInt143 < 3) {
				for (@Pc(9) int local9 = 1; local9 > 0; local9++) {
				}
			}
			this.aByteArray1[this.anInt153++] = (byte) arg0;
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 16);
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 24);
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("73163, " + 3 + ", " + arg0 + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(BJ)V")
	public void method55(@OriginalArg(0) byte arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray1[this.anInt153++] = (byte) (arg1 >> 56);
			this.aByteArray1[this.anInt153++] = (byte) (arg1 >> 48);
			this.aByteArray1[this.anInt153++] = (byte) (arg1 >> 40);
			this.aByteArray1[this.anInt153++] = (byte) (arg1 >> 32);
			this.aByteArray1[this.anInt153++] = (byte) (arg1 >> 24);
			this.aByteArray1[this.anInt153++] = (byte) (arg1 >> 16);
			this.aByteArray1[this.anInt153++] = (byte) (arg1 >> 8);
			@Pc(111) boolean local111 = false;
			this.aByteArray1[this.anInt153++] = (byte) arg1;
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("10827, " + arg0 + ", " + arg1 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method56(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray1, this.anInt153);
		this.anInt153 += arg0.length();
		this.aByteArray1[this.anInt153++] = 10;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(III[B)V")
	public void method57(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			if (this.anInt144 != -11820) {
				this.anInt143 = 279;
			}
			for (@Pc(8) int local8 = 0; local8 < arg0 + 0; local8++) {
				this.aByteArray1[this.anInt153++] = arg1[local8];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("85597, " + 0 + ", " + arg0 + ", " + -11820 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "b", descriptor = "(IZ)V")
	public void method58(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt153 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("64651, " + arg0 + ", " + false + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "c", descriptor = "()I")
	public int method59() {
		return this.aByteArray1[this.anInt153++] & 0xFF;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "d", descriptor = "()B")
	public byte method60() {
		return this.aByteArray1[this.anInt153++];
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "e", descriptor = "()I")
	public int method61() {
		this.anInt153 += 2;
		return ((this.aByteArray1[this.anInt153 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "f", descriptor = "()I")
	public int method62() {
		this.anInt153 += 2;
		@Pc(27) int local27 = ((this.aByteArray1[this.anInt153 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "g", descriptor = "()I")
	public int method63() {
		this.anInt153 += 3;
		return ((this.aByteArray1[this.anInt153 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt153 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "h", descriptor = "()I")
	public int method64() {
		this.anInt153 += 4;
		return ((this.aByteArray1[this.anInt153 - 4] & 0xFF) << 24) + ((this.aByteArray1[this.anInt153 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt153 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(B)J")
	public long method65() {
		try {
			@Pc(5) long local5 = (long) this.method64() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method64() & 0xFFFFFFFFL;
			return (local5 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("79135, " + -111 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "i", descriptor = "()Ljava/lang/String;")
	public String method66() {
		@Pc(2) int local2 = this.anInt153;
		while (this.aByteArray1[this.anInt153++] != 10) {
		}
		return new String(this.aByteArray1, local2, this.anInt153 - local2 - 1);
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "b", descriptor = "(B)[B")
	public byte[] method67() {
		try {
			@Pc(2) int local2 = this.anInt153;
			while (this.aByteArray1[this.anInt153++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt153 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt153 - 1; local31++) {
				local23[local31 - local2] = this.aByteArray1[local31];
			}
			return local23;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("39783, " + 5 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "b", descriptor = "(III[B)V")
	public void method68(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				arg1[local4] = this.aByteArray1[this.anInt153++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("47668, " + arg0 + ", " + 0 + ", " + 0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "e", descriptor = "(I)V")
	public void method69() {
		try {
			this.anInt154 = this.anInt153 * 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("2066, " + 2 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "d", descriptor = "(II)I")
	public int method70(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = this.anInt154 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt154 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt154 += arg1;
			@Pc(25) boolean local25 = false;
			while (arg1 > local13) {
				local15 += (this.aByteArray1[local6++] & anIntArray19[local13]) << arg1 - local13;
				arg1 -= local13;
				local13 = 8;
			}
			if (arg1 == local13) {
				local15 += this.aByteArray1[local6] & anIntArray19[local13];
			} else {
				local15 += this.aByteArray1[local6] >> local13 - arg1 & anIntArray19[arg1];
			}
			return local15;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("6231, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "f", descriptor = "(I)V")
	public void method71() {
		try {
			this.anInt153 = (this.anInt154 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("88748, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "j", descriptor = "()I")
	public int method72() {
		@Pc(7) int local7 = this.aByteArray1[this.anInt153] & 0xFF;
		return local7 < 128 ? this.method59() - 64 : this.method61() - 49152;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "k", descriptor = "()I")
	public int method73() {
		@Pc(7) int local7 = this.aByteArray1[this.anInt153] & 0xFF;
		return local7 < 128 ? this.method59() : this.method61() - 32768;
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method74(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) BigInteger arg2) {
		try {
			@Pc(2) int local2 = this.anInt153;
			this.anInt153 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method68(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg2, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt153 = 0;
			@Pc(35) boolean local35 = false;
			this.method49(local27.length);
			this.method57(local27.length, local27);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("51229, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "e", descriptor = "(II)V")
	public void method75(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt153++] = (byte) (arg0 + 128);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("93035, " + arg0 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(IB)V")
	public void method76(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt153++] = (byte) -arg0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("29687, " + arg0 + ", " + 3 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "f", descriptor = "(II)V")
	public void method77(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aByteArray1[this.anInt153++] = (byte) (128 - arg1);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("8534, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "g", descriptor = "(I)I")
	public int method78(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return this.aByteArray1[this.anInt153++] - 128 & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("98985, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "c", descriptor = "(B)I")
	public int method79() {
		try {
			return -this.aByteArray1[this.anInt153++] & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("10004, " + 70 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "h", descriptor = "(I)I")
	public int method80() {
		try {
			return 128 - this.aByteArray1[this.anInt153++] & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("83587, " + 11818 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(Z)B")
	public byte method81() {
		try {
			return (byte) (this.aByteArray1[this.anInt153++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("61634, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "d", descriptor = "(B)B")
	public byte method82(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte6 != 4) {
				throw new NullPointerException();
			}
			@Pc(5) boolean local5 = false;
			return (byte) (128 - this.aByteArray1[this.anInt153++]);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("69474, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "c", descriptor = "(IZ)V")
	public void method83(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt153++] = (byte) arg0;
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("68769, " + arg0 + ", " + true + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "g", descriptor = "(II)V")
	public void method84(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt153++] = (byte) (arg0 + 128);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("6958, " + 0 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "h", descriptor = "(II)V")
	public void method85(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aByteArray1[this.anInt153++] = (byte) (arg0 + 128);
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 8);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("23135, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "e", descriptor = "(B)I")
	public int method86(@OriginalArg(0) byte arg0) {
		try {
			this.anInt153 += 2;
			@Pc(10) boolean local10 = false;
			return ((this.aByteArray1[this.anInt153 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 2] & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("39276, " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "i", descriptor = "(I)I")
	public int method87(@OriginalArg(0) int arg0) {
		try {
			this.anInt153 += 2;
			@Pc(9) boolean local9 = false;
			return ((this.aByteArray1[this.anInt153 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 1] - 128 & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("80145, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "j", descriptor = "(I)I")
	public int method88(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				return 4;
			} else {
				this.anInt153 += 2;
				return ((this.aByteArray1[this.anInt153 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 2] - 128 & 0xFF);
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("23340, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "b", descriptor = "(Z)I")
	public int method89() {
		try {
			this.anInt153 += 2;
			@Pc(36) int local36 = ((this.aByteArray1[this.anInt153 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 2] & 0xFF);
			if (local36 > 32767) {
				local36 -= 65536;
			}
			return local36;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("96742, " + true + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "k", descriptor = "(I)I")
	public int method90() {
		try {
			this.anInt153 += 2;
			@Pc(42) int local42 = ((this.aByteArray1[this.anInt153 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 1] - 128 & 0xFF);
			if (local42 > 32767) {
				local42 -= 65536;
			}
			return local42;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("52658, " + 9 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "l", descriptor = "(I)I")
	public int method91() {
		try {
			this.anInt153 += 3;
			return ((this.aByteArray1[this.anInt153 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt153 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 2] & 0xFF);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("68783, " + -642 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "i", descriptor = "(II)V")
	public void method92(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 16);
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 24);
			this.aByteArray1[this.anInt153++] = (byte) arg0;
			this.aByteArray1[this.anInt153++] = (byte) (arg0 >> 8);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("11093, " + -504 + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "c", descriptor = "(Z)I")
	public int method93() {
		try {
			this.anInt153 += 4;
			return ((this.aByteArray1[this.anInt153 - 1] & 0xFF) << 24) + ((this.aByteArray1[this.anInt153 - 2] & 0xFF) << 16) + ((this.aByteArray1[this.anInt153 - 3] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 4] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("95733, " + false + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "m", descriptor = "(I)I")
	public int method94(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.aBoolean30 = !this.aBoolean30;
			}
			this.anInt153 += 4;
			return ((this.aByteArray1[this.anInt153 - 3] & 0xFF) << 24) + ((this.aByteArray1[this.anInt153 - 4] & 0xFF) << 16) + ((this.aByteArray1[this.anInt153 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt153 - 2] & 0xFF);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("36729, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "(I[BIZ)V")
	public void method95(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg0 + 0; local12++) {
				this.aByteArray1[this.anInt153++] = (byte) (arg1[local12] + 128);
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("69397, " + arg0 + ", " + arg1 + ", " + 0 + ", " + false + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CFARFRSG", name = "a", descriptor = "([BIII)V")
	public void method96(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				arg0[local4] = (byte) (this.aByteArray1[this.anInt153++] - 128);
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("28620, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}
}
