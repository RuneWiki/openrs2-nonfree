import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
	private static int anInt798;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "I")
	private static int anInt799;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
	private static int anInt800;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "Z")
	private static boolean aBoolean181 = true;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "[I")
	private static int[] anIntArray225 = new int[256];

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "[I")
	private static final int[] anIntArray226;

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!pb;")
	private static Class31 aClass31_4;

	@OriginalMember(owner = "client!mb", name = "E", descriptor = "Lclient!pb;")
	private static Class31 aClass31_5;

	@OriginalMember(owner = "client!mb", name = "F", descriptor = "Lclient!pb;")
	private static Class31 aClass31_6;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	public int anInt796;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	public int anInt797;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!xb;")
	public Class47 aClass47_2;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	private int anInt790 = -307;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "Z")
	private boolean aBoolean178 = true;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Z")
	private boolean aBoolean179 = false;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "I")
	private int anInt791 = 1;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
	private boolean aBoolean180 = true;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	private int anInt792 = -911;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
	private int anInt793 = 593;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
	private int anInt794 = 868;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "Z")
	private boolean aBoolean182 = true;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
	private int anInt795 = 17979;

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "Z")
	private boolean aBoolean183 = true;

	@OriginalMember(owner = "client!mb", name = "G", descriptor = "[C")
	private char[] aCharArray3 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };

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
			anIntArray225[local6] = local9;
		}
		anIntArray226 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass31_4 = new Class31(aBoolean181);
		aClass31_5 = new Class31(aBoolean181);
		aClass31_6 = new Class31(aBoolean181);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)Lclient!mb;")
	public static Class1_Sub1_Sub3 method485() {
		try {
			@Pc(3) Class31 local3 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt799 > 0) {
					anInt799--;
					local7 = (Class1_Sub1_Sub3) aClass31_5.method522();
				}
				if (local7 != null) {
					local7.anInt796 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub1_Sub3 local69 = new Class1_Sub1_Sub3((byte) 2);
			local69.anInt796 = 0;
			local69.aByteArray9 = new byte[5000];
			return local69;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("99555, " + 0 + ", " + 1 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(B)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray9 = arg1;
			this.anInt796 = 0;
		} catch (@Pc(310) RuntimeException local310) {
			signlink.reporterror("52956, " + arg0 + ", " + arg1 + ", " + local310.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(B)V")
	public void method486() {
		try {
			@Pc(7) Class31 local7 = aClass31_5;
			synchronized (aClass31_5) {
				this.anInt796 = 0;
				if (this.aByteArray9.length == 100 && anInt798 < 1000) {
					aClass31_4.method520(this);
					anInt798++;
				} else if (this.aByteArray9.length == 5000 && anInt799 < 250) {
					aClass31_5.method520(this);
					anInt799++;
				} else if (this.aByteArray9.length == 30000 && anInt800 < 50) {
					aClass31_6.method520(this);
					anInt800++;
				}
			}
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("46164, " + 1 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method487(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (arg1 == 0) {
				this.aByteArray9[this.anInt796++] = (byte) (arg0 + this.aClass47_2.method674());
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("32492, " + arg0 + ", " + arg1 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method488(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt796++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method489(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt796++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)V")
	public void method490(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt796++] = (byte) arg0;
			if (arg1 == 0) {
				this.aByteArray9[this.anInt796++] = 0;
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("78384, " + arg0 + ", " + arg1 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method491(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt796++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method492(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt796++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(II)V")
	public void method493(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt796++] = (byte) arg0;
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 24);
		} catch (@Pc(61) RuntimeException local61) {
			signlink.reporterror("33888, " + arg0 + ", " + 1 + ", " + local61.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(JI)V")
	public void method494(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 56);
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 48);
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 40);
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 32);
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 24);
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt796++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt796++] = (byte) arg0;
		} catch (@Pc(136) RuntimeException local136) {
			signlink.reporterror("34359, " + arg0 + ", " + 0 + ", " + local136.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method495(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt796);
		this.anInt796 += arg0.length();
		this.aByteArray9[this.anInt796++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIII)V")
	public void method496(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg1 + 0; local6++) {
				this.aByteArray9[this.anInt796++] = arg0[local6];
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("29975, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 568 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(II)V")
	public void method497(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray9[this.anInt796 - arg0 - 1] = (byte) arg0;
			@Pc(14) int local14 = 35 / arg1;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("1366, " + arg0 + ", " + arg1 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int method498() {
		return this.aByteArray9[this.anInt796++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte method499() {
		return this.aByteArray9[this.anInt796++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method500() {
		this.anInt796 += 2;
		return ((this.aByteArray9[this.anInt796 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt796 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method501() {
		this.anInt796 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt796 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt796 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method502() {
		this.anInt796 += 3;
		return ((this.aByteArray9[this.anInt796 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt796 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt796 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int method503() {
		this.anInt796 += 4;
		return ((this.aByteArray9[this.anInt796 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt796 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt796 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt796 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)J")
	public long method504() {
		try {
			@Pc(5) long local5 = (long) this.method503() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method503() & 0xFFFFFFFFL;
			return (local5 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("98493, " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method505() {
		@Pc(2) int local2 = this.anInt796;
		while (this.aByteArray9[this.anInt796++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt796 - local2 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)[B")
	public byte[] method506() {
		try {
			@Pc(2) int local2 = this.anInt796;
			while (this.aByteArray9[this.anInt796++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt796 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt796 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray9[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("91967, " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I[BII)V")
	public void method507(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg1 + 0; local7++) {
				arg0[local7] = this.aByteArray9[this.anInt796++];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("88156, " + 0 + ", " + arg0 + ", " + arg1 + ", " + 15021 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public void method508(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 9) {
				this.anInt793 = -154;
			}
			this.anInt797 = this.anInt796 * 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("56856, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)I")
	public int method509(@OriginalArg(1) int arg0) {
		try {
			@Pc(11) int local11 = this.anInt797 >> 3;
			@Pc(18) int local18 = 8 - (this.anInt797 & 0x7);
			@Pc(20) int local20 = 0;
			this.anInt797 += arg0;
			while (arg0 > local18) {
				local20 += (this.aByteArray9[local11++] & anIntArray226[local18]) << arg0 - local18;
				arg0 -= local18;
				local18 = 8;
			}
			if (arg0 == local18) {
				local20 += this.aByteArray9[local11] & anIntArray226[local18];
			} else {
				local20 += this.aByteArray9[local11] >> local18 - arg0 & anIntArray226[arg0];
			}
			return local20;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("85709, " + false + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void method510() {
		try {
			if (this.anInt791 != 1) {
				this.aBoolean179 = !this.aBoolean179;
			}
			this.anInt796 = (this.anInt797 + 7) / 8;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("83673, " + 1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method511() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt796] & 0xFF;
		return local7 < 128 ? this.method498() - 64 : this.method500() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int method512() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt796] & 0xFF;
		return local7 < 128 ? this.method498() : this.method500() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method513(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt796;
			this.anInt796 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method507(local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt796 = 0;
			this.method488(local27.length);
			this.method496(local27, local27.length);
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("18270, " + 0 + ", " + arg0 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
