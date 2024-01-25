import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static549 {

	@OriginalMember(owner = "client!sp", name = "h", descriptor = "Lclient!pq;")
	public static final Class283 aClass283_1 = Static671.method9248();

	@OriginalMember(owner = "client!sp", name = "k", descriptor = "Lclient!vha;")
	public static final Class370 aClass370_16 = new Class370(9, 7);

	@OriginalMember(owner = "client!sp", name = "n", descriptor = "Lclient!wia;")
	public static Class387 aClass387_101 = new Class387(37, -1);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "Lclient!qha;")
	public static Class291 aClass291_37 = new Class291(8);

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(IZLclient!nw;)V")
	public static void method7980(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class8_Sub1_Sub3_Sub2_Sub2 arg2) {
		if (Static481.anInt8130 >= 400) {
			return;
		}
		if (arg0 > -122) {
			aClass387_101 = null;
		}
		@Pc(22) Class227 local22 = arg2.aClass227_1;
		@Pc(25) String local25 = arg2.aString93;
		if (local22.anIntArray341 != null) {
			local22 = local22.method5322(Static413.aClass118_1);
			if (local22 == null) {
				return;
			}
			local25 = local22.aString79;
		}
		if (!local22.aBoolean462) {
			return;
		}
		if (arg2.anInt7069 != 0) {
			@Pc(67) String local67 = Static256.aClass333_3 == Static521.aClass333_6 ? Static582.aClass335_31.method8349(Static323.anInt5795) : Static582.aClass335_29.method8349(Static323.anInt5795);
			local25 = local25 + Static464.method6792(arg2.anInt7069, Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4205) + " (" + local67 + arg2.anInt7069 + ")";
		}
		if (Static199.aBoolean706 && !arg1) {
			@Pc(111) Class152 local111 = Static187.anInt3082 == -1 ? null : Static4.aClass355_1.method8693(Static187.anInt3082);
			if ((Static382.anInt9821 & 0x2) != 0 && (local111 == null || local22.method5323(Static187.anInt3082, local111.anInt3373) != local111.anInt3373)) {
				Static152.method2122(0, (long) arg2.anInt6994, false, (long) arg2.anInt6994, Static211.aString54, 0, false, Static352.aString75 + " -> <col=ffff00>" + local25, Static586.anInt9800, 10, true, -1);
			}
		}
		if (!arg1) {
			@Pc(173) String[] local173 = local22.aStringArray42;
			if (Static502.aBoolean643) {
				local173 = Static452.method6464(local173);
			}
			@Pc(183) int local183;
			if (local173 != null) {
				for (local183 = 4; local183 >= 0; local183--) {
					if (local173[local183] != null && (local22.aByte86 == 0 || !local173[local183].equalsIgnoreCase(Static582.aClass335_24.method8349(Static323.anInt5795)))) {
						@Pc(209) byte local209 = 0;
						if (local183 == 0) {
							local209 = 48;
						}
						@Pc(218) int local218 = Static640.anInt10423;
						if (local183 == 1) {
							local209 = 5;
						}
						if (local183 == 2) {
							local209 = 21;
						}
						if (local183 == 3) {
							local209 = 50;
						}
						if (local183 == local22.anInt6243) {
							local218 = local22.anInt6263;
						}
						if (local183 == 4) {
							local209 = 60;
						}
						if (local22.anInt6237 == local183) {
							local218 = local22.anInt6229;
						}
						Static152.method2122(0, (long) arg2.anInt6994, false, (long) arg2.anInt6994, local173[local183], 0, false, "<col=ffff00>" + local25, local173[local183].equalsIgnoreCase(Static582.aClass335_24.method8349(Static323.anInt5795)) ? local22.anInt6266 : local218, local209, true, -1);
					}
				}
			}
			if (local22.aByte86 == 1 && local173 != null) {
				for (local183 = 4; local183 >= 0; local183--) {
					if (local173[local183] != null && local173[local183].equalsIgnoreCase(Static582.aClass335_24.method8349(Static323.anInt5795))) {
						@Pc(344) short local344 = 0;
						if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1.anInt4205 < arg2.anInt7069) {
							local344 = 2000;
						}
						@Pc(353) short local353 = 0;
						if (local183 == 0) {
							local353 = 48;
						}
						if (local183 == 1) {
							local353 = 5;
						}
						if (local183 == 2) {
							local353 = 21;
						}
						if (local183 == 3) {
							local353 = 50;
						}
						if (local183 == 4) {
							local353 = 60;
						}
						if (local353 != 0) {
							local353 += local344;
						}
						Static152.method2122(0, (long) arg2.anInt6994, false, (long) arg2.anInt6994, local173[local183], 0, false, "<col=ffff00>" + local25, local22.anInt6266, local353, true, -1);
					}
				}
			}
		}
		Static152.method2122(0, (long) arg2.anInt6994, arg1, (long) arg2.anInt6994, Static582.aClass335_23.method8349(Static323.anInt5795), 0, false, "<col=ffff00>" + local25, Static571.anInt9569, 1007, true, -1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(BILclient!ec;)V")
	public static void method7982(@OriginalArg(1) int arg0, @OriginalArg(2) Class8_Sub1_Sub3_Sub2 arg1) {
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		if (arg1.anInt7032 > Static44.anInt740) {
			Static208.method7695(arg1);
		} else if (Static44.anInt740 <= arg1.anInt7037) {
			Static77.method9183(arg1);
		} else {
			Static412.method6982(arg1, false);
			local9 = Static202.anInt3288;
			local7 = Static317.anInt5609;
		}
		@Pc(134) int local134;
		if (arg1.anInt10355 < 512 || arg1.anInt10363 < 512 || arg1.anInt10355 >= (Static544.anInt9261 - 1) * 512 || arg1.anInt10363 >= Static282.anInt4887 * 512 - 512) {
			arg1.anInt7037 = 0;
			local9 = 0;
			local7 = -1;
			arg1.anInt7032 = 0;
			arg1.anIntArray412 = null;
			arg1.anInt7023 = -1;
			arg1.anInt10355 = arg1.anIntArray414[0] * 512 + arg1.method5993() * 256;
			arg1.anInt10363 = arg1.anIntArray415[0] * 512 + arg1.method5993() * 256;
			arg1.method5984();
			for (local134 = 0; local134 < arg1.aClass150Array3.length; local134++) {
				arg1.aClass150Array3[local134].anInt3303 = -1;
			}
		}
		if (Static68.aClass8_Sub1_Sub3_Sub2_Sub1_1 == arg1 && (arg1.anInt10355 < 6144 || arg1.anInt10363 < 6144 || arg1.anInt10355 >= Static544.anInt9261 * 512 - 6144 || (Static282.anInt4887 - 12) * 512 <= arg1.anInt10363)) {
			arg1.anInt7032 = 0;
			arg1.anInt7037 = 0;
			arg1.anInt7023 = -1;
			local7 = -1;
			local9 = 0;
			arg1.anIntArray412 = null;
			arg1.anInt10355 = arg1.anIntArray414[0] * 512 + arg1.method5993() * 256;
			arg1.anInt10363 = arg1.anIntArray415[0] * 512 + arg1.method5993() * 256;
			arg1.method5984();
			for (local134 = 0; local134 < arg1.aClass150Array3.length; local134++) {
				arg1.aClass150Array3[local134].anInt3303 = -1;
			}
		}
		local134 = Static543.method7945(arg1);
		Static514.method7496(arg1);
		Static90.method1351(local9, local134, local7, arg1);
		Static28.method7935(arg1, local7);
		Static404.method5927(arg1);
	}

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(ZLclient!ib;)Lclient!oca;")
	public static Class125_Sub2 method7983(@OriginalArg(1) Class5_Sub23 arg0) {
		return new Class125_Sub2(arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8516(), arg0.method8510(), arg0.method8529());
	}
}
