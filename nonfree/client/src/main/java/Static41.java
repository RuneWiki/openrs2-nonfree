import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!eh", name = "Ab", descriptor = "Lclient!c;")
	public static Class10 aClass10_45;

	@OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
	public static int anInt1196 = 0;

	@OriginalMember(owner = "client!eh", name = "Z", descriptor = "[I")
	public static int[] anIntArray62 = new int[200];

	@OriginalMember(owner = "client!eh", name = "rb", descriptor = "[[B")
	public static byte[][] aByteArrayArray3 = new byte[50][];

	@OriginalMember(owner = "client!eh", name = "vb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_327 = null;

	@OriginalMember(owner = "client!eh", name = "wb", descriptor = "[Lclient!mf;")
	public static Class54[] aClass54Array1 = new Class54[6];

	@OriginalMember(owner = "client!eh", name = "yb", descriptor = "Lclient!ai;")
	public static Class6 aClass6_328 = Static38.method685("m");

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Lclient!ka;IBLclient!l;IIIII)V")
	public static void method741(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class48 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static113.aBoolean112 && (Static164.aByteArrayArrayArray7[0][arg7][arg3] & 0x2) == 0) {
			if ((Static164.aByteArrayArrayArray7[arg4][arg7][arg3] & 0x10) != 0) {
				return;
			}
			if (Static89.method1489(arg3, arg7, arg4) != Static92.anInt2291) {
				return;
			}
		}
		if (arg4 < Static148.anInt3458) {
			Static148.anInt3458 = arg4;
		}
		@Pc(52) Class2_Sub3_Sub6 local52 = Static163.method2609(arg5);
		@Pc(63) int local63;
		@Pc(66) int local66;
		if (arg1 == 1 || arg1 == 3) {
			local66 = local52.anInt1205;
			local63 = local52.anInt1195;
		} else {
			local63 = local52.anInt1205;
			local66 = local52.anInt1195;
		}
		@Pc(87) int local87;
		@Pc(85) int local85;
		if (arg7 + local63 > 104) {
			local85 = arg7 + 1;
			local87 = arg7;
		} else {
			local87 = arg7 + (local63 >> 1);
			local85 = arg7 + (local63 + 1 >> 1);
		}
		@Pc(115) int local115;
		@Pc(113) int local113;
		if (local66 + arg3 > 104) {
			local113 = arg3 + 1;
			local115 = arg3;
		} else {
			local115 = arg3 + (local66 >> 1);
			local113 = (local66 + 1 >> 1) + arg3;
		}
		@Pc(139) int[][] local139 = Static165.anIntArrayArrayArray10[arg4];
		@Pc(168) int local168 = local139[local87][local115] + local139[local85][local115] + local139[local87][local113] + local139[local85][local113] >> 2;
		@Pc(176) int local176 = (arg7 << 7) + (local63 << 6);
		@Pc(185) int local185 = (arg3 << 7) + (local66 << 6);
		@Pc(198) int local198 = (arg3 << 7) + arg7 + (arg5 << 14) + 1073741824;
		@Pc(204) int local204 = arg6 + (arg1 << 6);
		if (local52.anInt1219 == 0) {
			local198 += Integer.MIN_VALUE;
		}
		if (local52.anInt1199 == 1) {
			local204 += 256;
		}
		if (local52.method744()) {
			Static156.method2411(arg7, arg1, arg3, arg4, local52);
		}
		@Pc(266) Class2_Sub3_Sub5 local266;
		if (arg6 != 22) {
			@Pc(370) int local370;
			if (arg6 == 10 || arg6 == 11) {
				if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
					local266 = local52.method738(local139, 10, local176, local168, local185, arg1);
				} else {
					local266 = new Class2_Sub3_Sub5_Sub6(arg5, 10, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
				}
				if (local266 != null && arg0.method1274(arg4, arg7, arg3, local168, local63, local66, local266, arg6 == 11 ? 256 : 0, local198, local204) && local52.aBoolean42) {
					local370 = 15;
					if (local266 instanceof Class2_Sub3_Sub5_Sub7) {
						local370 = ((Class2_Sub3_Sub5_Sub7) local266).method2302() / 4;
						if (local370 > 30) {
							local370 = 30;
						}
					}
					for (@Pc(386) int local386 = 0; local386 <= local63; local386++) {
						for (@Pc(390) int local390 = 0; local390 <= local66; local390++) {
							if (Static40.aByteArrayArrayArray2[arg4][arg7 + local386][arg3 + local390] < local370) {
								Static40.aByteArrayArrayArray2[arg4][local386 + arg7][arg3 + local390] = (byte) local370;
							}
						}
					}
				}
				if (local52.anInt1192 != 0 && arg2 != null) {
					arg2.method1473(arg3, local63, arg7, local52.aBoolean48, local66);
				}
			} else if (arg6 >= 12) {
				if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
					local266 = local52.method738(local139, arg6, local176, local168, local185, arg1);
				} else {
					local266 = new Class2_Sub3_Sub5_Sub6(arg5, arg6, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
				}
				arg0.method1274(arg4, arg7, arg3, local168, 1, 1, local266, 0, local198, local204);
				if (arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg4 > 0) {
					Static181.anIntArrayArrayArray6[arg4][arg7][arg3] |= 0x924;
				}
				if (local52.anInt1192 != 0 && arg2 != null) {
					arg2.method1473(arg3, local63, arg7, local52.aBoolean48, local66);
				}
			} else if (arg6 == 0) {
				if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
					local266 = local52.method738(local139, 0, local176, local168, local185, arg1);
				} else {
					local266 = new Class2_Sub3_Sub5_Sub6(arg5, 0, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
				}
				arg0.method1288(arg4, arg7, arg3, local168, local266, null, Static61.anIntArray98[arg1], 0, local198, local204);
				if (arg1 == 0) {
					if (local52.aBoolean42) {
						Static40.aByteArrayArrayArray2[arg4][arg7][arg3] = 50;
						Static40.aByteArrayArrayArray2[arg4][arg7][arg3 + 1] = 50;
					}
					if (local52.aBoolean46) {
						Static181.anIntArrayArrayArray6[arg4][arg7][arg3] |= 0x249;
					}
				} else if (arg1 == 1) {
					if (local52.aBoolean42) {
						Static40.aByteArrayArrayArray2[arg4][arg7][arg3 + 1] = 50;
						Static40.aByteArrayArrayArray2[arg4][arg7 + 1][arg3 + 1] = 50;
					}
					if (local52.aBoolean46) {
						Static181.anIntArrayArrayArray6[arg4][arg7][arg3 + 1] |= 0x492;
					}
				} else if (arg1 == 2) {
					if (local52.aBoolean42) {
						Static40.aByteArrayArrayArray2[arg4][arg7 + 1][arg3] = 50;
						Static40.aByteArrayArrayArray2[arg4][arg7 + 1][arg3 + 1] = 50;
					}
					if (local52.aBoolean46) {
						Static181.anIntArrayArrayArray6[arg4][arg7 + 1][arg3] |= 0x249;
					}
				} else if (arg1 == 3) {
					if (local52.aBoolean42) {
						Static40.aByteArrayArrayArray2[arg4][arg7][arg3] = 50;
						Static40.aByteArrayArrayArray2[arg4][arg7 + 1][arg3] = 50;
					}
					if (local52.aBoolean46) {
						Static181.anIntArrayArrayArray6[arg4][arg7][arg3] |= 0x492;
					}
				}
				if (local52.anInt1192 != 0 && arg2 != null) {
					arg2.method1485(arg7, arg3, local52.aBoolean48, arg6, arg1);
				}
				if (local52.anInt1194 != 16) {
					arg0.method1279(arg4, arg7, arg3, local52.anInt1194);
				}
			} else if (arg6 == 1) {
				if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
					local266 = local52.method738(local139, 1, local176, local168, local185, arg1);
				} else {
					local266 = new Class2_Sub3_Sub5_Sub6(arg5, 1, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
				}
				arg0.method1288(arg4, arg7, arg3, local168, local266, null, Static88.anIntArray154[arg1], 0, local198, local204);
				if (local52.aBoolean42) {
					if (arg1 == 0) {
						Static40.aByteArrayArrayArray2[arg4][arg7][arg3 + 1] = 50;
					} else if (arg1 == 1) {
						Static40.aByteArrayArrayArray2[arg4][arg7 + 1][arg3 + 1] = 50;
					} else if (arg1 == 2) {
						Static40.aByteArrayArrayArray2[arg4][arg7 + 1][arg3] = 50;
					} else if (arg1 == 3) {
						Static40.aByteArrayArrayArray2[arg4][arg7][arg3] = 50;
					}
				}
				if (local52.anInt1192 != 0 && arg2 != null) {
					arg2.method1485(arg7, arg3, local52.aBoolean48, arg6, arg1);
				}
			} else {
				@Pc(961) int local961;
				@Pc(991) Class2_Sub3_Sub5 local991;
				if (arg6 == 2) {
					local961 = arg1 + 1 & 0x3;
					@Pc(981) Class2_Sub3_Sub5 local981;
					if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
						local981 = local52.method738(local139, 2, local176, local168, local185, arg1 + 4);
						local991 = local52.method738(local139, 2, local176, local168, local185, local961);
					} else {
						local981 = new Class2_Sub3_Sub5_Sub6(arg5, 2, arg1 + 4, arg4, arg7, arg3, local52.anInt1201, true, null);
						local991 = new Class2_Sub3_Sub5_Sub6(arg5, 2, local961, arg4, arg7, arg3, local52.anInt1201, true, null);
					}
					arg0.method1288(arg4, arg7, arg3, local168, local981, local991, Static61.anIntArray98[arg1], Static61.anIntArray98[local961], local198, local204);
					if (local52.aBoolean46) {
						if (arg1 == 0) {
							Static181.anIntArrayArrayArray6[arg4][arg7][arg3] |= 0x249;
							Static181.anIntArrayArrayArray6[arg4][arg7][arg3 + 1] |= 0x492;
						} else if (arg1 == 1) {
							Static181.anIntArrayArrayArray6[arg4][arg7][arg3 + 1] |= 0x492;
							Static181.anIntArrayArrayArray6[arg4][arg7 + 1][arg3] |= 0x249;
						} else if (arg1 == 2) {
							Static181.anIntArrayArrayArray6[arg4][arg7 + 1][arg3] |= 0x249;
							Static181.anIntArrayArrayArray6[arg4][arg7][arg3] |= 0x492;
						} else if (arg1 == 3) {
							Static181.anIntArrayArrayArray6[arg4][arg7][arg3] |= 0x492;
							Static181.anIntArrayArrayArray6[arg4][arg7][arg3] |= 0x249;
						}
					}
					if (local52.anInt1192 != 0 && arg2 != null) {
						arg2.method1485(arg7, arg3, local52.aBoolean48, arg6, arg1);
					}
					if (local52.anInt1194 != 16) {
						arg0.method1279(arg4, arg7, arg3, local52.anInt1194);
					}
				} else if (arg6 == 3) {
					if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
						local266 = local52.method738(local139, 3, local176, local168, local185, arg1);
					} else {
						local266 = new Class2_Sub3_Sub5_Sub6(arg5, 3, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
					}
					arg0.method1288(arg4, arg7, arg3, local168, local266, null, Static88.anIntArray154[arg1], 0, local198, local204);
					if (local52.aBoolean42) {
						if (arg1 == 0) {
							Static40.aByteArrayArrayArray2[arg4][arg7][arg3 + 1] = 50;
						} else if (arg1 == 1) {
							Static40.aByteArrayArrayArray2[arg4][arg7 + 1][arg3 + 1] = 50;
						} else if (arg1 == 2) {
							Static40.aByteArrayArrayArray2[arg4][arg7 + 1][arg3] = 50;
						} else if (arg1 == 3) {
							Static40.aByteArrayArrayArray2[arg4][arg7][arg3] = 50;
						}
					}
					if (local52.anInt1192 != 0 && arg2 != null) {
						arg2.method1485(arg7, arg3, local52.aBoolean48, arg6, arg1);
					}
				} else if (arg6 == 9) {
					if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
						local266 = local52.method738(local139, arg6, local176, local168, local185, arg1);
					} else {
						local266 = new Class2_Sub3_Sub5_Sub6(arg5, arg6, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
					}
					arg0.method1274(arg4, arg7, arg3, local168, 1, 1, local266, 0, local198, local204);
					if (local52.anInt1192 != 0 && arg2 != null) {
						arg2.method1473(arg3, local63, arg7, local52.aBoolean48, local66);
					}
					if (local52.anInt1194 != 16) {
						arg0.method1279(arg4, arg7, arg3, local52.anInt1194);
					}
				} else if (arg6 == 4) {
					if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
						local266 = local52.method738(local139, 4, local176, local168, local185, arg1);
					} else {
						local266 = new Class2_Sub3_Sub5_Sub6(arg5, 4, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
					}
					arg0.method1263(arg4, arg7, arg3, local168, local266, null, Static61.anIntArray98[arg1], 0, 0, 0, local198, local204);
				} else if (arg6 == 5) {
					local961 = 16;
					local370 = arg0.method1247(arg4, arg7, arg3);
					if (local370 != 0) {
						local961 = Static163.method2609(local370 >> 14 & 0x7FFF).anInt1194;
					}
					if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
						local991 = local52.method738(local139, 4, local176, local168, local185, arg1);
					} else {
						local991 = new Class2_Sub3_Sub5_Sub6(arg5, 4, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
					}
					arg0.method1263(arg4, arg7, arg3, local168, local991, null, Static61.anIntArray98[arg1], 0, Static132.anIntArray280[arg1] * local961, local961 * Static142.anIntArray296[arg1], local198, local204);
				} else if (arg6 == 6) {
					local961 = 8;
					local370 = arg0.method1247(arg4, arg7, arg3);
					if (local370 != 0) {
						local961 = Static163.method2609(local370 >> 14 & 0x7FFF).anInt1194 / 2;
					}
					if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
						local991 = local52.method738(local139, 4, local176, local168, local185, arg1 + 4);
					} else {
						local991 = new Class2_Sub3_Sub5_Sub6(arg5, 4, arg1 + 4, arg4, arg7, arg3, local52.anInt1201, true, null);
					}
					arg0.method1263(arg4, arg7, arg3, local168, local991, null, 256, arg1, local961 * Static55.anIntArray94[arg1], local961 * Static101.anIntArray151[arg1], local198, local204);
				} else if (arg6 == 7) {
					local370 = arg1 + 2 & 0x3;
					if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
						local266 = local52.method738(local139, 4, local176, local168, local185, local370 + 4);
					} else {
						local266 = new Class2_Sub3_Sub5_Sub6(arg5, 4, local370 + 4, arg4, arg7, arg3, local52.anInt1201, true, null);
					}
					arg0.method1263(arg4, arg7, arg3, local168, local266, null, 256, local370, 0, 0, local198, local204);
				} else if (arg6 == 8) {
					local370 = arg0.method1247(arg4, arg7, arg3);
					@Pc(1746) int local1746 = arg1 + 2 & 0x3;
					local961 = 8;
					if (local370 != 0) {
						local961 = Static163.method2609(local370 >> 14 & 0x7FFF).anInt1194 / 2;
					}
					@Pc(1800) Class2_Sub3_Sub5 local1800;
					if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
						local991 = local52.method738(local139, 4, local176, local168, local185, arg1 + 4);
						local1800 = local52.method738(local139, 4, local176, local168, local185, local1746 + 4);
					} else {
						local991 = new Class2_Sub3_Sub5_Sub6(arg5, 4, arg1 + 4, arg4, arg7, arg3, local52.anInt1201, true, null);
						local1800 = new Class2_Sub3_Sub5_Sub6(arg5, 4, local1746 + 4, arg4, arg7, arg3, local52.anInt1201, true, null);
					}
					arg0.method1263(arg4, arg7, arg3, local168, local991, local1800, 256, arg1, Static55.anIntArray94[arg1] * local961, Static101.anIntArray151[arg1] * local961, local198, local204);
				}
			}
		} else if (!Static113.aBoolean112 || local52.anInt1219 != 0 || local52.anInt1192 == 1 || local52.aBoolean47) {
			if (local52.anInt1201 == -1 && local52.anIntArray61 == null) {
				local266 = local52.method738(local139, 22, local176, local168, local185, arg1);
			} else {
				local266 = new Class2_Sub3_Sub5_Sub6(arg5, 22, arg1, arg4, arg7, arg3, local52.anInt1201, true, null);
			}
			arg0.method1290(arg4, arg7, arg3, local168, local266, local198, local204);
			if (local52.anInt1192 == 1 && arg2 != null) {
				arg2.method1481(arg7, arg3);
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)V")
	public static void method748(@OriginalArg(1) int arg0) {
		Static68.anInt1731 += arg0 * 128;
		@Pc(27) int local27;
		if (Static68.anInt1731 > Static11.anIntArray7.length) {
			Static68.anInt1731 -= Static11.anIntArray7.length;
			local27 = (int) (Math.random() * 12.0D);
			Static105.method1732(Static138.aClass2_Sub3_Sub2_Sub3Array6[local27]);
		}
		@Pc(36) int local36 = arg0 * 128;
		local27 = 0;
		@Pc(44) int local44 = (256 - arg0) * 128;
		@Pc(78) int local78;
		for (@Pc(54) int local54 = 0; local54 < local44; local54++) {
			local78 = Static40.anIntArray59[local36 + local27] - arg0 * Static11.anIntArray7[Static11.anIntArray7.length - 1 & Static68.anInt1731 + local27] / 6;
			if (local78 < 0) {
				local78 = 0;
			}
			Static40.anIntArray59[local27++] = local78;
		}
		@Pc(105) int local105;
		@Pc(107) int local107;
		@Pc(114) int local114;
		for (local78 = 256 - arg0; local78 < 256; local78++) {
			local105 = local78 * 128;
			for (local107 = 0; local107 < 128; local107++) {
				local114 = (int) (Math.random() * 100.0D);
				if (local114 < 50 && local107 > 10 && local107 < 118) {
					Static40.anIntArray59[local105 + local107] = 255;
				} else {
					Static40.anIntArray59[local105 + local107] = 0;
				}
			}
		}
		if (Static92.anInt2289 > 0) {
			Static92.anInt2289 -= arg0 * 4;
		}
		if (Static83.anInt2044 > 0) {
			Static83.anInt2044 -= arg0 * 4;
		}
		if (Static92.anInt2289 == 0 && Static83.anInt2044 == 0) {
			local105 = (int) (Math.random() * (double) (2000 / arg0));
			if (local105 == 0) {
				Static92.anInt2289 = 1024;
			}
			if (local105 == 1) {
				Static83.anInt2044 = 1024;
			}
		}
		for (local105 = 0; local105 < 256 - arg0; local105++) {
			Static124.anIntArray251[local105] = Static124.anIntArray251[arg0 + local105];
		}
		for (local107 = 256 - arg0; local107 < 256; local107++) {
			Static124.anIntArray251[local107] = (int) (Math.sin((double) Static8.anInt161 / 14.0D) * 16.0D + Math.sin((double) Static8.anInt161 / 15.0D) * 14.0D + Math.sin((double) Static8.anInt161 / 16.0D) * 12.0D);
			Static8.anInt161++;
		}
		Static158.anInt3648 += arg0;
		local114 = (arg0 + (Static107.anInt2559 & 0x1)) / 2;
		if (local114 <= 0) {
			return;
		}
		@Pc(294) int local294;
		@Pc(301) int local301;
		for (@Pc(285) int local285 = 0; local285 < Static158.anInt3648 * 100; local285++) {
			local294 = (int) (Math.random() * 124.0D) + 2;
			local301 = (int) (Math.random() * 128.0D) + 128;
			Static40.anIntArray59[local294 + (local301 << 7)] = 192;
		}
		Static158.anInt3648 = 0;
		@Pc(328) int local328;
		@Pc(331) int local331;
		for (local294 = 0; local294 < 256; local294++) {
			local301 = 0;
			local328 = local294 * 128;
			for (local331 = -local114; local331 < 128; local331++) {
				if (local331 + local114 < 128) {
					local301 += Static40.anIntArray59[local114 + local331 + local328];
				}
				if (local331 - local114 - 1 >= 0) {
					local301 -= Static40.anIntArray59[local331 + local328 - local114 - 1];
				}
				if (local331 >= 0) {
					Static177.anIntArray400[local331 + local328] = local301 / (local114 * 2 + 1);
				}
			}
		}
		for (local301 = 0; local301 < 128; local301++) {
			local328 = 0;
			for (local331 = -local114; local331 < 256; local331++) {
				@Pc(417) int local417 = local331 * 128;
				if (local114 + local331 < 256) {
					local328 += Static177.anIntArray400[local301 + local417 + local114 * 128];
				}
				if (local331 - local114 - 1 >= 0) {
					local328 -= Static177.anIntArray400[local301 + local417 - (local114 + 1) * 128];
				}
				if (local331 >= 0) {
					Static40.anIntArray59[local301 + local417] = local328 / (local114 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(Z)V")
	public static void method749() {
		aClass6_327 = null;
		aByteArrayArray3 = null;
		aFontMetrics1 = null;
		aClass54Array1 = null;
		aClass10_45 = null;
		aClass6_328 = null;
		anIntArray62 = null;
	}
}
