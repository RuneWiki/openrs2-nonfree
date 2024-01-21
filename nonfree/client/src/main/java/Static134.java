import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static134 {

	@OriginalMember(owner = "client!og", name = "kb", descriptor = "I")
	public static int anInt3338;

	@OriginalMember(owner = "client!og", name = "lb", descriptor = "I")
	public static int anInt3339;

	@OriginalMember(owner = "client!og", name = "qb", descriptor = "Lclient!nd;")
	public static Class60_Sub1 aClass60_Sub1_124;

	@OriginalMember(owner = "client!og", name = "gb", descriptor = "[I")
	public static final int[] anIntArray377 = new int[50];

	@OriginalMember(owner = "client!og", name = "ib", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1864 = Static118.method2249("sl_flags");

	@OriginalMember(owner = "client!og", name = "tb", descriptor = "Lclient!oh;")
	public static final Class67 aClass67_7 = new Class67(50);

	@OriginalMember(owner = "client!og", name = "xb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_1865 = Static118.method2249("welle:");

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIII)V")
	public static void method2557(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(9) int local9 = 0; local9 < Static126.anInt3109; local9++) {
			if (Static195.anIntArray481[local9] + Static105.anIntArray295[local9] > arg0 && arg1 + arg0 > Static195.anIntArray481[local9] && arg2 < Static168.anIntArray351[local9] + Static183.anIntArray449[local9] && Static168.anIntArray351[local9] < arg3 + arg2) {
				Static57.aBooleanArray8[local9] = true;
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IJ)Lclient!oc;")
	public static Class65 method2558(@OriginalArg(1) long arg0) {
		if (arg0 <= (long) 0 || arg0 >= 6582952005840035281L) {
			return null;
		} else if (arg0 % 37L == 0L) {
			return null;
		} else {
			@Pc(26) int local26 = 0;
			@Pc(28) long local28 = arg0;
			while (local28 != 0L) {
				local28 /= 37L;
				local26++;
			}
			@Pc(41) byte[] local41 = new byte[local26];
			while (arg0 != 0L) {
				@Pc(44) long local44 = arg0;
				arg0 /= 37L;
				local26--;
				local41[local26] = Static147.aByteArray41[(int) (local44 - arg0 * 37L)];
			}
			@Pc(69) Class65 local69 = new Class65();
			local69.aByteArray37 = local41;
			local69.anInt3190 = local41.length;
			return local69;
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIZLclient!n;IIZIZ)V")
	public static void method2559(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4, @OriginalArg(5) Class57 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) boolean arg8, @OriginalArg(9) int arg9) {
		if (arg8 && (Static106.aByteArrayArrayArray67[0][arg2][arg7] & 0x2) == 0) {
			if ((Static106.aByteArrayArrayArray67[arg6][arg2][arg7] & 0x10) != 0) {
				return;
			}
			if (Static202.method1712(arg6, arg7, arg2) != Static37.anInt1034) {
				return;
			}
		}
		if (Static49.anInt1297 > arg6) {
			Static49.anInt1297 = arg6;
		}
		@Pc(57) Class1_Sub2_Sub13 local57 = Static5.method65(arg0);
		@Pc(77) int local77;
		@Pc(80) int local80;
		if (arg1 == 1 || arg1 == 3) {
			local77 = local57.anInt2001;
			local80 = local57.anInt1988;
		} else {
			local80 = local57.anInt2001;
			local77 = local57.anInt1988;
		}
		@Pc(99) int local99;
		@Pc(107) int local107;
		if (arg2 + local77 <= 104) {
			local99 = arg2 + (local77 >> 1);
			local107 = (local77 + 1 >> 1) + arg2;
		} else {
			local99 = arg2;
			local107 = arg2 + 1;
		}
		@Pc(118) int[][] local118 = Static89.anIntArrayArrayArray3[arg3];
		@Pc(127) int local127;
		@Pc(131) int local131;
		if (arg7 + local80 > 104) {
			local127 = arg7;
			local131 = arg7 + 1;
		} else {
			local131 = (local80 + 1 >> 1) + arg7;
			local127 = (local80 >> 1) + arg7;
		}
		@Pc(154) int local154 = (local80 << 6) + (arg7 << 7);
		@Pc(182) int local182 = local118[local107][local131] + local118[local99][local127] + local118[local107][local127] + local118[local99][local131] >> 2;
		@Pc(184) Object local184 = null;
		@Pc(192) int local192 = (arg2 << 7) + (local77 << 6);
		@Pc(209) long local209 = (long) (arg1 << 20 | arg9 << 14 | arg7 << 7 | arg2 | 0x40000000);
		if (local57.anInt1982 == 0) {
			local209 |= Long.MIN_VALUE;
		}
		if (local57.anInt1994 == 1) {
			local209 |= 0x400000L;
		}
		local209 |= (long) arg0 << 32;
		if (arg4 && local57.method1423()) {
			Static74.method1265(arg6, arg2, arg7, local57, arg1);
		}
		@Pc(289) Class6 local289;
		@Pc(286) Class1_Sub2_Sub19 local286;
		if (arg9 == 22) {
			if (!arg8 || local57.anInt1982 != 0 || local57.anInt2004 == 1 || local57.aBoolean88) {
				if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
					local286 = local57.method1434(local192, 22, local182, arg1, local154, local118, arg4);
					local289 = local286.aClass6_9;
				} else {
					local289 = new Class6_Sub2(arg0, 22, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
				}
				Static104.method1930(arg6, arg2, arg7, local182, local289, local209, local57.aBoolean89);
				if (local57.anInt2004 == 1 && arg5 != null) {
					arg5.method2260(arg7, arg2);
				}
			}
		} else if (arg9 == 10 || arg9 == 11) {
			if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
				local286 = local57.method1434(local192, 10, local182, arg1, local154, local118, arg4);
				local289 = local286.aClass6_9;
			} else {
				local289 = new Class6_Sub2(arg0, 10, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
			}
			if (local289 != null) {
				@Pc(394) boolean local394 = Static133.method2532(arg6, arg2, arg7, local182, local77, local80, local289, arg9 == 11 ? 256 : 0, local209);
				if (local57.aBoolean91 && local394 && arg4) {
					@Pc(403) int local403 = 15;
					if (local289 instanceof Class6_Sub3) {
						local403 = ((Class6_Sub3) local289).method1170() / 4;
						if (local403 > 30) {
							local403 = 30;
						}
					}
					for (@Pc(421) int local421 = 0; local421 <= local77; local421++) {
						for (@Pc(424) int local424 = 0; local424 <= local80; local424++) {
							if (local403 > Static70.aByteArrayArrayArray38[arg6][local421 + arg2][local424 + arg7]) {
								Static70.aByteArrayArrayArray38[arg6][arg2 + local421][local424 + arg7] = (byte) local403;
							}
						}
					}
				}
			}
			if (local57.anInt2004 != 0 && arg5 != null) {
				arg5.method2265(arg7, local57.aBoolean87, arg2, local80, local77);
			}
		} else if (arg9 >= 12) {
			if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
				local286 = local57.method1434(local192, arg9, local182, arg1, local154, local118, arg4);
				local289 = local286.aClass6_9;
			} else {
				local289 = new Class6_Sub2(arg0, arg9, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
			}
			Static133.method2532(arg6, arg2, arg7, local182, 1, 1, local289, 0, local209);
			if (arg4 && arg9 >= 12 && arg9 <= 17 && arg9 != 13 && arg6 > 0) {
				Static204.anIntArrayArrayArray9[arg6][arg2][arg7] |= 0x924;
			}
			if (local57.anInt2004 != 0 && arg5 != null) {
				arg5.method2265(arg7, local57.aBoolean87, arg2, local80, local77);
			}
		} else if (arg9 == 0) {
			if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
				local286 = local57.method1434(local192, 0, local182, arg1, local154, local118, arg4);
				local289 = local286.aClass6_9;
			} else {
				local289 = new Class6_Sub2(arg0, 0, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
			}
			Static60.method1060(arg6, arg2, arg7, local182, local289, null, Static195.anIntArray480[arg1], 0, local209);
			if (arg4) {
				if (arg1 == 0) {
					if (local57.aBoolean91) {
						Static70.aByteArrayArrayArray38[arg6][arg2][arg7] = 50;
						Static70.aByteArrayArrayArray38[arg6][arg2][arg7 + 1] = 50;
					}
					if (local57.aBoolean92) {
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7] |= 0x249;
					}
				} else if (arg1 == 1) {
					if (local57.aBoolean91) {
						Static70.aByteArrayArrayArray38[arg6][arg2][arg7 + 1] = 50;
						Static70.aByteArrayArrayArray38[arg6][arg2 + 1][arg7 + 1] = 50;
					}
					if (local57.aBoolean92) {
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7 + 1] |= 0x492;
					}
				} else if (arg1 == 2) {
					if (local57.aBoolean91) {
						Static70.aByteArrayArrayArray38[arg6][arg2 + 1][arg7] = 50;
						Static70.aByteArrayArrayArray38[arg6][arg2 + 1][arg7 + 1] = 50;
					}
					if (local57.aBoolean92) {
						Static204.anIntArrayArrayArray9[arg6][arg2 + 1][arg7] |= 0x249;
					}
				} else if (arg1 == 3) {
					if (local57.aBoolean91) {
						Static70.aByteArrayArrayArray38[arg6][arg2][arg7] = 50;
						Static70.aByteArrayArrayArray38[arg6][arg2 + 1][arg7] = 50;
					}
					if (local57.aBoolean92) {
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7] |= 0x492;
					}
				}
			}
			if (local57.anInt2004 != 0 && arg5 != null) {
				arg5.method2270(arg1, arg2, arg9, local57.aBoolean87, arg7);
			}
			if (local57.anInt2010 != 16) {
				Static191.method3154(arg6, arg2, arg7, local57.anInt2010);
			}
		} else if (arg9 == 1) {
			if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
				local286 = local57.method1434(local192, 1, local182, arg1, local154, local118, arg4);
				local289 = local286.aClass6_9;
			} else {
				local289 = new Class6_Sub2(arg0, 1, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
			}
			Static60.method1060(arg6, arg2, arg7, local182, local289, null, Static35.anIntArray96[arg1], 0, local209);
			if (local57.aBoolean91 && arg4) {
				if (arg1 == 0) {
					Static70.aByteArrayArrayArray38[arg6][arg2][arg7 + 1] = 50;
				} else if (arg1 == 1) {
					Static70.aByteArrayArrayArray38[arg6][arg2 + 1][arg7 + 1] = 50;
				} else if (arg1 == 2) {
					Static70.aByteArrayArrayArray38[arg6][arg2 + 1][arg7] = 50;
				} else if (arg1 == 3) {
					Static70.aByteArrayArrayArray38[arg6][arg2][arg7] = 50;
				}
			}
			if (local57.anInt2004 != 0 && arg5 != null) {
				arg5.method2270(arg1, arg2, arg9, local57.aBoolean87, arg7);
			}
		} else {
			@Pc(1005) int local1005;
			if (arg9 == 2) {
				local1005 = arg1 + 1 & 0x3;
				@Pc(1045) Class6 local1045;
				@Pc(1030) Class6 local1030;
				if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
					@Pc(1059) Class1_Sub2_Sub19 local1059 = local57.method1434(local192, 2, local182, arg1 + 4, local154, local118, arg4);
					local1030 = local1059.aClass6_9;
					@Pc(1073) Class1_Sub2_Sub19 local1073 = local57.method1434(local192, 2, local182, local1005, local154, local118, arg4);
					local1045 = local1073.aClass6_9;
				} else {
					local1030 = new Class6_Sub2(arg0, 2, arg1 + 4, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
					local1045 = new Class6_Sub2(arg0, 2, local1005, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
				}
				Static60.method1060(arg6, arg2, arg7, local182, local1030, local1045, Static195.anIntArray480[arg1], Static195.anIntArray480[local1005], local209);
				if (local57.aBoolean92 && arg4) {
					if (arg1 == 0) {
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7] |= 0x249;
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7 + 1] |= 0x492;
					} else if (arg1 == 1) {
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7 + 1] |= 0x492;
						Static204.anIntArrayArrayArray9[arg6][arg2 + 1][arg7] |= 0x249;
					} else if (arg1 == 2) {
						Static204.anIntArrayArrayArray9[arg6][arg2 + 1][arg7] |= 0x249;
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7] |= 0x492;
					} else if (arg1 == 3) {
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7] |= 0x492;
						Static204.anIntArrayArrayArray9[arg6][arg2][arg7] |= 0x249;
					}
				}
				if (local57.anInt2004 != 0 && arg5 != null) {
					arg5.method2270(arg1, arg2, arg9, local57.aBoolean87, arg7);
				}
				if (local57.anInt2010 != 16) {
					Static191.method3154(arg6, arg2, arg7, local57.anInt2010);
				}
			} else if (arg9 == 3) {
				if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
					local286 = local57.method1434(local192, 3, local182, arg1, local154, local118, arg4);
					local289 = local286.aClass6_9;
				} else {
					local289 = new Class6_Sub2(arg0, 3, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
				}
				Static60.method1060(arg6, arg2, arg7, local182, local289, null, Static35.anIntArray96[arg1], 0, local209);
				if (local57.aBoolean91 && arg4) {
					if (arg1 == 0) {
						Static70.aByteArrayArrayArray38[arg6][arg2][arg7 + 1] = 50;
					} else if (arg1 == 1) {
						Static70.aByteArrayArrayArray38[arg6][arg2 + 1][arg7 + 1] = 50;
					} else if (arg1 == 2) {
						Static70.aByteArrayArrayArray38[arg6][arg2 + 1][arg7] = 50;
					} else if (arg1 == 3) {
						Static70.aByteArrayArrayArray38[arg6][arg2][arg7] = 50;
					}
				}
				if (local57.anInt2004 != 0 && arg5 != null) {
					arg5.method2270(arg1, arg2, arg9, local57.aBoolean87, arg7);
				}
			} else if (arg9 == 9) {
				if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
					local286 = local57.method1434(local192, arg9, local182, arg1, local154, local118, arg4);
					local289 = local286.aClass6_9;
				} else {
					local289 = new Class6_Sub2(arg0, arg9, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
				}
				Static133.method2532(arg6, arg2, arg7, local182, 1, 1, local289, 0, local209);
				if (local57.anInt2004 != 0 && arg5 != null) {
					arg5.method2265(arg7, local57.aBoolean87, arg2, local80, local77);
				}
				if (local57.anInt2010 != 16) {
					Static191.method3154(arg6, arg2, arg7, local57.anInt2010);
				}
			} else if (arg9 == 4) {
				if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
					local286 = local57.method1434(local192, 4, local182, arg1, local154, local118, arg4);
					local289 = local286.aClass6_9;
				} else {
					local289 = new Class6_Sub2(arg0, 4, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
				}
				Static57.method1047(arg6, arg2, arg7, local182, local289, null, Static195.anIntArray480[arg1], 0, 0, 0, local209, (Class2) local184);
			} else {
				@Pc(1573) long local1573;
				@Pc(1611) Class6 local1611;
				@Pc(1608) Class1_Sub2_Sub19 local1608;
				if (arg9 == 5) {
					local1573 = Static198.method3219(arg6, arg2, arg7);
					local1005 = 16;
					if (local1573 != 0L) {
						local1005 = Static5.method65(Integer.MAX_VALUE & (int) (local1573 >>> 32)).anInt2010;
					}
					if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
						local1608 = local57.method1434(local192, 4, local182, arg1, local154, local118, arg4);
						local1611 = local1608.aClass6_9;
					} else {
						local1611 = new Class6_Sub2(arg0, 4, arg1, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
					}
					Static57.method1047(arg6, arg2, arg7, local182, local1611, null, Static195.anIntArray480[arg1], 0, local1005 * Static178.anIntArray457[arg1], local1005 * Static167.anIntArray436[arg1], local209, (Class2) local184);
				} else if (arg9 == 6) {
					local1005 = 8;
					local1573 = Static198.method3219(arg6, arg2, arg7);
					if (local1573 != 0L) {
						local1005 = Static5.method65((int) (local1573 >>> 32) & Integer.MAX_VALUE).anInt2010 / 2;
					}
					if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
						local1608 = local57.method1434(local192, 4, local182, arg1 + 4, local154, local118, arg4);
						local1611 = local1608.aClass6_9;
					} else {
						local1611 = new Class6_Sub2(arg0, 4, arg1 + 4, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
					}
					Static57.method1047(arg6, arg2, arg7, local182, local1611, null, 256, arg1, Static78.anIntArray218[arg1] * local1005, local1005 * Static190.anIntArray472[arg1], local209, (Class2) local184);
				} else if (arg9 == 7) {
					@Pc(1752) int local1752 = arg1 + 2 & 0x3;
					if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
						@Pc(1790) Class1_Sub2_Sub19 local1790 = local57.method1434(local192, 4, local182, local1752 + 4, local154, local118, arg4);
						local289 = local1790.aClass6_9;
					} else {
						local289 = new Class6_Sub2(arg0, 4, local1752 + 4, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
					}
					Static57.method1047(arg6, arg2, arg7, local182, local289, null, 256, local1752, 0, 0, local209, (Class2) local184);
				} else if (arg9 == 8) {
					local1005 = 8;
					local1573 = Static198.method3219(arg6, arg2, arg7);
					if (local1573 != 0L) {
						local1005 = Static5.method65(Integer.MAX_VALUE & (int) (local1573 >>> 32)).anInt2010 / 2;
					}
					@Pc(1841) int local1841 = arg1 + 2 & 0x3;
					@Pc(1883) Class6 local1883;
					if (local57.anInt2011 == -1 && local57.anIntArray227 == null) {
						@Pc(1897) Class1_Sub2_Sub19 local1897 = local57.method1434(local192, 4, local182, arg1 + 4, local154, local118, arg4);
						local1611 = local1897.aClass6_9;
						@Pc(1913) Class1_Sub2_Sub19 local1913 = local57.method1434(local192, 4, local182, local1841 + 4, local154, local118, arg4);
						local1883 = local1913.aClass6_9;
					} else {
						local1611 = new Class6_Sub2(arg0, 4, arg1 + 4, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
						local1883 = new Class6_Sub2(arg0, 4, local1841 + 4, arg3, arg2, arg7, local57.anInt2011, local57.aBoolean84, null);
					}
					Static57.method1047(arg6, arg2, arg7, local182, local1611, local1883, 256, arg1, local1005 * Static78.anIntArray218[arg1], Static190.anIntArray472[arg1] * local1005, local209, (Class2) local184);
				}
			}
		}
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(JB)Lclient!oc;")
	public static Class65 method2560(@OriginalArg(0) long arg0) {
		return Static116.method2133(arg0);
	}
}
