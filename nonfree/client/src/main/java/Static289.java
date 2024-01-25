import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static289 {

	@OriginalMember(owner = "client!ls", name = "F", descriptor = "[J")
	public static long[] aLongArray10;

	@OriginalMember(owner = "client!ls", name = "y", descriptor = "Lclient!dv;")
	public static final Class77 aClass77_53 = new Class77(28, 18);

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V")
	public static void method4714(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Static2.aFloat123 < Static2.aFloat122) {
			Static2.aFloat123 = (float) ((double) Static2.aFloat123 + (double) Static2.aFloat123 / 30.0D);
			if (Static2.aFloat122 < Static2.aFloat123) {
				Static2.aFloat123 = Static2.aFloat122;
			}
			Static505.method7495();
			Static2.anInt5909 = (int) Static2.aFloat123 >> 1;
			Static2.aByteArrayArrayArray17 = Static83.method1858(Static2.anInt5909);
		} else if (Static2.aFloat122 < Static2.aFloat123) {
			Static2.aFloat123 = (float) ((double) Static2.aFloat123 - (double) Static2.aFloat123 / 30.0D);
			if (Static2.aFloat122 > Static2.aFloat123) {
				Static2.aFloat123 = Static2.aFloat122;
			}
			Static505.method7495();
			Static2.anInt5909 = (int) Static2.aFloat123 >> 1;
			Static2.aByteArrayArrayArray17 = Static83.method1858(Static2.anInt5909);
		}
		if (Static544.anInt9625 != -1 && Static265.anInt5303 != -1) {
			@Pc(85) int local85 = Static544.anInt9625 - Static153.anInt3358;
			if (local85 < 2 || local85 > 2) {
				local85 /= 8;
			}
			@Pc(101) int local101 = Static265.anInt5303 - Static404.anInt7598;
			Static153.anInt3358 += local85;
			if (local101 < 2 || local101 > 2) {
				local101 /= 8;
			}
			Static404.anInt7598 += local101;
			if (local85 == 0 && local101 == 0) {
				Static265.anInt5303 = -1;
				Static544.anInt9625 = -1;
			}
			Static505.method7495();
		}
		if (Static247.anInt5085 > 0) {
			Static40.anInt812--;
			if (Static40.anInt812 == 0) {
				Static40.anInt812 = 100;
				Static247.anInt5085--;
			}
		} else {
			Static420.anInt7807 = -1;
			Static288.anInt5602 = -1;
		}
		if (!Static287.aBoolean426 || Static284.aClass73_46 == null) {
			return;
		}
		for (@Pc(172) Class12_Sub2 local172 = (Class12_Sub2) Static284.aClass73_46.method2005(); local172 != null; local172 = (Class12_Sub2) Static284.aClass73_46.method2009()) {
			@Pc(181) Class152 local181 = Static2.aClass93_5.method2480(local172.aClass12_Sub12_1.anInt2333);
			if (local172.method380(arg0, arg1)) {
				if (local181.aStringArray27 != null) {
					if (local181.aStringArray27[4] != null) {
						Static160.method3297(local181.aString45, 0, local181.anInt4724, 1004, -1, true, (long) local172.aClass12_Sub12_1.anInt2333, local181.aStringArray27[4], -1, false);
					}
					if (local181.aStringArray27[3] != null) {
						Static160.method3297(local181.aString45, 0, local181.anInt4724, 1006, -1, true, (long) local172.aClass12_Sub12_1.anInt2333, local181.aStringArray27[3], -1, false);
					}
					if (local181.aStringArray27[2] != null) {
						Static160.method3297(local181.aString45, 0, local181.anInt4724, 1001, -1, true, (long) local172.aClass12_Sub12_1.anInt2333, local181.aStringArray27[2], -1, false);
					}
					if (local181.aStringArray27[1] != null) {
						Static160.method3297(local181.aString45, 0, local181.anInt4724, 1012, -1, true, (long) local172.aClass12_Sub12_1.anInt2333, local181.aStringArray27[1], -1, false);
					}
					if (local181.aStringArray27[0] != null) {
						Static160.method3297(local181.aString45, 0, local181.anInt4724, 1003, -1, true, (long) local172.aClass12_Sub12_1.anInt2333, local181.aStringArray27[0], -1, false);
					}
				}
				if (!local172.aClass12_Sub12_1.aBoolean197) {
					local172.aClass12_Sub12_1.aBoolean197 = true;
					Static312.method5021(Static193.aClass98_3, local172.aClass12_Sub12_1.anInt2333, local181.anInt4724);
				}
				if (local172.aClass12_Sub12_1.aBoolean197) {
					Static312.method5021(Static270.aClass98_11, local172.aClass12_Sub12_1.anInt2333, local181.anInt4724);
				}
			} else if (local172.aClass12_Sub12_1.aBoolean197) {
				local172.aClass12_Sub12_1.aBoolean197 = false;
				Static312.method5021(Static387.aClass98_9, local172.aClass12_Sub12_1.anInt2333, local181.anInt4724);
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)Z")
	public static boolean method4716() throws IOException {
		if (Static491.aClass277_2 == null) {
			return false;
		}
		@Pc(73) int local73;
		if (Static10.aClass45_4 == null) {
			if (Static370.aBoolean495) {
				if (!Static491.aClass277_2.method7166(1)) {
					return false;
				}
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
				Static370.aBoolean495 = false;
				Static123.anInt2885 = 0;
				Static59.anInt1444++;
			}
			Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
			if (Static394.aClass12_Sub8_Sub2_2.method5235()) {
				if (!Static491.aClass277_2.method7166(1)) {
					return false;
				}
				Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 1);
				Static123.anInt2885 = 0;
				Static59.anInt1444++;
			}
			Static370.aBoolean495 = true;
			@Pc(69) Class45[] local69 = Static254.method4369();
			local73 = Static394.aClass12_Sub8_Sub2_2.method5233();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static394.aClass12_Sub8_Sub2_2.anInt6217);
			}
			Static10.aClass45_4 = local69[local73];
			Static331.anInt6307 = Static10.aClass45_4.anInt1405;
		}
		if (Static331.anInt6307 == -1) {
			if (!Static491.aClass277_2.method7166(1)) {
				return false;
			}
			Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 1, 0);
			Static59.anInt1444++;
			Static123.anInt2885 = 0;
			Static331.anInt6307 = Static394.aClass12_Sub8_Sub2_2.aByteArray82[0] & 0xFF;
		}
		if (Static331.anInt6307 == -2) {
			if (!Static491.aClass277_2.method7166(2)) {
				return false;
			}
			Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, 2, 0);
			Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
			Static331.anInt6307 = Static394.aClass12_Sub8_Sub2_2.method5199();
			Static123.anInt2885 = 0;
			Static59.anInt1444 += 2;
		}
		if (Static331.anInt6307 > 0) {
			if (!Static491.aClass277_2.method7166(Static331.anInt6307)) {
				return false;
			}
			Static394.aClass12_Sub8_Sub2_2.anInt6217 = 0;
			Static491.aClass277_2.method7168(Static394.aClass12_Sub8_Sub2_2.aByteArray82, Static331.anInt6307, 0);
			Static59.anInt1444 += Static331.anInt6307;
			Static123.anInt2885 = 0;
		}
		Static376.aClass45_154 = Static402.aClass45_117;
		Static402.aClass45_117 = Static167.aClass45_49;
		Static167.aClass45_49 = Static10.aClass45_4;
		@Pc(226) int local226;
		@Pc(230) int local230;
		@Pc(218) int local218;
		if (Static226.aClass45_71 == Static10.aClass45_4) {
			local218 = Static394.aClass12_Sub8_Sub2_2.method5204();
			local73 = Static394.aClass12_Sub8_Sub2_2.method5226();
			local226 = Static394.aClass12_Sub8_Sub2_2.method5198();
			local230 = Static394.aClass12_Sub8_Sub2_2.method5198();
			if (Static363.method5670(local218)) {
				Static426.method5113((local226 << 16) + local230, local73);
			}
			Static10.aClass45_4 = null;
			return true;
		} else if (Static69.aClass45_143 == Static10.aClass45_4) {
			local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
			local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
			local226 = Static394.aClass12_Sub8_Sub2_2.method5225();
			if (Static363.method5670(local73)) {
				Static412.method6428(local226, local218);
			}
			Static10.aClass45_4 = null;
			return true;
		} else if (Static10.aClass45_4 == Static347.aClass45_97) {
			local218 = Static394.aClass12_Sub8_Sub2_2.method5226();
			local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
			if (Static363.method5670(local73)) {
				Static544.method7973(3, -1, -1, local218);
			}
			Static10.aClass45_4 = null;
			return true;
		} else if (Static335.aClass45_94 == Static10.aClass45_4) {
			Static467.method7013();
			Static10.aClass45_4 = null;
			return false;
		} else if (Static401.aClass45_115 == Static10.aClass45_4) {
			local218 = Static394.aClass12_Sub8_Sub2_2.method5210();
			local73 = Static394.aClass12_Sub8_Sub2_2.method5225();
			Static393.aClass31_1.method790(local73, local218);
			Static10.aClass45_4 = null;
			return true;
		} else if (Static10.aClass45_4 == Static374.aClass45_105) {
			local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
			local73 = Static394.aClass12_Sub8_Sub2_2.method5225();
			if (Static363.method5670(local218)) {
				@Pc(349) Class12_Sub34 local349 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local73);
				if (local349 != null) {
					Static102.method2109(true, local349, false);
				}
				if (Static188.aClass198_5 != null) {
					Static331.method5282(Static188.aClass198_5);
					Static188.aClass198_5 = null;
				}
			}
			Static10.aClass45_4 = null;
			return true;
		} else if (Static39.aClass45_13 == Static10.aClass45_4) {
			Static540.anInt9595 = Static394.aClass12_Sub8_Sub2_2.method5216();
			Static10.aClass45_4 = null;
			return true;
		} else {
			@Pc(412) int local412;
			@Pc(396) String local396;
			@Pc(392) boolean local392;
			@Pc(398) String local398;
			@Pc(438) String local438;
			@Pc(414) boolean local414;
			if (Static168.aClass45_139 == Static10.aClass45_4) {
				local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
				local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
				local398 = local396;
				if (local392) {
					local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
				}
				local230 = Static394.aClass12_Sub8_Sub2_2.method5216();
				local412 = Static394.aClass12_Sub8_Sub2_2.method5199();
				local414 = false;
				if (local230 <= 1 && Static303.method4926(local398)) {
					local414 = true;
				}
				if (!local414 && Static339.anInt6471 == 0) {
					local438 = Static186.aClass122_1.method3365(local412).method6771(Static394.aClass12_Sub8_Sub2_2);
					if (local230 == 2) {
						Static36.method6954(0, "<img=1>" + local396, local412, 25, null, local438, "<img=1>" + local398);
					} else if (local230 == 1) {
						Static36.method6954(0, "<img=0>" + local396, local412, 25, null, local438, "<img=0>" + local398);
					} else {
						Static36.method6954(0, local396, local412, 25, null, local438, local398);
					}
				}
				Static10.aClass45_4 = null;
				return true;
			} else if (Static10.aClass45_4 == Static252.aClass45_76) {
				if (Static406.anInt7660 != -1) {
					Static376.method7936(0, Static406.anInt7660);
				}
				Static10.aClass45_4 = null;
				return true;
			} else if (Static10.aClass45_4 == Static59.aClass45_23) {
				local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
				if (local218 == 65535) {
					local218 = -1;
				}
				local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
				local226 = Static394.aClass12_Sub8_Sub2_2.method5199();
				local230 = Static394.aClass12_Sub8_Sub2_2.method5216();
				Static283.method7814(local226, local218, local230, local73);
				Static10.aClass45_4 = null;
				return true;
			} else if (Static10.aClass45_4 == Static270.aClass45_126) {
				local218 = Static394.aClass12_Sub8_Sub2_2.method5184();
				local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
				local226 = Static394.aClass12_Sub8_Sub2_2.method5226();
				if (Static363.method5670(local73)) {
					Static445.method6724(local226, local218);
				}
				Static10.aClass45_4 = null;
				return true;
			} else {
				@Pc(609) long local609;
				@Pc(619) long local619;
				@Pc(614) long local614;
				@Pc(623) int local623;
				@Pc(633) int local633;
				if (Static25.aClass45_6 == Static10.aClass45_4) {
					local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
					local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
					local398 = local396;
					if (local392) {
						local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
					}
					local609 = Static394.aClass12_Sub8_Sub2_2.method5191();
					local614 = Static394.aClass12_Sub8_Sub2_2.method5199();
					local619 = Static394.aClass12_Sub8_Sub2_2.method5195();
					local623 = Static394.aClass12_Sub8_Sub2_2.method5216();
					@Pc(629) long local629 = local619 + (local614 << 32);
					@Pc(631) boolean local631 = false;
					local633 = 0;
					while (true) {
						if (local633 >= 100) {
							if (local623 <= 1) {
								if (Static451.aBoolean358 && !Static163.aBoolean313 || Static541.aBoolean683) {
									local631 = true;
								} else if (Static303.method4926(local398)) {
									local631 = true;
								}
							}
							break;
						}
						if (Static211.aLongArray9[local633] == local629) {
							local631 = true;
							break;
						}
						local633++;
					}
					if (!local631 && Static339.anInt6471 == 0) {
						Static211.aLongArray9[Static125.anInt2919] = local629;
						Static125.anInt2919 = (Static125.anInt2919 + 1) % 100;
						@Pc(695) String local695 = Static440.method6680(Static68.method1561(Static394.aClass12_Sub8_Sub2_2));
						if (local623 == 2 || local623 == 3) {
							Static36.method6954(0, "<img=1>" + local396, -1, 9, Static490.method7291(local609), local695, "<img=1>" + local398);
						} else if (local623 == 1) {
							Static36.method6954(0, "<img=0>" + local396, -1, 9, Static490.method7291(local609), local695, "<img=0>" + local398);
						} else {
							Static36.method6954(0, local396, -1, 9, Static490.method7291(local609), local695, local398);
						}
					}
					Static10.aClass45_4 = null;
					return true;
				}
				@Pc(807) int local807;
				@Pc(819) int local819;
				@Pc(813) int local813;
				@Pc(823) int local823;
				if (Static175.aClass45_56 == Static10.aClass45_4) {
					local218 = Static394.aClass12_Sub8_Sub2_2.method5204();
					if (local218 == 65535) {
						local218 = -1;
					}
					local73 = Static394.aClass12_Sub8_Sub2_2.method5177();
					local226 = local73 >> 2;
					local230 = local73 & 0x3;
					local412 = Static58.anIntArray137[local226];
					local807 = Static394.aClass12_Sub8_Sub2_2.method5213();
					local813 = local807 >> 28 & 0x3;
					local819 = local807 >> 14 & 0x3FFF;
					local823 = local807 & 0x3FFF;
					local819 -= Static61.anInt1459;
					local823 -= Static203.anInt4534;
					Static11.method296(local226, local813, local230, local819, local823, local218, local412);
					Static10.aClass45_4 = null;
					return true;
				} else if (Static10.aClass45_4 == Static522.aClass45_146) {
					local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
					local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
					local226 = Static394.aClass12_Sub8_Sub2_2.method5226();
					if (Static363.method5670(local73)) {
						Static99.method2091(local226, local218);
					}
					Static10.aClass45_4 = null;
					return true;
				} else if (Static544.aClass45_155 == Static10.aClass45_4) {
					local218 = Static394.aClass12_Sub8_Sub2_2.method5226();
					local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
					local226 = Static394.aClass12_Sub8_Sub2_2.method5210();
					local230 = Static394.aClass12_Sub8_Sub2_2.method5210();
					local412 = Static394.aClass12_Sub8_Sub2_2.method5199();
					if (Static363.method5670(local226)) {
						Static544.method7973(7, local73 << 16 | local230, local412, local218);
					}
					Static10.aClass45_4 = null;
					return true;
				} else if (Static31.aClass45_8 == Static10.aClass45_4) {
					Static365.method5699(Static67.aClass202_5);
					Static10.aClass45_4 = null;
					return true;
				} else if (Static283.aClass45_150 == Static10.aClass45_4) {
					local218 = Static394.aClass12_Sub8_Sub2_2.method5225();
					local73 = Static394.aClass12_Sub8_Sub2_2.method5198();
					Static393.aClass31_1.method789(local73, local218);
					Static10.aClass45_4 = null;
					return true;
				} else if (Static10.aClass45_4 == Static153.aClass45_46) {
					Static365.method5699(Static393.aClass202_36);
					Static10.aClass45_4 = null;
					return true;
				} else if (Static408.aClass45_120 == Static10.aClass45_4) {
					local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
					if (local218 == 65535) {
						local218 = -1;
					}
					local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
					local226 = Static394.aClass12_Sub8_Sub2_2.method5199();
					local230 = Static394.aClass12_Sub8_Sub2_2.method5216();
					Static401.method6305(local73, local226, local218, local230);
					Static10.aClass45_4 = null;
					return true;
				} else if (Static139.aClass45_44 == Static10.aClass45_4) {
					local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
					if (Static363.method5670(local218)) {
						Static255.method4376();
					}
					Static10.aClass45_4 = null;
					return true;
				} else if (Static10.aClass45_4 == Static340.aClass45_96) {
					local218 = Static394.aClass12_Sub8_Sub2_2.method5225();
					local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
					local226 = Static394.aClass12_Sub8_Sub2_2.method5199();
					if (Static363.method5670(local226)) {
						Static487.method7282(local218, local73);
					}
					Static10.aClass45_4 = null;
					return true;
				} else if (Static10.aClass45_4 == Static184.aClass45_61) {
					local218 = Static394.aClass12_Sub8_Sub2_2.method5210();
					local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
					local226 = Static394.aClass12_Sub8_Sub2_2.method5198();
					if (Static363.method5670(local73)) {
						Static154.method3047(local218, local226);
					}
					Static10.aClass45_4 = null;
					return true;
				} else if (Static10.aClass45_4 == Static451.aClass45_68) {
					Static365.method5699(Static183.aClass202_23);
					Static10.aClass45_4 = null;
					return true;
				} else if (Static10.aClass45_4 == Static397.aClass45_112) {
					Static348.method5474(true);
					Static10.aClass45_4 = null;
					return true;
				} else {
					@Pc(1098) boolean local1098;
					if (Static10.aClass45_4 == Static40.aClass45_14) {
						local218 = Static394.aClass12_Sub8_Sub2_2.method5198();
						local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local1098 = (local73 & 0x1) == 1;
						Static274.method4602(local218, local1098);
						Static365.anIntArray469[Static66.anInt1515++ & 0x1F] = local218;
						Static10.aClass45_4 = null;
						return true;
					} else if (Static10.aClass45_4 == Static55.aClass45_22) {
						local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
						local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
						local1098 = (local73 & 0x1) == 1;
						while (Static331.anInt6307 > Static394.aClass12_Sub8_Sub2_2.anInt6217) {
							local230 = Static394.aClass12_Sub8_Sub2_2.method5218();
							local412 = Static394.aClass12_Sub8_Sub2_2.method5199();
							local807 = 0;
							if (local412 != 0) {
								local807 = Static394.aClass12_Sub8_Sub2_2.method5216();
								if (local807 == 255) {
									local807 = Static394.aClass12_Sub8_Sub2_2.method5225();
								}
							}
							Static174.method3476(local412 - 1, local230, local218, local1098, local807);
						}
						Static365.anIntArray469[Static66.anInt1515++ & 0x1F] = local218;
						Static10.aClass45_4 = null;
						return true;
					} else if (Static10.aClass45_4 == Static410.aClass45_122) {
						Static365.method5699(Static88.aClass202_7);
						Static10.aClass45_4 = null;
						return true;
					} else if (Static10.aClass45_4 == Static170.aClass45_52) {
						local218 = Static394.aClass12_Sub8_Sub2_2.method5226();
						local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
						local226 = Static394.aClass12_Sub8_Sub2_2.method5227();
						local230 = Static394.aClass12_Sub8_Sub2_2.method5217();
						if (Static363.method5670(local73)) {
							Static478.method7173(local218, local230, local226);
						}
						Static10.aClass45_4 = null;
						return true;
					} else {
						@Pc(1283) int local1283;
						if (Static496.aClass45_103 == Static10.aClass45_4) {
							local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
							local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
							local398 = local396;
							if (local392) {
								local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
							}
							local609 = Static394.aClass12_Sub8_Sub2_2.method5199();
							local614 = Static394.aClass12_Sub8_Sub2_2.method5195();
							local819 = Static394.aClass12_Sub8_Sub2_2.method5216();
							@Pc(1279) long local1279 = local614 + (local609 << 32);
							@Pc(1281) boolean local1281 = false;
							local1283 = 0;
							while (true) {
								if (local1283 >= 100) {
									if (local819 <= 1) {
										if (Static451.aBoolean358 && !Static163.aBoolean313 || Static541.aBoolean683) {
											local1281 = true;
										} else if (Static303.method4926(local398)) {
											local1281 = true;
										}
									}
									break;
								}
								if (local1279 == Static211.aLongArray9[local1283]) {
									local1281 = true;
									break;
								}
								local1283++;
							}
							if (!local1281 && Static339.anInt6471 == 0) {
								Static211.aLongArray9[Static125.anInt2919] = local1279;
								Static125.anInt2919 = (Static125.anInt2919 + 1) % 100;
								@Pc(1344) String local1344 = Static440.method6680(Static68.method1561(Static394.aClass12_Sub8_Sub2_2));
								if (local819 == 2) {
									Static36.method6954(0, "<img=1>" + local396, -1, 7, null, local1344, "<img=1>" + local398);
								} else if (local819 == 1) {
									Static36.method6954(0, "<img=0>" + local396, -1, 7, null, local1344, "<img=0>" + local398);
								} else {
									Static36.method6954(0, local396, -1, 3, null, local1344, local398);
								}
							}
							Static10.aClass45_4 = null;
							return true;
						}
						@Pc(1863) boolean local1863;
						@Pc(1496) int local1496;
						@Pc(1904) int local1904;
						if (Static10.aClass45_4 == Static259.aClass45_77) {
							local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
							local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
							local226 = Static394.aClass12_Sub8_Sub2_2.method5210();
							local230 = Static394.aClass12_Sub8_Sub2_2.method5202();
							local412 = Static394.aClass12_Sub8_Sub2_2.method5186();
							local414 = (local230 & 0x80) != 0;
							if (local412 >> 30 == 0) {
								@Pc(1654) Class64 local1654;
								@Pc(1600) Class50 local1600;
								@Pc(1621) Class64 local1621;
								if (local412 >> 29 != 0) {
									local813 = local412 & 0xFFFF;
									@Pc(1559) Class12_Sub41 local1559 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local813);
									if (local1559 != null) {
										if (local218 == 65535) {
											local218 = -1;
										}
										@Pc(1571) Class30_Sub1_Sub1_Sub2 local1571 = local1559.aClass30_Sub1_Sub1_Sub2_2;
										@Pc(1573) boolean local1573 = true;
										local1496 = local414 ? local1571.anInt4126 : local1571.anInt4157;
										if (local218 != -1 && local1496 != -1) {
											if (local1496 == local218) {
												local1600 = Static82.aClass212_2.method5063(local218);
												if (local1600.aBoolean101 && local1600.anInt1432 != -1) {
													local1654 = Static47.aClass41_1.method911(local1600.anInt1432);
													local633 = local1654.anInt1972;
													if (local633 == 0 || local633 == 2) {
														local1573 = false;
													} else if (local633 == 1) {
														local1573 = true;
													}
												}
											} else {
												local1600 = Static82.aClass212_2.method5063(local218);
												@Pc(1605) Class50 local1605 = Static82.aClass212_2.method5063(local1496);
												if (local1600.anInt1432 != -1 && local1605.anInt1432 != -1) {
													local1621 = Static47.aClass41_1.method911(local1600.anInt1432);
													@Pc(1627) Class64 local1627 = Static47.aClass41_1.method911(local1605.anInt1432);
													if (local1627.anInt1968 > local1621.anInt1968) {
														local1573 = false;
													}
												}
											}
										}
										if (local1573) {
											if (local414) {
												local1571.anInt4134 = 1;
												local1571.anInt4140 = 0;
												local1571.anInt4185 = local226;
												local1571.anInt4136 = local230 & 0x7;
												local1571.anInt4183 = 0;
												local1571.anInt4126 = local218;
												local1571.anInt4131 = local73 + Static409.anInt7683;
												if (Static409.anInt7683 < local1571.anInt4131) {
													local1571.anInt4140 = -1;
												}
												if (local1571.anInt4126 != -1 && local1571.anInt4131 == Static409.anInt7683) {
													local1283 = Static82.aClass212_2.method5063(local1571.anInt4126).anInt1432;
													if (local1283 != -1) {
														local1654 = Static47.aClass41_1.method911(local1283);
														if (local1654 != null && local1654.anIntArray185 != null) {
															Static349.method5479(local1571.anInt9416, local1571.aByte99, false, 0, local1654, local1571.anInt9418);
														}
													}
												}
											} else {
												local1571.anInt4130 = 0;
												local1571.anInt4191 = 1;
												local1571.anInt4172 = Static409.anInt7683 + local73;
												local1571.anInt4184 = local226;
												local1571.anInt4157 = local218;
												local1571.anInt4145 = 0;
												local1571.anInt4195 = local230 & 0x7;
												if (Static409.anInt7683 < local1571.anInt4172) {
													local1571.anInt4145 = -1;
												}
												if (local1571.anInt4157 != -1 && Static409.anInt7683 == local1571.anInt4172) {
													local1283 = Static82.aClass212_2.method5063(local1571.anInt4157).anInt1432;
													if (local1283 != -1) {
														local1654 = Static47.aClass41_1.method911(local1283);
														if (local1654 != null && local1654.anIntArray185 != null) {
															Static349.method5479(local1571.anInt9416, local1571.aByte99, false, 0, local1654, local1571.anInt9418);
														}
													}
												}
											}
										}
									}
								} else if (local412 >> 28 != 0) {
									local813 = local412 & 0xFFFF;
									@Pc(1848) Class30_Sub1_Sub1_Sub1 local1848;
									if (local813 == Static396.anInt7452) {
										local1848 = Static440.aClass30_Sub1_Sub1_Sub1_2;
									} else {
										local1848 = Static90.aClass30_Sub1_Sub1_Sub1Array1[local813];
									}
									if (local1848 != null) {
										if (local218 == 65535) {
											local218 = -1;
										}
										local1863 = true;
										local623 = local414 ? local1848.anInt4126 : local1848.anInt4157;
										@Pc(1901) Class64 local1901;
										if (local218 != -1 && local623 != -1) {
											@Pc(1887) Class50 local1887;
											if (local623 == local218) {
												local1887 = Static82.aClass212_2.method5063(local218);
												if (local1887.aBoolean101 && local1887.anInt1432 != -1) {
													local1901 = Static47.aClass41_1.method911(local1887.anInt1432);
													local1904 = local1901.anInt1972;
													if (local1904 == 0 || local1904 == 2) {
														local1863 = false;
													} else if (local1904 == 1) {
														local1863 = true;
													}
												}
											} else {
												local1887 = Static82.aClass212_2.method5063(local218);
												local1600 = Static82.aClass212_2.method5063(local623);
												if (local1887.anInt1432 != -1 && local1600.anInt1432 != -1) {
													local1654 = Static47.aClass41_1.method911(local1887.anInt1432);
													local1621 = Static47.aClass41_1.method911(local1600.anInt1432);
													if (local1621.anInt1968 > local1654.anInt1968) {
														local1863 = false;
													}
												}
											}
										}
										if (local1863) {
											if (local414) {
												local1848.anInt4185 = local226;
												local1848.anInt4183 = 0;
												local1848.anInt4140 = 0;
												local1848.anInt4134 = 1;
												local1848.anInt4126 = local218;
												local1848.anInt4131 = Static409.anInt7683 + local73;
												local1848.anInt4136 = local230 & 0x7;
												if (Static409.anInt7683 < local1848.anInt4131) {
													local1848.anInt4140 = -1;
												}
												if (local1848.anInt4126 == 65535) {
													local1848.anInt4126 = -1;
												}
												if (local1848.anInt4126 != -1 && Static409.anInt7683 == local1848.anInt4131) {
													local1496 = Static82.aClass212_2.method5063(local1848.anInt4126).anInt1432;
													if (local1496 != -1) {
														local1901 = Static47.aClass41_1.method911(local1496);
														if (local1901 != null && local1901.anIntArray185 != null) {
															Static349.method5479(local1848.anInt9416, local1848.aByte99, local1848 == Static440.aClass30_Sub1_Sub1_Sub1_2, 0, local1901, local1848.anInt9418);
														}
													}
												}
											} else {
												local1848.anInt4145 = 0;
												local1848.anInt4195 = local230 & 0x7;
												local1848.anInt4130 = 0;
												local1848.anInt4184 = local226;
												local1848.anInt4172 = Static409.anInt7683 + local73;
												local1848.anInt4157 = local218;
												local1848.anInt4191 = 1;
												if (local1848.anInt4172 > Static409.anInt7683) {
													local1848.anInt4145 = -1;
												}
												if (local1848.anInt4157 == 65535) {
													local1848.anInt4157 = -1;
												}
												if (local1848.anInt4157 != -1 && local1848.anInt4172 == Static409.anInt7683) {
													local1496 = Static82.aClass212_2.method5063(local1848.anInt4157).anInt1432;
													if (local1496 != -1) {
														local1901 = Static47.aClass41_1.method911(local1496);
														if (local1901 != null && local1901.anIntArray185 != null) {
															Static349.method5479(local1848.anInt9416, local1848.aByte99, Static440.aClass30_Sub1_Sub1_Sub1_2 == local1848, 0, local1901, local1848.anInt9418);
														}
													}
												}
											}
										}
									}
								}
							} else {
								local813 = local412 >> 28 & 0x3;
								local819 = (local412 >> 14 & 0x3FFF) - Static61.anInt1459;
								local823 = (local412 & 0x3FFF) - Static203.anInt4534;
								if (local819 >= 0 && local823 >= 0 && Static37.anInt7512 > local819 && Static329.anInt6247 > local823) {
									local623 = local819 * 128 + 64;
									local1496 = local823 * 128 + 64;
									local1283 = local813;
									if (local813 < 3 && Static112.method2322(local823, local819)) {
										local1283 = local813 + 1;
									}
									@Pc(1532) Class30_Sub1_Sub4 local1532 = new Class30_Sub1_Sub4(local218, 0, Static409.anInt7683, local813, local1283, local623, Static443.method6717(local623, local1496, local813) - local226, local1496, local819, local819, local823, local823, local230);
									Static376.aClass73_77.method2012(new Class12_Sub4_Sub15(local1532));
								}
							}
							Static10.aClass45_4 = null;
							return true;
						} else if (Static52.aClass45_20 == Static10.aClass45_4) {
							Static10.aClass45_4 = null;
							return false;
						} else if (Static10.aClass45_4 == Static523.aClass45_148) {
							Static394.aClass12_Sub8_Sub2_2.anInt6217 += 28;
							if (Static394.aClass12_Sub8_Sub2_2.method5211()) {
								Static453.method6834(Static394.aClass12_Sub8_Sub2_2.anInt6217 - 28, Static394.aClass12_Sub8_Sub2_2);
							}
							Static10.aClass45_4 = null;
							return true;
						} else if (Static8.aClass45_3 == Static10.aClass45_4) {
							Static365.method5699(Static237.aClass202_25);
							Static10.aClass45_4 = null;
							return true;
						} else if (Static28.aClass45_75 == Static10.aClass45_4) {
							local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
							if (local218 == 65535) {
								local218 = -1;
							}
							local73 = Static394.aClass12_Sub8_Sub2_2.method5184();
							local226 = Static394.aClass12_Sub8_Sub2_2.method5202();
							Static387.method6125(local73, local226, local218);
							Static10.aClass45_4 = null;
							return true;
						} else if (Static63.aClass45_124 == Static10.aClass45_4) {
							local218 = Static394.aClass12_Sub8_Sub2_2.method5212();
							local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
							local226 = Static394.aClass12_Sub8_Sub2_2.method5199();
							if (local226 == 65535) {
								local226 = -1;
							}
							Static387.method6120(local226, local73, local218);
							Static10.aClass45_4 = null;
							return true;
						} else if (Static10.aClass45_4 == Static250.aClass45_73) {
							local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
							local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
							if (Static363.method5670(local218)) {
								Static123.anInt2886 = local73;
							}
							Static10.aClass45_4 = null;
							return true;
						} else {
							@Pc(2452) boolean local2452;
							@Pc(2473) Class169 local2473;
							if (Static473.aClass45_133 == Static10.aClass45_4) {
								Static250.anInt5147 = Static413.anInt7729;
								if (Static331.anInt6307 == 0) {
									Static224.aClass169Array5 = null;
									Static124.anInt2889 = 0;
									Static482.aString99 = null;
									Static10.aClass45_4 = null;
									Static249.aString50 = null;
									return true;
								}
								Static249.aString50 = Static394.aClass12_Sub8_Sub2_2.method5206();
								local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
								if (local392) {
									Static394.aClass12_Sub8_Sub2_2.method5206();
								}
								@Pc(2319) long local2319 = Static394.aClass12_Sub8_Sub2_2.method5191();
								Static482.aString99 = Static104.method2138(local2319);
								Static355.aByte80 = Static394.aClass12_Sub8_Sub2_2.method5173();
								local230 = Static394.aClass12_Sub8_Sub2_2.method5216();
								if (local230 == 255) {
									Static10.aClass45_4 = null;
									return true;
								}
								Static124.anInt2889 = local230;
								@Pc(2345) Class169[] local2345 = new Class169[100];
								for (local807 = 0; local807 < Static124.anInt2889; local807++) {
									local2345[local807] = new Class169();
									local2345[local807].aString49 = Static394.aClass12_Sub8_Sub2_2.method5206();
									local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
									if (local392) {
										local2345[local807].aString47 = Static394.aClass12_Sub8_Sub2_2.method5206();
									} else {
										local2345[local807].aString47 = local2345[local807].aString49;
									}
									local2345[local807].aString46 = Static458.method6893(local2345[local807].aString47);
									local2345[local807].anInt5101 = Static394.aClass12_Sub8_Sub2_2.method5199();
									local2345[local807].aByte64 = Static394.aClass12_Sub8_Sub2_2.method5173();
									local2345[local807].aString48 = Static394.aClass12_Sub8_Sub2_2.method5206();
									if (local2345[local807].aString47.equals(Static440.aClass30_Sub1_Sub1_Sub1_2.aString6)) {
										Static328.aByte76 = local2345[local807].aByte64;
									}
								}
								local823 = Static124.anInt2889;
								while (local823 > 0) {
									local2452 = true;
									local823--;
									for (local623 = 0; local623 < local823; local623++) {
										if (local2345[local623].aString46.compareTo(local2345[local623 + 1].aString46) > 0) {
											local2473 = local2345[local623];
											local2345[local623] = local2345[local623 + 1];
											local2452 = false;
											local2345[local623 + 1] = local2473;
										}
									}
									if (local2452) {
										break;
									}
								}
								Static10.aClass45_4 = null;
								Static224.aClass169Array5 = local2345;
								return true;
							} else if (Static10.aClass45_4 == Static357.aClass45_101) {
								local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
								local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
								local226 = Static394.aClass12_Sub8_Sub2_2.method5216();
								local230 = Static394.aClass12_Sub8_Sub2_2.method5199() << 0;
								local412 = Static394.aClass12_Sub8_Sub2_2.method5216();
								local807 = Static394.aClass12_Sub8_Sub2_2.method5216();
								if (Static363.method5670(local218)) {
									Static96.method2063(local412, local226, local807, local73, local230);
								}
								Static10.aClass45_4 = null;
								return true;
							} else if (Static10.aClass45_4 == Static500.aClass45_142) {
								Static365.method5699(Static265.aClass202_27);
								Static10.aClass45_4 = null;
								return true;
							} else if (Static10.aClass45_4 == Static526.aClass45_149) {
								local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
								if (Static363.method5670(local218)) {
									Static479.method7191();
								}
								Static10.aClass45_4 = null;
								return true;
							} else if (Static484.aClass45_138 == Static10.aClass45_4) {
								Static155.anInt3380 = 1;
								Static10.aClass45_4 = null;
								Static395.anInt7445 = Static413.anInt7729;
								return true;
							} else {
								@Pc(2606) String local2606;
								@Pc(2633) String local2633;
								@Pc(2604) String local2604;
								if (Static10.aClass45_4 == Static303.aClass45_87) {
									local218 = Static394.aClass12_Sub8_Sub2_2.method5218();
									local73 = Static394.aClass12_Sub8_Sub2_2.method5225();
									local226 = Static394.aClass12_Sub8_Sub2_2.method5216();
									local2604 = "";
									local2606 = local2604;
									if ((local226 & 0x1) != 0) {
										local2604 = Static394.aClass12_Sub8_Sub2_2.method5206();
										if ((local226 & 0x2) == 0) {
											local2606 = local2604;
										} else {
											local2606 = Static394.aClass12_Sub8_Sub2_2.method5206();
										}
									}
									local2633 = Static394.aClass12_Sub8_Sub2_2.method5206();
									if (local218 == 99) {
										Static479.method7197(local2633);
									} else if (local2606.equals("") || !Static303.method4926(local2606)) {
										Static406.method6373(local2606, local218, local73, local2604, local2633);
									} else {
										Static10.aClass45_4 = null;
										return true;
									}
									Static10.aClass45_4 = null;
									return true;
								} else if (Static10.aClass45_4 == Static447.aClass45_130) {
									Static365.method5699(Static56.aClass202_4);
									Static10.aClass45_4 = null;
									return true;
								} else if (Static492.aClass45_129 == Static10.aClass45_4) {
									local218 = Static394.aClass12_Sub8_Sub2_2.method5213();
									local73 = Static394.aClass12_Sub8_Sub2_2.method5204();
									if (local73 == 65535) {
										local73 = -1;
									}
									local226 = Static394.aClass12_Sub8_Sub2_2.method5204();
									if (Static363.method5670(local226)) {
										Static544.method7973(1, local73, -1, local218);
									}
									Static10.aClass45_4 = null;
									return true;
								} else if (Static274.aClass45_82 == Static10.aClass45_4) {
									local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
									local73 = Static394.aClass12_Sub8_Sub2_2.method5177();
									local226 = Static394.aClass12_Sub8_Sub2_2.method5204();
									if (Static363.method5670(local226)) {
										if (local73 == 2) {
											Static460.method6599();
										}
										Static406.anInt7660 = local218;
										Static382.method6045(local218);
										Static53.method1407(false);
										Static312.method5016(Static406.anInt7660);
										for (local230 = 0; local230 < 100; local230++) {
											Static154.aBooleanArray31[local230] = true;
										}
									}
									Static10.aClass45_4 = null;
									return true;
								} else if (Static405.aClass45_119 == Static10.aClass45_4) {
									local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
									local73 = Static394.aClass12_Sub8_Sub2_2.method5225();
									local226 = Static394.aClass12_Sub8_Sub2_2.method5210();
									if (local226 == 65535) {
										local226 = -1;
									}
									local230 = Static394.aClass12_Sub8_Sub2_2.method5226();
									if (Static363.method5670(local218)) {
										Static25.method529(local73, local226, local230);
										@Pc(2804) Class56 local2804 = Static150.aClass254_2.method6340(local226);
										Static228.method4109(local2804.anInt1643, local2804.anInt1664, local73, local2804.anInt1617);
										Static134.method2771(local2804.anInt1671, local2804.anInt1656, local2804.anInt1670, local73);
									}
									Static10.aClass45_4 = null;
									return true;
								} else if (Static10.aClass45_4 == Static67.aClass45_25) {
									client.lb = Static394.aClass12_Sub8_Sub2_2.method5209() << 3;
									Static414.anInt7744 = Static394.aClass12_Sub8_Sub2_2.method5184();
									Static392.anInt7423 = Static394.aClass12_Sub8_Sub2_2.method5209() << 3;
									Static10.aClass45_4 = null;
									return true;
								} else {
									@Pc(2860) byte local2860;
									if (Static10.aClass45_4 == Static190.aClass45_65) {
										local218 = Static394.aClass12_Sub8_Sub2_2.method5198();
										local2860 = Static394.aClass12_Sub8_Sub2_2.method5222();
										Static393.aClass31_1.method790(local2860, local218);
										Static10.aClass45_4 = null;
										return true;
									} else if (Static10.aClass45_4 == Static53.aClass45_21) {
										Static365.method5699(Static441.aClass202_47);
										Static10.aClass45_4 = null;
										return true;
									} else if (Static10.aClass45_4 == Static106.aClass45_34) {
										local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
										local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
										local398 = local396;
										if (local392) {
											local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
										}
										local230 = Static394.aClass12_Sub8_Sub2_2.method5216();
										@Pc(2909) boolean local2909 = false;
										if (local230 <= 1) {
											if (Static451.aBoolean358 && !Static163.aBoolean313 || Static541.aBoolean683) {
												local2909 = true;
											} else if (local230 <= 1 && Static303.method4926(local398)) {
												local2909 = true;
											}
										}
										if (!local2909 && Static339.anInt6471 == 0) {
											local2633 = Static440.method6680(Static68.method1561(Static394.aClass12_Sub8_Sub2_2));
											if (local230 == 2) {
												Static36.method6954(0, "<img=1>" + local396, -1, 24, null, local2633, "<img=1>" + local398);
											} else if (local230 == 1) {
												Static36.method6954(0, "<img=0>" + local396, -1, 24, null, local2633, "<img=0>" + local398);
											} else {
												Static36.method6954(0, local396, -1, 24, null, local2633, local398);
											}
										}
										Static10.aClass45_4 = null;
										return true;
									} else if (Static10.aClass45_4 == Static78.aClass45_31) {
										local218 = Static394.aClass12_Sub8_Sub2_2.method5216();
										@Pc(3033) boolean local3033 = (local218 & 0x1) == 1;
										local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
										local2604 = Static394.aClass12_Sub8_Sub2_2.method5206();
										if (local2604.equals("")) {
											local2604 = local398;
										}
										local2606 = Static394.aClass12_Sub8_Sub2_2.method5206();
										local2633 = Static394.aClass12_Sub8_Sub2_2.method5206();
										if (local2633.equals("")) {
											local2633 = local2606;
										}
										if (local3033) {
											for (local813 = 0; local813 < Static358.anInt6694; local813++) {
												if (Static54.aStringArray5[local813].equals(local2633)) {
													Static440.aStringArray54[local813] = local398;
													Static54.aStringArray5[local813] = local2604;
													Static540.aStringArray61[local813] = local2606;
													Static362.aStringArray43[local813] = local2633;
													break;
												}
											}
										} else {
											Static440.aStringArray54[Static358.anInt6694] = local398;
											Static54.aStringArray5[Static358.anInt6694] = local2604;
											Static540.aStringArray61[Static358.anInt6694] = local2606;
											Static362.aStringArray43[Static358.anInt6694] = local2633;
											Static391.aBooleanArray39[Static358.anInt6694] = (local218 & 0x2) == 2;
											Static358.anInt6694++;
										}
										Static395.anInt7445 = Static413.anInt7729;
										Static10.aClass45_4 = null;
										return true;
									} else if (Static391.aClass45_107 == Static10.aClass45_4) {
										local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
										local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
										local226 = Static394.aClass12_Sub8_Sub2_2.method5216();
										local230 = Static394.aClass12_Sub8_Sub2_2.method5199() << 0;
										local412 = Static394.aClass12_Sub8_Sub2_2.method5216();
										local807 = Static394.aClass12_Sub8_Sub2_2.method5216();
										if (Static363.method5670(local218)) {
											Static390.method6179(local807, local412, local226, local230, true, local73);
										}
										Static10.aClass45_4 = null;
										return true;
									} else if (Static10.aClass45_4 == Static305.aClass45_88) {
										Static358.anInt6694 = Static394.aClass12_Sub8_Sub2_2.method5216();
										for (local218 = 0; local218 < Static358.anInt6694; local218++) {
											Static440.aStringArray54[local218] = Static394.aClass12_Sub8_Sub2_2.method5206();
											Static54.aStringArray5[local218] = Static394.aClass12_Sub8_Sub2_2.method5206();
											if (Static54.aStringArray5[local218].equals("")) {
												Static54.aStringArray5[local218] = Static440.aStringArray54[local218];
											}
											Static540.aStringArray61[local218] = Static394.aClass12_Sub8_Sub2_2.method5206();
											Static362.aStringArray43[local218] = Static394.aClass12_Sub8_Sub2_2.method5206();
											if (Static362.aStringArray43[local218].equals("")) {
												Static362.aStringArray43[local218] = Static540.aStringArray61[local218];
											}
											Static391.aBooleanArray39[local218] = false;
										}
										Static395.anInt7445 = Static413.anInt7729;
										Static10.aClass45_4 = null;
										return true;
									} else if (Static323.aClass45_90 == Static10.aClass45_4) {
										local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
										local73 = Static394.aClass12_Sub8_Sub2_2.method5202();
										local226 = Static394.aClass12_Sub8_Sub2_2.method5210();
										@Pc(3280) Class12_Sub41 local3280 = (Class12_Sub41) Static29.aClass68_7.method1917((long) local218);
										if (local3280 != null) {
											Static228.method4108(local3280.aClass30_Sub1_Sub1_Sub2_2, local226, local73);
										}
										Static10.aClass45_4 = null;
										return true;
									} else if (Static538.aClass45_152 == Static10.aClass45_4) {
										Static306.method4982(Static331.anInt6307, Static375.aClass71_3, Static394.aClass12_Sub8_Sub2_2);
										Static10.aClass45_4 = null;
										return true;
									} else if (Static295.aClass45_85 == Static10.aClass45_4) {
										Static545.anInt9648 = Static394.aClass12_Sub8_Sub2_2.method5216();
										Static162.anInt3761 = Static413.anInt7729;
										Static10.aClass45_4 = null;
										return true;
									} else if (Static10.aClass45_4 == Static185.aClass45_62) {
										Static177.anInt3997 = Static394.aClass12_Sub8_Sub2_2.method5216();
										Static17.anInt307 = Static394.aClass12_Sub8_Sub2_2.method5184();
										Static10.aClass45_4 = null;
										return true;
									} else if (Static522.aClass45_147 == Static10.aClass45_4) {
										local218 = Static394.aClass12_Sub8_Sub2_2.method5202();
										local73 = Static394.aClass12_Sub8_Sub2_2.method5184();
										local226 = Static394.aClass12_Sub8_Sub2_2.method5213();
										Static483.anIntArray654[local218] = local226;
										Static259.anIntArray372[local218] = local73;
										Static29.anIntArray32[local218] = 1;
										local230 = Static525.anIntArray684[local218] - 1;
										for (local412 = 0; local412 < local230; local412++) {
											if (local226 >= Class32_Sub1_Sub2.anIntArray631[local412]) {
												Static29.anIntArray32[local218] = local412 + 2;
											}
										}
										Static423.anIntArray12[Static30.anInt9642++ & 0x1F] = local218;
										Static10.aClass45_4 = null;
										return true;
									} else {
										@Pc(3409) String local3409;
										if (Static475.aClass45_135 == Static10.aClass45_4) {
											local3409 = Static394.aClass12_Sub8_Sub2_2.method5206();
											local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
											local398 = Static186.aClass122_1.method3365(local73).method6771(Static394.aClass12_Sub8_Sub2_2);
											Static36.method6954(0, local3409, local73, 19, null, local398, local3409);
											Static10.aClass45_4 = null;
											return true;
										} else if (Static379.aClass45_108 == Static10.aClass45_4) {
											local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
											local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
											local398 = local396;
											if (local392) {
												local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
											}
											local609 = Static394.aClass12_Sub8_Sub2_2.method5191();
											local614 = Static394.aClass12_Sub8_Sub2_2.method5199();
											local619 = Static394.aClass12_Sub8_Sub2_2.method5195();
											local623 = Static394.aClass12_Sub8_Sub2_2.method5216();
											local1496 = Static394.aClass12_Sub8_Sub2_2.method5199();
											@Pc(3489) long local3489 = (local614 << 32) + local619;
											@Pc(3491) boolean local3491 = false;
											@Pc(3493) int local3493 = 0;
											while (true) {
												if (local3493 >= 100) {
													if (local623 <= 1 && Static303.method4926(local398)) {
														local3491 = true;
													}
													break;
												}
												if (Static211.aLongArray9[local3493] == local3489) {
													local3491 = true;
													break;
												}
												local3493++;
											}
											if (!local3491 && Static339.anInt6471 == 0) {
												Static211.aLongArray9[Static125.anInt2919] = local3489;
												Static125.anInt2919 = (Static125.anInt2919 + 1) % 100;
												@Pc(3547) String local3547 = Static186.aClass122_1.method3365(local1496).method6771(Static394.aClass12_Sub8_Sub2_2);
												if (local623 == 2) {
													Static36.method6954(0, "<img=1>" + local396, local1496, 20, Static490.method7291(local609), local3547, "<img=1>" + local398);
												} else if (local623 == 1) {
													Static36.method6954(0, "<img=0>" + local396, local1496, 20, Static490.method7291(local609), local3547, "<img=0>" + local398);
												} else {
													Static36.method6954(0, local396, local1496, 20, Static490.method7291(local609), local3547, local398);
												}
											}
											Static10.aClass45_4 = null;
											return true;
										} else if (Static539.aClass45_153 == Static10.aClass45_4) {
											Static397.method6235();
											Static10.aClass45_4 = null;
											return true;
										} else if (Static10.aClass45_4 == Static186.aClass45_64) {
											local218 = Static394.aClass12_Sub8_Sub2_2.method5198();
											local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
											local226 = Static394.aClass12_Sub8_Sub2_2.method5210();
											local230 = Static394.aClass12_Sub8_Sub2_2.method5186();
											local412 = Static394.aClass12_Sub8_Sub2_2.method5204();
											if (Static363.method5670(local218)) {
												Static228.method4109(local226, local73, local230, local412);
											}
											Static10.aClass45_4 = null;
											return true;
										} else if (Static10.aClass45_4 == Static86.aClass45_32) {
											local218 = Static394.aClass12_Sub8_Sub2_2.method5216();
											local73 = Static394.aClass12_Sub8_Sub2_2.method5184();
											if (local73 == 255) {
												local218 = -1;
												local73 = -1;
											}
											Static90.method1969(local73, local218);
											Static10.aClass45_4 = null;
											return true;
										} else if (Static118.aClass45_39 == Static10.aClass45_4) {
											local218 = Static394.aClass12_Sub8_Sub2_2.method5216();
											local73 = local218 >> 5;
											local226 = local218 & 0x1F;
											if (local226 == 0) {
												Static22.aClass76Array28[local73] = null;
												Static10.aClass45_4 = null;
												return true;
											}
											@Pc(3728) Class76 local3728 = new Class76();
											local3728.anInt2310 = local226;
											local3728.anInt2315 = Static394.aClass12_Sub8_Sub2_2.method5216();
											if (local3728.anInt2315 >= 0 && Static450.aClass84Array13.length > local3728.anInt2315) {
												if (local3728.anInt2310 == 1 || local3728.anInt2310 == 10) {
													local3728.anInt2309 = Static394.aClass12_Sub8_Sub2_2.method5199();
													Static394.aClass12_Sub8_Sub2_2.anInt6217 += 6;
												} else if (local3728.anInt2310 >= 2 && local3728.anInt2310 <= 6) {
													if (local3728.anInt2310 == 2) {
														local3728.anInt2317 = 64;
														local3728.anInt2313 = 64;
													}
													if (local3728.anInt2310 == 3) {
														local3728.anInt2317 = 64;
														local3728.anInt2313 = 0;
													}
													if (local3728.anInt2310 == 4) {
														local3728.anInt2317 = 64;
														local3728.anInt2313 = 128;
													}
													if (local3728.anInt2310 == 5) {
														local3728.anInt2317 = 0;
														local3728.anInt2313 = 64;
													}
													if (local3728.anInt2310 == 6) {
														local3728.anInt2313 = 64;
														local3728.anInt2317 = 128;
													}
													local3728.anInt2310 = 2;
													local3728.anInt2312 = Static394.aClass12_Sub8_Sub2_2.method5216();
													local3728.anInt2313 += Static394.aClass12_Sub8_Sub2_2.method5199() - Static61.anInt1459 << 7;
													local3728.anInt2317 += Static394.aClass12_Sub8_Sub2_2.method5199() - Static203.anInt4534 << 7;
													local3728.anInt2318 = Static394.aClass12_Sub8_Sub2_2.method5216() << 0;
													local3728.anInt2311 = Static394.aClass12_Sub8_Sub2_2.method5199();
												}
												local3728.anInt2316 = Static394.aClass12_Sub8_Sub2_2.method5199();
												if (local3728.anInt2316 == 65535) {
													local3728.anInt2316 = -1;
												}
												Static22.aClass76Array28[local73] = local3728;
											}
											Static10.aClass45_4 = null;
											return true;
										} else if (Static197.aClass45_66 == Static10.aClass45_4) {
											local218 = Static394.aClass12_Sub8_Sub2_2.method5210();
											local2860 = Static394.aClass12_Sub8_Sub2_2.method5168();
											local226 = Static394.aClass12_Sub8_Sub2_2.method5198();
											if (Static363.method5670(local218)) {
												Static487.method7282(local2860, local226);
											}
											Static10.aClass45_4 = null;
											return true;
										} else if (Static149.aClass45_45 == Static10.aClass45_4) {
											Static362.method5650();
											Static10.aClass45_4 = null;
											return false;
										} else {
											@Pc(3965) Class12_Sub34 local3965;
											if (Static10.aClass45_4 == Static438.aClass45_128) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5213();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
												local226 = Static394.aClass12_Sub8_Sub2_2.method5225();
												if (Static363.method5670(local73)) {
													@Pc(3958) Class12_Sub34 local3958 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local218);
													local3965 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local226);
													if (local3965 != null) {
														Static102.method2109(local3958 == null || local3965.anInt5831 != local3958.anInt5831, local3965, false);
													}
													if (local3958 != null) {
														local3958.method7967();
														Static456.aClass68_67.method1916(local3958, (long) local226);
													}
													@Pc(3996) Class198 local3996 = Static104.method2137(local218);
													if (local3996 != null) {
														Static331.method5282(local3996);
													}
													local3996 = Static104.method2137(local226);
													if (local3996 != null) {
														Static331.method5282(local3996);
														Static190.method3668(local3996, true);
													}
													if (Static406.anInt7660 != -1) {
														Static376.method7936(1, Static406.anInt7660);
													}
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static91.aClass45_33) {
												Static365.method5699(Static513.aClass202_46);
												Static10.aClass45_4 = null;
												return true;
											} else if (Static39.aClass45_12 == Static10.aClass45_4) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5198();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
												local226 = Static394.aClass12_Sub8_Sub2_2.method5225();
												local230 = Static394.aClass12_Sub8_Sub2_2.method5226();
												if (Static363.method5670(local218)) {
													Static544.method7973(5, local73, local230, local226);
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static169.aClass45_51 == Static10.aClass45_4) {
												Static157.method3074(Static394.aClass12_Sub8_Sub2_2.method5206());
												Static10.aClass45_4 = null;
												return true;
											} else if (Static499.aClass45_141 == Static10.aClass45_4) {
												local3409 = Static394.aClass12_Sub8_Sub2_2.method5206();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
												local226 = Static394.aClass12_Sub8_Sub2_2.method5199();
												if (Static363.method5670(local226)) {
													Static56.method1423(local3409, local73);
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static357.aClass45_102 == Static10.aClass45_4) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5225();
												Static458.aClass55_8 = Static375.aClass71_3.method1989(local218);
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static519.aClass45_145) {
												for (local218 = 0; local218 < Static90.aClass30_Sub1_Sub1_Sub1Array1.length; local218++) {
													if (Static90.aClass30_Sub1_Sub1_Sub1Array1[local218] != null) {
														Static90.aClass30_Sub1_Sub1_Sub1Array1[local218].anInt4138 = -1;
													}
												}
												for (local73 = 0; local73 < Static328.anInt6238; local73++) {
													Static352.aClass12_Sub41Array1[local73].aClass30_Sub1_Sub1_Sub2_2.anInt4138 = -1;
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static400.aClass45_114) {
												Static290.anInt5634 = Static394.aClass12_Sub8_Sub2_2.method5166();
												Static451.aBoolean358 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static181.aClass45_59) {
												Static414.anInt7744 = Static394.aClass12_Sub8_Sub2_2.method5202();
												Static392.anInt7423 = Static394.aClass12_Sub8_Sub2_2.method5209() << 3;
												client.lb = Static394.aClass12_Sub8_Sub2_2.method5168() << 3;
												while (Static331.anInt6307 > Static394.aClass12_Sub8_Sub2_2.anInt6217) {
													@Pc(4218) Class202 local4218 = Static505.method7497()[Static394.aClass12_Sub8_Sub2_2.method5216()];
													Static365.method5699(local4218);
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static112.aClass45_36) {
												Static365.method5699(Static22.aClass202_48);
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static186.aClass45_63) {
												Static261.aString55 = Static331.anInt6307 <= 2 ? Static61.aClass88_35.method2391(Static345.anInt6495) : Static394.aClass12_Sub8_Sub2_2.method5206();
												Static455.anInt8710 = Static331.anInt6307 > 0 ? Static394.aClass12_Sub8_Sub2_2.method5199() : -1;
												if (Static455.anInt8710 == 65535) {
													Static455.anInt8710 = -1;
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static160.aClass45_48 == Static10.aClass45_4) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
												local1098 = (local73 & 0x1) == 1;
												Static436.method6647(local218, local1098);
												local230 = Static394.aClass12_Sub8_Sub2_2.method5199();
												for (local412 = 0; local412 < local230; local412++) {
													local807 = Static394.aClass12_Sub8_Sub2_2.method5198();
													local813 = Static394.aClass12_Sub8_Sub2_2.method5202();
													if (local813 == 255) {
														local813 = Static394.aClass12_Sub8_Sub2_2.method5225();
													}
													Static174.method3476(local807 - 1, local412, local218, local1098, local813);
												}
												Static365.anIntArray469[Static66.anInt1515++ & 0x1F] = local218;
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static453.aClass45_131) {
												local3409 = Static394.aClass12_Sub8_Sub2_2.method5206();
												local1098 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
												if (local1098) {
													local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
												} else {
													local396 = local3409;
												}
												local230 = Static394.aClass12_Sub8_Sub2_2.method5199();
												@Pc(4391) byte local4391 = Static394.aClass12_Sub8_Sub2_2.method5173();
												local414 = false;
												if (local4391 == -128) {
													local414 = true;
												}
												if (local414) {
													if (Static124.anInt2889 == 0) {
														Static10.aClass45_4 = null;
														return true;
													}
													for (local813 = 0; Static124.anInt2889 > local813 && (!Static224.aClass169Array5[local813].aString47.equals(local396) || Static224.aClass169Array5[local813].anInt5101 != local230); local813++) {
													}
													if (local813 < Static124.anInt2889) {
														while (Static124.anInt2889 - 1 > local813) {
															Static224.aClass169Array5[local813] = Static224.aClass169Array5[local813 + 1];
															local813++;
														}
														Static124.anInt2889--;
														Static224.aClass169Array5[Static124.anInt2889] = null;
													}
												} else {
													local438 = Static394.aClass12_Sub8_Sub2_2.method5206();
													local2473 = new Class169();
													local2473.aString49 = local3409;
													local2473.aString47 = local396;
													local2473.aString46 = Static458.method6893(local2473.aString47);
													local2473.aByte64 = local4391;
													local2473.anInt5101 = local230;
													local2473.aString48 = local438;
													for (local823 = Static124.anInt2889 - 1; local823 >= 0; local823--) {
														local623 = Static224.aClass169Array5[local823].aString46.compareTo(local2473.aString46);
														if (local623 == 0) {
															Static224.aClass169Array5[local823].anInt5101 = local230;
															Static224.aClass169Array5[local823].aByte64 = local4391;
															Static224.aClass169Array5[local823].aString48 = local438;
															if (local396.equals(Static440.aClass30_Sub1_Sub1_Sub1_2.aString6)) {
																Static328.aByte76 = local4391;
															}
															Static10.aClass45_4 = null;
															Static250.anInt5147 = Static413.anInt7729;
															return true;
														}
														if (local623 < 0) {
															break;
														}
													}
													if (Static224.aClass169Array5.length <= Static124.anInt2889) {
														Static10.aClass45_4 = null;
														return true;
													}
													for (local623 = Static124.anInt2889 - 1; local623 > local823; local623--) {
														Static224.aClass169Array5[local623 + 1] = Static224.aClass169Array5[local623];
													}
													if (Static124.anInt2889 == 0) {
														Static224.aClass169Array5 = new Class169[100];
													}
													Static224.aClass169Array5[local823 + 1] = local2473;
													Static124.anInt2889++;
													if (local396.equals(Static440.aClass30_Sub1_Sub1_Sub1_2.aString6)) {
														Static328.aByte76 = local4391;
													}
												}
												Static10.aClass45_4 = null;
												Static250.anInt5147 = Static413.anInt7729;
												return true;
											} else if (Static435.aClass45_127 == Static10.aClass45_4) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5204();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5198();
												local226 = Static394.aClass12_Sub8_Sub2_2.method5225();
												local230 = Static394.aClass12_Sub8_Sub2_2.method5177();
												if (Static363.method5670(local218)) {
													local3965 = (Class12_Sub34) Static456.aClass68_67.method1917((long) local226);
													if (local3965 != null) {
														Static102.method2109(local73 != local3965.anInt5831, local3965, false);
													}
													Static198.method3764(local73, local226, local230, false);
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static339.aClass45_95) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5204();
												if (local218 == 65535) {
													local218 = -1;
												}
												local73 = Static394.aClass12_Sub8_Sub2_2.method5198();
												local226 = Static394.aClass12_Sub8_Sub2_2.method5213();
												if (Static363.method5670(local73)) {
													Static294.method4773(local218, local226);
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static266.aClass45_79) {
												local3409 = Static394.aClass12_Sub8_Sub2_2.method5206();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
												local226 = Static394.aClass12_Sub8_Sub2_2.method5177();
												local230 = Static394.aClass12_Sub8_Sub2_2.method5204();
												if (local230 == 65535) {
													local230 = -1;
												}
												if (local73 >= 1 && local73 <= 8) {
													if (local3409.equalsIgnoreCase("null")) {
														local3409 = null;
													}
													Static84.aStringArray10[local73 - 1] = local3409;
													Static139.anIntArray233[local73 - 1] = local230;
													Static59.aBooleanArray16[local73 - 1] = local226 == 0;
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static353.aClass45_99 == Static10.aClass45_4) {
												local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
												local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
												local398 = local396;
												if (local392) {
													local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
												}
												local609 = Static394.aClass12_Sub8_Sub2_2.method5199();
												local614 = Static394.aClass12_Sub8_Sub2_2.method5195();
												local819 = Static394.aClass12_Sub8_Sub2_2.method5216();
												local823 = Static394.aClass12_Sub8_Sub2_2.method5199();
												@Pc(4811) long local4811 = local614 + (local609 << 32);
												@Pc(4813) boolean local4813 = false;
												local1904 = 0;
												while (true) {
													if (local1904 >= 100) {
														if (local819 <= 1 && Static303.method4926(local398)) {
															local4813 = true;
														}
														break;
													}
													if (local4811 == Static211.aLongArray9[local1904]) {
														local4813 = true;
														break;
													}
													local1904++;
												}
												if (!local4813 && Static339.anInt6471 == 0) {
													Static211.aLongArray9[Static125.anInt2919] = local4811;
													Static125.anInt2919 = (Static125.anInt2919 + 1) % 100;
													@Pc(4873) String local4873 = Static186.aClass122_1.method3365(local823).method6771(Static394.aClass12_Sub8_Sub2_2);
													if (local819 == 2) {
														Static36.method6954(0, "<img=1>" + local396, local823, 18, null, local4873, "<img=1>" + local398);
													} else if (local819 == 1) {
														Static36.method6954(0, "<img=0>" + local396, local823, 18, null, local4873, "<img=0>" + local398);
													} else {
														Static36.method6954(0, local396, local823, 18, null, local4873, local398);
													}
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static400.aClass45_113) {
												Static365.method5699(Static90.aClass202_8);
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static106.aClass45_35) {
												Static348.method5474(false);
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static175.aClass45_55) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5217();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5198();
												local226 = Static394.aClass12_Sub8_Sub2_2.method5186();
												if (Static363.method5670(local73)) {
													Static415.method3328(local226, local218);
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static74.aClass45_28) {
												Static414.anInt7744 = Static394.aClass12_Sub8_Sub2_2.method5216();
												Static392.anInt7423 = Static394.aClass12_Sub8_Sub2_2.method5209() << 3;
												client.lb = Static394.aClass12_Sub8_Sub2_2.method5209() << 3;
												for (@Pc(5011) Class12_Sub28 local5011 = (Class12_Sub28) Static295.aClass68_45.method1923(); local5011 != null; local5011 = (Class12_Sub28) Static295.aClass68_45.method1920()) {
													local73 = (int) (local5011.aLong248 >> 28 & 0x3L);
													local226 = (int) (local5011.aLong248 & 0x3FFFL);
													local230 = local226 - Static61.anInt1459;
													local412 = (int) (local5011.aLong248 >> 14 & 0x3FFFL);
													local807 = local412 - Static203.anInt4534;
													if (local73 == Static414.anInt7744 && local230 >= client.lb && local230 < client.lb + 8 && local807 >= Static392.anInt7423 && Static392.anInt7423 + 8 > local807) {
														local5011.method7967();
														if (local230 >= 0 && local807 >= 0 && local230 < Static37.anInt7512 && Static329.anInt6247 > local807) {
															Static534.method7449(Static414.anInt7744, local230, local807);
														}
													}
												}
												for (@Pc(5108) Class12_Sub17 local5108 = (Class12_Sub17) Static179.aClass73_31.method2005(); local5108 != null; local5108 = (Class12_Sub17) Static179.aClass73_31.method2009()) {
													if (local5108.anInt3846 >= client.lb && client.lb + 8 > local5108.anInt3846 && Static392.anInt7423 <= local5108.anInt3840 && Static392.anInt7423 + 8 > local5108.anInt3840 && local5108.anInt3849 == Static414.anInt7744) {
														local5108.anInt3841 = 0;
													}
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static125.aClass45_42 == Static10.aClass45_4) {
												local3409 = Static394.aClass12_Sub8_Sub2_2.method5206();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
												local226 = Static394.aClass12_Sub8_Sub2_2.method5204();
												if (Static363.method5670(local226)) {
													Static56.method1423(local3409, local73);
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static177.aClass45_57 == Static10.aClass45_4) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5213();
												local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
												if (local73 == 65535) {
													local73 = -1;
												}
												local226 = Static394.aClass12_Sub8_Sub2_2.method5199();
												if (Static363.method5670(local226)) {
													Static544.method7973(2, local73, -1, local218);
												}
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static515.aClass45_144) {
												Static365.method5699(Static108.aClass202_12);
												Static10.aClass45_4 = null;
												return true;
											} else if (Static10.aClass45_4 == Static402.aClass45_116) {
												if (Static109.method2274(Static96.anInt2243)) {
													Static47.anInt889 = (int) ((float) Static394.aClass12_Sub8_Sub2_2.method5199() * 2.5F);
												} else {
													Static47.anInt889 = Static394.aClass12_Sub8_Sub2_2.method5199() * 30;
												}
												Static10.aClass45_4 = null;
												Static162.anInt3761 = Static413.anInt7729;
												return true;
											} else if (Static179.aClass45_58 == Static10.aClass45_4) {
												local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
												local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
												@Pc(5277) Object[] local5277 = new Object[local396.length() + 1];
												for (local230 = local396.length() - 1; local230 >= 0; local230--) {
													if (local396.charAt(local230) == 's') {
														local5277[local230 + 1] = Static394.aClass12_Sub8_Sub2_2.method5206();
													} else {
														local5277[local230 + 1] = Integer.valueOf(Static394.aClass12_Sub8_Sub2_2.method5225());
													}
												}
												local5277[0] = Integer.valueOf(Static394.aClass12_Sub8_Sub2_2.method5225());
												if (Static363.method5670(local218)) {
													@Pc(5335) Class12_Sub6 local5335 = new Class12_Sub6();
													local5335.anObjectArray2 = local5277;
													Static312.method5029(local5335);
												}
												Static10.aClass45_4 = null;
												return true;
											} else {
												@Pc(5396) long local5396;
												@Pc(5411) Class12_Sub42 local5411;
												@Pc(5402) Class12_Sub42 local5402;
												if (Static479.aClass45_137 == Static10.aClass45_4) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5213();
													local73 = Static394.aClass12_Sub8_Sub2_2.method5186();
													local226 = Static394.aClass12_Sub8_Sub2_2.method5199();
													if (local226 == 65535) {
														local226 = -1;
													}
													local230 = Static394.aClass12_Sub8_Sub2_2.method5210();
													if (local230 == 65535) {
														local230 = -1;
													}
													local412 = Static394.aClass12_Sub8_Sub2_2.method5210();
													if (Static363.method5670(local412)) {
														for (local807 = local226; local807 <= local230; local807++) {
															local5396 = ((long) local218 << 32) + ((long) local807);
															local5402 = (Class12_Sub42) Static545.aClass68_82.method1917(local5396);
															if (local5402 != null) {
																local5411 = new Class12_Sub42(local73, local5402.anInt6906);
																local5402.method7967();
															} else if (local807 == -1) {
																local5411 = new Class12_Sub42(local73, Static104.method2137(local218).aClass12_Sub42_1.anInt6906);
															} else {
																local5411 = new Class12_Sub42(local73, -1);
															}
															Static545.aClass68_82.method1916(local5411, local5396);
														}
													}
													Static10.aClass45_4 = null;
													return true;
												} else if (Static530.aClass45_151 == Static10.aClass45_4) {
													Static10.method291(false);
													Static10.aClass45_4 = null;
													return false;
												} else if (Static222.aClass45_70 == Static10.aClass45_4) {
													Static365.method5699(Static180.aClass202_22);
													Static10.aClass45_4 = null;
													return true;
												} else if (Static171.aClass45_53 == Static10.aClass45_4) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5198();
													local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
													local226 = Static394.aClass12_Sub8_Sub2_2.method5226();
													local230 = Static394.aClass12_Sub8_Sub2_2.method5204();
													if (local230 == 65535) {
														local230 = -1;
													}
													local412 = Static394.aClass12_Sub8_Sub2_2.method5204();
													if (local412 == 65535) {
														local412 = -1;
													}
													if (Static363.method5670(local218)) {
														for (local807 = local412; local807 <= local230; local807++) {
															local5396 = (long) local807 + ((long) local226 << 32);
															local5402 = (Class12_Sub42) Static545.aClass68_82.method1917(local5396);
															if (local5402 != null) {
																local5411 = new Class12_Sub42(local5402.anInt6901, local73);
																local5402.method7967();
															} else if (local807 == -1) {
																local5411 = new Class12_Sub42(Static104.method2137(local226).aClass12_Sub42_1.anInt6901, local73);
															} else {
																local5411 = new Class12_Sub42(0, local73);
															}
															Static545.aClass68_82.method1916(local5411, local5396);
														}
													}
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static348.aClass45_98) {
													while (Static394.aClass12_Sub8_Sub2_2.anInt6217 < Static331.anInt6307) {
														local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
														local396 = Static394.aClass12_Sub8_Sub2_2.method5206();
														local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
														local230 = Static394.aClass12_Sub8_Sub2_2.method5199();
														local412 = Static394.aClass12_Sub8_Sub2_2.method5216();
														local2633 = "";
														local2452 = false;
														if (local230 > 0) {
															local2633 = Static394.aClass12_Sub8_Sub2_2.method5206();
															local2452 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
														}
														for (local819 = 0; local819 < Static167.anInt3850; local819++) {
															if (local392) {
																if (local398.equals(Static205.aStringArray24[local819])) {
																	Static205.aStringArray24[local819] = local396;
																	Static251.aStringArray28[local819] = local398;
																	local396 = null;
																	break;
																}
															} else if (local396.equals(Static205.aStringArray24[local819])) {
																if (local230 != Static462.anIntArray626[local819]) {
																	local1863 = true;
																	for (@Pc(5678) Class7_Sub1_Sub2 local5678 = (Class7_Sub1_Sub2) Static430.aClass149_7.method3989(); local5678 != null; local5678 = (Class7_Sub1_Sub2) Static430.aClass149_7.method3986()) {
																		if (local5678.aString102.equals(local396)) {
																			if (local230 != 0 && local5678.aShort110 == 0) {
																				local5678.method7760();
																				local1863 = false;
																			} else if (local230 == 0 && local5678.aShort110 != 0) {
																				local1863 = false;
																				local5678.method7760();
																			}
																		}
																	}
																	if (local1863) {
																		Static430.aClass149_7.method3984(new Class7_Sub1_Sub2(local396, local230));
																	}
																	Static462.anIntArray626[local819] = local230;
																}
																Static251.aStringArray28[local819] = local398;
																Static385.aStringArray58[local819] = local2633;
																Static8.anIntArray15[local819] = local412;
																Static525.aBooleanArray47[local819] = local2452;
																local396 = null;
																break;
															}
														}
														if (local396 != null && Static167.anInt3850 < 200) {
															Static205.aStringArray24[Static167.anInt3850] = local396;
															Static251.aStringArray28[Static167.anInt3850] = local398;
															Static462.anIntArray626[Static167.anInt3850] = local230;
															Static385.aStringArray58[Static167.anInt3850] = local2633;
															Static8.anIntArray15[Static167.anInt3850] = local412;
															Static525.aBooleanArray47[Static167.anInt3850] = local2452;
															Static167.anInt3850++;
														}
													}
													Static395.anInt7445 = Static413.anInt7729;
													Static155.anInt3380 = 2;
													local73 = Static167.anInt3850;
													while (local73 > 0) {
														local73--;
														local392 = true;
														for (local226 = 0; local226 < local73; local226++) {
															if (Static462.anIntArray626[local226] != Static222.aClass247_1.anInt7426 && Static222.aClass247_1.anInt7426 == Static462.anIntArray626[local226 + 1] || Static462.anIntArray626[local226] == 0 && Static462.anIntArray626[local226 + 1] != 0) {
																local230 = Static462.anIntArray626[local226];
																Static462.anIntArray626[local226] = Static462.anIntArray626[local226 + 1];
																Static462.anIntArray626[local226 + 1] = local230;
																local2606 = Static385.aStringArray58[local226];
																Static385.aStringArray58[local226] = Static385.aStringArray58[local226 + 1];
																Static385.aStringArray58[local226 + 1] = local2606;
																local2633 = Static205.aStringArray24[local226];
																Static205.aStringArray24[local226] = Static205.aStringArray24[local226 + 1];
																Static205.aStringArray24[local226 + 1] = local2633;
																local438 = Static251.aStringArray28[local226];
																Static251.aStringArray28[local226] = Static251.aStringArray28[local226 + 1];
																Static251.aStringArray28[local226 + 1] = local438;
																local819 = Static8.anIntArray15[local226];
																Static8.anIntArray15[local226] = Static8.anIntArray15[local226 + 1];
																Static8.anIntArray15[local226 + 1] = local819;
																local1863 = Static525.aBooleanArray47[local226];
																Static525.aBooleanArray47[local226] = Static525.aBooleanArray47[local226 + 1];
																local392 = false;
																Static525.aBooleanArray47[local226 + 1] = local1863;
															}
														}
														if (local392) {
															break;
														}
													}
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static409.aClass45_121) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5216();
													if (Static394.aClass12_Sub8_Sub2_2.method5216() == 0) {
														Static179.aClass219Array1[local218] = new Class219();
													} else {
														Static394.aClass12_Sub8_Sub2_2.anInt6217--;
														Static179.aClass219Array1[local218] = new Class219(Static394.aClass12_Sub8_Sub2_2);
													}
													Static396.anInt7453 = Static413.anInt7729;
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static233.aClass45_72) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
													local73 = Static394.aClass12_Sub8_Sub2_2.method5226();
													if (Static363.method5670(local218)) {
														Static544.method7973(5, Static396.anInt7452, 0, local73);
													}
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static119.aClass45_40) {
													Static365.method5699(Static108.aClass202_13);
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static44.aClass45_15) {
													local392 = Static394.aClass12_Sub8_Sub2_2.method5216() == 1;
													@Pc(6066) byte[] local6066 = new byte[Static331.anInt6307 - 1];
													Static394.aClass12_Sub8_Sub2_2.method5181(Static331.anInt6307 - 1, local6066);
													Static240.method4174(local6066, local392);
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static462.aClass45_132) {
													if (Static241.aFrame25 != null) {
														Static428.method6573(Static208.aClass12_Sub10_Sub1_1.anInt2225, false, -1, -1);
													}
													@Pc(6097) byte[] local6097 = new byte[Static331.anInt6307];
													Static394.aClass12_Sub8_Sub2_2.method5239(local6097, Static331.anInt6307);
													local396 = Static157.method3075(0, Static331.anInt6307, local6097);
													Static465.method6966(Static148.anInt6867 == 1, Static375.aClass71_3, true, local396);
													Static10.aClass45_4 = null;
													return true;
												} else if (Static68.aClass45_26 == Static10.aClass45_4) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5226();
													local73 = Static394.aClass12_Sub8_Sub2_2.method5210();
													local398 = Static394.aClass12_Sub8_Sub2_2.method5206();
													if (Static363.method5670(local73)) {
														Static220.method4049(local218, local398);
													}
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static425.aClass45_125) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5213();
													local73 = Static394.aClass12_Sub8_Sub2_2.method5204();
													local226 = Static394.aClass12_Sub8_Sub2_2.method5198();
													if (Static363.method5670(local226)) {
														Static286.method4674(local73, local218);
													}
													Static10.aClass45_4 = null;
													return true;
												} else if (Static282.aClass45_83 == Static10.aClass45_4) {
													Static494.method7350(Static394.aClass12_Sub8_Sub2_2, Static331.anInt6307);
													Static10.aClass45_4 = null;
													return true;
												} else if (Static20.aClass45_5 == Static10.aClass45_4) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
													local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
													local226 = Static394.aClass12_Sub8_Sub2_2.method5199();
													local230 = Static394.aClass12_Sub8_Sub2_2.method5199();
													if (Static363.method5670(local218) && Static71.aClass198ArrayArray1[local73] != null) {
														for (local412 = local226; local412 < local230; local412++) {
															local807 = Static394.aClass12_Sub8_Sub2_2.method5195();
															if (local412 < Static71.aClass198ArrayArray1[local73].length && Static71.aClass198ArrayArray1[local73][local412] != null) {
																Static71.aClass198ArrayArray1[local73][local412].anInt5751 = local807;
															}
														}
													}
													Static10.aClass45_4 = null;
													return true;
												} else if (Static481.aClass45_134 == Static10.aClass45_4) {
													Static69.anInt9146 = Static394.aClass12_Sub8_Sub2_2.method5217();
													Static10.aClass45_4 = null;
													Static162.anInt3761 = Static413.anInt7729;
													return true;
												} else if (Static10.aClass45_4 == Static498.aClass45_140) {
													Static10.method291(Static5.aBoolean4);
													Static10.aClass45_4 = null;
													return false;
												} else if (Static10.aClass45_4 == Static75.aClass45_29) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5199();
													local73 = Static394.aClass12_Sub8_Sub2_2.method5216();
													local226 = Static394.aClass12_Sub8_Sub2_2.method5216();
													local230 = Static394.aClass12_Sub8_Sub2_2.method5216();
													local412 = Static394.aClass12_Sub8_Sub2_2.method5216();
													local807 = Static394.aClass12_Sub8_Sub2_2.method5199();
													if (Static363.method5670(local218)) {
														Static110.aBooleanArray22[local73] = true;
														Static135.anIntArray227[local73] = local226;
														Static325.anIntArray433[local73] = local230;
														Static465.anIntArray632[local73] = local412;
														Static146.anIntArray238[local73] = local807;
													}
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static372.aClass45_104) {
													Static492.aClass33_7 = Static242.method4181(Static394.aClass12_Sub8_Sub2_2.method5216());
													Static10.aClass45_4 = null;
													return true;
												} else if (Static132.aClass45_43 == Static10.aClass45_4) {
													Static393.aClass31_1.method794();
													Static14.anInt234 += 32;
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static353.aClass45_100) {
													local218 = Static394.aClass12_Sub8_Sub2_2.method5184();
													local73 = Static394.aClass12_Sub8_Sub2_2.method5199();
													Static393.aClass31_1.method789(local73, local218);
													Static10.aClass45_4 = null;
													return true;
												} else if (Static388.aClass45_111 == Static10.aClass45_4) {
													Static365.method5699(Static29.aClass202_2);
													Static10.aClass45_4 = null;
													return true;
												} else if (Static10.aClass45_4 == Static251.aClass45_74) {
													local3409 = Static394.aClass12_Sub8_Sub2_2.method5206();
													local396 = Static440.method6680(Static68.method1561(Static394.aClass12_Sub8_Sub2_2));
													Static406.method6373(local3409, 6, 0, local3409, local396);
													Static10.aClass45_4 = null;
													return true;
												} else {
													Static508.method7541(null, "T1 - " + (Static10.aClass45_4 == null ? -1 : Static10.aClass45_4.method1410()) + "," + (Static402.aClass45_117 == null ? -1 : Static402.aClass45_117.method1410()) + "," + (Static376.aClass45_154 == null ? -1 : Static376.aClass45_154.method1410()) + " - " + Static331.anInt6307);
													Static10.method291(false);
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

	@OriginalMember(owner = "client!ls", name = "c", descriptor = "(I)V")
	public static void method4717() {
		for (@Pc(10) Class7_Sub7 local10 = (Class7_Sub7) Static526.aClass149_8.method3980(); local10 != null; local10 = (Class7_Sub7) Static526.aClass149_8.method3980()) {
			Static87.method1911(local10);
		}
		@Pc(36) int local36;
		@Pc(35) int local35;
		if (Static208.aClass12_Sub10_Sub1_1.method2057(Static148.anInt6867)) {
			local35 = 3;
			local36 = 0;
		} else {
			local35 = Static415.anInt3783;
			local36 = Static415.anInt3783;
		}
		Static67.method1544();
		for (@Pc(45) int local45 = local36; local45 <= local35; local45++) {
			Static67.method1538();
			Static67.method1532(local45);
			Static67.method1533(local45);
		}
		Static67.method1535();
		Static67.method1547();
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([BIIIII)Z")
	public static boolean method4718(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) boolean local7 = true;
		@Pc(12) Class12_Sub8 local12 = new Class12_Sub8(arg0);
		@Pc(19) int local19 = -1;
		label70: while (true) {
			@Pc(23) int local23 = local12.method5188();
			if (local23 == 0) {
				return local7;
			}
			local19 += local23;
			@Pc(34) int local34 = 0;
			@Pc(36) boolean local36 = false;
			while (true) {
				@Pc(66) int local66;
				@Pc(101) Class279 local101;
				do {
					@Pc(71) int local71;
					@Pc(75) int local75;
					do {
						do {
							do {
								do {
									@Pc(42) int local42;
									while (local36) {
										local42 = local12.method5218();
										if (local42 == 0) {
											continue label70;
										}
										local12.method5216();
									}
									local42 = local12.method5218();
									if (local42 == 0) {
										continue label70;
									}
									local34 += local42 - 1;
									@Pc(54) int local54 = local34 & 0x3F;
									@Pc(60) int local60 = local34 >> 6 & 0x3F;
									local66 = local12.method5216() >> 2;
									local71 = local60 + arg3;
									local75 = arg4 + local54;
								} while (local71 <= 0);
							} while (local75 <= 0);
						} while (arg2 - 1 <= local71);
					} while (arg1 - 1 <= local75);
					local101 = Static49.aClass155_2.method4063(local19);
				} while (local66 == 22 && !Static208.aClass12_Sub10_Sub1_1.aBoolean183 && local101.anInt8276 == 0 && local101.anInt8282 != 1 && !local101.aBoolean581);
				if (!local101.method6879()) {
					local7 = false;
					Static377.anInt9639++;
				}
				local36 = true;
			}
		}
	}

	@OriginalMember(owner = "client!ls", name = "a", descriptor = "([Ljava/lang/String;III)Ljava/lang/String;")
	public static String method4719(@OriginalArg(0) String[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == 0) {
			return "";
		} else if (arg1 == 1) {
			@Pc(16) String local16 = arg0[arg2];
			return local16 == null ? "null" : local16.toString();
		} else {
			@Pc(28) int local28 = arg1 + arg2;
			@Pc(30) int local30 = 0;
			for (@Pc(32) int local32 = arg2; local32 < local28; local32++) {
				@Pc(38) String local38 = arg0[local32];
				if (local38 == null) {
					local30 += 4;
				} else {
					local30 += local38.length();
				}
			}
			@Pc(57) StringBuffer local57 = new StringBuffer(local30);
			for (@Pc(59) int local59 = arg2; local59 < local28; local59++) {
				@Pc(65) String local65 = arg0[local59];
				if (local65 == null) {
					local57.append("null");
				} else {
					local57.append(local65);
				}
			}
			return local57.toString();
		}
	}
}
