import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!cc")
public final class Class5 {

	@OriginalMember(owner = "client!cc", name = "c", descriptor = "Z")
	private static boolean aBoolean37;

	@OriginalMember(owner = "client!cc", name = "f", descriptor = "[B")
	private static byte[] aByteArray1;

	@OriginalMember(owner = "client!cc", name = "g", descriptor = "Lclient!lb;")
	private static Class1_Sub1_Sub3 aClass1_Sub1_Sub3_1;

	@OriginalMember(owner = "client!cc", name = "d", descriptor = "[Lclient!cc;")
	private static Class5[] aClass5Array1 = new Class5[1000];

	@OriginalMember(owner = "client!cc", name = "e", descriptor = "[I")
	public static int[] anIntArray28 = new int[1000];

	@OriginalMember(owner = "client!cc", name = "i", descriptor = "I")
	private int anInt183;

	@OriginalMember(owner = "client!cc", name = "j", descriptor = "I")
	private int anInt184;

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "B")
	private byte aByte3 = 5;

	@OriginalMember(owner = "client!cc", name = "h", descriptor = "[Lclient!dc;")
	private Class7[] aClass7Array1 = new Class7[10];

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "I")
	private int anInt182;

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(ZLclient!lb;)V")
	public static void method77(@OriginalArg(1) Class1_Sub1_Sub3 arg0) {
		try {
			aByteArray1 = new byte[441000];
			aClass1_Sub1_Sub3_1 = new Class1_Sub1_Sub3(aByteArray1, (byte) 1);
			Class7.method242();
			while (true) {
				@Pc(20) int local20 = arg0.method475();
				if (local20 == 65535) {
					return;
				}
				aClass5Array1[local20] = new Class5(-46900);
				aClass5Array1[local20].method79((byte) 2, arg0);
				anIntArray28[local20] = aClass5Array1[local20].method80();
			}
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("30893, " + false + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IIB)Lclient!lb;")
	public static Class1_Sub1_Sub3 method78(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass5Array1[arg0] == null) {
				return null;
			} else {
				@Pc(17) Class5 local17 = aClass5Array1[arg0];
				return local17.method81(arg1);
			}
		} catch (@Pc(25) RuntimeException local25) {
			signlink.reporterror("18697, " + arg0 + ", " + arg1 + ", " + 5 + ", " + local25.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "(I)V")
	private Class5(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(BLclient!lb;)V")
	private void method79(@OriginalArg(0) byte arg0, @OriginalArg(1) Class1_Sub1_Sub3 arg1) {
		try {
			for (@Pc(3) int local3 = 0; local3 < 10; local3++) {
				@Pc(8) int local8 = arg1.method473();
				if (local8 != 0) {
					arg1.anInt743--;
					this.aClass7Array1[local3] = new Class7();
					this.aClass7Array1[local3].method245(arg1);
				}
			}
			@Pc(39) boolean local39 = false;
			this.anInt183 = arg1.method475();
			this.anInt184 = arg1.method475();
		} catch (@Pc(54) RuntimeException local54) {
			signlink.reporterror("70891, " + arg0 + ", " + arg1 + ", " + local54.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(I)I")
	private int method80() {
		try {
			@Pc(12) int local12 = 9999999;
			for (@Pc(14) int local14 = 0; local14 < 10; local14++) {
				if (this.aClass7Array1[local14] != null && this.aClass7Array1[local14].anInt471 / 20 < local12) {
					local12 = this.aClass7Array1[local14].anInt471 / 20;
				}
			}
			if (this.anInt183 < this.anInt184 && this.anInt183 / 20 < local12) {
				local12 = this.anInt183 / 20;
			}
			if (local12 == 9999999 || local12 == 0) {
				return 0;
			}
			for (@Pc(67) int local67 = 0; local67 < 10; local67++) {
				if (this.aClass7Array1[local67] != null) {
					this.aClass7Array1[local67].anInt471 -= local12 * 20;
				}
			}
			if (this.anInt183 < this.anInt184) {
				this.anInt183 -= local12 * 20;
				this.anInt184 -= local12 * 20;
			}
			return local12;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("66597, " + 788 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(IB)Lclient!lb;")
	private Class1_Sub1_Sub3 method81(@OriginalArg(0) int arg0) {
		try {
			@Pc(3) int local3 = this.method82(arg0);
			aClass1_Sub1_Sub3_1.anInt743 = 0;
			aClass1_Sub1_Sub3_1.method467(1380533830);
			aClass1_Sub1_Sub3_1.method468(local3 + 36);
			aClass1_Sub1_Sub3_1.method467(1463899717);
			aClass1_Sub1_Sub3_1.method467(1718449184);
			aClass1_Sub1_Sub3_1.method468(16);
			aClass1_Sub1_Sub3_1.method465(1);
			aClass1_Sub1_Sub3_1.method465(1);
			aClass1_Sub1_Sub3_1.method468(22050);
			aClass1_Sub1_Sub3_1.method468(22050);
			aClass1_Sub1_Sub3_1.method465(1);
			aClass1_Sub1_Sub3_1.method465(8);
			aClass1_Sub1_Sub3_1.method467(1684108385);
			aClass1_Sub1_Sub3_1.method468(local3);
			if (this.aByte3 != 5) {
				throw new NullPointerException();
			}
			aClass1_Sub1_Sub3_1.anInt743 += local3;
			return aClass1_Sub1_Sub3_1;
		} catch (@Pc(73) RuntimeException local73) {
			signlink.reporterror("51130, " + arg0 + ", " + 5 + ", " + local73.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!cc", name = "b", descriptor = "(I)I")
	private int method82(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass7Array1[local5] != null && this.aClass7Array1[local5].anInt470 + this.aClass7Array1[local5].anInt471 > local3) {
				local3 = this.aClass7Array1[local5].anInt470 + this.aClass7Array1[local5].anInt471;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt183 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt184 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray1[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass7Array1[local106] != null) {
				local123 = this.aClass7Array1[local106].anInt470 * 22050 / 1000;
				local133 = this.aClass7Array1[local106].anInt471 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass7Array1[local106].method243(local123, this.aClass7Array1[local106].anInt470);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray1[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
				}
			}
		}
		if (arg0 > 1) {
			local58 += 44;
			local65 += 44;
			local51 += 44;
			local90 += 44;
			local123 = local90 - local51;
			for (local133 = local51 - 1; local133 >= local65; local133--) {
				aByteArray1[local133 + local123] = aByteArray1[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray1[local147 + local123] = aByteArray1[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
