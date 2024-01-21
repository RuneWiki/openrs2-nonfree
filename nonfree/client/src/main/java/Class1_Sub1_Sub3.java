import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
	private static int anInt768;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "I")
	private static int anInt769;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	private static int anInt770;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "[I")
	private static int[] anIntArray231 = new int[256];

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "[I")
	private static final int[] anIntArray232;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!pb;")
	private static Class31 aClass31_4;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "Lclient!pb;")
	private static Class31 aClass31_5;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!pb;")
	private static Class31 aClass31_6;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	public int anInt766;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	public int anInt767;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "Lclient!xb;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "Z")
	private boolean aBoolean182 = false;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Z")
	private boolean aBoolean183 = false;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "I")
	private int anInt764 = 4192;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private int anInt765 = -44203;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
	private boolean aBoolean184 = false;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "[C")
	private char[] aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

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
			anIntArray231[local4] = local7;
		}
		anIntArray232 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass31_4 = new Class31((byte) 9);
		aClass31_5 = new Class31((byte) 9);
		aClass31_6 = new Class31((byte) 9);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!mb;")
	public static Class1_Sub1_Sub3 method491(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) Class31 local7 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(11) Class1_Sub1_Sub3 local11 = null;
				if (anInt769 > 0) {
					anInt769--;
					local11 = (Class1_Sub1_Sub3) aClass31_5.method533();
				}
				if (local11 != null) {
					local11.anInt766 = 0;
					return local11;
				}
			}
			@Pc(73) Class1_Sub1_Sub3 local73 = new Class1_Sub1_Sub3(374);
			local73.anInt766 = 0;
			local73.aByteArray9 = new byte[5000];
			return local73;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("37614, " + arg0 + ", " + 1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([BZ)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray9 = arg0;
			this.anInt766 = 0;
		} catch (@Pc(291) RuntimeException local291) {
			signlink.reporterror("93126, " + arg0 + ", " + arg1 + ", " + local291.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V")
	public void method492(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt766++] = (byte) (arg0 + this.aClass47_2.method685());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("27684, " + arg0 + ", " + 5 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method493(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method494(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method495(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt766++] = (byte) arg0;
			this.aByteArray9[this.anInt766++] = 0;
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("41017, " + -813 + ", " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method496(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method497(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt766++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(IB)V")
	public void method498(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt766++] = (byte) arg0;
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("65629, " + arg0 + ", " + 3 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JI)V")
	public void method499(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt766++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt766++] = (byte) arg0;
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("73808, " + arg0 + ", " + -25114 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method500(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt766);
		this.anInt766 += arg0.length();
		this.aByteArray9[this.anInt766++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[BI)V")
	public void method501(@OriginalArg(2) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1 + 0; local7++) {
				this.aByteArray9[this.anInt766++] = arg0[local7];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("86515, " + 3 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(BI)V")
	public void method502(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt766 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("79619, " + 39 + ", " + arg0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int method503() {
		return this.aByteArray9[this.anInt766++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte method504() {
		return this.aByteArray9[this.anInt766++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method505() {
		this.anInt766 += 2;
		return ((this.aByteArray9[this.anInt766 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt766 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method506() {
		this.anInt766 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt766 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt766 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method507() {
		this.anInt766 += 3;
		return ((this.aByteArray9[this.anInt766 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt766 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt766 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int method508() {
		this.anInt766 += 4;
		return ((this.aByteArray9[this.anInt766 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt766 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt766 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt766 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)J")
	public long method509() {
		try {
			@Pc(11) long local11 = (long) this.method508() & 0xFFFFFFFFL;
			@Pc(17) long local17 = (long) this.method508() & 0xFFFFFFFFL;
			return (local11 << 32) + local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("1734, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method510() {
		@Pc(2) int local2 = this.anInt766;
		while (this.aByteArray9[this.anInt766++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt766 - local2 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)[B")
	public byte[] method511() {
		try {
			@Pc(12) int local12 = this.anInt766;
			while (this.aByteArray9[this.anInt766++] != 10) {
			}
			@Pc(33) byte[] local33 = new byte[this.anInt766 - local12 - 1];
			for (@Pc(35) int local35 = local12; local35 < this.anInt766 - 1; local35++) {
				local33[local35 - local12] = this.aByteArray9[local35];
			}
			return local33;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("26292, " + 4 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZI[B)V")
	public void method512(@OriginalArg(0) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg0 + 0; local11++) {
				arg1[local11] = this.aByteArray9[this.anInt766++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("77046, " + arg0 + ", " + true + ", " + 0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void method513() {
		try {
			this.anInt767 = this.anInt766 * 8;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("74644, " + -153 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	public int method514(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = this.anInt767 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt767 & 0x7);
			@Pc(15) int local15 = 0;
			if (arg1 >= 0) {
				return this.anInt764;
			}
			this.anInt767 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray232[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray232[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg0 & anIntArray232[arg0];
			}
			return local15;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("30272, " + arg0 + ", " + arg1 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	public void method515() {
		try {
			this.anInt766 = (this.anInt767 + 7) / 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("27548, " + false + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method516() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt766] & 0xFF;
		return local7 < 128 ? this.method503() - 64 : this.method505() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int method517() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt766] & 0xFF;
		return local7 < 128 ? this.method503() : this.method505() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method518(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt766;
			this.anInt766 = 0;
			@Pc(17) byte[] local17 = new byte[local2];
			this.method512(local2, local17);
			@Pc(28) BigInteger local28 = new BigInteger(local17);
			@Pc(33) BigInteger local33 = local28.modPow(arg1, arg0);
			@Pc(36) byte[] local36 = local33.toByteArray();
			this.anInt766 = 0;
			this.method493(local36.length);
			this.method501(local36, local36.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("39271, " + arg0 + ", " + -186 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
