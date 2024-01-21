import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!he", name = "Y", descriptor = "[I")
	public static int[] anIntArray169;

	@OriginalMember(owner = "client!he", name = "bb", descriptor = "[I")
	public static int[] anIntArray170;

	@OriginalMember(owner = "client!he", name = "S", descriptor = "I")
	public static final int anInt1838 = 2301979;

	@OriginalMember(owner = "client!he", name = "ab", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_700 = Static177.method3050("Loaded wordpack");

	@OriginalMember(owner = "client!he", name = "T", descriptor = "Lclient!jd;")
	public static Class46 aClass46_698 = aClass46_700;

	@OriginalMember(owner = "client!he", name = "V", descriptor = "[I")
	public static final int[] anIntArray168 = new int[50];

	@OriginalMember(owner = "client!he", name = "fb", descriptor = "Lclient!jd;")
	private static final Class46 aClass46_703 = Static177.method3050("Loading)3)3)3");

	@OriginalMember(owner = "client!he", name = "Z", descriptor = "Lclient!jd;")
	public static Class46 aClass46_699 = aClass46_703;

	@OriginalMember(owner = "client!he", name = "cb", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_701 = Static177.method3050("");

	@OriginalMember(owner = "client!he", name = "db", descriptor = "Lclient!jd;")
	public static final Class46 aClass46_702 = Static177.method3050("swe");

	@OriginalMember(owner = "client!he", name = "a", descriptor = "(IILclient!nh;)Lclient!mh;")
	public static Class4_Sub17 method1472(@OriginalArg(0) int arg0, @OriginalArg(2) Class62 arg1) {
		@Pc(8) byte[] local8 = arg1.method2852(arg0);
		return local8 == null ? null : new Class4_Sub17(local8);
	}

	@OriginalMember(owner = "client!he", name = "a", descriptor = "([IIIIII)V")
	public static void method1474(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class4_Sub7 local7 = Static28.aClass4_Sub7ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class29 local13 = local7.aClass29_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt1332;
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
		@Pc(58) Class40 local58 = local7.aClass40_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1885;
		@Pc(67) int local67 = local58.anInt1883;
		@Pc(70) int local70 = local58.anInt1884;
		@Pc(73) int local73 = local58.anInt1886;
		@Pc(77) int[] local77 = Static81.anIntArrayArray14[local23];
		@Pc(81) int[] local81 = Static28.anIntArrayArray5[local67];
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
}
