import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static153 {

	@OriginalMember(owner = "client!sb", name = "j", descriptor = "I")
	public static int anInt3629;

	@OriginalMember(owner = "client!sb", name = "d", descriptor = "Lclient!th;")
	public static Class82 aClass82_15 = new Class82();

	@OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
	public static int[] anIntArray365 = new int[25];

	@OriginalMember(owner = "client!sb", name = "g", descriptor = "Lclient!ja;")
	public static Class1_Sub8_Sub1 aClass1_Sub8_Sub1_2 = new Class1_Sub8_Sub1(5000);

	@OriginalMember(owner = "client!sb", name = "i", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1251 = Static161.method2971("Loading )2 please wait)3");

	@OriginalMember(owner = "client!sb", name = "h", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1250 = aClass13_1251;

	@OriginalMember(owner = "client!sb", name = "k", descriptor = "Lclient!dd;")
	private static Class13 aClass13_1252 = Static161.method2971("Invalid username or password)3");

	@OriginalMember(owner = "client!sb", name = "l", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1253 = Static161.method2971("<col=ffb000>");

	@OriginalMember(owner = "client!sb", name = "m", descriptor = "Lclient!dd;")
	public static Class13 aClass13_1254 = aClass13_1252;

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(Ljava/awt/Component;Lclient!ag;Lclient!ag;B)V")
	public static void method2620(@OriginalArg(0) Component arg0, @OriginalArg(1) Class4 arg1, @OriginalArg(2) Class4 arg2) {
		if (Static46.aBoolean108) {
			return;
		}
		Static128.method563();
		@Pc(15) byte[] local15 = arg2.method2243(Static56.anInt1796, 0);
		Static3.aClass1_Sub2_Sub1_Sub3_1 = new Class1_Sub2_Sub1_Sub3(local15, arg0);
		Static167.aClass1_Sub2_Sub1_Sub3_8 = Static3.aClass1_Sub2_Sub1_Sub3_1.method411();
		Static49.aClass1_Sub2_Sub1_Sub4_2 = Static18.method662(Static95.anInt2769, arg1);
		Static183.aClass1_Sub2_Sub1_Sub4_4 = Static18.method662(Static182.anInt937, arg1);
		Static80.aClass1_Sub2_Sub1_Sub4_3 = Static18.method662(Static118.anInt3125, arg1);
		Static120.aClass1_Sub2_Sub1_Sub4Array11 = Static164.method2806(Static143.anInt3527, arg1);
		Static182.aClass1_Sub2_Sub1_Sub4Array6 = Static164.method2806(Static159.anInt3768, arg1);
		Static65.anIntArray200 = new int[256];
		for (@Pc(54) int local54 = 0; local54 < 64; local54++) {
			Static65.anIntArray200[local54] = local54 * 262144;
		}
		for (@Pc(68) int local68 = 0; local68 < 64; local68++) {
			Static65.anIntArray200[local68 + 64] = local68 * 1024 + 16711680;
		}
		for (@Pc(86) int local86 = 0; local86 < 64; local86++) {
			Static65.anIntArray200[local86 + 128] = local86 * 4 + 16776960;
		}
		for (@Pc(104) int local104 = 0; local104 < 64; local104++) {
			Static65.anIntArray200[local104 + 192] = 16777215;
		}
		Static8.anIntArray34 = new int[256];
		for (@Pc(121) int local121 = 0; local121 < 64; local121++) {
			Static8.anIntArray34[local121] = local121 * 1024;
		}
		for (@Pc(135) int local135 = 0; local135 < 64; local135++) {
			Static8.anIntArray34[local135 + 64] = local135 * 4 + 65280;
		}
		for (@Pc(153) int local153 = 0; local153 < 64; local153++) {
			Static8.anIntArray34[local153 + 128] = local153 * 262144 + 65535;
		}
		for (@Pc(172) int local172 = 0; local172 < 64; local172++) {
			Static8.anIntArray34[local172 + 192] = 16777215;
		}
		Static10.anIntArray47 = new int[256];
		for (@Pc(191) int local191 = 0; local191 < 64; local191++) {
			Static10.anIntArray47[local191] = local191 * 4;
		}
		for (@Pc(205) int local205 = 0; local205 < 64; local205++) {
			Static10.anIntArray47[local205 + 64] = local205 * 262144 + 255;
		}
		for (@Pc(224) int local224 = 0; local224 < 64; local224++) {
			Static10.anIntArray47[local224 + 128] = local224 * 1024 + 16711935;
		}
		for (@Pc(245) int local245 = 0; local245 < 64; local245++) {
			Static10.anIntArray47[local245 + 192] = 16777215;
		}
		Static19.anIntArray102 = new int[256];
		Static35.anIntArray128 = new int[32768];
		Static73.anIntArray224 = new int[32768];
		Static52.method1289(null);
		if (Static62.anInt2602 == 0) {
			Static43.aBoolean100 = true;
		} else {
			Static43.aBoolean100 = false;
		}
		Static122.aClass13_1065 = Static122.aClass13_1063;
		Static95.aBoolean208 = false;
		Static98.anIntArray392 = new int[32768];
		Static122.aClass13_1057 = Static122.aClass13_1063;
		Static60.anInt1884 = 0;
		Static68.anIntArray208 = new int[32768];
		if (Static43.aBoolean100) {
			Static148.method2592();
		} else {
			Static139.method2502(255, Static51.anInt1674, Static144.aClass4_Sub1_47);
		}
		Static138.method2477(false);
		Static46.aBoolean108 = true;
		Static3.aClass1_Sub2_Sub1_Sub3_1.method400(0, 0);
		Static167.aClass1_Sub2_Sub1_Sub3_8.method400(382, 0);
		Static49.aClass1_Sub2_Sub1_Sub4_2.method570(382 - Static49.aClass1_Sub2_Sub1_Sub4_2.anInt514 / 2, 18);
		Static38.aClass1_Sub2_Sub1_Sub3_3 = new Class1_Sub2_Sub1_Sub3(128, 254);
		Static138.aClass1_Sub2_Sub1_Sub3_7 = new Class1_Sub2_Sub1_Sub3(128, 254);
	}

	@OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V")
	public static void method2621() {
		aClass1_Sub8_Sub1_2 = null;
		aClass13_1253 = null;
		aClass13_1254 = null;
		aClass82_15 = null;
		aClass13_1250 = null;
		anIntArray365 = null;
		aClass13_1252 = null;
		aClass13_1251 = null;
	}
}
