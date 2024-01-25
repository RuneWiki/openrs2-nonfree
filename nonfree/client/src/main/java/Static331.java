import java.io.IOException;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "I")
	public static int anInt5891 = 1;

	@OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
	public static int anInt5893 = -1;

	@OriginalMember(owner = "client!qv", name = "f", descriptor = "[I")
	public static final int[] anIntArray383 = new int[64];

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
	public static int anInt5894 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(B)V")
	public static void method4710() {
		try {
			@Pc(12) Method local12 = Runtime.class.getMethod("availableProcessors");
			if (local12 != null) {
				try {
					@Pc(24) Runtime local24 = Runtime.getRuntime();
					@Pc(30) Integer local30 = (Integer) local12.invoke(local24, (Object[]) null);
					Static204.anInt3949 = local30;
				} catch (@Pc(35) Throwable local35) {
				}
			}
		} catch (@Pc(37) Exception local37) {
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IJ)V")
	public static void method4711(@OriginalArg(1) long arg0) {
		if (Static176.aClass113ArrayArrayArray3 != null) {
			if (Static65.anInt7824 == 1 || Static65.anInt7824 == 5) {
				Static123.method1787(arg0);
			} else if (Static65.anInt7824 == 4) {
				Static450.method6077(arg0);
			}
		}
		Static16.method240((long) Static164.anInt3206, Static387.aClass26_9);
		if (Static108.anInt2264 != -1) {
			Static416.method5643(Static108.anInt2264);
		}
		for (@Pc(45) int local45 = 0; local45 < Static66.anInt1689; local45++) {
			if (Static10.aBooleanArray5[local45]) {
				Static378.aBooleanArray47[local45] = true;
			}
			Static16.aBooleanArray6[local45] = Static10.aBooleanArray5[local45];
			Static10.aBooleanArray5[local45] = false;
		}
		Static143.anInt7609 = Static164.anInt3206;
		if (Static387.aClass26_9.method2261()) {
			Static382.aBoolean578 = true;
		}
		if (Static108.anInt2264 != -1) {
			Static66.anInt1689 = 0;
			Static337.method4763();
		}
		Static387.aClass26_9.va();
		Static412.method5585(Static387.aClass26_9);
		@Pc(93) int local93 = Static102.method1619();
		if (local93 == -1) {
			local93 = Static217.anInt490;
		}
		if (local93 == -1) {
			local93 = Static231.anInt4398;
		}
		Static278.method4105(local93);
		Static235.method3569(Static305.anInt1351, Static231.aClass4_Sub2_Sub2_Sub1_2.aByte92, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7117, Static231.aClass4_Sub2_Sub2_Sub1_2.anInt7111);
		Static305.anInt1351 = 0;
	}

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "(B)Z")
	public static boolean method4712() throws IOException {
		if (Static423.aClass199_11 == null) {
			return false;
		}
		@Pc(13) int local13 = Static423.aClass199_11.method4483();
		if (local13 == 0) {
			return false;
		}
		@Pc(73) int local73;
		if (Static141.aClass81_59 == null) {
			if (Static333.aBoolean521) {
				Static423.aClass199_11.method4488(1, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
				local13--;
				Static333.aBoolean521 = false;
				Static170.anInt3279++;
			}
			Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
			if (Static426.aClass2_Sub20_Sub1_2.method2502()) {
				if (local13 == 0) {
					return false;
				}
				Static423.aClass199_11.method4488(1, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 1);
				local13--;
				Static170.anInt3279++;
			}
			Static333.aBoolean521 = true;
			@Pc(69) Class81[] local69 = Static24.method341();
			local73 = Static426.aClass2_Sub20_Sub1_2.method2507();
			if (local73 < 0 || local69.length <= local73) {
				throw new IOException("invo:" + local73 + " ip:" + Static426.aClass2_Sub20_Sub1_2.anInt4608);
			}
			Static141.aClass81_59 = local69[local73];
			Static193.anInt3787 = Static141.aClass81_59.anInt2296;
		}
		if (Static193.anInt3787 == -1) {
			if (local13 <= 0) {
				return false;
			}
			Static423.aClass199_11.method4488(1, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
			Static193.anInt3787 = Static426.aClass2_Sub20_Sub1_2.aByteArray136[0] & 0xFF;
			local13--;
			Static170.anInt3279++;
		}
		if (Static193.anInt3787 == -2) {
			if (local13 <= 1) {
				return false;
			}
			Static423.aClass199_11.method4488(2, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
			Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
			Static193.anInt3787 = Static426.aClass2_Sub20_Sub1_2.method3711();
			local13 -= 2;
			Static170.anInt3279 += 2;
		}
		if (Static193.anInt3787 > local13) {
			return false;
		}
		Static426.aClass2_Sub20_Sub1_2.anInt4608 = 0;
		Static423.aClass199_11.method4488(Static193.anInt3787, Static426.aClass2_Sub20_Sub1_2.aByteArray136, 0);
		Static325.anInt5840 = 0;
		Static106.aClass81_49 = Static356.aClass81_160;
		Static170.anInt3279 += Static193.anInt3787;
		Static356.aClass81_160 = Static405.aClass81_177;
		Static405.aClass81_177 = Static141.aClass81_59;
		if (Static223.aClass81_103 == Static141.aClass81_59) {
			local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
			if (Static306.method4382(local73)) {
				Static225.method3478();
			}
			Static141.aClass81_59 = null;
			return true;
		}
		@Pc(223) int local223;
		if (Static141.aClass81_59 == Static143.aClass81_198) {
			local73 = Static426.aClass2_Sub20_Sub1_2.method3716();
			local223 = Static426.aClass2_Sub20_Sub1_2.method3721();
			if (local223 == 255) {
				local73 = -1;
				local223 = -1;
			}
			Static326.method4675(local73, local223);
			Static141.aClass81_59 = null;
			return true;
		}
		@Pc(259) int local259;
		@Pc(255) int local255;
		@Pc(270) Class2_Sub25 local270;
		if (Static141.aClass81_59 == Static450.aClass81_204) {
			local73 = Static426.aClass2_Sub20_Sub1_2.method3743();
			local223 = Static426.aClass2_Sub20_Sub1_2.method3739();
			local255 = Static426.aClass2_Sub20_Sub1_2.method3706();
			local259 = Static426.aClass2_Sub20_Sub1_2.method3706();
			if (Static306.method4382(local259)) {
				local270 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local73);
				if (local270 != null) {
					Static419.method5701(local270, false, local270.anInt4163 != local255);
				}
				Static71.method1294(false, local223, local255, local73);
			}
			Static141.aClass81_59 = null;
			return true;
		} else if (Static141.aClass81_59 == Static42.aClass81_19) {
			local73 = Static426.aClass2_Sub20_Sub1_2.method3737();
			if (Static426.aClass2_Sub20_Sub1_2.method3737() == 0) {
				Static118.aClass251Array1[local73] = new Class251();
			} else {
				Static426.aClass2_Sub20_Sub1_2.anInt4608--;
				Static118.aClass251Array1[local73] = new Class251(Static426.aClass2_Sub20_Sub1_2);
			}
			Static266.anInt4928 = anInt5891;
			Static141.aClass81_59 = null;
			return true;
		} else if (Static368.aClass81_165 == Static141.aClass81_59) {
			local73 = Static426.aClass2_Sub20_Sub1_2.method3732();
			local223 = Static426.aClass2_Sub20_Sub1_2.method3747();
			Static215.aClass225_1.method5149(local73, local223);
			Static141.aClass81_59 = null;
			return true;
		} else if (Static119.aClass81_52 == Static141.aClass81_59) {
			Static203.method3162(Static205.aClass180_8);
			Static141.aClass81_59 = null;
			return true;
		} else if (Static315.aClass81_135 == Static141.aClass81_59) {
			Static8.method182(Static303.aClass131_4, Static426.aClass2_Sub20_Sub1_2, Static193.anInt3787);
			Static141.aClass81_59 = null;
			return true;
		} else {
			@Pc(406) int local406;
			@Pc(408) int local408;
			@Pc(396) boolean local396;
			if (Static141.aClass81_59 == Static215.aClass81_97) {
				local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
				local223 = Static426.aClass2_Sub20_Sub1_2.method3737();
				local396 = (local223 & 0x1) == 1;
				while (Static193.anInt3787 > Static426.aClass2_Sub20_Sub1_2.anInt4608) {
					local259 = Static426.aClass2_Sub20_Sub1_2.method3698();
					local406 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local408 = 0;
					if (local406 != 0) {
						local408 = Static426.aClass2_Sub20_Sub1_2.method3737();
						if (local408 == 255) {
							local408 = Static426.aClass2_Sub20_Sub1_2.method3731();
						}
					}
					Static176.method2773(local406 - 1, local73, local408, local259, local396);
				}
				Static52.anIntArray502[Static422.anInt7370++ & 0x1F] = local73;
				Static141.aClass81_59 = null;
				return true;
			} else if (Static422.aClass81_189 == Static141.aClass81_59) {
				local73 = Static426.aClass2_Sub20_Sub1_2.method3731();
				local223 = Static426.aClass2_Sub20_Sub1_2.method3747();
				local255 = Static426.aClass2_Sub20_Sub1_2.method3706();
				if (Static306.method4382(local255)) {
					@Pc(479) Class2_Sub25 local479 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local223);
					local270 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local73);
					if (local270 != null) {
						Static419.method5701(local270, false, local479 == null || local270.anInt4163 != local479.anInt4163);
					}
					if (local479 != null) {
						local479.method6072();
						Static398.aClass240_27.method5430((long) local73, local479);
					}
					@Pc(517) Class41 local517 = Static160.method2564(local223);
					if (local517 != null) {
						Static168.method2616(local517);
					}
					local517 = Static160.method2564(local73);
					if (local517 != null) {
						Static168.method2616(local517);
						Static115.method5068(true, local517);
					}
					if (Static108.anInt2264 != -1) {
						Static442.method5989(Static108.anInt2264, 1);
					}
				}
				Static141.aClass81_59 = null;
				return true;
			} else if (Static141.aClass81_59 == Static235.aClass81_106) {
				if (Static108.anInt2264 != -1) {
					Static442.method5989(Static108.anInt2264, 0);
				}
				Static141.aClass81_59 = null;
				return true;
			} else if (Static355.aClass81_159 == Static141.aClass81_59) {
				Static203.method3162(Static303.aClass180_11);
				Static141.aClass81_59 = null;
				return true;
			} else if (Static412.aClass81_181 == Static141.aClass81_59) {
				Static371.anInt6656 = Static426.aClass2_Sub20_Sub1_2.method3701();
				Static432.anInt7520 = anInt5891;
				Static141.aClass81_59 = null;
				return true;
			} else {
				@Pc(601) String local601;
				@Pc(603) String local603;
				@Pc(613) long local613;
				@Pc(618) long local618;
				@Pc(597) boolean local597;
				@Pc(623) long local623;
				@Pc(627) int local627;
				if (Static367.aClass81_164 == Static141.aClass81_59) {
					local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
					local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
					local603 = local601;
					if (local597) {
						local603 = Static426.aClass2_Sub20_Sub1_2.method3717();
					}
					local613 = Static426.aClass2_Sub20_Sub1_2.method3719();
					local618 = Static426.aClass2_Sub20_Sub1_2.method3711();
					local623 = Static426.aClass2_Sub20_Sub1_2.method3748();
					local627 = Static426.aClass2_Sub20_Sub1_2.method3737();
					@Pc(633) long local633 = local623 + (local618 << 32);
					@Pc(635) boolean local635 = false;
					@Pc(637) int local637 = 0;
					while (true) {
						if (local637 >= 100) {
							if (local627 <= 1) {
								if (Static217.aBoolean41 && !Static296.aBoolean462 || Static407.aBoolean597) {
									local635 = true;
								} else if (Static170.method2636(local603)) {
									local635 = true;
								}
							}
							break;
						}
						if (local633 == Static330.aLongArray5[local637]) {
							local635 = true;
							break;
						}
						local637++;
					}
					if (!local635 && Static310.anInt5449 == 0) {
						Static330.aLongArray5[Static261.anInt5571] = local633;
						Static261.anInt5571 = (Static261.anInt5571 + 1) % 100;
						@Pc(703) String local703 = Static273.method4070(Static26.method371(Static426.aClass2_Sub20_Sub1_2));
						if (local627 == 2 || local627 == 3) {
							Static226.method3487(local703, "<img=1>" + local603, "<img=1>" + local601, -1, 0, Static106.method1650(local613), 9);
						} else if (local627 == 1) {
							Static226.method3487(local703, "<img=0>" + local603, "<img=0>" + local601, -1, 0, Static106.method1650(local613), 9);
						} else {
							Static226.method3487(local703, local603, local601, -1, 0, Static106.method1650(local613), 9);
						}
					}
					Static141.aClass81_59 = null;
					return true;
				} else if (Static284.aClass81_125 == Static141.aClass81_59) {
					Static86.method1481(false);
					Static141.aClass81_59 = null;
					return true;
				} else if (Static286.aClass81_84 == Static141.aClass81_59) {
					Static426.aClass2_Sub20_Sub1_2.anInt4608 += 28;
					if (Static426.aClass2_Sub20_Sub1_2.method3722()) {
						Static189.method2983(Static426.aClass2_Sub20_Sub1_2, Static426.aClass2_Sub20_Sub1_2.anInt4608 - 28);
					}
					Static141.aClass81_59 = null;
					return true;
				} else if (Static141.aClass81_59 == Static213.aClass81_94) {
					Static203.method3162(Static233.aClass180_9);
					Static141.aClass81_59 = null;
					return true;
				} else {
					@Pc(892) String local892;
					if (Static29.aClass81_12 == Static141.aClass81_59) {
						local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
						local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
						local603 = local601;
						if (local597) {
							local603 = Static426.aClass2_Sub20_Sub1_2.method3717();
						}
						local259 = Static426.aClass2_Sub20_Sub1_2.method3737();
						@Pc(855) boolean local855 = false;
						if (local259 <= 1) {
							if (Static217.aBoolean41 && !Static296.aBoolean462 || Static407.aBoolean597) {
								local855 = true;
							} else if (local259 <= 1 && Static170.method2636(local603)) {
								local855 = true;
							}
						}
						if (!local855 && Static310.anInt5449 == 0) {
							local892 = Static273.method4070(Static26.method371(Static426.aClass2_Sub20_Sub1_2));
							if (local259 == 2) {
								Static226.method3487(local892, "<img=1>" + local603, "<img=1>" + local601, -1, 0, null, 24);
							} else if (local259 == 1) {
								Static226.method3487(local892, "<img=0>" + local603, "<img=0>" + local601, -1, 0, null, 24);
							} else {
								Static226.method3487(local892, local603, local601, -1, 0, null, 24);
							}
						}
						Static141.aClass81_59 = null;
						return true;
					}
					@Pc(1001) int local1001;
					@Pc(1005) int local1005;
					@Pc(995) int local995;
					if (Static325.aClass81_147 == Static141.aClass81_59) {
						local73 = Static426.aClass2_Sub20_Sub1_2.method3721();
						local223 = local73 >> 2;
						local255 = local73 & 0x3;
						local259 = Static104.anIntArray128[local223];
						local406 = Static426.aClass2_Sub20_Sub1_2.method3744();
						if (local406 == 65535) {
							local406 = -1;
						}
						local408 = Static426.aClass2_Sub20_Sub1_2.method3743();
						local995 = local408 >> 28 & 0x3;
						local1001 = local408 >> 14 & 0x3FFF;
						local1005 = local408 & 0x3FFF;
						local1001 -= Static173.anInt3340;
						local1005 -= Static379.anInt6721;
						Static16.method238(local406, local223, local1005, local1001, local995, local255, local259);
						Static141.aClass81_59 = null;
						return true;
					} else if (Static222.aClass81_102 == Static141.aClass81_59) {
						Static405.anInt7041 = Static426.aClass2_Sub20_Sub1_2.method3737();
						Static141.aClass81_59 = null;
						Static432.anInt7520 = anInt5891;
						return true;
					} else if (Static141.aClass81_59 == Static420.aClass81_186) {
						Static240.anInt4514 = Static426.aClass2_Sub20_Sub1_2.method3693() << 3;
						Static97.anInt2178 = Static426.aClass2_Sub20_Sub1_2.method3739();
						Static198.anInt3847 = Static426.aClass2_Sub20_Sub1_2.method3712() << 3;
						Static141.aClass81_59 = null;
						return true;
					} else if (Static141.aClass81_59 == Static210.aClass81_92) {
						local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
						local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
						local255 = Static426.aClass2_Sub20_Sub1_2.method3711();
						if (Static306.method4382(local255)) {
							Static288.method4217(local601, local73);
						}
						Static141.aClass81_59 = null;
						return true;
					} else {
						@Pc(1147) String local1147;
						@Pc(1123) boolean local1123;
						if (Static141.aClass81_59 == Static408.aClass81_178) {
							local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
							local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
							local603 = local601;
							if (local597) {
								local603 = Static426.aClass2_Sub20_Sub1_2.method3717();
							}
							local259 = Static426.aClass2_Sub20_Sub1_2.method3737();
							local406 = Static426.aClass2_Sub20_Sub1_2.method3711();
							local1123 = false;
							if (local259 <= 1 && Static170.method2636(local603)) {
								local1123 = true;
							}
							if (!local1123 && Static310.anInt5449 == 0) {
								local1147 = Static446.aClass228_2.method5261(local406).method4845(Static426.aClass2_Sub20_Sub1_2);
								if (local259 == 2) {
									Static226.method3487(local1147, "<img=1>" + local603, "<img=1>" + local601, local406, 0, null, 25);
								} else if (local259 == 1) {
									Static226.method3487(local1147, "<img=0>" + local603, "<img=0>" + local601, local406, 0, null, 25);
								} else {
									Static226.method3487(local1147, local603, local601, local406, 0, null, 25);
								}
							}
							Static141.aClass81_59 = null;
							return true;
						}
						@Pc(1264) int local1264;
						if (Static141.aClass81_59 == Static94.aClass81_45) {
							local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
							local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
							local603 = local601;
							if (local597) {
								local603 = Static426.aClass2_Sub20_Sub1_2.method3717();
							}
							local613 = Static426.aClass2_Sub20_Sub1_2.method3711();
							local618 = Static426.aClass2_Sub20_Sub1_2.method3748();
							local1001 = Static426.aClass2_Sub20_Sub1_2.method3737();
							@Pc(1260) long local1260 = local618 + (local613 << 32);
							@Pc(1262) boolean local1262 = false;
							local1264 = 0;
							while (true) {
								if (local1264 >= 100) {
									if (local1001 <= 1) {
										if (Static217.aBoolean41 && !Static296.aBoolean462 || Static407.aBoolean597) {
											local1262 = true;
										} else if (Static170.method2636(local603)) {
											local1262 = true;
										}
									}
									break;
								}
								if (local1260 == Static330.aLongArray5[local1264]) {
									local1262 = true;
									break;
								}
								local1264++;
							}
							if (!local1262 && Static310.anInt5449 == 0) {
								Static330.aLongArray5[Static261.anInt5571] = local1260;
								Static261.anInt5571 = (Static261.anInt5571 + 1) % 100;
								@Pc(1321) String local1321 = Static273.method4070(Static26.method371(Static426.aClass2_Sub20_Sub1_2));
								if (local1001 == 2) {
									Static226.method3487(local1321, "<img=1>" + local603, "<img=1>" + local601, -1, 0, null, 7);
								} else if (local1001 == 1) {
									Static226.method3487(local1321, "<img=0>" + local603, "<img=0>" + local601, -1, 0, null, 7);
								} else {
									Static226.method3487(local1321, local603, local601, -1, 0, null, 3);
								}
							}
							Static141.aClass81_59 = null;
							return true;
						} else if (Static200.aClass81_196 == Static141.aClass81_59) {
							local73 = Static426.aClass2_Sub20_Sub1_2.method3731();
							local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
							local255 = Static426.aClass2_Sub20_Sub1_2.method3711();
							if (Static306.method4382(local255)) {
								Static326.method4679(local601, local73);
							}
							Static141.aClass81_59 = null;
							return true;
						} else if (Static289.aClass81_168 == Static141.aClass81_59) {
							Static203.method3162(Static48.aClass180_3);
							Static141.aClass81_59 = null;
							return true;
						} else if (Static141.aClass81_59 == Static430.aClass81_194) {
							local73 = Static426.aClass2_Sub20_Sub1_2.method3706();
							local223 = Static426.aClass2_Sub20_Sub1_2.method3746();
							local255 = Static426.aClass2_Sub20_Sub1_2.method3731();
							if (Static306.method4382(local73)) {
								Static356.method4996(local223, local255);
							}
							Static141.aClass81_59 = null;
							return true;
						} else if (Static141.aClass81_59 == Static412.aClass81_180) {
							Static203.method3162(Static72.aClass180_7);
							Static141.aClass81_59 = null;
							return true;
						} else if (Static82.aClass81_37 == Static141.aClass81_59) {
							local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
							local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
							@Pc(1481) Object[] local1481 = new Object[local601.length() + 1];
							for (local259 = local601.length() - 1; local259 >= 0; local259--) {
								if (local601.charAt(local259) == 's') {
									local1481[local259 + 1] = Static426.aClass2_Sub20_Sub1_2.method3717();
								} else {
									local1481[local259 + 1] = Integer.valueOf(Static426.aClass2_Sub20_Sub1_2.method3731());
								}
							}
							local1481[0] = Integer.valueOf(Static426.aClass2_Sub20_Sub1_2.method3731());
							if (Static306.method4382(local73)) {
								@Pc(1536) Class2_Sub14 local1536 = new Class2_Sub14();
								local1536.anObjectArray32 = local1481;
								Static290.method4227(local1536);
							}
							Static141.aClass81_59 = null;
							return true;
						} else {
							@Pc(1640) int local1640;
							@Pc(1792) int local1792;
							@Pc(1709) boolean local1709;
							if (Static141.aClass81_59 == Static22.aClass81_6) {
								local73 = Static426.aClass2_Sub20_Sub1_2.method3744();
								local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
								local255 = Static426.aClass2_Sub20_Sub1_2.method3739();
								local259 = Static426.aClass2_Sub20_Sub1_2.method3747();
								local406 = Static426.aClass2_Sub20_Sub1_2.method3706();
								local1123 = (local255 & 0x80) != 0;
								if (local259 >> 30 == 0) {
									@Pc(1733) Class77 local1733;
									@Pc(1752) Class46 local1752;
									@Pc(1789) Class46 local1789;
									@Pc(1738) Class77 local1738;
									@Pc(1758) Class46 local1758;
									if (local259 >> 29 != 0) {
										local995 = local259 & 0xFFFF;
										@Pc(1698) Class4_Sub2_Sub2_Sub2 local1698 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local995];
										if (local1698 != null) {
											if (local73 == 65535) {
												local73 = -1;
											}
											local1709 = true;
											local627 = local1123 ? local1698.anInt6509 : local1698.anInt6449;
											if (local73 != -1 && local627 != -1) {
												if (local627 == local73) {
													local1733 = Static137.aClass16_2.method251(local73);
													if (local1733.aBoolean191 && local1733.anInt2238 != -1) {
														local1789 = Static9.aClass194_1.method4371(local1733.anInt2238);
														local1792 = local1789.anInt1764;
														if (local1792 == 0 || local1792 == 2) {
															local1709 = false;
														} else if (local1792 == 1) {
															local1709 = true;
														}
													}
												} else {
													local1733 = Static137.aClass16_2.method251(local73);
													local1738 = Static137.aClass16_2.method251(local627);
													if (local1733.anInt2238 != -1 && local1738.anInt2238 != -1) {
														local1752 = Static9.aClass194_1.method4371(local1733.anInt2238);
														local1758 = Static9.aClass194_1.method4371(local1738.anInt2238);
														if (local1752.anInt1767 < local1758.anInt1767) {
															local1709 = false;
														}
													}
												}
											}
											if (local1709) {
												if (local1123) {
													local1698.anInt6459 = 0;
													local1698.anInt6491 = Static164.anInt3206 + local223;
													local1698.anInt6499 = 1;
													local1698.anInt6472 = local406;
													local1698.anInt6477 = 0;
													local1698.anInt6478 = local255 & 0x7;
													local1698.anInt6509 = local73;
													if (Static164.anInt3206 < local1698.anInt6491) {
														local1698.anInt6459 = -1;
													}
													if (local1698.anInt6509 != -1 && local1698.anInt6491 == Static164.anInt3206) {
														local1640 = Static137.aClass16_2.method251(local1698.anInt6509).anInt2238;
														if (local1640 != -1) {
															local1789 = Static9.aClass194_1.method4371(local1640);
															if (local1789 != null && local1789.anIntArray90 != null) {
																Static4.method137(local1789, 0, local1698.anInt7111, local1698.aByte92, local1698.anInt7117, false);
															}
														}
													}
												} else {
													local1698.anInt6480 = 0;
													local1698.anInt6449 = local73;
													local1698.anInt6467 = local406;
													local1698.anInt6521 = 1;
													local1698.anInt6515 = 0;
													local1698.anInt6493 = local255 & 0x7;
													local1698.anInt6488 = local223 + Static164.anInt3206;
													if (local1698.anInt6488 > Static164.anInt3206) {
														local1698.anInt6515 = -1;
													}
													if (local1698.anInt6449 != -1 && Static164.anInt3206 == local1698.anInt6488) {
														local1640 = Static137.aClass16_2.method251(local1698.anInt6449).anInt2238;
														if (local1640 != -1) {
															local1789 = Static9.aClass194_1.method4371(local1640);
															if (local1789 != null && local1789.anIntArray90 != null) {
																Static4.method137(local1789, 0, local1698.anInt7111, local1698.aByte92, local1698.anInt7117, false);
															}
														}
													}
												}
											}
										}
									} else if (local259 >> 28 != 0) {
										local995 = local259 & 0xFFFF;
										@Pc(1985) Class4_Sub2_Sub2_Sub1 local1985;
										if (Static393.anInt6881 == local995) {
											local1985 = Static231.aClass4_Sub2_Sub2_Sub1_2;
										} else {
											local1985 = Static129.aClass4_Sub2_Sub2_Sub1Array27[local995];
										}
										if (local1985 != null) {
											if (local73 == 65535) {
												local73 = -1;
											}
											local1709 = true;
											local627 = local1123 ? local1985.anInt6509 : local1985.anInt6449;
											if (local73 != -1 && local627 != -1) {
												if (local73 == local627) {
													local1733 = Static137.aClass16_2.method251(local73);
													if (local1733.aBoolean191 && local1733.anInt2238 != -1) {
														local1789 = Static9.aClass194_1.method4371(local1733.anInt2238);
														local1792 = local1789.anInt1764;
														if (local1792 == 0 || local1792 == 2) {
															local1709 = false;
														} else if (local1792 == 1) {
															local1709 = true;
														}
													}
												} else {
													local1733 = Static137.aClass16_2.method251(local73);
													local1738 = Static137.aClass16_2.method251(local627);
													if (local1733.anInt2238 != -1 && local1738.anInt2238 != -1) {
														local1752 = Static9.aClass194_1.method4371(local1733.anInt2238);
														local1758 = Static9.aClass194_1.method4371(local1738.anInt2238);
														if (local1752.anInt1767 < local1758.anInt1767) {
															local1709 = false;
														}
													}
												}
											}
											if (local1709) {
												if (local1123) {
													local1985.anInt6478 = local255 & 0x7;
													local1985.anInt6509 = local73;
													local1985.anInt6472 = local406;
													local1985.anInt6459 = 0;
													local1985.anInt6477 = 0;
													local1985.anInt6491 = Static164.anInt3206 + local223;
													local1985.anInt6499 = 1;
													if (local1985.anInt6491 > Static164.anInt3206) {
														local1985.anInt6459 = -1;
													}
													if (local1985.anInt6509 == 65535) {
														local1985.anInt6509 = -1;
													}
													if (local1985.anInt6509 != -1 && Static164.anInt3206 == local1985.anInt6491) {
														local1640 = Static137.aClass16_2.method251(local1985.anInt6509).anInt2238;
														if (local1640 != -1) {
															local1789 = Static9.aClass194_1.method4371(local1640);
															if (local1789 != null && local1789.anIntArray90 != null) {
																Static4.method137(local1789, 0, local1985.anInt7111, local1985.aByte92, local1985.anInt7117, local1985 == Static231.aClass4_Sub2_Sub2_Sub1_2);
															}
														}
													}
												} else {
													local1985.anInt6488 = local223 + Static164.anInt3206;
													local1985.anInt6493 = local255 & 0x7;
													local1985.anInt6467 = local406;
													local1985.anInt6521 = 1;
													local1985.anInt6515 = 0;
													local1985.anInt6480 = 0;
													local1985.anInt6449 = local73;
													if (local1985.anInt6449 == 65535) {
														local1985.anInt6449 = -1;
													}
													if (local1985.anInt6488 > Static164.anInt3206) {
														local1985.anInt6515 = -1;
													}
													if (local1985.anInt6449 != -1 && Static164.anInt3206 == local1985.anInt6488) {
														local1640 = Static137.aClass16_2.method251(local1985.anInt6449).anInt2238;
														if (local1640 != -1) {
															local1789 = Static9.aClass194_1.method4371(local1640);
															if (local1789 != null && local1789.anIntArray90 != null) {
																Static4.method137(local1789, 0, local1985.anInt7111, local1985.aByte92, local1985.anInt7117, local1985 == Static231.aClass4_Sub2_Sub2_Sub1_2);
															}
														}
													}
												}
											}
										}
									}
								} else {
									local995 = local259 >> 28 & 0x3;
									local1001 = (local259 >> 14 & 0x3FFF) - Static173.anInt3340;
									local1005 = (local259 & 0x3FFF) - Static379.anInt6721;
									if (local1001 >= 0 && local1005 >= 0 && Static81.anInt1950 > local1001 && Static171.anInt3288 > local1005) {
										local627 = local1001 * 128 + 64;
										local1640 = local1005 * 128 + 64;
										local1264 = local995;
										if (local995 < 3 && Static173.method2713(local1005, local1001)) {
											local1264 = local995 + 1;
										}
										@Pc(1677) Class4_Sub2_Sub6 local1677 = new Class4_Sub2_Sub6(local73, 0, Static164.anInt3206, local995, local1264, local627, Static66.method1200(local995, local627, local1640) - local406, local1640, local1001, local1001, local1005, local1005, local255);
										Static422.aClass265_51.method5999(new Class2_Sub2_Sub5(local1677));
									}
								}
								Static141.aClass81_59 = null;
								return true;
							} else if (Static141.aClass81_59 == Static382.aClass81_173) {
								Static203.method3162(Static452.aClass180_16);
								Static141.aClass81_59 = null;
								return true;
							} else {
								@Pc(2419) Class255 local2419;
								@Pc(2311) String local2311;
								if (Static420.aClass81_188 == Static141.aClass81_59) {
									local2311 = Static426.aClass2_Sub20_Sub1_2.method3717();
									local396 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
									if (local396) {
										local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
									} else {
										local601 = local2311;
									}
									local259 = Static426.aClass2_Sub20_Sub1_2.method3711();
									@Pc(2338) byte local2338 = Static426.aClass2_Sub20_Sub1_2.method3693();
									local1123 = false;
									if (local2338 == -128) {
										local1123 = true;
									}
									if (local1123) {
										if (Static82.anInt1991 == 0) {
											Static141.aClass81_59 = null;
											return true;
										}
										for (local995 = 0; local995 < Static82.anInt1991 && (!Static125.aClass255Array1[local995].aString63.equals(local601) || local259 != Static125.aClass255Array1[local995].anInt7373); local995++) {
										}
										if (local995 < Static82.anInt1991) {
											while (Static82.anInt1991 - 1 > local995) {
												Static125.aClass255Array1[local995] = Static125.aClass255Array1[local995 + 1];
												local995++;
											}
											Static82.anInt1991--;
											Static125.aClass255Array1[Static82.anInt1991] = null;
										}
									} else {
										local1147 = Static426.aClass2_Sub20_Sub1_2.method3717();
										local2419 = new Class255();
										local2419.aString63 = local601;
										local2419.aString64 = local2311;
										local2419.aString65 = Static384.method5331(local2419.aString63);
										local2419.aByte100 = local2338;
										local2419.anInt7373 = local259;
										local2419.aString66 = local1147;
										for (local1005 = Static82.anInt1991 - 1; local1005 >= 0; local1005--) {
											local627 = Static125.aClass255Array1[local1005].aString65.compareTo(local2419.aString65);
											if (local627 == 0) {
												Static125.aClass255Array1[local1005].anInt7373 = local259;
												Static125.aClass255Array1[local1005].aByte100 = local2338;
												Static125.aClass255Array1[local1005].aString66 = local1147;
												if (local601.equals(Static231.aClass4_Sub2_Sub2_Sub1_2.aString48)) {
													Static122.aByte19 = local2338;
												}
												Static117.anInt2361 = anInt5891;
												Static141.aClass81_59 = null;
												return true;
											}
											if (local627 < 0) {
												break;
											}
										}
										if (Static82.anInt1991 >= Static125.aClass255Array1.length) {
											Static141.aClass81_59 = null;
											return true;
										}
										for (local627 = Static82.anInt1991 - 1; local627 > local1005; local627--) {
											Static125.aClass255Array1[local627 + 1] = Static125.aClass255Array1[local627];
										}
										if (Static82.anInt1991 == 0) {
											Static125.aClass255Array1 = new Class255[100];
										}
										Static125.aClass255Array1[local1005 + 1] = local2419;
										Static82.anInt1991++;
										if (local601.equals(Static231.aClass4_Sub2_Sub2_Sub1_2.aString48)) {
											Static122.aByte19 = local2338;
										}
									}
									Static117.anInt2361 = anInt5891;
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static344.aClass81_153) {
									local2311 = Static426.aClass2_Sub20_Sub1_2.method3717();
									local223 = Static426.aClass2_Sub20_Sub1_2.method3706();
									local255 = Static426.aClass2_Sub20_Sub1_2.method3706();
									if (Static306.method4382(local223)) {
										Static288.method4217(local2311, local255);
									}
									Static141.aClass81_59 = null;
									return true;
								} else if (Static305.aClass81_23 == Static141.aClass81_59) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3744();
									if (local73 == 65535) {
										local73 = -1;
									}
									local223 = Static426.aClass2_Sub20_Sub1_2.method3706();
									local255 = Static426.aClass2_Sub20_Sub1_2.method3742();
									local259 = Static426.aClass2_Sub20_Sub1_2.method3731();
									if (Static306.method4382(local223)) {
										Static236.method3587(local255, local73, local259);
										@Pc(2619) Class30 local2619 = Static350.aClass149_2.method3483(local73);
										Static419.method5700(local2619.anInt1032, local2619.anInt1052, local2619.anInt1024, local259);
										Static115.method5070(local259, local2619.anInt1060, local2619.anInt1044, local2619.anInt1014);
									}
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static274.aClass81_122) {
									Static203.method3162(Static325.aClass180_12);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static183.aClass81_80) {
									local2311 = Static426.aClass2_Sub20_Sub1_2.method3717();
									local601 = Static273.method4070(Static26.method371(Static426.aClass2_Sub20_Sub1_2));
									Static187.method5442(local2311, 6, local2311, local601, 0);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static190.aClass81_85 == Static141.aClass81_59) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3744();
									local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
									local255 = Static426.aClass2_Sub20_Sub1_2.method3743();
									if (Static306.method4382(local223)) {
										Static105.method1628(local73, local255);
									}
									Static141.aClass81_59 = null;
									return true;
								} else if (Static308.aClass81_133 == Static141.aClass81_59) {
									Static203.method3162(Static43.aClass180_2);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static238.aClass81_108) {
									Static46.method879();
									Static141.aClass81_59 = null;
									return false;
								} else if (Static322.aClass81_143 == Static141.aClass81_59) {
									Static203.method3162(Static246.aClass180_10);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static315.aClass81_136 == Static141.aClass81_59) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
									if (local73 == 65535) {
										local73 = -1;
									}
									local223 = Static426.aClass2_Sub20_Sub1_2.method3737();
									local255 = Static426.aClass2_Sub20_Sub1_2.method3711();
									local259 = Static426.aClass2_Sub20_Sub1_2.method3737();
									Static404.method5495(local259, local223, local255, local73);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static57.aClass81_28) {
									Static203.method3162(Static26.aClass180_1);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static99.aClass81_32) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3731();
									Static440.aClass128_8 = Static303.aClass131_4.method3049(local73);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static420.aClass81_187 == Static141.aClass81_59) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
									local223 = Static426.aClass2_Sub20_Sub1_2.method3706();
									local255 = Static426.aClass2_Sub20_Sub1_2.method3742();
									local259 = Static426.aClass2_Sub20_Sub1_2.method3711();
									local406 = Static426.aClass2_Sub20_Sub1_2.method3732();
									if (Static306.method4382(local259)) {
										Static419.method5700(local223, local73, local406, local255);
									}
									Static141.aClass81_59 = null;
									return true;
								} else if (Static191.aClass81_86 == Static141.aClass81_59) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3743();
									local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
									if (Static306.method4382(local223)) {
										Static38.method720(0, Static393.anInt6881, local73, 5);
									}
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static261.aClass81_139) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3737();
									local223 = Static426.aClass2_Sub20_Sub1_2.method3744();
									if (local223 == 65535) {
										local223 = -1;
									}
									local255 = Static426.aClass2_Sub20_Sub1_2.method3739();
									Static242.method3662(local255, local73, local223);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static140.aClass81_202) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3686();
									local223 = Static426.aClass2_Sub20_Sub1_2.method3721();
									local255 = Static426.aClass2_Sub20_Sub1_2.method3732();
									if (local255 == 65535) {
										local255 = -1;
									}
									Static340.method4788(local73, local223, local255);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static102.aClass81_46 == Static141.aClass81_59) {
									Static309.method4417(Static426.aClass2_Sub20_Sub1_2, Static193.anInt3787);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static220.aClass81_100 == Static141.aClass81_59) {
									Static97.anInt2178 = Static426.aClass2_Sub20_Sub1_2.method3737();
									Static240.anInt4514 = Static426.aClass2_Sub20_Sub1_2.method3712() << 3;
									Static198.anInt3847 = Static426.aClass2_Sub20_Sub1_2.method3693() << 3;
									for (@Pc(2952) Class2_Sub21 local2952 = (Class2_Sub21) Static383.aClass240_34.method5438(); local2952 != null; local2952 = (Class2_Sub21) Static383.aClass240_34.method5436()) {
										local223 = (int) (local2952.aLong227 & 0x3FFFL);
										local255 = (int) (local2952.aLong227 >> 14 & 0x3FFFL);
										local259 = (int) (local2952.aLong227 >> 28 & 0x3L);
										if (local259 == Static97.anInt2178 && local223 >= Static198.anInt3847 && local223 < Static198.anInt3847 + 8 && Static240.anInt4514 <= local255 && local255 < Static240.anInt4514 + 8) {
											local2952.method6072();
											Static61.method1209(Static97.anInt2178, local223, local255);
										}
									}
									for (@Pc(3023) Class2_Sub10 local3023 = (Class2_Sub10) Static222.aClass265_32.method6005(); local3023 != null; local3023 = (Class2_Sub10) Static222.aClass265_32.method6001()) {
										if (Static198.anInt3847 <= local3023.anInt1383 && local3023.anInt1383 < Static198.anInt3847 + 8 && local3023.anInt1387 >= Static240.anInt4514 && Static240.anInt4514 + 8 > local3023.anInt1387 && local3023.anInt1381 == Static97.anInt2178) {
											local3023.anInt1376 = 0;
										}
									}
									Static141.aClass81_59 = null;
									return true;
								} else if (Static141.aClass81_59 == Static417.aClass81_183) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
									if (Static306.method4382(local73)) {
										Static209.method3224();
									}
									Static141.aClass81_59 = null;
									return true;
								} else if (Static382.aClass81_172 == Static141.aClass81_59) {
									local73 = Static426.aClass2_Sub20_Sub1_2.method3706();
									@Pc(3095) byte local3095 = Static426.aClass2_Sub20_Sub1_2.method3693();
									local255 = Static426.aClass2_Sub20_Sub1_2.method3732();
									if (Static306.method4382(local255)) {
										Static436.method5908(local73, local3095);
									}
									Static141.aClass81_59 = null;
									return true;
								} else if (Static168.aClass81_71 == Static141.aClass81_59) {
									@Pc(3118) byte local3118 = Static426.aClass2_Sub20_Sub1_2.method3712();
									local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
									Static215.aClass225_1.method5149(local223, local3118);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static429.aClass81_193 == Static141.aClass81_59) {
									Static141.aClass81_59 = null;
									Static337.anInt5964 = anInt5891;
									Static29.anInt626 = 1;
									return true;
								} else if (Static72.aClass81_77 == Static141.aClass81_59) {
									Static86.method1481(true);
									Static141.aClass81_59 = null;
									return true;
								} else if (Static38.aClass81_15 == Static141.aClass81_59) {
									Static84.method1477(Static426.aClass2_Sub20_Sub1_2.method3717());
									Static141.aClass81_59 = null;
									return true;
								} else if (Static196.aClass81_128 == Static141.aClass81_59) {
									Static203.method3162(Static401.aClass180_14);
									Static141.aClass81_59 = null;
									return true;
								} else {
									@Pc(3448) String local3448;
									@Pc(3210) boolean local3210;
									if (Static267.aClass81_120 == Static141.aClass81_59) {
										while (Static426.aClass2_Sub20_Sub1_2.anInt4608 < Static193.anInt3787) {
											local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
											local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
											local603 = Static426.aClass2_Sub20_Sub1_2.method3717();
											local259 = Static426.aClass2_Sub20_Sub1_2.method3711();
											local406 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local892 = "";
											local3210 = false;
											if (local259 > 0) {
												local892 = Static426.aClass2_Sub20_Sub1_2.method3717();
												local3210 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
											}
											for (local1001 = 0; local1001 < Static304.anInt5397; local1001++) {
												if (local597) {
													if (local603.equals(Static371.aStringArray36[local1001])) {
														Static371.aStringArray36[local1001] = local601;
														Static351.aStringArray32[local1001] = local603;
														local601 = null;
														break;
													}
												} else if (local601.equals(Static371.aStringArray36[local1001])) {
													if (Static350.anIntArray415[local1001] != local259) {
														Static350.anIntArray415[local1001] = local259;
														if (local259 > 0) {
															Static187.method5442("", 5, "", local601 + Static438.aClass256_162.method5720(Static272.anInt7537), 0);
														}
														if (local259 == 0) {
															Static187.method5442("", 5, "", local601 + Static369.aClass256_133.method5720(Static272.anInt7537), 0);
														}
													}
													Static351.aStringArray32[local1001] = local603;
													Static190.aStringArray16[local1001] = local892;
													Static49.anIntArray62[local1001] = local406;
													local601 = null;
													Static297.aBooleanArray40[local1001] = local3210;
													break;
												}
											}
											if (local601 != null && Static304.anInt5397 < 200) {
												Static371.aStringArray36[Static304.anInt5397] = local601;
												Static351.aStringArray32[Static304.anInt5397] = local603;
												Static350.anIntArray415[Static304.anInt5397] = local259;
												Static190.aStringArray16[Static304.anInt5397] = local892;
												Static49.anIntArray62[Static304.anInt5397] = local406;
												Static297.aBooleanArray40[Static304.anInt5397] = local3210;
												Static304.anInt5397++;
											}
										}
										Static337.anInt5964 = anInt5891;
										Static29.anInt626 = 2;
										local223 = Static304.anInt5397;
										while (local223 > 0) {
											local223--;
											local597 = true;
											for (local255 = 0; local255 < local223; local255++) {
												if (Static350.anIntArray415[local255] != Static62.anInt1710 && Static62.anInt1710 == Static350.anIntArray415[local255 + 1] || Static350.anIntArray415[local255] == 0 && Static350.anIntArray415[local255 + 1] != 0) {
													local259 = Static350.anIntArray415[local255];
													Static350.anIntArray415[local255] = Static350.anIntArray415[local255 + 1];
													Static350.anIntArray415[local255 + 1] = local259;
													local3448 = Static190.aStringArray16[local255];
													Static190.aStringArray16[local255] = Static190.aStringArray16[local255 + 1];
													Static190.aStringArray16[local255 + 1] = local3448;
													local892 = Static371.aStringArray36[local255];
													Static371.aStringArray36[local255] = Static371.aStringArray36[local255 + 1];
													Static371.aStringArray36[local255 + 1] = local892;
													local1147 = Static351.aStringArray32[local255];
													Static351.aStringArray32[local255] = Static351.aStringArray32[local255 + 1];
													Static351.aStringArray32[local255 + 1] = local1147;
													local1001 = Static49.anIntArray62[local255];
													Static49.anIntArray62[local255] = Static49.anIntArray62[local255 + 1];
													Static49.anIntArray62[local255 + 1] = local1001;
													local1709 = Static297.aBooleanArray40[local255];
													Static297.aBooleanArray40[local255] = Static297.aBooleanArray40[local255 + 1];
													Static297.aBooleanArray40[local255 + 1] = local1709;
													local597 = false;
												}
											}
											if (local597) {
												break;
											}
										}
										Static141.aClass81_59 = null;
										return true;
									} else if (Static319.aClass81_141 == Static141.aClass81_59) {
										Static97.anInt2178 = Static426.aClass2_Sub20_Sub1_2.method3739();
										Static240.anInt4514 = Static426.aClass2_Sub20_Sub1_2.method3730() << 3;
										Static198.anInt3847 = Static426.aClass2_Sub20_Sub1_2.method3693() << 3;
										while (Static193.anInt3787 > Static426.aClass2_Sub20_Sub1_2.anInt4608) {
											@Pc(3585) Class180 local3585 = Static231.method3534()[Static426.aClass2_Sub20_Sub1_2.method3737()];
											Static203.method3162(local3585);
										}
										Static141.aClass81_59 = null;
										return true;
									} else if (Static427.aClass81_192 == Static141.aClass81_59) {
										local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
										local223 = Static426.aClass2_Sub20_Sub1_2.method3743();
										local255 = Static426.aClass2_Sub20_Sub1_2.method3721();
										if (Static306.method4382(local73)) {
											Static402.method5469(local255, local223);
										}
										Static141.aClass81_59 = null;
										return true;
									} else if (Static301.aClass81_129 == Static141.aClass81_59) {
										Static203.method3162(Static444.aClass180_15);
										Static141.aClass81_59 = null;
										return true;
									} else if (Static141.aClass81_59 == Static141.aClass81_58) {
										local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
										local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
										local255 = Static426.aClass2_Sub20_Sub1_2.method3711();
										local259 = Static426.aClass2_Sub20_Sub1_2.method3711();
										if (Static306.method4382(local73) && Static450.aClass41ArrayArray2[local223] != null) {
											for (local406 = local255; local406 < local259; local406++) {
												local408 = Static426.aClass2_Sub20_Sub1_2.method3748();
												if (Static450.aClass41ArrayArray2[local223].length > local406 && Static450.aClass41ArrayArray2[local223][local406] != null) {
													Static450.aClass41ArrayArray2[local223][local406].anInt1676 = local408;
												}
											}
										}
										Static141.aClass81_59 = null;
										return true;
									} else if (Static141.aClass81_59 == Static53.aClass81_24) {
										Static416.anInt7259 = Static426.aClass2_Sub20_Sub1_2.method3737();
										Static141.aClass81_59 = null;
										return true;
									} else if (Static141.aClass81_59 == Static37.aClass81_14) {
										local2311 = Static426.aClass2_Sub20_Sub1_2.method3717();
										local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
										local603 = Static446.aClass228_2.method5261(local223).method4845(Static426.aClass2_Sub20_Sub1_2);
										Static226.method3487(local603, local2311, local2311, local223, 0, null, 19);
										Static141.aClass81_59 = null;
										return true;
									} else if (Static141.aClass81_59 == Static75.aClass81_34) {
										local73 = Static426.aClass2_Sub20_Sub1_2.method3742();
										local223 = Static426.aClass2_Sub20_Sub1_2.method3742();
										local255 = Static426.aClass2_Sub20_Sub1_2.method3732();
										local259 = Static426.aClass2_Sub20_Sub1_2.method3732();
										if (Static306.method4382(local255)) {
											Static38.method720(local223, local259, local73, 5);
										}
										Static141.aClass81_59 = null;
										return true;
									} else if (Static118.aClass81_51 == Static141.aClass81_59) {
										Static119.aClass90_9 = Static304.method4377(Static426.aClass2_Sub20_Sub1_2.method3737());
										Static141.aClass81_59 = null;
										return true;
									} else {
										@Pc(3839) long local3839;
										@Pc(3861) Class2_Sub15 local3861;
										@Pc(3845) Class2_Sub15 local3845;
										if (Static141.aClass81_59 == Static261.aClass81_138) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3747();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3732();
											if (local223 == 65535) {
												local223 = -1;
											}
											local255 = Static426.aClass2_Sub20_Sub1_2.method3744();
											local259 = Static426.aClass2_Sub20_Sub1_2.method3706();
											if (local259 == 65535) {
												local259 = -1;
											}
											local406 = Static426.aClass2_Sub20_Sub1_2.method3731();
											if (Static306.method4382(local255)) {
												for (local408 = local259; local408 <= local223; local408++) {
													local3839 = (long) local408 + ((long) local73 << 32);
													local3845 = (Class2_Sub15) Static350.aClass240_29.method5439(local3839);
													if (local3845 != null) {
														local3861 = new Class2_Sub15(local406, local3845.anInt2149);
														local3845.method6072();
													} else if (local408 == -1) {
														local3861 = new Class2_Sub15(local406, Static160.method2564(local73).aClass2_Sub15_1.anInt2149);
													} else {
														local3861 = new Class2_Sub15(local406, -1);
													}
													Static350.aClass240_29.method5430(local3839, local3861);
												}
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static45.aClass81_185 == Static141.aClass81_59) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3716();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3732();
											if (Static306.method4382(local223)) {
												Static338.anInt5982 = local73;
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static200.aClass81_197 == Static141.aClass81_59) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3706();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3744();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3711();
											if (Static306.method4382(local223)) {
												Static105.method1625(local255, local73);
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static77.aClass81_179 == Static141.aClass81_59) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
											if (local73 == 65535) {
												local73 = -1;
											}
											local223 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3711();
											local259 = Static426.aClass2_Sub20_Sub1_2.method3737();
											Static148.method2187(local259, local255, local73, local223);
											Static141.aClass81_59 = null;
											return true;
										} else if (Static39.aClass81_16 == Static141.aClass81_59) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3744();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3706();
											if (Static306.method4382(local73)) {
												if (local223 == 2) {
													Static340.method4785();
												}
												Static108.anInt2264 = local255;
												Static404.method5491(local255);
												Static264.method3971(false);
												Static290.method4231(Static108.anInt2264);
												for (local259 = 0; local259 < 100; local259++) {
													Static10.aBooleanArray5[local259] = true;
												}
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static233.aClass81_105 == Static141.aClass81_59) {
											local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
											local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
											local603 = local601;
											if (local597) {
												local603 = Static426.aClass2_Sub20_Sub1_2.method3717();
											}
											local613 = Static426.aClass2_Sub20_Sub1_2.method3719();
											local618 = Static426.aClass2_Sub20_Sub1_2.method3711();
											local623 = Static426.aClass2_Sub20_Sub1_2.method3748();
											local627 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local1640 = Static426.aClass2_Sub20_Sub1_2.method3711();
											@Pc(4087) long local4087 = (local618 << 32) + local623;
											@Pc(4089) boolean local4089 = false;
											@Pc(4091) int local4091 = 0;
											while (true) {
												if (local4091 >= 100) {
													if (local627 <= 1 && Static170.method2636(local603)) {
														local4089 = true;
													}
													break;
												}
												if (Static330.aLongArray5[local4091] == local4087) {
													local4089 = true;
													break;
												}
												local4091++;
											}
											if (!local4089 && Static310.anInt5449 == 0) {
												Static330.aLongArray5[Static261.anInt5571] = local4087;
												Static261.anInt5571 = (Static261.anInt5571 + 1) % 100;
												@Pc(4149) String local4149 = Static446.aClass228_2.method5261(local1640).method4845(Static426.aClass2_Sub20_Sub1_2);
												if (local627 == 2) {
													Static226.method3487(local4149, "<img=1>" + local603, "<img=1>" + local601, local1640, 0, Static106.method1650(local613), 20);
												} else if (local627 == 1) {
													Static226.method3487(local4149, "<img=0>" + local603, "<img=0>" + local601, local1640, 0, Static106.method1650(local613), 20);
												} else {
													Static226.method3487(local4149, local603, local601, local1640, 0, Static106.method1650(local613), 20);
												}
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static453.aClass81_205 == Static141.aClass81_59) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3706();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3711();
											local259 = Static426.aClass2_Sub20_Sub1_2.method3743();
											local406 = Static426.aClass2_Sub20_Sub1_2.method3711();
											if (Static306.method4382(local406)) {
												Static38.method720(local223, local255 << 16 | local73, local259, 7);
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static315.aClass81_137) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local259 = Static426.aClass2_Sub20_Sub1_2.method3711() << 0;
											local406 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local408 = Static426.aClass2_Sub20_Sub1_2.method3737();
											if (Static306.method4382(local73)) {
												Static159.method2510(local408, local255, local259, local406, local223);
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static3.aClass81_3) {
											Static293.method4558();
											Static141.aClass81_59 = null;
											return false;
										} else if (Static141.aClass81_59 == Static170.aClass81_72) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local259 = Static426.aClass2_Sub20_Sub1_2.method3711() << 0;
											local406 = Static426.aClass2_Sub20_Sub1_2.method3737();
											local408 = Static426.aClass2_Sub20_Sub1_2.method3737();
											if (Static306.method4382(local73)) {
												Static174.method2735(local255, true, local406, local223, local259, local408);
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static142.aClass81_60) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3731();
											if (Static306.method4382(local73)) {
												@Pc(4383) Class2_Sub25 local4383 = (Class2_Sub25) Static398.aClass240_27.method5439((long) local223);
												if (local4383 != null) {
													Static419.method5701(local4383, false, true);
												}
												if (Static351.aClass41_13 != null) {
													Static168.method2616(Static351.aClass41_13);
													Static351.aClass41_13 = null;
												}
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static308.aClass81_132) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3731();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3744();
											if (local223 == 65535) {
												local223 = -1;
											}
											local255 = Static426.aClass2_Sub20_Sub1_2.method3744();
											if (Static306.method4382(local255)) {
												Static38.method720(-1, local223, local73, 2);
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static182.aClass81_200) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3744();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3721();
											local396 = (local223 & 0x1) == 1;
											Static30.method5453(local73, local396);
											Static52.anIntArray502[Static422.anInt7370++ & 0x1F] = local73;
											Static141.aClass81_59 = null;
											return true;
										} else if (Static93.aClass81_43 == Static141.aClass81_59) {
											Static203.method3162(Static389.aClass180_13);
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static57.aClass81_27) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3735();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3742();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3732();
											local259 = Static426.aClass2_Sub20_Sub1_2.method3701();
											if (Static306.method4382(local255)) {
												Static409.method5550(local223, local73, local259);
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static184.aClass81_82 == Static141.aClass81_59) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3732();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3743();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3711();
											if (local255 == 65535) {
												local255 = -1;
											}
											if (Static306.method4382(local73)) {
												Static402.method5474(local255, local223);
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static307.aClass81_131 == Static141.aClass81_59) {
											Static182.anInt7663 = Static426.aClass2_Sub20_Sub1_2.method3711() * 30;
											Static141.aClass81_59 = null;
											Static432.anInt7520 = anInt5891;
											return true;
										} else if (Static346.aClass81_154 == Static141.aClass81_59) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3706();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3721();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3732();
											@Pc(4583) Class4_Sub2_Sub2_Sub2 local4583 = Static4.aClass4_Sub2_Sub2_Sub2Array1[local73];
											if (local4583 != null) {
												Static305.method982(local223, local4583, local255);
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static237.aClass81_110) {
											Static52.aString69 = Static193.anInt3787 > 2 ? Static426.aClass2_Sub20_Sub1_2.method3717() : Static420.aClass256_156.method5720(Static272.anInt7537);
											Static22.anInt468 = Static193.anInt3787 <= 0 ? -1 : Static426.aClass2_Sub20_Sub1_2.method3711();
											if (Static22.anInt468 == 65535) {
												Static22.anInt468 = -1;
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static266.aClass81_117 == Static141.aClass81_59) {
											if (Static140.aFrame12 != null) {
												Static168.method2626(false, -1, -1, Static399.aClass167_Sub1_1.anInt5557);
											}
											@Pc(4643) byte[] local4643 = new byte[Static193.anInt3787];
											Static426.aClass2_Sub20_Sub1_2.method2508(Static193.anInt3787, local4643);
											local601 = Static142.method2021(Static193.anInt3787, 0, local4643);
											Static448.method6065(true, Static281.anInt5126 == 1, local601, Static303.aClass131_4);
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static82.aClass81_36) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3732();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3742();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3706();
											local259 = Static426.aClass2_Sub20_Sub1_2.method3711();
											if (Static306.method4382(local259)) {
												Static28.method389(local223, local255 + (local73 << 16));
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static451.aClass81_30) {
											for (local73 = 0; local73 < Static129.aClass4_Sub2_Sub2_Sub1Array27.length; local73++) {
												if (Static129.aClass4_Sub2_Sub2_Sub1Array27[local73] != null) {
													Static129.aClass4_Sub2_Sub2_Sub1Array27[local73].anInt6469 = -1;
												}
											}
											for (local223 = 0; local223 < Static4.aClass4_Sub2_Sub2_Sub2Array1.length; local223++) {
												if (Static4.aClass4_Sub2_Sub2_Sub2Array1[local223] != null) {
													Static4.aClass4_Sub2_Sub2_Sub2Array1[local223].anInt6469 = -1;
												}
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static141.aClass81_59 == Static184.aClass81_81) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3739();
											local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3744();
											if (local255 == 65535) {
												local255 = -1;
											}
											local259 = Static426.aClass2_Sub20_Sub1_2.method3716();
											if (local259 >= 1 && local259 <= 8) {
												if (local601.equalsIgnoreCase("null")) {
													local601 = null;
												}
												Static39.aStringArray1[local259 - 1] = local601;
												Static4.anIntArray4[local259 - 1] = local255;
												Static405.aBooleanArray49[local259 - 1] = local73 == 0;
											}
											Static141.aClass81_59 = null;
											return true;
										} else if (Static237.aClass81_109 == Static141.aClass81_59) {
											Static203.method3162(Static106.aClass180_5);
											Static141.aClass81_59 = null;
											return true;
										} else if (Static225.aClass81_104 == Static141.aClass81_59) {
											Static215.aClass225_1.method5148();
											Static141.aClass81_59 = null;
											Static358.anInt6319 += 32;
											return true;
										} else if (Static323.aClass81_144 == Static141.aClass81_59) {
											local73 = Static426.aClass2_Sub20_Sub1_2.method3721();
											local223 = Static426.aClass2_Sub20_Sub1_2.method3747();
											local255 = Static426.aClass2_Sub20_Sub1_2.method3739();
											Static172.anIntArray221[local255] = local223;
											Static287.anIntArray348[local255] = local73;
											Static253.anIntArray324[local255] = 1;
											local259 = Static147.anIntArray310[local255] - 1;
											for (local406 = 0; local406 < local259; local406++) {
												if (local223 >= Class190.anIntArray356[local406]) {
													Static253.anIntArray324[local255] = local406 + 2;
												}
											}
											Static196.anIntArray358[Static65.anInt7829++ & 0x1F] = local255;
											Static141.aClass81_59 = null;
											return true;
										} else {
											@Pc(4932) String local4932;
											if (Static154.aClass81_65 == Static141.aClass81_59) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3698();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3731();
												local255 = Static426.aClass2_Sub20_Sub1_2.method3737();
												local4932 = "";
												local3448 = local4932;
												if ((local255 & 0x1) != 0) {
													local4932 = Static426.aClass2_Sub20_Sub1_2.method3717();
													if ((local255 & 0x2) == 0) {
														local3448 = local4932;
													} else {
														local3448 = Static426.aClass2_Sub20_Sub1_2.method3717();
													}
												}
												local892 = Static426.aClass2_Sub20_Sub1_2.method3717();
												if (local73 == 99) {
													Static190.method3004(local892);
												} else if (local3448.equals("") || !Static170.method2636(local3448)) {
													Static187.method5442(local4932, local73, local3448, local892, local223);
												} else {
													Static141.aClass81_59 = null;
													return true;
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static306.aClass81_130 == Static141.aClass81_59) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3744();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
												local255 = Static426.aClass2_Sub20_Sub1_2.method3747();
												if (Static306.method4382(local223)) {
													Static434.method5869(local255, local73);
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static317.aClass81_140) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3742();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
												if (Static306.method4382(local223)) {
													Static38.method720(-1, -1, local73, 3);
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static171.aClass81_74) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3737();
												@Pc(5060) boolean local5060 = (local73 & 0x1) == 1;
												local603 = Static426.aClass2_Sub20_Sub1_2.method3717();
												local4932 = Static426.aClass2_Sub20_Sub1_2.method3717();
												if (local4932.equals("")) {
													local4932 = local603;
												}
												local3448 = Static426.aClass2_Sub20_Sub1_2.method3717();
												local892 = Static426.aClass2_Sub20_Sub1_2.method3717();
												if (local892.equals("")) {
													local892 = local3448;
												}
												if (local5060) {
													for (local995 = 0; local995 < Static220.anInt4206; local995++) {
														if (Static432.aStringArray43[local995].equals(local892)) {
															Static74.aStringArray8[local995] = local603;
															Static432.aStringArray43[local995] = local4932;
															Static203.aStringArray17[local995] = local3448;
															Static306.aStringArray29[local995] = local892;
															break;
														}
													}
												} else {
													Static74.aStringArray8[Static220.anInt4206] = local603;
													Static432.aStringArray43[Static220.anInt4206] = local4932;
													Static203.aStringArray17[Static220.anInt4206] = local3448;
													Static306.aStringArray29[Static220.anInt4206] = local892;
													Static100.aBooleanArray53[Static220.anInt4206] = (local73 & 0x2) == 2;
													Static220.anInt4206++;
												}
												Static141.aClass81_59 = null;
												Static337.anInt5964 = anInt5891;
												return true;
											} else if (Static266.aClass81_118 == Static141.aClass81_59) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3737();
												local396 = (local223 & 0x1) == 1;
												Static235.method3565(local73, local396);
												local259 = Static426.aClass2_Sub20_Sub1_2.method3711();
												for (local406 = 0; local406 < local259; local406++) {
													local408 = Static426.aClass2_Sub20_Sub1_2.method3711();
													local995 = Static426.aClass2_Sub20_Sub1_2.method3716();
													if (local995 == 255) {
														local995 = Static426.aClass2_Sub20_Sub1_2.method3747();
													}
													Static176.method2773(local408 - 1, local73, local995, local406, local396);
												}
												Static52.anIntArray502[Static422.anInt7370++ & 0x1F] = local73;
												Static141.aClass81_59 = null;
												return true;
											} else if (Static384.aClass81_174 == Static141.aClass81_59) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3706();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
												local255 = Static426.aClass2_Sub20_Sub1_2.method3747();
												if (Static306.method4382(local223)) {
													Static436.method5908(local73, local255);
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static345.aClass81_99) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3732();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3739();
												Static215.aClass225_1.method5153(local73, local223);
												Static141.aClass81_59 = null;
												return true;
											} else if (Static433.aClass81_195 == Static141.aClass81_59) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3747();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3706();
												local255 = Static426.aClass2_Sub20_Sub1_2.method3744();
												if (local255 == 65535) {
													local255 = -1;
												}
												if (Static306.method4382(local223)) {
													Static38.method720(-1, local255, local73, 1);
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static105.aClass81_47) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3737();
												local223 = local73 >> 5;
												local255 = local73 & 0x1F;
												if (local255 == 0) {
													Static2.aClass233Array1[local223] = null;
													Static141.aClass81_59 = null;
													return true;
												}
												@Pc(5358) Class233 local5358 = new Class233();
												local5358.anInt6828 = local255;
												local5358.anInt6825 = Static426.aClass2_Sub20_Sub1_2.method3737();
												if (local5358.anInt6825 >= 0 && local5358.anInt6825 < Static76.aClass76Array8.length) {
													if (local5358.anInt6828 == 1 || local5358.anInt6828 == 10) {
														local5358.anInt6821 = Static426.aClass2_Sub20_Sub1_2.method3711();
														Static426.aClass2_Sub20_Sub1_2.anInt4608 += 6;
													} else if (local5358.anInt6828 >= 2 && local5358.anInt6828 <= 6) {
														if (local5358.anInt6828 == 2) {
															local5358.anInt6829 = 64;
															local5358.anInt6824 = 64;
														}
														if (local5358.anInt6828 == 3) {
															local5358.anInt6824 = 64;
															local5358.anInt6829 = 0;
														}
														if (local5358.anInt6828 == 4) {
															local5358.anInt6824 = 64;
															local5358.anInt6829 = 128;
														}
														if (local5358.anInt6828 == 5) {
															local5358.anInt6829 = 64;
															local5358.anInt6824 = 0;
														}
														if (local5358.anInt6828 == 6) {
															local5358.anInt6824 = 128;
															local5358.anInt6829 = 64;
														}
														local5358.anInt6828 = 2;
														local5358.anInt6830 = Static426.aClass2_Sub20_Sub1_2.method3737();
														local5358.anInt6829 += Static426.aClass2_Sub20_Sub1_2.method3711() - Static173.anInt3340 << 7;
														local5358.anInt6824 += Static426.aClass2_Sub20_Sub1_2.method3711() - Static379.anInt6721 << 7;
														local5358.anInt6822 = Static426.aClass2_Sub20_Sub1_2.method3737();
														local5358.anInt6826 = Static426.aClass2_Sub20_Sub1_2.method3711();
													}
													local5358.anInt6827 = Static426.aClass2_Sub20_Sub1_2.method3711();
													if (local5358.anInt6827 == 65535) {
														local5358.anInt6827 = -1;
													}
													Static2.aClass233Array1[local223] = local5358;
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static254.aClass81_176) {
												Static117.anInt2361 = anInt5891;
												if (Static193.anInt3787 == 0) {
													Static89.aString17 = null;
													Static125.aClass255Array1 = null;
													Static209.aString34 = null;
													Static141.aClass81_59 = null;
													Static82.anInt1991 = 0;
													return true;
												}
												Static209.aString34 = Static426.aClass2_Sub20_Sub1_2.method3717();
												local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
												if (local597) {
													Static426.aClass2_Sub20_Sub1_2.method3717();
												}
												@Pc(5577) long local5577 = Static426.aClass2_Sub20_Sub1_2.method3719();
												Static89.aString17 = Static395.method5429(local5577);
												Static182.aByte104 = Static426.aClass2_Sub20_Sub1_2.method3693();
												local259 = Static426.aClass2_Sub20_Sub1_2.method3737();
												if (local259 == 255) {
													Static141.aClass81_59 = null;
													return true;
												}
												Static82.anInt1991 = local259;
												@Pc(5601) Class255[] local5601 = new Class255[100];
												for (local408 = 0; local408 < Static82.anInt1991; local408++) {
													local5601[local408] = new Class255();
													local5601[local408].aString64 = Static426.aClass2_Sub20_Sub1_2.method3717();
													local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
													if (local597) {
														local5601[local408].aString63 = Static426.aClass2_Sub20_Sub1_2.method3717();
													} else {
														local5601[local408].aString63 = local5601[local408].aString64;
													}
													local5601[local408].aString65 = Static384.method5331(local5601[local408].aString63);
													local5601[local408].anInt7373 = Static426.aClass2_Sub20_Sub1_2.method3711();
													local5601[local408].aByte100 = Static426.aClass2_Sub20_Sub1_2.method3693();
													local5601[local408].aString66 = Static426.aClass2_Sub20_Sub1_2.method3717();
													if (local5601[local408].aString63.equals(Static231.aClass4_Sub2_Sub2_Sub1_2.aString48)) {
														Static122.aByte19 = local5601[local408].aByte100;
													}
												}
												local1005 = Static82.anInt1991;
												while (local1005 > 0) {
													local3210 = true;
													local1005--;
													for (local627 = 0; local627 < local1005; local627++) {
														if (local5601[local627].aString65.compareTo(local5601[local627 + 1].aString65) > 0) {
															local2419 = local5601[local627];
															local5601[local627] = local5601[local627 + 1];
															local5601[local627 + 1] = local2419;
															local3210 = false;
														}
													}
													if (local3210) {
														break;
													}
												}
												Static125.aClass255Array1 = local5601;
												Static141.aClass81_59 = null;
												return true;
											} else if (Static320.aClass81_203 == Static141.aClass81_59) {
												Static121.method1759();
												Static141.aClass81_59 = null;
												return true;
											} else if (Static27.aClass81_171 == Static141.aClass81_59) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3747();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3711();
												Static215.aClass225_1.method5153(local223, local73);
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static170.aClass81_73) {
												Static203.method3162(Static120.aClass180_6);
												Static141.aClass81_59 = null;
												return true;
											} else if (Static362.aClass81_161 == Static141.aClass81_59) {
												Static89.method1492();
												Static141.aClass81_59 = null;
												return false;
											} else if (Static449.aClass81_57 == Static141.aClass81_59) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3706();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3744();
												if (local223 == 65535) {
													local223 = -1;
												}
												local255 = Static426.aClass2_Sub20_Sub1_2.method3732();
												local259 = Static426.aClass2_Sub20_Sub1_2.method3711();
												if (local259 == 65535) {
													local259 = -1;
												}
												local406 = Static426.aClass2_Sub20_Sub1_2.method3747();
												if (Static306.method4382(local255)) {
													for (local408 = local223; local408 <= local259; local408++) {
														local3839 = ((long) local406 << 32) + ((long) local408);
														local3845 = (Class2_Sub15) Static350.aClass240_29.method5439(local3839);
														if (local3845 != null) {
															local3861 = new Class2_Sub15(local3845.anInt2146, local73);
															local3845.method6072();
														} else if (local408 == -1) {
															local3861 = new Class2_Sub15(Static160.method2564(local406).aClass2_Sub15_1.anInt2146, local73);
														} else {
															local3861 = new Class2_Sub15(0, local73);
														}
														Static350.aClass240_29.method5430(local3839, local3861);
													}
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static93.aClass81_44 == Static141.aClass81_59) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3706();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3742();
												local255 = Static426.aClass2_Sub20_Sub1_2.method3706();
												if (Static306.method4382(local73)) {
													Static382.method5309(local255, local223);
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static116.aClass81_50) {
												Static220.anInt4206 = Static426.aClass2_Sub20_Sub1_2.method3737();
												for (local73 = 0; local73 < Static220.anInt4206; local73++) {
													Static74.aStringArray8[local73] = Static426.aClass2_Sub20_Sub1_2.method3717();
													Static432.aStringArray43[local73] = Static426.aClass2_Sub20_Sub1_2.method3717();
													if (Static432.aStringArray43[local73].equals("")) {
														Static432.aStringArray43[local73] = Static74.aStringArray8[local73];
													}
													Static203.aStringArray17[local73] = Static426.aClass2_Sub20_Sub1_2.method3717();
													Static306.aStringArray29[local73] = Static426.aClass2_Sub20_Sub1_2.method3717();
													if (Static306.aStringArray29[local73].equals("")) {
														Static306.aStringArray29[local73] = Static203.aStringArray17[local73];
													}
													Static100.aBooleanArray53[local73] = false;
												}
												Static337.anInt5964 = anInt5891;
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static342.aClass81_151) {
												local73 = Static426.aClass2_Sub20_Sub1_2.method3711();
												local223 = Static426.aClass2_Sub20_Sub1_2.method3737();
												local255 = Static426.aClass2_Sub20_Sub1_2.method3737();
												local259 = Static426.aClass2_Sub20_Sub1_2.method3737();
												local406 = Static426.aClass2_Sub20_Sub1_2.method3737();
												local408 = Static426.aClass2_Sub20_Sub1_2.method3711();
												if (Static306.method4382(local73)) {
													Static125.aBooleanArray17[local223] = true;
													Static12.anIntArray15[local223] = local255;
													Static432.anIntArray503[local223] = local259;
													Static60.anIntArray82[local223] = local406;
													Static38.anIntArray45[local223] = local408;
												}
												Static141.aClass81_59 = null;
												return true;
											} else if (Static141.aClass81_59 == Static87.aClass81_40) {
												Static385.anInt6819 = Static426.aClass2_Sub20_Sub1_2.method3721();
												Static444.anInt7747 = Static426.aClass2_Sub20_Sub1_2.method3739();
												Static141.aClass81_59 = null;
												return true;
											} else if (Static339.aClass81_150 == Static141.aClass81_59) {
												local597 = Static426.aClass2_Sub20_Sub1_2.method3737() == 1;
												local601 = Static426.aClass2_Sub20_Sub1_2.method3717();
												local603 = local601;
												if (local597) {
													local603 = Static426.aClass2_Sub20_Sub1_2.method3717();
												}
												local613 = Static426.aClass2_Sub20_Sub1_2.method3711();
												local618 = Static426.aClass2_Sub20_Sub1_2.method3748();
												local1001 = Static426.aClass2_Sub20_Sub1_2.method3737();
												local1005 = Static426.aClass2_Sub20_Sub1_2.method3711();
												@Pc(6137) long local6137 = (local613 << 32) + local618;
												@Pc(6139) boolean local6139 = false;
												local1792 = 0;
												while (true) {
													if (local1792 >= 100) {
														if (local1001 <= 1 && Static170.method2636(local603)) {
															local6139 = true;
														}
														break;
													}
													if (local6137 == Static330.aLongArray5[local1792]) {
														local6139 = true;
														break;
													}
													local1792++;
												}
												if (!local6139 && Static310.anInt5449 == 0) {
													Static330.aLongArray5[Static261.anInt5571] = local6137;
													Static261.anInt5571 = (Static261.anInt5571 + 1) % 100;
													@Pc(6195) String local6195 = Static446.aClass228_2.method5261(local1005).method4845(Static426.aClass2_Sub20_Sub1_2);
													if (local1001 == 2) {
														Static226.method3487(local6195, "<img=1>" + local603, "<img=1>" + local601, local1005, 0, null, 18);
													} else if (local1001 == 1) {
														Static226.method3487(local6195, "<img=0>" + local603, "<img=0>" + local601, local1005, 0, null, 18);
													} else {
														Static226.method3487(local6195, local603, local601, local1005, 0, null, 18);
													}
												}
												Static141.aClass81_59 = null;
												return true;
											} else {
												Static80.method1410(null, "T1 - " + (Static141.aClass81_59 == null ? -1 : Static141.aClass81_59.method1697()) + "," + (Static356.aClass81_160 == null ? -1 : Static356.aClass81_160.method1697()) + "," + (Static106.aClass81_49 == null ? -1 : Static106.aClass81_49.method1697()) + " - " + Static193.anInt3787);
												Static89.method1492();
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
