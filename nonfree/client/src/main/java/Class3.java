import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;
import sign.signlink;

@OriginalClass("client!CQXSYOPM")
public final class Class3 {

	@OriginalMember(owner = "client!CQXSYOPM", name = "f", descriptor = "[B")
	private static byte[] aByteArray2;

	@OriginalMember(owner = "client!CQXSYOPM", name = "g", descriptor = "Lclient!MNKDCXXG;")
	private static Class1_Sub2_Sub3 aClass1_Sub2_Sub3_1;

	@OriginalMember(owner = "client!CQXSYOPM", name = "b", descriptor = "I")
	private static int anInt189 = 21302;

	@OriginalMember(owner = "client!CQXSYOPM", name = "d", descriptor = "[Lclient!CQXSYOPM;")
	private static Class3[] aClass3Array1 = new Class3[5000];

	@OriginalMember(owner = "client!CQXSYOPM", name = "e", descriptor = "[I")
	public static int[] anIntArray20 = new int[5000];

	@OriginalMember(owner = "client!CQXSYOPM", name = "i", descriptor = "I")
	private int anInt191;

	@OriginalMember(owner = "client!CQXSYOPM", name = "j", descriptor = "I")
	private int anInt192;

	@OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "Z")
	private boolean aBoolean28 = true;

	@OriginalMember(owner = "client!CQXSYOPM", name = "c", descriptor = "I")
	private int anInt190 = 21701;

	@OriginalMember(owner = "client!CQXSYOPM", name = "h", descriptor = "[Lclient!XDUWEFUG;")
	private Class44[] aClass44Array1 = new Class44[10];

	@OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "(Lclient!MNKDCXXG;I)V")
	public static void method83(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			aByteArray2 = new byte[441000];
			aClass1_Sub2_Sub3_1 = new Class1_Sub2_Sub3(aByteArray2, -670);
			Class44.method496();
			while (true) {
				@Pc(22) int local22 = arg0.method309();
				if (local22 == 65535) {
					return;
				}
				aClass3Array1[local22] = new Class3(21701);
				aClass3Array1[local22].method85(arg0);
				anIntArray20[local22] = aClass3Array1[local22].method86();
			}
		} catch (@Pc(49) RuntimeException local49) {
			signlink.reporterror("64969, " + arg0 + ", " + 24570 + ", " + local49.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "(IIB)Lclient!MNKDCXXG;")
	public static Class1_Sub2_Sub3 method84(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		try {
			if (aClass3Array1[arg0] == null) {
				return null;
			} else {
				@Pc(15) Class3 local15 = aClass3Array1[arg0];
				return local15.method87(arg1);
			}
		} catch (@Pc(23) RuntimeException local23) {
			signlink.reporterror("95162, " + arg0 + ", " + arg1 + ", " + 0 + ", " + local23.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQXSYOPM", name = "<init>", descriptor = "(I)V")
	private Class3(@OriginalArg(0) int arg0) {
		try {
			if (arg0 != this.anInt190) {
				throw new NullPointerException();
			}
		} catch (@Pc(20) RuntimeException local20) {
			signlink.reporterror("19787, " + arg0 + ", " + local20.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQXSYOPM", name = "b", descriptor = "(Lclient!MNKDCXXG;I)V")
	private void method85(@OriginalArg(0) Class1_Sub2_Sub3 arg0) {
		try {
			for (@Pc(7) int local7 = 0; local7 < 10; local7++) {
				@Pc(12) int local12 = arg0.method307();
				if (local12 != 0) {
					arg0.anInt474--;
					this.aClass44Array1[local7] = new Class44();
					this.aClass44Array1[local7].method499(arg0);
				}
			}
			this.anInt191 = arg0.method309();
			this.anInt192 = arg0.method309();
		} catch (@Pc(48) RuntimeException local48) {
			signlink.reporterror("15659, " + arg0 + ", " + 0 + ", " + local48.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "(I)I")
	private int method86() {
		try {
			@Pc(3) int local3 = 9999999;
			for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
				if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt691 / 20 < local3) {
					local3 = this.aClass44Array1[local5].anInt691 / 20;
				}
			}
			if (this.anInt191 < this.anInt192 && this.anInt191 / 20 < local3) {
				local3 = this.anInt191 / 20;
			}
			if (local3 == 9999999 || local3 == 0) {
				return 0;
			}
			for (@Pc(58) int local58 = 0; local58 < 10; local58++) {
				if (this.aClass44Array1[local58] != null) {
					this.aClass44Array1[local58].anInt691 -= local3 * 20;
				}
			}
			if (this.anInt191 < this.anInt192) {
				this.anInt191 -= local3 * 20;
				this.anInt192 -= local3 * 20;
			}
			return local3;
		} catch (@Pc(113) RuntimeException local113) {
			signlink.reporterror("29555, " + 1 + ", " + local113.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQXSYOPM", name = "a", descriptor = "(II)Lclient!MNKDCXXG;")
	private Class1_Sub2_Sub3 method87(@OriginalArg(1) int arg0) {
		try {
			@Pc(3) int local3 = this.method88(arg0);
			aClass1_Sub2_Sub3_1.anInt474 = 0;
			aClass1_Sub2_Sub3_1.method301(1380533830);
			aClass1_Sub2_Sub3_1.method302(local3 + 36);
			aClass1_Sub2_Sub3_1.method301(1463899717);
			aClass1_Sub2_Sub3_1.method301(1718449184);
			aClass1_Sub2_Sub3_1.method302(16);
			aClass1_Sub2_Sub3_1.method299(1);
			aClass1_Sub2_Sub3_1.method299(1);
			aClass1_Sub2_Sub3_1.method302(22050);
			aClass1_Sub2_Sub3_1.method302(22050);
			aClass1_Sub2_Sub3_1.method299(1);
			aClass1_Sub2_Sub3_1.method299(8);
			aClass1_Sub2_Sub3_1.method301(1684108385);
			aClass1_Sub2_Sub3_1.method302(local3);
			aClass1_Sub2_Sub3_1.anInt474 += local3;
			return aClass1_Sub2_Sub3_1;
		} catch (@Pc(79) RuntimeException local79) {
			signlink.reporterror("56495, " + 2 + ", " + arg0 + ", " + local79.toString());
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!CQXSYOPM", name = "b", descriptor = "(I)I")
	private int method88(@OriginalArg(0) int arg0) {
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < 10; local5++) {
			if (this.aClass44Array1[local5] != null && this.aClass44Array1[local5].anInt690 + this.aClass44Array1[local5].anInt691 > local3) {
				local3 = this.aClass44Array1[local5].anInt690 + this.aClass44Array1[local5].anInt691;
			}
		}
		if (local3 == 0) {
			return 0;
		}
		@Pc(51) int local51 = local3 * 22050 / 1000;
		@Pc(58) int local58 = this.anInt191 * 22050 / 1000;
		@Pc(65) int local65 = this.anInt192 * 22050 / 1000;
		if (local58 < 0 || local58 > local51 || local65 < 0 || local65 > local51 || local58 >= local65) {
			arg0 = 0;
		}
		@Pc(90) int local90 = local51 + (local65 - local58) * (arg0 - 1);
		for (@Pc(92) int local92 = 44; local92 < local90 + 44; local92++) {
			aByteArray2[local92] = -128;
		}
		@Pc(123) int local123;
		@Pc(133) int local133;
		@Pc(147) int local147;
		for (@Pc(106) int local106 = 0; local106 < 10; local106++) {
			if (this.aClass44Array1[local106] != null) {
				local123 = this.aClass44Array1[local106].anInt690 * 22050 / 1000;
				local133 = this.aClass44Array1[local106].anInt691 * 22050 / 1000;
				@Pc(145) int[] local145 = this.aClass44Array1[local106].method497(local123, this.aClass44Array1[local106].anInt690);
				for (local147 = 0; local147 < local123; local147++) {
					@Pc(165) int local165 = (aByteArray2[local147 + local133 + 44] & 0xFF) + (local145[local147] >> 8);
					if ((local165 & 0xFFFFFF00) != 0) {
						local165 = ~(local165 >> 31);
					}
					aByteArray2[local147 + local133 + 44] = (byte) local165;
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
				aByteArray2[local133 + local123] = aByteArray2[local133];
			}
			for (@Pc(223) int local223 = 1; local223 < arg0; local223++) {
				local123 = (local65 - local58) * local223;
				for (local147 = local58; local147 < local65; local147++) {
					aByteArray2[local147 + local123] = aByteArray2[local147];
				}
			}
			local90 -= 44;
		}
		return local90;
	}
}
