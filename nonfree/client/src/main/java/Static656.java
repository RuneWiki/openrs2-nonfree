import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static656 {

	@OriginalMember(owner = "client!wf", name = "o", descriptor = "Lclient!jd;")
	public static Class20 aClass20_36;

	@OriginalMember(owner = "client!wf", name = "r", descriptor = "Ljava/lang/String;")
	public static String aString117;

	@OriginalMember(owner = "client!wf", name = "s", descriptor = "[I")
	public static int[] anIntArray814;

	@OriginalMember(owner = "client!wf", name = "l", descriptor = "Lclient!fba;")
	public static final Class100 aClass100_141 = new Class100(35, 8);

	@OriginalMember(owner = "client!wf", name = "t", descriptor = "[I")
	public static final int[] anIntArray815 = new int[8];

	@OriginalMember(owner = "client!wf", name = "e", descriptor = "(I)V")
	public static void method9105() {
		Static147.aClass264_19.method6360();
	}

	@OriginalMember(owner = "client!wf", name = "a", descriptor = "(I[II[IZIIBIZIB[I[[[B[I[III)V")
	public static void method9107(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(8) int arg6, @OriginalArg(9) boolean arg7, @OriginalArg(10) int arg8, @OriginalArg(11) byte arg9, @OriginalArg(12) int[] arg10, @OriginalArg(13) byte[][][] arg11, @OriginalArg(14) int[] arg12, @OriginalArg(15) int[] arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15) {
		if (Static453.anInt7941 == -1) {
			return;
		}
		@Pc(17) int[] local17 = Static117.aClass137_46.Y();
		@Pc(21) int local21 = local17[0];
		@Pc(25) int local25 = local17[1];
		@Pc(29) int local29 = local17[2];
		@Pc(33) int local33 = local17[3];
		@Pc(35) int local35 = local29;
		@Pc(37) int local37 = local33;
		if (Static453.anInt7941 == 1) {
			local35 = (int) ((double) local29 * (double) Static496.anInt8827 / (double) Static608.anInt10279);
			local37 = (int) ((double) local33 * (double) Static496.anInt8827 / (double) Static608.anInt10279);
		}
		if (!Static17.aBoolean15) {
			if (Static453.anInt7941 == 1) {
				Static121.method2074();
			}
			@Pc(72) int local72 = arg4 - Static207.anInt3833;
			@Pc(77) int local77 = arg14 - Static158.anInt3121;
			@Pc(82) int local82 = arg5 - Static506.anInt8945;
			@Pc(104) int local104 = (int) ((double) local35 * (Static187.aDouble8 * (double) local77 + Static111.aDouble4 * (double) local72 + Static382.aDouble17 * (double) local82) / (double) arg6);
			@Pc(126) int local126 = (int) ((double) local37 * (Static388.aDouble18 * (double) local77 + (double) local72 * Static143.aDouble6 + (double) local82 * Static571.aDouble21) / (double) arg6);
			@Pc(141) double local141 = Static409.aDouble19 * (double) local77 + (double) local72 * Static153.aDouble7 + (double) local82 * Static121.aDouble5;
			@Pc(147) int local147 = local104 + Static568.anInt9807 - Static651.anInt10885;
			@Pc(154) int local154 = Static599.anInt6159 + local126 - Static65.anInt1519;
			@Pc(158) int local158 = Static503.anInt8861 + local147;
			@Pc(163) int local163 = local154 + Static496.anInt8827;
			if (local147 >= 0 && local154 >= 0 && local158 <= Static497.anInt10443 && local163 <= Static608.anInt10279 || Static453.anInt7941 == 2) {
				if (Static453.anInt7941 == 2) {
					Static620.aDouble22 = -local141;
				}
				Static637.anInt10654 = local147;
				Static256.anInt4522 = local154;
			} else if (local158 > 0 && local163 > 0 && Static497.anInt10443 > local147 && Static608.anInt10279 > local154) {
				@Pc(204) int local204 = local147 - Static568.anInt9807;
				@Pc(209) int local209 = local154 - Static599.anInt6159;
				@Pc(211) int local211 = 0;
				@Pc(213) int local213 = 0;
				@Pc(215) int local215 = 0;
				@Pc(217) int local217 = 0;
				@Pc(219) double local219 = 0.0D;
				if (Static453.anInt7941 == 0) {
					local219 = Static620.aDouble22 + local141;
					local213 = local209;
					local211 = local204;
				} else if (Static453.anInt7941 == 1) {
					local215 = local204 / Static465.anInt8179;
					local217 = local209 / Static309.anInt1943;
					local213 = local217 * Static309.anInt1943;
					local211 = local215 * Static465.anInt8179;
					local219 = (double) (local209 * local213 + local204 * local211) * (local141 + Static620.aDouble22) / (double) (local204 * local204 + local209 * local209);
				}
				local219 = -local219;
				@Pc(280) int local280 = 0;
				@Pc(282) int local282 = 0;
				@Pc(284) int local284 = 0;
				@Pc(286) int local286 = 0;
				@Pc(288) int local288 = 0;
				@Pc(297) int local297;
				@Pc(295) int local295;
				@Pc(301) int local301;
				@Pc(299) int local299;
				if (local211 >= 0) {
					local295 = Static497.anInt10443 - local211;
					local297 = 0;
					local299 = local211;
					local301 = local295;
					if (Static453.anInt7941 == 1) {
						local284 = Static347.anInt6424 - local215;
						local288 = local215;
					}
				} else {
					local295 = local211 + Static497.anInt10443;
					local297 = -local211;
					local301 = 0;
					if (Static453.anInt7941 == 1) {
						local288 = -local215;
						local284 = 0;
					}
					local299 = local297;
				}
				@Pc(336) int local336 = 0;
				@Pc(349) int local349;
				@Pc(346) int local346;
				@Pc(351) int local351;
				@Pc(353) int local353;
				@Pc(371) int local371;
				if (local213 < 0) {
					local346 = Static608.anInt10279 + local213;
					local349 = -local213;
					local351 = 0;
					local353 = local349;
					if (Static453.anInt7941 == 1) {
						local282 = -local217;
						local280 = 0;
						local286 = local282;
						local336 = Static174.anInt10833 + local217;
					}
					local371 = local349;
				} else {
					local349 = 0;
					local346 = Static608.anInt10279 - local213;
					local351 = local346;
					local353 = local213;
					if (Static453.anInt7941 == 1) {
						local286 = 0;
						local280 = Static174.anInt10833 - local217;
						local282 = local217;
						local336 = local280;
					}
					local371 = 0;
				}
				@Pc(409) Class376 local409 = Static430.aClass23_3.aClass376_1;
				@Pc(423) int local423;
				for (@Pc(414) Class12_Sub8 local414 = (Class12_Sub8) local409.method9008(); local414 != null; local414 = (Class12_Sub8) local409.method9014()) {
					@Pc(419) Class12_Sub1[] local419 = local414.aClass12_Sub1Array1;
					@Pc(421) boolean local421 = true;
					for (local423 = 0; local423 < local419.length; local423++) {
						@Pc(429) Class12_Sub1 local429 = local419[local423];
						@Pc(432) int local432 = local429.anInt80;
						@Pc(435) int local435 = local429.anInt83;
						@Pc(438) int local438 = local429.anInt84;
						@Pc(441) int local441 = local429.anInt82;
						@Pc(448) int local448;
						local429.anInt80 = local448 = local432 - local211;
						@Pc(456) int local456;
						local429.anInt84 = local456 = local438 - local211;
						@Pc(464) int local464;
						local429.anInt82 = local464 = local441 - local213;
						@Pc(468) int local468 = local429.anInt81;
						@Pc(474) int local474;
						local429.anInt83 = local474 = local435 - local213;
						if (local421) {
							@Pc(490) int local490 = (local448 >= local456 ? local456 : local448) - local468;
							if (Static497.anInt10443 >= local490) {
								@Pc(507) int local507 = (local474 < local464 ? local474 : local464) - local468;
								if (local507 <= Static608.anInt10279) {
									@Pc(527) int local527 = (local456 > local448 ? local456 : local448) + local468;
									if (local527 >= 0) {
										@Pc(538) int local538 = (local464 > local474 ? local464 : local474) + local468;
										if (local538 >= 0) {
											local421 = false;
										}
									}
								}
							}
						}
					}
					if (local421) {
						local414.method9143();
						Static512.method7461(local414);
					}
				}
				if (Static453.anInt7941 == 0) {
					Static117.aClass137_46.method7933(Static45.anInterface23_1);
				}
				Static117.aClass137_46.F(-local211, -local213);
				Static117.aClass137_46.b(local297, local349, local295, local346, local219);
				Static317.method5009(local219 + Static620.aDouble22);
				Static651.aDouble24 = Static620.aDouble22 + local219;
				if (Static453.anInt7941 == 1) {
					Static184.anInt3521 = local25 - local213 - Static65.anInt1519;
					Static606.anInt10222 = local37;
					Static172.anInt3366 = local21 - Static651.anInt10885 - local211;
					Static149.anInt6796 = local35;
					Static117.aClass137_46.DA(Static172.anInt3366, Static184.anInt3521, Static149.anInt6796, Static606.anInt10222);
				} else {
					Static172.anInt3366 = Static568.anInt9807 + local21 - local211 - Static651.anInt10885;
					Static606.anInt10222 = local37;
					Static184.anInt3521 = local25 + Static599.anInt6159 - Static65.anInt1519 - local213;
					Static149.anInt6796 = local35;
					Static117.aClass137_46.DA(Static172.anInt3366, Static184.anInt3521, Static149.anInt6796, Static606.anInt10222);
				}
				Static197.method3024(Static430.aClass23_3);
				if (local353 > 0) {
					Static117.aClass137_46.KA(0, local351, Static497.anInt10443, local353 + local351);
					Static117.aClass137_46.ya();
					Static117.aClass137_46.GA(Static496.anInt8830);
					Static218.method3411(arg2, arg4, arg14, arg5, arg11, arg10, arg12, arg1, arg13, arg3, arg0, arg9, arg15, arg8, arg7, arg6, 1, false);
				}
				if (local299 > 0) {
					Static117.aClass137_46.KA(local301, local371, local299 + local301, local346 + local371);
					Static117.aClass137_46.ya();
					Static117.aClass137_46.GA(Static496.anInt8830);
					Static218.method3411(arg2, arg4, arg14, arg5, arg11, arg10, arg12, arg1, arg13, arg3, arg0, arg9, arg15, arg8, arg7, arg6, 1, false);
				}
				Static117.aClass137_46.la();
				Static102.method1818();
				if (Static453.anInt7941 == 0) {
					Static117.aClass137_46.method7893();
				}
				Static620.aDouble22 += local219;
				Static65.anInt1519 += local213;
				Static651.anInt10885 += local211;
				Static637.anInt10654 = local104 + Static568.anInt9807 - Static651.anInt10885;
				Static256.anInt4522 = local126 + Static599.anInt6159 - Static65.anInt1519;
				if (Static453.anInt7941 == 1) {
					Static374.anInt6857 += local217;
					Static537.anInt9245 += local215;
					for (@Pc(778) int local778 = 0; local778 < Static174.anInt10833; local778++) {
						@Pc(789) int local789 = Static677.method9301(Static374.anInt6857 + local778, Static174.anInt10833) * Static347.anInt6424;
						for (local423 = 0; local423 < Static347.anInt6424; local423++) {
							@Pc(804) int local804 = local789 + Static677.method9301(local423 + Static537.anInt9245, Static347.anInt6424);
							@Pc(845) boolean local845 = local280 <= local778 && local282 + local280 > local778 || local778 >= local286 && local778 < local336 + local286 && local423 >= local284 && local423 < local284 + local288;
							Static595.anInterface23Array1[local804].method9043(Static465.anInt8179 * local423, local778 * Static309.anInt1943, Static465.anInt8179, Static309.anInt1943, local845);
						}
					}
				}
			} else {
				Static17.aBoolean15 = true;
			}
		}
		if (Static17.aBoolean15) {
			Static651.anInt10885 = 0;
			Static620.aDouble22 = 0.0D;
			Static65.anInt1519 = 0;
			Static637.anInt10654 = Static568.anInt9807;
			Static158.anInt3121 = arg14;
			Static256.anInt4522 = Static599.anInt6159;
			Static506.anInt8945 = arg5;
			Static207.anInt3833 = arg4;
			if (Static453.anInt7941 == 0) {
				Static117.aClass137_46.method7933(Static45.anInterface23_1);
			}
			Static117.aClass137_46.la();
			Static117.aClass137_46.ya();
			Static117.aClass137_46.GA(Static496.anInt8830);
			Static5.aClass26_11.method6445(Static207.anInt3833, Static158.anInt3121, Static506.anInt8945, Static483.anInt8667, Static336.anInt6341, Static155.anInt3058);
			Static117.aClass137_46.method7950(Static5.aClass26_11);
			if (Static453.anInt7941 == 1) {
				Static184.anInt3521 = local25;
				Static606.anInt10222 = local37;
				Static149.anInt6796 = local35;
				Static172.anInt3366 = local21;
				Static117.aClass137_46.DA(Static172.anInt3366, Static184.anInt3521, Static149.anInt6796, Static606.anInt10222);
			} else {
				Static172.anInt3366 = local21 + Static568.anInt9807;
				Static149.anInt6796 = local35;
				Static606.anInt10222 = local37;
				Static184.anInt3521 = Static599.anInt6159 + local25;
				Static117.aClass137_46.DA(Static172.anInt3366, Static184.anInt3521, Static149.anInt6796, Static606.anInt10222);
			}
			Static651.aDouble24 = 0.0D;
			Static430.aClass23_3.method479();
			Static197.method3024(Static430.aClass23_3);
			Static218.method3411(arg2, arg4, arg14, arg5, arg11, arg10, arg12, arg1, arg13, arg3, arg0, arg9, arg15, arg8, arg7, arg6, 1, false);
			Static102.method1818();
			Static17.aBoolean15 = false;
			if (Static453.anInt7941 == 0) {
				Static117.aClass137_46.method7893();
			}
			if (Static453.anInt7941 == 1) {
				Static366.method5520();
			}
		}
		if (Static453.anInt7941 == 0) {
			Static45.anInterface23_1.method9042(Static637.anInt10654, Static256.anInt4522, Static503.anInt8861, Static496.anInt8827, 0, 0);
		}
		Static610.anInt10303++;
		Static317.method5009(Static620.aDouble22);
		Static440.aDouble20 = Static620.aDouble22;
		if (Static453.anInt7941 == 0 || Static453.anInt7941 == 2) {
			if (Static453.anInt7941 == 2) {
				Static117.aClass137_46.GA(Static496.anInt8830);
				Static117.aClass137_46.ya();
			}
			Static30.anInt777 = local21 + Static568.anInt9807 - Static637.anInt10654 - Static651.anInt10885;
			Static92.anInt2034 = local35;
			Static628.anInt10563 = local25 + Static599.anInt6159 - Static65.anInt1519 - Static256.anInt4522;
			Static510.anInt8986 = local37;
			Static117.aClass137_46.DA(Static30.anInt777, Static628.anInt10563, Static92.anInt2034, Static510.anInt8986);
		} else if (Static453.anInt7941 == 1) {
			Static92.anInt2034 = local35;
			Static628.anInt10563 = local25 - Static65.anInt1519;
			Static30.anInt777 = local21 - Static651.anInt10885;
			Static510.anInt8986 = local37;
			Static117.aClass137_46.DA(Static30.anInt777, Static628.anInt10563, Static92.anInt2034, Static510.anInt8986);
			Static117.aClass137_46.KA(Static637.anInt10654, Static256.anInt4522, Static637.anInt10654 + Static503.anInt8861, Static256.anInt4522 + Static496.anInt8827);
		}
		Static218.method3411(arg2, arg4, arg14, arg5, arg11, arg10, arg12, arg1, arg13, arg3, arg0, arg9, arg15, arg8, arg7, arg6, Static453.anInt7941 == 2 ? 0 : 2, Static453.anInt7941 == 1);
		Static117.aClass137_46.la();
		Static117.aClass137_46.DA(local21, local25, local29, local33);
	}
}
