import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!hc", name = "h", descriptor = "Ljava/lang/Object;")
	public static Object anObject9;

	@OriginalMember(owner = "client!hc", name = "a", descriptor = "(IZII)Z")
	public static boolean method3235(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (!Static368.aBoolean505) {
			return false;
		} else if (Static192.anInt3745 < 100) {
			return false;
		} else {
			@Pc(20) int local20 = Static300.anIntArrayArrayArray13[arg1][arg2][arg0];
			if (local20 == -Static431.anInt8105) {
				return false;
			} else if (local20 == Static431.anInt8105) {
				return true;
			} else if (Static183.aClass83Array6 == Static499.aClass83Array3) {
				return false;
			} else {
				@Pc(53) int local53 = arg2 << Static145.anInt3093;
				@Pc(57) int local57 = arg0 << Static145.anInt3093;
				if (Static193.method3363(Static499.aClass83Array3[arg1].method7217(arg0 + 1, arg2), Static499.aClass83Array3[arg1].method7217(arg0 + 1, arg2 + 1), local57 + Static279.anInt5708 - 1, local53 + 1, local57 + Static279.anInt5708 - 1, Static499.aClass83Array3[arg1].method7217(arg0, arg2), local53 + 1, local57 + 1, local53 + Static279.anInt5708 - 1) && Static193.method3363(Static499.aClass83Array3[arg1].method7217(arg0 + 1, arg2 + 1), Static499.aClass83Array3[arg1].method7217(arg0, arg2 + 1), local57 + 1, local53 - -1, Static279.anInt5708 + local57 - 1, Static499.aClass83Array3[arg1].method7217(arg0, arg2), local53 + Static279.anInt5708 - 1, local57 + 1, Static279.anInt5708 + local53 - 1)) {
					Static105.anInt2400++;
					Static300.anIntArrayArrayArray13[arg1][arg2][arg0] = Static431.anInt8105;
					return true;
				} else {
					Static300.anIntArrayArrayArray13[arg1][arg2][arg0] = -Static431.anInt8105;
					return false;
				}
			}
		}
	}

	@OriginalMember(owner = "client!hc", name = "b", descriptor = "(I)V")
	public static void method3237() {
		Static228.aClass189_4.method4518();
		Static407.aClass360_5.method8303();
		Static522.aClass290_6.method6965();
		Static204.aClass139_8.method3310();
		Static237.aClass31_1.method479();
		Static521.aClass273_2.method6718();
		Static61.aClass48_1.method1014();
		Static569.aClass213_2.method5289();
		Static381.aClass2_4.method64();
		Static121.aClass141_1.method3341();
		Static462.aClass178_1.method4037();
		Static182.aClass142_3.method3367();
		Static447.aClass237_3.method5789();
		Static484.aClass313_2.method7383();
		Static517.aClass144_1.method3379();
		Static419.aClass28_1.method458();
		Static594.aClass170_1.method3845();
		Static565.aClass188_1.method4463();
		Static222.aClass243_2.method5942();
		Static278.aClass171_1.method3850();
		Static351.method7421();
		Static438.method6795();
		Static397.method6282();
		Static256.method4101();
		Static83.method1538();
		Static261.aClass223_34.method5399(5);
		Static175.aClass223_18.method5399(5);
		Static95.aClass223_14.method5399(5);
		Static148.aClass223_65.method5399(5);
		Static388.aClass223_52.method5399(5);
	}
}
