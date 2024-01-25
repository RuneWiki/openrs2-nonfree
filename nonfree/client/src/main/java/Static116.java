import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static116 {

	@OriginalMember(owner = "client!fs", name = "f", descriptor = "I")
	public static int anInt2643;

	@OriginalMember(owner = "client!fs", name = "k", descriptor = "Lclient!ht;")
	public static final Class112 aClass112_6 = new Class112();

	@OriginalMember(owner = "client!fs", name = "l", descriptor = "Lclient!wj;")
	public static final Class265 aClass265_49 = new Class265(2, 8);

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(ZLclient!ga;Lclient!ya;)V")
	public static void method2053(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Class49 arg1) {
		if (Static88.aClass2_Sub5_Sub12_2 == null) {
			return;
		}
		if (Static23.anInt564 < 10) {
			if (!Static88.aClass160_46.method3709(Static88.aClass2_Sub5_Sub12_2.aString51)) {
				Static23.anInt564 = Static323.aClass160_64.method3705(Static88.aClass2_Sub5_Sub12_2.aString51) / 10;
				return;
			}
			Static163.method5138();
			Static23.anInt564 = 10;
		}
		if (Static23.anInt564 == 10) {
			Static88.anInt4520 = Static88.aClass2_Sub5_Sub12_2.anInt5154 >> 6 << 6;
			Static88.anInt4515 = Static88.aClass2_Sub5_Sub12_2.anInt5165 >> 6 << 6;
			Static88.anInt4519 = (Static88.aClass2_Sub5_Sub12_2.anInt5164 >> 6 << 6) + 64 - Static88.anInt4520;
			Static88.anInt4522 = (Static88.aClass2_Sub5_Sub12_2.anInt5163 >> 6 << 6) + 64 - Static88.anInt4515;
			@Pc(74) int[] local74 = new int[3];
			@Pc(76) int local76 = -1;
			@Pc(78) int local78 = -1;
			if (Static88.aClass2_Sub5_Sub12_2.method4139(Static324.anInt5624 + (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6121 >> 7), local74, (Static375.aClass3_Sub2_Sub1_Sub2_7.anInt6119 >> 7) + Static48.anInt962, Static375.aClass3_Sub2_Sub1_Sub2_7.aByte89)) {
				local76 = local74[1] - Static88.anInt4520;
				local78 = local74[2] - Static88.anInt4515;
			}
			if (!Static162.aBoolean250 && local76 >= 0 && local76 < Static88.anInt4519 && local78 >= 0 && local78 < Static88.anInt4522) {
				local78 += (int) (Math.random() * 10.0D) - 5;
				local76 += (int) (Math.random() * 10.0D) - 5;
				Static133.anInt2851 = local76;
				Static129.anInt2786 = local78;
			} else if (Static234.anInt4526 == -1 || Static55.anInt1188 == -1) {
				Static88.aClass2_Sub5_Sub12_2.method4146(Static88.aClass2_Sub5_Sub12_2.anInt5153 >> 14 & 0x3FFF, local74, Static88.aClass2_Sub5_Sub12_2.anInt5153 & 0x3FFF);
				Static133.anInt2851 = local74[1] - Static88.anInt4520;
				Static129.anInt2786 = local74[2] - Static88.anInt4515;
			} else {
				Static88.aClass2_Sub5_Sub12_2.method4146(Static234.anInt4526, local74, Static55.anInt1188);
				Static162.aBoolean250 = false;
				if (local74 != null) {
					Static133.anInt2851 = local74[1] - Static88.anInt4520;
					Static129.anInt2786 = local74[2] - Static88.anInt4515;
				}
				Static55.anInt1188 = -1;
				Static234.anInt4526 = -1;
			}
			if (Static88.aClass2_Sub5_Sub12_2.anInt5157 == 37) {
				Static88.aFloat67 = 3.0F;
				Static88.aFloat68 = 3.0F;
			} else if (Static88.aClass2_Sub5_Sub12_2.anInt5157 == 50) {
				Static88.aFloat67 = 4.0F;
				Static88.aFloat68 = 4.0F;
			} else if (Static88.aClass2_Sub5_Sub12_2.anInt5157 == 75) {
				Static88.aFloat67 = 6.0F;
				Static88.aFloat68 = 6.0F;
			} else if (Static88.aClass2_Sub5_Sub12_2.anInt5157 == 100) {
				Static88.aFloat67 = 8.0F;
				Static88.aFloat68 = 8.0F;
			} else if (Static88.aClass2_Sub5_Sub12_2.anInt5157 == 200) {
				Static88.aFloat67 = 16.0F;
				Static88.aFloat68 = 16.0F;
			} else {
				Static88.aFloat67 = 8.0F;
				Static88.aFloat68 = 8.0F;
			}
			Static88.anInt4511 = (int) Static88.aFloat67 >> 1;
			Static88.aByteArrayArrayArray10 = Static320.method4499(Static88.anInt4511);
			Static282.method4106();
			Static88.method3635();
			Static113.aClass14_20 = new Class14();
			Static88.anInt4512 += (int) (Math.random() * 5.0D) - 2;
			if (Static88.anInt4512 < -8) {
				Static88.anInt4512 = -8;
			}
			if (Static88.anInt4512 > 8) {
				Static88.anInt4512 = 8;
			}
			Static88.anInt4513 += (int) (Math.random() * 5.0D) - 2;
			if (Static88.anInt4513 < -16) {
				Static88.anInt4513 = -16;
			}
			if (Static88.anInt4513 > 16) {
				Static88.anInt4513 = 16;
			}
			Static88.method3642(arg0, Static88.anInt4512 >> 2 << 10, Static88.anInt4513 >> 1);
			Static88.aClass215_3.method4746(256, 1024);
			Static88.aClass120_6.method2658(256, 256);
			Static88.aClass165_4.method3800(4096);
			Static166.aClass6_1.method199(256);
			Static23.anInt564 = 20;
		} else if (Static23.anInt564 == 20) {
			Static15.method315(true);
			Static88.method3651(arg1, Static88.anInt4512, Static88.anInt4513);
			Static23.anInt564 = 60;
			Static15.method315(true);
			Static136.method2313();
		} else if (Static23.anInt564 == 60) {
			if (Static88.aClass160_46.method3712(Static88.aClass2_Sub5_Sub12_2.aString51 + "_staticelements")) {
				if (!Static88.aClass160_46.method3709(Static88.aClass2_Sub5_Sub12_2.aString51 + "_staticelements")) {
					return;
				}
				Static88.aClass153_2 = Static149.method2453(Static88.aClass2_Sub5_Sub12_2.aString51 + "_staticelements", Static333.aBoolean406, Static88.aClass160_46);
			} else {
				Static88.aClass153_2 = new Class153(0);
			}
			Static88.method3653();
			Static23.anInt564 = 70;
			Static15.method315(true);
			Static136.method2313();
		} else if (Static23.anInt564 == 70) {
			Static216.aClass28_14 = new Class28(arg1, 11, true, Static339.aCanvas7);
			Static23.anInt564 = 73;
			Static15.method315(true);
			Static136.method2313();
		} else if (Static23.anInt564 == 73) {
			Static344.aClass28_13 = new Class28(arg1, 12, true, Static339.aCanvas7);
			Static23.anInt564 = 76;
			Static15.method315(true);
			Static136.method2313();
		} else if (Static23.anInt564 == 76) {
			Static274.aClass28_11 = new Class28(arg1, 14, true, Static339.aCanvas7);
			Static23.anInt564 = 79;
			Static15.method315(true);
			Static136.method2313();
		} else if (Static23.anInt564 == 79) {
			Static190.aClass28_5 = new Class28(arg1, 17, true, Static339.aCanvas7);
			Static23.anInt564 = 82;
			Static15.method315(true);
			Static136.method2313();
		} else if (Static23.anInt564 == 82) {
			Static103.aClass28_1 = new Class28(arg1, 19, true, Static339.aCanvas7);
			Static23.anInt564 = 85;
			Static15.method315(true);
			Static136.method2313();
		} else if (Static23.anInt564 == 85) {
			Static105.aClass28_2 = new Class28(arg1, 22, true, Static339.aCanvas7);
			Static23.anInt564 = 88;
			Static15.method315(true);
			Static136.method2313();
		} else if (Static23.anInt564 == 88) {
			Static192.aClass28_6 = new Class28(arg1, 26, true, Static339.aCanvas7);
			Static23.anInt564 = 91;
			Static15.method315(true);
			Static136.method2313();
		} else {
			Static260.aClass28_10 = new Class28(arg1, 30, true, Static339.aCanvas7);
			Static23.anInt564 = 100;
			Static15.method315(true);
			Static136.method2313();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!fs", name = "a", descriptor = "(IIIJ)V")
	public static void method2059(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(12) int local12 = (int) arg2 >> 14 & 0x1F;
		@Pc(19) int local19 = (int) arg2 >> 20 & 0x3;
		@Pc(26) int local26 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local12 != 10 && local12 != 11 && local12 != 22) {
			Static346.method4766(local19, 0, true, local12, 0, arg1, 0, arg0);
			return;
		}
		@Pc(42) Class134 local42 = Static118.aClass165_2.method3799(local26);
		@Pc(52) int local52;
		@Pc(55) int local55;
		if (local19 == 0 || local19 == 2) {
			local52 = local42.anInt3670;
			local55 = local42.anInt3652;
		} else {
			local52 = local42.anInt3652;
			local55 = local42.anInt3670;
		}
		@Pc(66) int local66 = local42.anInt3644;
		if (local19 != 0) {
			local66 = (local66 << local19 & 0xF) + (local66 >> 4 - local19);
		}
		Static346.method4766(0, local66, true, 0, local52, arg1, local55, arg0);
	}

	@OriginalMember(owner = "client!fs", name = "b", descriptor = "(B)Z")
	public static boolean method2060() {
		if (Static92.aBoolean239) {
			try {
				Static463.method4344("showVideoAd", Static43.aClass59_5.anApplet1);
				return true;
			} catch (@Pc(14) Throwable local14) {
			}
		}
		return false;
	}
}
