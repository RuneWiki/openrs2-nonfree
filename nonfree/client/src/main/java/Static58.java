import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!ml;")
	public static Class1_Sub2_Sub16 aClass1_Sub2_Sub16_2;

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "[Lclient!ab;")
	public static Class3[] aClass3Array3;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!ol;")
	public static Class117 aClass117_5 = new Class117(16);

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "[[I")
	public static int[][] anIntArrayArray11 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public static int anInt1513 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(BLclient!ok;)V")
	public static void method1139(@OriginalArg(1) Class116 arg0) {
		@Pc(13) Class116 local13 = Static177.method3225(arg0);
		@Pc(19) int local19;
		@Pc(17) int local17;
		if (local13 == null) {
			local17 = Static144.anInt3368;
			local19 = Static193.anInt4370;
		} else {
			local19 = local13.anInt4299;
			local17 = local13.anInt4363;
		}
		Static213.method3740(local19, false, arg0, local17);
		Static154.method2864(local17, arg0, local19);
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "()V")
	public static void method1140() {
		Static225.anInt4954 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static82.anInt1969; local3++) {
			@Pc(10) Class3 local10 = Static6.aClass3Array4[local3];
			@Pc(14) int local14;
			if (Static136.anIntArray275 != null) {
				for (local14 = 0; local14 < Static136.anIntArray275.length; local14++) {
					if (Static136.anIntArray275[local14] != -1000000 && (local10.anInt90 <= Static136.anIntArray275[local14] || local10.anInt105 <= Static136.anIntArray275[local14]) && (local10.anInt104 <= Static89.anIntArray214[local14] || local10.anInt91 <= Static89.anIntArray214[local14]) && (local10.anInt104 >= Static231.anIntArray554[local14] || local10.anInt91 >= Static231.anIntArray554[local14]) && (local10.anInt102 <= Static197.anIntArray455[local14] || local10.anInt93 <= Static197.anIntArray455[local14]) && (local10.anInt102 >= Static73.anIntArray184[local14] || local10.anInt93 >= Static73.anIntArray184[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt99 == 1) {
				local14 = local10.anInt87 + Static34.anInt918 - Static97.anInt6060;
				if (local14 >= 0 && local14 <= Static34.anInt918 + Static34.anInt918) {
					local115 = local10.anInt98 + Static34.anInt918 - Static16.anInt444;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt89 + Static34.anInt918 - Static16.anInt444;
					if (local126 > Static34.anInt918 + Static34.anInt918) {
						local126 = Static34.anInt918 + Static34.anInt918;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static42.aBooleanArrayArray2[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static292.anInt6173 - local10.anInt104;
						if (local158 > 32) {
							local10.anInt96 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt96 = 2;
							local158 = -local158;
						}
						local10.anInt97 = (local10.anInt102 - Static197.anInt4472 << 8) / local158;
						local10.anInt100 = (local10.anInt93 - Static197.anInt4472 << 8) / local158;
						local10.anInt88 = (local10.anInt90 - Static114.anInt2499 << 8) / local158;
						local10.anInt94 = (local10.anInt105 - Static114.anInt2499 << 8) / local158;
						aClass3Array3[Static225.anInt4954++] = local10;
					}
				}
			} else if (local10.anInt99 == 2) {
				local14 = local10.anInt98 + Static34.anInt918 - Static16.anInt444;
				if (local14 >= 0 && local14 <= Static34.anInt918 + Static34.anInt918) {
					local115 = local10.anInt87 + Static34.anInt918 - Static97.anInt6060;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt92 + Static34.anInt918 - Static97.anInt6060;
					if (local126 > Static34.anInt918 + Static34.anInt918) {
						local126 = Static34.anInt918 + Static34.anInt918;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static42.aBooleanArrayArray2[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static197.anInt4472 - local10.anInt102;
						if (local158 > 32) {
							local10.anInt96 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt96 = 4;
							local158 = -local158;
						}
						local10.anInt101 = (local10.anInt104 - Static292.anInt6173 << 8) / local158;
						local10.anInt95 = (local10.anInt91 - Static292.anInt6173 << 8) / local158;
						local10.anInt88 = (local10.anInt90 - Static114.anInt2499 << 8) / local158;
						local10.anInt94 = (local10.anInt105 - Static114.anInt2499 << 8) / local158;
						aClass3Array3[Static225.anInt4954++] = local10;
					}
				}
			} else if (local10.anInt99 == 4) {
				local14 = local10.anInt90 - Static114.anInt2499;
				if (local14 > 128) {
					local115 = local10.anInt98 + Static34.anInt918 - Static16.anInt444;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt89 + Static34.anInt918 - Static16.anInt444;
					if (local126 > Static34.anInt918 + Static34.anInt918) {
						local126 = Static34.anInt918 + Static34.anInt918;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt87 + Static34.anInt918 - Static97.anInt6060;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt92 + Static34.anInt918 - Static97.anInt6060;
						if (local158 > Static34.anInt918 + Static34.anInt918) {
							local158 = Static34.anInt918 + Static34.anInt918;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static42.aBooleanArrayArray2[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt96 = 5;
							local10.anInt101 = (local10.anInt104 - Static292.anInt6173 << 8) / local14;
							local10.anInt95 = (local10.anInt91 - Static292.anInt6173 << 8) / local14;
							local10.anInt97 = (local10.anInt102 - Static197.anInt4472 << 8) / local14;
							local10.anInt100 = (local10.anInt93 - Static197.anInt4472 << 8) / local14;
							aClass3Array3[Static225.anInt4954++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(IB[[F[[F[[FLclient!kd;B[[IIZIIIIII)V")
	public static void method1142(@OriginalArg(0) int arg0, @OriginalArg(1) byte arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) Class1_Sub20 arg5, @OriginalArg(6) byte arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) int arg8, @OriginalArg(9) boolean arg9, @OriginalArg(11) int arg10, @OriginalArg(12) int arg11, @OriginalArg(13) int arg12, @OriginalArg(14) int arg13, @OriginalArg(15) int arg14) {
		@Pc(14) int local14 = (arg0 << 8) + 255;
		@Pc(20) int local20 = (arg12 << 8) + 255;
		@Pc(30) int local30 = (arg10 << 8) + 255;
		@Pc(36) int local36 = (arg14 << 8) + 255;
		@Pc(38) int[] local38 = null;
		@Pc(42) int[] local42 = anIntArrayArray11[arg6];
		@Pc(48) int[] local48 = new int[local42.length >> 1];
		@Pc(50) int local50;
		for (local50 = 0; local50 < local48.length; local50++) {
			local48[local50] = Static143.method2586(arg4, arg3, arg8, arg2, null, false, local42[local50 + local50], 0.0F, arg11, arg5, local36, local42[local50 + local50 + 1], arg1, arg7, local14, local30, local20);
		}
		if (arg9) {
			@Pc(208) int local208;
			if (arg6 == 1) {
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 64, 0.0F, arg11, arg5, local36, 128, arg1, arg7, local14, local30, local20);
				local208 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 128, 0.0F, arg11, arg5, local36, 64, arg1, arg7, local14, local30, local20);
				local38 = new int[] { local208, local50, local48[2], local50, local48[0], local48[2] };
			} else if (arg6 == 2) {
				local38 = new int[6];
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 128, 0.0F, arg11, arg5, local36, 128, arg1, arg7, local14, local30, local20);
				local208 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 64, 0.0F, arg11, arg5, local36, 0, arg1, arg7, local14, local30, local20);
				local38[3] = local50;
				local38[1] = local208;
				local38[4] = local48[1];
				local38[2] = local50;
				local38[0] = local48[0];
				local38[5] = local48[0];
			} else if (arg6 == 3) {
				local38 = new int[6];
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 0, 0.0F, arg11, arg5, local36, 128, arg1, arg7, local14, local30, local20);
				local208 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 64, 0.0F, arg11, arg5, local36, 0, arg1, arg7, local14, local30, local20);
				local38[1] = local48[1];
				local38[3] = local50;
				local38[4] = local208;
				local38[0] = local48[2];
				local38[2] = local50;
				local38[5] = local48[2];
			} else if (arg6 == 4) {
				local38 = new int[3];
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 0, 0.0F, arg11, arg5, local36, 128, arg1, arg7, local14, local30, local20);
				local38[1] = local50;
				local38[0] = local48[3];
				local38[2] = local48[0];
			} else if (arg6 == 5) {
				local38 = new int[3];
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 128, 0.0F, arg11, arg5, local36, 128, arg1, arg7, local14, local30, local20);
				local38[0] = local48[2];
				local38[1] = local50;
				local38[2] = local48[3];
			} else if (arg6 == 6) {
				local38 = new int[6];
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 128, 0.0F, arg11, arg5, local36, 0, arg1, arg7, local14, local30, local20);
				local208 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 128, 0.0F, arg11, arg5, local36, 128, arg1, arg7, local14, local30, local20);
				local38[0] = local48[3];
				local38[3] = local208;
				local38[4] = local48[0];
				local38[2] = local208;
				local38[1] = local50;
				local38[5] = local48[3];
			} else if (arg6 == 7) {
				local38 = new int[6];
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 0, 0.0F, arg11, arg5, local36, 128, arg1, arg7, local14, local30, local20);
				local208 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 128, 0.0F, arg11, arg5, local36, 0, arg1, arg7, local14, local30, local20);
				local38[0] = local48[1];
				local38[3] = local50;
				local38[1] = local208;
				local38[5] = local48[1];
				local38[2] = local50;
				local38[4] = local48[2];
			} else if (arg6 == 8) {
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 0, 0.0F, arg11, arg5, local36, 0, arg1, arg7, local14, local30, local20);
				local38 = new int[] { local48[3], local50, local48[4] };
			} else if (arg6 == 9) {
				local38 = new int[15];
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 128, 0.0F, arg11, arg5, local36, 64, arg1, arg7, local14, local30, local20);
				local208 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 96, 0.0F, arg11, arg5, local36, 32, arg1, arg7, local14, local30, local20);
				@Pc(739) int local739 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 64, 0.0F, arg11, arg5, local36, 0, arg1, arg7, local14, local30, local20);
				local38[1] = local50;
				local38[3] = local208;
				local38[0] = local208;
				local38[11] = local48[1];
				local38[14] = local739;
				local38[13] = local48[1];
				local38[6] = local208;
				local38[9] = local208;
				local38[5] = local48[3];
				local38[7] = local48[3];
				local38[12] = local208;
				local38[2] = local48[4];
				local38[8] = local48[2];
				local38[4] = local48[4];
				local38[10] = local48[2];
			} else if (arg6 == 10) {
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 0, 0.0F, arg11, arg5, local36, 128, arg1, arg7, local14, local30, local20);
				local38 = new int[] { local48[2], local50, local48[3], local48[3], local50, local48[4], local48[4], local50, local48[0] };
			} else if (arg6 == 11) {
				local50 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 0, 0.0F, arg11, arg5, local36, 64, arg1, arg7, local14, local30, local20);
				local38 = new int[12];
				local208 = Static143.method2586(arg4, arg3, arg8, arg2, null, true, 128, 0.0F, arg11, arg5, local36, 64, arg1, arg7, local14, local30, local20);
				local38[0] = local48[3];
				local38[7] = local208;
				local38[2] = local48[0];
				local38[3] = local48[3];
				local38[6] = local48[2];
				local38[4] = local48[2];
				local38[5] = local50;
				local38[8] = local50;
				local38[9] = local48[2];
				local38[11] = local208;
				local38[1] = local50;
				local38[10] = local48[1];
			}
		}
		arg5.method2362(arg13, arg8, arg11, local48, local38, false);
	}
}
