import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static354 {

	@OriginalMember(owner = "client!lm", name = "I", descriptor = "Lclient!bh;")
	public static Class37 aClass37_2;

	@OriginalMember(owner = "client!lm", name = "E", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray16;

	@OriginalMember(owner = "client!lm", name = "H", descriptor = "I")
	public static int anInt6058 = 0;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(II)V")
	public static void method5380(@OriginalArg(1) int arg0) {
		@Pc(1) Class14_Sub2_Sub5 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class159 local8 = Static445.aClass159Array3[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static180.anInt2928; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static654.anInt10715; local15++) {
						local1 = local8.fa(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static110.anInt1858;
							@Pc(32) int local32 = local12 << Static110.anInt1858;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class159 local41 = Static445.aClass159Array3[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method8207(local12, local15) - local41.method8207(local12, local15);
									@Pc(71) int local71 = local8.method8207(local12, local15 + 1) - local41.method8207(local12, local15 + 1);
									@Pc(91) int local91 = local8.method8207(local12 + 1, local15 + 1) - local41.method8207(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method8207(local12 + 1, local15) - local41.method8207(local12 + 1, local15);
									local41.CA(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(ILjava/lang/String;I)V")
	public static void method5381(@OriginalArg(1) String arg0) {
		Static187.method2752(arg0, 0, "", "", 4, "");
	}

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "(Z)V")
	public static void method5383() {
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub19_2);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub19_1);
		Static181.aClass14_Sub26_9.method5270(2, Static181.aClass14_Sub26_9.aClass43_Sub7_2);
		Static181.aClass14_Sub26_9.method5270(2, Static181.aClass14_Sub26_9.aClass43_Sub7_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub27_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub24_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub2_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub20_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub12_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub5_1);
		Static181.aClass14_Sub26_9.method5270(2, Static181.aClass14_Sub26_9.aClass43_Sub8_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub16_1);
		Static181.aClass14_Sub26_9.method5270(2, Static181.aClass14_Sub26_9.aClass43_Sub14_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub21_1);
		Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub17_1);
		Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub17_2);
		Static181.aClass14_Sub26_9.method5270(2, Static181.aClass14_Sub26_9.aClass43_Sub28_1);
		Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub29_1);
		Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub23_1);
		Static181.aClass14_Sub26_9.method5270(1, Static181.aClass14_Sub26_9.aClass43_Sub10_1);
		Static501.method7558();
		Static181.aClass14_Sub26_9.method5270(0, Static181.aClass14_Sub26_9.aClass43_Sub3_1);
		Static181.aClass14_Sub26_9.method5270(4, Static181.aClass14_Sub26_9.aClass43_Sub26_1);
		Static38.method661();
		Static452.method6681();
		Static178.aBoolean203 = true;
	}
}
