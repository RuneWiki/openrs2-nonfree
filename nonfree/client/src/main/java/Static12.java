import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static12 {

	@OriginalMember(owner = "client!bd", name = "r", descriptor = "Lclient!ef;")
	public static Class29 aClass29_1;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!bd", name = "u", descriptor = "Lclient!ke;")
	public static Class52 aClass52_2;

	@OriginalMember(owner = "client!bd", name = "j", descriptor = "Lclient!oc;")
	private static final Class70 aClass70_131 = Static193.method3027("Please wait)3)3)3");

	@OriginalMember(owner = "client!bd", name = "k", descriptor = "Lclient!oc;")
	public static Class70 aClass70_132 = aClass70_131;

	@OriginalMember(owner = "client!bd", name = "m", descriptor = "Lclient!oc;")
	public static final Class70 aClass70_133 = Static193.method3027("Lade Titelbild )2 ");

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)Lclient!he;")
	public static Class3_Sub3_Sub14 method259(@OriginalArg(0) int arg0) {
		@Pc(10) Class3_Sub3_Sub14 local10 = (Class3_Sub3_Sub14) Static67.aClass85_31.method2558((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static9.aClass52_1.method1581(3, arg0);
		local10 = new Class3_Sub3_Sub14();
		if (local20 != null) {
			local10.method1120(new Class3_Sub4(local20));
		}
		Static67.aClass85_31.method2560(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(B)V")
	public static void method260() {
		@Pc(3) boolean local3 = true;
		Static32.method575(false);
		Static6.anInt117 = 0;
		for (@Pc(14) int local14 = 0; local14 < Static212.aByteArrayArray11.length; local14++) {
			if (Static159.anIntArray242[local14] != -1 && Static212.aByteArrayArray11[local14] == null) {
				Static212.aByteArrayArray11[local14] = Static92.aClass52_Sub1_14.method1581(Static159.anIntArray242[local14], 0);
				if (Static212.aByteArrayArray11[local14] == null) {
					local3 = false;
					Static6.anInt117++;
				}
			}
			if (Static150.anIntArray224[local14] != -1 && Static141.aByteArrayArray4[local14] == null) {
				Static141.aByteArrayArray4[local14] = Static92.aClass52_Sub1_14.method1556(Static160.anIntArrayArray25[local14], Static150.anIntArray224[local14], 0);
				if (Static141.aByteArrayArray4[local14] == null) {
					Static6.anInt117++;
					local3 = false;
				}
			}
		}
		if (!local3) {
			Static186.anInt3809 = 1;
			return;
		}
		local3 = true;
		Static58.anInt1270 = 0;
		@Pc(120) int local120;
		@Pc(131) int local131;
		for (@Pc(101) int local101 = 0; local101 < Static212.aByteArrayArray11.length; local101++) {
			@Pc(107) byte[] local107 = Static141.aByteArrayArray4[local101];
			if (local107 != null) {
				local120 = (Static82.anIntArray86[local101] >> 8) * 64 - Static30.anInt695;
				local131 = (Static82.anIntArray86[local101] & 0xFF) * 64 - Static55.anInt1184;
				if (Static31.aBoolean41) {
					local131 = 10;
					local120 = 10;
				}
				local3 &= Static49.method764(local120, local107, local131);
			}
		}
		if (!local3) {
			Static186.anInt3809 = 2;
			return;
		}
		if (Static186.anInt3809 != 0) {
			Static60.method2392(true, Static207.method3296(new Class70[] { Static92.aClass70_953, Static69.aClass70_657 }));
		}
		Static48.method3330();
		Static46.method744();
		Static48.method3330();
		Static61.method944();
		Static48.method3330();
		System.gc();
		for (@Pc(190) int local190 = 0; local190 < 4; local190++) {
			Static28.aClass77Array1[local190].method2164();
		}
		@Pc(213) int local213;
		for (local120 = 0; local120 < 4; local120++) {
			for (local131 = 0; local131 < 104; local131++) {
				for (local213 = 0; local213 < 104; local213++) {
					Static17.aByteArrayArrayArray2[local120][local131][local213] = 0;
				}
			}
		}
		Static48.method3330();
		Static74.method1056();
		local131 = Static212.aByteArrayArray11.length;
		Static199.method3156();
		Static32.method575(true);
		@Pc(274) int local274;
		@Pc(264) int local264;
		@Pc(345) int local345;
		@Pc(330) int local330;
		@Pc(397) int local397;
		if (!Static31.aBoolean41) {
			@Pc(278) byte[] local278;
			for (local213 = 0; local213 < local131; local213++) {
				local264 = (Static82.anIntArray86[local213] & 0xFF) * 64 - Static55.anInt1184;
				local274 = (Static82.anIntArray86[local213] >> 8) * 64 - Static30.anInt695;
				local278 = Static212.aByteArrayArray11[local213];
				if (local278 != null) {
					Static48.method3330();
					Static37.method2339(local264, (Static191.anInt3881 - 6) * 8, Static37.anInt3233 * 8 - 48, local274, Static28.aClass77Array1, local278);
				}
			}
			for (local274 = 0; local274 < local131; local274++) {
				local264 = (Static82.anIntArray86[local274] >> 8) * 64 - Static30.anInt695;
				local330 = (Static82.anIntArray86[local274] & 0xFF) * 64 - Static55.anInt1184;
				@Pc(334) byte[] local334 = Static212.aByteArrayArray11[local274];
				if (local334 == null && Static37.anInt3233 < 800) {
					Static48.method3330();
					for (local345 = 0; local345 < 4; local345++) {
						Static200.method3181(local330, 64, local345, local264, 64);
					}
				}
			}
			Static32.method575(true);
			for (local264 = 0; local264 < local131; local264++) {
				local278 = Static141.aByteArrayArray4[local264];
				if (local278 != null) {
					local345 = (Static82.anIntArray86[local264] & 0xFF) * 64 - Static55.anInt1184;
					local397 = (Static82.anIntArray86[local264] >> 8) * 64 - Static30.anInt695;
					Static48.method3330();
					Static113.method1639(local397, local345, local278, Static28.aClass77Array1);
				}
			}
		}
		@Pc(449) int local449;
		@Pc(455) int local455;
		if (Static31.aBoolean41) {
			@Pc(467) int local467;
			@Pc(477) int local477;
			@Pc(479) int local479;
			for (local213 = 0; local213 < 4; local213++) {
				Static48.method3330();
				for (local274 = 0; local274 < 13; local274++) {
					for (local264 = 0; local264 < 13; local264++) {
						@Pc(431) boolean local431 = false;
						local397 = Static95.anIntArrayArrayArray8[local213][local274][local264];
						if (local397 != -1) {
							local449 = local397 >> 1 & 0x3;
							local455 = local397 >> 14 & 0x3FF;
							local345 = local397 >> 24 & 0x3;
							local467 = local397 >> 3 & 0x7FF;
							local477 = (local455 / 8 << 8) + local467 / 8;
							for (local479 = 0; local479 < Static82.anIntArray86.length; local479++) {
								if (local477 == Static82.anIntArray86[local479] && Static212.aByteArrayArray11[local479] != null) {
									local431 = true;
									Static114.method1650(local449, (local455 & 0x7) * 8, local345, local264 * 8, local274 * 8, Static212.aByteArrayArray11[local479], local213, (local467 & 0x7) * 8, Static28.aClass77Array1);
									break;
								}
							}
						}
						if (!local431) {
							Static200.method3181(local264 * 8, 8, local213, local274 * 8, 8);
						}
					}
				}
			}
			Static32.method575(true);
			for (local274 = 0; local274 < 4; local274++) {
				Static48.method3330();
				for (local264 = 0; local264 < 13; local264++) {
					for (local330 = 0; local330 < 13; local330++) {
						local397 = Static95.anIntArrayArrayArray8[local274][local264][local330];
						if (local397 != -1) {
							local345 = local397 >> 24 & 0x3;
							local449 = local397 >> 1 & 0x3;
							local455 = local397 >> 14 & 0x3FF;
							local467 = local397 >> 3 & 0x7FF;
							local477 = (local455 / 8 << 8) + (local467 / 8);
							for (local479 = 0; local479 < Static82.anIntArray86.length; local479++) {
								if (Static82.anIntArray86[local479] == local477 && Static141.aByteArrayArray4[local479] != null) {
									Static138.method1980((local467 & 0x7) * 8, local345, Static141.aByteArrayArray4[local479], local264 * 8, local274, local449, Static28.aClass77Array1, (local455 & 0x7) * 8, local330 * 8);
									break;
								}
							}
						}
					}
				}
			}
		}
		Static32.method575(true);
		Static46.method744();
		Static48.method3330();
		Static166.method2463(Static28.aClass77Array1);
		Static32.method575(true);
		local213 = Static160.anInt3303;
		if (local213 > Static137.anInt2795) {
			local213 = Static137.anInt2795;
		}
		if (local213 < Static137.anInt2795 - 1) {
		}
		if (Static50.aBoolean66) {
			Static2.method8(Static160.anInt3303);
		} else {
			Static2.method8(0);
		}
		for (local274 = 0; local274 < 104; local274++) {
			for (local264 = 0; local264 < 104; local264++) {
				Static126.method1759(local274, local264);
			}
		}
		Static48.method3330();
		Static212.method3338();
		Static46.method744();
		if (Static88.aFrame1 != null) {
			Static93.aClass3_Sub4_Sub1_18.method1298(188);
			Static93.aClass3_Sub4_Sub1_18.method1285(1057001181);
		}
		if (!Static31.aBoolean41) {
			local330 = (Static191.anInt3881 + 6) / 8;
			local397 = (Static37.anInt3233 - 6) / 8;
			local345 = (Static37.anInt3233 + 6) / 8;
			local264 = (Static191.anInt3881 - 6) / 8;
			for (local449 = local264 - 1; local449 <= local330 + 1; local449++) {
				for (local455 = local397 - 1; local455 <= local345 + 1; local455++) {
					if (local264 > local449 || local449 > local330 || local397 > local455 || local455 > local345) {
						Static92.aClass52_Sub1_14.method1567(Static207.method3296(new Class70[] { Static190.aClass70_1888, Static107.method2404(local449), Static33.aClass70_325, Static107.method2404(local455) }));
						Static92.aClass52_Sub1_14.method1567(Static207.method3296(new Class70[] { Static35.aClass70_365, Static107.method2404(local449), Static33.aClass70_325, Static107.method2404(local455) }));
					}
				}
			}
		}
		Static29.method515(30);
		Static48.method3330();
		Static57.method903();
		Static93.aClass3_Sub4_Sub1_18.method1298(199);
		Static57.method906();
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(III[B)Lclient!oc;")
	public static Class70 method263(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2) {
		@Pc(7) Class70 local7 = new Class70();
		local7.anInt2899 = 0;
		local7.aByteArray30 = new byte[arg0];
		for (@Pc(16) int local16 = arg1; local16 < arg1 + arg0; local16++) {
			if (arg2[local16] != 0) {
				local7.aByteArray30[local7.anInt2899++] = arg2[local16];
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(II)V")
	public static void method264(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static80.aBoolean91) {
			Static111.method1606();
		} else if (arg0 != -1 && (arg0 != Static141.anInt2849 || !Static14.method274()) && Static8.anInt186 != 0 && !Static80.aBoolean91) {
			Static180.method2793(Static10.aClass52_Sub1_2, Static8.anInt186, arg0);
		}
		Static141.anInt2849 = arg0;
	}
}
