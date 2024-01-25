import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(B)V")
	public static void method3080() {
		Static354.anIntArrayArrayArray16 = new int[Static59.anInt987][Static654.anInt10715 + 1][Static180.anInt2928 + 1];
		Static207.anInt3630 = 0;
		Static264.anInt4916 = 0;
		Static83.anInt1456 = 0;
		Static600.aClass393Array2 = new Class393[2000];
		Static475.anInt8190 = 0;
		Static314.anInt5517 = Static391.anInt6813;
		Static307.anInt5462 = Static391.anInt6813;
		Static682.aClass393Array4 = new Class393[500];
		Static572.aClass393Array1 = new Class393[1000];
		Static508.aBoolean622 = false;
		Static630.aClass393Array3 = new Class393[500];
		if (Static554.aClass144_12 instanceof oa) {
			Static413.aBoolean501 = false;
		} else {
			Static413.aBoolean501 = true;
		}
	}

	@OriginalMember(owner = "client!gv", name = "a", descriptor = "(IBIII)V")
	public static void method3082(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg1 != 8 && arg1 != 16) {
			@Pc(115) Class89 local115 = Static63.aClass89ArrayArrayArray1[arg2][arg3][arg0];
			if (local115 != null) {
				if (arg1 == 1) {
					local115.aShort6 = 0;
				} else if (arg1 == 2) {
					local115.aShort7 = 0;
				}
			}
			Static41.method673();
			return;
		}
		for (@Pc(22) int local22 = 0; local22 < Static83.anInt1456; local22++) {
			@Pc(28) Class393 local28 = Static572.aClass393Array1[local22];
			if (arg1 == local28.aByte145 && local28.aShort121 == arg3 && arg0 == local28.aShort119 || arg3 == local28.aShort122 && arg0 == local28.aShort119) {
				if (local22 != Static83.anInt1456) {
					Static691.method86(Static572.aClass393Array1, local22 + 1, Static572.aClass393Array1, local22, Static572.aClass393Array1.length - local22 - 1);
				}
				Static83.anInt1456--;
				return;
			}
		}
	}
}
