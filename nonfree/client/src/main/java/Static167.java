import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static167 {

	@OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
	public static int anInt3886 = -1;

	@OriginalMember(owner = "client!rd", name = "G", descriptor = "Lclient!i;")
	public static Class41 aClass41_1033 = Static184.method2923("leuchten3:");

	@OriginalMember(owner = "client!rd", name = "I", descriptor = "Lclient!i;")
	private static Class41 aClass41_1034 = Static184.method2923("Continue");

	@OriginalMember(owner = "client!rd", name = "K", descriptor = "Lclient!i;")
	public static Class41 aClass41_1035 = aClass41_1034;

	@OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V")
	public static void method2699() {
		if (Static135.aDouble10 > Static54.aDouble1) {
			Static54.aDouble1 += Static54.aDouble1 / 30.0D;
			if (Static54.aDouble1 > Static135.aDouble10) {
				Static54.aDouble1 = Static135.aDouble10;
			}
			Static217.method3296();
		} else if (Static135.aDouble10 < Static54.aDouble1) {
			Static54.aDouble1 -= Static54.aDouble1 / 30.0D;
			if (Static135.aDouble10 > Static54.aDouble1) {
				Static54.aDouble1 = Static135.aDouble10;
			}
			Static217.method3296();
		}
		if (anInt3886 == -1 || Static32.anInt850 == -1) {
			return;
		}
		@Pc(61) int local61 = anInt3886 - Static111.anInt2664;
		if (local61 < 2 || local61 > 2) {
			local61 >>= 0x4;
		}
		@Pc(78) int local78 = Static32.anInt850 - Static142.anInt3263;
		if (local78 < 2 || local78 > 2) {
			local78 >>= 0x4;
		}
		Static142.anInt3263 += local78;
		Static111.anInt2664 += local61;
		if (local61 == 0 && local78 == 0) {
			anInt3886 = -1;
			Static32.anInt850 = -1;
		}
		Static217.method3296();
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(BLclient!nb;Lclient!nb;)V")
	public static void method2700(@OriginalArg(1) Class15 arg0, @OriginalArg(2) Class15 arg1) {
		Static56.aClass15_12 = arg0;
		Static59.aClass15_14 = arg1;
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(ZLclient!nb;Lclient!dg;Lclient!nb;B)V")
	public static void method2702(@OriginalArg(0) boolean arg0, @OriginalArg(1) Class15 arg1, @OriginalArg(2) Class2_Sub2_Sub4_Sub1_Sub1 arg2, @OriginalArg(3) Class15 arg3) {
		Static141.aClass15_30 = arg3;
		Static127.aBoolean163 = arg0;
		Static209.aClass15_40 = arg1;
		@Pc(19) int local19 = Static209.aClass15_40.method388() - 1;
		Static178.anInt4137 = local19 * 256 + Static209.aClass15_40.method390(local19);
		Static161.aClass2_Sub2_Sub4_Sub1_Sub1_2 = arg2;
	}

	@OriginalMember(owner = "client!rd", name = "e", descriptor = "(B)V")
	public static void method2703() {
		if (Static18.aClass41_119 == null) {
			return;
		}
		if (Static202.anInt1737 < 10) {
			if (!Static115.aClass15_Sub1_105.method402(Static18.aClass41_119)) {
				Static202.anInt1737 = Static115.aClass15_Sub1_105.method407(Static18.aClass41_119) / 10;
				return;
			}
			Static202.anInt1737 = 10;
		}
		if (Static202.anInt1737 == 10) {
			@Pc(40) Class2_Sub3 local40 = new Class2_Sub3(Static115.aClass15_Sub1_105.method410(Static18.aClass41_119, Static70.aClass41_573));
			@Pc(44) int local44 = local40.method163();
			@Pc(48) int local48 = local40.method163();
			@Pc(52) int local52 = local40.method163();
			@Pc(56) int local56 = local40.method163();
			@Pc(60) int local60 = local40.method163();
			@Pc(64) int local64 = local40.method163();
			Static105.anInt2549 = local48 * 64;
			Static15.anInt422 = local44 * 64;
			Static54.aDouble1 = 8.0D;
			Static135.aDouble10 = 8.0D;
			Static49.anIntArray133 = new int[Static136.anInt3155 + 1];
			Static40.anInt1214 = (local56 - local48) * 64 + 64;
			Static95.anInt2353 = (local52 + 1 - local44) * 64;
			@Pc(109) int local109 = Static168.anInt3899 + (Static213.aClass12_Sub3_Sub1_1.anInt3949 >> 7) - Static105.anInt2549;
			@Pc(119) int local119 = Static198.anInt4451 + (Static213.aClass12_Sub3_Sub1_1.anInt3961 >> 7) - Static15.anInt422;
			@Pc(128) int local128 = local119 + (int) (Math.random() * 10.0D) - 5;
			@Pc(137) int local137 = local109 + (int) (Math.random() * 10.0D) - 5;
			@Pc(141) int local141 = Static40.anInt1214 >> 6;
			@Pc(145) int local145 = Static95.anInt2353 >> 6;
			Static191.aByteArrayArrayArray11 = new byte[local145][local141][];
			Static6.aByteArrayArrayArray1 = new byte[local145][local141][];
			Static92.anIntArrayArrayArray11 = new int[local145][local141][];
			Static84.aByteArrayArrayArray4 = new byte[local145][local141][];
			Static195.aByteArrayArrayArray12 = new byte[local145][local141][];
			@Pc(169) int local169 = Static62.anInt1674 >> 1;
			Static103.aByteArrayArrayArray8 = new byte[local145][local141][];
			if (local128 >= 0 && local128 < Static95.anInt2353 && local137 >= 0 && Static40.anInt1214 > local137) {
				Static142.anInt3263 = Static40.anInt1214 - local137;
				Static111.anInt2664 = local128;
			} else {
				Static142.anInt3263 = Static105.anInt2549 + Static40.anInt1214 - local64 * 64;
				Static111.anInt2664 = local60 * 64 - Static15.anInt422;
			}
			@Pc(228) int local228 = Static193.anInt3917 >> 2 << 10;
			Static44.anIntArrayArrayArray6 = new int[local145][local141][];
			Static184.aByteArrayArrayArray10 = new byte[local145][local141][];
			for (@Pc(238) int local238 = 0; local238 < Static136.anInt3155; local238++) {
				@Pc(244) Class2_Sub2_Sub2 local244 = Static88.method1559(local238);
				if (local244 != null) {
					@Pc(249) int local249 = local244.anInt308;
					if (local249 >= 0 && !Static155.anInterface1_1.method1133(local249)) {
						local249 = -1;
					}
					@Pc(307) int local307;
					@Pc(270) int local270;
					@Pc(276) int local276;
					@Pc(300) int local300;
					if (local244.anInt312 >= 0) {
						local270 = local244.anInt312;
						local276 = local169 + (local270 & 0x7F);
						if (local276 < 0) {
							local276 = 0;
						} else if (local276 > 127) {
							local276 = 127;
						}
						local300 = (local270 & 0x380) + ((local270 + local228 & 0xFC00) + local276);
						local307 = Static155.anIntArray373[Static28.method540(96, local300)];
					} else if (local249 >= 0) {
						local307 = Static155.anIntArray373[Static28.method540(96, Static155.anInterface1_1.method1135(local249))];
					} else if (local244.anInt316 == -1) {
						local307 = -1;
					} else {
						local270 = local244.anInt316;
						local276 = local169 + (local270 & 0x7F);
						if (local276 < 0) {
							local276 = 0;
						} else if (local276 > 127) {
							local276 = 127;
						}
						local300 = (local270 & 0x380) + (local270 + local228 & 0xFC00) + local276;
						local307 = Static155.anIntArray373[Static28.method540(96, local300)];
					}
					Static49.anIntArray133[local238 + 1] = local307;
				}
			}
			Static202.anInt1737 = 20;
		} else if (Static202.anInt1737 == 20) {
			Static146.method2256(Static115.aClass15_Sub1_105.method410(Static18.aClass41_119, Static31.aClass41_217));
			Static202.anInt1737 = 30;
			Static94.method1639();
		} else if (Static202.anInt1737 == 30) {
			Static135.method2161(Static115.aClass15_Sub1_105.method410(Static18.aClass41_119, Static19.aClass41_121));
			Static202.anInt1737 = 50;
			Static94.method1639();
		} else if (Static202.anInt1737 == 50) {
			Static193.method2721(Static115.aClass15_Sub1_105.method410(Static18.aClass41_119, Static198.aClass41_1181));
			Static202.anInt1737 = 70;
			Static94.method1639();
		} else if (Static202.anInt1737 == 70) {
			Static128.method2082(Static115.aClass15_Sub1_105.method410(Static18.aClass41_119, Static152.aClass41_961));
			Static202.anInt1737 = 90;
			Static94.method1639();
		} else {
			Static79.method1452(Static115.aClass15_Sub1_105.method410(Static18.aClass41_119, Static23.aClass41_141));
			if (Static202.anInt1737 == 90) {
				Static11.aClass39_1 = new Class39(11, true, Static139.aCanvas1);
				Static104.aClass39_2 = new Class39(12, true, Static139.aCanvas1);
				Static209.aClass39_8 = new Class39(14, true, Static139.aCanvas1);
				Static173.aClass39_5 = new Class39(17, true, Static139.aCanvas1);
				Static150.aClass39_4 = new Class39(19, true, Static139.aCanvas1);
				Static149.aClass39_3 = new Class39(22, true, Static139.aCanvas1);
				Static205.aClass39_7 = new Class39(26, true, Static139.aCanvas1);
				Static201.aClass39_6 = new Class39(30, true, Static139.aCanvas1);
				Static202.anInt1737 = 100;
			}
			anInt3886 = -1;
			Static202.anInt1737 = 100;
			Static32.anInt850 = -1;
			Static94.method1639();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIII)Z")
	public static boolean method2704(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static212.method3258(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << 7;
			@Pc(14) int local14 = arg2 << 7;
			return Static91.method1600(local10 + 1, Static56.anIntArrayArrayArray7[arg0][arg1][arg2] + arg3, local14 + 1) && Static91.method1600(local10 + 128 - 1, Static56.anIntArrayArrayArray7[arg0][arg1 + 1][arg2] + arg3, local14 + 1) && Static91.method1600(local10 + 128 - 1, Static56.anIntArrayArrayArray7[arg0][arg1 + 1][arg2 + 1] + arg3, local14 + 128 - 1) && Static91.method1600(local10 + 1, Static56.anIntArrayArrayArray7[arg0][arg1][arg2 + 1] + arg3, local14 + 128 - 1);
		} else {
			return false;
		}
	}
}
