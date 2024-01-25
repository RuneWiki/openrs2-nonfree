import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!fv", name = "H", descriptor = "I")
	public static int anInt3249;

	@OriginalMember(owner = "client!fv", name = "F", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_67 = new Class73(113, -1);

	@OriginalMember(owner = "client!fv", name = "G", descriptor = "Lclient!dr;")
	public static final Class73 aClass73_68 = new Class73(44, 0);

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "([I[I[ILclient!pp;I)V")
	public static void method2861(@OriginalArg(0) int[] arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) Class4_Sub1_Sub1_Sub2 arg3) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(18) int local18 = arg1[local12];
			@Pc(22) int local22 = arg2[local12];
			@Pc(26) int local26 = arg0[local12];
			for (@Pc(28) int local28 = 0; local22 != 0 && arg3.aClass286Array3.length > local28; local28++) {
				if ((local22 & 0x1) != 0) {
					if (local18 == -1) {
						arg3.aClass286Array3[local28] = null;
					} else {
						@Pc(53) Class57 local53 = Static78.aClass298_2.method6521(local18);
						@Pc(56) int local56 = local53.anInt1547;
						@Pc(61) Class286 local61 = arg3.aClass286Array3[local28];
						if (local61 != null) {
							if (local18 == local61.anInt7760) {
								if (local56 == 0) {
									local61 = arg3.aClass286Array3[local28] = null;
								} else if (local56 == 1) {
									local61.anInt7756 = 0;
									local61.anInt7762 = 1;
									local61.anInt7757 = local26;
									local61.anInt7761 = 0;
									local61.anInt7759 = 0;
									Static520.method6532(arg3.aByte108, local53, arg3 == Static328.aClass4_Sub1_Sub1_Sub2_2, arg3.anInt9542, 0, arg3.anInt9540);
								} else if (local56 == 2) {
									local61.anInt7759 = 0;
								}
							} else if (local53.anInt1532 >= Static78.aClass298_2.method6521(local61.anInt7760).anInt1532) {
								local61 = arg3.aClass286Array3[local28] = null;
							}
						}
						if (local61 == null) {
							local61 = arg3.aClass286Array3[local28] = new Class286();
							local61.anInt7760 = local18;
							local61.anInt7759 = 0;
							local61.anInt7757 = local26;
							local61.anInt7756 = 0;
							local61.anInt7761 = 0;
							local61.anInt7762 = 1;
							Static520.method6532(arg3.aByte108, local53, arg3 == Static328.aClass4_Sub1_Sub1_Sub2_2, arg3.anInt9542, 0, arg3.anInt9540);
						}
					}
				}
				local22 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "(I)V")
	public static void method2862() {
		Static187.aClass136_46.method3476();
		Static509.aClass136_106.method3476();
		Static422.aClass136_81.method3476();
		Static523.aClass136_102.method3476();
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(BLclient!jr;)I")
	public static int method2863(@OriginalArg(1) Class161 arg0) {
		if (arg0 == Static239.aClass161_9) {
			return 5120;
		} else if (Static239.aClass161_10 == arg0) {
			return 5122;
		} else if (Static239.aClass161_11 == arg0) {
			return 5124;
		} else if (Static239.aClass161_12 == arg0) {
			return 5121;
		} else if (Static239.aClass161_13 == arg0) {
			return 5123;
		} else if (arg0 == Static239.aClass161_14) {
			return 5125;
		} else if (arg0 == Static239.aClass161_15) {
			return 5131;
		} else if (arg0 == Static239.aClass161_16) {
			return 5126;
		} else {
			throw new IllegalArgumentException("");
		}
	}
}
