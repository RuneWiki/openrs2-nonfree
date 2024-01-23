import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!km", name = "cb", descriptor = "[I")
	public static int[] anIntArray265;

	@OriginalMember(owner = "client!km", name = "Z", descriptor = "Lclient!cc;")
	public static Class26 aClass26_28 = new Class26(128);

	@OriginalMember(owner = "client!km", name = "db", descriptor = "I")
	public static int anInt2959 = 0;

	@OriginalMember(owner = "client!km", name = "f", descriptor = "(I)V")
	public static void method2394() {
		if (!Static47.aBoolean52 && Static166.anInt3406 != 2) {
			try {
				Static319.method1852(Static292.aClient1, "tbrefresh");
			} catch (@Pc(24) Throwable local24) {
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "c", descriptor = "(II)V")
	public static void method2395(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = Static129.anInt2510;
		if (arg0 == 0) {
			local7 = 1;
		}
		@Pc(14) int local14;
		@Pc(32) Class53_Sub1_Sub1 local32;
		@Pc(120) int local120;
		@Pc(126) int local126;
		@Pc(146) int local146;
		@Pc(161) int local161;
		@Pc(170) int local170;
		@Pc(183) int local183;
		for (local14 = 0; local14 < local7; local14++) {
			if (arg0 == 0) {
				local32 = Static154.aClass53_Sub1_Sub1_2;
			} else {
				local32 = Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local14]];
			}
			if (local32 != null && local32.method3323()) {
				@Pc(46) int local46 = local32.method3324();
				if (arg0 == 0 || arg0 == local46) {
					@Pc(111) int local111;
					if (local46 == 1) {
						if ((local32.anInt3974 & 0x7F) == 64 && (local32.anInt4002 & 0x7F) == 64) {
							local111 = local32.anInt3974 >> 7;
							local120 = local32.anInt4002 >> 7;
							if (local111 >= 0 && local111 < 104 && local120 >= 0 && local120 < 104) {
								local183 = Static10.anIntArrayArray2[local111][local120]++;
							}
						}
					} else if (((local46 & 0x1) != 0 || (local32.anInt3974 & 0x7F) == 0 && (local32.anInt4002 & 0x7F) == 0) && ((local46 & 0x1) != 1 || (local32.anInt3974 & 0x7F) == 64 && (local32.anInt4002 & 0x7F) == 64)) {
						local111 = local32.anInt3974 - local46 * 64 >> 7;
						local120 = local32.anInt4002 - local46 * 64 >> 7;
						local126 = local32.method3324() + local111;
						if (local126 > 104) {
							local126 = 104;
						}
						if (local111 < 0) {
							local111 = 0;
						}
						local146 = local120 + local32.method3324();
						if (local120 < 0) {
							local120 = 0;
						}
						if (local146 > 104) {
							local146 = 104;
						}
						for (local161 = local111; local161 < local126; local161++) {
							for (local170 = local120; local170 < local146; local170++) {
								local183 = Static10.anIntArrayArray2[local161][local170]++;
							}
						}
					}
				}
			}
		}
		label220: for (local14 = 0; local14 < local7; local14++) {
			@Pc(253) long local253;
			if (arg0 == 0) {
				local253 = 8791798054912L;
				local32 = Static154.aClass53_Sub1_Sub1_2;
			} else {
				local32 = Static182.aClass53_Sub1_Sub1Array1[Static172.anIntArray317[local14]];
				local253 = (long) Static172.anIntArray317[local14] << 32;
			}
			if (local32 != null && local32.method3323()) {
				local120 = local32.method3324();
				if (arg0 == 0 || arg0 == local120) {
					local32.aBoolean98 = false;
					local32.aBoolean282 = true;
					if ((Static82.aBoolean117 && Static129.anInt2510 > 200 || Static129.anInt2510 > 50) && arg0 != 0 && local32.anInt4005 == local32.method3327().anInt860) {
						local32.aBoolean98 = true;
					}
					if (local120 == 1) {
						if ((local32.anInt3974 & 0x7F) == 64 && (local32.anInt4002 & 0x7F) == 64) {
							local126 = local32.anInt3974 >> 7;
							local146 = local32.anInt4002 >> 7;
							if (local126 < 0 || local126 >= 104 || local146 < 0 || local146 >= 104) {
								continue;
							}
							if (Static10.anIntArrayArray2[local126][local146] > 1) {
								local183 = Static10.anIntArrayArray2[local126][local146]--;
								continue;
							}
						}
					} else if ((local120 & 0x1) == 0 && (local32.anInt3974 & 0x7F) == 0 && (local32.anInt4002 & 0x7F) == 0 || (local120 & 0x1) == 1 && (local32.anInt3974 & 0x7F) == 64 && (local32.anInt4002 & 0x7F) == 0) {
						local146 = local32.anInt4002 - local120 * 64 >> 7;
						local126 = local32.anInt3974 - local120 * 64 >> 7;
						local161 = local120 + local126;
						if (local126 < 0) {
							local126 = 0;
						}
						if (local161 > 104) {
							local161 = 104;
						}
						@Pc(458) boolean local458 = true;
						local170 = local120 + local146;
						if (local146 < 0) {
							local146 = 0;
						}
						if (local170 > 104) {
							local170 = 104;
						}
						@Pc(479) int local479;
						@Pc(488) int local488;
						for (local479 = local126; local479 < local161; local479++) {
							for (local488 = local146; local488 < local170; local488++) {
								if (Static10.anIntArrayArray2[local479][local488] <= 1) {
									local458 = false;
									break;
								}
							}
						}
						if (local458) {
							local479 = local126;
							while (true) {
								if (local161 <= local479) {
									continue label220;
								}
								for (local488 = local146; local488 < local170; local488++) {
									local183 = Static10.anIntArrayArray2[local479][local488]--;
								}
								local479++;
							}
						}
					}
					if (local32.anObject5 == null || Static50.anInt954 < local32.anInt4042 || local32.anInt4010 <= Static50.anInt954) {
						local32.aBoolean282 = false;
						local32.anInt4006 = Static33.method522(local32.anInt4002, local32.anInt3974, Static281.anInt5335);
						Static40.method637(Static281.anInt5335, local32.anInt3974, local32.anInt4002, local32.anInt4006, (local120 - 1) * 64 + 60, local32, local32.anInt4031, local253, local32.aBoolean284);
					} else {
						local32.aBoolean98 = false;
						local32.aBoolean282 = false;
						local32.anInt4006 = Static33.method522(local32.anInt4002, local32.anInt3974, Static281.anInt5335);
						Static38.method584(Static281.anInt5335, local32.anInt3974, local32.anInt4002, local32.anInt4006, local32, local32.anInt4031, local253, local32.anInt4043, local32.anInt4018, local32.anInt4041, local32.anInt4038);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!km", name = "a", descriptor = "([[[I[[B[[F[[I[[I[[F[[B[[I[[BI[[F[[I[[[B[[BZ[[I)[Lclient!ih;")
	public static Class4_Sub12[] method2396(@OriginalArg(0) int[][][] arg0, @OriginalArg(1) byte[][] arg1, @OriginalArg(2) float[][] arg2, @OriginalArg(3) int[][] arg3, @OriginalArg(4) int[][] arg4, @OriginalArg(5) float[][] arg5, @OriginalArg(6) byte[][] arg6, @OriginalArg(7) int[][] arg7, @OriginalArg(8) byte[][] arg8, @OriginalArg(9) int arg9, @OriginalArg(10) float[][] arg10, @OriginalArg(11) int[][] arg11, @OriginalArg(12) byte[][][] arg12, @OriginalArg(13) byte[][] arg13, @OriginalArg(15) int[][] arg14) {
		@Pc(9) int[][] local9 = new int[105][105];
		@Pc(23) int local23;
		@Pc(30) int local30;
		@Pc(74) byte local74;
		for (@Pc(11) int local11 = 1; local11 <= 103; local11++) {
			for (local23 = 1; local23 <= 103; local23++) {
				local30 = 0;
				if (arg0 != null) {
					@Pc(45) int local45 = arg0[arg9][local11 >> 3][local23 >> 3];
					local30 = local45 >> 1 & 0x3;
				}
				if (local30 == 0) {
					local74 = arg13[local11][local23];
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
				} else if (local30 == 1) {
					local74 = arg13[local11][local23 - 1];
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
				} else if (local30 == 2) {
					local74 = arg13[local11 - 1][local23 - 1];
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
				} else {
					local74 = arg13[local11 - 1][local23];
					if (local74 == 0) {
						local74 = arg13[local11 - 1][local23 - 1];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23];
					}
					if (local74 == 0) {
						local74 = arg13[local11][local23 - 1];
					}
				}
				if (local74 != 0) {
					@Pc(252) Class133 local252 = Static185.method2984((local74 & 0xFF) - 1);
					local9[local11][local23] = (local252.anInt4074 + 1 << 16) + local252.anInt4068;
				}
			}
		}
		@Pc(277) Class85 local277 = new Class85(128);
		@Pc(332) int local332;
		@Pc(340) int local340;
		@Pc(342) int local342;
		for (local23 = 1; local23 <= 102; local23++) {
			for (local30 = 1; local30 <= 102; local30++) {
				if (arg13[local23][local30] != 0) {
					@Pc(308) int[] local308;
					if (arg1[local23][local30] == 0) {
						local308 = Static35.anIntArrayArray5[0];
					} else {
						local308 = Static86.anIntArrayArray16[arg6[local23][local30]];
						if (local308.length == 0) {
							continue;
						}
					}
					local332 = local9[local23][local30];
					local340 = local9[local23 + 1][local30];
					local342 = 0;
					if (arg3 != null) {
						local342 = arg3[local23][local30] & 0xFFFFFF;
					}
					@Pc(363) int local363 = local9[local23 + 1][local30 + 1];
					@Pc(371) long local371 = (long) local332 << 32 | (long) local342;
					@Pc(379) long local379 = (long) local340 << 32 | (long) local342;
					@Pc(387) int local387 = local9[local23][local30 + 1];
					@Pc(395) long local395 = (long) local387 << 32 | (long) local342;
					@Pc(403) long local403 = (long) local363 << 32 | (long) local342;
					@Pc(408) int local408 = local308.length / 2;
					@Pc(414) Class4_Sub12 local414 = (Class4_Sub12) local277.method1845(local371);
					if (local414 == null) {
						local414 = new Class4_Sub12((local332 >> 16) - 1, (float) (local332 & 0xFFFF), false, arg11 != null, local342);
						local277.method1841(local414, local371);
					}
					local414.anInt2352 += local408;
					local414.anInt2355++;
					if (local379 != local371) {
						local414 = (Class4_Sub12) local277.method1845(local379);
						if (local414 == null) {
							local414 = new Class4_Sub12((local340 >> 16) - 1, (float) (local340 & 0xFFFF), false, arg11 != null, local342);
							local277.method1841(local414, local379);
						}
						local414.anInt2352 += local408;
						local414.anInt2355++;
					}
					if (local403 != local371 && local403 != local379) {
						local414 = (Class4_Sub12) local277.method1845(local403);
						if (local414 == null) {
							local414 = new Class4_Sub12((local363 >> 16) - 1, (float) (local363 & 0xFFFF), false, arg11 != null, local342);
							local277.method1841(local414, local403);
						}
						local414.anInt2355++;
						local414.anInt2352 += local408;
					}
					if (local371 != local395 && local379 != local395 && local395 != local403) {
						local414 = (Class4_Sub12) local277.method1845(local395);
						if (local414 == null) {
							local414 = new Class4_Sub12((local387 >> 16) - 1, (float) (local387 & 0xFFFF), false, arg11 != null, local342);
							local277.method1841(local414, local395);
						}
						local414.anInt2352 += local408;
						local414.anInt2355++;
					}
				}
			}
		}
		@Pc(645) Class4_Sub12 local645;
		for (local645 = (Class4_Sub12) local277.method1843(); local645 != null; local645 = (Class4_Sub12) local277.method1844()) {
			local645.method1873();
		}
		for (local23 = 1; local23 <= 102; local23++) {
			for (local30 = 1; local30 <= 102; local30++) {
				local74 = arg13[local23][local30];
				if (local74 != 0) {
					local332 = 0;
					if ((arg12[arg9][local23][local30] & 0x8) != 0) {
						local342 = 0;
					} else if ((arg12[1][local23][local30] & 0x2) == 2 && arg9 > 0) {
						local342 = arg9 - 1;
					} else {
						local342 = arg9;
					}
					local340 = 128;
					if (arg3 != null) {
						local332 = arg3[local23][local30] & 0xFFFFFF;
						local340 = arg3[local23][local30] >>> 24 << 3;
					}
					@Pc(746) boolean[] local746 = null;
					@Pc(779) int local779;
					@Pc(859) int local859;
					@Pc(758) int[] local758;
					@Pc(947) byte local947;
					@Pc(804) int local804;
					@Pc(823) int local823;
					if (arg1[local23][local30] == 0) {
						local758 = Static35.anIntArrayArray5[0];
						local779 = arg13[local23 - 1][local30 - 1] == local74 ? 1 : -1;
						local804 = local74 == arg13[local23 + 1][local30 - 1] ? 1 : -1;
						local823 = arg13[local23 - 1][local30 + 1] == local74 ? 1 : -1;
						if (arg13[local23][local30 - 1] == local74) {
							local779++;
							local804++;
						} else {
							local804--;
							local779--;
						}
						local859 = arg13[local23 + 1][local30 + 1] == local74 ? 1 : -1;
						if (local74 == arg13[local23 + 1][local30]) {
							local804++;
							local859++;
						} else {
							local804--;
							local859--;
						}
						if (arg13[local23][local30 + 1] == local74) {
							local859++;
							local823++;
						} else {
							local823--;
							local859--;
						}
						if (local74 == arg13[local23 - 1][local30]) {
							local823++;
							local779++;
						} else {
							local823--;
							local779--;
						}
						@Pc(913) int local913 = local779 - local859;
						@Pc(918) int local918 = local804 - local823;
						if (local918 < 0) {
							local918 = -local918;
						}
						if (local913 < 0) {
							local913 = -local913;
						}
						local947 = (byte) (local913 >= local918 ? 0 : 1);
						arg8[local23][local30] = local947;
					} else {
						local758 = Static86.anIntArrayArray16[arg6[local23][local30]];
						local947 = arg8[local23][local30];
						local746 = Static142.aBooleanArrayArray3[arg6[local23][local30]];
						if (local758.length == 0) {
							continue;
						}
					}
					local779 = local9[local23][local30];
					local804 = local9[local23 + 1][local30];
					local859 = local9[local23 + 1][local30 + 1];
					local823 = local9[local23][local30 + 1];
					@Pc(1025) long local1025 = (long) local332 | (long) local779 << 32;
					@Pc(1033) long local1033 = (long) local332 | (long) local859 << 32;
					@Pc(1041) long local1041 = (long) local823 << 32 | (long) local332;
					@Pc(1049) long local1049 = (long) local332 | (long) local804 << 32;
					@Pc(1055) int local1055 = arg4[local23][local30];
					@Pc(1063) int local1063 = arg4[local23 + 1][local30];
					@Pc(1073) int local1073 = arg4[local23 + 1][local30 + 1];
					@Pc(1079) int local1079 = arg7[local23][local30];
					@Pc(1087) int local1087 = arg4[local23][local30 + 1];
					@Pc(1095) int local1095 = arg7[local23 + 1][local30];
					@Pc(1105) int local1105 = arg7[local23 + 1][local30 + 1];
					@Pc(1113) int local1113 = arg7[local23][local30 + 1];
					@Pc(1119) int local1119 = (local779 >> 16) - 1;
					@Pc(1125) int local1125 = (local823 >> 16) - 1;
					@Pc(1131) int local1131 = (local859 >> 16) - 1;
					@Pc(1137) Class4_Sub12 local1137 = (Class4_Sub12) local277.method1845(local1025);
					@Pc(1143) int local1143 = (local804 >> 16) - 1;
					Static145.method2290(local779 <= local823, local30, local779 <= local804, arg5, arg10, local1137, arg14, Static83.method1474(local1113, local1119, local1087), Static83.method1474(local1105, local1119, local1073), local947, local342, local779 <= local859, local340, arg2, Static83.method1474(local1095, local1119, local1063), local23, local746, arg11, Static83.method1474(local1079, local1119, local1055), local758, local779 <= local779);
					if (local1049 != local1025) {
						local1137 = (Class4_Sub12) local277.method1845(local1049);
						Static145.method2290(local823 >= local804, local30, local804 >= local804, arg5, arg10, local1137, arg14, Static83.method1474(local1113, local1143, local1087), Static83.method1474(local1105, local1143, local1073), local947, local342, local804 <= local859, local340, arg2, Static83.method1474(local1095, local1143, local1063), local23, local746, arg11, Static83.method1474(local1079, local1143, local1055), local758, local804 <= local779);
					}
					if (local1025 != local1033 && local1033 != local1049) {
						local1137 = (Class4_Sub12) local277.method1845(local1033);
						Static145.method2290(local859 <= local823, local30, local859 <= local804, arg5, arg10, local1137, arg14, Static83.method1474(local1113, local1131, local1087), Static83.method1474(local1105, local1131, local1073), local947, local342, local859 <= local859, local340, arg2, Static83.method1474(local1095, local1131, local1063), local23, local746, arg11, Static83.method1474(local1079, local1131, local1055), local758, local859 <= local779);
					}
					if (local1041 != local1025 && local1041 != local1049 && local1033 != local1041) {
						local1137 = (Class4_Sub12) local277.method1845(local1041);
						Static145.method2290(local823 <= local823, local30, local804 >= local823, arg5, arg10, local1137, arg14, Static83.method1474(local1113, local1125, local1087), Static83.method1474(local1105, local1125, local1073), local947, local342, local823 <= local859, local340, arg2, Static83.method1474(local1095, local1125, local1063), local23, local746, arg11, Static83.method1474(local1079, local1125, local1055), local758, local823 <= local779);
					}
				}
			}
		}
		for (local645 = (Class4_Sub12) local277.method1843(); local645 != null; local645 = (Class4_Sub12) local277.method1844()) {
			if (local645.anInt2357 == 0) {
				local645.method4854();
			} else {
				local645.method1867();
			}
		}
		local23 = local277.method1842();
		@Pc(1492) Class4_Sub12[] local1492 = new Class4_Sub12[local23];
		local277.method1846(local1492);
		@Pc(1500) long[] local1500 = new long[local23];
		for (local342 = 0; local342 < local23; local342++) {
			local1500[local342] = local1492[local342].aLong217;
		}
		Static36.method563(local1500, local1492);
		return local1492;
	}

	@OriginalMember(owner = "client!km", name = "d", descriptor = "(II)Lclient!pe;")
	public static Class135 method2397(@OriginalArg(1) int arg0) {
		@Pc(14) Class135 local14 = (Class135) Static202.aClass26_42.method518((long) arg0);
		if (local14 != null) {
			return local14;
		}
		@Pc(28) byte[] local28 = Static6.aClass58_3.method1372(33, arg0);
		local14 = new Class135();
		if (local28 != null) {
			local14.method3411(arg0, new Class4_Sub10(local28));
		}
		Static202.aClass26_42.method510(local14, (long) arg0);
		return local14;
	}
}
