import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static465 {

	@OriginalMember(owner = "client!qa", name = "t", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_71 = new Class187(0, -1);

	@OriginalMember(owner = "client!qa", name = "u", descriptor = "Lclient!jo;")
	public static final Class187 aClass187_72 = new Class187(54, 7);

	@OriginalMember(owner = "client!qa", name = "v", descriptor = "I")
	public static int anInt8114 = -1;

	@OriginalMember(owner = "client!qa", name = "w", descriptor = "I")
	public static int anInt8115 = 0;

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[F)[F")
	public static float[] method6885(@OriginalArg(0) int arg0, @OriginalArg(2) float[] arg1) {
		@Pc(11) float[] local11 = new float[arg0];
		Static685.method8326(arg1, 0, local11, 0, arg0);
		return local11;
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZIZ[[[BIIIIB[I[I[I[I[IIBII)V")
	public static void method6889(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) byte[][][] arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) byte arg7, @OriginalArg(9) int[] arg8, @OriginalArg(10) int[] arg9, @OriginalArg(11) int[] arg10, @OriginalArg(12) int[] arg11, @OriginalArg(13) int[] arg12, @OriginalArg(14) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) int arg15) {
		if (Static634.anInt10113 == -1) {
			return;
		}
		@Pc(11) int[] local11 = Static371.aClass143_7.Y();
		@Pc(15) int local15 = local11[0];
		@Pc(19) int local19 = local11[1];
		@Pc(23) int local23 = local11[2];
		@Pc(27) int local27 = local11[3];
		@Pc(33) int local33 = local23;
		@Pc(35) int local35 = local27;
		if (Static634.anInt10113 == 1) {
			local33 = (int) ((double) Static622.anInt9017 * (double) local23 / (double) Static584.anInt9612);
			local35 = (int) ((double) local27 * (double) Static622.anInt9017 / (double) Static584.anInt9612);
		}
		if (!Static677.aBoolean794) {
			if (Static634.anInt10113 == 1) {
				Static72.method7645();
			}
			@Pc(69) int local69 = arg15 - Static376.anInt6563;
			@Pc(74) int local74 = arg14 - Static604.anInt3971;
			@Pc(79) int local79 = arg3 - Static312.anInt5532;
			@Pc(101) int local101 = (int) ((double) local33 * (Static423.aDouble16 * (double) local79 + (double) local74 * Static561.aDouble20 + Static97.aDouble6 * (double) local69) / (double) arg5);
			@Pc(123) int local123 = (int) ((double) local35 * (Static28.aDouble1 * (double) local69 + (double) local74 * Static181.aDouble9 + Static420.aDouble15 * (double) local79) / (double) arg5);
			@Pc(138) double local138 = (double) local79 * Static56.aDouble5 + Static131.aDouble7 * (double) local74 + Static143.aDouble8 * (double) local69;
			@Pc(146) int local146 = Static665.anInt7246 + local101 - Static50.anInt765;
			@Pc(153) int local153 = local123 + Static320.anInt10345 - Static199.anInt3224;
			@Pc(157) int local157 = Static630.anInt10065 + local146;
			@Pc(161) int local161 = Static622.anInt9017 + local153;
			if (local146 >= 0 && local153 >= 0 && local157 <= Static275.anInt4317 && local161 <= Static584.anInt9612 || Static634.anInt10113 == 2) {
				Static435.anInt7679 = local146;
				Static437.anInt7720 = local153;
				if (Static634.anInt10113 == 2) {
					Static309.aDouble11 = -local138;
				}
			} else if (local157 > 0 && local161 > 0 && local146 < Static275.anInt4317 && local153 < Static584.anInt9612) {
				@Pc(208) int local208 = local146 - Static665.anInt7246;
				@Pc(213) int local213 = local153 - Static320.anInt10345;
				@Pc(215) int local215 = 0;
				@Pc(217) int local217 = 0;
				@Pc(219) int local219 = 0;
				@Pc(221) int local221 = 0;
				@Pc(223) double local223 = 0.0D;
				if (Static634.anInt10113 == 0) {
					local223 = Static309.aDouble11 + local138;
					local217 = local213;
					local215 = local208;
				} else if (Static634.anInt10113 == 1) {
					local221 = local213 / Static77.anInt1204;
					local219 = local208 / Static586.anInt9622;
					local217 = Static77.anInt1204 * local221;
					local215 = local219 * Static586.anInt9622;
					local223 = (double) (local217 * local213 + local208 * local215) * (local138 + Static309.aDouble11) / (double) (local208 * local208 + local213 * local213);
				}
				local223 = -local223;
				@Pc(286) int local286 = 0;
				@Pc(288) int local288 = 0;
				@Pc(290) int local290 = 0;
				@Pc(292) int local292 = 0;
				@Pc(294) int local294 = 0;
				@Pc(305) int local305;
				@Pc(303) int local303;
				@Pc(316) int local316;
				@Pc(318) int local318;
				if (local215 >= 0) {
					local303 = Static275.anInt4317 - local215;
					local305 = 0;
					if (Static634.anInt10113 == 1) {
						local290 = Static449.anInt7857 - local219;
						local294 = local219;
					}
					local316 = local303;
					local318 = local215;
				} else {
					local316 = 0;
					local303 = Static275.anInt4317 + local215;
					local305 = -local215;
					local318 = local305;
					if (Static634.anInt10113 == 1) {
						local290 = 0;
						local294 = -local219;
					}
				}
				@Pc(340) int local340 = 0;
				@Pc(347) int local347;
				@Pc(352) int local352;
				@Pc(354) int local354;
				@Pc(374) int local374;
				@Pc(376) int local376;
				if (local217 >= 0) {
					local347 = 0;
					local352 = Static584.anInt9612 - local217;
					local354 = local352;
					if (Static634.anInt10113 == 1) {
						local286 = Static259.anInt4111 - local221;
						local288 = local221;
						local292 = 0;
						local340 = local286;
					}
					local374 = local217;
					local376 = 0;
				} else {
					local347 = -local217;
					local352 = local217 + Static584.anInt9612;
					local354 = 0;
					local374 = local347;
					local376 = local347;
					if (Static634.anInt10113 == 1) {
						local286 = 0;
						local288 = -local221;
						local292 = local288;
						local340 = Static259.anInt4111 + local221;
					}
				}
				@Pc(412) Class102 local412 = Static559.aClass89_3.aClass102_1;
				@Pc(425) int local425;
				for (@Pc(417) Class41_Sub3 local417 = (Class41_Sub3) local412.method2062(); local417 != null; local417 = (Class41_Sub3) local412.method2054()) {
					@Pc(421) Class41_Sub9[] local421 = local417.aClass41_Sub9Array1;
					@Pc(423) boolean local423 = true;
					for (local425 = 0; local425 < local421.length; local425++) {
						@Pc(430) Class41_Sub9 local430 = local421[local425];
						@Pc(433) int local433 = local430.anInt8965;
						@Pc(436) int local436 = local430.anInt8966;
						@Pc(439) int local439 = local430.anInt8964;
						@Pc(442) int local442 = local430.anInt8963;
						@Pc(445) int local445 = local430.anInt8962;
						@Pc(451) int local451;
						local430.anInt8965 = local451 = local433 - local215;
						@Pc(458) int local458;
						local430.anInt8963 = local458 = local442 - local217;
						@Pc(466) int local466;
						local430.anInt8964 = local466 = local439 - local215;
						@Pc(474) int local474;
						local430.anInt8966 = local474 = local436 - local217;
						if (local423) {
							@Pc(490) int local490 = (local451 < local466 ? local451 : local466) - local445;
							if (local490 <= Static275.anInt4317) {
								@Pc(502) int local502 = (local458 > local474 ? local474 : local458) - local445;
								if (Static584.anInt9612 >= local502) {
									@Pc(522) int local522 = local445 + (local466 <= local451 ? local451 : local466);
									if (local522 >= 0) {
										@Pc(536) int local536 = local445 + (local458 > local474 ? local458 : local474);
										if (local536 >= 0) {
											local423 = false;
										}
									}
								}
							}
						}
					}
					if (local423) {
						local417.method8644();
						Static492.method5401(local417);
					}
				}
				if (Static634.anInt10113 == 0) {
					Static371.aClass143_7.method6250(Static150.anInterface2_1);
				}
				Static371.aClass143_7.F(-local215, -local217);
				Static371.aClass143_7.b(local305, local347, local303, local352, local223);
				Static53.method3583(Static309.aDouble11 + local223);
				Static162.aDouble17 = local223 + Static309.aDouble11;
				if (Static634.anInt10113 == 1) {
					Static29.anInt403 = local33;
					Static89.anInt1481 = local15 - Static50.anInt765 - local215;
					Static27.anInt370 = local19 - Static199.anInt3224 - local217;
					Static18.anInt262 = local35;
					Static371.aClass143_7.DA(Static89.anInt1481, Static27.anInt370, Static29.anInt403, Static18.anInt262);
				} else {
					Static89.anInt1481 = Static665.anInt7246 + local15 - local215 - Static50.anInt765;
					Static29.anInt403 = local33;
					Static18.anInt262 = local35;
					Static27.anInt370 = local19 + Static320.anInt10345 - Static199.anInt3224 - local217;
					Static371.aClass143_7.DA(Static89.anInt1481, Static27.anInt370, Static29.anInt403, Static18.anInt262);
				}
				Static245.method3495(Static559.aClass89_3);
				if (local374 > 0) {
					Static371.aClass143_7.KA(0, local354, Static275.anInt4317, local374 + local354);
					Static371.aClass143_7.ya();
					Static371.aClass143_7.GA(Static625.anInt10018);
					Static126.method1978(arg6, arg15, arg14, arg3, arg2, arg9, arg8, arg11, arg10, arg12, arg4, arg7, arg13, arg1, arg0, arg5, 1, false);
				}
				if (local318 > 0) {
					Static371.aClass143_7.KA(local316, local376, local316 + local318, local376 + local352);
					Static371.aClass143_7.ya();
					Static371.aClass143_7.GA(Static625.anInt10018);
					Static126.method1978(arg6, arg15, arg14, arg3, arg2, arg9, arg8, arg11, arg10, arg12, arg4, arg7, arg13, arg1, arg0, arg5, 1, false);
				}
				Static371.aClass143_7.la();
				Static568.method7800();
				if (Static634.anInt10113 == 0) {
					Static371.aClass143_7.method6198();
				}
				Static309.aDouble11 += local223;
				Static199.anInt3224 += local217;
				Static50.anInt765 += local215;
				Static435.anInt7679 = local101 + Static665.anInt7246 - Static50.anInt765;
				Static437.anInt7720 = Static320.anInt10345 + local123 - Static199.anInt3224;
				if (Static634.anInt10113 == 1) {
					Static606.anInt9804 += local219;
					Static675.anInt10637 += local221;
					for (@Pc(768) int local768 = 0; local768 < Static259.anInt4111; local768++) {
						@Pc(778) int local778 = Static460.method6810(Static259.anInt4111, Static675.anInt10637 + local768) * Static449.anInt7857;
						for (local425 = 0; local425 < Static449.anInt7857; local425++) {
							@Pc(791) int local791 = local778 + Static460.method6810(Static449.anInt7857, Static606.anInt9804 + local425);
							@Pc(835) boolean local835 = local286 <= local768 && local286 + local288 > local768 || local768 >= local292 && local768 < local340 + local292 && local425 >= local290 && local294 + local290 > local425;
							Static368.anInterface2Array1[local791].method8514(Static586.anInt9622 * local425, local768 * Static77.anInt1204, Static586.anInt9622, Static77.anInt1204, local835);
						}
					}
				}
			} else {
				Static677.aBoolean794 = true;
			}
		}
		if (Static677.aBoolean794) {
			Static437.anInt7720 = Static320.anInt10345;
			Static435.anInt7679 = Static665.anInt7246;
			Static312.anInt5532 = arg3;
			Static50.anInt765 = 0;
			Static199.anInt3224 = 0;
			Static376.anInt6563 = arg15;
			Static309.aDouble11 = 0.0D;
			Static604.anInt3971 = arg14;
			if (Static634.anInt10113 == 0) {
				Static371.aClass143_7.method6250(Static150.anInterface2_1);
			}
			Static371.aClass143_7.la();
			Static371.aClass143_7.ya();
			Static371.aClass143_7.GA(Static625.anInt10018);
			Static448.aClass56_10.method8388(Static376.anInt6563, Static604.anInt3971, Static312.anInt5532, Static617.anInt9945, Static171.anInt2824, Static288.anInt4507);
			Static371.aClass143_7.method6222(Static448.aClass56_10);
			if (Static634.anInt10113 == 1) {
				Static18.anInt262 = local35;
				Static27.anInt370 = local19;
				Static89.anInt1481 = local15;
				Static29.anInt403 = local33;
				Static371.aClass143_7.DA(Static89.anInt1481, Static27.anInt370, Static29.anInt403, Static18.anInt262);
			} else {
				Static27.anInt370 = Static320.anInt10345 + local19;
				Static29.anInt403 = local33;
				Static89.anInt1481 = Static665.anInt7246 + local15;
				Static18.anInt262 = local35;
				Static371.aClass143_7.DA(Static89.anInt1481, Static27.anInt370, Static29.anInt403, Static18.anInt262);
			}
			Static162.aDouble17 = 0.0D;
			Static559.aClass89_3.method1907();
			Static245.method3495(Static559.aClass89_3);
			Static126.method1978(arg6, arg15, arg14, arg3, arg2, arg9, arg8, arg11, arg10, arg12, arg4, arg7, arg13, arg1, arg0, arg5, 1, false);
			Static568.method7800();
			Static677.aBoolean794 = false;
			if (Static634.anInt10113 == 0) {
				Static371.aClass143_7.method6198();
			}
			if (Static634.anInt10113 == 1) {
				Static284.method3901();
			}
		}
		if (Static634.anInt10113 == 0) {
			Static150.anInterface2_1.method8515(Static435.anInt7679, Static437.anInt7720, Static630.anInt10065, Static622.anInt9017, 0, 0);
		}
		Static244.anInt3958++;
		Static53.method3583(Static309.aDouble11);
		Static473.aDouble19 = Static309.aDouble11;
		if (Static634.anInt10113 == 0 || Static634.anInt10113 == 2) {
			if (Static634.anInt10113 == 2) {
				Static371.aClass143_7.GA(Static625.anInt10018);
				Static371.aClass143_7.ya();
			}
			Static462.anInt8052 = local33;
			Static650.anInt10264 = local15 + Static665.anInt7246 - Static435.anInt7679 - Static50.anInt765;
			Static77.anInt1205 = Static320.anInt10345 + local19 - Static199.anInt3224 - Static437.anInt7720;
			Static255.anInt4082 = local35;
			Static371.aClass143_7.DA(Static650.anInt10264, Static77.anInt1205, Static462.anInt8052, Static255.anInt4082);
		} else if (Static634.anInt10113 == 1) {
			Static462.anInt8052 = local33;
			Static650.anInt10264 = local15 - Static50.anInt765;
			Static255.anInt4082 = local35;
			Static77.anInt1205 = local19 - Static199.anInt3224;
			Static371.aClass143_7.DA(Static650.anInt10264, Static77.anInt1205, Static462.anInt8052, Static255.anInt4082);
			Static371.aClass143_7.KA(Static435.anInt7679, Static437.anInt7720, Static630.anInt10065 + Static435.anInt7679, Static437.anInt7720 - -Static622.anInt9017);
		}
		Static126.method1978(arg6, arg15, arg14, arg3, arg2, arg9, arg8, arg11, arg10, arg12, arg4, arg7, arg13, arg1, arg0, arg5, Static634.anInt10113 == 2 ? 0 : 2, Static634.anInt10113 == 1);
		Static371.aClass143_7.la();
		Static371.aClass143_7.DA(local15, local19, local23, local27);
	}

	@OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lclient!r;III[Z)V")
	public static void method6890(@OriginalArg(0) Class5_Sub2_Sub7 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static298.aClass88Array3 == Static176.aClass88Array1) {
			return;
		}
		@Pc(10) int local10 = Static230.aClass88Array2[arg1].method8753(arg2, arg3);
		for (@Pc(12) int local12 = 0; local12 <= arg1; local12++) {
			if (arg4 == null || arg4[local12]) {
				@Pc(23) Class88 local23 = Static230.aClass88Array2[local12];
				if (local23 != null) {
					local23.wa(arg0, arg2, local10 - local23.method8753(arg2, arg3), arg3, 0, false);
				}
			}
		}
	}
}
