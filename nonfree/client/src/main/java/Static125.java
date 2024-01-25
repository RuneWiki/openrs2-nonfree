import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static125 {

	@OriginalMember(owner = "client!fc", name = "p", descriptor = "Ljava/lang/String;")
	public static String aString61 = null;

	@OriginalMember(owner = "client!fc", name = "s", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_59 = new Class239(14, 8);

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(I)V")
	public static void method2365() {
		@Pc(8) Class2_Sub26 local8 = (Class2_Sub26) Static431.aClass249_61.method6527();
		@Pc(27) boolean local27 = Static72.aClass310_4 != null || Static358.anInt6807 > 0;
		if (local27) {
			Static75.anInt1562 = 1;
		}
		if (Static150.aBoolean224 && Static311.aClass189_1.method4710(81) && Static323.anInt6016 > 2) {
			if (local27) {
				Static355.aClass2_Sub44_1 = (Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283.aClass2_283;
			} else {
				Static411.method6445(local8.method6659(), (Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283.aClass2_283, local8.method6660());
			}
		} else if (local27) {
			Static355.aClass2_Sub44_1 = (Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283;
		} else {
			Static411.method6445(local8.method6659(), (Class2_Sub44) Static448.aClass249_63.aClass2_224.aClass2_283, local8.method6660());
		}
	}

	@OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lclient!hca;ZI)V")
	public static void method2369(@OriginalArg(0) Class1_Sub1_Sub2_Sub1 arg0, @OriginalArg(1) boolean arg1) {
		if (Static323.anInt6016 >= 400) {
			return;
		}
		if (arg0 != Static266.aClass1_Sub1_Sub2_Sub1_1) {
			@Pc(179) String local179;
			@Pc(110) int local110;
			if (arg0.anInt3267 == 0) {
				@Pc(65) boolean local65 = true;
				if (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3274 != -1 && arg0.anInt3274 != -1) {
					@Pc(88) int local88 = arg0.anInt3252 < Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252 ? Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252 : arg0.anInt3252;
					@Pc(99) int local99 = arg0.anInt3274 <= Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3274 ? arg0.anInt3274 : Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3274;
					local110 = local88 * 10 / 100 + local99 + 5;
					@Pc(117) int local117 = Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252 - arg0.anInt3252;
					if (local117 < 0) {
						local117 = -local117;
					}
					if (local117 > local110) {
						local65 = false;
					}
				}
				@Pc(140) String local140 = Static533.aClass212_4 == Static185.aClass212_1 ? Static398.aClass202_210.method5139(Static172.anInt6352) : Static133.aClass202_78.method5139(Static172.anInt6352);
				if (arg0.anInt3276 <= arg0.anInt3252) {
					local179 = arg0.method2948() + (local65 ? Static242.method3727(arg0.anInt3252, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252) : "<col=ffffff>") + " (" + local140 + arg0.anInt3252 + ")";
				} else {
					local179 = arg0.method2948() + (local65 ? Static242.method3727(arg0.anInt3252, Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252) : "<col=ffffff>") + " (" + local140 + arg0.anInt3252 + "+" + (arg0.anInt3276 - arg0.anInt3252) + ")";
				}
			} else {
				local179 = arg0.method2948() + " (" + Static179.aClass202_103.method5139(Static172.anInt6352) + arg0.anInt3267 + ")";
			}
			if (Static21.aBoolean31) {
				if (!arg1 && (Static176.anInt3294 & 0x8) != 0) {
					Static111.method2154((long) arg0.anInt5076, -1, 58, 0, true, Static131.aString66, 0, aString61 + " -> <col=ffffff>" + local179, Static472.anInt8248, false);
				}
			} else if (arg1) {
				Static111.method2154(0L, 0, -1, 0, false, "<col=cccccc>" + local179, 0, "", -1, true);
			} else {
				for (@Pc(307) int local307 = 7; local307 >= 0; local307--) {
					if (Static239.aStringArray42[local307] != null) {
						@Pc(315) short local315 = 0;
						if (Static185.aClass212_1 == Static230.aClass212_2 && Static239.aStringArray42[local307].equalsIgnoreCase(Static182.aClass202_106.method5139(Static172.anInt6352))) {
							if (arg0.anInt3252 > Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3252) {
								local315 = 2000;
							}
							if (Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3258 != 0 && arg0.anInt3258 != 0) {
								if (arg0.anInt3258 == Static266.aClass1_Sub1_Sub2_Sub1_1.anInt3258) {
									local315 = 2000;
								} else {
									local315 = 0;
								}
							}
						} else if (Static25.aBooleanArray8[local307]) {
							local315 = 2000;
						}
						@Pc(376) short local376 = (short) (local315 + Static477.aShortArray110[local307]);
						local110 = Static278.anIntArray452[local307] == -1 ? Static145.anInt2686 : Static278.anIntArray452[local307];
						Static111.method2154((long) arg0.anInt5076, -1, local376, 0, true, Static239.aStringArray42[local307], 0, "<col=ffffff>" + local179, local110, false);
					}
				}
			}
			if (!arg1) {
				for (@Pc(427) Class2_Sub44 local427 = (Class2_Sub44) Static448.aClass249_63.method6527(); local427 != null; local427 = (Class2_Sub44) Static448.aClass249_63.method6525()) {
					if (local427.anInt8460 == 19) {
						local427.aString179 = "<col=ffffff>" + local179;
						return;
					}
				}
			}
		} else if (Static21.aBoolean31 && (Static176.anInt3294 & 0x10) != 0) {
			Static111.method2154(0L, -1, 30, 0, true, Static131.aString66, 0, aString61 + " -> <col=ffffff>" + Static465.aClass202_235.method5139(Static172.anInt6352), Static472.anInt8248, false);
		}
	}
}
