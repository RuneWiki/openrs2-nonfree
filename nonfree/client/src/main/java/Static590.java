import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!wq", name = "d", descriptor = "I")
	public static int anInt9527;

	@OriginalMember(owner = "client!wq", name = "l", descriptor = "I")
	public static int anInt9532;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "Lclient!wo;")
	public static final Class361 aClass361_102 = new Class361();

	@OriginalMember(owner = "client!wq", name = "h", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_172 = new Class319(44, 8);

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Z[[[BIB)V")
	public static void method7874(@OriginalArg(0) boolean arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3) {
		@Pc(5) int local5 = arg0 ? 1 : 0;
		Static132.anInt2643 = 0;
		Static335.anInt5960 = 0;
		Static7.anInt135++;
		for (@Pc(15) int local15 = 0; local15 < Static464.anIntArray526[local5]; local15++) {
			if (!Static371.method5412(Static166.aClass20_Sub2ArrayArray1[local5][local15], arg0, arg1, arg2, arg3)) {
				Static524.method7129(Static166.aClass20_Sub2ArrayArray1[local5][local15]);
				if (Static166.aClass20_Sub2ArrayArray1[local5][local15].anInt8787 != -1) {
					Static128.aClass20_Sub2Array1[Static132.anInt2643++] = Static166.aClass20_Sub2ArrayArray1[local5][local15];
				}
			}
		}
		for (@Pc(61) int local61 = 0; local61 < Static288.anIntArray327[local5]; local61++) {
			if (!Static371.method5412(Static386.aClass20_Sub2ArrayArray3[local5][local61], arg0, arg1, arg2, arg3)) {
				Static524.method7129(Static386.aClass20_Sub2ArrayArray3[local5][local61]);
				if (Static386.aClass20_Sub2ArrayArray3[local5][local61].anInt8787 != -1) {
					Static365.aClass20_Sub2Array2[Static335.anInt5960++] = Static386.aClass20_Sub2ArrayArray3[local5][local61];
				}
			}
		}
		for (@Pc(107) int local107 = 0; local107 < Static431.anIntArray499[local5]; local107++) {
			if (!Static371.method5412(Static379.aClass20_Sub2ArrayArray2[local5][local107], arg0, arg1, arg2, arg3)) {
				if (Static379.aClass20_Sub2ArrayArray2[local5][local107].method7256()) {
					Static524.method7129(Static379.aClass20_Sub2ArrayArray2[local5][local107]);
					if (Static379.aClass20_Sub2ArrayArray2[local5][local107].anInt8787 != -1) {
						Static365.aClass20_Sub2Array2[Static335.anInt5960++] = Static379.aClass20_Sub2ArrayArray2[local5][local107];
					}
				} else {
					Static524.method7129(Static379.aClass20_Sub2ArrayArray2[local5][local107]);
					if (Static379.aClass20_Sub2ArrayArray2[local5][local107].anInt8787 != -1) {
						Static128.aClass20_Sub2Array1[Static132.anInt2643++] = Static379.aClass20_Sub2ArrayArray2[local5][local107];
					}
				}
			}
		}
		@Pc(190) int local190;
		if (!arg0) {
			for (local190 = 0; local190 < Static428.anInt4959; local190++) {
				if (!Static371.method5412(Static316.aClass20_Sub2_Sub4Array1[local190], arg0, arg1, arg2, arg3)) {
					Static524.method7129(Static316.aClass20_Sub2_Sub4Array1[local190]);
					if (Static316.aClass20_Sub2_Sub4Array1[local190].anInt8787 != -1) {
						if (Static316.aClass20_Sub2_Sub4Array1[local190].method7256()) {
							Static365.aClass20_Sub2Array2[Static335.anInt5960++] = Static316.aClass20_Sub2_Sub4Array1[local190];
						} else {
							Static128.aClass20_Sub2Array1[Static132.anInt2643++] = Static316.aClass20_Sub2_Sub4Array1[local190];
						}
					}
				}
			}
		}
		if (Static132.anInt2643 > 0) {
			Static480.method6736(Static128.aClass20_Sub2Array1, 0, Static132.anInt2643 - 1);
			for (local190 = 0; local190 < Static132.anInt2643; local190++) {
				Static469.method6617(Static128.aClass20_Sub2Array1[local190]);
			}
		}
		if (Static192.aBoolean328) {
			Static63.aClass12_5.method6402(0, null);
		}
		@Pc(278) int local278;
		for (local190 = Static195.anInt3996; local190 < Static101.anInt2104; local190++) {
			@Pc(298) int local298;
			@Pc(319) boolean[][] local319;
			@Pc(329) int local329;
			@Pc(336) int local336;
			@Pc(338) int local338;
			if (local190 < arg2 || arg1 == null) {
				local278 = Static116.aBooleanArrayArray4.length;
				if (Static118.anInt2396 + Static116.aBooleanArrayArray4.length > Static446.anInt7725) {
					local278 -= Static118.anInt2396 + Static116.aBooleanArrayArray4.length - Static446.anInt7725;
				}
				local298 = Static116.aBooleanArrayArray4[0].length;
				if (Static494.anInt8292 + Static116.aBooleanArrayArray4[0].length > Static218.anInt4229) {
					local298 -= Static494.anInt8292 + Static116.aBooleanArrayArray4[0].length - Static218.anInt4229;
				}
				local319 = Static89.aBooleanArrayArray3;
				if (Static41.aBoolean88) {
					if (Static50.aBoolean95) {
						local319 = Static471.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static85.anInt1949; local329 < local278; local329++) {
						local336 = local329 + Static118.anInt2396 - Static85.anInt1949;
						for (local338 = Static530.anInt8768; local338 < local298; local338++) {
							if (Static116.aBooleanArrayArray4[local329][local338] && !Static158.method2431(local336, local190, local338 + Static494.anInt8292 - Static530.anInt8768)) {
								local319[local329][local338] = true;
							} else {
								local319[local329][local338] = false;
							}
						}
					}
				}
				if (Static50.aBoolean95) {
					Static20.aClass17Array1[local190].method6641(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static38.anInt1024; local329++) {
						Static384.aClass294Array3[local329].method6716(new Class20_Sub9(local190 + 1));
					}
				} else if (Static352.aBoolean441) {
					Static20.aClass17Array1[local190].method6643(Static251.anInt4676, Static63.anInt1544, Static246.anInt8757, Static89.aBooleanArrayArray3, true, Static446.anInt7724);
				} else {
					Static20.aClass17Array1[local190].method6641(Static251.anInt4676, Static63.anInt1544, Static246.anInt8757, Static89.aBooleanArrayArray3, true);
				}
			} else {
				local278 = Static116.aBooleanArrayArray4.length;
				if (Static118.anInt2396 + Static116.aBooleanArrayArray4.length > Static446.anInt7725) {
					local278 -= Static118.anInt2396 + Static116.aBooleanArrayArray4.length - Static446.anInt7725;
				}
				local298 = Static116.aBooleanArrayArray4[0].length;
				if (Static494.anInt8292 + Static116.aBooleanArrayArray4[0].length > Static218.anInt4229) {
					local298 -= Static494.anInt8292 + Static116.aBooleanArrayArray4[0].length - Static218.anInt4229;
				}
				local319 = Static89.aBooleanArrayArray3;
				if (Static41.aBoolean88) {
					if (Static50.aBoolean95) {
						local319 = Static471.aBooleanArrayArrayArray2[local190];
					}
					for (local329 = Static85.anInt1949; local329 < local278; local329++) {
						local336 = local329 + Static118.anInt2396 - Static85.anInt1949;
						for (local338 = Static530.anInt8768; local338 < local298; local338++) {
							local319[local329][local338] = false;
							if (Static116.aBooleanArrayArray4[local329][local338]) {
								@Pc(357) int local357 = local338 + Static494.anInt8292 - Static530.anInt8768;
								for (@Pc(359) int local359 = local190; local359 >= 0; local359--) {
									if (Static118.aClass293ArrayArrayArray14[local359][local336][local357] != null && Static118.aClass293ArrayArrayArray14[local359][local336][local357].aByte100 == local190) {
										if ((local359 < arg2 || arg1[local359][local336][local357] != arg3) && !Static158.method2431(local336, local190, local357)) {
											local319[local329][local338] = true;
											break;
										}
										local319[local329][local338] = false;
										break;
									}
								}
							}
						}
					}
				}
				if (Static50.aBoolean95) {
					Static20.aClass17Array1[local190].method6641(0, 0, 0, null, false);
					for (local329 = 0; local329 < Static38.anInt1024; local329++) {
						Static384.aClass294Array3[local329].method6716(new Class20_Sub9(local190 + 1));
					}
				} else if (Static352.aBoolean441) {
					Static20.aClass17Array1[local190].method6643(Static251.anInt4676, Static63.anInt1544, Static246.anInt8757, Static89.aBooleanArrayArray3, false, Static446.anInt7724);
				} else {
					Static20.aClass17Array1[local190].method6641(Static251.anInt4676, Static63.anInt1544, Static246.anInt8757, Static89.aBooleanArrayArray3, false);
				}
			}
		}
		if (Static335.anInt5960 > 0) {
			Static581.method7786(Static365.aClass20_Sub2Array2, 0, Static335.anInt5960 - 1);
			for (local278 = 0; local278 < Static335.anInt5960; local278++) {
				Static469.method6617(Static365.aClass20_Sub2Array2[local278]);
			}
		}
	}
}
