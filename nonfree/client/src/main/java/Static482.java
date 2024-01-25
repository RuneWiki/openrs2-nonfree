import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static482 {

	@OriginalMember(owner = "client!qea", name = "z", descriptor = "Lclient!od;")
	public static Class3_Sub6_Sub16 aClass3_Sub6_Sub16_3;

	@OriginalMember(owner = "client!qea", name = "a", descriptor = "([IB[I[ILclient!wda;)V")
	public static void method6861(@OriginalArg(0) int[] arg0, @OriginalArg(2) int[] arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) Class23_Sub2_Sub1_Sub2_Sub2 arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg1[local3];
			@Pc(17) int local17 = arg0[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && local19 < arg3.aClass140Array3.length; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg3.aClass140Array3[local19] = null;
					} else {
						@Pc(36) Class48 local36 = Static483.aClass373_2.method8323(local9);
						@Pc(39) int local39 = local36.anInt1546;
						@Pc(44) Class140 local44 = arg3.aClass140Array3[local19];
						if (local44 != null) {
							if (local9 == local44.anInt3493) {
								if (local39 == 0) {
									local44 = arg3.aClass140Array3[local19] = null;
								} else if (local39 == 1) {
									local44.anInt3496 = 0;
									local44.anInt3492 = 0;
									local44.anInt3495 = local17;
									local44.anInt3497 = 1;
									local44.anInt3494 = 0;
									if (!arg3.aBoolean747) {
										Static4.method49(arg3, local36, 0);
									}
								} else if (local39 == 2) {
									local44.anInt3496 = 0;
								}
							} else if (local36.anInt1550 >= Static483.aClass373_2.method8323(local44.anInt3493).anInt1550) {
								local44 = arg3.aClass140Array3[local19] = null;
							}
						}
						if (local44 == null) {
							local44 = arg3.aClass140Array3[local19] = new Class140();
							local44.anInt3495 = local17;
							local44.anInt3496 = 0;
							local44.anInt3493 = local9;
							local44.anInt3494 = 0;
							local44.anInt3492 = 0;
							local44.anInt3497 = 1;
							if (!arg3.aBoolean747) {
								Static4.method49(arg3, local36, 0);
							}
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "(I)V")
	public static void method6862() {
		if (Static137.aClass370_1 != null) {
			Static12.aClass124_1 = new Class124();
			Static12.aClass124_1.method2769(Static137.aClass370_1.aClass335_65.method7694(Static319.anInt5939), Static137.aClass370_1, Static489.aLong243, Static137.aClass370_1.anInt9706);
			Static359.aThread3 = new Thread(Static12.aClass124_1, "");
			Static359.aThread3.start();
		}
	}

	@OriginalMember(owner = "client!qea", name = "c", descriptor = "(II)V")
	public static void method6863(@OriginalArg(1) int arg0) {
		if (Static520.anInt6836 == arg0) {
			return;
		}
		if (arg0 == 13) {
			if (Static573.aString114 == null) {
				Static351.method5277(Static33.aString9, Static558.anInt8991, Static69.aString16);
			} else {
				Static399.method4478(Static558.anInt8991);
			}
		}
		if (arg0 != 13 && Static565.aClass160_6 != null) {
			Static565.aClass160_6.method3506();
			Static565.aClass160_6 = null;
		}
		if (arg0 == 3) {
			Static594.method7954(Static177.anInt3331 != Static277.anInt5201);
		}
		if (arg0 == 7) {
			Static675.method8724(Static360.anInt6421 != Static277.anInt5201);
		}
		if (arg0 == 5) {
			if (Static573.aString114 == null) {
				Static178.method2936(Static69.aString16, Static33.aString9);
			} else {
				Static430.method6356();
			}
		} else if (arg0 == 6) {
			if (Static573.aString114 == null) {
				Static351.method5277(Static33.aString9, Static558.anInt8991, Static69.aString16);
			} else {
				Static399.method4478(Static558.anInt8991);
			}
		} else if (arg0 == 9) {
			if (Static573.aString114 == null) {
				Static351.method5277(Static33.aString9, Static558.anInt8991, Static69.aString16);
			} else {
				Static399.method4478(Static558.anInt8991);
			}
		} else if (arg0 == 12) {
			if (Static573.aString114 == null) {
				Static178.method2936(Static69.aString16, Static33.aString9);
			} else {
				Static430.method6356();
			}
		}
		if (Static305.method4700(Static520.anInt6836)) {
			Static346.aClass143_87.anInt3570 = 2;
			Static126.aClass143_32.anInt3570 = 2;
			Static423.aClass143_103.anInt3570 = 2;
			Static471.aClass143_144.anInt3570 = 2;
			Static160.aClass143_39.anInt3570 = 2;
			Static169.aClass143_42.anInt3570 = 2;
			Static272.aClass143_64.anInt3570 = 2;
		}
		if (Static305.method4700(arg0)) {
			Static493.anInt7679 = 0;
			Static647.anInt9954 = 1;
			Static251.anInt4681 = 1;
			Static587.anInt9293 = 0;
			Static8.anInt100 = 0;
			Static585.method7868(true);
			Static346.aClass143_87.anInt3570 = 1;
			Static126.aClass143_32.anInt3570 = 1;
			Static423.aClass143_103.anInt3570 = 1;
			Static471.aClass143_144.anInt3570 = 1;
			Static160.aClass143_39.anInt3570 = 1;
			Static169.aClass143_42.anInt3570 = 1;
			Static272.aClass143_64.anInt3570 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static48.method1278();
		}
		@Pc(226) boolean local226 = arg0 == 2 || Static649.method8507(arg0) || Static473.method6805(arg0);
		@Pc(241) boolean local241 = Static520.anInt6836 == 2 || Static649.method8507(Static520.anInt6836) || Static473.method6805(Static520.anInt6836);
		if (local226 != local241) {
			if (local226) {
				Static149.anInt2812 = Static251.anInt4688;
				if (Static227.aClass3_Sub15_11.aClass17_Sub3_3.method741() == 0) {
					Static186.method3006();
				} else {
					Static332.method5117(Static251.anInt4688, Static510.aClass143_118, Static227.aClass3_Sub15_11.aClass17_Sub3_3.method741());
					Static361.method5397();
				}
				Static600.aClass366_3.method8112(false);
			} else {
				Static186.method3006();
				Static600.aClass366_3.method8112(true);
			}
		}
		if (Static305.method4700(arg0) || arg0 == 13) {
			Static582.aClass16_12.method8167();
		}
		Static520.anInt6836 = arg0;
	}
}
