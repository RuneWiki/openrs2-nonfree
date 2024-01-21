import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!BFQIDHPO")
public final class Class2_Sub1_Sub2 extends Class2_Sub1 {

	@OriginalMember(owner = "client!BFQIDHPO", name = "k", descriptor = "Z")
	private static boolean aBoolean27;

	@OriginalMember(owner = "client!BFQIDHPO", name = "L", descriptor = "I")
	private static int anInt125;

	@OriginalMember(owner = "client!BFQIDHPO", name = "M", descriptor = "I")
	private static int anInt126;

	@OriginalMember(owner = "client!BFQIDHPO", name = "N", descriptor = "I")
	private static int anInt127;

	@OriginalMember(owner = "client!BFQIDHPO", name = "j", descriptor = "I")
	private static int anInt115 = 122;

	@OriginalMember(owner = "client!BFQIDHPO", name = "I", descriptor = "[I")
	private static int[] anIntArray13 = new int[256];

	@OriginalMember(owner = "client!BFQIDHPO", name = "J", descriptor = "[I")
	private static final int[] anIntArray14;

	@OriginalMember(owner = "client!BFQIDHPO", name = "O", descriptor = "Lclient!ZXKMWHPZ;")
	private static Class50 aClass50_1;

	@OriginalMember(owner = "client!BFQIDHPO", name = "P", descriptor = "Lclient!ZXKMWHPZ;")
	private static Class50 aClass50_2;

	@OriginalMember(owner = "client!BFQIDHPO", name = "Q", descriptor = "Lclient!ZXKMWHPZ;")
	private static Class50 aClass50_3;

	@OriginalMember(owner = "client!BFQIDHPO", name = "R", descriptor = "[C")
	private static char[] aCharArray1;

	@OriginalMember(owner = "client!BFQIDHPO", name = "q", descriptor = "I")
	private int anInt117;

	@OriginalMember(owner = "client!BFQIDHPO", name = "D", descriptor = "I")
	private int anInt121;

	@OriginalMember(owner = "client!BFQIDHPO", name = "E", descriptor = "I")
	private int anInt122;

	@OriginalMember(owner = "client!BFQIDHPO", name = "F", descriptor = "[B")
	public byte[] aByteArray1;

	@OriginalMember(owner = "client!BFQIDHPO", name = "G", descriptor = "I")
	public int anInt123;

	@OriginalMember(owner = "client!BFQIDHPO", name = "H", descriptor = "I")
	public int anInt124;

	@OriginalMember(owner = "client!BFQIDHPO", name = "K", descriptor = "Lclient!WMQKHABS;")
	public Class43 aClass43_1;

	@OriginalMember(owner = "client!BFQIDHPO", name = "i", descriptor = "Z")
	private boolean aBoolean26 = true;

	@OriginalMember(owner = "client!BFQIDHPO", name = "l", descriptor = "I")
	private int anInt116 = 8;

	@OriginalMember(owner = "client!BFQIDHPO", name = "m", descriptor = "B")
	private byte aByte4 = -119;

	@OriginalMember(owner = "client!BFQIDHPO", name = "n", descriptor = "B")
	private byte aByte5 = 6;

	@OriginalMember(owner = "client!BFQIDHPO", name = "o", descriptor = "Z")
	private boolean aBoolean28 = false;

	@OriginalMember(owner = "client!BFQIDHPO", name = "p", descriptor = "B")
	private byte aByte6 = 60;

	@OriginalMember(owner = "client!BFQIDHPO", name = "r", descriptor = "Z")
	private boolean aBoolean29 = true;

	@OriginalMember(owner = "client!BFQIDHPO", name = "s", descriptor = "B")
	private byte aByte7 = 55;

	@OriginalMember(owner = "client!BFQIDHPO", name = "t", descriptor = "B")
	private byte aByte8 = 44;

	@OriginalMember(owner = "client!BFQIDHPO", name = "u", descriptor = "B")
	private byte aByte9 = 44;

	@OriginalMember(owner = "client!BFQIDHPO", name = "v", descriptor = "B")
	private byte aByte10 = 8;

	@OriginalMember(owner = "client!BFQIDHPO", name = "w", descriptor = "I")
	private int anInt118 = -719;

	@OriginalMember(owner = "client!BFQIDHPO", name = "x", descriptor = "Z")
	private boolean aBoolean30 = false;

	@OriginalMember(owner = "client!BFQIDHPO", name = "y", descriptor = "B")
	private byte aByte11 = 115;

	@OriginalMember(owner = "client!BFQIDHPO", name = "z", descriptor = "I")
	private int anInt119 = 8;

	@OriginalMember(owner = "client!BFQIDHPO", name = "A", descriptor = "Z")
	private boolean aBoolean31 = true;

	@OriginalMember(owner = "client!BFQIDHPO", name = "B", descriptor = "I")
	private int anInt120 = 681;

	@OriginalMember(owner = "client!BFQIDHPO", name = "C", descriptor = "Z")
	private boolean aBoolean32 = true;

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
			anIntArray13[local6] = local9;
		}
		anIntArray14 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass50_1 = new Class50((byte) 8);
		aClass50_2 = new Class50((byte) 8);
		aClass50_3 = new Class50((byte) 8);
		aCharArray1 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(II)Lclient!BFQIDHPO;")
	public static Class2_Sub1_Sub2 method67(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) Class50 local3 = aClass50_2;
			synchronized (aClass50_2) {
				@Pc(7) Class2_Sub1_Sub2 local7 = null;
				if (anInt126 > 0) {
					anInt126--;
					local7 = (Class2_Sub1_Sub2) aClass50_2.method568();
				}
				if (local7 != null) {
					local7.anInt123 = 0;
					return local7;
				}
			}
			@Pc(69) Class2_Sub1_Sub2 local69 = new Class2_Sub1_Sub2(aBoolean27);
			local69.anInt123 = 0;
			@Pc(76) int local76 = 80 / arg0;
			local69.aByteArray1 = new byte[5000];
			return local69;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("81352, " + arg0 + ", " + 1 + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "<init>", descriptor = "(Z)V")
	private Class2_Sub1_Sub2(@OriginalArg(0) boolean arg0) {
		try {
			if (arg0) {
				throw new NullPointerException();
			}
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("78825, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "<init>", descriptor = "([BI)V")
	public Class2_Sub1_Sub2(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray1 = arg0;
			this.anInt123 = 0;
		} catch (@Pc(69) RuntimeException local69) {
			signlink.reporterror("18331, " + arg0 + ", " + arg1 + ", " + local69.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(II)V")
	public void method68(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt123++] = (byte) (arg0 + this.aClass43_1.method501());
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("40576, " + 0 + ", " + arg0 + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(I)V")
	public void method69(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt123++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(I)V")
	public void method70(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt123++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "(II)V")
	public void method71(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt123++] = (byte) arg0;
			this.aByteArray1[this.anInt123++] = 0;
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("26542, " + arg0 + ", " + 7 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "(I)V")
	public void method72(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt123++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "(I)V")
	public void method73(@OriginalArg(0) int arg0) {
		this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 24);
		this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 16);
		this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 8);
		this.aByteArray1[this.anInt123++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(IB)V")
	public void method74(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt123++] = (byte) arg0;
			this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 16);
			this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 24);
		} catch (@Pc(66) RuntimeException local66) {
			signlink.reporterror("2253, " + arg0 + ", " + 4 + ", " + local66.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(IJ)V")
	public void method75(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 56);
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 48);
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 40);
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 32);
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 24);
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 16);
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 8);
			this.aByteArray1[this.anInt123++] = (byte) arg1;
			if (arg0 < this.anInt116 || arg0 > this.anInt116) {
				;
			}
		} catch (@Pc(129) RuntimeException local129) {
			signlink.reporterror("5605, " + arg0 + ", " + arg1 + ", " + local129.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method76(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray1, this.anInt123);
		this.anInt123 += arg0.length();
		this.aByteArray1[this.anInt123++] = 10;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "([BIBI)V")
	public void method77(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.aByte4 != -119) {
				aBoolean27 = !aBoolean27;
			}
			for (@Pc(11) int local11 = 0; local11 < arg1 + 0; local11++) {
				this.aByteArray1[this.anInt123++] = arg0[local11];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("85787, " + arg0 + ", " + arg1 + ", " + -119 + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(IZ)V")
	public void method78(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt123 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(22) RuntimeException local22) {
			signlink.reporterror("66143, " + arg0 + ", " + false + ", " + local22.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "()I")
	public int method79() {
		return this.aByteArray1[this.anInt123++] & 0xFF;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "()B")
	public byte method80() {
		return this.aByteArray1[this.anInt123++];
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "e", descriptor = "()I")
	public int method81() {
		this.anInt123 += 2;
		return ((this.aByteArray1[this.anInt123 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "f", descriptor = "()I")
	public int method82() {
		this.anInt123 += 2;
		@Pc(27) int local27 = ((this.aByteArray1[this.anInt123 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "g", descriptor = "()I")
	public int method83() {
		this.anInt123 += 3;
		return ((this.aByteArray1[this.anInt123 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt123 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "h", descriptor = "()I")
	public int method84() {
		this.anInt123 += 4;
		return ((this.aByteArray1[this.anInt123 - 4] & 0xFF) << 24) + ((this.aByteArray1[this.anInt123 - 3] & 0xFF) << 16) + ((this.aByteArray1[this.anInt123 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(Z)J")
	public long method85() {
		try {
			@Pc(5) long local5 = (long) this.method84() & 0xFFFFFFFFL;
			@Pc(17) long local17 = (long) this.method84() & 0xFFFFFFFFL;
			return (local5 << 32) + local17;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("61076, " + true + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "i", descriptor = "()Ljava/lang/String;")
	public String method86() {
		@Pc(2) int local2 = this.anInt123;
		while (this.aByteArray1[this.anInt123++] != 10) {
		}
		return new String(this.aByteArray1, local2, this.anInt123 - local2 - 1);
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "e", descriptor = "(I)[B")
	public byte[] method87() {
		try {
			@Pc(13) int local13 = this.anInt123;
			while (this.aByteArray1[this.anInt123++] != 10) {
			}
			@Pc(34) byte[] local34 = new byte[this.anInt123 - local13 - 1];
			for (@Pc(36) int local36 = local13; local36 < this.anInt123 - 1; local36++) {
				local34[local36 - local13] = this.aByteArray1[local36];
			}
			return local34;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("83151, " + 0 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(I[BIB)V")
	public void method88(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1 + 0; local7++) {
				arg0[local7] = this.aByteArray1[this.anInt123++];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("67080, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 5 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "f", descriptor = "(I)V")
	public void method89() {
		try {
			this.anInt124 = this.anInt123 * 8;
		} catch (@Pc(10) RuntimeException local10) {
			signlink.reporterror("38263, " + 0 + ", " + local10.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(BI)I")
	public int method90(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt124 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt124 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt124 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray1[local6++] & anIntArray14[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray1[local6] & anIntArray14[local13];
			} else {
				local15 += this.aByteArray1[local6] >> local13 - arg0 & anIntArray14[arg0];
			}
			return local15;
		} catch (@Pc(88) RuntimeException local88) {
			signlink.reporterror("28479, " + 88 + ", " + arg0 + ", " + local88.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(Z)V")
	public void method91() {
		try {
			this.anInt123 = (this.anInt124 + 7) / 8;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("4302, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "j", descriptor = "()I")
	public int method92() {
		@Pc(7) int local7 = this.aByteArray1[this.anInt123] & 0xFF;
		return local7 < 128 ? this.method79() - 64 : this.method81() - 49152;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "k", descriptor = "()I")
	public int method93() {
		@Pc(7) int local7 = this.aByteArray1[this.anInt123] & 0xFF;
		return local7 < 128 ? this.method79() : this.method81() - 32768;
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method94(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt123;
			this.anInt123 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method88(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt123 = 0;
			this.method69(local27.length);
			this.method77(local27, local27.length);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("77586, " + -23339 + ", " + arg0 + ", " + arg1 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "(II)V")
	public void method95(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray1[this.anInt123++] = (byte) (arg0 + 128);
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("2839, " + arg0 + ", " + -12346 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(IB)V")
	public void method96(@OriginalArg(0) int arg0) {
		try {
			if (this.aByte10 == 8) {
				this.aByteArray1[this.anInt123++] = (byte) -arg0;
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("75881, " + arg0 + ", " + 8 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(BI)V")
	public void method97(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt123++] = (byte) (128 - arg0);
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("37627, " + 116 + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "g", descriptor = "(I)I")
	public int method98() {
		try {
			return this.aByteArray1[this.anInt123++] - 128 & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("90812, " + -732 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "h", descriptor = "(I)I")
	public int method99() {
		try {
			return -this.aByteArray1[this.anInt123++] & 0xFF;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("11355, " + -719 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "(Z)I")
	public int method100() {
		try {
			return 128 - this.aByteArray1[this.anInt123++] & 0xFF;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("21936, " + false + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "i", descriptor = "(I)B")
	public byte method101() {
		try {
			return (byte) (this.aByteArray1[this.anInt123++] - 128);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("66925, " + 3 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(B)B")
	public byte method102() {
		try {
			return (byte) (128 - this.aByteArray1[this.anInt123++]);
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("9100, " + 5 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "e", descriptor = "(II)V")
	public void method103(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg0 != 4) {
				aBoolean27 = !aBoolean27;
			}
			this.aByteArray1[this.anInt123++] = (byte) arg1;
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 8);
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("54774, " + arg0 + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(ZI)V")
	public void method104(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray1[this.anInt123++] = (byte) (arg0 >> 8);
			this.aByteArray1[this.anInt123++] = (byte) (arg0 + 128);
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("60548, " + true + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(ZI)V")
	public void method105(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray1[this.anInt123++] = (byte) (arg1 + 128);
			this.aByteArray1[this.anInt123++] = (byte) (arg1 >> 8);
			if (!arg0) {
				this.anInt121 = 5;
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("97843, " + arg0 + ", " + arg1 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "(Z)I")
	public int method106() {
		try {
			this.anInt123 += 2;
			return ((this.aByteArray1[this.anInt123 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 2] & 0xFF);
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("19424, " + true + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "b", descriptor = "(B)I")
	public int method107() {
		try {
			this.anInt123 += 2;
			return ((this.aByteArray1[this.anInt123 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 1] - 128 & 0xFF);
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("63578, " + 3 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "c", descriptor = "(B)I")
	public int method108(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 9) {
				@Pc(4) boolean local4 = false;
			} else {
				this.aBoolean32 = !this.aBoolean32;
			}
			this.anInt123 += 2;
			return ((this.aByteArray1[this.anInt123 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 2] - 128 & 0xFF);
		} catch (@Pc(45) RuntimeException local45) {
			signlink.reporterror("58694, " + arg0 + ", " + local45.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "j", descriptor = "(I)I")
	public int method109() {
		try {
			this.anInt123 += 2;
			@Pc(27) int local27 = ((this.aByteArray1[this.anInt123 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 2] & 0xFF);
			if (local27 > 32767) {
				local27 -= 65536;
			}
			return local27;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("97845, " + 9 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "k", descriptor = "(I)I")
	public int method110() {
		try {
			this.anInt123 += 2;
			@Pc(29) int local29 = ((this.aByteArray1[this.anInt123 - 2] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 1] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("37035, " + -193 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "e", descriptor = "(Z)I")
	public int method111() {
		try {
			this.anInt123 += 2;
			@Pc(34) int local34 = ((this.aByteArray1[this.anInt123 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 2] - 128 & 0xFF);
			if (local34 > 32767) {
				local34 -= 65536;
			}
			return local34;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("46399, " + false + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "d", descriptor = "(B)I")
	public int method112() {
		try {
			this.anInt123 += 3;
			return ((this.aByteArray1[this.anInt123 - 2] & 0xFF) << 16) + ((this.aByteArray1[this.anInt123 - 3] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 1] & 0xFF);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("89898, " + -86 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "l", descriptor = "(I)I")
	public int method113() {
		try {
			this.anInt123 += 4;
			return ((this.aByteArray1[this.anInt123 - 1] & 0xFF) << 24) + ((this.aByteArray1[this.anInt123 - 2] & 0xFF) << 16) + ((this.aByteArray1[this.anInt123 - 3] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 4] & 0xFF);
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("72301, " + -105 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "m", descriptor = "(I)I")
	public int method114(@OriginalArg(0) int arg0) {
		try {
			this.anInt123 += 4;
			@Pc(9) boolean local9 = false;
			return ((this.aByteArray1[this.anInt123 - 3] & 0xFF) << 24) + ((this.aByteArray1[this.anInt123 - 4] & 0xFF) << 16) + ((this.aByteArray1[this.anInt123 - 1] & 0xFF) << 8) + (this.aByteArray1[this.anInt123 - 2] & 0xFF);
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("17588, " + arg0 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!BFQIDHPO", name = "a", descriptor = "(I[BZI)V")
	public void method115(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(15) int local15 = arg1 + 0 - 1; local15 >= 0; local15--) {
				this.aByteArray1[this.anInt123++] = (byte) (arg0[local15] + 128);
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("71591, " + 0 + ", " + arg0 + ", " + true + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}
}
