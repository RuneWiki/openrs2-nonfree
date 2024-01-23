import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static44 {

	@OriginalMember(owner = "client!di", name = "k", descriptor = "[Lclient!ka;")
	public static Class64_Sub1[] aClass64_Sub1Array2;

	@OriginalMember(owner = "client!di", name = "n", descriptor = "I")
	public static int anInt965;

	@OriginalMember(owner = "client!di", name = "mb", descriptor = "Lclient!dg;")
	public static Class28_Sub1 aClass28_Sub1_25;

	@OriginalMember(owner = "client!di", name = "t", descriptor = "Lclient!sc;")
	public static Class107 aClass107_293 = Static231.method3737("_labels");

	@OriginalMember(owner = "client!di", name = "I", descriptor = "Lclient!sc;")
	public static Class107 aClass107_294 = Static231.method3737(":trade:");

	@OriginalMember(owner = "client!di", name = "Q", descriptor = "[I")
	public static int[] anIntArray101 = new int[] { 0, 1, 2, 3 };

	@OriginalMember(owner = "client!di", name = "hb", descriptor = "I")
	public static int anInt990 = 0;

	@OriginalMember(owner = "client!di", name = "ib", descriptor = "Lclient!sc;")
	public static Class107 aClass107_296 = Static231.method3737("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q");

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(Lclient!af;IIIII)V")
	public static void method864(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static11.anInt296) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static159.anInt3497) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static213.anInt4593 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class1_Sub9 local62 = Static174.aClass1_Sub9ArrayArrayArray2[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static166.anIntArrayArrayArray11[local17][local23][local32] + Static166.anIntArrayArrayArray11[local17][local23 + 1][local32] + Static166.anIntArrayArrayArray11[local17][local23][local32 + 1] + Static166.anIntArrayArrayArray11[local17][local23 + 1][local32 + 1]) / 4 - (Static166.anIntArrayArrayArray11[arg1][arg2][arg3] + Static166.anIntArrayArrayArray11[arg1][arg2 + 1][arg3] + Static166.anIntArrayArrayArray11[arg1][arg2][arg3 + 1] + Static166.anIntArrayArrayArray11[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class97 local151 = local62.aClass97_1;
									if (local151 != null) {
										if (local151.aClass5_8.method2302()) {
											arg0.method2296(local151.aClass5_8, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass5_9 != null && local151.aClass5_9.method2302()) {
											arg0.method2296(local151.aClass5_9, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt1416; local222++) {
										@Pc(228) Class99 local228 = local62.aClass99Array2[local222];
										if (local228 != null && local228.aClass5_10.method2302() && (local23 == local228.anInt3819 || local23 == local3) && (local32 == local228.anInt3808 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt3807 + 1 - local228.anInt3819;
											@Pc(265) int local265 = local228.anInt3811 + 1 - local228.anInt3808;
											arg0.method2296(local228.aClass5_10, (local228.anInt3819 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt3808 - arg3) * 128 + (local265 - arg5) * 64, local1);
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

	@OriginalMember(owner = "client!di", name = "a", descriptor = "(BLclient!eg;)V")
	public static void method872(@OriginalArg(1) Class5_Sub5 arg0) {
		if (Static128.anInt2802 == arg0.anInt3024 || arg0.anInt3048 == -1 || arg0.anInt2996 != 0 || arg0.anInt3013 + 1 > Static2.method88(arg0.anInt3048).anIntArray327[arg0.anInt3023]) {
			@Pc(29) int local29 = arg0.anInt3024 - arg0.anInt3042;
			@Pc(34) int local34 = Static128.anInt2802 - arg0.anInt3042;
			@Pc(45) int local45 = arg0.anInt3033 * 128 + arg0.anInt2997 * 64;
			@Pc(55) int local55 = arg0.anInt3015 * 128 + arg0.anInt2997 * 64;
			@Pc(65) int local65 = arg0.anInt2997 * 64 + arg0.anInt3014 * 128;
			arg0.anInt3021 = (local65 * local34 + local45 * (local29 - local34)) / local29;
			@Pc(89) int local89 = arg0.anInt3018 * 128 + arg0.anInt2997 * 64;
			arg0.anInt3044 = (local34 * local89 + (local29 - local34) * local55) / local29;
		}
		arg0.anInt3019 = 0;
		if (arg0.anInt3003 == 0) {
			arg0.anInt2994 = 1024;
		}
		if (arg0.anInt3003 == 1) {
			arg0.anInt2994 = 1536;
		}
		if (arg0.anInt3003 == 2) {
			arg0.anInt2994 = 0;
		}
		if (arg0.anInt3003 == 3) {
			arg0.anInt2994 = 512;
		}
		arg0.anInt3040 = arg0.anInt2994;
	}
}
