import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
	public static int anInt1008;

	@OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
	public static int anInt1010;

	@OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
	public static int anInt1001 = 0;

	@OriginalMember(owner = "client!ef", name = "e", descriptor = "Lclient!wd;")
	public static Class82 aClass82_3 = new Class82(4096);

	@OriginalMember(owner = "client!ef", name = "j", descriptor = "Lclient!qf;")
	public static Class60 aClass60_385 = Static59.method1195("scrollen:");

	@OriginalMember(owner = "client!ef", name = "k", descriptor = "Lclient!qf;")
	public static Class60 aClass60_386 = Static59.method1195("Hier wechseln");

	@OriginalMember(owner = "client!ef", name = "m", descriptor = "[I")
	public static int[] anIntArray125 = new int[] { 0, 0, 2, -2, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 4, -2, 0, 12, 0, 0, -2, 0, 0, 0, 0, 3, 5, 0, -2, 0, 0, -2, 15, 0, 0, -2, 0, 0, 0, 0, 0, 3, -2, -2, 0, 0, 0, 0, 0, 0, 0, -2, 0, 6, 0, 6, 0, 2, 0, 0, -1, 0, 4, 1, 6, 0, 0, 0, 0, 4, 0, 0, 2, 1, -1, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0, 0, 0, 1, 0, 0, 2, 0, 0, 0, 0, 3, 0, 0, 0, 2, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 5, 2, 6, 0, 0, 0, 0, 0, 8, 0, 0, 0, 4, 0, 4, 0, 0, 0, 0, 1, 0, 0, 0, 0, -2, 0, 0, 0, 0, 0, 0, 5, 0, 0, -1, 0, 0, 0, 6, 0, 0, -1, 6, 0, 0, -2, 11, 0, 0, 0, 0, 0, 0, -1, 4, 0, 0, 7, 0, 0, -1, 0, 0, 2, 6, 0, 0, 0, 0, 0, 0, 6, 6, 0, 0, 2, -2, 0, 0, 0, 0, 0, 6, 3, 2, 0, 1, 0, 0, 6, 0, 4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 11, 10, 2, 14, 0, 0, 5, 0, 0, 0, 0, 0, 4, 0, 1, 0, 0, 7, 0, 0, 3, 0, 0, 6, 0, 0, 10, 2, 8, 0, 0, 2 };

	@OriginalMember(owner = "client!ef", name = "q", descriptor = "Lclient!qf;")
	private static Class60 aClass60_390 = Static59.method1195("wishes to trade with you)3");

	@OriginalMember(owner = "client!ef", name = "n", descriptor = "Lclient!qf;")
	public static Class60 aClass60_387 = aClass60_390;

	@OriginalMember(owner = "client!ef", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_388 = Static59.method1195("hel");

	@OriginalMember(owner = "client!ef", name = "p", descriptor = "Lclient!qf;")
	public static Class60 aClass60_389 = Static59.method1195(":");

	@OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
	public static int anInt1009 = 0;

	@OriginalMember(owner = "client!ef", name = "t", descriptor = "Lclient!qf;")
	public static Class60 aClass60_391 = Static59.method1195("Anmelde)2Limit -Uberschritten)3");

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V")
	public static void method662() {
		aClass60_386 = null;
		aClass60_391 = null;
		aClass60_390 = null;
		aClass60_385 = null;
		aClass60_387 = null;
		anIntArray125 = null;
		aClass82_3 = null;
		aClass60_388 = null;
		aClass60_389 = null;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(BI)V")
	public static void method663(@OriginalArg(1) int arg0) {
		if (arg0 == -1 && !Static31.aBoolean34) {
			Static125.method2258();
		} else if (arg0 != -1 && arg0 != Static52.anInt1727 && Static34.anInt1185 != 0 && !Static31.aBoolean34) {
			Static76.method1560(Static41.aClass25_Sub1_7, 0, Static34.anInt1185, arg0);
		}
		Static52.anInt1727 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
	public static void method664() {
		for (@Pc(14) Class3_Sub7 local14 = (Class3_Sub7) Static80.aClass5_18.method92(); local14 != null; local14 = (Class3_Sub7) Static80.aClass5_18.method90()) {
			if (local14.anInt799 > 0) {
				local14.anInt799--;
			}
			if (local14.anInt799 != 0) {
				if (local14.anInt790 > 0) {
					local14.anInt790--;
				}
				if (local14.anInt790 == 0 && local14.anInt797 >= 1 && local14.anInt792 >= 1 && local14.anInt797 <= 102 && local14.anInt792 <= 102 && (local14.anInt802 < 0 || Static12.method336(local14.anInt791, local14.anInt802))) {
					Static11.method318(local14.anInt797, local14.anInt787, local14.anInt795, local14.anInt791, local14.anInt801, local14.anInt802, local14.anInt792);
					local14.anInt790 = -1;
					if (local14.anInt798 == local14.anInt802 && local14.anInt798 == -1) {
						local14.method2264();
					} else if (local14.anInt802 == local14.anInt798 && local14.anInt800 == local14.anInt801 && local14.anInt791 == local14.anInt796) {
						local14.method2264();
					}
				}
			} else if (local14.anInt798 < 0 || Static12.method336(local14.anInt796, local14.anInt798)) {
				Static11.method318(local14.anInt797, local14.anInt787, local14.anInt795, local14.anInt796, local14.anInt800, local14.anInt798, local14.anInt792);
				local14.method2264();
			}
		}
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lclient!qf;ZLclient!qf;Lclient!qf;)V")
	public static void method665(@OriginalArg(0) Class60 arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		Static105.aClass60_1273 = arg2;
		Static105.aClass60_1284 = arg1;
		Static105.aClass60_1278 = arg0;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
	public static void method666() {
		Static19.aClass17_54.method646();
	}

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(BI)V")
	public static void method667(@OriginalArg(1) int arg0) {
		for (@Pc(6) Class3_Sub4 local6 = (Class3_Sub4) Static82.aClass82_9.method2306(); local6 != null; local6 = (Class3_Sub4) Static82.aClass82_9.method2300()) {
			if ((local6.aLong107 >> 48 & 0xFFFFL) == (long) arg0) {
				local6.method2264();
			}
		}
	}
}
