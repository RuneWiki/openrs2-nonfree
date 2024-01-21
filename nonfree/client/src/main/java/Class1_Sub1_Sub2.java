import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BJPWOXRJ")
public final class Class1_Sub1_Sub2 extends Class1_Sub1 {

	@OriginalMember(owner = "client!BJPWOXRJ", name = "y", descriptor = "I")
	private static int anInt12;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "z", descriptor = "I")
	private static int anInt13;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "A", descriptor = "I")
	private static int anInt14;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "o", descriptor = "I")
	private static int anInt9 = 3;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "v", descriptor = "[I")
	private static int[] anIntArray1 = new int[256];

	@OriginalMember(owner = "client!BJPWOXRJ", name = "w", descriptor = "[I")
	private static final int[] anIntArray2;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "B", descriptor = "Lclient!RGZIHLRP;")
	private static Class36 aClass36_1;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "C", descriptor = "Lclient!RGZIHLRP;")
	private static Class36 aClass36_2;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "D", descriptor = "Lclient!RGZIHLRP;")
	private static Class36 aClass36_3;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "E", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "h", descriptor = "I")
	private int anInt4;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "s", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "t", descriptor = "I")
	public int anInt10;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "u", descriptor = "I")
	public int anInt11;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "x", descriptor = "Lclient!FMTLAPCJ;")
	public Class9 aClass9_1;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "i", descriptor = "B")
	private byte aByte1 = -92;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "j", descriptor = "I")
	private int anInt5 = 3;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "k", descriptor = "I")
	private int anInt6 = -270;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "l", descriptor = "I")
	private int anInt7 = 111;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "m", descriptor = "B")
	private byte aByte2 = 107;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "n", descriptor = "I")
	private int anInt8 = 5;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "p", descriptor = "Z")
	private boolean aBoolean10 = false;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "q", descriptor = "Z")
	private boolean aBoolean11 = false;

	@OriginalMember(owner = "client!BJPWOXRJ", name = "r", descriptor = "Z")
	private boolean aBoolean12 = false;

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
			anIntArray1[local6] = local9;
		}
		anIntArray2 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass36_1 = new Class36(anInt9);
		aClass36_2 = new Class36(anInt9);
		aClass36_3 = new Class36(anInt9);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(IB)Lclient!BJPWOXRJ;")
	public static Class1_Sub1_Sub2 method10(@OriginalArg(1) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			@Pc(12) Class36 local12 = aClass36_2;
			synchronized (aClass36_2) {
				@Pc(16) Class1_Sub1_Sub2 local16 = null;
				if (anInt13 > 0) {
					anInt13--;
					local16 = (Class1_Sub1_Sub2) aClass36_2.method399();
				}
				if (local16 != null) {
					local16.anInt10 = 0;
					return local16;
				}
			}
			@Pc(78) Class1_Sub1_Sub2 local78 = new Class1_Sub1_Sub2(false);
			local78.anInt10 = 0;
			local78.aByteArray1 = new byte[5000];
			return local78;
		} catch (@Pc(105) RuntimeException local105) {
			signlink.reporterror("24056, " + 1 + ", " + arg0 + ", " + local105.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "<init>", descriptor = "(Z)V")
	private Class1_Sub1_Sub2(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "<init>", descriptor = "(Z[B)V")
	public Class1_Sub1_Sub2(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray1 = arg1;
			this.anInt10 = 0;
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("79229, " + arg0 + ", " + arg1 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(II)V")
	public void method11(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt10++] = (byte) (arg0 + this.aClass9_1.method69());
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("45379, " + arg0 + ", " + 0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(I)V")
	public void method12(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt10++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "b", descriptor = "(I)V")
	public void method13(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt10++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "b", descriptor = "(II)V")
	public void method14(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt10++] = (byte) arg0;
			this.aByteArray1[this.anInt10++] = 0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("35254, " + arg0 + ", " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "c", descriptor = "(I)V")
	public void method15(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt10++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "d", descriptor = "(I)V")
	public void method16(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 24);
		this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt10++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "c", descriptor = "(II)V")
	public void method17(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray1[this.anInt10++] = (byte) arg1;
			this.aByteArray1[this.anInt10++] = (byte) (arg1 >> 8);
			this.aByteArray1[this.anInt10++] = (byte) (arg1 >> 16);
			this.aByteArray1[this.anInt10++] = (byte) (arg1 >> 24);
			@Pc(57) boolean local57 = false;
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("29515, " + arg0 + ", " + arg1 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(JI)V")
	public void method18(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 56);
			this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 48);
			this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 40);
			this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 32);
			this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 24);
			this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 16);
			this.aByteArray1[this.anInt10++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt10++] = (byte) arg0;
		} catch (@Pc(140) RuntimeException local140) {
			signlink.reporterror("73492, " + arg0 + ", " + 5 + ", " + local140.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method19(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray1, this.anInt10);
		this.anInt10 += arg0.length();
		this.aByteArray1[this.anInt10++] = 10;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(I[BII)V")
	public void method20(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				this.aByteArray1[this.anInt10++] = arg1[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("45898, " + arg0 + ", " + arg1 + ", " + -44665 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(ZI)V")
	public void method21(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt10 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("19878, " + false + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "c", descriptor = "()I")
	public int method22() {
		return this.aByteArray1[this.anInt10++] & 0xFF;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "d", descriptor = "()B")
	public byte method23() {
		return this.aByteArray1[this.anInt10++];
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "e", descriptor = "()I")
	public int method24() {
		this.anInt10 += 2;
		return ((this.aByteArray1[this.anInt10 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt10 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "f", descriptor = "()I")
	public int method25() {
		this.anInt10 += 2;
		@Pc(27) int local27 = ((this.aByteArray1[this.anInt10 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt10 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "g", descriptor = "()I")
	public int method26() {
		this.anInt10 += 3;
		return ((this.aByteArray1[this.anInt10 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt10 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt10 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "h", descriptor = "()I")
	public int method27() {
		this.anInt10 += 4;
		return ((this.aByteArray1[this.anInt10 - 4] & 0xFF) << 24) + ((this.aByteArray1[this.anInt10 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt10 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt10 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(B)J")
	public long method28() {
		try {
			@Pc(5) long local5 = (long) this.method27() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method27() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("99577, " + 7 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "i", descriptor = "()Ljava/lang/String;")
	public String method29() {
		@Pc(2) int local2 = this.anInt10;
		while (this.aByteArray1[this.anInt10++] != 10) {
		}
		return new String(this.aByteArray1, local2, this.anInt10 - local2 - 1);
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "e", descriptor = "(I)[B")
	public byte[] method30(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt10;
			while (this.aByteArray1[this.anInt10++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt10 - local2 - 1];
			@Pc(27) int local27 = 0 / arg0;
			for (@Pc(29) int local29 = local2; local29 < this.anInt10 - 1; local29++) {
				local23[local29 - local2] = this.aByteArray1[local29];
			}
			return local23;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("22833, " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "b", descriptor = "(I[BII)V")
	public void method31(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(10) int local10 = 0; local10 < arg1 + 0; local10++) {
				arg0[local10] = this.aByteArray1[this.anInt10++];
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("90288, " + 0 + ", " + arg0 + ", " + 3 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "b", descriptor = "(B)V")
	public void method32() {
		try {
			this.anInt11 = this.anInt10 * 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("14594, " + -82 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "b", descriptor = "(ZI)I")
	public int method33(@OriginalArg(1) int arg0) {
		try {
			@Pc(10) int local10 = this.anInt11 >> 3;
			@Pc(17) int local17 = 8 - (this.anInt11 & 0x7);
			@Pc(19) int local19 = 0;
			this.anInt11 += arg0;
			while (arg0 > local17) {
				local19 += (this.aByteArray1[local10++] & anIntArray2[local17]) << arg0 - local17;
				arg0 -= local17;
				local17 = 8;
			}
			if (arg0 == local17) {
				local19 += this.aByteArray1[local10] & anIntArray2[local17];
			} else {
				local19 += this.aByteArray1[local10] >> local17 - arg0 & anIntArray2[arg0];
			}
			return local19;
		} catch (@Pc(86) RuntimeException local86) {
			signlink.reporterror("24138, " + false + ", " + arg0 + ", " + local86.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "f", descriptor = "(I)V")
	public void method34() {
		try {
			this.anInt10 = (this.anInt11 + 7) / 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("53651, " + 0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "j", descriptor = "()I")
	public int method35() {
		@Pc(7) int local7 = this.aByteArray1[this.anInt10] & 0xFF;
		return local7 < 128 ? this.method22() - 64 : this.method24() - 49152;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "k", descriptor = "()I")
	public int method36() {
		@Pc(7) int local7 = this.aByteArray1[this.anInt10] & 0xFF;
		return local7 < 128 ? this.method22() : this.method24() - 32768;
	}

	@OriginalMember(owner = "client!BJPWOXRJ", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method37(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt10;
			this.anInt10 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method31(local8, local2);
			@Pc(30) BigInteger local30 = new BigInteger(local8);
			@Pc(35) BigInteger local35 = local30.modPow(arg1, arg0);
			@Pc(38) byte[] local38 = local35.toByteArray();
			this.anInt10 = 0;
			this.method12(local38.length);
			this.method20(local38.length, local38);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("72372, " + 7 + ", " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}
}
