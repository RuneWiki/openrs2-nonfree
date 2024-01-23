import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static60 {

	@OriginalMember(owner = "client!ed", name = "g", descriptor = "B")
	public static byte aByte6;

	@OriginalMember(owner = "client!ed", name = "e", descriptor = "I")
	public static int anInt1160 = 0;

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(IIIIIII)V")
	public static void method1102(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (Static29.anInt517 <= arg5 - arg3 && arg5 + arg3 <= Static11.anInt170 && arg1 - arg3 >= Static98.anInt2007 && arg1 + arg3 <= Static213.anInt4452) {
			Static31.method505(arg2, arg3, arg1, arg5, arg0, arg4);
		} else {
			Static229.method3548(arg5, arg2, arg1, arg0, arg3, arg4);
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V")
	public static void method1103() {
		@Pc(18) int local18;
		@Pc(32) int local32;
		for (local18 = -1; local18 < Static304.anInt5394; local18++) {
			if (local18 == -1) {
				local32 = 2047;
			} else {
				local32 = Static275.anIntArray440[local18];
			}
			@Pc(40) Class15_Sub5_Sub2 local40 = Static17.aClass15_Sub5_Sub2Array1[local32];
			if (local40 != null && local40.anInt5546 > 0) {
				local40.anInt5546--;
				if (local40.anInt5546 == 0) {
					local40.aString335 = null;
				}
			}
		}
		for (local18 = 0; local18 < Static85.anInt1689; local18++) {
			local32 = Static104.anIntArray178[local18];
			@Pc(82) Class15_Sub5_Sub1 local82 = Static83.aClass15_Sub5_Sub1Array1[local32];
			if (local82 != null && local82.anInt5546 > 0) {
				local82.anInt5546--;
				if (local82.anInt5546 == 0) {
					local82.aString335 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "b", descriptor = "(Z)Z")
	public static boolean method1104() {
		if (Static96.aBoolean106) {
			try {
				return !((Boolean) Static321.method2506("showingVideoAd", Static26.aClass154_1.anApplet1));
			} catch (@Pc(24) Throwable local24) {
			}
		}
		return true;
	}
}
