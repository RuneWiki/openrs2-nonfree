import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
	private static boolean aBoolean139;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private static int anInt550;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "I")
	private static int anInt551;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "I")
	private static int anInt552;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "[I")
	private static int[] anIntArray190 = new int[256];

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "[I")
	private static final int[] anIntArray191;

	@OriginalMember(owner = "client!kb", name = "C", descriptor = "Lclient!ob;")
	private static Class28 aClass28_6;

	@OriginalMember(owner = "client!kb", name = "D", descriptor = "Lclient!ob;")
	private static Class28 aClass28_7;

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!ob;")
	private static Class28 aClass28_8;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	private int anInt545;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	public int anInt548;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	public int anInt549;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Lclient!tb;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Z")
	private boolean aBoolean136 = false;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	private int anInt543 = 43539;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "Z")
	private boolean aBoolean137 = true;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
	private boolean aBoolean138 = false;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	private int anInt544 = -780;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "B")
	private byte aByte45 = 9;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
	private boolean aBoolean140 = false;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	private int anInt546 = 710;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	private int anInt547 = 3;

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
		aClass28_6 = new Class28((byte) -47);
		aClass28_7 = new Class28((byte) -47);
		aClass28_8 = new Class28((byte) -47);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)Lclient!kb;")
	public static Class1_Sub3_Sub3 method370() {
		try {
			@Pc(3) Class28 local3 = aClass28_7;
			synchronized (aClass28_7) {
				@Pc(7) Class1_Sub3_Sub3 local7 = null;
				if (anInt551 > 0) {
					anInt551--;
					local7 = (Class1_Sub3_Sub3) aClass28_7.method447();
				}
				if (local7 != null) {
					local7.anInt548 = 0;
					return local7;
				}
			}
			@Pc(69) Class1_Sub3_Sub3 local69 = new Class1_Sub3_Sub3(0);
			local69.anInt548 = 0;
			local69.aByteArray7 = new byte[5000];
			return local69;
		} catch (@Pc(104) RuntimeException local104) {
			signlink.reporterror("96013, " + false + ", " + 1 + ", " + local104.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray7 = arg0;
			this.anInt548 = 0;
		} catch (@Pc(41) RuntimeException local41) {
			signlink.reporterror("59409, " + arg0 + ", " + arg1 + ", " + local41.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method371() {
		try {
			@Pc(1) Class28 local1 = aClass28_7;
			synchronized (aClass28_7) {
				this.anInt548 = 0;
				if (this.aByteArray7.length == 100 && anInt550 < 1000) {
					aClass28_6.method445(this);
					anInt550++;
				} else if (this.aByteArray7.length == 5000 && anInt551 < 250) {
					aClass28_7.method445(this);
					anInt551++;
				} else if (this.aByteArray7.length == 30000 && anInt552 < 50) {
					aClass28_8.method445(this);
					anInt552++;
				}
			}
		} catch (@Pc(78) RuntimeException local78) {
			signlink.reporterror("43030, " + -10196 + ", " + local78.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)V")
	public void method372(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt548++] = (byte) (arg0 + this.aClass38_2.method524());
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("83039, " + 9 + ", " + arg0 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method373(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt548++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method374(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt548++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IZ)V")
	public void method375(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt548++] = (byte) arg0;
			this.aByteArray7[this.anInt548++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("40984, " + arg0 + ", " + false + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method376(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt548++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public void method377(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt548++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public void method378(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt548++] = (byte) arg0;
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 24);
		} catch (@Pc(58) RuntimeException local58) {
			signlink.reporterror("67765, " + 0 + ", " + arg0 + ", " + local58.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JZ)V")
	public void method379(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 56);
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 48);
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 40);
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 32);
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 24);
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt548++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt548++] = (byte) arg0;
		} catch (@Pc(133) RuntimeException local133) {
			signlink.reporterror("20322, " + arg0 + ", " + true + ", " + local133.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method380(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray7, this.anInt548);
		this.anInt548 += arg0.length();
		this.aByteArray7[this.anInt548++] = 10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIII)V")
	public void method381(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			if (this.anInt543 == 43539) {
				for (@Pc(6) int local6 = 0; local6 < arg1 + 0; local6++) {
					this.aByteArray7[this.anInt548++] = arg0[local6];
				}
			}
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("7240, " + arg0 + ", " + arg1 + ", " + 0 + ", " + 43539 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
	public void method382(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt548 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("60632, " + arg0 + ", " + 9026 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public int method383() {
		return this.aByteArray7[this.anInt548++] & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()B")
	public byte method384() {
		return this.aByteArray7[this.anInt548++];
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()I")
	public int method385() {
		this.anInt548 += 2;
		return ((this.aByteArray7[this.anInt548 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt548 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "()I")
	public int method386() {
		this.anInt548 += 2;
		@Pc(27) int local27 = ((this.aByteArray7[this.anInt548 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt548 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "()I")
	public int method387() {
		this.anInt548 += 3;
		return ((this.aByteArray7[this.anInt548 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt548 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt548 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "()I")
	public int method388() {
		this.anInt548 += 4;
		return ((this.aByteArray7[this.anInt548 - 4] & 0xFF) << 24) + ((this.aByteArray7[this.anInt548 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt548 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt548 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)J")
	public long method389() {
		try {
			@Pc(5) long local5 = (long) this.method388() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method388() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("88762, " + 2 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method390() {
		@Pc(2) int local2 = this.anInt548;
		while (this.aByteArray7[this.anInt548++] != 10) {
		}
		return new String(this.aByteArray7, local2, this.anInt548 - local2 - 1);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)[B")
	public byte[] method391() {
		try {
			@Pc(10) int local10 = this.anInt548;
			while (this.aByteArray7[this.anInt548++] != 10) {
			}
			@Pc(31) byte[] local31 = new byte[this.anInt548 - local10 - 1];
			for (@Pc(33) int local33 = local10; local33 < this.anInt548 - 1; local33++) {
				local31[local33 - local10] = this.aByteArray7[local33];
			}
			return local31;
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("93974, " + 0 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BZ)V")
	public void method392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2, @OriginalArg(3) boolean arg3) {
		try {
			if (arg3) {
				this.aBoolean140 = !this.aBoolean140;
			}
			for (@Pc(11) int local11 = arg0; local11 < arg0 + arg1; local11++) {
				arg2[local11] = this.aByteArray7[this.anInt548++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("65680, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + arg3 + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public void method393() {
		try {
			this.anInt549 = this.anInt548 * 8;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("10619, " + 561 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)I")
	public int method394(@OriginalArg(0) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt549 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt549 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt549 += arg0;
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
			signlink.reporterror("76487, " + arg0 + ", " + 27 + ", " + local91.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
	public void method395(@OriginalArg(0) int arg0) {
		try {
			this.anInt548 = (this.anInt549 + 7) / 8;
			if (arg0 != -37106) {
				for (@Pc(12) int local12 = 1; local12 > 0; local12++) {
				}
			}
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("58801, " + arg0 + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "()I")
	public int method396() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt548] & 0xFF;
		return local7 < 128 ? this.method383() - 64 : this.method385() - 49152;
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
	public int method397() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt548] & 0xFF;
		return local7 < 128 ? this.method383() : this.method385() - 32768;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method398(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1, @OriginalArg(2) int arg2) {
		try {
			@Pc(2) int local2 = this.anInt548;
			this.anInt548 = 0;
			@Pc(9) boolean local9 = false;
			@Pc(12) byte[] local12 = new byte[local2];
			this.method392(0, local2, local12, this.aBoolean138);
			@Pc(24) BigInteger local24 = new BigInteger(local12);
			@Pc(29) BigInteger local29 = local24.modPow(arg0, arg1);
			@Pc(32) byte[] local32 = local29.toByteArray();
			this.anInt548 = 0;
			this.method373(local32.length);
			this.method381(local32, local32.length);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("31705, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}
