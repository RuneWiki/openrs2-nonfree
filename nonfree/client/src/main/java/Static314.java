import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static314 {

	@OriginalMember(owner = "client!mc", name = "J", descriptor = "Lclient!mo;")
	public static final Class221 aClass221_20 = new Class221(8);

	@OriginalMember(owner = "client!mc", name = "L", descriptor = "Z")
	public static boolean aBoolean433 = false;

	@OriginalMember(owner = "client!mc", name = "c", descriptor = "(I)Z")
	public static boolean method4959() throws IOException {
		if (Static528.aClass36_2 == null) {
			return false;
		}
		@Pc(75) int local75;
		if (Static100.aClass90_34 == null) {
			if (Static118.aBoolean208) {
				if (!Static528.aClass36_2.method1994(1)) {
					return false;
				}
				Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				Static118.aBoolean208 = false;
				Static74.anInt1906++;
				Static531.anInt9752 = 0;
			}
			Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
			if (Static549.aClass4_Sub13_Sub2_2.method7064()) {
				if (!Static528.aClass36_2.method1994(1)) {
					return false;
				}
				Static528.aClass36_2.method1995(1, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
				Static74.anInt1906++;
				Static531.anInt9752 = 0;
			}
			Static118.aBoolean208 = true;
			@Pc(71) Class90[] local71 = Static160.method2664();
			local75 = Static549.aClass4_Sub13_Sub2_2.method7056();
			if (local75 < 0 || local75 >= local71.length) {
				throw new IOException("invo:" + local75 + " ip:" + Static549.aClass4_Sub13_Sub2_2.anInt9170);
			}
			Static100.aClass90_34 = local71[local75];
			Static488.anInt9250 = Static100.aClass90_34.anInt2627;
		}
		if (Static488.anInt9250 == -1) {
			if (!Static528.aClass36_2.method1994(1)) {
				return false;
			}
			Static528.aClass36_2.method1995(0, 1, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
			Static531.anInt9752 = 0;
			Static74.anInt1906++;
			Static488.anInt9250 = Static549.aClass4_Sub13_Sub2_2.aByteArray88[0] & 0xFF;
		}
		if (Static488.anInt9250 == -2) {
			if (!Static528.aClass36_2.method1994(2)) {
				return false;
			}
			Static528.aClass36_2.method1995(0, 2, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
			Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
			Static488.anInt9250 = Static549.aClass4_Sub13_Sub2_2.method7054();
			Static74.anInt1906 += 2;
			Static531.anInt9752 = 0;
		}
		if (Static488.anInt9250 > 0) {
			if (!Static528.aClass36_2.method1994(Static488.anInt9250)) {
				return false;
			}
			Static549.aClass4_Sub13_Sub2_2.anInt9170 = 0;
			Static528.aClass36_2.method1995(0, Static488.anInt9250, Static549.aClass4_Sub13_Sub2_2.aByteArray88);
			Static531.anInt9752 = 0;
			Static74.anInt1906 += Static488.anInt9250;
		}
		Static79.aClass90_29 = Static528.aClass90_133;
		Static528.aClass90_133 = Static595.aClass90_154;
		Static595.aClass90_154 = Static100.aClass90_34;
		if (Static505.aClass90_132 == Static100.aClass90_34) {
			Static254.method4043(false);
			Static100.aClass90_34 = null;
			return false;
		}
		@Pc(221) int local221;
		if (Static378.aClass90_105 == Static100.aClass90_34) {
			local221 = Static549.aClass4_Sub13_Sub2_2.method7005();
			local75 = Static549.aClass4_Sub13_Sub2_2.method7009();
			if (local75 == 255) {
				local75 = -1;
				local221 = -1;
			}
			Static31.method983(local221, local75);
			Static100.aClass90_34 = null;
			return true;
		}
		@Pc(262) int local262;
		@Pc(266) int local266;
		@Pc(281) int local281;
		@Pc(270) int local270;
		@Pc(292) long local292;
		@Pc(312) Class4_Sub40 local312;
		@Pc(300) Class4_Sub40 local300;
		if (Static100.aClass90_34 == Static375.aClass90_103) {
			local221 = Static549.aClass4_Sub13_Sub2_2.method6989();
			local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
			if (local75 == 65535) {
				local75 = -1;
			}
			local262 = Static549.aClass4_Sub13_Sub2_2.method6995();
			local266 = Static549.aClass4_Sub13_Sub2_2.method7010();
			local270 = Static549.aClass4_Sub13_Sub2_2.method6995();
			if (local270 == 65535) {
				local270 = -1;
			}
			if (Static260.method4122(local262)) {
				for (local281 = local270; local281 <= local75; local281++) {
					local292 = ((long) local221 << 32) + ((long) local281);
					local300 = (Class4_Sub40) Static433.aClass221_29.method5075(local292);
					if (local300 != null) {
						local312 = new Class4_Sub40(local300.anInt8126, local266);
						local300.method8193();
					} else if (local281 == -1) {
						local312 = new Class4_Sub40(Static558.method7916(local221).aClass4_Sub40_2.anInt8126, local266);
					} else {
						local312 = new Class4_Sub40(0, local266);
					}
					Static433.aClass221_29.method5073(local312, local292);
				}
			}
			Static100.aClass90_34 = null;
			return true;
		} else if (Static100.aClass90_34 == Static6.aClass90_1) {
			Static188.method3089();
			Static100.aClass90_34 = null;
			return false;
		} else if (Static152.aClass90_53 == Static100.aClass90_34) {
			local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
			local75 = Static549.aClass4_Sub13_Sub2_2.method6989();
			local262 = Static549.aClass4_Sub13_Sub2_2.method7010();
			if (Static260.method4122(local262)) {
				Static97.method1897(local75, local221);
			}
			Static100.aClass90_34 = null;
			return true;
		} else if (Static15.aClass90_6 == Static100.aClass90_34) {
			local221 = Static549.aClass4_Sub13_Sub2_2.method7009();
			local75 = Static549.aClass4_Sub13_Sub2_2.method6995();
			if (Static260.method4122(local75)) {
				Static67.anInt1777 = local221;
			}
			Static100.aClass90_34 = null;
			return true;
		} else if (Static15.aClass90_5 == Static100.aClass90_34) {
			Static523.aClass173_1.method4070();
			Static160.anInt3344 += 32;
			Static100.aClass90_34 = null;
			return true;
		} else {
			@Pc(485) int local485;
			@Pc(442) boolean local442;
			@Pc(446) String local446;
			@Pc(448) String local448;
			@Pc(474) int local474;
			@Pc(470) long local470;
			@Pc(465) long local465;
			@Pc(460) long local460;
			if (Static100.aClass90_34 == Static295.aClass90_142) {
				local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
				local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
				local448 = local446;
				if (local442) {
					local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
				}
				local460 = Static549.aClass4_Sub13_Sub2_2.method7026();
				local465 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local470 = Static549.aClass4_Sub13_Sub2_2.method7013();
				local474 = Static549.aClass4_Sub13_Sub2_2.method7004();
				@Pc(481) long local481 = (local465 << 32) + local470;
				@Pc(483) boolean local483 = false;
				local485 = 0;
				while (true) {
					if (local485 >= 100) {
						if (local474 <= 1) {
							if (Static337.aBoolean442 && !Static477.aBoolean628 || Static16.aBoolean432) {
								local483 = true;
							} else if (Static21.method830(local448)) {
								local483 = true;
							}
						}
						break;
					}
					if (Static345.aLongArray14[local485] == local481) {
						local483 = true;
						break;
					}
					local485++;
				}
				if (!local483 && Static425.anInt8157 == 0) {
					Static345.aLongArray14[Static290.anInt5974] = local481;
					Static290.anInt5974 = (Static290.anInt5974 + 1) % 100;
					@Pc(545) String local545 = Static75.method1600(Static516.method7353(Static549.aClass4_Sub13_Sub2_2));
					if (local474 == 2 || local474 == 3) {
						Static128.method2313(0, 9, Static184.method3033(local460), "<img=1>" + local446, -1, local545, "<img=1>" + local448, local446);
					} else if (local474 == 1) {
						Static128.method2313(0, 9, Static184.method3033(local460), "<img=0>" + local446, -1, local545, "<img=0>" + local448, local446);
					} else {
						Static128.method2313(0, 9, Static184.method3033(local460), local446, -1, local545, local448, local446);
					}
				}
				Static100.aClass90_34 = null;
				return true;
			} else if (Static100.aClass90_34 == Static582.aClass90_150) {
				local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
				if (local221 == 65535) {
					local221 = -1;
				}
				local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
				local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local266 = Static549.aClass4_Sub13_Sub2_2.method7004();
				Static414.method6238(true, local266, local262, 256, local75, local221);
				Static100.aClass90_34 = null;
				return true;
			} else if (Static100.aClass90_34 == Static186.aClass90_68) {
				Static374.method5811(Static493.aClass277_15);
				Static100.aClass90_34 = null;
				return true;
			} else if (Static83.aClass90_30 == Static100.aClass90_34) {
				local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
				if (Static260.method4122(local221)) {
					Static415.method4709();
				}
				Static100.aClass90_34 = null;
				return true;
			} else if (Static262.aClass90_81 == Static100.aClass90_34) {
				Static374.method5811(Static400.aClass277_12);
				Static100.aClass90_34 = null;
				return true;
			} else if (Static100.aClass90_34 == Static24.aClass90_10) {
				local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
				@Pc(714) Object[] local714 = new Object[local446.length() + 1];
				for (local266 = local446.length() - 1; local266 >= 0; local266--) {
					if (local446.charAt(local266) == 's') {
						local714[local266 + 1] = Static549.aClass4_Sub13_Sub2_2.method7016();
					} else {
						local714[local266 + 1] = Integer.valueOf(Static549.aClass4_Sub13_Sub2_2.method6990());
					}
				}
				local714[0] = Integer.valueOf(Static549.aClass4_Sub13_Sub2_2.method6990());
				if (Static260.method4122(local221)) {
					@Pc(767) Class4_Sub37 local767 = new Class4_Sub37();
					local767.anObjectArray31 = local714;
					Static471.method6884(local767);
				}
				Static100.aClass90_34 = null;
				return true;
			} else if (Static100.aClass90_34 == Static98.aClass90_33) {
				local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
				local266 = Static549.aClass4_Sub13_Sub2_2.method7054();
				if (Static260.method4122(local221) && Static535.aClass155ArrayArray2[local75] != null) {
					for (local270 = local262; local270 < local266; local270++) {
						local281 = Static549.aClass4_Sub13_Sub2_2.method7013();
						if (local270 < Static535.aClass155ArrayArray2[local75].length && Static535.aClass155ArrayArray2[local75][local270] != null) {
							Static535.aClass155ArrayArray2[local75][local270].anInt4760 = local281;
						}
					}
				}
				Static100.aClass90_34 = null;
				return true;
			} else {
				@Pc(862) boolean local862;
				if (Static100.aClass90_34 == Static158.aClass90_57) {
					local221 = Static549.aClass4_Sub13_Sub2_2.method6987();
					local75 = Static549.aClass4_Sub13_Sub2_2.method7010();
					local862 = (local221 & 0x1) == 1;
					Static52.method1174(local75, local862);
					Static80.anIntArray105[Static419.anInt7995++ & 0x1F] = local75;
					Static100.aClass90_34 = null;
					return true;
				} else if (Static167.aClass90_95 == Static100.aClass90_34) {
					local221 = Static549.aClass4_Sub13_Sub2_2.method7046();
					local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
					if (Static260.method4122(local75)) {
						Static122.method2191(local221, -1, -1, 3);
					}
					Static100.aClass90_34 = null;
					return true;
				} else if (Static100.aClass90_34 == Static490.aClass90_126) {
					local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
					local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
					local262 = Static549.aClass4_Sub13_Sub2_2.method7004();
					local266 = Static549.aClass4_Sub13_Sub2_2.method7004();
					local270 = Static549.aClass4_Sub13_Sub2_2.method7004();
					local281 = Static549.aClass4_Sub13_Sub2_2.method7054();
					if (Static260.method4122(local221)) {
						Static179.aBooleanArray8[local75] = true;
						Static29.anIntArray28[local75] = local262;
						Static60.anIntArray62[local75] = local266;
						Static267.anIntArray289[local75] = local270;
						Static446.anIntArray495[local75] = local281;
					}
					Static100.aClass90_34 = null;
					return true;
				} else {
					@Pc(1000) int local1000;
					@Pc(1004) int local1004;
					@Pc(1014) int local1014;
					if (Static100.aClass90_34 == Static149.aClass90_50) {
						local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
						local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
						local448 = local446;
						if (local442) {
							local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
						}
						local460 = Static549.aClass4_Sub13_Sub2_2.method7054();
						local465 = Static549.aClass4_Sub13_Sub2_2.method7013();
						local1000 = Static549.aClass4_Sub13_Sub2_2.method7004();
						local1004 = Static549.aClass4_Sub13_Sub2_2.method7054();
						@Pc(1010) long local1010 = local465 + (local460 << 32);
						@Pc(1012) boolean local1012 = false;
						local1014 = 0;
						while (true) {
							if (local1014 >= 100) {
								if (local1000 <= 1 && Static21.method830(local448)) {
									local1012 = true;
								}
								break;
							}
							if (Static345.aLongArray14[local1014] == local1010) {
								local1012 = true;
								break;
							}
							local1014++;
						}
						if (!local1012 && Static425.anInt8157 == 0) {
							Static345.aLongArray14[Static290.anInt5974] = local1010;
							Static290.anInt5974 = (Static290.anInt5974 + 1) % 100;
							@Pc(1061) String local1061 = Static115.aClass213_2.method5000(local1004).method1926(Static549.aClass4_Sub13_Sub2_2);
							if (local1000 == 2) {
								Static128.method2313(0, 18, null, "<img=1>" + local446, local1004, local1061, "<img=1>" + local448, local446);
							} else if (local1000 == 1) {
								Static128.method2313(0, 18, null, "<img=0>" + local446, local1004, local1061, "<img=0>" + local448, local446);
							} else {
								Static128.method2313(0, 18, null, local446, local1004, local1061, local448, local446);
							}
						}
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static577.aClass90_147) {
						Static374.method5811(Static515.aClass277_7);
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static53.aClass90_145) {
						local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
						if (local221 == 65535) {
							local221 = -1;
						}
						local75 = Static549.aClass4_Sub13_Sub2_2.method6987();
						local262 = Static549.aClass4_Sub13_Sub2_2.method7005();
						Static303.method4805(local262, local75, local221);
						Static100.aClass90_34 = null;
						return true;
					} else if (Static467.aClass90_120 == Static100.aClass90_34) {
						local221 = Static549.aClass4_Sub13_Sub2_2.method7005();
						local75 = Static549.aClass4_Sub13_Sub2_2.method6995();
						if (local75 == 65535) {
							local75 = -1;
						}
						local262 = Static549.aClass4_Sub13_Sub2_2.method6998();
						Static462.method6785(local75, local221, local262);
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static323.aClass90_90) {
						Static549.aClass4_Sub13_Sub2_2.anInt9170 += 28;
						if (Static549.aClass4_Sub13_Sub2_2.method7015()) {
							Static446.method6582(Static549.aClass4_Sub13_Sub2_2, Static549.aClass4_Sub13_Sub2_2.anInt9170 - 28);
						}
						Static100.aClass90_34 = null;
						return true;
					} else if (Static259.aClass90_80 == Static100.aClass90_34) {
						local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
						local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
						local862 = (local75 & 0x1) == 1;
						while (Static549.aClass4_Sub13_Sub2_2.anInt9170 < Static488.anInt9250) {
							local266 = Static549.aClass4_Sub13_Sub2_2.method7019();
							local270 = Static549.aClass4_Sub13_Sub2_2.method7054();
							local281 = 0;
							if (local270 != 0) {
								local281 = Static549.aClass4_Sub13_Sub2_2.method7004();
								if (local281 == 255) {
									local281 = Static549.aClass4_Sub13_Sub2_2.method6990();
								}
							}
							Static188.method3088(local281, local270 - 1, local221, local862, local266);
						}
						Static80.anIntArray105[Static419.anInt7995++ & 0x1F] = local221;
						Static100.aClass90_34 = null;
						return true;
					} else if (Static244.aClass90_129 == Static100.aClass90_34) {
						@Pc(1317) byte local1317 = Static549.aClass4_Sub13_Sub2_2.method7011();
						local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
						local262 = Static549.aClass4_Sub13_Sub2_2.method6995();
						if (Static260.method4122(local262)) {
							Static210.method8151(local1317, local75);
						}
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static206.aClass90_146) {
						local221 = Static549.aClass4_Sub13_Sub2_2.method7010();
						local75 = Static549.aClass4_Sub13_Sub2_2.method6993();
						local262 = Static549.aClass4_Sub13_Sub2_2.method7010();
						if (local262 == 65535) {
							local262 = -1;
						}
						local266 = Static549.aClass4_Sub13_Sub2_2.method6993();
						if (Static260.method4122(local221)) {
							Static46.method1133(local75, local262, local266);
							@Pc(1381) Class236 local1381 = Static338.aClass29_1.method977(local262);
							Static212.method3439(local75, local1381.anInt6806, local1381.anInt6792, local1381.anInt6815);
							Static12.method738(local75, local1381.anInt6809, local1381.anInt6832, local1381.anInt6771);
						}
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static533.aClass90_137) {
						Static577.anInt10405 = Static549.aClass4_Sub13_Sub2_2.method7004();
						for (local221 = 0; local221 < Static577.anInt10405; local221++) {
							Static154.aStringArray13[local221] = Static549.aClass4_Sub13_Sub2_2.method7016();
							Static377.aStringArray29[local221] = Static549.aClass4_Sub13_Sub2_2.method7016();
							if (Static377.aStringArray29[local221].equals("")) {
								Static377.aStringArray29[local221] = Static154.aStringArray13[local221];
							}
							Static320.aStringArray23[local221] = Static549.aClass4_Sub13_Sub2_2.method7016();
							Static147.aStringArray11[local221] = Static549.aClass4_Sub13_Sub2_2.method7016();
							if (Static147.aStringArray11[local221].equals("")) {
								Static147.aStringArray11[local221] = Static320.aStringArray23[local221];
							}
							Static483.aBooleanArray23[local221] = false;
						}
						Static136.anInt3035 = Static422.anInt8117;
						Static100.aClass90_34 = null;
						return true;
					} else if (Static90.aClass90_31 == Static100.aClass90_34) {
						Static311.anInt6268 = Static549.aClass4_Sub13_Sub2_2.method7009();
						Static409.anInt7963 = Static549.aClass4_Sub13_Sub2_2.method7004();
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static152.aClass90_52) {
						local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
						local75 = Static549.aClass4_Sub13_Sub2_2.method7035();
						local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
						if (Static260.method4122(local221)) {
							Static205.method3350(local75, local448);
						}
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static409.aClass90_109) {
						Static182.aClass176_1 = Static93.method1854(Static549.aClass4_Sub13_Sub2_2.method7004());
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static466.aClass90_119) {
						local221 = Static549.aClass4_Sub13_Sub2_2.method6993();
						local75 = Static549.aClass4_Sub13_Sub2_2.method6995();
						local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
						if (local262 == 65535) {
							local262 = -1;
						}
						if (Static260.method4122(local75)) {
							Static122.method2191(local221, local262, -1, 2);
						}
						Static100.aClass90_34 = null;
						return true;
					} else if (Static100.aClass90_34 == Static385.aClass90_106) {
						Static374.method5811(Static79.aClass277_2);
						Static100.aClass90_34 = null;
						return true;
					} else {
						@Pc(1755) boolean local1755;
						@Pc(1778) Class210 local1778;
						if (Static100.aClass90_34 == Static247.aClass90_79) {
							Static25.anInt1023 = Static422.anInt8117;
							if (Static488.anInt9250 == 0) {
								Static100.aClass90_34 = null;
								Static341.anInt6580 = 0;
								Static507.aString204 = null;
								Static523.aClass210Array1 = null;
								Static377.aString148 = null;
								return true;
							}
							Static507.aString204 = Static549.aClass4_Sub13_Sub2_2.method7016();
							local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
							if (local442) {
								Static549.aClass4_Sub13_Sub2_2.method7016();
							}
							@Pc(1623) long local1623 = Static549.aClass4_Sub13_Sub2_2.method7026();
							Static377.aString148 = Static244.method7176(local1623);
							Static198.aByte58 = Static549.aClass4_Sub13_Sub2_2.method7011();
							local266 = Static549.aClass4_Sub13_Sub2_2.method7004();
							if (local266 == 255) {
								Static100.aClass90_34 = null;
								return true;
							}
							Static341.anInt6580 = local266;
							@Pc(1647) Class210[] local1647 = new Class210[100];
							for (local281 = 0; local281 < Static341.anInt6580; local281++) {
								local1647[local281] = new Class210();
								local1647[local281].aString128 = Static549.aClass4_Sub13_Sub2_2.method7016();
								local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
								if (local442) {
									local1647[local281].aString127 = Static549.aClass4_Sub13_Sub2_2.method7016();
								} else {
									local1647[local281].aString127 = local1647[local281].aString128;
								}
								local1647[local281].aString126 = Static377.method5881(local1647[local281].aString127);
								local1647[local281].anInt6309 = Static549.aClass4_Sub13_Sub2_2.method7054();
								local1647[local281].aByte98 = Static549.aClass4_Sub13_Sub2_2.method7011();
								local1647[local281].aString129 = Static549.aClass4_Sub13_Sub2_2.method7016();
								if (local1647[local281].aString127.equals(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87)) {
									Static46.aByte13 = local1647[local281].aByte98;
								}
							}
							local1004 = Static341.anInt6580;
							while (local1004 > 0) {
								local1004--;
								local1755 = true;
								for (local474 = 0; local474 < local1004; local474++) {
									if (local1647[local474].aString126.compareTo(local1647[local474 + 1].aString126) > 0) {
										local1778 = local1647[local474];
										local1647[local474] = local1647[local474 + 1];
										local1755 = false;
										local1647[local474 + 1] = local1778;
									}
								}
								if (local1755) {
									break;
								}
							}
							Static523.aClass210Array1 = local1647;
							Static100.aClass90_34 = null;
							return true;
						} else if (Static484.aClass90_124 == Static100.aClass90_34) {
							Static374.method5811(Static168.aClass277_6);
							Static100.aClass90_34 = null;
							return true;
						} else {
							@Pc(1830) String local1830;
							if (Static532.aClass90_136 == Static100.aClass90_34) {
								local1830 = Static549.aClass4_Sub13_Sub2_2.method7016();
								local75 = Static549.aClass4_Sub13_Sub2_2.method6987();
								local262 = Static549.aClass4_Sub13_Sub2_2.method6987();
								local266 = Static549.aClass4_Sub13_Sub2_2.method7054();
								if (local266 == 65535) {
									local266 = -1;
								}
								if (local75 >= 1 && local75 <= 8) {
									if (local1830.equalsIgnoreCase("null")) {
										local1830 = null;
									}
									Static524.aStringArray40[local75 - 1] = local1830;
									Static38.anIntArray30[local75 - 1] = local266;
									Static325.aBooleanArray16[local75 - 1] = local262 == 0;
								}
								Static100.aClass90_34 = null;
								return true;
							} else if (Static335.aClass90_92 == Static100.aClass90_34) {
								local221 = Static549.aClass4_Sub13_Sub2_2.method6990();
								Static412.aClass316_6 = Static372.aClass366_5.method8282(local221);
								Static100.aClass90_34 = null;
								return true;
							} else if (Static100.aClass90_34 == Static131.aClass90_40) {
								local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
								if (local221 == 65535) {
									local221 = -1;
								}
								local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
								local262 = Static549.aClass4_Sub13_Sub2_2.method6989();
								if (Static260.method4122(local75)) {
									Static122.method2191(local262, local221, -1, 1);
								}
								Static100.aClass90_34 = null;
								return true;
							} else {
								@Pc(1977) String local1977;
								@Pc(1981) String local1981;
								@Pc(1959) boolean local1959;
								@Pc(1967) String local1967;
								@Pc(1991) int local1991;
								if (Static216.aClass90_75 == Static100.aClass90_34) {
									local221 = Static549.aClass4_Sub13_Sub2_2.method7004();
									local1959 = (local221 & 0x1) == 1;
									local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
									local1967 = Static549.aClass4_Sub13_Sub2_2.method7016();
									if (local1967.equals("")) {
										local1967 = local448;
									}
									local1977 = Static549.aClass4_Sub13_Sub2_2.method7016();
									local1981 = Static549.aClass4_Sub13_Sub2_2.method7016();
									if (local1981.equals("")) {
										local1981 = local1977;
									}
									if (local1959) {
										for (local1991 = 0; local1991 < Static577.anInt10405; local1991++) {
											if (Static377.aStringArray29[local1991].equals(local1981)) {
												Static154.aStringArray13[local1991] = local448;
												Static377.aStringArray29[local1991] = local1967;
												Static320.aStringArray23[local1991] = local1977;
												Static147.aStringArray11[local1991] = local1981;
												break;
											}
										}
									} else {
										Static154.aStringArray13[Static577.anInt10405] = local448;
										Static377.aStringArray29[Static577.anInt10405] = local1967;
										Static320.aStringArray23[Static577.anInt10405] = local1977;
										Static147.aStringArray11[Static577.anInt10405] = local1981;
										Static483.aBooleanArray23[Static577.anInt10405] = (local221 & 0x2) == 2;
										Static577.anInt10405++;
									}
									Static136.anInt3035 = Static422.anInt8117;
									Static100.aClass90_34 = null;
									return true;
								} else if (Static100.aClass90_34 == Static24.aClass90_9) {
									Static541.aString211 = Static488.anInt9250 > 2 ? Static549.aClass4_Sub13_Sub2_2.method7016() : Static223.aClass152_30.method3624(Static142.anInt3088);
									Static545.anInt9970 = Static488.anInt9250 > 0 ? Static549.aClass4_Sub13_Sub2_2.method7054() : -1;
									Static100.aClass90_34 = null;
									if (Static545.anInt9970 == 65535) {
										Static545.anInt9970 = -1;
									}
									return true;
								} else if (Static556.aClass90_144 == Static100.aClass90_34) {
									Static515.anInt4123 = Static549.aClass4_Sub13_Sub2_2.method7011() << 3;
									Static409.anInt7962 = Static549.aClass4_Sub13_Sub2_2.method7008() << 3;
									Static364.anInt7024 = Static549.aClass4_Sub13_Sub2_2.method6987();
									for (@Pc(2124) Class4_Sub32 local2124 = (Class4_Sub32) Static17.aClass221_1.method5072(); local2124 != null; local2124 = (Class4_Sub32) Static17.aClass221_1.method5071()) {
										local75 = (int) (local2124.aLong295 >> 28 & 0x3L);
										local262 = (int) (local2124.aLong295 & 0x3FFFL);
										local266 = local262 - Static242.anInt10133;
										local270 = (int) (local2124.aLong295 >> 14 & 0x3FFFL);
										local281 = local270 - Static157.anInt3323;
										if (Static364.anInt7024 == local75 && local266 >= Static409.anInt7962 && Static409.anInt7962 + 8 > local266 && local281 >= Static515.anInt4123 && Static515.anInt4123 + 8 > local281) {
											local2124.method8193();
											if (local266 >= 0 && local281 >= 0 && local266 < Static338.anInt6508 && Static390.anInt7654 > local281) {
												Static358.method5396(local281, Static364.anInt7024, local266);
											}
										}
									}
									for (@Pc(2222) Class4_Sub51 local2222 = (Class4_Sub51) Static322.aClass22_43.method895(); local2222 != null; local2222 = (Class4_Sub51) Static322.aClass22_43.method889()) {
										if (Static409.anInt7962 <= local2222.anInt10463 && Static409.anInt7962 + 8 > local2222.anInt10463 && local2222.anInt10474 >= Static515.anInt4123 && local2222.anInt10474 < Static515.anInt4123 + 8 && Static364.anInt7024 == local2222.anInt10464) {
											local2222.anInt10470 = 0;
										}
									}
									Static100.aClass90_34 = null;
									return true;
								} else if (Static184.aClass90_66 == Static100.aClass90_34) {
									Static409.anInt7962 = Static549.aClass4_Sub13_Sub2_2.method7007() << 3;
									Static364.anInt7024 = Static549.aClass4_Sub13_Sub2_2.method7009();
									Static515.anInt4123 = Static549.aClass4_Sub13_Sub2_2.method7011() << 3;
									while (Static488.anInt9250 > Static549.aClass4_Sub13_Sub2_2.anInt9170) {
										@Pc(2294) Class277 local2294 = Static77.method1607()[Static549.aClass4_Sub13_Sub2_2.method7004()];
										Static374.method5811(local2294);
									}
									Static100.aClass90_34 = null;
									return true;
								} else if (Static214.aClass90_74 == Static100.aClass90_34) {
									Static374.method5811(Static232.aClass277_9);
									Static100.aClass90_34 = null;
									return true;
								} else if (Static529.aClass90_134 == Static100.aClass90_34) {
									local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
									local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
									local862 = (local75 & 0x1) == 1;
									Static236.method3842(local221, local862);
									local266 = Static549.aClass4_Sub13_Sub2_2.method7054();
									for (local270 = 0; local270 < local266; local270++) {
										local281 = Static549.aClass4_Sub13_Sub2_2.method7010();
										local1991 = Static549.aClass4_Sub13_Sub2_2.method7004();
										if (local1991 == 255) {
											local1991 = Static549.aClass4_Sub13_Sub2_2.method6989();
										}
										Static188.method3088(local1991, local281 - 1, local221, local862, local270);
									}
									Static80.anIntArray105[Static419.anInt7995++ & 0x1F] = local221;
									Static100.aClass90_34 = null;
									return true;
								} else if (Static208.aClass90_71 == Static100.aClass90_34) {
									Static374.method5811(Static516.aClass277_16);
									Static100.aClass90_34 = null;
									return true;
								} else if (Static167.aClass90_93 == Static100.aClass90_34) {
									for (local221 = 0; local221 < Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1.length; local221++) {
										if (Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local221] != null) {
											Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local221].anIntArray205 = null;
											Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local221].anInt4209 = -1;
										}
									}
									for (local75 = 0; local75 < Static222.anInt4653; local75++) {
										Static590.aClass4_Sub29Array1[local75].aClass21_Sub1_Sub1_Sub1_Sub1_1.anIntArray205 = null;
										Static590.aClass4_Sub29Array1[local75].aClass21_Sub1_Sub1_Sub1_Sub1_1.anInt4209 = -1;
									}
									Static100.aClass90_34 = null;
									return true;
								} else if (Static95.aClass90_32 == Static100.aClass90_34) {
									Static374.method5811(Static525.aClass277_17);
									Static100.aClass90_34 = null;
									return true;
								} else if (Static100.aClass90_34 == Static415.aClass90_86) {
									local221 = Static549.aClass4_Sub13_Sub2_2.method7035();
									local75 = Static549.aClass4_Sub13_Sub2_2.method7010();
									local262 = Static549.aClass4_Sub13_Sub2_2.method6993();
									if (Static260.method4122(local75)) {
										Static351.method5321(local221, local262);
									}
									Static100.aClass90_34 = null;
									return true;
								} else if (Static100.aClass90_34 == Static210.aClass90_151) {
									if (Static254.method4045(Static9.anInt758)) {
										Static388.anInt7599 = (int) ((float) Static549.aClass4_Sub13_Sub2_2.method7054() * 2.5F);
									} else {
										Static388.anInt7599 = Static549.aClass4_Sub13_Sub2_2.method7054() * 30;
									}
									Static389.anInt9603 = Static422.anInt8117;
									Static100.aClass90_34 = null;
									return true;
								} else {
									@Pc(2571) int local2571;
									if (Static143.aClass90_48 == Static100.aClass90_34) {
										local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
										local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
										local448 = local446;
										if (local442) {
											local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
										}
										local460 = Static549.aClass4_Sub13_Sub2_2.method7054();
										local465 = Static549.aClass4_Sub13_Sub2_2.method7013();
										local1000 = Static549.aClass4_Sub13_Sub2_2.method7004();
										@Pc(2567) long local2567 = local465 + (local460 << 32);
										@Pc(2569) boolean local2569 = false;
										local2571 = 0;
										while (true) {
											if (local2571 >= 100) {
												if (local1000 <= 1) {
													if (Static337.aBoolean442 && !Static477.aBoolean628 || Static16.aBoolean432) {
														local2569 = true;
													} else if (Static21.method830(local448)) {
														local2569 = true;
													}
												}
												break;
											}
											if (Static345.aLongArray14[local2571] == local2567) {
												local2569 = true;
												break;
											}
											local2571++;
										}
										if (!local2569 && Static425.anInt8157 == 0) {
											Static345.aLongArray14[Static290.anInt5974] = local2567;
											Static290.anInt5974 = (Static290.anInt5974 + 1) % 100;
											@Pc(2633) String local2633 = Static75.method1600(Static516.method7353(Static549.aClass4_Sub13_Sub2_2));
											if (local1000 == 2) {
												Static128.method2313(0, 7, null, "<img=1>" + local446, -1, local2633, "<img=1>" + local448, local446);
											} else if (local1000 == 1) {
												Static128.method2313(0, 7, null, "<img=0>" + local446, -1, local2633, "<img=0>" + local448, local446);
											} else {
												Static128.method2313(0, 3, null, local446, -1, local2633, local448, local446);
											}
										}
										Static100.aClass90_34 = null;
										return true;
									} else if (Static186.aClass90_69 == Static100.aClass90_34) {
										local221 = Static549.aClass4_Sub13_Sub2_2.method6993();
										local75 = Static549.aClass4_Sub13_Sub2_2.method6995();
										local262 = Static549.aClass4_Sub13_Sub2_2.method6995();
										local266 = Static549.aClass4_Sub13_Sub2_2.method6995();
										if (Static260.method4122(local266)) {
											Static578.method8123(local221, (local75 << 16) + local262);
										}
										Static100.aClass90_34 = null;
										return true;
									} else if (Static100.aClass90_34 == Static140.aClass90_46) {
										local221 = Static549.aClass4_Sub13_Sub2_2.method7010();
										local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
										Static523.aClass173_1.method4075(local221, local75);
										Static100.aClass90_34 = null;
										return true;
									} else if (Static100.aClass90_34 == Static451.aClass90_116) {
										local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
										local75 = Static549.aClass4_Sub13_Sub2_2.method6995();
										local262 = Static549.aClass4_Sub13_Sub2_2.method7046();
										local266 = Static549.aClass4_Sub13_Sub2_2.method7035();
										local270 = Static549.aClass4_Sub13_Sub2_2.method7010();
										if (Static260.method4122(local270)) {
											Static212.method3439(local262, local266, local221, local75);
										}
										Static100.aClass90_34 = null;
										return true;
									} else if (Static74.aClass90_25 == Static100.aClass90_34) {
										local221 = Static549.aClass4_Sub13_Sub2_2.method7004();
										local75 = local221 >> 5;
										local262 = local221 & 0x1F;
										if (local262 == 0) {
											Static553.aClass292Array1[local75] = null;
											Static100.aClass90_34 = null;
											return true;
										}
										@Pc(2828) Class292 local2828 = new Class292();
										local2828.anInt8837 = local262;
										local2828.anInt8830 = Static549.aClass4_Sub13_Sub2_2.method7004();
										if (local2828.anInt8830 >= 0 && local2828.anInt8830 < Static50.aClass88Array1.length) {
											if (local2828.anInt8837 == 1 || local2828.anInt8837 == 10) {
												local2828.anInt8834 = Static549.aClass4_Sub13_Sub2_2.method7054();
												Static549.aClass4_Sub13_Sub2_2.anInt9170 += 6;
											} else if (local2828.anInt8837 >= 2 && local2828.anInt8837 <= 6) {
												if (local2828.anInt8837 == 2) {
													local2828.anInt8828 = 256;
													local2828.anInt8833 = 256;
												}
												if (local2828.anInt8837 == 3) {
													local2828.anInt8833 = 256;
													local2828.anInt8828 = 0;
												}
												if (local2828.anInt8837 == 4) {
													local2828.anInt8833 = 256;
													local2828.anInt8828 = 512;
												}
												if (local2828.anInt8837 == 5) {
													local2828.anInt8833 = 0;
													local2828.anInt8828 = 256;
												}
												if (local2828.anInt8837 == 6) {
													local2828.anInt8833 = 512;
													local2828.anInt8828 = 256;
												}
												local2828.anInt8837 = 2;
												local2828.anInt8829 = Static549.aClass4_Sub13_Sub2_2.method7004();
												local2828.anInt8828 += Static549.aClass4_Sub13_Sub2_2.method7054() - Static242.anInt10133 << 9;
												local2828.anInt8833 += Static549.aClass4_Sub13_Sub2_2.method7054() - Static157.anInt3323 << 9;
												local2828.anInt8831 = Static549.aClass4_Sub13_Sub2_2.method7004() << 2;
												local2828.anInt8835 = Static549.aClass4_Sub13_Sub2_2.method7054();
											}
											local2828.anInt8836 = Static549.aClass4_Sub13_Sub2_2.method7054();
											if (local2828.anInt8836 == 65535) {
												local2828.anInt8836 = -1;
											}
											Static553.aClass292Array1[local75] = local2828;
										}
										Static100.aClass90_34 = null;
										return true;
									} else if (Static167.aClass90_94 == Static100.aClass90_34) {
										local221 = Static549.aClass4_Sub13_Sub2_2.method6989();
										local75 = Static549.aClass4_Sub13_Sub2_2.method6995();
										local262 = Static549.aClass4_Sub13_Sub2_2.method7005();
										if (Static260.method4122(local75)) {
											Static210.method8152(local221, local262);
										}
										Static100.aClass90_34 = null;
										return true;
									} else if (Static100.aClass90_34 == Static26.aClass90_11) {
										Static168.anInt3486 = Static549.aClass4_Sub13_Sub2_2.method7000();
										Static337.aBoolean442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
										Static100.aClass90_34 = null;
										return true;
									} else if (Static208.aClass90_72 == Static100.aClass90_34) {
										local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
										@Pc(3071) byte local3071 = Static549.aClass4_Sub13_Sub2_2.method7011();
										Static523.aClass173_1.method4077(local3071, local221);
										Static100.aClass90_34 = null;
										return true;
									} else if (Static209.aClass90_73 == Static100.aClass90_34) {
										Static485.method7069(Static549.aClass4_Sub13_Sub2_2.method7016());
										Static100.aClass90_34 = null;
										return true;
									} else if (Static551.aClass90_143 == Static100.aClass90_34) {
										local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
										if (local221 == 65535) {
											local221 = -1;
										}
										local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
										local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
										local266 = Static549.aClass4_Sub13_Sub2_2.method7004();
										local270 = Static549.aClass4_Sub13_Sub2_2.method7054();
										Static414.method6238(false, local266, local262, local270, local75, local221);
										Static100.aClass90_34 = null;
										return true;
									} else {
										@Pc(3186) int local3186;
										if (Static529.aClass90_135 == Static100.aClass90_34) {
											local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
											local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
											local448 = local446;
											if (local442) {
												local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
											}
											local460 = Static549.aClass4_Sub13_Sub2_2.method7026();
											local465 = Static549.aClass4_Sub13_Sub2_2.method7054();
											local470 = Static549.aClass4_Sub13_Sub2_2.method7013();
											local474 = Static549.aClass4_Sub13_Sub2_2.method7004();
											local3186 = Static549.aClass4_Sub13_Sub2_2.method7054();
											@Pc(3192) long local3192 = local470 + (local465 << 32);
											@Pc(3194) boolean local3194 = false;
											@Pc(3196) int local3196 = 0;
											while (true) {
												if (local3196 >= 100) {
													if (local474 <= 1 && Static21.method830(local448)) {
														local3194 = true;
													}
													break;
												}
												if (Static345.aLongArray14[local3196] == local3192) {
													local3194 = true;
													break;
												}
												local3196++;
											}
											if (!local3194 && Static425.anInt8157 == 0) {
												Static345.aLongArray14[Static290.anInt5974] = local3192;
												Static290.anInt5974 = (Static290.anInt5974 + 1) % 100;
												@Pc(3247) String local3247 = Static115.aClass213_2.method5000(local3186).method1926(Static549.aClass4_Sub13_Sub2_2);
												if (local474 == 2) {
													Static128.method2313(0, 20, Static184.method3033(local460), "<img=1>" + local446, local3186, local3247, "<img=1>" + local448, local446);
												} else if (local474 == 1) {
													Static128.method2313(0, 20, Static184.method3033(local460), "<img=0>" + local446, local3186, local3247, "<img=0>" + local448, local446);
												} else {
													Static128.method2313(0, 20, Static184.method3033(local460), local446, local3186, local3247, local448, local446);
												}
											}
											Static100.aClass90_34 = null;
											return true;
										} else if (Static100.aClass90_34 == Static151.aClass90_51) {
											local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
											local75 = Static549.aClass4_Sub13_Sub2_2.method7010();
											local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
											if (Static260.method4122(local262)) {
												Static569.method6002(local75, local221);
											}
											Static100.aClass90_34 = null;
											return true;
										} else if (Static100.aClass90_34 == Static78.aClass90_27) {
											local1830 = Static549.aClass4_Sub13_Sub2_2.method7016();
											local446 = Static75.method1600(Static516.method7353(Static549.aClass4_Sub13_Sub2_2));
											Static84.method1791(6, local1830, local1830, local446, 0, local1830);
											Static100.aClass90_34 = null;
											return true;
										} else if (Static100.aClass90_34 == Static58.aClass90_21) {
											Static374.method5811(Static31.aClass277_1);
											Static100.aClass90_34 = null;
											return true;
										} else if (Static119.aClass90_37 == Static100.aClass90_34) {
											Static291.anInt5976 = Static549.aClass4_Sub13_Sub2_2.method7004();
											Static100.aClass90_34 = null;
											return true;
										} else if (Static100.aClass90_34 == Static184.aClass90_67) {
											local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
											if (Static260.method4122(local221)) {
												Static398.method6101();
											}
											Static100.aClass90_34 = null;
											return true;
										} else {
											@Pc(3451) Class4_Sub45 local3451;
											if (Static100.aClass90_34 == Static535.aClass90_138) {
												local221 = Static549.aClass4_Sub13_Sub2_2.method6993();
												local75 = Static549.aClass4_Sub13_Sub2_2.method6990();
												local262 = Static549.aClass4_Sub13_Sub2_2.method7035();
												if (Static260.method4122(local262)) {
													@Pc(3442) Class4_Sub45 local3442 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local75);
													local3451 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local221);
													if (local3451 != null) {
														Static205.method3352(local3442 == null || local3451.anInt9096 != local3442.anInt9096, local3451, false);
													}
													if (local3442 != null) {
														local3442.method8193();
														Static569.aClass221_27.method5073(local3442, (long) local221);
													}
													@Pc(3486) Class155 local3486 = Static558.method7916(local75);
													if (local3486 != null) {
														Static368.method5060(local3486);
													}
													local3486 = Static558.method7916(local221);
													if (local3486 != null) {
														Static368.method5060(local3486);
														Static162.method2682(true, local3486);
													}
													if (Static446.anInt8493 != -1) {
														Static396.method6077(1, Static446.anInt8493);
													}
												}
												Static100.aClass90_34 = null;
												return true;
											} else if (Static100.aClass90_34 == Static210.aClass90_152) {
												local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
												local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
												local262 = Static549.aClass4_Sub13_Sub2_2.method7004();
												local266 = Static549.aClass4_Sub13_Sub2_2.method7054() << 2;
												local270 = Static549.aClass4_Sub13_Sub2_2.method7004();
												local281 = Static549.aClass4_Sub13_Sub2_2.method7004();
												if (Static260.method4122(local221)) {
													Static81.method7678(local270, local266, local75, local281, local262);
												}
												Static100.aClass90_34 = null;
												return true;
											} else if (Static100.aClass90_34 == Static541.aClass90_140) {
												local221 = Static549.aClass4_Sub13_Sub2_2.method7010();
												local75 = Static549.aClass4_Sub13_Sub2_2.method6989();
												Static523.aClass173_1.method4075(local221, local75);
												Static100.aClass90_34 = null;
												return true;
											} else if (Static156.aClass90_131 == Static100.aClass90_34) {
												Static538.method7540(Static488.anInt9250, Static549.aClass4_Sub13_Sub2_2);
												Static100.aClass90_34 = null;
												return true;
											} else if (Static155.aClass90_56 == Static100.aClass90_34) {
												local221 = Static549.aClass4_Sub13_Sub2_2.method7009();
												local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
												local262 = Static549.aClass4_Sub13_Sub2_2.method6990();
												Static278.anIntArray299[local221] = local262;
												Static230.anIntArray240[local221] = local75;
												Static460.anIntArray514[local221] = 1;
												local266 = Static12.anIntArray12[local221] - 1;
												for (local270 = 0; local270 < local266; local270++) {
													if (local262 >= Class209.anIntArray348[local270]) {
														Static460.anIntArray514[local221] = local270 + 2;
													}
												}
												Static105.anIntArray526[Static511.anInt9517++ & 0x1F] = local221;
												Static100.aClass90_34 = null;
												return true;
											} else if (Static100.aClass90_34 == Static177.aClass90_65) {
												local1830 = Static549.aClass4_Sub13_Sub2_2.method7016();
												local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
												local448 = Static115.aClass213_2.method5000(local75).method1926(Static549.aClass4_Sub13_Sub2_2);
												Static128.method2313(0, 19, null, local1830, local75, local448, local1830, local1830);
												Static100.aClass90_34 = null;
												return true;
											} else if (Static100.aClass90_34 == Static536.aClass90_139) {
												Static374.method5811(Static472.aClass277_14);
												Static100.aClass90_34 = null;
												return true;
											} else {
												@Pc(3754) String local3754;
												@Pc(3743) boolean local3743;
												if (Static100.aClass90_34 == Static360.aClass90_99) {
													local1830 = Static549.aClass4_Sub13_Sub2_2.method7016();
													local862 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
													if (local862) {
														local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
													} else {
														local446 = local1830;
													}
													local266 = Static549.aClass4_Sub13_Sub2_2.method7054();
													@Pc(3741) byte local3741 = Static549.aClass4_Sub13_Sub2_2.method7011();
													local3743 = false;
													if (local3741 == -128) {
														local3743 = true;
													}
													if (local3743) {
														if (Static341.anInt6580 == 0) {
															Static100.aClass90_34 = null;
															return true;
														}
														for (local1991 = 0; local1991 < Static341.anInt6580 && (!Static523.aClass210Array1[local1991].aString127.equals(local446) || Static523.aClass210Array1[local1991].anInt6309 != local266); local1991++) {
														}
														if (Static341.anInt6580 > local1991) {
															while (local1991 < Static341.anInt6580 - 1) {
																Static523.aClass210Array1[local1991] = Static523.aClass210Array1[local1991 + 1];
																local1991++;
															}
															Static341.anInt6580--;
															Static523.aClass210Array1[Static341.anInt6580] = null;
														}
													} else {
														local3754 = Static549.aClass4_Sub13_Sub2_2.method7016();
														local1778 = new Class210();
														local1778.aString127 = local446;
														local1778.aString128 = local1830;
														local1778.aString126 = Static377.method5881(local1778.aString127);
														local1778.aString129 = local3754;
														local1778.anInt6309 = local266;
														local1778.aByte98 = local3741;
														for (local1004 = Static341.anInt6580 - 1; local1004 >= 0; local1004--) {
															local474 = Static523.aClass210Array1[local1004].aString126.compareTo(local1778.aString126);
															if (local474 == 0) {
																Static523.aClass210Array1[local1004].anInt6309 = local266;
																Static523.aClass210Array1[local1004].aByte98 = local3741;
																Static523.aClass210Array1[local1004].aString129 = local3754;
																if (local446.equals(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87)) {
																	Static46.aByte13 = local3741;
																}
																Static100.aClass90_34 = null;
																Static25.anInt1023 = Static422.anInt8117;
																return true;
															}
															if (local474 < 0) {
																break;
															}
														}
														if (Static523.aClass210Array1.length <= Static341.anInt6580) {
															Static100.aClass90_34 = null;
															return true;
														}
														for (local474 = Static341.anInt6580 - 1; local474 > local1004; local474--) {
															Static523.aClass210Array1[local474 + 1] = Static523.aClass210Array1[local474];
														}
														if (Static341.anInt6580 == 0) {
															Static523.aClass210Array1 = new Class210[100];
														}
														Static523.aClass210Array1[local1004 + 1] = local1778;
														Static341.anInt6580++;
														if (local446.equals(Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2.aString87)) {
															Static46.aByte13 = local3741;
														}
													}
													Static100.aClass90_34 = null;
													Static25.anInt1023 = Static422.anInt8117;
													return true;
												} else if (Static100.aClass90_34 == Static496.aClass90_128) {
													local221 = Static549.aClass4_Sub13_Sub2_2.method7046();
													local75 = local221 >> 28 & 0x3;
													local262 = local221 >> 14 & 0x3FFF;
													local266 = local221 & 0x3FFF;
													local270 = Static549.aClass4_Sub13_Sub2_2.method7009();
													local281 = local270 >> 2;
													local1991 = local270 & 0x3;
													local1000 = Static518.anIntArray544[local281];
													local1004 = Static549.aClass4_Sub13_Sub2_2.method7035();
													local262 -= Static242.anInt10133;
													local266 -= Static157.anInt3323;
													if (local1004 == 65535) {
														local1004 = -1;
													}
													Static276.method4456(local266, local1991, local1004, local1000, local281, local262, local75);
													Static100.aClass90_34 = null;
													return true;
												} else if (Static433.aClass90_111 == Static100.aClass90_34) {
													local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
													local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
													local448 = local446;
													if (local442) {
														local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
													}
													local266 = Static549.aClass4_Sub13_Sub2_2.method7004();
													local270 = Static549.aClass4_Sub13_Sub2_2.method7054();
													local3743 = false;
													if (local266 <= 1 && Static21.method830(local448)) {
														local3743 = true;
													}
													if (!local3743 && Static425.anInt8157 == 0) {
														local3754 = Static115.aClass213_2.method5000(local270).method1926(Static549.aClass4_Sub13_Sub2_2);
														if (local266 == 2) {
															Static128.method2313(0, 25, null, "<img=1>" + local446, local270, local3754, "<img=1>" + local448, local446);
														} else if (local266 == 1) {
															Static128.method2313(0, 25, null, "<img=0>" + local446, local270, local3754, "<img=0>" + local448, local446);
														} else {
															Static128.method2313(0, 25, null, local446, local270, local3754, local448, local446);
														}
													}
													Static100.aClass90_34 = null;
													return true;
												} else if (Static100.aClass90_34 == Static456.aClass90_117) {
													Static374.method5811(Static208.aClass277_8);
													Static100.aClass90_34 = null;
													return true;
												} else if (Static100.aClass90_34 == Static271.aClass90_82) {
													local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
													local75 = Static549.aClass4_Sub13_Sub2_2.method6990();
													if (Static260.method4122(local221)) {
														Static122.method2191(local75, Static1.anInt5011, 0, 5);
													}
													Static100.aClass90_34 = null;
													return true;
												} else if (Static100.aClass90_34 == Static404.aClass90_108) {
													Static66.anInt1737 = 1;
													Static136.anInt3035 = Static422.anInt8117;
													Static100.aClass90_34 = null;
													return true;
												} else if (Static481.aClass90_122 == Static100.aClass90_34) {
													local221 = Static549.aClass4_Sub13_Sub2_2.method7010();
													local75 = Static549.aClass4_Sub13_Sub2_2.method6993();
													local262 = Static549.aClass4_Sub13_Sub2_2.method7043();
													local266 = Static549.aClass4_Sub13_Sub2_2.method7043();
													if (Static260.method4122(local221)) {
														Static557.method7894(local266, local75, local262);
													}
													Static100.aClass90_34 = null;
													return true;
												} else if (Static100.aClass90_34 == Static174.aClass90_64) {
													local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
													if (local221 == 65535) {
														local221 = -1;
													}
													local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
													local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
													local266 = Static549.aClass4_Sub13_Sub2_2.method7004();
													local270 = Static549.aClass4_Sub13_Sub2_2.method7054();
													Static170.method2832(local270, local266, local262, local75, local221);
													Static100.aClass90_34 = null;
													return true;
												} else {
													@Pc(4650) boolean local4650;
													if (Static307.aClass90_87 == Static100.aClass90_34) {
														local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
														local75 = Static549.aClass4_Sub13_Sub2_2.method6993();
														local262 = Static549.aClass4_Sub13_Sub2_2.method7005();
														local266 = Static549.aClass4_Sub13_Sub2_2.method7054();
														local270 = Static549.aClass4_Sub13_Sub2_2.method7010();
														local3743 = (local262 & 0x80) != 0;
														if (local75 >> 30 == 0) {
															@Pc(4386) Class49 local4386;
															@Pc(4441) Class111 local4441;
															@Pc(4408) Class111 local4408;
															if (local75 >> 29 != 0) {
																local1991 = local75 & 0xFFFF;
																@Pc(4344) Class4_Sub29 local4344 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local1991);
																if (local4344 != null) {
																	@Pc(4349) Class21_Sub1_Sub1_Sub1_Sub1 local4349 = local4344.aClass21_Sub1_Sub1_Sub1_Sub1_1;
																	if (local266 == 65535) {
																		local266 = -1;
																	}
																	@Pc(4358) boolean local4358 = true;
																	local3186 = local3743 ? local4349.anInt4224 : local4349.anInt4233;
																	if (local266 != -1 && local3186 != -1) {
																		if (local266 == local3186) {
																			local4386 = Static342.aClass132_2.method2958(local266);
																			if (local4386.aBoolean119 && local4386.anInt1459 != -1) {
																				local4441 = Static17.aClass254_1.method5936(local4386.anInt1459);
																				local485 = local4441.anInt3148;
																				if (local485 == 0 || local485 == 2) {
																					local4358 = false;
																				} else if (local485 == 1) {
																					local4358 = true;
																				}
																			}
																		} else {
																			local4386 = Static342.aClass132_2.method2958(local266);
																			@Pc(4391) Class49 local4391 = Static342.aClass132_2.method2958(local3186);
																			if (local4386.anInt1459 != -1 && local4391.anInt1459 != -1) {
																				local4408 = Static17.aClass254_1.method5936(local4386.anInt1459);
																				@Pc(4414) Class111 local4414 = Static17.aClass254_1.method5936(local4391.anInt1459);
																				if (local4414.anInt3152 > local4408.anInt3152) {
																					local4358 = false;
																				}
																			}
																		}
																	}
																	if (local4358) {
																		if (local3743) {
																			local4349.anInt4270 = 0;
																			local4349.anInt4224 = local266;
																			local4349.anInt4249 = local262 & 0x7;
																			local4349.anInt4206 = 0;
																			local4349.anInt4245 = 1;
																			local4349.anInt4213 = Static306.anInt6122 + local270;
																			local4349.anInt4223 = local221;
																			if (local4349.anInt4213 > Static306.anInt6122) {
																				local4349.anInt4270 = -1;
																			}
																			if (local4349.anInt4224 != -1 && Static306.anInt6122 == local4349.anInt4213) {
																				local2571 = Static342.aClass132_2.method2958(local4349.anInt4224).anInt1459;
																				if (local2571 != -1) {
																					local4441 = Static17.aClass254_1.method5936(local2571);
																					if (local4441 != null && local4441.anIntArray153 != null && !local4349.aBoolean295) {
																						Static593.method8263(0, local4349, local4441);
																					}
																				}
																			}
																		} else {
																			local4349.anInt4222 = local262 & 0x7;
																			local4349.anInt4271 = 1;
																			local4349.anInt4234 = local221;
																			local4349.anInt4204 = 0;
																			local4349.anInt4233 = local266;
																			local4349.anInt4236 = 0;
																			local4349.anInt4231 = local270 + Static306.anInt6122;
																			if (local4349.anInt4231 > Static306.anInt6122) {
																				local4349.anInt4236 = -1;
																			}
																			if (local4349.anInt4233 != -1 && local4349.anInt4231 == Static306.anInt6122) {
																				local2571 = Static342.aClass132_2.method2958(local4349.anInt4233).anInt1459;
																				if (local2571 != -1) {
																					local4441 = Static17.aClass254_1.method5936(local2571);
																					if (local4441 != null && local4441.anIntArray153 != null && !local4349.aBoolean295) {
																						Static593.method8263(0, local4349, local4441);
																					}
																				}
																			}
																		}
																	}
																}
															} else if (local75 >> 28 != 0) {
																local1991 = local75 & 0xFFFF;
																@Pc(4633) Class21_Sub1_Sub1_Sub1_Sub2 local4633;
																if (Static1.anInt5011 == local1991) {
																	local4633 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2;
																} else {
																	local4633 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local1991];
																}
																if (local4633 != null) {
																	if (local266 == 65535) {
																		local266 = -1;
																	}
																	local4650 = true;
																	local474 = local3743 ? local4633.anInt4224 : local4633.anInt4233;
																	@Pc(4694) Class111 local4694;
																	if (local266 != -1 && local474 != -1) {
																		@Pc(4679) Class49 local4679;
																		if (local266 == local474) {
																			local4679 = Static342.aClass132_2.method2958(local266);
																			if (local4679.aBoolean119 && local4679.anInt1459 != -1) {
																				local4694 = Static17.aClass254_1.method5936(local4679.anInt1459);
																				local1014 = local4694.anInt3148;
																				if (local1014 == 0 || local1014 == 2) {
																					local4650 = false;
																				} else if (local1014 == 1) {
																					local4650 = true;
																				}
																			}
																		} else {
																			local4679 = Static342.aClass132_2.method2958(local266);
																			local4386 = Static342.aClass132_2.method2958(local474);
																			if (local4679.anInt1459 != -1 && local4386.anInt1459 != -1) {
																				local4441 = Static17.aClass254_1.method5936(local4679.anInt1459);
																				local4408 = Static17.aClass254_1.method5936(local4386.anInt1459);
																				if (local4408.anInt3152 > local4441.anInt3152) {
																					local4650 = false;
																				}
																			}
																		}
																	}
																	if (local4650) {
																		if (local3743) {
																			local4633.anInt4213 = local270 + Static306.anInt6122;
																			local4633.anInt4270 = 0;
																			local4633.anInt4224 = local266;
																			local4633.anInt4223 = local221;
																			local4633.anInt4249 = local262 & 0x7;
																			local4633.anInt4206 = 0;
																			local4633.anInt4245 = 1;
																			if (local4633.anInt4213 > Static306.anInt6122) {
																				local4633.anInt4270 = -1;
																			}
																			if (local4633.anInt4224 == 65535) {
																				local4633.anInt4224 = -1;
																			}
																			if (local4633.anInt4224 != -1 && local4633.anInt4213 == Static306.anInt6122) {
																				local3186 = Static342.aClass132_2.method2958(local4633.anInt4224).anInt1459;
																				if (local3186 != -1) {
																					local4694 = Static17.aClass254_1.method5936(local3186);
																					if (local4694 != null && local4694.anIntArray153 != null && !local4633.aBoolean295) {
																						Static593.method8263(0, local4633, local4694);
																					}
																				}
																			}
																		} else {
																			local4633.anInt4204 = 0;
																			local4633.anInt4271 = 1;
																			local4633.anInt4222 = local262 & 0x7;
																			local4633.anInt4234 = local221;
																			local4633.anInt4236 = 0;
																			local4633.anInt4231 = local270 + Static306.anInt6122;
																			local4633.anInt4233 = local266;
																			if (local4633.anInt4231 > Static306.anInt6122) {
																				local4633.anInt4236 = -1;
																			}
																			if (local4633.anInt4233 == 65535) {
																				local4633.anInt4233 = -1;
																			}
																			if (local4633.anInt4233 != -1 && Static306.anInt6122 == local4633.anInt4231) {
																				local3186 = Static342.aClass132_2.method2958(local4633.anInt4233).anInt1459;
																				if (local3186 != -1) {
																					local4694 = Static17.aClass254_1.method5936(local3186);
																					if (local4694 != null && local4694.anIntArray153 != null && !local4633.aBoolean295) {
																						Static593.method8263(0, local4633, local4694);
																					}
																				}
																			}
																		}
																	}
																}
															}
														} else {
															local1991 = local75 >> 28 & 0x3;
															local1000 = (local75 >> 14 & 0x3FFF) - Static242.anInt10133;
															local1004 = (local75 & 0x3FFF) - Static157.anInt3323;
															if (local1000 >= 0 && local1004 >= 0 && local1000 < Static338.anInt6508 && Static390.anInt7654 > local1004) {
																local474 = local1000 * 512 + 256;
																local3186 = local1004 * 512 + 256;
																local2571 = local1991;
																if (local1991 < 3 && Static193.method3175(local1004, local1000)) {
																	local2571 = local1991 + 1;
																}
																@Pc(5009) Class21_Sub1_Sub1_Sub2 local5009 = new Class21_Sub1_Sub1_Sub2(local266, 0, Static306.anInt6122, local1991, local2571, local474, Static461.method6782(local3186, local1991, local474) - local221, local3186, local1000, local1000, local1004, local1004, local262 & 0x7);
																Static247.aClass22_27.method894(new Class4_Sub6_Sub9(local5009));
															}
														}
														Static100.aClass90_34 = null;
														return true;
													} else if (Static100.aClass90_34 == Static424.aClass90_110) {
														local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
														local75 = Static549.aClass4_Sub13_Sub2_2.method7046();
														Static523.aClass173_1.method4077(local75, local221);
														Static100.aClass90_34 = null;
														return true;
													} else if (Static100.aClass90_34 == Static109.aClass90_35) {
														Static374.method5811(Static157.aClass277_5);
														Static100.aClass90_34 = null;
														return true;
													} else if (Static8.aClass90_2 == Static100.aClass90_34) {
														local221 = Static549.aClass4_Sub13_Sub2_2.method6989();
														local75 = Static549.aClass4_Sub13_Sub2_2.method7010();
														local262 = Static549.aClass4_Sub13_Sub2_2.method7036();
														if (Static260.method4122(local75)) {
															Static420.method6293(local262, local221);
														}
														Static100.aClass90_34 = null;
														return true;
													} else if (Static100.aClass90_34 == Static396.aClass90_107) {
														Static160.anInt3346 = Static549.aClass4_Sub13_Sub2_2.method7043();
														Static389.anInt9603 = Static422.anInt8117;
														Static100.aClass90_34 = null;
														return true;
													} else if (Static542.aClass90_141 == Static100.aClass90_34) {
														if (Static446.anInt8493 != -1) {
															Static396.method6077(0, Static446.anInt8493);
														}
														Static100.aClass90_34 = null;
														return true;
													} else if (Static100.aClass90_34 == Static392.aClass90_63) {
														Static272.anInt10565 = Static549.aClass4_Sub13_Sub2_2.method7004();
														Static389.anInt9603 = Static422.anInt8117;
														Static100.aClass90_34 = null;
														return true;
													} else if (Static100.aClass90_34 == Static288.aClass90_83) {
														Static254.method4043(Static33.aBoolean107);
														Static100.aClass90_34 = null;
														return false;
													} else {
														@Pc(5177) boolean local5177;
														if (Static100.aClass90_34 == Static60.aClass90_22) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
															@Pc(5149) Class21_Sub1_Sub1_Sub1_Sub2 local5149;
															if (Static1.anInt5011 == local221) {
																local5149 = Static167.aClass21_Sub1_Sub1_Sub1_Sub2_2;
															} else {
																local5149 = Static453.aClass21_Sub1_Sub1_Sub1_Sub2Array1[local221];
															}
															if (local5149 == null) {
																Static100.aClass90_34 = null;
																return true;
															}
															local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
															local266 = Static549.aClass4_Sub13_Sub2_2.method7004();
															local5177 = (local262 & 0x8000) != 0;
															if (local5149.aString87 != null && local5149.aClass206_1 != null) {
																local3743 = false;
																if (local266 <= 1) {
																	if (!local5177 && (Static337.aBoolean442 && !Static477.aBoolean628 || Static16.aBoolean432)) {
																		local3743 = true;
																	} else if (Static21.method830(local5149.aString87)) {
																		local3743 = true;
																	}
																}
																if (!local3743 && Static425.anInt8157 == 0) {
																	local1000 = -1;
																	if (local5177) {
																		local262 &= 0x7FFF;
																		@Pc(5236) Class251 local5236 = Static421.method6314(Static549.aClass4_Sub13_Sub2_2);
																		local1000 = local5236.anInt7473;
																		local3754 = local5236.aClass4_Sub6_Sub3_1.method1926(Static549.aClass4_Sub13_Sub2_2);
																	} else {
																		local3754 = Static75.method1600(Static516.method7353(Static549.aClass4_Sub13_Sub2_2));
																	}
																	local5149.aString86 = local3754.trim();
																	local5149.anInt4240 = 150;
																	local5149.anInt4248 = local262 >> 8;
																	local5149.anInt4205 = local262 & 0xFF;
																	if (local266 == 1 || local266 == 2) {
																		local1004 = local5177 ? 17 : 1;
																	} else {
																		local1004 = local5177 ? 17 : 2;
																	}
																	if (local266 == 2) {
																		Static128.method2313(0, local1004, null, "<img=1>" + local5149.method3345(), local1000, local3754, "<img=1>" + local5149.method3348(), local5149.aString88);
																	} else if (local266 == 1) {
																		Static128.method2313(0, local1004, null, "<img=0>" + local5149.method3345(), local1000, local3754, "<img=0>" + local5149.method3348(), local5149.aString88);
																	} else {
																		Static128.method2313(0, local1004, null, local5149.method3345(), local1000, local3754, local5149.method3348(), local5149.aString88);
																	}
																}
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static58.aClass90_20) {
															local1830 = Static549.aClass4_Sub13_Sub2_2.method7016();
															local75 = Static549.aClass4_Sub13_Sub2_2.method6995();
															local262 = Static549.aClass4_Sub13_Sub2_2.method6995();
															if (Static260.method4122(local262)) {
																Static205.method3350(local75, local1830);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static17.aClass90_7) {
															if (Static514.aFrame2 != null) {
																Static503.method7242(-1, Static455.aClass4_Sub35_Sub1_1.anInt9917, false, -1);
															}
															@Pc(5425) byte[] local5425 = new byte[Static488.anInt9250];
															Static549.aClass4_Sub13_Sub2_2.method7059(local5425, Static488.anInt9250);
															local446 = Static380.method5901(local5425, 0, Static488.anInt9250);
															Static279.method4476(true, Static372.aClass366_5, local446, Static453.anInt8614 == 1);
															Static100.aClass90_34 = null;
															return true;
														} else if (Static168.aClass90_62 == Static100.aClass90_34) {
															Static374.method5811(Static375.aClass277_11);
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static44.aClass90_17) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7035();
															local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
															local262 = Static549.aClass4_Sub13_Sub2_2.method7046();
															if (Static260.method4122(local221)) {
																Static528.method7459(local75, local262);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static237.aClass90_78 == Static100.aClass90_34) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7004();
															if (Static549.aClass4_Sub13_Sub2_2.method7004() == 0) {
																Static299.aClass27Array1[local221] = new Class27();
															} else {
																Static549.aClass4_Sub13_Sub2_2.anInt9170--;
																Static299.aClass27Array1[local221] = new Class27(Static549.aClass4_Sub13_Sub2_2);
															}
															Static162.anInt3368 = Static422.anInt8117;
															Static100.aClass90_34 = null;
															return true;
														} else if (Static593.aClass90_153 == Static100.aClass90_34) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method6990();
															local75 = Static549.aClass4_Sub13_Sub2_2.method7035();
															local262 = Static549.aClass4_Sub13_Sub2_2.method6990();
															local266 = Static549.aClass4_Sub13_Sub2_2.method6995();
															if (local266 == 65535) {
																local266 = -1;
															}
															local270 = Static549.aClass4_Sub13_Sub2_2.method7035();
															if (local270 == 65535) {
																local270 = -1;
															}
															if (Static260.method4122(local75)) {
																for (local281 = local270; local281 <= local266; local281++) {
																	local292 = (long) local281 + ((long) local262 << 32);
																	local300 = (Class4_Sub40) Static433.aClass221_29.method5075(local292);
																	if (local300 != null) {
																		local312 = new Class4_Sub40(local221, local300.anInt8121);
																		local300.method8193();
																	} else if (local281 == -1) {
																		local312 = new Class4_Sub40(local221, Static558.method7916(local262).aClass4_Sub40_2.anInt8121);
																	} else {
																		local312 = new Class4_Sub40(local221, -1);
																	}
																	Static433.aClass221_29.method5073(local312, local292);
																}
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static67.aClass90_23 == Static100.aClass90_34) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
															@Pc(5654) int[] local5654 = new int[4];
															for (local262 = 0; local262 < 4; local262++) {
																local5654[local262] = Static549.aClass4_Sub13_Sub2_2.method7010();
															}
															local266 = Static549.aClass4_Sub13_Sub2_2.method7009();
															@Pc(5679) Class4_Sub29 local5679 = (Class4_Sub29) Static144.aClass221_6.method5075((long) local221);
															if (local5679 != null) {
																Static541.method7578(local266, local5654, local5679.aClass21_Sub1_Sub1_Sub1_Sub1_1);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static376.aClass90_104 == Static100.aClass90_34) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7010();
															local75 = Static549.aClass4_Sub13_Sub2_2.method6995();
															local262 = Static549.aClass4_Sub13_Sub2_2.method7010();
															local266 = Static549.aClass4_Sub13_Sub2_2.method7054();
															local270 = Static549.aClass4_Sub13_Sub2_2.method6990();
															if (Static260.method4122(local75)) {
																Static122.method2191(local270, local262 | local221 << 16, local266, 7);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static229.aClass90_77) {
															while (Static549.aClass4_Sub13_Sub2_2.anInt9170 < Static488.anInt9250) {
																local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
																local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
																local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
																local266 = Static549.aClass4_Sub13_Sub2_2.method7054();
																local270 = Static549.aClass4_Sub13_Sub2_2.method7004();
																local1981 = "";
																local1755 = false;
																if (local266 > 0) {
																	local1981 = Static549.aClass4_Sub13_Sub2_2.method7016();
																	local1755 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
																}
																for (local1000 = 0; local1000 < Static270.anInt5671; local1000++) {
																	if (local442) {
																		if (local448.equals(Static94.aStringArray7[local1000])) {
																			Static94.aStringArray7[local1000] = local446;
																			Static348.aStringArray25[local1000] = local448;
																			local446 = null;
																			break;
																		}
																	} else if (local446.equals(Static94.aStringArray7[local1000])) {
																		if (local266 != Static184.anIntArray182[local1000]) {
																			local4650 = true;
																			for (@Pc(5829) Class21_Sub3_Sub2 local5829 = (Class21_Sub3_Sub2) Static339.aClass158_15.method3726(); local5829 != null; local5829 = (Class21_Sub3_Sub2) Static339.aClass158_15.method3721()) {
																				if (local5829.aString234.equals(local446)) {
																					if (local266 != 0 && local5829.aShort125 == 0) {
																						local5829.method8246();
																						local4650 = false;
																					} else if (local266 == 0 && local5829.aShort125 != 0) {
																						local5829.method8246();
																						local4650 = false;
																					}
																				}
																			}
																			if (local4650) {
																				Static339.aClass158_15.method3720(new Class21_Sub3_Sub2(local446, local266));
																			}
																			Static184.anIntArray182[local1000] = local266;
																		}
																		Static348.aStringArray25[local1000] = local448;
																		Static84.aStringArray5[local1000] = local1981;
																		Static219.anIntArray225[local1000] = local270;
																		Static12.aBooleanArray1[local1000] = local1755;
																		local446 = null;
																		break;
																	}
																}
																if (local446 != null && Static270.anInt5671 < 200) {
																	Static94.aStringArray7[Static270.anInt5671] = local446;
																	Static348.aStringArray25[Static270.anInt5671] = local448;
																	Static184.anIntArray182[Static270.anInt5671] = local266;
																	Static84.aStringArray5[Static270.anInt5671] = local1981;
																	Static219.anIntArray225[Static270.anInt5671] = local270;
																	Static12.aBooleanArray1[Static270.anInt5671] = local1755;
																	Static270.anInt5671++;
																}
															}
															Static66.anInt1737 = 2;
															Static136.anInt3035 = Static422.anInt8117;
															local75 = Static270.anInt5671;
															while (local75 > 0) {
																local75--;
																local442 = true;
																for (local262 = 0; local262 < local75; local262++) {
																	if (Static326.aClass271_2.anInt7991 != Static184.anIntArray182[local262] && Static326.aClass271_2.anInt7991 == Static184.anIntArray182[local262 + 1] || Static184.anIntArray182[local262] == 0 && Static184.anIntArray182[local262 + 1] != 0) {
																		local266 = Static184.anIntArray182[local262];
																		Static184.anIntArray182[local262] = Static184.anIntArray182[local262 + 1];
																		Static184.anIntArray182[local262 + 1] = local266;
																		local1977 = Static84.aStringArray5[local262];
																		Static84.aStringArray5[local262] = Static84.aStringArray5[local262 + 1];
																		Static84.aStringArray5[local262 + 1] = local1977;
																		local1981 = Static94.aStringArray7[local262];
																		Static94.aStringArray7[local262] = Static94.aStringArray7[local262 + 1];
																		Static94.aStringArray7[local262 + 1] = local1981;
																		local3754 = Static348.aStringArray25[local262];
																		Static348.aStringArray25[local262] = Static348.aStringArray25[local262 + 1];
																		Static348.aStringArray25[local262 + 1] = local3754;
																		local1000 = Static219.anIntArray225[local262];
																		Static219.anIntArray225[local262] = Static219.anIntArray225[local262 + 1];
																		Static219.anIntArray225[local262 + 1] = local1000;
																		local4650 = Static12.aBooleanArray1[local262];
																		Static12.aBooleanArray1[local262] = Static12.aBooleanArray1[local262 + 1];
																		local442 = false;
																		Static12.aBooleanArray1[local262 + 1] = local4650;
																	}
																}
																if (local442) {
																	break;
																}
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static79.aClass90_28) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
															local75 = Static549.aClass4_Sub13_Sub2_2.method6990();
															if (Static260.method4122(local221)) {
																@Pc(6151) Class4_Sub45 local6151 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local75);
																if (local6151 != null) {
																	Static205.method3352(true, local6151, false);
																}
																if (Static238.aClass155_6 != null) {
																	Static368.method5060(Static238.aClass155_6);
																	Static238.aClass155_6 = null;
																}
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static433.aClass90_112) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7005();
															local75 = Static549.aClass4_Sub13_Sub2_2.method7035();
															local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
															if (Static260.method4122(local262)) {
																if (local221 == 2) {
																	Static139.method2486();
																}
																Static446.anInt8493 = local75;
																Static150.method2578(local75);
																Static284.method4495(false);
																Static471.method6880(Static446.anInt8493);
																for (local266 = 0; local266 < 100; local266++) {
																	Static155.aBooleanArray6[local266] = true;
																}
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static312.aClass90_88) {
															local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
															local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
															local448 = local446;
															if (local442) {
																local448 = Static549.aClass4_Sub13_Sub2_2.method7016();
															}
															local266 = Static549.aClass4_Sub13_Sub2_2.method7004();
															local5177 = false;
															if (local266 <= 1) {
																if (Static337.aBoolean442 && !Static477.aBoolean628 || Static16.aBoolean432) {
																	local5177 = true;
																} else if (local266 <= 1 && Static21.method830(local448)) {
																	local5177 = true;
																}
															}
															if (!local5177 && Static425.anInt8157 == 0) {
																local1981 = Static75.method1600(Static516.method7353(Static549.aClass4_Sub13_Sub2_2));
																if (local266 == 2) {
																	Static128.method2313(0, 24, null, "<img=1>" + local446, -1, local1981, "<img=1>" + local448, local446);
																} else if (local266 == 1) {
																	Static128.method2313(0, 24, null, "<img=0>" + local446, -1, local1981, "<img=0>" + local448, local446);
																} else {
																	Static128.method2313(0, 24, null, local446, -1, local1981, local448, local446);
																}
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static356.aClass90_98) {
															Static515.anInt4123 = Static549.aClass4_Sub13_Sub2_2.method7045() << 3;
															Static409.anInt7962 = Static549.aClass4_Sub13_Sub2_2.method7007() << 3;
															Static364.anInt7024 = Static549.aClass4_Sub13_Sub2_2.method7005();
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static325.aClass90_91) {
															Static100.aClass90_34 = null;
															return false;
														} else if (Static320.aClass90_89 == Static100.aClass90_34) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method6989();
															local75 = Static549.aClass4_Sub13_Sub2_2.method7010();
															if (Static260.method4122(local75)) {
																if (local221 == -1) {
																	Static453.anInt8613 = -1;
																	Static587.anInt10508 = -1;
																} else {
																	local262 = local221 >> 14 & 0x3FFF;
																	local262 -= Static242.anInt10133;
																	local266 = local221 & 0x3FFF;
																	local266 -= Static157.anInt3323;
																	if (local262 < 0) {
																		local262 = 0;
																	} else if (Static338.anInt6508 <= local262) {
																		local262 = Static338.anInt6508;
																	}
																	Static587.anInt10508 = (local262 << 9) + 256;
																	if (local266 < 0) {
																		local266 = 0;
																	} else if (local266 >= Static390.anInt7654) {
																		local266 = Static390.anInt7654;
																	}
																	Static453.anInt8613 = (local266 << 9) + 256;
																}
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static450.aClass90_115) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
															if (local221 == 65535) {
																local221 = -1;
															}
															local75 = Static549.aClass4_Sub13_Sub2_2.method6993();
															local262 = Static549.aClass4_Sub13_Sub2_2.method7054();
															if (Static260.method4122(local262)) {
																Static12.method741(local75, local221);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static501.aClass90_130) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
															local75 = Static549.aClass4_Sub13_Sub2_2.method7004();
															local262 = Static549.aClass4_Sub13_Sub2_2.method7004();
															local266 = Static549.aClass4_Sub13_Sub2_2.method7054() << 2;
															local270 = Static549.aClass4_Sub13_Sub2_2.method7004();
															local281 = Static549.aClass4_Sub13_Sub2_2.method7004();
															if (Static260.method4122(local221)) {
																Static374.method5813(local266, true, local75, local270, local281, local262);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static491.aClass90_127) {
															Static157.method2656();
															Static100.aClass90_34 = null;
															return false;
														} else if (Static29.aClass90_12 == Static100.aClass90_34) {
															Static374.method5811(Static276.aClass277_10);
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static23.aClass90_8) {
															Static374.method5811(Static424.aClass277_13);
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static162.aClass90_58) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7035();
															local446 = Static549.aClass4_Sub13_Sub2_2.method7016();
															local262 = Static549.aClass4_Sub13_Sub2_2.method7046();
															if (Static260.method4122(local221)) {
																Static345.method5258(local262, local446);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static71.aClass90_24 == Static100.aClass90_34) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7010();
															local1959 = Static549.aClass4_Sub13_Sub2_2.method6987() == 1;
															if (Static260.method4122(local221)) {
																Static324.aBoolean435 = local1959;
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static46.aClass90_18) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
															local75 = Static549.aClass4_Sub13_Sub2_2.method7035();
															local262 = Static549.aClass4_Sub13_Sub2_2.method6993();
															if (Static260.method4122(local221)) {
																Static210.method8151(local262, local75);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static460.aClass90_118 == Static100.aClass90_34) {
															Static457.method6721();
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static197.aClass90_70) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method6987();
															local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
															@Pc(6699) byte local6699 = Static549.aClass4_Sub13_Sub2_2.method7007();
															if (Static260.method4122(local75)) {
																Static242.method7879(local6699, local221);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static113.aClass90_36) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method6995();
															local75 = Static549.aClass4_Sub13_Sub2_2.method7054();
															local262 = Static549.aClass4_Sub13_Sub2_2.method7009();
															local266 = Static549.aClass4_Sub13_Sub2_2.method7046();
															if (Static260.method4122(local75)) {
																local3451 = (Class4_Sub45) Static569.aClass221_27.method5075((long) local266);
																if (local3451 != null) {
																	Static205.method3352(local221 != local3451.anInt9096, local3451, false);
																}
																Static21.method829(local262, local266, false, local221);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static142.aClass90_47) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7019();
															local75 = Static549.aClass4_Sub13_Sub2_2.method6990();
															local262 = Static549.aClass4_Sub13_Sub2_2.method7004();
															local1967 = "";
															local1977 = local1967;
															if ((local262 & 0x1) != 0) {
																local1967 = Static549.aClass4_Sub13_Sub2_2.method7016();
																if ((local262 & 0x2) == 0) {
																	local1977 = local1967;
																} else {
																	local1977 = Static549.aClass4_Sub13_Sub2_2.method7016();
																}
															}
															local1981 = Static549.aClass4_Sub13_Sub2_2.method7016();
															if (local221 == 99) {
																Static47.method1139(local1981);
															} else if (local1977.equals("") || !Static21.method830(local1977)) {
																Static84.method1791(local221, local1977, local1967, local1981, local75, local1967);
															} else {
																Static100.aClass90_34 = null;
																return true;
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static100.aClass90_34 == Static366.aClass90_100) {
															local221 = Static549.aClass4_Sub13_Sub2_2.method7054();
															local75 = Static549.aClass4_Sub13_Sub2_2.method6990();
															local262 = Static549.aClass4_Sub13_Sub2_2.method6993();
															local266 = Static549.aClass4_Sub13_Sub2_2.method6995();
															if (Static260.method4122(local266)) {
																Static122.method2191(local262, local221, local75, 5);
															}
															Static100.aClass90_34 = null;
															return true;
														} else if (Static76.aClass90_26 == Static100.aClass90_34) {
															Static34.method3924();
															Static100.aClass90_34 = null;
															return true;
														} else if (Static483.aClass90_123 == Static100.aClass90_34) {
															Static338.method5150(Static372.aClass366_5, Static488.anInt9250, Static549.aClass4_Sub13_Sub2_2);
															Static100.aClass90_34 = null;
															return true;
														} else if (Static144.aClass90_49 == Static100.aClass90_34) {
															local442 = Static549.aClass4_Sub13_Sub2_2.method7004() == 1;
															@Pc(6915) byte[] local6915 = new byte[Static488.anInt9250 - 1];
															Static549.aClass4_Sub13_Sub2_2.method7049(local6915, Static488.anInt9250 - 1);
															Static239.method3892(local6915, local442);
															Static100.aClass90_34 = null;
															return true;
														} else {
															Static109.method2014("T1 - " + (Static100.aClass90_34 == null ? -1 : Static100.aClass90_34.method2107()) + "," + (Static528.aClass90_133 == null ? -1 : Static528.aClass90_133.method2107()) + "," + (Static79.aClass90_29 == null ? -1 : Static79.aClass90_29.method2107()) + " - " + Static488.anInt9250, null);
															Static254.method4043(false);
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

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIFIFIIII[F)V")
	public static void method4961(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) float arg3, @OriginalArg(4) int arg4, @OriginalArg(5) float arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) float[] arg9) {
		@Pc(5) int local5 = arg7 - arg1;
		@Pc(9) int local9 = arg0 - arg6;
		@Pc(13) int local13 = arg4 - arg8;
		@Pc(38) float local38 = (float) local13 * arg9[2] + (float) local5 * arg9[1] + (float) local9 * arg9[0];
		@Pc(59) float local59 = (float) local13 * arg9[5] + arg9[4] * (float) local5 + arg9[3] * (float) local9;
		@Pc(84) float local84 = (float) local13 * arg9[8] + (float) local5 * arg9[7] + (float) local9 * arg9[6];
		@Pc(95) float local95 = (float) Math.atan2((double) local38, (double) local84) / 6.2831855F + 0.5F;
		if (arg3 != 1.0F) {
			local95 *= arg3;
		}
		@Pc(109) float local109 = arg5 + local59 + 0.5F;
		@Pc(132) float local132;
		if (arg2 == 1) {
			local132 = local95;
			local95 = -local109;
			local109 = local132;
		} else if (arg2 == 2) {
			local95 = -local95;
			local109 = -local109;
		} else if (arg2 == 3) {
			local132 = local95;
			local95 = local109;
			local109 = -local132;
		}
		Static254.aFloat111 = local95;
		Static166.aFloat81 = local109;
	}
}
