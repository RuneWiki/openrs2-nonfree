import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIB)V")
	public static void method727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(17) int local17 = arg3;
		@Pc(20) int local20 = -arg3;
		@Pc(22) int local22 = -1;
		Static307.method5019(Static152.anIntArrayArray30[arg1], arg0 + arg3, arg2, arg0 - arg3);
		while (local17 > local7) {
			local22 += 2;
			local7++;
			local20 += local22;
			if (local20 >= 0) {
				local17--;
				local20 -= local17 << 1;
				@Pc(62) int[] local62 = Static152.anIntArrayArray30[arg1 + local17];
				@Pc(69) int[] local69 = Static152.anIntArrayArray30[arg1 - local17];
				@Pc(74) int local74 = arg0 + local7;
				@Pc(78) int local78 = arg0 - local7;
				Static307.method5019(local62, local74, arg2, local78);
				Static307.method5019(local69, local74, arg2, local78);
			}
			@Pc(94) int local94 = arg0 + local17;
			@Pc(99) int local99 = arg0 - local17;
			@Pc(105) int[] local105 = Static152.anIntArrayArray30[local7 + arg1];
			@Pc(112) int[] local112 = Static152.anIntArrayArray30[arg1 - local7];
			Static307.method5019(local105, local94, arg2, local99);
			Static307.method5019(local112, local94, arg2, local99);
		}
	}

	@OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)I")
	public static int method728() {
		return ((Static228.anInt4592 == 0 ? 0 : 1) << 21) + ((Static41.aBoolean51 ? 1 : 0) << 19) + ((Static135.aBoolean204 ? 1 : 0) << 16) + ((Static382.aBoolean487 ? 1 : 0) << 13) + ((Static266.anInt5047 & 0x3) << 11) + ((Static183.aBoolean279 ? 1 : 0) << 10) + ((Static74.aBoolean127 ? 1 : 0) << 8) + ((Static308.aBoolean416 ? 1 : 0) << 6) + ((Static48.aBoolean73 ? 1 : 0) << 3) + (Static190.anInt3986 & 0x7) + ((Static314.aBoolean421 ? 1 : 0) << 4) + ((Static72.aBoolean125 ? 1 : 0) << 5) + ((Static135.aBoolean205 ? 1 : 0) << 9) + ((Static104.aBoolean168 ? 1 : 0) << 15) + (Static42.anInt733 << 17) + ((Static135.anInt2943 == 0 ? 0 : 1) << 20) + ((Static107.anInt2388 == 0 ? 0 : 1) << 22) + (Static333.method5395() << 23) + (Static73.anInt1628 << 25) + ((Static73.aBoolean126 ? 1 : 0) << 27) + (Static232.anInt4637 << 28);
	}

	@OriginalMember(owner = "client!ck", name = "e", descriptor = "(B)V")
	public static void method729() {
		if (!Static45.aBoolean446) {
			return;
		}
		@Pc(17) Class3 local17 = Static134.method2355(Static92.anInt1971, Static306.anInt5658);
		if (local17 != null && local17.anObjectArray28 != null) {
			@Pc(26) Class2_Sub5 local26 = new Class2_Sub5();
			local26.aClass3_4 = local17;
			local26.anObjectArray33 = local17.anObjectArray28;
			Static351.method5589(local26);
		}
		Static45.aBoolean446 = false;
		Static190.anInt3987 = -1;
		Static67.anInt1508 = -1;
		if (local17 != null) {
			Static128.method2229(local17);
		}
	}
}
