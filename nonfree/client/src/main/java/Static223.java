import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static223 {

	@OriginalMember(owner = "client!la", name = "b", descriptor = "Lclient!fo;")
	public static Class82 aClass82_80;

	@OriginalMember(owner = "client!la", name = "y", descriptor = "I")
	public static int anInt5857;

	@OriginalMember(owner = "client!la", name = "e", descriptor = "I")
	public static int anInt5841 = 0;

	@OriginalMember(owner = "client!la", name = "s", descriptor = "Lclient!jc;")
	public static final Class119 aClass119_137 = new Class119("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

	@OriginalMember(owner = "client!la", name = "w", descriptor = "Lclient!wq;")
	public static final Class269 aClass269_44 = new Class269(8, 4);

	@OriginalMember(owner = "client!la", name = "z", descriptor = "S")
	public static short aShort105 = 1;

	@OriginalMember(owner = "client!la", name = "B", descriptor = "Z")
	public static boolean aBoolean668 = false;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(BLclient!lr;Z)V")
	public static void method4577(@OriginalArg(1) Class25_Sub5_Sub1_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static118.anInt2201 >= 400) {
			return;
		}
		if (Static447.aClass25_Sub5_Sub1_Sub2_4 != arg0) {
			@Pc(187) String local187;
			@Pc(111) int local111;
			if (arg0.anInt4356 == 0) {
				@Pc(65) boolean local65 = true;
				if (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4338 != -1 && arg0.anInt4338 != -1) {
					@Pc(89) int local89 = arg0.anInt4324 >= Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324 ? arg0.anInt4324 : Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324;
					@Pc(100) int local100 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4338 >= arg0.anInt4338 ? arg0.anInt4338 : Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4338;
					local111 = local100 + local89 * 10 / 100 + 5;
					@Pc(118) int local118 = Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324 - arg0.anInt4324;
					if (local118 < 0) {
						local118 = -local118;
					}
					if (local111 < local118) {
						local65 = false;
					}
				}
				@Pc(148) String local148 = Static183.aClass48_3 == Static82.aClass48_7 ? Static58.aClass119_32.method2673(Static394.anInt6582) : Static91.aClass119_45.method2673(Static394.anInt6582);
				if (arg0.anInt4324 >= arg0.anInt4337) {
					local187 = arg0.method3447() + (local65 ? Static225.method3258(arg0.anInt4324, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324) : "<col=ffffff>") + " (" + local148 + arg0.anInt4324 + ")";
				} else {
					local187 = arg0.method3447() + (local65 ? Static225.method3258(arg0.anInt4324, Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324) : "<col=ffffff>") + " (" + local148 + arg0.anInt4324 + "+" + (arg0.anInt4337 - arg0.anInt4324) + ")";
				}
			} else {
				local187 = arg0.method3447() + " (" + Static357.aClass119_152.method2673(Static394.anInt6582) + arg0.anInt4356 + ")";
			}
			if (Static433.aBoolean798) {
				if (!arg1 && (Static122.anInt2253 & 0x8) != 0) {
					Static382.method5588(-1, 0, 25, Static337.aString67, Static15.aString1 + " -> <col=ffffff>" + local187, 0, Static10.anInt181, (long) arg0.anInt4284, true, false);
				}
			} else if (arg1) {
				Static382.method5588(0, 0, -1, "<col=cccccc>" + local187, "", 0, -1, 0L, false, true);
			} else {
				for (@Pc(278) int local278 = 7; local278 >= 0; local278--) {
					if (Static251.aStringArray25[local278] != null) {
						@Pc(286) short local286 = 0;
						if (Static183.aClass48_3 == Static191.aClass48_4 && Static251.aStringArray25[local278].equalsIgnoreCase(Static376.aClass119_155.method2673(Static394.anInt6582))) {
							if (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4324 < arg0.anInt4324) {
								local286 = 2000;
							}
							if (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4336 != 0 && arg0.anInt4336 != 0) {
								if (Static447.aClass25_Sub5_Sub1_Sub2_4.anInt4336 == arg0.anInt4336) {
									local286 = 2000;
								} else {
									local286 = 0;
								}
							}
						} else if (Static187.aBooleanArray10[local278]) {
							local286 = 2000;
						}
						@Pc(341) short local341 = (short) (local286 + Static368.aShortArray100[local278]);
						local111 = Static354.anIntArray416[local278] == -1 ? Static423.anInt6430 : Static354.anIntArray416[local278];
						Static382.method5588(-1, 0, local341, Static251.aStringArray25[local278], "<col=ffffff>" + local187, 0, local111, (long) arg0.anInt4284, true, false);
					}
				}
			}
			if (!arg1) {
				for (@Pc(426) Class1_Sub19 local426 = (Class1_Sub19) Static202.aClass227_21.method4967(); local426 != null; local426 = (Class1_Sub19) Static202.aClass227_21.method4973()) {
					if (local426.anInt2416 == 5) {
						local426.aString31 = "<col=ffffff>" + local187;
						return;
					}
				}
			}
		} else if (Static433.aBoolean798 && (Static122.anInt2253 & 0x10) != 0) {
			Static382.method5588(-1, 0, 57, Static337.aString67, Static15.aString1 + " -> <col=ffffff>" + Static343.aClass119_139.method2673(Static394.anInt6582), 0, Static10.anInt181, 0L, true, false);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(JZ)V")
	public static void method4582(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static344.method4690(arg0 - 1L);
			Static344.method4690(1L);
		} else {
			Static344.method4690(arg0);
		}
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(Z)Lclient!ql;")
	public static Class1_Sub36 method4588() {
		if (Static167.aClass227_15 == null || Static88.aClass149_1 == null) {
			return null;
		}
		for (@Pc(16) Class1_Sub36 local16 = (Class1_Sub36) Static88.aClass149_1.method3484(); local16 != null; local16 = (Class1_Sub36) Static88.aClass149_1.method3484()) {
			@Pc(24) Class205 local24 = Static167.aClass178_2.method3963(local16.anInt5632);
			if (local24 != null && local24.aBoolean655 && local24.method4516(Static167.anInterface9_2)) {
				return local16;
			}
		}
		return null;
	}
}
