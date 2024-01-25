import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!dt", name = "k", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_39 = new Class186(11, 10);

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "[Lclient!dk;")
	public static final Interface3[] anInterface3Array1 = new Interface3[75];

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(III)V")
	public static void method2132(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class262 local7 = Static584.aClass262ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static433.method6363(local7.aClass19_Sub1_Sub2_2);
		Static433.method6363(local7.aClass19_Sub1_Sub2_1);
		if (local7.aClass19_Sub1_Sub2_2 != null) {
			local7.aClass19_Sub1_Sub2_2 = null;
		}
		if (local7.aClass19_Sub1_Sub2_1 != null) {
			local7.aClass19_Sub1_Sub2_1 = null;
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(ZILclient!av;II)V")
	public static void method2133(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class20 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(8) int local8 = arg1.anInt509;
		if (arg1.aByte18 == 0) {
			arg1.anInt509 = arg1.anInt592;
		} else if (arg1.aByte18 == 1) {
			arg1.anInt509 = arg2 - arg1.anInt592;
		} else if (arg1.aByte18 == 2) {
			arg1.anInt509 = arg2 * arg1.anInt592 >> 14;
		}
		@Pc(67) int local67 = arg1.anInt569;
		if (arg1.aByte17 == 0) {
			arg1.anInt569 = arg1.anInt599;
		} else if (arg1.aByte17 == 1) {
			arg1.anInt569 = arg3 - arg1.anInt599;
		} else if (arg1.aByte17 == 2) {
			arg1.anInt569 = arg3 * arg1.anInt599 >> 14;
		}
		if (arg1.aByte18 == 4) {
			arg1.anInt509 = arg1.anInt569 * arg1.anInt551 / arg1.anInt528;
		}
		if (arg1.aByte17 == 4) {
			arg1.anInt569 = arg1.anInt509 * arg1.anInt528 / arg1.anInt551;
		}
		if (Static632.aBoolean738 && (Static87.method1164(arg1).anInt5450 != 0 || arg1.anInt532 == 0)) {
			if (arg1.anInt569 < 5 && arg1.anInt509 < 5) {
				arg1.anInt569 = 5;
				arg1.anInt509 = 5;
			} else {
				if (arg1.anInt509 <= 0) {
					arg1.anInt509 = 5;
				}
				if (arg1.anInt569 <= 0) {
					arg1.anInt569 = 5;
				}
			}
		}
		if (arg1.anInt552 == Static241.anInt4520) {
			Static474.aClass20_14 = arg1;
		}
		if (arg0 && arg1.anObjectArray29 != null && (local8 != arg1.anInt509 || local67 != arg1.anInt569)) {
			@Pc(248) Class3_Sub7 local248 = new Class3_Sub7();
			local248.aClass20_2 = arg1;
			local248.anObjectArray1 = arg1.anObjectArray29;
			Static102.aClass357_6.method8401(local248);
		}
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IZLclient!gja;)V")
	public static void method2136(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class19_Sub1_Sub3_Sub2_Sub1 arg1) {
		if (Static285.anInt5168 >= 400) {
			return;
		}
		@Pc(13) Class18 local13 = arg1.aClass18_1;
		@Pc(16) String local16 = arg1.aString69;
		if (local13.anIntArray23 != null) {
			local13 = local13.method407(Static577.aClass362_1);
			if (local13 == null) {
				return;
			}
			local16 = local13.aString6;
		}
		if (!local13.aBoolean17) {
			return;
		}
		if (arg1.anInt4146 != 0) {
			@Pc(67) String local67 = Static726.aClass169_12 == Static667.aClass169_8 ? Static476.aClass279_30.method6992(Static141.anInt2658) : Static476.aClass279_28.method6992(Static141.anInt2658);
			local16 = local16 + Static5.method83(arg1.anInt4146, Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7841) + " (" + local67 + arg1.anInt4146 + ")";
		}
		if (Static212.aBoolean297 && !arg0) {
			@Pc(111) Class319 local111 = Static502.anInt8594 == -1 ? null : Static646.aClass106_1.method2677(Static502.anInt8594);
			if ((Static718.anInt11231 & 0x2) != 0 && (local111 == null || local13.method412(Static502.anInt8594, local111.anInt9232) != local111.anInt9232)) {
				Static91.method1249(Static27.anInt421, Static177.aString97, (long) arg1.anInt7796, (long) arg1.anInt7796, 30, 0, false, false, 0, Static90.aString28 + " -> <col=ffff00>" + local16, true, -1);
			}
		}
		if (arg0) {
			return;
		}
		@Pc(174) String[] local174 = local13.aStringArray1;
		if (Static125.aBoolean200) {
			local174 = Static223.method3523(local174);
		}
		if (local174 == null) {
			return;
		}
		for (@Pc(189) int local189 = local174.length - 1; local189 >= 0; local189--) {
			if (local174[local189] != null && (local13.aByte7 == 0 || !local174[local189].equalsIgnoreCase(Static476.aClass279_23.method6992(Static141.anInt2658)) && !local174[local189].equalsIgnoreCase(Static476.aClass279_22.method6992(Static141.anInt2658)))) {
				@Pc(226) short local226 = 0;
				if (local189 == 0) {
					local226 = 12;
				}
				@Pc(235) int local235 = Static103.anInt1659;
				if (local189 == 1) {
					local226 = 23;
				}
				if (local189 == 2) {
					local226 = 3;
				}
				if (local189 == 3) {
					local226 = 25;
				}
				if (local189 == 4) {
					local226 = 19;
				}
				if (local13.anInt443 == local189) {
					local235 = local13.anInt460;
				}
				if (local189 == 5) {
					local226 = 1011;
				}
				if (local189 == local13.anInt454) {
					local235 = local13.anInt435;
				}
				Static91.method1249(local174[local189].equalsIgnoreCase(Static476.aClass279_23.method6992(Static141.anInt2658)) ? local13.anInt457 : local235, local174[local189], (long) arg1.anInt7796, (long) arg1.anInt7796, local226, 0, false, false, 0, "<col=ffff00>" + local16, true, -1);
			}
		}
		if (local13.aByte7 != 1) {
			return;
		}
		for (@Pc(340) int local340 = 0; local340 < local174.length; local340++) {
			if (local174[local340] != null && (local174[local340].equalsIgnoreCase(Static476.aClass279_23.method6992(Static141.anInt2658)) || local174[local340].equalsIgnoreCase(Static476.aClass279_22.method6992(Static141.anInt2658)))) {
				@Pc(372) short local372 = 0;
				if (arg1.anInt4146 > Static251.aClass19_Sub1_Sub3_Sub2_Sub2_2.anInt7841) {
					local372 = 2000;
				}
				@Pc(381) short local381 = 0;
				if (local340 == 0) {
					local381 = 12;
				}
				@Pc(390) int local390 = Static103.anInt1659;
				if (local340 == 1) {
					local381 = 23;
				}
				if (local340 == 2) {
					local381 = 3;
				}
				if (local340 == 3) {
					local381 = 25;
				}
				if (local340 == 4) {
					local381 = 19;
				}
				if (local340 == 5) {
					local381 = 1011;
				}
				if (local340 == local13.anInt443) {
					local390 = local13.anInt460;
				}
				if (local381 != 0) {
					local381 += local372;
				}
				if (local340 == local13.anInt454) {
					local390 = local13.anInt435;
				}
				Static91.method1249(local174[local340].equalsIgnoreCase(Static476.aClass279_23.method6992(Static141.anInt2658)) ? local13.anInt457 : local390, local174[local340], (long) arg1.anInt7796, (long) arg1.anInt7796, local381, 0, false, false, 0, "<col=ffff00>" + local16, true, -1);
			}
		}
		return;
	}
}
