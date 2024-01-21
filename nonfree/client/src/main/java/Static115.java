import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static115 {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
	public static int anInt2690;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "Lclient!od;")
	public static Class60 aClass60_1043 = Static41.method597("::errortest");

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "Lclient!ie;")
	public static Class4_Sub9_Sub1 aClass4_Sub9_Sub1_3 = new Class4_Sub9_Sub1(5000);

	@OriginalMember(owner = "client!ua", name = "m", descriptor = "Lclient!od;")
	private static Class60 aClass60_1045 = Static41.method597("Loaded interfaces");

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!od;")
	public static Class60 aClass60_1044 = aClass60_1045;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
	public static int anInt2693 = 0;

	@OriginalMember(owner = "client!ua", name = "k", descriptor = "I")
	public static int anInt2694 = 0;

	@OriginalMember(owner = "client!ua", name = "n", descriptor = "Z")
	public static boolean aBoolean116 = false;

	@OriginalMember(owner = "client!ua", name = "p", descriptor = "Lclient!od;")
	public static Class60 aClass60_1046 = Static41.method597("Ihr Spielkonto wird bereits benutzt)3");

	@OriginalMember(owner = "client!ua", name = "q", descriptor = "Lclient!od;")
	public static Class60 aClass60_1047 = Static41.method597("Suche nach Updates )2 ");

	@OriginalMember(owner = "client!ua", name = "r", descriptor = "Lclient!od;")
	public static Class60 aClass60_1048 = Static41.method597("<col=ff9040>");

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)[Lclient!qe;")
	public static Class4_Sub3_Sub6_Sub2[] method1867() {
		@Pc(13) Class4_Sub3_Sub6_Sub2[] local13 = new Class4_Sub3_Sub6_Sub2[Static65.anInt1635];
		for (@Pc(15) int local15 = 0; local15 < Static65.anInt1635; local15++) {
			@Pc(25) Class4_Sub3_Sub6_Sub2 local25 = local13[local15] = new Class4_Sub3_Sub6_Sub2();
			local25.anInt2252 = Static5.anInt70;
			local25.anInt2254 = Static31.anInt910;
			local25.anInt2251 = Static2.anIntArray1[local15];
			local25.anInt2253 = Static29.anIntArray91[local15];
			local25.anInt2255 = Static125.anIntArray341[local15];
			local25.anInt2256 = Static113.anIntArray132[local15];
			local25.anIntArray285 = Static75.anIntArray125;
			local25.aByteArray35 = Static56.aByteArrayArray7[local15];
		}
		Static53.method866();
		return local13;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)V")
	public static void method1868() {
		aClass4_Sub9_Sub1_3 = null;
		aClass60_1047 = null;
		aClass60_1046 = null;
		aClass60_1043 = null;
		aClass60_1048 = null;
		aClass60_1045 = null;
		aClass60_1044 = null;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(BLclient!wc;)V")
	public static void method1869(@OriginalArg(1) Class4_Sub23 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(7) int local7 = -1;
		@Pc(9) int local9 = 0;
		@Pc(11) int local11 = 0;
		if (arg0.anInt2919 == 0) {
			local1 = Static30.aClass48_1.method1015(arg0.anInt2922, arg0.anInt2916, arg0.anInt2925);
		}
		if (arg0.anInt2919 == 1) {
			local1 = Static30.aClass48_1.method1001(arg0.anInt2922, arg0.anInt2916, arg0.anInt2925);
		}
		if (arg0.anInt2919 == 2) {
			local1 = Static30.aClass48_1.method1024(arg0.anInt2922, arg0.anInt2916, arg0.anInt2925);
		}
		if (arg0.anInt2919 == 3) {
			local1 = Static30.aClass48_1.method1031(arg0.anInt2922, arg0.anInt2916, arg0.anInt2925);
		}
		if (local1 != 0) {
			local7 = local1 >> 14 & 0x7FFF;
			@Pc(83) int local83 = Static30.aClass48_1.method1013(arg0.anInt2922, arg0.anInt2916, arg0.anInt2925, local1);
			local11 = local83 >> 6 & 0x3;
			local9 = local83 & 0x1F;
		}
		arg0.anInt2926 = local7;
		arg0.anInt2917 = local11;
		arg0.anInt2924 = local9;
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!c;BLclient!c;Lclient!c;)V")
	public static void method1870(@OriginalArg(0) Class10 arg0, @OriginalArg(2) Class10 arg1, @OriginalArg(3) Class10 arg2) {
		Static61.aClass10_19 = arg1;
		Static110.aClass10_29 = arg0;
		Static6.aClass10_5 = arg2;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)V")
	public static void method1871() {
		if (!Static86.aBoolean71) {
			return;
		}
		@Pc(13) Class4_Sub14 local13 = Static53.method867(Static45.anInt1122, Static49.anInt1204);
		if (local13 != null && local13.anObjectArray6 != null) {
			@Pc(22) Class4_Sub21 local22 = new Class4_Sub21();
			local22.aClass4_Sub14_14 = local13;
			local22.anObjectArray28 = local13.anObjectArray6;
			Static28.method1353(local22);
		}
		Static86.aBoolean71 = false;
		Static36.method558(local13);
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
	public static void method1872() {
		Static130.anImage4 = null;
		Static2.aFont1 = null;
		Static124.aFontMetrics1 = null;
	}

	@OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)V")
	public static void method1873() {
		Static30.aClass4_Sub1_Sub1_1.method122();
		Static9.anInt112 = 1;
		Static82.aClass10_22 = null;
	}
}
