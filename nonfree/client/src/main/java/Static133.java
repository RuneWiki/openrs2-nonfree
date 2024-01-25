import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static133 {

	@OriginalMember(owner = "client!gj", name = "c", descriptor = "Lclient!si;")
	public static Class223 aClass223_1;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Z)V")
	public static void method2300() {
		Static7.aClass163_1.method3619();
		for (@Pc(13) Class10_Sub45 local13 = (Class10_Sub45) Static70.aClass163_13.method3620(); local13 != null; local13 = (Class10_Sub45) Static70.aClass163_13.method3621()) {
			if (local13.anInt7505 < 1000) {
				local13.method6033();
				Static7.aClass163_1.method3613(local13);
			}
		}
		Static7.aClass163_1.method3623(Static70.aClass163_13);
		@Pc(45) int local45 = -1;
		@Pc(55) Class10_Sub16 local55 = (Class10_Sub16) Static173.aClass163_29.method3620();
		if (local55 != null) {
			local45 = local55.method1924();
		}
		if (!Static35.aBoolean37) {
			if (local45 == 0 && (Static334.anInt5660 == 1 && Static207.anInt4055 > 2 || Static282.method4003())) {
				local45 = 2;
			}
			if (local45 == 2 && Static207.anInt4055 > 0 && local55 != null) {
				if (Static458.aClass89_14 == null && Static443.anInt7416 == 0) {
					Static398.method5278(local55.method1923(), local55.method1921());
				} else {
					Static81.anInt1731 = 2;
				}
			}
			if (local45 == 0 && Static207.anInt4055 > 0) {
				Static288.method4072();
			}
			if (Static458.aClass89_14 != null || Static443.anInt7416 != 0) {
				return;
			}
			Static81.anInt1731 = 0;
			Static60.aClass10_Sub45_3 = null;
			return;
		}
		@Pc(70) int local70;
		@Pc(74) int local74;
		if (local45 == -1) {
			local70 = Static113.aClass13_1.method4116();
			local74 = Static113.aClass13_1.method4123();
			if (local70 < Static270.anInt4755 - 10 || Static270.anInt4755 + Static226.anInt4217 + 10 < local70 || local74 < Static279.anInt4882 - 10 || local74 > Static361.anInt6151 + Static279.anInt4882 + 10) {
				Static405.method5343();
			}
		}
		if (local45 != 0) {
			return;
		}
		local70 = Static270.anInt4755;
		local74 = Static279.anInt4882;
		@Pc(117) int local117 = Static226.anInt4217;
		@Pc(121) int local121 = local55.method1921();
		@Pc(129) int local129 = local55.method1923();
		@Pc(131) int local131 = -1;
		@Pc(149) int local149;
		for (@Pc(133) int local133 = 0; local133 < Static207.anInt4055; local133++) {
			if (Static39.aBoolean44) {
				local149 = (Static207.anInt4055 - local133 - 1) * 16 + local74 + 33;
				if (local70 < local121 && local117 + local70 > local121 && local129 > local149 - 13 && local149 + 4 > local129) {
					local131 = local133;
				}
			} else {
				local149 = (Static207.anInt4055 - local133 - 1) * 16 + local74 + 31;
				if (local121 > local70 && local70 + local117 > local121 && local149 - 13 < local129 && local129 < local149 + 3) {
					local131 = local133;
				}
			}
		}
		if (local131 != -1) {
			local149 = 0;
			@Pc(239) Class90 local239 = new Class90(Static70.aClass163_13);
			for (@Pc(244) Class10_Sub45 local244 = (Class10_Sub45) local239.method2297(); local244 != null; local244 = (Class10_Sub45) local239.method2299()) {
				if (local149 == local131) {
					Static437.method5688(local244, local121, local129);
				}
				local149++;
			}
		}
		Static405.method5343();
		return;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)Z")
	public static boolean method2301() {
		return Static152.anInt3124 == 0 ? Static114.aClass10_Sub7_Sub4_1.method4840() : true;
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
	public static void method2302() {
		Static173.aClass43_5.method1035();
		Static297.aClass207_5.method4746();
		Static8.aClass100_1.method2413();
		Static342.aClass237_4.method5205();
		Static448.aClass38_4.method863();
		Static313.aClass272_2.method6063();
		Static281.aClass98_3.method2407();
		Static147.aClass107_1.method2638();
		Static189.aClass112_1.method2696();
		Static82.aClass271_1.method6058();
		aClass223_1.method4950();
		Static228.aClass2_4.method11();
		Static300.aClass88_3.method2272();
		Static116.aClass144_1.method3295();
		Static376.aClass204_1.method4527();
		Static88.aClass47_2.method1077();
		Static314.aClass158_1.method3480();
		Static120.aClass128_1.method3045();
		Static400.aClass165_1.method3682();
		Static394.aClass48_1.method1082();
		Static171.method2915();
		Static225.method5952();
		Static174.method2936();
		Static68.method1349();
		Static209.aClass267_36.method6013();
		Static152.aClass267_27.method6013();
		Static359.aClass267_64.method6013();
		Static432.aClass267_82.method6013();
		Static79.aClass267_14.method6013();
	}
}
