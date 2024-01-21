import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static48 {

	@OriginalMember(owner = "client!fa", name = "ub", descriptor = "I")
	public static int anInt1635;

	@OriginalMember(owner = "client!fa", name = "L", descriptor = "Lclient!fc;")
	public static Class25 aClass25_7 = new Class25(64);

	@OriginalMember(owner = "client!fa", name = "Gb", descriptor = "Lclient!rf;")
	private static Class70 aClass70_524 = Static49.method1293("scroll:");

	@OriginalMember(owner = "client!fa", name = "vb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_521 = aClass70_524;

	@OriginalMember(owner = "client!fa", name = "xb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_522 = aClass70_524;

	@OriginalMember(owner = "client!fa", name = "Db", descriptor = "Z")
	public static boolean aBoolean61 = false;

	@OriginalMember(owner = "client!fa", name = "Eb", descriptor = "[I")
	public static int[] anIntArray167 = new int[2048];

	@OriginalMember(owner = "client!fa", name = "Fb", descriptor = "Lclient!rf;")
	public static Class70 aClass70_523 = Static49.method1293(")1");

	@OriginalMember(owner = "client!fa", name = "Hb", descriptor = "[I")
	public static int[] anIntArray168 = new int[200];

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "([IIIIII)V")
	public static void method1233(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub17 local7 = Static90.aClass1_Sub17ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class46 local13 = local7.aClass46_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt2864;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class21 local58 = local7.aClass21_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1441;
		@Pc(67) int local67 = local58.anInt1439;
		@Pc(70) int local70 = local58.anInt1438;
		@Pc(73) int local73 = local58.anInt1440;
		@Pc(77) int[] local77 = Static131.anIntArrayArray28[local23];
		@Pc(81) int[] local81 = Static112.anIntArrayArray38[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!fa", name = "e", descriptor = "(I)V")
	public static void method1238() {
		aClass70_521 = null;
		aClass70_523 = null;
		anIntArray168 = null;
		aClass25_7 = null;
		aClass70_522 = null;
		anIntArray167 = null;
		aClass70_524 = null;
	}
}
