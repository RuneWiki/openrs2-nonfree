import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!te", name = "V", descriptor = "Lclient!sd;")
	public static Class29 aClass29_70;

	@OriginalMember(owner = "client!te", name = "X", descriptor = "[I")
	public static int[] anIntArray432;

	@OriginalMember(owner = "client!te", name = "Z", descriptor = "Lclient!sd;")
	public static Class29 aClass29_71;

	@OriginalMember(owner = "client!te", name = "mb", descriptor = "Lclient!r;")
	public static Class5_Sub2_Sub6_Sub3 aClass5_Sub2_Sub6_Sub3_6;

	@OriginalMember(owner = "client!te", name = "S", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1242 = Static63.method1251("b12_full");

	@OriginalMember(owner = "client!te", name = "T", descriptor = "I")
	public static int anInt2827 = 0;

	@OriginalMember(owner = "client!te", name = "U", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1243 = Static63.method1251("Um ein neues Spielkonto zu erstellen)1 m-Ussen Sie");

	@OriginalMember(owner = "client!te", name = "ab", descriptor = "I")
	public static int anInt2830 = 0;

	@OriginalMember(owner = "client!te", name = "bb", descriptor = "Lclient!mb;")
	private static Class45 aClass45_1244 = Static63.method1251(" has logged in)3");

	@OriginalMember(owner = "client!te", name = "cb", descriptor = "[[I")
	public static int[][] anIntArrayArray30 = new int[104][104];

	@OriginalMember(owner = "client!te", name = "fb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1245 = Static63.method1251("blinken3:");

	@OriginalMember(owner = "client!te", name = "jb", descriptor = "Lclient!mb;")
	public static Class45 aClass45_1246 = aClass45_1244;

	@OriginalMember(owner = "client!te", name = "kb", descriptor = "I")
	public static volatile int anInt2836 = 0;

	@OriginalMember(owner = "client!te", name = "ob", descriptor = "I")
	public static int anInt2839 = 0;

	@OriginalMember(owner = "client!te", name = "e", descriptor = "(I)V")
	public static void method1943() {
		anIntArray432 = null;
		aClass29_70 = null;
		aClass45_1244 = null;
		anIntArrayArray30 = null;
		aClass45_1243 = null;
		aClass5_Sub2_Sub6_Sub3_6 = null;
		aClass45_1246 = null;
		aClass45_1245 = null;
		aClass29_71 = null;
		aClass45_1242 = null;
	}

	@OriginalMember(owner = "client!te", name = "c", descriptor = "(Z)V")
	public static void method1944() {
		if (Static89.aClass52_1 != null) {
			@Pc(3) Class52 local3 = Static89.aClass52_1;
			synchronized (Static89.aClass52_1) {
				Static89.aClass52_1 = null;
			}
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(IILclient!mb;IIILclient!mb;)V")
	public static void method1945(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class45 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class45 arg5) {
		if (Static14.anInt426 >= 500) {
			return;
		}
		if (arg2.method1317() <= 0) {
			Static35.aClass45Array10[Static14.anInt426] = arg5;
		} else {
			Static35.aClass45Array10[Static14.anInt426] = Static39.method1443(new Class45[] { arg5, Static74.aClass45_1047, arg2 });
		}
		Static2.anIntArray5[Static14.anInt426] = arg1;
		Static102.anIntArray419[Static14.anInt426] = arg4;
		Static16.anIntArray69[Static14.anInt426] = arg0;
		Static35.anIntArray163[Static14.anInt426] = arg3;
		Static14.anInt426++;
	}

	@OriginalMember(owner = "client!te", name = "f", descriptor = "(I)V")
	public static void method1946() {
		Static2.method11();
		if (Static68.anInt1957 == 1) {
			Static97.aClass5_Sub2_Sub6_Sub3Array7[Static27.anInt848 / 100].method1781(Static4.anInt102 - 8 - 4, Static88.anInt2499 - 4 + -8);
		}
		if (Static68.anInt1957 == 2) {
			Static97.aClass5_Sub2_Sub6_Sub3Array7[Static27.anInt848 / 100 + 4].method1781(Static4.anInt102 - 4 - 8, Static88.anInt2499 + -8 - 4);
		}
		if (Static16.anInt514 != -1) {
			Static27.method613(Static16.anInt514);
			Static52.method2151(334, 512, 4, Static16.anInt514);
		}
		if (Static63.anInt1837 != -1) {
			Static27.method613(Static63.anInt1837);
			Static52.method2151(334, 512, 0, Static63.anInt1837);
		}
		Static11.method237();
		if (!Static2.aBoolean2) {
			Static37.method788();
			Static36.method776();
		} else if (Static97.anInt2635 == 0) {
			Static14.method271();
		}
		if (Static119.anInt3087 == 1) {
			Static81.aClass5_Sub2_Sub6_Sub3_1.method1781(472, 296);
		}
		@Pc(141) int local141;
		if (Static49.aBoolean80) {
			@Pc(108) byte local108 = 20;
			Static78.aClass5_Sub2_Sub6_Sub1_5.method504(Static39.method1443(new Class45[] { Static93.aClass45_1086, Static76.method1476(Static67.anInt1913) }), 20, 16776960);
			@Pc(131) Runtime local131 = Runtime.getRuntime();
			@Pc(140) int local140 = (int) ((local131.totalMemory() - local131.freeMemory()) / 1024L);
			local141 = local108 + 15;
			@Pc(143) int local143 = 16776960;
			if (local140 > 32768 && Static103.aBoolean122) {
				local143 = 16711680;
			}
			if (local140 > 65536 && !Static103.aBoolean122) {
				local143 = 16711680;
			}
			Static78.aClass5_Sub2_Sub6_Sub1_5.method504(Static39.method1443(new Class45[] { Static91.aClass45_1067, Static76.method1476(local140), Static93.aClass45_1083 }), 35, local143);
			local141 += 15;
			if (Static88.aBoolean114) {
				Static78.aClass5_Sub2_Sub6_Sub1_5.method504(Static102.aClass45_1178, 50, 16711680);
				Static88.aBoolean114 = false;
				local141 += 15;
			}
			if (Static80.aBoolean103) {
				Static78.aClass5_Sub2_Sub6_Sub1_5.method504(Static55.aClass45_670, local141, 16711680);
				Static80.aBoolean103 = false;
				local141 += 15;
			}
			if (Static77.aBoolean101) {
				Static78.aClass5_Sub2_Sub6_Sub1_5.method504(Static29.aClass45_434, local141, 16711680);
				local141 += 15;
				Static77.aBoolean101 = false;
			}
		}
		if (Static53.anInt2368 == 0) {
			return;
		}
		@Pc(227) int local227 = Static53.anInt2368 / 50;
		local141 = local227 / 60;
		@Pc(235) int local235 = local227 % 60;
		if (local235 >= 10) {
			Static78.aClass5_Sub2_Sub6_Sub1_5.method506(Static39.method1443(new Class45[] { Static122.aClass45_1385, Static76.method1476(local141), Static57.aClass45_686, Static76.method1476(local235) }), 4, 329, 16776960);
		} else {
			Static78.aClass5_Sub2_Sub6_Sub1_5.method506(Static39.method1443(new Class45[] { Static122.aClass45_1385, Static76.method1476(local141), Static91.aClass45_1060, Static76.method1476(local235) }), 4, 329, 16776960);
		}
	}

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method1948(@OriginalArg(1) Component arg0) {
		@Pc(5) Method local5 = Static123.aMethod2;
		if (local5 != null) {
			try {
				local5.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static89.aClass52_1);
		arg0.addFocusListener(Static89.aClass52_1);
	}
}
