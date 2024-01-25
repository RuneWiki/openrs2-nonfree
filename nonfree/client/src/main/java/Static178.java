import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static178 {

	@OriginalMember(owner = "client!is", name = "j", descriptor = "I")
	public static int anInt7772;

	@OriginalMember(owner = "client!is", name = "f", descriptor = "[I")
	public static final int[] anIntArray542 = new int[2048];

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(I)V")
	public static void method6350() {
		for (@Pc(10) Class6_Sub40 local10 = (Class6_Sub40) Static292.aClass244_25.method5976(); local10 != null; local10 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
			if (Static273.method4126(local10.anInt6722)) {
				Static390.method5724(local10);
			}
		}
		if (Static151.anInt3129 == 1) {
			Static250.aBoolean294 = false;
			Static401.method5934(Static382.anInt4224, Static187.anInt3647, Static200.anInt3772, Static230.anInt4199);
			return;
		}
		Static401.method5934(Static382.anInt4224, Static187.anInt3647, Static200.anInt3772, Static230.anInt4199);
		@Pc(52) int local52 = Static237.aClass166_8.method3892(Static214.aClass267_55.method6581(Static161.anInt3239));
		for (@Pc(57) Class6_Sub40 local57 = (Class6_Sub40) Static292.aClass244_25.method5976(); local57 != null; local57 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
			@Pc(63) int local63 = Static41.method958(local57);
			if (local63 > local52) {
				local52 = local63;
			}
		}
		Static382.anInt4224 = local52 + 8;
		Static230.anInt4199 = Static151.anInt3129 * 16 + (Static215.aBoolean261 ? 26 : 22);
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ILclient!jg;)V")
	public static void method6351(@OriginalArg(1) Class57_Sub3 arg0) {
		arg0.aClass3_Sub2_Sub1_1 = null;
		if (Static155.anInt3189 < 20) {
			Static314.aClass111_5.method2696(arg0);
			Static155.anInt3189++;
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(BLclient!so;Z)V")
	public static void method6352(@OriginalArg(1) Class3_Sub2_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static151.anInt3129 >= 400) {
			return;
		}
		if (arg0 != Static302.aClass3_Sub2_Sub1_Sub2_2) {
			@Pc(183) String local183;
			@Pc(111) int local111;
			if (arg0.anInt6638 == 0) {
				@Pc(62) boolean local62 = true;
				if (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6618 != -1 && arg0.anInt6618 != -1) {
					@Pc(85) int local85 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631 <= arg0.anInt6631 ? arg0.anInt6631 : Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631;
					@Pc(100) int local100 = arg0.anInt6618 <= Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6618 ? arg0.anInt6618 : Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6618;
					local111 = local100 + local85 * 10 / 100 + 5;
					@Pc(118) int local118 = Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631 - arg0.anInt6631;
					if (local118 < 0) {
						local118 = -local118;
					}
					if (local118 > local111) {
						local62 = false;
					}
				}
				@Pc(144) String local144 = Static24.aClass36_2 == Static4.aClass36_5 ? Static437.aClass267_106.method6581(Static161.anInt3239) : Static121.aClass267_38.method6581(Static161.anInt3239);
				if (arg0.anInt6642 <= arg0.anInt6631) {
					local183 = arg0.method5536() + (local62 ? Static41.method959(Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631, arg0.anInt6631) : "<col=ffffff>") + " (" + local144 + arg0.anInt6631 + ")";
				} else {
					local183 = arg0.method5536() + (local62 ? Static41.method959(Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631, arg0.anInt6631) : "<col=ffffff>") + " (" + local144 + arg0.anInt6631 + "+" + (arg0.anInt6642 - arg0.anInt6631) + ")";
				}
			} else {
				local183 = arg0.method5536() + " (" + Static407.aClass267_100.method6581(Static161.anInt3239) + arg0.anInt6638 + ")";
			}
			if (Static174.aBoolean224) {
				if (!arg1 && (Static405.anInt7261 & 0x8) != 0) {
					Static114.method4751(true, (long) arg0.anInt6602, 5, Static104.aString16, 0, -1, Static289.aString36 + " -> <col=ffffff>" + local183, 0, false, Static67.anInt1750);
				}
			} else if (arg1) {
				Static114.method4751(false, 0L, -1, "<col=cccccc>" + local183, 0, 0, "", 0, true, -1);
			} else {
				for (@Pc(274) int local274 = 7; local274 >= 0; local274--) {
					if (Static438.aStringArray51[local274] != null) {
						@Pc(282) short local282 = 0;
						if (Static87.aClass36_3 == Static4.aClass36_5 && Static438.aStringArray51[local274].equalsIgnoreCase(Static119.aClass267_93.method6581(Static161.anInt3239))) {
							if (arg0.anInt6631 > Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6631) {
								local282 = 2000;
							}
							if (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6644 != 0 && arg0.anInt6644 != 0) {
								if (Static302.aClass3_Sub2_Sub1_Sub2_2.anInt6644 == arg0.anInt6644) {
									local282 = 2000;
								} else {
									local282 = 0;
								}
							}
						} else if (Static42.aBooleanArray3[local274]) {
							local282 = 2000;
						}
						@Pc(347) short local347 = (short) (Static230.aShortArray53[local274] + local282);
						local111 = Static237.anIntArray310[local274] == -1 ? Static256.anInt4669 : Static237.anIntArray310[local274];
						Static114.method4751(true, (long) arg0.anInt6602, local347, Static438.aStringArray51[local274], 0, -1, "<col=ffffff>" + local183, 0, false, local111);
					}
				}
			}
			if (!arg1) {
				for (@Pc(433) Class6_Sub40 local433 = (Class6_Sub40) Static292.aClass244_25.method5976(); local433 != null; local433 = (Class6_Sub40) Static292.aClass244_25.method5964()) {
					if (local433.anInt6722 == 58) {
						local433.aString55 = "<col=ffffff>" + local183;
						return;
					}
				}
			}
		} else if (Static174.aBoolean224 && (Static405.anInt7261 & 0x10) != 0) {
			Static114.method4751(true, 0L, 22, Static104.aString16, 0, -1, Static289.aString36 + " -> <col=ffffff>" + Static304.aClass267_70.method6581(Static161.anInt3239), 0, false, Static67.anInt1750);
		}
	}

	@OriginalMember(owner = "client!is", name = "a", descriptor = "(ZII)Z")
	public static boolean method6354(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static55.method1240(arg0, arg1) | (arg1 & 0x70000) != 0 || Static193.method3053(arg1, arg0);
	}
}
