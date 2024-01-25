import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "[I")
	public static final int[] anIntArray385 = new int[200];

	@OriginalMember(owner = "client!nc", name = "d", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_129 = new Class34("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
	public static int anInt4253 = 0;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(I)V")
	public static void method3826() {
		try {
			if (Static33.anInt1108 == 1) {
				@Pc(21) int local21 = Static37.aClass1_Sub1_Sub1_1.method48();
				if (local21 > 0 && Static37.aClass1_Sub1_Sub1_1.method42()) {
					local21 -= Static175.anInt3790;
					if (local21 < 0) {
						local21 = 0;
					}
					Static37.aClass1_Sub1_Sub1_1.method43(local21);
				} else {
					Static37.aClass1_Sub1_Sub1_1.method41();
					Static37.aClass1_Sub1_Sub1_1.method32();
					Static295.aClass1_Sub5_2 = null;
					if (Static70.aClass216_23 == null) {
						Static33.anInt1108 = 0;
					} else {
						Static33.anInt1108 = 2;
					}
					Static314.aClass107_1 = null;
				}
			}
		} catch (@Pc(63) Exception local63) {
			local63.printStackTrace();
			Static37.aClass1_Sub1_Sub1_1.method41();
			Static70.aClass216_23 = null;
			Static295.aClass1_Sub5_2 = null;
			Static33.anInt1108 = 0;
			Static314.aClass107_1 = null;
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(BLclient!bg;)Lclient!qm;")
	public static Class172 method3828(@OriginalArg(1) Class1_Sub8 arg0) {
		@Pc(15) Class172 local15 = new Class172();
		local15.anInt5346 = arg0.method4556();
		local15.aClass1_Sub4_Sub11_1 = Static8.method5022(local15.anInt5346);
		return local15;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(I)V")
	public static void method3829() {
		@Pc(1) Class87 local1 = Static20.aClass87_3;
		synchronized (Static20.aClass87_3) {
			Static20.aClass87_3.method2477();
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!pi;I)V")
	public static void method3830(@OriginalArg(0) Class17_Sub1_Sub1_Sub2 arg0) {
		if (Static115.anInt2635 >= 400) {
			return;
		}
		@Pc(14) Class213 local14 = arg0.aClass213_1;
		if (local14.anIntArray517 != null) {
			local14 = local14.method5480();
			if (local14 == null) {
				return;
			}
		}
		if (!local14.aBoolean637) {
			return;
		}
		@Pc(31) String local31 = local14.aString63;
		if (local14.anInt6513 != 0) {
			@Pc(49) String local49 = Static8.anInt5875 == 1 ? Static316.aClass34_192.method1285(Static259.anInt2907) : Static316.aClass34_191.method1285(Static259.anInt2907);
			local31 = local31 + Static125.method2610(Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803, local14.anInt6513) + " (" + local49 + local14.anInt6513 + ")";
		}
		if (Static91.aBoolean214) {
			@Pc(84) Class1_Sub4_Sub15 local84 = Static152.anInt4540 == -1 ? null : Static357.method3867(Static152.anInt4540);
			if ((Static257.anInt5340 & 0x2) != 0 && (local84 == null || local14.method5489(local84.anInt3392, Static152.anInt4540) != local84.anInt3392)) {
				Static58.method1506(Static175.anInt3793, Static281.aString56 + " -> <col=ffff00>" + local31, 0, (long) arg0.anInt4867, Static24.aString15, 0, 4);
			}
			return;
		}
		@Pc(135) String[] local135 = local14.aStringArray64;
		if (Static242.aBoolean663) {
			local135 = Static256.method4620(local135);
		}
		@Pc(145) int local145;
		if (local135 != null) {
			for (local145 = 4; local145 >= 0; local145--) {
				if (local135[local145] != null && (Static8.anInt5875 != 0 || !local135[local145].equalsIgnoreCase(Static143.aClass34_101.method1285(Static259.anInt2907)))) {
					@Pc(164) byte local164 = 0;
					if (local145 == 0) {
						local164 = 19;
					}
					@Pc(173) int local173 = Static255.anInt5262;
					if (local145 == 1) {
						local164 = 23;
					}
					if (local145 == 2) {
						local164 = 22;
					}
					if (local145 == 3) {
						local164 = 49;
					}
					if (local145 == 4) {
						local164 = 5;
					}
					if (local14.anInt6546 == local145) {
						local173 = local14.lb;
					}
					if (local14.anInt6527 == local145) {
						local173 = local14.anInt6521;
					}
					Static58.method1506(local173, "<col=ffff00>" + local31, 0, (long) arg0.anInt4867, local135[local145], 0, local164);
				}
			}
		}
		if (Static8.anInt5875 == 0 && local135 != null) {
			for (local145 = 4; local145 >= 0; local145--) {
				if (local135[local145] != null && local135[local145].equalsIgnoreCase(Static143.aClass34_101.method1285(Static259.anInt2907))) {
					@Pc(256) short local256 = 0;
					if (local14.anInt6513 > Static198.aClass17_Sub1_Sub1_Sub1_3.anInt803) {
						local256 = 2000;
					}
					@Pc(269) short local269 = 0;
					if (local145 == 0) {
						local269 = 19;
					}
					if (local145 == 1) {
						local269 = 23;
					}
					if (local145 == 2) {
						local269 = 22;
					}
					if (local145 == 3) {
						local269 = 49;
					}
					if (local145 == 4) {
						local269 = 5;
					}
					if (local269 != 0) {
						local269 += local256;
					}
					Static58.method1506(local14.anInt6542, "<col=ffff00>" + local31, 0, (long) arg0.anInt4867, local135[local145], 0, local269);
				}
			}
		}
		Static58.method1506(Static351.anInt6706, "<col=ffff00>" + local31, 0, (long) arg0.anInt4867, Static278.aClass34_157.method1285(Static259.anInt2907), 0, 1001);
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(B)V")
	public static void method3831() {
		while (true) {
			@Pc(13) Class1_Sub41 local13 = (Class1_Sub41) Static327.aClass16_39.method408();
			if (local13 == null) {
				return;
			}
			if (Static77.aClass194ArrayArrayArray1 != null) {
				@Pc(31) Class17_Sub1_Sub1 local31;
				@Pc(26) int local26;
				if (local13.anInt6651 < 0) {
					local26 = -local13.anInt6651 - 1;
					if (Static16.anInt527 == local26) {
						local31 = Static198.aClass17_Sub1_Sub1_Sub1_3;
					} else {
						local31 = Static102.aClass17_Sub1_Sub1_Sub1Array1[local26];
					}
				} else {
					local26 = local13.anInt6651 - 1;
					local31 = Static140.aClass17_Sub1_Sub1_Sub2Array1[local26];
				}
				if (local31 != null) {
					@Pc(55) Class141 local55 = Static119.method2548(local13.anInt6654);
					@Pc(70) int local70;
					@Pc(73) int local73;
					if (local13.anInt6659 == 1 || local13.anInt6659 == 3) {
						local70 = local55.anInt4256;
						local73 = local55.anInt4297;
					} else {
						local70 = local55.anInt4297;
						local73 = local55.anInt4256;
					}
					@Pc(88) int local88 = local13.anInt6657 + (local70 >> 1);
					@Pc(97) int local97 = local13.anInt6657 + (local70 + 1 >> 1);
					@Pc(104) int local104 = (local73 >> 1) + local13.anInt6653;
					@Pc(113) int local113 = (local73 + 1 >> 1) + local13.anInt6653;
					@Pc(118) Class53 local118 = Static298.aClass53Array3[local31.aByte51];
					@Pc(143) int local143 = local118.method2785(local88, local104) + local118.method2785(local97, local104) + local118.method2785(local88, local113) + local118.method2785(local97, local113) >> 2;
					@Pc(145) Interface5 local145 = null;
					@Pc(150) int local150 = Static67.anIntArray182[local13.anInt6661];
					if (local150 == 0) {
						local145 = (Interface5) Static352.method5612(local31.aByte51, local13.anInt6657, local13.anInt6653);
					} else if (local150 == 1) {
						local145 = (Interface5) Static223.method5335(local31.aByte51, local13.anInt6657, local13.anInt6653);
					} else if (local150 == 2) {
						local145 = (Interface5) Static258.method4649(local31.aByte51, local13.anInt6657, local13.anInt6653, ol.class);
					} else if (local150 == 3) {
						local145 = (Interface5) Static127.method2619(local31.aByte51, local13.anInt6657, local13.anInt6653);
					}
					if (local145 != null) {
						Static191.method3710(-1, local13.anInt6666 + 1, local31.aByte51, 0, local150, 0, local13.anInt6653, local13.anInt6663, local13.anInt6657);
						local31.anInt4898 = Static5.anInt208 + local13.anInt6663;
						local31.anInt4894 = local13.anInt6666 + Static5.anInt208;
						local31.anInt4886 = local13.anInt6657 * 128 + local70 * 64;
						local31.anInt4889 = local143;
						local31.anInterface5_3 = local145;
						local31.anInt4896 = local73 * 64 + local13.anInt6653 * 128;
						@Pc(272) int local272 = local13.anInt6664;
						@Pc(275) int local275 = local13.anInt6652;
						@Pc(278) int local278 = local13.anInt6662;
						@Pc(283) int local283;
						if (local272 > local275) {
							local283 = local272;
							local272 = local275;
							local275 = local283;
						}
						@Pc(290) int local290 = local13.anInt6660;
						if (local278 > local290) {
							local283 = local278;
							local278 = local290;
							local290 = local283;
						}
						local31.anInt4890 = local275 + local13.anInt6657;
						local31.anInt4892 = local13.anInt6657 + local272;
						local31.anInt4895 = local278 + local13.anInt6653;
						local31.anInt4891 = local290 + local13.anInt6653;
					}
				}
			}
		}
	}
}
