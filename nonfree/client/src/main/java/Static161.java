import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static161 {

	@OriginalMember(owner = "client!uc", name = "db", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_17;

	@OriginalMember(owner = "client!uc", name = "lb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1359 = Static146.method2172("FULL");

	@OriginalMember(owner = "client!uc", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1355 = aClass77_1359;

	@OriginalMember(owner = "client!uc", name = "fb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1357 = Static146.method2172("Prepared sound engine");

	@OriginalMember(owner = "client!uc", name = "eb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1356 = aClass77_1357;

	@OriginalMember(owner = "client!uc", name = "gb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1358 = Static146.method2172("jolt");

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(B)V")
	public static void method2724() {
		aClass43_Sub1_17 = null;
		aClass77_1355 = null;
		aClass77_1358 = null;
		aClass77_1356 = null;
		aClass77_1359 = null;
		aClass77_1357 = null;
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIII)I")
	public static int method2725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) int local7 = arg0 >> 7;
		@Pc(11) int local11 = arg2 >> 7;
		if (local7 < 0 || local11 < 0 || local7 > 103 || local11 > 103) {
			return 0;
		}
		@Pc(31) int local31 = arg1;
		if (arg1 < 3 && (Static140.aByteArrayArrayArray6[1][local7][local11] & 0x2) == 2) {
			local31 = arg1 + 1;
		}
		@Pc(52) int local52 = arg2 & 0x7F;
		@Pc(56) int local56 = arg0 & 0x7F;
		@Pc(87) int local87 = local56 * Static122.anIntArrayArrayArray2[local31][local7 + 1][local11 + 1] + (128 - local56) * Static122.anIntArrayArrayArray2[local31][local7][local11 + 1] >> 7;
		@Pc(114) int local114 = Static122.anIntArrayArrayArray2[local31][local7][local11] * (128 - local56) + Static122.anIntArrayArrayArray2[local31][local7 + 1][local11] * local56 >> 7;
		return local87 * local52 + local114 * (128 - local52) >> 7;
	}
}
