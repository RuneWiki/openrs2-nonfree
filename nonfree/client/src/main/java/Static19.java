import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static19 {

	@OriginalMember(owner = "client!cf", name = "d", descriptor = "Lclient!ld;")
	public static Class43 aClass43_1;

	@OriginalMember(owner = "client!cf", name = "h", descriptor = "[Lclient!qb;")
	public static Class3_Sub1_Sub4_Sub3[] aClass3_Sub1_Sub4_Sub3Array5;

	@OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
	public static int anInt512 = 0;

	@OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
	public static int anInt514 = 0;

	@OriginalMember(owner = "client!cf", name = "i", descriptor = "Lclient!he;")
	public static Class26 aClass26_301 = Static6.method100("(Z");

	@OriginalMember(owner = "client!cf", name = "j", descriptor = "Lclient!he;")
	public static Class26 aClass26_302 = Static6.method100(")4lang)4de");

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V")
	public static void method349() {
		aClass3_Sub1_Sub4_Sub3Array5 = null;
		aClass26_301 = null;
		aClass26_302 = null;
		aClass43_1 = null;
	}

	@OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lclient!ef;Lclient!ef;BLjava/awt/Component;)V")
	public static void method350(@OriginalArg(0) Class16 arg0, @OriginalArg(1) Class16 arg1, @OriginalArg(3) Component arg2) {
		if (Static79.aBoolean117) {
			return;
		}
		Static77.method2222();
		@Pc(15) byte[] local15 = arg1.method573(Static44.aClass26_711, Static55.aClass26_831);
		Static109.aClass3_Sub1_Sub4_Sub3_5 = new Class3_Sub1_Sub4_Sub3(local15, arg2);
		Static55.aClass3_Sub1_Sub4_Sub3_2 = Static109.aClass3_Sub1_Sub4_Sub3_5.method1750();
		Static52.aClass3_Sub1_Sub4_Sub1_7 = Static2.method9(Static55.aClass26_831, Static133.aClass26_313, arg0);
		Static39.aClass3_Sub1_Sub4_Sub1_6 = Static2.method9(Static55.aClass26_831, Static2.aClass26_7, arg0);
		Static31.aClass3_Sub1_Sub4_Sub1_8 = Static2.method9(Static55.aClass26_831, Static72.aClass26_1035, arg0);
		Static131.aClass3_Sub1_Sub4_Sub1Array11 = Static103.method1905(Static55.aClass26_831, arg0, Static118.aClass26_1673);
		Static133.aClass3_Sub1_Sub4_Sub1Array5 = Static103.method1905(Static55.aClass26_831, arg0, Static36.aClass26_607);
		Static106.anIntArray344 = new int[256];
		for (@Pc(59) int local59 = 0; local59 < 64; local59++) {
			Static106.anIntArray344[local59] = local59 * 262144;
		}
		for (@Pc(75) int local75 = 0; local75 < 64; local75++) {
			Static106.anIntArray344[local75 + 64] = local75 * 1024 + 16711680;
		}
		for (@Pc(95) int local95 = 0; local95 < 64; local95++) {
			Static106.anIntArray344[local95 + 128] = local95 * 4 + 16776960;
		}
		for (@Pc(113) int local113 = 0; local113 < 64; local113++) {
			Static106.anIntArray344[local113 + 192] = 16777215;
		}
		Static130.anIntArray407 = new int[256];
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			Static130.anIntArray407[local130] = local130 * 1024;
		}
		for (@Pc(146) int local146 = 0; local146 < 64; local146++) {
			Static130.anIntArray407[local146 + 64] = local146 * 4 + 65280;
		}
		for (@Pc(164) int local164 = 0; local164 < 64; local164++) {
			Static130.anIntArray407[local164 + 128] = local164 * 262144 + 65535;
		}
		for (@Pc(182) int local182 = 0; local182 < 64; local182++) {
			Static130.anIntArray407[local182 + 192] = 16777215;
		}
		Static2.anIntArray3 = new int[256];
		for (@Pc(199) int local199 = 0; local199 < 64; local199++) {
			Static2.anIntArray3[local199] = local199 * 4;
		}
		for (@Pc(213) int local213 = 0; local213 < 64; local213++) {
			Static2.anIntArray3[local213 + 64] = local213 * 262144 + 255;
		}
		for (@Pc(236) int local236 = 0; local236 < 64; local236++) {
			Static2.anIntArray3[local236 + 128] = local236 * 1024 + 16711935;
		}
		for (@Pc(254) int local254 = 0; local254 < 64; local254++) {
			Static2.anIntArray3[local254 + 192] = 16777215;
		}
		Static119.anIntArray380 = new int[256];
		Static87.anIntArray292 = new int[32768];
		Static106.anIntArray340 = new int[32768];
		Static4.method70(null);
		Static118.anIntArray376 = new int[32768];
		if (Static56.anInt1720 == 0) {
			Static55.aBoolean87 = true;
		} else {
			Static55.aBoolean87 = false;
		}
		Static55.aClass26_829 = Static55.aClass26_831;
		Static55.aClass26_832 = Static55.aClass26_831;
		Static90.anInt2491 = 0;
		Static78.aBoolean105 = false;
		Static124.anIntArray384 = new int[32768];
		if (Static55.aBoolean87) {
			Static53.method1089();
		} else {
			Static52.method1086(Static14.aClass26_209, Static89.aClass16_Sub1_12, Static55.aClass26_831);
		}
		Static58.method1182(false);
		Static79.aBoolean117 = true;
		Static109.aClass3_Sub1_Sub4_Sub3_5.method1749(0, 0);
		Static55.aClass3_Sub1_Sub4_Sub3_2.method1749(382, 0);
		Static52.aClass3_Sub1_Sub4_Sub1_7.method345(382 - Static52.aClass3_Sub1_Sub4_Sub1_7.anInt509 / 2, 18);
	}
}
