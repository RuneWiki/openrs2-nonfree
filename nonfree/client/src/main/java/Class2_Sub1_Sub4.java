import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TKPFKOXP")
public final class Class2_Sub1_Sub4 extends Class2_Sub1 {

	@OriginalMember(owner = "client!TKPFKOXP", name = "C", descriptor = "I")
	private static int anInt674;

	@OriginalMember(owner = "client!TKPFKOXP", name = "D", descriptor = "I")
	private static int anInt675;

	@OriginalMember(owner = "client!TKPFKOXP", name = "E", descriptor = "I")
	private static int anInt676;

	@OriginalMember(owner = "client!TKPFKOXP", name = "o", descriptor = "I")
	private static int anInt670 = -137;

	@OriginalMember(owner = "client!TKPFKOXP", name = "z", descriptor = "[I")
	private static int[] anIntArray195 = new int[256];

	@OriginalMember(owner = "client!TKPFKOXP", name = "A", descriptor = "[I")
	private static final int[] anIntArray196;

	@OriginalMember(owner = "client!TKPFKOXP", name = "F", descriptor = "Lclient!SXQMCHPP;")
	private static Class38 aClass38_7;

	@OriginalMember(owner = "client!TKPFKOXP", name = "G", descriptor = "Lclient!SXQMCHPP;")
	private static Class38 aClass38_8;

	@OriginalMember(owner = "client!TKPFKOXP", name = "H", descriptor = "Lclient!SXQMCHPP;")
	private static Class38 aClass38_9;

	@OriginalMember(owner = "client!TKPFKOXP", name = "I", descriptor = "[C")
	private static char[] aCharArray2;

	@OriginalMember(owner = "client!TKPFKOXP", name = "w", descriptor = "[B")
	public byte[] aByteArray17;

	@OriginalMember(owner = "client!TKPFKOXP", name = "x", descriptor = "I")
	public int anInt672;

	@OriginalMember(owner = "client!TKPFKOXP", name = "y", descriptor = "I")
	public int anInt673;

	@OriginalMember(owner = "client!TKPFKOXP", name = "B", descriptor = "Lclient!FKXPJREN;")
	public Class13 aClass13_1;

	@OriginalMember(owner = "client!TKPFKOXP", name = "i", descriptor = "I")
	private int anInt666 = 8;

	@OriginalMember(owner = "client!TKPFKOXP", name = "j", descriptor = "I")
	private int anInt667 = -286;

	@OriginalMember(owner = "client!TKPFKOXP", name = "k", descriptor = "I")
	private int anInt668 = 924;

	@OriginalMember(owner = "client!TKPFKOXP", name = "l", descriptor = "I")
	private int anInt669 = 716;

	@OriginalMember(owner = "client!TKPFKOXP", name = "m", descriptor = "B")
	private byte aByte21 = 1;

	@OriginalMember(owner = "client!TKPFKOXP", name = "n", descriptor = "Z")
	private boolean aBoolean172 = false;

	@OriginalMember(owner = "client!TKPFKOXP", name = "p", descriptor = "I")
	private int anInt671 = -41034;

	@OriginalMember(owner = "client!TKPFKOXP", name = "q", descriptor = "B")
	private byte aByte22 = 0;

	@OriginalMember(owner = "client!TKPFKOXP", name = "r", descriptor = "B")
	private byte aByte23 = 2;

	@OriginalMember(owner = "client!TKPFKOXP", name = "s", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!TKPFKOXP", name = "t", descriptor = "Z")
	private boolean aBoolean174 = true;

	@OriginalMember(owner = "client!TKPFKOXP", name = "u", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!TKPFKOXP", name = "v", descriptor = "Z")
	private boolean aBoolean176 = false;

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
			anIntArray195[local6] = local9;
		}
		anIntArray196 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass38_7 = new Class38(5);
		aClass38_8 = new Class38(5);
		aClass38_9 = new Class38(5);
		aCharArray2 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(II)Lclient!TKPFKOXP;")
	public static Class2_Sub1_Sub4 method480() {
		try {
			@Pc(3) Class38 local3 = aClass38_8;
			synchronized (aClass38_8) {
				@Pc(7) Class2_Sub1_Sub4 local7 = null;
				if (anInt675 > 0) {
					anInt675--;
					local7 = (Class2_Sub1_Sub4) aClass38_8.method460();
				}
				if (local7 != null) {
					local7.anInt672 = 0;
					return local7;
				}
			}
			@Pc(69) Class2_Sub1_Sub4 local69 = new Class2_Sub1_Sub4(8);
			local69.anInt672 = 0;
			local69.aByteArray17 = new byte[5000];
			return local69;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("41747, " + 1 + ", " + 28934 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "<init>", descriptor = "(I)V")
	private Class2_Sub1_Sub4(@OriginalArg(0) int arg0) {
		try {
			if (arg0 < this.anInt666 || arg0 > this.anInt666) {
				for (@Pc(50) int local50 = 1; local50 > 0; local50++) {
				}
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("59242, " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "<init>", descriptor = "(I[B)V")
	public Class2_Sub1_Sub4(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			@Pc(44) int local44 = 14 / arg0;
			this.aByteArray17 = arg1;
			this.anInt672 = 0;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("67084, " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(IZ)V")
	public void method481(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) (arg0 + this.aClass13_1.method78());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("526, " + arg0 + ", " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(I)V")
	public void method482(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt672++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(I)V")
	public void method483(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt672++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(II)V")
	public void method484(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) arg0;
			this.aByteArray17[this.anInt672++] = 0;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("87236, " + arg0 + ", " + 454 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "(I)V")
	public void method485(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt672++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "(I)V")
	public void method486(@OriginalArg(0) int arg0) {
		this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 24);
		this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 16);
		this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 8);
		this.aByteArray17[this.anInt672++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(IB)V")
	public void method487(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) arg0;
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 16);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("73988, " + arg0 + ", " + 1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(JI)V")
	public void method488(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			while (arg1 >= 0) {
				this.aBoolean175 = !this.aBoolean175;
			}
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 56);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 48);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 40);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 32);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 24);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 16);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 8);
			this.aByteArray17[this.anInt672++] = (byte) arg0;
		} catch (@Pc(139) RuntimeException local139) {
			signlink.reporterror("3436, " + arg0 + ", " + arg1 + ", " + local139.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method489(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray17, this.anInt672);
		this.anInt672 += arg0.length();
		this.aByteArray17[this.anInt672++] = 10;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(I[BII)V")
	public void method490(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) int local3 = 31 / arg2;
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray17[this.anInt672++] = arg0[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("97057, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "(II)V")
	public void method491(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt672 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("24894, " + arg0 + ", " + 0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "()I")
	public int method492() {
		return this.aByteArray17[this.anInt672++] & 0xFF;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "()B")
	public byte method493() {
		return this.aByteArray17[this.anInt672++];
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "()I")
	public int method494() {
		this.anInt672 += 2;
		return ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "()I")
	public int method495() {
		this.anInt672 += 2;
		@Pc(27) int local27 = ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "g", descriptor = "()I")
	public int method496() {
		this.anInt672 += 3;
		return ((this.aByteArray17[this.anInt672 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "h", descriptor = "()I")
	public int method497() {
		this.anInt672 += 4;
		return ((this.aByteArray17[this.anInt672 - 4] & 0xFF) << 24) + ((this.aByteArray17[this.anInt672 - 3] & 0xFF) << 16) + ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(B)J")
	public long method498() {
		try {
			@Pc(5) long local5 = (long) this.method497() & 0xFFFFFFFFL;
			@Pc(18) long local18 = (long) this.method497() & 0xFFFFFFFFL;
			return (local5 << 32) + local18;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("92049, " + 37 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "i", descriptor = "()Ljava/lang/String;")
	public String method499() {
		@Pc(2) int local2 = this.anInt672;
		while (this.aByteArray17[this.anInt672++] != 10) {
		}
		return new String(this.aByteArray17, local2, this.anInt672 - local2 - 1);
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "(I)[B")
	public byte[] method500() {
		try {
			@Pc(2) int local2 = this.anInt672;
			while (this.aByteArray17[this.anInt672++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt672 - local2 - 1];
			for (@Pc(36) int local36 = local2; local36 < this.anInt672 - 1; local36++) {
				local23[local36 - local2] = this.aByteArray17[local36];
			}
			return local23;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("4979, " + -18933 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "([BIII)V")
	private void method501(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1 + 0; local12++) {
				arg0[local12] = this.aByteArray17[this.anInt672++];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("30632, " + arg0 + ", " + 0 + ", " + arg1 + ", " + -16823 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(B)V")
	public void method502(@OriginalArg(0) byte arg0) {
		try {
			this.anInt673 = this.anInt672 * 8;
			@Pc(10) boolean local10 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("80856, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(IZ)I")
	public int method503(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt673 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt673 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt673 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray17[local6++] & anIntArray196[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray17[local6] & anIntArray196[local13];
			} else {
				local15 += this.aByteArray17[local6] >> local13 - arg0 & anIntArray196[arg0];
			}
			return local15;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("48879, " + arg0 + ", " + true + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "(I)V")
	public void method504() {
		try {
			this.anInt672 = (this.anInt673 + 7) / 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("69952, " + 7 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "j", descriptor = "()I")
	public int method505() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt672] & 0xFF;
		return local7 < 128 ? this.method492() - 64 : this.method494() - 49152;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "k", descriptor = "()I")
	public int method506() {
		@Pc(7) int local7 = this.aByteArray17[this.anInt672] & 0xFF;
		return local7 < 128 ? this.method492() : this.method494() - 32768;
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method507(@OriginalArg(0) byte arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
		try {
			@Pc(2) int local2 = this.anInt672;
			this.anInt672 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method501(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg2);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt672 = 0;
			this.method482(local27.length);
			this.method490(local27, local27.length, this.anInt668);
			@Pc(47) boolean local47 = false;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("31764, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(BI)V")
	public void method508(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) -arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("88018, " + -53 + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "(II)V")
	public void method509(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) (128 - arg0);
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("32401, " + arg0 + ", " + 4 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "(B)I")
	public int method510(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 != -24) {
				this.aBoolean174 = !this.aBoolean174;
			}
			return this.aByteArray17[this.anInt672++] - 128 & 0xFF;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("84564, " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "g", descriptor = "(I)I")
	public int method511(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			return -this.aByteArray17[this.anInt672++] & 0xFF;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("70457, " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "h", descriptor = "(I)I")
	public int method512() {
		try {
			return 128 - this.aByteArray17[this.anInt672++] & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("17360, " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "(B)B")
	public byte method513() {
		try {
			return (byte) (this.aByteArray17[this.anInt672++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("39991, " + 84 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "(B)B")
	public byte method514() {
		try {
			return (byte) -this.aByteArray17[this.anInt672++];
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("99924, " + 23 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "(B)B")
	public byte method515() {
		try {
			return (byte) (128 - this.aByteArray17[this.anInt672++]);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("95249, " + 8 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "(II)V")
	public void method516(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) arg0;
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 8);
			@Pc(29) boolean local29 = false;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("42626, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(BI)V")
	public void method517(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) (arg1 >> 8);
			this.aByteArray17[this.anInt672++] = (byte) (arg1 + 128);
			if (arg0 != 18) {
				for (@Pc(32) int local32 = 1; local32 > 0; local32++) {
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("23701, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "(II)V")
	public void method518(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) (arg0 + 128);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 8);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("78118, " + arg0 + ", " + 5 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(Z)I")
	public int method519() {
		try {
			this.anInt672 += 2;
			return ((this.aByteArray17[this.anInt672 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 2] & 0xFF);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("75428, " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "b", descriptor = "(Z)I")
	public int method520() {
		try {
			this.anInt672 += 2;
			return ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 1] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("59059, " + false + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "g", descriptor = "(B)I")
	public int method521() {
		try {
			this.anInt672 += 2;
			return ((this.aByteArray17[this.anInt672 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 2] - 128 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("44889, " + 74 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "c", descriptor = "(Z)I")
	public int method522() {
		try {
			this.anInt672 += 2;
			@Pc(32) int local32 = ((this.aByteArray17[this.anInt672 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 2] & 0xFF);
			if (local32 > 32767) {
				local32 -= 65536;
			}
			return local32;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("93164, " + true + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "d", descriptor = "(Z)I")
	public int method523(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt672 += 2;
			@Pc(29) int local29 = ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 1] - 128 & 0xFF);
			if (!arg0) {
				this.anInt669 = -486;
			}
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("95920, " + arg0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "i", descriptor = "(I)I")
	public int method524() {
		try {
			this.anInt672 += 2;
			@Pc(33) int local33 = ((this.aByteArray17[this.anInt672 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 2] - 128 & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("76764, " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "e", descriptor = "(Z)I")
	public int method525() {
		try {
			this.anInt672 += 3;
			return ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 16) + ((this.aByteArray17[this.anInt672 - 3] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 1] & 0xFF);
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("55450, " + false + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "g", descriptor = "(II)V")
	public void method526(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 16);
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 24);
			this.aByteArray17[this.anInt672++] = (byte) arg0;
			this.aByteArray17[this.anInt672++] = (byte) (arg0 >> 8);
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("54073, " + -104 + ", " + arg0 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "j", descriptor = "(I)I")
	public int method527() {
		try {
			this.anInt672 += 4;
			return ((this.aByteArray17[this.anInt672 - 1] & 0xFF) << 24) + ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 16) + ((this.aByteArray17[this.anInt672 - 3] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 4] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("68817, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "f", descriptor = "(Z)I")
	public int method528() {
		try {
			this.anInt672 += 4;
			return ((this.aByteArray17[this.anInt672 - 2] & 0xFF) << 24) + ((this.aByteArray17[this.anInt672 - 1] & 0xFF) << 16) + ((this.aByteArray17[this.anInt672 - 4] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 3] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("57026, " + true + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "h", descriptor = "(B)I")
	public int method529() {
		try {
			this.anInt672 += 4;
			return ((this.aByteArray17[this.anInt672 - 3] & 0xFF) << 24) + ((this.aByteArray17[this.anInt672 - 4] & 0xFF) << 16) + ((this.aByteArray17[this.anInt672 - 1] & 0xFF) << 8) + (this.aByteArray17[this.anInt672 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("89319, " + 112 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TKPFKOXP", name = "a", descriptor = "(II[BI)V")
	public void method530(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(17) int local17 = arg1 + 0 - 1; local17 >= 0; local17--) {
				arg0[local17] = this.aByteArray17[this.anInt672++];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("76370, " + 7 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}
}
