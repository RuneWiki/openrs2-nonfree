import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static45 {

	@OriginalMember(owner = "client!d", name = "a", descriptor = "[I")
	public static int[] anIntArray157;

	@OriginalMember(owner = "client!d", name = "c", descriptor = "[Lclient!hf;")
	public static Class70[] aClass70Array2 = new Class70[6];

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Z)V")
	public static void method1409() {
		@Pc(3) int local3 = Static68.anInt1739;
		@Pc(5) int local5 = Static39.anInt982;
		@Pc(11) int local11 = Static275.anInt5450;
		@Pc(15) int local15 = Static274.anInt5436;
		if (Static116.aBoolean184) {
			Static111.method1888(local3, local5, local15, local11, 6116423);
			Static111.method1888(local3 + 1, local5 + 1, local15 - 2, 16, 0);
			Static111.method1897(local3 + 1, local5 - -18, local15 - 2, local11 + -19, 0);
		} else {
			Static77.method1447(local3, local5, local15, local11, 6116423);
			Static77.method1447(local3 + 1, local5 - -1, local15 - 2, 16, 0);
			Static77.method1457(local3 + 1, local5 + 18, local15 - 2, local11 + -19, 0);
		}
		Static237.aClass2_Sub8_Sub5_5.method1220(Static204.aString145, local3 + 3, local5 + 14, 6116423, -1);
		@Pc(96) int local96 = Static131.anInt3016;
		@Pc(101) int local101 = Static281.anInt5551;
		for (@Pc(103) int local103 = 0; local103 < Static68.anInt1741; local103++) {
			@Pc(118) int local118 = (Static68.anInt1741 - local103 - 1) * 15 + local5 + 31;
			@Pc(120) int local120 = 16777215;
			if (local3 < local96 && local96 < local3 + local15 && local101 > local118 - 13 && local101 < local118 + 3) {
				local120 = 16776960;
			}
			Static237.aClass2_Sub8_Sub5_5.method1220(Static143.method2543(local103), local3 + 3, local118, local120, 0);
		}
		Static301.method4577(Static68.anInt1739, Static275.anInt5450, Static39.anInt982, Static274.anInt5436);
	}

	@OriginalMember(owner = "client!d", name = "a", descriptor = "(Lclient!ek;ILclient!ek;)I")
	public static int method1410(@OriginalArg(0) Class42 arg0, @OriginalArg(2) Class42 arg1) {
		@Pc(11) int local11 = 0;
		if (arg1.method1253(Static84.anInt1972)) {
			local11++;
		}
		if (arg1.method1253(Static36.anInt936)) {
			local11++;
		}
		if (arg1.method1253(Static106.anInt2446)) {
			local11++;
		}
		if (arg0.method1253(Static84.anInt1972)) {
			local11++;
		}
		if (arg0.method1253(Static36.anInt936)) {
			local11++;
		}
		if (arg0.method1253(Static106.anInt2446)) {
			local11++;
		}
		return local11;
	}
}
