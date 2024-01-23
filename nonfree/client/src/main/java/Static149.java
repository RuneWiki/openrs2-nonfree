import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static149 {

	@OriginalMember(owner = "client!lb", name = "Q", descriptor = "Lclient!gf;")
	public static Class62 aClass62_6;

	@OriginalMember(owner = "client!lb", name = "O", descriptor = "[S")
	public static short[] aShortArray68 = new short[] { 9, 36, 24, 7, 30, 19, 60, 34 };

	@OriginalMember(owner = "client!lb", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString96 = "Use";

	@OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
	public static int anInt2777 = 0;

	@OriginalMember(owner = "client!lb", name = "Y", descriptor = "Z")
	public static boolean aBoolean196 = false;

	@OriginalMember(owner = "client!lb", name = "Z", descriptor = "F")
	public static float aFloat80 = 0.0F;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIIIILclient!j;IJ)Z")
	public static boolean method2334(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class6 arg6, @OriginalArg(8) long arg7) {
		if (arg6 == null) {
			return true;
		} else {
			@Pc(11) int local11 = arg1 * 128 + arg4 * 64;
			@Pc(19) int local19 = arg2 * 128 + arg5 * 64;
			return Static27.method458(arg0, arg1, arg2, arg4, arg5, local11, local19, arg3, arg6, 0, false, arg7);
		}
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I[Lclient!rc;)V")
	public static void method2335(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub25[] arg1) {
		Static151.aClass1_Sub25ArrayArray2[arg0] = arg1;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIIIII)V")
	public static void method2336(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class1_Sub19 local7 = Static130.aClass1_Sub19ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class74 local13 = local7.aClass74_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt2049;
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
		@Pc(58) Class59 local58 = local7.aClass59_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt1627;
		@Pc(67) int local67 = local58.anInt1628;
		@Pc(70) int local70 = local58.anInt1626;
		@Pc(73) int local73 = local58.anInt1625;
		@Pc(77) int[] local77 = Static112.anIntArrayArray18[local23];
		@Pc(81) int[] local81 = Static228.anIntArrayArray34[local67];
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

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public static void method2338() {
		Static102.aClass31_17.method856(5);
	}
}
