import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static419 {

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!n;")
	public static Class221 aClass221_11;

	@OriginalMember(owner = "client!q", name = "f", descriptor = "[Lclient!ts;")
	public static Class325[] aClass325Array5;

	@OriginalMember(owner = "client!q", name = "c", descriptor = "[[I")
	public static final int[][] anIntArrayArray65 = new int[6][];

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public static int anInt8466 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
	public static void method7096() {
		Static275.aClass10_26.method263();
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(II)Z")
	public static boolean method7098(@OriginalArg(1) int arg0) {
		return arg0 == 7 || arg0 == 8 || arg0 == 9;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(ZLclient!qj;Lclient!r;Lclient!cd;IIILclient!fu;)V")
	public static void method7099(@OriginalArg(1) Class3_Sub41 arg0, @OriginalArg(2) Class43 arg1, @OriginalArg(3) Class40 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class106 arg6) {
		@Pc(15) int local15 = arg0.anInt7157 - arg5 / 2 - 5;
		@Pc(26) int local26 = arg3 + 2;
		if (arg2.anInt1387 != 0) {
			arg1.method7185(local26, arg3 + arg6.method2829() * arg4 + 1 - local26, arg5 + 10, local15, arg2.anInt1387);
		}
		if (arg2.anInt1384 != 0) {
			arg1.method7145(arg3 + arg6.method2829() * arg4 + 1 - local26, arg2.anInt1384, arg5 + 10, local15, local26);
		}
		@Pc(78) int local78 = arg2.anInt1390;
		if (arg0.aBoolean566 && arg2.anInt1381 != -1) {
			local78 = arg2.anInt1381;
		}
		for (@Pc(90) int local90 = 0; local90 < arg4; local90++) {
			@Pc(96) String local96 = Static106.aStringArray10[local90];
			if (local90 < arg4 - 1) {
				local96 = local96.substring(0, local96.length() - 4);
			}
			arg6.method2831(arg1, local96, arg0.anInt7157, arg3, local78);
			arg3 += arg6.method2829();
		}
	}
}
