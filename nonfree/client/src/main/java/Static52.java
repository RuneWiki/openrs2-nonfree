import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static52 {

	@OriginalMember(owner = "client!kb", name = "E", descriptor = "Lclient!me;")
	public static Class10_Sub1_Sub5_Sub2_Sub2 aClass10_Sub1_Sub5_Sub2_Sub2_1;

	@OriginalMember(owner = "client!kb", name = "w", descriptor = "Lclient!tc;")
	public static Class10_Sub10 aClass10_Sub10_4 = new Class10_Sub10(new byte[5000]);

	@OriginalMember(owner = "client!kb", name = "U", descriptor = "Lclient!va;")
	private static Class61 aClass61_601 = Static88.method1421("K");

	@OriginalMember(owner = "client!kb", name = "Q", descriptor = "Lclient!va;")
	public static Class61 aClass61_600 = aClass61_601;

	@OriginalMember(owner = "client!kb", name = "R", descriptor = "[I")
	public static int[] anIntArray157 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!kb", name = "W", descriptor = "Lclient!va;")
	public static Class61 aClass61_602 = Static88.method1421(" @gre@");

	@OriginalMember(owner = "client!kb", name = "db", descriptor = "Lclient!va;")
	private static Class61 aClass61_605 = Static88.method1421("Loaded input handler");

	@OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lclient!va;")
	public static Class61 aClass61_603 = aClass61_605;

	@OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lclient!va;")
	public static Class61 aClass61_604 = aClass61_601;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lclient!va;Lclient!va;IZ)V")
	public static void method794(@OriginalArg(0) Class61 arg0, @OriginalArg(1) Class61 arg1, @OriginalArg(2) int arg2) {
		if (Static74.anInt1871 == -1) {
			Static7.aBoolean1 = true;
		}
		if (arg2 == 0 && Static98.anInt2479 != -1) {
			Static19.anInt630 = 0;
			Static54.aClass61_611 = arg1;
		}
		for (@Pc(23) int local23 = 99; local23 > 0; local23--) {
			Static51.anIntArray154[local23] = Static51.anIntArray154[local23 - 1];
			Static48.aClass61Array8[local23] = Static48.aClass61Array8[local23 - 1];
			Static39.aClass61Array2[local23] = Static39.aClass61Array2[local23 - 1];
		}
		Static51.anIntArray154[0] = arg2;
		Static48.aClass61Array8[0] = arg0;
		Static39.aClass61Array2[0] = arg1;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(JI)V")
	public static void method795(@OriginalArg(0) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		if (Static80.anInt2155 >= 100) {
			method794(Static15.aClass61_166, Static71.aClass61_760, 0);
			return;
		}
		@Pc(34) Class61 local34 = Static78.method1234(arg0).method1617();
		for (@Pc(36) int local36 = 0; local36 < Static80.anInt2155; local36++) {
			if (arg0 == Static57.aLongArray4[local36]) {
				method794(Static15.aClass61_166, Static93.method1156(new Class61[] { local34, Static100.aClass61_1077 }), 0);
				return;
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static6.anInt70; local71++) {
			if (arg0 == Static76.aLongArray6[local71]) {
				method794(Static15.aClass61_166, Static93.method1156(new Class61[] { Static17.aClass61_197, local34, Static19.aClass61_218 }), 0);
				return;
			}
		}
		if (!local34.method1608(aClass10_Sub1_Sub5_Sub2_Sub2_1.aClass61_699)) {
			Static57.aLongArray4[Static80.anInt2155++] = arg0;
			Static80.aBoolean94 = true;
			Static50.aClass10_Sub10_Sub1_3.method1167(117);
			Static50.aClass10_Sub10_Sub1_3.method1125(arg0);
		}
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILclient!ed;)V")
	public static void method796(@OriginalArg(1) Class10_Sub1_Sub5_Sub2 arg0) {
		@Pc(4) int local4 = arg0.anInt1635 - Static95.anInt2442;
		if (arg0.anInt1652 == 0) {
			arg0.anInt1634 = 1024;
		}
		if (arg0.anInt1652 == 1) {
			arg0.anInt1634 = 1536;
		}
		arg0.anInt1638 = 0;
		if (arg0.anInt1652 == 2) {
			arg0.anInt1634 = 0;
		}
		if (arg0.anInt1652 == 3) {
			arg0.anInt1634 = 512;
		}
		@Pc(50) int local50 = arg0.anInt1681 * 64 + arg0.anInt1664 * 128;
		arg0.anInt1654 += (local50 - arg0.anInt1654) / local4;
		@Pc(71) int local71 = arg0.anInt1681 * 64 + arg0.anInt1650 * 128;
		arg0.anInt1649 += (local71 - arg0.anInt1649) / local4;
	}

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
	public static void method797() {
		aClass61_604 = null;
		aClass10_Sub1_Sub5_Sub2_Sub2_1 = null;
		aClass61_605 = null;
		aClass61_601 = null;
		aClass61_603 = null;
		aClass10_Sub10_4 = null;
		aClass61_600 = null;
		anIntArray157 = null;
		aClass61_602 = null;
	}
}
