import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static171 {

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray10;

	@OriginalMember(owner = "client!ga", name = "n", descriptor = "Lclient!wi;")
	public static final Class376 aClass376_3 = new Class376();

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!ha;Lclient!d;)V")
	public static void method2836(@OriginalArg(1) Class82 arg0, @OriginalArg(2) Interface5 arg1) {
		if (Static598.aClass3_Sub7_Sub6_3 == null) {
			return;
		}
		if (Static214.anInt4427 < 10) {
			if (!Static598.aClass343_72.method8140(Static598.aClass3_Sub7_Sub6_3.aString10)) {
				Static214.anInt4427 = Static207.aClass343_103.method8163(Static598.aClass3_Sub7_Sub6_3.aString10) / 10;
				return;
			}
			Static78.method1340();
			Static214.anInt4427 = 10;
		}
		if (Static214.anInt4427 == 10) {
			Static598.anInt2992 = Static598.aClass3_Sub7_Sub6_3.anInt1840 >> 6 << 6;
			Static598.anInt2995 = Static598.aClass3_Sub7_Sub6_3.anInt1847 >> 6 << 6;
			Static598.anInt2994 = (Static598.aClass3_Sub7_Sub6_3.anInt1845 >> 6 << 6) + 64 - Static598.anInt2992;
			Static598.anInt2998 = (Static598.aClass3_Sub7_Sub6_3.anInt1837 >> 6 << 6) + 64 - Static598.anInt2995;
			@Pc(75) int[] local75 = new int[3];
			@Pc(77) int local77 = -1;
			@Pc(79) int local79 = -1;
			if (Static598.aClass3_Sub7_Sub6_3.method1570((Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10152 >> 9) + Static427.anInt7462, Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.aByte127, (Static68.aClass9_Sub2_Sub1_Sub2_Sub1_1.anInt10158 >> 9) + Static22.anInt329, local75)) {
				local77 = local75[1] - Static598.anInt2992;
				local79 = local75[2] - Static598.anInt2995;
			}
			if (!Static389.aBoolean505 && local77 >= 0 && local77 < Static598.anInt2994 && local79 >= 0 && Static598.anInt2998 > local79) {
				local77 += (int) (Math.random() * 10.0D) - 5;
				local79 += (int) (Math.random() * 10.0D) - 5;
				Static122.anInt2649 = local77;
				Static168.anInt3275 = local79;
			} else if (Static561.anInt9314 == -1 || Static436.anInt7572 == -1) {
				Static598.aClass3_Sub7_Sub6_3.method1566(Static598.aClass3_Sub7_Sub6_3.anInt1842 & 0x3FFF, local75, Static598.aClass3_Sub7_Sub6_3.anInt1842 >> 14 & 0x3FFF);
				Static122.anInt2649 = local75[1] - Static598.anInt2992;
				Static168.anInt3275 = local75[2] - Static598.anInt2995;
			} else {
				Static598.aClass3_Sub7_Sub6_3.method1566(Static436.anInt7572, local75, Static561.anInt9314);
				Static436.anInt7572 = -1;
				Static561.anInt9314 = -1;
				Static389.aBoolean505 = false;
				if (local75 != null) {
					Static168.anInt3275 = local75[2] - Static598.anInt2995;
					Static122.anInt2649 = local75[1] - Static598.anInt2992;
				}
			}
			if (Static598.aClass3_Sub7_Sub6_3.anInt1839 == 37) {
				Static598.aFloat67 = 3.0F;
				Static598.aFloat68 = 3.0F;
			} else if (Static598.aClass3_Sub7_Sub6_3.anInt1839 == 50) {
				Static598.aFloat67 = 4.0F;
				Static598.aFloat68 = 4.0F;
			} else if (Static598.aClass3_Sub7_Sub6_3.anInt1839 == 75) {
				Static598.aFloat67 = 6.0F;
				Static598.aFloat68 = 6.0F;
			} else if (Static598.aClass3_Sub7_Sub6_3.anInt1839 == 100) {
				Static598.aFloat67 = 8.0F;
				Static598.aFloat68 = 8.0F;
			} else if (Static598.aClass3_Sub7_Sub6_3.anInt1839 == 200) {
				Static598.aFloat67 = 16.0F;
				Static598.aFloat68 = 16.0F;
			} else {
				Static598.aFloat67 = 8.0F;
				Static598.aFloat68 = 8.0F;
			}
			Static598.anInt2987 = (int) Static598.aFloat67 >> 1;
			Static598.aByteArrayArrayArray8 = Static517.method7519(Static598.anInt2987);
			Static510.method7387();
			Static598.method2528();
			Static181.aClass216_30 = new Class216();
			Static598.anInt2988 += (int) (Math.random() * 5.0D) - 2;
			if (Static598.anInt2988 < -8) {
				Static598.anInt2988 = -8;
			}
			if (Static598.anInt2988 > 8) {
				Static598.anInt2988 = 8;
			}
			Static598.anInt2989 += (int) (Math.random() * 5.0D) - 2;
			if (Static598.anInt2989 < -16) {
				Static598.anInt2989 = -16;
			}
			if (Static598.anInt2989 > 16) {
				Static598.anInt2989 = 16;
			}
			Static598.method2548(arg1, Static598.anInt2988 >> 2 << 10, Static598.anInt2989 >> 1);
			Static598.aClass154_2.method3941(256, 1024);
			Static598.aClass233_47.method5859(256, 256);
			Static598.aClass284_2.method6914(4096);
			Static133.aClass222_30.method5708(256);
			Static214.anInt4427 = 20;
		} else if (Static214.anInt4427 == 20) {
			Static167.method2802(true);
			Static598.method2543(arg0, Static598.anInt2988, Static598.anInt2989);
			Static214.anInt4427 = 60;
			Static167.method2802(true);
			Static617.method8426();
		} else if (Static214.anInt4427 == 60) {
			if (Static598.aClass343_72.method8147(Static598.aClass3_Sub7_Sub6_3.aString10 + "_staticelements")) {
				if (!Static598.aClass343_72.method8140(Static598.aClass3_Sub7_Sub6_3.aString10 + "_staticelements")) {
					return;
				}
				Static598.aClass76_2 = Static168.method2810(Static598.aClass343_72, Static598.aClass3_Sub7_Sub6_3.aString10 + "_staticelements", Static166.aBoolean243);
			} else {
				Static598.aClass76_2 = new Class76(0);
			}
			Static598.method2529();
			Static214.anInt4427 = 70;
			Static167.method2802(true);
			Static617.method8426();
		} else if (Static214.anInt4427 == 70) {
			Static412.aClass61_6 = new Class61(arg0, 11, true, Static617.aCanvas13);
			Static214.anInt4427 = 73;
			Static167.method2802(true);
			Static617.method8426();
		} else if (Static214.anInt4427 == 73) {
			Static506.aClass61_7 = new Class61(arg0, 12, true, Static617.aCanvas13);
			Static214.anInt4427 = 76;
			Static167.method2802(true);
			Static617.method8426();
		} else if (Static214.anInt4427 == 76) {
			Static642.aClass61_8 = new Class61(arg0, 14, true, Static617.aCanvas13);
			Static214.anInt4427 = 79;
			Static167.method2802(true);
			Static617.method8426();
		} else if (Static214.anInt4427 == 79) {
			Static252.aClass61_3 = new Class61(arg0, 17, true, Static617.aCanvas13);
			Static214.anInt4427 = 82;
			Static167.method2802(true);
			Static617.method8426();
		} else if (Static214.anInt4427 == 82) {
			Static370.aClass61_4 = new Class61(arg0, 19, true, Static617.aCanvas13);
			Static214.anInt4427 = 85;
			Static167.method2802(true);
			Static617.method8426();
		} else if (Static214.anInt4427 == 85) {
			Static410.aClass61_5 = new Class61(arg0, 22, true, Static617.aCanvas13);
			Static214.anInt4427 = 88;
			Static167.method2802(true);
			Static617.method8426();
		} else if (Static214.anInt4427 == 88) {
			Static153.aClass61_2 = new Class61(arg0, 26, true, Static617.aCanvas13);
			Static214.anInt4427 = 91;
			Static167.method2802(true);
			Static617.method8426();
		} else {
			Static54.aClass61_1 = new Class61(arg0, 30, true, Static617.aCanvas13);
			Static214.anInt4427 = 100;
			Static167.method2802(true);
			Static617.method8426();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!dc;I)Lclient!gr;")
	public static Class18_Sub4 method2837(@OriginalArg(0) Class3_Sub9 arg0) {
		return new Class18_Sub4(arg0.method5624(), arg0.method5624(), arg0.method5624(), arg0.method5624(), arg0.method5604(), arg0.method5604(), arg0.method5633());
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(III)Z")
	public static boolean method2838(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x100100) != 0;
	}
}
