import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!pg", name = "j", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_2164 = Static118.method2249("Invalid username or password)3");

	@OriginalMember(owner = "client!pg", name = "c", descriptor = "Lclient!oc;")
	public static Class65 aClass65_2163 = aClass65_2164;

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(I[Lclient!n;I[BIIIIII)V")
	public static void method2771(@OriginalArg(0) int arg0, @OriginalArg(1) Class57[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte[] arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		for (@Pc(7) int local7 = 0; local7 < 8; local7++) {
			for (@Pc(11) int local11 = 0; local11 < 8; local11++) {
				if (arg8 + local7 > 0 && arg8 + local7 < 103 && local11 + arg0 > 0 && arg0 + local11 < 103) {
					arg1[arg5].anIntArrayArray23[local7 + arg8][arg0 + local11] &= 0xFEFFFFFF;
				}
			}
		}
		@Pc(91) Class1_Sub14 local91 = new Class1_Sub14(arg3);
		for (@Pc(93) int local93 = 0; local93 < 4; local93++) {
			for (@Pc(97) int local97 = 0; local97 < 64; local97++) {
				for (@Pc(101) int local101 = 0; local101 < 64; local101++) {
					if (arg6 == local93 && local97 >= arg2 && local97 < arg2 + 8 && local101 >= arg4 && local101 < arg4 + 8) {
						Static1.method3300(local91, arg8 + Static36.method672(arg7, local101 & 0x7, local97 & 0x7), 0, arg7, arg5, 0, Static106.method1969(local97 & 0x7, local101 & 0x7, arg7) + arg0);
					} else {
						Static1.method3300(local91, -1, 0, 0, 0, 0, -1);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(BI)I")
	public static int method2777(@OriginalArg(1) int arg0) {
		return arg0 & 0x3FF;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIBI)V")
	public static void method2779(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (Static173.method2925(arg2)) {
			Static49.method848(arg0, -1, arg1, Static99.aClass97ArrayArray1[arg2]);
		}
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!sd;Lclient!sd;Lclient!sd;BLclient!sd;)V")
	public static void method2782(@OriginalArg(0) Class60 arg0, @OriginalArg(1) Class60 arg1, @OriginalArg(2) Class60 arg2, @OriginalArg(4) Class60 arg3) {
		Static135.aClass60_28 = arg1;
		Static118.aClass60_24 = arg3;
		Static61.aClass60_13 = arg0;
		Static81.aClass60_19 = arg2;
		Static99.aClass97ArrayArray1 = new Class97[Static61.aClass60_13.method2330()][];
		Static100.aBooleanArray13 = new boolean[Static61.aClass60_13.method2330()];
	}
}
