import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static203 {

	@OriginalMember(owner = "client!lt", name = "B", descriptor = "I")
	public static int anInt3750;

	@OriginalMember(owner = "client!lt", name = "p", descriptor = "[I")
	public static final int[] anIntArray751 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!lt", name = "t", descriptor = "I")
	public static int anInt3744 = 0;

	@OriginalMember(owner = "client!lt", name = "w", descriptor = "Lclient!ap;")
	public static final Class11 aClass11_63 = new Class11(33, 8);

	@OriginalMember(owner = "client!lt", name = "G", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray95 = new String[5];

	@OriginalMember(owner = "client!lt", name = "H", descriptor = "[[I")
	public static final int[][] anIntArrayArray31 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

	@OriginalMember(owner = "client!lt", name = "I", descriptor = "I")
	public static int anInt3754 = 0;

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(Ljava/lang/String;Z)V")
	public static void method3444(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (Static121.anInt2600 >= 100 && !Static330.aBoolean414 || Static121.anInt2600 >= 200) {
			Static351.method5638(Static308.aClass32_82.method701(Static107.anInt2498));
			return;
		}
		@Pc(29) String local29 = Static136.method2646(arg0);
		if (local29 == null) {
			return;
		}
		@Pc(72) String local72;
		for (@Pc(34) int local34 = 0; local34 < Static121.anInt2600; local34++) {
			@Pc(42) String local42 = Static136.method2646(Static174.aStringArray82[local34]);
			if (local42 != null && local42.equals(local29)) {
				Static351.method5638(arg0 + Static140.aClass32_38.method701(Static107.anInt2498));
				return;
			}
			if (Static21.aStringArray13[local34] != null) {
				local72 = Static136.method2646(Static21.aStringArray13[local34]);
				if (local72 != null && local72.equals(local29)) {
					Static351.method5638(arg0 + Static140.aClass32_38.method701(Static107.anInt2498));
					return;
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static376.anInt6317; local107++) {
			local72 = Static136.method2646(Static347.aStringArray149[local107]);
			if (local72 != null && local72.equals(local29)) {
				Static351.method5638(Static53.aClass32_20.method701(Static107.anInt2498) + arg0 + Static233.aClass32_58.method701(Static107.anInt2498));
				return;
			}
			if (Static366.aStringArray157[local107] != null) {
				@Pc(150) String local150 = Static136.method2646(Static366.aStringArray157[local107]);
				if (local150 != null && local150.equals(local29)) {
					Static351.method5638(Static53.aClass32_20.method701(Static107.anInt2498) + arg0 + Static233.aClass32_58.method701(Static107.anInt2498));
					return;
				}
			}
		}
		if (Static136.method2646(Static206.aClass1_Sub5_Sub1_Sub1_1.aString24).equals(local29)) {
			Static351.method5638(Static231.aClass32_57.method701(Static107.anInt2498));
		} else {
			Static216.method3597(Static288.aClass11_76);
			Static372.aClass2_Sub16_Sub2_4.method5358(Static204.method3471(arg0));
			Static372.aClass2_Sub16_Sub2_4.method5362(arg0);
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(II)V")
	public static void method3445() {
		Static333.aClass160_54.method3606(50);
		Static340.aClass160_58.method3606(50);
		Static41.aClass160_6.method3606(50);
		Static1.aClass160_63.method3606(50);
		Static298.aClass160_47.method3606(50);
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(Z)V")
	public static void method3448() {
		@Pc(13) int[] local13 = new int[Static15.aClass81_1.anInt2148];
		@Pc(15) int local15 = 0;
		for (@Pc(17) int local17 = 0; local17 < Static15.aClass81_1.anInt2148; local17++) {
			@Pc(24) Class179 local24 = Static15.aClass81_1.method2175(local17);
			if (local24.anInt4378 >= 0 || local24.anInt4414 >= 0) {
				local13[local15++] = local17;
			}
		}
		Static192.anIntArray722 = new int[local15];
		for (@Pc(48) int local48 = 0; local48 < local15; local48++) {
			Static192.anIntArray722[local48] = local13[local48];
		}
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(IILclient!nm;ILclient!vc;B)V")
	public static void method3449(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class172 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class63 arg4) {
		@Pc(9) Class199 local9 = Static304.aClass206_122.method4414(arg2.anInt4116);
		if (local9.anInt4767 == -1) {
			return;
		}
		if (arg2.aBoolean313) {
			@Pc(26) int local26 = arg0 + arg2.anInt4148;
			arg0 = local26 & 0x3;
		} else {
			arg0 = 0;
		}
		@Pc(38) Class18 local38 = local9.method4208(arg4, arg2.aBoolean322, arg0);
		if (local38 == null) {
			return;
		}
		@Pc(49) int local49 = arg2.anInt4106;
		@Pc(52) int local52 = arg2.anInt4113;
		if ((arg0 & 0x1) == 1) {
			local52 = arg2.anInt4106;
			local49 = arg2.anInt4113;
		}
		@Pc(68) int local68 = local38.method4564();
		@Pc(71) int local71 = local38.method4560();
		if (local9.aBoolean356) {
			local71 = local52 * 4;
			local68 = local49 * 4;
		}
		if (local9.anInt4769 == 0) {
			local38.method4570(arg3, arg1 + 4 - local52 * 4, local68, local71);
		} else {
			local38.method4569(arg3, arg1 - (local52 - 1) * 4, local68, local71, 1, local9.anInt4769 | 0xFF000000, 1);
		}
	}
}
