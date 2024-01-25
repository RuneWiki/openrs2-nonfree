import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static309 {

	@OriginalMember(owner = "client!tq", name = "T", descriptor = "I")
	public static int anInt6136;

	@OriginalMember(owner = "client!tq", name = "H", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

	@OriginalMember(owner = "client!tq", name = "K", descriptor = "Z")
	public static boolean aBoolean418 = false;

	@OriginalMember(owner = "client!tq", name = "O", descriptor = "I")
	public static int anInt6133 = 0;

	@OriginalMember(owner = "client!tq", name = "P", descriptor = "I")
	public static int anInt6134 = -1;

	@OriginalMember(owner = "client!tq", name = "S", descriptor = "Ljava/lang/String;")
	public static String aString229 = null;

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIB)Lclient!bq;")
	public static Class26 method5204(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(12) Class177[] local12 = null;
		@Pc(16) Class83 local16 = Static30.method606(arg2);
		if (local16.anIntArray150 != null) {
			local12 = new Class177[local16.anIntArray150.length];
			for (@Pc(26) int local26 = 0; local26 < local12.length; local26++) {
				@Pc(35) Class49 local35 = Static60.method1003(local16.anIntArray150[local26]);
				local12[local26] = new Class177(local35.anInt1409, local35.anInt1406, local35.anInt1408, local35.anInt1404, local35.anInt1402, local35.anInt1399, local35.anInt1403, local35.aBoolean72);
			}
		}
		return new Class26(local16.anInt2530, local12, local16.anInt2524, arg0, arg1, arg3);
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V")
	public static void method5205(@OriginalArg(0) boolean arg0) {
		@Pc(7) int[] local7 = null;
		@Pc(11) byte local11;
		@Pc(13) byte[][] local13;
		if (arg0) {
			local11 = 1;
			local13 = Static112.aByteArrayArray12;
		} else {
			local11 = 4;
			local13 = Static290.aByteArrayArray19;
		}
		for (@Pc(21) int local21 = 0; local21 < local11; local21++) {
			Static123.method2158();
			for (@Pc(26) int local26 = 0; local26 < Static162.anInt2152 >> 3; local26++) {
				for (@Pc(30) int local30 = 0; local30 < Static122.anInt2632 >> 3; local30++) {
					@Pc(34) boolean local34 = false;
					@Pc(42) int local42 = Static94.anIntArrayArrayArray1[local21][local26][local30];
					if (local42 != -1) {
						@Pc(52) int local52 = local42 >> 24 & 0x3;
						if (!arg0 || local52 == 0) {
							@Pc(65) int local65 = local42 >> 1 & 0x3;
							@Pc(71) int local71 = local42 >> 14 & 0x3FF;
							@Pc(77) int local77 = local42 >> 3 & 0x7FF;
							@Pc(87) int local87 = (local71 / 8 << 8) + local77 / 8;
							for (@Pc(89) int local89 = 0; local89 < Static169.anIntArray239.length; local89++) {
								if (local87 == Static169.anIntArray239[local89] && local13[local89] != null) {
									@Pc(120) int[] local120 = Static33.method636(local13[local89], local65, arg0, local71, local30 * 8, local21, local52, Static212.aClass122_2, Static34.aClass13Array1, local26 * 8, local77);
									if (local7 == null && local120 != null) {
										local7 = local120;
									}
									local34 = true;
									break;
								}
							}
						}
					}
					if (!local34) {
						Static37.method5457(local21, local26 * 8, 8, 8, local30 * 8);
					}
				}
			}
		}
		if (local7 == null) {
			Static55.aClass26_3 = null;
		} else {
			Static55.aClass26_3 = method5204(local7[1], local7[2], local7[0], local7[3]);
			Static90.anInt1786 = local7[4];
		}
	}
}
