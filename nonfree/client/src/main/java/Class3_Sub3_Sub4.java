import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!WBEWPIXO")
public final class Class3_Sub3_Sub4 extends Class3_Sub3 {

	@OriginalMember(owner = "client!WBEWPIXO", name = "B", descriptor = "I")
	private static int anInt740;

	@OriginalMember(owner = "client!WBEWPIXO", name = "C", descriptor = "I")
	private static int anInt741;

	@OriginalMember(owner = "client!WBEWPIXO", name = "D", descriptor = "I")
	private static int anInt742;

	@OriginalMember(owner = "client!WBEWPIXO", name = "u", descriptor = "I")
	private static int anInt737 = 8;

	@OriginalMember(owner = "client!WBEWPIXO", name = "y", descriptor = "[I")
	private static int[] anIntArray189 = new int[256];

	@OriginalMember(owner = "client!WBEWPIXO", name = "z", descriptor = "[I")
	private static final int[] anIntArray190;

	@OriginalMember(owner = "client!WBEWPIXO", name = "E", descriptor = "Lclient!NYZQPNXB;")
	private static Class26 aClass26_7;

	@OriginalMember(owner = "client!WBEWPIXO", name = "F", descriptor = "Lclient!NYZQPNXB;")
	private static Class26 aClass26_8;

	@OriginalMember(owner = "client!WBEWPIXO", name = "G", descriptor = "Lclient!NYZQPNXB;")
	private static Class26 aClass26_9;

	@OriginalMember(owner = "client!WBEWPIXO", name = "H", descriptor = "[C")
	private static char[] aCharArray3;

	@OriginalMember(owner = "client!WBEWPIXO", name = "k", descriptor = "I")
	private int anInt734;

	@OriginalMember(owner = "client!WBEWPIXO", name = "v", descriptor = "[B")
	public byte[] aByteArray20;

	@OriginalMember(owner = "client!WBEWPIXO", name = "w", descriptor = "I")
	public int anInt738;

	@OriginalMember(owner = "client!WBEWPIXO", name = "x", descriptor = "I")
	public int anInt739;

	@OriginalMember(owner = "client!WBEWPIXO", name = "A", descriptor = "Lclient!XAGUDWSZ;")
	public Class41 aClass41_1;

	@OriginalMember(owner = "client!WBEWPIXO", name = "i", descriptor = "I")
	private int anInt732 = 1;

	@OriginalMember(owner = "client!WBEWPIXO", name = "j", descriptor = "I")
	private int anInt733 = -845;

	@OriginalMember(owner = "client!WBEWPIXO", name = "l", descriptor = "I")
	private int anInt735 = -944;

	@OriginalMember(owner = "client!WBEWPIXO", name = "m", descriptor = "I")
	private int anInt736 = 42;

	@OriginalMember(owner = "client!WBEWPIXO", name = "n", descriptor = "Z")
	private boolean aBoolean166 = false;

	@OriginalMember(owner = "client!WBEWPIXO", name = "o", descriptor = "B")
	private byte aByte27 = 0;

	@OriginalMember(owner = "client!WBEWPIXO", name = "p", descriptor = "B")
	private byte aByte28 = -33;

	@OriginalMember(owner = "client!WBEWPIXO", name = "q", descriptor = "B")
	private byte aByte29 = -35;

	@OriginalMember(owner = "client!WBEWPIXO", name = "r", descriptor = "Z")
	private boolean aBoolean167 = false;

	@OriginalMember(owner = "client!WBEWPIXO", name = "s", descriptor = "Z")
	private boolean aBoolean168 = false;

	@OriginalMember(owner = "client!WBEWPIXO", name = "t", descriptor = "Z")
	private boolean aBoolean169 = true;

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
			anIntArray189[local6] = local9;
		}
		anIntArray190 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass26_7 = new Class26(2);
		aClass26_8 = new Class26(2);
		aClass26_9 = new Class26(2);
		aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(II)Lclient!WBEWPIXO;")
	public static Class3_Sub3_Sub4 method456() {
		try {
			@Pc(3) Class26 local3 = aClass26_8;
			synchronized (aClass26_8) {
				@Pc(7) Class3_Sub3_Sub4 local7 = null;
				if (anInt741 > 0) {
					anInt741--;
					local7 = (Class3_Sub3_Sub4) aClass26_8.method223();
				}
				if (local7 != null) {
					local7.anInt738 = 0;
					return local7;
				}
			}
			@Pc(69) Class3_Sub3_Sub4 local69 = new Class3_Sub3_Sub4(46986);
			local69.anInt738 = 0;
			local69.aByteArray20 = new byte[5000];
			return local69;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("29647, " + 1 + ", " + 8 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "<init>", descriptor = "(I)V")
	private Class3_Sub3_Sub4(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "<init>", descriptor = "(B[B)V")
	public Class3_Sub3_Sub4(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray20 = arg1;
			this.anInt738 = 0;
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("45719, " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(II)V")
	public void method457(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) (arg0 + this.aClass41_1.method511());
			if (this.anInt732 > 1 || this.anInt732 < 1) {
				;
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("15732, " + arg0 + ", " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(I)V")
	public void method458(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt738++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(I)V")
	public void method459(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt738++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "(II)V")
	public void method460(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) arg0;
			this.aByteArray20[this.anInt738++] = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("90695, " + arg0 + ", " + -739 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "(I)V")
	public void method461(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt738++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "d", descriptor = "(I)V")
	public void method462(@OriginalArg(0) int arg0) {
		this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 24);
		this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 16);
		this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 8);
		this.aByteArray20[this.anInt738++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "d", descriptor = "(II)V")
	public void method463(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) arg0;
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 16);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("1802, " + arg0 + ", " + -624 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(JI)V")
	public void method464(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 56);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 48);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 40);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 32);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 24);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 16);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt738++] = (byte) arg0;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("15232, " + arg0 + ", " + -845 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method465(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray20, this.anInt738);
		this.anInt738 += arg0.length();
		this.aByteArray20[this.anInt738++] = 10;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(III[B)V")
	public void method466(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(15) int local15 = 0; local15 < arg0 + 0; local15++) {
				this.aByteArray20[this.anInt738++] = arg1[local15];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("99987, " + -238 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "e", descriptor = "(II)V")
	public void method467(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) boolean local3 = false;
			this.aByteArray20[this.anInt738 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("4659, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "()I")
	public int method468() {
		return this.aByteArray20[this.anInt738++] & 0xFF;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "d", descriptor = "()B")
	public byte method469() {
		return this.aByteArray20[this.anInt738++];
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "e", descriptor = "()I")
	public int method470() {
		this.anInt738 += 2;
		return ((this.aByteArray20[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "f", descriptor = "()I")
	public int method471() {
		this.anInt738 += 2;
		@Pc(27) int local27 = ((this.aByteArray20[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "g", descriptor = "()I")
	public int method472() {
		this.anInt738 += 3;
		return ((this.aByteArray20[this.anInt738 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "h", descriptor = "()I")
	public int method473() {
		this.anInt738 += 4;
		return ((this.aByteArray20[this.anInt738 - 4] & 0xFF) << 24) + ((this.aByteArray20[this.anInt738 - 3] & 0xFF) << 16) + ((this.aByteArray20[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "e", descriptor = "(I)J")
	public long method474() {
		try {
			@Pc(5) long local5 = (long) this.method473() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method473() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("35516, " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "i", descriptor = "()Ljava/lang/String;")
	public String method475() {
		@Pc(2) int local2 = this.anInt738;
		while (this.aByteArray20[this.anInt738++] != 10) {
		}
		return new String(this.aByteArray20, local2, this.anInt738 - local2 - 1);
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "f", descriptor = "(I)[B")
	public byte[] method476() {
		try {
			@Pc(2) int local2 = this.anInt738;
			while (this.aByteArray20[this.anInt738++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt738 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt738 - 1; local31++) {
				local29[local31 - local2] = this.aByteArray20[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("42747, " + 37643 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(III[B)V")
	private void method477(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(15) int local15 = 0; local15 < arg0 + 0; local15++) {
				arg1[local15] = this.aByteArray20[this.anInt738++];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("51422, " + 0 + ", " + -605 + ", " + arg0 + ", " + arg1 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "g", descriptor = "(I)V")
	public void method478(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt739 = this.anInt738 * 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("52094, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(ZI)I")
	public int method479(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt739 >> 3;
			@Pc(11) int local11 = 8 - (this.anInt739 & 0x7);
			@Pc(13) int local13 = 0;
			this.anInt739 += arg0;
			while (arg0 > local11) {
				local13 += (this.aByteArray20[local4++] & anIntArray190[local11]) << arg0 - local11;
				arg0 -= local11;
				local11 = 8;
			}
			if (arg0 == local11) {
				local13 += this.aByteArray20[local4] & anIntArray190[local11];
			} else {
				local13 += this.aByteArray20[local4] >> local11 - arg0 & anIntArray190[arg0];
			}
			return local13;
		} catch (@Pc(83) RuntimeException local83) {
			signlink.reporterror("76975, " + true + ", " + arg0 + ", " + local83.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(B)V")
	public void method480() {
		try {
			this.anInt738 = (this.anInt739 + 7) / 8;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("43345, " + 5 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "j", descriptor = "()I")
	public int method481() {
		@Pc(7) int local7 = this.aByteArray20[this.anInt738] & 0xFF;
		return local7 < 128 ? this.method468() - 64 : this.method470() - 49152;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "k", descriptor = "()I")
	public int method482() {
		@Pc(7) int local7 = this.aByteArray20[this.anInt738] & 0xFF;
		return local7 < 128 ? this.method468() : this.method470() - 32768;
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(Ljava/math/BigInteger;ZLjava/math/BigInteger;)V")
	public void method483(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt738;
			this.anInt738 = 0;
			@Pc(17) byte[] local17 = new byte[local2];
			this.method477(local2, local17);
			@Pc(28) BigInteger local28 = new BigInteger(local17);
			@Pc(33) BigInteger local33 = local28.modPow(arg0, arg1);
			@Pc(36) byte[] local36 = local33.toByteArray();
			this.anInt738 = 0;
			this.method458(local36.length);
			this.method466(local36.length, local36);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("55250, " + arg0 + ", " + true + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "f", descriptor = "(II)V")
	public void method484(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) -arg0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("50961, " + arg0 + ", " + 7 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(Z)I")
	public int method485() {
		try {
			return this.aByteArray20[this.anInt738++] - 128 & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("52323, " + true + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "h", descriptor = "(I)I")
	public int method486() {
		try {
			return -this.aByteArray20[this.anInt738++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("88254, " + 18094 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(Z)I")
	public int method487() {
		try {
			return 128 - this.aByteArray20[this.anInt738++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("96592, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "i", descriptor = "(I)B")
	public byte method488() {
		try {
			return (byte) (this.aByteArray20[this.anInt738++] - 128);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("9239, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(B)B")
	public byte method489() {
		try {
			return (byte) -this.aByteArray20[this.anInt738++];
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("32562, " + 1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "(Z)B")
	public byte method490() {
		try {
			return (byte) (128 - this.aByteArray20[this.anInt738++]);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("67110, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(IB)V")
	public void method491(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) arg0;
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 8);
			if (this.aByte27 != 0) {
				this.anInt733 = -3;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("28881, " + arg0 + ", " + 0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "g", descriptor = "(II)V")
	public void method492(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 + 128);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("79422, " + arg0 + ", " + 6573 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(BI)V")
	public void method493(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) (arg1 + 128);
			this.aByteArray20[this.anInt738++] = (byte) (arg1 >> 8);
			if (arg0 == -82) {
				;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("78693, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "j", descriptor = "(I)I")
	public int method494() {
		try {
			this.anInt738 += 2;
			return ((this.aByteArray20[this.anInt738 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("65139, " + 35378 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "k", descriptor = "(I)I")
	public int method495(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 0) {
				this.anInt734 = 351;
			}
			this.anInt738 += 2;
			return ((this.aByteArray20[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("87861, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "d", descriptor = "(Z)I")
	public int method496() {
		try {
			this.anInt738 += 2;
			return ((this.aByteArray20[this.anInt738 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 2] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("37280, " + false + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "l", descriptor = "(I)I")
	public int method497(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) boolean local3 = false;
			this.anInt738 += 2;
			@Pc(31) int local31 = ((this.aByteArray20[this.anInt738 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 2] & 0xFF);
			if (local31 > 32767) {
				local31 -= 65536;
			}
			return local31;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("56173, " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "e", descriptor = "(Z)I")
	public int method498() {
		try {
			this.anInt738 += 2;
			@Pc(38) int local38 = ((this.aByteArray20[this.anInt738 - 2] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 1] - 128 & 0xFF);
			if (local38 > 32767) {
				local38 -= 65536;
			}
			return local38;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("59058, " + false + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "f", descriptor = "(Z)I")
	public int method499() {
		try {
			this.anInt738 += 2;
			@Pc(34) int local34 = ((this.aByteArray20[this.anInt738 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 2] - 128 & 0xFF);
			if (local34 > 32767) {
				local34 -= 65536;
			}
			return local34;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("59894, " + false + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "b", descriptor = "(BI)V")
	public void method500(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 8);
			this.aByteArray20[this.anInt738++] = (byte) arg0;
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 24);
			this.aByteArray20[this.anInt738++] = (byte) (arg0 >> 16);
		} catch (@Pc(76) RuntimeException local76) {
			signlink.reporterror("57254, " + 7 + ", " + arg0 + ", " + local76.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "c", descriptor = "(B)I")
	public int method501() {
		try {
			this.anInt738 += 4;
			return ((this.aByteArray20[this.anInt738 - 1] & 0xFF) << 24) + ((this.aByteArray20[this.anInt738 - 2] & 0xFF) << 16) + ((this.aByteArray20[this.anInt738 - 3] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 4] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("48341, " + 2 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "m", descriptor = "(I)I")
	public int method502() {
		try {
			this.anInt738 += 4;
			return ((this.aByteArray20[this.anInt738 - 2] & 0xFF) << 24) + ((this.aByteArray20[this.anInt738 - 1] & 0xFF) << 16) + ((this.aByteArray20[this.anInt738 - 4] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 3] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("36806, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "n", descriptor = "(I)I")
	public int method503() {
		try {
			this.anInt738 += 4;
			return ((this.aByteArray20[this.anInt738 - 3] & 0xFF) << 24) + ((this.aByteArray20[this.anInt738 - 4] & 0xFF) << 16) + ((this.aByteArray20[this.anInt738 - 1] & 0xFF) << 8) + (this.aByteArray20[this.anInt738 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("58720, " + 16014 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "([BIII)V")
	public void method504(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			for (@Pc(15) int local15 = arg1 + 0 - 1; local15 >= 0; local15--) {
				this.aByteArray20[this.anInt738++] = (byte) (arg0[local15] + 128);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("14151, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!WBEWPIXO", name = "a", descriptor = "(II[BI)V")
	public void method505(@OriginalArg(1) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(10) int local10 = arg0 + 0 - 1; local10 >= 0; local10--) {
				arg1[local10] = this.aByteArray20[this.anInt738++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("37017, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 893 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}
}
