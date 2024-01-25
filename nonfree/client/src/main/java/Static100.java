import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!du", name = "g", descriptor = "I")
	public static int anInt2262;

	@OriginalMember(owner = "client!du", name = "e", descriptor = "Lclient!pp;")
	public static final Class236 aClass236_18 = new Class236(6, -1);

	@OriginalMember(owner = "client!du", name = "q", descriptor = "[[I")
	public static final int[][] anIntArrayArray18 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 }, { 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(Ljava/lang/String;IIIIBII)V")
	public static void method2088(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class30_Sub3 local7 = new Class30_Sub3();
		local7.anInt3089 = arg1;
		local7.anInt3087 = arg6 + Static481.anInt8318;
		local7.anInt3084 = arg5;
		local7.anInt3091 = arg3;
		local7.aString36 = arg0;
		local7.anInt3090 = arg4;
		local7.anInt3088 = arg2;
		Static413.aClass77_12.method2165(local7);
	}

	@OriginalMember(owner = "client!du", name = "a", descriptor = "(BZ)V")
	public static void method2089() {
		Static415.method5995(Static94.aClass236_15);
		for (@Pc(29) Class5_Sub43 local29 = (Class5_Sub43) Static307.aClass42_24.method1103(); local29 != null; local29 = (Class5_Sub43) Static307.aClass42_24.method1105()) {
			if (!local29.method7426()) {
				local29 = (Class5_Sub43) Static307.aClass42_24.method1103();
				if (local29 == null) {
					break;
				}
			}
			if (local29.anInt7805 == 0) {
				Static343.method5317(true, true, local29);
			}
		}
		if (Static381.aClass220_16 != null) {
			Static377.method5650(Static381.aClass220_16);
			Static381.aClass220_16 = null;
		}
	}
}
