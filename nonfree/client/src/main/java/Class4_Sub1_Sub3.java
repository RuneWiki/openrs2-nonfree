import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!FTMSICIZ")
public final class Class4_Sub1_Sub3 extends Class4_Sub1 {

	@OriginalMember(owner = "client!FTMSICIZ", name = "G", descriptor = "I")
	private static int anInt103;

	@OriginalMember(owner = "client!FTMSICIZ", name = "H", descriptor = "I")
	private static int anInt104;

	@OriginalMember(owner = "client!FTMSICIZ", name = "I", descriptor = "I")
	private static int anInt105;

	@OriginalMember(owner = "client!FTMSICIZ", name = "D", descriptor = "[I")
	private static int[] anIntArray14 = new int[256];

	@OriginalMember(owner = "client!FTMSICIZ", name = "E", descriptor = "[I")
	private static final int[] anIntArray15;

	@OriginalMember(owner = "client!FTMSICIZ", name = "J", descriptor = "Lclient!QGWIBVPG;")
	private static Class30 aClass30_1;

	@OriginalMember(owner = "client!FTMSICIZ", name = "K", descriptor = "Lclient!QGWIBVPG;")
	private static Class30 aClass30_2;

	@OriginalMember(owner = "client!FTMSICIZ", name = "L", descriptor = "Lclient!QGWIBVPG;")
	private static Class30 aClass30_3;

	@OriginalMember(owner = "client!FTMSICIZ", name = "M", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!FTMSICIZ", name = "l", descriptor = "I")
	private int anInt93;

	@OriginalMember(owner = "client!FTMSICIZ", name = "A", descriptor = "[B")
	public byte[] aByteArray3;

	@OriginalMember(owner = "client!FTMSICIZ", name = "B", descriptor = "I")
	public int anInt101;

	@OriginalMember(owner = "client!FTMSICIZ", name = "C", descriptor = "I")
	public int anInt102;

	@OriginalMember(owner = "client!FTMSICIZ", name = "F", descriptor = "Lclient!YEQNFKYU;")
	public Class47 aClass47_1;

	@OriginalMember(owner = "client!FTMSICIZ", name = "i", descriptor = "Z")
	private boolean aBoolean43 = true;

	@OriginalMember(owner = "client!FTMSICIZ", name = "j", descriptor = "I")
	private int anInt91 = 358;

	@OriginalMember(owner = "client!FTMSICIZ", name = "k", descriptor = "I")
	private int anInt92 = 8;

	@OriginalMember(owner = "client!FTMSICIZ", name = "m", descriptor = "I")
	private int anInt94 = -33469;

	@OriginalMember(owner = "client!FTMSICIZ", name = "n", descriptor = "I")
	private int anInt95 = 9453;

	@OriginalMember(owner = "client!FTMSICIZ", name = "o", descriptor = "Z")
	private boolean aBoolean44 = false;

	@OriginalMember(owner = "client!FTMSICIZ", name = "p", descriptor = "I")
	private int anInt96 = -48253;

	@OriginalMember(owner = "client!FTMSICIZ", name = "q", descriptor = "Z")
	private boolean aBoolean45 = false;

	@OriginalMember(owner = "client!FTMSICIZ", name = "r", descriptor = "B")
	private byte aByte7 = 102;

	@OriginalMember(owner = "client!FTMSICIZ", name = "s", descriptor = "I")
	private int anInt97 = 865;

	@OriginalMember(owner = "client!FTMSICIZ", name = "t", descriptor = "B")
	private byte aByte8 = 5;

	@OriginalMember(owner = "client!FTMSICIZ", name = "u", descriptor = "I")
	private int anInt98 = 25957;

	@OriginalMember(owner = "client!FTMSICIZ", name = "v", descriptor = "Z")
	private boolean aBoolean46 = true;

	@OriginalMember(owner = "client!FTMSICIZ", name = "w", descriptor = "I")
	private int anInt99 = -3404;

	@OriginalMember(owner = "client!FTMSICIZ", name = "x", descriptor = "Z")
	private boolean aBoolean47 = false;

	@OriginalMember(owner = "client!FTMSICIZ", name = "y", descriptor = "Z")
	private boolean aBoolean48 = true;

	@OriginalMember(owner = "client!FTMSICIZ", name = "z", descriptor = "I")
	private int anInt100 = 402;

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
			anIntArray14[local4] = local7;
		}
		anIntArray15 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass30_1 = new Class30(9203);
		aClass30_2 = new Class30(9203);
		aClass30_3 = new Class30(9203);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(II)Lclient!FTMSICIZ;")
	public static Class4_Sub1_Sub3 method90() {
		try {
			@Pc(10) Class30 local10 = aClass30_2;
			synchronized (aClass30_2) {
				@Pc(14) Class4_Sub1_Sub3 local14 = null;
				if (anInt104 > 0) {
					anInt104--;
					local14 = (Class4_Sub1_Sub3) aClass30_2.method345();
				}
				if (local14 != null) {
					local14.anInt101 = 0;
					return local14;
				}
			}
			@Pc(76) Class4_Sub1_Sub3 local76 = new Class4_Sub1_Sub3(false);
			local76.anInt101 = 0;
			local76.aByteArray3 = new byte[5000];
			return local76;
		} catch (@Pc(103) RuntimeException local103) {
			signlink.reporterror("53610, " + 21834 + ", " + 1 + ", " + local103.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "<init>", descriptor = "(Z)V")
	private Class4_Sub1_Sub3(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "<init>", descriptor = "([BB)V")
	public Class4_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aByteArray3 = arg0;
			this.anInt101 = 0;
		} catch (@Pc(71) RuntimeException local71) {
			signlink.reporterror("16225, " + arg0 + ", " + arg1 + ", " + local71.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(BI)V")
	public void method91(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) (arg0 + this.aClass47_1.method488());
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("65552, " + 64 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(I)V")
	public void method92(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt101++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(I)V")
	public void method93(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt101++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(II)V")
	public void method94(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) arg1;
			this.aByteArray3[this.anInt101++] = 0;
			if (arg0 != -20315) {
				for (@Pc(30) int local30 = 1; local30 > 0; local30++) {
				}
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("47139, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(I)V")
	public void method95(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt101++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "d", descriptor = "(I)V")
	public void method96(@OriginalArg(0) int arg0) {
		this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 24);
		this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 16);
		this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 8);
		this.aByteArray3[this.anInt101++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(ZI)V")
	public void method97(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) arg0;
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 16);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("75797, " + true + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(JB)V")
	public void method98(@OriginalArg(0) long arg0, @OriginalArg(1) byte arg1) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 56);
			@Pc(19) boolean local19 = false;
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 48);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 40);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 32);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 24);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 16);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt101++] = (byte) arg0;
		} catch (@Pc(127) RuntimeException local127) {
			signlink.reporterror("58357, " + arg0 + ", " + arg1 + ", " + local127.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method99(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray3, this.anInt101);
		this.anInt101 += arg0.length();
		this.aByteArray3[this.anInt101++] = 10;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(II[BI)V")
	public void method100(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray3[this.anInt101++] = arg0[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("6534, " + 0 + ", " + 531 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(ZI)V")
	public void method101(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt101 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("76610, " + false + ", " + arg0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "()I")
	public int method102() {
		return this.aByteArray3[this.anInt101++] & 0xFF;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "d", descriptor = "()B")
	public byte method103() {
		return this.aByteArray3[this.anInt101++];
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "e", descriptor = "()I")
	public int method104() {
		this.anInt101 += 2;
		return ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "f", descriptor = "()I")
	public int method105() {
		this.anInt101 += 2;
		@Pc(27) int local27 = ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "g", descriptor = "()I")
	public int method106() {
		this.anInt101 += 3;
		return ((this.aByteArray3[this.anInt101 - 3] & 0xFF) << 16) + ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "h", descriptor = "()I")
	public int method107() {
		this.anInt101 += 4;
		return ((this.aByteArray3[this.anInt101 - 4] & 0xFF) << 24) + ((this.aByteArray3[this.anInt101 - 3] & 0xFF) << 16) + ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(Z)J")
	public long method108() {
		try {
			@Pc(5) long local5 = (long) this.method107() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method107() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("77037, " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "i", descriptor = "()Ljava/lang/String;")
	public String method109() {
		@Pc(2) int local2 = this.anInt101;
		while (this.aByteArray3[this.anInt101++] != 10) {
		}
		return new String(this.aByteArray3, local2, this.anInt101 - local2 - 1);
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "e", descriptor = "(I)[B")
	public byte[] method110(@OriginalArg(0) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt101;
			while (this.aByteArray3[this.anInt101++] != 10) {
			}
			@Pc(25) byte[] local25 = new byte[this.anInt101 - local4 - 1];
			if (arg0 >= 0) {
				throw new NullPointerException();
			}
			for (@Pc(35) int local35 = local4; local35 < this.anInt101 - 1; local35++) {
				local25[local35 - local4] = this.aByteArray3[local35];
			}
			return local25;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("68125, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(I[BII)V")
	public void method111(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(8) int local8 = 0; local8 < arg1 + 0; local8++) {
				arg0[local8] = this.aByteArray3[this.anInt101++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("95670, " + 0 + ", " + arg0 + ", " + arg1 + ", " + -10 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "f", descriptor = "(I)V")
	public void method112() {
		try {
			this.anInt102 = this.anInt101 * 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("87654, " + -25838 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(II)I")
	public int method113(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(10) int local10 = this.anInt102 >> 3;
			@Pc(17) int local17 = 8 - (this.anInt102 & 0x7);
			@Pc(19) int local19 = 0;
			this.anInt102 += arg0;
			while (arg0 > local17) {
				local19 += (this.aByteArray3[local10++] & anIntArray15[local17]) << arg0 - local17;
				arg0 -= local17;
				local17 = 8;
			}
			if (arg0 == local17) {
				local19 += this.aByteArray3[local10] & anIntArray15[local17];
			} else {
				local19 += this.aByteArray3[local10] >> local17 - arg0 & anIntArray15[arg0];
			}
			return local19;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("39389, " + arg0 + ", " + arg1 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "g", descriptor = "(I)V")
	public void method114(@OriginalArg(0) int arg0) {
		try {
			this.anInt101 = (this.anInt102 + 7) / 8;
			@Pc(11) boolean local11 = false;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("21657, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "j", descriptor = "()I")
	public int method115() {
		@Pc(7) int local7 = this.aByteArray3[this.anInt101] & 0xFF;
		return local7 < 128 ? this.method102() - 64 : this.method104() - 49152;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "k", descriptor = "()I")
	public int method116() {
		@Pc(7) int local7 = this.aByteArray3[this.anInt101] & 0xFF;
		return local7 < 128 ? this.method102() : this.method104() - 32768;
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method117(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt101;
			this.anInt101 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method111(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(30) BigInteger local30 = local19.modPow(arg0, arg1);
			@Pc(33) byte[] local33 = local30.toByteArray();
			this.anInt101 = 0;
			this.method92(local33.length);
			this.method100(local33, local33.length);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("59279, " + -29356 + ", " + arg0 + ", " + arg1 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "d", descriptor = "(II)V")
	public void method118(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) (arg0 + 128);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("19166, " + arg0 + ", " + 0 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(ZI)V")
	public void method119(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) -arg0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("54685, " + false + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "e", descriptor = "(II)V")
	public void method120(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) (128 - arg0);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("33866, " + 0 + ", " + arg0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "h", descriptor = "(I)I")
	public int method121() {
		try {
			if (this.anInt96 != -48253) {
				this.aBoolean47 = !this.aBoolean47;
			}
			return this.aByteArray3[this.anInt101++] - 128 & 0xFF;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("93732, " + -48253 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "i", descriptor = "(I)I")
	public int method122() {
		try {
			return -this.aByteArray3[this.anInt101++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("36601, " + 7 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(Z)I")
	public int method123() {
		try {
			return 128 - this.aByteArray3[this.anInt101++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("10481, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(Z)B")
	public byte method124() {
		try {
			return (byte) (this.aByteArray3[this.anInt101++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("9660, " + false + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "j", descriptor = "(I)B")
	public byte method125() {
		try {
			return (byte) -this.aByteArray3[this.anInt101++];
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("87983, " + -78 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "d", descriptor = "(Z)B")
	public byte method126() {
		try {
			return (byte) (128 - this.aByteArray3[this.anInt101++]);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("80812, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(IB)V")
	public void method127(@OriginalArg(0) int arg0) {
		try {
			if (this.aByte7 == 102) {
				this.aByteArray3[this.anInt101++] = (byte) arg0;
				this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 8);
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("68424, " + arg0 + ", " + 102 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "f", descriptor = "(II)V")
	public void method128(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 8);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 + 128);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("50099, " + arg0 + ", " + -14191 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "g", descriptor = "(II)V")
	public void method129(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) (arg0 + 128);
			this.aByteArray3[this.anInt101++] = (byte) (arg0 >> 8);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("54661, " + 865 + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "k", descriptor = "(I)I")
	public int method130() {
		try {
			this.anInt101 += 2;
			return ((this.aByteArray3[this.anInt101 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("2774, " + -12702 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "l", descriptor = "(I)I")
	public int method131() {
		try {
			this.anInt101 += 2;
			return ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("37466, " + 4 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(B)I")
	public int method132(@OriginalArg(0) byte arg0) {
		try {
			this.anInt101 += 2;
			if (arg0 != 1) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			return ((this.aByteArray3[this.anInt101 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("35952, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "m", descriptor = "(I)I")
	public int method133(@OriginalArg(0) int arg0) {
		try {
			this.anInt101 += 2;
			@Pc(29) int local29 = ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 1] - 128 & 0xFF);
			@Pc(33) boolean local33 = false;
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("29749, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(B)I")
	public int method134() {
		try {
			this.anInt101 += 2;
			@Pc(29) int local29 = ((this.aByteArray3[this.anInt101 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 2] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("94648, " + -80 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "n", descriptor = "(I)I")
	public int method135() {
		try {
			this.anInt101 += 3;
			return ((this.aByteArray3[this.anInt101 - 1] & 0xFF) << 16) + ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 3] & 0xFF);
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("57881, " + -938 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "h", descriptor = "(II)V")
	public void method136(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray3[this.anInt101++] = (byte) (arg1 >> 8);
			this.aByteArray3[this.anInt101++] = (byte) arg1;
			this.aByteArray3[this.anInt101++] = (byte) (arg1 >> 24);
			@Pc(45) boolean local45 = false;
			this.aByteArray3[this.anInt101++] = (byte) (arg1 >> 16);
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("80239, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "c", descriptor = "(B)I")
	public int method137(@OriginalArg(0) byte arg0) {
		try {
			this.anInt101 += 4;
			if (arg0 == 5) {
				@Pc(10) boolean local10 = false;
				return ((this.aByteArray3[this.anInt101 - 1] & 0xFF) << 24) + ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 16) + ((this.aByteArray3[this.anInt101 - 3] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 4] & 0xFF);
			} else {
				return 1;
			}
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("99503, " + arg0 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "o", descriptor = "(I)I")
	public int method138(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 25957) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			this.anInt101 += 4;
			return ((this.aByteArray3[this.anInt101 - 2] & 0xFF) << 24) + ((this.aByteArray3[this.anInt101 - 1] & 0xFF) << 16) + ((this.aByteArray3[this.anInt101 - 4] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 3] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("94443, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "p", descriptor = "(I)I")
	public int method139(@OriginalArg(0) int arg0) {
		try {
			this.anInt101 += 4;
			if (arg0 != 0) {
				this.aBoolean48 = !this.aBoolean48;
			}
			return ((this.aByteArray3[this.anInt101 - 3] & 0xFF) << 24) + ((this.aByteArray3[this.anInt101 - 4] & 0xFF) << 16) + ((this.aByteArray3[this.anInt101 - 1] & 0xFF) << 8) + (this.aByteArray3[this.anInt101 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("96566, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "a", descriptor = "(II[BB)V")
	public void method140(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(16) int local16 = arg0 + 0 - 1; local16 >= 0; local16--) {
				this.aByteArray3[this.anInt101++] = (byte) (arg1[local16] + 128);
			}
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("56006, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 7 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!FTMSICIZ", name = "b", descriptor = "(II[BI)V")
	public void method141(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(15) int local15 = arg1 + 0 - 1; local15 >= 0; local15--) {
				arg0[local15] = this.aByteArray3[this.anInt101++];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("33822, " + -476 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}
}
