import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static226 {

	@OriginalMember(owner = "client!il", name = "F", descriptor = "I")
	public static int anInt4147;

	@OriginalMember(owner = "client!il", name = "P", descriptor = "Lclient!pj;")
	public static Class248 aClass248_33;

	@OriginalMember(owner = "client!il", name = "X", descriptor = "I")
	public static int anInt4160;

	@OriginalMember(owner = "client!il", name = "Q", descriptor = "Lclient!uc;")
	public static final Class316 aClass316_49 = new Class316(5, 4);

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!oa;BLclient!e;)V")
	public static void method3554(@OriginalArg(0) Class90 arg0, @OriginalArg(2) Interface2 arg1) {
		if (Static490.aClass6_Sub5_Sub2_2 == null) {
			return;
		}
		if (Static91.anInt1503 < 10) {
			if (!Static490.aClass248_19.method5803(Static490.aClass6_Sub5_Sub2_2.aString12)) {
				Static91.anInt1503 = Static302.aClass248_45.method5780(Static490.aClass6_Sub5_Sub2_2.aString12) / 10;
				return;
			}
			Static162.method2597();
			Static91.anInt1503 = 10;
		}
		if (Static91.anInt1503 == 10) {
			Static490.anInt1917 = Static490.aClass6_Sub5_Sub2_2.anInt2011 >> 6 << 6;
			Static490.anInt1918 = Static490.aClass6_Sub5_Sub2_2.anInt2008 >> 6 << 6;
			Static490.anInt1922 = (Static490.aClass6_Sub5_Sub2_2.anInt2021 >> 6 << 6) + 64 - Static490.anInt1917;
			Static490.anInt1919 = (Static490.aClass6_Sub5_Sub2_2.anInt2017 >> 6 << 6) + 64 - Static490.anInt1918;
			@Pc(78) int[] local78 = new int[3];
			@Pc(80) int local80 = -1;
			@Pc(82) int local82 = -1;
			if (Static490.aClass6_Sub5_Sub2_2.method1835((Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8913 >> 9) + Static154.anInt2878, Static461.aClass15_Sub2_Sub4_Sub2_2.aByte98, local78, Static150.anInt2792 + (Static461.aClass15_Sub2_Sub4_Sub2_2.anInt8911 >> 9))) {
				local80 = local78[1] - Static490.anInt1918;
				local82 = local78[2] - Static490.anInt1917;
			}
			if (!Static376.aBoolean471 && local80 >= 0 && Static490.anInt1919 > local80 && local82 >= 0 && Static490.anInt1922 > local82) {
				local82 += (int) (Math.random() * 10.0D) - 5;
				local80 += (int) (Math.random() * 10.0D) - 5;
				Static441.anInt3925 = local80;
				Static30.anInt535 = local82;
			} else if (Static485.anInt8586 == -1 || Static51.anInt910 == -1) {
				Static490.aClass6_Sub5_Sub2_2.method1832(Static490.aClass6_Sub5_Sub2_2.anInt2019 & 0x3FFF, local78, Static490.aClass6_Sub5_Sub2_2.anInt2019 >> 14 & 0x3FFF);
				Static441.anInt3925 = local78[1] - Static490.anInt1918;
				Static30.anInt535 = local78[2] - Static490.anInt1917;
			} else {
				Static490.aClass6_Sub5_Sub2_2.method1832(Static51.anInt910, local78, Static485.anInt8586);
				if (local78 != null) {
					Static441.anInt3925 = local78[1] - Static490.anInt1918;
					Static30.anInt535 = local78[2] - Static490.anInt1917;
				}
				Static51.anInt910 = -1;
				Static485.anInt8586 = -1;
				Static376.aBoolean471 = false;
			}
			if (Static490.aClass6_Sub5_Sub2_2.anInt2009 == 37) {
				Static490.aFloat34 = 3.0F;
				Static490.aFloat33 = 3.0F;
			} else if (Static490.aClass6_Sub5_Sub2_2.anInt2009 == 50) {
				Static490.aFloat34 = 4.0F;
				Static490.aFloat33 = 4.0F;
			} else if (Static490.aClass6_Sub5_Sub2_2.anInt2009 == 75) {
				Static490.aFloat34 = 6.0F;
				Static490.aFloat33 = 6.0F;
			} else if (Static490.aClass6_Sub5_Sub2_2.anInt2009 == 100) {
				Static490.aFloat34 = 8.0F;
				Static490.aFloat33 = 8.0F;
			} else if (Static490.aClass6_Sub5_Sub2_2.anInt2009 == 200) {
				Static490.aFloat34 = 16.0F;
				Static490.aFloat33 = 16.0F;
			} else {
				Static490.aFloat34 = 8.0F;
				Static490.aFloat33 = 8.0F;
			}
			Static490.anInt1909 = (int) Static490.aFloat34 >> 1;
			Static490.aByteArrayArrayArray3 = Static69.method978(Static490.anInt1909);
			Static563.method7799();
			Static490.method1737();
			Static288.aClass298_170 = new Class298();
			Static490.anInt1911 += (int) (Math.random() * 5.0D) - 2;
			if (Static490.anInt1911 < -8) {
				Static490.anInt1911 = -8;
			}
			if (Static490.anInt1911 > 8) {
				Static490.anInt1911 = 8;
			}
			Static490.anInt1910 += (int) (Math.random() * 5.0D) - 2;
			if (Static490.anInt1910 < -16) {
				Static490.anInt1910 = -16;
			}
			if (Static490.anInt1910 > 16) {
				Static490.anInt1910 = 16;
			}
			Static490.method1751(arg1, Static490.anInt1911 >> 2 << 10, Static490.anInt1910 >> 1);
			Static490.aClass320_2.method7204(1024, 256);
			Static490.aClass274_2.method6289(256, 256);
			Static490.aClass27_3.method523(4096);
			Static344.aClass173_1.method4047(256);
			Static91.anInt1503 = 20;
		} else if (Static91.anInt1503 == 20) {
			Static393.method5724(true);
			Static490.method1753(arg0, Static490.anInt1911, Static490.anInt1910);
			Static91.anInt1503 = 60;
			Static393.method5724(true);
			Static320.method4969();
		} else if (Static91.anInt1503 == 60) {
			if (Static490.aClass248_19.method5791(Static490.aClass6_Sub5_Sub2_2.aString12 + "_staticelements")) {
				if (!Static490.aClass248_19.method5803(Static490.aClass6_Sub5_Sub2_2.aString12 + "_staticelements")) {
					return;
				}
				Static490.aClass170_2 = Static458.method6414(Static490.aClass6_Sub5_Sub2_2.aString12 + "_staticelements", Static485.aBoolean557, Static490.aClass248_19);
			} else {
				Static490.aClass170_2 = new Class170(0);
			}
			Static490.method1744();
			Static91.anInt1503 = 70;
			Static393.method5724(true);
			Static320.method4969();
		} else if (Static91.anInt1503 == 70) {
			Static319.aClass329_3 = new Class329(arg0, 11, true, Static77.aCanvas1);
			Static91.anInt1503 = 73;
			Static393.method5724(true);
			Static320.method4969();
		} else if (Static91.anInt1503 == 73) {
			Static404.aClass329_8 = new Class329(arg0, 12, true, Static77.aCanvas1);
			Static91.anInt1503 = 76;
			Static393.method5724(true);
			Static320.method4969();
		} else if (Static91.anInt1503 == 76) {
			Static208.aClass329_5 = new Class329(arg0, 14, true, Static77.aCanvas1);
			Static91.anInt1503 = 79;
			Static393.method5724(true);
			Static320.method4969();
		} else if (Static91.anInt1503 == 79) {
			Static504.aClass329_9 = new Class329(arg0, 17, true, Static77.aCanvas1);
			Static91.anInt1503 = 82;
			Static393.method5724(true);
			Static320.method4969();
		} else if (Static91.anInt1503 == 82) {
			Static202.aClass329_4 = new Class329(arg0, 19, true, Static77.aCanvas1);
			Static91.anInt1503 = 85;
			Static393.method5724(true);
			Static320.method4969();
		} else if (Static91.anInt1503 == 85) {
			Static311.aClass329_6 = new Class329(arg0, 22, true, Static77.aCanvas1);
			Static91.anInt1503 = 88;
			Static393.method5724(true);
			Static320.method4969();
		} else if (Static91.anInt1503 == 88) {
			Static180.aClass329_1 = new Class329(arg0, 26, true, Static77.aCanvas1);
			Static91.anInt1503 = 91;
			Static393.method5724(true);
			Static320.method4969();
		} else {
			Static362.aClass329_7 = new Class329(arg0, 30, true, Static77.aCanvas1);
			Static91.anInt1503 = 100;
			Static393.method5724(true);
			Static320.method4969();
			System.gc();
		}
	}

	@OriginalMember(owner = "client!il", name = "a", descriptor = "(Lclient!oa;B)V")
	public static void method3556(@OriginalArg(0) Class90 arg0) {
		@Pc(7) int local7 = Static420.anInt8173;
		@Pc(9) int local9 = Static308.anInt5670;
		@Pc(11) int local11 = Static237.anInt4304;
		@Pc(13) int local13 = Static415.anInt7406;
		arg0.method7482(local9, -10660793, local11, local13, local7);
		arg0.method7482(local9 + 1, -16777216, local11 + -2, 16, local7 + 1);
		arg0.method7516(-16777216, local13 - 19, local7 + 1, local9 + 18, local11 + -2);
		Static264.aClass82_3.method7875(local9 + 14, -1, -10660793, Static146.aClass103_71.method2355(Static188.anInt28), local7 + 3);
		@Pc(80) int local80 = Static9.aClass29_1.method2946();
		@Pc(84) int local84 = Static9.aClass29_1.method2942();
		@Pc(86) int local86 = 0;
		for (@Pc(91) Class6_Sub26 local91 = (Class6_Sub26) Static408.aClass298_154.method6809(); local91 != null; local91 = (Class6_Sub26) Static408.aClass298_154.method6821()) {
			@Pc(106) int local106 = local9 + (-local86 + Static384.anInt7048 - 1) * 16 + 31;
			@Pc(108) short local108 = -1;
			if (local7 < local80 && local80 < local11 + local7 && local106 - 13 < local84 && local84 < local106 + 3 && local91.aBoolean381) {
				local108 = -256;
			}
			@Pc(141) int[] local141 = null;
			if (Static452.method6341(local91.anInt5472)) {
				local141 = Static119.aClass244_4.method5726((int) local91.aLong126).anIntArray482;
			} else if (local91.anInt5470 != -1) {
				local141 = Static119.aClass244_4.method5726(local91.anInt5470).anIntArray482;
			} else if (Static543.method7377(local91.anInt5472)) {
				@Pc(228) Class6_Sub49 local228 = (Class6_Sub49) Static251.aClass234_29.method5464((long) local91.aLong126);
				if (local228 != null) {
					@Pc(233) Class15_Sub2_Sub4_Sub1 local233 = local228.aClass15_Sub2_Sub4_Sub1_2;
					@Pc(236) Class88 local236 = local233.aClass88_1;
					if (local236.anIntArray182 != null) {
						local236 = local236.method1940(Static65.aClass51_1);
					}
					if (local236 != null) {
						local141 = local236.anIntArray184;
					}
				}
			} else if (Static252.method3929(local91.anInt5472)) {
				@Pc(197) Class192 local197;
				if (local91.anInt5472 == 1007) {
					local197 = Static85.aClass27_1.method516((int) local91.aLong126);
				} else {
					local197 = Static85.aClass27_1.method516((int) (local91.aLong126 >>> 32 & 0x7FFFFFFFL));
				}
				if (local197.lb != null) {
					local197 = local197.method4585(Static65.aClass51_1);
				}
				if (local197 != null) {
					local141 = local197.anIntArray426;
				}
			}
			@Pc(253) String local253 = Static378.method5557(local91);
			if (local141 != null) {
				local253 = local253 + Static96.method6297(local141);
			}
			Static264.aClass82_3.method7880(local108, local253, Static154.anIntArray283, local106, local7 + 3, Static241.aClass71Array29);
			local86++;
			if (local91.aBoolean380) {
				Static449.aClass71_48.method7775(local7 + Static479.aClass202_13.method4970(local253) + 5, local106 + -12);
			}
		}
		Static482.method6777(Static308.anInt5670, Static237.anInt4304, Static420.anInt8173, Static415.anInt7406);
	}
}
