import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static160 {

	@OriginalMember(owner = "client!qi", name = "h", descriptor = "I")
	public static int anInt3230;

	@OriginalMember(owner = "client!qi", name = "k", descriptor = "Lclient!ee;")
	public static Class28_Sub1 aClass28_Sub1_24;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_950 = Static181.method2795("compass");

	@OriginalMember(owner = "client!qi", name = "b", descriptor = "Lclient!qe;")
	private static final Class83 aClass83_951 = Static181.method2795(" from your ignore list first)3");

	@OriginalMember(owner = "client!qi", name = "d", descriptor = "Lclient!qe;")
	public static final Class83 aClass83_952 = Static181.method2795("Wordpack geladen)3");

	@OriginalMember(owner = "client!qi", name = "f", descriptor = "I")
	public static int anInt3229 = 0;

	@OriginalMember(owner = "client!qi", name = "l", descriptor = "Lclient!qe;")
	public static Class83 aClass83_953 = aClass83_951;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(III)V")
	public static void method2456(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg0][arg1][arg2];
		if (local7 != null) {
			local7.aClass104_1 = null;
		}
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(B)V")
	public static void method2457() {
		for (@Pc(6) Class2_Sub26 local6 = (Class2_Sub26) Static190.aClass19_20.method691(); local6 != null; local6 = (Class2_Sub26) Static190.aClass19_20.method686()) {
			if (local6.aClass2_Sub9_Sub2_3 != null) {
				Static34.aClass2_Sub9_Sub4_1.method2480(local6.aClass2_Sub9_Sub2_3);
				local6.aClass2_Sub9_Sub2_3 = null;
			}
			if (local6.aClass2_Sub9_Sub2_2 != null) {
				Static34.aClass2_Sub9_Sub4_1.method2480(local6.aClass2_Sub9_Sub2_2);
				local6.aClass2_Sub9_Sub2_2 = null;
			}
		}
		Static190.aClass19_20.method685();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IIIII)I")
	public static int method2458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(24) int local24 = 65536 - Class16.anIntArray39[arg0 * 1024 / arg1] >> 1;
		return (local24 * arg3 >> 16) + ((65536 - local24) * arg2 >> 16);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!eh;ILclient!eh;)V")
	public static void method2459(@OriginalArg(0) Class28 arg0, @OriginalArg(2) Class28 arg1) {
		Static8.aClass28_12 = arg0;
		Static113.aClass28_120 = arg1;
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "([IIIIII)V")
	public static void method2460(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub23 local7 = Static203.aClass2_Sub23ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class81 local13 = local7.aClass81_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt3052;
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
		@Pc(58) Class36 local58 = local7.aClass36_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1562;
		@Pc(67) int local67 = local58.anInt1561;
		@Pc(70) int local70 = local58.anInt1560;
		@Pc(73) int local73 = local58.anInt1559;
		@Pc(77) int[] local77 = Static186.anIntArrayArray33[local23];
		@Pc(81) int[] local81 = Static176.anIntArrayArray26[local67];
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
