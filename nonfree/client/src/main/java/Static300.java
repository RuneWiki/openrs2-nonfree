import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static300 {

	@OriginalMember(owner = "client!vk", name = "e", descriptor = "Lclient!tj;")
	public static Class28 aClass28_2;

	@OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
	public static int anInt5351;

	@OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
	public static int anInt5352;

	@OriginalMember(owner = "client!vk", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString326 = "Prepared sound engine";

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)I")
	public static int method4552() {
		if (Static153.aBoolean184) {
			return 0;
		} else if (Static278.method4290()) {
			return Static249.aBoolean306 ? 2 : 1;
		} else {
			return 1;
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIBIII)V")
	public static void method4554(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static29.anInt517 <= arg1 && arg4 <= Static11.anInt170 && Static98.anInt2007 <= arg5 && arg3 <= Static213.anInt4452) {
			if (arg2 == 1) {
				Static235.method4490(arg3, arg4, arg5, arg1, arg0);
			} else {
				Static94.method2970(arg3, arg5, arg0, arg4, arg1, arg2);
			}
		} else if (arg2 == 1) {
			Static152.method672(arg4, arg1, arg5, arg3, arg0);
		} else {
			Static204.method3264(arg0, arg4, arg3, arg1, arg5, arg2);
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lclient!io;IIIII)V")
	public static void method4555(@OriginalArg(0) Class15 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static312.anInt5729) {
				for (@Pc(28) int local28 = local3; local28 <= local7; local28++) {
					if (local28 >= 0 && local28 < Static153.anInt3006) {
						for (@Pc(39) int local39 = local11; local39 <= local15; local39++) {
							if (local39 >= 0 && local39 < Static285.anInt5122 && (!local1 || local28 >= local7 || local39 >= local15 || local39 < arg3 && local28 != arg2)) {
								@Pc(71) Class1_Sub33 local71 = Static105.aClass1_Sub33ArrayArrayArray2[local17][local28][local39];
								if (local71 != null) {
									@Pc(158) int local158 = (Static24.anIntArrayArrayArray2[local17][local28][local39] + Static24.anIntArrayArrayArray2[local17][local28 + 1][local39] + Static24.anIntArrayArrayArray2[local17][local28][local39 + 1] + Static24.anIntArrayArrayArray2[local17][local28 + 1][local39 + 1]) / 4 - (Static24.anIntArrayArrayArray2[arg1][arg2][arg3] + Static24.anIntArrayArrayArray2[arg1][arg2 + 1][arg3] + Static24.anIntArrayArrayArray2[arg1][arg2][arg3 + 1] + Static24.anIntArrayArrayArray2[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(161) Class160 local161 = local71.aClass160_1;
									if (local161 != null) {
										if (local161.aClass15_7.method4680()) {
											arg0.method4683(local161.aClass15_7, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local161.aClass15_8 != null && local161.aClass15_8.method4680()) {
											arg0.method4683(local161.aClass15_8, (local28 - arg2) * 128 + (1 - arg4) * 64, local158, (local39 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(232) int local232 = 0; local232 < local71.anInt5733; local232++) {
										@Pc(241) Class161 local241 = local71.aClass161Array3[local232];
										if (local241 != null && local241.aClass15_9.method4680() && (local28 == local241.anInt4641 || local28 == local3) && (local39 == local241.anInt4636 || local39 == local11)) {
											@Pc(270) int local270 = local241.anInt4639 + 1 - local241.anInt4641;
											@Pc(278) int local278 = local241.anInt4637 + 1 - local241.anInt4636;
											arg0.method4683(local241.aClass15_9, (local241.anInt4641 - arg2) * 128 + (local270 - arg4) * 64, local158, (local241.anInt4636 - arg3) * 128 + (local278 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I")
	public static int method4556(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}
}
