import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!XJCNBMKS")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!XJCNBMKS", name = "D", descriptor = "I")
	private static int anInt808;

	@OriginalMember(owner = "client!XJCNBMKS", name = "E", descriptor = "I")
	private static int anInt809;

	@OriginalMember(owner = "client!XJCNBMKS", name = "F", descriptor = "I")
	private static int anInt810;

	@OriginalMember(owner = "client!XJCNBMKS", name = "i", descriptor = "I")
	private static int anInt798 = -127;

	@OriginalMember(owner = "client!XJCNBMKS", name = "A", descriptor = "[I")
	private static int[] anIntArray205;

	@OriginalMember(owner = "client!XJCNBMKS", name = "B", descriptor = "[I")
	private static final int[] anIntArray206;

	@OriginalMember(owner = "client!XJCNBMKS", name = "G", descriptor = "Lclient!EWLVMFRK;")
	private static Class13 aClass13_7;

	@OriginalMember(owner = "client!XJCNBMKS", name = "H", descriptor = "Lclient!EWLVMFRK;")
	private static Class13 aClass13_8;

	@OriginalMember(owner = "client!XJCNBMKS", name = "I", descriptor = "Lclient!EWLVMFRK;")
	private static Class13 aClass13_9;

	@OriginalMember(owner = "client!XJCNBMKS", name = "J", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "client!XJCNBMKS", name = "x", descriptor = "[B")
	public byte[] aByteArray19;

	@OriginalMember(owner = "client!XJCNBMKS", name = "y", descriptor = "I")
	public int anInt806;

	@OriginalMember(owner = "client!XJCNBMKS", name = "z", descriptor = "I")
	public int anInt807;

	@OriginalMember(owner = "client!XJCNBMKS", name = "C", descriptor = "Lclient!ADZBQDSQ;")
	public Class2 aClass2_1;

	@OriginalMember(owner = "client!XJCNBMKS", name = "j", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!XJCNBMKS", name = "k", descriptor = "I")
	private int anInt799 = -16211;

	@OriginalMember(owner = "client!XJCNBMKS", name = "l", descriptor = "B")
	private byte aByte40 = 6;

	@OriginalMember(owner = "client!XJCNBMKS", name = "m", descriptor = "I")
	private int anInt800 = -879;

	@OriginalMember(owner = "client!XJCNBMKS", name = "n", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!XJCNBMKS", name = "o", descriptor = "I")
	private int anInt801 = 4;

	@OriginalMember(owner = "client!XJCNBMKS", name = "p", descriptor = "B")
	private byte aByte41 = 8;

	@OriginalMember(owner = "client!XJCNBMKS", name = "q", descriptor = "I")
	private int anInt802 = 2;

	@OriginalMember(owner = "client!XJCNBMKS", name = "r", descriptor = "I")
	private int anInt803 = 22736;

	@OriginalMember(owner = "client!XJCNBMKS", name = "s", descriptor = "I")
	private int anInt804 = -862;

	@OriginalMember(owner = "client!XJCNBMKS", name = "t", descriptor = "B")
	private byte aByte42 = 10;

	@OriginalMember(owner = "client!XJCNBMKS", name = "u", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!XJCNBMKS", name = "w", descriptor = "I")
	private int anInt805 = 6;

	static {
		aBoolean175 = true;
		anIntArray205 = new int[256];
		for (@Pc(8) int local8 = 0; local8 < 256; local8++) {
			@Pc(11) int local11 = local8;
			for (@Pc(13) int local13 = 0; local13 < 8; local13++) {
				if ((local11 & 0x1) == 1) {
					local11 = local11 >>> 1 ^ 0xEDB88320;
				} else {
					local11 >>>= 0x1;
				}
			}
			anIntArray205[local8] = local11;
		}
		anIntArray206 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass13_7 = new Class13(aBoolean175);
		aClass13_8 = new Class13(aBoolean175);
		aClass13_9 = new Class13(aBoolean175);
		aCharArray4 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(II)Lclient!XJCNBMKS;")
	public static Class1_Sub1_Sub3 method486() {
		try {
			@Pc(3) Class13 local3 = aClass13_8;
			synchronized (aClass13_8) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt809 > 0) {
					anInt809--;
					local7 = (Class1_Sub1_Sub3) aClass13_8.method110();
				}
				if (local7 != null) {
					local7.anInt806 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3((byte) -48);
			local69.anInt806 = 0;
			local69.aByteArray19 = new byte[5000];
			return local69;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("55345, " + 1 + ", " + -127 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "<init>", descriptor = "(B)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "<init>", descriptor = "(B[B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray19 = arg1;
			this.anInt806 = 0;
			@Pc(51) boolean local51 = false;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("59900, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "b", descriptor = "(II)V")
	public void method487(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) (arg0 + this.aClass2_1.method13());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("90403, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(I)V")
	public void method488(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt806++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "b", descriptor = "(I)V")
	public void method489(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt806++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(IB)V")
	public void method490(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) arg0;
			this.aByteArray19[this.anInt806++] = 0;
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("19730, " + arg0 + ", " + 1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "c", descriptor = "(I)V")
	public void method491(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt806++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "d", descriptor = "(I)V")
	public void method492(@OriginalArg(0) int arg0) {
		this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 24);
		this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 16);
		this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 8);
		this.aByteArray19[this.anInt806++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "c", descriptor = "(II)V")
	public void method493(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) arg0;
			this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 8);
			this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 16);
			this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 24);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("60440, " + 0 + ", " + arg0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(IJ)V")
	public void method494(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) (arg1 >> 56);
			this.aByteArray19[this.anInt806++] = (byte) (arg1 >> 48);
			this.aByteArray19[this.anInt806++] = (byte) (arg1 >> 40);
			this.aByteArray19[this.anInt806++] = (byte) (arg1 >> 32);
			@Pc(65) boolean local65 = false;
			this.aByteArray19[this.anInt806++] = (byte) (arg1 >> 24);
			this.aByteArray19[this.anInt806++] = (byte) (arg1 >> 16);
			this.aByteArray19[this.anInt806++] = (byte) (arg1 >> 8);
			this.aByteArray19[this.anInt806++] = (byte) arg1;
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("41193, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method495(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray19, this.anInt806);
		this.anInt806 += arg0.length();
		this.aByteArray19[this.anInt806++] = 10;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "([BIII)V")
	public void method496(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg1 + 0; local5++) {
				this.aByteArray19[this.anInt806++] = arg0[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("65699, " + arg0 + ", " + arg1 + ", " + 3 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "d", descriptor = "(II)V")
	public void method497(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray19[this.anInt806 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("99910, " + 737 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "c", descriptor = "()I")
	public int method498() {
		return this.aByteArray19[this.anInt806++] & 0xFF;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "d", descriptor = "()B")
	public byte method499() {
		return this.aByteArray19[this.anInt806++];
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "e", descriptor = "()I")
	public int method500() {
		this.anInt806 += 2;
		return ((this.aByteArray19[this.anInt806 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "f", descriptor = "()I")
	public int method501() {
		this.anInt806 += 2;
		@Pc(27) int local27 = ((this.aByteArray19[this.anInt806 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "g", descriptor = "()I")
	public int method502() {
		this.anInt806 += 3;
		return ((this.aByteArray19[this.anInt806 - 3] & 0xFF) << 16) + ((this.aByteArray19[this.anInt806 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "h", descriptor = "()I")
	public int method503() {
		this.anInt806 += 4;
		return ((this.aByteArray19[this.anInt806 - 4] & 0xFF) << 24) + ((this.aByteArray19[this.anInt806 - 3] & 0xFF) << 16) + ((this.aByteArray19[this.anInt806 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(Z)J")
	public long method504() {
		try {
			@Pc(5) long local5 = (long) this.method503() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method503() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("98976, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "i", descriptor = "()Ljava/lang/String;")
	public String method505() {
		@Pc(2) int local2 = this.anInt806;
		while (this.aByteArray19[this.anInt806++] != 10) {
		}
		return new String(this.aByteArray19, local2, this.anInt806 - local2 - 1);
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(B)[B")
	public byte[] method506(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) int local4 = this.anInt806;
			while (this.aByteArray19[this.anInt806++] != 10) {
			}
			@Pc(25) byte[] local25 = new byte[this.anInt806 - local4 - 1];
			@Pc(30) boolean local30 = false;
			for (@Pc(38) int local38 = local4; local38 < this.anInt806 - 1; local38++) {
				local25[local38 - local4] = this.aByteArray19[local38];
			}
			return local25;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("25320, " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(I[BII)V")
	private void method507(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				arg1[local4] = this.aByteArray19[this.anInt806++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("8126, " + arg0 + ", " + arg1 + ", " + 68 + ", " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "b", descriptor = "(B)V")
	public void method508(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt807 = this.anInt806 * 8;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("42059, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(ZI)I")
	public int method509(@OriginalArg(1) int arg0) {
		try {
			@Pc(11) int local11 = this.anInt807 >> 3;
			@Pc(18) int local18 = 8 - (this.anInt807 & 0x7);
			@Pc(20) int local20 = 0;
			this.anInt807 += arg0;
			while (arg0 > local18) {
				local20 += (this.aByteArray19[local11++] & anIntArray206[local18]) << arg0 - local18;
				arg0 -= local18;
				local18 = 8;
			}
			if (arg0 == local18) {
				local20 += this.aByteArray19[local11] & anIntArray206[local18];
			} else {
				local20 += this.aByteArray19[local11] >> local18 - arg0 & anIntArray206[arg0];
			}
			return local20;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("78383, " + true + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "e", descriptor = "(I)V")
	public void method510() {
		try {
			this.anInt806 = (this.anInt807 + 7) / 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("972, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "j", descriptor = "()I")
	public int method511() {
		@Pc(7) int local7 = this.aByteArray19[this.anInt806] & 0xFF;
		return local7 < 128 ? this.method498() - 64 : this.method500() - 49152;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "k", descriptor = "()I")
	public int method512() {
		@Pc(7) int local7 = this.aByteArray19[this.anInt806] & 0xFF;
		return local7 < 128 ? this.method498() : this.method500() - 32768;
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method513(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) BigInteger arg2) {
		try {
			@Pc(4) int local4 = this.anInt806;
			this.anInt806 = 0;
			@Pc(10) byte[] local10 = new byte[local4];
			this.method507(local4, local10);
			if (this.aByte41 == 8) {
				@Pc(22) boolean local22 = false;
			} else {
				for (@Pc(26) int local26 = 1; local26 > 0; local26++) {
				}
			}
			@Pc(36) BigInteger local36 = new BigInteger(local10);
			@Pc(41) BigInteger local41 = local36.modPow(arg0, arg2);
			@Pc(44) byte[] local44 = local41.toByteArray();
			this.anInt806 = 0;
			this.method488(local44.length);
			this.method496(local44, local44.length);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("67028, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "e", descriptor = "(II)V")
	public void method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 6) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			this.aByteArray19[this.anInt806++] = (byte) -arg1;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("31750, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "f", descriptor = "(II)V")
	public void method515(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) (128 - arg0);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("17908, " + arg0 + ", " + 47778 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "f", descriptor = "(I)I")
	public int method516() {
		try {
			if (this.anInt803 != 22736) {
				this.anInt805 = -484;
			}
			return this.aByteArray19[this.anInt806++] - 128 & 0xFF;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("61349, " + 22736 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "g", descriptor = "(I)I")
	public int method517() {
		try {
			return -this.aByteArray19[this.anInt806++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("60747, " + 3 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "c", descriptor = "(B)I")
	public int method518() {
		try {
			return 128 - this.aByteArray19[this.anInt806++] & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("45309, " + 112 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "h", descriptor = "(I)B")
	public byte method519(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt805 = 419;
			}
			return (byte) (128 - this.aByteArray19[this.anInt806++]);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("16630, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "g", descriptor = "(II)V")
	public void method520(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) arg1;
			this.aByteArray19[this.anInt806++] = (byte) (arg1 >> 8);
			@Pc(29) int local29 = 21 / arg0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("2399, " + arg0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "b", descriptor = "(IB)V")
	public void method521(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 8);
			this.aByteArray19[this.anInt806++] = (byte) (arg0 + 128);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("82835, " + arg0 + ", " + 60 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "c", descriptor = "(IB)V")
	public void method522(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) (arg0 + 128);
			this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 8);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("97836, " + arg0 + ", " + 7 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "i", descriptor = "(I)I")
	public int method523() {
		try {
			this.anInt806 += 2;
			return ((this.aByteArray19[this.anInt806 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 2] & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("40206, " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "j", descriptor = "(I)I")
	public int method524() {
		try {
			this.anInt806 += 2;
			return ((this.aByteArray19[this.anInt806 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 1] - 128 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("20816, " + -123 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "k", descriptor = "(I)I")
	public int method525() {
		try {
			this.anInt806 += 2;
			return ((this.aByteArray19[this.anInt806 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 2] - 128 & 0xFF);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("45564, " + -862 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "l", descriptor = "(I)I")
	public int method526() {
		try {
			this.anInt806 += 2;
			@Pc(27) int local27 = ((this.aByteArray19[this.anInt806 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("21088, " + 1 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "m", descriptor = "(I)I")
	public int method527() {
		try {
			this.anInt806 += 2;
			@Pc(39) int local39 = ((this.aByteArray19[this.anInt806 - 2] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 1] - 128 & 0xFF);
			if (local39 > 32767) {
				local39 -= 65536;
			}
			return local39;
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("21223, " + 0 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "b", descriptor = "(Z)I")
	public int method528() {
		try {
			this.anInt806 += 2;
			@Pc(34) int local34 = ((this.aByteArray19[this.anInt806 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 2] - 128 & 0xFF);
			if (local34 > 32767) {
				local34 -= 65536;
			}
			return local34;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("73374, " + false + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "h", descriptor = "(II)V")
	public void method529(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray19[this.anInt806++] = (byte) arg0;
			this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 8);
			this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 16);
			this.aByteArray19[this.anInt806++] = (byte) (arg0 >> 24);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("56462, " + -469 + ", " + arg0 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "d", descriptor = "(B)I")
	public int method530(@OriginalArg(0) byte arg0) {
		try {
			this.anInt806 += 4;
			@Pc(10) boolean local10 = false;
			return ((this.aByteArray19[this.anInt806 - 2] & 0xFF) << 24) + ((this.aByteArray19[this.anInt806 - 1] & 0xFF) << 16) + ((this.aByteArray19[this.anInt806 - 4] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 3] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("29371, " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "c", descriptor = "(Z)I")
	public int method531() {
		try {
			this.anInt806 += 4;
			return ((this.aByteArray19[this.anInt806 - 3] & 0xFF) << 24) + ((this.aByteArray19[this.anInt806 - 4] & 0xFF) << 16) + ((this.aByteArray19[this.anInt806 - 1] & 0xFF) << 8) + (this.aByteArray19[this.anInt806 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("97075, " + false + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "b", descriptor = "([BIII)V")
	public void method532(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(9) int local9 = arg1 + 0 - 1; local9 >= 0; local9--) {
				this.aByteArray19[this.anInt806++] = (byte) (arg0[local9] + 128);
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("30596, " + arg0 + ", " + 0 + ", " + -27280 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(I[BZI)V")
	public void method533(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1 + 0; local6++) {
				arg0[local6] = (byte) (this.aByteArray19[this.anInt806++] - 128);
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("31157, " + 0 + ", " + arg0 + ", " + false + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!XJCNBMKS", name = "a", descriptor = "(I[BBI)V")
	public void method534(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(9) int local9 = arg1 + 0 - 1; local9 >= 0; local9--) {
				arg0[local9] = (byte) (this.aByteArray19[this.anInt806++] - 128);
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("78181, " + 0 + ", " + arg0 + ", " + -54 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}
}
