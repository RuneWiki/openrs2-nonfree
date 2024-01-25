import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!da", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString14 = null;

	@OriginalMember(owner = "client!da", name = "Q", descriptor = "Lclient!lc;")
	public static final Class136 aClass136_3 = new Class136("", 15);

	@OriginalMember(owner = "client!da", name = "a", descriptor = "(ILclient!oj;Lclient!eg;)V")
	public static void method1149(@OriginalArg(1) Class48 arg0, @OriginalArg(2) Interface3 arg1) {
		if (Static20.aClass2_Sub7_Sub12_3 == null) {
			return;
		}
		if (Static344.anInt6330 < 10) {
			if (!Static20.aClass83_82.method1963(Static20.aClass2_Sub7_Sub12_3.aString42)) {
				Static344.anInt6330 = Static86.aClass83_38.method1982(Static20.aClass2_Sub7_Sub12_3.aString42) / 10;
				return;
			}
			Static388.method6095();
			Static344.anInt6330 = 10;
		}
		if (Static344.anInt6330 == 10) {
			Static20.anInt4611 = Static20.aClass2_Sub7_Sub12_3.anInt4737 >> 6 << 6;
			Static20.anInt4606 = Static20.aClass2_Sub7_Sub12_3.anInt4736 >> 6 << 6;
			Static20.anInt4612 = (Static20.aClass2_Sub7_Sub12_3.anInt4739 >> 6 << 6) + 64 - Static20.anInt4606;
			Static20.anInt4603 = (Static20.aClass2_Sub7_Sub12_3.anInt4742 >> 6 << 6) + 64 - Static20.anInt4611;
			@Pc(82) int[] local82 = new int[3];
			@Pc(84) int local84 = -1;
			@Pc(86) int local86 = -1;
			if (Static20.aClass2_Sub7_Sub12_3.method4258(Static350.anInt6470 + (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6798 >> 7), local82, (Static182.aClass1_Sub2_Sub1_Sub1_1.anInt6800 >> 7) + Static279.anInt5198, Static182.aClass1_Sub2_Sub1_Sub1_1.aByte73)) {
				local84 = local82[1] - Static20.anInt4606;
				local86 = local82[2] - Static20.anInt4611;
			}
			if (!Static86.aBoolean137 && local84 >= 0 && Static20.anInt4612 > local84 && local86 >= 0 && Static20.anInt4603 > local86) {
				local84 += (int) (Math.random() * 10.0D) - 5;
				local86 += (int) (Math.random() * 10.0D) - 5;
				Static375.anInt6902 = local84;
				Static208.anInt4249 = local86;
			} else if (Static372.anInt6827 == -1 || Static206.anInt4236 == -1) {
				Static20.aClass2_Sub7_Sub12_3.method4263(local82, Static20.aClass2_Sub7_Sub12_3.anInt4738 >> 14 & 0x3FFF, Static20.aClass2_Sub7_Sub12_3.anInt4738 & 0x3FFF);
				Static375.anInt6902 = local82[1] - Static20.anInt4606;
				Static208.anInt4249 = local82[2] - Static20.anInt4611;
			} else {
				Static20.aClass2_Sub7_Sub12_3.method4263(local82, Static372.anInt6827, Static206.anInt4236);
				if (local82 != null) {
					Static375.anInt6902 = local82[1] - Static20.anInt4606;
					Static208.anInt4249 = local82[2] - Static20.anInt4611;
				}
				Static86.aBoolean137 = false;
				Static206.anInt4236 = -1;
				Static372.anInt6827 = -1;
			}
			if (Static20.aClass2_Sub7_Sub12_3.anInt4735 == 37) {
				Static20.aFloat52 = 3.0F;
				Static20.aFloat51 = 3.0F;
			} else if (Static20.aClass2_Sub7_Sub12_3.anInt4735 == 50) {
				Static20.aFloat52 = 4.0F;
				Static20.aFloat51 = 4.0F;
			} else if (Static20.aClass2_Sub7_Sub12_3.anInt4735 == 75) {
				Static20.aFloat52 = 6.0F;
				Static20.aFloat51 = 6.0F;
			} else if (Static20.aClass2_Sub7_Sub12_3.anInt4735 == 100) {
				Static20.aFloat52 = 8.0F;
				Static20.aFloat51 = 8.0F;
			} else if (Static20.aClass2_Sub7_Sub12_3.anInt4735 == 200) {
				Static20.aFloat52 = 16.0F;
				Static20.aFloat51 = 16.0F;
			} else {
				Static20.aFloat52 = 8.0F;
				Static20.aFloat51 = 8.0F;
			}
			Static20.anInt4599 = (int) Static20.aFloat52 >> 1;
			Static20.aByteArrayArrayArray16 = Static30.method346(Static20.anInt4599);
			Static335.method5408();
			Static20.method4146();
			Static340.aClass238_39 = new Class238();
			Static20.anInt4601 += (int) (Math.random() * 5.0D) - 2;
			if (Static20.anInt4601 < -8) {
				Static20.anInt4601 = -8;
			}
			Static20.anInt4600 += (int) (Math.random() * 5.0D) - 2;
			if (Static20.anInt4601 > 8) {
				Static20.anInt4601 = 8;
			}
			if (Static20.anInt4600 < -16) {
				Static20.anInt4600 = -16;
			}
			if (Static20.anInt4600 > 16) {
				Static20.anInt4600 = 16;
			}
			Static20.method4156(arg1, Static20.anInt4601 >> 2 << 10, Static20.anInt4600 >> 1);
			Static20.aClass195_3.method4811(256, 1024);
			Static20.aClass30_3.method531(256, 256);
			Static20.aClass96_3.method2298(4096);
			Static19.aClass132_1.method3441(256);
			Static344.anInt6330 = 20;
		} else if (Static344.anInt6330 == 20) {
			Static11.method104(true);
			Static20.method4150(arg0, Static20.anInt4601, Static20.anInt4600);
			Static344.anInt6330 = 60;
			Static11.method104(true);
			Static119.method2131();
		} else if (Static344.anInt6330 == 60) {
			if (Static20.aClass83_82.method1973(Static20.aClass2_Sub7_Sub12_3.aString42 + "_staticelements")) {
				if (!Static20.aClass83_82.method1963(Static20.aClass2_Sub7_Sub12_3.aString42 + "_staticelements")) {
					return;
				}
				Static20.aClass215_3 = Static62.method4278(Static20.aClass83_82, Static180.aBoolean272, Static20.aClass2_Sub7_Sub12_3.aString42 + "_staticelements");
			} else {
				Static20.aClass215_3 = new Class215(0);
			}
			Static20.method4147();
			Static344.anInt6330 = 70;
			Static11.method104(true);
			Static119.method2131();
		} else if (Static344.anInt6330 == 70) {
			Static10.aClass73_13 = new Class73(arg0, 11, true, Static343.aCanvas5);
			Static344.anInt6330 = 73;
			Static11.method104(true);
			Static119.method2131();
		} else if (Static344.anInt6330 == 73) {
			Static41.aClass73_4 = new Class73(arg0, 12, true, Static343.aCanvas5);
			Static344.anInt6330 = 76;
			Static11.method104(true);
			Static119.method2131();
		} else if (Static344.anInt6330 == 76) {
			Static297.aClass73_11 = new Class73(arg0, 14, true, Static343.aCanvas5);
			Static344.anInt6330 = 79;
			Static11.method104(true);
			Static119.method2131();
		} else if (Static344.anInt6330 == 79) {
			Static147.aClass73_7 = new Class73(arg0, 17, true, Static343.aCanvas5);
			Static344.anInt6330 = 82;
			Static11.method104(true);
			Static119.method2131();
		} else if (Static344.anInt6330 == 82) {
			Static17.aClass73_3 = new Class73(arg0, 19, true, Static343.aCanvas5);
			Static344.anInt6330 = 85;
			Static11.method104(true);
			Static119.method2131();
		} else if (Static344.anInt6330 == 85) {
			Static295.aClass73_10 = new Class73(arg0, 22, true, Static343.aCanvas5);
			Static344.anInt6330 = 88;
			Static11.method104(true);
			Static119.method2131();
		} else if (Static344.anInt6330 == 88) {
			Static123.aClass73_12 = new Class73(arg0, 26, true, Static343.aCanvas5);
			Static344.anInt6330 = 91;
			Static11.method104(true);
			Static119.method2131();
		} else {
			Static194.aClass73_8 = new Class73(arg0, 30, true, Static343.aCanvas5);
			Static344.anInt6330 = 100;
			Static11.method104(true);
			Static119.method2131();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!da", name = "c", descriptor = "(I)V")
	public static void method1151() {
		if (Static355.aBoolean466) {
			return;
		}
		Static317.method5132(Static302.aClass188ArrayArrayArray4);
		if (Static89.aClass188ArrayArrayArray3 != null) {
			Static317.method5132(Static89.aClass188ArrayArrayArray3);
		}
		Static355.aBoolean466 = true;
	}
}
