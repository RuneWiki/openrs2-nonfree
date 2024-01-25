import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static368 {

	@OriginalMember(owner = "client!sr", name = "v", descriptor = "[[S")
	public static short[][] aShortArrayArray9;

	@OriginalMember(owner = "client!sr", name = "x", descriptor = "[I")
	public static int[] anIntArray396 = new int[2];

	@OriginalMember(owner = "client!sr", name = "y", descriptor = "Lclient!iu;")
	public static final Class123 aClass123_312 = new Class123(94, 10);

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!eq;Lclient!bp;III)V")
	public static void method4867(@OriginalArg(0) Class66 arg0, @OriginalArg(1) Class3 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(12) Class101 local12;
		if (arg3 < Static229.anInt4189) {
			local12 = Static409.aClass101ArrayArrayArray3[arg2][arg3 + 1][arg4];
			if (local12 != null && local12.aClass3_Sub5_1 != null && local12.aClass3_Sub5_1.method5942()) {
				arg1.method5941(0, 0, local12.aClass3_Sub5_1, Static168.anInt3377, true, arg0);
			}
		}
		if (arg4 < Static229.anInt4189) {
			local12 = Static409.aClass101ArrayArrayArray3[arg2][arg3][arg4 + 1];
			if (local12 != null && local12.aClass3_Sub5_1 != null && local12.aClass3_Sub5_1.method5942()) {
				arg1.method5941(Static168.anInt3377, 0, local12.aClass3_Sub5_1, 0, true, arg0);
			}
		}
		if (arg3 < Static229.anInt4189 && arg4 < Static61.anInt1698) {
			local12 = Static409.aClass101ArrayArrayArray3[arg2][arg3 + 1][arg4 + 1];
			if (local12 != null && local12.aClass3_Sub5_1 != null && local12.aClass3_Sub5_1.method5942()) {
				arg1.method5941(Static168.anInt3377, 0, local12.aClass3_Sub5_1, Static168.anInt3377, true, arg0);
			}
		}
		if (arg3 < Static229.anInt4189 && arg4 > 0) {
			local12 = Static409.aClass101ArrayArrayArray3[arg2][arg3 + 1][arg4 - 1];
			if (local12 != null && local12.aClass3_Sub5_1 != null && local12.aClass3_Sub5_1.method5942()) {
				arg1.method5941(-Static168.anInt3377, 0, local12.aClass3_Sub5_1, Static168.anInt3377, true, arg0);
			}
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!qn;ILclient!ae;)V")
	public static void method4869(@OriginalArg(1) Class209 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class6_Sub1 arg2) {
		@Pc(9) Class6_Sub6 local9 = new Class6_Sub6();
		local9.anInt1168 = arg2.method6433();
		local9.anInt1170 = arg2.method6442();
		local9.aClass122Array2 = new Class122[local9.anInt1168];
		local9.anIntArray73 = new int[local9.anInt1168];
		local9.aByteArrayArrayArray3 = new byte[local9.anInt1168][][];
		local9.anIntArray72 = new int[local9.anInt1168];
		local9.anIntArray74 = new int[local9.anInt1168];
		local9.aClass122Array1 = new Class122[local9.anInt1168];
		for (@Pc(55) int local55 = 0; local55 < local9.anInt1168; local55++) {
			try {
				@Pc(61) int local61 = arg2.method6433();
				@Pc(83) String local83;
				@Pc(87) String local87;
				@Pc(91) int local91;
				if (local61 == 0 || local61 == 1 || local61 == 2) {
					local83 = arg2.method6473();
					local87 = arg2.method6473();
					local91 = 0;
					if (local61 == 1) {
						local91 = arg2.method6442();
					}
					local9.anIntArray72[local55] = local61;
					local9.anIntArray73[local55] = local91;
					local9.aClass122Array2[local55] = arg0.method4677(local87, Static207.method3183(local83));
				} else if (local61 == 3 || local61 == 4) {
					local83 = arg2.method6473();
					local87 = arg2.method6473();
					local91 = arg2.method6433();
					@Pc(94) String[] local94 = new String[local91];
					for (@Pc(96) int local96 = 0; local96 < local91; local96++) {
						local94[local96] = arg2.method6473();
					}
					@Pc(111) byte[][] local111 = new byte[local91][];
					@Pc(126) int local126;
					if (local61 == 3) {
						for (@Pc(118) int local118 = 0; local118 < local91; local118++) {
							local126 = arg2.method6442();
							local111[local118] = new byte[local126];
							arg2.method6434(local111[local118], local126);
						}
					}
					local9.anIntArray72[local55] = local61;
					@Pc(155) Class[] local155 = new Class[local91];
					for (local126 = 0; local126 < local91; local126++) {
						local155[local126] = Static207.method3183(local94[local126]);
					}
					local9.aClass122Array1[local55] = arg0.method4694(local155, local87, Static207.method3183(local83));
					local9.aByteArrayArrayArray3[local55] = local111;
				}
			} catch (@Pc(236) ClassNotFoundException local236) {
				local9.anIntArray74[local55] = -1;
			} catch (@Pc(243) SecurityException local243) {
				local9.anIntArray74[local55] = -2;
			} catch (@Pc(250) NullPointerException local250) {
				local9.anIntArray74[local55] = -3;
			} catch (@Pc(257) Exception local257) {
				local9.anIntArray74[local55] = -4;
			} catch (@Pc(264) Throwable local264) {
				local9.anIntArray74[local55] = -5;
			}
		}
		Static273.aClass244_24.method5966(local9);
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(JB)V")
	public static void method4870(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static261.anInt4746;
		@Pc(13) int local13 = Static202.anInt3800;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (local7 != Static14.anInt435) {
			local21 = local7 - Static14.anInt435;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local21 < local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local21 > local29) {
				local29 = local21;
			}
			Static14.anInt435 += local29;
		}
		if (!Static291.aClass28_Sub1_1.aBoolean85) {
			Static265.aFloat51 += Static29.aFloat4 * (float) arg0 / 40.0F * 8.0F;
			Static165.aFloat28 += Static408.aFloat98 * (float) arg0 / 40.0F * 8.0F;
		}
		if (local13 != Static390.anInt6891) {
			local21 = local13 - Static390.anInt6891;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 > 0) {
				if (local29 == 0) {
					local29 = 1;
				} else if (local21 < local29) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = -1;
			} else if (local29 < local21) {
				local29 = local21;
			}
			Static390.anInt6891 += local29;
		}
		Static42.method964();
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(BII)Z")
	public static boolean method4872(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)[Lclient!iu;")
	public static Class123[] method4873() {
		return new Class123[] { Static148.aClass123_152, Static45.aClass123_422, Static295.aClass123_291, Static30.aClass123_49, Static118.aClass123_129, Static65.aClass123_114, Static435.aClass123_404, Static372.aClass123_342, Static447.aClass123_382, Static257.aClass123_247, Static417.aClass123_383, Static190.aClass123_38, Static63.aClass123_82, Static74.aClass123_91, Static349.aClass123_324, Static379.aClass123_351, Static332.aClass123_305, Static167.aClass123_374, Static57.aClass123_77, Static243.aClass123_236, Static237.aClass123_228, Static301.aClass123_281, Static120.aClass123_164, Static211.aClass123_198, Static201.aClass123_250, Static173.aClass123_173, Static45.aClass123_421, Static8.aClass123_15, Static85.aClass123_103, Static165.aClass123_160, Static446.aClass123_423, Static262.aClass123_134, Static352.aClass123_326, Static433.aClass123_403, Static279.aClass123_265, Static388.aClass123_357, Static241.aClass123_412, Static393.aClass123_363, Static19.aClass123_30, Static369.aClass123_227, Static205.aClass123_194, Static187.aClass123_184, Static375.aClass123_346, Static126.aClass123_137, Static150.aClass123_157, Static310.aClass123_289, Static256.aClass123_246, Static183.aClass123_245, Static295.aClass123_292, Static420.aClass123_391, Static375.aClass123_347, Static356.aClass123_331, Static409.aClass123_377, Static270.aClass123_257, Static227.aClass123_214, Static263.aClass123_253, Static349.aClass123_325, Static404.aClass123_373, Static436.aClass123_407, Static71.aClass123_87, Static251.aClass123_339, Static232.aClass123_219, Static445.aClass123_420, Static110.aClass123_359, Static95.aClass123_112, Static6.aClass123_5, Static12.aClass123_21, Static386.aClass123_356, Static43.aClass123_54, Static16.aClass123_28, Static446.aClass123_424, Static284.aClass123_268, Static129.aClass123_140, Static290.aClass123_273, Static18.aClass123_29, Static69.aClass123_86, Static105.aClass123_115, Static276.aClass123_260, Static359.aClass123_336, Static111.aClass123_122, Static348.aClass123_323, Static430.aClass123_402, Static186.aClass123_182, Static141.aClass123_66, Static122.aClass123_132, Static316.aClass123_290, Static436.aClass123_408, Static148.aClass123_151, Static177.aClass123_381, Static422.aClass123_394, Static283.aClass123_425, Static50.aClass123_67, Static87.aClass123_104, Static62.aClass123_80, aClass123_312, Static107.aClass123_116, Static244.aClass123_411, Static375.aClass123_348, Static146.aClass123_148, Static336.aClass123_313, Static76.aClass123_415, Static22.aClass123_41, Static388.aClass123_358, Static310.aClass123_288, Static374.aClass123_345, Static63.aClass123_81, Static100.aClass123_113, Static219.aClass123_202, Static157.aClass123_158, Static49.aClass123_64 };
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(BII)I")
	public static int method4876(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) int local7 = 0;
		while (arg0 > 0) {
			local7 = local7 << 1 | arg1 & 0x1;
			arg0--;
			arg1 >>>= 0x1;
		}
		return local7;
	}
}
