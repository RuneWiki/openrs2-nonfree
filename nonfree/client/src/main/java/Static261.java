import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static261 {

	@OriginalMember(owner = "client!wg", name = "c", descriptor = "[I")
	public static int[] anIntArray467;

	@OriginalMember(owner = "client!wg", name = "g", descriptor = "[Lclient!ke;")
	public static Class1_Sub2_Sub4[] aClass1_Sub2_Sub4Array12;

	@OriginalMember(owner = "client!wg", name = "i", descriptor = "I")
	public static int anInt5479;

	@OriginalMember(owner = "client!wg", name = "m", descriptor = "C")
	public static char aChar4;

	@OriginalMember(owner = "client!wg", name = "o", descriptor = "I")
	public static int anInt5482;

	@OriginalMember(owner = "client!wg", name = "q", descriptor = "Lclient!wf;")
	public static Class62 aClass62_1;

	@OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
	public static int anInt5475 = 0;

	@OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
	public static int anInt5478 = 0;

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IBII)Lclient!df;")
	public static Class1_Sub5 method4159(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) Class1_Sub5 local5 = new Class1_Sub5();
		local5.anInt1358 = arg2;
		local5.anInt1355 = arg0;
		Static204.aClass140_13.method4011(local5, (long) arg1);
		Static53.method1021(arg2);
		@Pc(33) Class122 local33 = Static206.method3444(arg1);
		if (local33 != null) {
			Static257.method4146(local33);
		}
		if (Static58.aClass122_6 != null) {
			Static257.method4146(Static58.aClass122_6);
			Static58.aClass122_6 = null;
		}
		@Pc(49) int local49 = Static230.anInt5417;
		for (@Pc(51) int local51 = 0; local51 < local49; local51++) {
			if (Static52.method1019(Static57.aShortArray26[local51])) {
				Static73.method1456(local51);
			}
		}
		if (Static230.anInt5417 == 1) {
			Static259.aBoolean280 = false;
			Static199.method3321(Static95.anInt2633, Static197.anInt2398, Static75.anInt2037, Static48.anInt1406);
		} else {
			Static199.method3321(Static95.anInt2633, Static197.anInt2398, Static75.anInt2037, Static48.anInt1406);
			@Pc(91) int local91 = Static120.aClass1_Sub2_Sub7_2.method1922(Static16.aString354);
			for (@Pc(93) int local93 = 0; local93 < Static230.anInt5417; local93++) {
				@Pc(101) int local101 = Static120.aClass1_Sub2_Sub7_2.method1922(Static174.method2990(local93));
				if (local91 < local101) {
					local91 = local101;
				}
			}
			Static197.anInt2398 = (Static4.aBoolean4 ? 26 : 22) + Static230.anInt5417 * 15;
			Static75.anInt2037 = local91 + 8;
		}
		if (local33 != null) {
			Static147.method2678(false, local33);
		}
		Static15.method254(arg2);
		if (Static140.anInt3388 != -1) {
			Static146.method2662(1, Static140.anInt3388);
		}
		return local5;
	}

	@OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIIII)Z")
	public static boolean method4163(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(16) int local16;
		@Pc(20) int local20;
		if (arg1 != arg2 || arg3 != arg4) {
			for (local16 = arg1; local16 <= arg2; local16++) {
				for (local20 = arg3; local20 <= arg4; local20++) {
					if (Static248.anIntArrayArrayArray13[arg0][local16][local20] == -Static134.anInt3305) {
						return false;
					}
				}
			}
			local20 = (arg1 << 7) + 1;
			@Pc(146) int local146 = (arg3 << 7) + 2;
			@Pc(156) int local156 = Static38.anIntArrayArrayArray6[arg0][arg1][arg3] + arg5;
			if (!Static252.method4076(local20, local156, local146)) {
				return false;
			}
			@Pc(169) int local169 = (arg2 << 7) - 1;
			if (!Static252.method4076(local169, local156, local146)) {
				return false;
			}
			@Pc(182) int local182 = (arg4 << 7) - 1;
			if (!Static252.method4076(local20, local156, local182)) {
				return false;
			} else if (Static252.method4076(local169, local156, local182)) {
				return true;
			} else {
				return false;
			}
		} else if (Static127.method2420(arg0, arg1, arg3)) {
			local16 = arg1 << 7;
			local20 = arg3 << 7;
			return Static252.method4076(local16 + 1, Static38.anIntArrayArrayArray6[arg0][arg1][arg3] + arg5, local20 + 1) && Static252.method4076(local16 + 128 - 1, Static38.anIntArrayArrayArray6[arg0][arg1 + 1][arg3] + arg5, local20 + 1) && Static252.method4076(local16 + 128 - 1, Static38.anIntArrayArrayArray6[arg0][arg1 + 1][arg3 + 1] + arg5, local20 + 128 - 1) && Static252.method4076(local16 + 1, Static38.anIntArrayArrayArray6[arg0][arg1][arg3 + 1] + arg5, local20 + 128 - 1);
		} else {
			return false;
		}
	}
}
