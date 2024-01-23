import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static209 {

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString309;

	@OriginalMember(owner = "client!pe", name = "i", descriptor = "Lclient!cj;")
	public static Class27 aClass27_30;

	@OriginalMember(owner = "client!pe", name = "b", descriptor = "Lclient!jl;")
	public static Class89 aClass89_31 = new Class89(64);

	@OriginalMember(owner = "client!pe", name = "j", descriptor = "I")
	public static int anInt4543 = (int) (Math.random() * 17.0D) - 8;

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(Lclient!wf;I)Z")
	public static boolean method3349(@OriginalArg(0) Class191 arg0) {
		if (arg0.anInt6115 == 205) {
			Static95.anInt2198 = 250;
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(I[Lclient!wf;Z)V")
	public static void method3350(@OriginalArg(0) int arg0, @OriginalArg(1) Class191[] arg1) {
		for (@Pc(12) int local12 = 0; local12 < arg1.length; local12++) {
			@Pc(24) Class191 local24 = arg1[local12];
			if (local24 != null) {
				if (local24.anInt6086 == 0) {
					if (local24.aClass191Array2 != null) {
						method3350(arg0, local24.aClass191Array2);
					}
					@Pc(48) Class1_Sub12 local48 = (Class1_Sub12) Static48.aClass186_5.method4570((long) local24.anInt6134);
					if (local48 != null) {
						Static82.method1413(local48.anInt2208, arg0);
					}
				}
				@Pc(69) Class1_Sub27 local69;
				if (arg0 == 0 && local24.anObjectArray12 != null) {
					local69 = new Class1_Sub27();
					local69.anObjectArray1 = local24.anObjectArray12;
					local69.aClass191_14 = local24;
					Static140.method2329(local69);
				}
				if (arg0 == 1 && local24.anObjectArray6 != null) {
					if (local24.anInt6165 >= 0) {
						@Pc(98) Class191 local98 = Static171.method2789(local24.anInt6134);
						if (local98 == null || local98.aClass191Array2 == null || local98.aClass191Array2.length <= local24.anInt6165 || local24 != local98.aClass191Array2[local24.anInt6165]) {
							continue;
						}
					}
					local69 = new Class1_Sub27();
					local69.anObjectArray1 = local24.anObjectArray6;
					local69.aClass191_14 = local24;
					Static140.method2329(local69);
				}
			}
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ILclient!qm;I)V")
	public static void method3352(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub14 arg1) {
		if (Static251.aClass193_9 == null) {
			return;
		}
		try {
			Static251.aClass193_9.method4697(0L);
			Static251.aClass193_9.method4699(arg0, arg1.aByteArray55, 24);
		} catch (@Pc(20) Exception local20) {
		}
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(BZ)V")
	public static void method3353(@OriginalArg(1) boolean arg0) {
		@Pc(17) byte local17;
		@Pc(15) byte[][] local15;
		if (Static294.aBoolean367 && arg0) {
			local15 = Static72.aByteArrayArray10;
			local17 = 1;
		} else {
			local15 = Static230.aByteArrayArray13;
			local17 = 4;
		}
		@Pc(25) int[] local25 = null;
		for (@Pc(27) int local27 = 0; local27 < local17; local27++) {
			Static248.method3834();
			for (@Pc(38) int local38 = 0; local38 < 13; local38++) {
				for (@Pc(43) int local43 = 0; local43 < 13; local43++) {
					@Pc(56) int local56 = Static309.anIntArrayArrayArray15[local27][local38][local43];
					@Pc(58) boolean local58 = false;
					if (local56 != -1) {
						@Pc(70) int local70 = local56 >> 24 & 0x3;
						if (!arg0 || local70 == 0) {
							@Pc(81) int local81 = local56 >> 14 & 0x3FF;
							@Pc(87) int local87 = local56 >> 3 & 0x7FF;
							@Pc(97) int local97 = local87 / 8 + (local81 / 8 << 8);
							@Pc(103) int local103 = local56 >> 1 & 0x3;
							for (@Pc(105) int local105 = 0; local105 < Static234.anIntArray456.length; local105++) {
								if (Static234.anIntArray456[local105] == local97 && local15[local105] != null) {
									local58 = true;
									@Pc(139) int[] local139 = Static173.method2815(local70, Static82.aClass75Array1, local27, arg0, local87, local38 * 8, local15[local105], local81, local43 * 8, local103);
									if (local25 == null && local139 != null) {
										local25 = local139;
									}
									break;
								}
							}
						}
					}
					if (!local58) {
						Static260.method3990(local38 * 8, local43 * 8, 8, local27, 8);
					}
				}
			}
		}
		if (local25 == null) {
			Static3.anInt56 = -1;
			return;
		}
		Static240.anInt5002 = local25[4];
		Static229.anInt4845 = local25[2];
		Static3.anInt56 = local25[0];
		Static245.anInt5023 = local25[3];
		Static64.anInt1383 = local25[1];
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(III[[[BIBII)V")
	public static void method3354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[][][] arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		Static108.anInt2392++;
		Static86.anInt2119 = 0;
		@Pc(9) int local9 = arg6 - 16;
		@Pc(13) int local13 = arg6 + 16;
		@Pc(17) int local17 = arg7 - 16;
		@Pc(21) int local21 = arg7 + 16;
		@Pc(32) int local32;
		@Pc(37) int local37;
		@Pc(183) int local183;
		for (@Pc(23) int local23 = Static302.anInt5981; local23 < Static155.anInt3493; local23++) {
			@Pc(30) Class1_Sub2[][] local30 = Static7.aClass1_Sub2ArrayArrayArray1[local23];
			for (local32 = Static194.anInt4264; local32 < Static235.anInt4964; local32++) {
				for (local37 = Static151.anInt3397; local37 < Static163.anInt3564; local37++) {
					@Pc(46) Class1_Sub2 local46 = local30[local32][local37];
					if (local46 != null) {
						if (Static166.aBooleanArrayArray3[local32 + Static145.anInt6062 - Static101.anInt152][local37 + Static145.anInt6062 - Static245.anInt5022] && (arg3 == null || local23 < arg4 || arg3[local23][local32][local37] != arg5)) {
							local46.aBoolean4 = true;
							local46.aBoolean5 = true;
							if (local46.anInt45 > 0) {
								local46.aBoolean3 = true;
							} else {
								local46.aBoolean3 = false;
							}
							Static86.anInt2119++;
						} else {
							local46.aBoolean4 = false;
							local46.aBoolean5 = false;
							local46.anInt50 = 0;
							if (local32 >= local9 && local32 <= local13 && local37 >= local17 && local37 <= local21) {
								if (local46.aClass136_1 != null) {
									@Pc(103) Class136 local103 = local46.aClass136_1;
									local103.aClass2_10.method3945(0, local23, local103.anInt4701, local103.anInt4699, local103.anInt4697);
									if (local103.aClass2_9 != null) {
										local103.aClass2_9.method3945(0, local23, local103.anInt4701, local103.anInt4699, local103.anInt4697);
									}
								}
								if (local46.aClass106_1 != null) {
									@Pc(134) Class106 local134 = local46.aClass106_1;
									local134.aClass2_5.method3945(local134.anInt3755, local23, local134.anInt3752, local134.anInt3756, local134.anInt3753);
									if (local134.aClass2_6 != null) {
										local134.aClass2_6.method3945(local134.anInt3755, local23, local134.anInt3752, local134.anInt3756, local134.anInt3753);
									}
								}
								if (local46.aClass119_1 != null) {
									@Pc(167) Class119 local167 = local46.aClass119_1;
									local167.aClass2_7.method3945(0, local23, local167.anInt4260, local167.anInt4258, local167.anInt4261);
								}
								if (local46.aClass7Array1 != null) {
									for (local183 = 0; local183 < local46.anInt45; local183++) {
										@Pc(192) Class7 local192 = local46.aClass7Array1[local183];
										local192.aClass2_1.method3945(local192.anInt223, local23, local192.anInt216, local192.anInt217, local192.anInt219);
									}
								}
							}
						}
					}
				}
			}
		}
		@Pc(240) boolean local240 = Static46.anIntArrayArrayArray1 == Static222.anIntArrayArrayArray12;
		if (Static294.aBoolean367) {
			@Pc(244) GL local244 = Static294.aGL1;
			local244.glPushMatrix();
			local244.glTranslatef((float) -arg0, (float) -arg1, (float) -arg2);
			if (local240) {
				Static85.method1463();
				Static1.method4721(-1, 3);
				Static214.aBoolean289 = true;
				Static239.method3768();
				Static85.anInt1982 = -1;
				Static146.anInt4436 = -1;
				for (local32 = 0; local32 < Static111.aClass1_Sub28ArrayArray1[0].length; local32++) {
					@Pc(285) Class1_Sub28 local285 = Static111.aClass1_Sub28ArrayArray1[0][local32];
					@Pc(294) float local294 = 251.5F - (local285.aBoolean346 ? 1.0F : 0.5F);
					if (local285.anInt5511 != Static85.anInt1982) {
						Static85.anInt1982 = local285.anInt5511;
						Static115.method1849(local285.anInt5511);
						Static180.method2902(Static111.method1808());
					}
					local285.method4172(Static7.aClass1_Sub2ArrayArrayArray1, local294, false);
				}
				Static239.method3767();
			} else {
				local32 = Static302.anInt5981;
				while (true) {
					if (local32 >= Static155.anInt3493) {
						Static191.method3091(Static101.anInt152, Static245.anInt5022, Static7.aClass1_Sub2ArrayArrayArray1);
						break;
					}
					for (local37 = 0; local37 < Static111.aClass1_Sub28ArrayArray1[local32].length; local37++) {
						@Pc(336) Class1_Sub28 local336 = Static111.aClass1_Sub28ArrayArray1[local32][local37];
						@Pc(350) float local350 = 201.5F - (float) local32 * 50.0F - (local336.aBoolean346 ? 1.0F : 0.5F);
						if (local336.anInt5509 != -1 && Static222.method3475(Static237.anInterface1_1.method4601(local336.anInt5509)) && Static255.aBoolean321) {
							Static115.method1849(local336.anInt5511);
						}
						local336.method4172(Static7.aClass1_Sub2ArrayArrayArray1, local350, false);
					}
					if (local32 == 0 && Static208.anInt4490 > 0) {
						Static294.method4511(101.5F);
						Static177.method2846(Static101.anInt152, Static245.anInt5022, Static145.anInt6062, arg1, Static166.aBooleanArrayArray3, Static46.anIntArrayArrayArray1[0]);
					}
					local32++;
				}
			}
			local244.glPopMatrix();
		}
		@Pc(435) int local435;
		@Pc(439) int local439;
		@Pc(451) Class1_Sub2 local451;
		@Pc(400) int local400;
		@Pc(407) Class1_Sub2[][] local407;
		@Pc(416) int local416;
		@Pc(429) int local429;
		for (local400 = Static302.anInt5981; local400 < Static155.anInt3493; local400++) {
			local407 = Static7.aClass1_Sub2ArrayArrayArray1[local400];
			for (local37 = -Static145.anInt6062; local37 <= 0; local37++) {
				local416 = Static101.anInt152 + local37;
				local183 = Static101.anInt152 - local37;
				if (local416 >= Static194.anInt4264 || local183 < Static235.anInt4964) {
					for (local429 = -Static145.anInt6062; local429 <= 0; local429++) {
						local435 = Static245.anInt5022 + local429;
						local439 = Static245.anInt5022 - local429;
						if (local416 >= Static194.anInt4264) {
							if (local435 >= Static151.anInt3397) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean4) {
									Static55.method1033(local451, true);
								}
							}
							if (local439 < Static163.anInt3564) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean4) {
									Static55.method1033(local451, true);
								}
							}
						}
						if (local183 < Static235.anInt4964) {
							if (local435 >= Static151.anInt3397) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean4) {
									Static55.method1033(local451, true);
								}
							}
							if (local439 < Static163.anInt3564) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean4) {
									Static55.method1033(local451, true);
								}
							}
						}
						if (Static86.anInt2119 == 0) {
							if (!local240) {
								Static161.aBoolean231 = false;
							}
							return;
						}
					}
				}
			}
		}
		for (local400 = Static302.anInt5981; local400 < Static155.anInt3493; local400++) {
			local407 = Static7.aClass1_Sub2ArrayArrayArray1[local400];
			for (local37 = -Static145.anInt6062; local37 <= 0; local37++) {
				local416 = Static101.anInt152 + local37;
				local183 = Static101.anInt152 - local37;
				if (local416 >= Static194.anInt4264 || local183 < Static235.anInt4964) {
					for (local429 = -Static145.anInt6062; local429 <= 0; local429++) {
						local435 = Static245.anInt5022 + local429;
						local439 = Static245.anInt5022 - local429;
						if (local416 >= Static194.anInt4264) {
							if (local435 >= Static151.anInt3397) {
								local451 = local407[local416][local435];
								if (local451 != null && local451.aBoolean4) {
									Static55.method1033(local451, false);
								}
							}
							if (local439 < Static163.anInt3564) {
								local451 = local407[local416][local439];
								if (local451 != null && local451.aBoolean4) {
									Static55.method1033(local451, false);
								}
							}
						}
						if (local183 < Static235.anInt4964) {
							if (local435 >= Static151.anInt3397) {
								local451 = local407[local183][local435];
								if (local451 != null && local451.aBoolean4) {
									Static55.method1033(local451, false);
								}
							}
							if (local439 < Static163.anInt3564) {
								local451 = local407[local183][local439];
								if (local451 != null && local451.aBoolean4) {
									Static55.method1033(local451, false);
								}
							}
						}
						if (Static86.anInt2119 == 0) {
							if (!local240) {
								Static161.aBoolean231 = false;
							}
							return;
						}
					}
				}
			}
		}
		Static161.aBoolean231 = false;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(B)V")
	public static void method3355() {
		if (Static196.aBoolean264) {
			return;
		}
		Static196.aBoolean264 = true;
		if (Static211.aBoolean285) {
			Static27.aFloat44 = (int) Static27.aFloat44 - 17 & 0xFFFFFFF0;
		} else {
			Static249.aFloat50 += (-Static249.aFloat50 - 12.0F) / 2.0F;
		}
		Static136.aBoolean193 = true;
	}

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI[Lclient!ic;[BIZ)V")
	public static void method3356(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class75[] arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(4) int arg4) {
		@Pc(10) Class1_Sub14 local10 = new Class1_Sub14(arg3);
		@Pc(24) int local24 = -1;
		while (true) {
			@Pc(28) int local28 = local10.method2221();
			if (local28 == 0) {
				return;
			}
			@Pc(37) int local37 = 0;
			local24 += local28;
			while (true) {
				@Pc(45) int local45 = local10.method2187();
				if (local45 == 0) {
					break;
				}
				local37 += local45 - 1;
				@Pc(62) int local62 = local37 & 0x3F;
				@Pc(68) int local68 = local37 >> 6 & 0x3F;
				@Pc(72) int local72 = local37 >> 12;
				@Pc(76) int local76 = local10.method2199();
				@Pc(80) int local80 = local76 & 0x3;
				@Pc(84) int local84 = arg4 + local68;
				@Pc(88) int local88 = arg1 + local62;
				@Pc(92) int local92 = local76 >> 2;
				if (local84 > 0 && local88 > 0 && local84 < 103 && local88 < 103) {
					@Pc(111) Class75 local111 = null;
					if (!arg0) {
						@Pc(116) int local116 = local72;
						if ((Static303.aByteArrayArrayArray19[1][local84][local88] & 0x2) == 2) {
							local116 = local72 - 1;
						}
						if (local116 >= 0) {
							local111 = arg2[local116];
						}
					}
					Static247.method3808(local24, arg0, local72, local92, local80, local72, local88, local84, !arg0, local111);
				}
			}
		}
	}
}
