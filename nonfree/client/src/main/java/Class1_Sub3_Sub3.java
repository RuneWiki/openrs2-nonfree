import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!kb")
public final class Class1_Sub3_Sub3 extends Class1_Sub3 {

	@OriginalMember(owner = "client!kb", name = "t", descriptor = "I")
	private static int anInt556;

	@OriginalMember(owner = "client!kb", name = "u", descriptor = "I")
	private static int anInt557;

	@OriginalMember(owner = "client!kb", name = "v", descriptor = "I")
	private static int anInt558;

	@OriginalMember(owner = "client!kb", name = "q", descriptor = "[I")
	private static int[] anIntArray190 = new int[256];

	@OriginalMember(owner = "client!kb", name = "r", descriptor = "[I")
	private static final int[] anIntArray191;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!ob;")
	private static Class28 aClass28_6;

	@OriginalMember(owner = "client!kb", name = "x", descriptor = "Lclient!ob;")
	private static Class28 aClass28_7;

	@OriginalMember(owner = "client!kb", name = "y", descriptor = "Lclient!ob;")
	private static Class28 aClass28_8;

	@OriginalMember(owner = "client!kb", name = "n", descriptor = "[B")
	public byte[] aByteArray7;

	@OriginalMember(owner = "client!kb", name = "o", descriptor = "I")
	public int anInt554;

	@OriginalMember(owner = "client!kb", name = "p", descriptor = "I")
	public int anInt555;

	@OriginalMember(owner = "client!kb", name = "s", descriptor = "Lclient!tb;")
	public Class38 aClass38_2;

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "Z")
	private boolean aBoolean129 = true;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	private int anInt551 = 10434;

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "B")
	private byte aByte33 = 2;

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "I")
	private int anInt552 = -934;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
	private boolean aBoolean130 = true;

	@OriginalMember(owner = "client!kb", name = "m", descriptor = "I")
	private int anInt553 = 24924;

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
		aClass28_6 = new Class28((byte) 30);
		aClass28_7 = new Class28((byte) 30);
		aClass28_8 = new Class28((byte) 30);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II)Lclient!kb;")
	public static Class1_Sub3_Sub3 method378() {
		try {
			@Pc(13) Class28 local13 = aClass28_7;
			synchronized (aClass28_7) {
				@Pc(17) Class1_Sub3_Sub3 local17 = null;
				if (anInt557 > 0) {
					anInt557--;
					local17 = (Class1_Sub3_Sub3) aClass28_7.method455();
				}
				if (local17 != null) {
					local17.anInt554 = 0;
					return local17;
				}
			}
			@Pc(79) Class1_Sub3_Sub3 local79 = new Class1_Sub3_Sub3(-301);
			local79.anInt554 = 0;
			local79.aByteArray7 = new byte[5000];
			return local79;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("80965, " + 3 + ", " + 1 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(I)V")
	private Class1_Sub3_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!kb", name = "<init>", descriptor = "(B[B)V")
	public Class1_Sub3_Sub3(@OriginalArg(0) byte arg0, @OriginalArg(1) byte[] arg1) {
		try {
			this.aByteArray7 = arg1;
			this.anInt554 = 0;
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("23950, " + arg0 + ", " + arg1 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public void method379() {
		try {
			@Pc(1) Class28 local1 = aClass28_7;
			synchronized (aClass28_7) {
				this.anInt554 = 0;
				if (this.aByteArray7.length == 100 && anInt556 < 1000) {
					aClass28_6.method453(this);
					anInt556++;
				} else if (this.aByteArray7.length == 5000 && anInt557 < 250) {
					aClass28_7.method453(this);
					anInt557++;
				} else if (this.aByteArray7.length == 30000 && anInt558 < 50) {
					aClass28_8.method453(this);
					anInt558++;
				}
			}
		} catch (@Pc(70) RuntimeException local70) {
			signlink.reporterror("93591, " + true + ", " + local70.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
	public void method380(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt554++] = (byte) (arg0 + this.aClass38_2.method532());
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("40108, " + false + ", " + arg0 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(I)V")
	public void method381(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt554++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(I)V")
	public void method382(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt554++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(ZI)V")
	public void method383(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt554++] = (byte) arg0;
			this.aByteArray7[this.anInt554++] = 0;
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("26983, " + true + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(I)V")
	public void method384(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt554++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "(I)V")
	public void method385(@OriginalArg(0) int arg0) {
		this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 24);
		this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 16);
		this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 8);
		this.aByteArray7[this.anInt554++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(BI)V")
	public void method386(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray7[this.anInt554++] = (byte) arg0;
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 24);
		} catch (@Pc(59) RuntimeException local59) {
			signlink.reporterror("68253, " + 86 + ", " + arg0 + ", " + local59.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IJ)V")
	public void method387(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 56);
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 48);
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 40);
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 32);
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 24);
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 16);
			this.aByteArray7[this.anInt554++] = (byte) (arg0 >> 8);
			this.aByteArray7[this.anInt554++] = (byte) arg0;
		} catch (@Pc(122) RuntimeException local122) {
			signlink.reporterror("59204, " + 0 + ", " + arg0 + ", " + local122.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method388(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray7, this.anInt554);
		this.anInt554 += arg0.length();
		this.aByteArray7[this.anInt554++] = 10;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[BII)V")
	public void method389(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1) {
		try {
			for (@Pc(13) int local13 = 0; local13 < arg1 + 0; local13++) {
				this.aByteArray7[this.anInt554++] = arg0[local13];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("48477, " + -41 + ", " + arg0 + ", " + arg1 + ", " + 0 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)V")
	public void method390(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray7[this.anInt554 - arg0 - 1] = (byte) arg0;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("50293, " + arg0 + ", " + 3 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "()I")
	public int method391() {
		return this.aByteArray7[this.anInt554++] & 0xFF;
	}

	@OriginalMember(owner = "client!kb", name = "d", descriptor = "()B")
	public byte method392() {
		return this.aByteArray7[this.anInt554++];
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "()I")
	public int method393() {
		this.anInt554 += 2;
		return ((this.aByteArray7[this.anInt554 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt554 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "()I")
	public int method394() {
		this.anInt554 += 2;
		@Pc(27) int local27 = ((this.aByteArray7[this.anInt554 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt554 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "()I")
	public int method395() {
		this.anInt554 += 3;
		return ((this.aByteArray7[this.anInt554 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt554 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt554 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "h", descriptor = "()I")
	public int method396() {
		this.anInt554 += 4;
		return ((this.aByteArray7[this.anInt554 - 4] & 0xFF) << 24) + ((this.aByteArray7[this.anInt554 - 3] & 0xFF) << 16) + ((this.aByteArray7[this.anInt554 - 2] & 0xFF) << 8) + (this.aByteArray7[this.anInt554 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)J")
	public long method397(@OriginalArg(0) byte arg0) {
		try {
			@Pc(5) long local5 = (long) this.method396() & 0xFFFFFFFFL;
			@Pc(11) long local11 = (long) this.method396() & 0xFFFFFFFFL;
			@Pc(16) boolean local16 = false;
			return (local5 << 32) + local11;
		} catch (@Pc(29) RuntimeException local29) {
			signlink.reporterror("14666, " + arg0 + ", " + local29.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "()Ljava/lang/String;")
	public String method398() {
		@Pc(2) int local2 = this.anInt554;
		while (this.aByteArray7[this.anInt554++] != 10) {
		}
		return new String(this.aByteArray7, local2, this.anInt554 - local2 - 1);
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(B)[B")
	public byte[] method399() {
		try {
			@Pc(8) int local8 = this.anInt554;
			while (this.aByteArray7[this.anInt554++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt554 - local8 - 1];
			for (@Pc(31) int local31 = local8; local31 < this.anInt554 - 1; local31++) {
				local29[local31 - local8] = this.aByteArray7[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("47053, " + -66 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(II[BI)V")
	public void method400(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1, @OriginalArg(3) int arg2) {
		try {
			for (@Pc(15) int local15 = arg2; local15 < arg2 + arg0; local15++) {
				arg1[local15] = this.aByteArray7[this.anInt554++];
			}
		} catch (@Pc(38) RuntimeException local38) {
			signlink.reporterror("92464, " + arg0 + ", " + 5 + ", " + arg1 + ", " + arg2 + ", " + local38.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "c", descriptor = "(B)V")
	public void method401() {
		try {
			this.anInt555 = this.anInt554 * 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("72931, " + -43 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "b", descriptor = "(IB)I")
	public int method402(@OriginalArg(0) int arg0) {
		try {
			@Pc(17) int local17 = this.anInt555 >> 3;
			@Pc(24) int local24 = 8 - (this.anInt555 & 0x7);
			@Pc(26) int local26 = 0;
			this.anInt555 += arg0;
			while (arg0 > local24) {
				local26 += (this.aByteArray7[local17++] & anIntArray191[local24]) << arg0 - local24;
				arg0 -= local24;
				local24 = 8;
			}
			if (arg0 == local24) {
				local26 += this.aByteArray7[local17] & anIntArray191[local24];
			} else {
				local26 += this.aByteArray7[local17] >> local24 - arg0 & anIntArray191[arg0];
			}
			return local26;
		} catch (@Pc(93) RuntimeException local93) {
			signlink.reporterror("71454, " + arg0 + ", " + 6 + ", " + local93.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "e", descriptor = "(I)V")
	public void method403() {
		try {
			this.anInt554 = (this.anInt555 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("84076, " + -561 + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!kb", name = "j", descriptor = "()I")
	public int method404() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt554] & 0xFF;
		return local7 < 128 ? this.method391() - 64 : this.method393() - 49152;
	}

	@OriginalMember(owner = "client!kb", name = "k", descriptor = "()I")
	public int method405() {
		@Pc(7) int local7 = this.aByteArray7[this.anInt554] & 0xFF;
		return local7 < 128 ? this.method391() : this.method393() - 32768;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V")
	public void method406(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt554;
			this.anInt554 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method400(local2, local8, 0);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(29) BigInteger local29 = local19.modPow(arg1, arg0);
			@Pc(32) byte[] local32 = local29.toByteArray();
			this.anInt554 = 0;
			this.method381(local32.length);
			this.method389(local32, local32.length);
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("59030, " + arg0 + ", " + arg1 + ", " + 282 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}
}
