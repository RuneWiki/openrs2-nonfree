import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static206 {

	@OriginalMember(owner = "client!on", name = "y", descriptor = "I")
	public static int anInt4073;

	@OriginalMember(owner = "client!on", name = "Q", descriptor = "[Lclient!ho;")
	public static Class3_Sub4_Sub12[] aClass3_Sub4_Sub12Array7;

	@OriginalMember(owner = "client!on", name = "p", descriptor = "[I")
	public static int[] anIntArray451 = new int[] { 0, -1, 0, 1 };

	@OriginalMember(owner = "client!on", name = "K", descriptor = "Lclient!l;")
	public static Class98 aClass98_34 = new Class98(4);

	@OriginalMember(owner = "client!on", name = "P", descriptor = "Z")
	public static boolean aBoolean289 = false;

	@OriginalMember(owner = "client!on", name = "R", descriptor = "I")
	public static int anInt4081 = 0;

	@OriginalMember(owner = "client!on", name = "T", descriptor = "I")
	public static int anInt4082 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "()V")
	public static void method3427() {
		Static240.anInt4877 = 0;
		label194: for (@Pc(3) int local3 = 0; local3 < Static197.anInt5226; local3++) {
			@Pc(10) Class134 local10 = Static19.aClass134Array1[local3];
			@Pc(14) int local14;
			if (Static44.anIntArray65 != null) {
				for (local14 = 0; local14 < Static44.anIntArray65.length; local14++) {
					if (Static44.anIntArray65[local14] != -1000000 && (local10.anInt4117 <= Static44.anIntArray65[local14] || local10.anInt4125 <= Static44.anIntArray65[local14]) && (local10.anInt4116 <= Static284.anIntArray593[local14] || local10.anInt4115 <= Static284.anIntArray593[local14]) && (local10.anInt4116 >= Static34.anIntArray53[local14] || local10.anInt4115 >= Static34.anIntArray53[local14]) && (local10.anInt4122 <= Static79.anIntArray191[local14] || local10.anInt4120 <= Static79.anIntArray191[local14]) && (local10.anInt4122 >= Static39.anIntArray60[local14] || local10.anInt4120 >= Static39.anIntArray60[local14])) {
						continue label194;
					}
				}
			}
			@Pc(115) int local115;
			@Pc(126) int local126;
			@Pc(158) int local158;
			@Pc(137) boolean local137;
			if (local10.anInt4114 == 1) {
				local14 = local10.anInt4130 + Static285.anInt5736 - Static19.anInt361;
				if (local14 >= 0 && local14 <= Static285.anInt5736 + Static285.anInt5736) {
					local115 = local10.anInt4131 + Static285.anInt5736 - Static289.anInt5787;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4119 + Static285.anInt5736 - Static289.anInt5787;
					if (local126 > Static285.anInt5736 + Static285.anInt5736) {
						local126 = Static285.anInt5736 + Static285.anInt5736;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static252.aBooleanArrayArray10[local14][local115++]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static282.anInt5668 - local10.anInt4116;
						if (local158 > 32) {
							local10.anInt4134 = 1;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4134 = 2;
							local158 = -local158;
						}
						local10.anInt4132 = (local10.anInt4122 - Static104.anInt1924 << 8) / local158;
						local10.anInt4124 = (local10.anInt4120 - Static104.anInt1924 << 8) / local158;
						local10.anInt4123 = (local10.anInt4117 - Static112.anInt5733 << 8) / local158;
						local10.anInt4118 = (local10.anInt4125 - Static112.anInt5733 << 8) / local158;
						Static132.aClass134Array2[Static240.anInt4877++] = local10;
					}
				}
			} else if (local10.anInt4114 == 2) {
				local14 = local10.anInt4131 + Static285.anInt5736 - Static289.anInt5787;
				if (local14 >= 0 && local14 <= Static285.anInt5736 + Static285.anInt5736) {
					local115 = local10.anInt4130 + Static285.anInt5736 - Static19.anInt361;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4129 + Static285.anInt5736 - Static19.anInt361;
					if (local126 > Static285.anInt5736 + Static285.anInt5736) {
						local126 = Static285.anInt5736 + Static285.anInt5736;
					}
					local137 = false;
					while (local115 <= local126) {
						if (Static252.aBooleanArrayArray10[local115++][local14]) {
							local137 = true;
							break;
						}
					}
					if (local137) {
						local158 = Static104.anInt1924 - local10.anInt4122;
						if (local158 > 32) {
							local10.anInt4134 = 3;
						} else {
							if (local158 >= -32) {
								continue;
							}
							local10.anInt4134 = 4;
							local158 = -local158;
						}
						local10.anInt4113 = (local10.anInt4116 - Static282.anInt5668 << 8) / local158;
						local10.anInt4133 = (local10.anInt4115 - Static282.anInt5668 << 8) / local158;
						local10.anInt4123 = (local10.anInt4117 - Static112.anInt5733 << 8) / local158;
						local10.anInt4118 = (local10.anInt4125 - Static112.anInt5733 << 8) / local158;
						Static132.aClass134Array2[Static240.anInt4877++] = local10;
					}
				}
			} else if (local10.anInt4114 == 4) {
				local14 = local10.anInt4117 - Static112.anInt5733;
				if (local14 > 128) {
					local115 = local10.anInt4131 + Static285.anInt5736 - Static289.anInt5787;
					if (local115 < 0) {
						local115 = 0;
					}
					local126 = local10.anInt4119 + Static285.anInt5736 - Static289.anInt5787;
					if (local126 > Static285.anInt5736 + Static285.anInt5736) {
						local126 = Static285.anInt5736 + Static285.anInt5736;
					}
					if (local115 <= local126) {
						@Pc(408) int local408 = local10.anInt4130 + Static285.anInt5736 - Static19.anInt361;
						if (local408 < 0) {
							local408 = 0;
						}
						local158 = local10.anInt4129 + Static285.anInt5736 - Static19.anInt361;
						if (local158 > Static285.anInt5736 + Static285.anInt5736) {
							local158 = Static285.anInt5736 + Static285.anInt5736;
						}
						@Pc(430) boolean local430 = false;
						label166: for (@Pc(432) int local432 = local408; local432 <= local158; local432++) {
							for (@Pc(437) int local437 = local115; local437 <= local126; local437++) {
								if (Static252.aBooleanArrayArray10[local432][local437]) {
									local430 = true;
									break label166;
								}
							}
						}
						if (local430) {
							local10.anInt4134 = 5;
							local10.anInt4113 = (local10.anInt4116 - Static282.anInt5668 << 8) / local14;
							local10.anInt4133 = (local10.anInt4115 - Static282.anInt5668 << 8) / local14;
							local10.anInt4132 = (local10.anInt4122 - Static104.anInt1924 << 8) / local14;
							local10.anInt4124 = (local10.anInt4120 - Static104.anInt1924 << 8) / local14;
							Static132.aClass134Array2[Static240.anInt4877++] = local10;
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(BIIILclient!rk;II)V")
	public static void method3434(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class153 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) long local7 = 0L;
		if (arg4 == 0) {
			local7 = Static148.method2517(arg0, arg1, arg5);
		} else if (arg4 == 1) {
			local7 = Static272.method2771(arg0, arg1, arg5);
		} else if (arg4 == 2) {
			local7 = Static75.method1163(arg0, arg1, arg5);
		} else if (arg4 == 3) {
			local7 = Static56.method917(arg0, arg1, arg5);
		}
		@Pc(60) int local60 = (int) (local7 >>> 32) & Integer.MAX_VALUE;
		@Pc(68) Class49 local68 = Static175.method2874(local60);
		@Pc(77) int local77 = (int) local7 >> 14 & 0x1F;
		if (local68.method1123()) {
			Static314.method5012(arg0, arg1, local68, arg5);
		}
		@Pc(97) int local97 = (int) local7 >> 20 & 0x3;
		if (local7 == 0L) {
			return;
		}
		@Pc(103) Class10 local103 = null;
		@Pc(105) Class10 local105 = null;
		if (arg4 == 0) {
			@Pc(113) Class19 local113 = Static62.method984(arg0, arg1, arg5);
			if (local113 != null) {
				local105 = local113.aClass10_2;
				local103 = local113.aClass10_3;
			}
			if (local68.anInt1372 != 0) {
				arg3.method4080(arg1, arg5, local77, !local68.aBoolean120, local97, local68.aBoolean119);
			}
		} else if (arg4 == 1) {
			@Pc(249) Class95 local249 = Static52.method820(arg0, arg1, arg5);
			if (local249 != null) {
				local105 = local249.aClass10_8;
				local103 = local249.aClass10_9;
			}
		} else if (arg4 == 2) {
			@Pc(159) Class85 local159 = Static254.method4302(arg0, arg1, arg5);
			if (local159 != null) {
				local103 = local159.aClass10_7;
			}
			if (local68.anInt1372 != 0 && arg1 + local68.anInt1360 < 104 && arg5 + local68.anInt1360 < 104 && arg1 + local68.anInt1329 < 104 && local68.anInt1329 + arg5 < 104) {
				arg3.method4089(arg5, local68.aBoolean119, local97, local68.anInt1360, !local68.aBoolean120, arg1, local68.anInt1329);
			}
		} else if (arg4 == 3) {
			@Pc(229) Class13 local229 = Static195.method3233(arg0, arg1, arg5);
			if (local229 != null) {
				local103 = local229.aClass10_1;
			}
			if (local68.anInt1372 == 1) {
				arg3.method4078(arg5, arg1);
			}
		}
		if (local68.anIntArray131 != null) {
			local68 = local68.method1112();
		}
		if (!Static283.aBoolean393 || local68 == null || !local68.aBoolean112) {
			return;
		}
		if (local77 == 2) {
			if (local103 instanceof Class10_Sub6) {
				((Class10_Sub6) local103).method4233();
			} else {
				Static253.method4290(arg2, local97 + 4, local77, arg1, 0, local68, 0, arg5);
			}
			if (local105 instanceof Class10_Sub6) {
				((Class10_Sub6) local105).method4233();
			} else {
				Static253.method4290(arg2, local97 + 1 & 0x3, local77, arg1, 0, local68, 0, arg5);
			}
		} else if (local77 == 5) {
			if (local103 instanceof Class10_Sub6) {
				((Class10_Sub6) local103).method4233();
			} else {
				Static253.method4290(arg2, local97, 4, arg1, anIntArray451[local97] * 8, local68, Static36.anIntArray56[local97] * 8, arg5);
			}
		} else if (local77 == 6) {
			if (local103 instanceof Class10_Sub6) {
				((Class10_Sub6) local103).method4233();
			} else {
				Static253.method4290(arg2, local97 + 4, 4, arg1, Static104.anIntArray193[local97] * 8, local68, Static233.anIntArray505[local97] * 8, arg5);
			}
		} else if (local77 == 7) {
			if (local103 instanceof Class10_Sub6) {
				((Class10_Sub6) local103).method4233();
			} else {
				Static253.method4290(arg2, (local97 + 2 & 0x3) + 4, 4, arg1, 0, local68, 0, arg5);
			}
		} else if (local77 == 8) {
			if (local103 instanceof Class10_Sub6) {
				((Class10_Sub6) local103).method4233();
			} else {
				Static253.method4290(arg2, local97 + 4, 4, arg1, Static104.anIntArray193[local97] * 8, local68, Static233.anIntArray505[local97] * 8, arg5);
			}
			if (local105 instanceof Class10_Sub6) {
				((Class10_Sub6) local105).method4233();
			} else {
				Static253.method4290(arg2, (local97 + 2 & 0x3) + 4, 4, arg1, Static104.anIntArray193[local97] * 8, local68, Static233.anIntArray505[local97] * 8, arg5);
			}
		} else if (local77 == 11) {
			if (local103 instanceof Class10_Sub6) {
				((Class10_Sub6) local103).method4233();
			} else {
				Static253.method4290(arg2, local97 + 4, 10, arg1, 0, local68, 0, arg5);
			}
		} else if (local103 instanceof Class10_Sub6) {
			((Class10_Sub6) local103).method4233();
		} else {
			Static253.method4290(arg2, local97, local77, arg1, 0, local68, 0, arg5);
		}
	}
}
