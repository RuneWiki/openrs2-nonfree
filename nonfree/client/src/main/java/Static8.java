import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static8 {

	@OriginalMember(owner = "client!ah", name = "b", descriptor = "[I")
	public static int[] anIntArray41 = new int[2];

	@OriginalMember(owner = "client!ah", name = "e", descriptor = "Ljava/lang/String;")
	public static String aString8 = "Examine";

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!ve;III[Z)V")
	public static void method239(@OriginalArg(0) Class4_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static307.aClass26Array3 == Static5.aClass26Array1) {
			return;
		}
		@Pc(9) int local9 = Static310.aClass26Array4[arg1].method4990(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class26 local22 = Static310.aClass26Array4[local11];
				if (local22 != null) {
					local22.method4998(arg0, arg2, local9 - local22.method4990(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!am;Lclient!am;ILclient!am;)V")
	public static void method240(@OriginalArg(0) Class11 arg0, @OriginalArg(1) Class11 arg1, @OriginalArg(3) Class11 arg2) {
		Static269.aClass11_115 = arg0;
		Static219.method3773(arg1, arg2);
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IILclient!fd;IIIII)V")
	public static void method241(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class72 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg2.anInt1825 == 2) {
			@Pc(24) int local24 = 99999;
			@Pc(26) int local26 = 0;
			@Pc(28) int local28 = 0;
			for (@Pc(30) int local30 = 0; local30 < arg2.anInt1799; local30++) {
				for (@Pc(34) int local34 = 0; local34 < arg2.anInt1827; local34++) {
					@Pc(46) int local46 = arg5 + local34 * (arg2.anInt1881 + 32);
					@Pc(55) int local55 = local30 * (arg2.anInt1848 + 32) + arg6;
					if (local28 < 20) {
						local46 += arg2.anIntArray186[local28];
						local55 += arg2.anIntArray193[local28];
					}
					if (arg2.anIntArray179[local28] > 0 && (arg1 < local46 + 32 && arg3 > local46 && arg4 < local55 + 32 && arg0 > local55 || arg2 == Static215.aClass72_15 && Static49.anInt1090 == local28)) {
						if (local24 > local28) {
							local24 = local28;
						}
						if (local26 < local28) {
							local26 = local28;
						}
					}
					local28++;
				}
			}
			Static118.method2105(arg2, Static164.aClass92_7, local26, local24);
		} else if (arg2.anInt1825 == 5 && arg2.lb != -1) {
			Static105.method5115(Static164.aClass92_7, arg2);
		}
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!am;ILclient!am;)V")
	public static void method243(@OriginalArg(0) Class11 arg0, @OriginalArg(2) Class11 arg1) {
		Static133.aClass11_59 = arg0;
		Static350.aClass11_155 = arg1;
		Static350.aClass11_155.method292(36);
	}
}
