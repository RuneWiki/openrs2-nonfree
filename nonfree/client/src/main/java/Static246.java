import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static246 {

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "F")
	public static float aFloat74;

	@OriginalMember(owner = "client!pn", name = "J", descriptor = "[I")
	public static int[] anIntArray505;

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
	public static int anInt4606 = 104;

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)V")
	public static void method4304() {
		Static338.aClass70_106.method1397(5);
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZLclient!ec;)V")
	public static void method4306(@OriginalArg(1) Class6_Sub10 arg0) {
		if (arg0.aByteArray67.length - arg0.anInt4188 < 1) {
			return;
		}
		@Pc(18) int local18 = arg0.method3972();
		if (local18 < 0 || local18 > 14) {
			return;
		}
		@Pc(34) byte local34;
		if (local18 == 14) {
			local34 = 36;
		} else if (local18 == 13) {
			local34 = 35;
		} else if (local18 == 12) {
			local34 = 34;
		} else if (local18 == 11) {
			local34 = 33;
		} else if (local18 == 10) {
			local34 = 32;
		} else if (local18 == 9) {
			local34 = 31;
		} else if (local18 == 8) {
			local34 = 30;
		} else if (local18 == 7) {
			local34 = 29;
		} else if (local18 == 6) {
			local34 = 28;
		} else if (local18 == 5) {
			local34 = 28;
		} else if (local18 == 4) {
			local34 = 24;
		} else if (local18 == 3) {
			local34 = 23;
		} else if (local18 == 2) {
			local34 = 22;
		} else if (local18 == 1) {
			local34 = 23;
		} else {
			local34 = 19;
		}
		if (arg0.aByteArray67.length - arg0.anInt4188 < local34) {
			return;
		}
		Static29.anInt564 = arg0.method3972();
		if (Static29.anInt564 < 1) {
			Static29.anInt564 = 1;
		} else if (Static29.anInt564 > 4) {
			Static29.anInt564 = 4;
		}
		Static66.method1129(arg0.method3972() == 1);
		Static14.aBoolean22 = arg0.method3972() == 1;
		Static293.aBoolean382 = arg0.method3972() == 1;
		Static61.aBoolean81 = arg0.method3972() == 1;
		Static172.anInt3235 = arg0.method3972() == 1 ? 1 : 0;
		Static349.aBoolean421 = arg0.method3972() == 1;
		Static119.aBoolean190 = arg0.method3972() == 1;
		Static196.aBoolean281 = arg0.method3972() == 1;
		Static282.anInt5340 = arg0.method3972();
		if (Static282.anInt5340 > 2) {
			Static282.anInt5340 = 2;
		}
		if (local18 < 2) {
			Static194.aBoolean277 = arg0.method3972() == 1;
			arg0.method3972();
		} else {
			Static194.aBoolean277 = arg0.method3972() == 1;
		}
		Static20.aBoolean26 = arg0.method3972() == 1;
		Static334.aBoolean407 = arg0.method3972() == 1;
		Static189.anInt3613 = arg0.method3972();
		if (Static189.anInt3613 > 2) {
			Static189.anInt3613 = 2;
		}
		Static297.anInt5582 = Static189.anInt3613;
		Static314.aBoolean195 = arg0.method3972() == 1;
		Static252.anInt4702 = arg0.method3972();
		if (Static252.anInt4702 > 127) {
			Static252.anInt4702 = 127;
		}
		Static62.anInt1130 = arg0.method3972();
		Static243.anInt4564 = arg0.method3972();
		if (Static243.anInt4564 > 127) {
			Static243.anInt4564 = 127;
		}
		if (local18 >= 1) {
			Static285.anInt5393 = arg0.method4021();
			Static91.anInt2907 = arg0.method4021();
		}
		if (local18 >= 3 && local18 < 6) {
			arg0.method3972();
		}
		@Pc(405) int local405;
		if (local18 >= 4) {
			local405 = arg0.method3972();
			if (local405 < 0 || local405 > 2) {
				local405 = 0;
			}
			if (Static183.anInt3439 < 96) {
				local405 = 0;
			}
			Static239.method5787(local405);
		}
		if (local18 >= 5) {
			Static98.anInt1846 = arg0.method3979();
		}
		local405 = 0;
		if (local18 >= 6) {
			Static182.anInt3432 = local405 = arg0.method3972();
		}
		if (Static182.anInt3432 != 1 && Static182.anInt3432 != 2) {
			Static182.anInt3432 = 2;
		}
		if (local18 >= 7) {
			Static276.aBoolean363 = arg0.method3972() == 1;
		}
		if (local18 >= 8) {
			Static317.aBoolean395 = arg0.method3972() == 1;
		}
		if (local18 >= 9) {
			Static163.anInt3087 = arg0.method3972();
		}
		if (Static163.anInt3087 < 0 || Static163.anInt3087 > 3) {
			Static163.anInt3087 = 0;
		}
		if (local18 >= 10) {
			Static131.aBoolean201 = arg0.method3972() != 0;
		}
		if (local18 >= 11) {
			Static346.aBoolean418 = arg0.method3972() != 0;
		}
		if (local18 >= 12) {
			Static172.anInt3235 = arg0.method3972();
		}
		if (Static172.anInt3235 < 0 || Static172.anInt3235 > 2) {
			Static172.anInt3235 = 1;
		}
		if (local18 >= 13) {
			Static354.aBoolean428 = arg0.method3972() == 1;
		}
		if (local18 >= 14) {
			Static213.anInt3920 = arg0.method3972();
		} else if (local405 == 0) {
			Static213.anInt3920 = 2;
		} else {
			Static213.anInt3920 = 1;
		}
		if (Static213.anInt3920 < 0 || Static213.anInt3920 > 3) {
			Static213.anInt3920 = 2;
		}
	}
}
