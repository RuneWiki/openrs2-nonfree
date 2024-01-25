import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static251 {

	@OriginalMember(owner = "client!mb", name = "u", descriptor = "Lclient!ju;")
	public static Class124 aClass124_14;

	@OriginalMember(owner = "client!mb", name = "w", descriptor = "Lclient!ih;")
	public static Class107 aClass107_3;

	@OriginalMember(owner = "client!mb", name = "z", descriptor = "[I")
	public static int[] anIntArray395;

	@OriginalMember(owner = "client!mb", name = "B", descriptor = "Lclient!gw;")
	public static Class93 aClass93_10;

	@OriginalMember(owner = "client!mb", name = "C", descriptor = "Lclient!ni;")
	public static final Class163 aClass163_161 = new Class163(2, 6);

	@OriginalMember(owner = "client!mb", name = "D", descriptor = "Lclient!fg;")
	public static final Class70 aClass70_20 = new Class70(0, 2, 2, 1);

	@OriginalMember(owner = "client!mb", name = "b", descriptor = "(BI)V")
	public static void method5278(@OriginalArg(1) int arg0) {
		Static130.anInt2354 = -1;
		Static235.anInt4023 = arg0;
		Static285.anInt5015 = 100;
		Static110.anInt1953 = 3;
	}

	@OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBIZ)V")
	public static void method5279(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (!arg3 && arg2 == Static37.anInt629 && arg0 == Static149.anInt2745 && (Static436.anInt7298 == Static276.anInt4606 || Static39.aClass79_Sub1_1.method1948(Static402.anInt6656))) {
			return;
		}
		Static149.anInt2745 = arg0;
		Static37.anInt629 = arg2;
		Static436.anInt7298 = Static276.anInt4606;
		if (Static39.aClass79_Sub1_1.method1948(Static402.anInt6656)) {
			Static436.anInt7298 = 0;
		}
		Static393.method5432(arg1);
		Static275.method3805(Static163.aClass174_199.method4208(Static300.anInt5192), true, Static244.aClass18_1);
		@Pc(54) int local54 = Static59.anInt1127;
		Static59.anInt1127 = (Static37.anInt629 - (Static373.anInt6324 >> 4)) * 8;
		@Pc(64) int local64 = Static49.anInt873;
		Static49.anInt873 = (Static149.anInt2745 - (Static291.anInt5062 >> 4)) * 8;
		Static162.aClass3_Sub3_Sub13_3 = Static211.method301(Static37.anInt629 * 8, Static149.anInt2745 * 8);
		Static329.aClass118_3 = null;
		@Pc(88) int local88 = Static59.anInt1127 - local54;
		@Pc(98) int local98 = Static49.anInt873 - local64;
		@Pc(119) int local119;
		@Pc(121) int local121;
		@Pc(166) int local166;
		@Pc(282) int local282;
		if (arg1 == 10) {
			for (local282 = 0; local282 < Static76.anInt1390; local282++) {
				@Pc(288) Class3_Sub40 local288 = Static407.aClass3_Sub40Array1[local282];
				if (local288 != null) {
					@Pc(293) Class1_Sub2_Sub6_Sub1 local293 = local288.aClass1_Sub2_Sub6_Sub1_2;
					for (local121 = 0; local121 < 10; local121++) {
						local293.anIntArray510[local121] -= local88;
						local293.anIntArray509[local121] -= local98;
					}
					local293.anInt7557 -= local98 * 128;
					local293.anInt7560 -= local88 * 128;
				}
			}
		} else {
			Static379.anInt6398 = 0;
			@Pc(107) boolean local107 = false;
			@Pc(113) int local113 = Static373.anInt6324 * 128 - 128;
			local119 = (Static291.anInt5062 - 1) * 128;
			for (local121 = 0; local121 < Static76.anInt1390; local121++) {
				@Pc(127) Class3_Sub40 local127 = Static407.aClass3_Sub40Array1[local121];
				if (local127 != null) {
					@Pc(132) Class1_Sub2_Sub6_Sub1 local132 = local127.aClass1_Sub2_Sub6_Sub1_2;
					local132.anInt7560 -= local88 * 128;
					local132.anInt7557 -= local98 * 128;
					if (local132.anInt7560 >= 0 && local113 >= local132.anInt7560 && local132.anInt7557 >= 0 && local132.anInt7557 <= local119) {
						@Pc(164) boolean local164 = true;
						for (local166 = 0; local166 < 10; local166++) {
							local132.anIntArray510[local166] -= local88;
							local132.anIntArray509[local166] -= local98;
							if (local132.anIntArray510[local166] < 0 || Static373.anInt6324 <= local132.anIntArray510[local166] || local132.anIntArray509[local166] < 0 || local132.anIntArray509[local166] >= Static291.anInt5062) {
								local164 = false;
							}
						}
						if (local164) {
							Static198.anIntArray225[Static379.anInt6398++] = local132.anInt7621;
						} else {
							local132.method5632(null);
							local107 = true;
							local127.method6288();
						}
					} else {
						local132.method5632(null);
						local107 = true;
						local127.method6288();
					}
				}
			}
			if (local107) {
				Static76.anInt1390 = Static63.aClass140_37.method3492();
				Static63.aClass140_37.method3484(Static407.aClass3_Sub40Array1);
			}
		}
		for (local282 = 0; local282 < 2048; local282++) {
			@Pc(345) Class1_Sub2_Sub6_Sub2 local345 = Static216.aClass1_Sub2_Sub6_Sub2Array1[local282];
			if (local345 != null) {
				for (local119 = 0; local119 < 10; local119++) {
					local345.anIntArray510[local119] -= local88;
					local345.anIntArray509[local119] -= local98;
				}
				local345.anInt7557 -= local98 * 128;
				local345.anInt7560 -= local88 * 128;
			}
		}
		@Pc(395) Class36[] local395 = Static138.aClass36Array1;
		for (local119 = 0; local119 < local395.length; local119++) {
			@Pc(403) Class36 local403 = local395[local119];
			if (local403 != null) {
				local403.anInt1120 -= local88 * 128;
				local403.anInt1126 -= local98 * 128;
			}
		}
		for (@Pc(431) Class3_Sub14 local431 = (Class3_Sub14) Static305.aClass193_49.method4519(); local431 != null; local431 = (Class3_Sub14) Static305.aClass193_49.method4525()) {
			local431.anInt1627 -= local88;
			local431.anInt1629 -= local98;
			if (Static337.anInt5635 != 4 && (local431.anInt1627 < 0 || local431.anInt1629 < 0 || Static373.anInt6324 <= local431.anInt1627 || Static291.anInt5062 <= local431.anInt1629)) {
				local431.method6288();
			}
		}
		if (Static337.anInt5635 != 4) {
			for (@Pc(488) Class3_Sub13 local488 = (Class3_Sub13) Static242.aClass140_26.method3486(); local488 != null; local488 = (Class3_Sub13) Static242.aClass140_26.method3485()) {
				@Pc(496) int local496 = (int) (local488.aLong248 & 0x3FFFL);
				@Pc(500) int local500 = local496 - Static59.anInt1127;
				local166 = (int) (local488.aLong248 >> 14 & 0x3FFFL);
				@Pc(513) int local513 = local166 - Static49.anInt873;
				if (local500 < 0 || local513 < 0 || local500 >= Static373.anInt6324 || Static291.anInt5062 <= local513) {
					local488.method6288();
				}
			}
		}
		if (Static31.anInt592 != 0) {
			Static392.anInt6568 -= local98;
			Static31.anInt592 -= local88;
		}
		Static29.method4780();
		if (arg1 != 10) {
			Static359.anInt6118 -= local98;
			Static199.anInt3573 -= local88;
			Static87.anInt1583 -= local88;
			Static152.anInt7561 -= local98 * 128;
			Static136.anInt2402 -= local98;
			Static266.anInt4433 -= local88 * 128;
			if (Math.abs(local88) > Static373.anInt6324 || Math.abs(local98) > Static291.anInt5062) {
				Static106.method4449();
			}
		} else if (Static27.anInt490 == 4) {
			Static180.anInt3334 -= local98 * 128;
			Static32.anInt603 -= local98 * 128;
			Static43.anInt5650 -= local88 * 128;
			Static370.anInt6269 -= local88 * 128;
		} else {
			Static27.anInt490 = 1;
		}
		Static81.method1462();
		Static138.method2121();
		Static236.aClass193_34.method4524();
		client.lb.method4524();
		Static125.aClass194_3.method4583();
		Static248.method3547();
	}
}
