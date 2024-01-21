import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
	public static int anInt1010;

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "Lclient!dd;")
	public static Class13 aClass13_335 = Static161.method2971("Diese Betatest)2Welt ist nur f-Ur eingeladene");

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "I")
	public static int anInt1009 = 0;

	@OriginalMember(owner = "client!cg", name = "g", descriptor = "Lclient!dd;")
	public static Class13 aClass13_336 = Static161.method2971("weiss:");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V")
	public static void method846() {
		aClass13_335 = null;
		aClass13_336 = null;
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIII)V")
	public static void method849(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(BILclient!dd;)V")
	public static void method850(@OriginalArg(1) int arg0, @OriginalArg(2) Class13 arg1) {
		@Pc(7) boolean local7 = false;
		@Pc(15) Class13 local15 = arg1.method880().method903();
		for (@Pc(17) int local17 = 0; local17 < Static65.anInt1929; local17++) {
			@Pc(25) Class1_Sub2_Sub2_Sub2_Sub2 local25 = Static45.aClass1_Sub2_Sub2_Sub2_Sub2Array1[Static30.anIntArray116[local17]];
			if (local25 != null && local25.aClass13_847 != null && local25.aClass13_847.method894(local15)) {
				Static49.method1224(Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray247[0], 1, 0, false, local25.anIntArray246[0], local25.anIntArray247[0], 2, 0, Static64.aClass1_Sub2_Sub2_Sub2_Sub2_1.anIntArray246[0], 0, 1);
				if (arg0 == 1) {
					Static1.aClass1_Sub8_Sub1_1.method1654(13);
					Static1.aClass1_Sub8_Sub1_1.method1650(Static30.anIntArray116[local17]);
				} else if (arg0 == 4) {
					Static1.aClass1_Sub8_Sub1_1.method1654(118);
					Static1.aClass1_Sub8_Sub1_1.method1614(Static30.anIntArray116[local17]);
				} else if (arg0 == 6) {
					Static1.aClass1_Sub8_Sub1_1.method1654(243);
					Static1.aClass1_Sub8_Sub1_1.method1629(Static30.anIntArray116[local17]);
				} else if (arg0 == 7) {
					Static1.aClass1_Sub8_Sub1_1.method1654(226);
					Static1.aClass1_Sub8_Sub1_1.method1632(Static30.anIntArray116[local17]);
				}
				local7 = true;
				break;
			}
		}
		if (!local7) {
			Static169.method2887(Static16.aClass13_253, Static57.method1349(new Class13[] { Static79.aClass13_748, local15 }), 0);
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method851(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static51.anIntArrayArrayArray2[arg0][local16][local20] == -Static89.anInt2511) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static114.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5;
			if (!Static108.method2114(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static108.method2114(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static108.method2114(local20, local156, local182)) {
				return false;
			} else if (Static108.method2114(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static1.method49(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static108.method2114(local16 + 1, Static114.anIntArrayArrayArray4[arg0][arg1][arg3] + arg5, local20 + 1) && Static108.method2114(local16 + 128 - 1, Static114.anIntArrayArrayArray4[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static108.method2114(local16 + 128 - 1, Static114.anIntArrayArrayArray4[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static108.method2114(local16 + 1, Static114.anIntArrayArrayArray4[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(IB)V")
	public static void method852(@OriginalArg(0) int arg0) {
		if (!Static171.method2892(arg0)) {
			return;
		}
		@Pc(14) Class20[] local14 = Static145.aClass20ArrayArray1[arg0];
		for (@Pc(16) int local16 = 0; local16 < local14.length; local16++) {
			@Pc(22) Class20 local22 = local14[local16];
			if (local22 != null) {
				local22.anInt1580 = 0;
				local22.anInt1553 = 0;
			}
		}
	}
}
