import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static462 {

	@OriginalMember(owner = "client!ql", name = "c", descriptor = "[I")
	public static int[] anIntArray439;

	@OriginalMember(owner = "client!ql", name = "b", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray7 = new boolean[][] { new boolean[4], new boolean[4], { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { false, false, true, false }, { true, false, true, false }, { true, false, false, true }, { true, false, false, true }, new boolean[4], new boolean[4], new boolean[4], new boolean[4] };

	@OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
	public static int anInt7776 = 0;

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lclient!pia;Ljava/lang/String;Lclient!ha;BLclient!da;Z)V")
	public static void method6852(@OriginalArg(0) Class272 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) Class133 arg2, @OriginalArg(4) Class55 arg3, @OriginalArg(5) boolean arg4) {
		@Pc(12) boolean local12 = !Static274.aBoolean371 || Static80.method1365();
		if (!local12) {
			return;
		}
		@Pc(42) int local42;
		@Pc(51) int local51;
		if (Static274.aBoolean371 && local12) {
			@Pc(29) Class272 local29 = Static307.aClass272_5;
			@Pc(35) Class55 local35 = arg2.method7255(local29, Static436.aClass131Array1);
			local42 = local29.method6566(arg1, 250, null);
			local51 = local29.method6572(local29.anInt7410, null, arg1, 250);
			@Pc(54) int local54 = Static547.aClass131_3.anInt3344;
			@Pc(58) int local58 = local54 + 4;
			local51 += local58 * 2;
			local42 += local58 * 2;
			if (local51 < Static514.anInt8855) {
				local51 = Static514.anInt8855;
			}
			if (local42 < Static61.anInt9888) {
				local42 = Static61.anInt9888;
			}
			@Pc(88) int local88 = Static433.aClass245_12.method5486(Static79.anInt1667, local42) + Static254.anInt4607;
			@Pc(97) int local97 = Static290.aClass183_9.method4291(local51, Static627.anInt10422) + Static576.anInt9713;
			if (Static428.aBoolean526) {
				local88 += Static584.method8436();
				local97 += Static88.method1487();
			}
			arg2.method7297(Static473.aClass131_2, false).method4039(Static137.aClass131_1.anInt3344 + local88, Static137.aClass131_1.anInt3345 + local97, local42 - Static137.aClass131_1.anInt3344 * 2, local51 + -(Static137.aClass131_1.anInt3345 * 2), 1, 0, 0);
			arg2.method7297(Static137.aClass131_1, true).method4040(local88, local97);
			Static137.aClass131_1.method2901();
			arg2.method7297(Static137.aClass131_1, true).method4040(local88 + local42 - local54, local97);
			Static137.aClass131_1.method2890();
			arg2.method7297(Static137.aClass131_1, true).method4040(local88 + local42 - local54, local97 + local51 - local54);
			Static137.aClass131_1.method2901();
			arg2.method7297(Static137.aClass131_1, true).method4040(local88, local51 + local97 - local54);
			Static137.aClass131_1.method2890();
			arg2.method7297(Static547.aClass131_3, true).method4047(local88, Static137.aClass131_1.anInt3345 + local97, local54, local51 - Static137.aClass131_1.anInt3345 * 2);
			Static547.aClass131_3.method2895();
			arg2.method7297(Static547.aClass131_3, true).method4047(Static137.aClass131_1.anInt3344 + local88, local97, local42 - Static137.aClass131_1.anInt3344 * 2, local54);
			Static547.aClass131_3.method2895();
			arg2.method7297(Static547.aClass131_3, true).method4047(local88 + local42 - local54, Static137.aClass131_1.anInt3345 + local97, local54, local51 - Static137.aClass131_1.anInt3345 * 2);
			Static547.aClass131_3.method2895();
			arg2.method7297(Static547.aClass131_3, true).method4047(Static137.aClass131_1.anInt3344 + local88, local51 + (local97 - local54), local42 - Static137.aClass131_1.anInt3344 * 2, local54);
			Static547.aClass131_3.method2895();
			local35.method6008(0, 0, 1, 0, local97 + local58, local58 + local88, null, arg1, -1, local51 - local58 * 2, null, null, Static443.anInt7570 | 0xFF000000, 1, local42 - local58 * 2);
			Static129.method1916(local88, local51, local42, local97);
		} else {
			local42 = arg0.method6566(arg1, 250, null);
			local51 = arg0.method6576(250, arg1, null) * 13;
			arg2.aa(6, 6, local42 + 8, local51 - -4 + 4, -16777216, 0);
			arg2.method7279(6, 6, local42 + 4 + 4, 4 + 4 + local51, -1, 0);
			arg3.method6008(0, 0, 1, 0, 10, 10, null, arg1, -1, local51, null, null, -1, 1, local42);
			Static129.method1916(6, local51 + 4 + 4, local42 + 8, 6);
		}
		if (!arg4) {
			return;
		}
		try {
			if (Static428.aBoolean526) {
				Static56.method947();
			} else {
				arg2.method7316();
			}
		} catch (@Pc(452) Exception_Sub1 local452) {
		}
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(BIII)V")
	public static void method6854(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class48 local14 = Static20.aClass48ArrayArray1[arg1][arg0];
		Static470.method7958(arg2, local14 == null ? Static484.aClass48_1 : local14);
	}
}
