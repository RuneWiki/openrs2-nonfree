import java.awt.Rectangle;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static436 {

	@OriginalMember(owner = "client!wa", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString70;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)Z")
	public static boolean method5626() throws IOException {
		if (Static223.aClass5_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static223.aClass5_3.method120();
		if (local13 == 0) {
			return false;
		}
		@Pc(70) int local70;
		if (Static375.aClass186_176 == null) {
			if (Static391.aBoolean453) {
				local13--;
				Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, 1, 0);
				Static105.anInt2232++;
				Static391.aBoolean453 = false;
			}
			Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
			if (Static349.aClass4_Sub30_Sub1_2.method3916()) {
				if (local13 == 0) {
					return false;
				}
				Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, 1, 1);
				local13--;
				Static105.anInt2232++;
			}
			Static391.aBoolean453 = true;
			@Pc(66) Class186[] local66 = Static6.method209();
			local70 = Static349.aClass4_Sub30_Sub1_2.method3919();
			if (local70 < 0 || local66.length <= local70) {
				throw new IOException("invo:" + local70 + " ip:" + Static349.aClass4_Sub30_Sub1_2.anInt6244);
			}
			Static375.aClass186_176 = local66[local70];
			Static106.anInt2242 = Static375.aClass186_176.anInt5431;
		}
		if (Static106.anInt2242 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, 1, 0);
			Static105.anInt2232++;
			Static106.anInt2242 = Static349.aClass4_Sub30_Sub1_2.aByteArray79[0] & 0xFF;
			local13--;
		}
		if (Static106.anInt2242 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, 2, 0);
			Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
			Static106.anInt2242 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local13 -= 2;
			Static105.anInt2232 += 2;
		}
		if (Static106.anInt2242 > local13) {
			return false;
		}
		Static349.aClass4_Sub30_Sub1_2.anInt6244 = 0;
		Static223.aClass5_3.method122(Static349.aClass4_Sub30_Sub1_2.aByteArray79, Static106.anInt2242, 0);
		Static404.aClass186_237 = Static430.aClass186_257;
		Static105.anInt2232 += Static106.anInt2242;
		Static54.anInt7603 = 0;
		Static430.aClass186_257 = Static305.aClass186_182;
		Static305.aClass186_182 = Static375.aClass186_176;
		@Pc(216) int local216;
		@Pc(201) int local201;
		@Pc(220) int local220;
		if (Static177.aClass186_110 == Static375.aClass186_176) {
			local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
			if (local201 == 65535) {
				local201 = -1;
			}
			local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
			local216 = Static349.aClass4_Sub30_Sub1_2.method4877();
			local220 = Static349.aClass4_Sub30_Sub1_2.method4864();
			Static333.method4508(local201, local220, local70, local216);
			Static375.aClass186_176 = null;
			return true;
		} else if (Static375.aClass186_176 == Static217.aClass186_130) {
			Static321.method4407(false);
			Static375.aClass186_176 = null;
			return true;
		} else if (Static43.aClass186_11 == Static375.aClass186_176) {
			Static246.method3390();
			Static375.aClass186_176 = null;
			return false;
		} else if (Static162.aClass186_211 == Static375.aClass186_176) {
			Static232.anInt4231 = Static349.aClass4_Sub30_Sub1_2.method4889();
			Static375.aClass186_176 = null;
			Static41.anInt1028 = Static190.anInt3670;
			return true;
		} else if (Static346.aClass186_206 == Static375.aClass186_176) {
			Static366.method5053(Static415.aClass217_39);
			Static375.aClass186_176 = null;
			return true;
		} else {
			@Pc(360) int local360;
			@Pc(294) String local294;
			@Pc(308) boolean local308;
			@Pc(321) String local321;
			@Pc(467) int local467;
			@Pc(325) Class219 local325;
			@Pc(350) int local350;
			@Pc(288) boolean local288;
			@Pc(279) String local279;
			if (Static375.aClass186_176 == Static443.aClass186_266) {
				local279 = Static349.aClass4_Sub30_Sub1_2.method4867();
				local288 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
				if (local288) {
					local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
				} else {
					local294 = local279;
				}
				local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
				@Pc(306) byte local306 = Static349.aClass4_Sub30_Sub1_2.method4865();
				local308 = false;
				if (local306 == -128) {
					local308 = true;
				}
				if (local308) {
					if (Static223.anInt4124 == 0) {
						Static375.aClass186_176 = null;
						return true;
					}
					for (local467 = 0; Static223.anInt4124 > local467 && (!Static2.aClass219Array10[local467].aString61.equals(local294) || Static2.aClass219Array10[local467].anInt6458 != local220); local467++) {
					}
					if (local467 < Static223.anInt4124) {
						while (Static223.anInt4124 - 1 > local467) {
							Static2.aClass219Array10[local467] = Static2.aClass219Array10[local467 + 1];
							local467++;
						}
						Static223.anInt4124--;
						Static2.aClass219Array10[Static223.anInt4124] = null;
					}
				} else {
					local321 = Static349.aClass4_Sub30_Sub1_2.method4867();
					local325 = new Class219();
					local325.aString61 = local294;
					local325.aString60 = local279;
					local325.aString63 = Static402.method1650(local325.aString61);
					local325.aString62 = local321;
					local325.anInt6458 = local220;
					local325.aByte96 = local306;
					for (local350 = Static223.anInt4124 - 1; local350 >= 0; local350--) {
						local360 = Static2.aClass219Array10[local350].aString63.compareTo(local325.aString63);
						if (local360 == 0) {
							Static2.aClass219Array10[local350].anInt6458 = local220;
							Static2.aClass219Array10[local350].aByte96 = local306;
							Static2.aClass219Array10[local350].aString62 = local321;
							if (local294.equals(Static375.aClass6_Sub2_Sub1_Sub1_3.aString11)) {
								Static297.aByte77 = local306;
							}
							Static359.anInt6422 = Static190.anInt3670;
							Static375.aClass186_176 = null;
							return true;
						}
						if (local360 < 0) {
							break;
						}
					}
					if (Static2.aClass219Array10.length <= Static223.anInt4124) {
						Static375.aClass186_176 = null;
						return true;
					}
					for (local360 = Static223.anInt4124 - 1; local360 > local350; local360--) {
						Static2.aClass219Array10[local360 + 1] = Static2.aClass219Array10[local360];
					}
					if (Static223.anInt4124 == 0) {
						Static2.aClass219Array10 = new Class219[100];
					}
					Static2.aClass219Array10[local350 + 1] = local325;
					Static223.anInt4124++;
					if (local294.equals(Static375.aClass6_Sub2_Sub1_Sub1_3.aString11)) {
						Static297.aByte77 = local306;
					}
				}
				Static359.anInt6422 = Static190.anInt3670;
				Static375.aClass186_176 = null;
				return true;
			}
			@Pc(706) boolean local706;
			@Pc(570) boolean local570;
			@Pc(606) int local606;
			if (Static375.aClass186_176 == Static352.aClass186_210) {
				Static359.anInt6422 = Static190.anInt3670;
				if (Static106.anInt2242 == 0) {
					Static144.aString25 = null;
					Static375.aClass186_176 = null;
					Static2.aClass219Array10 = null;
					Static223.anInt4124 = 0;
					Static10.aString5 = null;
					return true;
				}
				Static10.aString5 = Static349.aClass4_Sub30_Sub1_2.method4867();
				local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
				if (local570) {
					Static349.aClass4_Sub30_Sub1_2.method4867();
				}
				@Pc(580) long local580 = Static349.aClass4_Sub30_Sub1_2.method4853();
				Static144.aString25 = Static345.method4817(local580);
				Static316.aByte84 = Static349.aClass4_Sub30_Sub1_2.method4865();
				local220 = Static349.aClass4_Sub30_Sub1_2.method4864();
				if (local220 == 255) {
					Static375.aClass186_176 = null;
					return true;
				}
				Static223.anInt4124 = local220;
				@Pc(604) Class219[] local604 = new Class219[100];
				for (local606 = 0; local606 < Static223.anInt4124; local606++) {
					local604[local606] = new Class219();
					local604[local606].aString60 = Static349.aClass4_Sub30_Sub1_2.method4867();
					local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
					if (local570) {
						local604[local606].aString61 = Static349.aClass4_Sub30_Sub1_2.method4867();
					} else {
						local604[local606].aString61 = local604[local606].aString60;
					}
					local604[local606].aString63 = Static402.method1650(local604[local606].aString61);
					local604[local606].anInt6458 = Static349.aClass4_Sub30_Sub1_2.method4877();
					local604[local606].aByte96 = Static349.aClass4_Sub30_Sub1_2.method4865();
					local604[local606].aString62 = Static349.aClass4_Sub30_Sub1_2.method4867();
					if (local604[local606].aString61.equals(Static375.aClass6_Sub2_Sub1_Sub1_3.aString11)) {
						Static297.aByte77 = local604[local606].aByte96;
					}
				}
				local350 = Static223.anInt4124;
				while (local350 > 0) {
					local350--;
					local706 = true;
					for (local360 = 0; local360 < local350; local360++) {
						if (local604[local360].aString63.compareTo(local604[local360 + 1].aString63) > 0) {
							local325 = local604[local360];
							local604[local360] = local604[local360 + 1];
							local604[local360 + 1] = local325;
							local706 = false;
						}
					}
					if (local706) {
						break;
					}
				}
				Static2.aClass219Array10 = local604;
				Static375.aClass186_176 = null;
				return true;
			}
			@Pc(797) int local797;
			@Pc(783) String local783;
			if (Static234.aClass186_136 == Static375.aClass186_176) {
				local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
				local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
				local783 = local294;
				if (local570) {
					local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
				}
				local220 = Static349.aClass4_Sub30_Sub1_2.method4864();
				local797 = Static349.aClass4_Sub30_Sub1_2.method4877();
				local308 = false;
				if (local220 <= 1 && Static367.method5077(local783)) {
					local308 = true;
				}
				if (!local308 && Static339.anInt5973 == 0) {
					local321 = Static390.aClass221_2.method5054(local797).method3464(Static349.aClass4_Sub30_Sub1_2);
					if (local220 == 2) {
						Static313.method4325(local321, local797, 0, "<img=1>" + local783, "<img=1>" + local294, null, 25);
					} else if (local220 == 1) {
						Static313.method4325(local321, local797, 0, "<img=0>" + local783, "<img=0>" + local294, null, 25);
					} else {
						Static313.method4325(local321, local797, 0, local783, local294, null, 25);
					}
				}
				Static375.aClass186_176 = null;
				return true;
			}
			@Pc(928) int local928;
			@Pc(943) int local943;
			@Pc(919) long local919;
			@Pc(924) long local924;
			if (Static375.aClass186_176 == Static382.aClass186_228) {
				local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
				local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
				local783 = local294;
				if (local570) {
					local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
				}
				local919 = Static349.aClass4_Sub30_Sub1_2.method4877();
				local924 = Static349.aClass4_Sub30_Sub1_2.method4887();
				local928 = Static349.aClass4_Sub30_Sub1_2.method4864();
				local350 = Static349.aClass4_Sub30_Sub1_2.method4877();
				@Pc(939) long local939 = (local919 << 32) + local924;
				@Pc(941) boolean local941 = false;
				local943 = 0;
				while (true) {
					if (local943 >= 100) {
						if (local928 <= 1 && Static367.method5077(local783)) {
							local941 = true;
						}
						break;
					}
					if (Static57.aLongArray2[local943] == local939) {
						local941 = true;
						break;
					}
					local943++;
				}
				if (!local941 && Static339.anInt5973 == 0) {
					Static57.aLongArray2[Static174.anInt3239] = local939;
					Static174.anInt3239 = (Static174.anInt3239 + 1) % 100;
					@Pc(996) String local996 = Static390.aClass221_2.method5054(local350).method3464(Static349.aClass4_Sub30_Sub1_2);
					if (local928 == 2) {
						Static313.method4325(local996, local350, 0, "<img=1>" + local783, "<img=1>" + local294, null, 18);
					} else if (local928 == 1) {
						Static313.method4325(local996, local350, 0, "<img=0>" + local783, "<img=0>" + local294, null, 18);
					} else {
						Static313.method4325(local996, local350, 0, local783, local294, null, 18);
					}
				}
				Static375.aClass186_176 = null;
				return true;
			} else if (Static401.aClass186_234 == Static375.aClass186_176) {
				Static401.anInt6859 = Static349.aClass4_Sub30_Sub1_2.method4877() * 30;
				Static375.aClass186_176 = null;
				Static41.anInt1028 = Static190.anInt3670;
				return true;
			} else if (Static375.aClass186_176 == Static351.aClass186_209) {
				local201 = Static349.aClass4_Sub30_Sub1_2.method4889();
				local70 = Static349.aClass4_Sub30_Sub1_2.method4837();
				local216 = Static349.aClass4_Sub30_Sub1_2.method4852();
				if (Static220.method4267(local216)) {
					Static201.method5154(local201, local70);
				}
				Static375.aClass186_176 = null;
				return true;
			} else if (Static375.aClass186_176 == Static316.aClass186_201) {
				local201 = Static349.aClass4_Sub30_Sub1_2.method4882();
				local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
				if (Static220.method4267(local70)) {
					Static175.anInt3265 = local201;
				}
				Static375.aClass186_176 = null;
				return true;
			} else if (Static375.aClass186_176 == Static231.aClass186_135) {
				local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
				local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
				local288 = (local70 & 0x1) == 1;
				Static124.method1886(local201, local288);
				local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
				for (local797 = 0; local797 < local220; local797++) {
					local606 = Static349.aClass4_Sub30_Sub1_2.method4856();
					local467 = Static349.aClass4_Sub30_Sub1_2.method4864();
					if (local467 == 255) {
						local467 = Static349.aClass4_Sub30_Sub1_2.method4872();
					}
					Static296.method4109(local797, local201, local606 - 1, local467, local288);
				}
				Static93.anIntArray126[Static138.anInt2664++ & 0x1F] = local201;
				Static375.aClass186_176 = null;
				return true;
			} else {
				@Pc(1256) int local1256;
				if (Static375.aClass186_176 == Static95.aClass186_60) {
					local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
					local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
					local783 = local294;
					if (local570) {
						local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
					}
					local919 = Static349.aClass4_Sub30_Sub1_2.method4877();
					local924 = Static349.aClass4_Sub30_Sub1_2.method4887();
					local928 = Static349.aClass4_Sub30_Sub1_2.method4864();
					@Pc(1252) long local1252 = local924 + (local919 << 32);
					@Pc(1254) boolean local1254 = false;
					local1256 = 0;
					while (true) {
						if (local1256 >= 100) {
							if (local928 <= 1) {
								if (Static386.aBoolean448 && !Static146.aBoolean200 || Static444.aBoolean494) {
									local1254 = true;
								} else if (Static367.method5077(local783)) {
									local1254 = true;
								}
							}
							break;
						}
						if (Static57.aLongArray2[local1256] == local1252) {
							local1254 = true;
							break;
						}
						local1256++;
					}
					if (!local1254 && Static339.anInt5973 == 0) {
						Static57.aLongArray2[Static174.anInt3239] = local1252;
						Static174.anInt3239 = (Static174.anInt3239 + 1) % 100;
						@Pc(1317) String local1317 = Static257.method3525(Static92.method1505(Static349.aClass4_Sub30_Sub1_2));
						if (local928 == 2) {
							Static313.method4325(local1317, -1, 0, "<img=1>" + local783, "<img=1>" + local294, null, 7);
						} else if (local928 == 1) {
							Static313.method4325(local1317, -1, 0, "<img=0>" + local783, "<img=0>" + local294, null, 7);
						} else {
							Static313.method4325(local1317, -1, 0, local783, local294, null, 3);
						}
					}
					Static375.aClass186_176 = null;
					return true;
				} else if (Static69.aClass186_49 == Static375.aClass186_176) {
					local201 = Static349.aClass4_Sub30_Sub1_2.method4880();
					local70 = Static349.aClass4_Sub30_Sub1_2.method4829();
					Static155.aClass149_1.method3217(local201, local70);
					Static375.aClass186_176 = null;
					return true;
				} else if (Static157.aClass186_94 == Static375.aClass186_176) {
					local201 = Static349.aClass4_Sub30_Sub1_2.method4886();
					local70 = Static349.aClass4_Sub30_Sub1_2.method4829();
					local216 = Static349.aClass4_Sub30_Sub1_2.method4877();
					if (Static220.method4267(local216)) {
						Static66.method1256(local70, local201);
					}
					Static375.aClass186_176 = null;
					return true;
				} else if (Static346.aClass186_207 == Static375.aClass186_176) {
					local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
					local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
					local216 = Static349.aClass4_Sub30_Sub1_2.method4877();
					local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
					if (Static220.method4267(local201) && Static320.aClass126ArrayArray2[local70] != null) {
						for (local797 = local216; local797 < local220; local797++) {
							local606 = Static349.aClass4_Sub30_Sub1_2.method4887();
							if (Static320.aClass126ArrayArray2[local70].length > local797 && Static320.aClass126ArrayArray2[local70][local797] != null) {
								Static320.aClass126ArrayArray2[local70][local797].anInt3452 = local606;
							}
						}
					}
					Static375.aClass186_176 = null;
					return true;
				} else if (Static300.aClass186_179 == Static375.aClass186_176) {
					local201 = Static349.aClass4_Sub30_Sub1_2.method4837();
					local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
					if (local70 == 65535) {
						local70 = -1;
					}
					local216 = Static349.aClass4_Sub30_Sub1_2.method4852();
					if (Static220.method4267(local216)) {
						Static156.method2328(local201, 2, local70, -1);
					}
					Static375.aClass186_176 = null;
					return true;
				} else if (Static375.aClass186_176 == Static50.aClass186_38) {
					Static366.method5053(Static332.aClass217_33);
					Static375.aClass186_176 = null;
					return true;
				} else if (Static375.aClass186_176 == Static411.aClass186_243) {
					local201 = Static349.aClass4_Sub30_Sub1_2.method4852();
					local70 = Static349.aClass4_Sub30_Sub1_2.method4872();
					local216 = Static349.aClass4_Sub30_Sub1_2.method4856();
					if (Static220.method4267(local216)) {
						Static408.method5379(local70, local201);
					}
					Static375.aClass186_176 = null;
					return true;
				} else if (Static453.aClass186_262 == Static375.aClass186_176) {
					Static366.method5053(Static448.aClass217_41);
					Static375.aClass186_176 = null;
					return true;
				} else {
					@Pc(1646) String local1646;
					if (Static375.aClass186_176 == Static379.aClass186_226) {
						local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
						local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
						local783 = local294;
						if (local570) {
							local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
						}
						local220 = Static349.aClass4_Sub30_Sub1_2.method4864();
						@Pc(1608) boolean local1608 = false;
						if (local220 <= 1) {
							if (Static386.aBoolean448 && !Static146.aBoolean200 || Static444.aBoolean494) {
								local1608 = true;
							} else if (local220 <= 1 && Static367.method5077(local783)) {
								local1608 = true;
							}
						}
						if (!local1608 && Static339.anInt5973 == 0) {
							local1646 = Static257.method3525(Static92.method1505(Static349.aClass4_Sub30_Sub1_2));
							if (local220 == 2) {
								Static313.method4325(local1646, -1, 0, "<img=1>" + local783, "<img=1>" + local294, null, 24);
							} else if (local220 == 1) {
								Static313.method4325(local1646, -1, 0, "<img=0>" + local783, "<img=0>" + local294, null, 24);
							} else {
								Static313.method4325(local1646, -1, 0, local783, local294, null, 24);
							}
						}
						Static375.aClass186_176 = null;
						return true;
					} else if (Static375.aClass186_176 == Static284.aClass186_171) {
						local201 = Static349.aClass4_Sub30_Sub1_2.method4829();
						local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
						local216 = Static349.aClass4_Sub30_Sub1_2.method4872();
						Static70.anIntArray646[local70] = local216;
						Static195.anIntArray238[local70] = local201;
						Static222.anIntArray335[local70] = 1;
						local220 = Static231.anIntArray341[local70] - 1;
						for (local797 = 0; local797 < local220; local797++) {
							if (local216 >= Class238.anIntArray598[local797]) {
								Static222.anIntArray335[local70] = local797 + 2;
							}
						}
						Static210.anIntArray325[Static69.anInt1700++ & 0x1F] = local70;
						Static375.aClass186_176 = null;
						return true;
					} else if (Static375.aClass186_176 == Static220.aClass186_186) {
						local279 = Static349.aClass4_Sub30_Sub1_2.method4867();
						local294 = Static257.method3525(Static92.method1505(Static349.aClass4_Sub30_Sub1_2));
						Static262.method3576(local294, local279, 6, 0, local279);
						Static375.aClass186_176 = null;
						return true;
					} else if (Static375.aClass186_176 == Static412.aClass186_245) {
						Static366.method5053(Static192.aClass217_42);
						Static375.aClass186_176 = null;
						return true;
					} else if (Static449.aClass186_271 == Static375.aClass186_176) {
						local201 = Static349.aClass4_Sub30_Sub1_2.method4872();
						local70 = Static349.aClass4_Sub30_Sub1_2.method4845();
						local216 = Static349.aClass4_Sub30_Sub1_2.method4832();
						local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
						if (Static220.method4267(local220)) {
							Static258.method3605(local201, local70, local216);
						}
						Static375.aClass186_176 = null;
						return true;
					} else if (Static25.aClass186_22 == Static375.aClass186_176) {
						local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
						local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
						local216 = Static349.aClass4_Sub30_Sub1_2.method4864();
						local220 = Static349.aClass4_Sub30_Sub1_2.method4877() << 0;
						local797 = Static349.aClass4_Sub30_Sub1_2.method4864();
						local606 = Static349.aClass4_Sub30_Sub1_2.method4864();
						if (Static220.method4267(local201)) {
							Static303.method4188(local70, true, local797, local606, local220, local216);
						}
						Static375.aClass186_176 = null;
						return true;
					} else if (Static375.aClass186_176 == Static385.aClass186_193) {
						Static10.method282();
						Static375.aClass186_176 = null;
						return true;
					} else if (Static375.aClass186_176 == Static435.aClass186_261) {
						Static290.anInt5240 = Static349.aClass4_Sub30_Sub1_2.method4864();
						Static54.anInt7605 = Static349.aClass4_Sub30_Sub1_2.method4879() << 3;
						Static111.anInt6481 = Static349.aClass4_Sub30_Sub1_2.method4865() << 3;
						while (Static349.aClass4_Sub30_Sub1_2.anInt6244 < Static106.anInt2242) {
							@Pc(1931) Class217 local1931 = Static418.method5472()[Static349.aClass4_Sub30_Sub1_2.method4864()];
							Static366.method5053(local1931);
						}
						Static375.aClass186_176 = null;
						return true;
					} else if (Static305.aClass186_181 == Static375.aClass186_176) {
						Static77.anInt1824 = Static349.aClass4_Sub30_Sub1_2.method4854();
						Static202.anInt3888 = Static349.aClass4_Sub30_Sub1_2.method4829();
						Static375.aClass186_176 = null;
						return true;
					} else if (Static375.aClass186_176 == Static57.aClass186_43) {
						local201 = Static349.aClass4_Sub30_Sub1_2.method4852();
						if (local201 == 65535) {
							local201 = -1;
						}
						local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
						local216 = Static349.aClass4_Sub30_Sub1_2.method4888();
						if (Static220.method4267(local70)) {
							Static163.method2390(local201, local216);
						}
						Static375.aClass186_176 = null;
						return true;
					} else if (Static375.aClass186_176 == Static286.aClass186_172) {
						local201 = Static349.aClass4_Sub30_Sub1_2.method4864();
						local70 = Static349.aClass4_Sub30_Sub1_2.method4854();
						if (local70 == 255) {
							local201 = -1;
							local70 = -1;
						}
						Static277.method3728(local201, local70);
						Static375.aClass186_176 = null;
						return true;
					} else if (Static375.aClass186_176 == Static358.aClass186_216) {
						local201 = Static349.aClass4_Sub30_Sub1_2.method4852();
						local70 = Static349.aClass4_Sub30_Sub1_2.method4886();
						local216 = Static349.aClass4_Sub30_Sub1_2.method4852();
						if (Static220.method4267(local201)) {
							Static415.method5437(local216, local70);
						}
						Static375.aClass186_176 = null;
						return true;
					} else {
						@Pc(2102) long local2102;
						@Pc(2110) int local2110;
						if (Static237.aClass186_139 == Static375.aClass186_176) {
							local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
							local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
							local783 = local294;
							if (local570) {
								local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
							}
							local919 = Static349.aClass4_Sub30_Sub1_2.method4853();
							local924 = Static349.aClass4_Sub30_Sub1_2.method4877();
							local2102 = Static349.aClass4_Sub30_Sub1_2.method4887();
							local360 = Static349.aClass4_Sub30_Sub1_2.method4864();
							local2110 = Static349.aClass4_Sub30_Sub1_2.method4877();
							@Pc(2116) long local2116 = local2102 + (local924 << 32);
							@Pc(2118) boolean local2118 = false;
							@Pc(2120) int local2120 = 0;
							while (true) {
								if (local2120 >= 100) {
									if (local360 <= 1 && Static367.method5077(local783)) {
										local2118 = true;
									}
									break;
								}
								if (Static57.aLongArray2[local2120] == local2116) {
									local2118 = true;
									break;
								}
								local2120++;
							}
							if (!local2118 && Static339.anInt5973 == 0) {
								Static57.aLongArray2[Static174.anInt3239] = local2116;
								Static174.anInt3239 = (Static174.anInt3239 + 1) % 100;
								@Pc(2174) String local2174 = Static390.aClass221_2.method5054(local2110).method3464(Static349.aClass4_Sub30_Sub1_2);
								if (local360 == 2) {
									Static313.method4325(local2174, local2110, 0, "<img=1>" + local783, "<img=1>" + local294, Static128.method1909(local919), 20);
								} else if (local360 == 1) {
									Static313.method4325(local2174, local2110, 0, "<img=0>" + local783, "<img=0>" + local294, Static128.method1909(local919), 20);
								} else {
									Static313.method4325(local2174, local2110, 0, local783, local294, Static128.method1909(local919), 20);
								}
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static393.aClass186_231 == Static375.aClass186_176) {
							Static129.method1923(Static106.anInt2242, Static349.aClass4_Sub30_Sub1_2);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static407.aClass186_238 == Static375.aClass186_176) {
							local201 = Static349.aClass4_Sub30_Sub1_2.method4856();
							if (local201 == 65535) {
								local201 = -1;
							}
							local70 = Static349.aClass4_Sub30_Sub1_2.method4888();
							local216 = Static349.aClass4_Sub30_Sub1_2.method4837();
							local220 = Static349.aClass4_Sub30_Sub1_2.method4852();
							if (Static220.method4267(local220)) {
								Static264.method3596(local201, local70, local216);
								@Pc(2294) Class127 local2294 = Static390.aClass204_2.method4629(local201);
								Static210.method2991(local216, local2294.anInt3548, local2294.anInt3580, local2294.anInt3582);
								Static282.method3775(local2294.anInt3569, local2294.anInt3555, local2294.anInt3556, local216);
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static273.aClass186_159 == Static375.aClass186_176) {
							Static321.method4407(true);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static244.aClass186_141 == Static375.aClass186_176) {
							local201 = Static349.aClass4_Sub30_Sub1_2.method4864();
							local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
							local288 = (local201 & 0x1) == 1;
							Static47.method992(local288, local70);
							Static93.anIntArray126[Static138.anInt2664++ & 0x1F] = local70;
							Static375.aClass186_176 = null;
							return true;
						} else if (Static144.aClass186_85 == Static375.aClass186_176) {
							Static366.method5053(Static236.aClass217_17);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static40.aClass186_31) {
							Static298.anInt5351 = Static349.aClass4_Sub30_Sub1_2.method4864();
							Static41.anInt1028 = Static190.anInt3670;
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static154.aClass186_92) {
							local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
							local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
							@Pc(2406) Object[] local2406 = new Object[local294.length() + 1];
							for (local220 = local294.length() - 1; local220 >= 0; local220--) {
								if (local294.charAt(local220) == 's') {
									local2406[local220 + 1] = Static349.aClass4_Sub30_Sub1_2.method4867();
								} else {
									local2406[local220 + 1] = Integer.valueOf(Static349.aClass4_Sub30_Sub1_2.method4872());
								}
							}
							local2406[0] = Integer.valueOf(Static349.aClass4_Sub30_Sub1_2.method4872());
							if (Static220.method4267(local201)) {
								@Pc(2461) Class4_Sub40 local2461 = new Class4_Sub40();
								local2461.anObjectArray35 = local2406;
								Static172.method2513(local2461);
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static404.aClass186_236) {
							if (Static404.anInt6892 != -1) {
								Static99.method4522(Static404.anInt6892, 0);
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static309.aClass186_185) {
							local201 = Static349.aClass4_Sub30_Sub1_2.method4856();
							local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
							local216 = Static349.aClass4_Sub30_Sub1_2.method4886();
							local220 = Static349.aClass4_Sub30_Sub1_2.method4880();
							if (Static220.method4267(local201)) {
								Static453.method5625(local70 + (local220 << 16), local216);
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static365.aClass186_221 == Static375.aClass186_176) {
							Static366.method5053(Static289.aClass217_28);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static161.aClass186_96 == Static375.aClass186_176) {
							local279 = Static349.aClass4_Sub30_Sub1_2.method4867();
							local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
							local783 = Static390.aClass221_2.method5054(local70).method3464(Static349.aClass4_Sub30_Sub1_2);
							Static313.method4325(local783, local70, 0, local279, local279, null, 19);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static77.aClass186_55) {
							local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
							local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
							local288 = (local70 & 0x1) == 1;
							while (Static106.anInt2242 > Static349.aClass4_Sub30_Sub1_2.anInt6244) {
								local220 = Static349.aClass4_Sub30_Sub1_2.method4844();
								local797 = Static349.aClass4_Sub30_Sub1_2.method4877();
								local606 = 0;
								if (local797 != 0) {
									local606 = Static349.aClass4_Sub30_Sub1_2.method4864();
									if (local606 == 255) {
										local606 = Static349.aClass4_Sub30_Sub1_2.method4872();
									}
								}
								Static296.method4109(local220, local201, local797 - 1, local606, local288);
							}
							Static93.anIntArray126[Static138.anInt2664++ & 0x1F] = local201;
							Static375.aClass186_176 = null;
							return true;
						} else if (Static417.aClass186_249 == Static375.aClass186_176) {
							Static366.method5053(Static294.aClass217_30);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static128.aClass186_76 == Static375.aClass186_176) {
							Static366.method5053(Static15.aClass217_3);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static392.aClass186_144 == Static375.aClass186_176) {
							for (local201 = 0; local201 < Static171.aClass6_Sub2_Sub1_Sub1Array1.length; local201++) {
								if (Static171.aClass6_Sub2_Sub1_Sub1Array1[local201] != null) {
									Static171.aClass6_Sub2_Sub1_Sub1Array1[local201].anInt6068 = -1;
								}
							}
							for (local70 = 0; local70 < Static176.aClass6_Sub2_Sub1_Sub2Array1.length; local70++) {
								if (Static176.aClass6_Sub2_Sub1_Sub2Array1[local70] != null) {
									Static176.aClass6_Sub2_Sub1_Sub2Array1[local70].anInt6068 = -1;
								}
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static65.aClass186_45) {
							Static366.method5053(Static266.aClass217_25);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static9.aClass186_12) {
							local201 = Static349.aClass4_Sub30_Sub1_2.method4852();
							local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
							local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
							if (Static220.method4267(local70)) {
								Static18.method426(local783, local201);
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static25.aClass186_21 == Static375.aClass186_176) {
							Static261.method3572();
							Static375.aClass186_176 = null;
							return false;
						} else if (Static375.aClass186_176 == Static254.aClass186_151) {
							Static366.method5053(Static348.aClass217_34);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static46.aClass186_177 == Static375.aClass186_176) {
							Static290.anInt5240 = Static349.aClass4_Sub30_Sub1_2.method4829();
							Static54.anInt7605 = Static349.aClass4_Sub30_Sub1_2.method4866() << 3;
							Static111.anInt6481 = Static349.aClass4_Sub30_Sub1_2.method4876() << 3;
							for (@Pc(2789) Class4_Sub20 local2789 = (Class4_Sub20) Static437.aClass196_41.method4482(); local2789 != null; local2789 = (Class4_Sub20) Static437.aClass196_41.method4472()) {
								local70 = (int) (local2789.aLong225 & 0x3FFFL);
								local216 = (int) (local2789.aLong225 >> 14 & 0x3FFFL);
								local220 = (int) (local2789.aLong225 >> 28 & 0x3L);
								if (Static290.anInt5240 == local220 && Static111.anInt6481 <= local70 && Static111.anInt6481 + 8 > local70 && local216 >= Static54.anInt7605 && Static54.anInt7605 + 8 > local216) {
									local2789.method5854();
									Static387.method5232(Static290.anInt5240, local70, local216);
								}
							}
							for (@Pc(2856) Class4_Sub36 local2856 = (Class4_Sub36) Static193.aClass258_48.method5538(); local2856 != null; local2856 = (Class4_Sub36) Static193.aClass258_48.method5528()) {
								if (Static111.anInt6481 <= local2856.anInt6026 && Static111.anInt6481 + 8 > local2856.anInt6026 && local2856.anInt6039 >= Static54.anInt7605 && local2856.anInt6039 < Static54.anInt7605 + 8 && Static290.anInt5240 == local2856.anInt6038) {
									local2856.anInt6029 = 0;
								}
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static412.aClass186_246) {
							local201 = Static349.aClass4_Sub30_Sub1_2.method4882();
							local70 = Static349.aClass4_Sub30_Sub1_2.method4882();
							local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
							local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
							if (local220 == 65535) {
								local220 = -1;
							}
							if (local70 >= 1 && local70 <= 8) {
								if (local783.equalsIgnoreCase("null")) {
									local783 = null;
								}
								Static136.aStringArray16[local70 - 1] = local783;
								Static291.anIntArray453[local70 - 1] = local220;
								Static130.aBooleanArray8[local70 - 1] = local201 == 0;
							}
							Static375.aClass186_176 = null;
							return true;
						} else if (Static375.aClass186_176 == Static129.aClass186_77) {
							Static366.method5053(Static17.aClass217_4);
							Static375.aClass186_176 = null;
							return true;
						} else if (Static215.aClass186_255 == Static375.aClass186_176) {
							Static58.method3287(Static89.aClass114_3, Static106.anInt2242, Static349.aClass4_Sub30_Sub1_2);
							Static375.aClass186_176 = null;
							return true;
						} else {
							@Pc(3037) Class4_Sub4 local3037;
							if (Static309.aClass186_184 == Static375.aClass186_176) {
								local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
								local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
								local216 = Static349.aClass4_Sub30_Sub1_2.method4872();
								local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
								if (Static220.method4267(local220)) {
									local3037 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local216);
									if (local3037 != null) {
										Static219.method3100(false, local3037, local201 != local3037.anInt573);
									}
									Static451.method5798(local70, local201, false, local216);
								}
								Static375.aClass186_176 = null;
								return true;
							} else if (Static33.aClass186_29 == Static375.aClass186_176) {
								local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
								if (Static220.method4267(local201)) {
									Static26.method529();
								}
								Static375.aClass186_176 = null;
								return true;
							} else if (Static18.aClass186_15 == Static375.aClass186_176) {
								Static366.method5053(Static285.aClass217_27);
								Static375.aClass186_176 = null;
								return true;
							} else {
								@Pc(3107) String local3107;
								@Pc(3105) String local3105;
								if (Static375.aClass186_176 == Static422.aClass186_253) {
									local201 = Static349.aClass4_Sub30_Sub1_2.method4844();
									local70 = Static349.aClass4_Sub30_Sub1_2.method4872();
									local216 = Static349.aClass4_Sub30_Sub1_2.method4864();
									local3105 = "";
									local3107 = local3105;
									if ((local216 & 0x1) != 0) {
										local3105 = Static349.aClass4_Sub30_Sub1_2.method4867();
										if ((local216 & 0x2) == 0) {
											local3107 = local3105;
										} else {
											local3107 = Static349.aClass4_Sub30_Sub1_2.method4867();
										}
									}
									local1646 = Static349.aClass4_Sub30_Sub1_2.method4867();
									if (local201 == 99) {
										Static267.method3631(local1646);
									} else if (local3107.equals("") || !Static367.method5077(local3107)) {
										Static262.method3576(local1646, local3107, local201, local70, local3105);
									} else {
										Static375.aClass186_176 = null;
										return true;
									}
									Static375.aClass186_176 = null;
									return true;
								} else if (Static400.aClass186_233 == Static375.aClass186_176) {
									local201 = Static349.aClass4_Sub30_Sub1_2.method4856();
									if (local201 == 65535) {
										local201 = -1;
									}
									local70 = Static349.aClass4_Sub30_Sub1_2.method4882();
									local216 = Static349.aClass4_Sub30_Sub1_2.method4882();
									Static187.method2764(local201, local70, local216);
									Static375.aClass186_176 = null;
									return true;
								} else if (Static375.aClass186_176 == Static118.aClass186_71) {
									local201 = Static349.aClass4_Sub30_Sub1_2.method4854();
									local70 = Static349.aClass4_Sub30_Sub1_2.method4868();
									local216 = Static349.aClass4_Sub30_Sub1_2.method4877();
									if (local216 == 65535) {
										local216 = -1;
									}
									Static323.method4439(local70, local216, local201);
									Static375.aClass186_176 = null;
									return true;
								} else if (Static375.aClass186_176 == Static321.aClass186_191) {
									local201 = Static349.aClass4_Sub30_Sub1_2.method4864();
									if (Static349.aClass4_Sub30_Sub1_2.method4864() == 0) {
										Static377.aClass143Array1[local201] = new Class143();
									} else {
										Static349.aClass4_Sub30_Sub1_2.anInt6244--;
										Static377.aClass143Array1[local201] = new Class143(Static349.aClass4_Sub30_Sub1_2);
									}
									Static375.aClass186_176 = null;
									Static162.anInt6354 = Static190.anInt3670;
									return true;
								} else if (Static355.aClass186_213 == Static375.aClass186_176) {
									local201 = Static349.aClass4_Sub30_Sub1_2.method4880();
									@Pc(3278) byte local3278 = Static349.aClass4_Sub30_Sub1_2.method4876();
									Static155.aClass149_1.method3215(local201, local3278);
									Static375.aClass186_176 = null;
									return true;
								} else if (Static375.aClass186_176 == Static384.aClass186_205) {
									local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
									local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
									local783 = local294;
									if (local570) {
										local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
									}
									local919 = Static349.aClass4_Sub30_Sub1_2.method4853();
									local924 = Static349.aClass4_Sub30_Sub1_2.method4877();
									local2102 = Static349.aClass4_Sub30_Sub1_2.method4887();
									local360 = Static349.aClass4_Sub30_Sub1_2.method4864();
									@Pc(3335) long local3335 = local2102 + (local924 << 32);
									@Pc(3337) boolean local3337 = false;
									@Pc(3339) int local3339 = 0;
									while (true) {
										if (local3339 >= 100) {
											if (local360 <= 1) {
												if (Static386.aBoolean448 && !Static146.aBoolean200 || Static444.aBoolean494) {
													local3337 = true;
												} else if (Static367.method5077(local783)) {
													local3337 = true;
												}
											}
											break;
										}
										if (local3335 == Static57.aLongArray2[local3339]) {
											local3337 = true;
											break;
										}
										local3339++;
									}
									if (!local3337 && Static339.anInt5973 == 0) {
										Static57.aLongArray2[Static174.anInt3239] = local3335;
										Static174.anInt3239 = (Static174.anInt3239 + 1) % 100;
										@Pc(3398) String local3398 = Static257.method3525(Static92.method1505(Static349.aClass4_Sub30_Sub1_2));
										if (local360 == 2 || local360 == 3) {
											Static313.method4325(local3398, -1, 0, "<img=1>" + local783, "<img=1>" + local294, Static128.method1909(local919), 9);
										} else if (local360 == 1) {
											Static313.method4325(local3398, -1, 0, "<img=0>" + local783, "<img=0>" + local294, Static128.method1909(local919), 9);
										} else {
											Static313.method4325(local3398, -1, 0, local783, local294, Static128.method1909(local919), 9);
										}
									}
									Static375.aClass186_176 = null;
									return true;
								} else if (Static375.aClass186_176 == Static420.aClass186_273) {
									local201 = Static349.aClass4_Sub30_Sub1_2.method4888();
									local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
									Static155.aClass149_1.method3217(local70, local201);
									Static375.aClass186_176 = null;
									return true;
								} else if (Static358.aClass186_217 == Static375.aClass186_176) {
									local201 = Static349.aClass4_Sub30_Sub1_2.method4856();
									local70 = Static349.aClass4_Sub30_Sub1_2.method4872();
									if (Static220.method4267(local201)) {
										Static156.method2328(local70, 3, -1, -1);
									}
									Static375.aClass186_176 = null;
									return true;
								} else {
									@Pc(3568) long local3568;
									@Pc(3574) Class4_Sub34 local3574;
									@Pc(3583) Class4_Sub34 local3583;
									if (Static375.aClass186_176 == Static358.aClass186_215) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4852();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4880();
										if (local70 == 65535) {
											local70 = -1;
										}
										local216 = Static349.aClass4_Sub30_Sub1_2.method4837();
										local220 = Static349.aClass4_Sub30_Sub1_2.method4837();
										local797 = Static349.aClass4_Sub30_Sub1_2.method4852();
										if (local797 == 65535) {
											local797 = -1;
										}
										if (Static220.method4267(local201)) {
											for (local606 = local70; local606 <= local797; local606++) {
												local3568 = (long) local606 + ((long) local220 << 32);
												local3574 = (Class4_Sub34) Static385.aClass196_32.method4477(local3568);
												if (local3574 != null) {
													local3583 = new Class4_Sub34(local216, local3574.anInt5773);
													local3574.method5854();
												} else if (local606 == -1) {
													local3583 = new Class4_Sub34(local216, Static53.method1056(local220).aClass4_Sub34_1.anInt5773);
												} else {
													local3583 = new Class4_Sub34(local216, -1);
												}
												Static385.aClass196_32.method4474(local3568, local3583);
											}
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static210.aClass186_126) {
										Static421.anInt7104 = Static349.aClass4_Sub30_Sub1_2.method4864();
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static70.aClass186_265) {
										Static422.anInt7120 = Static349.aClass4_Sub30_Sub1_2.method4864();
										for (local201 = 0; local201 < Static422.anInt7120; local201++) {
											Static71.aStringArray9[local201] = Static349.aClass4_Sub30_Sub1_2.method4867();
											Static317.aStringArray34[local201] = Static349.aClass4_Sub30_Sub1_2.method4867();
											if (Static317.aStringArray34[local201].equals("")) {
												Static317.aStringArray34[local201] = Static71.aStringArray9[local201];
											}
											Static447.aStringArray44[local201] = Static349.aClass4_Sub30_Sub1_2.method4867();
											Static252.aStringArray15[local201] = Static349.aClass4_Sub30_Sub1_2.method4867();
											if (Static252.aStringArray15[local201].equals("")) {
												Static252.aStringArray15[local201] = Static447.aStringArray44[local201];
											}
											Static93.aBooleanArray7[local201] = false;
										}
										Static375.aClass186_176 = null;
										Static35.anInt830 = Static190.anInt3670;
										return true;
									} else if (Static375.aClass186_176 == Static325.aClass186_195) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4852();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4854();
										@Pc(3730) Class6_Sub2_Sub1_Sub2 local3730 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local201];
										if (local3730 != null) {
											Static277.method3729(local216, local3730, local70);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static165.aClass186_100) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4864();
										@Pc(3759) boolean local3759 = (local201 & 0x1) == 1;
										local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
										local3105 = Static349.aClass4_Sub30_Sub1_2.method4867();
										if (local3105.equals("")) {
											local3105 = local783;
										}
										local3107 = Static349.aClass4_Sub30_Sub1_2.method4867();
										local1646 = Static349.aClass4_Sub30_Sub1_2.method4867();
										if (local1646.equals("")) {
											local1646 = local3107;
										}
										if (local3759) {
											for (local467 = 0; local467 < Static422.anInt7120; local467++) {
												if (Static317.aStringArray34[local467].equals(local1646)) {
													Static71.aStringArray9[local467] = local783;
													Static317.aStringArray34[local467] = local3105;
													Static447.aStringArray44[local467] = local3107;
													Static252.aStringArray15[local467] = local1646;
													break;
												}
											}
										} else {
											Static71.aStringArray9[Static422.anInt7120] = local783;
											Static317.aStringArray34[Static422.anInt7120] = local3105;
											Static447.aStringArray44[Static422.anInt7120] = local3107;
											Static252.aStringArray15[Static422.anInt7120] = local1646;
											Static93.aBooleanArray7[Static422.anInt7120] = (local201 & 0x2) == 2;
											Static422.anInt7120++;
										}
										Static375.aClass186_176 = null;
										Static35.anInt830 = Static190.anInt3670;
										return true;
									} else if (Static375.aClass186_176 == Static441.aClass186_170) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4837();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4886();
										local220 = Static349.aClass4_Sub30_Sub1_2.method4852();
										if (Static220.method4267(local70)) {
											Static156.method2328(local201, 5, local220, local216);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static310.aClass186_187 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4856();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4877();
										if (Static220.method4267(local70)) {
											Static398.method5292(local216, local201);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static419.aClass186_251 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
										@Pc(3942) byte local3942 = Static349.aClass4_Sub30_Sub1_2.method4876();
										if (Static220.method4267(local70)) {
											Static408.method5379(local3942, local201);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static138.aClass186_81) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4856();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
										if (local70 == 65535) {
											local70 = -1;
										}
										local216 = Static349.aClass4_Sub30_Sub1_2.method4886();
										if (Static220.method4267(local201)) {
											Static156.method2328(local216, 1, local70, -1);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static409.aClass186_241) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4852();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4888();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4880();
										if (Static220.method4267(local216)) {
											Static28.method535(local201, local70);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static265.aClass186_109 == Static375.aClass186_176) {
										Static54.anInt7605 = Static349.aClass4_Sub30_Sub1_2.method4879() << 3;
										Static290.anInt5240 = Static349.aClass4_Sub30_Sub1_2.method4882();
										Static111.anInt6481 = Static349.aClass4_Sub30_Sub1_2.method4866() << 3;
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static44.aClass186_34) {
										Static208.aClass49_4 = Static369.method5082(Static349.aClass4_Sub30_Sub1_2.method4864());
										Static375.aClass186_176 = null;
										return true;
									} else if (Static142.aClass186_83 == Static375.aClass186_176) {
										if (Static269.aFrame1 != null) {
											Static352.method4941(-1, -1, Static126.aClass67_Sub1_1.anInt5863, false);
										}
										@Pc(4071) byte[] local4071 = new byte[Static106.anInt2242];
										Static349.aClass4_Sub30_Sub1_2.method3921(local4071, Static106.anInt2242);
										local294 = Static166.method2458(local4071, 0, Static106.anInt2242);
										Static145.method2120(true, Static89.aClass114_3, Static286.anInt5207 == 1, local294);
										Static375.aClass186_176 = null;
										return true;
									} else if (Static430.aClass186_256 == Static375.aClass186_176) {
										Static349.aClass4_Sub30_Sub1_2.anInt6244 += 28;
										if (Static349.aClass4_Sub30_Sub1_2.method4841()) {
											Static431.method5531(Static349.aClass4_Sub30_Sub1_2.anInt6244 - 28, Static349.aClass4_Sub30_Sub1_2);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static215.aClass186_254 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4880();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4882();
										if (Static220.method4267(local70)) {
											if (local216 == 2) {
												Static34.method634();
											}
											Static404.anInt6892 = local201;
											Static299.method4152(local201);
											Static21.method451(false);
											Static172.method2505(Static404.anInt6892);
											for (local220 = 0; local220 < 100; local220++) {
												Static26.aBooleanArray2[local220] = true;
											}
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static139.aClass186_82) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4886();
										local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4880();
										if (Static220.method4267(local216)) {
											Static129.method1922(local294, local201);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static208.aClass186_125 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4886();
										Static155.aClass149_1.method3215(local201, local70);
										Static375.aClass186_176 = null;
										return true;
									} else if (Static377.aClass186_225 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4852();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4872();
										if (Static220.method4267(local201)) {
											Static181.method2910(local70, local216);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static223.aClass186_134 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4888();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4837();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4880();
										if (Static220.method4267(local216)) {
											@Pc(4272) Class4_Sub4 local4272 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local201);
											local3037 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local70);
											if (local3037 != null) {
												Static219.method3100(false, local3037, local4272 == null || local3037.anInt573 != local4272.anInt573);
											}
											if (local4272 != null) {
												local4272.method5854();
												Static391.aClass196_37.method4474((long) local70, local4272);
											}
											@Pc(4314) Class126 local4314 = Static53.method1056(local201);
											if (local4314 != null) {
												Static430.method5524(local4314);
											}
											local4314 = Static53.method1056(local70);
											if (local4314 != null) {
												Static430.method5524(local4314);
												Static114.method1812(local4314, true);
											}
											if (Static404.anInt6892 != -1) {
												Static99.method4522(Static404.anInt6892, 1);
											}
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static203.aClass186_123) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4872();
										Static421.aClass108_9 = Static89.aClass114_3.method2367(local201);
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static196.aClass186_115) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4872();
										if (Static220.method4267(local201)) {
											@Pc(4382) Class4_Sub4 local4382 = (Class4_Sub4) Static391.aClass196_37.method4477((long) local70);
											if (local4382 != null) {
												Static219.method3100(false, local4382, true);
											}
											if (Static454.aClass126_17 != null) {
												Static430.method5524(Static454.aClass126_17);
												Static454.aClass126_17 = null;
											}
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static287.aClass186_173 == Static375.aClass186_176) {
										Static366.method5053(Static289.aClass217_29);
										Static375.aClass186_176 = null;
										return true;
									} else if (Static377.aClass186_224 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4856();
										if (local201 == 65535) {
											local201 = -1;
										}
										local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
										local216 = local70 >> 2;
										local220 = local70 & 0x3;
										local797 = Static76.anIntArray111[local216];
										local606 = Static349.aClass4_Sub30_Sub1_2.method4888();
										local467 = local606 >> 28 & 0x3;
										local928 = local606 >> 14 & 0x3FFF;
										local350 = local606 & 0x3FFF;
										local928 -= Static381.anInt6688;
										local350 -= Static285.anInt5187;
										Static403.method5329(local928, local216, local797, local220, local467, local201, local350);
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static71.aClass186_53) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4886();
										local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local797 = Static349.aClass4_Sub30_Sub1_2.method4877();
										if (Static220.method4267(local70)) {
											Static156.method2328(local216, 7, local220 | local201 << 16, local797);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static25.aClass186_23) {
										Static155.aClass149_1.method3214();
										Static124.anInt2537 += 32;
										Static375.aClass186_176 = null;
										return true;
									} else if (Static88.aClass186_59 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										if (local201 == 65535) {
											local201 = -1;
										}
										local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
										if (local70 == 65535) {
											local70 = -1;
										}
										local216 = Static349.aClass4_Sub30_Sub1_2.method4856();
										local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local797 = Static349.aClass4_Sub30_Sub1_2.method4888();
										if (Static220.method4267(local216)) {
											for (local606 = local70; local606 <= local201; local606++) {
												local3568 = ((long) local797 << 32) + ((long) local606);
												local3574 = (Class4_Sub34) Static385.aClass196_32.method4477(local3568);
												if (local3574 != null) {
													local3583 = new Class4_Sub34(local3574.anInt5771, local220);
													local3574.method5854();
												} else if (local606 == -1) {
													local3583 = new Class4_Sub34(Static53.method1056(local797).aClass4_Sub34_1.anInt5771, local220);
												} else {
													local3583 = new Class4_Sub34(0, local220);
												}
												Static385.aClass196_32.method4474(local3568, local3583);
											}
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static253.aClass186_149) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4864();
										local220 = Static349.aClass4_Sub30_Sub1_2.method4864();
										local797 = Static349.aClass4_Sub30_Sub1_2.method4864();
										local606 = Static349.aClass4_Sub30_Sub1_2.method4877();
										if (Static220.method4267(local201)) {
											Static293.aBooleanArray21[local70] = true;
											Static411.anIntArray619[local70] = local216;
											Static418.anIntArray625[local70] = local220;
											Static98.anIntArray131[local70] = local797;
											Static313.anIntArray484[local70] = local606;
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static133.aClass186_79 == Static375.aClass186_176) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4852();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4872();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4856();
										local220 = Static349.aClass4_Sub30_Sub1_2.method4856();
										local797 = Static349.aClass4_Sub30_Sub1_2.method4856();
										if (Static220.method4267(local216)) {
											Static210.method2991(local70, local797, local201, local220);
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static329.aClass186_196) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										if (Static220.method4267(local201)) {
											Static280.method3737();
										}
										Static375.aClass186_176 = null;
										return true;
									} else if (Static375.aClass186_176 == Static48.aClass186_37) {
										local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
										local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
										local216 = Static349.aClass4_Sub30_Sub1_2.method4864();
										local220 = Static349.aClass4_Sub30_Sub1_2.method4877() << 0;
										local797 = Static349.aClass4_Sub30_Sub1_2.method4864();
										local606 = Static349.aClass4_Sub30_Sub1_2.method4864();
										if (Static220.method4267(local201)) {
											Static363.method5031(local70, local220, local216, local606, local797);
										}
										Static375.aClass186_176 = null;
										return true;
									} else {
										@Pc(4861) boolean local4861;
										if (Static375.aClass186_176 == Static444.aClass186_268) {
											local201 = Static349.aClass4_Sub30_Sub1_2.method4856();
											local70 = Static349.aClass4_Sub30_Sub1_2.method4877();
											local216 = Static349.aClass4_Sub30_Sub1_2.method4852();
											local220 = Static349.aClass4_Sub30_Sub1_2.method4872();
											local797 = Static349.aClass4_Sub30_Sub1_2.method4882();
											local308 = (local797 & 0x80) != 0;
											if (local220 >> 30 == 0) {
												@Pc(4884) Class161 local4884;
												@Pc(4941) Class233 local4941;
												@Pc(4910) Class233 local4910;
												@Pc(4889) Class161 local4889;
												@Pc(4904) Class233 local4904;
												if (local220 >> 29 != 0) {
													local467 = local220 & 0xFFFF;
													@Pc(4850) Class6_Sub2_Sub1_Sub2 local4850 = Static176.aClass6_Sub2_Sub1_Sub2Array1[local467];
													if (local4850 != null) {
														if (local70 == 65535) {
															local70 = -1;
														}
														local4861 = true;
														local360 = local308 ? local4850.anInt6084 : local4850.anInt6120;
														if (local70 != -1 && local360 != -1) {
															if (local360 == local70) {
																local4884 = Static92.aClass89_1.method1918(local70);
																if (local4884.aBoolean340 && local4884.anInt4699 != -1) {
																	local4941 = Static269.aClass10_1.method286(local4884.anInt4699);
																	local943 = local4941.anInt6742;
																	if (local943 == 0 || local943 == 2) {
																		local4861 = false;
																	} else if (local943 == 1) {
																		local4861 = true;
																	}
																}
															} else {
																local4884 = Static92.aClass89_1.method1918(local70);
																local4889 = Static92.aClass89_1.method1918(local360);
																if (local4884.anInt4699 != -1 && local4889.anInt4699 != -1) {
																	local4904 = Static269.aClass10_1.method286(local4884.anInt4699);
																	local4910 = Static269.aClass10_1.method286(local4889.anInt4699);
																	if (local4904.anInt6754 < local4910.anInt6754) {
																		local4861 = false;
																	}
																}
															}
														}
														if (local4861) {
															if (local308) {
																local4850.anInt6098 = local201 + Static175.anInt3261;
																local4850.anInt6100 = 1;
																local4850.anInt6069 = local797 & 0x7;
																local4850.anInt6125 = local216;
																local4850.anInt6084 = local70;
																local4850.anInt6124 = 0;
																local4850.anInt6128 = 0;
																if (Static175.anInt3261 < local4850.anInt6098) {
																	local4850.anInt6124 = -1;
																}
																if (local4850.anInt6084 != -1 && local4850.anInt6098 == Static175.anInt3261) {
																	local2110 = Static92.aClass89_1.method1918(local4850.anInt6084).anInt4699;
																	if (local2110 != -1) {
																		local4941 = Static269.aClass10_1.method286(local2110);
																		if (local4941 != null && local4941.anIntArray593 != null) {
																			Static374.method5106(false, 0, local4850.aByte86, local4941, local4850.anInt6062, local4850.anInt6061);
																		}
																	}
																}
															} else {
																local4850.anInt6118 = 1;
																local4850.anInt6135 = 0;
																local4850.anInt6112 = local201 + Static175.anInt3261;
																local4850.anInt6083 = local797 & 0x7;
																local4850.anInt6085 = local216;
																local4850.anInt6082 = 0;
																local4850.anInt6120 = local70;
																if (Static175.anInt3261 < local4850.anInt6112) {
																	local4850.anInt6082 = -1;
																}
																if (local4850.anInt6120 != -1 && local4850.anInt6112 == Static175.anInt3261) {
																	local2110 = Static92.aClass89_1.method1918(local4850.anInt6120).anInt4699;
																	if (local2110 != -1) {
																		local4941 = Static269.aClass10_1.method286(local2110);
																		if (local4941 != null && local4941.anIntArray593 != null) {
																			Static374.method5106(false, 0, local4850.aByte86, local4941, local4850.anInt6062, local4850.anInt6061);
																		}
																	}
																}
															}
														}
													}
												} else if (local220 >> 28 != 0) {
													local467 = local220 & 0xFFFF;
													@Pc(5141) Class6_Sub2_Sub1_Sub1 local5141;
													if (local467 == Static373.anInt6574) {
														local5141 = Static375.aClass6_Sub2_Sub1_Sub1_3;
													} else {
														local5141 = Static171.aClass6_Sub2_Sub1_Sub1Array1[local467];
													}
													if (local5141 != null) {
														if (local70 == 65535) {
															local70 = -1;
														}
														local4861 = true;
														local360 = local308 ? local5141.anInt6084 : local5141.anInt6120;
														if (local70 != -1 && local360 != -1) {
															if (local360 == local70) {
																local4884 = Static92.aClass89_1.method1918(local70);
																if (local4884.aBoolean340 && local4884.anInt4699 != -1) {
																	local4941 = Static269.aClass10_1.method286(local4884.anInt4699);
																	local943 = local4941.anInt6742;
																	if (local943 == 0 || local943 == 2) {
																		local4861 = false;
																	} else if (local943 == 1) {
																		local4861 = true;
																	}
																}
															} else {
																local4884 = Static92.aClass89_1.method1918(local70);
																local4889 = Static92.aClass89_1.method1918(local360);
																if (local4884.anInt4699 != -1 && local4889.anInt4699 != -1) {
																	local4904 = Static269.aClass10_1.method286(local4884.anInt4699);
																	local4910 = Static269.aClass10_1.method286(local4889.anInt4699);
																	if (local4910.anInt6754 > local4904.anInt6754) {
																		local4861 = false;
																	}
																}
															}
														}
														if (local4861) {
															if (local308) {
																local5141.anInt6128 = 0;
																local5141.anInt6098 = Static175.anInt3261 + local201;
																local5141.anInt6084 = local70;
																local5141.anInt6124 = 0;
																local5141.anInt6069 = local797 & 0x7;
																local5141.anInt6100 = 1;
																local5141.anInt6125 = local216;
																if (local5141.anInt6084 == 65535) {
																	local5141.anInt6084 = -1;
																}
																if (local5141.anInt6098 > Static175.anInt3261) {
																	local5141.anInt6124 = -1;
																}
																if (local5141.anInt6084 != -1 && local5141.anInt6098 == Static175.anInt3261) {
																	local2110 = Static92.aClass89_1.method1918(local5141.anInt6084).anInt4699;
																	if (local2110 != -1) {
																		local4941 = Static269.aClass10_1.method286(local2110);
																		if (local4941 != null && local4941.anIntArray593 != null) {
																			Static374.method5106(local5141 == Static375.aClass6_Sub2_Sub1_Sub1_3, 0, local5141.aByte86, local4941, local5141.anInt6062, local5141.anInt6061);
																		}
																	}
																}
															} else {
																local5141.anInt6082 = 0;
																local5141.anInt6083 = local797 & 0x7;
																local5141.anInt6120 = local70;
																local5141.anInt6135 = 0;
																local5141.anInt6118 = 1;
																local5141.anInt6085 = local216;
																local5141.anInt6112 = Static175.anInt3261 + local201;
																if (local5141.anInt6120 == 65535) {
																	local5141.anInt6120 = -1;
																}
																if (local5141.anInt6112 > Static175.anInt3261) {
																	local5141.anInt6082 = -1;
																}
																if (local5141.anInt6120 != -1 && local5141.anInt6112 == Static175.anInt3261) {
																	local2110 = Static92.aClass89_1.method1918(local5141.anInt6120).anInt4699;
																	if (local2110 != -1) {
																		local4941 = Static269.aClass10_1.method286(local2110);
																		if (local4941 != null && local4941.anIntArray593 != null) {
																			Static374.method5106(local5141 == Static375.aClass6_Sub2_Sub1_Sub1_3, 0, local5141.aByte86, local4941, local5141.anInt6062, local5141.anInt6061);
																		}
																	}
																}
															}
														}
													}
												}
											} else {
												local467 = local220 >> 28 & 0x3;
												local928 = (local220 >> 14 & 0x3FFF) - Static381.anInt6688;
												local350 = (local220 & 0x3FFF) - Static285.anInt5187;
												if (local928 >= 0 && local350 >= 0 && local928 < Static126.anInt2569 && Static190.anInt3697 > local350) {
													local360 = local928 * 128 + 64;
													local2110 = local350 * 128 + 64;
													local1256 = local467;
													if (local467 < 3 && Static317.method4378(local350, local928)) {
														local1256 = local467 + 1;
													}
													@Pc(5534) Class6_Sub2_Sub4 local5534 = new Class6_Sub2_Sub4(local70, 0, Static175.anInt3261, local467, local1256, local360, Static222.method3109(local360, local467, local2110) - local216, local2110, local928, local928, local350, local350, local797);
													Static198.aClass258_30.method5526(new Class4_Sub1_Sub9(local5534));
												}
											}
											Static375.aClass186_176 = null;
											return true;
										} else if (Static255.aClass186_153 == Static375.aClass186_176) {
											Static171.anInt3177 = 1;
											Static375.aClass186_176 = null;
											Static35.anInt830 = Static190.anInt3670;
											return true;
										} else if (Static364.aClass186_220 == Static375.aClass186_176) {
											local201 = Static349.aClass4_Sub30_Sub1_2.method4877();
											if (local201 == 65535) {
												local201 = -1;
											}
											local70 = Static349.aClass4_Sub30_Sub1_2.method4864();
											local216 = Static349.aClass4_Sub30_Sub1_2.method4877();
											local220 = Static349.aClass4_Sub30_Sub1_2.method4864();
											Static350.method4918(local70, local220, local216, local201);
											Static375.aClass186_176 = null;
											return true;
										} else if (Static153.aClass186_90 == Static375.aClass186_176) {
											local201 = Static349.aClass4_Sub30_Sub1_2.method4872();
											local70 = Static349.aClass4_Sub30_Sub1_2.method4880();
											if (Static220.method4267(local70)) {
												Static156.method2328(local201, 5, Static373.anInt6574, 0);
											}
											Static375.aClass186_176 = null;
											return true;
										} else if (Static106.aClass186_65 == Static375.aClass186_176) {
											Static366.method5053(Static440.aClass217_40);
											Static375.aClass186_176 = null;
											return true;
										} else if (Static118.aClass186_72 == Static375.aClass186_176) {
											local201 = Static349.aClass4_Sub30_Sub1_2.method4880();
											local70 = Static349.aClass4_Sub30_Sub1_2.method4856();
											local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
											if (Static220.method4267(local70)) {
												Static18.method426(local783, local201);
											}
											Static375.aClass186_176 = null;
											return true;
										} else if (Static414.aClass186_247 == Static375.aClass186_176) {
											Static366.method5053(Static68.aClass217_21);
											Static375.aClass186_176 = null;
											return true;
										} else if (Static21.aClass186_17 == Static375.aClass186_176) {
											Static163.method2392();
											Static375.aClass186_176 = null;
											return false;
										} else if (Static342.aClass186_203 == Static375.aClass186_176) {
											while (Static349.aClass4_Sub30_Sub1_2.anInt6244 < Static106.anInt2242) {
												local570 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
												local294 = Static349.aClass4_Sub30_Sub1_2.method4867();
												local783 = Static349.aClass4_Sub30_Sub1_2.method4867();
												local220 = Static349.aClass4_Sub30_Sub1_2.method4877();
												local797 = Static349.aClass4_Sub30_Sub1_2.method4864();
												local1646 = "";
												local706 = false;
												if (local220 > 0) {
													local1646 = Static349.aClass4_Sub30_Sub1_2.method4867();
													local706 = Static349.aClass4_Sub30_Sub1_2.method4864() == 1;
												}
												for (local928 = 0; local928 < Static22.anInt6850; local928++) {
													if (local570) {
														if (local783.equals(Static291.aStringArray33[local928])) {
															Static291.aStringArray33[local928] = local294;
															Static58.aStringArray28[local928] = local783;
															local294 = null;
															break;
														}
													} else if (local294.equals(Static291.aStringArray33[local928])) {
														if (local220 != Static265.anIntArray275[local928]) {
															Static265.anIntArray275[local928] = local220;
															if (local220 > 0) {
																Static262.method3576(local294 + Static207.aClass242_52.method5320(Static139.anInt2670), "", 5, 0, "");
															}
															if (local220 == 0) {
																Static262.method3576(local294 + Static224.aClass242_59.method5320(Static139.anInt2670), "", 5, 0, "");
															}
														}
														Static58.aStringArray28[local928] = local783;
														Static10.aStringArray1[local928] = local1646;
														Static90.anIntArray122[local928] = local797;
														Static6.aBooleanArray1[local928] = local706;
														local294 = null;
														break;
													}
												}
												if (local294 != null && Static22.anInt6850 < 200) {
													Static291.aStringArray33[Static22.anInt6850] = local294;
													Static58.aStringArray28[Static22.anInt6850] = local783;
													Static265.anIntArray275[Static22.anInt6850] = local220;
													Static10.aStringArray1[Static22.anInt6850] = local1646;
													Static90.anIntArray122[Static22.anInt6850] = local797;
													Static6.aBooleanArray1[Static22.anInt6850] = local706;
													Static22.anInt6850++;
												}
											}
											Static171.anInt3177 = 2;
											Static35.anInt830 = Static190.anInt3670;
											local70 = Static22.anInt6850;
											while (local70 > 0) {
												local70--;
												local570 = true;
												for (local216 = 0; local216 < local70; local216++) {
													if (Static83.anInt1889 != Static265.anIntArray275[local216] && Static265.anIntArray275[local216 + 1] == Static83.anInt1889 || Static265.anIntArray275[local216] == 0 && Static265.anIntArray275[local216 + 1] != 0) {
														local220 = Static265.anIntArray275[local216];
														Static265.anIntArray275[local216] = Static265.anIntArray275[local216 + 1];
														Static265.anIntArray275[local216 + 1] = local220;
														local3107 = Static10.aStringArray1[local216];
														Static10.aStringArray1[local216] = Static10.aStringArray1[local216 + 1];
														Static10.aStringArray1[local216 + 1] = local3107;
														local1646 = Static291.aStringArray33[local216];
														Static291.aStringArray33[local216] = Static291.aStringArray33[local216 + 1];
														Static291.aStringArray33[local216 + 1] = local1646;
														local321 = Static58.aStringArray28[local216];
														Static58.aStringArray28[local216] = Static58.aStringArray28[local216 + 1];
														Static58.aStringArray28[local216 + 1] = local321;
														local928 = Static90.anIntArray122[local216];
														Static90.anIntArray122[local216] = Static90.anIntArray122[local216 + 1];
														Static90.anIntArray122[local216 + 1] = local928;
														local4861 = Static6.aBooleanArray1[local216];
														Static6.aBooleanArray1[local216] = Static6.aBooleanArray1[local216 + 1];
														Static6.aBooleanArray1[local216 + 1] = local4861;
														local570 = false;
													}
												}
												if (local570) {
													break;
												}
											}
											Static375.aClass186_176 = null;
											return true;
										} else if (Static375.aClass186_176 == Static251.aClass186_147) {
											local201 = Static349.aClass4_Sub30_Sub1_2.method4864();
											local70 = local201 >> 5;
											local216 = local201 & 0x1F;
											if (local216 == 0) {
												Static118.aClass80Array1[local70] = null;
												Static375.aClass186_176 = null;
												return true;
											}
											@Pc(6069) Class80 local6069 = new Class80();
											local6069.anInt2470 = local216;
											local6069.anInt2468 = Static349.aClass4_Sub30_Sub1_2.method4864();
											if (local6069.anInt2468 >= 0 && local6069.anInt2468 < Static39.aClass3Array2.length) {
												if (local6069.anInt2470 == 1 || local6069.anInt2470 == 10) {
													local6069.anInt2465 = Static349.aClass4_Sub30_Sub1_2.method4877();
													Static349.aClass4_Sub30_Sub1_2.anInt6244 += 6;
												} else if (local6069.anInt2470 >= 2 && local6069.anInt2470 <= 6) {
													if (local6069.anInt2470 == 2) {
														local6069.anInt2467 = 64;
														local6069.anInt2463 = 64;
													}
													if (local6069.anInt2470 == 3) {
														local6069.anInt2463 = 0;
														local6069.anInt2467 = 64;
													}
													if (local6069.anInt2470 == 4) {
														local6069.anInt2467 = 64;
														local6069.anInt2463 = 128;
													}
													if (local6069.anInt2470 == 5) {
														local6069.anInt2467 = 0;
														local6069.anInt2463 = 64;
													}
													if (local6069.anInt2470 == 6) {
														local6069.anInt2463 = 64;
														local6069.anInt2467 = 128;
													}
													local6069.anInt2470 = 2;
													local6069.anInt2469 = Static349.aClass4_Sub30_Sub1_2.method4864();
													local6069.anInt2463 += Static349.aClass4_Sub30_Sub1_2.method4877() - Static381.anInt6688 << 7;
													local6069.anInt2467 += Static349.aClass4_Sub30_Sub1_2.method4877() - Static285.anInt5187 << 7;
													local6069.anInt2461 = Static349.aClass4_Sub30_Sub1_2.method4864();
													local6069.anInt2460 = Static349.aClass4_Sub30_Sub1_2.method4877();
												}
												local6069.anInt2462 = Static349.aClass4_Sub30_Sub1_2.method4877();
												if (local6069.anInt2462 == 65535) {
													local6069.anInt2462 = -1;
												}
												Static118.aClass80Array1[local70] = local6069;
											}
											Static375.aClass186_176 = null;
											return true;
										} else if (Static375.aClass186_176 == Static174.aClass186_105) {
											Static119.aString22 = Static106.anInt2242 > 2 ? Static349.aClass4_Sub30_Sub1_2.method4867() : Static288.aClass242_66.method5320(Static139.anInt2670);
											Static138.anInt2663 = Static106.anInt2242 <= 0 ? -1 : Static349.aClass4_Sub30_Sub1_2.method4877();
											if (Static138.anInt2663 == 65535) {
												Static138.anInt2663 = -1;
											}
											Static375.aClass186_176 = null;
											return true;
										} else if (Static203.aClass186_122 == Static375.aClass186_176) {
											Static99.method4517(Static349.aClass4_Sub30_Sub1_2.method4867());
											Static375.aClass186_176 = null;
											return true;
										} else {
											Static273.method3690("T1 - " + (Static375.aClass186_176 == null ? -1 : Static375.aClass186_176.method4177()) + "," + (Static430.aClass186_257 == null ? -1 : Static430.aClass186_257.method4177()) + "," + (Static404.aClass186_237 == null ? -1 : Static404.aClass186_237.method4177()) + " - " + Static106.anInt2242, null);
											Static246.method3390();
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

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(ZI)V")
	public static void method5628(@OriginalArg(0) boolean arg0) {
		for (@Pc(10) Class4_Sub44 local10 = (Class4_Sub44) Static177.aClass258_26.method5538(); local10 != null; local10 = (Class4_Sub44) Static177.aClass258_26.method5528()) {
			if (local10.aClass4_Sub18_Sub2_3 != null) {
				Static393.aClass4_Sub18_Sub1_1.method2789(local10.aClass4_Sub18_Sub2_3);
				local10.aClass4_Sub18_Sub2_3 = null;
			}
			if (local10.aClass4_Sub18_Sub2_2 != null) {
				Static393.aClass4_Sub18_Sub1_1.method2789(local10.aClass4_Sub18_Sub2_2);
				local10.aClass4_Sub18_Sub2_2 = null;
			}
			local10.method5854();
		}
		if (!arg0) {
			return;
		}
		for (@Pc(54) Class4_Sub44 local54 = (Class4_Sub44) Static208.aClass258_31.method5538(); local54 != null; local54 = (Class4_Sub44) Static208.aClass258_31.method5528()) {
			if (local54.aClass4_Sub18_Sub2_3 != null) {
				Static393.aClass4_Sub18_Sub1_1.method2789(local54.aClass4_Sub18_Sub2_3);
				local54.aClass4_Sub18_Sub2_3 = null;
			}
			local54.method5854();
		}
		for (@Pc(83) Class4_Sub44 local83 = (Class4_Sub44) Static279.aClass196_25.method4482(); local83 != null; local83 = (Class4_Sub44) Static279.aClass196_25.method4472()) {
			if (local83.aClass4_Sub18_Sub2_3 != null) {
				Static393.aClass4_Sub18_Sub1_1.method2789(local83.aClass4_Sub18_Sub2_3);
				local83.aClass4_Sub18_Sub2_3 = null;
			}
			local83.method5854();
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIIB)V")
	public static void method5629(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(3) int local3 = 0; local3 < Static180.anInt3352; local3++) {
			@Pc(9) Rectangle local9 = Class6_Sub4.aRectangleArray4[local3];
			if (local9.x + local9.width > arg3 && local9.x < arg3 + arg0 && local9.y + local9.height > arg1 && arg2 + arg1 > local9.y) {
				Static26.aBooleanArray2[local3] = true;
			}
		}
	}
}
