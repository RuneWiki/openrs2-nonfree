import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static327 {

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "I")
	public static int anInt6264;

	@OriginalMember(owner = "client!nh", name = "s", descriptor = "Lclient!raa;")
	public static final Class253 aClass253_10 = new Class253("LIVE", 0);

	@OriginalMember(owner = "client!nh", name = "db", descriptor = "I")
	public static int anInt6263 = 0;

	@OriginalMember(owner = "client!nh", name = "eb", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_100 = new Class67("You can't add yourself to your own ignore list.", "Du kannst dich nicht auf deine eigene Ignorieren-Liste setzen!", "Vous ne pouvez pas ajouter votre nom à votre liste noire.", "Você não pode adicionar a si próprio à sua lista de ignorados.");

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(I)V")
	public static void method5219() {
		@Pc(8) Class3_Sub19 local8 = (Class3_Sub19) Static71.aClass71_16.method2089();
		@Pc(16) boolean local16 = Static166.aClass245_12 != null || Static523.anInt9115 > 0;
		if (local16) {
			Static176.anInt4102 = 1;
		}
		if (Static37.aBoolean72 && Static364.aClass101_1.method2589(81) && Static179.anInt4933 > 2) {
			if (local16) {
				Static399.aClass3_Sub11_5 = (Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283.aClass3_283;
			} else {
				Static309.method174(local8.method4956(), local8.method4957(), (Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283.aClass3_283);
			}
		} else if (local16) {
			Static399.aClass3_Sub11_5 = (Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283;
		} else {
			Static309.method174(local8.method4956(), local8.method4957(), (Class3_Sub11) Static255.aClass71_43.aClass3_73.aClass3_283);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IJ)V")
	public static void method5231(@OriginalArg(1) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Static184.method3487(arg0 - 1L);
			Static184.method3487(1L);
		} else {
			Static184.method3487(arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(ILclient!tt;Z)V")
	public static void method5232(@OriginalArg(1) Class6_Sub1_Sub2_Sub2 arg0, @OriginalArg(2) boolean arg1) {
		if (Static179.anInt4933 >= 400) {
			return;
		}
		@Pc(12) Class230 local12 = arg0.aClass230_1;
		if (local12.anIntArray627 != null) {
			local12 = local12.method5898(Static127.aClass215_1);
			if (local12 == null) {
				return;
			}
		}
		if (!local12.aBoolean452) {
			return;
		}
		@Pc(32) String local32 = local12.aString50;
		if (local12.anInt7030 != 0) {
			@Pc(48) String local48 = Static332.aClass44_4 == Static222.aClass44_2 ? Static98.aClass67_30.method1934(Static193.anInt7803) : Static464.aClass67_137.method1934(Static193.anInt7803);
			local32 = local32 + Static275.method4763(Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302, local12.anInt7030) + " (" + local48 + local12.anInt7030 + ")";
		}
		if (Static506.aBoolean659 && !arg1) {
			@Pc(85) Class244 local85 = Static262.anInt5489 == -1 ? null : Static37.aClass121_1.method3431(Static262.anInt5489);
			if ((Static170.anInt3907 & 0x2) != 0 && (local85 == null || local12.method5889(Static262.anInt5489, local85.anInt7213) != local85.anInt7213)) {
				Static507.method7642(true, Static117.aString29 + " -> <col=ffff00>" + local32, -1, Static88.aString19, Static46.anInt1080, 0, 0, false, 2, (long) arg0.anInt8587);
			}
		}
		if (!arg1) {
			@Pc(136) String[] local136 = local12.aStringArray42;
			if (Static73.aBoolean689) {
				local136 = Static468.method6984(local136);
			}
			@Pc(146) int local146;
			if (local136 != null) {
				for (local146 = 4; local146 >= 0; local146--) {
					if (local136[local146] != null && (local12.aByte63 == 0 || !local136[local146].equalsIgnoreCase(Static298.aClass67_152.method1934(Static193.anInt7803)))) {
						@Pc(166) byte local166 = 0;
						@Pc(168) int local168 = Static182.anInt4203;
						if (local146 == 0) {
							local166 = 4;
						}
						if (local146 == 1) {
							local166 = 47;
						}
						if (local146 == 2) {
							local166 = 57;
						}
						if (local146 == 3) {
							local166 = 18;
						}
						if (local12.anInt7059 == local146) {
							local168 = local12.anInt7032;
						}
						if (local146 == 4) {
							local166 = 19;
						}
						if (local146 == local12.lb) {
							local168 = local12.anInt7046;
						}
						Static507.method7642(true, "<col=ffff00>" + local32, -1, local136[local146], local136[local146].equalsIgnoreCase(Static298.aClass67_152.method1934(Static193.anInt7803)) ? local12.anInt7048 : local168, 0, 0, false, local166, (long) arg0.anInt8587);
					}
				}
			}
			if (local12.aByte63 == 1 && local136 != null) {
				for (local146 = 4; local146 >= 0; local146--) {
					if (local136[local146] != null && local136[local146].equalsIgnoreCase(Static298.aClass67_152.method1934(Static193.anInt7803))) {
						@Pc(284) short local284 = 0;
						if (Static111.aClass6_Sub1_Sub2_Sub1_3.anInt2302 < local12.anInt7030) {
							local284 = 2000;
						}
						@Pc(293) short local293 = 0;
						if (local146 == 0) {
							local293 = 4;
						}
						if (local146 == 1) {
							local293 = 47;
						}
						if (local146 == 2) {
							local293 = 57;
						}
						if (local146 == 3) {
							local293 = 18;
						}
						if (local146 == 4) {
							local293 = 19;
						}
						if (local293 != 0) {
							local293 += local284;
						}
						Static507.method7642(true, "<col=ffff00>" + local32, -1, local136[local146], local12.anInt7048, 0, 0, false, local293, (long) arg0.anInt8587);
					}
				}
			}
		}
		Static507.method7642(true, "<col=ffff00>" + local32, -1, Static64.aClass67_19.method1934(Static193.anInt7803), Static325.anInt6214, 0, 0, arg1, 1006, (long) arg0.anInt8587);
	}
}
