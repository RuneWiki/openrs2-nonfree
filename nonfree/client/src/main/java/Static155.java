import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static155 {

	@OriginalMember(owner = "client!pg", name = "k", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1178 = Static151.method2243("Wir vermuten)1 dass Ihr Konto gestohlen wurde");

	@OriginalMember(owner = "client!pg", name = "m", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1179 = null;

	@OriginalMember(owner = "client!pg", name = "q", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1180 = Static151.method2243("Spieler kann nicht gefunden werden: ");

	@OriginalMember(owner = "client!pg", name = "t", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1181 = Static151.method2243("settings");

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "(Lclient!ii;B)I")
	public static int method2304(@OriginalArg(0) Class47 arg0) {
		@Pc(17) Class2_Sub19 local17 = (Class2_Sub19) Static209.aClass58_15.method1704((long) arg0.anInt1860 + ((long) arg0.anInt1886 << 32));
		return local17 == null ? arg0.anInt1899 : local17.anInt3328;
	}

	@OriginalMember(owner = "client!pg", name = "a", descriptor = "([IIIIII)V")
	public static void method2306(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class44 local13 = local7.aClass44_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt1737;
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
		@Pc(58) Class93 local58 = local7.aClass93_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt3834;
		@Pc(67) int local67 = local58.anInt3836;
		@Pc(70) int local70 = local58.anInt3833;
		@Pc(73) int local73 = local58.anInt3835;
		@Pc(77) int[] local77 = Static36.anIntArrayArray6[local23];
		@Pc(81) int[] local81 = Static127.anIntArrayArray20[local67];
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
