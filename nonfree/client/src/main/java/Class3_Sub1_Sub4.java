import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WNCFPLWV")
public final class Class3_Sub1_Sub4 extends Class3_Sub1 {

	@OriginalMember(owner = "client!WNCFPLWV", name = "i", descriptor = "I")
	private static int anInt660;

	@OriginalMember(owner = "client!WNCFPLWV", name = "q", descriptor = "Z")
	private static boolean aBoolean154;

	@OriginalMember(owner = "client!WNCFPLWV", name = "D", descriptor = "I")
	private static int anInt668;

	@OriginalMember(owner = "client!WNCFPLWV", name = "E", descriptor = "I")
	private static int anInt669;

	@OriginalMember(owner = "client!WNCFPLWV", name = "F", descriptor = "I")
	private static int anInt670;

	@OriginalMember(owner = "client!WNCFPLWV", name = "t", descriptor = "B")
	private static byte aByte33 = -126;

	@OriginalMember(owner = "client!WNCFPLWV", name = "A", descriptor = "[I")
	private static int[] anIntArray172 = new int[256];

	@OriginalMember(owner = "client!WNCFPLWV", name = "B", descriptor = "[I")
	private static final int[] anIntArray173;

	@OriginalMember(owner = "client!WNCFPLWV", name = "G", descriptor = "Lclient!WAPMJSJO;")
	private static Class44 aClass44_7;

	@OriginalMember(owner = "client!WNCFPLWV", name = "H", descriptor = "Lclient!WAPMJSJO;")
	private static Class44 aClass44_8;

	@OriginalMember(owner = "client!WNCFPLWV", name = "I", descriptor = "Lclient!WAPMJSJO;")
	private static Class44 aClass44_9;

	@OriginalMember(owner = "client!WNCFPLWV", name = "J", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "client!WNCFPLWV", name = "h", descriptor = "I")
	private int anInt659;

	@OriginalMember(owner = "client!WNCFPLWV", name = "x", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!WNCFPLWV", name = "y", descriptor = "I")
	public int anInt666;

	@OriginalMember(owner = "client!WNCFPLWV", name = "z", descriptor = "I")
	public int anInt667;

	@OriginalMember(owner = "client!WNCFPLWV", name = "C", descriptor = "Lclient!KDQJDBED;")
	public Class21 aClass21_1;

	@OriginalMember(owner = "client!WNCFPLWV", name = "j", descriptor = "I")
	private int anInt661 = -8256;

	@OriginalMember(owner = "client!WNCFPLWV", name = "k", descriptor = "B")
	private byte aByte30 = 12;

	@OriginalMember(owner = "client!WNCFPLWV", name = "l", descriptor = "B")
	private byte aByte31 = 96;

	@OriginalMember(owner = "client!WNCFPLWV", name = "m", descriptor = "I")
	private int anInt662 = 8;

	@OriginalMember(owner = "client!WNCFPLWV", name = "n", descriptor = "B")
	private byte aByte32 = 24;

	@OriginalMember(owner = "client!WNCFPLWV", name = "o", descriptor = "I")
	private int anInt663 = 8;

	@OriginalMember(owner = "client!WNCFPLWV", name = "p", descriptor = "I")
	private int anInt664 = 673;

	@OriginalMember(owner = "client!WNCFPLWV", name = "r", descriptor = "I")
	private int anInt665 = 5;

	@OriginalMember(owner = "client!WNCFPLWV", name = "s", descriptor = "Z")
	private boolean aBoolean155 = true;

	@OriginalMember(owner = "client!WNCFPLWV", name = "u", descriptor = "Z")
	private boolean aBoolean156 = true;

	@OriginalMember(owner = "client!WNCFPLWV", name = "v", descriptor = "Z")
	private boolean aBoolean157 = false;

	@OriginalMember(owner = "client!WNCFPLWV", name = "w", descriptor = "Z")
	private boolean aBoolean158 = true;

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
			anIntArray172[local6] = local9;
		}
		anIntArray173 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass44_7 = new Class44(aByte33);
		aClass44_8 = new Class44(aByte33);
		aClass44_9 = new Class44(aByte33);
		aCharArray4 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(II)Lclient!WNCFPLWV;")
	public static Class3_Sub1_Sub4 method446() {
		try {
			@Pc(3) Class44 local3 = aClass44_8;
			synchronized (aClass44_8) {
				@Pc(7) Class3_Sub1_Sub4 local7 = null;
				if (anInt669 > 0) {
					anInt669--;
					local7 = (Class3_Sub1_Sub4) aClass44_8.method438();
				}
				if (local7 != null) {
					local7.anInt666 = 0;
					return local7;
				}
			}
			@Pc(77) Class3_Sub1_Sub4 local77 = new Class3_Sub1_Sub4(false);
			local77.anInt666 = 0;
			local77.aByteArray20 = new byte[5000];
			return local77;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("59292, " + 1 + ", " + 0 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "<init>", descriptor = "(Z)V")
	private Class3_Sub1_Sub4(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "<init>", descriptor = "(B[B)V")
	public Class3_Sub1_Sub4(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray20 = arg1;
			this.anInt666 = 0;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("68129, " + arg0 + ", " + arg1 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(IB)V")
	public void method447(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) (arg0 + this.aClass21_1.method235());
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("8616, " + arg0 + ", " + -80 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(I)V")
	public void method448(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt666++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(I)V")
	public void method449(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt666++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(II)V")
	public void method450(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) arg0;
			this.aByteArray20[this.anInt666++] = 0;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("13478, " + 2 + ", " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "(I)V")
	public void method451(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt666++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "(I)V")
	public void method452(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt666++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "(II)V")
	public void method453(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) arg0;
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 16);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("55729, " + 824 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(IJ)V")
	public void method454(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 56);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 48);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 40);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 32);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 24);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 16);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt666++] = (byte) arg0;
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("76440, " + 0 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method455(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray20, this.anInt666);
		this.anInt666 += arg0.length();
		this.aByteArray20[this.anInt666++] = 10;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(BI[BI)V")
	public void method456(@OriginalArg(0) byte arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 != 96) {
				this.anInt659 = 165;
			}
			for (@Pc(7) int local7 = 0; local7 < arg2 + 0; local7++) {
				this.aByteArray20[this.anInt666++] = arg1[local7];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("95636, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "(II)V")
	public void method457(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt666 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("91654, " + arg0 + ", " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "()I")
	public int method458() {
		return this.aByteArray20[this.anInt666++] & 0xFF;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "()B")
	public byte method459() {
		return this.aByteArray20[this.anInt666++];
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "e", descriptor = "()I")
	public int method460() {
		this.anInt666 += 2;
		return ((this.aByteArray20[this.anInt666 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "f", descriptor = "()I")
	public int method461() {
		this.anInt666 += 2;
		@Pc(27) int local27 = ((this.aByteArray20[this.anInt666 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "g", descriptor = "()I")
	public int method462() {
		this.anInt666 += 3;
		return ((this.aByteArray20[this.anInt666 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt666 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "h", descriptor = "()I")
	public int method463() {
		this.anInt666 += 4;
		return ((this.aByteArray20[this.anInt666 - 4] & 0xFF) << 24) + ((this.aByteArray20[this.anInt666 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt666 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(B)J")
	public long method464() {
		try {
			@Pc(5) long local5 = (long) this.method463() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method463() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("94155, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "i", descriptor = "()Ljava/lang/String;")
	public String method465() {
		@Pc(2) int local2 = this.anInt666;
		while (this.aByteArray20[this.anInt666++] != 10) {
		}
		return new String(this.aByteArray20, local2, this.anInt666 - local2 - 1);
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "e", descriptor = "(I)[B")
	public byte[] method466() {
		try {
			@Pc(9) int local9 = this.anInt666;
			while (this.aByteArray20[this.anInt666++] != 10) {
			}
			@Pc(30) byte[] local30 = new byte[this.anInt666 - local9 - 1];
			for (@Pc(32) int local32 = local9; local32 < this.anInt666 - 1; local32++) {
				local30[local32 - local9] = this.aByteArray20[local32];
			}
			return local30;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("29015, " + -34529 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(IIB[B)V")
	private void method467(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				arg1[local5] = this.aByteArray20[this.anInt666++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("77625, " + 0 + ", " + arg0 + ", " + 7 + ", " + arg1 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "f", descriptor = "(I)V")
	public void method468(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt667 = this.anInt666 * 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("6965, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "e", descriptor = "(II)I")
	public int method469(@OriginalArg(0) int arg0) {
		try {
			@Pc(11) int local11 = this.anInt667 >> 3;
			@Pc(18) int local18 = 8 - (this.anInt667 & 0x7);
			@Pc(20) int local20 = 0;
			this.anInt667 += arg0;
			while (arg0 > local18) {
				local20 += (this.aByteArray20[local11++] & anIntArray173[local18]) << arg0 - local18;
				arg0 -= local18;
				local18 = 8;
			}
			if (arg0 == local18) {
				local20 += this.aByteArray20[local11] & anIntArray173[local18];
			} else {
				local20 += this.aByteArray20[local11] >> local18 - arg0 & anIntArray173[arg0];
			}
			return local20;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("93107, " + arg0 + ", " + 0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "g", descriptor = "(I)V")
	public void method470() {
		try {
			this.anInt666 = (this.anInt667 + 7) / 8;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("79356, " + -18093 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "j", descriptor = "()I")
	public int method471() {
		@Pc(7) int local7 = this.aByteArray20[this.anInt666] & 0xFF;
		return local7 < 128 ? this.method458() - 64 : this.method460() - 49152;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "k", descriptor = "()I")
	public int method472() {
		@Pc(7) int local7 = this.aByteArray20[this.anInt666] & 0xFF;
		return local7 < 128 ? this.method458() : this.method460() - 32768;
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(ZLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method473(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt666;
			this.anInt666 = 0;
			@Pc(11) byte[] local11 = new byte[local2];
			this.method467(local2, local11);
			@Pc(22) BigInteger local22 = new BigInteger(local11);
			@Pc(27) BigInteger local27 = local22.modPow(arg0, arg1);
			@Pc(30) byte[] local30 = local27.toByteArray();
			this.anInt666 = 0;
			this.method448(local30.length);
			this.method456(this.aByte31, local30, local30.length);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("11937, " + true + ", " + arg0 + ", " + arg1 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(ZI)V")
	public void method474(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) -arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("40809, " + true + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "f", descriptor = "(II)V")
	public void method475(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) (128 - arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("66434, " + arg0 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "h", descriptor = "(I)I")
	public int method476() {
		try {
			return this.aByteArray20[this.anInt666++] - 128 & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("89623, " + -37135 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(Z)I")
	public int method477() {
		try {
			return -this.aByteArray20[this.anInt666++] & 0xFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("97858, " + true + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "i", descriptor = "(I)I")
	public int method478() {
		try {
			return 128 - this.aByteArray20[this.anInt666++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("26746, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(B)B")
	public byte method479() {
		try {
			return (byte) (this.aByteArray20[this.anInt666++] - 128);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("86817, " + 115 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(Z)B")
	public byte method480() {
		try {
			return (byte) -this.aByteArray20[this.anInt666++];
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("33849, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "j", descriptor = "(I)B")
	public byte method481() {
		try {
			return (byte) (128 - this.aByteArray20[this.anInt666++]);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("68801, " + -17575 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "g", descriptor = "(II)V")
	public void method482(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) arg0;
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("42735, " + 3 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "h", descriptor = "(II)V")
	public void method483(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 + 128);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("71431, " + arg0 + ", " + 7 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(BI)V")
	public void method484(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) (arg1 + 128);
			this.aByteArray20[this.anInt666++] = (byte) (arg1 >> 8);
			@Pc(32) boolean local32 = false;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("93232, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "(B)I")
	public int method485(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt666 += 2;
			return ((this.aByteArray20[this.anInt666 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 2] & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("96470, " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "k", descriptor = "(I)I")
	public int method486(@OriginalArg(0) int arg0) {
		try {
			this.anInt666 += 2;
			@Pc(9) boolean local9 = false;
			return ((this.aByteArray20[this.anInt666 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 1] - 128 & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("46851, " + arg0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "l", descriptor = "(I)I")
	public int method487() {
		try {
			this.anInt666 += 2;
			return ((this.aByteArray20[this.anInt666 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("49858, " + 4 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "(B)I")
	public int method488(@OriginalArg(0) byte arg0) {
		try {
			this.anInt666 += 2;
			@Pc(29) int local29 = ((this.aByteArray20[this.anInt666 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 1] - 128 & 0xFF);
			@Pc(34) boolean local34 = false;
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("63732, " + arg0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "c", descriptor = "(Z)I")
	public int method489() {
		try {
			this.anInt666 += 2;
			@Pc(33) int local33 = ((this.aByteArray20[this.anInt666 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 2] - 128 & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("2950, " + true + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "d", descriptor = "(Z)I")
	public int method490() {
		try {
			this.anInt666 += 3;
			return ((this.aByteArray20[this.anInt666 - 2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt666 - 3] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 1] & 0xFF);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("98162, " + true + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "b", descriptor = "(IB)V")
	public void method491(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 16);
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 24);
			this.aByteArray20[this.anInt666++] = (byte) arg0;
			this.aByteArray20[this.anInt666++] = (byte) (arg0 >> 8);
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("76571, " + arg0 + ", " + 76 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "m", descriptor = "(I)I")
	public int method492() {
		try {
			this.anInt666 += 4;
			return ((this.aByteArray20[this.anInt666 - 1] & 0xFF) << 24) + ((this.aByteArray20[this.anInt666 - 2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt666 - 3] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 4] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("44659, " + -445 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "n", descriptor = "(I)I")
	public int method493(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				return 0;
			} else {
				this.anInt666 += 4;
				return ((this.aByteArray20[this.anInt666 - 3] & 0xFF) << 24) + ((this.aByteArray20[this.anInt666 - 4] & 0xFF) << 16) + ((this.aByteArray20[this.anInt666 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt666 - 2] & 0xFF);
			}
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("829, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(IZI[B)V")
	public void method494(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(10) int local10 = arg0 + 0 - 1; local10 >= 0; local10--) {
				arg1[local10] = this.aByteArray20[this.anInt666++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("60858, " + 0 + ", " + false + ", " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WNCFPLWV", name = "a", descriptor = "(III[B)V")
	public void method495(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(11) int local11 = arg0 + 0 - 1; local11 >= 0; local11--) {
				arg1[local11] = (byte) (this.aByteArray20[this.anInt666++] - 128);
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("25814, " + 0 + ", " + arg0 + ", " + 7 + ", " + arg1 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}
}
