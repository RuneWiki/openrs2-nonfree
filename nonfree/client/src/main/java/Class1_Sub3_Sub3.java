import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	private static int anInt535;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private static int anInt541;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private static int anInt542;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "I")
	private static int anInt543;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "I")
	private static int anInt536 = -626;

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
	public byte[] aByteArray8;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public int anInt539;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	public int anInt540;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!tb;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private int anInt537 = -626;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
	private boolean aBoolean143 = true;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "B")
	private byte aByte30 = 6;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	private int anInt538 = 5;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "B")
	private byte aByte31 = -51;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "Z")
	private boolean aBoolean144 = false;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "Z")
	private boolean aBoolean145 = true;

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
			anIntArray190[local6] = local9;
		}
		anIntArray191 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass28_6 = new Class28((byte) 3);
		aClass28_7 = new Class28((byte) 3);
		aClass28_8 = new Class28((byte) 3);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class1_Sub3_Sub3 method359() {
		try {
			@Pc(7) Class28 local7 = aClass28_7;
			synchronized (aClass28_7) {
				@Pc(11) Class1_Sub3_Sub3 local11 = null;
				if (anInt542 > 0) {
					anInt542--;
					local11 = (Class1_Sub3_Sub3) aClass28_7.method436();
				}
				if (local11 != null) {
					local11.anInt539 = 0;
					return local11;
				}
			}
			@Pc(73) Class1_Sub3_Sub3 local73 = new Class1_Sub3_Sub3(anInt536);
			local73.anInt539 = 0;
			local73.aByteArray8 = new byte[5000];
			return local73;
		} catch (@Pc(100) RuntimeException local100) {
			signlink.reporterror("98749, " + 1 + ", " + ", " + local100.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub3(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 0) {
				for (@Pc(26) int local26 = 1; local26 > 0; local26++) {
				}
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("77181, " + arg0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([BZ)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) boolean arg1) {
		try {
			this.aByteArray8 = arg0;
			this.anInt539 = 0;
			if (!arg1) {
				for (@Pc(32) int local32 = 1; local32 > 0; local32++) {
				}
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("79878, " + arg0 + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method360(@OriginalArg(0) int arg0) {
		try {
			@Pc(1) Class28 local1 = aClass28_7;
			synchronized (aClass28_7) {
				this.anInt539 = 0;
				if (this.aByteArray8.length == 100 && anInt541 < 1000) {
					aClass28_6.method434(this);
					anInt541++;
					return;
				}
				if (this.aByteArray8.length == 5000 && anInt542 < 250) {
					aClass28_7.method434(this);
					anInt542++;
					return;
				}
				if (this.aByteArray8.length == 30000 && anInt543 < 50) {
					aClass28_8.method434(this);
					anInt543++;
					return;
				}
			}
			@Pc(70) boolean local70 = false;
		} catch (@Pc(72) RuntimeException local72) {
			signlink.reporterror("11473, " + arg0 + ", " + local72.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public void method361(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray8[this.anInt539++] = (byte) (arg0 + this.aClass38_2.method512());
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("78681, " + 4 + ", " + arg0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method362(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt539++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method363(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 8);
		this.aByteArray8[this.anInt539++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(II)V")
	public void method364(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray8[this.anInt539++] = (byte) arg0;
			this.aByteArray8[this.anInt539++] = 0;
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("58215, " + 837 + ", " + arg0 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method365(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 16);
		this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 8);
		this.aByteArray8[this.anInt539++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public void method366(@OriginalArg(0) int arg0) {
		this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 24);
		this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 16);
		this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 8);
		this.aByteArray8[this.anInt539++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(II)V")
	public void method367(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray8[this.anInt539++] = (byte) arg0;
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 8);
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 16);
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 24);
			if (arg1 < 0) {
				;
			}
		} catch (@Pc(57) RuntimeException local57) {
			signlink.reporterror("67619, " + arg0 + ", " + arg1 + ", " + local57.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJ)V")
	public void method368(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 56);
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 48);
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 40);
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 32);
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 24);
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 16);
			this.aByteArray8[this.anInt539++] = (byte) (arg0 >> 8);
			this.aByteArray8[this.anInt539++] = (byte) arg0;
		} catch (@Pc(126) RuntimeException local126) {
			signlink.reporterror("92225, " + 8 + ", " + arg0 + ", " + local126.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method369(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray8, this.anInt539);
		this.anInt539 += arg0.length();
		this.aByteArray8[this.anInt539++] = 10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI[BI)V")
	public void method370(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		try {
			@Pc(6) boolean local6 = false;
			for (@Pc(11) int local11 = 0; local11 < arg1; local11++) {
				this.aByteArray8[this.anInt539++] = arg2[local11];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("91014, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)V")
	public void method371(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray8[this.anInt539 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("91459, " + arg0 + ", " + -69 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public int method372() {
		return this.aByteArray8[this.anInt539++] & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()B")
	public byte method373() {
		return this.aByteArray8[this.anInt539++];
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()I")
	public int method374() {
		this.anInt539 += 2;
		return ((this.aByteArray8[this.anInt539 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt539 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "()I")
	public int method375() {
		this.anInt539 += 2;
		@Pc(27) int local27 = ((this.aByteArray8[this.anInt539 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt539 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "()I")
	public int method376() {
		this.anInt539 += 3;
		return ((this.aByteArray8[this.anInt539 - 3] & 0xFF) << 16) + ((this.aByteArray8[this.anInt539 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt539 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "()I")
	public int method377() {
		this.anInt539 += 4;
		return ((this.aByteArray8[this.anInt539 - 4] & 0xFF) << 24) + ((this.aByteArray8[this.anInt539 - 3] & 0xFF) << 16) + ((this.aByteArray8[this.anInt539 - 2] & 0xFF) << 8) + (this.aByteArray8[this.anInt539 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)J")
	public long method378() {
		try {
			@Pc(5) long local5 = (long) this.method377() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method377() & 0xFFFFFFFFL;
			return (local5 << 32) + local11;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("70268, " + -29068 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method379() {
		@Pc(2) int local2 = this.anInt539;
		while (this.aByteArray8[this.anInt539++] != 10) {
		}
		return new String(this.aByteArray8, local2, this.anInt539 - local2 - 1);
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)[B")
	public byte[] method380(@OriginalArg(0) int arg0) {
		try {
			@Pc(2) int local2 = this.anInt539;
			@Pc(6) boolean local6 = false;
			while (this.aByteArray8[this.anInt539++] != 10) {
			}
			@Pc(27) byte[] local27 = new byte[this.anInt539 - local2 - 1];
			for (@Pc(29) int local29 = local2; local29 < this.anInt539 - 1; local29++) {
				local27[local29 - local2] = this.aByteArray8[local29];
			}
			return local27;
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("58261, " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIII)V")
	public void method381(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		try {
			for (@Pc(11) int local11 = arg2; local11 < arg2 + arg1; local11++) {
				arg0[local11] = this.aByteArray8[this.anInt539++];
			}
		} catch (@Pc(34) RuntimeException local34) {
			signlink.reporterror("85189, " + arg0 + ", " + arg1 + ", " + arg2 + ", " + ", " + local34.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "(I)V")
	public void method382(@OriginalArg(0) int arg0) {
		try {
			this.anInt540 = this.anInt539 * 8;
			@Pc(9) boolean local9 = false;
		} catch (@Pc(11) RuntimeException local11) {
			signlink.reporterror("40813, " + arg0 + ", " + local11.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(II)I")
	public int method383(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt540 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt540 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt540 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray8[local6++] & anIntArray191[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray8[local6] & anIntArray191[local13];
			} else {
				local15 += this.aByteArray8[local6] >> local13 - arg0 & anIntArray191[arg0];
			}
			return local15;
		} catch (@Pc(92) RuntimeException local92) {
			signlink.reporterror("74852, " + 7 + ", " + arg0 + ", " + local92.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "(I)V")
	public void method384() {
		try {
			this.anInt539 = (this.anInt540 + 7) / 8;
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("43697, " + -714 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "()I")
	public int method385() {
		@Pc(7) int local7 = this.aByteArray8[this.anInt539] & 0xFF;
		return local7 < 128 ? this.method372() - 64 : this.method374() - 49152;
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
	public int method386() {
		@Pc(7) int local7 = this.aByteArray8[this.anInt539] & 0xFF;
		return local7 < 128 ? this.method372() : this.method374() - 32768;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/math/BigInteger;ILjava/math/BigInteger;)V")
	public void method387(@OriginalArg(0) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt539;
			this.anInt539 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method381(local8, local2, 0);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(24) BigInteger local24 = local19.modPow(arg1, arg0);
			@Pc(27) byte[] local27 = local24.toByteArray();
			this.anInt539 = 0;
			this.method362(local27.length);
			if (this.anInt538 <= 5 && this.anInt538 >= 5) {
				this.method370((byte) 4, local27.length, local27);
			}
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("56061, " + arg0 + ", " + 5 + ", " + arg1 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}
}
