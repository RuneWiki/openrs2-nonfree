import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BSNPYLEV")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!BSNPYLEV", name = "G", descriptor = "I")
	private static int anInt83;

	@OriginalMember(owner = "client!BSNPYLEV", name = "H", descriptor = "I")
	private static int anInt84;

	@OriginalMember(owner = "client!BSNPYLEV", name = "I", descriptor = "I")
	private static int anInt85;

	@OriginalMember(owner = "client!BSNPYLEV", name = "i", descriptor = "I")
	private static int anInt72 = 908;

	@OriginalMember(owner = "client!BSNPYLEV", name = "D", descriptor = "[I")
	private static int[] anIntArray11 = new int[256];

	@OriginalMember(owner = "client!BSNPYLEV", name = "E", descriptor = "[I")
	private static final int[] anIntArray12;

	@OriginalMember(owner = "client!BSNPYLEV", name = "J", descriptor = "Lclient!FEIPMYNH;")
	private static Class13 aClass13_1;

	@OriginalMember(owner = "client!BSNPYLEV", name = "K", descriptor = "Lclient!FEIPMYNH;")
	private static Class13 aClass13_2;

	@OriginalMember(owner = "client!BSNPYLEV", name = "L", descriptor = "Lclient!FEIPMYNH;")
	private static Class13 aClass13_3;

	@OriginalMember(owner = "client!BSNPYLEV", name = "M", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!BSNPYLEV", name = "l", descriptor = "I")
	private int anInt73;

	@OriginalMember(owner = "client!BSNPYLEV", name = "n", descriptor = "I")
	private int anInt75;

	@OriginalMember(owner = "client!BSNPYLEV", name = "A", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!BSNPYLEV", name = "B", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!BSNPYLEV", name = "C", descriptor = "I")
	public int anInt82;

	@OriginalMember(owner = "client!BSNPYLEV", name = "F", descriptor = "Lclient!XXMIBCTG;")
	public Class46 aClass46_1;

	@OriginalMember(owner = "client!BSNPYLEV", name = "j", descriptor = "B")
	private byte aByte12 = 3;

	@OriginalMember(owner = "client!BSNPYLEV", name = "k", descriptor = "Z")
	private boolean aBoolean43 = false;

	@OriginalMember(owner = "client!BSNPYLEV", name = "m", descriptor = "I")
	private int anInt74 = -457;

	@OriginalMember(owner = "client!BSNPYLEV", name = "o", descriptor = "I")
	private int anInt76 = 910;

	@OriginalMember(owner = "client!BSNPYLEV", name = "p", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!BSNPYLEV", name = "q", descriptor = "B")
	private byte aByte13 = 4;

	@OriginalMember(owner = "client!BSNPYLEV", name = "r", descriptor = "Z")
	private boolean aBoolean45 = true;

	@OriginalMember(owner = "client!BSNPYLEV", name = "s", descriptor = "I")
	private int anInt77 = 531;

	@OriginalMember(owner = "client!BSNPYLEV", name = "t", descriptor = "B")
	private byte aByte14 = 8;

	@OriginalMember(owner = "client!BSNPYLEV", name = "u", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!BSNPYLEV", name = "v", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!BSNPYLEV", name = "w", descriptor = "I")
	private int anInt78 = -26531;

	@OriginalMember(owner = "client!BSNPYLEV", name = "x", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!BSNPYLEV", name = "y", descriptor = "I")
	private int anInt79 = -48151;

	@OriginalMember(owner = "client!BSNPYLEV", name = "z", descriptor = "I")
	private int anInt80 = 939;

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
			anIntArray11[local6] = local9;
		}
		anIntArray12 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass13_1 = new Class13(true);
		aClass13_2 = new Class13(true);
		aClass13_3 = new Class13(true);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(II)Lclient!BSNPYLEV;")
	public static Class2_Sub1_Sub2 method82() {
		try {
			@Pc(3) Class13 local3 = aClass13_2;
			synchronized (aClass13_2) {
				@Pc(7) Class2_Sub1_Sub2 local7 = null;
				if (anInt84 > 0) {
					anInt84--;
					local7 = (Class2_Sub1_Sub2) aClass13_2.method199();
				}
				if (local7 != null) {
					local7.anInt81 = 0;
					return local7;
				}
			}
			@Pc(69) Class2_Sub1_Sub2 local69 = new Class2_Sub1_Sub2((byte) 0);
			local69.anInt81 = 0;
			local69.aByteArray1 = new byte[5000];
			return local69;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("76574, " + 1 + ", " + 908 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "<init>", descriptor = "(B)V")
	private Class2_Sub1_Sub2(@OriginalArg(0) byte arg0) {
		try {
			@Pc(50) boolean local50 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("57418, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "<init>", descriptor = "([BB)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 == this.aByte12) {
				@Pc(52) boolean local52 = false;
			} else {
				this.aBoolean46 = !this.aBoolean46;
			}
			this.aByteArray1 = arg0;
			this.anInt81 = 0;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("26597, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(ZI)V")
	public void method83(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) (arg0 + this.aClass46_1.method558());
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("82718, " + true + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(I)V")
	public void method84(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt81++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "b", descriptor = "(I)V")
	public void method85(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt81++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "b", descriptor = "(II)V")
	public void method86(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) arg0;
			this.aByteArray1[this.anInt81++] = 0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("46722, " + 0 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "c", descriptor = "(I)V")
	public void method87(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt81++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "d", descriptor = "(I)V")
	public void method88(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 24);
		this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt81++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "c", descriptor = "(II)V")
	public void method89(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) arg0;
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 16);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("92686, " + -5475 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(JI)V")
	public void method90(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 56);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 48);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 40);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 32);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 24);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 16);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt81++] = (byte) arg0;
		} catch (@Pc(135) RuntimeException local135) {
			signlink.reporterror("60111, " + arg0 + ", " + 3 + ", " + local135.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method91(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray1, this.anInt81);
		this.anInt81 += arg0.length();
		this.aByteArray1[this.anInt81++] = 10;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(III[B)V")
	public void method92(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				this.aByteArray1[this.anInt81++] = arg1[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("69083, " + 0 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "d", descriptor = "(II)V")
	public void method93(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt81 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("29247, " + 5 + ", " + arg0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "c", descriptor = "()I")
	public int method94() {
		return this.aByteArray1[this.anInt81++] & 0xFF;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "d", descriptor = "()B")
	public byte method95() {
		return this.aByteArray1[this.anInt81++];
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "e", descriptor = "()I")
	public int method96() {
		this.anInt81 += 2;
		return ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "f", descriptor = "()I")
	public int method97() {
		this.anInt81 += 2;
		@Pc(27) int local27 = ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "g", descriptor = "()I")
	public int method98() {
		this.anInt81 += 3;
		return ((this.aByteArray1[this.anInt81 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "h", descriptor = "()I")
	public int method99() {
		this.anInt81 += 4;
		return ((this.aByteArray1[this.anInt81 - 4] & 0xFF) << 24) + ((this.aByteArray1[this.anInt81 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(B)J")
	public long method100() {
		try {
			@Pc(5) long local5 = (long) this.method99() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method99() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("59159, " + 51 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "i", descriptor = "()Ljava/lang/String;")
	public String method101() {
		@Pc(2) int local2 = this.anInt81;
		while (this.aByteArray1[this.anInt81++] != 10) {
		}
		return new String(this.aByteArray1, local2, this.anInt81 - local2 - 1);
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "b", descriptor = "(B)[B")
	public byte[] method102(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) int local4 = this.anInt81;
			while (this.aByteArray1[this.anInt81++] != 10) {
			}
			@Pc(25) byte[] local25 = new byte[this.anInt81 - local4 - 1];
			@Pc(30) boolean local30 = false;
			for (@Pc(36) int local36 = local4; local36 < this.anInt81 - 1; local36++) {
				local25[local36 - local4] = this.aByteArray1[local36];
			}
			return local25;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("56060, " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(I[BII)V")
	private void method103(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			if (arg0 < 0) {
				for (@Pc(4) int local4 = 0; local4 < arg2 + 0; local4++) {
					arg1[local4] = this.aByteArray1[this.anInt81++];
				}
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("60565, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "e", descriptor = "(I)V")
	public void method104() {
		try {
			this.anInt82 = this.anInt81 * 8;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("44092, " + -322 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "e", descriptor = "(II)I")
	public int method105(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(10) int local10 = this.anInt82 >> 3;
			@Pc(17) int local17 = 8 - (this.anInt82 & 0x7);
			@Pc(19) int local19 = 0;
			this.anInt82 += arg0;
			while (arg0 > local17) {
				local19 += (this.aByteArray1[local10++] & anIntArray12[local17]) << arg0 - local17;
				arg0 -= local17;
				local17 = 8;
			}
			if (arg0 == local17) {
				local19 += this.aByteArray1[local10] & anIntArray12[local17];
			} else {
				local19 += this.aByteArray1[local10] >> local17 - arg0 & anIntArray12[arg0];
			}
			return local19;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("1479, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "f", descriptor = "(I)V")
	public void method106() {
		try {
			this.anInt81 = (this.anInt82 + 7) / 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("49135, " + 0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "j", descriptor = "()I")
	public int method107() {
		@Pc(7) int local7 = this.aByteArray1[this.anInt81] & 0xFF;
		return local7 < 128 ? this.method94() - 64 : this.method96() - 49152;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "k", descriptor = "()I")
	public int method108() {
		@Pc(7) int local7 = this.aByteArray1[this.anInt81] & 0xFF;
		return local7 < 128 ? this.method94() : this.method96() - 32768;
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method109(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) BigInteger arg2) {
		try {
			@Pc(2) int local2 = this.anInt81;
			this.anInt81 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method103(this.anInt74, local8, local2);
			@Pc(20) BigInteger local20 = new BigInteger(local8);
			@Pc(25) BigInteger local25 = local20.modPow(arg2, arg0);
			@Pc(28) byte[] local28 = local25.toByteArray();
			this.anInt81 = 0;
			this.method84(local28.length);
			if (!arg1) {
				this.aBoolean46 = !this.aBoolean46;
			}
			this.method92(local28.length, local28);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("20121, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "f", descriptor = "(II)V")
	public void method110(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aByteArray1[this.anInt81++] = (byte) (arg1 + 128);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("76855, " + arg0 + ", " + arg1 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(IZ)V")
	public void method111(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) -arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("43501, " + arg0 + ", " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "g", descriptor = "(I)I")
	public int method112() {
		try {
			return this.aByteArray1[this.anInt81++] - 128 & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("89212, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "h", descriptor = "(I)I")
	public int method113() {
		try {
			return -this.aByteArray1[this.anInt81++] & 0xFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("6068, " + 2 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "i", descriptor = "(I)I")
	public int method114() {
		try {
			return 128 - this.aByteArray1[this.anInt81++] & 0xFF;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("1753, " + -48149 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "c", descriptor = "(B)B")
	public byte method115() {
		try {
			return (byte) (this.aByteArray1[this.anInt81++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("65792, " + -77 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "j", descriptor = "(I)B")
	public byte method116() {
		try {
			return (byte) (128 - this.aByteArray1[this.anInt81++]);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("83332, " + 37923 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "g", descriptor = "(II)V")
	public void method117(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) arg0;
			@Pc(15) boolean local15 = true;
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("67913, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "h", descriptor = "(II)V")
	public void method118(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 + 128);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("80238, " + arg0 + ", " + 607 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(IB)V")
	public void method119(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) (arg0 + 128);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("18453, " + arg0 + ", " + 2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "k", descriptor = "(I)I")
	public int method120() {
		try {
			this.anInt81 += 2;
			return ((this.aByteArray1[this.anInt81 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 2] & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("79526, " + 6 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "d", descriptor = "(B)I")
	public int method121() {
		try {
			this.anInt81 += 2;
			return ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("97830, " + -99 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(Z)I")
	public int method122() {
		try {
			this.anInt81 += 2;
			return ((this.aByteArray1[this.anInt81 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 2] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("8766, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "l", descriptor = "(I)I")
	public int method123() {
		try {
			this.anInt81 += 2;
			@Pc(27) int local27 = ((this.aByteArray1[this.anInt81 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("34932, " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "e", descriptor = "(B)I")
	public int method124(@OriginalArg(0) byte arg0) {
		try {
			this.anInt81 += 2;
			@Pc(29) int local29 = ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 1] - 128 & 0xFF);
			if (this.aByte13 == 4) {
				@Pc(35) boolean local35 = false;
			} else {
				this.aBoolean44 = !this.aBoolean44;
			}
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("431, " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "b", descriptor = "(Z)I")
	public int method125() {
		try {
			this.anInt81 += 3;
			return ((this.aByteArray1[this.anInt81 - 1] & 0xFF) << 16) + ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 3] & 0xFF);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("90894, " + false + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "i", descriptor = "(II)V")
	public void method126(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt81++] = (byte) arg0;
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 16);
			this.aByteArray1[this.anInt81++] = (byte) (arg0 >> 24);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("92034, " + -779 + ", " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "f", descriptor = "(B)I")
	public int method127() {
		try {
			this.anInt81 += 4;
			return ((this.aByteArray1[this.anInt81 - 1] & 0xFF) << 24) + ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 16) + ((this.aByteArray1[this.anInt81 - 3] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 4] & 0xFF);
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("96166, " + 1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "g", descriptor = "(B)I")
	public int method128() {
		try {
			this.anInt81 += 4;
			return ((this.aByteArray1[this.anInt81 - 2] & 0xFF) << 24) + ((this.aByteArray1[this.anInt81 - 1] & 0xFF) << 16) + ((this.aByteArray1[this.anInt81 - 4] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 3] & 0xFF);
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("91069, " + -12 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "m", descriptor = "(I)I")
	public int method129() {
		try {
			this.anInt81 += 4;
			return ((this.aByteArray1[this.anInt81 - 3] & 0xFF) << 24) + ((this.aByteArray1[this.anInt81 - 4] & 0xFF) << 16) + ((this.aByteArray1[this.anInt81 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt81 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("42735, " + 7 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(IIZ[B)V")
	public void method130(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				this.aByteArray1[this.anInt81++] = (byte) (arg1[local4] + 128);
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("30644, " + arg0 + ", " + 0 + ", " + true + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "(II[BI)V")
	public void method131(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(9) int local9 = arg0 + 0 - 1; local9 >= 0; local9--) {
				arg2[local9] = this.aByteArray1[this.anInt81++];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("4294, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BSNPYLEV", name = "a", descriptor = "([BIBI)V")
	public void method132(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte arg2) {
		try {
			if (this.aByte14 == 8) {
				@Pc(7) boolean local7 = false;
			} else {
				this.anInt78 = 288;
			}
			for (@Pc(18) int local18 = arg1 + 0 - 1; local18 >= 0; local18--) {
				arg0[local18] = (byte) (this.aByteArray1[this.anInt81++] - 128);
			}
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("74023, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}
}
