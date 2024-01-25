import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!uba", name = "I", descriptor = "[Lclient!wga;")
	public static Class380[] aClass380Array1;

	@OriginalMember(owner = "client!uba", name = "M", descriptor = "I")
	public static int anInt9335;

	@OriginalMember(owner = "client!uba", name = "a", descriptor = "([[[BIIBIZ[IIZ[IIII[II[I[II)V")
	public static void method7930(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) boolean arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int arg7, @OriginalArg(9) int[] arg8, @OriginalArg(11) int arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int[] arg11, @OriginalArg(14) int arg12, @OriginalArg(15) int[] arg13, @OriginalArg(16) int[] arg14, @OriginalArg(17) int arg15) {
		if (Static518.anInt8368 == -1) {
			return;
		}
		@Pc(18) int[] local18 = Static613.aClass13_82.Y();
		@Pc(22) int local22 = local18[0];
		@Pc(26) int local26 = local18[1];
		@Pc(30) int local30 = local18[2];
		@Pc(34) int local34 = local18[3];
		@Pc(36) int local36 = local30;
		@Pc(38) int local38 = local34;
		if (Static518.anInt8368 == 1) {
			local36 = (int) ((double) Static631.anInt10242 * (double) local30 / (double) Static431.anInt7666);
			local38 = (int) ((double) local34 * (double) Static631.anInt10242 / (double) Static431.anInt7666);
		}
		if (!Static578.aBoolean673) {
			if (Static518.anInt8368 == 1) {
				Static614.method8571();
			}
			@Pc(75) int local75 = arg12 - Static205.anInt6722;
			@Pc(80) int local80 = arg4 - Static84.anInt2163;
			@Pc(85) int local85 = arg10 - Static170.anInt3463;
			@Pc(107) int local107 = (int) ((Static77.aDouble1 * (double) local85 + Static602.aDouble23 * (double) local80 + Static485.aDouble18 * (double) local75) * (double) local36 / (double) arg9);
			@Pc(129) int local129 = (int) (((double) local75 * Static460.aDouble15 + Static543.aDouble20 * (double) local80 + Static644.aDouble24 * (double) local85) * (double) local38 / (double) arg9);
			@Pc(144) double local144 = (double) local75 * Static600.aDouble22 + Static277.aDouble12 * (double) local80 + Static242.aDouble11 * (double) local85;
			@Pc(150) int local150 = local107 + Static514.anInt8278 - Static584.anInt9513;
			@Pc(157) int local157 = Static4.anInt49 + local129 - Static10.anInt143;
			@Pc(161) int local161 = Static75.anInt8430 + local150;
			@Pc(165) int local165 = local157 + Static631.anInt10242;
			if (local150 >= 0 && local157 >= 0 && local161 <= Static137.anInt2915 && Static431.anInt7666 >= local165 || Static518.anInt8368 == 2) {
				Static326.anInt5718 = local157;
				if (Static518.anInt8368 == 2) {
					Static531.aDouble19 = -local144;
				}
				Static239.anInt4434 = local150;
			} else if (local161 > 0 && local165 > 0 && Static137.anInt2915 > local150 && local157 < Static431.anInt7666) {
				@Pc(218) int local218 = local150 - Static514.anInt8278;
				@Pc(223) int local223 = local157 - Static4.anInt49;
				@Pc(225) int local225 = 0;
				@Pc(227) int local227 = 0;
				@Pc(229) int local229 = 0;
				@Pc(231) int local231 = 0;
				@Pc(233) double local233 = 0.0D;
				if (Static518.anInt8368 == 0) {
					local225 = local218;
					local233 = Static531.aDouble19 + local144;
					local227 = local223;
				} else if (Static518.anInt8368 == 1) {
					local231 = local223 / Static5.anInt108;
					local229 = local218 / Static456.anInt7437;
					local225 = local229 * Static456.anInt7437;
					local227 = Static5.anInt108 * local231;
					local233 = (double) (local225 * local218 + local223 * local227) * (Static531.aDouble19 + local144) / (double) (local218 * local218 + local223 * local223);
				}
				local233 = -local233;
				@Pc(294) int local294 = 0;
				@Pc(296) int local296 = 0;
				@Pc(298) int local298 = 0;
				@Pc(300) int local300 = 0;
				@Pc(302) int local302 = 0;
				@Pc(304) int local304 = 0;
				@Pc(318) int local318;
				@Pc(313) int local313;
				@Pc(315) int local315;
				@Pc(330) int local330;
				if (local225 < 0) {
					local313 = local225 + Static137.anInt2915;
					local315 = 0;
					local318 = -local225;
					if (Static518.anInt8368 == 1) {
						local302 = -local229;
						local298 = 0;
					}
					local330 = local318;
				} else {
					local313 = Static137.anInt2915 - local225;
					local318 = 0;
					if (Static518.anInt8368 == 1) {
						local302 = local229;
						local298 = Static294.anInt5311 - local229;
					}
					local330 = local225;
					local315 = local313;
				}
				@Pc(358) int local358;
				@Pc(362) int local362;
				@Pc(364) int local364;
				@Pc(366) int local366;
				@Pc(370) int local370;
				if (local227 < 0) {
					local358 = -local227;
					local362 = local227 + Static431.anInt7666;
					local364 = 0;
					local366 = local358;
					local370 = local358;
					if (Static518.anInt8368 == 1) {
						local296 = -local231;
						local294 = 0;
						local304 = Static259.anInt4870 + local231;
						local300 = local296;
					}
				} else {
					local362 = Static431.anInt7666 - local227;
					local358 = 0;
					local370 = 0;
					local366 = local227;
					local364 = local362;
					if (Static518.anInt8368 == 1) {
						local296 = local231;
						local294 = Static259.anInt4870 - local231;
						local300 = 0;
						local304 = local294;
					}
				}
				@Pc(418) Class19 local418 = Static391.aClass25_3.aClass19_1;
				@Pc(432) int local432;
				for (@Pc(423) Class16_Sub5 local423 = (Class16_Sub5) local418.method562(); local423 != null; local423 = (Class16_Sub5) local418.method558()) {
					@Pc(428) Class16_Sub10[] local428 = local423.aClass16_Sub10Array1;
					@Pc(430) boolean local430 = true;
					for (local432 = 0; local432 < local428.length; local432++) {
						@Pc(438) Class16_Sub10 local438 = local428[local432];
						@Pc(441) int local441 = local438.anInt10441;
						@Pc(444) int local444 = local438.anInt10438;
						@Pc(447) int local447 = local438.anInt10440;
						@Pc(450) int local450 = local438.anInt10439;
						@Pc(453) int local453 = local438.anInt10442;
						@Pc(459) int local459;
						local438.anInt10438 = local459 = local444 - local227;
						@Pc(467) int local467;
						local438.anInt10440 = local467 = local447 - local225;
						@Pc(475) int local475;
						local438.anInt10439 = local475 = local450 - local227;
						@Pc(483) int local483;
						local438.anInt10441 = local483 = local441 - local225;
						if (local430) {
							@Pc(496) int local496 = (local483 >= local467 ? local467 : local483) - local453;
							if (local496 <= Static137.anInt2915) {
								@Pc(512) int local512 = (local459 >= local475 ? local475 : local459) - local453;
								if (Static431.anInt7666 >= local512) {
									@Pc(528) int local528 = local453 + (local483 < local467 ? local467 : local483);
									if (local528 >= 0) {
										@Pc(542) int local542 = local453 + (local475 > local459 ? local475 : local459);
										if (local542 >= 0) {
											local430 = false;
										}
									}
								}
							}
						}
					}
					if (local430) {
						local423.method8874();
						Static274.method4473(local423);
					}
				}
				if (Static518.anInt8368 == 0) {
					Static613.aClass13_82.method8168(Static178.anInterface18_12);
				}
				Static613.aClass13_82.F(-local225, -local227);
				Static613.aClass13_82.b(local318, local358, local313, local362, local233);
				Static297.method4694(Static531.aDouble19 + local233);
				Static472.aDouble17 = Static531.aDouble19 + local233;
				if (Static518.anInt8368 == 1) {
					Static452.anInt7371 = local38;
					Static521.anInt8405 = local26 - local227 - Static10.anInt143;
					Static462.anInt7475 = local36;
					Static303.anInt5455 = local22 - Static584.anInt9513 - local225;
					Static613.aClass13_82.DA(Static303.anInt5455, Static521.anInt8405, Static462.anInt7475, Static452.anInt7371);
				} else {
					Static462.anInt7475 = local36;
					Static303.anInt5455 = local22 + Static514.anInt8278 - local225 - Static584.anInt9513;
					Static521.anInt8405 = local26 + Static4.anInt49 - Static10.anInt143 - local227;
					Static452.anInt7371 = local38;
					Static613.aClass13_82.DA(Static303.anInt5455, Static521.anInt8405, Static462.anInt7475, Static452.anInt7371);
				}
				Static232.method3730(Static391.aClass25_3);
				if (local366 > 0) {
					Static613.aClass13_82.KA(0, local364, Static137.anInt2915, local364 + local366);
					Static613.aClass13_82.ya();
					Static613.aClass13_82.GA(Static520.anInt8395);
					Static304.method4768(arg1, arg12, arg4, arg10, arg0, arg6, arg13, arg11, arg14, arg8, arg7, arg3, arg15, arg2, arg5, arg9, 1, false);
				}
				if (local330 > 0) {
					Static613.aClass13_82.KA(local315, local370, local315 + local330, local370 + local362);
					Static613.aClass13_82.ya();
					Static613.aClass13_82.GA(Static520.anInt8395);
					Static304.method4768(arg1, arg12, arg4, arg10, arg0, arg6, arg13, arg11, arg14, arg8, arg7, arg3, arg15, arg2, arg5, arg9, 1, false);
				}
				Static613.aClass13_82.la();
				Static427.method6222();
				if (Static518.anInt8368 == 0) {
					Static613.aClass13_82.method8094();
				}
				Static584.anInt9513 += local225;
				Static10.anInt143 += local227;
				Static531.aDouble19 += local233;
				Static326.anInt5718 = local129 + Static4.anInt49 - Static10.anInt143;
				Static239.anInt4434 = Static514.anInt8278 + local107 - Static584.anInt9513;
				if (Static518.anInt8368 == 1) {
					Static173.anInt3502 += local231;
					Static259.anInt4871 += local229;
					for (@Pc(784) int local784 = 0; local784 < Static259.anInt4870; local784++) {
						@Pc(795) int local795 = Static123.method2207(Static173.anInt3502 + local784, Static259.anInt4870) * Static294.anInt5311;
						for (local432 = 0; local432 < Static294.anInt5311; local432++) {
							@Pc(811) int local811 = local795 + Static123.method2207(Static259.anInt4871 + local432, Static294.anInt5311);
							@Pc(852) boolean local852 = local294 <= local784 && local784 < local294 + local296 || local300 <= local784 && local784 < local300 + local304 && local432 >= local298 && local432 < local298 + local302;
							Static65.anInterface18Array1[local811].method8674(Static456.anInt7437 * local432, local784 * Static5.anInt108, Static456.anInt7437, Static5.anInt108, local852);
						}
					}
				}
			} else {
				Static578.aBoolean673 = true;
			}
		}
		if (Static578.aBoolean673) {
			Static326.anInt5718 = Static4.anInt49;
			Static205.anInt6722 = arg12;
			Static239.anInt4434 = Static514.anInt8278;
			Static584.anInt9513 = 0;
			Static10.anInt143 = 0;
			Static170.anInt3463 = arg10;
			Static84.anInt2163 = arg4;
			Static531.aDouble19 = 0.0D;
			if (Static518.anInt8368 == 0) {
				Static613.aClass13_82.method8168(Static178.anInterface18_12);
			}
			Static613.aClass13_82.la();
			Static613.aClass13_82.ya();
			Static613.aClass13_82.GA(Static520.anInt8395);
			Static605.aClass51_10.method6716(Static205.anInt6722, Static84.anInt2163, Static170.anInt3463, Static612.anInt8415, Static595.anInt9885, Static129.anInt2698);
			Static613.aClass13_82.method8138(Static605.aClass51_10);
			if (Static518.anInt8368 == 1) {
				Static521.anInt8405 = local26;
				Static452.anInt7371 = local38;
				Static303.anInt5455 = local22;
				Static462.anInt7475 = local36;
				Static613.aClass13_82.DA(Static303.anInt5455, Static521.anInt8405, Static462.anInt7475, Static452.anInt7371);
			} else {
				Static303.anInt5455 = local22 + Static514.anInt8278;
				Static452.anInt7371 = local38;
				Static462.anInt7475 = local36;
				Static521.anInt8405 = local26 + Static4.anInt49;
				Static613.aClass13_82.DA(Static303.anInt5455, Static521.anInt8405, Static462.anInt7475, Static452.anInt7371);
			}
			Static472.aDouble17 = 0.0D;
			Static391.aClass25_3.method632();
			Static232.method3730(Static391.aClass25_3);
			Static304.method4768(arg1, arg12, arg4, arg10, arg0, arg6, arg13, arg11, arg14, arg8, arg7, arg3, arg15, arg2, arg5, arg9, 1, false);
			Static427.method6222();
			Static578.aBoolean673 = false;
			if (Static518.anInt8368 == 0) {
				Static613.aClass13_82.method8094();
			}
			if (Static518.anInt8368 == 1) {
				Static192.method3286();
			}
		}
		if (Static518.anInt8368 == 0) {
			Static178.anInterface18_12.method8673(Static239.anInt4434, Static326.anInt5718, Static75.anInt8430, Static631.anInt10242, 0, 0);
		}
		Static498.anInt7911++;
		Static297.method4694(Static531.aDouble19);
		Static398.aDouble14 = Static531.aDouble19;
		if (Static518.anInt8368 == 0 || Static518.anInt8368 == 2) {
			if (Static518.anInt8368 == 2) {
				Static613.aClass13_82.GA(Static520.anInt8395);
				Static613.aClass13_82.ya();
			}
			Static316.anInt5592 = Static514.anInt8278 + local22 - Static584.anInt9513 - Static239.anInt4434;
			Static522.anInt8441 = local38;
			Static314.anInt5576 = local36;
			Static296.anInt5347 = local26 + Static4.anInt49 - Static10.anInt143 - Static326.anInt5718;
			Static613.aClass13_82.DA(Static316.anInt5592, Static296.anInt5347, Static314.anInt5576, Static522.anInt8441);
		} else if (Static518.anInt8368 == 1) {
			Static314.anInt5576 = local36;
			Static522.anInt8441 = local38;
			Static316.anInt5592 = local22 - Static584.anInt9513;
			Static296.anInt5347 = local26 - Static10.anInt143;
			Static613.aClass13_82.DA(Static316.anInt5592, Static296.anInt5347, Static314.anInt5576, Static522.anInt8441);
			Static613.aClass13_82.KA(Static239.anInt4434, Static326.anInt5718, Static239.anInt4434 + Static75.anInt8430, Static631.anInt10242 + Static326.anInt5718);
		}
		Static304.method4768(arg1, arg12, arg4, arg10, arg0, arg6, arg13, arg11, arg14, arg8, arg7, arg3, arg15, arg2, arg5, arg9, Static518.anInt8368 == 2 ? 0 : 2, Static518.anInt8368 == 1);
		Static613.aClass13_82.la();
		Static613.aClass13_82.DA(local22, local26, local30, local34);
	}

	@OriginalMember(owner = "client!uba", name = "e", descriptor = "(I)V")
	public static void method7932() {
		for (@Pc(13) int local13 = 0; local13 < 100; local13++) {
			Static377.aBooleanArray14[local13] = true;
		}
	}
}
