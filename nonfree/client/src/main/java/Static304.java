import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!rb", name = "l", descriptor = "[I")
	public static int[] anIntArray254;

	@OriginalMember(owner = "client!rb", name = "o", descriptor = "Lclient!km;")
	public static Class82 aClass82_4;

	@OriginalMember(owner = "client!rb", name = "q", descriptor = "I")
	public static int anInt2196;

	@OriginalMember(owner = "client!rb", name = "k", descriptor = "I")
	public static int anInt2193 = -2;

	@OriginalMember(owner = "client!rb", name = "n", descriptor = "Lclient!dt;")
	public static final Class55 aClass55_3 = new Class55(64);

	@OriginalMember(owner = "client!rb", name = "p", descriptor = "I")
	public static int anInt2195 = 0;

	@OriginalMember(owner = "client!rb", name = "b", descriptor = "(I)Z")
	public static boolean method2118() throws IOException {
		if (Static169.aClass124_3 == null) {
			return false;
		}
		@Pc(13) int local13 = Static169.aClass124_3.method2716();
		if (local13 == 0) {
			return false;
		}
		@Pc(75) int local75;
		if (Static265.aClass77_123 == null) {
			if (Static347.aBoolean461) {
				local13--;
				Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, 1, 0);
				Static347.aBoolean461 = false;
				Static200.anInt3681++;
			}
			Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
			if (Static85.aClass2_Sub13_Sub2_11.method4264()) {
				if (local13 == 0) {
					return false;
				}
				Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, 1, 1);
				local13--;
				Static200.anInt3681++;
			}
			Static347.aBoolean461 = true;
			@Pc(71) Class77[] local71 = Static146.method2504();
			local75 = Static85.aClass2_Sub13_Sub2_11.method4260();
			if (local75 < 0 || local75 >= local71.length) {
				throw new IOException("invo:" + local75);
			}
			Static265.aClass77_123 = local71[local75];
			Static327.anInt5773 = Static265.aClass77_123.anInt1964;
		}
		if (Static327.anInt5773 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, 1, 0);
			Static327.anInt5773 = Static85.aClass2_Sub13_Sub2_11.aByteArray77[0] & 0xFF;
			local13--;
			Static200.anInt3681++;
		}
		if (Static327.anInt5773 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, 2, 0);
			Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
			local13 -= 2;
			Static327.anInt5773 = Static85.aClass2_Sub13_Sub2_11.method4245();
			Static200.anInt3681 += 2;
		}
		if (local13 < Static327.anInt5773) {
			return false;
		}
		Static85.aClass2_Sub13_Sub2_11.anInt4788 = 0;
		Static169.aClass124_3.method2720(Static85.aClass2_Sub13_Sub2_11.aByteArray77, Static327.anInt5773, 0);
		Static130.anInt2453 = 0;
		Static327.aClass77_147 = Static229.aClass77_164;
		Static200.anInt3681 += Static327.anInt5773;
		Static229.aClass77_164 = Static46.aClass77_19;
		Static46.aClass77_19 = Static265.aClass77_123;
		@Pc(235) int local235;
		@Pc(203) int local203;
		@Pc(222) int local222;
		@Pc(218) int local218;
		@Pc(241) int local241;
		@Pc(251) long local251;
		@Pc(257) Class2_Sub35 local257;
		@Pc(268) Class2_Sub35 local268;
		if (Static265.aClass77_123 == Static387.aClass77_156) {
			local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
			if (local203 == 65535) {
				local203 = -1;
			}
			local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
			local218 = Static85.aClass2_Sub13_Sub2_11.method4221();
			local222 = Static85.aClass2_Sub13_Sub2_11.method4245();
			if (local222 == 65535) {
				local222 = -1;
			}
			local235 = Static85.aClass2_Sub13_Sub2_11.method4221();
			if (Static259.method4040(local75)) {
				for (local241 = local203; local241 <= local222; local241++) {
					local251 = (long) local241 + ((long) local235 << 32);
					local257 = (Class2_Sub35) Static360.aClass214_31.method5059(local251);
					if (local257 != null) {
						local268 = new Class2_Sub35(local218, local257.anInt5880);
						local257.method5745();
					} else if (local241 == -1) {
						local268 = new Class2_Sub35(local218, Static240.method3886(local235).aClass2_Sub35_2.anInt5880);
					} else {
						local268 = new Class2_Sub35(local218, -1);
					}
					Static360.aClass214_31.method5065(local251, local268);
				}
			}
			Static265.aClass77_123 = null;
			return true;
		} else if (Static284.aClass77_134 == Static265.aClass77_123) {
			local203 = Static85.aClass2_Sub13_Sub2_11.method4193();
			local75 = Static85.aClass2_Sub13_Sub2_11.method4237();
			local218 = Static85.aClass2_Sub13_Sub2_11.method4229();
			if (Static259.method4040(local218)) {
				if (local203 == 2) {
					Static24.method647();
				}
				Static226.anInt4223 = local75;
				Static202.method3376(local75);
				Static260.method4054(false);
				Static157.method2606(Static226.anInt4223);
				for (local222 = 0; local222 < 100; local222++) {
					Static370.aBooleanArray143[local222] = true;
				}
			}
			Static265.aClass77_123 = null;
			return true;
		} else if (Static89.aClass77_50 == Static265.aClass77_123) {
			Static276.method4296(Static320.aClass17_17);
			Static265.aClass77_123 = null;
			return true;
		} else if (Static301.aClass77_140 == Static265.aClass77_123) {
			Static384.anInt6676 = Static85.aClass2_Sub13_Sub2_11.method4240();
			Static173.anInt3081 = Static180.anInt3216;
			Static265.aClass77_123 = null;
			return true;
		} else if (Static265.aClass77_123 == Static85.aClass77_49) {
			local203 = Static85.aClass2_Sub13_Sub2_11.method4220();
			local75 = Static85.aClass2_Sub13_Sub2_11.method4248();
			local218 = Static85.aClass2_Sub13_Sub2_11.method4220();
			local222 = Static85.aClass2_Sub13_Sub2_11.method4229();
			local235 = Static85.aClass2_Sub13_Sub2_11.method4237();
			if (Static259.method4040(local218)) {
				Static21.method619(local222, local203, local235, local75);
			}
			Static265.aClass77_123 = null;
			return true;
		} else if (Static35.aClass77_17 == Static265.aClass77_123) {
			Static276.method4296(Static98.aClass17_8);
			Static265.aClass77_123 = null;
			return true;
		} else {
			@Pc(446) String local446;
			if (Static258.aClass77_108 == Static265.aClass77_123) {
				local203 = Static85.aClass2_Sub13_Sub2_11.method4220();
				local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
				local218 = Static85.aClass2_Sub13_Sub2_11.method4245();
				if (Static259.method4040(local203)) {
					Static218.method3695(local446, local218);
				}
				Static265.aClass77_123 = null;
				return true;
			} else if (Static265.aClass77_123 == Static55.aClass77_25) {
				local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local75 = Static85.aClass2_Sub13_Sub2_11.method4239();
				if (Static259.method4040(local203)) {
					Static90.method1540(5, 0, local75, Static194.anInt3441);
				}
				Static265.aClass77_123 = null;
				return true;
			} else if (Static203.aClass77_95 == Static265.aClass77_123) {
				local203 = Static85.aClass2_Sub13_Sub2_11.method4249();
				local75 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local218 = Static85.aClass2_Sub13_Sub2_11.method4220();
				@Pc(506) Class12_Sub1_Sub2_Sub1 local506 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local218];
				if (local506 != null) {
					Static231.method3807(local506, local203, local75);
				}
				Static265.aClass77_123 = null;
				return true;
			} else if (Static265.aClass77_123 == Static352.aClass77_167) {
				local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
				local75 = Static85.aClass2_Sub13_Sub2_11.method4239();
				if (Static259.method4040(local203)) {
					@Pc(539) Class2_Sub41 local539 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local75);
					if (local539 != null) {
						Static303.method4757(local539, true, false);
					}
					if (Static307.aClass155_31 != null) {
						Static295.method4664(Static307.aClass155_31);
						Static307.aClass155_31 = null;
					}
				}
				Static265.aClass77_123 = null;
				return true;
			} else if (Static265.aClass77_123 == Static126.aClass77_70) {
				Static276.method4296(Static286.aClass17_16);
				Static265.aClass77_123 = null;
				return true;
			} else if (Static333.aClass77_152 == Static265.aClass77_123) {
				Static236.method3857(false);
				Static265.aClass77_123 = null;
				return false;
			} else if (Static235.aClass77_115 == Static265.aClass77_123) {
				Static236.method3857(true);
				Static265.aClass77_123 = null;
				return false;
			} else if (Static265.aClass77_123 == Static389.aClass77_177) {
				Static276.method4296(Static119.aClass17_10);
				Static265.aClass77_123 = null;
				return true;
			} else if (Static265.aClass77_123 == Static375.aClass77_113) {
				local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
				local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
				local218 = Static85.aClass2_Sub13_Sub2_11.method4245();
				if (Static259.method4040(local203)) {
					Static111.method2141(local75, local218);
				}
				Static265.aClass77_123 = null;
				return true;
			} else if (Static312.aClass77_141 == Static265.aClass77_123) {
				local203 = Static85.aClass2_Sub13_Sub2_11.method4229();
				local75 = Static85.aClass2_Sub13_Sub2_11.method4196();
				if (Static259.method4040(local203)) {
					Static223.anInt4127 = local75;
				}
				Static265.aClass77_123 = null;
				return true;
			} else {
				@Pc(839) int local839;
				@Pc(728) int local728;
				@Pc(657) String local657;
				@Pc(703) Class195 local703;
				@Pc(738) int local738;
				@Pc(668) boolean local668;
				if (Static265.aClass77_123 == Static226.aClass77_111) {
					local657 = Static85.aClass2_Sub13_Sub2_11.method4201();
					local668 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
					if (local668) {
						local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
					} else {
						local446 = local657;
					}
					local222 = Static85.aClass2_Sub13_Sub2_11.method4245();
					@Pc(686) byte local686 = Static85.aClass2_Sub13_Sub2_11.method4217();
					@Pc(688) boolean local688 = false;
					if (local686 == -128) {
						local688 = true;
					}
					if (local688) {
						if (Static354.anInt6211 == 0) {
							Static265.aClass77_123 = null;
							return true;
						}
						for (local839 = 0; local839 < Static354.anInt6211 && (!Static61.aClass195Array1[local839].aString56.equals(local446) || Static61.aClass195Array1[local839].anInt5439 != local222); local839++) {
						}
						if (Static354.anInt6211 > local839) {
							while (Static354.anInt6211 - 1 > local839) {
								Static61.aClass195Array1[local839] = Static61.aClass195Array1[local839 + 1];
								local839++;
							}
							Static354.anInt6211--;
							Static61.aClass195Array1[Static354.anInt6211] = null;
						}
					} else {
						@Pc(699) String local699 = Static85.aClass2_Sub13_Sub2_11.method4201();
						local703 = new Class195();
						local703.aString54 = local657;
						local703.aString56 = local446;
						local703.aString53 = Static236.method3861(local703.aString56);
						local703.anInt5439 = local222;
						local703.aString55 = local699;
						local703.aByte60 = local686;
						for (local728 = Static354.anInt6211 - 1; local728 >= 0; local728--) {
							local738 = Static61.aClass195Array1[local728].aString53.compareTo(local703.aString53);
							if (local738 == 0) {
								Static61.aClass195Array1[local728].anInt5439 = local222;
								Static61.aClass195Array1[local728].aByte60 = local686;
								Static61.aClass195Array1[local728].aString55 = local699;
								if (local446.equals(Static267.aClass12_Sub1_Sub2_Sub2_1.aString51)) {
									Static207.aByte38 = local686;
								}
								Static221.anInt4102 = Static180.anInt3216;
								Static265.aClass77_123 = null;
								return true;
							}
							if (local738 < 0) {
								break;
							}
						}
						if (Static61.aClass195Array1.length <= Static354.anInt6211) {
							Static265.aClass77_123 = null;
							return true;
						}
						for (local738 = Static354.anInt6211 - 1; local738 > local728; local738--) {
							Static61.aClass195Array1[local738 + 1] = Static61.aClass195Array1[local738];
						}
						if (Static354.anInt6211 == 0) {
							Static61.aClass195Array1 = new Class195[100];
						}
						Static61.aClass195Array1[local728 + 1] = local703;
						Static354.anInt6211++;
						if (local446.equals(Static267.aClass12_Sub1_Sub2_Sub2_1.aString51)) {
							Static207.aByte38 = local686;
						}
					}
					Static265.aClass77_123 = null;
					Static221.anInt4102 = Static180.anInt3216;
					return true;
				} else if (Static362.aClass77_172 == Static265.aClass77_123) {
					local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
					local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
					local668 = (local75 & 0x1) == 1;
					Static52.method3367(local668, local203);
					local222 = Static85.aClass2_Sub13_Sub2_11.method4245();
					for (local235 = 0; local235 < local222; local235++) {
						local241 = Static85.aClass2_Sub13_Sub2_11.method4240();
						if (local241 == 255) {
							local241 = Static85.aClass2_Sub13_Sub2_11.method4239();
						}
						local839 = Static85.aClass2_Sub13_Sub2_11.method4229();
						Static362.method5522(local241, local203, local839 - 1, local235, local668);
					}
					Static375.anIntArray518[Static207.anInt3843++ & 0x1F] = local203;
					Static265.aClass77_123 = null;
					return true;
				} else if (Static265.aClass77_123 == Static377.aClass77_175) {
					local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
					if (Static259.method4040(local203)) {
						Static307.method4777();
					}
					Static265.aClass77_123 = null;
					return true;
				} else if (Static265.aClass77_123 == Static103.aClass77_54) {
					local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
					local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
					local218 = Static85.aClass2_Sub13_Sub2_11.method4209();
					if (Static259.method4040(local203)) {
						Static318.method4083(local218, local446);
					}
					Static265.aClass77_123 = null;
					return true;
				} else if (Static265.aClass77_123 == Static155.aClass77_82) {
					local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
					if (local203 == 65535) {
						local203 = -1;
					}
					local75 = Static85.aClass2_Sub13_Sub2_11.method4193();
					Static138.method2406(local203, local75);
					Static265.aClass77_123 = null;
					return true;
				} else if (Static265.aClass77_123 == Static367.aClass77_173) {
					local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
					if (local203 == 65535) {
						local203 = -1;
					}
					local75 = Static85.aClass2_Sub13_Sub2_11.method4227();
					local218 = Static85.aClass2_Sub13_Sub2_11.method4249();
					Static129.method2300(local203, local75, local218);
					Static265.aClass77_123 = null;
					return true;
				} else if (Static265.aClass77_123 == Static153.aClass77_81) {
					local203 = Static85.aClass2_Sub13_Sub2_11.method4229();
					if (local203 == 65535) {
						local203 = -1;
					}
					local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
					if (local75 == 65535) {
						local75 = -1;
					}
					local218 = Static85.aClass2_Sub13_Sub2_11.method4245();
					local222 = Static85.aClass2_Sub13_Sub2_11.method4248();
					local235 = Static85.aClass2_Sub13_Sub2_11.method4220();
					if (Static259.method4040(local235)) {
						for (local241 = local75; local241 <= local203; local241++) {
							local251 = (long) local241 + ((long) local222 << 32);
							local257 = (Class2_Sub35) Static360.aClass214_31.method5059(local251);
							if (local257 != null) {
								local268 = new Class2_Sub35(local257.anInt5883, local218);
								local257.method5745();
							} else if (local241 == -1) {
								local268 = new Class2_Sub35(Static240.method3886(local222).aClass2_Sub35_2.anInt5883, local218);
							} else {
								local268 = new Class2_Sub35(0, local218);
							}
							Static360.aClass214_31.method5065(local251, local268);
						}
					}
					Static265.aClass77_123 = null;
					return true;
				} else if (Static265.aClass77_123 == Static305.aClass77_57) {
					if (Static327.anInt5773 == 0) {
						Static73.aString17 = Static339.aClass221_212.method5229(Static189.anInt5185);
					} else {
						Static73.aString17 = Static85.aClass2_Sub13_Sub2_11.method4201();
					}
					Static265.aClass77_123 = null;
					return true;
				} else if (Static120.aClass77_68 == Static265.aClass77_123) {
					Static248.aClass125_1.method2741();
					Static92.anInt1742 += 32;
					Static265.aClass77_123 = null;
					return true;
				} else {
					@Pc(1264) int local1264;
					if (Static382.aClass77_176 == Static265.aClass77_123) {
						local203 = Static85.aClass2_Sub13_Sub2_11.method4248();
						local75 = local203 >> 28 & 0x3;
						local218 = local203 >> 14 & 0x3FFF;
						local222 = local203 & 0x3FFF;
						local235 = Static85.aClass2_Sub13_Sub2_11.method4196();
						local241 = local235 >> 2;
						local839 = local235 & 0x3;
						local1264 = Static223.anIntArray504[local241];
						local728 = Static85.aClass2_Sub13_Sub2_11.method4245();
						if (local728 == 65535) {
							local728 = -1;
						}
						local218 -= Static376.anInt6607;
						local222 -= Static133.anInt2474;
						Static80.method1434(local241, local728, local839, local222, local1264, local75, local218);
						Static265.aClass77_123 = null;
						return true;
					} else if (Static265.aClass77_123 == Static146.aClass77_80) {
						Static160.anInt2911 = Static85.aClass2_Sub13_Sub2_11.method4240();
						Static265.aClass77_123 = null;
						Static357.anInt882 = Static180.anInt3216;
						return true;
					} else if (Static187.aClass77_90 == Static265.aClass77_123) {
						Static276.method4296(Static64.aClass17_3);
						Static265.aClass77_123 = null;
						return true;
					} else if (Static329.aClass77_148 == Static265.aClass77_123) {
						local203 = Static85.aClass2_Sub13_Sub2_11.method4239();
						local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
						local218 = Static85.aClass2_Sub13_Sub2_11.method4245();
						if (local218 == 65535) {
							local218 = -1;
						}
						local222 = Static85.aClass2_Sub13_Sub2_11.method4239();
						if (Static259.method4040(local75)) {
							Static52.method3361(local203, local218, local222);
							@Pc(1361) Class117 local1361 = Static106.aClass250_1.method5735(local218);
							Static21.method619(local1361.anInt2863, local1361.anInt2885, local1361.anInt2852, local222);
							Static101.method1821(local1361.anInt2836, local1361.anInt2866, local1361.anInt2861, local222);
						}
						Static265.aClass77_123 = null;
						return true;
					} else if (Static67.aClass77_32 == Static265.aClass77_123) {
						local203 = Static85.aClass2_Sub13_Sub2_11.method4220();
						local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
						local668 = (local75 & 0x1) == 1;
						Static315.method4890(local203, local668);
						Static375.anIntArray518[Static207.anInt3843++ & 0x1F] = local203;
						Static265.aClass77_123 = null;
						return true;
					} else if (Static243.aClass77_118 == Static265.aClass77_123) {
						Static276.method4296(Static154.aClass17_12);
						Static265.aClass77_123 = null;
						return true;
					} else if (Static363.aClass77_154 == Static265.aClass77_123) {
						local203 = Static85.aClass2_Sub13_Sub2_11.method4220();
						local75 = Static85.aClass2_Sub13_Sub2_11.method4221();
						if (Static259.method4040(local203)) {
							Static90.method1540(3, -1, local75, -1);
						}
						Static265.aClass77_123 = null;
						return true;
					} else if (Static265.aClass77_123 == Static134.aClass77_75) {
						local203 = Static85.aClass2_Sub13_Sub2_11.method4209();
						local75 = Static85.aClass2_Sub13_Sub2_11.method4251();
						local218 = Static85.aClass2_Sub13_Sub2_11.method4220();
						if (Static259.method4040(local218)) {
							Static163.method2694(local75, local203);
						}
						Static265.aClass77_123 = null;
						return true;
					} else {
						@Pc(1526) Class2_Sub41 local1526;
						if (Static265.aClass77_123 == Static6.aClass77_4) {
							local203 = Static85.aClass2_Sub13_Sub2_11.method4248();
							local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
							local218 = Static85.aClass2_Sub13_Sub2_11.method4239();
							if (Static259.method4040(local75)) {
								@Pc(1517) Class2_Sub41 local1517 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local203);
								local1526 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local218);
								if (local1526 != null) {
									Static303.method4757(local1526, local1517 == null || local1526.anInt6411 != local1517.anInt6411, false);
								}
								if (local1517 != null) {
									local1517.method5745();
									Static362.aClass214_32.method5065((long) local218, local1517);
								}
								@Pc(1557) Class155 local1557 = Static240.method3886(local203);
								if (local1557 != null) {
									Static295.method4664(local1557);
								}
								local1557 = Static240.method3886(local218);
								if (local1557 != null) {
									Static295.method4664(local1557);
									Static13.method409(local1557, true);
								}
								if (Static226.anInt4223 != -1) {
									Static61.method1131(Static226.anInt4223, 1);
								}
							}
							Static265.aClass77_123 = null;
							return true;
						} else if (Static2.aClass77_96 == Static265.aClass77_123) {
							local203 = Static85.aClass2_Sub13_Sub2_11.method4240();
							if (Static85.aClass2_Sub13_Sub2_11.method4240() == 0) {
								Static315.aClass14Array1[local203] = new Class14();
							} else {
								Static85.aClass2_Sub13_Sub2_11.anInt4788--;
								Static315.aClass14Array1[local203] = new Class14(Static85.aClass2_Sub13_Sub2_11);
							}
							Static138.anInt2573 = Static180.anInt3216;
							Static265.aClass77_123 = null;
							return true;
						} else {
							@Pc(1647) String local1647;
							@Pc(1658) long local1658;
							@Pc(1663) long local1663;
							@Pc(1641) boolean local1641;
							@Pc(1677) int local1677;
							if (Static280.aClass77_133 == Static265.aClass77_123) {
								local1641 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
								local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
								local1647 = local446;
								if (local1641) {
									local1647 = Static85.aClass2_Sub13_Sub2_11.method4201();
								}
								local1658 = Static85.aClass2_Sub13_Sub2_11.method4245();
								local1663 = Static85.aClass2_Sub13_Sub2_11.method4235();
								local1264 = Static85.aClass2_Sub13_Sub2_11.method4240();
								@Pc(1673) long local1673 = (local1658 << 32) + local1663;
								@Pc(1675) boolean local1675 = false;
								local1677 = 0;
								while (true) {
									if (local1677 >= 100) {
										if (local1264 <= 1) {
											if (Static244.aBoolean92 && !Static208.aBoolean285 || Static346.aBoolean460) {
												local1675 = true;
											} else if (Static55.method1065(local1647)) {
												local1675 = true;
											}
										}
										break;
									}
									if (local1673 == Static52.aLongArray9[local1677]) {
										local1675 = true;
										break;
									}
									local1677++;
								}
								if (!local1675 && Static46.anInt931 == 0) {
									Static52.aLongArray9[Static271.anInt4862] = local1673;
									Static271.anInt4862 = (Static271.anInt4862 + 1) % 100;
									@Pc(1739) String local1739 = Static18.method506(Static155.method2589(Static128.method2278(Static85.aClass2_Sub13_Sub2_11)));
									if (local1264 == 2) {
										Static143.method2460(-1, "<img=1>" + local446, local1739, 7, null, 0, "<img=1>" + local1647);
									} else if (local1264 == 1) {
										Static143.method2460(-1, "<img=0>" + local446, local1739, 7, null, 0, "<img=0>" + local1647);
									} else {
										Static143.method2460(-1, local446, local1739, 3, null, 0, local1647);
									}
								}
								Static265.aClass77_123 = null;
								return true;
							}
							@Pc(1836) String local1836;
							@Pc(1838) boolean local1838;
							@Pc(2012) int local2012;
							@Pc(2065) String local2065;
							@Pc(2101) String local2101;
							@Pc(2083) String local2083;
							if (Static264.aClass77_122 == Static265.aClass77_123) {
								local1641 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
								local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
								local1647 = Static85.aClass2_Sub13_Sub2_11.method4201();
								local222 = Static85.aClass2_Sub13_Sub2_11.method4245();
								local235 = Static85.aClass2_Sub13_Sub2_11.method4240();
								local1836 = "";
								local1838 = false;
								if (local222 > 0) {
									local1836 = Static85.aClass2_Sub13_Sub2_11.method4201();
									local1838 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
								}
								for (local1264 = 0; local1264 < Static244.anInt1014; local1264++) {
									if (local1641) {
										if (local1647.equals(Static340.aStringArray38[local1264])) {
											Static340.aStringArray38[local1264] = local446;
											local446 = null;
											Static278.aStringArray8[local1264] = local1647;
											break;
										}
									} else if (local446.equals(Static340.aStringArray38[local1264])) {
										if (local222 != Static249.anIntArray557[local1264]) {
											Static249.anIntArray557[local1264] = local222;
											if (local222 > 0) {
												Static242.method3898(local446 + Static307.aClass221_184.method5229(Static189.anInt5185), 0, "", "", 5);
											}
											if (local222 == 0) {
												Static242.method3898(local446 + Static77.aClass221_60.method5229(Static189.anInt5185), 0, "", "", 5);
											}
										}
										Static278.aStringArray8[local1264] = local1647;
										Static337.aStringArray36[local1264] = local1836;
										Static147.anIntArray307[local1264] = local235;
										local446 = null;
										Static295.aBooleanArray119[local1264] = local1838;
										break;
									}
								}
								if (local446 != null && Static244.anInt1014 < 200) {
									Static340.aStringArray38[Static244.anInt1014] = local446;
									Static278.aStringArray8[Static244.anInt1014] = local1647;
									Static249.anIntArray557[Static244.anInt1014] = local222;
									Static337.aStringArray36[Static244.anInt1014] = local1836;
									Static147.anIntArray307[Static244.anInt1014] = local235;
									Static295.aBooleanArray119[Static244.anInt1014] = local1838;
									Static244.anInt1014++;
								}
								Static357.anInt882 = Static180.anInt3216;
								local738 = Static244.anInt1014;
								while (local738 > 0) {
									@Pc(2009) boolean local2009 = true;
									local738--;
									for (local2012 = 0; local2012 < local738; local2012++) {
										if (Static259.anInt4618 != Static249.anIntArray557[local2012] && Static259.anInt4618 == Static249.anIntArray557[local2012 + 1] || Static249.anIntArray557[local2012] == 0 && Static249.anIntArray557[local2012 + 1] != 0) {
											local1677 = Static249.anIntArray557[local2012];
											Static249.anIntArray557[local2012] = Static249.anIntArray557[local2012 + 1];
											Static249.anIntArray557[local2012 + 1] = local1677;
											local2065 = Static337.aStringArray36[local2012];
											Static337.aStringArray36[local2012] = Static337.aStringArray36[local2012 + 1];
											Static337.aStringArray36[local2012 + 1] = local2065;
											local2083 = Static340.aStringArray38[local2012];
											Static340.aStringArray38[local2012] = Static340.aStringArray38[local2012 + 1];
											Static340.aStringArray38[local2012 + 1] = local2083;
											local2101 = Static278.aStringArray8[local2012];
											Static278.aStringArray8[local2012] = Static278.aStringArray8[local2012 + 1];
											Static278.aStringArray8[local2012 + 1] = local2101;
											@Pc(2119) int local2119 = Static147.anIntArray307[local2012];
											Static147.anIntArray307[local2012] = Static147.anIntArray307[local2012 + 1];
											Static147.anIntArray307[local2012 + 1] = local2119;
											@Pc(2137) boolean local2137 = Static295.aBooleanArray119[local2012];
											Static295.aBooleanArray119[local2012] = Static295.aBooleanArray119[local2012 + 1];
											local2009 = false;
											Static295.aBooleanArray119[local2012 + 1] = local2137;
										}
									}
									if (local2009) {
										break;
									}
								}
								Static265.aClass77_123 = null;
								return true;
							} else if (Static123.aClass77_69 == Static265.aClass77_123) {
								Static276.method4296(Static277.aClass17_11);
								Static265.aClass77_123 = null;
								return true;
							} else if (Static265.aClass77_123 == Static32.aClass77_162) {
								Static160.anInt2918 = Static85.aClass2_Sub13_Sub2_11.method4193();
								Static145.anInt2654 = Static85.aClass2_Sub13_Sub2_11.method4193();
								Static195.anInt3567 = Static85.aClass2_Sub13_Sub2_11.method4193();
								Static265.aClass77_123 = null;
								return true;
							} else if (Static265.aClass77_123 == Static237.aClass77_117) {
								Static94.method4864(Static85.aClass2_Sub13_Sub2_11, Static327.anInt5773);
								Static265.aClass77_123 = null;
								return true;
							} else {
								@Pc(2254) long local2254;
								if (Static184.aClass77_171 == Static265.aClass77_123) {
									local1641 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
									local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
									local1647 = local446;
									if (local1641) {
										local1647 = Static85.aClass2_Sub13_Sub2_11.method4201();
									}
									local1658 = Static85.aClass2_Sub13_Sub2_11.method4231();
									local1663 = Static85.aClass2_Sub13_Sub2_11.method4245();
									local2254 = Static85.aClass2_Sub13_Sub2_11.method4235();
									local738 = Static85.aClass2_Sub13_Sub2_11.method4240();
									@Pc(2265) long local2265 = (local1663 << 32) + local2254;
									@Pc(2267) boolean local2267 = false;
									@Pc(2269) int local2269 = 0;
									while (true) {
										if (local2269 >= 100) {
											if (local738 <= 1) {
												if (Static244.aBoolean92 && !Static208.aBoolean285 || Static346.aBoolean460) {
													local2267 = true;
												} else if (Static55.method1065(local1647)) {
													local2267 = true;
												}
											}
											break;
										}
										if (Static52.aLongArray9[local2269] == local2265) {
											local2267 = true;
											break;
										}
										local2269++;
									}
									if (!local2267 && Static46.anInt931 == 0) {
										Static52.aLongArray9[Static271.anInt4862] = local2265;
										Static271.anInt4862 = (Static271.anInt4862 + 1) % 100;
										local2083 = Static18.method506(Static155.method2589(Static128.method2278(Static85.aClass2_Sub13_Sub2_11)));
										if (local738 == 2 || local738 == 3) {
											Static143.method2460(-1, "<img=1>" + local446, local2083, 9, Static370.method5573(local1658), 0, "<img=1>" + local1647);
										} else if (local738 == 1) {
											Static143.method2460(-1, "<img=0>" + local446, local2083, 9, Static370.method5573(local1658), 0, "<img=0>" + local1647);
										} else {
											Static143.method2460(-1, local446, local2083, 9, Static370.method5573(local1658), 0, local1647);
										}
									}
									Static265.aClass77_123 = null;
									return true;
								} else if (Static326.aClass77_146 == Static265.aClass77_123) {
									Static362.anInt6403 = Static85.aClass2_Sub13_Sub2_11.method4193();
									Static203.anInt3730 = Static85.aClass2_Sub13_Sub2_11.method4240();
									Static294.anInt5252 = Static85.aClass2_Sub13_Sub2_11.method4193();
									while (Static85.aClass2_Sub13_Sub2_11.anInt4788 < Static327.anInt5773) {
										@Pc(2441) Class17 local2441 = Static169.method2736()[Static85.aClass2_Sub13_Sub2_11.method4240()];
										Static276.method4296(local2441);
									}
									Static265.aClass77_123 = null;
									return true;
								} else if (Static265.aClass77_123 == Static330.aClass77_149) {
									if (Static226.anInt4223 != -1) {
										Static61.method1131(Static226.anInt4223, 0);
									}
									Static265.aClass77_123 = null;
									return true;
								} else if (Static199.aClass77_94 == Static265.aClass77_123) {
									local1641 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
									local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
									local1647 = local446;
									if (local1641) {
										local1647 = Static85.aClass2_Sub13_Sub2_11.method4201();
									}
									local1658 = Static85.aClass2_Sub13_Sub2_11.method4231();
									local1663 = Static85.aClass2_Sub13_Sub2_11.method4245();
									local2254 = Static85.aClass2_Sub13_Sub2_11.method4235();
									local738 = Static85.aClass2_Sub13_Sub2_11.method4240();
									local2012 = Static85.aClass2_Sub13_Sub2_11.method4245();
									@Pc(2522) long local2522 = local2254 + (local1663 << 32);
									@Pc(2524) boolean local2524 = false;
									@Pc(2526) int local2526 = 0;
									while (true) {
										if (local2526 >= 100) {
											if (local738 <= 1 && Static55.method1065(local1647)) {
												local2524 = true;
											}
											break;
										}
										if (local2522 == Static52.aLongArray9[local2526]) {
											local2524 = true;
											break;
										}
										local2526++;
									}
									if (!local2524 && Static46.anInt931 == 0) {
										Static52.aLongArray9[Static271.anInt4862] = local2522;
										Static271.anInt4862 = (Static271.anInt4862 + 1) % 100;
										local2101 = Static145.method2497(local2012).method3619(Static85.aClass2_Sub13_Sub2_11);
										if (local738 == 2) {
											Static143.method2460(local2012, "<img=1>" + local446, local2101, 20, Static370.method5573(local1658), 0, "<img=1>" + local1647);
										} else if (local738 == 1) {
											Static143.method2460(local2012, "<img=0>" + local446, local2101, 20, Static370.method5573(local1658), 0, "<img=0>" + local1647);
										} else {
											Static143.method2460(local2012, local446, local2101, 20, Static370.method5573(local1658), 0, local1647);
										}
									}
									Static265.aClass77_123 = null;
									return true;
								} else if (Static265.aClass77_123 == Static252.aClass77_121) {
									local203 = Static85.aClass2_Sub13_Sub2_11.method4248();
									local75 = Static85.aClass2_Sub13_Sub2_11.method4245();
									if (local75 == 65535) {
										local75 = -1;
									}
									local218 = Static85.aClass2_Sub13_Sub2_11.method4229();
									if (Static259.method4040(local218)) {
										Static90.method1540(2, -1, local203, local75);
									}
									Static265.aClass77_123 = null;
									return true;
								} else if (Static275.aClass77_129 == Static265.aClass77_123) {
									local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
									local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
									@Pc(2705) byte local2705 = Static85.aClass2_Sub13_Sub2_11.method4217();
									if (Static259.method4040(local203)) {
										Static275.method4290(local2705, local75);
									}
									Static265.aClass77_123 = null;
									return true;
								} else if (Static336.aClass77_153 == Static265.aClass77_123) {
									local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
									local75 = Static85.aClass2_Sub13_Sub2_11.method4248();
									local218 = Static85.aClass2_Sub13_Sub2_11.method4245();
									local222 = Static85.aClass2_Sub13_Sub2_11.method4209();
									if (Static259.method4040(local218)) {
										Static90.method1540(5, local75, local222, local203);
									}
									Static265.aClass77_123 = null;
									return true;
								} else {
									@Pc(2769) String local2769;
									@Pc(2771) String local2771;
									if (Static55.aClass77_24 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4211();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4239();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local2769 = "";
										local2771 = local2769;
										if ((local218 & 0x1) != 0) {
											local2769 = Static85.aClass2_Sub13_Sub2_11.method4201();
											if ((local218 & 0x2) == 0) {
												local2771 = local2769;
											} else {
												local2771 = Static85.aClass2_Sub13_Sub2_11.method4201();
											}
										}
										local1836 = Static85.aClass2_Sub13_Sub2_11.method4201();
										if (local203 == 99) {
											Static32.method5235(local1836);
										} else if (local2771.equals("") || !Static55.method1065(local2771)) {
											Static242.method3898(local1836, local75, local2771, local2769, local203);
										} else {
											Static265.aClass77_123 = null;
											return true;
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static269.aClass77_125 == Static265.aClass77_123) {
										Static276.method4296(Static358.aClass17_19);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static331.aClass77_150 == Static265.aClass77_123) {
										Static283.method4368(false);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static211.aClass77_102) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4245();
										if (Static259.method4040(local203) && Static228.aClass155ArrayArray1[local75] != null) {
											for (local235 = local218; local235 < local222; local235++) {
												local241 = Static85.aClass2_Sub13_Sub2_11.method4235();
												if (local235 < Static228.aClass155ArrayArray1[local75].length && Static228.aClass155ArrayArray1[local75][local235] != null) {
													Static228.aClass155ArrayArray1[local75][local235].anInt4160 = local241;
												}
											}
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static127.aClass77_73 == Static265.aClass77_123) {
										Static134.method2333(Static85.aClass2_Sub13_Sub2_11.method4201());
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static126.aClass77_72) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4249();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4221();
										if (Static259.method4040(local218)) {
											local1526 = (Class2_Sub41) Static362.aClass214_32.method5059((long) local222);
											if (local1526 != null) {
												Static303.method4757(local1526, local1526.anInt6411 != local203, false);
											}
											Static273.method4282(local222, local75, false, local203);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static126.aClass77_71) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local235 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local241 = Static85.aClass2_Sub13_Sub2_11.method4245();
										if (Static259.method4040(local203)) {
											Static57.aBooleanArray108[local75] = true;
											Static289.anIntArray633[local75] = local218;
											Static318.anIntArray570[local75] = local222;
											Static359.anIntArray761[local75] = local235;
											Static84.anIntArray214[local75] = local241;
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static156.aClass77_85) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4239();
										Static120.aClass1_5 = Static92.aClass53_2.method1172(local203);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static390.aClass77_179 == Static265.aClass77_123) {
										if (Static363.aFrame4 != null) {
											Static295.method4662(-1, Static365.anInt2296, false, -1);
										}
										@Pc(3081) byte[] local3081 = new byte[Static327.anInt5773];
										Static85.aClass2_Sub13_Sub2_11.method4259(Static327.anInt5773, local3081);
										local446 = Static158.method2649(local3081, Static327.anInt5773, 0);
										Static104.method1848(Static92.aClass53_2, local446, true, Static123.anInt2363 == 1);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static246.aClass77_119) {
										Static321.method4949();
										Static265.aClass77_123 = null;
										return false;
									} else if (Static265.aClass77_123 == Static347.aClass77_165) {
										Static276.method4296(Static115.aClass17_9);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static63.aClass77_29) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4196();
										Static248.aClass125_1.method2735(local75, local203);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static135.aClass77_76 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
										@Pc(3166) Object[] local3166 = new Object[local446.length() + 1];
										for (local222 = local446.length() - 1; local222 >= 0; local222--) {
											if (local446.charAt(local222) == 's') {
												local3166[local222 + 1] = Static85.aClass2_Sub13_Sub2_11.method4201();
											} else {
												local3166[local222 + 1] = Integer.valueOf(Static85.aClass2_Sub13_Sub2_11.method4239());
											}
										}
										local3166[0] = Integer.valueOf(Static85.aClass2_Sub13_Sub2_11.method4239());
										if (Static259.method4040(local203)) {
											@Pc(3224) Class2_Sub24 local3224 = new Class2_Sub24();
											local3224.anObjectArray5 = local3166;
											Static157.method2604(local3224);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static53.aClass77_20 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local668 = (local75 & 0x1) == 1;
										while (Static85.aClass2_Sub13_Sub2_11.anInt4788 < Static327.anInt5773) {
											local222 = Static85.aClass2_Sub13_Sub2_11.method4211();
											local235 = Static85.aClass2_Sub13_Sub2_11.method4245();
											local241 = 0;
											if (local235 != 0) {
												local241 = Static85.aClass2_Sub13_Sub2_11.method4240();
												if (local241 == 255) {
													local241 = Static85.aClass2_Sub13_Sub2_11.method4239();
												}
											}
											Static362.method5522(local241, local203, local235 - 1, local222, local668);
										}
										Static375.anIntArray518[Static207.anInt3843++ & 0x1F] = local203;
										Static265.aClass77_123 = null;
										return true;
									} else if (Static112.aClass77_66 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4221();
										if (Static259.method4040(local75)) {
											Static191.method3058(local203, local218);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static226.aClass77_110) {
										Static386.anInt1406 = Static85.aClass2_Sub13_Sub2_11.method4251();
										Static265.aClass77_123 = null;
										Static173.anInt3081 = Static180.anInt3216;
										return true;
									} else if (Static265.aClass77_123 == Static373.aClass77_174) {
										local657 = Static85.aClass2_Sub13_Sub2_11.method4201();
										local446 = Static18.method506(Static155.method2589(Static128.method2278(Static85.aClass2_Sub13_Sub2_11)));
										Static242.method3898(local446, 0, local657, local657, 6);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static340.aClass77_159) {
										Static276.method4296(Static217.aClass17_14);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static298.aClass77_139 == Static265.aClass77_123) {
										Static362.anInt6403 = Static85.aClass2_Sub13_Sub2_11.method4249();
										Static203.anInt3730 = Static85.aClass2_Sub13_Sub2_11.method4240();
										Static294.anInt5252 = Static85.aClass2_Sub13_Sub2_11.method4196();
										Static265.aClass77_123 = null;
										return true;
									} else if (Static140.aClass77_151 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4221();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4229();
										Static248.aClass125_1.method2739(local75, local203);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static109.aClass77_58) {
										Static165.method2709(Static327.anInt5773, Static92.aClass53_2, Static85.aClass2_Sub13_Sub2_11);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static197.aClass77_93 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										if (Static259.method4040(local203)) {
											Static377.method5660();
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static108.aClass77_55 == Static265.aClass77_123) {
										Static221.anInt4102 = Static180.anInt3216;
										if (Static327.anInt5773 == 0) {
											Static265.aClass77_123 = null;
											Static34.aString5 = null;
											Static260.aString45 = null;
											Static61.aClass195Array1 = null;
											Static354.anInt6211 = 0;
											return true;
										}
										Static34.aString5 = Static85.aClass2_Sub13_Sub2_11.method4201();
										local1641 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
										if (local1641) {
											Static85.aClass2_Sub13_Sub2_11.method4201();
										}
										@Pc(3512) long local3512 = Static85.aClass2_Sub13_Sub2_11.method4231();
										Static260.aString45 = Static68.method1249(local3512);
										Static93.aByte19 = Static85.aClass2_Sub13_Sub2_11.method4217();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4240();
										if (local222 == 255) {
											Static265.aClass77_123 = null;
											return true;
										}
										Static354.anInt6211 = local222;
										@Pc(3536) Class195[] local3536 = new Class195[100];
										for (local241 = 0; local241 < Static354.anInt6211; local241++) {
											local3536[local241] = new Class195();
											local3536[local241].aString54 = Static85.aClass2_Sub13_Sub2_11.method4201();
											local1641 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
											if (local1641) {
												local3536[local241].aString56 = Static85.aClass2_Sub13_Sub2_11.method4201();
											} else {
												local3536[local241].aString56 = local3536[local241].aString54;
											}
											local3536[local241].aString53 = Static236.method3861(local3536[local241].aString56);
											local3536[local241].anInt5439 = Static85.aClass2_Sub13_Sub2_11.method4245();
											local3536[local241].aByte60 = Static85.aClass2_Sub13_Sub2_11.method4217();
											local3536[local241].aString55 = Static85.aClass2_Sub13_Sub2_11.method4201();
											if (local3536[local241].aString56.equals(Static267.aClass12_Sub1_Sub2_Sub2_1.aString51)) {
												Static207.aByte38 = local3536[local241].aByte60;
											}
										}
										local728 = Static354.anInt6211;
										while (local728 > 0) {
											local728--;
											local1838 = true;
											for (local738 = 0; local738 < local728; local738++) {
												if (local3536[local738].aString53.compareTo(local3536[local738 + 1].aString53) > 0) {
													local703 = local3536[local738];
													local3536[local738] = local3536[local738 + 1];
													local3536[local738 + 1] = local703;
													local1838 = false;
												}
											}
											if (local1838) {
												break;
											}
										}
										Static61.aClass195Array1 = local3536;
										Static265.aClass77_123 = null;
										return true;
									} else if (Static340.aClass77_158 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4209();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
										Static248.aClass125_1.method2735(local203, local75);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static250.aClass77_120) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4193();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4196();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4229();
										if (local218 == 65535) {
											local218 = -1;
										}
										local2769 = Static85.aClass2_Sub13_Sub2_11.method4201();
										if (local203 >= 1 && local203 <= 8) {
											if (local2769.equalsIgnoreCase("null")) {
												local2769 = null;
											}
											Static1.aStringArray1[local203 - 1] = local2769;
											Static30.anIntArray105[local203 - 1] = local218;
											Static27.aBooleanArray16[local203 - 1] = local75 == 0;
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static208.aClass77_99 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4239();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4245();
										if (Static259.method4040(local203)) {
											Static261.method4080(local218, local75);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static97.aClass77_53) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4239();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4229();
										if (Static259.method4040(local75)) {
											Static257.method5606(local203, local218);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static191.aClass77_91 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4239();
										if (Static259.method4040(local75)) {
											Static275.method4290(local218, local203);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static59.aClass77_27) {
										Static85.aClass2_Sub13_Sub2_11.anInt4788 += 28;
										if (Static85.aClass2_Sub13_Sub2_11.method4198()) {
											Static253.method4971(Static85.aClass2_Sub13_Sub2_11, Static85.aClass2_Sub13_Sub2_11.anInt4788 - 28);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static155.aClass77_83) {
										Static276.method4296(Static231.aClass17_15);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static118.aClass77_67 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4229();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4229();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4248();
										if (local222 >> 30 == 0) {
											@Pc(4123) Class189 local4123;
											@Pc(4057) Class220 local4057;
											@Pc(4103) Class220 local4103;
											@Pc(4070) Class189 local4070;
											@Pc(4117) Class189 local4117;
											if (local222 >> 29 != 0) {
												local235 = local222 & 0xFFFF;
												@Pc(4026) Class12_Sub1_Sub2_Sub1 local4026 = Static107.aClass12_Sub1_Sub2_Sub1Array1[local235];
												if (local4026 != null) {
													if (local203 == 65535) {
														local203 = -1;
													}
													local1838 = true;
													if (local203 != -1 && local4026.anInt5330 != -1) {
														if (local4026.anInt5330 == local203) {
															local4057 = Static168.aClass74_1.method1772(local203);
															if (local4057.aBoolean455 && local4057.anInt6020 != -1) {
																local4070 = Static351.aClass175_3.method4107(local4057.anInt6020);
																local738 = local4070.anInt5165;
																if (local738 == 0 || local738 == 2) {
																	local1838 = false;
																} else if (local738 == 1) {
																	local1838 = true;
																}
															}
														} else {
															local4057 = Static168.aClass74_1.method1772(local203);
															local4103 = Static168.aClass74_1.method1772(local4026.anInt5330);
															if (local4057.anInt6020 != -1 && local4103.anInt6020 != -1) {
																local4117 = Static351.aClass175_3.method4107(local4057.anInt6020);
																local4123 = Static351.aClass175_3.method4107(local4103.anInt6020);
																if (local4117.anInt5157 < local4123.anInt5157) {
																	local1838 = false;
																}
															}
														}
													}
													if (local1838) {
														local4026.anInt5330 = local203;
														local4026.anInt5367 = Static295.anInt5281 + local218;
														local4026.anInt5375 = local75;
														local4026.anInt5341 = 0;
														local4026.anInt5369 = 0;
														local4026.anInt5327 = 1;
														if (local4026.anInt5367 > Static295.anInt5281) {
															local4026.anInt5341 = -1;
														}
														if (local4026.anInt5330 != -1 && local4026.anInt5367 == Static295.anInt5281) {
															local1264 = Static168.aClass74_1.method1772(local4026.anInt5330).anInt6020;
															if (local1264 != -1) {
																local4070 = Static351.aClass175_3.method4107(local1264);
																if (local4070 != null && local4070.anIntArray639 != null) {
																	Static369.method5563(local4026.aByte74, local4070, false, local4026.anInt6328, local4026.anInt6317, 0);
																}
															}
														}
													}
												}
											} else if (local222 >> 28 != 0) {
												local235 = local222 & 0xFFFF;
												@Pc(4231) Class12_Sub1_Sub2_Sub2 local4231;
												if (Static194.anInt3441 == local235) {
													local4231 = Static267.aClass12_Sub1_Sub2_Sub2_1;
												} else {
													local4231 = Static90.aClass12_Sub1_Sub2_Sub2Array1[local235];
												}
												if (local4231 != null) {
													if (local203 == 65535) {
														local203 = -1;
													}
													local1838 = true;
													if (local203 != -1 && local4231.anInt5330 != -1) {
														if (local4231.anInt5330 == local203) {
															local4057 = Static168.aClass74_1.method1772(local203);
															if (local4057.aBoolean455 && local4057.anInt6020 != -1) {
																local4070 = Static351.aClass175_3.method4107(local4057.anInt6020);
																local738 = local4070.anInt5165;
																if (local738 == 0 || local738 == 2) {
																	local1838 = false;
																} else if (local738 == 1) {
																	local1838 = true;
																}
															}
														} else {
															local4057 = Static168.aClass74_1.method1772(local203);
															local4103 = Static168.aClass74_1.method1772(local4231.anInt5330);
															if (local4057.anInt6020 != -1 && local4103.anInt6020 != -1) {
																local4117 = Static351.aClass175_3.method4107(local4057.anInt6020);
																local4123 = Static351.aClass175_3.method4107(local4103.anInt6020);
																if (local4117.anInt5157 < local4123.anInt5157) {
																	local1838 = false;
																}
															}
														}
													}
													if (local1838) {
														local4231.anInt5375 = local75;
														local4231.anInt5369 = 0;
														local4231.anInt5327 = 1;
														local4231.anInt5367 = local218 + Static295.anInt5281;
														local4231.anInt5330 = local203;
														local4231.anInt5341 = 0;
														if (Static295.anInt5281 < local4231.anInt5367) {
															local4231.anInt5341 = -1;
														}
														if (local4231.anInt5330 == 65535) {
															local4231.anInt5330 = -1;
														}
														if (local4231.anInt5330 != -1 && Static295.anInt5281 == local4231.anInt5367) {
															local1264 = Static168.aClass74_1.method1772(local4231.anInt5330).anInt6020;
															if (local1264 != -1) {
																local4070 = Static351.aClass175_3.method4107(local1264);
																if (local4070 != null && local4070.anIntArray639 != null) {
																	Static369.method5563(local4231.aByte74, local4070, local4231 == Static267.aClass12_Sub1_Sub2_Sub2_1, local4231.anInt6328, local4231.anInt6317, 0);
																}
															}
														}
													}
												}
											}
										} else {
											local235 = local222 >> 28 & 0x3;
											local241 = (local222 >> 14 & 0x3FFF) - Static376.anInt6607;
											local839 = (local222 & 0x3FFF) - Static133.anInt2474;
											if (local241 >= 0 && local839 >= 0 && local241 < Static392.anInt6751 && local839 < Static307.anInt5484) {
												local1264 = local241 * 128 + 64;
												local728 = local839 * 128 + 64;
												@Pc(4005) Class12_Sub1_Sub6 local4005 = new Class12_Sub1_Sub6(local203, 0, Static295.anInt5281, local235, local1264, Static18.method508(local728, local235, local1264) - local75, local728, local241, local241, local839, local839);
												Static237.aClass210_31.method5044(new Class2_Sub1_Sub16(local4005));
											}
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static223.aClass77_109) {
										Static276.method4296(Static73.aClass17_6);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static358.aClass77_170) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
										if (local75 == 255) {
											local203 = -1;
											local75 = -1;
										}
										Static386.method1340(local203, local75);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static111.aClass77_63) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4220();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
										local1647 = Static85.aClass2_Sub13_Sub2_11.method4201();
										if (Static259.method4040(local203)) {
											Static218.method3695(local1647, local75);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static390.aClass77_178) {
										Static276.method4296(Static255.aClass17_7);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static54.aClass77_23 == Static265.aClass77_123) {
										local657 = Static85.aClass2_Sub13_Sub2_11.method4201();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local1647 = Static145.method2497(local75).method3619(Static85.aClass2_Sub13_Sub2_11);
										Static143.method2460(local75, local657, local1647, 19, null, 0, local657);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static171.aClass77_87) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4220();
										@Pc(4543) byte local4543 = Static85.aClass2_Sub13_Sub2_11.method4246();
										Static248.aClass125_1.method2739(local203, local4543);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static38.aClass77_18) {
										Static90.anInt1710 = Static85.aClass2_Sub13_Sub2_11.method4245() * 30;
										Static265.aClass77_123 = null;
										Static173.anInt3081 = Static180.anInt3216;
										return true;
									} else if (Static273.aClass77_127 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4229();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4221();
										local235 = Static85.aClass2_Sub13_Sub2_11.method4237();
										if (Static259.method4040(local218)) {
											Static90.method1540(7, local75, local222, local203 | local235 << 16);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static60.aClass77_28) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local235 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local241 = Static85.aClass2_Sub13_Sub2_11.method4240();
										if (Static259.method4040(local203)) {
											Static377.method5662(local222, local241, local75, local218, local235, true);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static29.aClass77_10) {
										Static203.anInt3730 = Static85.aClass2_Sub13_Sub2_11.method4193();
										Static362.anInt6403 = Static85.aClass2_Sub13_Sub2_11.method4196();
										Static294.anInt5252 = Static85.aClass2_Sub13_Sub2_11.method4240();
										for (@Pc(4675) Class2_Sub5 local4675 = (Class2_Sub5) Static147.aClass214_14.method5060(); local4675 != null; local4675 = (Class2_Sub5) Static147.aClass214_14.method5064()) {
											local75 = (int) (local4675.aLong208 & 0x3FFFL);
											local218 = (int) (local4675.aLong208 >> 14 & 0x3FFFL);
											local222 = (int) (local4675.aLong208 >> 28 & 0x3L);
											if (local222 == Static294.anInt5252 && local75 >= Static362.anInt6403 && local75 < Static362.anInt6403 + 8 && local218 >= Static203.anInt3730 && local218 < Static203.anInt3730 + 8) {
												local4675.method5745();
												Static45.method2431(local218, Static294.anInt5252, local75);
											}
										}
										for (@Pc(4760) Class2_Sub22 local4760 = (Class2_Sub22) Static230.aClass210_30.method5035(); local4760 != null; local4760 = (Class2_Sub22) Static230.aClass210_30.method5037()) {
											if (Static362.anInt6403 <= local4760.anInt3082 && local4760.anInt3082 < Static362.anInt6403 + 8 && Static203.anInt3730 <= local4760.anInt3087 && local4760.anInt3087 < Static203.anInt3730 + 8 && Static294.anInt5252 == local4760.anInt3088) {
												local4760.anInt3083 = 0;
											}
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static375.aClass77_112) {
										Static279.anInt4939 = Static85.aClass2_Sub13_Sub2_11.method4240();
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static353.aClass77_168) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										if (local203 == 65535) {
											local203 = -1;
										}
										local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4240();
										Static134.method2336(local218, local222, local203, local75);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static174.aClass77_180) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4237();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4220();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4229();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4248();
										if (Static259.method4040(local75)) {
											Static298.method4673((local218 << 16) + local203, local222);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static32.aClass77_160) {
										Static276.method4296(Static321.aClass17_18);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static128.aClass77_74 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4229();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4222();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4222();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4209();
										if (Static259.method4040(local203)) {
											Static174.method5751(local218, local222, local75);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static352.aClass77_166) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local75 = local203 >> 5;
										local218 = local203 & 0x1F;
										if (local218 == 0) {
											Static239.aClass97Array1[local75] = null;
											Static265.aClass77_123 = null;
											return true;
										}
										@Pc(4968) Class97 local4968 = new Class97();
										local4968.anInt2442 = local218;
										local4968.anInt2456 = Static85.aClass2_Sub13_Sub2_11.method4240();
										if (local4968.anInt2456 >= 0 && Static275.aClass5Array14.length > local4968.anInt2456) {
											if (local4968.anInt2442 == 1 || local4968.anInt2442 == 10) {
												local4968.anInt2444 = Static85.aClass2_Sub13_Sub2_11.method4245();
												Static85.aClass2_Sub13_Sub2_11.anInt4788 += 6;
											} else if (local4968.anInt2442 >= 2 && local4968.anInt2442 <= 6) {
												if (local4968.anInt2442 == 2) {
													local4968.anInt2450 = 64;
													local4968.anInt2447 = 64;
												}
												if (local4968.anInt2442 == 3) {
													local4968.anInt2450 = 0;
													local4968.anInt2447 = 64;
												}
												if (local4968.anInt2442 == 4) {
													local4968.anInt2450 = 128;
													local4968.anInt2447 = 64;
												}
												if (local4968.anInt2442 == 5) {
													local4968.anInt2447 = 0;
													local4968.anInt2450 = 64;
												}
												if (local4968.anInt2442 == 6) {
													local4968.anInt2447 = 128;
													local4968.anInt2450 = 64;
												}
												local4968.anInt2442 = 2;
												local4968.anInt2455 = Static85.aClass2_Sub13_Sub2_11.method4240();
												local4968.anInt2445 = Static85.aClass2_Sub13_Sub2_11.method4245();
												local4968.anInt2443 = Static85.aClass2_Sub13_Sub2_11.method4245();
												local4968.anInt2452 = Static85.aClass2_Sub13_Sub2_11.method4240();
												local4968.anInt2454 = Static85.aClass2_Sub13_Sub2_11.method4245();
											}
											local4968.anInt2449 = Static85.aClass2_Sub13_Sub2_11.method4245();
											if (local4968.anInt2449 == 65535) {
												local4968.anInt2449 = -1;
											}
											Static239.aClass97Array1[local75] = local4968;
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static33.aClass77_16) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4249();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4239();
										Static212.anIntArray484[local75] = local218;
										Static335.anIntArray713[local75] = local203;
										Static348.anIntArray743[local75] = 1;
										local222 = Static328.anIntArray703[local75] - 1;
										for (local235 = 0; local235 < local222; local235++) {
											if (local218 >= Class182.anIntArray625[local235]) {
												Static348.anIntArray743[local75] = local235 + 2;
											}
										}
										Static260.anIntArray569[Static286.anInt5104++ & 0x1F] = local75;
										Static265.aClass77_123 = null;
										return true;
									} else if (Static229.aClass77_163 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4248();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4229();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4240();
										if (Static259.method4040(local75)) {
											Static43.method901(local218, local203);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static276.aClass77_130) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4240();
										@Pc(5237) boolean local5237 = (local203 & 0x1) == 1;
										local1647 = Static85.aClass2_Sub13_Sub2_11.method4201();
										local2769 = Static85.aClass2_Sub13_Sub2_11.method4201();
										if (local2769.equals("")) {
											local2769 = local1647;
										}
										local2771 = Static85.aClass2_Sub13_Sub2_11.method4201();
										local1836 = Static85.aClass2_Sub13_Sub2_11.method4201();
										if (local1836.equals("")) {
											local1836 = local2771;
										}
										if (local5237) {
											for (local839 = 0; local839 < Static379.anInt1197; local839++) {
												if (Static217.aStringArray24[local839].equals(local1836)) {
													Static235.aStringArray28[local839] = local1647;
													Static217.aStringArray24[local839] = local2769;
													Static184.aStringArray42[local839] = local2771;
													Static93.aStringArray11[local839] = local1836;
													break;
												}
											}
										} else {
											Static235.aStringArray28[Static379.anInt1197] = local1647;
											Static217.aStringArray24[Static379.anInt1197] = local2769;
											Static184.aStringArray42[Static379.anInt1197] = local2771;
											Static93.aStringArray11[Static379.anInt1197] = local1836;
											Static275.aBooleanArray114[Static379.anInt1197] = (local203 & 0x2) == 2;
											Static379.anInt1197++;
										}
										Static265.aClass77_123 = null;
										Static357.anInt882 = Static180.anInt3216;
										return true;
									} else if (Static279.aClass77_132 == Static265.aClass77_123) {
										Static283.method4368(true);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static169.aClass77_86 == Static265.aClass77_123) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4220();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4221();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4220();
										if (local218 == 65535) {
											local218 = -1;
										}
										if (Static259.method4040(local203)) {
											Static330.method5067(local218, local75);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static364.aClass77_138 == Static265.aClass77_123) {
										Static379.anInt1197 = Static85.aClass2_Sub13_Sub2_11.method4240();
										for (local203 = 0; local203 < Static379.anInt1197; local203++) {
											Static235.aStringArray28[local203] = Static85.aClass2_Sub13_Sub2_11.method4201();
											Static217.aStringArray24[local203] = Static85.aClass2_Sub13_Sub2_11.method4201();
											if (Static217.aStringArray24[local203].equals("")) {
												Static217.aStringArray24[local203] = Static235.aStringArray28[local203];
											}
											Static184.aStringArray42[local203] = Static85.aClass2_Sub13_Sub2_11.method4201();
											Static93.aStringArray11[local203] = Static85.aClass2_Sub13_Sub2_11.method4201();
											if (Static93.aStringArray11[local203].equals("")) {
												Static93.aStringArray11[local203] = Static184.aStringArray42[local203];
											}
											Static275.aBooleanArray114[local203] = false;
										}
										Static265.aClass77_123 = null;
										Static357.anInt882 = Static180.anInt3216;
										return true;
									} else if (Static265.aClass77_123 == Static266.aClass77_124) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local75 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local222 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local235 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local241 = Static85.aClass2_Sub13_Sub2_11.method4240();
										if (Static259.method4040(local203)) {
											Static63.method1159(local235, local241, local218, local222, local75);
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static286.aClass77_135) {
										local1641 = Static85.aClass2_Sub13_Sub2_11.method4240() == 1;
										local446 = Static85.aClass2_Sub13_Sub2_11.method4201();
										local1647 = local446;
										if (local1641) {
											local1647 = Static85.aClass2_Sub13_Sub2_11.method4201();
										}
										local1658 = Static85.aClass2_Sub13_Sub2_11.method4245();
										local1663 = Static85.aClass2_Sub13_Sub2_11.method4235();
										local1264 = Static85.aClass2_Sub13_Sub2_11.method4240();
										local728 = Static85.aClass2_Sub13_Sub2_11.method4245();
										@Pc(5553) long local5553 = local1663 + (local1658 << 32);
										@Pc(5555) boolean local5555 = false;
										@Pc(5557) int local5557 = 0;
										while (true) {
											if (local5557 >= 100) {
												if (local1264 <= 1 && Static55.method1065(local1647)) {
													local5555 = true;
												}
												break;
											}
											if (Static52.aLongArray9[local5557] == local5553) {
												local5555 = true;
												break;
											}
											local5557++;
										}
										if (!local5555 && Static46.anInt931 == 0) {
											Static52.aLongArray9[Static271.anInt4862] = local5553;
											Static271.anInt4862 = (Static271.anInt4862 + 1) % 100;
											local2065 = Static145.method2497(local728).method3619(Static85.aClass2_Sub13_Sub2_11);
											if (local1264 == 2) {
												Static143.method2460(local728, "<img=1>" + local446, local2065, 18, null, 0, "<img=1>" + local1647);
											} else if (local1264 == 1) {
												Static143.method2460(local728, "<img=0>" + local446, local2065, 18, null, 0, "<img=0>" + local1647);
											} else {
												Static143.method2460(local728, local446, local2065, 18, null, 0, local1647);
											}
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static32.aClass77_161) {
										Static276.method4296(Static170.aClass17_13);
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static288.aClass77_136) {
										for (local203 = 0; local203 < Static90.aClass12_Sub1_Sub2_Sub2Array1.length; local203++) {
											if (Static90.aClass12_Sub1_Sub2_Sub2Array1[local203] != null) {
												Static90.aClass12_Sub1_Sub2_Sub2Array1[local203].anInt5371 = -1;
											}
										}
										for (local75 = 0; local75 < Static107.aClass12_Sub1_Sub2_Sub1Array1.length; local75++) {
											if (Static107.aClass12_Sub1_Sub2_Sub1Array1[local75] != null) {
												Static107.aClass12_Sub1_Sub2_Sub1Array1[local75].anInt5371 = -1;
											}
										}
										Static265.aClass77_123 = null;
										return true;
									} else if (Static265.aClass77_123 == Static68.aClass77_33) {
										local203 = Static85.aClass2_Sub13_Sub2_11.method4220();
										if (local203 == 65535) {
											local203 = -1;
										}
										local75 = Static85.aClass2_Sub13_Sub2_11.method4248();
										local218 = Static85.aClass2_Sub13_Sub2_11.method4220();
										if (Static259.method4040(local218)) {
											Static90.method1540(1, -1, local75, local203);
										}
										Static265.aClass77_123 = null;
										return true;
									} else {
										Static235.method3843("T1 - " + (Static265.aClass77_123 == null ? -1 : Static265.aClass77_123.method1792()) + "," + (Static229.aClass77_164 == null ? -1 : Static229.aClass77_164.method1792()) + "," + (Static327.aClass77_147 == null ? -1 : Static327.aClass77_147.method1792()) + " - " + Static327.anInt5773, null);
										Static321.method4949();
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

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(Lclient!km;Lclient!kj;IIIII)V")
	public static void method2119(@OriginalArg(0) Class82 arg0, @OriginalArg(1) Class12 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg3;
		@Pc(7) int local7 = arg3 + arg5;
		@Pc(11) int local11 = arg4 - 1;
		@Pc(15) int local15 = arg4 + arg6;
		for (@Pc(17) int local17 = arg2; local17 <= arg2 + 1; local17++) {
			if (local17 != Static32.anInt6037) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static166.anInt2967) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static244.anInt1024 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg4 && local23 != arg3)) {
								@Pc(62) Class227 local62 = Static297.aClass227ArrayArrayArray7[local17][local23][local32];
								if (local62 != null) {
									@Pc(140) int local140 = (Static17.aClass33Array1[local17].method4057(local23, local32) + Static17.aClass33Array1[local17].method4057(local23 + 1, local32) + Static17.aClass33Array1[local17].method4057(local23, local32 + 1) + Static17.aClass33Array1[local17].method4057(local23 + 1, local32 + 1)) / 4 - (Static17.aClass33Array1[arg2].method4057(arg3, arg4) + Static17.aClass33Array1[arg2].method4057(arg3 + 1, arg4) + Static17.aClass33Array1[arg2].method4057(arg3, arg4 + 1) + Static17.aClass33Array1[arg2].method4057(arg3 + 1, arg4 + 1)) / 4;
									@Pc(143) Class12_Sub2 local143 = local62.aClass12_Sub2_2;
									@Pc(146) Class12_Sub2 local146 = local62.aClass12_Sub2_3;
									if (local143 != null && local143.method5455()) {
										arg1.method5454((local23 - arg3) * Static292.anInt5158 + (1 - arg5) * Static365.anInt2303, arg0, local140, local1, (local32 - arg4) * Static292.anInt5158 + (1 - arg6) * Static365.anInt2303, local143);
									}
									if (local146 != null && local146.method5455()) {
										arg1.method5454((local23 - arg3) * Static292.anInt5158 + (1 - arg5) * Static365.anInt2303, arg0, local140, local1, (local32 - arg4) * Static292.anInt5158 + (1 - arg6) * Static365.anInt2303, local146);
									}
									for (@Pc(219) Class164 local219 = local62.aClass164_25; local219 != null; local219 = local219.aClass164_19) {
										@Pc(223) Class12_Sub1 local223 = local219.aClass12_Sub1_2;
										if (local223 != null && local223.method5455() && (local23 == local223.aShort97 || local23 == local3) && (local32 == local223.aShort94 || local32 == local11)) {
											@Pc(252) int local252 = local223.aShort96 + 1 - local223.aShort97;
											@Pc(260) int local260 = local223.aShort95 + 1 - local223.aShort94;
											arg1.method5454((local223.aShort97 - arg3) * Static292.anInt5158 + (local252 - arg5) * Static365.anInt2303, arg0, local140, local1, (local223.aShort94 - arg4) * Static292.anInt5158 + (local260 - arg6) * Static365.anInt2303, local223);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}
}
