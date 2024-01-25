import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static452 {

	@OriginalMember(owner = "client!qb", name = "z", descriptor = "Lclient!jha;")
	public static Class170 aClass170_4;

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
	public static int anInt8709;

	@OriginalMember(owner = "client!qb", name = "u", descriptor = "[Lclient!be;")
	public static final Class5_Sub4_Sub2[] aClass5_Sub4_Sub2Array6 = new Class5_Sub4_Sub2[14];

	@OriginalMember(owner = "client!qb", name = "D", descriptor = "I")
	public static final int anInt8703 = 1407;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7475(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg6;
		@Pc(11) int local11 = 0;
		@Pc(15) int local15 = arg3 - arg4;
		@Pc(20) int local20 = arg6 - arg4;
		@Pc(24) int local24 = arg3 * arg3;
		@Pc(28) int local28 = arg6 * arg6;
		@Pc(38) int local38 = local15 * local15;
		@Pc(42) int local42 = local20 * local20;
		@Pc(46) int local46 = local28 << 1;
		@Pc(50) int local50 = local24 << 1;
		@Pc(54) int local54 = local42 << 1;
		@Pc(58) int local58 = local38 << 1;
		@Pc(62) int local62 = arg6 << 1;
		@Pc(66) int local66 = local20 << 1;
		@Pc(75) int local75 = local46 + (1 - local62) * local24;
		@Pc(84) int local84 = local28 - (local62 - 1) * local50;
		@Pc(93) int local93 = (1 - local66) * local38 + local54;
		@Pc(102) int local102 = local42 - (local66 - 1) * local58;
		@Pc(106) int local106 = local24 << 2;
		@Pc(110) int local110 = local28 << 2;
		@Pc(114) int local114 = local38 << 2;
		@Pc(118) int local118 = local42 << 2;
		@Pc(122) int local122 = local46 * 3;
		@Pc(128) int local128 = (local62 - 3) * local50;
		@Pc(132) int local132 = local54 * 3;
		@Pc(138) int local138 = local58 * (local66 - 3);
		@Pc(140) int local140 = local110;
		@Pc(146) int local146 = (arg6 - 1) * local106;
		@Pc(148) int local148 = local118;
		@Pc(169) int local169;
		@Pc(178) int local178;
		@Pc(189) int local189;
		@Pc(197) int local197;
		if (arg1 >= Static304.anInt4824 && arg1 <= Static231.anInt3977) {
			@Pc(158) int[] local158 = Static267.anIntArrayArray20[arg1];
			local169 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg5 - arg3);
			local178 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg5 + arg3);
			local189 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg5 - local15);
			local197 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, local15 + arg5);
			Static260.method3979(arg2, local169, local158, local189);
			Static260.method3979(arg0, local189, local158, local197);
			Static260.method3979(arg2, local197, local158, local178);
		}
		@Pc(225) int local225 = (local20 - 1) * local114;
		while (local9 > 0) {
			@Pc(238) boolean local238 = local9 <= local20;
			if (local238) {
				if (local93 < 0) {
					while (local93 < 0) {
						local93 += local132;
						local102 += local148;
						local11++;
						local132 += local118;
						local148 += local118;
					}
				}
				if (local102 < 0) {
					local102 += local148;
					local93 += local132;
					local11++;
					local132 += local118;
					local148 += local118;
				}
				local102 += -local138;
				local93 += -local225;
				local138 -= local114;
				local225 -= local114;
			}
			if (local75 < 0) {
				while (local75 < 0) {
					local84 += local140;
					local75 += local122;
					local122 += local110;
					local140 += local110;
					local7++;
				}
			}
			if (local84 < 0) {
				local84 += local140;
				local75 += local122;
				local140 += local110;
				local7++;
				local122 += local110;
			}
			local75 += -local146;
			local84 += -local128;
			local128 -= local106;
			local9--;
			local146 -= local106;
			local169 = arg1 - local9;
			local178 = arg1 + local9;
			if (Static304.anInt4824 <= local178 && Static231.anInt3977 >= local169) {
				local189 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg5 + local7);
				local197 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg5 - local7);
				if (local238) {
					@Pc(419) int local419 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg5 + local11);
					@Pc(430) int local430 = Static84.method1337(Static487.anInt8320, Static514.anInt8603, arg5 - local11);
					@Pc(441) int[] local441;
					if (Static304.anInt4824 <= local169) {
						local441 = Static267.anIntArrayArray20[local169];
						Static260.method3979(arg2, local197, local441, local430);
						Static260.method3979(arg0, local430, local441, local419);
						Static260.method3979(arg2, local419, local441, local189);
					}
					if (local178 <= Static231.anInt3977) {
						local441 = Static267.anIntArrayArray20[local178];
						Static260.method3979(arg2, local197, local441, local430);
						Static260.method3979(arg0, local430, local441, local419);
						Static260.method3979(arg2, local419, local441, local189);
					}
				} else {
					if (Static304.anInt4824 <= local169) {
						Static260.method3979(arg2, local197, Static267.anIntArrayArray20[local169], local189);
					}
					if (Static231.anInt3977 >= local178) {
						Static260.method3979(arg2, local197, Static267.anIntArrayArray20[local178], local189);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IBIZ)I")
	public static int method7476(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2) {
		@Pc(8) Class5_Sub37 local8 = Static498.method7299(arg2, arg0);
		if (local8 == null) {
			return -1;
		} else if (arg1 >= 0 && arg1 < local8.anIntArray552.length) {
			return local8.anIntArray552[arg1];
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!qb", name = "b", descriptor = "(B)V")
	public static void method7477() {
		if (Static593.aClass291Array1 == null) {
			Static593.aClass291Array1 = Static472.method6906();
			Static154.aClass291_2 = Static593.aClass291Array1[0];
			Static409.aLong193 = Static205.method3179();
		}
		if (Static182.aClass90_1 == null) {
			Static260.method3981();
		}
		@Pc(31) Class291 local31 = Static154.aClass291_2;
		@Pc(34) int local34 = Static160.method2425();
		if (Static154.aClass291_2 == local31) {
			Static596.aString135 = Static154.aClass291_2.aClass58_64.method1237(Static321.anInt5554);
			if (Static154.aClass291_2.aBoolean659) {
				Static17.anInt409 = Static154.aClass291_2.anInt7918 + local34 * (Static154.aClass291_2.anInt7917 - Static154.aClass291_2.anInt7918) / 100;
			}
			if (Static154.aClass291_2.aBoolean658) {
				Static596.aString135 = Static596.aString135 + Static17.anInt409 + "%";
			}
		} else if (Static472.aClass291_23 == Static154.aClass291_2) {
			Static182.aClass90_1 = null;
			Static214.method3254(3);
		} else {
			Static596.aString135 = local31.aClass58_65.method1237(Static321.anInt5554);
			Static17.anInt409 = local31.anInt7917;
			if (Static154.aClass291_2.aBoolean658) {
				Static596.aString135 = Static596.aString135 + local31.anInt7917 + "%";
			}
			if (Static154.aClass291_2.aBoolean659 || local31.aBoolean659) {
				Static409.aLong193 = Static205.method3179();
			}
		}
		if (Static182.aClass90_1 == null) {
			return;
		}
		Static182.aClass90_1.method1831(Static596.aString135, Static17.anInt409, Static154.aClass291_2, Static409.aLong193);
		if (Static25.anInterface22Array1 == null) {
			return;
		}
		for (@Pc(134) int local134 = Static388.anInt6782 + 1; local134 < Static25.anInterface22Array1.length; local134++) {
			if (Static25.anInterface22Array1[local134].method6464() >= 100 && Static388.anInt6782 == local134 - 1 && Static469.anInt7883 >= 1 && Static182.aClass90_1.method1830()) {
				try {
					Static25.anInterface22Array1[local134].method6463();
				} catch (@Pc(166) Exception local166) {
					Static25.anInterface22Array1 = null;
					return;
				}
				Static182.aClass90_1.method1825(Static25.anInterface22Array1[local134]);
				Static388.anInt6782++;
				if (Static388.anInt6782 >= Static25.anInterface22Array1.length - 1 && Static25.anInterface22Array1.length > 1) {
					Static388.anInt6782 = Static154.aClass327_1.method7738() ? 0 : -1;
				}
			}
		}
		return;
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(BJ)V")
	public static void method7478(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static52.method810(arg0 - 1L);
			Static52.method810(1L);
		} else {
			Static52.method810(arg0);
		}
	}
}
