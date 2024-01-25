import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static582 {

	@OriginalMember(owner = "client!wh", name = "O", descriptor = "[[I")
	public static int[][] anIntArrayArray69;

	@OriginalMember(owner = "client!wh", name = "J", descriptor = "I")
	public static int anInt9503 = -1;

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "(I)I")
	public static int method7906() {
		if (Static167.aBoolean291) {
			return 6;
		} else if (Static542.aClass2_Sub5_3 == null) {
			return 0;
		} else {
			@Pc(14) int local14 = Static542.aClass2_Sub5_3.anInt902;
			if (Static42.method711(local14)) {
				return 1;
			} else if (Static370.method5499(local14)) {
				return 2;
			} else if (Static205.method3315(local14)) {
				return 3;
			} else if (Static489.method6854(local14)) {
				return 4;
			} else {
				return 5;
			}
		}
	}

	@OriginalMember(owner = "client!wh", name = "b", descriptor = "(III)Lclient!wr;")
	public static Class6_Sub1_Sub4 method7907(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class346 local7 = Static389.aClass346ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class6_Sub1_Sub4 local14 = local7.aClass6_Sub1_Sub4_1;
			local7.aClass6_Sub1_Sub4_1 = null;
			Static451.method310(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!wh", name = "d", descriptor = "(B)V")
	public static void method7908() {
		if (Static181.method3117(Static201.anInt3963) || Static407.method5922(Static201.anInt3963)) {
			Static500.method6985(Static90.anInt1932 >> 12, Static7.anInt337 >> 12, 5000);
		} else {
			@Pc(39) int local39 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray510[0] >> 3;
			@Pc(46) int local46 = Static545.aClass6_Sub1_Sub1_Sub1_Sub2_2.anIntArray509[0] >> 3;
			if (local39 >= 0 && Static188.anInt3850 >> 3 > local39 && local46 >= 0 && Static49.anInt1174 >> 3 > local46) {
				Static500.method6985(local39, local46, 5000);
			} else {
				Static500.method6985(Static188.anInt3850 >> 4, Static49.anInt1174 >> 4, 0);
			}
		}
		Static508.method7047();
		Static21.method419();
		Static135.method2301();
		Static217.method3482();
	}
}
