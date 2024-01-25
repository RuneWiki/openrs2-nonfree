import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static578 {

	@OriginalMember(owner = "client!tha", name = "m", descriptor = "I")
	public static int anInt9023;

	@OriginalMember(owner = "client!tha", name = "j", descriptor = "Lclient!vn;")
	public static final Class381 aClass381_239 = new Class381(68, -1);

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(Lclient!wea;B)Z")
	public static boolean method7756(@OriginalArg(0) Class389 arg0) throws IOException {
		@Pc(8) Class50 local8 = arg0.aClass50_2;
		@Pc(11) Class5_Sub36_Sub2 local11 = arg0.aClass5_Sub36_Sub2_2;
		if (local8 == null) {
			return false;
		}
		@Pc(100) int local100;
		if (arg0.aClass156_220 == null) {
			if (arg0.aBoolean760) {
				if (!local8.method6169(1)) {
					return false;
				}
				local8.method6170(arg0.aClass5_Sub36_Sub2_2.aByteArray89, 1, 0);
				arg0.aBoolean760 = false;
				arg0.anInt10757++;
				arg0.anInt10758 = 0;
			}
			local11.anInt8456 = 0;
			if (local11.method7337()) {
				if (!local8.method6169(1)) {
					return false;
				}
				local8.method6170(arg0.aClass5_Sub36_Sub2_2.aByteArray89, 1, 1);
				arg0.anInt10758 = 0;
				arg0.anInt10757++;
			}
			arg0.aBoolean760 = true;
			@Pc(96) Class156[] local96 = Static342.method5117();
			local100 = local11.method7338();
			if (local100 < 0 || local96.length <= local100) {
				throw new IOException("invo:" + local100 + " ip:" + local11.anInt8456);
			}
			arg0.aClass156_220 = local96[local100];
			arg0.anInt10756 = arg0.aClass156_220.anInt3842;
		}
		if (arg0.anInt10756 == -1) {
			if (!local8.method6169(1)) {
				return false;
			}
			local8.method6170(local11.aByteArray89, 1, 0);
			arg0.anInt10758 = 0;
			arg0.anInt10756 = local11.aByteArray89[0] & 0xFF;
			arg0.anInt10757++;
		}
		if (arg0.anInt10756 == -2) {
			if (!local8.method6169(2)) {
				return false;
			}
			local8.method6170(local11.aByteArray89, 2, 0);
			local11.anInt8456 = 0;
			arg0.anInt10756 = local11.method7333();
			arg0.anInt10758 = 0;
			arg0.anInt10757 += 2;
		}
		if (arg0.anInt10756 > 0) {
			if (!local8.method6169(arg0.anInt10756)) {
				return false;
			}
			local11.anInt8456 = 0;
			local8.method6170(local11.aByteArray89, arg0.anInt10756, 0);
			arg0.anInt10758 = 0;
			arg0.anInt10757 += arg0.anInt10756;
		}
		arg0.aClass156_218 = arg0.aClass156_217;
		arg0.aClass156_217 = arg0.aClass156_219;
		arg0.aClass156_219 = arg0.aClass156_220;
		@Pc(291) boolean local291;
		if (Static200.aClass156_65 == arg0.aClass156_220) {
			Static46.anInt759 = Static55.anInt959;
			local291 = local11.method7291() == 1;
			if (arg0.anInt10756 != 1) {
				if (local291) {
					Static55.aClass325_1 = new Class325(local11);
				} else {
					Static321.aClass325_3 = new Class325(local11);
				}
				arg0.aClass156_220 = null;
				return true;
			}
			if (local291) {
				Static55.aClass325_1 = null;
			} else {
				Static321.aClass325_3 = null;
			}
			arg0.aClass156_220 = null;
			return true;
		}
		@Pc(380) String local380;
		@Pc(376) String local376;
		@Pc(362) byte[] local362;
		if (Static373.aClass156_122 == arg0.aClass156_220) {
			if (Static95.aFrame1 != null) {
				Static471.method6672(Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610(), -1, -1, false);
			}
			local362 = new byte[arg0.anInt10756];
			local11.method7342(local362, arg0.anInt10756);
			local376 = Static262.method4274(local362, 0, arg0.anInt10756);
			local380 = "opensn";
			if (!Static460.aBoolean507 || Static388.method5739(local376, local380, 1, Static681.aClass349_6).anInt9720 == 2) {
				Static504.method6986(local376, Static681.aClass349_6, Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 1, true, local380);
			}
			arg0.aClass156_220 = null;
			return true;
		}
		@Pc(428) String local428;
		if (Static469.aClass156_146 == arg0.aClass156_220) {
			local428 = local11.method7281();
			local100 = local11.method7333();
			local380 = Static54.aClass308_1.method6953(local100).method3284(local11);
			Static422.method6178(local428, 0, local428, 19, local100, local428, (String) null, local380);
			arg0.aClass156_220 = null;
			return true;
		}
		@Pc(463) int local463;
		@Pc(476) int local476;
		@Pc(480) int local480;
		@Pc(492) int local492;
		@Pc(504) long local504;
		@Pc(527) Class5_Sub18 local527;
		@Pc(510) Class5_Sub18 local510;
		if (Static231.aClass156_78 == arg0.aClass156_220) {
			local463 = local11.method7292();
			local100 = local11.method7282();
			if (local100 == 65535) {
				local100 = -1;
			}
			local476 = local11.method7292();
			local480 = local11.method7316();
			if (local480 == 65535) {
				local480 = -1;
			}
			Static617.method8467();
			for (local492 = local480; local492 <= local100; local492++) {
				local504 = (long) local492 + ((long) local476 << 32);
				local510 = (Class5_Sub18) Static268.aClass306_19.method6943(local504);
				if (local510 != null) {
					local527 = new Class5_Sub18(local463, local510.anInt2204);
					local510.method9222();
				} else if (local492 == -1) {
					local527 = new Class5_Sub18(local463, Static305.method4761(local476).aClass5_Sub18_2.anInt2204);
				} else {
					local527 = new Class5_Sub18(local463, -1);
				}
				Static268.aClass306_19.method6944(local527, local504, -12002);
			}
			arg0.aClass156_220 = null;
			return true;
		} else if (Static522.aClass156_169 == arg0.aClass156_220) {
			Static647.anInt10548 = local11.method7280();
			Static637.anInt7729 = local11.method7332() << 3;
			Static257.anInt4648 = local11.method7272() << 3;
			arg0.aClass156_220 = null;
			return true;
		} else if (Static222.aClass156_75 == arg0.aClass156_220) {
			local463 = local11.method7265();
			local100 = local11.method7282();
			local476 = local11.method7282();
			if (local476 == 65535) {
				local476 = -1;
			}
			local480 = local11.method7333();
			Static617.method8467();
			if (local480 == 65535) {
				local480 = -1;
			}
			for (local492 = local476; local492 <= local480; local492++) {
				local504 = ((long) local463 << 32) + (long) local492;
				local510 = (Class5_Sub18) Static268.aClass306_19.method6943(local504);
				if (local510 != null) {
					local527 = new Class5_Sub18(local510.anInt2210, local100);
					local510.method9222();
				} else if (local492 == -1) {
					local527 = new Class5_Sub18(Static305.method4761(local463).aClass5_Sub18_2.anInt2210, local100);
				} else {
					local527 = new Class5_Sub18(0, local100);
				}
				Static268.aClass306_19.method6944(local527, local504, -12002);
			}
			arg0.aClass156_220 = null;
			return true;
		} else if (Static193.aClass156_60 == arg0.aClass156_220) {
			local463 = local11.method7292();
			local100 = local11.method7333();
			if (local100 == 65535) {
				local100 = -1;
			}
			Static617.method8467();
			Static470.method6645(local463, 1, local100, -1);
			arg0.aClass156_220 = null;
			return true;
		} else if (arg0.aClass156_220 == Static36.aClass156_15) {
			Static422.aString82 = arg0.anInt10756 <= 2 ? Static184.aClass131_27.method3168(Static375.anInt7800) : local11.method7281();
			Static363.anInt5922 = arg0.anInt10756 <= 0 ? -1 : local11.method7333();
			arg0.aClass156_220 = null;
			if (Static363.anInt5922 == 65535) {
				Static363.anInt5922 = -1;
			}
			return true;
		} else if (Static569.aClass156_184 == arg0.aClass156_220) {
			Static160.method7592();
			arg0.aClass156_220 = null;
			return false;
		} else if (Static641.aClass156_208 == arg0.aClass156_220) {
			Static352.method5187(Static111.aClass226_8);
			arg0.aClass156_220 = null;
			return true;
		} else if (arg0.aClass156_220 == Static133.aClass156_42) {
			Static352.method5187(Static36.aClass226_2);
			arg0.aClass156_220 = null;
			return true;
		} else if (arg0.aClass156_220 == Static258.aClass156_84) {
			local463 = local11.method7330();
			local100 = local11.method7292();
			Static617.method8467();
			Static61.method1056(local463, local100);
			arg0.aClass156_220 = null;
			return true;
		} else if (arg0.aClass156_220 == Static120.aClass156_36) {
			Static352.method5187(Static57.aClass226_6);
			arg0.aClass156_220 = null;
			return true;
		} else {
			@Pc(898) int local898;
			@Pc(902) int local902;
			@Pc(927) int local927;
			@Pc(1006) int local1006;
			@Pc(908) long local908;
			@Pc(910) boolean local910;
			@Pc(894) long local894;
			@Pc(999) String local999;
			@Pc(889) long local889;
			if (arg0.aClass156_220 == Static76.aClass156_25) {
				local291 = local11.method7291() == 1;
				local376 = local11.method7281();
				local889 = (long) local11.method7333();
				local894 = (long) local11.method7331();
				local898 = local11.method7291();
				local902 = local11.method7333();
				local908 = local894 + (local889 << 32);
				local910 = false;
				@Pc(919) Class5_Sub55 local919 = local291 ? Static605.aClass5_Sub55_3 : Static348.aClass5_Sub55_2;
				if (local919 == null) {
					local910 = true;
				} else {
					label2202: {
						for (local927 = 0; local927 < 100; local927++) {
							if (Static235.aLongArray12[local927] == local908) {
								local910 = true;
								break label2202;
							}
						}
						if (local898 <= 1 && Static39.method701(local376)) {
							local910 = true;
						}
					}
				}
				if (!local910 && Static670.anInt6250 == 0) {
					Static235.aLongArray12[Static560.anInt8809] = local908;
					Static560.anInt8809 = (Static560.anInt8809 + 1) % 100;
					local999 = Static54.aClass308_1.method6953(local902).method3284(local11);
					local1006 = local291 ? 42 : 45;
					if (local898 == 2 || local898 == 3) {
						Static422.method6178(local376, 0, "<img=1>" + local376, local1006, local902, "<img=1>" + local376, local919.aString123, local999);
					} else if (local898 == 1) {
						Static422.method6178(local376, 0, "<img=0>" + local376, local1006, local902, "<img=0>" + local376, local919.aString123, local999);
					} else {
						Static422.method6178(local376, 0, local376, local1006, local902, local376, local919.aString123, local999);
					}
				}
				arg0.aClass156_220 = null;
				return true;
			}
			@Pc(1136) int local1136;
			@Pc(1152) int local1152;
			if (Static645.aClass156_210 == arg0.aClass156_220) {
				local463 = local11.method7282();
				if (local463 == 65535) {
					local463 = -1;
				}
				local100 = local11.method7290();
				local476 = local100 >> 2;
				local480 = local100 & 0x3;
				local492 = Static248.anIntArray223[local476];
				local1136 = local11.method7265();
				local898 = local1136 >> 28 & 0x3;
				local902 = local1136 >> 14 & 0x3FFF;
				local1152 = local1136 & 0x3FFF;
				local902 -= Static315.anInt5380;
				local1152 -= Static290.anInt5128;
				Static23.method373(local476, local463, local480, local492, local902, local1152, local898);
				arg0.aClass156_220 = null;
				return true;
			} else if (Static619.aClass156_203 == arg0.aClass156_220) {
				local291 = local11.method7330() == 1;
				local100 = local11.method7268();
				if (local291 != Static186.aBoolean248 || local100 != Static242.anInt5008) {
					Static186.aBoolean248 = local291;
					Static242.anInt5008 = local100;
					Static247.method3961(Static378.aClass208_5, -1, -1);
				}
				arg0.aClass156_220 = null;
				return true;
			} else if (arg0.aClass156_220 == Static298.aClass156_98) {
				if (Static285.method4551(false, Static652.anInt10664)) {
					Static413.anInt6991 = (int) ((float) local11.method7333() * 2.5F);
				} else {
					Static413.anInt6991 = local11.method7333() * 30;
				}
				arg0.aClass156_220 = null;
				Static476.anInt7745 = Static55.anInt959;
				return true;
			} else {
				@Pc(1295) String local1295;
				if (arg0.aClass156_220 == Static376.aClass156_123) {
					local463 = local11.method7316();
					if (local463 == 65535) {
						local463 = -1;
					}
					local100 = local11.method7280();
					local476 = local11.method7291();
					local1295 = local11.method7281();
					if (local476 >= 1 && local476 <= 8) {
						if (local1295.equalsIgnoreCase("null")) {
							local1295 = null;
						}
						Static147.aStringArray11[local476 - 1] = local1295;
						Static636.anIntArray589[local476 - 1] = local463;
						Static178.aBooleanArray10[local476 - 1] = local100 == 0;
					}
					arg0.aClass156_220 = null;
					return true;
				} else if (arg0.aClass156_220 == Static373.aClass156_121) {
					arg0.aClass156_220 = null;
					return false;
				} else if (arg0.aClass156_220 == Static486.aClass156_159) {
					Static352.method5187(Static626.aClass226_19);
					arg0.aClass156_220 = null;
					return true;
				} else if (arg0.aClass156_220 == Static277.aClass156_93) {
					local463 = local11.method7274();
					Static617.method8467();
					@Pc(1386) Class5_Sub38 local1386 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local463);
					if (local1386 != null) {
						Static655.method9010(false, local1386, true);
					}
					if (Static64.aClass238_1 != null) {
						Static333.method5032(Static64.aClass238_1);
						Static64.aClass238_1 = null;
					}
					arg0.aClass156_220 = null;
					return true;
				} else if (arg0.aClass156_220 == Static641.aClass156_209) {
					local291 = local11.method7290() == 1;
					Static617.method8467();
					arg0.aClass156_220 = null;
					Static617.aBoolean697 = local291;
					return true;
				} else if (arg0.aClass156_220 == Static149.aClass156_48) {
					Static637.anInt7729 = local11.method7318() << 3;
					Static257.anInt4648 = local11.method7332() << 3;
					Static647.anInt10548 = local11.method7280();
					while (local11.anInt8456 < arg0.anInt10756) {
						@Pc(1470) Class226 local1470 = Static154.method2816()[local11.method7291()];
						Static352.method5187(local1470);
					}
					arg0.aClass156_220 = null;
					return true;
				} else if (Static124.aClass156_37 == arg0.aClass156_220) {
					Static352.method5187(Static368.aClass226_13);
					arg0.aClass156_220 = null;
					return true;
				} else if (arg0.aClass156_220 == Static554.aClass156_182) {
					local428 = local11.method7281();
					@Pc(1514) Object[] local1514 = new Object[local428.length() + 1];
					for (local476 = local428.length() - 1; local476 >= 0; local476--) {
						if (local428.charAt(local476) == 's') {
							local1514[local476 + 1] = local11.method7281();
						} else {
							local1514[local476 + 1] = Integer.valueOf(local11.method7268());
						}
					}
					local1514[0] = Integer.valueOf(local11.method7268());
					Static617.method8467();
					@Pc(1574) Class5_Sub24 local1574 = new Class5_Sub24();
					local1574.anObjectArray2 = local1514;
					Static247.method3957(local1574);
					arg0.aClass156_220 = null;
					return true;
				} else if (Static244.aClass156_81 == arg0.aClass156_220) {
					Static470.aBoolean515 = local11.method7291() == 1;
					arg0.aClass156_220 = null;
					return true;
				} else {
					@Pc(1645) String local1645;
					@Pc(1649) String local1649;
					if (Static55.aClass156_17 == arg0.aClass156_220) {
						local463 = local11.method7291();
						@Pc(1627) boolean local1627 = (local463 & 0x1) == 1;
						local380 = local11.method7281();
						local1295 = local11.method7281();
						if (local1295.equals("")) {
							local1295 = local380;
						}
						local1645 = local11.method7281();
						local1649 = local11.method7281();
						if (local1649.equals("")) {
							local1649 = local1645;
						}
						if (local1627) {
							for (local898 = 0; local898 < Static62.anInt1053; local898++) {
								if (Static300.aStringArray27[local898].equals(local1649)) {
									Static119.aStringArray8[local898] = local380;
									Static300.aStringArray27[local898] = local1295;
									Static669.aStringArray42[local898] = local1645;
									Static600.aStringArray40[local898] = local1649;
									break;
								}
							}
						} else {
							Static119.aStringArray8[Static62.anInt1053] = local380;
							Static300.aStringArray27[Static62.anInt1053] = local1295;
							Static669.aStringArray42[Static62.anInt1053] = local1645;
							Static600.aStringArray40[Static62.anInt1053] = local1649;
							Static222.aBooleanArray12[Static62.anInt1053] = (local463 & 0x2) == 2;
							Static62.anInt1053++;
						}
						arg0.aClass156_220 = null;
						Static98.anInt1628 = Static55.anInt959;
						return true;
					} else if (Static470.aClass156_149 == arg0.aClass156_220) {
						Static617.method8467();
						Static234.method3707();
						arg0.aClass156_220 = null;
						return true;
					} else if (arg0.aClass156_220 == Static471.aClass156_150) {
						Static452.method6395(Static531.aBoolean573);
						arg0.aClass156_220 = null;
						return false;
					} else if (Static228.aClass156_77 == arg0.aClass156_220) {
						Static129.anInt2160 = local11.method7303();
						Static476.anInt7745 = Static55.anInt959;
						arg0.aClass156_220 = null;
						return true;
					} else if (arg0.aClass156_220 == Static127.aClass156_38) {
						Static352.method5187(Static41.aClass226_5);
						arg0.aClass156_220 = null;
						return true;
					} else if (Static65.aClass156_20 == arg0.aClass156_220) {
						Static452.method6395(false);
						arg0.aClass156_220 = null;
						return false;
					} else if (Static522.aClass156_170 == arg0.aClass156_220) {
						local463 = local11.method7316();
						if (local463 == 65535) {
							local463 = -1;
						}
						local100 = local11.method7330();
						local476 = local11.method7280();
						Static613.method8422(local100, local463, local476);
						arg0.aClass156_220 = null;
						return true;
					} else if (Static8.aClass156_2 == arg0.aClass156_220) {
						local463 = local11.method7316();
						if (local463 == 65535) {
							local463 = -1;
						}
						local100 = local11.method7291();
						local476 = local11.method7322();
						Static671.method9112(local100, local463, local476);
						arg0.aClass156_220 = null;
						return true;
					} else {
						@Pc(1911) boolean local1911;
						if (arg0.aClass156_220 == Static378.aClass156_124) {
							local291 = local11.method7291() == 1;
							local376 = local11.method7281();
							local380 = local376;
							if (local291) {
								local380 = local11.method7281();
							}
							local480 = local11.method7291();
							local1911 = false;
							if (local480 <= 1) {
								if (Static163.aBoolean238 && !Static490.aBoolean537 || Static76.aBoolean116) {
									local1911 = true;
								} else if (local480 <= 1 && Static39.method701(local380)) {
									local1911 = true;
								}
							}
							if (!local1911 && Static670.anInt6250 == 0) {
								local1649 = Static562.method7599(Static236.method3739(local11));
								if (local480 == 2) {
									Static422.method6178(local376, 0, "<img=1>" + local376, 24, -1, "<img=1>" + local380, (String) null, local1649);
								} else if (local480 == 1) {
									Static422.method6178(local376, 0, "<img=0>" + local376, 24, -1, "<img=0>" + local380, (String) null, local1649);
								} else {
									Static422.method6178(local376, 0, local376, 24, -1, local380, (String) null, local1649);
								}
							}
							arg0.aClass156_220 = null;
							return true;
						} else if (Static414.aClass156_134 == arg0.aClass156_220) {
							Static238.aByte46 = local11.method7332();
							if (Static238.aByte46 == 0 || Static238.aByte46 == 1) {
								Static368.aBoolean415 = true;
							}
							arg0.aClass156_220 = null;
							return true;
						} else if (Static253.aClass156_83 == arg0.aClass156_220) {
							local11.anInt8456 += 28;
							if (local11.method7283()) {
								Static517.method7068(local11.anInt8456 - 28, local11);
							}
							arg0.aClass156_220 = null;
							return true;
						} else {
							@Pc(2167) int local2167;
							@Pc(2148) long local2148;
							@Pc(2253) String local2253;
							if (arg0.aClass156_220 == Static284.aClass156_94) {
								local291 = local11.method7291() == 1;
								local376 = local11.method7281();
								local889 = (long) local11.method7333();
								local894 = (long) local11.method7331();
								local898 = local11.method7291();
								local2148 = (local889 << 32) + local894;
								@Pc(2150) boolean local2150 = false;
								@Pc(2159) Class5_Sub55 local2159 = local291 ? Static605.aClass5_Sub55_3 : Static348.aClass5_Sub55_2;
								if (local2159 == null) {
									local2150 = true;
								} else {
									label2215: {
										for (local2167 = 0; local2167 < 100; local2167++) {
											if (local2148 == Static235.aLongArray12[local2167]) {
												local2150 = true;
												break label2215;
											}
										}
										if (local898 <= 1) {
											if (Static163.aBoolean238 && !Static490.aBoolean537 || Static76.aBoolean116) {
												local2150 = true;
											} else if (Static39.method701(local376)) {
												local2150 = true;
											}
										}
									}
								}
								if (!local2150 && Static670.anInt6250 == 0) {
									Static235.aLongArray12[Static560.anInt8809] = local2148;
									Static560.anInt8809 = (Static560.anInt8809 + 1) % 100;
									local2253 = Static562.method7599(Static236.method3739(local11));
									local927 = local291 ? 41 : 44;
									if (local898 == 2 || local898 == 3) {
										Static422.method6178(local376, 0, "<img=1>" + local376, local927, -1, "<img=1>" + local376, local2159.aString123, local2253);
									} else if (local898 == 1) {
										Static422.method6178(local376, 0, "<img=0>" + local376, local927, -1, "<img=0>" + local376, local2159.aString123, local2253);
									} else {
										Static422.method6178(local376, 0, local376, local927, -1, local376, local2159.aString123, local2253);
									}
								}
								arg0.aClass156_220 = null;
								return true;
							} else if (Static535.aClass156_176 == arg0.aClass156_220) {
								local463 = local11.method7306();
								local100 = local11.method7268();
								local476 = local11.method7291();
								local1295 = "";
								local1645 = local1295;
								if ((local476 & 0x1) != 0) {
									local1295 = local11.method7281();
									if ((local476 & 0x2) == 0) {
										local1645 = local1295;
									} else {
										local1645 = local11.method7281();
									}
								}
								local1649 = local11.method7281();
								if (local463 == 99) {
									Static239.method3794(local1649);
								} else if (local463 == 98) {
									Static211.method3409(local1649);
								} else if (local1645.equals("") || !Static39.method701(local1645)) {
									Static464.method6554(local1645, local1295, local463, local1295, local1649, local100);
								} else {
									arg0.aClass156_220 = null;
									return true;
								}
								arg0.aClass156_220 = null;
								return true;
							} else if (Static128.aClass156_39 == arg0.aClass156_220) {
								Static356.anInt5858 = local11.method7291();
								Static476.anInt7745 = Static55.anInt959;
								arg0.aClass156_220 = null;
								return true;
							} else if (arg0.aClass156_220 == Static575.aClass156_187) {
								local463 = local11.method7292();
								local100 = local11.method7316();
								Static617.method8467();
								if (local100 == 65535) {
									local100 = -1;
								}
								Static630.method8717(local463, local100);
								arg0.aClass156_220 = null;
								return true;
							} else if (arg0.aClass156_220 == Static47.aClass156_16) {
								Static519.method7088();
								arg0.aClass156_220 = null;
								return true;
							} else if (arg0.aClass156_220 == Static155.aClass156_52) {
								local463 = local11.method7274();
								local100 = local11.method7333();
								Static617.method8467();
								Static251.method4106(local463, local100);
								arg0.aClass156_220 = null;
								return true;
							} else if (arg0.aClass156_220 == Static361.aClass156_116) {
								local463 = local11.method7300();
								local100 = local11.method7300();
								local476 = local11.method7265();
								local480 = local11.method7282();
								Static617.method8467();
								Static288.method4580(local100, local476, local480, local463);
								arg0.aClass156_220 = null;
								return true;
							} else {
								@Pc(2615) int local2615;
								@Pc(2619) int local2619;
								@Pc(2601) long local2601;
								@Pc(2629) int local2629;
								if (arg0.aClass156_220 == Static221.aClass156_74) {
									local291 = local11.method7291() == 1;
									local376 = local11.method7281();
									local380 = local376;
									if (local291) {
										local380 = local11.method7281();
									}
									local2601 = local11.method7304();
									local504 = (long) local11.method7333();
									local2148 = (long) local11.method7331();
									local2615 = local11.method7291();
									local2619 = local11.method7333();
									@Pc(2625) long local2625 = local2148 + (local504 << 32);
									@Pc(2627) boolean local2627 = false;
									local2629 = 0;
									while (true) {
										if (local2629 >= 100) {
											if (local2615 <= 1 && Static39.method701(local380)) {
												local2627 = true;
											}
											break;
										}
										if (Static235.aLongArray12[local2629] == local2625) {
											local2627 = true;
											break;
										}
										local2629++;
									}
									if (!local2627 && Static670.anInt6250 == 0) {
										Static235.aLongArray12[Static560.anInt8809] = local2625;
										Static560.anInt8809 = (Static560.anInt8809 + 1) % 100;
										@Pc(2695) String local2695 = Static54.aClass308_1.method6953(local2619).method3284(local11);
										if (local2615 == 2) {
											Static422.method6178(local376, 0, "<img=1>" + local376, 20, local2619, "<img=1>" + local380, Static600.method8238(local2601), local2695);
										} else if (local2615 == 1) {
											Static422.method6178(local376, 0, "<img=0>" + local376, 20, local2619, "<img=0>" + local380, Static600.method8238(local2601), local2695);
										} else {
											Static422.method6178(local376, 0, local376, 20, local2619, local380, Static600.method8238(local2601), local2695);
										}
									}
									arg0.aClass156_220 = null;
									return true;
								} else if (Static148.aClass156_47 == arg0.aClass156_220) {
									Static385.aClass182_5 = Static466.method6570(local11.method7291());
									arg0.aClass156_220 = null;
									return true;
								} else if (Static20.aClass156_9 == arg0.aClass156_220) {
									local463 = local11.method7274();
									local100 = local11.method7333();
									Static617.method8467();
									Static49.method897(local100, local463);
									arg0.aClass156_220 = null;
									return true;
								} else if (arg0.aClass156_220 == Static394.aClass156_132) {
									local463 = local11.method7291();
									local100 = local463 >> 5;
									local476 = local463 & 0x1F;
									if (local476 == 0) {
										Static8.aClass212Array1[local100] = null;
										arg0.aClass156_220 = null;
										return true;
									}
									@Pc(2862) Class212 local2862 = new Class212();
									local2862.anInt5367 = local476;
									local2862.anInt5370 = local11.method7291();
									if (local2862.anInt5370 >= 0 && Static453.aClass155Array19.length > local2862.anInt5370) {
										if (local2862.anInt5367 == 1 || local2862.anInt5367 == 10) {
											local2862.anInt5376 = local11.method7333();
											local11.anInt8456 += 6;
										} else if (local2862.anInt5367 >= 2 && local2862.anInt5367 <= 6) {
											if (local2862.anInt5367 == 2) {
												local2862.anInt5366 = 256;
												local2862.anInt5374 = 256;
											}
											if (local2862.anInt5367 == 3) {
												local2862.anInt5374 = 256;
												local2862.anInt5366 = 0;
											}
											if (local2862.anInt5367 == 4) {
												local2862.anInt5366 = 512;
												local2862.anInt5374 = 256;
											}
											if (local2862.anInt5367 == 5) {
												local2862.anInt5366 = 256;
												local2862.anInt5374 = 0;
											}
											if (local2862.anInt5367 == 6) {
												local2862.anInt5366 = 256;
												local2862.anInt5374 = 512;
											}
											local2862.anInt5367 = 2;
											local2862.anInt5372 = local11.method7291();
											local2862.anInt5366 += local11.method7333() - Static315.anInt5380 << 9;
											local2862.anInt5374 += local11.method7333() - Static290.anInt5128 << 9;
											local2862.anInt5371 = local11.method7291() << 2;
											local2862.anInt5375 = local11.method7333();
										}
										local2862.anInt5373 = local11.method7333();
										if (local2862.anInt5373 == 65535) {
											local2862.anInt5373 = -1;
										}
										Static8.aClass212Array1[local100] = local2862;
									}
									arg0.aClass156_220 = null;
									return true;
								} else if (Static386.aClass156_131 == arg0.aClass156_220) {
									local463 = local11.method7300();
									Static617.method8467();
									Static419.method6142(local463);
									arg0.aClass156_220 = null;
									return true;
								} else if (Static158.aClass156_53 == arg0.aClass156_220) {
									Static648.anInt10598 = Static55.anInt959;
									local291 = local11.method7291() == 1;
									if (arg0.anInt10756 != 1) {
										if (local291) {
											Static605.aClass5_Sub55_3 = new Class5_Sub55(local11);
										} else {
											Static348.aClass5_Sub55_2 = new Class5_Sub55(local11);
										}
										arg0.aClass156_220 = null;
										return true;
									}
									if (local291) {
										Static605.aClass5_Sub55_3 = null;
									} else {
										Static348.aClass5_Sub55_2 = null;
									}
									arg0.aClass156_220 = null;
									return true;
								} else if (arg0.aClass156_220 == Static541.aClass156_178) {
									local291 = local11.method7291() == 1;
									@Pc(3173) byte[] local3173 = new byte[arg0.anInt10756 - 1];
									local11.method7297(local3173, 0, arg0.anInt10756 - 1);
									Static3.method29(local3173, local291);
									arg0.aClass156_220 = null;
									return true;
								} else if (Static651.aClass156_211 == arg0.aClass156_220) {
									Static23.aClass247_1.method5704();
									arg0.aClass156_220 = null;
									Static484.anInt7864 += 32;
									return true;
								} else if (arg0.aClass156_220 == Static184.aClass156_59) {
									local463 = local11.method7282();
									local100 = local11.method7330();
									Static617.method8467();
									Static20.method348(local100, true, local463);
									arg0.aClass156_220 = null;
									return true;
								} else if (arg0.aClass156_220 == Static464.aClass156_143) {
									local428 = local11.method7281();
									local100 = local11.method7282();
									Static617.method8467();
									Static29.method497(local100, local428);
									arg0.aClass156_220 = null;
									return true;
								} else if (Static324.aClass156_102 == arg0.aClass156_220) {
									local428 = local11.method7281();
									local376 = Static562.method7599(Static236.method3739(local11));
									Static464.method6554(local428, local428, 6, local428, local376, 0);
									arg0.aClass156_220 = null;
									return true;
								} else {
									@Pc(3345) boolean local3345;
									@Pc(3393) String local3393;
									if (arg0.aClass156_220 == Static513.aClass156_168) {
										local463 = local11.method7333();
										@Pc(3303) Class4_Sub1_Sub1_Sub2_Sub1 local3303;
										if (Static649.anInt10621 == local463) {
											local3303 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4;
										} else {
											local3303 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local463];
										}
										if (local3303 == null) {
											arg0.aClass156_220 = null;
											return true;
										}
										local476 = local11.method7333();
										local480 = local11.method7291();
										local1911 = (local476 & 0x8000) != 0;
										if (local3303.aString44 != null && local3303.aClass359_1 != null) {
											local3345 = false;
											if (local480 <= 1) {
												if (!local1911 && (Static163.aBoolean238 && !Static490.aBoolean537 || Static76.aBoolean116)) {
													local3345 = true;
												} else if (Static39.method701(local3303.aString44)) {
													local3345 = true;
												}
											}
											if (!local3345 && Static670.anInt6250 == 0) {
												local902 = -1;
												if (local1911) {
													local476 &= 0x7FFF;
													@Pc(3403) Class108 local3403 = Static6.method99(local11);
													local902 = local3403.anInt2907;
													local3393 = local3403.aClass5_Sub1_Sub5_1.method3284(local11);
												} else {
													local3393 = Static562.method7599(Static236.method3739(local11));
												}
												local3303.aString79 = local3393.trim();
												local3303.anInt6860 = local476 & 0xFF;
												local3303.anInt6846 = local476 >> 8;
												local3303.anInt6873 = 150;
												if (local480 == 1 || local480 == 2) {
													local1152 = local1911 ? 17 : 1;
												} else {
													local1152 = local1911 ? 17 : 2;
												}
												if (local480 == 2) {
													Static422.method6178(local3303.aString43, 0, "<img=1>" + local3303.method4084(), local1152, local902, "<img=1>" + local3303.method4077(), (String) null, local3393);
												} else if (local480 == 1) {
													Static422.method6178(local3303.aString43, 0, "<img=0>" + local3303.method4084(), local1152, local902, "<img=0>" + local3303.method4077(), (String) null, local3393);
												} else {
													Static422.method6178(local3303.aString43, 0, local3303.method4084(), local1152, local902, local3303.method4077(), (String) null, local3393);
												}
											}
										}
										arg0.aClass156_220 = null;
										return true;
									} else if (arg0.aClass156_220 == Static199.aClass156_64) {
										local463 = local11.method7300();
										local100 = local11.method7316();
										Static617.method8467();
										Static38.method680(local463, local100);
										arg0.aClass156_220 = null;
										return true;
									} else if (arg0.aClass156_220 == Static336.aClass156_105) {
										if (Static381.anInt6411 != -1) {
											Static194.method8970(Static381.anInt6411, 0);
										}
										arg0.aClass156_220 = null;
										return true;
									} else if (Static342.aClass156_108 == arg0.aClass156_220) {
										local463 = local11.method7292();
										local100 = local11.method7289();
										Static617.method8467();
										Static416.method6118(local463, local100);
										arg0.aClass156_220 = null;
										return true;
									} else if (Static664.aClass156_223 == arg0.aClass156_220) {
										local463 = local11.method7291();
										local100 = local11.method7292();
										local476 = local11.method7300();
										local480 = local11.method7300();
										Static617.method8467();
										Static429.method6193(local463, local100, local480, local476);
										arg0.aClass156_220 = null;
										return true;
									} else if (Static381.aClass156_128 == arg0.aClass156_220) {
										Static641.method8836();
										arg0.aClass156_220 = null;
										return true;
									} else if (Static657.aClass156_212 == arg0.aClass156_220) {
										local463 = local11.method7291();
										Static617.method8467();
										arg0.aClass156_220 = null;
										Static583.anInt9389 = local463;
										return true;
									} else if (arg0.aClass156_220 == Static177.aClass156_55) {
										Static62.anInt1053 = local11.method7291();
										for (local463 = 0; local463 < Static62.anInt1053; local463++) {
											Static119.aStringArray8[local463] = local11.method7281();
											Static300.aStringArray27[local463] = local11.method7281();
											if (Static300.aStringArray27[local463].equals("")) {
												Static300.aStringArray27[local463] = Static119.aStringArray8[local463];
											}
											Static669.aStringArray42[local463] = local11.method7281();
											Static600.aStringArray40[local463] = local11.method7281();
											if (Static600.aStringArray40[local463].equals("")) {
												Static600.aStringArray40[local463] = Static669.aStringArray42[local463];
											}
											Static222.aBooleanArray12[local463] = false;
										}
										Static98.anInt1628 = Static55.anInt959;
										arg0.aClass156_220 = null;
										return true;
									} else if (Static68.aClass156_129 == arg0.aClass156_220) {
										Static352.method5187(Static428.aClass226_17);
										arg0.aClass156_220 = null;
										return true;
									} else {
										@Pc(3856) long local3856;
										@Pc(3997) boolean local3997;
										@Pc(4020) Class183 local4020;
										if (arg0.aClass156_220 == Static111.aClass156_33) {
											Static300.anInt5207 = Static55.anInt959;
											if (arg0.anInt10756 == 0) {
												Static508.aClass183Array1 = null;
												arg0.aClass156_220 = null;
												Static164.aString29 = null;
												Static282.aString56 = null;
												Static480.anInt7783 = 0;
												return true;
											}
											Static164.aString29 = local11.method7281();
											local291 = local11.method7291() == 1;
											if (local291) {
												local11.method7281();
											}
											local3856 = local11.method7304();
											Static282.aString56 = Static508.method7013(local3856);
											Static654.aByte145 = local11.method7318();
											local480 = local11.method7291();
											if (local480 == 255) {
												arg0.aClass156_220 = null;
												return true;
											}
											Static480.anInt7783 = local480;
											@Pc(3884) Class183[] local3884 = new Class183[100];
											for (local1136 = 0; local1136 < Static480.anInt7783; local1136++) {
												local3884[local1136] = new Class183();
												local3884[local1136].aString52 = local11.method7281();
												local291 = local11.method7291() == 1;
												if (local291) {
													local3884[local1136].aString49 = local11.method7281();
												} else {
													local3884[local1136].aString49 = local3884[local1136].aString52;
												}
												local3884[local1136].aString50 = Static382.method5678(local3884[local1136].aString49);
												local3884[local1136].anInt4713 = local11.method7333();
												local3884[local1136].aByte69 = local11.method7318();
												local3884[local1136].aString51 = local11.method7281();
												if (local3884[local1136].aString49.equals(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44)) {
													Static484.aByte114 = local3884[local1136].aByte69;
												}
											}
											local1152 = Static480.anInt7783;
											while (local1152 > 0) {
												local1152--;
												local3997 = true;
												for (local2615 = 0; local2615 < local1152; local2615++) {
													if (local3884[local2615].aString50.compareTo(local3884[local2615 + 1].aString50) > 0) {
														local4020 = local3884[local2615];
														local3884[local2615] = local3884[local2615 + 1];
														local3884[local2615 + 1] = local4020;
														local3997 = false;
													}
												}
												if (local3997) {
													break;
												}
											}
											Static508.aClass183Array1 = local3884;
											arg0.aClass156_220 = null;
											return true;
										} else if (arg0.aClass156_220 == Static549.aClass156_181) {
											Static352.method5187(Static415.aClass226_16);
											arg0.aClass156_220 = null;
											return true;
										} else if (Static591.aClass156_194 == arg0.aClass156_220) {
											local463 = local11.method7274();
											Static617.method8467();
											Static470.method6645(local463, 3, -1, -1);
											arg0.aClass156_220 = null;
											return true;
										} else {
											@Pc(4104) byte local4104;
											if (arg0.aClass156_220 == Static238.aClass156_79) {
												local4104 = local11.method7332();
												local100 = local11.method7300();
												Static617.method8467();
												Static592.method8148(local100, local4104);
												arg0.aClass156_220 = null;
												return true;
											} else if (arg0.aClass156_220 == Static528.aClass156_172) {
												local463 = local11.method7292();
												local100 = local11.method7300();
												Static617.method8467();
												Static360.method5243(local100, local463);
												arg0.aClass156_220 = null;
												return true;
											} else if (Static365.aClass156_120 == arg0.aClass156_220) {
												Static352.method5187(Static25.aClass226_1);
												arg0.aClass156_220 = null;
												return true;
											} else if (arg0.aClass156_220 == Static457.aClass156_142) {
												local463 = local11.method7333();
												local376 = local11.method7281();
												if (Static539.anObjectArray37 == null) {
													Static539.anObjectArray37 = new Object[Static379.aClass39_1.anInt701];
												}
												Static539.anObjectArray37[local463] = local376;
												Static246.anIntArray218[Static209.anInt3703++ & 0x1F] = local463;
												arg0.aClass156_220 = null;
												return true;
											} else if (arg0.aClass156_220 == Static152.aClass156_49) {
												local463 = local11.method7274();
												local100 = local11.method7300();
												Static23.aClass247_1.method5707(local463, local100);
												arg0.aClass156_220 = null;
												return true;
											} else if (Static264.aClass156_87 == arg0.aClass156_220) {
												local463 = local11.method7268();
												local100 = local11.method7316();
												local476 = local11.method7316();
												Static617.method8467();
												Static222.method3530(local100 + (local476 << 16), local463);
												arg0.aClass156_220 = null;
												return true;
											} else if (arg0.aClass156_220 == Static265.aClass156_88) {
												local463 = local11.method7303();
												local100 = local11.method7289();
												local476 = local11.method7265();
												Static617.method8467();
												Static132.method1950(local476, local100, local463);
												arg0.aClass156_220 = null;
												return true;
											} else if (arg0.aClass156_220 == Static588.aClass156_193) {
												Static240.method3813(arg0.anInt10756, local11, Static681.aClass349_6);
												arg0.aClass156_220 = null;
												return true;
											} else if (Static586.aClass156_189 == arg0.aClass156_220) {
												Static352.method5187(Static261.aClass226_12);
												arg0.aClass156_220 = null;
												return true;
											} else if (Static627.aClass156_204 == arg0.aClass156_220) {
												local463 = local11.method7316();
												local100 = local11.method7290();
												local476 = local11.method7300();
												local480 = local11.method7274();
												Static617.method8467();
												Static683.method9226(local100, local463, local476, local480);
												arg0.aClass156_220 = null;
												return true;
											} else if (arg0.aClass156_220 == Static360.aClass156_113) {
												Static352.method5187(Static114.aClass226_9);
												arg0.aClass156_220 = null;
												return true;
											} else if (Static659.aClass156_215 == arg0.aClass156_220) {
												Static215.anInt3739 = local11.method7291();
												arg0.aClass156_220 = null;
												return true;
											} else if (Static587.aClass156_192 == arg0.aClass156_220) {
												local463 = local11.method7291();
												local100 = local11.method7333();
												local476 = local11.method7280();
												local480 = local11.method7290();
												local492 = local11.method7330();
												Static617.method8467();
												Static322.aBooleanArray14[local463] = true;
												Static656.anIntArray611[local463] = local476;
												Static328.anIntArray322[local463] = local492;
												Static564.anIntArray509[local463] = local480;
												Static41.anIntArray50[local463] = local100;
												arg0.aClass156_220 = null;
												return true;
											} else if (arg0.aClass156_220 == Static81.aClass156_26) {
												Static166.anInt3255 = 1;
												Static98.anInt1628 = Static55.anInt959;
												arg0.aClass156_220 = null;
												return true;
											} else if (Static153.aClass156_50 == arg0.aClass156_220) {
												Static457.method6439(arg0.anInt10756, local11);
												arg0.aClass156_220 = null;
												return true;
											} else {
												@Pc(4476) Class5_Sub38 local4476;
												if (arg0.aClass156_220 == Static288.aClass156_95) {
													local463 = local11.method7290();
													local100 = local11.method7268();
													local476 = local11.method7316();
													Static617.method8467();
													local4476 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local100);
													if (local4476 != null) {
														Static655.method9010(false, local4476, local4476.anInt6418 != local476);
													}
													Static191.method8803(false, local100, local476, local463);
													arg0.aClass156_220 = null;
													return true;
												} else if (arg0.aClass156_220 == Static252.aClass156_82) {
													Static352.method5187(Static113.aClass226_11);
													arg0.aClass156_220 = null;
													return true;
												} else if (arg0.aClass156_220 == Static346.aClass156_92) {
													local463 = local11.method7265();
													Static617.method8467();
													Static470.method6645(local463, 5, Static649.anInt10621, 0);
													arg0.aClass156_220 = null;
													return true;
												} else if (arg0.aClass156_220 == Static348.aClass156_110) {
													Static375.method6771(local11.method7281());
													arg0.aClass156_220 = null;
													return true;
												} else {
													@Pc(4614) boolean local4614;
													if (Static414.aClass156_135 == arg0.aClass156_220) {
														local291 = local11.method7291() == 1;
														local376 = local11.method7281();
														local380 = local376;
														if (local291) {
															local380 = local11.method7281();
														}
														local2601 = (long) local11.method7333();
														local504 = (long) local11.method7331();
														local902 = local11.method7291();
														local1152 = local11.method7333();
														@Pc(4612) long local4612 = (local2601 << 32) + local504;
														local4614 = false;
														local927 = 0;
														while (true) {
															if (local927 >= 100) {
																if (local902 <= 1 && Static39.method701(local380)) {
																	local4614 = true;
																}
																break;
															}
															if (local4612 == Static235.aLongArray12[local927]) {
																local4614 = true;
																break;
															}
															local927++;
														}
														if (!local4614 && Static670.anInt6250 == 0) {
															Static235.aLongArray12[Static560.anInt8809] = local4612;
															Static560.anInt8809 = (Static560.anInt8809 + 1) % 100;
															local999 = Static54.aClass308_1.method6953(local1152).method3284(local11);
															if (local902 == 2) {
																Static422.method6178(local376, 0, "<img=1>" + local376, 18, local1152, "<img=1>" + local380, (String) null, local999);
															} else if (local902 == 1) {
																Static422.method6178(local376, 0, "<img=0>" + local376, 18, local1152, "<img=0>" + local380, (String) null, local999);
															} else {
																Static422.method6178(local376, 0, local376, 18, local1152, local380, (String) null, local999);
															}
														}
														arg0.aClass156_220 = null;
														return true;
													} else if (arg0.aClass156_220 == Static543.aClass156_179) {
														Static539.anObjectArray37 = null;
														arg0.aClass156_220 = null;
														return true;
													} else if (Static479.aClass156_154 == arg0.aClass156_220) {
														@Pc(4881) boolean local4881;
														while (local11.anInt8456 < arg0.anInt10756) {
															local291 = local11.method7291() == 1;
															local376 = local11.method7281();
															local380 = local11.method7281();
															local480 = local11.method7333();
															local492 = local11.method7291();
															local1649 = "";
															local3997 = false;
															if (local480 > 0) {
																local1649 = local11.method7281();
																local3997 = local11.method7291() == 1;
															}
															for (local902 = 0; local902 < Static645.anInt10557; local902++) {
																if (local291) {
																	if (local380.equals(Static167.aStringArray13[local902])) {
																		Static167.aStringArray13[local902] = local376;
																		Static7.aStringArray1[local902] = local380;
																		local376 = null;
																		break;
																	}
																} else if (local376.equals(Static167.aStringArray13[local902])) {
																	if (local480 != Static167.anIntArray152[local902]) {
																		local4881 = true;
																		for (@Pc(4886) Class4_Sub4_Sub2 local4886 = (Class4_Sub4_Sub2) Static601.aClass387_7.method9018(); local4886 != null; local4886 = (Class4_Sub4_Sub2) Static601.aClass387_7.method9016()) {
																			if (local4886.aString115.equals(local376)) {
																				if (local480 != 0 && local4886.aShort118 == 0) {
																					local4886.method8570();
																					local4881 = false;
																				} else if (local480 == 0 && local4886.aShort118 != 0) {
																					local4886.method8570();
																					local4881 = false;
																				}
																			}
																		}
																		if (local4881) {
																			Static601.aClass387_7.method9017(new Class4_Sub4_Sub2(local376, local480));
																		}
																		Static167.anIntArray152[local902] = local480;
																	}
																	Static7.aStringArray1[local902] = local380;
																	Static181.aStringArray14[local902] = local1649;
																	Static351.anIntArray339[local902] = local492;
																	local376 = null;
																	Static369.aBooleanArray18[local902] = local3997;
																	break;
																}
															}
															if (local376 != null && Static645.anInt10557 < 200) {
																Static167.aStringArray13[Static645.anInt10557] = local376;
																Static7.aStringArray1[Static645.anInt10557] = local380;
																Static167.anIntArray152[Static645.anInt10557] = local480;
																Static181.aStringArray14[Static645.anInt10557] = local1649;
																Static351.anIntArray339[Static645.anInt10557] = local492;
																Static369.aBooleanArray18[Static645.anInt10557] = local3997;
																Static645.anInt10557++;
															}
														}
														Static166.anInt3255 = 2;
														Static98.anInt1628 = Static55.anInt959;
														local100 = Static645.anInt10557;
														while (local100 > 0) {
															local291 = true;
															local100--;
															for (local476 = 0; local476 < local100; local476++) {
																if (Static167.anIntArray152[local476] != Static68.aClass258_6.anInt6748 && Static167.anIntArray152[local476 + 1] == Static68.aClass258_6.anInt6748 || Static167.anIntArray152[local476] == 0 && Static167.anIntArray152[local476 + 1] != 0) {
																	local480 = Static167.anIntArray152[local476];
																	Static167.anIntArray152[local476] = Static167.anIntArray152[local476 + 1];
																	Static167.anIntArray152[local476 + 1] = local480;
																	local1645 = Static181.aStringArray14[local476];
																	Static181.aStringArray14[local476] = Static181.aStringArray14[local476 + 1];
																	Static181.aStringArray14[local476 + 1] = local1645;
																	local1649 = Static167.aStringArray13[local476];
																	Static167.aStringArray13[local476] = Static167.aStringArray13[local476 + 1];
																	Static167.aStringArray13[local476 + 1] = local1649;
																	local3393 = Static7.aStringArray1[local476];
																	Static7.aStringArray1[local476] = Static7.aStringArray1[local476 + 1];
																	Static7.aStringArray1[local476 + 1] = local3393;
																	local902 = Static351.anIntArray339[local476];
																	Static351.anIntArray339[local476] = Static351.anIntArray339[local476 + 1];
																	Static351.anIntArray339[local476 + 1] = local902;
																	local4881 = Static369.aBooleanArray18[local476];
																	Static369.aBooleanArray18[local476] = Static369.aBooleanArray18[local476 + 1];
																	local291 = false;
																	Static369.aBooleanArray18[local476 + 1] = local4881;
																}
															}
															if (local291) {
																break;
															}
														}
														arg0.aClass156_220 = null;
														return true;
													} else if (arg0.aClass156_220 == Static365.aClass156_119) {
														local463 = local11.method7282();
														local100 = local11.method7265();
														Static617.method8467();
														Static533.method7622(local463, local100);
														arg0.aClass156_220 = null;
														return true;
													} else if (Static224.aClass156_76 == arg0.aClass156_220) {
														if (Static95.aFrame1 != null) {
															Static471.method6672(Static577.aClass5_Sub19_25.aClass17_Sub6_1.method1610(), -1, -1, false);
														}
														local362 = new byte[arg0.anInt10756];
														local11.method7342(local362, arg0.anInt10756);
														local376 = Static262.method4274(local362, 0, arg0.anInt10756);
														Static200.method3315(Static681.aClass349_6, local376, true, Static577.aClass5_Sub19_25.aClass17_Sub24_2.method8102() == 1);
														arg0.aClass156_220 = null;
														return true;
													} else if (arg0.aClass156_220 == Static132.aClass156_41) {
														Static617.method8467();
														Static681.method9215();
														arg0.aClass156_220 = null;
														return true;
													} else if (Static204.aClass156_68 == arg0.aClass156_220) {
														local463 = local11.method7333();
														local376 = local11.method7281();
														Static669.aClass258_8 = Static68.aClass258_6;
														Static660.method9072(local376, local463);
														Static411.method6060(15, -3);
														arg0.aClass156_220 = null;
														return false;
													} else if (Static668.aClass156_152 == arg0.aClass156_220) {
														local463 = local11.method7333();
														if (local463 == 65535) {
															local463 = -1;
														}
														local100 = local11.method7291();
														local476 = local11.method7333();
														local480 = local11.method7291();
														Static152.method2787(local100, 256, local463, local476, local480, true);
														arg0.aClass156_220 = null;
														return true;
													} else if (Static487.aClass156_175 == arg0.aClass156_220) {
														local463 = local11.method7268();
														local100 = local11.method7268();
														@Pc(5401) Class5_Sub41 local5401 = Static647.method8905(Static545.aClass381_230, arg0.aClass393_2);
														local5401.aClass5_Sub36_Sub2_1.method7287(local463);
														local5401.aClass5_Sub36_Sub2_1.method7287(local100);
														arg0.method9079(local5401);
														arg0.aClass156_220 = null;
														return true;
													} else if (arg0.aClass156_220 == Static521.aClass156_226) {
														local463 = local11.method7268();
														local100 = local11.method7282();
														Static617.method8467();
														if (local100 == 65535) {
															local100 = -1;
														}
														Static470.method6645(local463, 2, local100, -1);
														arg0.aClass156_220 = null;
														return true;
													} else if (arg0.aClass156_220 == Static493.aClass156_161) {
														local463 = local11.method7292();
														Static617.method8467();
														arg0.aClass156_220 = null;
														if (local463 == -1) {
															Static227.anInt9451 = -1;
															Static417.anInt7039 = -1;
														} else {
															local100 = local463 >> 14 & 0x3FFF;
															local476 = local463 & 0x3FFF;
															local100 -= Static315.anInt5380;
															local476 -= Static290.anInt5128;
															if (local100 < 0) {
																local100 = 0;
															} else if (Static271.anInt4910 <= local100) {
																local100 = Static271.anInt4910;
															}
															Static227.anInt9451 = (local100 << 9) + 256;
															if (local476 < 0) {
																local476 = 0;
															} else if (local476 >= Static613.anInt9909) {
																local476 = Static613.anInt9909;
															}
															Static417.anInt7039 = (local476 << 9) + 256;
														}
														return true;
													} else if (Static669.aClass156_224 == arg0.aClass156_220) {
														local463 = local11.method7300();
														local100 = local11.method7265();
														local476 = local11.method7300();
														local480 = local11.method7282();
														Static617.method8467();
														Static470.method6645(local100, 7, local476 << 16 | local463, local480);
														arg0.aClass156_220 = null;
														return true;
													} else if (Static512.aClass156_166 == arg0.aClass156_220) {
														Static524.method7142();
														arg0.aClass156_220 = null;
														return false;
													} else if (arg0.aClass156_220 == Static465.aClass156_145) {
														local463 = local11.method7333() << 2;
														local100 = local11.method7280();
														local476 = local11.method7280();
														local480 = local11.method7290();
														local492 = local11.method7330();
														Static617.method8467();
														Static284.method4549(local492, local480, local463, local476, local100);
														arg0.aClass156_220 = null;
														return true;
													} else if (Static220.aClass156_73 == arg0.aClass156_220) {
														local463 = local11.method7280();
														local100 = local11.method7290();
														local476 = local11.method7282() << 2;
														local480 = local11.method7291();
														local492 = local11.method7330();
														Static617.method8467();
														Static411.method6062(local476, true, local100, local480, local492, local463);
														arg0.aClass156_220 = null;
														return true;
													} else {
														@Pc(5696) boolean local5696;
														if (arg0.aClass156_220 == Static498.aClass156_162) {
															local463 = local11.method7333();
															local100 = local11.method7291();
															local5696 = (local100 & 0x1) == 1;
															Static340.method5095(local463, local5696);
															local480 = local11.method7333();
															for (local492 = 0; local492 < local480; local492++) {
																local1136 = local11.method7330();
																if (local1136 == 255) {
																	local1136 = local11.method7268();
																}
																local898 = local11.method7282();
																Static46.method841(local1136, local492, local898 - 1, local5696, local463);
															}
															Static505.anIntArray465[Static611.anInt9860++ & 0x1F] = local463;
															arg0.aClass156_220 = null;
															return true;
														} else if (Static195.aClass156_63 == arg0.aClass156_220) {
															local463 = local11.method7268();
															Static77.aClass361_1 = Static681.aClass349_6.method7747(local463);
															arg0.aClass156_220 = null;
															return true;
														} else if (Static320.aClass156_101 == arg0.aClass156_220) {
															local463 = local11.method7333();
															local100 = local11.method7291();
															local5696 = (local100 & 0x1) == 1;
															while (local11.anInt8456 < arg0.anInt10756) {
																local480 = local11.method7306();
																local492 = local11.method7333();
																local1136 = 0;
																if (local492 != 0) {
																	local1136 = local11.method7291();
																	if (local1136 == 255) {
																		local1136 = local11.method7268();
																	}
																}
																Static46.method841(local1136, local480, local492 - 1, local5696, local463);
															}
															Static505.anIntArray465[Static611.anInt9860++ & 0x1F] = local463;
															arg0.aClass156_220 = null;
															return true;
														} else if (arg0.aClass156_220 == Static477.aClass156_153) {
															Static352.method5187(Static68.aClass226_15);
															arg0.aClass156_220 = null;
															return true;
														} else if (Static348.aClass156_111 == arg0.aClass156_220) {
															local428 = local11.method7281();
															local100 = local11.method7274();
															Static617.method8467();
															Static354.method5208(local428, local100);
															arg0.aClass156_220 = null;
															return true;
														} else if (arg0.aClass156_220 == Static161.aClass156_54) {
															Static352.method5187(Static473.aClass226_18);
															arg0.aClass156_220 = null;
															return true;
														} else if (arg0.aClass156_220 == Static212.aClass156_72) {
															Static648.anInt10598 = Static55.anInt959;
															local291 = local11.method7291() == 1;
															@Pc(5949) Class280 local5949 = new Class280(local11);
															@Pc(5953) Class5_Sub55 local5953;
															if (local291) {
																local5953 = Static605.aClass5_Sub55_3;
															} else {
																local5953 = Static348.aClass5_Sub55_2;
															}
															local5949.method6381(local5953);
															arg0.aClass156_220 = null;
															return true;
														} else if (arg0.aClass156_220 == Static509.aClass156_165) {
															local291 = local11.method7291() == 1;
															local376 = local11.method7281();
															local380 = local376;
															if (local291) {
																local380 = local11.method7281();
															}
															local480 = local11.method7291();
															local492 = local11.method7333();
															local3345 = false;
															if (local480 <= 1 && Static39.method701(local380)) {
																local3345 = true;
															}
															if (!local3345 && Static670.anInt6250 == 0) {
																local3393 = Static54.aClass308_1.method6953(local492).method3284(local11);
																if (local480 == 2) {
																	Static422.method6178(local376, 0, "<img=1>" + local376, 25, local492, "<img=1>" + local380, (String) null, local3393);
																} else if (local480 == 1) {
																	Static422.method6178(local376, 0, "<img=0>" + local376, 25, local492, "<img=0>" + local380, (String) null, local3393);
																} else {
																	Static422.method6178(local376, 0, local376, 25, local492, local380, (String) null, local3393);
																}
															}
															arg0.aClass156_220 = null;
															return true;
														} else if (Static240.aClass156_80 == arg0.aClass156_220) {
															Static539.anObjectArray37 = new Object[Static379.aClass39_1.anInt701];
															arg0.aClass156_220 = null;
															return true;
														} else if (Static611.aClass156_199 == arg0.aClass156_220) {
															local463 = local11.method7292();
															if (Static66.anInt1114 != local463) {
																Static66.anInt1114 = local463;
																Static247.method3961(Static104.aClass208_1, -1, -1);
															}
															arg0.aClass156_220 = null;
															return true;
														} else if (Static593.aClass156_195 == arg0.aClass156_220) {
															local463 = local11.method7291();
															local100 = local11.method7274();
															local476 = local11.method7290();
															Static425.anIntArray429[local463] = local100;
															Static406.anIntArray78[local463] = local476;
															Static241.anIntArray212[local463] = 1;
															local480 = Static592.anIntArray535[local463] - 1;
															for (local492 = 0; local492 < local480; local492++) {
																if (Class165.anIntArray205[local492] <= local100) {
																	Static241.anIntArray212[local463] = local492 + 2;
																}
															}
															Static189.anIntArray163[Static63.anInt1063++ & 0x1F] = local463;
															arg0.aClass156_220 = null;
															return true;
														} else if (Static464.aClass156_144 == arg0.aClass156_220) {
															local463 = local11.method7333();
															local100 = local11.method7333();
															local476 = local11.method7333();
															Static617.method8467();
															if (Static397.aClass238ArrayArray2[local463] != null) {
																for (local480 = local100; local480 < local476; local480++) {
																	local492 = local11.method7331();
																	if (Static397.aClass238ArrayArray2[local463].length > local480 && Static397.aClass238ArrayArray2[local463][local480] != null) {
																		Static397.aClass238ArrayArray2[local463][local480].anInt6010 = local492;
																	}
																}
															}
															arg0.aClass156_220 = null;
															return true;
														} else if (arg0.aClass156_220 == Static450.aClass156_141) {
															local291 = local11.method7291() == 1;
															local376 = local11.method7281();
															local380 = local376;
															if (local291) {
																local380 = local11.method7281();
															}
															local2601 = (long) local11.method7333();
															local504 = (long) local11.method7331();
															local902 = local11.method7291();
															local908 = (local2601 << 32) + local504;
															local910 = false;
															local2167 = 0;
															while (true) {
																if (local2167 >= 100) {
																	if (local902 <= 1) {
																		if (Static163.aBoolean238 && !Static490.aBoolean537 || Static76.aBoolean116) {
																			local910 = true;
																		} else if (Static39.method701(local380)) {
																			local910 = true;
																		}
																	}
																	break;
																}
																if (local908 == Static235.aLongArray12[local2167]) {
																	local910 = true;
																	break;
																}
																local2167++;
															}
															if (!local910 && Static670.anInt6250 == 0) {
																Static235.aLongArray12[Static560.anInt8809] = local908;
																Static560.anInt8809 = (Static560.anInt8809 + 1) % 100;
																local2253 = Static562.method7599(Static236.method3739(local11));
																if (local902 == 2) {
																	Static422.method6178(local376, 0, "<img=1>" + local376, 7, -1, "<img=1>" + local380, (String) null, local2253);
																} else if (local902 == 1) {
																	Static422.method6178(local376, 0, "<img=0>" + local376, 7, -1, "<img=0>" + local380, (String) null, local2253);
																} else {
																	Static422.method6178(local376, 0, local376, 3, -1, local380, (String) null, local2253);
																}
															}
															arg0.aClass156_220 = null;
															return true;
														} else if (Static630.aClass156_206 == arg0.aClass156_220) {
															local463 = local11.method7333();
															@Pc(6557) byte local6557 = local11.method7318();
															if (Static539.anObjectArray37 == null) {
																Static539.anObjectArray37 = new Object[Static379.aClass39_1.anInt701];
															}
															Static539.anObjectArray37[local463] = Integer.valueOf(local6557);
															Static246.anIntArray218[Static209.anInt3703++ & 0x1F] = local463;
															arg0.aClass156_220 = null;
															return true;
														} else if (Static30.aClass156_14 == arg0.aClass156_220) {
															local428 = local11.method7281();
															local5696 = local11.method7291() == 1;
															if (local5696) {
																local376 = local11.method7281();
															} else {
																local376 = local428;
															}
															local480 = local11.method7333();
															@Pc(6623) byte local6623 = local11.method7318();
															local3345 = false;
															if (local6623 == -128) {
																local3345 = true;
															}
															if (local3345) {
																if (Static480.anInt7783 == 0) {
																	arg0.aClass156_220 = null;
																	return true;
																}
																for (local898 = 0; local898 < Static480.anInt7783 && (!Static508.aClass183Array1[local898].aString49.equals(local376) || local480 != Static508.aClass183Array1[local898].anInt4713); local898++) {
																}
																if (local898 < Static480.anInt7783) {
																	while (local898 < Static480.anInt7783 - 1) {
																		Static508.aClass183Array1[local898] = Static508.aClass183Array1[local898 + 1];
																		local898++;
																	}
																	Static480.anInt7783--;
																	Static508.aClass183Array1[Static480.anInt7783] = null;
																}
															} else {
																local3393 = local11.method7281();
																local4020 = new Class183();
																local4020.aString52 = local428;
																local4020.aString49 = local376;
																local4020.aString50 = Static382.method5678(local4020.aString49);
																local4020.aString51 = local3393;
																local4020.anInt4713 = local480;
																local4020.aByte69 = local6623;
																for (local1152 = Static480.anInt7783 - 1; local1152 >= 0; local1152--) {
																	local2615 = Static508.aClass183Array1[local1152].aString50.compareTo(local4020.aString50);
																	if (local2615 == 0) {
																		Static508.aClass183Array1[local1152].anInt4713 = local480;
																		Static508.aClass183Array1[local1152].aByte69 = local6623;
																		Static508.aClass183Array1[local1152].aString51 = local3393;
																		if (local376.equals(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44)) {
																			Static484.aByte114 = local6623;
																		}
																		arg0.aClass156_220 = null;
																		Static300.anInt5207 = Static55.anInt959;
																		return true;
																	}
																	if (local2615 < 0) {
																		break;
																	}
																}
																if (Static480.anInt7783 >= Static508.aClass183Array1.length) {
																	arg0.aClass156_220 = null;
																	return true;
																}
																for (local2615 = Static480.anInt7783 - 1; local2615 > local1152; local2615--) {
																	Static508.aClass183Array1[local2615 + 1] = Static508.aClass183Array1[local2615];
																}
																if (Static480.anInt7783 == 0) {
																	Static508.aClass183Array1 = new Class183[100];
																}
																Static508.aClass183Array1[local1152 + 1] = local4020;
																Static480.anInt7783++;
																if (local376.equals(Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4.aString44)) {
																	Static484.aByte114 = local6623;
																}
															}
															Static300.anInt5207 = Static55.anInt959;
															arg0.aClass156_220 = null;
															return true;
														} else if (arg0.aClass156_220 == Static623.aClass156_202) {
															local463 = local11.method7291();
															local100 = local11.method7282();
															Static23.aClass247_1.method5701(local463, local100);
															arg0.aClass156_220 = null;
															return true;
														} else if (Static490.aClass156_160 == arg0.aClass156_220) {
															local463 = local11.method7316();
															if (local463 == 65535) {
																local463 = -1;
															}
															local100 = local11.method7292();
															local476 = local11.method7274();
															Static617.method8467();
															Static277.method4478(local100, local463, local476);
															@Pc(6950) Class246 local6950 = Static82.aClass134_1.method3191(local463);
															Static288.method4580(local6950.anInt6480, local100, local6950.anInt6501, local6950.anInt6468);
															Static209.method3399(local6950.anInt6466, local6950.anInt6475, local100, local6950.anInt6516);
															arg0.aClass156_220 = null;
															return true;
														} else if (arg0.aClass156_220 == Static6.aClass156_1) {
															Static528.anInt8412 = local11.method7330();
															Static446.anInt7316 = local11.method7280();
															arg0.aClass156_220 = null;
															return true;
														} else if (Static11.aClass156_3 == arg0.aClass156_220) {
															local463 = local11.method7333();
															local100 = local11.method7290();
															Static617.method8467();
															if (local100 == 2) {
																Static378.method5604();
															}
															Static381.anInt6411 = local463;
															Static498.method6949(local463);
															Static417.method6129(false);
															Static247.method3963(Static381.anInt6411);
															for (local476 = 0; local476 < 100; local476++) {
																Static325.aBooleanArray15[local476] = true;
															}
															arg0.aClass156_220 = null;
															return true;
														} else {
															@Pc(7104) boolean local7104;
															if (Static555.aClass156_183 == arg0.aClass156_220) {
																local291 = local11.method7291() == 1;
																local376 = local11.method7281();
																local380 = local376;
																if (local291) {
																	local380 = local11.method7281();
																}
																local2601 = local11.method7304();
																local504 = (long) local11.method7333();
																local2148 = (long) local11.method7331();
																local2615 = local11.method7291();
																@Pc(7102) long local7102 = local2148 + (local504 << 32);
																local7104 = false;
																local1006 = 0;
																while (true) {
																	if (local1006 >= 100) {
																		if (local2615 <= 1) {
																			if (Static163.aBoolean238 && !Static490.aBoolean537 || Static76.aBoolean116) {
																				local7104 = true;
																			} else if (Static39.method701(local380)) {
																				local7104 = true;
																			}
																		}
																		break;
																	}
																	if (Static235.aLongArray12[local1006] == local7102) {
																		local7104 = true;
																		break;
																	}
																	local1006++;
																}
																if (!local7104 && Static670.anInt6250 == 0) {
																	Static235.aLongArray12[Static560.anInt8809] = local7102;
																	Static560.anInt8809 = (Static560.anInt8809 + 1) % 100;
																	@Pc(7187) String local7187 = Static562.method7599(Static236.method3739(local11));
																	if (local2615 == 2 || local2615 == 3) {
																		Static422.method6178(local376, 0, "<img=1>" + local376, 9, -1, "<img=1>" + local380, Static600.method8238(local2601), local7187);
																	} else if (local2615 == 1) {
																		Static422.method6178(local376, 0, "<img=0>" + local376, 9, -1, "<img=0>" + local380, Static600.method8238(local2601), local7187);
																	} else {
																		Static422.method6178(local376, 0, local376, 9, -1, local380, Static600.method8238(local2601), local7187);
																	}
																}
																arg0.aClass156_220 = null;
																return true;
															} else if (Static291.aClass156_96 == arg0.aClass156_220) {
																local463 = local11.method7330();
																local100 = local11.method7282();
																local5696 = (local463 & 0x1) == 1;
																Static104.method1582(local100, local5696);
																Static505.anIntArray465[Static611.anInt9860++ & 0x1F] = local100;
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static155.aClass156_51) {
																for (local463 = 0; local463 < Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1.length; local463++) {
																	if (Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local463] != null) {
																		Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local463].anIntArray403 = null;
																		Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local463].anInt6872 = -1;
																	}
																}
																for (local100 = 0; local100 < Static259.anInt4657; local100++) {
																	Static591.aClass5_Sub9Array1[local100].aClass4_Sub1_Sub1_Sub2_Sub2_1.anIntArray403 = null;
																	Static591.aClass5_Sub9Array1[local100].aClass4_Sub1_Sub1_Sub2_Sub2_1.anInt6872 = -1;
																}
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static660.aClass156_216) {
																local463 = local11.method7316();
																local100 = local11.method7268();
																local476 = local11.method7265();
																Static617.method8467();
																Static470.method6645(local476, 5, local463, local100);
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static212.aClass156_71) {
																local4104 = local11.method7332();
																local100 = local11.method7280();
																Static617.method8467();
																Static149.method2757(local4104, local100);
																arg0.aClass156_220 = null;
																return true;
															} else if (Static521.aClass156_225 == arg0.aClass156_220) {
																Static46.anInt759 = Static55.anInt959;
																local291 = local11.method7291() == 1;
																@Pc(7479) Class304 local7479 = new Class304(local11);
																@Pc(7483) Class325 local7483;
																if (local291) {
																	local7483 = Static55.aClass325_1;
																} else {
																	local7483 = Static321.aClass325_3;
																}
																local7479.method6901(local7483);
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static486.aClass156_158) {
																local463 = local11.method7316();
																Static617.method8467();
																Static440.method6338(local463);
																arg0.aClass156_220 = null;
																return true;
															} else if (Static635.aClass156_207 == arg0.aClass156_220) {
																Static352.method5187(Static640.aClass226_20);
																arg0.aClass156_220 = null;
																return true;
															} else if (Static92.aClass156_196 == arg0.aClass156_220) {
																local4104 = local11.method7318();
																local100 = local11.method7282();
																Static23.aClass247_1.method5707(local4104, local100);
																arg0.aClass156_220 = null;
																return true;
															} else if (Static512.aClass156_167 == arg0.aClass156_220) {
																local463 = local11.method7290();
																local100 = local11.method7290();
																if (local100 == 255) {
																	local463 = -1;
																	local100 = -1;
																}
																Static665.method4492(local463, local100);
																arg0.aClass156_220 = null;
																return true;
															} else if (Static446.aClass156_140 == arg0.aClass156_220) {
																local463 = local11.method7265();
																local100 = local11.method7300();
																Static23.aClass247_1.method5701(local463, local100);
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static68.aClass156_130) {
																local463 = local11.method7333();
																local100 = local11.method7292();
																Static617.method8467();
																Static592.method8148(local463, local100);
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static479.aClass156_155) {
																local463 = local11.method7291();
																if (local11.method7291() == 0) {
																	Static562.aClass63Array1[local463] = new Class63();
																} else {
																	local11.anInt8456--;
																	Static562.aClass63Array1[local463] = new Class63(local11);
																}
																Static156.anInt3035 = Static55.anInt959;
																arg0.aClass156_220 = null;
																return true;
															} else if (Static389.aClass156_35 == arg0.aClass156_220) {
																local463 = local11.method7333();
																if (local463 == 65535) {
																	local463 = -1;
																}
																local100 = local11.method7291();
																local476 = local11.method7333();
																local480 = local11.method7291();
																local492 = local11.method7333();
																Static152.method2787(local100, local492, local463, local476, local480, false);
																arg0.aClass156_220 = null;
																return true;
															} else if (Static181.aClass156_56 == arg0.aClass156_220) {
																Static54.anInt949 = local11.method7269();
																Static163.aBoolean238 = local11.method7291() == 1;
																arg0.aClass156_220 = null;
																return true;
															} else if (Static202.aClass156_205 == arg0.aClass156_220) {
																local463 = local11.method7333();
																if (local463 == 65535) {
																	local463 = -1;
																}
																local100 = local11.method7291();
																local476 = local11.method7333();
																local480 = local11.method7291();
																local492 = local11.method7333();
																Static649.method8959(local480, local492, local100, local476, local463);
																arg0.aClass156_220 = null;
																return true;
															} else if (Static83.aClass156_27 == arg0.aClass156_220) {
																Static637.anInt7729 = local11.method7318() << 3;
																Static257.anInt4648 = local11.method7272() << 3;
																Static647.anInt10548 = local11.method7291();
																for (@Pc(7814) Class5_Sub53 local7814 = (Class5_Sub53) Static248.aClass306_18.method6941(); local7814 != null; local7814 = (Class5_Sub53) Static248.aClass306_18.method6940()) {
																	local100 = (int) (local7814.aLong312 >> 28 & 0x3L);
																	local476 = (int) (local7814.aLong312 & 0x3FFFL);
																	local480 = local476 - Static315.anInt5380;
																	local492 = (int) (local7814.aLong312 >> 14 & 0x3FFFL);
																	local1136 = local492 - Static290.anInt5128;
																	if (local100 == Static647.anInt10548 && local480 >= Static637.anInt7729 && local480 < Static637.anInt7729 + 8 && local1136 >= Static257.anInt4648 && Static257.anInt4648 + 8 > local1136) {
																		local7814.method9222();
																		if (local480 >= 0 && local1136 >= 0 && local480 < Static271.anInt4910 && local1136 < Static613.anInt9909) {
																			Static549.method7494(local480, Static647.anInt10548, local1136);
																		}
																	}
																}
																@Pc(7926) Class5_Sub50 local7926;
																for (local7926 = (Class5_Sub50) Static631.aClass20_71.method378(); local7926 != null; local7926 = (Class5_Sub50) Static631.aClass20_71.method366()) {
																	if (Static637.anInt7729 <= local7926.anInt8721 && local7926.anInt8721 < Static637.anInt7729 + 8 && local7926.anInt8723 >= Static257.anInt4648 && Static257.anInt4648 + 8 > local7926.anInt8723 && local7926.anInt8725 == Static647.anInt10548) {
																		local7926.aBoolean575 = true;
																	}
																}
																for (local7926 = (Class5_Sub50) Static227.aClass20_61.method378(); local7926 != null; local7926 = (Class5_Sub50) Static227.aClass20_61.method366()) {
																	if (Static637.anInt7729 <= local7926.anInt8721 && Static637.anInt7729 + 8 > local7926.anInt8721 && local7926.anInt8723 >= Static257.anInt4648 && local7926.anInt8723 < Static257.anInt4648 + 8 && local7926.anInt8725 == Static647.anInt10548) {
																		local7926.aBoolean575 = true;
																	}
																}
																arg0.aClass156_220 = null;
																return true;
															} else if (Static548.aClass156_180 == arg0.aClass156_220) {
																local463 = local11.method7333();
																local3856 = local11.method7304();
																if (Static539.anObjectArray37 == null) {
																	Static539.anObjectArray37 = new Object[Static379.aClass39_1.anInt701];
																}
																Static539.anObjectArray37[local463] = Long.valueOf(local3856);
																Static246.anIntArray218[Static209.anInt3703++ & 0x1F] = local463;
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static356.aClass156_112) {
																local463 = local11.method7333();
																local100 = local11.method7268();
																if (Static539.anObjectArray37 == null) {
																	Static539.anObjectArray37 = new Object[Static379.aClass39_1.anInt701];
																}
																Static539.anObjectArray37[local463] = Integer.valueOf(local100);
																Static246.anIntArray218[Static209.anInt3703++ & 0x1F] = local463;
																arg0.aClass156_220 = null;
																return true;
															} else if (Static538.aClass156_177 == arg0.aClass156_220) {
																local463 = local11.method7282();
																@Pc(8157) int[] local8157 = new int[4];
																for (local476 = 0; local476 < 4; local476++) {
																	local8157[local476] = local11.method7300();
																}
																local480 = local11.method7330();
																@Pc(8186) Class5_Sub9 local8186 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local463);
																if (local8186 != null) {
																	Static70.method1153(local480, local8186.aClass4_Sub1_Sub1_Sub2_Sub2_1, local8157);
																}
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static17.aClass156_4) {
																local463 = local11.method7300();
																local100 = local11.method7268();
																local476 = local11.method7330();
																local480 = local11.method7316();
																local492 = local11.method7316();
																local1136 = local11.method7280();
																local898 = local476 & 0x7;
																local902 = local476 >> 3 & 0xF;
																if (local902 == 15) {
																	local902 = -1;
																}
																if (local100 >> 30 == 0) {
																	@Pc(8491) Class264 local8491;
																	@Pc(8422) Class295 local8422;
																	@Pc(8437) Class264 local8437;
																	if (local100 >> 29 != 0) {
																		local1152 = local100 & 0xFFFF;
																		@Pc(8377) Class5_Sub9 local8377 = (Class5_Sub9) Static677.aClass306_37.method6943((long) local1152);
																		if (local8377 != null) {
																			@Pc(8382) Class4_Sub1_Sub1_Sub2_Sub2 local8382 = local8377.aClass4_Sub1_Sub1_Sub2_Sub2_1;
																			if (local480 == 65535) {
																				local480 = -1;
																			}
																			@Pc(8394) Class337 local8394 = local8382.aClass337Array3[local1136];
																			local7104 = true;
																			local1006 = local8394.anInt8754;
																			if (local480 != -1 && local1006 != -1) {
																				if (local1006 == local480) {
																					local8422 = Static463.aClass352_1.method8006(local480);
																					if (local8422.aBoolean514 && local8422.anInt7610 != -1) {
																						local8437 = Static315.aClass14_1.method227(local8422.anInt7610);
																						@Pc(8440) int local8440 = local8437.anInt7047;
																						if (local8440 == 0 || local8440 == 2) {
																							local7104 = false;
																						} else if (local8440 == 1) {
																							local7104 = true;
																						}
																					}
																				} else {
																					local8422 = Static463.aClass352_1.method8006(local480);
																					@Pc(8475) Class295 local8475 = Static463.aClass352_1.method8006(local1006);
																					if (local8422.anInt7610 != -1 && local8475.anInt7610 != -1) {
																						local8491 = Static315.aClass14_1.method227(local8422.anInt7610);
																						@Pc(8497) Class264 local8497 = Static315.aClass14_1.method227(local8475.anInt7610);
																						if (local8497.anInt7043 > local8491.anInt7043) {
																							local7104 = false;
																						}
																					}
																				}
																			}
																			if (local7104) {
																				local8394.anInt8751 = local492;
																				local8394.anInt8754 = local480;
																				local8394.anInt8760 = 0;
																				local8394.anInt8753 = 0;
																				local8394.anInt8752 = local898;
																				local8394.anInt8758 = local902;
																				local8394.anInt8759 = 1;
																				local8394.anInt8756 = local463 + Static565.anInt8921;
																				if (Static565.anInt8921 < local8394.anInt8756) {
																					local8394.anInt8753 = -1;
																				}
																				if (local8394.anInt8754 == 65535) {
																					local8394.anInt8754 = -1;
																				}
																				if (local8394.anInt8754 != -1 && local8394.anInt8756 == Static565.anInt8921) {
																					local2629 = Static463.aClass352_1.method8006(local8394.anInt8754).anInt7610;
																					if (local2629 != -1) {
																						local8437 = Static315.aClass14_1.method227(local2629);
																						if (local8437 != null && local8437.anIntArray423 != null && !local8382.aBoolean455) {
																							Static628.method8566(local8437, 0, local8382);
																						}
																					}
																				}
																			}
																		}
																	} else if (local100 >> 28 != 0) {
																		local1152 = local100 & 0xFFFF;
																		@Pc(8623) Class4_Sub1_Sub1_Sub2_Sub1 local8623;
																		if (local1152 == Static649.anInt10621) {
																			local8623 = Static362.aClass4_Sub1_Sub1_Sub2_Sub1_4;
																		} else {
																			local8623 = Static574.aClass4_Sub1_Sub1_Sub2_Sub1Array1[local1152];
																		}
																		if (local8623 != null) {
																			if (local480 == 65535) {
																				local480 = -1;
																			}
																			@Pc(8645) Class337 local8645 = local8623.aClass337Array3[local1136];
																			local4614 = true;
																			local927 = local8645.anInt8754;
																			@Pc(8728) Class264 local8728;
																			if (local480 != -1 && local927 != -1) {
																				@Pc(8670) Class295 local8670;
																				if (local927 == local480) {
																					local8670 = Static463.aClass352_1.method8006(local480);
																					if (local8670.aBoolean514 && local8670.anInt7610 != -1) {
																						local8728 = Static315.aClass14_1.method227(local8670.anInt7610);
																						@Pc(8731) int local8731 = local8728.anInt7047;
																						if (local8731 == 0 || local8731 == 2) {
																							local4614 = false;
																						} else if (local8731 == 1) {
																							local4614 = true;
																						}
																					}
																				} else {
																					local8670 = Static463.aClass352_1.method8006(local480);
																					local8422 = Static463.aClass352_1.method8006(local927);
																					if (local8670.anInt7610 != -1 && local8422.anInt7610 != -1) {
																						local8437 = Static315.aClass14_1.method227(local8670.anInt7610);
																						local8491 = Static315.aClass14_1.method227(local8422.anInt7610);
																						if (local8491.anInt7043 > local8437.anInt7043) {
																							local4614 = false;
																						}
																					}
																				}
																			}
																			if (local4614) {
																				local8645.anInt8753 = 0;
																				local8645.anInt8752 = local898;
																				local8645.anInt8760 = 0;
																				local8645.anInt8758 = local902;
																				local8645.anInt8759 = 1;
																				local8645.anInt8751 = local492;
																				local8645.anInt8756 = local463 + Static565.anInt8921;
																				local8645.anInt8754 = local480;
																				if (local8645.anInt8756 > Static565.anInt8921) {
																					local8645.anInt8753 = -1;
																				}
																				if (local8645.anInt8754 == 65535) {
																					local8645.anInt8754 = -1;
																				}
																				if (local8645.anInt8754 != -1 && local8645.anInt8756 == Static565.anInt8921) {
																					local1006 = Static463.aClass352_1.method8006(local8645.anInt8754).anInt7610;
																					if (local1006 != -1) {
																						local8728 = Static315.aClass14_1.method227(local1006);
																						if (local8728 != null && local8728.anIntArray423 != null && !local8623.aBoolean455) {
																							Static628.method8566(local8728, 0, local8623);
																						}
																					}
																				}
																			}
																		}
																	}
																} else {
																	local1152 = local100 >> 28 & 0x3;
																	local2615 = (local100 >> 14 & 0x3FFF) - Static315.anInt5380;
																	local2619 = (local100 & 0x3FFF) - Static290.anInt5128;
																	if (local2615 >= 0 && local2619 >= 0 && local2615 < Static271.anInt4910 && Static613.anInt9909 > local2619) {
																		local2167 = local2615 * 512 + 256;
																		local927 = local2619 * 512 + 256;
																		local1006 = local1152;
																		if (local1152 < 3 && Static389.method1741(local2619, local2615)) {
																			local1006 = local1152 + 1;
																		}
																		@Pc(8351) Class4_Sub1_Sub1_Sub5 local8351 = new Class4_Sub1_Sub1_Sub5(local480, local463, Static565.anInt8921, local1152, local1006, local2167, Static461.method6500(local2167, local1152, local927) - local492, local927, local2615, local2615, local2619, local2619, local898);
																		Static146.aClass20_10.method370(new Class5_Sub1_Sub17(local8351));
																	}
																}
																arg0.aClass156_220 = null;
																return true;
															} else if (arg0.aClass156_220 == Static348.aClass156_109) {
																local463 = local11.method7268();
																local100 = local11.method7268();
																Static617.method8467();
																@Pc(8884) Class5_Sub38 local8884 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local463);
																local4476 = (Class5_Sub38) Static438.aClass306_31.method6943((long) local100);
																if (local4476 != null) {
																	Static655.method9010(false, local4476, local8884 == null || local8884.anInt6418 != local4476.anInt6418);
																}
																if (local8884 != null) {
																	local8884.method9222();
																	Static438.aClass306_31.method6944(local8884, (long) local100, -12002);
																}
																@Pc(8929) Class238 local8929 = Static305.method4761(local463);
																if (local8929 != null) {
																	Static333.method5032(local8929);
																}
																local8929 = Static305.method4761(local100);
																if (local8929 != null) {
																	Static333.method5032(local8929);
																	Static374.method5569(local8929, true);
																}
																if (Static381.anInt6411 != -1) {
																	Static194.method8970(Static381.anInt6411, 1);
																}
																arg0.aClass156_220 = null;
																return true;
															} else if (Static379.aClass156_125 == arg0.aClass156_220) {
																local428 = local11.method7281();
																local100 = local11.method7300();
																Static617.method8467();
																Static29.method497(local100, local428);
																arg0.aClass156_220 = null;
																return true;
															} else {
																Static522.method7115((Throwable) null, "T1 - " + (arg0.aClass156_220 == null ? -1 : arg0.aClass156_220.method3528()) + "," + (arg0.aClass156_217 == null ? -1 : arg0.aClass156_217.method3528()) + "," + (arg0.aClass156_218 == null ? -1 : arg0.aClass156_218.method3528()) + " - " + arg0.anInt10756);
																Static452.method6395(false);
																return true;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
}
