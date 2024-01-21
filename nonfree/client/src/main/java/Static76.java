import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static76 {

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!r;")
	public static Class3_Sub1_Sub2_Sub4 aClass3_Sub1_Sub2_Sub4_8;

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1024 = Static59.method1195("");

	@OriginalMember(owner = "client!nc", name = "A", descriptor = "Lclient!qf;")
	private static Class60 aClass60_1026 = Static59.method1195(" has logged in)3");

	@OriginalMember(owner = "client!nc", name = "o", descriptor = "Lclient!qf;")
	public static Class60 aClass60_1025 = aClass60_1026;

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Lclient!jb;Lclient!jb;Z)V")
	public static void method1556(@OriginalArg(0) Class25 arg0, @OriginalArg(1) Class25 arg1) {
		Static55.aClass25_13 = arg0;
		Static63.aClass25_29 = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(Z)V")
	public static void method1559() {
		Static74.anInt2399 = 0;
		Static118.anInt3220 = 0;
		Static11.method320();
		Static60.method1205();
		Static69.method1398();
		@Pc(27) int local27;
		for (@Pc(21) int local21 = 0; local21 < Static118.anInt3220; local21++) {
			local27 = Static74.anIntArray239[local21];
			if (Static34.anInt1183 != Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local27].anInt1531) {
				Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local27].aClass3_Sub1_Sub16_1 = null;
				Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[local27] = null;
			}
		}
		if (Static58.anInt1794 != Static79.aClass3_Sub12_Sub1_1.anInt2886) {
			throw new RuntimeException("gnp1 pos:" + Static79.aClass3_Sub12_Sub1_1.anInt2886 + " psize:" + Static58.anInt1794);
		}
		for (local27 = 0; local27 < Static20.anInt829; local27++) {
			if (Static59.aClass3_Sub1_Sub1_Sub3_Sub2Array1[Static128.anIntArray390[local27]] == null) {
				throw new RuntimeException("gnp2 pos:" + local27 + " size:" + Static20.anInt829);
			}
		}
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(ZLclient!jb;IIIII)V")
	public static void method1560(@OriginalArg(1) Class25 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(6) int arg3) {
		Static104.anInt3013 = arg2;
		Static35.aBoolean36 = false;
		Static64.anInt2048 = 2;
		Static104.anInt3014 = 1;
		Static93.anInt2670 = arg1;
		Static72.anInt2244 = arg3;
		Static66.aClass25_21 = arg0;
	}

	@OriginalMember(owner = "client!nc", name = "b", descriptor = "(Z)V")
	public static void method1561() {
		Static81.aClass3_Sub12_Sub1_2.method1980(141);
		if (Static119.anInt3242 != -1) {
			Static119.method2149(Static119.anInt3242);
			Static119.anInt3242 = -1;
			Static118.aBoolean115 = true;
			Static96.anInt2745 = -1;
			Static45.aBoolean46 = true;
		}
		if (Static78.anInt2429 != -1) {
			Static119.method2149(Static78.anInt2429);
			Static78.anInt2429 = -1;
			Static96.anInt2745 = -1;
			Static71.aBoolean49 = true;
		}
		if (Static114.anInt3185 != -1) {
			Static119.method2149(Static114.anInt3185);
			Static114.anInt3185 = -1;
			Static50.method1075(30);
		}
		if (Static57.anInt3397 != -1) {
			Static119.method2149(Static57.anInt3397);
			Static57.anInt3397 = -1;
		}
		if (Static79.anInt2467 != -1) {
			Static119.method2149(Static79.anInt2467);
			Static96.anInt2745 = -1;
			Static79.anInt2467 = -1;
		}
	}

	@OriginalMember(owner = "client!nc", name = "c", descriptor = "(I)V")
	public static void method1563() {
		aClass60_1025 = null;
		aClass60_1024 = null;
		aClass60_1026 = null;
		aClass3_Sub1_Sub2_Sub4_8 = null;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IILclient!qf;Lclient!qf;)V")
	public static void method1565(@OriginalArg(0) int arg0, @OriginalArg(2) Class60 arg1, @OriginalArg(3) Class60 arg2) {
		if (Static78.anInt2429 == -1) {
			Static71.aBoolean49 = true;
		}
		if (arg0 == 0 && Static129.anInt3460 != -1) {
			Static112.anInt3110 = 0;
			Static127.aClass60_1156 = arg1;
		}
		for (@Pc(18) int local18 = 99; local18 > 0; local18--) {
			Static57.anIntArray384[local18] = Static57.anIntArray384[local18 - 1];
			Static99.aClass60Array18[local18] = Static99.aClass60Array18[local18 - 1];
			Static126.aClass60Array23[local18] = Static126.aClass60Array23[local18 - 1];
		}
		Static99.aClass60Array18[0] = arg2;
		Static57.anIntArray384[0] = arg0;
		Static126.aClass60Array23[0] = arg1;
	}

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(II)Z")
	public static boolean method1566(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
