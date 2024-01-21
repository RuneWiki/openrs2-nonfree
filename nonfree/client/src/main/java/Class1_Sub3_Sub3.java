import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "I")
	private static int anInt435;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "I")
	private static int anInt436;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "I")
	private static int anInt437;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
	private static int anInt428 = -984;

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "[I")
	private static int[] anIntArray169 = new int[256];

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "[I")
	private static final int[] anIntArray170;

	@OriginalMember(owner = "client!kb", name = "z", descriptor = "Lclient!ob;")
	private static Class25 aClass25_6;

	@OriginalMember(owner = "client!kb", name = "A", descriptor = "Lclient!ob;")
	private static Class25 aClass25_7;

	@OriginalMember(owner = "client!kb", name = "B", descriptor = "Lclient!ob;")
	private static Class25 aClass25_8;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "[B")
	public byte[] aByteArray4;

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "I")
	public int anInt433;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "I")
	public int anInt434;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "Lclient!tb;")
	public Class35 aClass35_2;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "Z")
	private boolean aBoolean121 = false;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "B")
	private byte aByte21 = -46;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private int anInt429 = -494;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "I")
	private int anInt430 = -222;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "B")
	private byte aByte22 = -104;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "I")
	private int anInt431 = 553;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "Z")
	private boolean aBoolean122 = true;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	private int anInt432 = 6;

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
			anIntArray169[local6] = local9;
		}
		anIntArray170 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass25_6 = new Class25(5);
		aClass25_7 = new Class25(5);
		aClass25_8 = new Class25(5);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class1_Sub3_Sub3 method369() {
		try {
			@Pc(8) Class25 local8 = aClass25_7;
			synchronized (aClass25_7) {
				@Pc(12) Class1_Sub3_Sub3 local12 = null;
				if (anInt436 > 0) {
					anInt436--;
					local12 = (Class1_Sub3_Sub3) aClass25_7.method401();
				}
				if (local12 != null) {
					local12.anInt433 = 0;
					return local12;
				}
			}
			@Pc(74) Class1_Sub3_Sub3 local74 = new Class1_Sub3_Sub3(false);
			local74.anInt433 = 0;
			local74.aByteArray4 = new byte[5000];
			return local74;
		} catch (@Pc(101) RuntimeException local101) {
			signlink.reporterror("84430, " + 1 + ", " + 32206 + ", " + local101.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(Z)V")
	private Class1_Sub3_Sub3(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray4 = arg0;
			this.anInt433 = 0;
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("54627, " + arg0 + ", " + arg1 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method370() {
		try {
			@Pc(1) Class25 local1 = aClass25_7;
			synchronized (aClass25_7) {
				this.anInt433 = 0;
				if (this.aByteArray4.length == 100 && anInt435 < 1000) {
					aClass25_6.method399(this);
					anInt435++;
				} else if (this.aByteArray4.length == 5000 && anInt436 < 250) {
					aClass25_7.method399(this);
					anInt436++;
				} else if (this.aByteArray4.length == 30000 && anInt437 < 50) {
					aClass25_8.method399(this);
					anInt437++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("58342, " + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)V")
	public void method371(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray4[this.anInt433++] = (byte) (arg1 + this.aClass35_2.method475());
			@Pc(19) boolean local19 = false;
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("10109, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method372(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt433++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method373(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt433++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method374(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt433++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public void method375(@OriginalArg(0) int arg0) {
		this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 24);
		this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 16);
		this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 8);
		this.aByteArray4[this.anInt433++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)V")
	public void method376(@OriginalArg(0) long arg0) {
		try {
			this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 56);
			this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 48);
			this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 40);
			this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 32);
			this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 24);
			this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 16);
			this.aByteArray4[this.anInt433++] = (byte) (arg0 >> 8);
			this.aByteArray4[this.anInt433++] = (byte) arg0;
		} catch (@Pc(124) RuntimeException local124) {
			signlink.reporterror("94285, " + arg0 + ", " + -13709 + ", " + local124.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method377(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray4, this.anInt433);
		this.anInt433 += arg0.length();
		this.aByteArray4[this.anInt433++] = 10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I[BII)V")
	public void method378(@OriginalArg(1) byte[] arg0, @OriginalArg(3) int arg1) {
		try {
			for (@Pc(16) int local16 = 0; local16 < arg1; local16++) {
				this.aByteArray4[this.anInt433++] = arg0[local16];
			}
		} catch (@Pc(39) RuntimeException local39) {
			signlink.reporterror("86674, " + 2 + ", " + arg0 + ", " + ", " + arg1 + ", " + local39.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)V")
	public void method379(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray4[this.anInt433 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("44306, " + arg0 + ", " + -12 + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public int method380() {
		return this.aByteArray4[this.anInt433++] & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()B")
	public byte method381() {
		return this.aByteArray4[this.anInt433++];
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()I")
	public int method382() {
		this.anInt433 += 2;
		return ((this.aByteArray4[this.anInt433 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt433 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "()I")
	public int method383() {
		this.anInt433 += 2;
		@Pc(27) int local27 = ((this.aByteArray4[this.anInt433 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt433 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "()I")
	public int method384() {
		this.anInt433 += 3;
		return ((this.aByteArray4[this.anInt433 - 3] & 0xFF) << 16) + ((this.aByteArray4[this.anInt433 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt433 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "()I")
	public int method385() {
		this.anInt433 += 4;
		return ((this.aByteArray4[this.anInt433 - 4] & 0xFF) << 24) + ((this.aByteArray4[this.anInt433 - 3] & 0xFF) << 16) + ((this.aByteArray4[this.anInt433 - 2] & 0xFF) << 8) + (this.aByteArray4[this.anInt433 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)J")
	public long method386() {
		try {
			@Pc(5) long local5 = (long) this.method385() & 0xFFFFFFFFL;
			@Pc(21) long local21 = (long) this.method385() & 0xFFFFFFFFL;
			return (local5 << 32) + local21;
		} catch (@Pc(28) RuntimeException local28) {
			signlink.reporterror("41382, " + 720 + ", " + local28.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method387() {
		@Pc(2) int local2 = this.anInt433;
		while (this.aByteArray4[this.anInt433++] != 10) {
		}
		return new String(this.aByteArray4, local2, this.anInt433 - local2 - 1);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)[B")
	public byte[] method388() {
		try {
			@Pc(2) int local2 = this.anInt433;
			while (this.aByteArray4[this.anInt433++] != 10) {
			}
			@Pc(28) byte[] local28 = new byte[this.anInt433 - local2 - 1];
			for (@Pc(30) int local30 = local2; local30 < this.anInt433 - 1; local30++) {
				local28[local30 - local2] = this.aByteArray4[local30];
			}
			return local28;
		} catch (@Pc(51) RuntimeException local51) {
			signlink.reporterror("69249, " + true + ", " + local51.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "([BIII)V")
	public void method389(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(8) int local8 = arg2; local8 < arg2 + arg1; local8++) {
				arg0[local8] = this.aByteArray4[this.anInt433++];
			}
		} catch (@Pc(31) RuntimeException local31) {
			signlink.reporterror("10937, " + arg0 + ", " + arg1 + ", " + 7 + ", " + arg2 + ", " + local31.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "(I)V")
	public void method390(@OriginalArg(0) int arg0) {
		try {
			if (arg0 >= 7 && arg0 <= 7) {
				this.anInt434 = this.anInt433 * 8;
			}
		} catch (@Pc(14) RuntimeException local14) {
			signlink.reporterror("48055, " + arg0 + ", " + local14.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)I")
	public int method391(@OriginalArg(0) int arg0) {
		try {
			@Pc(7) int local7;
			if (this.aByte21 != -46) {
				for (local7 = 1; local7 > 0; local7++) {
				}
			}
			local7 = this.anInt434 >> 3;
			@Pc(24) int local24 = 8 - (this.anInt434 & 0x7);
			@Pc(26) int local26 = 0;
			this.anInt434 += arg0;
			while (arg0 > local24) {
				local26 += (this.aByteArray4[local7++] & anIntArray170[local24]) << arg0 - local24;
				arg0 -= local24;
				local24 = 8;
			}
			if (arg0 == local24) {
				local26 += this.aByteArray4[local7] & anIntArray170[local24];
			} else {
				local26 += this.aByteArray4[local7] >> local24 - arg0 & anIntArray170[arg0];
			}
			return local26;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("79078, " + arg0 + ", " + -46 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)V")
	public void method392(@OriginalArg(0) byte arg0) {
		try {
			if (arg0 == 7) {
				this.anInt433 = (this.anInt434 + 7) / 8;
			}
		} catch (@Pc(13) RuntimeException local13) {
			signlink.reporterror("91278, " + arg0 + ", " + local13.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "()I")
	public int method393() {
		@Pc(7) int local7 = this.aByteArray4[this.anInt433] & 0xFF;
		return local7 < 128 ? this.method380() - 64 : this.method382() - 49152;
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
	public int method394() {
		@Pc(7) int local7 = this.aByteArray4[this.anInt433] & 0xFF;
		return local7 < 128 ? this.method380() : this.method382() - 32768;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method395(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt433;
			this.anInt433 = 0;
			@Pc(14) byte[] local14 = new byte[local2];
			this.method389(local14, local2, 0);
			@Pc(25) BigInteger local25 = new BigInteger(local14);
			@Pc(30) BigInteger local30 = local25.modPow(arg0, arg1);
			@Pc(33) byte[] local33 = local30.toByteArray();
			this.anInt433 = 0;
			this.method372(local33.length);
			this.method378(local33, local33.length);
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("72655, " + arg0 + ", " + arg1 + ", " + -623 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}
}
