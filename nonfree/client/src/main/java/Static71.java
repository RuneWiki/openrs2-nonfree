import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!gg", name = "Z", descriptor = "Lclient!kf;")
	public static Class65 aClass65_1;

	@OriginalMember(owner = "client!gg", name = "kb", descriptor = "J")
	public static long aLong55;

	@OriginalMember(owner = "client!gg", name = "V", descriptor = "Lclient!sc;")
	private static Class107 aClass107_468 = Static231.method3737("scroll:");

	@OriginalMember(owner = "client!gg", name = "W", descriptor = "Lclient!sc;")
	public static Class107 aClass107_469 = aClass107_468;

	@OriginalMember(owner = "client!gg", name = "Y", descriptor = "I")
	public static int anInt1625 = 0;

	@OriginalMember(owner = "client!gg", name = "db", descriptor = "[I")
	public static int[] anIntArray150 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

	@OriginalMember(owner = "client!gg", name = "fb", descriptor = "I")
	public static int anInt1630 = 1;

	@OriginalMember(owner = "client!gg", name = "hb", descriptor = "I")
	public static int anInt1632 = 2;

	@OriginalMember(owner = "client!gg", name = "mb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_470 = null;

	@OriginalMember(owner = "client!gg", name = "ob", descriptor = "Lclient!sc;")
	public static Class107 aClass107_471 = aClass107_468;

	@OriginalMember(owner = "client!gg", name = "c", descriptor = "(II)V")
	public static void method1279(@OriginalArg(0) int arg0) {
		@Pc(1) Class102 local1 = Static146.aClass102_1;
		synchronized (Static146.aClass102_1) {
			Static182.anInt4083 = arg0;
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(IZ)V")
	public static void method1280(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub2_Sub19 local8 = Static166.method3214(arg0, 1);
		local8.method3689();
	}

	@OriginalMember(owner = "client!gg", name = "f", descriptor = "(I)V")
	public static void method1281() {
		Static218.aClass61_87.method1697();
		Static116.aClass61_47.method1697();
		Static95.aClass61_34.method1697();
	}

	@OriginalMember(owner = "client!gg", name = "g", descriptor = "(I)V")
	public static void method1282() {
		@Pc(5) int local5 = Static123.aClass120_15.method3568();
		if (local5 == 0) {
			return;
		}
		Static193.aClass1_Sub26_Sub1_2.method3000(192);
		Static193.aClass1_Sub26_Sub1_2.method2967(0);
		@Pc(36) int local36 = Static193.aClass1_Sub26_Sub1_2.anInt4021;
		@Pc(41) Class1_Sub5 local41 = (Class1_Sub5) Static123.aClass120_15.method3566();
		Static193.aClass1_Sub26_Sub1_2.method2963(local41.anInt782);
		@Pc(49) int local49 = local41.anInt782;
		@Pc(51) int local51 = 0;
		@Pc(85) Class1_Sub5 local85;
		while ((local85 = (Class1_Sub5) Static123.aClass120_15.method3566()) != null) {
			if (local51 < 255 && local85.anInt782 == local49 + 1) {
				local51++;
			} else {
				Static193.aClass1_Sub26_Sub1_2.method2967(local51);
				Static193.aClass1_Sub26_Sub1_2.method2963(local85.anInt782);
				local51 = 0;
			}
			local49 = local85.anInt782;
		}
		Static193.aClass1_Sub26_Sub1_2.method2967(local51);
		Static193.aClass1_Sub26_Sub1_2.method2982(Static193.aClass1_Sub26_Sub1_2.anInt4021 - local36);
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!pf;I)V")
	public static void method1284(@OriginalArg(0) Class1_Sub6 arg0) {
		arg0.aBoolean241 = false;
		if (arg0.aClass1_Sub7_5 != null) {
			arg0.aClass1_Sub7_5.anInt1311 = 0;
		}
		for (@Pc(23) Class1_Sub6 local23 = arg0.method2185(); local23 != null; local23 = arg0.method2182()) {
			method1284(local23);
		}
	}

	@OriginalMember(owner = "client!gg", name = "i", descriptor = "(I)V")
	public static void method1285() {
		@Pc(12) int local12;
		@Pc(27) int local27;
		@Pc(35) int local35;
		@Pc(44) int local44;
		@Pc(48) int local48;
		@Pc(60) int local60;
		@Pc(66) int local66;
		@Pc(70) int local70;
		@Pc(78) int local78;
		@Pc(82) int local82;
		@Pc(20) int local20;
		@Pc(54) int local54;
		@Pc(74) int local74;
		@Pc(163) Class5_Sub4 local163;
		if (Static176.anInt3812 == 28) {
			local12 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local20 = Static89.anInt1937 + (local12 >> 4 & 0x7);
			local27 = Static209.anInt4459 + (local12 & 0x7);
			local35 = Static194.aClass1_Sub26_Sub1_3.method2992() + local20;
			local44 = local27 + Static194.aClass1_Sub26_Sub1_3.method2992();
			local48 = Static194.aClass1_Sub26_Sub1_3.method2944();
			local54 = Static194.aClass1_Sub26_Sub1_3.method2964();
			local60 = Static194.aClass1_Sub26_Sub1_3.method2945() * 4;
			local66 = Static194.aClass1_Sub26_Sub1_3.method2945() * 4;
			local70 = Static194.aClass1_Sub26_Sub1_3.method2964();
			local74 = Static194.aClass1_Sub26_Sub1_3.method2964();
			local78 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local82 = Static194.aClass1_Sub26_Sub1_3.method2945();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104 && local35 >= 0 && local44 >= 0 && local35 < 104 && local44 < 104 && local54 != 65535) {
				local20 = local20 * 128 + 64;
				local27 = local27 * 128 + 64;
				local35 = local35 * 128 + 64;
				local44 = local44 * 128 + 64;
				local163 = new Class5_Sub4(local54, Static191.anInt4237, local20, local27, Static130.method2174(Static191.anInt4237, local27, local20) - local60, Static128.anInt2802 + local70, local74 + Static128.anInt2802, local78, local82, local48, local66);
				local163.method928(Static130.method2174(Static191.anInt4237, local44, local35) - local66, local44, local35, local70 + Static128.anInt2802);
				Static13.aClass120_2.method3567(new Class1_Sub2_Sub4(local163));
			}
		} else if (Static176.anInt3812 == 93) {
			local12 = Static194.aClass1_Sub26_Sub1_3.method2987();
			local20 = Static194.aClass1_Sub26_Sub1_3.method2942();
			local27 = Static89.anInt1937 + (local20 >> 4 & 0x7);
			local35 = (local20 & 0x7) + Static209.anInt4459;
			if (local27 >= 0 && local35 >= 0 && local27 < 104 && local35 < 104) {
				@Pc(231) Class120 local231 = Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local27][local35];
				if (local231 != null) {
					for (@Pc(238) Class1_Sub2_Sub18 local238 = (Class1_Sub2_Sub18) local231.method3564(); local238 != null; local238 = (Class1_Sub2_Sub18) local231.method3561()) {
						if (local238.aClass5_Sub2_1.anInt375 == (local12 & 0x7FFF)) {
							local238.method3735();
							break;
						}
					}
					if (local231.method3564() == null) {
						Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local27][local35] = null;
					}
					Static182.method3009(local27, local35);
				}
			}
		} else if (Static176.anInt3812 == 56) {
			local12 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local20 = (local12 >> 4 & 0xF) + Static89.anInt1937 * 2;
			local27 = Static209.anInt4459 * 2 + (local12 & 0xF);
			local35 = local20 + Static194.aClass1_Sub26_Sub1_3.method2992();
			local44 = Static194.aClass1_Sub26_Sub1_3.method2992() + local27;
			local48 = Static194.aClass1_Sub26_Sub1_3.method2944();
			local54 = Static194.aClass1_Sub26_Sub1_3.method2964();
			local60 = Static194.aClass1_Sub26_Sub1_3.method2945() * 4;
			local66 = Static194.aClass1_Sub26_Sub1_3.method2945() * 4;
			local70 = Static194.aClass1_Sub26_Sub1_3.method2964();
			local74 = Static194.aClass1_Sub26_Sub1_3.method2964();
			local78 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local82 = Static194.aClass1_Sub26_Sub1_3.method2945();
			if (local20 >= 0 && local27 >= 0 && local20 < 208 && local27 < 208 && local35 >= 0 && local44 >= 0 && local35 < 208 && local44 < 208 && local54 != 65535) {
				local27 = local27 * 64;
				local20 = local20 * 64;
				local35 *= 64;
				local44 = local44 * 64;
				local163 = new Class5_Sub4(local54, Static191.anInt4237, local20, local27, Static130.method2174(Static191.anInt4237, local27, local20) - local60, local70 - -Static128.anInt2802, local74 + Static128.anInt2802, local78, local82, local48, local66);
				local163.method928(Static130.method2174(Static191.anInt4237, local44, local35) - local66, local44, local35, local70 + Static128.anInt2802);
				Static13.aClass120_2.method3567(new Class1_Sub2_Sub4(local163));
			}
		} else if (Static176.anInt3812 == 182) {
			local12 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local20 = local12 >> 2;
			local27 = local12 & 0x3;
			local35 = Static137.anIntArray255[local20];
			local44 = Static194.aClass1_Sub26_Sub1_3.method2964();
			local48 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local60 = Static209.anInt4459 + (local48 & 0x7);
			local54 = (local48 >> 4 & 0x7) + Static89.anInt1937;
			if (local54 >= 0 && local60 >= 0 && local54 < 104 && local60 < 104) {
				Static94.method1583(local44, 0, local60, local54, local27, local35, local20, Static191.anInt4237, -1);
			}
		} else if (Static176.anInt3812 == 80) {
			local12 = Static194.aClass1_Sub26_Sub1_3.method2983();
			local20 = Static194.aClass1_Sub26_Sub1_3.method2983();
			local27 = Static194.aClass1_Sub26_Sub1_3.method2972();
			local35 = (local27 >> 4 & 0x7) + Static89.anInt1937;
			local44 = Static209.anInt4459 + (local27 & 0x7);
			if (local35 >= 0 && local44 >= 0 && local35 < 104 && local44 < 104) {
				@Pc(588) Class5_Sub2 local588 = new Class5_Sub2();
				local588.anInt375 = local12;
				local588.anInt376 = local20;
				if (Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local35][local44] == null) {
					Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local35][local44] = new Class120();
				}
				Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local35][local44].method3567(new Class1_Sub2_Sub18(local588));
				Static182.method3009(local35, local44);
			}
		} else if (Static176.anInt3812 == 232) {
			local12 = Static194.aClass1_Sub26_Sub1_3.method2977();
			local20 = Static194.aClass1_Sub26_Sub1_3.method2942();
			if (local12 == 65535) {
				local12 = -1;
			}
			local27 = local20 >> 2;
			local35 = local20 & 0x3;
			local44 = Static137.anIntArray255[local27];
			local48 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local54 = (local48 >> 4 & 0x7) + Static89.anInt1937;
			local60 = Static209.anInt4459 + (local48 & 0x7);
			Static194.method3158(local27, local44, local35, Static191.anInt4237, local12, local60, local54);
		} else if (Static176.anInt3812 == 197) {
			local12 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local20 = (local12 >> 4 & 0x7) + Static89.anInt1937;
			local27 = (local12 & 0x7) + Static209.anInt4459;
			local35 = Static194.aClass1_Sub26_Sub1_3.method2964();
			local44 = Static194.aClass1_Sub26_Sub1_3.method2945();
			local48 = Static194.aClass1_Sub26_Sub1_3.method2964();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
				local27 = local27 * 128 + 64;
				local20 = local20 * 128 + 64;
				@Pc(773) Class5_Sub6 local773 = new Class5_Sub6(local35, Static191.anInt4237, local20, local27, Static130.method2174(Static191.anInt4237, local27, local20) - local44, local48, Static128.anInt2802);
				Static106.aClass120_12.method3567(new Class1_Sub2_Sub8(local773));
			}
		} else if (Static176.anInt3812 == 110) {
			local12 = Static194.aClass1_Sub26_Sub1_3.method2968();
			local20 = Static89.anInt1937 + (local12 >> 4 & 0x7);
			local27 = (local12 & 0x7) + Static209.anInt4459;
			local35 = Static194.aClass1_Sub26_Sub1_3.method2983();
			local44 = Static194.aClass1_Sub26_Sub1_3.method2977();
			local48 = Static194.aClass1_Sub26_Sub1_3.method2983();
			if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104 && Static137.anInt2980 != local35) {
				@Pc(844) Class5_Sub2 local844 = new Class5_Sub2();
				local844.anInt375 = local48;
				local844.anInt376 = local44;
				if (Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local20][local27] == null) {
					Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local20][local27] = new Class120();
				}
				Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local20][local27].method3567(new Class1_Sub2_Sub18(local844));
				Static182.method3009(local20, local27);
			}
		} else {
			if (Static176.anInt3812 == 11) {
				local12 = Static194.aClass1_Sub26_Sub1_3.method2983();
				@Pc(897) byte local897 = Static194.aClass1_Sub26_Sub1_3.method2992();
				local27 = Static194.aClass1_Sub26_Sub1_3.method2942();
				local35 = local27 >> 2;
				local48 = Static137.anIntArray255[local35];
				@Pc(913) byte local913 = Static194.aClass1_Sub26_Sub1_3.method2992();
				local60 = Static194.aClass1_Sub26_Sub1_3.method2977();
				local44 = local27 & 0x3;
				local66 = Static194.aClass1_Sub26_Sub1_3.method2977();
				local70 = Static194.aClass1_Sub26_Sub1_3.method2987();
				@Pc(933) byte local933 = Static194.aClass1_Sub26_Sub1_3.method2980();
				local78 = Static194.aClass1_Sub26_Sub1_3.method2972();
				local82 = (local78 >> 4 & 0x7) + Static89.anInt1937;
				@Pc(952) int local952 = Static209.anInt4459 + (local78 & 0x7);
				@Pc(956) byte local956 = Static194.aClass1_Sub26_Sub1_3.method2939();
				@Pc(961) Class5_Sub5_Sub1 local961;
				if (local12 == Static137.anInt2980) {
					local961 = Static204.aClass5_Sub5_Sub1_2;
				} else {
					local961 = Static198.aClass5_Sub5_Sub1Array1[local12];
				}
				if (local961 != null) {
					@Pc(973) Class101 local973 = Static170.method2725(local70);
					@Pc(982) int local982;
					@Pc(985) int local985;
					if (local44 == 1 || local44 == 3) {
						local985 = local973.anInt3922;
						local982 = local973.anInt3904;
					} else {
						local982 = local973.anInt3922;
						local985 = local973.anInt3904;
					}
					@Pc(1001) int local1001 = (local982 + 1 >> 1) + local82;
					@Pc(1009) int local1009 = (local985 + 1 >> 1) + local952;
					@Pc(1016) int local1016 = local82 + (local982 >> 1);
					@Pc(1022) int local1022 = (local985 >> 1) + local952;
					@Pc(1024) int[][] local1024 = null;
					@Pc(1028) int[][] local1028 = Static166.anIntArrayArrayArray11[Static191.anInt4237];
					if (Static191.anInt4237 < 3) {
						local1024 = Static166.anIntArrayArrayArray11[Static191.anInt4237 + 1];
					}
					@Pc(1064) int local1064 = local1028[local1016][local1009] + local1028[local1016][local1022] + local1028[local1001][local1022] + local1028[local1001][local1009] >> 2;
					@Pc(1072) int local1072 = (local985 << 6) + (local952 << 7);
					@Pc(1081) int local1081 = (local82 << 7) + (local982 << 6);
					@Pc(1096) Class80 local1096 = local973.method2839(local1072, false, local1028, local1024, local1081, null, local1064, local44, local35, local973.aBoolean350);
					if (local1096 != null) {
						Static94.method1583(-1, local60 + 1, local952, local82, 0, local48, 0, Static191.anInt4237, local66 + 1);
						@Pc(1122) byte local1122;
						if (local933 < local913) {
							local1122 = local913;
							local913 = local933;
							local933 = local1122;
						}
						local961.anInt1267 = Static128.anInt2802 + local66;
						local961.anInt1278 = local952 * 128 + local985 * 64;
						local961.anInt1268 = local933 + local82;
						local961.aClass5_Sub3_1 = (Class5_Sub3) local1096.aClass5_7;
						if (local897 < local956) {
							local1122 = local956;
							local956 = local897;
							local897 = local1122;
						}
						local961.anInt1289 = local956 + local952;
						local961.anInt1279 = local897 + local952;
						local961.anInt1283 = local60 + Static128.anInt2802;
						local961.anInt1275 = local1064;
						local961.anInt1260 = local982 * 64 + local82 * 128;
						local961.anInt1285 = local82 + local913;
					}
				}
			}
			if (Static176.anInt3812 == 61) {
				local12 = Static194.aClass1_Sub26_Sub1_3.method2945();
				local20 = (local12 >> 4 & 0x7) + Static89.anInt1937;
				local27 = Static209.anInt4459 + (local12 & 0x7);
				local35 = Static194.aClass1_Sub26_Sub1_3.method2945();
				local44 = local35 >> 2;
				local48 = local35 & 0x3;
				local54 = Static137.anIntArray255[local44];
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
					Static94.method1583(-1, 0, local27, local20, local48, local54, local44, Static191.anInt4237, -1);
				}
			} else if (Static176.anInt3812 == 60) {
				local12 = Static194.aClass1_Sub26_Sub1_3.method2945();
				local27 = (local12 & 0x7) + Static209.anInt4459;
				local20 = Static89.anInt1937 + (local12 >> 4 & 0x7);
				local35 = Static194.aClass1_Sub26_Sub1_3.method2964();
				local44 = Static194.aClass1_Sub26_Sub1_3.method2964();
				local48 = Static194.aClass1_Sub26_Sub1_3.method2964();
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
					@Pc(1315) Class120 local1315 = Static195.aClass120ArrayArrayArray2[Static191.anInt4237][local20][local27];
					if (local1315 != null) {
						for (@Pc(1322) Class1_Sub2_Sub18 local1322 = (Class1_Sub2_Sub18) local1315.method3564(); local1322 != null; local1322 = (Class1_Sub2_Sub18) local1315.method3561()) {
							@Pc(1327) Class5_Sub2 local1327 = local1322.aClass5_Sub2_1;
							if ((local35 & 0x7FFF) == local1327.anInt375 && local44 == local1327.anInt376) {
								local1327.anInt376 = local48;
								break;
							}
						}
						Static182.method3009(local20, local27);
					}
				}
			} else if (Static176.anInt3812 == 151) {
				local12 = Static194.aClass1_Sub26_Sub1_3.method2945();
				local27 = Static209.anInt4459 + (local12 & 0x7);
				local20 = (local12 >> 4 & 0x7) + Static89.anInt1937;
				local35 = Static194.aClass1_Sub26_Sub1_3.method2964();
				if (local35 == 65535) {
					local35 = -1;
				}
				local44 = Static194.aClass1_Sub26_Sub1_3.method2945();
				local54 = local44 & 0x7;
				local48 = local44 >> 4 & 0xF;
				local60 = Static194.aClass1_Sub26_Sub1_3.method2945();
				if (local20 >= 0 && local27 >= 0 && local20 < 104 && local27 < 104) {
					local66 = local48 + 1;
					if (local20 - local66 <= Static204.aClass5_Sub5_Sub1_2.anIntArray260[0] && local66 + local20 >= Static204.aClass5_Sub5_Sub1_2.anIntArray260[0] && Static204.aClass5_Sub5_Sub1_2.anIntArray256[0] >= local27 - local66 && local66 + local27 >= Static204.aClass5_Sub5_Sub1_2.anIntArray256[0] && Static90.anInt1961 != 0 && local54 > 0 && Static204.anInt2501 < 50 && local35 != -1) {
						Static173.anIntArray331[Static204.anInt2501] = local35;
						Static195.anIntArray352[Static204.anInt2501] = local54;
						Static157.anIntArray303[Static204.anInt2501] = local60;
						Static87.aClass43Array1[Static204.anInt2501] = null;
						Static161.anIntArray308[Static204.anInt2501] = local48 + (local27 << 8) + (local20 << 16);
						Static204.anInt2501++;
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!sc;)Z")
	public static boolean method1286(@OriginalArg(1) Class107 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(11) int local11 = 0; local11 < Static231.anInt4994; local11++) {
			if (arg0.method3096(Static178.aClass107Array23[local11])) {
				return true;
			}
		}
		return arg0.method3096(Static204.aClass5_Sub5_Sub1_2.aClass107_351);
	}
}
