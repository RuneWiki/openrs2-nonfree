import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static542 {

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "I")
	public static int anInt9064;

	@OriginalMember(owner = "client!uu", name = "a", descriptor = "(Lclient!r;Lclient!fa;B)V")
	public static void method7397(@OriginalArg(0) Class134 arg0, @OriginalArg(1) Interface7 arg1) {
		if (Static226.aClass1_Sub6_Sub11_2 == null) {
			return;
		}
		if (Static271.anInt4778 < 10) {
			if (!Static226.aClass270_75.method5698(Static226.aClass1_Sub6_Sub11_2.aString66)) {
				Static271.anInt4778 = Static129.aClass270_30.method5693(Static226.aClass1_Sub6_Sub11_2.aString66) / 10;
				return;
			}
			Static99.method4653();
			Static271.anInt4778 = 10;
		}
		if (Static271.anInt4778 == 10) {
			Static226.anInt6317 = Static226.aClass1_Sub6_Sub11_2.anInt6664 >> 6 << 6;
			Static226.anInt6318 = Static226.aClass1_Sub6_Sub11_2.anInt6659 >> 6 << 6;
			Static226.anInt6314 = (Static226.aClass1_Sub6_Sub11_2.anInt6654 >> 6 << 6) + 64 - Static226.anInt6317;
			Static226.anInt6315 = (Static226.aClass1_Sub6_Sub11_2.anInt6660 >> 6 << 6) + 64 - Static226.anInt6318;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static226.aClass1_Sub6_Sub11_2.method5339(Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.aByte123, Static541.anInt9058 + (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9365 >> 9), (Static93.aClass8_Sub3_Sub3_Sub1_Sub1_1.anInt9370 >> 9) + Static116.anInt2289, local76)) {
				local80 = local76[2] - Static226.anInt6318;
				local78 = local76[1] - Static226.anInt6317;
			}
			if (!Static577.aBoolean744 && local78 >= 0 && local78 < Static226.anInt6314 && local80 >= 0 && local80 < Static226.anInt6315) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static197.anInt6246 = local80;
				Static71.anInt1407 = local78;
			} else if (Static577.anInt9508 == -1 || Static79.anInt1743 == -1) {
				Static226.aClass1_Sub6_Sub11_2.method5338(local76, Static226.aClass1_Sub6_Sub11_2.anInt6656 & 0x3FFF, Static226.aClass1_Sub6_Sub11_2.anInt6656 >> 14 & 0x3FFF);
				Static197.anInt6246 = local76[2] - Static226.anInt6318;
				Static71.anInt1407 = local76[1] - Static226.anInt6317;
			} else {
				Static226.aClass1_Sub6_Sub11_2.method5338(local76, Static79.anInt1743, Static577.anInt9508);
				if (local76 != null) {
					Static197.anInt6246 = local76[2] - Static226.anInt6318;
					Static71.anInt1407 = local76[1] - Static226.anInt6317;
				}
				Static79.anInt1743 = -1;
				Static577.anInt9508 = -1;
				Static577.aBoolean744 = false;
			}
			if (Static226.aClass1_Sub6_Sub11_2.anInt6657 == 37) {
				Static226.aFloat137 = 3.0F;
				Static226.aFloat136 = 3.0F;
			} else if (Static226.aClass1_Sub6_Sub11_2.anInt6657 == 50) {
				Static226.aFloat137 = 4.0F;
				Static226.aFloat136 = 4.0F;
			} else if (Static226.aClass1_Sub6_Sub11_2.anInt6657 == 75) {
				Static226.aFloat137 = 6.0F;
				Static226.aFloat136 = 6.0F;
			} else if (Static226.aClass1_Sub6_Sub11_2.anInt6657 == 100) {
				Static226.aFloat137 = 8.0F;
				Static226.aFloat136 = 8.0F;
			} else if (Static226.aClass1_Sub6_Sub11_2.anInt6657 == 200) {
				Static226.aFloat137 = 16.0F;
				Static226.aFloat136 = 16.0F;
			} else {
				Static226.aFloat137 = 8.0F;
				Static226.aFloat136 = 8.0F;
			}
			Static226.anInt6308 = (int) Static226.aFloat137 >> 1;
			Static226.aByteArrayArrayArray16 = Static474.method7343(Static226.anInt6308);
			Static111.method1765();
			Static226.method5085();
			Static497.aClass353_44 = new Class353();
			Static226.anInt6310 += (int) (Math.random() * 5.0D) - 2;
			if (Static226.anInt6310 < -8) {
				Static226.anInt6310 = -8;
			}
			Static226.anInt6309 += (int) (Math.random() * 5.0D) - 2;
			if (Static226.anInt6310 > 8) {
				Static226.anInt6310 = 8;
			}
			if (Static226.anInt6309 < -16) {
				Static226.anInt6309 = -16;
			}
			if (Static226.anInt6309 > 16) {
				Static226.anInt6309 = 16;
			}
			Static226.method5080(arg1, Static226.anInt6310 >> 2 << 10, Static226.anInt6309 >> 1);
			Static226.aClass273_2.method5839(1024, 256);
			Static226.aClass257_2.method5594(256, 256);
			Static226.aClass96_3.method1928(4096);
			Static499.aClass241_5.method4895(256);
			Static271.anInt4778 = 20;
		} else if (Static271.anInt4778 == 20) {
			Static541.method7393(true);
			Static226.method5072(arg0, Static226.anInt6310, Static226.anInt6309);
			Static271.anInt4778 = 60;
			Static541.method7393(true);
			Static483.method6529();
		} else if (Static271.anInt4778 == 60) {
			if (Static226.aClass270_75.method5689(Static226.aClass1_Sub6_Sub11_2.aString66 + "_staticelements")) {
				if (!Static226.aClass270_75.method5698(Static226.aClass1_Sub6_Sub11_2.aString66 + "_staticelements")) {
					return;
				}
				Static226.aClass13_2 = Static237.method3600(Static226.aClass270_75, Static226.aClass1_Sub6_Sub11_2.aString66 + "_staticelements", Static154.aBoolean211);
			} else {
				Static226.aClass13_2 = new Class13(0);
			}
			Static226.method5069();
			Static271.anInt4778 = 70;
			Static541.method7393(true);
			Static483.method6529();
		} else if (Static271.anInt4778 == 70) {
			Static215.aClass31_2 = new Class31(arg0, 11, true, Static499.aCanvas9);
			Static271.anInt4778 = 73;
			Static541.method7393(true);
			Static483.method6529();
		} else if (Static271.anInt4778 == 73) {
			Static395.aClass31_8 = new Class31(arg0, 12, true, Static499.aCanvas9);
			Static271.anInt4778 = 76;
			Static541.method7393(true);
			Static483.method6529();
		} else if (Static271.anInt4778 == 76) {
			Static575.aClass31_11 = new Class31(arg0, 14, true, Static499.aCanvas9);
			Static271.anInt4778 = 79;
			Static541.method7393(true);
			Static483.method6529();
		} else if (Static271.anInt4778 == 79) {
			Static470.aClass31_10 = new Class31(arg0, 17, true, Static499.aCanvas9);
			Static271.anInt4778 = 82;
			Static541.method7393(true);
			Static483.method6529();
		} else if (Static271.anInt4778 == 82) {
			Static358.aClass31_7 = new Class31(arg0, 19, true, Static499.aCanvas9);
			Static271.anInt4778 = 85;
			Static541.method7393(true);
			Static483.method6529();
		} else if (Static271.anInt4778 == 85) {
			Static17.aClass31_1 = new Class31(arg0, 22, true, Static499.aCanvas9);
			Static271.anInt4778 = 88;
			Static541.method7393(true);
			Static483.method6529();
		} else if (Static271.anInt4778 == 88) {
			Static517.aClass31_12 = new Class31(arg0, 26, true, Static499.aCanvas9);
			Static271.anInt4778 = 91;
			Static541.method7393(true);
			Static483.method6529();
		} else {
			Static343.aClass31_5 = new Class31(arg0, 30, true, Static499.aCanvas9);
			Static271.anInt4778 = 100;
			Static541.method7393(true);
			Static483.method6529();
			System.gc();
		}
	}
}
