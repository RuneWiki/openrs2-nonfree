import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!MNKDCXXG")
public final class Class1_Sub2_Sub3 extends Class1_Sub2 {

	@OriginalMember(owner = "client!MNKDCXXG", name = "t", descriptor = "I")
	private static int anInt473;

	@OriginalMember(owner = "client!MNKDCXXG", name = "A", descriptor = "I")
	private static int anInt476;

	@OriginalMember(owner = "client!MNKDCXXG", name = "B", descriptor = "I")
	private static int anInt477;

	@OriginalMember(owner = "client!MNKDCXXG", name = "C", descriptor = "I")
	private static int anInt478;

	@OriginalMember(owner = "client!MNKDCXXG", name = "x", descriptor = "[I")
	private static int[] anIntArray111 = new int[256];

	@OriginalMember(owner = "client!MNKDCXXG", name = "y", descriptor = "[I")
	private static final int[] anIntArray112;

	@OriginalMember(owner = "client!MNKDCXXG", name = "D", descriptor = "Lclient!WOVRPCGT;")
	private static Class42 aClass42_2;

	@OriginalMember(owner = "client!MNKDCXXG", name = "E", descriptor = "Lclient!WOVRPCGT;")
	private static Class42 aClass42_3;

	@OriginalMember(owner = "client!MNKDCXXG", name = "F", descriptor = "Lclient!WOVRPCGT;")
	private static Class42 aClass42_4;

	@OriginalMember(owner = "client!MNKDCXXG", name = "G", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!MNKDCXXG", name = "j", descriptor = "I")
	private int anInt467;

	@OriginalMember(owner = "client!MNKDCXXG", name = "k", descriptor = "I")
	private int anInt468;

	@OriginalMember(owner = "client!MNKDCXXG", name = "o", descriptor = "I")
	private int anInt470;

	@OriginalMember(owner = "client!MNKDCXXG", name = "u", descriptor = "[B")
	public byte[] aByteArray10;

	@OriginalMember(owner = "client!MNKDCXXG", name = "v", descriptor = "I")
	public int anInt474;

	@OriginalMember(owner = "client!MNKDCXXG", name = "w", descriptor = "I")
	public int anInt475;

	@OriginalMember(owner = "client!MNKDCXXG", name = "z", descriptor = "Lclient!UVSYUCDF;")
	public Class41 aClass41_1;

	@OriginalMember(owner = "client!MNKDCXXG", name = "h", descriptor = "Z")
	private boolean aBoolean97 = false;

	@OriginalMember(owner = "client!MNKDCXXG", name = "i", descriptor = "Z")
	private boolean aBoolean98 = false;

	@OriginalMember(owner = "client!MNKDCXXG", name = "l", descriptor = "B")
	private byte aByte20 = -100;

	@OriginalMember(owner = "client!MNKDCXXG", name = "m", descriptor = "B")
	private byte aByte21 = -70;

	@OriginalMember(owner = "client!MNKDCXXG", name = "n", descriptor = "I")
	private int anInt469 = -352;

	@OriginalMember(owner = "client!MNKDCXXG", name = "p", descriptor = "B")
	private byte aByte22 = 80;

	@OriginalMember(owner = "client!MNKDCXXG", name = "q", descriptor = "I")
	private int anInt471 = 237;

	@OriginalMember(owner = "client!MNKDCXXG", name = "r", descriptor = "I")
	private int anInt472 = 766;

	@OriginalMember(owner = "client!MNKDCXXG", name = "s", descriptor = "Z")
	private boolean aBoolean99 = false;

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
			anIntArray111[local4] = local7;
		}
		anIntArray112 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass42_2 = new Class42(-270);
		aClass42_3 = new Class42(-270);
		aClass42_4 = new Class42(-270);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(BI)Lclient!MNKDCXXG;")
	public static Class1_Sub2_Sub3 method295() {
		try {
			@Pc(3) Class42 local3 = aClass42_3;
			synchronized (aClass42_3) {
				@Pc(7) Class1_Sub2_Sub3 local7 = null;
				if (anInt477 > 0) {
					anInt477--;
					local7 = (Class1_Sub2_Sub3) aClass42_3.method486();
				}
				if (local7 != null) {
					local7.anInt474 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub2_Sub3 local69 = new Class1_Sub2_Sub3((byte) -71);
			local69.anInt474 = 0;
			local69.aByteArray10 = new byte[5000];
			return local69;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("40665, " + 4 + ", " + 1 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "<init>", descriptor = "(B)V")
	private Class1_Sub2_Sub3(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub2_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray10 = arg0;
			this.anInt474 = 0;
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("27423, " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(II)V")
	public void method296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 != 6) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			this.aByteArray10[this.anInt474++] = (byte) (arg0 + this.aClass41_1.method450());
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("94411, " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(I)V")
	public void method297(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt474++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(I)V")
	public void method298(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt474++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(II)V")
	public void method299(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) arg0;
			this.aByteArray10[this.anInt474++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("82588, " + 27823 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(I)V")
	public void method300(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 16);
		this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt474++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "d", descriptor = "(I)V")
	public void method301(@OriginalArg(0) int arg0) {
		this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 24);
		this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 16);
		this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
		this.aByteArray10[this.anInt474++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(II)V")
	public void method302(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) arg0;
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("79155, " + 0 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(JI)V")
	public void method303(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 56);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 48);
			if (arg1 >= 0) {
				this.anInt472 = 416;
			}
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 40);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 32);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 24);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt474++] = (byte) arg0;
		} catch (@Pc(134) RuntimeException local134) {
			signlink.reporterror("71061, " + arg0 + ", " + arg1 + ", " + local134.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method304(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray10, this.anInt474);
		this.anInt474 += arg0.length();
		this.aByteArray10[this.anInt474++] = 10;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(III[B)V")
	public void method305(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				this.aByteArray10[this.anInt474++] = arg1[local4];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("91330, " + 0 + ", " + -249 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(ZI)V")
	public void method306(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt474 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("63095, " + true + ", " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "()I")
	public int method307() {
		return this.aByteArray10[this.anInt474++] & 0xFF;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "d", descriptor = "()B")
	public byte method308() {
		return this.aByteArray10[this.anInt474++];
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "e", descriptor = "()I")
	public int method309() {
		this.anInt474 += 2;
		return ((this.aByteArray10[this.anInt474 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "f", descriptor = "()I")
	public int method310() {
		this.anInt474 += 2;
		@Pc(27) int local27 = ((this.aByteArray10[this.anInt474 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "g", descriptor = "()I")
	public int method311() {
		this.anInt474 += 3;
		return ((this.aByteArray10[this.anInt474 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt474 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "h", descriptor = "()I")
	public int method312() {
		this.anInt474 += 4;
		return ((this.aByteArray10[this.anInt474 - 4] & 0xFF) << 24) + ((this.aByteArray10[this.anInt474 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt474 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(B)J")
	public long method313() {
		try {
			@Pc(5) long local5 = (long) this.method312() & 0xFFFFFFFFL;
			if (this.aByte20 != -100) {
				throw new NullPointerException();
			}
			@Pc(19) long local19 = (long) this.method312() & 0xFFFFFFFFL;
			return (local5 << 32) + local19;
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("35030, " + -100 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "i", descriptor = "()Ljava/lang/String;")
	public String method314() {
		@Pc(2) int local2 = this.anInt474;
		while (this.aByteArray10[this.anInt474++] != 10) {
		}
		return new String(this.aByteArray10, local2, this.anInt474 - local2 - 1);
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "e", descriptor = "(I)[B")
	public byte[] method315() {
		try {
			@Pc(4) int local4 = this.anInt474;
			while (this.aByteArray10[this.anInt474++] != 10) {
			}
			@Pc(25) byte[] local25 = new byte[this.anInt474 - local4 - 1];
			for (@Pc(37) int local37 = local4; local37 < this.anInt474 - 1; local37++) {
				local25[local37 - local4] = this.aByteArray10[local37];
			}
			return local25;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("1468, " + 1927 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "([BIII)V")
	private void method316(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) boolean local3 = false;
			for (@Pc(5) int local5 = 0; local5 < arg2 + 0; local5++) {
				arg0[local5] = this.aByteArray10[this.anInt474++];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("31614, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(B)V")
	public void method317(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt475 = this.anInt474 * 8;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("11654, " + arg0 + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "d", descriptor = "(II)I")
	public int method318(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt475 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt475 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt475 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray10[local6++] & anIntArray112[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray10[local6] & anIntArray112[local13];
			} else {
				local15 += this.aByteArray10[local6] >> local13 - arg0 & anIntArray112[arg0];
			}
			return local15;
		} catch (@Pc(90) RuntimeException local90) {
			signlink.reporterror("22747, " + arg0 + ", " + 4 + ", " + local90.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "f", descriptor = "(I)V")
	public void method319() {
		try {
			this.anInt474 = (this.anInt475 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("68316, " + 0 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "j", descriptor = "()I")
	public int method320() {
		@Pc(7) int local7 = this.aByteArray10[this.anInt474] & 0xFF;
		return local7 < 128 ? this.method307() - 64 : this.method309() - 49152;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "k", descriptor = "()I")
	public int method321() {
		@Pc(7) int local7 = this.aByteArray10[this.anInt474] & 0xFF;
		return local7 < 128 ? this.method307() : this.method309() - 32768;
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method322(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt474;
			this.anInt474 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method316(local8, 432, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt474 = 0;
			this.method297(local27.length);
			this.method305(local27.length, local27);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("86195, " + arg0 + ", " + 495 + ", " + arg1 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(BI)V")
	public void method323(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != -60) {
				for (@Pc(4) int local4 = 1; local4 > 0; local4++) {
				}
			}
			this.aByteArray10[this.anInt474++] = (byte) (arg1 + 128);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("41455, " + arg0 + ", " + arg1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(BI)V")
	public void method324(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) -arg0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("48618, " + 117 + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(ZI)V")
	public void method325(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) (128 - arg0);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("54965, " + false + ", " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "g", descriptor = "(I)I")
	public int method326(@OriginalArg(0) int arg0) {
		try {
			while (arg0 >= 0) {
				this.anInt469 = -441;
			}
			return this.aByteArray10[this.anInt474++] - 128 & 0xFF;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("82392, " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "h", descriptor = "(I)I")
	public int method327() {
		try {
			return -this.aByteArray10[this.anInt474++] & 0xFF;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("55952, " + -584 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(B)I")
	public int method328() {
		try {
			return 128 - this.aByteArray10[this.anInt474++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("5862, " + 2 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(Z)B")
	public byte method329() {
		try {
			return (byte) (this.aByteArray10[this.anInt474++] - 128);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("19820, " + true + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "d", descriptor = "(B)B")
	public byte method330(@OriginalArg(0) byte arg0) {
		try {
			@Pc(6) boolean local6 = false;
			return (byte) (128 - this.aByteArray10[this.anInt474++]);
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("32774, " + arg0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(IZ)V")
	public void method331(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) arg0;
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("9647, " + arg0 + ", " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(IZ)V")
	public void method332(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 + 128);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("1914, " + arg0 + ", " + false + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "e", descriptor = "(II)V")
	public void method333(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) (arg0 + 128);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("36022, " + -963 + ", " + arg0 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "i", descriptor = "(I)I")
	public int method334() {
		try {
			this.anInt474 += 2;
			return ((this.aByteArray10[this.anInt474 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 2] & 0xFF);
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("92123, " + -817 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "j", descriptor = "(I)I")
	public int method335() {
		try {
			this.anInt474 += 2;
			return ((this.aByteArray10[this.anInt474 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 1] - 128 & 0xFF);
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("29675, " + -660 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "e", descriptor = "(B)I")
	public int method336() {
		try {
			this.anInt474 += 2;
			return ((this.aByteArray10[this.anInt474 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 2] - 128 & 0xFF);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("17749, " + -98 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "(Z)I")
	public int method337(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt474 += 2;
			@Pc(27) int local27 = ((this.aByteArray10[this.anInt474 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 2] & 0xFF);
			if (arg0) {
				return 4;
			} else {
				if (local27 > 32767) {
					local27 -= 65536;
				}
				return local27;
			}
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("67153, " + arg0 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "k", descriptor = "(I)I")
	public int method338() {
		try {
			this.anInt474 += 2;
			@Pc(38) int local38 = ((this.aByteArray10[this.anInt474 - 2] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 1] - 128 & 0xFF);
			if (local38 > 32767) {
				local38 -= 65536;
			}
			return local38;
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("10484, " + 867 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "l", descriptor = "(I)I")
	public int method339() {
		try {
			this.anInt474 += 2;
			@Pc(41) int local41 = ((this.aByteArray10[this.anInt474 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 2] - 128 & 0xFF);
			if (local41 > 32767) {
				local41 -= 65536;
			}
			return local41;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("67814, " + -386 + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "m", descriptor = "(I)I")
	public int method340() {
		try {
			this.anInt474 += 3;
			return ((this.aByteArray10[this.anInt474 - 3] & 0xFF) << 16) + ((this.aByteArray10[this.anInt474 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 2] & 0xFF);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("6139, " + -228 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "a", descriptor = "(IB)V")
	public void method341(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 16);
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 24);
			this.aByteArray10[this.anInt474++] = (byte) arg0;
			this.aByteArray10[this.anInt474++] = (byte) (arg0 >> 8);
		} catch (@Pc(65) RuntimeException local65) {
			signlink.reporterror("78783, " + arg0 + ", " + 7 + ", " + local65.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "n", descriptor = "(I)I")
	public int method342() {
		try {
			this.anInt474 += 4;
			return ((this.aByteArray10[this.anInt474 - 1] & 0xFF) << 24) + ((this.aByteArray10[this.anInt474 - 2] & 0xFF) << 16) + ((this.aByteArray10[this.anInt474 - 3] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 4] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("55437, " + -273 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "o", descriptor = "(I)I")
	public int method343() {
		try {
			this.anInt474 += 4;
			return ((this.aByteArray10[this.anInt474 - 2] & 0xFF) << 24) + ((this.aByteArray10[this.anInt474 - 1] & 0xFF) << 16) + ((this.aByteArray10[this.anInt474 - 4] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 3] & 0xFF);
		} catch (@Pc(60) RuntimeException local60) {
			signlink.reporterror("69539, " + 6 + ", " + local60.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "c", descriptor = "(Z)I")
	public int method344() {
		try {
			this.anInt474 += 4;
			return ((this.aByteArray10[this.anInt474 - 3] & 0xFF) << 24) + ((this.aByteArray10[this.anInt474 - 4] & 0xFF) << 16) + ((this.aByteArray10[this.anInt474 - 1] & 0xFF) << 8) + (this.aByteArray10[this.anInt474 - 2] & 0xFF);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("22406, " + true + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!MNKDCXXG", name = "b", descriptor = "([BIII)V")
	public void method345(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			@Pc(6) int local6;
			if (arg1 != -46257) {
				for (local6 = 1; local6 > 0; local6++) {
				}
			}
			for (local6 = 0; local6 < arg2 + 0; local6++) {
				arg0[local6] = (byte) (this.aByteArray10[this.anInt474++] - 128);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("85159, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
