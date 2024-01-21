import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!PKHWFJLM")
public final class Class5_Sub1_Sub4 extends Class5_Sub1 {

	@OriginalMember(owner = "client!PKHWFJLM", name = "J", descriptor = "I")
	private static int anInt431;

	@OriginalMember(owner = "client!PKHWFJLM", name = "K", descriptor = "I")
	private static int anInt432;

	@OriginalMember(owner = "client!PKHWFJLM", name = "L", descriptor = "I")
	private static int anInt433;

	@OriginalMember(owner = "client!PKHWFJLM", name = "G", descriptor = "[I")
	private static int[] anIntArray100 = new int[256];

	@OriginalMember(owner = "client!PKHWFJLM", name = "H", descriptor = "[I")
	private static final int[] anIntArray101;

	@OriginalMember(owner = "client!PKHWFJLM", name = "M", descriptor = "Lclient!UEUHLQTT;")
	private static Class41 aClass41_6;

	@OriginalMember(owner = "client!PKHWFJLM", name = "N", descriptor = "Lclient!UEUHLQTT;")
	private static Class41 aClass41_7;

	@OriginalMember(owner = "client!PKHWFJLM", name = "O", descriptor = "Lclient!UEUHLQTT;")
	private static Class41 aClass41_8;

	@OriginalMember(owner = "client!PKHWFJLM", name = "P", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "client!PKHWFJLM", name = "p", descriptor = "I")
	private int anInt420;

	@OriginalMember(owner = "client!PKHWFJLM", name = "D", descriptor = "[B")
	public byte[] aByteArray16;

	@OriginalMember(owner = "client!PKHWFJLM", name = "E", descriptor = "I")
	public int anInt429;

	@OriginalMember(owner = "client!PKHWFJLM", name = "F", descriptor = "I")
	public int anInt430;

	@OriginalMember(owner = "client!PKHWFJLM", name = "I", descriptor = "Lclient!LAXXBEFB;")
	public Class23 aClass23_1;

	@OriginalMember(owner = "client!PKHWFJLM", name = "i", descriptor = "I")
	private int anInt414 = -34470;

	@OriginalMember(owner = "client!PKHWFJLM", name = "j", descriptor = "I")
	private int anInt415 = -160;

	@OriginalMember(owner = "client!PKHWFJLM", name = "k", descriptor = "I")
	private int anInt416 = 1;

	@OriginalMember(owner = "client!PKHWFJLM", name = "l", descriptor = "I")
	private int anInt417 = 5;

	@OriginalMember(owner = "client!PKHWFJLM", name = "m", descriptor = "I")
	private int anInt418 = 44659;

	@OriginalMember(owner = "client!PKHWFJLM", name = "n", descriptor = "B")
	private byte aByte11 = 9;

	@OriginalMember(owner = "client!PKHWFJLM", name = "o", descriptor = "I")
	private int anInt419 = -973;

	@OriginalMember(owner = "client!PKHWFJLM", name = "q", descriptor = "I")
	private int anInt421 = 1;

	@OriginalMember(owner = "client!PKHWFJLM", name = "r", descriptor = "I")
	private int anInt422 = -838;

	@OriginalMember(owner = "client!PKHWFJLM", name = "s", descriptor = "I")
	private int anInt423 = 1;

	@OriginalMember(owner = "client!PKHWFJLM", name = "t", descriptor = "I")
	private int anInt424 = -166;

	@OriginalMember(owner = "client!PKHWFJLM", name = "u", descriptor = "I")
	private int anInt425 = -166;

	@OriginalMember(owner = "client!PKHWFJLM", name = "v", descriptor = "I")
	private int anInt426 = 44758;

	@OriginalMember(owner = "client!PKHWFJLM", name = "w", descriptor = "I")
	private int anInt427 = 929;

	@OriginalMember(owner = "client!PKHWFJLM", name = "x", descriptor = "Z")
	private boolean aBoolean109 = true;

	@OriginalMember(owner = "client!PKHWFJLM", name = "y", descriptor = "I")
	private int anInt428 = -475;

	@OriginalMember(owner = "client!PKHWFJLM", name = "z", descriptor = "Z")
	private boolean aBoolean110 = true;

	@OriginalMember(owner = "client!PKHWFJLM", name = "A", descriptor = "Z")
	private boolean aBoolean111 = false;

	@OriginalMember(owner = "client!PKHWFJLM", name = "B", descriptor = "Z")
	private boolean aBoolean112 = true;

	@OriginalMember(owner = "client!PKHWFJLM", name = "C", descriptor = "Z")
	private boolean aBoolean113 = false;

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
			anIntArray100[local4] = local7;
		}
		anIntArray101 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass41_6 = new Class41(0);
		aClass41_7 = new Class41(0);
		aClass41_8 = new Class41(0);
		aCharArray4 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(II)Lclient!PKHWFJLM;")
	public static Class5_Sub1_Sub4 method228(@OriginalArg(0) int arg0) {
		try {
			@Pc(5) boolean local5 = false;
			@Pc(7) Class41 local7 = aClass41_7;
			synchronized (aClass41_7) {
				@Pc(11) Class5_Sub1_Sub4 local11 = null;
				if (anInt432 > 0) {
					anInt432--;
					local11 = (Class5_Sub1_Sub4) aClass41_7.method467();
				}
				if (local11 != null) {
					local11.anInt429 = 0;
					return local11;
				}
			}
			@Pc(73) Class5_Sub1_Sub4 local73 = new Class5_Sub1_Sub4((byte) -116);
			local73.anInt429 = 0;
			local73.aByteArray16 = new byte[5000];
			return local73;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("50922, " + arg0 + ", " + 1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "<init>", descriptor = "(B)V")
	private Class5_Sub1_Sub4(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "<init>", descriptor = "([BI)V")
	public Class5_Sub1_Sub4(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray16 = arg0;
			this.anInt429 = 0;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("8860, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(IZ)V")
	public void method229(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) (arg0 + this.aClass23_1.method161());
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("83880, " + arg0 + ", " + false + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(I)V")
	public void method230(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt429++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "b", descriptor = "(I)V")
	public void method231(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt429++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(IB)V")
	public void method232(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) arg0;
			this.aByteArray16[this.anInt429++] = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("77266, " + arg0 + ", " + 35 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "c", descriptor = "(I)V")
	public void method233(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt429++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "d", descriptor = "(I)V")
	public void method234(@OriginalArg(0) int arg0) {
		this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 24);
		this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 16);
		this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
		this.aByteArray16[this.anInt429++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "b", descriptor = "(II)V")
	public void method235(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) arg0;
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 16);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 24);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("20589, " + arg0 + ", " + 0 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(IJ)V")
	public void method236(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 56);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 48);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 40);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 32);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 24);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 16);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
			this.aByteArray16[this.anInt429++] = (byte) arg0;
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("86126, " + -228 + ", " + arg0 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method237(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray16, this.anInt429);
		this.anInt429 += arg0.length();
		this.aByteArray16[this.anInt429++] = 10;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "([BIIB)V")
	public void method238(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte arg2) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				this.aByteArray16[this.anInt429++] = arg0[local11];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("71596, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(BI)V")
	public void method239(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt429 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("6362, " + 7 + ", " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "c", descriptor = "()I")
	public int method240() {
		return this.aByteArray16[this.anInt429++] & 0xFF;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "d", descriptor = "()B")
	public byte method241() {
		return this.aByteArray16[this.anInt429++];
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "e", descriptor = "()I")
	public int method242() {
		this.anInt429 += 2;
		return ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "f", descriptor = "()I")
	public int method243() {
		this.anInt429 += 2;
		@Pc(27) int local27 = ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "g", descriptor = "()I")
	public int method244() {
		this.anInt429 += 3;
		return ((this.aByteArray16[this.anInt429 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "h", descriptor = "()I")
	public int method245() {
		this.anInt429 += 4;
		return ((this.aByteArray16[this.anInt429 - 4] & 0xFF) << 24) + ((this.aByteArray16[this.anInt429 - 3] & 0xFF) << 16) + ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "e", descriptor = "(I)J")
	public long method246() {
		try {
			@Pc(5) long local5 = (long) this.method245() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method245() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("2636, " + 7 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "i", descriptor = "()Ljava/lang/String;")
	public String method247() {
		@Pc(2) int local2 = this.anInt429;
		while (this.aByteArray16[this.anInt429++] != 10) {
		}
		return new String(this.aByteArray16, local2, this.anInt429 - local2 - 1);
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "f", descriptor = "(I)[B")
	public byte[] method248() {
		try {
			@Pc(2) int local2 = this.anInt429;
			if (this.anInt417 > 5 || this.anInt417 < 5) {
				throw new NullPointerException();
			}
			while (this.aByteArray16[this.anInt429++] != 10) {
			}
			@Pc(34) byte[] local34 = new byte[this.anInt429 - local2 - 1];
			for (@Pc(36) int local36 = local2; local36 < this.anInt429 - 1; local36++) {
				local34[local36 - local2] = this.aByteArray16[local36];
			}
			return local34;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("86095, " + 5 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(II[BI)V")
	public void method249(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < arg2 + 0; local5++) {
				arg1[local5] = this.aByteArray16[this.anInt429++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("60327, " + arg0 + ", " + 0 + ", " + arg1 + ", " + arg2 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "g", descriptor = "(I)V")
	public void method250() {
		try {
			this.anInt430 = this.anInt429 * 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("62209, " + 2 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "b", descriptor = "(BI)I")
	public int method251(@OriginalArg(1) int arg0) {
		try {
			@Pc(4) int local4 = this.anInt430 >> 3;
			@Pc(11) int local11 = 8 - (this.anInt430 & 0x7);
			@Pc(13) int local13 = 0;
			this.anInt430 += arg0;
			while (arg0 > local11) {
				local13 += (this.aByteArray16[local4++] & anIntArray101[local11]) << arg0 - local11;
				arg0 -= local11;
				local11 = 8;
			}
			if (arg0 == local11) {
				local13 += this.aByteArray16[local4] & anIntArray101[local11];
			} else {
				local13 += this.aByteArray16[local4] >> local11 - arg0 & anIntArray101[arg0];
			}
			return local13;
		} catch (@Pc(84) RuntimeException local84) {
			signlink.reporterror("92091, " + 39 + ", " + arg0 + ", " + local84.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "h", descriptor = "(I)V")
	public void method252() {
		try {
			this.anInt429 = (this.anInt430 + 7) / 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("63984, " + -29596 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "j", descriptor = "()I")
	public int method253() {
		@Pc(7) int local7 = this.aByteArray16[this.anInt429] & 0xFF;
		return local7 < 128 ? this.method240() - 64 : this.method242() - 49152;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "k", descriptor = "()I")
	public int method254() {
		@Pc(7) int local7 = this.aByteArray16[this.anInt429] & 0xFF;
		return local7 < 128 ? this.method240() : this.method242() - 32768;
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(Ljava/math/BigInteger;BLjava/math/BigInteger;)V")
	public void method255(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt429;
			this.anInt429 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method249(990, local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(38) byte[] local38 = local24.toByteArray();
			this.anInt429 = 0;
			this.method230(local38.length);
			this.method238(local38, local38.length, (byte) 8);
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("55834, " + arg0 + ", " + -83 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "c", descriptor = "(II)V")
	public void method256(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) (arg0 + 128);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("33260, " + 7 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "d", descriptor = "(II)V")
	public void method257(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) -arg0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("65651, " + 0 + ", " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "e", descriptor = "(II)V")
	public void method258(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) (128 - arg0);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("30640, " + 8 + ", " + arg0 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(B)I")
	public int method259(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			return this.aByteArray16[this.anInt429++] - 128 & 0xFF;
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("7468, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "b", descriptor = "(B)I")
	public int method260() {
		try {
			return -this.aByteArray16[this.anInt429++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("89924, " + 40 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "i", descriptor = "(I)I")
	public int method261() {
		try {
			return 128 - this.aByteArray16[this.anInt429++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("18344, " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "j", descriptor = "(I)B")
	public byte method262() {
		try {
			return (byte) (this.aByteArray16[this.anInt429++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("37879, " + -418 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "c", descriptor = "(B)B")
	public byte method263() {
		try {
			return (byte) -this.aByteArray16[this.anInt429++];
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("70704, " + -56 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "f", descriptor = "(II)V")
	public void method264(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) arg0;
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("19716, " + -838 + ", " + arg0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "c", descriptor = "(BI)V")
	public void method265(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 + 128);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("86493, " + 0 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "g", descriptor = "(II)V")
	public void method266(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) (arg0 + 128);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("61404, " + arg0 + ", " + 35793 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "k", descriptor = "(I)I")
	public int method267() {
		try {
			this.anInt429 += 2;
			return ((this.aByteArray16[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 2] & 0xFF);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("96816, " + 31063 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "d", descriptor = "(B)I")
	public int method268(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt429 += 2;
			return ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 1] - 128 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("78972, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "l", descriptor = "(I)I")
	public int method269() {
		try {
			this.anInt429 += 2;
			return ((this.aByteArray16[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 2] - 128 & 0xFF);
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("46570, " + 2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "e", descriptor = "(B)I")
	public int method270() {
		try {
			this.anInt429 += 2;
			@Pc(27) int local27 = ((this.aByteArray16[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("82499, " + 10 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "m", descriptor = "(I)I")
	public int method271() {
		try {
			this.anInt429 += 2;
			@Pc(33) int local33 = ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 1] - 128 & 0xFF);
			if (local33 > 32767) {
				local33 -= 65536;
			}
			return local33;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("64598, " + 0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "n", descriptor = "(I)I")
	public int method272() {
		try {
			this.anInt429 += 3;
			return ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 16) + ((this.aByteArray16[this.anInt429 - 3] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 1] & 0xFF);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("76599, " + -22499 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "h", descriptor = "(II)V")
	public void method273(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray16[this.anInt429++] = (byte) arg0;
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 8);
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 16);
			if (this.anInt423 != 1) {
				for (@Pc(45) int local45 = 1; local45 > 0; local45++) {
				}
			}
			this.aByteArray16[this.anInt429++] = (byte) (arg0 >> 24);
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("68539, " + arg0 + ", " + 1 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "o", descriptor = "(I)I")
	public int method274(@OriginalArg(0) int arg0) {
		try {
			this.anInt429 += 4;
			while (arg0 >= 0) {
				this.aBoolean110 = !this.aBoolean110;
			}
			return ((this.aByteArray16[this.anInt429 - 1] & 0xFF) << 24) + ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 16) + ((this.aByteArray16[this.anInt429 - 3] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 4] & 0xFF);
		} catch (@Pc(64) RuntimeException local64) {
			signlink.reporterror("15194, " + arg0 + ", " + local64.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "p", descriptor = "(I)I")
	public int method275() {
		try {
			this.anInt429 += 4;
			return ((this.aByteArray16[this.anInt429 - 2] & 0xFF) << 24) + ((this.aByteArray16[this.anInt429 - 1] & 0xFF) << 16) + ((this.aByteArray16[this.anInt429 - 4] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 3] & 0xFF);
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("76753, " + 32520 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "q", descriptor = "(I)I")
	public int method276(@OriginalArg(0) int arg0) {
		try {
			this.anInt429 += 4;
			if (arg0 != 44758) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			return ((this.aByteArray16[this.anInt429 - 3] & 0xFF) << 24) + ((this.aByteArray16[this.anInt429 - 4] & 0xFF) << 16) + ((this.aByteArray16[this.anInt429 - 1] & 0xFF) << 8) + (this.aByteArray16[this.anInt429 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("83677, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!PKHWFJLM", name = "a", descriptor = "(I[BII)V")
	public void method277(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(17) int local17 = arg1 + 0 - 1; local17 >= 0; local17--) {
				this.aByteArray16[this.anInt429++] = (byte) (arg0[local17] + 128);
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("34529, " + -37496 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}
}
