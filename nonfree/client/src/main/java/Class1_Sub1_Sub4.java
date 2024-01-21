import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!SVWJKJVI")
public final class Class1_Sub1_Sub4 extends Class1_Sub1 {

	@OriginalMember(owner = "client!SVWJKJVI", name = "F", descriptor = "I")
	private static int anInt626;

	@OriginalMember(owner = "client!SVWJKJVI", name = "G", descriptor = "I")
	private static int anInt627;

	@OriginalMember(owner = "client!SVWJKJVI", name = "H", descriptor = "I")
	private static int anInt628;

	@OriginalMember(owner = "client!SVWJKJVI", name = "C", descriptor = "[I")
	private static int[] anIntArray177 = new int[256];

	@OriginalMember(owner = "client!SVWJKJVI", name = "D", descriptor = "[I")
	private static final int[] anIntArray178;

	@OriginalMember(owner = "client!SVWJKJVI", name = "I", descriptor = "Lclient!ETMNPRAF;")
	private static Class8 aClass8_7;

	@OriginalMember(owner = "client!SVWJKJVI", name = "J", descriptor = "Lclient!ETMNPRAF;")
	private static Class8 aClass8_8;

	@OriginalMember(owner = "client!SVWJKJVI", name = "K", descriptor = "Lclient!ETMNPRAF;")
	private static Class8 aClass8_9;

	@OriginalMember(owner = "client!SVWJKJVI", name = "L", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "client!SVWJKJVI", name = "z", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!SVWJKJVI", name = "A", descriptor = "I")
	public int anInt624;

	@OriginalMember(owner = "client!SVWJKJVI", name = "B", descriptor = "I")
	public int anInt625;

	@OriginalMember(owner = "client!SVWJKJVI", name = "E", descriptor = "Lclient!OPLZBITI;")
	public Class26 aClass26_1;

	@OriginalMember(owner = "client!SVWJKJVI", name = "h", descriptor = "I")
	private int anInt618 = -836;

	@OriginalMember(owner = "client!SVWJKJVI", name = "i", descriptor = "B")
	private byte aByte17 = -10;

	@OriginalMember(owner = "client!SVWJKJVI", name = "j", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!SVWJKJVI", name = "k", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!SVWJKJVI", name = "l", descriptor = "B")
	private byte aByte18 = 3;

	@OriginalMember(owner = "client!SVWJKJVI", name = "m", descriptor = "B")
	private byte aByte19 = 1;

	@OriginalMember(owner = "client!SVWJKJVI", name = "n", descriptor = "I")
	private int anInt619 = 9;

	@OriginalMember(owner = "client!SVWJKJVI", name = "o", descriptor = "I")
	private int anInt620 = 6;

	@OriginalMember(owner = "client!SVWJKJVI", name = "p", descriptor = "Z")
	private boolean aBoolean139 = true;

	@OriginalMember(owner = "client!SVWJKJVI", name = "q", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!SVWJKJVI", name = "r", descriptor = "Z")
	private boolean aBoolean141 = false;

	@OriginalMember(owner = "client!SVWJKJVI", name = "s", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!SVWJKJVI", name = "t", descriptor = "Z")
	private boolean aBoolean143 = false;

	@OriginalMember(owner = "client!SVWJKJVI", name = "u", descriptor = "Z")
	private boolean aBoolean144 = true;

	@OriginalMember(owner = "client!SVWJKJVI", name = "v", descriptor = "I")
	private int anInt621 = 2;

	@OriginalMember(owner = "client!SVWJKJVI", name = "w", descriptor = "I")
	private int anInt622 = -12340;

	@OriginalMember(owner = "client!SVWJKJVI", name = "x", descriptor = "Z")
	private boolean aBoolean145 = true;

	@OriginalMember(owner = "client!SVWJKJVI", name = "y", descriptor = "I")
	private int anInt623 = -43582;

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
			anIntArray177[local4] = local7;
		}
		anIntArray178 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass8_7 = new Class8(0);
		aClass8_8 = new Class8(0);
		aClass8_9 = new Class8(0);
		aCharArray4 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(ZI)Lclient!SVWJKJVI;")
	public static Class1_Sub1_Sub4 method393() {
		try {
			@Pc(3) Class8 local3 = aClass8_8;
			synchronized (aClass8_8) {
				@Pc(7) Class1_Sub1_Sub4 local7 = null;
				if (anInt627 > 0) {
					anInt627--;
					local7 = (Class1_Sub1_Sub4) aClass8_8.method45();
				}
				if (local7 != null) {
					local7.anInt624 = 0;
					return local7;
				}
			}
			@Pc(78) Class1_Sub1_Sub4 local78 = new Class1_Sub1_Sub4(true);
			local78.anInt624 = 0;
			local78.aByteArray16 = new byte[5000];
			return local78;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("87325, " + false + ", " + 1 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "<init>", descriptor = "(Z)V")
	private Class1_Sub1_Sub4(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "<init>", descriptor = "([BZ)V")
	public Class1_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray16 = arg0;
			this.anInt624 = 0;
		} catch (@Pc(68) RuntimeException local68) {
			signlink.reporterror("99711, " + arg0 + ", " + arg1 + ", " + local68.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(II)V")
	public void method394(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt624++] = (byte) (arg0 + this.aClass26_1.method290());
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("78557, " + 7 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(I)V")
	public void method395(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt624++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(I)V")
	public void method396(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt624++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(IB)V")
	public void method397(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt624++] = (byte) arg0;
			this.aByteArray16[this.anInt624++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("3689, " + arg0 + ", " + -42 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(I)V")
	public void method398(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt624++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "d", descriptor = "(I)V")
	public void method399(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt624++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(II)V")
	public void method400(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt624++] = (byte) arg0;
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 8);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 16);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 24);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("98687, " + 3 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(JI)V")
	public void method401(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 56);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 48);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 40);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 32);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 24);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 16);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 8);
			this.aByteArray16[this.anInt624++] = (byte) arg0;
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("21430, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method402(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray16, this.anInt624);
		this.anInt624 += arg0.length();
		this.aByteArray16[this.anInt624++] = 10;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(I[BBI)V")
	public void method403(@OriginalArg(1) byte[] arg0, @OriginalArg(2) byte arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) int local6;
			if (arg1 != -10) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = 0; local6 < arg2 + 0; local6++) {
				this.aByteArray16[this.anInt624++] = arg0[local6];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("73776, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(ZI)V")
	public void method404(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt624 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("73377, " + true + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "()I")
	public int method405() {
		return this.aByteArray16[this.anInt624++] & 0xFF;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "d", descriptor = "()B")
	public byte method406() {
		return this.aByteArray16[this.anInt624++];
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "e", descriptor = "()I")
	public int method407() {
		this.anInt624 += 2;
		return ((this.aByteArray16[this.anInt624 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "f", descriptor = "()I")
	public int method408() {
		this.anInt624 += 2;
		@Pc(27) int local27 = ((this.aByteArray16[this.anInt624 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "g", descriptor = "()I")
	public int method409() {
		this.anInt624 += 3;
		return ((this.aByteArray16[this.anInt624 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt624 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "h", descriptor = "()I")
	public int method410() {
		this.anInt624 += 4;
		return ((this.aByteArray16[this.anInt624 - 4] & 0xFF) << 24) + ((this.aByteArray16[this.anInt624 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt624 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(B)J")
	public long method411() {
		try {
			@Pc(5) long local5 = (long) this.method410() & 0xFFFFFFFFL;
			@Pc(22) long local22 = (long) this.method410() & 0xFFFFFFFFL;
			return (local5 << 32) + local22;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("26721, " + 50 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "i", descriptor = "()Ljava/lang/String;")
	public String method412() {
		@Pc(2) int local2 = this.anInt624;
		while (this.aByteArray16[this.anInt624++] != 10) {
		}
		return new String(this.aByteArray16, local2, this.anInt624 - local2 - 1);
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "e", descriptor = "(I)[B")
	public byte[] method413() {
		try {
			@Pc(13) int local13 = this.anInt624;
			while (this.aByteArray16[this.anInt624++] != 10) {
			}
			@Pc(34) byte[] local34 = new byte[this.anInt624 - local13 - 1];
			for (@Pc(36) int local36 = local13; local36 < this.anInt624 - 1; local36++) {
				local34[local36 - local13] = this.aByteArray16[local36];
			}
			return local34;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("45044, " + -721 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(II[BI)V")
	public void method414(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = true;
			for (@Pc(5) int local5 = 0; local5 < arg2 + 0; local5++) {
				arg1[local5] = this.aByteArray16[this.anInt624++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("47493, " + 0 + ", " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "f", descriptor = "(I)V")
	public void method415() {
		try {
			this.anInt625 = this.anInt624 * 8;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("63078, " + 0 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(II)I")
	public int method416(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt625 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt625 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt625 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray16[local6++] & anIntArray178[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray16[local6] & anIntArray178[local13];
			} else {
				local15 += this.aByteArray16[local6] >> local13 - arg0 & anIntArray178[arg0];
			}
			return local15;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("90039, " + -34994 + ", " + arg0 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(Z)V")
	public void method417() {
		try {
			this.anInt624 = (this.anInt625 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("52958, " + true + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "j", descriptor = "()I")
	public int method418() {
		@Pc(7) int local7 = this.aByteArray16[this.anInt624] & 0xFF;
		return local7 < 128 ? this.method405() - 64 : this.method407() - 49152;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "k", descriptor = "()I")
	public int method419() {
		@Pc(7) int local7 = this.aByteArray16[this.anInt624] & 0xFF;
		return local7 < 128 ? this.method405() : this.method407() - 32768;
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method420(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt624;
			this.anInt624 = 0;
			@Pc(13) byte[] local13 = new byte[local2];
			this.method414(36, local13, local2);
			@Pc(24) BigInteger local24 = new BigInteger(local13);
			@Pc(29) BigInteger local29 = local24.modPow(arg1, arg0);
			@Pc(32) byte[] local32 = local29.toByteArray();
			this.anInt624 = 0;
			this.method395(local32.length);
			this.method403(local32, this.aByte17, local32.length);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("68206, " + arg0 + ", " + arg1 + ", " + -734 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "d", descriptor = "(II)V")
	public void method421(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt624++] = (byte) (arg0 + 128);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("10406, " + 928 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "e", descriptor = "(II)V")
	public void method422(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt624++] = (byte) -arg0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("83585, " + arg0 + ", " + -919 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "g", descriptor = "(I)I")
	public int method423() {
		try {
			return this.aByteArray16[this.anInt624++] - 128 & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("82705, " + -45375 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "h", descriptor = "(I)I")
	public int method424(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 8494) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			return -this.aByteArray16[this.anInt624++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("939, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "i", descriptor = "(I)I")
	public int method425(@OriginalArg(0) int arg0) {
		try {
			return arg0 == 42604 ? 128 - this.aByteArray16[this.anInt624++] & 0xFF : this.anInt618;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("34748, " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(Z)B")
	public byte method426() {
		try {
			return (byte) (this.aByteArray16[this.anInt624++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("61328, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "j", descriptor = "(I)B")
	public byte method427() {
		try {
			return (byte) -this.aByteArray16[this.anInt624++];
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("40463, " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "k", descriptor = "(I)B")
	public byte method428() {
		try {
			return (byte) (128 - this.aByteArray16[this.anInt624++]);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("45024, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(ZI)V")
	public void method429(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt624++] = (byte) arg0;
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("67726, " + false + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(IZ)V")
	public void method430(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 8);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 + 128);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("25958, " + arg0 + ", " + false + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(IZ)V")
	public void method431(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt624++] = (byte) (arg0 + 128);
			this.aByteArray16[this.anInt624++] = (byte) (arg0 >> 8);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("12274, " + arg0 + ", " + false + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(Z)I")
	public int method432() {
		try {
			this.anInt624 += 2;
			return ((this.aByteArray16[this.anInt624 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 2] & 0xFF);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("99143, " + true + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "b", descriptor = "(B)I")
	public int method433() {
		try {
			this.anInt624 += 2;
			return ((this.aByteArray16[this.anInt624 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("89051, " + -107 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "c", descriptor = "(B)I")
	public int method434() {
		try {
			if (this.aByte18 != 3) {
				this.aBoolean144 = !this.aBoolean144;
			}
			this.anInt624 += 2;
			return ((this.aByteArray16[this.anInt624 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 2] - 128 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("13762, " + 3 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "l", descriptor = "(I)I")
	public int method435() {
		try {
			this.anInt624 += 2;
			@Pc(36) int local36 = ((this.aByteArray16[this.anInt624 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 2] & 0xFF);
			if (local36 > 32767) {
				local36 -= 65536;
			}
			return local36;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("79572, " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "m", descriptor = "(I)I")
	public int method436() {
		try {
			this.anInt624 += 2;
			@Pc(29) int local29 = ((this.aByteArray16[this.anInt624 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 1] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("24359, " + 8 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "n", descriptor = "(I)I")
	public int method437() {
		try {
			this.anInt624 += 4;
			return ((this.aByteArray16[this.anInt624 - 2] & 0xFF) << 24) + ((this.aByteArray16[this.anInt624 - 1] & 0xFF) << 16) + ((this.aByteArray16[this.anInt624 - 4] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 3] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("77114, " + 24013 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "d", descriptor = "(Z)I")
	public int method438() {
		try {
			this.anInt624 += 4;
			return ((this.aByteArray16[this.anInt624 - 3] & 0xFF) << 24) + ((this.aByteArray16[this.anInt624 - 4] & 0xFF) << 16) + ((this.aByteArray16[this.anInt624 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt624 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("75757, " + true + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!SVWJKJVI", name = "a", descriptor = "(ZII[B)V")
	public void method439(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(10) int local10 = arg0 + 0 - 1; local10 >= 0; local10--) {
				arg1[local10] = this.aByteArray16[this.anInt624++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("24489, " + false + ", " + arg0 + ", " + 0 + ", " + arg1 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
