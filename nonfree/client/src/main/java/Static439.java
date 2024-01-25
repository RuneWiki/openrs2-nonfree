import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static439 {

	@OriginalMember(owner = "client!wc", name = "x", descriptor = "Lclient!rp;")
	public static Class223 aClass223_10;

	@OriginalMember(owner = "client!wc", name = "Q", descriptor = "Lclient!tg;")
	public static Class236 aClass236_1;

	@OriginalMember(owner = "client!wc", name = "C", descriptor = "F")
	public static float aFloat99 = 1024.0F;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(ILclient!ug;)V")
	public static void method5847(@OriginalArg(1) Class135_Sub2 arg0) {
		@Pc(12) byte[] local12;
		if (Static20.anObject8 == null) {
			@Pc(5) Class96_Sub2_Sub1 local5 = new Class96_Sub2_Sub1();
			local12 = local5.method2171();
			Static20.anObject8 = Static4.method71(local12);
		}
		if (Static371.anObject18 == null) {
			@Pc(33) Class96_Sub1_Sub1 local33 = new Class96_Sub1_Sub1();
			local12 = local33.method1850();
			Static371.anObject18 = Static4.method71(local12);
		}
		@Pc(48) Class113 local48 = arg0.aClass113_1;
		if (local48.method2117() && Static213.anObject4 == null) {
			local12 = Static326.method4299(4.0F, new Class92_Sub1(419684), 0.6F, 0.5F, 4.0F, 16.0F);
			Static213.anObject4 = Static4.method71(local12);
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BIIIZ)V")
	public static void method5850(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		if (Static341.anInt5549 == 0) {
			Static284.method3714(false);
		} else {
			Static129.anInt2329 = Static341.anInt5549;
			Static398.method4984(0);
		}
		Static251.anInt4167 = arg0;
		Static151.aBoolean197 = arg3;
		Static273.anInt4553 = arg1;
		Static292.method4952(arg2);
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lclient!ga;Lclient!ya;I)V")
	public static void method5853(@OriginalArg(0) Interface5 arg0, @OriginalArg(1) Class135 arg1) {
		if (Static292.aClass4_Sub2_Sub11_3 == null) {
			return;
		}
		if (Static69.anInt3214 < 10) {
			if (!Static292.aClass211_81.method4376(Static292.aClass4_Sub2_Sub11_3.aString33)) {
				Static69.anInt3214 = Static359.aClass211_80.method4380(Static292.aClass4_Sub2_Sub11_3.aString33) / 10;
				return;
			}
			Static341.method4515();
			Static69.anInt3214 = 10;
		}
		if (Static69.anInt3214 == 10) {
			Static292.anInt6142 = Static292.aClass4_Sub2_Sub11_3.anInt3802 >> 6 << 6;
			Static292.anInt6148 = Static292.aClass4_Sub2_Sub11_3.anInt3804 >> 6 << 6;
			Static292.anInt6145 = (Static292.aClass4_Sub2_Sub11_3.anInt3803 >> 6 << 6) + 64 - Static292.anInt6142;
			Static292.anInt6146 = (Static292.aClass4_Sub2_Sub11_3.anInt3794 >> 6 << 6) + 64 - Static292.anInt6148;
			@Pc(73) int[] local73 = new int[3];
			@Pc(75) int local75 = -1;
			@Pc(77) int local77 = -1;
			if (Static292.aClass4_Sub2_Sub11_3.method3006(Static366.anInt6052 + (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7343 >> 7), Static401.aClass8_Sub3_Sub1_Sub1_2.aByte99, local73, Static365.anInt6047 + (Static401.aClass8_Sub3_Sub1_Sub1_2.anInt7339 >> 7))) {
				local75 = local73[1] - Static292.anInt6142;
				local77 = local73[2] - Static292.anInt6148;
			}
			if (!Static151.aBoolean197 && local75 >= 0 && local75 < Static292.anInt6145 && local77 >= 0 && Static292.anInt6146 > local77) {
				local75 += (int) (Math.random() * 10.0D) - 5;
				local77 += (int) (Math.random() * 10.0D) - 5;
				Static54.anInt860 = local75;
				Static458.anInt6588 = local77;
			} else if (Static273.anInt4553 == -1 || Static251.anInt4167 == -1) {
				Static292.aClass4_Sub2_Sub11_3.method3009(local73, Static292.aClass4_Sub2_Sub11_3.anInt3801 & 0x3FFF, Static292.aClass4_Sub2_Sub11_3.anInt3801 >> 14 & 0x3FFF);
				Static54.anInt860 = local73[1] - Static292.anInt6142;
				Static458.anInt6588 = local73[2] - Static292.anInt6148;
			} else {
				Static292.aClass4_Sub2_Sub11_3.method3009(local73, Static251.anInt4167, Static273.anInt4553);
				Static251.anInt4167 = -1;
				Static273.anInt4553 = -1;
				if (local73 != null) {
					Static458.anInt6588 = local73[2] - Static292.anInt6148;
					Static54.anInt860 = local73[1] - Static292.anInt6142;
				}
				Static151.aBoolean197 = false;
			}
			if (Static292.aClass4_Sub2_Sub11_3.anInt3796 == 37) {
				Static292.aFloat74 = 3.0F;
				Static292.aFloat73 = 3.0F;
			} else if (Static292.aClass4_Sub2_Sub11_3.anInt3796 == 50) {
				Static292.aFloat74 = 4.0F;
				Static292.aFloat73 = 4.0F;
			} else if (Static292.aClass4_Sub2_Sub11_3.anInt3796 == 75) {
				Static292.aFloat74 = 6.0F;
				Static292.aFloat73 = 6.0F;
			} else if (Static292.aClass4_Sub2_Sub11_3.anInt3796 == 100) {
				Static292.aFloat74 = 8.0F;
				Static292.aFloat73 = 8.0F;
			} else if (Static292.aClass4_Sub2_Sub11_3.anInt3796 == 200) {
				Static292.aFloat74 = 16.0F;
				Static292.aFloat73 = 16.0F;
			} else {
				Static292.aFloat74 = 8.0F;
				Static292.aFloat73 = 8.0F;
			}
			Static292.anInt6140 = (int) Static292.aFloat74 >> 1;
			Static292.aByteArrayArrayArray16 = Static88.method1371(Static292.anInt6140);
			Static447.method5934();
			Static292.method4946();
			Static100.aClass244_9 = new Class244();
			Static292.anInt6138 += (int) (Math.random() * 5.0D) - 2;
			if (Static292.anInt6138 < -8) {
				Static292.anInt6138 = -8;
			}
			Static292.anInt6139 += (int) (Math.random() * 5.0D) - 2;
			if (Static292.anInt6138 > 8) {
				Static292.anInt6138 = 8;
			}
			if (Static292.anInt6139 < -16) {
				Static292.anInt6139 = -16;
			}
			if (Static292.anInt6139 > 16) {
				Static292.anInt6139 = 16;
			}
			Static292.method4932(arg0, Static292.anInt6138 >> 2 << 10, Static292.anInt6139 >> 1);
			Static292.aClass235_4.method4956(1024, 256);
			Static292.aClass122_4.method2322(256, 256);
			Static292.aClass151_4.method2919(4096);
			Static426.aClass156_2.method3021(256);
			Static69.anInt3214 = 20;
		} else if (Static69.anInt3214 == 20) {
			Static162.method66(true);
			Static292.method4951(arg1, Static292.anInt6138, Static292.anInt6139);
			Static69.anInt3214 = 60;
			Static162.method66(true);
			Static251.method3313();
		} else if (Static69.anInt3214 == 60) {
			if (Static292.aClass211_81.method4355(Static292.aClass4_Sub2_Sub11_3.aString33 + "_staticelements")) {
				if (!Static292.aClass211_81.method4376(Static292.aClass4_Sub2_Sub11_3.aString33 + "_staticelements")) {
					return;
				}
				Static292.aClass11_3 = Static436.method5811(Static292.aClass211_81, Static225.aBoolean284, Static292.aClass4_Sub2_Sub11_3.aString33 + "_staticelements");
			} else {
				Static292.aClass11_3 = new Class11(0);
			}
			Static292.method4943();
			Static69.anInt3214 = 70;
			Static162.method66(true);
			Static251.method3313();
		} else if (Static69.anInt3214 == 70) {
			Static344.aClass223_8 = new Class223(arg1, 11, true, Static391.aCanvas5);
			Static69.anInt3214 = 73;
			Static162.method66(true);
			Static251.method3313();
		} else if (Static69.anInt3214 == 73) {
			Static136.aClass223_5 = new Class223(arg1, 12, true, Static391.aCanvas5);
			Static69.anInt3214 = 76;
			Static162.method66(true);
			Static251.method3313();
		} else if (Static69.anInt3214 == 76) {
			Static66.aClass223_4 = new Class223(arg1, 14, true, Static391.aCanvas5);
			Static69.anInt3214 = 79;
			Static162.method66(true);
			Static251.method3313();
		} else if (Static69.anInt3214 == 79) {
			aClass223_10 = new Class223(arg1, 17, true, Static391.aCanvas5);
			Static69.anInt3214 = 82;
			Static162.method66(true);
			Static251.method3313();
		} else if (Static69.anInt3214 == 82) {
			Static4.aClass223_1 = new Class223(arg1, 19, true, Static391.aCanvas5);
			Static69.anInt3214 = 85;
			Static162.method66(true);
			Static251.method3313();
		} else if (Static69.anInt3214 == 85) {
			Static282.aClass223_6 = new Class223(arg1, 22, true, Static391.aCanvas5);
			Static69.anInt3214 = 88;
			Static162.method66(true);
			Static251.method3313();
		} else if (Static69.anInt3214 == 88) {
			Static109.aClass223_9 = new Class223(arg1, 26, true, Static391.aCanvas5);
			Static69.anInt3214 = 91;
			Static162.method66(true);
			Static251.method3313();
		} else {
			Static314.aClass223_7 = new Class223(arg1, 30, true, Static391.aCanvas5);
			Static69.anInt3214 = 100;
			Static162.method66(true);
			Static251.method3313();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)[Lclient!ud;")
	public static Class245[] method5854() {
		return new Class245[] { Static120.aClass245_8, Static220.aClass245_9, Static261.aClass245_11, Static433.aClass245_17, Static2.aClass245_1, Static331.aClass245_15, Static320.aClass245_13, Static48.aClass245_3, Static72.aClass245_5, Static75.aClass245_6, Static85.aClass245_7, Static325.aClass245_14, Static23.aClass245_16, Static60.aClass245_4 };
	}
}
