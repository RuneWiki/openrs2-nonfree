import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!GQYCHOQW")
public final class Class10 {

	@OriginalMember(owner = "client!GQYCHOQW", name = "e", descriptor = "[B")
	private static byte[] aByteArray6;

	@OriginalMember(owner = "client!GQYCHOQW", name = "f", descriptor = "Lclient!BJPWOXRJ;")
	private static Class1_Sub1_Sub2 aClass1_Sub1_Sub2_1;

	@OriginalMember(owner = "client!GQYCHOQW", name = "c", descriptor = "[Lclient!GQYCHOQW;")
	private static Class10[] aClass10Array1 = new Class10[5000];

	@OriginalMember(owner = "client!GQYCHOQW", name = "d", descriptor = "[I")
	public static int[] anIntArray32 = new int[5000];

	@OriginalMember(owner = "client!GQYCHOQW", name = "h", descriptor = "I")
	private int anInt140;

	@OriginalMember(owner = "client!GQYCHOQW", name = "i", descriptor = "I")
	private int anInt141;

	@OriginalMember(owner = "client!GQYCHOQW", name = "a", descriptor = "Z")
	private boolean aBoolean36 = true;

	@OriginalMember(owner = "client!GQYCHOQW", name = "b", descriptor = "I")
	private int anInt139 = -22626;

	@OriginalMember(owner = "client!GQYCHOQW", name = "g", descriptor = "[Lclient!IRCSYKHE;")
	private Class14[] aClass14Array1 = new Class14[10];

	@OriginalMember(owner = "client!GQYCHOQW", name = "a", descriptor = "(Lclient!BJPWOXRJ;B)V")
	public static void method117(@OriginalArg(0) Class1_Sub1_Sub2 arg0) {
		try {
			aByteArray6 = new byte[441000];
			aClass1_Sub1_Sub2_1 = new Class1_Sub1_Sub2(false, aByteArray6);
			Class14.method217();
			while (true) {
				@Pc(19) int local19 = arg0.method24();
				if (local19 == 65535) {
					return;
				}
				aClass10Array1[local19] = new Class10(107);
				aClass10Array1[local19].method119(arg0);
				anIntArray32[local19] = aClass10Array1[local19].method120();
			}
		} catch (@Pc(46) RuntimeException local46) {
			signlink.reporterror("74300, " + arg0 + ", " + 0 + ", " + local46.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQYCHOQW", name = "a", descriptor = "(III)Lclient!BJPWOXRJ;")
	public static Class1_Sub1_Sub2 method118(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		try {
			if (aClass10Array1[arg1] == null) {
				return null;
			} else {
				@Pc(15) Class10 local15 = aClass10Array1[arg1];
				return local15.method121((byte) 3, arg0);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("37253, " + -178 + ", " + arg0 + ", " + arg1 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQYCHOQW", name = "<init>", descriptor = "(I)V")
	private Class10(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!GQYCHOQW", name = "a", descriptor = "(ILclient!BJPWOXRJ;)V")
	private void method119(@OriginalArg(1) Class1_Sub1_Sub2 arg0) {
		try {
			for (@Pc(6) int local6 = 0; local6 < 10; local6++) {
				@Pc(11) int local11 = arg0.method22();
				if (local11 != 0) {
					arg0.anInt10--;
					this.aClass14Array1[local6] = new Class14();
					this.aClass14Array1[local6].method220(674, arg0);
				}
			}
			this.anInt140 = arg0.method24();
			this.anInt141 = arg0.method24();
		} catch (@Pc(47) RuntimeException local47) {
			signlink.reporterror("75091, " + 674 + ", " + arg0 + ", " + local47.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQYCHOQW", name = "a", descriptor = "(I)I")
	private int method120() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(10) int local10 = 0; local10 < 10; local10++) {
				if (this.aClass14Array1[local10] != null && this.aClass14Array1[local10].anInt326 / 20 < local3) {
					local3 = this.aClass14Array1[local10].anInt326 / 20;
				}
			}
			if (this.anInt140 < this.anInt141 && this.anInt140 / 20 < local3) {
				local3 = this.anInt140 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(63) int local63 = 0; local63 < 10; local63++) {
				if (this.aClass14Array1[local63] != null) {
					this.aClass14Array1[local63].anInt326 -= local3 * 20;
				}
			}
			if (this.anInt140 < this.anInt141) {
				this.anInt140 -= local3 * 20;
				this.anInt141 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(109) RuntimeException local109) {
			signlink.reporterror("14426, " + -178 + ", " + local109.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQYCHOQW", name = "a", descriptor = "(BI)Lclient!BJPWOXRJ;")
	private Class1_Sub1_Sub2 method121(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1) {
		try {
			@Pc(3) int local3 = this.method122(arg1);
			aClass1_Sub1_Sub2_1.anInt10 = 0;
			aClass1_Sub1_Sub2_1.method16(1380533830);
			aClass1_Sub1_Sub2_1.method17(266, local3 + 36);
			aClass1_Sub1_Sub2_1.method16(1463899717);
			aClass1_Sub1_Sub2_1.method16(1718449184);
			aClass1_Sub1_Sub2_1.method17(266, 16);
			aClass1_Sub1_Sub2_1.method14(1);
			aClass1_Sub1_Sub2_1.method14(1);
			@Pc(38) boolean local38 = false;
			aClass1_Sub1_Sub2_1.method17(266, 22050);
			aClass1_Sub1_Sub2_1.method17(266, 22050);
			aClass1_Sub1_Sub2_1.method14(1);
			aClass1_Sub1_Sub2_1.method14(8);
			aClass1_Sub1_Sub2_1.method16(1684108385);
			aClass1_Sub1_Sub2_1.method17(266, local3);
			aClass1_Sub1_Sub2_1.anInt10 += local3;
			return aClass1_Sub1_Sub2_1;
		} catch (@Pc(75) RuntimeException local75) {
			signlink.reporterror("33324, " + arg0 + ", " + arg1 + ", " + local75.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!GQYCHOQW", name = "b", descriptor = "(I)I")
	private int method122(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass14Array1[local5] != null && this.aClass14Array1[local5].anInt325 + this.aClass14Array1[local5].anInt326 > local3) {
				local3 = this.aClass14Array1[local5].anInt325 + this.aClass14Array1[local5].anInt326;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt140 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt141 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray6[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass14Array1[local106] != null) {
				local123 = this.aClass14Array1[local106].anInt325 * 22050 / 1000;
				local133 = this.aClass14Array1[local106].anInt326 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass14Array1[local106].method218(local123, this.aClass14Array1[local106].anInt325);
				for (local147 = 0; local147 < local123; local147++) {
					aByteArray6[local147 + local133 + 44] += (byte) (local145[local147] >> 8);
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
				aByteArray6[local133 + local123] = aByteArray6[local133];
			}
			for (@Pc(205) int local205 = 1; local205 < arg0; local205++) {
				local123 = (local65 - local58) * local205;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray6[local147 + local123] = aByteArray6[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
