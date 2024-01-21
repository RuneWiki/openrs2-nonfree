import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!g", name = "d", descriptor = "Lclient!kb;")
	public static Class9 aClass9_14;

	@OriginalMember(owner = "client!g", name = "k", descriptor = "[[B")
	public static byte[][] aByteArrayArray3;

	@OriginalMember(owner = "client!g", name = "q", descriptor = "Lclient!kb;")
	public static Class9 aClass9_15;

	@OriginalMember(owner = "client!g", name = "v", descriptor = "Lclient!kb;")
	public static Class9 aClass9_16;

	@OriginalMember(owner = "client!g", name = "b", descriptor = "I")
	public static int anInt938 = 0;

	@OriginalMember(owner = "client!g", name = "h", descriptor = "Lclient!v;")
	private static Class62 aClass62_393 = Static45.method753("Members object");

	@OriginalMember(owner = "client!g", name = "l", descriptor = "Lclient!v;")
	public static Class62 aClass62_394 = Static45.method753("*6n");

	@OriginalMember(owner = "client!g", name = "m", descriptor = "Lclient!v;")
	public static Class62 aClass62_395 = aClass62_393;

	@OriginalMember(owner = "client!g", name = "s", descriptor = "Z")
	public static volatile boolean aBoolean48 = true;

	@OriginalMember(owner = "client!g", name = "t", descriptor = "Lclient!v;")
	public static Class62 aClass62_396 = Static45.method753("Registrierter Benutzer");

	@OriginalMember(owner = "client!g", name = "z", descriptor = "Lclient!v;")
	public static Class62 aClass62_397 = Static45.method753("null");

	@OriginalMember(owner = "client!g", name = "D", descriptor = "Lclient!v;")
	public static Class62 aClass62_398 = Static45.method753("backleft2");

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(IBIILclient!cc;IILclient!a;I)V")
	public static void method580(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class11 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class1 arg6, @OriginalArg(8) int arg7) {
		if (Static92.aBoolean151 && (Static44.aByteArrayArrayArray6[0][arg5][arg1] & 0x2) == 0) {
			if ((Static44.aByteArrayArrayArray6[arg2][arg5][arg1] & 0x10) != 0) {
				return;
			}
			if (Static30.method596(arg1, arg5, arg2) != Static51.anInt2321) {
				return;
			}
		}
		if (Static78.anInt2069 > arg2) {
			Static78.anInt2069 = arg2;
		}
		@Pc(52) int local52 = Static79.anIntArrayArrayArray4[arg2][arg5][arg1];
		@Pc(62) int local62 = Static79.anIntArrayArrayArray4[arg2][arg5 + 1][arg1];
		@Pc(74) int local74 = Static79.anIntArrayArrayArray4[arg2][arg5 + 1][arg1 + 1];
		@Pc(86) int local86 = (arg4 << 14) + (arg1 << 7) + arg5 + 1073741824;
		@Pc(96) int local96 = Static79.anIntArrayArrayArray4[arg2][arg5][arg1 + 1];
		@Pc(103) int local103 = (arg0 << 6) + arg7;
		@Pc(107) Class3_Sub1_Sub9 local107 = Static10.method1322(arg4);
		@Pc(118) int local118 = local96 + local62 + local52 + local74 >> 2;
		if (local107.anInt1056 == 1) {
			local103 += 256;
		}
		if (local107.anInt1063 == 0) {
			local86 += Integer.MIN_VALUE;
		}
		if (local107.method643()) {
			Static28.method574(arg1, local107, arg2, arg5, arg0);
		}
		@Pc(181) Class3_Sub1_Sub3 local181;
		if (arg7 != 22) {
			@Pc(281) int local281;
			if (arg7 == 10 || arg7 == 11) {
				if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
					local181 = local107.method656(local62, local96, local74, 10, local52, arg0);
				} else {
					local181 = new Class3_Sub1_Sub3_Sub2(arg4, 10, arg0, local52, local62, local74, local96, local107.anInt1070, true);
				}
				if (local181 != null) {
					@Pc(278) int local278;
					if (arg0 == 1 || arg0 == 3) {
						local281 = local107.anInt1061;
						local278 = local107.anInt1068;
					} else {
						local278 = local107.anInt1061;
						local281 = local107.anInt1068;
					}
					@Pc(291) int local291 = 0;
					if (arg7 == 11) {
						local291 += 256;
					}
					if (arg6.method6(arg2, arg5, arg1, local118, local281, local278, local181, local291, local86, local103) && local107.aBoolean53) {
						@Pc(326) Class3_Sub1_Sub3_Sub3 local326;
						if (local181 instanceof Class3_Sub1_Sub3_Sub3) {
							local326 = (Class3_Sub1_Sub3_Sub3) local181;
						} else {
							local326 = local107.method656(local62, local96, local74, 10, local52, arg0);
						}
						if (local326 != null) {
							for (@Pc(335) int local335 = 0; local335 <= local281; local335++) {
								for (@Pc(339) int local339 = 0; local339 <= local278; local339++) {
									@Pc(346) int local346 = local326.method967() / 4;
									if (local346 > 30) {
										local346 = 30;
									}
									if (local346 > Static20.aByteArrayArrayArray4[arg2][local335 + arg5][local339 + arg1]) {
										Static20.aByteArrayArrayArray4[arg2][arg5 + local335][local339 + arg1] = (byte) local346;
									}
								}
							}
						}
					}
				}
				if (local107.aBoolean60 && arg3 != null) {
					arg3.method309(arg0, local107.anInt1061, arg5, local107.anInt1068, arg1, local107.aBoolean54);
				}
			} else if (arg7 >= 12) {
				if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
					local181 = local107.method656(local62, local96, local74, arg7, local52, arg0);
				} else {
					local181 = new Class3_Sub1_Sub3_Sub2(arg4, arg7, arg0, local52, local62, local74, local96, local107.anInt1070, true);
				}
				arg6.method6(arg2, arg5, arg1, local118, 1, 1, local181, 0, local86, local103);
				if (arg7 >= 12 && arg7 <= 17 && arg7 != 13 && arg2 > 0) {
					Static72.anIntArrayArrayArray3[arg2][arg5][arg1] |= 0x924;
				}
				if (local107.aBoolean60 && arg3 != null) {
					arg3.method309(arg0, local107.anInt1061, arg5, local107.anInt1068, arg1, local107.aBoolean54);
				}
			} else if (arg7 == 0) {
				if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
					local181 = local107.method656(local62, local96, local74, 0, local52, arg0);
				} else {
					local181 = new Class3_Sub1_Sub3_Sub2(arg4, 0, arg0, local52, local62, local74, local96, local107.anInt1070, true);
				}
				arg6.method19(arg2, arg5, arg1, local118, local181, null, Static64.anIntArray183[arg0], 0, local86, local103);
				if (arg0 == 0) {
					if (local107.aBoolean53) {
						Static20.aByteArrayArrayArray4[arg2][arg5][arg1] = 50;
						Static20.aByteArrayArrayArray4[arg2][arg5][arg1 + 1] = 50;
					}
					if (local107.aBoolean57) {
						Static72.anIntArrayArrayArray3[arg2][arg5][arg1] |= 0x249;
					}
				} else if (arg0 == 1) {
					if (local107.aBoolean53) {
						Static20.aByteArrayArrayArray4[arg2][arg5][arg1 + 1] = 50;
						Static20.aByteArrayArrayArray4[arg2][arg5 + 1][arg1 + 1] = 50;
					}
					if (local107.aBoolean57) {
						Static72.anIntArrayArrayArray3[arg2][arg5][arg1 + 1] |= 0x492;
					}
				} else if (arg0 == 2) {
					if (local107.aBoolean53) {
						Static20.aByteArrayArrayArray4[arg2][arg5 + 1][arg1] = 50;
						Static20.aByteArrayArrayArray4[arg2][arg5 + 1][arg1 + 1] = 50;
					}
					if (local107.aBoolean57) {
						Static72.anIntArrayArrayArray3[arg2][arg5 + 1][arg1] |= 0x249;
					}
				} else if (arg0 == 3) {
					if (local107.aBoolean53) {
						Static20.aByteArrayArrayArray4[arg2][arg5][arg1] = 50;
						Static20.aByteArrayArrayArray4[arg2][arg5 + 1][arg1] = 50;
					}
					if (local107.aBoolean57) {
						Static72.anIntArrayArrayArray3[arg2][arg5][arg1] |= 0x492;
					}
				}
				if (local107.aBoolean60 && arg3 != null) {
					arg3.method304(arg1, arg7, arg0, arg5, local107.aBoolean54);
				}
				if (local107.anInt1072 != 16) {
					arg6.method33(arg2, arg5, arg1, local107.anInt1072);
				}
			} else if (arg7 == 1) {
				if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
					local181 = local107.method656(local62, local96, local74, 1, local52, arg0);
				} else {
					local181 = new Class3_Sub1_Sub3_Sub2(arg4, 1, arg0, local52, local62, local74, local96, local107.anInt1070, true);
				}
				arg6.method19(arg2, arg5, arg1, local118, local181, null, Static23.anIntArray58[arg0], 0, local86, local103);
				if (local107.aBoolean53) {
					if (arg0 == 0) {
						Static20.aByteArrayArrayArray4[arg2][arg5][arg1 + 1] = 50;
					} else if (arg0 == 1) {
						Static20.aByteArrayArrayArray4[arg2][arg5 + 1][arg1 + 1] = 50;
					} else if (arg0 == 2) {
						Static20.aByteArrayArrayArray4[arg2][arg5 + 1][arg1] = 50;
					} else if (arg0 == 3) {
						Static20.aByteArrayArrayArray4[arg2][arg5][arg1] = 50;
					}
				}
				if (local107.aBoolean60 && arg3 != null) {
					arg3.method304(arg1, arg7, arg0, arg5, local107.aBoolean54);
				}
			} else {
				@Pc(934) int local934;
				@Pc(965) Class3_Sub1_Sub3 local965;
				if (arg7 == 2) {
					local934 = arg0 + 1 & 0x3;
					@Pc(953) Class3_Sub1_Sub3 local953;
					if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
						local953 = local107.method656(local62, local96, local74, 2, local52, arg0 + 4);
						local965 = local107.method656(local62, local96, local74, 2, local52, local934);
					} else {
						local953 = new Class3_Sub1_Sub3_Sub2(arg4, 2, arg0 + 4, local52, local62, local74, local96, local107.anInt1070, true);
						local965 = new Class3_Sub1_Sub3_Sub2(arg4, 2, local934, local52, local62, local74, local96, local107.anInt1070, true);
					}
					arg6.method19(arg2, arg5, arg1, local118, local953, local965, Static64.anIntArray183[arg0], Static64.anIntArray183[local934], local86, local103);
					if (local107.aBoolean57) {
						if (arg0 == 0) {
							Static72.anIntArrayArrayArray3[arg2][arg5][arg1] |= 0x249;
							Static72.anIntArrayArrayArray3[arg2][arg5][arg1 + 1] |= 0x492;
						} else if (arg0 == 1) {
							Static72.anIntArrayArrayArray3[arg2][arg5][arg1 + 1] |= 0x492;
							Static72.anIntArrayArrayArray3[arg2][arg5 + 1][arg1] |= 0x249;
						} else if (arg0 == 2) {
							Static72.anIntArrayArrayArray3[arg2][arg5 + 1][arg1] |= 0x249;
							Static72.anIntArrayArrayArray3[arg2][arg5][arg1] |= 0x492;
						} else if (arg0 == 3) {
							Static72.anIntArrayArrayArray3[arg2][arg5][arg1] |= 0x492;
							Static72.anIntArrayArrayArray3[arg2][arg5][arg1] |= 0x249;
						}
					}
					if (local107.aBoolean60 && arg3 != null) {
						arg3.method304(arg1, arg7, arg0, arg5, local107.aBoolean54);
					}
					if (local107.anInt1072 != 16) {
						arg6.method33(arg2, arg5, arg1, local107.anInt1072);
					}
				} else if (arg7 == 3) {
					if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
						local181 = local107.method656(local62, local96, local74, 3, local52, arg0);
					} else {
						local181 = new Class3_Sub1_Sub3_Sub2(arg4, 3, arg0, local52, local62, local74, local96, local107.anInt1070, true);
					}
					arg6.method19(arg2, arg5, arg1, local118, local181, null, Static23.anIntArray58[arg0], 0, local86, local103);
					if (local107.aBoolean53) {
						if (arg0 == 0) {
							Static20.aByteArrayArrayArray4[arg2][arg5][arg1 + 1] = 50;
						} else if (arg0 == 1) {
							Static20.aByteArrayArrayArray4[arg2][arg5 + 1][arg1 + 1] = 50;
						} else if (arg0 == 2) {
							Static20.aByteArrayArrayArray4[arg2][arg5 + 1][arg1] = 50;
						} else if (arg0 == 3) {
							Static20.aByteArrayArrayArray4[arg2][arg5][arg1] = 50;
						}
					}
					if (local107.aBoolean60 && arg3 != null) {
						arg3.method304(arg1, arg7, arg0, arg5, local107.aBoolean54);
					}
				} else if (arg7 == 9) {
					if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
						local181 = local107.method656(local62, local96, local74, arg7, local52, arg0);
					} else {
						local181 = new Class3_Sub1_Sub3_Sub2(arg4, arg7, arg0, local52, local62, local74, local96, local107.anInt1070, true);
					}
					arg6.method6(arg2, arg5, arg1, local118, 1, 1, local181, 0, local86, local103);
					if (local107.aBoolean60 && arg3 != null) {
						arg3.method309(arg0, local107.anInt1061, arg5, local107.anInt1068, arg1, local107.aBoolean54);
					}
				} else {
					if (local107.aBoolean61) {
						if (arg0 == 1) {
							local934 = local96;
							local96 = local74;
							local74 = local62;
							local62 = local52;
							local52 = local934;
						} else if (arg0 == 2) {
							local934 = local96;
							local96 = local62;
							local62 = local934;
							@Pc(1429) int local1429 = local74;
							local74 = local52;
							local52 = local1429;
						} else if (arg0 == 3) {
							local934 = local96;
							local96 = local52;
							local52 = local62;
							local62 = local74;
							local74 = local934;
						}
					}
					if (arg7 == 4) {
						if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
							local181 = local107.method656(local62, local96, local74, 4, local52, 0);
						} else {
							local181 = new Class3_Sub1_Sub3_Sub2(arg4, 4, 0, local52, local62, local74, local96, local107.anInt1070, true);
						}
						arg6.method31(arg2, arg5, arg1, local118, local181, Static64.anIntArray183[arg0], arg0 * 512, 0, 0, local86, local103);
					} else if (arg7 == 5) {
						local281 = arg6.method47(arg2, arg5, arg1);
						local934 = 16;
						if (local281 > 0) {
							local934 = Static10.method1322(local281 >> 14 & 0x7FFF).anInt1072;
						}
						if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
							local965 = local107.method656(local62, local96, local74, 4, local52, 0);
						} else {
							local965 = new Class3_Sub1_Sub3_Sub2(arg4, 4, 0, local52, local62, local74, local96, local107.anInt1070, true);
						}
						arg6.method31(arg2, arg5, arg1, local118, local965, Static64.anIntArray183[arg0], arg0 * 512, local934 * Static25.anIntArray61[arg0], local934 * Static44.anIntArray98[arg0], local86, local103);
					} else if (arg7 == 6) {
						if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
							local181 = local107.method656(local62, local96, local74, 4, local52, 0);
						} else {
							local181 = new Class3_Sub1_Sub3_Sub2(arg4, 4, 0, local52, local62, local74, local96, local107.anInt1070, true);
						}
						arg6.method31(arg2, arg5, arg1, local118, local181, 256, arg0, 0, 0, local86, local103);
					} else if (arg7 == 7) {
						if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
							local181 = local107.method656(local62, local96, local74, 4, local52, 0);
						} else {
							local181 = new Class3_Sub1_Sub3_Sub2(arg4, 4, 0, local52, local62, local74, local96, local107.anInt1070, true);
						}
						arg6.method31(arg2, arg5, arg1, local118, local181, 512, arg0, 0, 0, local86, local103);
					} else if (arg7 == 8) {
						if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
							local181 = local107.method656(local62, local96, local74, 4, local52, 0);
						} else {
							local181 = new Class3_Sub1_Sub3_Sub2(arg4, 4, 0, local52, local62, local74, local96, local107.anInt1070, true);
						}
						arg6.method31(arg2, arg5, arg1, local118, local181, 768, arg0, 0, 0, local86, local103);
					}
				}
			}
		} else if (!Static92.aBoolean151 || local107.anInt1063 != 0 || local107.aBoolean58) {
			if (local107.anInt1070 == -1 && local107.anIntArray72 == null) {
				local181 = local107.method656(local62, local96, local74, 22, local52, arg0);
			} else {
				local181 = new Class3_Sub1_Sub3_Sub2(arg4, 22, arg0, local52, local62, local74, local96, local107.anInt1070, true);
			}
			arg6.method52(arg2, arg5, arg1, local118, local181, local86, local103);
			if (local107.aBoolean60 && local107.anInt1063 == 1 && arg3 != null) {
				arg3.method314(arg5, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "([BI)V")
	public static void method581(@OriginalArg(0) byte[] arg0) {
		@Pc(14) Class3_Sub8 local14 = new Class3_Sub8(arg0);
		local14.anInt2704 = arg0.length - 2;
		Static99.anInt2603 = local14.method1789();
		Static75.anIntArray228 = new int[Static99.anInt2603];
		Static50.anIntArray310 = new int[Static99.anInt2603];
		Static36.anIntArray78 = new int[Static99.anInt2603];
		Static98.anIntArray281 = new int[Static99.anInt2603];
		Static98.aByteArrayArray9 = new byte[Static99.anInt2603][];
		local14.anInt2704 = arg0.length - Static99.anInt2603 * 8 - 7;
		Static39.anInt1163 = local14.method1789();
		Static14.anInt551 = local14.method1789();
		@Pc(66) int local66 = (local14.method1803() & 0xFF) + 1;
		for (@Pc(68) int local68 = 0; local68 < Static99.anInt2603; local68++) {
			Static98.anIntArray281[local68] = local14.method1789();
		}
		for (@Pc(86) int local86 = 0; local86 < Static99.anInt2603; local86++) {
			Static36.anIntArray78[local86] = local14.method1789();
		}
		for (@Pc(104) int local104 = 0; local104 < Static99.anInt2603; local104++) {
			Static75.anIntArray228[local104] = local14.method1789();
		}
		for (@Pc(118) int local118 = 0; local118 < Static99.anInt2603; local118++) {
			Static50.anIntArray310[local118] = local14.method1789();
		}
		local14.anInt2704 = arg0.length + 3 - Static99.anInt2603 * 8 - local66 * 3 - 7;
		Static70.anIntArray201 = new int[local66];
		for (@Pc(152) int local152 = 1; local152 < local66; local152++) {
			Static70.anIntArray201[local152] = local14.method1786();
			if (Static70.anIntArray201[local152] == 0) {
				Static70.anIntArray201[local152] = 1;
			}
		}
		local14.anInt2704 = 0;
		for (@Pc(181) int local181 = 0; local181 < Static99.anInt2603; local181++) {
			@Pc(187) int local187 = Static75.anIntArray228[local181];
			@Pc(191) int local191 = Static50.anIntArray310[local181];
			@Pc(195) int local195 = local191 * local187;
			@Pc(198) byte[] local198 = new byte[local195];
			Static98.aByteArrayArray9[local181] = local198;
			@Pc(206) int local206 = local14.method1803();
			@Pc(216) int local216;
			if (local206 == 0) {
				for (local216 = 0; local216 < local195; local216++) {
					local198[local216] = local14.method1765();
				}
			} else if (local206 == 1) {
				for (local216 = 0; local216 < local187; local216++) {
					for (@Pc(220) int local220 = 0; local220 < local191; local220++) {
						local198[local216 + local187 * local220] = local14.method1765();
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
	public static void method582() {
		Static83.aClass34_7.method762();
		Static22.aClass34_10.method762();
	}

	@OriginalMember(owner = "client!g", name = "b", descriptor = "(I)V")
	public static void method583() {
		aClass62_394 = null;
		aClass62_398 = null;
		aByteArrayArray3 = null;
		aClass62_395 = null;
		aClass9_15 = null;
		aClass9_14 = null;
		aClass62_396 = null;
		aClass9_16 = null;
		aClass62_397 = null;
		aClass62_393 = null;
	}
}
