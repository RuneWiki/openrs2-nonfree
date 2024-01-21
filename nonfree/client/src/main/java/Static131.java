import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "Z")
	public static boolean aBoolean131 = false;

	@OriginalMember(owner = "client!qc", name = "h", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1257 = Static51.method932("Titelbild geladen)3");

	@OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
	public static int anInt2908 = 0;

	@OriginalMember(owner = "client!qc", name = "v", descriptor = "Lclient!cd;")
	private static Class10 aClass10_1262 = Static51.method932("wave:");

	@OriginalMember(owner = "client!qc", name = "n", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1258 = aClass10_1262;

	@OriginalMember(owner = "client!qc", name = "o", descriptor = "I")
	public static int anInt2911 = 0;

	@OriginalMember(owner = "client!qc", name = "q", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1259 = Static51.method932("<col=00ff80>");

	@OriginalMember(owner = "client!qc", name = "r", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1260 = aClass10_1262;

	@OriginalMember(owner = "client!qc", name = "u", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1261 = Static51.method932("Benutzeroberfl-=che geladen)3");

	@OriginalMember(owner = "client!qc", name = "w", descriptor = "Lclient!cd;")
	public static Class10 aClass10_1263 = Static51.method932(")3");

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V")
	public static void method2085() {
		aClass10_1258 = null;
		aClass10_1260 = null;
		aClass10_1263 = null;
		aClass10_1261 = null;
		aClass10_1262 = null;
		aClass10_1259 = null;
		aClass10_1257 = null;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
	public static void method2086() {
		Static94.anInt2248 = 0;
		Static97.anInt2273 = 0;
		Static14.method225();
		Static134.method2143();
		Static88.method1013();
		@Pc(32) int local32;
		for (@Pc(26) int local26 = 0; local26 < Static94.anInt2248; local26++) {
			local32 = Static53.anIntArray144[local26];
			if (Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local32].anInt3491 != Static14.anInt386) {
				Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local32].aClass2_Sub1_Sub2_1 = null;
				Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[local32] = null;
			}
		}
		if (Static75.aClass2_Sub11_Sub1_1.anInt2077 != Static174.anInt3743) {
			throw new RuntimeException("gnp1 pos:" + Static75.aClass2_Sub11_Sub1_1.anInt2077 + " psize:" + Static174.anInt3743);
		}
		for (local32 = 0; local32 < Static64.anInt1578; local32++) {
			if (Static83.aClass2_Sub1_Sub3_Sub2_Sub2Array1[Static8.anIntArray15[local32]] == null) {
				throw new RuntimeException("gnp2 pos:" + local32 + " size:" + Static64.anInt1578);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V")
	public static void method2087() {
		Static141.aClass2_Sub11_Sub1_3.method1495(190);
		Static141.aClass2_Sub11_Sub1_3.method1458(0L);
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIIIIILclient!ob;Lclient!fh;I)V")
	public static void method2088(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class60 arg5, @OriginalArg(7) Class27 arg6, @OriginalArg(8) int arg7) {
		if (Static170.aBoolean163 && (Static50.aByteArrayArrayArray3[0][arg1][arg3] & 0x2) == 0) {
			if ((Static50.aByteArrayArrayArray3[arg2][arg1][arg3] & 0x10) != 0) {
				return;
			}
			if (Static150.method2543(arg1, arg2, arg3) != Static27.anInt760) {
				return;
			}
		}
		if (Static20.anInt500 > arg2) {
			Static20.anInt500 = arg2;
		}
		@Pc(52) Class2_Sub1_Sub10 local52 = Static62.method1106(arg7);
		@Pc(64) int[][] local64 = Static162.anIntArrayArrayArray8[arg2];
		@Pc(78) int local78;
		@Pc(75) int local75;
		if (arg0 == 1 || arg0 == 3) {
			local75 = local52.anInt2225;
			local78 = local52.anInt2210;
		} else {
			local75 = local52.anInt2210;
			local78 = local52.anInt2225;
		}
		@Pc(95) int local95 = (arg1 << 7) + (local78 << 6);
		@Pc(108) int local108;
		@Pc(117) int local117;
		if (local78 + arg1 <= 104) {
			local108 = (local78 >> 1) + arg1;
			local117 = arg1 + (local78 + 1 >> 1);
		} else {
			local108 = arg1;
			local117 = arg1 + 1;
		}
		@Pc(138) int local138;
		@Pc(147) int local147;
		if (local75 + arg3 <= 104) {
			local138 = (local75 >> 1) + arg3;
			local147 = arg3 + (local75 + 1 >> 1);
		} else {
			local138 = arg3;
			local147 = arg3 + 1;
		}
		@Pc(181) int local181 = local64[local108][local147] + local64[local117][local138] + local64[local108][local138] + local64[local117][local147] >> 2;
		@Pc(190) int local190 = (arg3 << 7) + (local75 << 6);
		@Pc(202) int local202 = (arg7 << 14) + arg1 + (arg3 << 7) + 1073741824;
		if (local52.anInt2212 == 0) {
			local202 += Integer.MIN_VALUE;
		}
		@Pc(218) int local218 = arg4 + (arg0 << 6);
		if (local52.anInt2247 == 1) {
			local218 += 256;
		}
		if (local52.method1576()) {
			Static142.method2245(arg1, arg3, local52, arg0, arg2);
		}
		@Pc(276) Class2_Sub1_Sub3 local276;
		if (arg4 != 22) {
			@Pc(383) int local383;
			if (arg4 == 10 || arg4 == 11) {
				if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
					local276 = local52.method1583(local190, arg0, local64, local181, 10, local95);
				} else {
					local276 = new Class2_Sub1_Sub3_Sub6(arg7, 10, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
				}
				if (local276 != null && arg5.method1801(arg2, arg1, arg3, local181, local78, local75, local276, arg4 == 11 ? 256 : 0, local202, local218) && local52.aBoolean99) {
					local383 = 15;
					if (local276 instanceof Class2_Sub1_Sub3_Sub3) {
						local383 = ((Class2_Sub1_Sub3_Sub3) local276).method826() / 4;
						if (local383 > 30) {
							local383 = 30;
						}
					}
					for (@Pc(401) int local401 = 0; local401 <= local78; local401++) {
						for (@Pc(405) int local405 = 0; local405 <= local75; local405++) {
							if (local383 > Static99.aByteArrayArrayArray8[arg2][arg1 + local401][arg3 + local405]) {
								Static99.aByteArrayArrayArray8[arg2][arg1 + local401][arg3 + local405] = (byte) local383;
							}
						}
					}
				}
				if (local52.anInt2220 != 0 && arg6 != null) {
					arg6.method944(local75, arg1, arg3, local78, local52.aBoolean94);
				}
			} else if (arg4 >= 12) {
				if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
					local276 = local52.method1583(local190, arg0, local64, local181, arg4, local95);
				} else {
					local276 = new Class2_Sub1_Sub3_Sub6(arg7, arg4, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
				}
				arg5.method1801(arg2, arg1, arg3, local181, 1, 1, local276, 0, local202, local218);
				if (arg4 >= 12 && arg4 <= 17 && arg4 != 13 && arg2 > 0) {
					Static37.anIntArrayArrayArray3[arg2][arg1][arg3] |= 0x924;
				}
				if (local52.anInt2220 != 0 && arg6 != null) {
					arg6.method944(local75, arg1, arg3, local78, local52.aBoolean94);
				}
			} else if (arg4 == 0) {
				if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
					local276 = local52.method1583(local190, arg0, local64, local181, 0, local95);
				} else {
					local276 = new Class2_Sub1_Sub3_Sub6(arg7, 0, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
				}
				arg5.method1825(arg2, arg1, arg3, local181, local276, null, Static142.anIntArray335[arg0], 0, local202, local218);
				if (arg0 == 0) {
					if (local52.aBoolean99) {
						Static99.aByteArrayArrayArray8[arg2][arg1][arg3] = 50;
						Static99.aByteArrayArrayArray8[arg2][arg1][arg3 + 1] = 50;
					}
					if (local52.aBoolean96) {
						Static37.anIntArrayArrayArray3[arg2][arg1][arg3] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local52.aBoolean99) {
						Static99.aByteArrayArrayArray8[arg2][arg1][arg3 + 1] = 50;
						Static99.aByteArrayArrayArray8[arg2][arg1 + 1][arg3 + 1] = 50;
					}
					if (local52.aBoolean96) {
						Static37.anIntArrayArrayArray3[arg2][arg1][arg3 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local52.aBoolean99) {
						Static99.aByteArrayArrayArray8[arg2][arg1 + 1][arg3] = 50;
						Static99.aByteArrayArrayArray8[arg2][arg1 + 1][arg3 + 1] = 50;
					}
					if (local52.aBoolean96) {
						Static37.anIntArrayArrayArray3[arg2][arg1 + 1][arg3] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local52.aBoolean99) {
						Static99.aByteArrayArrayArray8[arg2][arg1][arg3] = 50;
						Static99.aByteArrayArrayArray8[arg2][arg1 + 1][arg3] = 50;
					}
					if (local52.aBoolean96) {
						Static37.anIntArrayArrayArray3[arg2][arg1][arg3] |= 0x492;
					}
				}
				if (local52.anInt2220 != 0 && arg6 != null) {
					arg6.method941(arg4, arg1, local52.aBoolean94, arg3, arg0);
				}
				if (local52.anInt2240 != 16) {
					arg5.method1795(arg2, arg1, arg3, local52.anInt2240);
				}
			} else if (arg4 == 1) {
				if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
					local276 = local52.method1583(local190, arg0, local64, local181, 1, local95);
				} else {
					local276 = new Class2_Sub1_Sub3_Sub6(arg7, 1, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
				}
				arg5.method1825(arg2, arg1, arg3, local181, local276, null, Static6.anIntArray13[arg0], 0, local202, local218);
				if (local52.aBoolean99) {
					if (arg0 == 0) {
						Static99.aByteArrayArrayArray8[arg2][arg1][arg3 + 1] = 50;
					} else if (arg0 == 1) {
						Static99.aByteArrayArrayArray8[arg2][arg1 + 1][arg3 + 1] = 50;
					} else if (arg0 == 2) {
						Static99.aByteArrayArrayArray8[arg2][arg1 + 1][arg3] = 50;
					} else if (arg0 == 3) {
						Static99.aByteArrayArrayArray8[arg2][arg1][arg3] = 50;
					}
				}
				if (local52.anInt2220 != 0 && arg6 != null) {
					arg6.method941(arg4, arg1, local52.aBoolean94, arg3, arg0);
				}
			} else {
				@Pc(990) int local990;
				@Pc(1019) Class2_Sub1_Sub3 local1019;
				if (arg4 == 2) {
					local990 = arg0 + 1 & 0x3;
					@Pc(1009) Class2_Sub1_Sub3 local1009;
					if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
						local1009 = local52.method1583(local190, arg0 + 4, local64, local181, 2, local95);
						local1019 = local52.method1583(local190, local990, local64, local181, 2, local95);
					} else {
						local1009 = new Class2_Sub1_Sub3_Sub6(arg7, 2, arg0 + 4, arg2, arg1, arg3, local52.anInt2231, true, null);
						local1019 = new Class2_Sub1_Sub3_Sub6(arg7, 2, local990, arg2, arg1, arg3, local52.anInt2231, true, null);
					}
					arg5.method1825(arg2, arg1, arg3, local181, local1009, local1019, Static142.anIntArray335[arg0], Static142.anIntArray335[local990], local202, local218);
					if (local52.aBoolean96) {
						if (arg0 == 0) {
							Static37.anIntArrayArrayArray3[arg2][arg1][arg3] |= 0x249;
							Static37.anIntArrayArrayArray3[arg2][arg1][arg3 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static37.anIntArrayArrayArray3[arg2][arg1][arg3 + 1] |= 0x492;
							Static37.anIntArrayArrayArray3[arg2][arg1 + 1][arg3] |= 0x249;
						} else if (arg0 == 2) {
							Static37.anIntArrayArrayArray3[arg2][arg1 + 1][arg3] |= 0x249;
							Static37.anIntArrayArrayArray3[arg2][arg1][arg3] |= 0x492;
						} else if (arg0 == 3) {
							Static37.anIntArrayArrayArray3[arg2][arg1][arg3] |= 0x492;
							Static37.anIntArrayArrayArray3[arg2][arg1][arg3] |= 0x249;
						}
					}
					if (local52.anInt2220 != 0 && arg6 != null) {
						arg6.method941(arg4, arg1, local52.aBoolean94, arg3, arg0);
					}
					if (local52.anInt2240 != 16) {
						arg5.method1795(arg2, arg1, arg3, local52.anInt2240);
					}
				} else if (arg4 == 3) {
					if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
						local276 = local52.method1583(local190, arg0, local64, local181, 3, local95);
					} else {
						local276 = new Class2_Sub1_Sub3_Sub6(arg7, 3, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
					}
					arg5.method1825(arg2, arg1, arg3, local181, local276, null, Static6.anIntArray13[arg0], 0, local202, local218);
					if (local52.aBoolean99) {
						if (arg0 == 0) {
							Static99.aByteArrayArrayArray8[arg2][arg1][arg3 + 1] = 50;
						} else if (arg0 == 1) {
							Static99.aByteArrayArrayArray8[arg2][arg1 + 1][arg3 + 1] = 50;
						} else if (arg0 == 2) {
							Static99.aByteArrayArrayArray8[arg2][arg1 + 1][arg3] = 50;
						} else if (arg0 == 3) {
							Static99.aByteArrayArrayArray8[arg2][arg1][arg3] = 50;
						}
					}
					if (local52.anInt2220 != 0 && arg6 != null) {
						arg6.method941(arg4, arg1, local52.aBoolean94, arg3, arg0);
					}
				} else if (arg4 == 9) {
					if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
						local276 = local52.method1583(local190, arg0, local64, local181, arg4, local95);
					} else {
						local276 = new Class2_Sub1_Sub3_Sub6(arg7, arg4, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
					}
					arg5.method1801(arg2, arg1, arg3, local181, 1, 1, local276, 0, local202, local218);
					if (local52.anInt2220 != 0 && arg6 != null) {
						arg6.method944(local75, arg1, arg3, local78, local52.aBoolean94);
					}
					if (local52.anInt2240 != 16) {
						arg5.method1795(arg2, arg1, arg3, local52.anInt2240);
					}
				} else if (arg4 == 4) {
					if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
						local276 = local52.method1583(local190, arg0, local64, local181, 4, local95);
					} else {
						local276 = new Class2_Sub1_Sub3_Sub6(arg7, 4, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
					}
					arg5.method1794(arg2, arg1, arg3, local181, local276, null, Static142.anIntArray335[arg0], 0, 0, 0, local202, local218);
				} else if (arg4 == 5) {
					local990 = 16;
					local383 = arg5.method1785(arg2, arg1, arg3);
					if (local383 != 0) {
						local990 = Static62.method1106(local383 >> 14 & 0x7FFF).anInt2240;
					}
					if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
						local1019 = local52.method1583(local190, arg0, local64, local181, 4, local95);
					} else {
						local1019 = new Class2_Sub1_Sub3_Sub6(arg7, 4, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
					}
					arg5.method1794(arg2, arg1, arg3, local181, local1019, null, Static142.anIntArray335[arg0], 0, local990 * Static50.anIntArray141[arg0], local990 * Static51.anIntArray142[arg0], local202, local218);
				} else if (arg4 == 6) {
					local990 = 8;
					local383 = arg5.method1785(arg2, arg1, arg3);
					if (local383 != 0) {
						local990 = Static62.method1106(local383 >> 14 & 0x7FFF).anInt2240 / 2;
					}
					if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
						local1019 = local52.method1583(local190, arg0 + 4, local64, local181, 4, local95);
					} else {
						local1019 = new Class2_Sub1_Sub3_Sub6(arg7, 4, arg0 + 4, arg2, arg1, arg3, local52.anInt2231, true, null);
					}
					arg5.method1794(arg2, arg1, arg3, local181, local1019, null, 256, arg0, local990 * Static85.anIntArray212[arg0], Static87.anIntArray223[arg0] * local990, local202, local218);
				} else if (arg4 == 7) {
					local383 = arg0 + 2 & 0x3;
					if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
						local276 = local52.method1583(local190, local383 + 4, local64, local181, 4, local95);
					} else {
						local276 = new Class2_Sub1_Sub3_Sub6(arg7, 4, local383 + 4, arg2, arg1, arg3, local52.anInt2231, true, null);
					}
					arg5.method1794(arg2, arg1, arg3, local181, local276, null, 256, local383, 0, 0, local202, local218);
				} else if (arg4 == 8) {
					local990 = 8;
					local383 = arg5.method1785(arg2, arg1, arg3);
					@Pc(1788) int local1788 = arg0 + 2 & 0x3;
					if (local383 != 0) {
						local990 = Static62.method1106(local383 >> 14 & 0x7FFF).anInt2240 / 2;
					}
					@Pc(1841) Class2_Sub1_Sub3 local1841;
					if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
						local1019 = local52.method1583(local190, arg0 + 4, local64, local181, 4, local95);
						local1841 = local52.method1583(local190, local1788 + 4, local64, local181, 4, local95);
					} else {
						local1019 = new Class2_Sub1_Sub3_Sub6(arg7, 4, arg0 + 4, arg2, arg1, arg3, local52.anInt2231, true, null);
						local1841 = new Class2_Sub1_Sub3_Sub6(arg7, 4, local1788 + 4, arg2, arg1, arg3, local52.anInt2231, true, null);
					}
					arg5.method1794(arg2, arg1, arg3, local181, local1019, local1841, 256, arg0, local990 * Static85.anIntArray212[arg0], Static87.anIntArray223[arg0] * local990, local202, local218);
				}
			}
		} else if (!Static170.aBoolean163 || local52.anInt2212 != 0 || local52.anInt2220 == 1 || local52.aBoolean97) {
			if (local52.anInt2231 == -1 && local52.anIntArray234 == null) {
				local276 = local52.method1583(local190, arg0, local64, local181, 22, local95);
			} else {
				local276 = new Class2_Sub1_Sub3_Sub6(arg7, 22, arg0, arg2, arg1, arg3, local52.anInt2231, true, null);
			}
			arg5.method1823(arg2, arg1, arg3, local181, local276, local202, local218);
			if (local52.anInt2220 == 1 && arg6 != null) {
				arg6.method940(arg3, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IILclient!gb;I)V")
	public static void method2089(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub1_Sub3_Sub2_Sub1 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == arg1.anInt3509 && arg2 != -1) {
			@Pc(53) int local53 = Static19.method325(arg2).anInt1920;
			if (local53 == 1) {
				arg1.anInt3481 = arg0;
				arg1.anInt3497 = 0;
				arg1.anInt3458 = 0;
				arg1.anInt3473 = 0;
			}
			if (local53 == 2) {
				arg1.anInt3497 = 0;
			}
		} else if (arg2 == -1 || arg1.anInt3509 == -1 || Static19.method325(arg2).anInt1927 >= Static19.method325(arg1.anInt3509).anInt1927) {
			arg1.anInt3473 = 0;
			arg1.anInt3469 = arg1.anInt3476;
			arg1.anInt3458 = 0;
			arg1.anInt3481 = arg0;
			arg1.anInt3509 = arg2;
			arg1.anInt3497 = 0;
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(B)V")
	public static void method2090() {
		if (!Static69.aBoolean74) {
			return;
		}
		@Pc(11) Class23 local11 = Static14.method222(Static169.anInt3668, Static148.anInt3212);
		if (local11 != null && local11.anObjectArray3 != null) {
			@Pc(20) Class2_Sub18 local20 = new Class2_Sub18();
			local20.aClass23_9 = local11;
			local20.anObjectArray29 = local11.anObjectArray3;
			Static47.method881(local20);
		}
		Static69.aBoolean74 = false;
		Static3.method34(local11);
	}
}
