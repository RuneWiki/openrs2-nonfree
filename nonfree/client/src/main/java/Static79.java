import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static79 {

	@OriginalMember(owner = "client!da", name = "f", descriptor = "I")
	public static int anInt1504;

	@OriginalMember(owner = "client!da", name = "n", descriptor = "Lclient!gp;")
	public static Class117 aClass117_38;

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(BLclient!qa;Lclient!n;)V")
	public static void method1402(@OriginalArg(1) Class62 arg0, @OriginalArg(2) Interface8 arg1) {
		if (Static245.aClass5_Sub2_Sub5_3 == null) {
			return;
		}
		if (Static213.anInt4055 < 10) {
			if (!Static245.aClass117_174.method2955(Static245.aClass5_Sub2_Sub5_3.aString20)) {
				Static213.anInt4055 = Static317.aClass117_142.method2969(Static245.aClass5_Sub2_Sub5_3.aString20) / 10;
				return;
			}
			Static297.method5712();
			Static213.anInt4055 = 10;
		}
		if (Static213.anInt4055 == 10) {
			Static245.anInt7314 = Static245.aClass5_Sub2_Sub5_3.anInt880 >> 6 << 6;
			Static245.anInt7315 = Static245.aClass5_Sub2_Sub5_3.anInt878 >> 6 << 6;
			Static245.anInt7316 = (Static245.aClass5_Sub2_Sub5_3.anInt886 >> 6 << 6) + 64 - Static245.anInt7314;
			Static245.anInt7313 = (Static245.aClass5_Sub2_Sub5_3.anInt882 >> 6 << 6) + 64 - Static245.anInt7315;
			@Pc(76) int[] local76 = new int[3];
			@Pc(78) int local78 = -1;
			@Pc(80) int local80 = -1;
			if (Static245.aClass5_Sub2_Sub5_3.method822(Static338.anInt6353 + (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8493 >> 7), (Static35.aClass15_Sub2_Sub1_Sub1_1.anInt8492 >> 7) + Static515.anInt3214, Static35.aClass15_Sub2_Sub1_Sub1_1.aByte91, local76)) {
				local78 = local76[1] - Static245.anInt7314;
				local80 = local76[2] - Static245.anInt7315;
			}
			if (!Static523.aBoolean643 && local78 >= 0 && Static245.anInt7316 > local78 && local80 >= 0 && Static245.anInt7313 > local80) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static489.anInt8411 = local80;
				Static435.anInt7668 = local78;
			} else if (Static252.anInt5080 == -1 || Static211.anInt3979 == -1) {
				Static245.aClass5_Sub2_Sub5_3.method825(Static245.aClass5_Sub2_Sub5_3.anInt876 >> 14 & 0x3FFF, local76, Static245.aClass5_Sub2_Sub5_3.anInt876 & 0x3FFF);
				Static435.anInt7668 = local76[1] - Static245.anInt7314;
				Static489.anInt8411 = local76[2] - Static245.anInt7315;
			} else {
				Static245.aClass5_Sub2_Sub5_3.method825(Static252.anInt5080, local76, Static211.anInt3979);
				if (local76 != null) {
					Static435.anInt7668 = local76[1] - Static245.anInt7314;
					Static489.anInt8411 = local76[2] - Static245.anInt7315;
				}
				Static211.anInt3979 = -1;
				Static252.anInt5080 = -1;
				Static523.aBoolean643 = false;
			}
			if (Static245.aClass5_Sub2_Sub5_3.anInt889 == 37) {
				Static245.aFloat312 = 3.0F;
				Static245.aFloat313 = 3.0F;
			} else if (Static245.aClass5_Sub2_Sub5_3.anInt889 == 50) {
				Static245.aFloat312 = 4.0F;
				Static245.aFloat313 = 4.0F;
			} else if (Static245.aClass5_Sub2_Sub5_3.anInt889 == 75) {
				Static245.aFloat312 = 6.0F;
				Static245.aFloat313 = 6.0F;
			} else if (Static245.aClass5_Sub2_Sub5_3.anInt889 == 100) {
				Static245.aFloat312 = 8.0F;
				Static245.aFloat313 = 8.0F;
			} else if (Static245.aClass5_Sub2_Sub5_3.anInt889 == 200) {
				Static245.aFloat312 = 16.0F;
				Static245.aFloat313 = 16.0F;
			} else {
				Static245.aFloat312 = 8.0F;
				Static245.aFloat313 = 8.0F;
			}
			Static245.anInt7306 = (int) Static245.aFloat312 >> 1;
			Static245.aByteArrayArrayArray15 = Static370.method6433(Static245.anInt7306);
			Static117.method2269();
			Static245.method5954();
			Static357.aClass99_56 = new Class99();
			Static245.anInt7305 += (int) (Math.random() * 5.0D) - 2;
			if (Static245.anInt7305 < -8) {
				Static245.anInt7305 = -8;
			}
			if (Static245.anInt7305 > 8) {
				Static245.anInt7305 = 8;
			}
			Static245.anInt7307 += (int) (Math.random() * 5.0D) - 2;
			if (Static245.anInt7307 < -16) {
				Static245.anInt7307 = -16;
			}
			if (Static245.anInt7307 > 16) {
				Static245.anInt7307 = 16;
			}
			Static245.method5952(arg1, Static245.anInt7305 >> 2 << 10, Static245.anInt7307 >> 1);
			Static245.aClass246_4.method5844(1024, 256);
			Static245.aClass274_3.method6384(256, 256);
			Static245.aClass88_2.method2286(4096);
			Static304.aClass162_1.method4082(256);
			Static213.anInt4055 = 20;
		} else if (Static213.anInt4055 == 20) {
			Static265.method4422(true);
			Static245.method5968(arg0, Static245.anInt7305, Static245.anInt7307);
			Static213.anInt4055 = 60;
			Static265.method4422(true);
			Static487.method6757();
		} else if (Static213.anInt4055 == 60) {
			if (Static245.aClass117_174.method2956(Static245.aClass5_Sub2_Sub5_3.aString20 + "_staticelements")) {
				if (!Static245.aClass117_174.method2955(Static245.aClass5_Sub2_Sub5_3.aString20 + "_staticelements")) {
					return;
				}
				Static245.aClass197_3 = Static329.method5208(Static433.aBoolean542, Static245.aClass5_Sub2_Sub5_3.aString20 + "_staticelements", Static245.aClass117_174);
			} else {
				Static245.aClass197_3 = new Class197(0);
			}
			Static245.method5953();
			Static213.anInt4055 = 70;
			Static265.method4422(true);
			Static487.method6757();
		} else if (Static213.anInt4055 == 70) {
			Static229.aClass94_5 = new Class94(arg0, 11, true, Static209.aCanvas6);
			Static213.anInt4055 = 73;
			Static265.method4422(true);
			Static487.method6757();
		} else if (Static213.anInt4055 == 73) {
			Static63.aClass94_2 = new Class94(arg0, 12, true, Static209.aCanvas6);
			Static213.anInt4055 = 76;
			Static265.method4422(true);
			Static487.method6757();
		} else if (Static213.anInt4055 == 76) {
			Static77.aClass94_6 = new Class94(arg0, 14, true, Static209.aCanvas6);
			Static213.anInt4055 = 79;
			Static265.method4422(true);
			Static487.method6757();
		} else if (Static213.anInt4055 == 79) {
			Static313.aClass94_7 = new Class94(arg0, 17, true, Static209.aCanvas6);
			Static213.anInt4055 = 82;
			Static265.method4422(true);
			Static487.method6757();
		} else if (Static213.anInt4055 == 82) {
			Static159.aClass94_4 = new Class94(arg0, 19, true, Static209.aCanvas6);
			Static213.anInt4055 = 85;
			Static265.method4422(true);
			Static487.method6757();
		} else if (Static213.anInt4055 == 85) {
			Static503.aClass94_9 = new Class94(arg0, 22, true, Static209.aCanvas6);
			Static213.anInt4055 = 88;
			Static265.method4422(true);
			Static487.method6757();
		} else if (Static213.anInt4055 == 88) {
			Static320.aClass94_8 = new Class94(arg0, 26, true, Static209.aCanvas6);
			Static213.anInt4055 = 91;
			Static265.method4422(true);
			Static487.method6757();
		} else {
			Static37.aClass94_1 = new Class94(arg0, 30, true, Static209.aCanvas6);
			Static213.anInt4055 = 100;
			Static265.method4422(true);
			Static487.method6757();
			System.gc();
		}
	}
}
