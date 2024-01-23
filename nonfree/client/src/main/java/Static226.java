import java.util.Date;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!re", name = "l", descriptor = "I")
	public static int anInt4614 = 0;

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(JZ)Ljava/lang/String;")
	public static String method3501(@OriginalArg(0) long arg0) {
		Static145.aCalendar1.setTime(new Date(arg0));
		@Pc(13) int local13 = Static145.aCalendar1.get(7);
		@Pc(17) int local17 = Static145.aCalendar1.get(5);
		@Pc(25) int local25 = Static145.aCalendar1.get(2);
		@Pc(29) int local29 = Static145.aCalendar1.get(1);
		@Pc(33) int local33 = Static145.aCalendar1.get(11);
		@Pc(37) int local37 = Static145.aCalendar1.get(12);
		@Pc(41) int local41 = Static145.aCalendar1.get(13);
		return Static98.aStringArray33[local13 - 1] + ", " + local17 / 10 + local17 % 10 + "-" + Static69.aStringArray22[local25] + "-" + local29 + " " + local33 / 10 + local33 % 10 + ":" + local37 / 10 + local37 % 10 + ":" + local41 / 10 + local41 % 10 + " GMT";
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(B)V")
	public static void method3502() {
		while (true) {
			if (Static275.aClass8_Sub2_Sub1_6.method2389(Static68.anInt1687) >= 27) {
				@Pc(22) int local22 = Static275.aClass8_Sub2_Sub1_6.method2390(15);
				if (local22 != 32767) {
					@Pc(31) boolean local31 = false;
					if (Static48.aClass36_Sub3_Sub2Array1[local22] == null) {
						local31 = true;
						Static48.aClass36_Sub3_Sub2Array1[local22] = new Class36_Sub3_Sub2();
					}
					@Pc(49) Class36_Sub3_Sub2 local49 = Static48.aClass36_Sub3_Sub2Array1[local22];
					Static191.anIntArray285[Static135.anInt2729++] = local22;
					local49.anInt4119 = Static183.anInt3590;
					if (local49.aClass173_1 != null && local49.aClass173_1.method4251()) {
						Static232.method3544(local49);
					}
					@Pc(77) int local77 = Static275.aClass8_Sub2_Sub1_6.method2390(5);
					if (local77 > 15) {
						local77 -= 32;
					}
					@Pc(90) int local90 = Static92.anIntArray131[Static275.aClass8_Sub2_Sub1_6.method2390(3)];
					if (local31) {
						local49.anInt4081 = local49.anInt4128 = local90;
					}
					@Pc(103) int local103 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
					local49.method3117(Static253.method3795(Static275.aClass8_Sub2_Sub1_6.method2390(14)));
					@Pc(117) int local117 = Static275.aClass8_Sub2_Sub1_6.method2390(5);
					@Pc(122) int local122 = Static275.aClass8_Sub2_Sub1_6.method2390(1);
					if (local117 > 15) {
						local117 -= 32;
					}
					if (local122 == 1) {
						Static171.anIntArray259[Static291.anInt3609++] = local22;
					}
					local49.method3115(local49.aClass173_1.anInt5633);
					local49.anInt4129 = local49.aClass173_1.anInt5606;
					local49.anInt4083 = local49.aClass173_1.anInt5634;
					if (local49.anInt4129 == 0) {
						local49.anInt4128 = 0;
					}
					local49.method3116(local117 + Static21.aClass36_Sub3_Sub1_1.anIntArray310[0], local49.method3110(), local77 + Static21.aClass36_Sub3_Sub1_1.anIntArray308[0], local103 == 1);
					if (local49.aClass173_1.method4251()) {
						Static213.method3340(local49.anIntArray308[0], 0, local49, null, null, local49.anIntArray310[0], Static34.anInt770);
					}
					continue;
				}
			}
			Static275.aClass8_Sub2_Sub1_6.method2391();
			return;
		}
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "([Ljava/lang/Object;B[I)V")
	public static void method3503(@OriginalArg(0) Object[] arg0, @OriginalArg(2) int[] arg1) {
		Static2.method5(arg0, 0, arg1.length - 1, arg1);
	}

	@OriginalMember(owner = "client!re", name = "a", descriptor = "(IILjava/lang/String;)V")
	public static void method3504(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		Static66.aClass8_Sub2_Sub1_4.method2398(67);
		Static66.aClass8_Sub2_Sub1_4.method2340(arg0);
		Static66.aClass8_Sub2_Sub1_4.method2362(Static31.method513(arg1));
	}
}
