import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!fia", name = "i", descriptor = "I")
	public static int anInt10797;

	@OriginalMember(owner = "client!fia", name = "f", descriptor = "Lclient!pga;")
	public static Class289 aClass289_18;

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "Lclient!oh;")
	public static Class273 aClass273_18 = null;

	@OriginalMember(owner = "client!fia", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString127 = null;

	@OriginalMember(owner = "client!fia", name = "l", descriptor = "Z")
	public static boolean aBoolean928 = false;

	@OriginalMember(owner = "client!fia", name = "k", descriptor = "Lclient!hb;")
	public static final Class146 aClass146_10 = new Class146();

	@OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
	public static int anInt10800 = 0;

	@OriginalMember(owner = "client!fia", name = "m", descriptor = "I")
	public static int anInt10801 = 0;

	@OriginalMember(owner = "client!fia", name = "b", descriptor = "Lclient!al;")
	public static final Class18 aClass18_16 = new Class18();

	@OriginalMember(owner = "client!fia", name = "a", descriptor = "(BIIIII[I[I[IZI[II[IZII[[[B)V")
	public static void method9431(@OriginalArg(0) byte arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int[] arg5, @OriginalArg(7) int[] arg6, @OriginalArg(8) int[] arg7, @OriginalArg(10) int arg8, @OriginalArg(11) int[] arg9, @OriginalArg(12) int arg10, @OriginalArg(13) int[] arg11, @OriginalArg(14) boolean arg12, @OriginalArg(15) int arg13, @OriginalArg(16) int arg14, @OriginalArg(17) byte[][][] arg15) {
		if (Static240.anInt10701 == -1) {
			return;
		}
		@Pc(38) int[] local38 = Static614.aClass145_14.Y();
		@Pc(42) int local42 = local38[0];
		@Pc(46) int local46 = local38[1];
		@Pc(50) int local50 = local38[2];
		@Pc(54) int local54 = local38[3];
		@Pc(56) int local56 = local50;
		@Pc(58) int local58 = local54;
		if (Static240.anInt10701 == 1) {
			local56 = (int) ((double) Static72.anInt1263 * (double) local50 / (double) Static23.anInt6817);
			local58 = (int) ((double) local54 * (double) Static72.anInt1263 / (double) Static23.anInt6817);
		}
		if (!Static415.aBoolean615) {
			if (Static240.anInt10701 == 1) {
				Static427.method6251();
			}
			@Pc(101) int local101 = arg1 - Static183.anInt3038;
			@Pc(106) int local106 = arg2 - Static718.anInt10948;
			@Pc(110) int local110 = arg8 - Static52.anInt862;
			@Pc(132) int local132 = (int) ((Static399.aDouble34 * (double) local110 + Static495.aDouble42 * (double) local101 + Static433.aDouble59 * (double) local106) * (double) local56 / (double) arg13);
			@Pc(154) int local154 = (int) ((Static205.aDouble19 * (double) local101 + Static305.aDouble14 * (double) local106 + Static68.aDouble8 * (double) local110) * (double) local58 / (double) arg13);
			@Pc(169) double local169 = Static337.aDouble30 * (double) local110 + (double) local101 * Static360.aDouble33 + Static181.aDouble17 * (double) local106;
			@Pc(176) int local176 = local132 + Static511.anInt8135 - Static336.anInt5168;
			@Pc(184) int local184 = Static581.anInt9169 + local154 - Static182.anInt10957;
			@Pc(188) int local188 = Static482.anInt7726 + local176;
			@Pc(192) int local192 = local184 + Static72.anInt1263;
			if (local176 >= 0 && local184 >= 0 && Static501.anInt5842 >= local188 && Static23.anInt6817 >= local192 || Static240.anInt10701 == 2) {
				Static368.anInt5900 = local184;
				Static15.anInt227 = local176;
				if (Static240.anInt10701 == 2) {
					Static195.aDouble18 = -local169;
				}
			} else if (local188 > 0 && local192 > 0 && Static501.anInt5842 > local176 && local184 < Static23.anInt6817) {
				@Pc(265) int local265 = local176 - Static511.anInt8135;
				@Pc(270) int local270 = local184 - Static581.anInt9169;
				@Pc(272) int local272 = 0;
				@Pc(274) int local274 = 0;
				@Pc(276) int local276 = 0;
				@Pc(278) int local278 = 0;
				@Pc(280) double local280 = 0.0D;
				if (Static240.anInt10701 == 0) {
					local272 = local265;
					local280 = local169 + Static195.aDouble18;
					local274 = local270;
				} else if (Static240.anInt10701 == 1) {
					local276 = local265 / Static405.anInt6687;
					local278 = local270 / Static136.anInt2255;
					local274 = Static136.anInt2255 * local278;
					local272 = local276 * Static405.anInt6687;
					local280 = (double) (local265 * local272 + local274 * local270) * (Static195.aDouble18 + local169) / (double) (local270 * local270 + local265 * local265);
				}
				local280 = -local280;
				@Pc(346) int local346 = 0;
				@Pc(348) int local348 = 0;
				@Pc(350) int local350 = 0;
				@Pc(352) int local352 = 0;
				@Pc(354) int local354 = 0;
				@Pc(358) int local358;
				@Pc(363) int local363;
				@Pc(365) int local365;
				@Pc(377) int local377;
				if (local272 >= 0) {
					local358 = 0;
					local363 = Static501.anInt5842 - local272;
					local365 = local363;
					if (Static240.anInt10701 == 1) {
						local354 = local276;
						local350 = Static59.anInt1029 - local276;
					}
					local377 = local272;
				} else {
					local365 = 0;
					local363 = local272 + Static501.anInt5842;
					local358 = -local272;
					if (Static240.anInt10701 == 1) {
						local354 = -local276;
						local350 = 0;
					}
					local377 = local358;
				}
				@Pc(402) int local402 = 0;
				@Pc(410) int local410;
				@Pc(417) int local417;
				@Pc(412) int local412;
				@Pc(419) int local419;
				@Pc(423) int local423;
				if (local274 < 0) {
					local410 = -local274;
					local412 = 0;
					local417 = Static23.anInt6817 + local274;
					local419 = local410;
					local423 = local410;
					if (Static240.anInt10701 == 1) {
						local348 = -local278;
						local346 = 0;
						local402 = Static331.anInt5059 + local278;
						local352 = local348;
					}
				} else {
					local410 = 0;
					local417 = Static23.anInt6817 - local274;
					if (Static240.anInt10701 == 1) {
						local346 = Static331.anInt5059 - local278;
						local348 = local278;
						local352 = 0;
						local402 = local346;
					}
					local412 = local417;
					local423 = 0;
					local419 = local274;
				}
				@Pc(475) Class320 local475 = Static247.aClass52_1.aClass320_1;
				@Pc(491) int local491;
				for (@Pc(482) Class4_Sub8 local482 = (Class4_Sub8) local475.method7605(); local482 != null; local482 = (Class4_Sub8) local475.method7608()) {
					@Pc(487) Class4_Sub6[] local487 = local482.aClass4_Sub6Array1;
					@Pc(489) boolean local489 = true;
					for (local491 = 0; local491 < local487.length; local491++) {
						@Pc(497) Class4_Sub6 local497 = local487[local491];
						@Pc(500) int local500 = local497.anInt2724;
						@Pc(503) int local503 = local497.anInt2725;
						@Pc(506) int local506 = local497.anInt2722;
						@Pc(509) int local509 = local497.anInt2726;
						@Pc(515) int local515;
						local497.anInt2724 = local515 = local500 - local272;
						@Pc(523) int local523;
						local497.anInt2722 = local523 = local506 - local272;
						@Pc(530) int local530;
						local497.anInt2726 = local530 = local509 - local274;
						@Pc(534) int local534 = local497.anInt2723;
						@Pc(541) int local541;
						local497.anInt2725 = local541 = local503 - local274;
						if (local489) {
							@Pc(561) int local561 = (local515 < local523 ? local515 : local523) - local534;
							if (Static501.anInt5842 >= local561) {
								@Pc(580) int local580 = (local530 > local541 ? local541 : local530) - local534;
								if (Static23.anInt6817 >= local580) {
									@Pc(600) int local600 = (local515 < local523 ? local523 : local515) + local534;
									if (local600 >= 0) {
										@Pc(615) int local615 = (local530 <= local541 ? local541 : local530) + local534;
										if (local615 >= 0) {
											local489 = false;
										}
									}
								}
							}
						}
					}
					if (local489) {
						local482.method9416();
						Static525.method7392(local482);
					}
				}
				if (Static240.anInt10701 == 0) {
					Static614.aClass145_14.method9658(Static136.anInterface1_1);
				}
				Static614.aClass145_14.F(-local272, -local274);
				Static614.aClass145_14.b(local358, local410, local363, local417, local280);
				Static697.method9376(local280 + Static195.aDouble18);
				Static12.aDouble1 = local280 + Static195.aDouble18;
				if (Static240.anInt10701 == 1) {
					Static491.anInt7889 = local56;
					Static478.anInt7690 = local42 - local272 - Static336.anInt5168;
					Static595.anInt7807 = local46 - local274 - Static182.anInt10957;
					Static236.anInt3726 = local58;
					Static614.aClass145_14.DA(Static478.anInt7690, Static595.anInt7807, Static491.anInt7889, Static236.anInt3726);
				} else {
					Static595.anInt7807 = local46 + Static581.anInt9169 - local274 - Static182.anInt10957;
					Static236.anInt3726 = local58;
					Static478.anInt7690 = local42 + Static511.anInt8135 - local272 - Static336.anInt5168;
					Static491.anInt7889 = local56;
					Static614.aClass145_14.DA(Static478.anInt7690, Static595.anInt7807, Static491.anInt7889, Static236.anInt3726);
				}
				Static555.method7748(Static247.aClass52_1);
				if (local419 > 0) {
					Static614.aClass145_14.KA(0, local412, Static501.anInt5842, local412 + local419);
					Static614.aClass145_14.ya();
					Static614.aClass145_14.GA(Static55.anInt898);
					Static661.method9038(arg3, arg1, arg2, arg8, arg15, arg9, arg11, arg6, arg7, arg5, arg4, arg0, arg10, arg14, arg12, arg13, 1, false);
				}
				if (local377 > 0) {
					Static614.aClass145_14.KA(local365, local423, local377 + local365, local423 + local417);
					Static614.aClass145_14.ya();
					Static614.aClass145_14.GA(Static55.anInt898);
					Static661.method9038(arg3, arg1, arg2, arg8, arg15, arg9, arg11, arg6, arg7, arg5, arg4, arg0, arg10, arg14, arg12, arg13, 1, false);
				}
				Static614.aClass145_14.la();
				Static337.method4693();
				if (Static240.anInt10701 == 0) {
					Static614.aClass145_14.method9706();
				}
				Static336.anInt5168 += local272;
				Static195.aDouble18 += local280;
				Static182.anInt10957 += local274;
				Static15.anInt227 = local132 + Static511.anInt8135 - Static336.anInt5168;
				Static368.anInt5900 = local154 + Static581.anInt9169 - Static182.anInt10957;
				if (Static240.anInt10701 == 1) {
					Static368.anInt5896 += local278;
					Static466.anInt7550 += local276;
					for (@Pc(878) int local878 = 0; local878 < Static331.anInt5059; local878++) {
						@Pc(889) int local889 = Static450.method6579(Static368.anInt5896 + local878, Static331.anInt5059) * Static59.anInt1029;
						for (local491 = 0; local491 < Static59.anInt1029; local491++) {
							@Pc(903) int local903 = local889 + Static450.method6579(Static466.anInt7550 + local491, Static59.anInt1029);
							@Pc(951) boolean local951 = local346 <= local878 && local878 < local346 + local348 || local878 >= local352 && local352 + local402 > local878 && local350 <= local491 && local354 + local350 > local491;
							Class4_Sub2_Sub1_Sub1.lb[local903].method9367(Static405.anInt6687 * local491, local878 * Static136.anInt2255, Static405.anInt6687, Static136.anInt2255, local951);
						}
					}
				}
			} else {
				Static415.aBoolean615 = true;
			}
		}
		if (Static415.aBoolean615) {
			Static15.anInt227 = Static511.anInt8135;
			Static195.aDouble18 = 0.0D;
			Static368.anInt5900 = Static581.anInt9169;
			Static52.anInt862 = arg8;
			Static183.anInt3038 = arg1;
			Static336.anInt5168 = 0;
			Static182.anInt10957 = 0;
			Static718.anInt10948 = arg2;
			if (Static240.anInt10701 == 0) {
				Static614.aClass145_14.method9658(Static136.anInterface1_1);
			}
			Static614.aClass145_14.la();
			Static614.aClass145_14.ya();
			Static614.aClass145_14.GA(Static55.anInt898);
			Static499.aClass86_7.method7021(Static183.anInt3038, Static718.anInt10948, Static52.anInt862, Static682.anInt11017, Static642.anInt9853, Static470.anInt7566);
			Static614.aClass145_14.method9656(Static499.aClass86_7);
			if (Static240.anInt10701 == 1) {
				Static236.anInt3726 = local58;
				Static491.anInt7889 = local56;
				Static478.anInt7690 = local42;
				Static595.anInt7807 = local46;
				Static614.aClass145_14.DA(Static478.anInt7690, Static595.anInt7807, Static491.anInt7889, Static236.anInt3726);
			} else {
				Static478.anInt7690 = Static511.anInt8135 + local42;
				Static491.anInt7889 = local56;
				Static236.anInt3726 = local58;
				Static595.anInt7807 = local46 + Static581.anInt9169;
				Static614.aClass145_14.DA(Static478.anInt7690, Static595.anInt7807, Static491.anInt7889, Static236.anInt3726);
			}
			Static12.aDouble1 = 0.0D;
			Static247.aClass52_1.method1069();
			Static555.method7748(Static247.aClass52_1);
			Static661.method9038(arg3, arg1, arg2, arg8, arg15, arg9, arg11, arg6, arg7, arg5, arg4, arg0, arg10, arg14, arg12, arg13, 1, false);
			Static337.method4693();
			Static415.aBoolean615 = false;
			if (Static240.anInt10701 == 0) {
				Static614.aClass145_14.method9706();
			}
			if (Static240.anInt10701 == 1) {
				Static322.method4458();
			}
		}
		if (Static240.anInt10701 == 0) {
			Static136.anInterface1_1.method9368(Static15.anInt227, Static368.anInt5900, Static482.anInt7726, Static72.anInt1263, 0, 0);
		}
		Static388.anInt6469++;
		Static697.method9376(Static195.aDouble18);
		Static290.aDouble28 = Static195.aDouble18;
		if (Static240.anInt10701 == 0 || Static240.anInt10701 == 2) {
			if (Static240.anInt10701 == 2) {
				Static614.aClass145_14.GA(Static55.anInt898);
				Static614.aClass145_14.ya();
			}
			Static290.anInt4986 = local56;
			Static242.anInt8798 = Static581.anInt9169 + local46 - Static368.anInt5900 - Static182.anInt10957;
			Static133.anInt2222 = local58;
			Static8.anInt98 = Static511.anInt8135 + local42 - Static15.anInt227 - Static336.anInt5168;
			Static614.aClass145_14.DA(Static8.anInt98, Static242.anInt8798, Static290.anInt4986, Static133.anInt2222);
		} else if (Static240.anInt10701 == 1) {
			Static8.anInt98 = local42 - Static336.anInt5168;
			Static290.anInt4986 = local56;
			Static133.anInt2222 = local58;
			Static242.anInt8798 = local46 - Static182.anInt10957;
			Static614.aClass145_14.DA(Static8.anInt98, Static242.anInt8798, Static290.anInt4986, Static133.anInt2222);
			Static614.aClass145_14.KA(Static15.anInt227, Static368.anInt5900, Static15.anInt227 + Static482.anInt7726, Static72.anInt1263 + Static368.anInt5900);
		}
		Static661.method9038(arg3, arg1, arg2, arg8, arg15, arg9, arg11, arg6, arg7, arg5, arg4, arg0, arg10, arg14, arg12, arg13, Static240.anInt10701 == 2 ? 0 : 2, Static240.anInt10701 == 1);
		Static614.aClass145_14.la();
		Static614.aClass145_14.DA(local42, local46, local50, local54);
	}
}
