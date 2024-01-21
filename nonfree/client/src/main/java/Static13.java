import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static13 {

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!dd;")
	public static Class17 aClass17_1 = new Class17(64);

	@OriginalMember(owner = "client!bd", name = "q", descriptor = "Lclient!ai;")
	public static Class6 aClass6_112 = Static38.method685("title)3jpg");

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
	public static int anInt333 = 0;

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!h;I)V")
	public static void method208(@OriginalArg(0) Class2_Sub3_Sub5_Sub1 arg0) {
		if (arg0.anInt2707 == 0) {
			return;
		}
		@Pc(34) int local34;
		@Pc(41) int local41;
		if (arg0.anInt2699 != -1 && arg0.anInt2699 < 32768) {
			@Pc(25) Class2_Sub3_Sub5_Sub1_Sub2 local25 = Static151.aClass2_Sub3_Sub5_Sub1_Sub2Array1[arg0.anInt2699];
			if (local25 != null) {
				local34 = arg0.anInt2674 - local25.anInt2674;
				local41 = arg0.anInt2672 - local25.anInt2672;
				if (local34 != 0 || local41 != 0) {
					arg0.anInt2680 = (int) (Math.atan2((double) local34, (double) local41) * 325.949D) & 0x7FF;
				}
			}
		}
		@Pc(77) int local77;
		if (arg0.anInt2699 >= 32768) {
			local77 = arg0.anInt2699 - 32768;
			if (Static68.anInt1727 == local77) {
				local77 = 2047;
			}
			@Pc(86) Class2_Sub3_Sub5_Sub1_Sub1 local86 = Static2.aClass2_Sub3_Sub5_Sub1_Sub1Array1[local77];
			if (local86 != null) {
				local41 = arg0.anInt2674 - local86.anInt2674;
				@Pc(102) int local102 = arg0.anInt2672 - local86.anInt2672;
				if (local41 != 0 || local102 != 0) {
					arg0.anInt2680 = (int) (Math.atan2((double) local41, (double) local102) * 325.949D) & 0x7FF;
				}
			}
		}
		if ((arg0.anInt2702 != 0 || arg0.anInt2709 != 0) && (arg0.anInt2687 == 0 || arg0.anInt2685 > 0)) {
			local77 = arg0.anInt2674 - (arg0.anInt2702 - Static2.anInt66 - Static2.anInt66) * 64;
			local34 = arg0.anInt2672 - (arg0.anInt2709 - Static176.anInt4061 - Static176.anInt4061) * 64;
			if (local77 != 0 || local34 != 0) {
				arg0.anInt2680 = (int) (Math.atan2((double) local77, (double) local34) * 325.949D) & 0x7FF;
			}
			arg0.anInt2709 = 0;
			arg0.anInt2702 = 0;
		}
		local77 = arg0.anInt2680 - arg0.anInt2681 & 0x7FF;
		if (local77 == 0) {
			arg0.anInt2689 = 0;
			return;
		}
		arg0.anInt2689++;
		@Pc(217) boolean local217;
		if (local77 <= 1024) {
			arg0.anInt2681 += arg0.anInt2707;
			local217 = true;
			if (arg0.anInt2707 > local77 || local77 > 2048 - arg0.anInt2707) {
				local217 = false;
				arg0.anInt2681 = arg0.anInt2680;
			}
			if (arg0.anInt2657 == arg0.anInt2668 && (arg0.anInt2689 > 25 || local217)) {
				if (arg0.anInt2659 == -1) {
					arg0.anInt2657 = arg0.anInt2667;
				} else {
					arg0.anInt2657 = arg0.anInt2659;
				}
			}
		} else {
			local217 = true;
			arg0.anInt2681 -= arg0.anInt2707;
			if (local77 < arg0.anInt2707 || local77 > 2048 - arg0.anInt2707) {
				local217 = false;
				arg0.anInt2681 = arg0.anInt2680;
			}
			if (arg0.anInt2657 == arg0.anInt2668 && (arg0.anInt2689 > 25 || local217)) {
				if (arg0.anInt2683 == -1) {
					arg0.anInt2657 = arg0.anInt2667;
				} else {
					arg0.anInt2657 = arg0.anInt2683;
				}
			}
		}
		arg0.anInt2681 &= 0x7FF;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method209() {
		aClass17_1 = null;
		aClass6_112 = null;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!sh;I)V")
	public static void method210(@OriginalArg(0) Class2_Sub22 arg0) {
		@Pc(1) int local1 = 0;
		if (arg0.anInt3546 == 0) {
			local1 = Static30.aClass44_1.method1247(arg0.anInt3550, arg0.anInt3545, arg0.anInt3557);
		}
		@Pc(19) int local19 = -1;
		@Pc(21) int local21 = 0;
		if (arg0.anInt3546 == 1) {
			local1 = Static30.aClass44_1.method1282(arg0.anInt3550, arg0.anInt3545, arg0.anInt3557);
		}
		if (arg0.anInt3546 == 2) {
			local1 = Static30.aClass44_1.method1255(arg0.anInt3550, arg0.anInt3545, arg0.anInt3557);
		}
		@Pc(49) int local49 = 0;
		if (arg0.anInt3546 == 3) {
			local1 = Static30.aClass44_1.method1264(arg0.anInt3550, arg0.anInt3545, arg0.anInt3557);
		}
		if (local1 != 0) {
			local19 = local1 >> 14 & 0x7FFF;
			@Pc(82) int local82 = Static30.aClass44_1.method1272(arg0.anInt3550, arg0.anInt3545, arg0.anInt3557, local1);
			local49 = local82 >> 6 & 0x3;
			local21 = local82 & 0x1F;
		}
		arg0.anInt3544 = local49;
		arg0.anInt3556 = local19;
		arg0.anInt3547 = local21;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
	public static void method211() {
		if (Static27.aClass87_4 != null || Static88.aClass87_6 != null) {
			return;
		}
		@Pc(18) int local18 = Static19.anInt509;
		@Pc(33) int local33;
		@Pc(93) int local93;
		@Pc(99) int local99;
		if (Static160.aBoolean24) {
			if (local18 != 1) {
				local33 = Static69.anInt1736;
				local93 = Static77.anInt1906;
				if (Static144.anInt3388 - 10 > local33 || local33 > Static144.anInt3388 + Static171.anInt4010 + 10 || local93 < Static96.anInt2389 - 10 || local93 > Static96.anInt2389 + Static105.anInt2554 + 10) {
					Static160.aBoolean24 = false;
					Static133.method2089(Static144.anInt3388, Static171.anInt4010, Static105.anInt2554, Static96.anInt2389);
				}
			}
			if (local18 != 1) {
				return;
			}
			local99 = Static171.anInt4010;
			local93 = Static96.anInt2389;
			local33 = Static144.anInt3388;
			@Pc(238) int local238 = Static155.anInt3959;
			@Pc(240) int local240 = Static5.anInt84;
			@Pc(242) int local242 = -1;
			for (@Pc(244) int local244 = 0; local244 < Static46.anInt1322; local244++) {
				@Pc(258) int local258 = (Static46.anInt1322 - local244 - 1) * 15 + local93 + 31;
				if (local33 < local238 && local99 + local33 > local238 && local240 > local258 - 13 && local258 + 3 > local240) {
					local242 = local244;
				}
			}
			if (local242 != -1) {
				Static25.method466(local242);
			}
			Static160.aBoolean24 = false;
			Static133.method2089(Static144.anInt3388, Static171.anInt4010, Static105.anInt2554, Static96.anInt2389);
			return;
		}
		if (local18 == 1 && Static46.anInt1322 > 0) {
			local33 = Static65.anIntArray104[Static46.anInt1322 - 1];
			if (local33 == 12 || local33 == 17 || local33 == 45 || local33 == 22 || local33 == 10 || local33 == 8 || local33 == 24 || local33 == 43 || local33 == 18 || local33 == 21 || local33 == 20 || local33 == 1004) {
				local93 = Static30.anIntArray34[Static46.anInt1322 - 1];
				local99 = Static134.anIntArray283[Static46.anInt1322 - 1];
				@Pc(103) Class87 local103 = Static57.method940(local99);
				if (Static20.method375(Static179.method2802(local103)) || Static156.method2409(Static179.method2802(local103))) {
					Static116.anInt2793 = 0;
					Static110.aBoolean107 = false;
					if (Static27.aClass87_4 != null) {
						Static151.method2327(Static27.aClass87_4);
					}
					Static27.aClass87_4 = Static57.method940(local99);
					Static174.anInt4035 = Static155.anInt3959;
					Static163.anInt3830 = Static5.anInt84;
					Static70.anInt1745 = local93;
					Static151.method2327(Static27.aClass87_4);
					return;
				}
			}
		}
		if (local18 == 1 && (Static21.anInt523 == 1 && Static46.anInt1322 > 2 || Static160.method429(Static46.anInt1322 - 1))) {
			local18 = 2;
		}
		if (local18 == 1 && Static46.anInt1322 > 0) {
			Static25.method466(Static46.anInt1322 - 1);
		}
		if (local18 == 2 && Static46.anInt1322 > 0) {
			Static126.method1962();
			return;
		}
	}
}
