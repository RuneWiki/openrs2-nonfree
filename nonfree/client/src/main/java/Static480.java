import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(IIIIIIZ)V")
	public static void method6783(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(11) int local11 = Static489.method6853(arg5, Static326.anInt6028, Static80.anInt1738);
		@Pc(17) int local17 = Static489.method6853(arg3, Static326.anInt6028, Static80.anInt1738);
		@Pc(23) int local23 = Static489.method6853(arg0, Static553.anInt9074, Static249.anInt4668);
		@Pc(29) int local29 = Static489.method6853(arg1, Static553.anInt9074, Static249.anInt4668);
		@Pc(37) int local37 = Static489.method6853(arg4 + arg5, Static326.anInt6028, Static80.anInt1738);
		@Pc(46) int local46 = Static489.method6853(arg3 - arg4, Static326.anInt6028, Static80.anInt1738);
		for (@Pc(48) int local48 = local11; local48 < local37; local48++) {
			Static276.method3099(local23, Static582.anIntArrayArray69[local48], arg2, local29);
		}
		for (@Pc(68) int local68 = local17; local68 > local46; local68--) {
			Static276.method3099(local23, Static582.anIntArrayArray69[local68], arg2, local29);
		}
		@Pc(90) int local90 = Static489.method6853(arg4 + arg0, Static553.anInt9074, Static249.anInt4668);
		@Pc(99) int local99 = Static489.method6853(arg1 - arg4, Static553.anInt9074, Static249.anInt4668);
		for (@Pc(101) int local101 = local37; local101 <= local46; local101++) {
			@Pc(107) int[] local107 = Static582.anIntArrayArray69[local101];
			Static276.method3099(local23, local107, arg2, local90);
			Static276.method3099(local99, local107, arg2, local29);
		}
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BII)Z")
	public static boolean method6784(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!sda", name = "b", descriptor = "(I)V")
	public static void method6787() {
		Static105.method1581(Static307.aClass100_6, (long) Static412.anInt575);
		if (Static554.anInt9121 != -1) {
			Static362.method5087(Static554.anInt9121);
		}
		for (@Pc(26) int local26 = 0; local26 < Static451.anInt488; local26++) {
			if (Static295.aBooleanArray36[local26]) {
				Static64.aBooleanArray5[local26] = true;
			}
			Static493.aBooleanArray35[local26] = Static295.aBooleanArray36[local26];
			Static295.aBooleanArray36[local26] = false;
		}
		Static470.anInt8027 = Static412.anInt575;
		if (Static554.anInt9121 != -1) {
			Static451.anInt488 = 0;
			Static436.method6181();
		}
		Static307.aClass100_6.JA();
		Static73.method1172(Static307.aClass100_6);
		@Pc(68) int local68 = Static322.method4999();
		if (local68 == -1) {
			local68 = Static78.anInt9033;
		}
		if (local68 == -1) {
			local68 = Static395.anInt6896;
		}
		Static13.method5525(local68);
		Static367.anInt6534 = 0;
	}

	@OriginalMember(owner = "client!sda", name = "a", descriptor = "(BI)Ljava/lang/String;")
	public static String method6789(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}

	@OriginalMember(owner = "client!sda", name = "d", descriptor = "(I)V")
	public static void method6790() {
		for (@Pc(6) Class6_Sub2 local6 = (Class6_Sub2) Static104.aClass109_3.method2319(); local6 != null; local6 = (Class6_Sub2) Static104.aClass109_3.method2319()) {
			Static363.method5411(local6);
		}
		@Pc(31) int local31;
		@Pc(30) int local30;
		if (Static72.aClass2_Sub12_Sub1_1.method1422(Static391.anInt6846)) {
			local31 = 0;
			local30 = 3;
		} else {
			local30 = Static426.anInt7278;
			local31 = Static426.anInt7278;
		}
		Static67.method1086();
		for (@Pc(40) int local40 = local31; local40 <= local30; local40++) {
			Static67.method1084();
			Static67.method1101(local40);
			Static67.method1087(local40);
		}
		Static67.method1098();
		Static67.method1094();
	}
}
