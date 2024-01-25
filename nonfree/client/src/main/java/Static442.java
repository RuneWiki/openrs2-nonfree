import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(I)V")
	public static void method6547(@OriginalArg(0) int arg0) {
		Static451.aClass67_1.method5454();
		for (@Pc(10) int local10 = 0; local10 < 32; local10++) {
			Static438.aLongArray22[local10] = 0L;
		}
		@Pc(26) int local26 = 0;
		if (arg0 <= 115) {
			return;
		}
		while (local26 < 32) {
			Static467.aLongArray23[local26] = 0L;
			local26++;
		}
		Static652.anInt10540 = 0;
	}

	@OriginalMember(owner = "client!pd", name = "b", descriptor = "(Z)V")
	public static void method6548() {
		Static183.method2673();
		Static62.method873();
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ILclient!sg;)Ljava/lang/String;")
	public static String method6549(@OriginalArg(1) Class5_Sub5_Sub19 arg0) {
		if (arg0.aString121 == null || arg0.aString121.length() == 0) {
			return arg0.aString120 == null || arg0.aString120.length() <= 0 ? arg0.aString119 : arg0.aString119 + Static582.aClass335_33.method8349(Static323.anInt5795) + arg0.aString120;
		} else if (arg0.aString120 == null || arg0.aString120.length() <= 0) {
			return arg0.aString119 + Static582.aClass335_33.method8349(Static323.anInt5795) + arg0.aString121;
		} else {
			return arg0.aString119 + Static582.aClass335_33.method8349(Static323.anInt5795) + arg0.aString120 + Static582.aClass335_33.method8349(Static323.anInt5795) + arg0.aString121;
		}
	}

	@OriginalMember(owner = "client!pd", name = "c", descriptor = "(III)V")
	public static void method6550(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class174 local7 = Static260.aClass174ArrayArrayArray2[arg0][arg1][arg2];
		if (local7 == null) {
			return;
		}
		Static577.method8285(local7.aClass8_Sub1_Sub2_1);
		Static577.method8285(local7.aClass8_Sub1_Sub2_2);
		if (local7.aClass8_Sub1_Sub2_1 != null) {
			local7.aClass8_Sub1_Sub2_1 = null;
		}
		if (local7.aClass8_Sub1_Sub2_2 != null) {
			local7.aClass8_Sub1_Sub2_2 = null;
		}
	}
}
