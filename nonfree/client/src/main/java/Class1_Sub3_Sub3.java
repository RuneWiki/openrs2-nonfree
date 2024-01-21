import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private static int anInt568;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private static int anInt569;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private static int anInt570;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[I")
	private static int[] anIntArray190 = new int[256];

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "[I")
	private static final int[] anIntArray191;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Lclient!ob;")
	private static Class28 aClass28_6;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!ob;")
	private static Class28 aClass28_7;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Lclient!ob;")
	private static Class28 aClass28_8;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public int anInt566;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	public int anInt567;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!tb;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Z")
	private boolean aBoolean129 = false;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	private int anInt559 = 958;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	private int anInt560 = 958;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private int anInt561 = -278;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	private int anInt562 = 2;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	private int anInt563 = -17143;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	private int anInt564 = -17143;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
	private boolean aBoolean131 = false;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "I")
	private int anInt565 = 4;

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
			anIntArray190[local4] = local7;
		}
		anIntArray191 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass28_6 = new Class28(2);
		aClass28_7 = new Class28(2);
		aClass28_8 = new Class28(2);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)Lclient!kb;")
	public static Class1_Sub3_Sub3 method370(@OriginalArg(0) byte arg0) {
		try {
			@Pc(3) Class28 local3 = aClass28_7;
			synchronized (aClass28_7) {
				@Pc(7) Class1_Sub3_Sub3 local7 = null;
				if (anInt569 > 0) {
					anInt569--;
					local7 = (Class1_Sub3_Sub3) aClass28_7.method447();
				}
				if (local7 != null) {
					local7.anInt566 = 0;
					return local7;
				}
			}
			@Pc(69) boolean local69 = false;
			@Pc(82) Class1_Sub3_Sub3 local82 = new Class1_Sub3_Sub3(-25549);
			local82.anInt566 = 0;
			local82.aByteArray7 = new byte[5000];
			return local82;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("90285, " + arg0 + ", " + 1 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I[B)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray7 = arg1;
			this.anInt566 = 0;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("98763, " + arg0 + ", " + arg1 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method371() {
		try {
			@Pc(1) Class28 local1 = aClass28_7;
			synchronized (aClass28_7) {
				this.anInt566 = 0;
				if (this.aByteArray7.length == 100 && anInt568 < 1000) {
					aClass28_6.method445(this);
					anInt568++;
				} else if (this.aByteArray7.length == 5000 && anInt569 < 250) {
					aClass28_7.method445(this);
					anInt569++;
				} else if (this.aByteArray7.length == 30000 && anInt570 < 50) {
					aClass28_8.method445(this);
					anInt570++;
				}
			}
		} catch (@Pc(77) RuntimeException local77) {
			signlink.reporterror("21502, " + 23 + ", " + local77.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public void method372(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt566++] = (byte) (arg0 + this.aClass38_2.method524());
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("14000, " + 0 + ", " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method373(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt566++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method374(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt566++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(BI)V")
	public void method375(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt566++] = (byte) arg0;
			this.aByteArray7[this.anInt566++] = 0;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("96542, " + 29 + ", " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method376(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt566++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public void method377(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt566++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(BI)V")
	public void method378(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt566++] = (byte) arg0;
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 24);
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("81829, " + 114 + ", " + arg0 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJ)V")
	public void method379(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 56);
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 48);
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 40);
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 32);
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 24);
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt566++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt566++] = (byte) arg0;
		} catch (@Pc(123) RuntimeException local123) {
			signlink.reporterror("59727, " + 6 + ", " + arg0 + ", " + local123.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method380(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray7, this.anInt566);
		this.anInt566 += arg0.length();
		this.aByteArray7[this.anInt566++] = 10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII)V")
	public void method381(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(3) int local3 = 3 / arg2;
			for (@Pc(5) int local5 = 0; local5 < arg0 + 0; local5++) {
				this.aByteArray7[this.anInt566++] = arg1[local5];
			}
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("34954, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + 0 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public void method382(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt566 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(15) RuntimeException local15) {
			signlink.reporterror("25437, " + arg0 + ", " + false + ", " + local15.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public int method383() {
		return this.aByteArray7[this.anInt566++] & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()B")
	public byte method384() {
		return this.aByteArray7[this.anInt566++];
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()I")
	public int method385() {
		this.anInt566 += 2;
		return ((this.aByteArray7[this.anInt566 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt566 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "()I")
	public int method386() {
		this.anInt566 += 2;
		@Pc(27) int local27 = ((this.aByteArray7[this.anInt566 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt566 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "()I")
	public int method387() {
		this.anInt566 += 3;
		return ((this.aByteArray7[this.anInt566 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt566 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt566 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "()I")
	public int method388() {
		this.anInt566 += 4;
		return ((this.aByteArray7[this.anInt566 - 4] & 0xFF) << 24) + ((this.aByteArray7[this.anInt566 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt566 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt566 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)J")
	public long method389() {
		try {
			@Pc(5) long local5 = (long) this.method388() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method388() & 0xFFFFFFFFL;
			return (local5 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("91290, " + -79 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method390() {
		@Pc(2) int local2 = this.anInt566;
		while (this.aByteArray7[this.anInt566++] != 10) {
		}
		return new String(this.aByteArray7, local2, this.anInt566 - local2 - 1);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)[B")
	public byte[] method391() {
		try {
			@Pc(4) int local4 = this.anInt566;
			while (this.aByteArray7[this.anInt566++] != 10) {
			}
			@Pc(25) byte[] local25 = new byte[this.anInt566 - local4 - 1];
			for (@Pc(36) int local36 = local4; local36 < this.anInt566 - 1; local36++) {
				local25[local36 - local4] = this.aByteArray7[local36];
			}
			return local25;
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("12363, " + 497 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BIZ)V")
	public void method392(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(6) int local6 = arg0; local6 < arg0 + arg2; local6++) {
				arg1[local6] = this.aByteArray7[this.anInt566++];
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("36506, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + false + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public void method393() {
		try {
			if (this.anInt562 > 2 || this.anInt562 < 2) {
				this.anInt562 = 123;
			}
			this.anInt567 = this.anInt566 * 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("43611, " + 2 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)I")
	public int method394(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt567 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt567 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt567 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray7[local6++] & anIntArray191[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray7[local6] & anIntArray191[local13];
			} else {
				local15 += this.aByteArray7[local6] >> local13 - arg0 & anIntArray191[arg0];
			}
			return local15;
		} catch (@Pc(91) RuntimeException local91) {
			signlink.reporterror("415, " + arg0 + ", " + 0 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
	public void method395() {
		try {
			this.anInt566 = (this.anInt567 + 7) / 8;
		} catch (@Pc(12) RuntimeException local12) {
			signlink.reporterror("29006, " + -614 + ", " + local12.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "()I")
	public int method396() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt566] & 0xFF;
		return local7 < 128 ? this.method383() - 64 : this.method385() - 49152;
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
	public int method397() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt566] & 0xFF;
		return local7 < 128 ? this.method383() : this.method385() - 32768;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BLjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method398(@OriginalArg(0) byte arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) BigInteger arg2) {
		try {
			@Pc(2) int local2 = this.anInt566;
			this.anInt566 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method392(0, local8, local2);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg2, arg1);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt566 = 0;
			this.method373(local27.length);
			this.method381(local27.length, local27, this.anInt559);
			if (arg0 == -56) {
				;
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("51913, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}
}
