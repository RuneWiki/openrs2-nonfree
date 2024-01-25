import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static189 {

	@OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
	public static int anInt6581;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
	public static int anInt6579 = -2;

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public static void method5435() {
		Static44.aClass88_10 = new Class88();
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Lclient!tq;I)Lclient!tq;")
	public static Class239 method5437(@OriginalArg(0) Class239 arg0) {
		@Pc(11) Class239 local11 = Static54.method1014(arg0);
		if (local11 == null) {
			local11 = arg0.aClass239_15;
		}
		return local11;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)I")
	public static int method5438(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (arg1 > 22050) {
			arg0 = arg1;
			arg1 = 22050;
		}
		while (arg1 != 0) {
			@Pc(32) int local32 = arg0 % arg1;
			arg0 = arg1;
			arg1 = local32;
		}
		return arg0;
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(IIBIIIII)V")
	public static void method5439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(18) int local18 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg6);
		@Pc(24) int local24 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg4);
		@Pc(30) int local30 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg5);
		@Pc(36) int local36 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1);
		@Pc(45) int local45 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg6 + arg0);
		@Pc(53) int local53 = Static53.method977(Static85.anInt1636, Static97.anInt1796, arg4 - arg0);
		for (@Pc(55) int local55 = local18; local55 < local45; local55++) {
			Static73.method1404(Static347.anIntArrayArray54[local55], local36, arg2, local30);
		}
		for (@Pc(71) int local71 = local24; local71 > local53; local71--) {
			Static73.method1404(Static347.anIntArrayArray54[local71], local36, arg2, local30);
		}
		@Pc(97) int local97 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg0 + arg5);
		@Pc(106) int local106 = Static53.method977(Static99.anInt1808, Static81.anInt1574, arg1 - arg0);
		for (@Pc(108) int local108 = local45; local108 <= local53; local108++) {
			@Pc(114) int[] local114 = Static347.anIntArrayArray54[local108];
			Static73.method1404(local114, local97, arg2, local30);
			Static73.method1404(local114, local106, arg3, local97);
			Static73.method1404(local114, local36, arg2, local106);
		}
	}

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;II)V")
	public static void method5440(@OriginalArg(0) String arg0, @OriginalArg(2) int arg1) {
		@Pc(12) int local12 = Static416.anInt4773;
		@Pc(14) int[] local14 = Static5.anIntArray3;
		@Pc(16) boolean local16 = false;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			@Pc(26) Class3_Sub3_Sub6_Sub1 local26 = Static355.aClass3_Sub3_Sub6_Sub1Array1[local14[local18]];
			if (local26 != null && Static134.aClass3_Sub3_Sub6_Sub1_1 != local26 && local26.aString48 != null && local26.aString48.equalsIgnoreCase(arg0)) {
				if (arg1 == 1) {
					Static298.method4373(Static244.aClass25_60);
					Static449.aClass6_Sub15_Sub1_2.method3122(0);
					Static449.aClass6_Sub15_Sub1_2.method3106(local14[local18]);
				} else if (arg1 == 4) {
					Static298.method4373(Static265.aClass25_70);
					Static449.aClass6_Sub15_Sub1_2.method3075(0);
					Static449.aClass6_Sub15_Sub1_2.method3117(local14[local18]);
				} else if (arg1 == 5) {
					Static298.method4373(Static307.aClass25_32);
					Static449.aClass6_Sub15_Sub1_2.method3100(local14[local18]);
					Static449.aClass6_Sub15_Sub1_2.method3122(0);
				} else if (arg1 == 6) {
					Static298.method4373(Static288.aClass25_76);
					Static449.aClass6_Sub15_Sub1_2.method3106(local14[local18]);
					Static449.aClass6_Sub15_Sub1_2.method3075(0);
				} else if (arg1 == 7) {
					Static298.method4373(Static313.aClass25_82);
					Static449.aClass6_Sub15_Sub1_2.method3117(local14[local18]);
					Static449.aClass6_Sub15_Sub1_2.method3079(0);
				}
				local16 = true;
				break;
			}
		}
		if (!local16) {
			Static109.method1805(Static205.aClass231_22.method5138(Static382.anInt6289) + arg0);
		}
	}
}
