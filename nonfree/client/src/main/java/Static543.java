import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static543 {

	@OriginalMember(owner = "client!sf", name = "g", descriptor = "I")
	public static int anInt8401;

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZIILclient!bt;III)V")
	public static void method7258(@OriginalArg(3) Class34 arg0, @OriginalArg(4) int arg1, @OriginalArg(5) int arg2, @OriginalArg(6) int arg3) {
		if (arg1 <= 0) {
			Static64.method1419(arg0, arg3, arg2);
			return;
		}
		Static554.aClass4_Sub3_Sub4_5 = null;
		Static91.anInt1809 = 1;
		Static466.aBoolean583 = false;
		Static586.aClass34_116 = arg0;
		Static414.anInt5938 = arg3;
		Static566.anInt8739 = arg2;
		Static46.anInt907 = 0;
		Static670.anInt6846 = Static570.aClass4_Sub3_Sub4_6.method6768() / arg1;
		if (Static670.anInt6846 < 1) {
			Static670.anInt6846 = 1;
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIIII)V")
	public static void method7259(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 > Static527.anInt8177 || arg4 < Static73.anInt1542) {
			return;
		}
		@Pc(20) boolean local20;
		if (arg0 < Static472.anInt7503) {
			local20 = false;
			arg0 = Static472.anInt7503;
		} else if (Static257.anInt4172 >= arg0) {
			local20 = true;
		} else {
			arg0 = Static257.anInt4172;
			local20 = false;
		}
		@Pc(51) boolean local51;
		if (Static472.anInt7503 > arg2) {
			local51 = false;
			arg2 = Static472.anInt7503;
		} else if (Static257.anInt4172 >= arg2) {
			local51 = true;
		} else {
			local51 = false;
			arg2 = Static257.anInt4172;
		}
		if (arg1 >= Static73.anInt1542) {
			Static559.method7424(arg3, Static172.anIntArrayArray17[arg1++], arg2, arg0);
		} else {
			arg1 = Static73.anInt1542;
		}
		if (arg4 <= Static527.anInt8177) {
			Static559.method7424(arg3, Static172.anIntArrayArray17[arg4--], arg2, arg0);
		} else {
			arg4 = Static527.anInt8177;
		}
		@Pc(109) int local109;
		if (local20 && local51) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				@Pc(151) int[] local151 = Static172.anIntArrayArray17[local109];
				local151[arg0] = local151[arg2] = arg3;
			}
		} else if (local20) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				Static172.anIntArrayArray17[local109][arg0] = arg3;
			}
		} else if (local51) {
			for (local109 = arg1; local109 <= arg4; local109++) {
				Static172.anIntArrayArray17[local109][arg2] = arg3;
			}
		}
	}
}
