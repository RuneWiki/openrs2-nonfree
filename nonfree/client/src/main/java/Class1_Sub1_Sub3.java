import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!mb")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!mb", name = "v", descriptor = "I")
	private static int anInt780;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "I")
	private static int anInt781;

	@OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
	private static int anInt782;

	@OriginalMember(owner = "client!mb", name = "s", descriptor = "[I")
	private static int[] anIntArray224 = new int[256];

	@OriginalMember(owner = "client!mb", name = "t", descriptor = "[I")
	private static final int[] anIntArray225;

	@OriginalMember(owner = "client!mb", name = "y", descriptor = "Lclient!pb;")
	private static Class31 aClass31_4;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "Lclient!pb;")
	private static Class31 aClass31_5;

	@OriginalMember(owner = "client!mb", name = "A", descriptor = "Lclient!pb;")
	private static Class31 aClass31_6;

	@OriginalMember(owner = "client!mb", name = "p", descriptor = "[B")
	public byte[] aByteArray9;

	@OriginalMember(owner = "client!mb", name = "q", descriptor = "I")
	public int anInt778;

	@OriginalMember(owner = "client!mb", name = "r", descriptor = "I")
	public int anInt779;

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!xb;")
	public Class45 aClass45_2;

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "Z")
	private boolean aBoolean172 = true;

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "I")
	private int anInt776 = 8;

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "B")
	private byte aByte33 = 9;

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "Z")
	private boolean aBoolean173 = true;

	@OriginalMember(owner = "client!mb", name = "l", descriptor = "Z")
	private boolean aBoolean174 = false;

	@OriginalMember(owner = "client!mb", name = "m", descriptor = "Z")
	private boolean aBoolean175 = false;

	@OriginalMember(owner = "client!mb", name = "n", descriptor = "I")
	private int anInt777 = 27016;

	@OriginalMember(owner = "client!mb", name = "o", descriptor = "Z")
	private boolean aBoolean176 = false;

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
			anIntArray224[local4] = local7;
		}
		anIntArray225 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass31_4 = new Class31(false);
		aClass31_5 = new Class31(false);
		aClass31_6 = new Class31(false);
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(ZI)Lclient!mb;")
	public static Class1_Sub1_Sub3 method483() {
		try {
			@Pc(3) Class31 local3 = aClass31_5;
			synchronized (aClass31_5) {
				@Pc(7) Class1_Sub1_Sub3 local7 = null;
				if (anInt781 > 0) {
					anInt781--;
					local7 = (Class1_Sub1_Sub3) aClass31_5.method523();
				}
				if (local7 != null) {
					local7.anInt778 = 0;
					return local7;
				}
			}
			@Pc(75) Class1_Sub1_Sub3 local75 = new Class1_Sub1_Sub3((byte) 115);
			local75.anInt778 = 0;
			local75.aByteArray9 = new byte[5000];
			return local75;
		} catch (@Pc(102) RuntimeException local102) {
			signlink.reporterror("4075, " + false + ", " + 1 + ", " + local102.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(B)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) byte arg0) {
	}

	@OriginalMember(owner = "client!mb", name = "<init>", descriptor = "([BZ)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray9 = arg0;
			this.anInt778 = 0;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("23657, " + arg0 + ", " + arg1 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Z)V")
	public void method484() {
		try {
			@Pc(1) Class31 local1 = aClass31_5;
			synchronized (aClass31_5) {
				this.anInt778 = 0;
				if (this.aByteArray9.length == 100 && anInt780 < 1000) {
					aClass31_4.method521(this);
					anInt780++;
				} else if (this.aByteArray9.length == 5000 && anInt781 < 250) {
					aClass31_5.method521(this);
					anInt781++;
				} else if (this.aByteArray9.length == 30000 && anInt782 < 50) {
					aClass31_6.method521(this);
					anInt782++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("17712, " + false + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II)V")
	public void method485(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray9[this.anInt778++] = (byte) (arg0 + this.aClass45_2.method670());
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("28821, " + 9 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
	public void method486(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt778++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
	public void method487(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt778++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(II)V")
	public void method488(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt778++] = (byte) arg0;
			this.aByteArray9[this.anInt778++] = 0;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("63855, " + arg0 + ", " + 909 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(I)V")
	public void method489(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt778++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "(I)V")
	public void method490(@OriginalArg(0) int arg0) {
		this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 24);
		this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 16);
		this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 8);
		this.aByteArray9[this.anInt778++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IB)V")
	public void method491(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt778++] = (byte) arg0;
			this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 8);
			this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 16);
			this.aByteArray9[this.anInt778++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("66327, " + arg0 + ", " + 127 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IJ)V")
	public void method492(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1) {
		try {
			this.aByteArray9[this.anInt778++] = (byte) (arg1 >> 56);
			this.aByteArray9[this.anInt778++] = (byte) (arg1 >> 48);
			this.aByteArray9[this.anInt778++] = (byte) (arg1 >> 40);
			this.aByteArray9[this.anInt778++] = (byte) (arg1 >> 32);
			this.aByteArray9[this.anInt778++] = (byte) (arg1 >> 24);
			this.aByteArray9[this.anInt778++] = (byte) (arg1 >> 16);
			this.aByteArray9[this.anInt778++] = (byte) (arg1 >> 8);
			@Pc(110) boolean local110 = false;
			this.aByteArray9[this.anInt778++] = (byte) arg1;
		} catch (@Pc(132) RuntimeException local132) {
			signlink.reporterror("79406, " + arg0 + ", " + arg1 + ", " + local132.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method493(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray9, this.anInt778);
		this.anInt778 += arg0.length();
		this.aByteArray9[this.anInt778++] = 10;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "([BIII)V")
	public void method494(@OriginalArg(0) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(12) int local12 = 0; local12 < arg1 + 0; local12++) {
				this.aByteArray9[this.anInt778++] = arg0[local12];
			}
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("24898, " + arg0 + ", " + -37074 + ", " + arg1 + ", " + 0 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IZ)V")
	public void method495(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray9[this.anInt778 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("28442, " + arg0 + ", " + false + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "()I")
	public int method496() {
		return this.aByteArray9[this.anInt778++] & 0xFF;
	}

	@OriginalMember(owner = "client!mb", name = "d", descriptor = "()B")
	public byte method497() {
		return this.aByteArray9[this.anInt778++];
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "()I")
	public int method498() {
		this.anInt778 += 2;
		return ((this.aByteArray9[this.anInt778 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt778 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "()I")
	public int method499() {
		this.anInt778 += 2;
		@Pc(27) int local27 = ((this.aByteArray9[this.anInt778 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt778 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "()I")
	public int method500() {
		this.anInt778 += 3;
		return ((this.aByteArray9[this.anInt778 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt778 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt778 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "h", descriptor = "()I")
	public int method501() {
		this.anInt778 += 4;
		return ((this.aByteArray9[this.anInt778 - 4] & 0xFF) << 24) + ((this.aByteArray9[this.anInt778 - 3] & 0xFF) << 16) + ((this.aByteArray9[this.anInt778 - 2] & 0xFF) << 8) + (this.aByteArray9[this.anInt778 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)J")
	public long method502() {
		try {
			@Pc(5) long local5 = (long) this.method501() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method501() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("15434, " + true + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method503() {
		@Pc(2) int local2 = this.anInt778;
		while (this.aByteArray9[this.anInt778++] != 10) {
		}
		return new String(this.aByteArray9, local2, this.anInt778 - local2 - 1);
	}

	@OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)[B")
	public byte[] method504(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt778;
			while (this.aByteArray9[this.anInt778++] != 10) {
			}
			@Pc(23) byte[] local23 = new byte[this.anInt778 - local2 - 1];
			if (arg0 != this.anInt776) {
				this.aBoolean176 = !this.aBoolean176;
			}
			for (@Pc(37) int local37 = local2; local37 < this.anInt778 - 1; local37++) {
				local23[local37 - local2] = this.aByteArray9[local37];
			}
			return local23;
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("97860, " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(II[BI)V")
	public void method505(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(11) int local11 = 0; local11 < arg0 + 0; local11++) {
				arg1[local11] = this.aByteArray9[this.anInt778++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("22715, " + arg0 + ", " + 768 + ", " + arg1 + ", " + 0 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "f", descriptor = "(I)V")
	public void method506() {
		try {
			this.anInt779 = this.anInt778 * 8;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("35071, " + -15529 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "c", descriptor = "(II)I")
	public int method507(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(6) int local6 = this.anInt779 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt779 & 0x7);
			@Pc(15) int local15 = 0;
			if (arg1 >= 0) {
				for (@Pc(19) int local19 = 1; local19 > 0; local19++) {
				}
			}
			this.anInt779 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray9[local6++] & anIntArray225[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray9[local6] & anIntArray225[local13];
			} else {
				local15 += this.aByteArray9[local6] >> local13 - arg0 & anIntArray225[arg0];
			}
			return local15;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("58028, " + arg0 + ", " + arg1 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "g", descriptor = "(I)V")
	public void method508() {
		try {
			this.anInt778 = (this.anInt779 + 7) / 8;
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("71977, " + 37124 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!mb", name = "j", descriptor = "()I")
	public int method509() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt778] & 0xFF;
		return local7 < 128 ? this.method496() - 64 : this.method498() - 49152;
	}

	@OriginalMember(owner = "client!mb", name = "k", descriptor = "()I")
	public int method510() {
		@Pc(7) int local7 = this.aByteArray9[this.anInt778] & 0xFF;
		return local7 < 128 ? this.method496() : this.method498() - 32768;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method511(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt778;
			this.anInt778 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method505(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg0, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt778 = 0;
			this.method486(local27.length);
			this.method494(local27, local27.length);
		} catch (@Pc(53) RuntimeException local53) {
			signlink.reporterror("50752, " + arg0 + ", " + arg1 + ", " + 4 + ", " + local53.toString());
			throw new RuntimeException();
		}
	}
}
