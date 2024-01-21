import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static4 {

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "Lclient!f;")
	public static Class13 aClass13_1;

	@OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
	public static int anInt78;

	@OriginalMember(owner = "client!ac", name = "E", descriptor = "Z")
	public static boolean aBoolean7;

	@OriginalMember(owner = "client!ac", name = "l", descriptor = "Lclient!sd;")
	private static Class73 aClass73_50 = Static122.method531("Please wait 1 minute and try again)3");

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "Lclient!sd;")
	public static Class73 aClass73_49 = aClass73_50;

	@OriginalMember(owner = "client!ac", name = "p", descriptor = "I")
	public static int anInt71 = 0;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "Lclient!sd;")
	private static Class73 aClass73_51 = Static122.method531("Examine");

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Lclient!sd;")
	public static Class73 aClass73_52 = aClass73_51;

	@OriginalMember(owner = "client!ac", name = "w", descriptor = "Lclient!nh;")
	public static Class56 aClass56_1 = new Class56();

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!sd;")
	public static Class73 aClass73_53 = aClass73_50;

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
	public static int anInt79 = 0;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "Lclient!sd;")
	public static Class73 aClass73_54 = Static122.method531("nav");

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "Lclient!sd;")
	public static Class73 aClass73_55 = Static122.method531(" <col=ffffff>");

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(ILclient!re;BIII)V")
	public static void method47(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub1_Sub3_Sub4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == null) {
			return;
		}
		@Pc(16) int local16 = Static25.anInt716 + Static120.anInt2841 & 0x7FF;
		@Pc(24) int local24 = arg3 * arg3 + arg0 * arg0;
		if (local24 > 6400) {
			return;
		}
		@Pc(34) int local34 = Class3_Sub1_Sub3_Sub2.anIntArray87[local16];
		@Pc(42) int local42 = local34 * 256 / (Static170.anInt3687 + 256);
		@Pc(46) int local46 = Class3_Sub1_Sub3_Sub2.anIntArray88[local16];
		@Pc(54) int local54 = local46 * 256 / (Static170.anInt3687 + 256);
		@Pc(65) int local65 = arg3 * local42 + local54 * arg0 >> 16;
		@Pc(76) int local76 = arg3 * local54 - arg0 * local42 >> 16;
		if (local24 <= 2500) {
			arg1.method2321(arg4 + local65 + 94 + 4 - arg1.anInt3224 / 2, -local76 + -4 + 83 + arg2 + -(arg1.anInt3222 / 2));
		} else {
			arg1.method2333(Static84.aClass3_Sub1_Sub3_Sub3_6, local65 + arg4 + 94 + 4 - arg1.anInt3224 / 2, -(arg1.anInt3222 / 2) + -4 + 83 + arg2 + -local76);
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(Lclient!f;Lclient!f;Lclient!f;B)V")
	public static void method48(@OriginalArg(0) Class13 arg0, @OriginalArg(1) Class13 arg1, @OriginalArg(2) Class13 arg2) {
		Static158.aClass13_29 = arg2;
		Static55.aClass13_11 = arg1;
		Static179.aClass13_35 = arg0;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
	public static void method49() {
		aClass56_1 = null;
		aClass73_52 = null;
		aClass73_49 = null;
		aClass73_54 = null;
		aClass13_1 = null;
		aClass73_50 = null;
		aClass73_51 = null;
		aClass73_55 = null;
		aClass73_53 = null;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIBIIIII)V")
	public static void method50(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		if (Static150.method2586(arg1)) {
			Static61.aClass83Array1 = null;
			Static51.method938(arg6, arg5, arg3, Static57.aClass83ArrayArray1[arg1], arg7, -1, arg4, arg2, arg0);
			if (Static61.aClass83Array1 != null) {
				Static51.method938(arg6, arg5, Static13.anInt312, Static61.aClass83Array1, arg7, -1412584499, Static158.anInt3479, arg2, arg0);
				Static61.aClass83Array1 = null;
			}
		} else if (arg5 == -1) {
			for (@Pc(15) int local15 = 0; local15 < 100; local15++) {
				Static27.aBooleanArray3[local15] = true;
			}
		} else {
			Static27.aBooleanArray3[arg5] = true;
		}
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(III)V")
	public static void method51(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(7) Class3_Sub1_Sub18 local7 = Static160.method2530(arg1);
		@Pc(10) int local10 = local7.anInt3791;
		@Pc(13) int local13 = local7.anInt3790;
		@Pc(16) int local16 = local7.anInt3795;
		@Pc(23) int local23 = Class3_Sub2_Sub37.anIntArray431[local16 - local13];
		if (arg0 < 0 || arg0 > local23) {
			arg0 = 0;
		}
		local23 <<= local13;
		Static81.anIntArray186[local10] = local23 & arg0 << local13 | ~local23 & Static81.anIntArray186[local10];
	}
}
