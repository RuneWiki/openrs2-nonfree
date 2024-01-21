import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "h", descriptor = "Lclient!mb;")
	public static Class10_Sub1 aClass10_Sub1_1;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public static int anInt72;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!ai;")
	private static Class6 aClass6_37 = Static38.method685("Please reload this page)3");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "Lclient!ai;")
	public static Class6 aClass6_30 = aClass6_37;

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "[I")
	public static int[] anIntArray1 = new int[100];

	@OriginalMember(owner = "client!ac", name = "c", descriptor = "I")
	public static int anInt70 = 0;

	@OriginalMember(owner = "client!ac", name = "d", descriptor = "Lclient!ai;")
	private static Class6 aClass6_31 = Static38.method685("Continue");

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!ai;")
	public static Class6 aClass6_32 = aClass6_31;

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "Lclient!ai;")
	private static Class6 aClass6_33 = Static38.method685("Please remove ");

	@OriginalMember(owner = "client!ac", name = "g", descriptor = "Lclient!ai;")
	public static Class6 aClass6_34 = Static38.method685("Lade Konfiguration )2 ");

	@OriginalMember(owner = "client!ac", name = "i", descriptor = "Lclient!wf;")
	public static Class2_Sub25 aClass2_Sub25_1 = new Class2_Sub25(0, 0);

	@OriginalMember(owner = "client!ac", name = "j", descriptor = "Lclient!ai;")
	public static Class6 aClass6_35 = aClass6_33;

	@OriginalMember(owner = "client!ac", name = "k", descriptor = "Lclient!ai;")
	public static Class6 aClass6_36 = Static38.method685("Schlie-8en");

	@OriginalMember(owner = "client!ac", name = "m", descriptor = "Lclient!ai;")
	public static Class6 aClass6_38 = aClass6_33;

	@OriginalMember(owner = "client!ac", name = "r", descriptor = "Lclient!ai;")
	private static Class6 aClass6_41 = Static38.method685("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!ai;")
	public static Class6 aClass6_39 = aClass6_41;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "Lclient!ai;")
	public static Class6 aClass6_40 = Static38.method685(" loggt sich aus)3");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!c;Lclient!c;ZLjava/awt/Component;)V")
	public static void method50(@OriginalArg(0) Class10 arg0, @OriginalArg(1) Class10 arg1, @OriginalArg(3) Component arg2) {
		if (Static3.aBoolean4) {
			return;
		}
		Static53.method2483();
		@Pc(15) byte[] local15 = arg0.method1595(Static13.aClass6_112, Static9.aClass6_75);
		Static132.aClass2_Sub3_Sub2_Sub1_6 = new Class2_Sub3_Sub2_Sub1(local15, arg2);
		Static173.aClass2_Sub3_Sub2_Sub1_7 = Static132.aClass2_Sub3_Sub2_Sub1_6.method276();
		Static113.aClass2_Sub3_Sub2_Sub3_3 = Static128.method1968(arg1, Static9.aClass6_75, Static180.aClass6_1273);
		Static171.aClass2_Sub3_Sub2_Sub3_5 = Static128.method1968(arg1, Static9.aClass6_75, Static182.aClass6_1279);
		Static152.aClass2_Sub3_Sub2_Sub3_4 = Static128.method1968(arg1, Static9.aClass6_75, Static132.aClass6_888);
		Static138.aClass2_Sub3_Sub2_Sub3Array6 = Static90.method2633(Static170.aClass6_1185, Static9.aClass6_75, arg1);
		Static68.aClass2_Sub3_Sub2_Sub3Array3 = Static90.method2633(Static136.aClass6_925, Static9.aClass6_75, arg1);
		Static43.anIntArray68 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static43.anIntArray68[local59] = local59 * 262144;
		}
		for (@Pc(73) int local73 = 0; local73 < 64; local73++) {
			Static43.anIntArray68[local73 + 64] = local73 * 1024 + 16711680;
		}
		for (@Pc(93) int local93 = 0; local93 < 64; local93++) {
			Static43.anIntArray68[local93 + 128] = local93 * 4 + 16776960;
		}
		for (@Pc(113) int local113 = 0; local113 < 64; local113++) {
			Static43.anIntArray68[local113 + 192] = 16777215;
		}
		Static14.anIntArray15 = new int[256];
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			Static14.anIntArray15[local130] = local130 * 1024;
		}
		for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
			Static14.anIntArray15[local146 + 64] = local146 * 4 + 65280;
		}
		for (@Pc(166) int local166 = 0; local166 < 64; local166++) {
			Static14.anIntArray15[local166 + 128] = local166 * 262144 + 65535;
		}
		for (@Pc(186) int local186 = 0; local186 < 64; local186++) {
			Static14.anIntArray15[local186 + 192] = 16777215;
		}
		Static14.anIntArray17 = new int[256];
		for (@Pc(205) int local205 = 0; local205 < 64; local205++) {
			Static14.anIntArray17[local205] = local205 * 4;
		}
		for (@Pc(219) int local219 = 0; local219 < 64; local219++) {
			Static14.anIntArray17[local219 + 64] = local219 * 262144 + 255;
		}
		for (@Pc(239) int local239 = 0; local239 < 64; local239++) {
			Static14.anIntArray17[local239 + 128] = local239 * 1024 + 16711935;
		}
		for (@Pc(257) int local257 = 0; local257 < 64; local257++) {
			Static14.anIntArray17[local257 + 192] = 16777215;
		}
		Static11.anIntArray7 = new int[32768];
		Static67.anIntArray114 = new int[256];
		Static120.anIntArray243 = new int[32768];
		Static105.method1732(null);
		Static138.aBoolean134 = false;
		Static135.anInt3134 = 0;
		Static9.aClass6_72 = Static9.aClass6_75;
		Static177.anIntArray400 = new int[32768];
		Static9.aClass6_79 = Static9.aClass6_75;
		if (Static81.anInt1983 == 0) {
			Static68.aBoolean64 = true;
		} else {
			Static68.aBoolean64 = false;
		}
		Static40.anIntArray59 = new int[32768];
		if (Static68.aBoolean64) {
			Static129.method2791();
		} else {
			Static176.method2763(Static9.aClass6_75, Static177.aClass6_1245, Static5.aClass10_Sub1_2);
		}
		Static90.method2635(false);
		Static3.aBoolean4 = true;
		Static132.aClass2_Sub3_Sub2_Sub1_6.method272(0, 0);
		Static173.aClass2_Sub3_Sub2_Sub1_7.method272(382, 0);
		Static113.aClass2_Sub3_Sub2_Sub3_3.method2398(382 - Static113.aClass2_Sub3_Sub2_Sub3_3.anInt3620 / 2, 18);
		Static120.aClass2_Sub3_Sub2_Sub1_4 = new Class2_Sub3_Sub2_Sub1(128, 254);
		Static31.aClass2_Sub3_Sub2_Sub1_1 = new Class2_Sub3_Sub2_Sub1(128, 254);
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method51() {
		anIntArray1 = null;
		aClass6_36 = null;
		aClass6_33 = null;
		aClass6_39 = null;
		aClass6_37 = null;
		aClass6_40 = null;
		aClass6_31 = null;
		aClass2_Sub25_1 = null;
		aClass10_Sub1_1 = null;
		aClass6_41 = null;
		aClass6_30 = null;
		aClass6_34 = null;
		aClass6_32 = null;
		aClass6_38 = null;
		aClass6_35 = null;
	}
}
