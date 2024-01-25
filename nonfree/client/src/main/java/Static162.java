import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!hq", name = "E", descriptor = "[Lclient!md;")
	public static final Interface10[] anInterface10Array2 = new Interface10[128];

	@OriginalMember(owner = "client!hq", name = "d", descriptor = "(B)Z")
	public static boolean method2295() throws IOException {
		if (Static14.aClass99_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static445.aClass129_65 == null) {
			if (Static251.aBoolean267) {
				if (!Static14.aClass99_2.method4961(1)) {
					return false;
				}
				Static14.aClass99_2.method4959(0, Static76.aClass5_Sub15_Sub2_1.aByteArray93, 1);
				Static251.aBoolean267 = false;
				Static237.anInt6789++;
				Static299.anInt4665 = 0;
			}
			Static76.aClass5_Sub15_Sub2_1.anInt7013 = 0;
			if (Static76.aClass5_Sub15_Sub2_1.method5615()) {
				if (!Static14.aClass99_2.method4961(1)) {
					return false;
				}
				Static14.aClass99_2.method4959(1, Static76.aClass5_Sub15_Sub2_1.aByteArray93, 1);
				Static237.anInt6789++;
				Static299.anInt4665 = 0;
			}
			Static251.aBoolean267 = true;
			@Pc(69) Class129[] local69 = Static49.method794();
			local73 = Static76.aClass5_Sub15_Sub2_1.method5611();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static76.aClass5_Sub15_Sub2_1.anInt7013);
			}
			Static445.aClass129_65 = local69[local73];
			Static128.anInt2223 = Static445.aClass129_65.anInt3357;
		}
		if (Static128.anInt2223 == -1) {
			if (!Static14.aClass99_2.method4961(1)) {
				return false;
			}
			Static14.aClass99_2.method4959(0, Static76.aClass5_Sub15_Sub2_1.aByteArray93, 1);
			Static299.anInt4665 = 0;
			Static237.anInt6789++;
			Static128.anInt2223 = Static76.aClass5_Sub15_Sub2_1.aByteArray93[0] & 0xFF;
		}
		if (Static128.anInt2223 == -2) {
			if (!Static14.aClass99_2.method4961(2)) {
				return false;
			}
			Static14.aClass99_2.method4959(0, Static76.aClass5_Sub15_Sub2_1.aByteArray93, 2);
			Static76.aClass5_Sub15_Sub2_1.anInt7013 = 0;
			Static128.anInt2223 = Static76.aClass5_Sub15_Sub2_1.method5598();
			Static299.anInt4665 = 0;
			Static237.anInt6789 += 2;
		}
		if (Static128.anInt2223 > 0) {
			if (!Static14.aClass99_2.method4961(Static128.anInt2223)) {
				return false;
			}
			Static76.aClass5_Sub15_Sub2_1.anInt7013 = 0;
			Static14.aClass99_2.method4959(0, Static76.aClass5_Sub15_Sub2_1.aByteArray93, Static128.anInt2223);
			Static299.anInt4665 = 0;
			Static237.anInt6789 += Static128.anInt2223;
		}
		Static285.aClass129_114 = Static304.aClass129_129;
		Static304.aClass129_129 = Static279.aClass129_109;
		Static279.aClass129_109 = Static445.aClass129_65;
		@Pc(223) int local223;
		@Pc(211) int local211;
		@Pc(219) int local219;
		if (Static457.aClass129_192 == Static445.aClass129_65) {
			local211 = Static76.aClass5_Sub15_Sub2_1.method5559();
			local73 = Static76.aClass5_Sub15_Sub2_1.method5546();
			local219 = Static76.aClass5_Sub15_Sub2_1.method5591();
			local223 = Static76.aClass5_Sub15_Sub2_1.method5591();
			if (Static15.method264(local73)) {
				Static44.method701(local211, local219 + (local223 << 16));
			}
			Static445.aClass129_65 = null;
			return true;
		} else if (Static241.aClass129_95 == Static445.aClass129_65) {
			Static17.anInt358 = Static76.aClass5_Sub15_Sub2_1.method5578();
			Static379.anInt4394 = Static76.aClass5_Sub15_Sub2_1.method5539();
			Static445.aClass129_65 = null;
			return true;
		} else {
			@Pc(311) int local311;
			@Pc(404) int local404;
			@Pc(278) String local278;
			@Pc(261) String local261;
			@Pc(292) boolean local292;
			@Pc(394) int local394;
			@Pc(272) boolean local272;
			@Pc(365) String local365;
			@Pc(369) Class124 local369;
			if (Static387.aClass129_171 == Static445.aClass129_65) {
				local261 = Static76.aClass5_Sub15_Sub2_1.method5549();
				local272 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
				if (local272) {
					local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
				} else {
					local278 = local261;
				}
				local223 = Static76.aClass5_Sub15_Sub2_1.method5598();
				@Pc(290) byte local290 = Static76.aClass5_Sub15_Sub2_1.method5600();
				local292 = false;
				if (local290 == -128) {
					local292 = true;
				}
				if (local292) {
					if (Static406.anInt6806 == 0) {
						Static445.aClass129_65 = null;
						return true;
					}
					for (local311 = 0; Static406.anInt6806 > local311 && (!Static349.aClass124Array1[local311].aString37.equals(local278) || local223 != Static349.aClass124Array1[local311].anInt3260); local311++) {
					}
					if (local311 < Static406.anInt6806) {
						while (Static406.anInt6806 - 1 > local311) {
							Static349.aClass124Array1[local311] = Static349.aClass124Array1[local311 + 1];
							local311++;
						}
						Static406.anInt6806--;
						Static349.aClass124Array1[Static406.anInt6806] = null;
					}
				} else {
					local365 = Static76.aClass5_Sub15_Sub2_1.method5549();
					local369 = new Class124();
					local369.aString36 = local261;
					local369.aString37 = local278;
					local369.aString38 = Static12.method193(local369.aString37);
					local369.aString35 = local365;
					local369.aByte32 = local290;
					local369.anInt3260 = local223;
					for (local394 = Static406.anInt6806 - 1; local394 >= 0; local394--) {
						local404 = Static349.aClass124Array1[local394].aString38.compareTo(local369.aString38);
						if (local404 == 0) {
							Static349.aClass124Array1[local394].anInt3260 = local223;
							Static349.aClass124Array1[local394].aByte32 = local290;
							Static349.aClass124Array1[local394].aString35 = local365;
							if (local278.equals(Static220.aClass2_Sub1_Sub3_Sub2_1.aString65)) {
								Static242.aByte47 = local290;
							}
							Static215.anInt3591 = Static319.anInt4969;
							Static445.aClass129_65 = null;
							return true;
						}
						if (local404 < 0) {
							break;
						}
					}
					if (Static406.anInt6806 >= Static349.aClass124Array1.length) {
						Static445.aClass129_65 = null;
						return true;
					}
					for (local404 = Static406.anInt6806 - 1; local404 > local394; local404--) {
						Static349.aClass124Array1[local404 + 1] = Static349.aClass124Array1[local404];
					}
					if (Static406.anInt6806 == 0) {
						Static349.aClass124Array1 = new Class124[100];
					}
					Static349.aClass124Array1[local394 + 1] = local369;
					Static406.anInt6806++;
					if (local278.equals(Static220.aClass2_Sub1_Sub3_Sub2_1.aString65)) {
						Static242.aByte47 = local290;
					}
				}
				Static215.anInt3591 = Static319.anInt4969;
				Static445.aClass129_65 = null;
				return true;
			} else if (Static296.aClass129_121 == Static445.aClass129_65) {
				local211 = Static76.aClass5_Sub15_Sub2_1.method5539();
				local73 = local211 >> 5;
				local219 = local211 & 0x1F;
				if (local219 == 0) {
					Static186.aClass266Array1[local73] = null;
					Static445.aClass129_65 = null;
					return true;
				}
				@Pc(533) Class266 local533 = new Class266();
				local533.anInt7406 = local219;
				local533.anInt7412 = Static76.aClass5_Sub15_Sub2_1.method5539();
				if (local533.anInt7412 >= 0 && Static278.aClass49Array10.length > local533.anInt7412) {
					if (local533.anInt7406 == 1 || local533.anInt7406 == 10) {
						local533.anInt7405 = Static76.aClass5_Sub15_Sub2_1.method5598();
						Static76.aClass5_Sub15_Sub2_1.anInt7013 += 6;
					} else if (local533.anInt7406 >= 2 && local533.anInt7406 <= 6) {
						if (local533.anInt7406 == 2) {
							local533.anInt7413 = 64;
							local533.anInt7410 = 64;
						}
						if (local533.anInt7406 == 3) {
							local533.anInt7410 = 0;
							local533.anInt7413 = 64;
						}
						if (local533.anInt7406 == 4) {
							local533.anInt7413 = 64;
							local533.anInt7410 = 128;
						}
						if (local533.anInt7406 == 5) {
							local533.anInt7410 = 64;
							local533.anInt7413 = 0;
						}
						if (local533.anInt7406 == 6) {
							local533.anInt7410 = 64;
							local533.anInt7413 = 128;
						}
						local533.anInt7406 = 2;
						local533.anInt7403 = Static76.aClass5_Sub15_Sub2_1.method5539();
						local533.anInt7410 += Static76.aClass5_Sub15_Sub2_1.method5598() - Static31.anInt618 << 7;
						local533.anInt7413 += Static76.aClass5_Sub15_Sub2_1.method5598() - Static226.anInt3768 << 7;
						local533.anInt7404 = Static76.aClass5_Sub15_Sub2_1.method5539() << 0;
						local533.anInt7407 = Static76.aClass5_Sub15_Sub2_1.method5598();
					}
					local533.anInt7411 = Static76.aClass5_Sub15_Sub2_1.method5598();
					if (local533.anInt7411 == 65535) {
						local533.anInt7411 = -1;
					}
					Static186.aClass266Array1[local73] = local533;
				}
				Static445.aClass129_65 = null;
				return true;
			} else if (Static445.aClass129_65 == Static89.aClass129_44) {
				Static367.anInt5964 = Static76.aClass5_Sub15_Sub2_1.method5582() << 3;
				Static45.anInt39 = Static76.aClass5_Sub15_Sub2_1.method5582() << 3;
				Static444.anInt7351 = Static76.aClass5_Sub15_Sub2_1.method5539();
				Static445.aClass129_65 = null;
				return true;
			} else if (Static445.aClass129_65 == Static310.aClass129_131) {
				local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
				local73 = Static76.aClass5_Sub15_Sub2_1.method5559();
				local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
				if (Static15.method264(local219)) {
					Static377.method4937(local211, local73);
				}
				Static445.aClass129_65 = null;
				return true;
			} else if (Static115.aClass129_57 == Static445.aClass129_65) {
				Static444.method5902(Static280.aClass163_7);
				Static445.aClass129_65 = null;
				return true;
			} else if (Static388.aClass129_177 == Static445.aClass129_65) {
				Static221.anInt3661 = Static76.aClass5_Sub15_Sub2_1.method5539();
				Static445.aClass129_65 = null;
				return true;
			} else {
				@Pc(793) boolean local793;
				@Pc(799) String local799;
				@Pc(809) long local809;
				@Pc(814) long local814;
				@Pc(819) long local819;
				@Pc(834) int local834;
				if (Static445.aClass129_65 == Static309.aClass129_130) {
					local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
					local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
					local799 = local278;
					if (local793) {
						local799 = Static76.aClass5_Sub15_Sub2_1.method5549();
					}
					local809 = Static76.aClass5_Sub15_Sub2_1.method5553();
					local814 = Static76.aClass5_Sub15_Sub2_1.method5598();
					local819 = Static76.aClass5_Sub15_Sub2_1.method5541();
					local404 = Static76.aClass5_Sub15_Sub2_1.method5539();
					@Pc(830) long local830 = (local814 << 32) + local819;
					@Pc(832) boolean local832 = false;
					local834 = 0;
					while (true) {
						if (local834 >= 100) {
							if (local404 <= 1) {
								if (Static408.aBoolean459 && !Static337.aBoolean377 || Static146.aBoolean172) {
									local832 = true;
								} else if (Static333.method4129(local799)) {
									local832 = true;
								}
							}
							break;
						}
						if (Static28.aLongArray34[local834] == local830) {
							local832 = true;
							break;
						}
						local834++;
					}
					if (!local832 && Static219.anInt3646 == 0) {
						Static28.aLongArray34[Static19.anInt416] = local830;
						Static19.anInt416 = (Static19.anInt416 + 1) % 100;
						@Pc(895) String local895 = Static5.method81(Static271.method3662(Static76.aClass5_Sub15_Sub2_1));
						if (local404 == 2 || local404 == 3) {
							Static84.method1238("<img=1>" + local278, 0, Static95.method1333(local809), local895, "<img=1>" + local799, -1, 9);
						} else if (local404 == 1) {
							Static84.method1238("<img=0>" + local278, 0, Static95.method1333(local809), local895, "<img=0>" + local799, -1, 9);
						} else {
							Static84.method1238(local278, 0, Static95.method1333(local809), local895, local799, -1, 9);
						}
					}
					Static445.aClass129_65 = null;
					return true;
				} else if (Static445.aClass129_65 == Static374.aClass129_168) {
					Static332.method4112();
					Static445.aClass129_65 = null;
					return false;
				} else if (Static445.aClass129_65 == Static402.aClass129_180) {
					Static444.method5902(Static366.aClass163_11);
					Static445.aClass129_65 = null;
					return true;
				} else if (Static445.aClass129_65 == Static329.aClass129_140) {
					Static115.anInt1963 = Static76.aClass5_Sub15_Sub2_1.method5558();
					Static408.aBoolean459 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
					Static445.aClass129_65 = null;
					return true;
				} else if (Static445.aClass129_65 == Static1.aClass129_115) {
					local261 = Static76.aClass5_Sub15_Sub2_1.method5549();
					local73 = Static76.aClass5_Sub15_Sub2_1.method5591();
					if (local73 == 65535) {
						local73 = -1;
					}
					local219 = Static76.aClass5_Sub15_Sub2_1.method5594();
					local223 = Static76.aClass5_Sub15_Sub2_1.method5578();
					if (local219 >= 1 && local219 <= 8) {
						if (local261.equalsIgnoreCase("null")) {
							local261 = null;
						}
						Static33.aStringArray4[local219 - 1] = local261;
						Static326.anIntArray374[local219 - 1] = local73;
						Static422.aBooleanArray26[local219 - 1] = local223 == 0;
					}
					Static445.aClass129_65 = null;
					return true;
				} else if (Static445.aClass129_65 == Static60.aClass129_24) {
					@Pc(1092) byte local1092 = Static76.aClass5_Sub15_Sub2_1.method5582();
					local73 = Static76.aClass5_Sub15_Sub2_1.method5593();
					Static408.aClass39_1.method965(local1092, local73);
					Static445.aClass129_65 = null;
					return true;
				} else {
					@Pc(1158) int local1158;
					@Pc(1163) int local1163;
					if (Static445.aClass129_65 == Static178.aClass129_158) {
						Static367.anInt5964 = Static76.aClass5_Sub15_Sub2_1.method5582() << 3;
						Static444.anInt7351 = Static76.aClass5_Sub15_Sub2_1.method5585();
						Static45.anInt39 = Static76.aClass5_Sub15_Sub2_1.method5600() << 3;
						for (@Pc(1129) Class5_Sub24 local1129 = (Class5_Sub24) Static400.aClass252_38.method5660(); local1129 != null; local1129 = (Class5_Sub24) Static400.aClass252_38.method5666()) {
							local73 = (int) (local1129.aLong234 >> 28 & 0x3L);
							local219 = (int) (local1129.aLong234 & 0x3FFFL);
							local223 = local219 - Static31.anInt618;
							local1158 = (int) (local1129.aLong234 >> 14 & 0x3FFFL);
							local1163 = local1158 - Static226.anInt3768;
							if (Static444.anInt7351 == local73 && Static367.anInt5964 <= local223 && local223 < Static367.anInt5964 + 8 && Static45.anInt39 <= local1163 && Static45.anInt39 + 8 > local1163) {
								local1129.method6003();
								if (local223 >= 0 && local1163 >= 0 && Static433.anInt7210 > local223 && local1163 < Static418.anInt6969) {
									Static235.method3042(local1163, Static444.anInt7351, local223);
								}
							}
						}
						for (@Pc(1236) Class5_Sub3 local1236 = (Class5_Sub3) Static242.aClass177_24.method3618(); local1236 != null; local1236 = (Class5_Sub3) Static242.aClass177_24.method3619()) {
							if (Static367.anInt5964 <= local1236.anInt338 && local1236.anInt338 < Static367.anInt5964 + 8 && local1236.anInt336 >= Static45.anInt39 && local1236.anInt336 < Static45.anInt39 + 8 && local1236.anInt330 == Static444.anInt7351) {
								local1236.anInt335 = 0;
							}
						}
						Static445.aClass129_65 = null;
						return true;
					} else if (Static445.aClass129_65 == Static367.aClass129_163) {
						local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
						if (local211 == 65535) {
							local211 = -1;
						}
						local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
						local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
						local223 = Static76.aClass5_Sub15_Sub2_1.method5539();
						Static297.method3692(local211, local223, local219, local73);
						Static445.aClass129_65 = null;
						return true;
					} else if (Static445.aClass129_65 == Static177.aClass129_78) {
						Static429.method5669(Static76.aClass5_Sub15_Sub2_1, Static7.aClass93_1, Static128.anInt2223);
						Static445.aClass129_65 = null;
						return true;
					} else if (Static273.aClass129_105 == Static445.aClass129_65) {
						local211 = Static76.aClass5_Sub15_Sub2_1.method5537();
						local73 = Static76.aClass5_Sub15_Sub2_1.method5573();
						local219 = Static76.aClass5_Sub15_Sub2_1.method5563();
						local223 = Static76.aClass5_Sub15_Sub2_1.method5546();
						if (Static15.method264(local223)) {
							Static89.method1304(local211, local219, local73);
						}
						Static445.aClass129_65 = null;
						return true;
					} else if (Static77.aClass129_32 == Static445.aClass129_65) {
						local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
						if (Static15.method264(local211)) {
							Static313.method4876();
						}
						Static445.aClass129_65 = null;
						return true;
					} else if (Static75.aClass129_31 == Static445.aClass129_65) {
						local211 = Static76.aClass5_Sub15_Sub2_1.method5563();
						local73 = Static76.aClass5_Sub15_Sub2_1.method5603();
						local219 = Static76.aClass5_Sub15_Sub2_1.method5546();
						local223 = Static76.aClass5_Sub15_Sub2_1.method5546();
						if (Static15.method264(local219)) {
							Static84.method1237(local223, local73, local211, 5);
						}
						Static445.aClass129_65 = null;
						return true;
					} else if (Static445.aClass129_65 == Static179.aClass129_79) {
						local211 = Static76.aClass5_Sub15_Sub2_1.method5591();
						local73 = Static76.aClass5_Sub15_Sub2_1.method5547();
						local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
						if (Static15.method264(local219)) {
							Static307.method3798(local73, local211);
						}
						Static445.aClass129_65 = null;
						return true;
					} else if (Static445.aClass129_65 == Static86.aClass129_41) {
						local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
						local73 = Static76.aClass5_Sub15_Sub2_1.method5598();
						local219 = Static76.aClass5_Sub15_Sub2_1.method5578();
						@Pc(1461) Class5_Sub7 local1461 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local211);
						if (local1461 != null) {
							Static202.method2688(local73, local219, local1461.aClass2_Sub1_Sub3_Sub1_1);
						}
						Static445.aClass129_65 = null;
						return true;
					} else if (Static445.aClass129_65 == Static64.aClass129_25) {
						Static444.method5902(Static406.aClass163_14);
						Static445.aClass129_65 = null;
						return true;
					} else if (Static445.aClass129_65 == Static312.aClass129_133) {
						local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
						local73 = Static76.aClass5_Sub15_Sub2_1.method5563();
						local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
						if (Static15.method264(local211)) {
							Static96.method1352(local219, local73);
						}
						Static445.aClass129_65 = null;
						return true;
					} else if (Static384.aClass129_185 == Static445.aClass129_65) {
						Static445.aClass129_65 = null;
						Static62.anInt1134 = Static319.anInt4969;
						Static244.anInt3937 = 1;
						return true;
					} else if (Static415.aClass129_182 == Static445.aClass129_65) {
						local211 = Static76.aClass5_Sub15_Sub2_1.method5559();
						local73 = Static76.aClass5_Sub15_Sub2_1.method5593();
						if (local73 == 65535) {
							local73 = -1;
						}
						local219 = Static76.aClass5_Sub15_Sub2_1.method5546();
						if (Static15.method264(local219)) {
							Static84.method1237(local73, local211, -1, 2);
						}
						Static445.aClass129_65 = null;
						return true;
					} else {
						@Pc(1597) int local1597;
						@Pc(1611) int local1611;
						if (Static445.aClass129_65 == Static429.aClass129_187) {
							local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
							local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
							local799 = local278;
							if (local793) {
								local799 = Static76.aClass5_Sub15_Sub2_1.method5549();
							}
							local809 = Static76.aClass5_Sub15_Sub2_1.method5598();
							local814 = Static76.aClass5_Sub15_Sub2_1.method5541();
							local1597 = Static76.aClass5_Sub15_Sub2_1.method5539();
							local394 = Static76.aClass5_Sub15_Sub2_1.method5598();
							@Pc(1607) long local1607 = local814 + (local809 << 32);
							@Pc(1609) boolean local1609 = false;
							local1611 = 0;
							while (true) {
								if (local1611 >= 100) {
									if (local1597 <= 1 && Static333.method4129(local799)) {
										local1609 = true;
									}
									break;
								}
								if (local1607 == Static28.aLongArray34[local1611]) {
									local1609 = true;
									break;
								}
								local1611++;
							}
							if (!local1609 && Static219.anInt3646 == 0) {
								Static28.aLongArray34[Static19.anInt416] = local1607;
								Static19.anInt416 = (Static19.anInt416 + 1) % 100;
								@Pc(1665) String local1665 = Static407.aClass20_2.method458(local394).method4699(Static76.aClass5_Sub15_Sub2_1);
								if (local1597 == 2) {
									Static84.method1238("<img=1>" + local278, 0, null, local1665, "<img=1>" + local799, local394, 18);
								} else if (local1597 == 1) {
									Static84.method1238("<img=0>" + local278, 0, null, local1665, "<img=0>" + local799, local394, 18);
								} else {
									Static84.method1238(local278, 0, null, local1665, local799, local394, 18);
								}
							}
							Static445.aClass129_65 = null;
							return true;
						} else if (Static109.aClass129_52 == Static445.aClass129_65) {
							if (Static199.anInt3319 != -1) {
								Static391.method5105(Static199.anInt3319, 0);
							}
							Static445.aClass129_65 = null;
							return true;
						} else if (Static23.aClass129_11 == Static445.aClass129_65) {
							local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
							@Pc(1765) byte[] local1765 = new byte[Static128.anInt2223 - 1];
							Static76.aClass5_Sub15_Sub2_1.method5540(Static128.anInt2223 - 1, local1765);
							Static227.method2993(local793, local1765);
							Static445.aClass129_65 = null;
							return true;
						} else if (Static464.aClass129_188 == Static445.aClass129_65) {
							for (local211 = 0; local211 < Static359.aClass2_Sub1_Sub3_Sub2Array1.length; local211++) {
								if (Static359.aClass2_Sub1_Sub3_Sub2Array1[local211] != null) {
									Static359.aClass2_Sub1_Sub3_Sub2Array1[local211].anInt6193 = -1;
								}
							}
							for (local73 = 0; local73 < Static111.anInt1879; local73++) {
								Static277.aClass5_Sub7Array1[local73].aClass2_Sub1_Sub3_Sub1_1.anInt6193 = -1;
							}
							Static445.aClass129_65 = null;
							return true;
						} else if (Static445.aClass129_65 == Static54.aClass129_20) {
							local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
							local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
							local272 = (local73 & 0x1) == 1;
							Static345.method4478(local211, local272);
							local223 = Static76.aClass5_Sub15_Sub2_1.method5598();
							for (local1158 = 0; local1158 < local223; local1158++) {
								local1163 = Static76.aClass5_Sub15_Sub2_1.method5585();
								if (local1163 == 255) {
									local1163 = Static76.aClass5_Sub15_Sub2_1.method5603();
								}
								local311 = Static76.aClass5_Sub15_Sub2_1.method5593();
								Static99.method1395(local1158, local211, local1163, local272, local311 - 1);
							}
							Static369.anIntArray428[Static327.anInt1023++ & 0x1F] = local211;
							Static445.aClass129_65 = null;
							return true;
						} else if (Static445.aClass129_65 == Static298.aClass129_123) {
							Static76.aClass5_Sub15_Sub2_1.anInt7013 += 28;
							if (Static76.aClass5_Sub15_Sub2_1.method5554()) {
								Static344.method4472(Static76.aClass5_Sub15_Sub2_1, Static76.aClass5_Sub15_Sub2_1.anInt7013 - 28);
							}
							Static445.aClass129_65 = null;
							return true;
						} else if (Static445.aClass129_65 == Static19.aClass129_9) {
							Static444.method5902(Static439.aClass163_17);
							Static445.aClass129_65 = null;
							return true;
						} else if (Static345.aClass129_155 == Static445.aClass129_65) {
							local261 = Static76.aClass5_Sub15_Sub2_1.method5549();
							local73 = Static76.aClass5_Sub15_Sub2_1.method5598();
							local799 = Static407.aClass20_2.method458(local73).method4699(Static76.aClass5_Sub15_Sub2_1);
							Static84.method1238(local261, 0, null, local799, local261, local73, 19);
							Static445.aClass129_65 = null;
							return true;
						} else if (Static164.aClass129_72 == Static445.aClass129_65) {
							Static444.method5902(Static377.aClass163_13);
							Static445.aClass129_65 = null;
							return true;
						} else if (Static107.aClass129_50 == Static445.aClass129_65) {
							local211 = Static76.aClass5_Sub15_Sub2_1.method5591();
							local73 = Static76.aClass5_Sub15_Sub2_1.method5547();
							if (Static15.method264(local211)) {
								Static84.method1237(-1, local73, -1, 3);
							}
							Static445.aClass129_65 = null;
							return true;
						} else {
							@Pc(2176) boolean local2176;
							if (Static454.aClass129_191 == Static445.aClass129_65) {
								Static215.anInt3591 = Static319.anInt4969;
								if (Static128.anInt2223 == 0) {
									Static58.aString4 = null;
									Static290.aString52 = null;
									Static445.aClass129_65 = null;
									Static349.aClass124Array1 = null;
									Static406.anInt6806 = 0;
									return true;
								}
								Static290.aString52 = Static76.aClass5_Sub15_Sub2_1.method5549();
								local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
								if (local793) {
									Static76.aClass5_Sub15_Sub2_1.method5549();
								}
								@Pc(2049) long local2049 = Static76.aClass5_Sub15_Sub2_1.method5553();
								Static58.aString4 = Static448.method5905(local2049);
								Static297.aByte58 = Static76.aClass5_Sub15_Sub2_1.method5600();
								local223 = Static76.aClass5_Sub15_Sub2_1.method5539();
								if (local223 == 255) {
									Static445.aClass129_65 = null;
									return true;
								}
								Static406.anInt6806 = local223;
								@Pc(2075) Class124[] local2075 = new Class124[100];
								for (local1163 = 0; local1163 < Static406.anInt6806; local1163++) {
									local2075[local1163] = new Class124();
									local2075[local1163].aString36 = Static76.aClass5_Sub15_Sub2_1.method5549();
									local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
									if (local793) {
										local2075[local1163].aString37 = Static76.aClass5_Sub15_Sub2_1.method5549();
									} else {
										local2075[local1163].aString37 = local2075[local1163].aString36;
									}
									local2075[local1163].aString38 = Static12.method193(local2075[local1163].aString37);
									local2075[local1163].anInt3260 = Static76.aClass5_Sub15_Sub2_1.method5598();
									local2075[local1163].aByte32 = Static76.aClass5_Sub15_Sub2_1.method5600();
									local2075[local1163].aString35 = Static76.aClass5_Sub15_Sub2_1.method5549();
									if (local2075[local1163].aString37.equals(Static220.aClass2_Sub1_Sub3_Sub2_1.aString65)) {
										Static242.aByte47 = local2075[local1163].aByte32;
									}
								}
								local394 = Static406.anInt6806;
								while (local394 > 0) {
									local2176 = true;
									local394--;
									for (local404 = 0; local404 < local394; local404++) {
										if (local2075[local404].aString38.compareTo(local2075[local404 + 1].aString38) > 0) {
											local369 = local2075[local404];
											local2075[local404] = local2075[local404 + 1];
											local2176 = false;
											local2075[local404 + 1] = local369;
										}
									}
									if (local2176) {
										break;
									}
								}
								Static445.aClass129_65 = null;
								Static349.aClass124Array1 = local2075;
								return true;
							} else if (Static445.aClass129_65 == Static268.aClass129_104) {
								Static444.method5902(Static425.aClass163_15);
								Static445.aClass129_65 = null;
								return true;
							} else if (Static4.aClass129_3 == Static445.aClass129_65) {
								local211 = Static76.aClass5_Sub15_Sub2_1.method5559();
								local73 = Static76.aClass5_Sub15_Sub2_1.method5546();
								local219 = Static76.aClass5_Sub15_Sub2_1.method5585();
								if (Static15.method264(local73)) {
									Static184.method2506(local219, local211);
								}
								Static445.aClass129_65 = null;
								return true;
							} else if (Static445.aClass129_65 == Static290.aClass129_116) {
								local211 = Static76.aClass5_Sub15_Sub2_1.method5603();
								local73 = Static76.aClass5_Sub15_Sub2_1.method5598();
								local219 = Static76.aClass5_Sub15_Sub2_1.method5546();
								if (Static15.method264(local219)) {
									Static56.method930(local211, local73);
								}
								Static445.aClass129_65 = null;
								return true;
							} else if (Static445.aClass129_65 == Static314.aClass129_135) {
								Static462.method6052(true);
								Static445.aClass129_65 = null;
								return true;
							} else if (Static445.aClass129_65 == Static96.aClass129_46) {
								local211 = Static76.aClass5_Sub15_Sub2_1.method5593();
								local73 = Static76.aClass5_Sub15_Sub2_1.method5546();
								local219 = Static76.aClass5_Sub15_Sub2_1.method5591();
								if (Static15.method264(local211)) {
									Static11.method170(local219, local73);
								}
								Static445.aClass129_65 = null;
								return true;
							} else if (Static445.aClass129_65 == Static280.aClass129_111) {
								Static85.method1256();
								Static445.aClass129_65 = null;
								return true;
							} else {
								@Pc(2376) Class5_Sub44 local2376;
								if (Static383.aClass129_169 == Static445.aClass129_65) {
									local211 = Static76.aClass5_Sub15_Sub2_1.method5547();
									local73 = Static76.aClass5_Sub15_Sub2_1.method5547();
									local219 = Static76.aClass5_Sub15_Sub2_1.method5593();
									if (Static15.method264(local219)) {
										@Pc(2369) Class5_Sub44 local2369 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local211);
										local2376 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local73);
										if (local2376 != null) {
											Static456.method5988(local2369 == null || local2369.anInt6981 != local2376.anInt6981, false, local2376);
										}
										if (local2369 != null) {
											local2369.method6003();
											Static151.aClass252_42.method5658(local2369, (long) local73);
										}
										@Pc(2411) Class76 local2411 = Static213.method2817(local211);
										if (local2411 != null) {
											Static53.method833(local2411);
										}
										local2411 = Static213.method2817(local73);
										if (local2411 != null) {
											Static53.method833(local2411);
											Static125.method1758(true, local2411);
										}
										if (Static199.anInt3319 != -1) {
											Static391.method5105(Static199.anInt3319, 1);
										}
									}
									Static445.aClass129_65 = null;
									return true;
								} else if (Static445.aClass129_65 == Static205.aClass129_84) {
									local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
									local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
									local219 = Static76.aClass5_Sub15_Sub2_1.method5539();
									local223 = Static76.aClass5_Sub15_Sub2_1.method5598() << 0;
									local1158 = Static76.aClass5_Sub15_Sub2_1.method5539();
									local1163 = Static76.aClass5_Sub15_Sub2_1.method5539();
									if (Static15.method264(local211)) {
										Static158.method2222(local223, local219, local1163, local73, local1158);
									}
									Static445.aClass129_65 = null;
									return true;
								} else if (Static445.aClass129_65 == Static390.aClass129_173) {
									Static163.aClass212_1 = Static196.method2624(Static76.aClass5_Sub15_Sub2_1.method5539());
									Static445.aClass129_65 = null;
									return true;
								} else if (Static445.aClass129_65 == Static300.aClass129_127) {
									local211 = Static76.aClass5_Sub15_Sub2_1.method5578();
									local73 = local211 >> 2;
									local219 = local211 & 0x3;
									local223 = Static30.anIntArray25[local73];
									local1158 = Static76.aClass5_Sub15_Sub2_1.method5598();
									if (local1158 == 65535) {
										local1158 = -1;
									}
									local1163 = Static76.aClass5_Sub15_Sub2_1.method5603();
									local311 = local1163 >> 28 & 0x3;
									local1597 = local1163 >> 14 & 0x3FFF;
									local1597 -= Static31.anInt618;
									local394 = local1163 & 0x3FFF;
									local394 -= Static226.anInt3768;
									Static2.method6033(local73, local1158, local1597, local219, local311, local223, local394);
									Static445.aClass129_65 = null;
									return true;
								} else if (Static15.aClass129_8 == Static445.aClass129_65) {
									local261 = Static76.aClass5_Sub15_Sub2_1.method5549();
									local73 = Static76.aClass5_Sub15_Sub2_1.method5598();
									local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
									if (Static15.method264(local73)) {
										Static323.method3979(local219, local261);
									}
									Static445.aClass129_65 = null;
									return true;
								} else if (Static445.aClass129_65 == Static331.aClass129_143) {
									local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
									local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
									local272 = (local73 & 0x1) == 1;
									while (Static76.aClass5_Sub15_Sub2_1.anInt7013 < Static128.anInt2223) {
										local223 = Static76.aClass5_Sub15_Sub2_1.method5542();
										local1158 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local1163 = 0;
										if (local1158 != 0) {
											local1163 = Static76.aClass5_Sub15_Sub2_1.method5539();
											if (local1163 == 255) {
												local1163 = Static76.aClass5_Sub15_Sub2_1.method5603();
											}
										}
										Static99.method1395(local223, local211, local1163, local272, local1158 - 1);
									}
									Static369.anIntArray428[Static327.anInt1023++ & 0x1F] = local211;
									Static445.aClass129_65 = null;
									return true;
								} else {
									@Pc(2721) int local2721;
									if (Static445.aClass129_65 == Static11.aClass129_7) {
										local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
										local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
										local799 = local278;
										if (local793) {
											local799 = Static76.aClass5_Sub15_Sub2_1.method5549();
										}
										local809 = Static76.aClass5_Sub15_Sub2_1.method5553();
										local814 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local819 = Static76.aClass5_Sub15_Sub2_1.method5541();
										local404 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local2721 = Static76.aClass5_Sub15_Sub2_1.method5598();
										@Pc(2728) long local2728 = (local814 << 32) + local819;
										@Pc(2730) boolean local2730 = false;
										@Pc(2732) int local2732 = 0;
										while (true) {
											if (local2732 >= 100) {
												if (local404 <= 1 && Static333.method4129(local799)) {
													local2730 = true;
												}
												break;
											}
											if (Static28.aLongArray34[local2732] == local2728) {
												local2730 = true;
												break;
											}
											local2732++;
										}
										if (!local2730 && Static219.anInt3646 == 0) {
											Static28.aLongArray34[Static19.anInt416] = local2728;
											Static19.anInt416 = (Static19.anInt416 + 1) % 100;
											@Pc(2786) String local2786 = Static407.aClass20_2.method458(local2721).method4699(Static76.aClass5_Sub15_Sub2_1);
											if (local404 == 2) {
												Static84.method1238("<img=1>" + local278, 0, Static95.method1333(local809), local2786, "<img=1>" + local799, local2721, 20);
											} else if (local404 == 1) {
												Static84.method1238("<img=0>" + local278, 0, Static95.method1333(local809), local2786, "<img=0>" + local799, local2721, 20);
											} else {
												Static84.method1238(local278, 0, Static95.method1333(local809), local2786, local799, local2721, 20);
											}
										}
										Static445.aClass129_65 = null;
										return true;
									}
									@Pc(2910) String local2910;
									@Pc(2881) String local2881;
									@Pc(2883) String local2883;
									if (Static161.aClass129_73 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5542();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5603();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local2881 = "";
										local2883 = local2881;
										if ((local219 & 0x1) != 0) {
											local2881 = Static76.aClass5_Sub15_Sub2_1.method5549();
											if ((local219 & 0x2) == 0) {
												local2883 = local2881;
											} else {
												local2883 = Static76.aClass5_Sub15_Sub2_1.method5549();
											}
										}
										local2910 = Static76.aClass5_Sub15_Sub2_1.method5549();
										if (local211 == 99) {
											Static143.method2070(local2910);
										} else if (local2883.equals("") || !Static333.method4129(local2883)) {
											Static44.method702(local2881, local2910, local211, local73, local2883);
										} else {
											Static445.aClass129_65 = null;
											return true;
										}
										Static445.aClass129_65 = null;
										return true;
									}
									@Pc(2990) long local2990;
									@Pc(3011) Class5_Sub40 local3011;
									@Pc(2996) Class5_Sub40 local2996;
									if (Static445.aClass129_65 == Static267.aClass129_126) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5591();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5559();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5593();
										if (local219 == 65535) {
											local219 = -1;
										}
										local223 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (local223 == 65535) {
											local223 = -1;
										}
										local1158 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (Static15.method264(local1158)) {
											for (local1163 = local219; local1163 <= local223; local1163++) {
												local2990 = (long) local1163 + ((long) local73 << 32);
												local2996 = (Class5_Sub40) Static66.aClass252_8.method5659(local2990);
												if (local2996 != null) {
													local3011 = new Class5_Sub40(local2996.anInt6805, local211);
													local2996.method6003();
												} else if (local1163 == -1) {
													local3011 = new Class5_Sub40(Static213.method2817(local73).aClass5_Sub40_1.anInt6805, local211);
												} else {
													local3011 = new Class5_Sub40(0, local211);
												}
												Static66.aClass252_8.method5658(local3011, local2990);
											}
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static207.aClass129_85 == Static445.aClass129_65) {
										local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
										local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
										local799 = local278;
										if (local793) {
											local799 = Static76.aClass5_Sub15_Sub2_1.method5549();
										}
										local223 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local1158 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local292 = false;
										if (local223 <= 1 && Static333.method4129(local799)) {
											local292 = true;
										}
										if (!local292 && Static219.anInt3646 == 0) {
											local365 = Static407.aClass20_2.method458(local1158).method4699(Static76.aClass5_Sub15_Sub2_1);
											if (local223 == 2) {
												Static84.method1238("<img=1>" + local278, 0, null, local365, "<img=1>" + local799, local1158, 25);
											} else if (local223 == 1) {
												Static84.method1238("<img=0>" + local278, 0, null, local365, "<img=0>" + local799, local1158, 25);
											} else {
												Static84.method1238(local278, 0, null, local365, local799, local1158, 25);
											}
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static427.aClass129_186 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (local211 == 65535) {
											local211 = -1;
										}
										local73 = Static76.aClass5_Sub15_Sub2_1.method5559();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5603();
										local223 = Static76.aClass5_Sub15_Sub2_1.method5593();
										if (local223 == 65535) {
											local223 = -1;
										}
										local1158 = Static76.aClass5_Sub15_Sub2_1.method5546();
										if (Static15.method264(local1158)) {
											for (local1163 = local211; local1163 <= local223; local1163++) {
												local2990 = (long) local1163 + ((long) local73 << 32);
												local2996 = (Class5_Sub40) Static66.aClass252_8.method5659(local2990);
												if (local2996 != null) {
													local3011 = new Class5_Sub40(local219, local2996.anInt6801);
													local2996.method6003();
												} else if (local1163 == -1) {
													local3011 = new Class5_Sub40(local219, Static213.method2817(local73).aClass5_Sub40_1.anInt6801);
												} else {
													local3011 = new Class5_Sub40(local219, -1);
												}
												Static66.aClass252_8.method5658(local3011, local2990);
											}
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static82.aClass129_38 == Static445.aClass129_65) {
										Static259.aString48 = Static128.anInt2223 > 2 ? Static76.aClass5_Sub15_Sub2_1.method5549() : Static195.aClass198_54.method4012(Static38.anInt4834);
										Static193.anInt3220 = Static128.anInt2223 <= 0 ? -1 : Static76.aClass5_Sub15_Sub2_1.method5598();
										Static445.aClass129_65 = null;
										if (Static193.anInt3220 == 65535) {
											Static193.anInt3220 = -1;
										}
										return true;
									} else if (Static96.aClass129_45 == Static445.aClass129_65) {
										Static54.method840(Static128.anInt2223, Static76.aClass5_Sub15_Sub2_1);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static421.aClass129_183) {
										Static444.method5902(Static226.aClass163_5);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static83.aClass129_39 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local223 = Static76.aClass5_Sub15_Sub2_1.method5598();
										if (Static15.method264(local211) && Static34.aClass76ArrayArray1[local73] != null) {
											for (local1158 = local219; local1158 < local223; local1158++) {
												local1163 = Static76.aClass5_Sub15_Sub2_1.method5541();
												if (Static34.aClass76ArrayArray1[local73].length > local1158 && Static34.aClass76ArrayArray1[local73][local1158] != null) {
													Static34.aClass76ArrayArray1[local73][local1158].anInt2099 = local1163;
												}
											}
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static22.aClass129_10) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local223 = Static76.aClass5_Sub15_Sub2_1.method5598() << 0;
										local1158 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local1163 = Static76.aClass5_Sub15_Sub2_1.method5539();
										if (Static15.method264(local211)) {
											Static115.method1593(local223, true, local73, local219, local1158, local1163);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static373.aClass129_166) {
										Static154.anInt6467 = Static76.aClass5_Sub15_Sub2_1.method5539();
										Static445.aClass129_65 = null;
										Static460.anInt7523 = Static319.anInt4969;
										return true;
									} else if (Static57.aClass129_23 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5593();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (Static15.method264(local73)) {
											if (local211 == 2) {
												Static11.method163();
											}
											Static199.anInt3319 = local219;
											Static68.method1036(local219);
											Static330.method4011(false);
											Static181.method2474(Static199.anInt3319);
											for (local223 = 0; local223 < 100; local223++) {
												Static99.aBooleanArray5[local223] = true;
											}
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static145.aClass129_67) {
										Static445.aClass129_65 = null;
										return false;
									} else if (Static445.aClass129_65 == Static2.aClass129_194) {
										Static165.method2317(false);
										Static445.aClass129_65 = null;
										return false;
									} else if (Static422.aClass129_184 == Static445.aClass129_65) {
										local261 = Static76.aClass5_Sub15_Sub2_1.method5549();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5591();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (Static15.method264(local219)) {
											Static323.method3979(local73, local261);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static396.aClass129_175 == Static445.aClass129_65) {
										Static444.method5902(Static287.aClass163_8);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static139.aClass129_62 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5539();
										if (Static76.aClass5_Sub15_Sub2_1.method5539() == 0) {
											Static111.aClass181Array1[local211] = new Class181();
										} else {
											Static76.aClass5_Sub15_Sub2_1.anInt7013--;
											Static111.aClass181Array1[local211] = new Class181(Static76.aClass5_Sub15_Sub2_1);
										}
										Static445.aClass129_65 = null;
										Static297.anInt4647 = Static319.anInt4969;
										return true;
									} else if (Static105.aClass129_49 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5546();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5559();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5546();
										if (local219 == 65535) {
											local219 = -1;
										}
										local223 = Static76.aClass5_Sub15_Sub2_1.method5603();
										if (Static15.method264(local211)) {
											Static153.method4962(local73, local219, local223);
											@Pc(3641) Class40 local3641 = Static306.aClass67_3.method1452(local219);
											Static231.method3025(local3641.anInt1186, local3641.anInt1169, local73, local3641.anInt1170);
											Static41.method658(local3641.anInt1127, local3641.anInt1188, local3641.anInt1150, local73);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static278.aClass129_107 == Static445.aClass129_65) {
										if (Static317.aFrame2 != null) {
											Static449.method5909(Static216.aClass1_Sub1_1.anInt4516, false, -1, -1);
										}
										@Pc(3678) byte[] local3678 = new byte[Static128.anInt2223];
										Static76.aClass5_Sub15_Sub2_1.method5604(local3678, Static128.anInt2223);
										local278 = Static8.method148(0, Static128.anInt2223, local3678);
										Static50.method798(local278, Static7.aClass93_1, true, Static146.anInt2644 == 1);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static326.aClass129_139 == Static445.aClass129_65) {
										Static444.method5902(Static453.aClass163_12);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static88.aClass129_195 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5563();
										Static408.aClass39_1.method966(local211, local73);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static285.aClass129_113 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5593();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5563();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5591();
										local223 = Static76.aClass5_Sub15_Sub2_1.method5593();
										local1158 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (Static15.method264(local223)) {
											Static84.method1237(local1158 | local219 << 16, local73, local211, 7);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static295.aClass129_118 == Static445.aClass129_65) {
										Static408.aClass39_1.method961();
										Static27.anInt552 += 32;
										Static445.aClass129_65 = null;
										return true;
									} else if (Static73.aClass129_29 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5563();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5546();
										local223 = Static76.aClass5_Sub15_Sub2_1.method5593();
										local1158 = Static76.aClass5_Sub15_Sub2_1.method5546();
										if (Static15.method264(local211)) {
											Static231.method3025(local219, local1158, local73, local223);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static161.aClass129_74) {
										Static444.method5902(Static258.aClass163_6);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static89.aClass129_43 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5603();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5594();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5594();
										Static371.anIntArray429[local219] = local211;
										Static257.anIntArray327[local219] = local73;
										Static229.anIntArray245[local219] = 1;
										local223 = Static220.anIntArray232[local219] - 1;
										for (local1158 = 0; local1158 < local223; local1158++) {
											if (local211 >= Class125.anIntArray444[local1158]) {
												Static229.anIntArray245[local219] = local1158 + 2;
											}
										}
										Static392.anIntArray453[Static93.anInt1613++ & 0x1F] = local219;
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static451.aClass129_189) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5593();
										if (local211 == 65535) {
											local211 = -1;
										}
										local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5594();
										Static312.method3838(local219, local211, local73);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static205.aClass129_83 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5555();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (local219 == 65535) {
											local219 = -1;
										}
										Static104.method1444(local219, local211, local73);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static191.aClass129_80 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5546();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
										if (Static15.method264(local211)) {
											Static158.anInt2751 = local73;
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static243.aClass129_96 == Static445.aClass129_65) {
										Static444.method5902(Static426.aClass163_16);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static205.aClass129_82) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
										if (local211 == 65535) {
											local211 = -1;
										}
										local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local223 = Static76.aClass5_Sub15_Sub2_1.method5539();
										Static64.method1000(local73, local219, local211, local223);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static200.aClass129_81 == Static445.aClass129_65) {
										Static444.anInt7351 = Static76.aClass5_Sub15_Sub2_1.method5585();
										Static367.anInt5964 = Static76.aClass5_Sub15_Sub2_1.method5548() << 3;
										Static45.anInt39 = Static76.aClass5_Sub15_Sub2_1.method5570() << 3;
										while (Static76.aClass5_Sub15_Sub2_1.anInt7013 < Static128.anInt2223) {
											@Pc(4068) Class163 local4068 = Static282.method3474()[Static76.aClass5_Sub15_Sub2_1.method5539()];
											Static444.method5902(local4068);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static215.aClass129_87 == Static445.aClass129_65) {
										Static165.method2317(Static151.aBoolean500);
										Static445.aClass129_65 = null;
										return false;
									} else if (Static327.aClass129_22 == Static445.aClass129_65) {
										local261 = Static76.aClass5_Sub15_Sub2_1.method5549();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5591();
										local219 = Static76.aClass5_Sub15_Sub2_1.method5563();
										if (Static15.method264(local73)) {
											Static31.method519(local219, local261);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static84.aClass129_40) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5603();
										Static22.aClass268_1 = Static7.aClass93_1.method2072(local211);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static142.aClass129_63 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5559();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (local73 == 65535) {
											local73 = -1;
										}
										local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
										if (Static15.method264(local219)) {
											Static84.method1237(local73, local211, -1, 1);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static218.aClass129_124) {
										Static37.method618();
										Static445.aClass129_65 = null;
										return false;
									} else if (Static445.aClass129_65 == Static362.aClass129_159) {
										local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
										local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
										local799 = local278;
										if (local793) {
											local799 = Static76.aClass5_Sub15_Sub2_1.method5549();
										}
										local223 = Static76.aClass5_Sub15_Sub2_1.method5539();
										@Pc(4211) boolean local4211 = false;
										if (local223 <= 1) {
											if (Static408.aBoolean459 && !Static337.aBoolean377 || Static146.aBoolean172) {
												local4211 = true;
											} else if (local223 <= 1 && Static333.method4129(local799)) {
												local4211 = true;
											}
										}
										if (!local4211 && Static219.anInt3646 == 0) {
											local2910 = Static5.method81(Static271.method3662(Static76.aClass5_Sub15_Sub2_1));
											if (local223 == 2) {
												Static84.method1238("<img=1>" + local278, 0, null, local2910, "<img=1>" + local799, -1, 24);
											} else if (local223 == 1) {
												Static84.method1238("<img=0>" + local278, 0, null, local2910, "<img=0>" + local799, -1, 24);
											} else {
												Static84.method1238(local278, 0, null, local2910, local799, -1, 24);
											}
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static342.aClass129_154) {
										Static150.anInt2695 = Static76.aClass5_Sub15_Sub2_1.method5539();
										for (local211 = 0; local211 < Static150.anInt2695; local211++) {
											Static338.aStringArray36[local211] = Static76.aClass5_Sub15_Sub2_1.method5549();
											Static263.aStringArray31[local211] = Static76.aClass5_Sub15_Sub2_1.method5549();
											if (Static263.aStringArray31[local211].equals("")) {
												Static263.aStringArray31[local211] = Static338.aStringArray36[local211];
											}
											Static65.aStringArray34[local211] = Static76.aClass5_Sub15_Sub2_1.method5549();
											Static417.aStringArray44[local211] = Static76.aClass5_Sub15_Sub2_1.method5549();
											if (Static417.aStringArray44[local211].equals("")) {
												Static417.aStringArray44[local211] = Static65.aStringArray34[local211];
											}
											Static53.aBooleanArray4[local211] = false;
										}
										Static445.aClass129_65 = null;
										Static62.anInt1134 = Static319.anInt4969;
										return true;
									} else if (Static445.aClass129_65 == Static169.aClass129_77) {
										Static444.method5902(Static97.aClass163_2);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static49.aClass129_19) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5578();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5598();
										local272 = (local211 & 0x1) == 1;
										Static290.method3600(local272, local73);
										Static369.anIntArray428[Static327.anInt1023++ & 0x1F] = local73;
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static150.aClass129_68) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5594();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5593();
										Static408.aClass39_1.method966(local73, local211);
										Static445.aClass129_65 = null;
										return true;
									} else if (Static445.aClass129_65 == Static292.aClass129_117) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5563();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5591();
										if (Static15.method264(local73)) {
											Static84.method1237(Static43.anInt5302, local211, 0, 5);
										}
										Static445.aClass129_65 = null;
										return true;
									} else if (Static310.aClass129_132 == Static445.aClass129_65) {
										local211 = Static76.aClass5_Sub15_Sub2_1.method5585();
										local73 = Static76.aClass5_Sub15_Sub2_1.method5594();
										if (local73 == 255) {
											local211 = -1;
											local73 = -1;
										}
										Static19.method323(local73, local211);
										Static445.aClass129_65 = null;
										return true;
									} else {
										@Pc(4594) boolean local4594;
										if (Static452.aClass129_190 == Static445.aClass129_65) {
											while (Static128.anInt2223 > Static76.aClass5_Sub15_Sub2_1.anInt7013) {
												local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
												local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
												local799 = Static76.aClass5_Sub15_Sub2_1.method5549();
												local223 = Static76.aClass5_Sub15_Sub2_1.method5598();
												local1158 = Static76.aClass5_Sub15_Sub2_1.method5539();
												local2910 = "";
												local2176 = false;
												if (local223 > 0) {
													local2910 = Static76.aClass5_Sub15_Sub2_1.method5549();
													local2176 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
												}
												for (local1597 = 0; local1597 < Static244.anInt3939; local1597++) {
													if (local793) {
														if (local799.equals(Static225.aStringArray27[local1597])) {
															Static225.aStringArray27[local1597] = local278;
															local278 = null;
															Static88.aStringArray48[local1597] = local799;
															break;
														}
													} else if (local278.equals(Static225.aStringArray27[local1597])) {
														if (Static226.anIntArray238[local1597] != local223) {
															local4594 = true;
															for (@Pc(4599) Class88_Sub1_Sub2 local4599 = (Class88_Sub1_Sub2) Static27.aClass107_3.method2326(); local4599 != null; local4599 = (Class88_Sub1_Sub2) Static27.aClass107_3.method2327()) {
																if (local4599.aString44.equals(local278)) {
																	if (local223 != 0 && local4599.aShort42 == 0) {
																		local4599.method5917();
																		local4594 = false;
																	} else if (local223 == 0 && local4599.aShort42 != 0) {
																		local4599.method5917();
																		local4594 = false;
																	}
																}
															}
															if (local4594) {
																Static27.aClass107_3.method2332(new Class88_Sub1_Sub2(local278, local223));
															}
															Static226.anIntArray238[local1597] = local223;
														}
														Static88.aStringArray48[local1597] = local799;
														Static10.aStringArray3[local1597] = local2910;
														Static211.anIntArray217[local1597] = local1158;
														local278 = null;
														Static165.aBooleanArray10[local1597] = local2176;
														break;
													}
												}
												if (local278 != null && Static244.anInt3939 < 200) {
													Static225.aStringArray27[Static244.anInt3939] = local278;
													Static88.aStringArray48[Static244.anInt3939] = local799;
													Static226.anIntArray238[Static244.anInt3939] = local223;
													Static10.aStringArray3[Static244.anInt3939] = local2910;
													Static211.anIntArray217[Static244.anInt3939] = local1158;
													Static165.aBooleanArray10[Static244.anInt3939] = local2176;
													Static244.anInt3939++;
												}
											}
											Static244.anInt3937 = 2;
											Static62.anInt1134 = Static319.anInt4969;
											local73 = Static244.anInt3939;
											while (local73 > 0) {
												local73--;
												local793 = true;
												for (local219 = 0; local219 < local73; local219++) {
													if (Static226.anIntArray238[local219] != Static239.aClass165_7.anInt4240 && Static239.aClass165_7.anInt4240 == Static226.anIntArray238[local219 + 1] || Static226.anIntArray238[local219] == 0 && Static226.anIntArray238[local219 + 1] != 0) {
														local223 = Static226.anIntArray238[local219];
														Static226.anIntArray238[local219] = Static226.anIntArray238[local219 + 1];
														Static226.anIntArray238[local219 + 1] = local223;
														local2883 = Static10.aStringArray3[local219];
														Static10.aStringArray3[local219] = Static10.aStringArray3[local219 + 1];
														Static10.aStringArray3[local219 + 1] = local2883;
														local2910 = Static225.aStringArray27[local219];
														Static225.aStringArray27[local219] = Static225.aStringArray27[local219 + 1];
														Static225.aStringArray27[local219 + 1] = local2910;
														local365 = Static88.aStringArray48[local219];
														Static88.aStringArray48[local219] = Static88.aStringArray48[local219 + 1];
														Static88.aStringArray48[local219 + 1] = local365;
														local1597 = Static211.anIntArray217[local219];
														Static211.anIntArray217[local219] = Static211.anIntArray217[local219 + 1];
														Static211.anIntArray217[local219 + 1] = local1597;
														local4594 = Static165.aBooleanArray10[local219];
														Static165.aBooleanArray10[local219] = Static165.aBooleanArray10[local219 + 1];
														Static165.aBooleanArray10[local219 + 1] = local4594;
														local793 = false;
													}
												}
												if (local793) {
													break;
												}
											}
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static178.aClass129_157) {
											local211 = Static76.aClass5_Sub15_Sub2_1.method5591();
											local73 = Static76.aClass5_Sub15_Sub2_1.method5598();
											local219 = Static76.aClass5_Sub15_Sub2_1.method5539();
											local223 = Static76.aClass5_Sub15_Sub2_1.method5559();
											if (Static15.method264(local73)) {
												local2376 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local223);
												if (local2376 != null) {
													Static456.method5988(local211 != local2376.anInt6981, false, local2376);
												}
												Static241.method3140(false, local211, local219, local223);
											}
											Static445.aClass129_65 = null;
											return true;
										} else if (Static235.aClass129_93 == Static445.aClass129_65) {
											if (Static67.method1032(Static376.anInt6324)) {
												Static227.anInt3788 = (int) ((float) Static76.aClass5_Sub15_Sub2_1.method5598() * 2.5F);
											} else {
												Static227.anInt3788 = Static76.aClass5_Sub15_Sub2_1.method5598() * 30;
											}
											Static460.anInt7523 = Static319.anInt4969;
											Static445.aClass129_65 = null;
											return true;
										} else if (Static332.aClass129_145 == Static445.aClass129_65) {
											local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
											if (Static15.method264(local211)) {
												Static185.method2530();
											}
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static118.aClass129_58) {
											Static278.method3459(Static76.aClass5_Sub15_Sub2_1.method5549());
											Static445.aClass129_65 = null;
											return true;
										} else if (Static187.aClass129_144 == Static445.aClass129_65) {
											local261 = Static76.aClass5_Sub15_Sub2_1.method5549();
											local278 = Static5.method81(Static271.method3662(Static76.aClass5_Sub15_Sub2_1));
											Static44.method702(local261, local278, 6, 0, local261);
											Static445.aClass129_65 = null;
											return true;
										} else if (Static211.aClass129_86 == Static445.aClass129_65) {
											Static444.method5902(Static180.aClass163_3);
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static134.aClass129_60) {
											local211 = Static76.aClass5_Sub15_Sub2_1.method5603();
											local73 = Static76.aClass5_Sub15_Sub2_1.method5546();
											local219 = Static76.aClass5_Sub15_Sub2_1.method5591();
											if (local219 == 65535) {
												local219 = -1;
											}
											if (Static15.method264(local73)) {
												Static344.method4471(local211, local219);
											}
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static367.aClass129_162) {
											Static444.method5902(Static5.aClass163_1);
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static229.aClass129_91) {
											Static371.anInt6078 = Static76.aClass5_Sub15_Sub2_1.method5586();
											Static460.anInt7523 = Static319.anInt4969;
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static101.aClass129_174) {
											local211 = Static76.aClass5_Sub15_Sub2_1.method5546();
											local73 = Static76.aClass5_Sub15_Sub2_1.method5547();
											Static408.aClass39_1.method965(local73, local211);
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static107.aClass129_51) {
											local211 = Static76.aClass5_Sub15_Sub2_1.method5573();
											local73 = Static76.aClass5_Sub15_Sub2_1.method5563();
											local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
											if (Static15.method264(local219)) {
												Static278.method3455(local73, local211);
											}
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static279.aClass129_110) {
											local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
											local73 = Static76.aClass5_Sub15_Sub2_1.method5603();
											if (Static15.method264(local211)) {
												@Pc(5187) Class5_Sub44 local5187 = (Class5_Sub44) Static151.aClass252_42.method5659((long) local73);
												if (local5187 != null) {
													Static456.method5988(true, false, local5187);
												}
												if (Static192.aClass76_9 != null) {
													Static53.method833(Static192.aClass76_9);
													Static192.aClass76_9 = null;
												}
											}
											Static445.aClass129_65 = null;
											return true;
										} else if (Static445.aClass129_65 == Static222.aClass129_90) {
											local211 = Static76.aClass5_Sub15_Sub2_1.method5591();
											local73 = Static76.aClass5_Sub15_Sub2_1.method5598();
											@Pc(5220) byte local5220 = Static76.aClass5_Sub15_Sub2_1.method5582();
											if (Static15.method264(local73)) {
												Static96.method1352(local211, local5220);
											}
											Static445.aClass129_65 = null;
											return true;
										} else {
											@Pc(5327) int local5327;
											if (Static400.aClass129_179 == Static445.aClass129_65) {
												local211 = Static76.aClass5_Sub15_Sub2_1.method5585();
												local73 = Static76.aClass5_Sub15_Sub2_1.method5559();
												local219 = Static76.aClass5_Sub15_Sub2_1.method5598();
												local223 = Static76.aClass5_Sub15_Sub2_1.method5546();
												local1158 = Static76.aClass5_Sub15_Sub2_1.method5591();
												local292 = (local211 & 0x80) != 0;
												if (local73 >> 30 == 0) {
													@Pc(5491) Class143 local5491;
													@Pc(5443) Class143 local5443;
													@Pc(5429) Class63 local5429;
													if (local73 >> 29 != 0) {
														local311 = local73 & 0xFFFF;
														@Pc(5388) Class5_Sub7 local5388 = (Class5_Sub7) Static380.aClass252_36.method5659((long) local311);
														if (local5388 != null) {
															if (local1158 == 65535) {
																local1158 = -1;
															}
															@Pc(5400) Class2_Sub1_Sub3_Sub1 local5400 = local5388.aClass2_Sub1_Sub3_Sub1_1;
															@Pc(5402) boolean local5402 = true;
															local2721 = local292 ? local5400.anInt6173 : local5400.anInt6125;
															if (local1158 != -1 && local2721 != -1) {
																if (local2721 == local1158) {
																	local5429 = Static3.aClass203_1.method4360(local1158);
																	if (local5429.aBoolean114 && local5429.anInt1705 != -1) {
																		local5443 = Static271.aClass219_4.method4752(local5429.anInt1705);
																		local834 = local5443.anInt3772;
																		if (local834 == 0 || local834 == 2) {
																			local5402 = false;
																		} else if (local834 == 1) {
																			local5402 = true;
																		}
																	}
																} else {
																	local5429 = Static3.aClass203_1.method4360(local1158);
																	@Pc(5477) Class63 local5477 = Static3.aClass203_1.method4360(local2721);
																	if (local5429.anInt1705 != -1 && local5477.anInt1705 != -1) {
																		local5491 = Static271.aClass219_4.method4752(local5429.anInt1705);
																		@Pc(5497) Class143 local5497 = Static271.aClass219_4.method4752(local5477.anInt1705);
																		if (local5491.anInt3783 < local5497.anInt3783) {
																			local5402 = false;
																		}
																	}
																}
															}
															if (local5402) {
																if (local292) {
																	local5400.anInt6124 = 0;
																	local5400.anInt6119 = local211 & 0x7;
																	local5400.anInt6185 = 1;
																	local5400.anInt6123 = local223 + Static85.anInt1536;
																	local5400.anInt6173 = local1158;
																	local5400.anInt6194 = 0;
																	local5400.anInt6191 = local219;
																	if (local5400.anInt6123 > Static85.anInt1536) {
																		local5400.anInt6124 = -1;
																	}
																	if (local5400.anInt6173 != -1 && Static85.anInt1536 == local5400.anInt6123) {
																		local5327 = Static3.aClass203_1.method4360(local5400.anInt6173).anInt1705;
																		if (local5327 != -1) {
																			local5443 = Static271.aClass219_4.method4752(local5327);
																			if (local5443 != null && local5443.anIntArray241 != null) {
																				Static340.method4406(false, local5443, local5400.anInt7500, 0, local5400.anInt7502, local5400.aByte105);
																			}
																		}
																	}
																} else {
																	local5400.anInt6170 = local211 & 0x7;
																	local5400.anInt6152 = Static85.anInt1536 + local223;
																	local5400.anInt6125 = local1158;
																	local5400.anInt6151 = 0;
																	local5400.anInt6187 = 1;
																	local5400.anInt6155 = local219;
																	local5400.anInt6149 = 0;
																	if (local5400.anInt6152 > Static85.anInt1536) {
																		local5400.anInt6149 = -1;
																	}
																	if (local5400.anInt6125 != -1 && local5400.anInt6152 == Static85.anInt1536) {
																		local5327 = Static3.aClass203_1.method4360(local5400.anInt6125).anInt1705;
																		if (local5327 != -1) {
																			local5443 = Static271.aClass219_4.method4752(local5327);
																			if (local5443 != null && local5443.anIntArray241 != null) {
																				Static340.method4406(false, local5443, local5400.anInt7500, 0, local5400.anInt7502, local5400.aByte105);
																			}
																		}
																	}
																}
															}
														}
													} else if (local73 >> 28 != 0) {
														local311 = local73 & 0xFFFF;
														@Pc(5679) Class2_Sub1_Sub3_Sub2 local5679;
														if (local311 == Static43.anInt5302) {
															local5679 = Static220.aClass2_Sub1_Sub3_Sub2_1;
														} else {
															local5679 = Static359.aClass2_Sub1_Sub3_Sub2Array1[local311];
														}
														if (local5679 != null) {
															if (local1158 == 65535) {
																local1158 = -1;
															}
															local4594 = true;
															local404 = local292 ? local5679.anInt6173 : local5679.anInt6125;
															@Pc(5728) Class143 local5728;
															if (local1158 != -1 && local404 != -1) {
																@Pc(5714) Class63 local5714;
																if (local1158 == local404) {
																	local5714 = Static3.aClass203_1.method4360(local1158);
																	if (local5714.aBoolean114 && local5714.anInt1705 != -1) {
																		local5728 = Static271.aClass219_4.method4752(local5714.anInt1705);
																		local1611 = local5728.anInt3772;
																		if (local1611 == 0 || local1611 == 2) {
																			local4594 = false;
																		} else if (local1611 == 1) {
																			local4594 = true;
																		}
																	}
																} else {
																	local5714 = Static3.aClass203_1.method4360(local1158);
																	local5429 = Static3.aClass203_1.method4360(local404);
																	if (local5714.anInt1705 != -1 && local5429.anInt1705 != -1) {
																		local5443 = Static271.aClass219_4.method4752(local5714.anInt1705);
																		local5491 = Static271.aClass219_4.method4752(local5429.anInt1705);
																		if (local5443.anInt3783 < local5491.anInt3783) {
																			local4594 = false;
																		}
																	}
																}
															}
															if (local4594) {
																if (local292) {
																	local5679.anInt6123 = Static85.anInt1536 + local223;
																	local5679.anInt6191 = local219;
																	local5679.anInt6194 = 0;
																	local5679.anInt6119 = local211 & 0x7;
																	local5679.anInt6185 = 1;
																	local5679.anInt6173 = local1158;
																	local5679.anInt6124 = 0;
																	if (local5679.anInt6173 == 65535) {
																		local5679.anInt6173 = -1;
																	}
																	if (Static85.anInt1536 < local5679.anInt6123) {
																		local5679.anInt6124 = -1;
																	}
																	if (local5679.anInt6173 != -1 && local5679.anInt6123 == Static85.anInt1536) {
																		local2721 = Static3.aClass203_1.method4360(local5679.anInt6173).anInt1705;
																		if (local2721 != -1) {
																			local5728 = Static271.aClass219_4.method4752(local2721);
																			if (local5728 != null && local5728.anIntArray241 != null) {
																				Static340.method4406(Static220.aClass2_Sub1_Sub3_Sub2_1 == local5679, local5728, local5679.anInt7500, 0, local5679.anInt7502, local5679.aByte105);
																			}
																		}
																	}
																} else {
																	local5679.anInt6151 = 0;
																	local5679.anInt6170 = local211 & 0x7;
																	local5679.anInt6149 = 0;
																	local5679.anInt6187 = 1;
																	local5679.anInt6125 = local1158;
																	local5679.anInt6155 = local219;
																	local5679.anInt6152 = Static85.anInt1536 + local223;
																	if (Static85.anInt1536 < local5679.anInt6152) {
																		local5679.anInt6149 = -1;
																	}
																	if (local5679.anInt6125 == 65535) {
																		local5679.anInt6125 = -1;
																	}
																	if (local5679.anInt6125 != -1 && local5679.anInt6152 == Static85.anInt1536) {
																		local2721 = Static3.aClass203_1.method4360(local5679.anInt6125).anInt1705;
																		if (local2721 != -1) {
																			local5728 = Static271.aClass219_4.method4752(local2721);
																			if (local5728 != null && local5728.anIntArray241 != null) {
																				Static340.method4406(local5679 == Static220.aClass2_Sub1_Sub3_Sub2_1, local5728, local5679.anInt7500, 0, local5679.anInt7502, local5679.aByte105);
																			}
																		}
																	}
																}
															}
														}
													}
												} else {
													local311 = local73 >> 28 & 0x3;
													local1597 = (local73 >> 14 & 0x3FFF) - Static31.anInt618;
													local394 = (local73 & 0x3FFF) - Static226.anInt3768;
													if (local1597 >= 0 && local394 >= 0 && Static433.anInt7210 > local1597 && local394 < Static418.anInt6969) {
														local404 = local1597 * 128 + 64;
														local2721 = local394 * 128 + 64;
														local5327 = local311;
														if (local311 < 3 && Static118.method1679(local394, local1597)) {
															local5327 = local311 + 1;
														}
														@Pc(5361) Class2_Sub1_Sub2 local5361 = new Class2_Sub1_Sub2(local1158, 0, Static85.anInt1536, local311, local5327, local404, Static192.method2572(local2721, local404, local311) - local219, local2721, local1597, local1597, local394, local394, local211);
														Static311.aClass177_31.method3615(new Class5_Sub2_Sub7(local5361));
													}
												}
												Static445.aClass129_65 = null;
												return true;
											} else if (Static351.aClass129_156 == Static445.aClass129_65) {
												Static462.method6052(false);
												Static445.aClass129_65 = null;
												return true;
											} else if (Static218.aClass129_125 == Static445.aClass129_65) {
												local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
												local73 = Static76.aClass5_Sub15_Sub2_1.method5539();
												local219 = Static76.aClass5_Sub15_Sub2_1.method5539();
												local223 = Static76.aClass5_Sub15_Sub2_1.method5539();
												local1158 = Static76.aClass5_Sub15_Sub2_1.method5539();
												local1163 = Static76.aClass5_Sub15_Sub2_1.method5598();
												if (Static15.method264(local211)) {
													Static222.aBooleanArray12[local73] = true;
													Static11.anIntArray14[local73] = local219;
													Static193.anIntArray184[local73] = local223;
													Static432.anIntArray486[local73] = local1158;
													Static47.anIntArray42[local73] = local1163;
												}
												Static445.aClass129_65 = null;
												return true;
											} else if (Static136.aClass129_193 == Static445.aClass129_65) {
												Static444.method5902(Static223.aClass163_4);
												Static445.aClass129_65 = null;
												return true;
											} else if (Static445.aClass129_65 == Static414.aClass129_181) {
												local793 = Static76.aClass5_Sub15_Sub2_1.method5539() == 1;
												local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
												local799 = local278;
												if (local793) {
													local799 = Static76.aClass5_Sub15_Sub2_1.method5549();
												}
												local809 = Static76.aClass5_Sub15_Sub2_1.method5598();
												local814 = Static76.aClass5_Sub15_Sub2_1.method5541();
												local1597 = Static76.aClass5_Sub15_Sub2_1.method5539();
												@Pc(6101) long local6101 = (local809 << 32) + local814;
												@Pc(6103) boolean local6103 = false;
												local5327 = 0;
												while (true) {
													if (local5327 >= 100) {
														if (local1597 <= 1) {
															if (Static408.aBoolean459 && !Static337.aBoolean377 || Static146.aBoolean172) {
																local6103 = true;
															} else if (Static333.method4129(local799)) {
																local6103 = true;
															}
														}
														break;
													}
													if (Static28.aLongArray34[local5327] == local6101) {
														local6103 = true;
														break;
													}
													local5327++;
												}
												if (!local6103 && Static219.anInt3646 == 0) {
													Static28.aLongArray34[Static19.anInt416] = local6101;
													Static19.anInt416 = (Static19.anInt416 + 1) % 100;
													@Pc(6165) String local6165 = Static5.method81(Static271.method3662(Static76.aClass5_Sub15_Sub2_1));
													if (local1597 == 2) {
														Static84.method1238("<img=1>" + local278, 0, null, local6165, "<img=1>" + local799, -1, 7);
													} else if (local1597 == 1) {
														Static84.method1238("<img=0>" + local278, 0, null, local6165, "<img=0>" + local799, -1, 7);
													} else {
														Static84.method1238(local278, 0, null, local6165, local799, -1, 3);
													}
												}
												Static445.aClass129_65 = null;
												return true;
											} else if (Static339.aClass129_150 == Static445.aClass129_65) {
												local211 = Static76.aClass5_Sub15_Sub2_1.method5539();
												@Pc(6250) boolean local6250 = (local211 & 0x1) == 1;
												local799 = Static76.aClass5_Sub15_Sub2_1.method5549();
												local2881 = Static76.aClass5_Sub15_Sub2_1.method5549();
												if (local2881.equals("")) {
													local2881 = local799;
												}
												local2883 = Static76.aClass5_Sub15_Sub2_1.method5549();
												local2910 = Static76.aClass5_Sub15_Sub2_1.method5549();
												if (local2910.equals("")) {
													local2910 = local2883;
												}
												if (local6250) {
													for (local311 = 0; local311 < Static150.anInt2695; local311++) {
														if (Static263.aStringArray31[local311].equals(local2910)) {
															Static338.aStringArray36[local311] = local799;
															Static263.aStringArray31[local311] = local2881;
															Static65.aStringArray34[local311] = local2883;
															Static417.aStringArray44[local311] = local2910;
															break;
														}
													}
												} else {
													Static338.aStringArray36[Static150.anInt2695] = local799;
													Static263.aStringArray31[Static150.anInt2695] = local2881;
													Static65.aStringArray34[Static150.anInt2695] = local2883;
													Static417.aStringArray44[Static150.anInt2695] = local2910;
													Static53.aBooleanArray4[Static150.anInt2695] = (local211 & 0x2) == 2;
													Static150.anInt2695++;
												}
												Static62.anInt1134 = Static319.anInt4969;
												Static445.aClass129_65 = null;
												return true;
											} else if (Static445.aClass129_65 == Static326.aClass129_138) {
												local211 = Static76.aClass5_Sub15_Sub2_1.method5598();
												local278 = Static76.aClass5_Sub15_Sub2_1.method5549();
												@Pc(6372) Object[] local6372 = new Object[local278.length() + 1];
												for (local223 = local278.length() - 1; local223 >= 0; local223--) {
													if (local278.charAt(local223) == 's') {
														local6372[local223 + 1] = Static76.aClass5_Sub15_Sub2_1.method5549();
													} else {
														local6372[local223 + 1] = Integer.valueOf(Static76.aClass5_Sub15_Sub2_1.method5603());
													}
												}
												local6372[0] = Integer.valueOf(Static76.aClass5_Sub15_Sub2_1.method5603());
												if (Static15.method264(local211)) {
													@Pc(6430) Class5_Sub33 local6430 = new Class5_Sub33();
													local6430.anObjectArray35 = local6372;
													Static181.method2470(local6430);
												}
												Static445.aClass129_65 = null;
												return true;
											} else {
												Static206.method2769("T1 - " + (Static445.aClass129_65 == null ? -1 : Static445.aClass129_65.method2698()) + "," + (Static304.aClass129_129 == null ? -1 : Static304.aClass129_129.method2698()) + "," + (Static285.aClass129_114 == null ? -1 : Static285.aClass129_114.method2698()) + " - " + Static128.anInt2223, null);
												Static165.method2317(false);
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

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Z")
	public static boolean method2296(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x34) != 0;
	}

	@OriginalMember(owner = "client!hq", name = "a", descriptor = "(II)V")
	public static void method2297(@OriginalArg(1) int arg0) {
		for (@Pc(9) Class5 local9 = Static66.aClass252_8.method5660(); local9 != null; local9 = Static66.aClass252_8.method5666()) {
			if ((local9.aLong234 >> 48 & 0xFFFFL) == (long) arg0) {
				local9.method6003();
			}
		}
	}
}
