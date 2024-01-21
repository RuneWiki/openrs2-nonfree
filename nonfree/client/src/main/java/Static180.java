import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static180 {

	@OriginalMember(owner = "client!td", name = "S", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1162 = Static81.method1507("title_mute");

	@OriginalMember(owner = "client!td", name = "hb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1163 = Static81.method1507(")1");

	@OriginalMember(owner = "client!td", name = "jb", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_1164 = Static81.method1507("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!td", name = "a", descriptor = "(IBLclient!dj;)V")
	public static void method3069(@OriginalArg(0) int arg0, @OriginalArg(2) Class24 arg1) {
		Static176.aClass1_Sub7_Sub1_34.method2808(134);
		Static176.aClass1_Sub7_Sub1_34.method2749(arg0);
		Static176.aClass1_Sub7_Sub1_34.method2801(arg1.method747());
	}

	@OriginalMember(owner = "client!td", name = "a", descriptor = "([IIIIII)V")
	public static void method3070(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub8 local7 = Static29.aClass1_Sub8ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class101 local13 = local7.aClass101_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt4646;
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
		@Pc(58) Class15 local58 = local7.aClass15_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt652;
		@Pc(67) int local67 = local58.anInt654;
		@Pc(70) int local70 = local58.anInt653;
		@Pc(73) int local73 = local58.anInt651;
		@Pc(77) int[] local77 = Static168.anIntArrayArray30[local23];
		@Pc(81) int[] local81 = Static91.anIntArrayArray14[local67];
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

	@OriginalMember(owner = "client!td", name = "d", descriptor = "(II)Z")
	public static boolean method3071(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}
}
