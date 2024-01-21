import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!LDILQFVA")
public final class Class1_Sub1_Sub3 extends Class1_Sub1 {

	@OriginalMember(owner = "client!LDILQFVA", name = "C", descriptor = "I")
	private static int anInt445;

	@OriginalMember(owner = "client!LDILQFVA", name = "D", descriptor = "I")
	private static int anInt446;

	@OriginalMember(owner = "client!LDILQFVA", name = "E", descriptor = "I")
	private static int anInt447;

	@OriginalMember(owner = "client!LDILQFVA", name = "z", descriptor = "[I")
	private static int[] anIntArray120 = new int[256];

	@OriginalMember(owner = "client!LDILQFVA", name = "A", descriptor = "[I")
	private static final int[] anIntArray121;

	@OriginalMember(owner = "client!LDILQFVA", name = "F", descriptor = "Lclient!LOISKKJJ;")
	private static Class23 aClass23_7;

	@OriginalMember(owner = "client!LDILQFVA", name = "G", descriptor = "Lclient!LOISKKJJ;")
	private static Class23 aClass23_8;

	@OriginalMember(owner = "client!LDILQFVA", name = "H", descriptor = "Lclient!LOISKKJJ;")
	private static Class23 aClass23_9;

	@OriginalMember(owner = "client!LDILQFVA", name = "I", descriptor = "[C")
	private static char[] aCharArray4;

	@OriginalMember(owner = "client!LDILQFVA", name = "j", descriptor = "I")
	private int anInt437;

	@OriginalMember(owner = "client!LDILQFVA", name = "w", descriptor = "[B")
	public byte[] aByteArray6;

	@OriginalMember(owner = "client!LDILQFVA", name = "x", descriptor = "I")
	public int anInt443;

	@OriginalMember(owner = "client!LDILQFVA", name = "y", descriptor = "I")
	public int anInt444;

	@OriginalMember(owner = "client!LDILQFVA", name = "B", descriptor = "Lclient!KUQMNLGP;")
	public Class22 aClass22_1;

	@OriginalMember(owner = "client!LDILQFVA", name = "i", descriptor = "I")
	private int anInt436 = -969;

	@OriginalMember(owner = "client!LDILQFVA", name = "k", descriptor = "I")
	private int anInt438 = 49272;

	@OriginalMember(owner = "client!LDILQFVA", name = "l", descriptor = "B")
	private byte aByte18 = 5;

	@OriginalMember(owner = "client!LDILQFVA", name = "m", descriptor = "I")
	private int anInt439 = 5;

	@OriginalMember(owner = "client!LDILQFVA", name = "n", descriptor = "B")
	private byte aByte19 = 85;

	@OriginalMember(owner = "client!LDILQFVA", name = "o", descriptor = "I")
	private int anInt440 = 2;

	@OriginalMember(owner = "client!LDILQFVA", name = "p", descriptor = "I")
	private int anInt441 = 185;

	@OriginalMember(owner = "client!LDILQFVA", name = "q", descriptor = "Z")
	private boolean aBoolean115 = false;

	@OriginalMember(owner = "client!LDILQFVA", name = "r", descriptor = "I")
	private int anInt442 = 603;

	@OriginalMember(owner = "client!LDILQFVA", name = "s", descriptor = "Z")
	private boolean aBoolean116 = false;

	@OriginalMember(owner = "client!LDILQFVA", name = "t", descriptor = "Z")
	private boolean aBoolean117 = true;

	@OriginalMember(owner = "client!LDILQFVA", name = "u", descriptor = "Z")
	private boolean aBoolean118 = false;

	@OriginalMember(owner = "client!LDILQFVA", name = "v", descriptor = "Z")
	private boolean aBoolean119 = true;

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
			anIntArray120[local4] = local7;
		}
		anIntArray121 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };
		aClass23_7 = new Class23(6);
		aClass23_8 = new Class23(6);
		aClass23_9 = new Class23(6);
		aCharArray4 = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/' };
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(II)Lclient!LDILQFVA;")
	public static Class1_Sub1_Sub3 method347() {
		try {
			@Pc(13) Class23 local13 = aClass23_8;
			synchronized (aClass23_8) {
				@Pc(17) Class1_Sub1_Sub3 local17 = null;
				if (anInt446 > 0) {
					anInt446--;
					local17 = (Class1_Sub1_Sub3) aClass23_8.method421();
				}
				if (local17 != null) {
					local17.anInt443 = 0;
					return local17;
				}
			}
			@Pc(79) Class1_Sub1_Sub3 local79 = new Class1_Sub1_Sub3(-225);
			local79.anInt443 = 0;
			local79.aByteArray6 = new byte[5000];
			return local79;
		} catch (@Pc(106) RuntimeException local106) {
			signlink.reporterror("42504, " + 1 + ", " + 35998 + ", " + local106.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "<init>", descriptor = "(I)V")
	private Class1_Sub1_Sub3(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "<init>", descriptor = "([BI)V")
	public Class1_Sub1_Sub3(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray6 = arg0;
			if (arg1 != 0) {
				for (@Pc(47) int local47 = 1; local47 > 0; local47++) {
				}
			}
			this.anInt443 = 0;
		} catch (@Pc(56) RuntimeException local56) {
			signlink.reporterror("89384, " + arg0 + ", " + arg1 + ", " + local56.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "b", descriptor = "(II)V")
	public void method348(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) (arg0 + this.aClass22_1.method342());
		} catch (@Pc(26) RuntimeException local26) {
			signlink.reporterror("15386, " + arg0 + ", " + 926 + ", " + local26.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(I)V")
	public void method349(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt443++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "b", descriptor = "(I)V")
	public void method350(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt443++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "c", descriptor = "(II)V")
	public void method351(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) arg0;
			if (arg1 == this.anInt438) {
				this.aByteArray6[this.anInt443++] = 0;
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("49704, " + arg0 + ", " + arg1 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "c", descriptor = "(I)V")
	public void method352(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt443++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "d", descriptor = "(I)V")
	public void method353(@OriginalArg(0) int arg0) {
		this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 24);
		this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 16);
		this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 8);
		this.aByteArray6[this.anInt443++] = (byte) arg0;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "d", descriptor = "(II)V")
	public void method354(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) arg0;
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 8);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 16);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 24);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("89519, " + -793 + ", " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(ZJ)V")
	public void method355(@OriginalArg(1) long arg0) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 56);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 48);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 40);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 32);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 24);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 16);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 8);
			this.aByteArray6[this.anInt443++] = (byte) arg0;
		} catch (@Pc(131) RuntimeException local131) {
			signlink.reporterror("66830, " + true + ", " + arg0 + ", " + local131.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(Ljava/lang/String;)V")
	public void method356(@OriginalArg(0) String arg0) {
		arg0.getBytes(0, arg0.length(), this.aByteArray6, this.anInt443);
		this.anInt443 += arg0.length();
		this.aByteArray6[this.anInt443++] = 10;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(IB[BI)V")
	public void method357(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(7) int local7 = 0; local7 < arg0 + 0; local7++) {
				this.aByteArray6[this.anInt443++] = arg1[local7];
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("70385, " + arg0 + ", " + 48 + ", " + arg1 + ", " + 0 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(ZI)V")
	public void method358(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray6[this.anInt443 - arg1 - 1] = (byte) arg1;
			if (arg0) {
				for (@Pc(14) int local14 = 1; local14 > 0; local14++) {
				}
			}
		} catch (@Pc(21) RuntimeException local21) {
			signlink.reporterror("35581, " + arg0 + ", " + arg1 + ", " + local21.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "c", descriptor = "()I")
	public int method359() {
		return this.aByteArray6[this.anInt443++] & 0xFF;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "d", descriptor = "()B")
	public byte method360() {
		return this.aByteArray6[this.anInt443++];
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "e", descriptor = "()I")
	public int method361() {
		this.anInt443 += 2;
		return ((this.aByteArray6[this.anInt443 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "f", descriptor = "()I")
	public int method362() {
		this.anInt443 += 2;
		@Pc(27) int local27 = ((this.aByteArray6[this.anInt443 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 1] & 0xFF);
		if (local27 > 32767) {
			local27 -= 65536;
		}
		return local27;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "g", descriptor = "()I")
	public int method363() {
		this.anInt443 += 3;
		return ((this.aByteArray6[this.anInt443 - 3] & 0xFF) << 16) + ((this.aByteArray6[this.anInt443 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "h", descriptor = "()I")
	public int method364() {
		this.anInt443 += 4;
		return ((this.aByteArray6[this.anInt443 - 4] & 0xFF) << 24) + ((this.aByteArray6[this.anInt443 - 3] & 0xFF) << 16) + ((this.aByteArray6[this.anInt443 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "e", descriptor = "(I)J")
	public long method365() {
		try {
			@Pc(5) long local5 = (long) this.method364() & 0xFFFFFFFFL;
			@Pc(16) long local16 = (long) this.method364() & 0xFFFFFFFFL;
			return (local5 << 32) + local16;
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("83378, " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "i", descriptor = "()Ljava/lang/String;")
	public String method366() {
		@Pc(2) int local2 = this.anInt443;
		while (this.aByteArray6[this.anInt443++] != 10) {
		}
		return new String(this.aByteArray6, local2, this.anInt443 - local2 - 1);
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "f", descriptor = "(I)[B")
	public byte[] method367() {
		try {
			@Pc(2) int local2 = this.anInt443;
			while (this.aByteArray6[this.anInt443++] != 10) {
			}
			@Pc(29) byte[] local29 = new byte[this.anInt443 - local2 - 1];
			for (@Pc(31) int local31 = local2; local31 < this.anInt443 - 1; local31++) {
				local29[local31 - local2] = this.aByteArray6[local31];
			}
			return local29;
		} catch (@Pc(52) RuntimeException local52) {
			signlink.reporterror("99865, " + -34454 + ", " + local52.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "b", descriptor = "(IB[BI)V")
	private void method368(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(10) int local10 = 0; local10 < arg0 + 0; local10++) {
				arg1[local10] = this.aByteArray6[this.anInt443++];
			}
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("84772, " + arg0 + ", " + 0 + ", " + arg1 + ", " + 0 + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(Z)V")
	public void method369() {
		try {
			this.anInt444 = this.anInt443 * 8;
		} catch (@Pc(16) RuntimeException local16) {
			signlink.reporterror("9260, " + false + ", " + local16.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "b", descriptor = "(ZI)I")
	public int method370(@OriginalArg(1) int arg0) {
		try {
			@Pc(6) int local6 = this.anInt444 >> 3;
			@Pc(13) int local13 = 8 - (this.anInt444 & 0x7);
			@Pc(15) int local15 = 0;
			this.anInt444 += arg0;
			while (arg0 > local13) {
				local15 += (this.aByteArray6[local6++] & anIntArray121[local13]) << arg0 - local13;
				arg0 -= local13;
				local13 = 8;
			}
			if (arg0 == local13) {
				local15 += this.aByteArray6[local6] & anIntArray121[local13];
			} else {
				local15 += this.aByteArray6[local6] >> local13 - arg0 & anIntArray121[arg0];
			}
			return local15;
		} catch (@Pc(87) RuntimeException local87) {
			signlink.reporterror("94570, " + true + ", " + arg0 + ", " + local87.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "b", descriptor = "(Z)V")
	public void method371() {
		try {
			this.anInt443 = (this.anInt444 + 7) / 8;
		} catch (@Pc(18) RuntimeException local18) {
			signlink.reporterror("99589, " + false + ", " + local18.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "j", descriptor = "()I")
	public int method372() {
		@Pc(7) int local7 = this.aByteArray6[this.anInt443] & 0xFF;
		return local7 < 128 ? this.method359() - 64 : this.method361() - 49152;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "k", descriptor = "()I")
	public int method373() {
		@Pc(7) int local7 = this.aByteArray6[this.anInt443] & 0xFF;
		return local7 < 128 ? this.method359() : this.method361() - 32768;
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(ILjava/math/BigInteger;Ljava/math/BigInteger;)V")
	public void method374(@OriginalArg(1) BigInteger arg0, @OriginalArg(2) BigInteger arg1) {
		try {
			@Pc(2) int local2 = this.anInt443;
			this.anInt443 = 0;
			@Pc(8) byte[] local8 = new byte[local2];
			this.method368(local2, local8);
			@Pc(19) BigInteger local19 = new BigInteger(local8);
			@Pc(27) BigInteger local27 = local19.modPow(arg1, arg0);
			@Pc(30) byte[] local30 = local27.toByteArray();
			this.anInt443 = 0;
			this.method349(local30.length);
			this.method357(local30.length, local30);
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("70289, " + 715 + ", " + arg0 + ", " + arg1 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(IZ)V")
	public void method375(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) -arg0;
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("90481, " + arg0 + ", " + true + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "e", descriptor = "(II)V")
	public void method376(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) (128 - arg0);
		} catch (@Pc(17) RuntimeException local17) {
			signlink.reporterror("27421, " + arg0 + ", " + -900 + ", " + local17.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "g", descriptor = "(I)I")
	public int method377() {
		try {
			return this.aByteArray6[this.anInt443++] - 128 & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("39601, " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "h", descriptor = "(I)I")
	public int method378(@OriginalArg(0) int arg0) {
		try {
			if (arg0 <= 0) {
				this.aBoolean115 = !this.aBoolean115;
			}
			return -this.aByteArray6[this.anInt443++] & 0xFF;
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("64746, " + arg0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "i", descriptor = "(I)I")
	public int method379() {
		try {
			return 128 - this.aByteArray6[this.anInt443++] & 0xFF;
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("46873, " + 0 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "j", descriptor = "(I)B")
	public byte method380() {
		try {
			return (byte) (this.aByteArray6[this.anInt443++] - 128);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("59497, " + 7 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "c", descriptor = "(Z)B")
	public byte method381() {
		try {
			return (byte) -this.aByteArray6[this.anInt443++];
		} catch (@Pc(19) RuntimeException local19) {
			signlink.reporterror("48402, " + false + ", " + local19.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "k", descriptor = "(I)B")
	public byte method382() {
		try {
			return (byte) (128 - this.aByteArray6[this.anInt443++]);
		} catch (@Pc(24) RuntimeException local24) {
			signlink.reporterror("2648, " + 0 + ", " + local24.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "f", descriptor = "(II)V")
	public void method383(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) arg1;
			this.aByteArray6[this.anInt443++] = (byte) (arg1 >> 8);
			if (arg0 != 0) {
				this.aBoolean118 = !this.aBoolean118;
			}
		} catch (@Pc(37) RuntimeException local37) {
			signlink.reporterror("36361, " + arg0 + ", " + arg1 + ", " + local37.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "g", descriptor = "(II)V")
	public void method384(@OriginalArg(0) int arg0) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 8);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 + 128);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("62252, " + arg0 + ", " + 38866 + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "c", descriptor = "(ZI)V")
	public void method385(@OriginalArg(1) int arg0) {
		try {
			this.aByteArray6[this.anInt443++] = (byte) (arg0 + 128);
			this.aByteArray6[this.anInt443++] = (byte) (arg0 >> 8);
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("46148, " + false + ", " + arg0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "d", descriptor = "(Z)I")
	public int method386() {
		try {
			this.anInt443 += 2;
			return ((this.aByteArray6[this.anInt443 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 2] & 0xFF);
		} catch (@Pc(33) RuntimeException local33) {
			signlink.reporterror("16134, " + true + ", " + local33.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "e", descriptor = "(Z)I")
	public int method387() {
		try {
			this.anInt443 += 2;
			return ((this.aByteArray6[this.anInt443 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 1] - 128 & 0xFF);
		} catch (@Pc(35) RuntimeException local35) {
			signlink.reporterror("14537, " + true + ", " + local35.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "f", descriptor = "(Z)I")
	public int method388() {
		try {
			this.anInt443 += 2;
			return ((this.aByteArray6[this.anInt443 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 2] - 128 & 0xFF);
		} catch (@Pc(40) RuntimeException local40) {
			signlink.reporterror("59489, " + true + ", " + local40.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "l", descriptor = "(I)I")
	public int method389(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != 8754) {
				return 2;
			}
			this.anInt443 += 2;
			@Pc(32) int local32 = ((this.aByteArray6[this.anInt443 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 2] & 0xFF);
			if (local32 > 32767) {
				local32 -= 65536;
			}
			return local32;
		} catch (@Pc(42) RuntimeException local42) {
			signlink.reporterror("4385, " + arg0 + ", " + local42.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "m", descriptor = "(I)I")
	public int method390() {
		try {
			this.anInt443 += 2;
			@Pc(29) int local29 = ((this.aByteArray6[this.anInt443 - 2] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 1] - 128 & 0xFF);
			if (local29 > 32767) {
				local29 -= 65536;
			}
			return local29;
		} catch (@Pc(44) RuntimeException local44) {
			signlink.reporterror("70886, " + 0 + ", " + local44.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "g", descriptor = "(Z)I")
	public int method391(@OriginalArg(0) boolean arg0) {
		try {
			this.anInt443 += 2;
			@Pc(29) int local29 = ((this.aByteArray6[this.anInt443 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 2] - 128 & 0xFF);
			if (arg0) {
				return 3;
			} else {
				if (local29 > 32767) {
					local29 -= 65536;
				}
				return local29;
			}
		} catch (@Pc(43) RuntimeException local43) {
			signlink.reporterror("66865, " + arg0 + ", " + local43.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(B)I")
	public int method392(@OriginalArg(0) byte arg0) {
		try {
			this.anInt443 += 3;
			if (arg0 != 7) {
				for (@Pc(10) int local10 = 1; local10 > 0; local10++) {
				}
			}
			return ((this.aByteArray6[this.anInt443 - 2] & 0xFF) << 16) + ((this.aByteArray6[this.anInt443 - 3] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 1] & 0xFF);
		} catch (@Pc(50) RuntimeException local50) {
			signlink.reporterror("94228, " + arg0 + ", " + local50.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "b", descriptor = "(B)I")
	public int method393(@OriginalArg(0) byte arg0) {
		try {
			this.anInt443 += 4;
			@Pc(10) boolean local10 = false;
			return ((this.aByteArray6[this.anInt443 - 1] & 0xFF) << 24) + ((this.aByteArray6[this.anInt443 - 2] & 0xFF) << 16) + ((this.aByteArray6[this.anInt443 - 3] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 4] & 0xFF);
		} catch (@Pc(67) RuntimeException local67) {
			signlink.reporterror("29408, " + arg0 + ", " + local67.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "c", descriptor = "(B)I")
	public int method394(@OriginalArg(0) byte arg0) {
		try {
			@Pc(4) boolean local4 = false;
			this.anInt443 += 4;
			return ((this.aByteArray6[this.anInt443 - 3] & 0xFF) << 24) + ((this.aByteArray6[this.anInt443 - 4] & 0xFF) << 16) + ((this.aByteArray6[this.anInt443 - 1] & 0xFF) << 8) + (this.aByteArray6[this.anInt443 - 2] & 0xFF);
		} catch (@Pc(62) RuntimeException local62) {
			signlink.reporterror("13669, " + arg0 + ", " + local62.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(IZ[BI)V")
	public void method395(@OriginalArg(0) int arg0, @OriginalArg(2) byte[] arg1) {
		try {
			for (@Pc(6) int local6 = 0; local6 < arg0 + 0; local6++) {
				this.aByteArray6[this.anInt443++] = (byte) (arg1[local6] + 128);
			}
		} catch (@Pc(32) RuntimeException local32) {
			signlink.reporterror("2147, " + arg0 + ", " + true + ", " + arg1 + ", " + 0 + ", " + local32.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(IIZ[B)V")
	public void method396(@OriginalArg(1) int arg0, @OriginalArg(3) byte[] arg1) {
		try {
			for (@Pc(15) int local15 = arg0 + 0 - 1; local15 >= 0; local15--) {
				arg1[local15] = this.aByteArray6[this.anInt443++];
			}
		} catch (@Pc(36) RuntimeException local36) {
			signlink.reporterror("63409, " + 0 + ", " + arg0 + ", " + false + ", " + arg1 + ", " + local36.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!LDILQFVA", name = "a", descriptor = "(I[BIZ)V")
	public void method397(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(3) boolean arg2) {
		try {
			if (!arg2) {
				for (@Pc(4) int local4 = 0; local4 < arg0 + 0; local4++) {
					arg1[local4] = (byte) (this.aByteArray6[this.anInt443++] - 128);
				}
			}
		} catch (@Pc(30) RuntimeException local30) {
			signlink.reporterror("48637, " + arg0 + ", " + arg1 + ", " + 0 + ", " + arg2 + ", " + local30.toString());
			throw new RuntimeException();
		}
	}
}
