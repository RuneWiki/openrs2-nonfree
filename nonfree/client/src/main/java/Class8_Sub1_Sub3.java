import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!TQYMAXSO")
public final class Class8_Sub1_Sub3 extends Class8_Sub1 {

	@OriginalMember(owner = "client!TQYMAXSO", name = "F", descriptor = "I")
	private static int anInt622;

	@OriginalMember(owner = "client!TQYMAXSO", name = "G", descriptor = "I")
	private static int anInt623;

	@OriginalMember(owner = "client!TQYMAXSO", name = "H", descriptor = "I")
	private static int anInt624;

	@OriginalMember(owner = "client!TQYMAXSO", name = "C", descriptor = "[I")
	private static int[] anIntArray175 = new int[256];

	@OriginalMember(owner = "client!TQYMAXSO", name = "D", descriptor = "[I")
	private static final int[] anIntArray176;

	@OriginalMember(owner = "client!TQYMAXSO", name = "I", descriptor = "Lclient!CRZPTUPR;")
	private static Class7 aClass7_7;

	@OriginalMember(owner = "client!TQYMAXSO", name = "J", descriptor = "Lclient!CRZPTUPR;")
	private static Class7 aClass7_8;

	@OriginalMember(owner = "client!TQYMAXSO", name = "K", descriptor = "Lclient!CRZPTUPR;")
	private static Class7 aClass7_9;

	@OriginalMember(owner = "client!TQYMAXSO", name = "L", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "client!TQYMAXSO", name = "h", descriptor = "I")
	private int anInt612;

	@OriginalMember(owner = "client!TQYMAXSO", name = "x", descriptor = "I")
	private int anInt618;

	@OriginalMember(owner = "client!TQYMAXSO", name = "z", descriptor = "[B")
	public byte[] aByteArray13;

	@OriginalMember(owner = "client!TQYMAXSO", name = "A", descriptor = "I")
	public int anInt620;

	@OriginalMember(owner = "client!TQYMAXSO", name = "B", descriptor = "I")
	public int anInt621;

	@OriginalMember(owner = "client!TQYMAXSO", name = "E", descriptor = "Lclient!MRWOUQJV;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!TQYMAXSO", name = "i", descriptor = "I")
	private int anInt613 = -768;

	@OriginalMember(owner = "client!TQYMAXSO", name = "j", descriptor = "Z")
	private boolean aBoolean142 = true;

	@OriginalMember(owner = "client!TQYMAXSO", name = "k", descriptor = "B")
	private byte aByte13 = 7;

	@OriginalMember(owner = "client!TQYMAXSO", name = "l", descriptor = "B")
	private byte aByte14 = -112;

	@OriginalMember(owner = "client!TQYMAXSO", name = "m", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!TQYMAXSO", name = "n", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!TQYMAXSO", name = "o", descriptor = "B")
	private byte aByte15 = 7;

	@OriginalMember(owner = "client!TQYMAXSO", name = "q", descriptor = "I")
	private int anInt614 = -862;

	@OriginalMember(owner = "client!TQYMAXSO", name = "r", descriptor = "I")
	private int anInt615 = -483;

	@OriginalMember(owner = "client!TQYMAXSO", name = "s", descriptor = "Z")
	private boolean aBoolean146 = false;

	@OriginalMember(owner = "client!TQYMAXSO", name = "t", descriptor = "Z")
	private boolean aBoolean147 = true;

	@OriginalMember(owner = "client!TQYMAXSO", name = "u", descriptor = "B")
	private byte aByte16 = 23;

	@OriginalMember(owner = "client!TQYMAXSO", name = "v", descriptor = "I")
	private int anInt616 = 809;

	@OriginalMember(owner = "client!TQYMAXSO", name = "w", descriptor = "I")
	private int anInt617 = -161;

	@OriginalMember(owner = "client!TQYMAXSO", name = "y", descriptor = "I")
	private int anInt619 = 42179;

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
			anIntArray175[local4] = local7;
		}
		anIntArray176 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass7_7 = new Class7((byte) 1);
		aClass7_8 = new Class7((byte) 1);
		aClass7_9 = new Class7((byte) 1);
		aCharArray4 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(IB)Lclient!TQYMAXSO;")
	public static Class8_Sub1_Sub3 method394(@OriginalArg(1) byte arg0) {
		try {
			@Pc(3) Class7 local3 = aClass7_8;
			synchronized (aClass7_8) {
				@Pc(7) Class8_Sub1_Sub3 local7 = null;
				if (anInt623 > 0) {
					anInt623--;
					local7 = (Class8_Sub1_Sub3) aClass7_8.method31();
				}
				if (local7 != null) {
					local7.anInt620 = 0;
					return local7;
				}
			}
			@Pc(69) Class8_Sub1_Sub3 local69 = new Class8_Sub1_Sub3(-768);
			local69.anInt620 = 0;
			@Pc(77) boolean local77 = false;
			local69.aByteArray13 = new byte[5000];
			return local69;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("54054, " + 1 + ", " + arg0 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "<init>", descriptor = "(I)V")
	private Class8_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "<init>", descriptor = "([BI)V")
	public Class8_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray13 = arg0;
			this.anInt620 = 0;
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("41424, " + arg0 + ", " + arg1 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(II)V")
	public void method395(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) (arg0 + this.aClass22_1.method229());
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("71311, " + 525 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(I)V")
	public void method396(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt620++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(I)V")
	public void method397(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt620++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(II)V")
	public void method398(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) arg0;
			this.aByteArray13[this.anInt620++] = 0;
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("34487, " + arg0 + ", " + -22089 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(I)V")
	public void method399(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt620++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "d", descriptor = "(I)V")
	public void method400(@OriginalArg(0) int arg0) {
		this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 24);
		this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 16);
		this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 8);
		this.aByteArray13[this.anInt620++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(IZ)V")
	public void method401(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) arg0;
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 8);
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 16);
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("979, " + arg0 + ", " + true + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(IJ)V")
	public void method402(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) (arg1 >> 56);
			this.aByteArray13[this.anInt620++] = (byte) (arg1 >> 48);
			this.aByteArray13[this.anInt620++] = (byte) (arg1 >> 40);
			this.aByteArray13[this.anInt620++] = (byte) (arg1 >> 32);
			this.aByteArray13[this.anInt620++] = (byte) (arg1 >> 24);
			this.aByteArray13[this.anInt620++] = (byte) (arg1 >> 16);
			this.aByteArray13[this.anInt620++] = (byte) (arg1 >> 8);
			this.aByteArray13[this.anInt620++] = (byte) arg1;
			@Pc(123) boolean local123 = false;
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("68367, " + arg0 + ", " + arg1 + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method403(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray13, this.anInt620);
		this.anInt620 += arg0.length();
		this.aByteArray13[this.anInt620++] = 10;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(I[BIB)V")
	public void method404(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				this.aByteArray13[this.anInt620++] = arg1[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("11543, " + arg0 + ", " + arg1 + ", " + 0 + ", " + -4 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(IB)V")
	public void method405(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1) {
		try {
			if (arg1 != this.aByte13) {
				this.aBoolean142 = !this.aBoolean142;
			}
			this.aByteArray13[this.anInt620 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("70850, " + arg0 + ", " + arg1 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "()I")
	public int method406() {
		return this.aByteArray13[this.anInt620++] & 0xFF;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "d", descriptor = "()B")
	public byte method407() {
		return this.aByteArray13[this.anInt620++];
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "e", descriptor = "()I")
	public int method408() {
		this.anInt620 += 2;
		return ((this.aByteArray13[this.anInt620 - 2] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "f", descriptor = "()I")
	public int method409() {
		this.anInt620 += 2;
		@Pc(27) int local27 = ((this.aByteArray13[this.anInt620 - 2] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "g", descriptor = "()I")
	public int method410() {
		this.anInt620 += 3;
		return ((this.aByteArray13[this.anInt620 - 3] & 0xFF) << 16) + ((this.aByteArray13[this.anInt620 - 2] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "h", descriptor = "()I")
	public int method411() {
		this.anInt620 += 4;
		return ((this.aByteArray13[this.anInt620 - 4] & 0xFF) << 24) + ((this.aByteArray13[this.anInt620 - 3] & 0xFF) << 16) + ((this.aByteArray13[this.anInt620 - 2] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "e", descriptor = "(I)J")
	public long method412() {
		try {
			@Pc(5) long local5 = (long) this.method411() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method411() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("91332, " + 0 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "i", descriptor = "()Ljava/lang/String;")
	public String method413() {
		@Pc(2) int local2 = this.anInt620;
		while (this.aByteArray13[this.anInt620++] != 10) {
		}
		return new String(this.aByteArray13, local2, this.anInt620 - local2 - 1);
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "f", descriptor = "(I)[B")
	public byte[] method414(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt620;
			if (arg0 != -2167) {
				aBoolean145 = true;
			}
			while (this.aByteArray13[this.anInt620++] != 10) {
			}
			@Pc(32) byte[] local32 = new byte[this.anInt620 - local2 - 1];
			for (@Pc(34) int local34 = local2; local34 < this.anInt620 - 1; local34++) {
				local32[local34 - local2] = this.aByteArray13[local34];
			}
			return local32;
		} catch (@Pc(55) RuntimeException local55) {
			signlink.reporterror("2233, " + arg0 + ", " + local55.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(III[B)V")
	public void method415(@OriginalArg(2) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
				arg1[local4] = this.aByteArray13[this.anInt620++];
			}
		} catch (@Pc(27) RuntimeException local27) {
			signlink.reporterror("70613, " + 691 + ", " + 0 + ", " + arg0 + ", " + arg1 + ", " + local27.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(B)V")
	public void method416() {
		try {
			this.anInt621 = this.anInt620 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("1861, " + -43 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(IB)I")
	public int method417(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt621 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt621 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt621 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray13[local6++] & anIntArray176[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray13[local6] & anIntArray176[local13];
			} else {
				local15 += this.aByteArray13[local6] >> local13 - arg0 & anIntArray176[arg0];
			}
			return local15;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("3588, " + arg0 + ", " + 63 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "g", descriptor = "(I)V")
	public void method418() {
		try {
			this.anInt620 = (this.anInt621 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("9442, " + 9 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "j", descriptor = "()I")
	public int method419() {
		@Pc(7) int local7 = this.aByteArray13[this.anInt620] & 0xFF;
		return local7 < 128 ? this.method406() - 64 : this.method408() - 49152;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "k", descriptor = "()I")
	public int method420() {
		@Pc(7) int local7 = this.aByteArray13[this.anInt620] & 0xFF;
		return local7 < 128 ? this.method406() : this.method408() - 32768;
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;Z)V")
	public void method421(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) boolean arg2) {
		try {
			@Pc(2) int local2 = this.anInt620;
			if (!arg2) {
				this.anInt620 = 0;
				@Pc(11) byte[] local11 = new byte[local2];
				this.method415(local2, local11);
				@Pc(22) BigInteger local22 = new BigInteger(local11);
				@Pc(27) BigInteger local27 = local22.modPow(arg1, arg0);
				@Pc(30) byte[] local30 = local27.toByteArray();
				this.anInt620 = 0;
				this.method396(local30.length);
				this.method404(local30.length, local30);
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("63868, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(IZ)V")
	public void method422(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) (arg0 + 128);
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("88043, " + arg0 + ", " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(II)V")
	public void method423(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) -arg0;
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("72324, " + arg0 + ", " + -752 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "d", descriptor = "(II)V")
	public void method424(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) (128 - arg0);
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("60906, " + arg0 + ", " + 0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(B)I")
	public int method425() {
		try {
			return this.aByteArray13[this.anInt620++] - 128 & 0xFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("20667, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "h", descriptor = "(I)I")
	public int method426() {
		try {
			return -this.aByteArray13[this.anInt620++] & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("98820, " + -33544 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "i", descriptor = "(I)I")
	public int method427() {
		try {
			return 128 - this.aByteArray13[this.anInt620++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("97381, " + -33025 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "j", descriptor = "(I)B")
	public byte method428() {
		try {
			return (byte) (this.aByteArray13[this.anInt620++] - 128);
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("29474, " + 1 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "(Z)B")
	public byte method429() {
		try {
			return (byte) -this.aByteArray13[this.anInt620++];
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("47366, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(B)B")
	public byte method430() {
		try {
			return (byte) (128 - this.aByteArray13[this.anInt620++]);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("88128, " + -9 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "e", descriptor = "(II)V")
	public void method431(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) arg0;
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 8);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("73806, " + 0 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "f", descriptor = "(II)V")
	public void method432(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 8);
			if (arg1 != 0) {
				this.anInt612 = -196;
			}
			this.aByteArray13[this.anInt620++] = (byte) (arg0 + 128);
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("5966, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "g", descriptor = "(II)V")
	public void method433(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) (arg0 + 128);
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 8);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("20393, " + arg0 + ", " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "d", descriptor = "(B)I")
	public int method434(@OriginalArg(0) byte arg0) {
		try {
			if (this.aByte15 == 7) {
				@Pc(5) boolean local5 = false;
				this.anInt620 += 2;
				return ((this.aByteArray13[this.anInt620 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 2] & 0xFF);
			} else {
				return this.anInt618;
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("88777, " + arg0 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "k", descriptor = "(I)I")
	public int method435(@OriginalArg(0) int arg0) {
		try {
			this.anInt620 += 2;
			if (arg0 != 0) {
				this.aBoolean142 = !this.aBoolean142;
			}
			return ((this.aByteArray13[this.anInt620 - 2] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 1] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("97588, " + arg0 + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "e", descriptor = "(B)I")
	public int method436(@OriginalArg(0) byte arg0) {
		try {
			this.anInt620 += 2;
			return arg0 == 19 ? ((this.aByteArray13[this.anInt620 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 2] - 128 & 0xFF) : 0;
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("29876, " + arg0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "b", descriptor = "(Z)I")
	public int method437(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt620 += 2;
			@Pc(27) int local27 = ((this.aByteArray13[this.anInt620 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 2] & 0xFF);
			if (arg0) {
				this.aBoolean147 = !this.aBoolean147;
			}
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("16915, " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(Z)I")
	public int method438() {
		try {
			this.anInt620 += 2;
			@Pc(29) int local29 = ((this.aByteArray13[this.anInt620 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 2] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("96923, " + false + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "c", descriptor = "(IZ)V")
	public void method439(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 8);
			this.aByteArray13[this.anInt620++] = (byte) arg0;
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 24);
			this.aByteArray13[this.anInt620++] = (byte) (arg0 >> 16);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("95271, " + arg0 + ", " + false + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "f", descriptor = "(B)I")
	public int method440() {
		try {
			this.anInt620 += 4;
			return ((this.aByteArray13[this.anInt620 - 1] & 0xFF) << 24) + ((this.aByteArray13[this.anInt620 - 2] & 0xFF) << 16) + ((this.aByteArray13[this.anInt620 - 3] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 4] & 0xFF);
		} catch (@Pc(63) RuntimeException local63) {
			signlink.reporterror("87689, " + 87 + ", " + local63.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "l", descriptor = "(I)I")
	public int method441() {
		try {
			this.anInt620 += 4;
			return ((this.aByteArray13[this.anInt620 - 2] & 0xFF) << 24) + ((this.aByteArray13[this.anInt620 - 1] & 0xFF) << 16) + ((this.aByteArray13[this.anInt620 - 4] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 3] & 0xFF);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("9047, " + -699 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "m", descriptor = "(I)I")
	public int method442() {
		try {
			this.anInt620 += 4;
			return ((this.aByteArray13[this.anInt620 - 3] & 0xFF) << 24) + ((this.aByteArray13[this.anInt620 - 4] & 0xFF) << 16) + ((this.aByteArray13[this.anInt620 - 1] & 0xFF) << 8) + (this.aByteArray13[this.anInt620 - 2] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("3073, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "([BIZI)V")
	public void method443(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(4) int local4 = 0; local4 < arg1 + 0; local4++) {
				this.aByteArray13[this.anInt620++] = (byte) (arg0[local4] + 128);
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("26422, " + arg0 + ", " + 0 + ", " + false + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!TQYMAXSO", name = "a", descriptor = "([BIII)V")
	public void method444(@OriginalArg(0) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				arg0[local11] = (byte) (this.aByteArray13[this.anInt620++] - 128);
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("24762, " + arg0 + ", " + -161 + ", " + 0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}
}
