import java.awt.Component;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!hh", name = "K", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray23;

	@OriginalMember(owner = "client!hh", name = "G", descriptor = "I")
	public static int anInt2380 = 0;

	@OriginalMember(owner = "client!hh", name = "J", descriptor = "[S")
	public static final short[] aShortArray43 = new short[] { 6798, 8741, 25238, 4626, 4550 };

	@OriginalMember(owner = "client!hh", name = "S", descriptor = "[I")
	public static final int[] anIntArray290 = new int[250];

	@OriginalMember(owner = "client!hh", name = "T", descriptor = "I")
	public static int anInt2389 = 0;

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IZ)V")
	public static void method2193(@OriginalArg(1) boolean arg0) {
		for (@Pc(10) Class1_Sub36 local10 = (Class1_Sub36) Static233.aClass195_41.method5029(); local10 != null; local10 = (Class1_Sub36) Static233.aClass195_41.method5021()) {
			if (local10.aClass1_Sub6_Sub3_1 != null) {
				Static170.aClass1_Sub6_Sub4_2.method1665(local10.aClass1_Sub6_Sub3_1);
				local10.aClass1_Sub6_Sub3_1 = null;
			}
			if (local10.aClass1_Sub6_Sub3_2 != null) {
				Static170.aClass1_Sub6_Sub4_2.method1665(local10.aClass1_Sub6_Sub3_2);
				local10.aClass1_Sub6_Sub3_2 = null;
			}
			local10.method5710();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(53) Class1_Sub36 local53 = (Class1_Sub36) Static193.aClass195_38.method5029(); local53 != null; local53 = (Class1_Sub36) Static193.aClass195_38.method5021()) {
			if (local53.aClass1_Sub6_Sub3_1 != null) {
				Static170.aClass1_Sub6_Sub4_2.method1665(local53.aClass1_Sub6_Sub3_1);
				local53.aClass1_Sub6_Sub3_1 = null;
			}
			local53.method5710();
		}
		for (@Pc(80) Class1_Sub36 local80 = (Class1_Sub36) Static130.aClass26_18.method871(); local80 != null; local80 = (Class1_Sub36) Static130.aClass26_18.method878()) {
			if (local80.aClass1_Sub6_Sub3_1 != null) {
				Static170.aClass1_Sub6_Sub4_2.method1665(local80.aClass1_Sub6_Sub3_1);
				local80.aClass1_Sub6_Sub3_1 = null;
			}
			local80.method5710();
		}
	}

	@OriginalMember(owner = "client!hh", name = "f", descriptor = "(I)Z")
	public static boolean method2195() {
		return Static258.anInt5029 == 0 ? Static29.aBoolean71 : true;
	}

	@OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIILclient!kq;Ljava/awt/Component;)Lclient!we;")
	public static Class174 method2196(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class110 arg2, @OriginalArg(4) Component arg3) {
		if (Static184.anInt3834 == 0) {
			throw new IllegalStateException();
		}
		try {
			@Pc(36) Class174 local36 = (Class174) Class.forName("Class174_Sub1").getDeclaredConstructor().newInstance();
			local36.anIntArray785 = new int[(Static111.aBoolean191 ? 2 : 1) * 256];
			local36.anInt6319 = arg0;
			local36.method5512(arg3);
			local36.anInt6315 = (arg0 & 0xFFFFFC00) + 1024;
			if (local36.anInt6315 > 16384) {
				local36.anInt6315 = 16384;
			}
			local36.method5509(local36.anInt6315);
			if (Static23.anInt526 > 0 && Static120.aClass105_1 == null) {
				Static120.aClass105_1 = new Class105();
				Static120.aClass105_1.aClass110_5 = arg2;
				arg2.method3379(Static23.anInt526, Static120.aClass105_1);
			}
			if (Static120.aClass105_1 != null) {
				if (Static120.aClass105_1.aClass174Array1[arg1] != null) {
					throw new IllegalArgumentException();
				}
				Static120.aClass105_1.aClass174Array1[arg1] = local36;
			}
			return local36;
		} catch (@Pc(108) Throwable local108) {
			try {
				@Pc(114) Class174_Sub2 local114 = new Class174_Sub2(arg2, arg1);
				local114.anIntArray785 = new int[(Static111.aBoolean191 ? 2 : 1) * 256];
				local114.anInt6319 = arg0;
				local114.method5512(arg3);
				local114.anInt6315 = 16384;
				local114.method5509(local114.anInt6315);
				if (Static23.anInt526 > 0 && Static120.aClass105_1 == null) {
					Static120.aClass105_1 = new Class105();
					Static120.aClass105_1.aClass110_5 = arg2;
					arg2.method3379(Static23.anInt526, Static120.aClass105_1);
				}
				if (Static120.aClass105_1 != null) {
					if (Static120.aClass105_1.aClass174Array1[arg1] != null) {
						throw new IllegalArgumentException();
					}
					Static120.aClass105_1.aClass174Array1[arg1] = local114;
				}
				return local114;
			} catch (@Pc(183) Throwable local183) {
				return new Class174();
			}
		}
	}

	@OriginalMember(owner = "client!hh", name = "g", descriptor = "(I)V")
	public static void method2197() {
		if (Static291.aBoolean495) {
			return;
		}
		Static1.aBoolean13 = true;
		Static291.aBoolean495 = true;
		if (Static102.aBoolean179) {
			Static304.aFloat110 = (int) Static304.aFloat110 - 65 & 0xFFFFFF80;
		} else {
			Static302.aFloat90 += (-24.0F - Static302.aFloat90) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!hh", name = "b", descriptor = "(Z)V")
	public static void method2198() {
		if (Static210.anInt4174 > 1) {
			Static210.anInt4174--;
			Static332.anInt6357 = Static119.anInt2038;
		}
		if (Static235.anInt4612 > 0) {
			Static235.anInt4612--;
		}
		if (Static335.aBoolean560) {
			Static335.aBoolean560 = false;
			Static306.method5162();
			return;
		}
		if (!Static179.aBoolean310) {
			Static198.method3732();
		}
		for (@Pc(35) int local35 = 0; local35 < 100 && Static148.method4540(); local35++) {
		}
		if (Static239.anInt4649 != 30) {
			return;
		}
		Static305.method5152(Static248.aClass1_Sub7_Sub1_2);
		@Pc(59) Object local59 = Static29.aClass189_1.anObject7;
		@Pc(87) int local87;
		@Pc(89) int local89;
		@Pc(91) int local91;
		@Pc(107) int local107;
		@Pc(128) int local128;
		@Pc(190) int local190;
		synchronized (Static29.aClass189_1.anObject7) {
			if (!Static161.aBoolean284) {
				Static29.aClass189_1.anInt5570 = 0;
			} else if (Static269.anInt5189 != 0 || Static29.aClass189_1.anInt5570 >= 40) {
				Static248.aClass1_Sub7_Sub1_2.method728(179);
				Static248.aClass1_Sub7_Sub1_2.method3108(0);
				local87 = Static248.aClass1_Sub7_Sub1_2.anInt3368;
				local89 = 0;
				for (local91 = 0; Static29.aClass189_1.anInt5570 > local91 && Static248.aClass1_Sub7_Sub1_2.anInt3368 - local87 < 240; local91++) {
					local89++;
					local107 = Static29.aClass189_1.anIntArray700[local91];
					if (local107 < 0) {
						local107 = 0;
					} else if (local107 > 65534) {
						local107 = 65534;
					}
					local128 = Static29.aClass189_1.anIntArray701[local91];
					if (local128 < 0) {
						local128 = 0;
					} else if (local128 > 65534) {
						local128 = 65534;
					}
					@Pc(141) boolean local141 = false;
					if (Static29.aClass189_1.anIntArray700[local91] == -1 && Static29.aClass189_1.anIntArray701[local91] == -1) {
						local128 = -1;
						local141 = true;
						local107 = -1;
					}
					if (Static244.anInt4761 != local128 || Static21.anInt465 != local107) {
						local190 = local128 - Static244.anInt4761;
						Static244.anInt4761 = local128;
						@Pc(197) int local197 = local107 - Static21.anInt465;
						Static21.anInt465 = local107;
						if (Static262.anInt5079 < 8 && local190 >= -32 && local190 <= 31 && local197 >= -32 && local197 <= 31) {
							local197 += 32;
							local190 += 32;
							Static248.aClass1_Sub7_Sub1_2.method3128((Static262.anInt5079 << 12) + ((local190 << 6) + local197));
							Static262.anInt5079 = 0;
						} else if (Static262.anInt5079 < 32 && local190 >= -128 && local190 <= 127 && local197 >= -128 && local197 <= 127) {
							local190 += 128;
							Static248.aClass1_Sub7_Sub1_2.method3108(Static262.anInt5079 + 128);
							local197 += 128;
							Static248.aClass1_Sub7_Sub1_2.method3128(local197 + (local190 << 8));
							Static262.anInt5079 = 0;
						} else if (Static262.anInt5079 < 32) {
							Static248.aClass1_Sub7_Sub1_2.method3108(Static262.anInt5079 + 192);
							if (local141) {
								Static248.aClass1_Sub7_Sub1_2.method3098(Integer.MIN_VALUE);
							} else {
								Static248.aClass1_Sub7_Sub1_2.method3098(local107 << 16 | local128);
							}
							Static262.anInt5079 = 0;
						} else {
							Static248.aClass1_Sub7_Sub1_2.method3128(Static262.anInt5079 + 57344);
							if (local141) {
								Static248.aClass1_Sub7_Sub1_2.method3098(Integer.MIN_VALUE);
							} else {
								Static248.aClass1_Sub7_Sub1_2.method3098(local128 | local107 << 16);
							}
							Static262.anInt5079 = 0;
						}
					} else if (Static262.anInt5079 < 2047) {
						Static262.anInt5079++;
					}
				}
				Static248.aClass1_Sub7_Sub1_2.method3102(Static248.aClass1_Sub7_Sub1_2.anInt3368 - local87);
				if (Static29.aClass189_1.anInt5570 > local89) {
					Static29.aClass189_1.anInt5570 -= local89;
					for (local107 = 0; local107 < Static29.aClass189_1.anInt5570; local107++) {
						Static29.aClass189_1.anIntArray701[local107] = Static29.aClass189_1.anIntArray701[local89 + local107];
						Static29.aClass189_1.anIntArray700[local107] = Static29.aClass189_1.anIntArray700[local107 + local89];
					}
				} else {
					Static29.aClass189_1.anInt5570 = 0;
				}
			}
		}
		if (Static269.anInt5189 != 0) {
			@Pc(414) long local414 = (Static49.aLong44 - Static119.aLong83) / 50L;
			Static119.aLong83 = Static49.aLong44;
			if (local414 > 32767L) {
				local414 = 32767L;
			}
			local87 = Static178.anInt3687;
			if (local87 < 0) {
				local87 = 0;
			} else if (local87 > 65535) {
				local87 = 65535;
			}
			local89 = Static179.anInt3690;
			if (local89 < 0) {
				local89 = 0;
			} else if (local89 > 65535) {
				local89 = 65535;
			}
			@Pc(453) byte local453 = 0;
			if (Static269.anInt5189 == 2) {
				local453 = 1;
			}
			local107 = (int) local414;
			Static248.aClass1_Sub7_Sub1_2.method728(147);
			Static248.aClass1_Sub7_Sub1_2.method3119(local89 | local87 << 16);
			Static248.aClass1_Sub7_Sub1_2.method3128(local107 | local453 << 15);
		}
		if (Static249.anInt4825 > 0) {
			Static249.anInt4825--;
		}
		if (Static1.aBoolean13 && Static249.anInt4825 <= 0) {
			Static1.aBoolean13 = false;
			Static249.anInt4825 = 20;
			Static248.aClass1_Sub7_Sub1_2.method728(167);
			Static248.aClass1_Sub7_Sub1_2.method3140((int) Static304.aFloat110 >> 3);
			Static248.aClass1_Sub7_Sub1_2.method3128((int) Static233.aFloat86 >> 3);
		}
		if (Static20.aBoolean41 && !Static323.aBoolean547) {
			Static323.aBoolean547 = true;
			Static248.aClass1_Sub7_Sub1_2.method728(122);
			Static248.aClass1_Sub7_Sub1_2.method3108(1);
		}
		if (!Static20.aBoolean41 && Static323.aBoolean547) {
			Static323.aBoolean547 = false;
			Static248.aClass1_Sub7_Sub1_2.method728(122);
			Static248.aClass1_Sub7_Sub1_2.method3108(0);
		}
		if (!Static7.aBoolean21) {
			Static248.aClass1_Sub7_Sub1_2.method728(153);
			Static248.aClass1_Sub7_Sub1_2.method3089(Static33.method882());
			Static7.aBoolean21 = true;
		}
		if (Static138.aClass204ArrayArrayArray1 != null) {
			if (Static81.anInt1609 == 2) {
				Static181.method3549();
			} else if (Static81.anInt1609 == 3) {
				Static245.method4331();
			}
		}
		if (Static291.aBoolean495) {
			Static291.aBoolean495 = false;
		} else {
			Static302.aFloat90 /= 2.0F;
		}
		if (Static132.aBoolean236) {
			Static132.aBoolean236 = false;
		} else {
			Static71.aFloat29 /= 2.0F;
		}
		Static66.method1369();
		if (Static239.anInt4649 != 30) {
			return;
		}
		Static318.method5353();
		Static240.method4261();
		Static180.method3539();
		Static176.anInt3652++;
		if (Static176.anInt3652 > 750) {
			Static306.method5162();
			return;
		}
		Static268.method4679();
		Static97.method1786();
		Static200.method3749();
		for (@Pc(659) int local659 = Static300.method5115(true); local659 != -1; local659 = Static300.method5115(false)) {
			Static314.method5305(local659);
			Static161.anIntArray371[Static82.anInt1643++ & 0x1F] = local659;
		}
		@Pc(761) Class177 local761;
		@Pc(812) int local812;
		for (@Pc(684) Class1_Sub1_Sub2 local684 = Static186.method3614(); local684 != null; local684 = Static186.method3614()) {
			local87 = local684.method165();
			local89 = local684.method169();
			if (local87 == 1) {
				Static302.anIntArray607[local89] = local684.anInt85;
				Static131.aBoolean235 |= Static162.aBooleanArray13[local89];
				Static259.anIntArray639[Static351.anInt6506++ & 0x1F] = local89;
			} else if (local87 == 2) {
				Static290.aStringArray39[local89] = local684.aString4;
				Static86.anIntArray212[Static49.anInt1122++ & 0x1F] = local89;
			} else if (local87 == 3) {
				local761 = Static140.method2694(local89);
				if (!local684.aString4.equals(local761.aString205)) {
					local761.aString205 = local684.aString4;
					Static133.method2517(local761);
				}
			} else if (local87 == 4) {
				local761 = Static140.method2694(local89);
				local107 = local684.anInt85;
				local128 = local684.anInt75;
				local812 = local684.anInt81;
				if (local761.anInt5192 != local107 || local761.anInt5245 != local128 || local812 != local761.anInt5183) {
					local761.anInt5245 = local128;
					local761.anInt5192 = local107;
					local761.anInt5183 = local812;
					Static133.method2517(local761);
				}
			} else if (local87 == 5) {
				local761 = Static140.method2694(local89);
				if (local761.anInt5243 != local684.anInt85 || local684.anInt85 == -1) {
					local761.anInt5176 = 0;
					local761.anInt5187 = 0;
					local761.anInt5238 = 1;
					local761.anInt5243 = local684.anInt85;
					Static133.method2517(local761);
				}
			} else if (local87 == 6) {
				local91 = local684.anInt85;
				local107 = local91 >> 10 & 0x1F;
				local128 = local91 >> 5 & 0x1F;
				local812 = local91 & 0x1F;
				local190 = (local812 << 3) + (local107 << 19) + (local128 << 11);
				@Pc(829) Class177 local829 = Static140.method2694(local89);
				if (local190 != local829.anInt5199) {
					local829.anInt5199 = local190;
					Static133.method2517(local829);
				}
			} else if (local87 == 7) {
				local761 = Static140.method2694(local89);
				@Pc(858) boolean local858 = local684.anInt85 == 1;
				if (local761.aBoolean432 != local858) {
					local761.aBoolean432 = local858;
					Static133.method2517(local761);
				}
			} else if (local87 == 8) {
				local761 = Static140.method2694(local89);
				if (local684.anInt85 != local761.anInt5260 || local761.anInt5268 != local684.anInt75 || local761.anInt5217 != local684.anInt81) {
					local761.anInt5268 = local684.anInt75;
					local761.anInt5260 = local684.anInt85;
					local761.anInt5217 = local684.anInt81;
					if (local761.anInt5252 != -1) {
						if (local761.anInt5228 > 0) {
							local761.anInt5217 = local761.anInt5217 * 32 / local761.anInt5228;
						} else if (local761.anInt5211 > 0) {
							local761.anInt5217 = local761.anInt5217 * 32 / local761.anInt5211;
						}
					}
					Static133.method2517(local761);
				}
			} else if (local87 == 9) {
				local761 = Static140.method2694(local89);
				if (local761.anInt5252 != local684.anInt85 || local684.anInt75 != local761.anInt5253) {
					local761.anInt5253 = local684.anInt75;
					local761.anInt5252 = local684.anInt85;
					Static133.method2517(local761);
				}
			} else if (local87 == 10) {
				local761 = Static140.method2694(local89);
				if (local761.anInt5180 != local684.anInt85 || local684.anInt75 != local761.anInt5261 || local761.anInt5203 != local684.anInt81) {
					local761.anInt5180 = local684.anInt85;
					local761.anInt5203 = local684.anInt81;
					local761.anInt5261 = local684.anInt75;
					Static133.method2517(local761);
				}
			} else if (local87 == 11) {
				local761 = Static140.method2694(local89);
				local761.anInt5177 = local761.anInt5257 = local684.anInt75;
				local761.aByte56 = 0;
				local761.anInt5201 = local761.anInt5185 = local684.anInt85;
				local761.aByte54 = 0;
				Static133.method2517(local761);
			} else if (local87 == 12) {
				local761 = Static140.method2694(local89);
				local107 = local684.anInt85;
				if (local761 != null && local761.anInt5208 == 0) {
					if (local107 > local761.anInt5262 - local761.anInt5209) {
						local107 = local761.anInt5262 - local761.anInt5209;
					}
					if (local107 < 0) {
						local107 = 0;
					}
					if (local761.anInt5182 != local107) {
						local761.anInt5182 = local107;
						Static133.method2517(local761);
					}
				}
			} else if (local87 == 13) {
				local761 = Static140.method2694(local89);
				local761.anInt5224 = local684.anInt85;
			} else if (local87 == 14) {
				local761 = Static140.method2694(local89);
				local761.anInt5174 = local684.anInt85;
			} else if (local87 == 15) {
				Static152.anInt3053 = local684.anInt75;
				Static307.aBoolean518 = true;
				Static94.anInt1845 = local684.anInt85;
			}
		}
		Static78.anInt1579++;
		if (Static180.anInt3754 != 0) {
			Static286.anInt5554 += 20;
			if (Static286.anInt5554 >= 400) {
				Static180.anInt3754 = 0;
			}
		}
		if (Static309.aClass177_21 != null) {
			Static255.anInt4994++;
			if (Static255.anInt4994 >= 15) {
				Static133.method2517(Static309.aClass177_21);
				Static309.aClass177_21 = null;
			}
		}
		@Pc(1262) Class177 local1262 = Static118.aClass177_17;
		@Pc(1264) Class177 local1264 = Static232.aClass177_23;
		Static118.aClass177_17 = null;
		Static313.aBoolean531 = false;
		Static20.aBoolean43 = false;
		Static184.aClass177_11 = null;
		Static232.aClass177_23 = null;
		Static184.anInt3829 = 0;
		while (Static245.method4340() && Static184.anInt3829 < 128) {
			if (!Static186.method3618() || Static316.aChar3 != '`' && Static316.aChar3 != '§') {
				Static81.anIntArray185[Static184.anInt3829] = Static320.anInt6137;
				Static184.anIntArray454[Static184.anInt3829] = Static316.aChar3;
				Static184.anInt3829++;
			} else if (Static108.method2021()) {
				Static39.method960();
			} else {
				Static12.method314();
			}
		}
		if (Static108.method2021()) {
			Static334.method5572();
		}
		Static346.aClass177_25 = null;
		Static81.method1557(-1, null, -1);
		Static99.method1807(-1, null, -1);
		Static42.method1002();
		Static119.anInt2038++;
		if (Static33.aBoolean73) {
			Static248.aClass1_Sub7_Sub1_2.method728(166);
			Static248.aClass1_Sub7_Sub1_2.method3089(Static154.anInt3085 << 28 | Static310.anInt5982 << 14 | Static25.anInt709);
			Static33.aBoolean73 = false;
		}
		while (true) {
			@Pc(1381) Class177 local1381;
			@Pc(1368) Class1_Sub19 local1368;
			@Pc(1373) Class177 local1373;
			do {
				local1368 = (Class1_Sub19) Static17.aClass195_1.method5031();
				if (local1368 == null) {
					while (true) {
						do {
							local1368 = (Class1_Sub19) Static120.aClass195_21.method5031();
							if (local1368 == null) {
								while (true) {
									do {
										local1368 = (Class1_Sub19) Static138.aClass195_31.method5031();
										if (local1368 == null) {
											if (Static346.aClass177_25 == null) {
												Static112.anInt4022 = 0;
											}
											if (Static317.aClass177_22 != null) {
												Static116.method2096();
											}
											if (Static180.anInt3759 > 0 && Static220.aBooleanArray24[82] && Static220.aBooleanArray24[81] && Static325.anInt4689 != 0) {
												local91 = Static285.anInt5511 - Static325.anInt4689;
												if (local91 < 0) {
													local91 = 0;
												} else if (local91 > 3) {
													local91 = 3;
												}
												Static263.method4607(Static161.anInt3315 + Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray637[0], Static130.aClass5_Sub3_Sub3_Sub1_1.anIntArray638[0] + Static182.anInt3775, local91);
											}
											Static52.method1159();
											if (Static46.aClass177_2 != null) {
												Static133.method2517(Static46.aClass177_2);
												Static304.anInt5855++;
												if (Static179.anInt3693 > Static127.anInt2492 + 5 || Static127.anInt2492 - 5 > Static179.anInt3693 || Static295.anInt5742 > Static154.anInt3087 + 5 || Static295.anInt5742 < Static154.anInt3087 - 5) {
													Static192.aBoolean589 = true;
												}
												if (Static151.anInt3836 == 0) {
													if (Static192.aBoolean589 && Static304.anInt5855 >= 5) {
														if (Static193.aClass177_12 == Static46.aClass177_2 && Static255.anInt5009 != Static300.anInt5811) {
															local761 = Static46.aClass177_2;
															@Pc(1648) byte local1648 = 0;
															if (Static120.anInt2345 == 1 && local761.anInt5204 == 206) {
																local1648 = 1;
															}
															if (local761.anIntArray668[Static300.anInt5811] <= 0) {
																local1648 = 0;
															}
															if (local1648 == 1) {
																local128 = Static255.anInt5009;
																local812 = Static300.anInt5811;
																while (local812 != local128) {
																	if (local812 < local128) {
																		local761.method4690(local128, local128 - 1);
																		local128--;
																	} else if (local812 > local128) {
																		local761.method4690(local128, local128 + 1);
																		local128++;
																	}
																}
															} else {
																local761.method4690(Static255.anInt5009, Static300.anInt5811);
															}
															Static248.aClass1_Sub7_Sub1_2.method728(37);
															Static248.aClass1_Sub7_Sub1_2.method3098(Static46.aClass177_2.anInt5219);
															Static248.aClass1_Sub7_Sub1_2.method3128(Static300.anInt5811);
															Static248.aClass1_Sub7_Sub1_2.method3150(Static255.anInt5009);
															Static248.aClass1_Sub7_Sub1_2.method3096(local1648);
														}
													} else if ((Static77.anInt1554 == 1 || Static154.method2926()) && Static277.anInt6207 > 2) {
														Static273.method4761(Static295.anInt5742, Static179.anInt3693);
													} else if (Static285.method4901()) {
														Static8.method287();
													}
													Static269.anInt5189 = 0;
													Static255.anInt4994 = 10;
													Static46.aClass177_2 = null;
												}
											}
											if (local1262 != Static118.aClass177_17) {
												if (local1262 != null) {
													Static133.method2517(local1262);
												}
												if (Static118.aClass177_17 != null) {
													Static133.method2517(Static118.aClass177_17);
												}
											}
											if (Static232.aClass177_23 != local1264 && Static133.anInt2592 == Static338.anInt6422) {
												if (local1264 != null) {
													Static133.method2517(local1264);
												}
												if (Static232.aClass177_23 != null) {
													Static133.method2517(Static232.aClass177_23);
												}
											}
											if (Static232.aClass177_23 == null) {
												if (Static338.anInt6422 > 0) {
													Static338.anInt6422--;
												}
											} else if (Static133.anInt2592 > Static338.anInt6422) {
												Static338.anInt6422++;
												if (Static133.anInt2592 == Static338.anInt6422) {
													Static133.method2517(Static232.aClass177_23);
												}
											}
											for (local91 = 0; local91 < 5; local91++) {
												@Pc(1819) int local1819 = Static43.anIntArray338[local91]++;
											}
											local107 = Static112.method3715();
											local128 = Static227.method4125();
											if (local107 > 15000 && local128 > 15000) {
												Static235.anInt4612 = 250;
												Static270.method4725(14500);
												Static248.aClass1_Sub7_Sub1_2.method728(13);
											}
											if (Static131.aBoolean235 && Static349.method5647() - 60000L > Static74.aLong117) {
												Static44.method1007();
											}
											Static270.anInt5295++;
											if (Static270.anInt5295 > 500) {
												Static270.anInt5295 = 0;
												local812 = (int) (Math.random() * 8.0D);
												if ((local812 & 0x4) == 4) {
													Static252.anInt4857 += Static298.anInt5958;
												}
												if ((local812 & 0x2) == 2) {
													Static233.anInt4571 += Static317.anInt6087;
												}
												if ((local812 & 0x1) == 1) {
													Static352.anInt6534 += Static126.anInt2476;
												}
											}
											if (Static352.anInt6534 < -50) {
												Static126.anInt2476 = 2;
											}
											if (Static352.anInt6534 > 50) {
												Static126.anInt2476 = -2;
											}
											if (Static233.anInt4571 < -55) {
												Static317.anInt6087 = 2;
											}
											if (Static233.anInt4571 > 55) {
												Static317.anInt6087 = -2;
											}
											if (Static252.anInt4857 < -40) {
												Static298.anInt5958 = 1;
											}
											if (Static252.anInt4857 > 40) {
												Static298.anInt5958 = -1;
											}
											Static121.anInt2354++;
											if (Static121.anInt2354 > 500) {
												Static121.anInt2354 = 0;
												local812 = (int) (Math.random() * 8.0D);
												if ((local812 & 0x2) == 2) {
													Static311.anInt5996 += Static277.anInt6204;
												}
												if ((local812 & 0x1) == 1) {
													Static277.anInt6206 += Static311.anInt5994;
												}
											}
											if (Static277.anInt6206 < -60) {
												Static311.anInt5994 = 2;
											}
											if (Static277.anInt6206 > 60) {
												Static311.anInt5994 = -2;
											}
											if (Static311.anInt5996 < -20) {
												Static277.anInt6204 = 1;
											}
											Static331.anInt6346++;
											if (Static311.anInt5996 > 10) {
												Static277.anInt6204 = -1;
											}
											if (Static331.anInt6346 > 50) {
												Static248.aClass1_Sub7_Sub1_2.method728(185);
											}
											if (Static317.aBoolean539) {
												Static62.method1312();
												Static317.aBoolean539 = false;
											}
											try {
												if (Static153.aClass158_2 != null && Static248.aClass1_Sub7_Sub1_2.anInt3368 > 0) {
													Static153.aClass158_2.method4325(Static248.aClass1_Sub7_Sub1_2.aByteArray58, Static248.aClass1_Sub7_Sub1_2.anInt3368);
													Static331.anInt6346 = 0;
													Static248.aClass1_Sub7_Sub1_2.anInt3368 = 0;
													return;
												}
												return;
											} catch (@Pc(2043) IOException local2043) {
												Static306.method5162();
												return;
											}
										}
										local1373 = local1368.aClass177_9;
										if (local1373.anInt5239 < 0) {
											break;
										}
										local1381 = Static140.method2694(local1373.anInt5236);
									} while (local1381 == null || local1381.aClass177Array2 == null || local1373.anInt5239 >= local1381.aClass177Array2.length || local1381.aClass177Array2[local1373.anInt5239] != local1373);
									Static98.method1797(local1368);
								}
							}
							local1373 = local1368.aClass177_9;
							if (local1373.anInt5239 < 0) {
								break;
							}
							local1381 = Static140.method2694(local1373.anInt5236);
						} while (local1381 == null || local1381.aClass177Array2 == null || local1373.anInt5239 >= local1381.aClass177Array2.length || local1381.aClass177Array2[local1373.anInt5239] != local1373);
						Static98.method1797(local1368);
					}
				}
				local1373 = local1368.aClass177_9;
				if (local1373.anInt5239 < 0) {
					break;
				}
				local1381 = Static140.method2694(local1373.anInt5236);
			} while (local1381 == null || local1381.aClass177Array2 == null || local1373.anInt5239 >= local1381.aClass177Array2.length || local1373 != local1381.aClass177Array2[local1373.anInt5239]);
			Static98.method1797(local1368);
		}
	}
}
