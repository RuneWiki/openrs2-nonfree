import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!mf", name = "N", descriptor = "I")
	public static int anInt3355;

	@OriginalMember(owner = "client!mf", name = "W", descriptor = "Lclient!t;")
	public static Class5_Sub2_Sub2_Sub3_Sub2 aClass5_Sub2_Sub2_Sub3_Sub2_10;

	@OriginalMember(owner = "client!mf", name = "X", descriptor = "Lclient!gf;")
	public static Class30 aClass30_14;

	@OriginalMember(owner = "client!mf", name = "Q", descriptor = "[I")
	public static int[] anIntArray444 = new int[100];

	@OriginalMember(owner = "client!mf", name = "U", descriptor = "Lclient!r;")
	public static Class61 aClass61_1086 = Static129.method2060("::rect_debug");

	@OriginalMember(owner = "client!mf", name = "Y", descriptor = "Lclient!r;")
	public static Class61 aClass61_1087 = Static129.method2060("Konfig geladen)3");

	@OriginalMember(owner = "client!mf", name = "d", descriptor = "(I)V")
	public static void method2177() {
		anIntArray444 = null;
		aClass5_Sub2_Sub2_Sub3_Sub2_10 = null;
		aClass30_14 = null;
		aClass61_1086 = null;
		aClass61_1087 = null;
	}

	@OriginalMember(owner = "client!mf", name = "f", descriptor = "(I)Lclient!lc;")
	public static Class47 method2180() {
		try {
			return (Class47) Class.forName("Class47_Sub2").getDeclaredConstructor().newInstance();
		} catch (@Pc(15) Throwable local15) {
			return new Class47_Sub1();
		}
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Lclient!df;Lclient!df;B)V")
	public static void method2181(@OriginalArg(0) Class5_Sub2_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) Class5_Sub2_Sub1_Sub1_Sub1 arg1) {
		if (Static13.aClass5_Sub2_Sub1_Sub4Array2 == null) {
			Static13.aClass5_Sub2_Sub1_Sub4Array2 = Static103.method1745(Static47.aClass26_Sub1_8, Static77.aClass61_588, Static112.aClass61_882);
		}
		if (Static121.aClass5_Sub2_Sub1_Sub3Array35 == null) {
			Static121.aClass5_Sub2_Sub1_Sub3Array35 = Static23.method499(Static112.aClass61_882, Static47.aClass26_Sub1_8, Static133.aClass61_1095);
		}
		if (Static108.aClass5_Sub2_Sub1_Sub3Array2 == null) {
			Static108.aClass5_Sub2_Sub1_Sub3Array2 = Static23.method499(Static112.aClass61_882, Static47.aClass26_Sub1_8, Static96.aClass61_744);
		}
		if (Static28.aClass5_Sub2_Sub1_Sub3Array16 == null) {
			Static28.aClass5_Sub2_Sub1_Sub3Array16 = Static23.method499(Static112.aClass61_882, Static47.aClass26_Sub1_8, Static117.aClass61_933);
		}
		Static46.method2001(0, 23, 765, 480, 0);
		Static46.method1990(0, 0, 125, 23, 12425273, 9135624);
		Static46.method1990(125, 0, 640, 23, 5197647, 2697513);
		arg0.method555(Static71.aClass61_530, 62, 15, 0, -1);
		if (Static28.aClass5_Sub2_Sub1_Sub3Array16 != null) {
			Static28.aClass5_Sub2_Sub1_Sub3Array16[1].method1354(140, 1);
			arg1.method558(Static124.aClass61_981, 152, 10, 16777215, -1);
			Static28.aClass5_Sub2_Sub1_Sub3Array16[0].method1354(140, 12);
			arg1.method558(Static41.aClass61_664, 152, 21, 16777215, -1);
		}
		if (Static108.aClass5_Sub2_Sub1_Sub3Array2 != null) {
			if (Static70.anIntArray252[0] == 0 && Static76.anIntArray267[0] == 0) {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[2].method1354(280, 4);
			} else {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[0].method1354(280, 4);
			}
			if (Static70.anIntArray252[0] == 0 && Static76.anIntArray267[0] == 1) {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[3].method1354(295, 4);
			} else {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[1].method1354(295, 4);
			}
			arg0.method558(Static39.aClass61_312, 312, 17, 16777215, -1);
			if (Static70.anIntArray252[0] == 1 && Static76.anIntArray267[0] == 0) {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[2].method1354(390, 4);
			} else {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[0].method1354(390, 4);
			}
			if (Static70.anIntArray252[0] == 1 && Static76.anIntArray267[0] == 1) {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[3].method1354(405, 4);
			} else {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[1].method1354(405, 4);
			}
			arg0.method558(Static99.aClass61_764, 422, 17, 16777215, -1);
			if (Static70.anIntArray252[0] == 2 && Static76.anIntArray267[0] == 0) {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[2].method1354(500, 4);
			} else {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[0].method1354(500, 4);
			}
			if (Static70.anIntArray252[0] == 2 && Static76.anIntArray267[0] == 1) {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[3].method1354(515, 4);
			} else {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[1].method1354(515, 4);
			}
			arg0.method558(Static23.aClass61_211, 532, 17, 16777215, -1);
			if (Static70.anIntArray252[0] == 3 && Static76.anIntArray267[0] == 0) {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[2].method1354(610, 4);
			} else {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[0].method1354(610, 4);
			}
			if (Static70.anIntArray252[0] == 3 && Static76.anIntArray267[0] == 1) {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[3].method1354(625, 4);
			} else {
				Static108.aClass5_Sub2_Sub1_Sub3Array2[1].method1354(625, 4);
			}
			arg0.method558(Static99.aClass61_772, 642, 17, 16777215, -1);
		}
		Static46.method2001(708, 4, 50, 16, 0);
		arg1.method555(Static76.aClass61_572, 733, 16, 16777215, -1);
		Static20.anInt636 = -1;
		if (Static13.aClass5_Sub2_Sub1_Sub4Array2 == null) {
			return;
		}
		@Pc(393) int local393 = 8;
		@Pc(399) int local399 = 24;
		@Pc(401) int local401;
		@Pc(403) int local403;
		do {
			local401 = local399;
			local403 = local393;
			if ((local393 - 1) * local399 >= Static89.anInt2361) {
				local393--;
			}
			if ((local399 - 1) * local393 >= Static89.anInt2361) {
				local399--;
			}
			if (Static89.anInt2361 <= local393 * (local399 - 1)) {
				local399--;
			}
		} while (local399 != local401 || local393 != local403);
		local401 = (765 - local393 * 88) / (local393 + 1);
		if (local401 > 5) {
			local401 = 5;
		}
		@Pc(470) int local470 = (765 - local393 * 88 - (local393 - 1) * local401) / 2;
		@Pc(472) int local472 = local470;
		local403 = (480 - local399 * 19) / (local399 - -1);
		@Pc(484) int local484 = 0;
		if (local403 > 5) {
			local403 = 5;
		}
		@Pc(504) int local504 = (480 - local399 * 19 - local403 * (local399 - 1)) / 2;
		@Pc(508) int local508 = local504 + 23;
		for (@Pc(510) int local510 = 0; local510 < Static89.anInt2361; local510++) {
			@Pc(516) Class18 local516 = Static39.aClass18Array1[local510];
			@Pc(518) boolean local518 = true;
			@Pc(523) Class61 local523 = Static39.method730(local516.anInt903);
			if (local516.anInt903 == -1) {
				local523 = Static71.aClass61_537;
				local518 = false;
			} else if (local516.anInt903 > 1980) {
				local518 = false;
				local523 = Static96.aClass61_747;
			}
			if (Static30.anInt917 >= local472 && local508 <= Static40.anInt1073 && local472 + 88 > Static30.anInt917 && local508 + 19 > Static40.anInt1073 && local518) {
				Static20.anInt636 = local510;
				Static13.aClass5_Sub2_Sub1_Sub4Array2[local516.aBoolean25 ? 1 : 0].method2011(local472, local508);
			} else {
				Static13.aClass5_Sub2_Sub1_Sub4Array2[local516.aBoolean25 ? 1 : 0].method2026(local472, local508);
			}
			if (Static121.aClass5_Sub2_Sub1_Sub3Array35 != null) {
				Static121.aClass5_Sub2_Sub1_Sub3Array35[local516.anInt908 + (local516.aBoolean25 ? 8 : 0)].method1354(local472 + 29, local508);
			}
			arg0.method555(Static39.method730(local516.anInt907), local472 + 15, local508 + 9 - -5, 0, -1);
			arg1.method555(local523, local472 + 60, local508 + 5 - -9, 268435455, -1);
			local508 += local403 + 19;
			@Pc(661) int local661 = ~local399;
			local484++;
			if (local661 >= ~local484) {
				local472 += local401 + 88;
				local484 = 0;
				local508 = local504 + 23;
			}
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(Ljava/awt/Component;I)V")
	public static void method2182(@OriginalArg(0) Component arg0) {
		@Pc(9) Method local9 = Static128.aMethod1;
		if (local9 != null) {
			try {
				local9.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(23) Throwable local23) {
			}
		}
		arg0.addKeyListener(Static127.aClass44_1);
		arg0.addFocusListener(Static127.aClass44_1);
	}
}
