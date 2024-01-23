import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static202 {

	@OriginalMember(owner = "client!uc", name = "r", descriptor = "[Z")
	public static boolean[] aBooleanArray124;

	@OriginalMember(owner = "client!uc", name = "G", descriptor = "Lclient!vb;")
	public static Class105 aClass105_4;

	@OriginalMember(owner = "client!uc", name = "H", descriptor = "Lclient!rd;")
	public static Class72_Sub1 aClass72_Sub1_32;

	@OriginalMember(owner = "client!uc", name = "f", descriptor = "Lclient!ui;")
	public static Class103 aClass103_20 = new Class103(32);

	@OriginalMember(owner = "client!uc", name = "h", descriptor = "I")
	public static int anInt4521 = 0;

	@OriginalMember(owner = "client!uc", name = "t", descriptor = "Lclient!qe;")
	private static Class78 aClass78_798 = Static199.method3560("Mon");

	@OriginalMember(owner = "client!uc", name = "u", descriptor = "Lclient!he;")
	public static Class44 aClass44_57 = new Class44();

	@OriginalMember(owner = "client!uc", name = "v", descriptor = "Lclient!qe;")
	private static Class78 aClass78_799 = Static199.method3560("Wed");

	@OriginalMember(owner = "client!uc", name = "B", descriptor = "Lclient!qe;")
	private static Class78 aClass78_804 = Static199.method3560("Sun");

	@OriginalMember(owner = "client!uc", name = "A", descriptor = "Lclient!qe;")
	private static Class78 aClass78_803 = Static199.method3560("Tue");

	@OriginalMember(owner = "client!uc", name = "z", descriptor = "Lclient!qe;")
	private static Class78 aClass78_802 = Static199.method3560("Thu");

	@OriginalMember(owner = "client!uc", name = "y", descriptor = "Lclient!qe;")
	private static Class78 aClass78_801 = Static199.method3560("Fri");

	@OriginalMember(owner = "client!uc", name = "x", descriptor = "Lclient!qe;")
	private static Class78 aClass78_800 = Static199.method3560("Sat");

	@OriginalMember(owner = "client!uc", name = "w", descriptor = "[Lclient!qe;")
	public static Class78[] aClass78Array36 = new Class78[] { aClass78_804, aClass78_798, aClass78_803, aClass78_799, aClass78_802, aClass78_801, aClass78_800 };

	@OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
	public static int anInt4530 = -1;

	@OriginalMember(owner = "client!uc", name = "D", descriptor = "Lclient!qe;")
	public static Class78 aClass78_805 = Static199.method3560(" <col=00ff80>");

	@OriginalMember(owner = "client!uc", name = "E", descriptor = "[Lclient!tb;")
	public static Class90[] aClass90Array1 = new Class90[4];

	@OriginalMember(owner = "client!uc", name = "F", descriptor = "[I")
	public static int[] anIntArray728 = new int[100];

	@OriginalMember(owner = "client!uc", name = "I", descriptor = "Lclient!qe;")
	public static Class78 aClass78_806 = Static199.method3560(":clan:");

	@OriginalMember(owner = "client!uc", name = "J", descriptor = "Z")
	public static boolean aBoolean194 = false;

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIII)V")
	public static void method3583(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = arg3 + 1;
		Static221.method3893(arg2, arg4, Static183.anIntArrayArray40[arg3], arg1);
		@Pc(20) int local20 = arg0 - 1;
		Static221.method3893(arg2, arg4, Static183.anIntArrayArray40[arg0], arg1);
		for (@Pc(30) int local30 = local7; local30 <= local20; local30++) {
			@Pc(36) int[] local36 = Static183.anIntArrayArray40[local30];
			local36[arg4] = local36[arg1] = arg2;
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lclient!qf;IIIII)V")
	public static void method3585(@OriginalArg(0) Class5 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(1) boolean local1 = true;
		@Pc(3) int local3 = arg2;
		@Pc(7) int local7 = arg2 + arg4;
		@Pc(11) int local11 = arg3 - 1;
		@Pc(15) int local15 = arg3 + arg5;
		for (@Pc(17) int local17 = arg1; local17 <= arg1 + 1; local17++) {
			if (local17 != Static78.anInt1716) {
				for (@Pc(23) int local23 = local3; local23 <= local7; local23++) {
					if (local23 >= 0 && local23 < Static173.anInt3981) {
						for (@Pc(32) int local32 = local11; local32 <= local15; local32++) {
							if (local32 >= 0 && local32 < Static159.anInt4174 && (!local1 || local23 >= local7 || local32 >= local15 || local32 < arg3 && local23 != arg2)) {
								@Pc(62) Class2_Sub12 local62 = Static226.aClass2_Sub12ArrayArrayArray3[local17][local23][local32];
								if (local62 != null) {
									@Pc(148) int local148 = (Static144.anIntArrayArrayArray7[local17][local23][local32] + Static144.anIntArrayArrayArray7[local17][local23 + 1][local32] + Static144.anIntArrayArrayArray7[local17][local23][local32 + 1] + Static144.anIntArrayArrayArray7[local17][local23 + 1][local32 + 1]) / 4 - (Static144.anIntArrayArrayArray7[arg1][arg2][arg3] + Static144.anIntArrayArrayArray7[arg1][arg2 + 1][arg3] + Static144.anIntArrayArrayArray7[arg1][arg2][arg3 + 1] + Static144.anIntArrayArrayArray7[arg1][arg2 + 1][arg3 + 1]) / 4;
									@Pc(151) Class27 local151 = local62.aClass27_1;
									if (local151 != null) {
										if (local151.aClass5_2.method3772()) {
											arg0.method3771(local151.aClass5_2, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
										if (local151.aClass5_3 != null && local151.aClass5_3.method3772()) {
											arg0.method3771(local151.aClass5_3, (local23 - arg2) * 128 + (1 - arg4) * 64, local148, (local32 - arg3) * 128 + (1 - arg5) * 64, local1);
										}
									}
									for (@Pc(222) int local222 = 0; local222 < local62.anInt775; local222++) {
										@Pc(228) Class100 local228 = local62.aClass100Array3[local222];
										if (local228 != null && local228.aClass5_8.method3772() && (local23 == local228.anInt4529 || local23 == local3) && (local32 == local228.anInt4517 || local32 == local11)) {
											@Pc(257) int local257 = local228.anInt4525 + 1 - local228.anInt4529;
											@Pc(265) int local265 = local228.anInt4528 + 1 - local228.anInt4517;
											arg0.method3771(local228.aClass5_8, (local228.anInt4529 - arg2) * 128 + (local257 - arg4) * 64, local148, (local228.anInt4517 - arg3) * 128 + (local265 - arg5) * 64, local1);
										}
									}
								}
							}
						}
					}
				}
				local3--;
				local1 = false;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "a", descriptor = "(BJ)V")
	public static void method3586(@OriginalArg(1) long arg0) {
		if (arg0 == 0L) {
			return;
		}
		for (@Pc(17) int local17 = 0; local17 < Static140.anInt3196; local17++) {
			if (Static200.aLongArray12[local17] == arg0) {
				Static140.anInt3196--;
				for (@Pc(34) int local34 = local17; local34 < Static140.anInt3196; local34++) {
					Static159.aClass78Array31[local34] = Static159.aClass78Array31[local34 + 1];
					Static87.anIntArray347[local34] = Static87.anIntArray347[local34 + 1];
					Static193.aClass78Array34[local34] = Static193.aClass78Array34[local34 + 1];
					Static200.aLongArray12[local34] = Static200.aLongArray12[local34 + 1];
					Static125.anIntArray278[local34] = Static125.anIntArray278[local34 + 1];
					Static43.aBooleanArray25[local34] = Static43.aBooleanArray25[local34 + 1];
				}
				Static140.anInt3198 = Static133.anInt3087;
				Static161.aClass2_Sub23_Sub1_5.method2155(87);
				Static161.aClass2_Sub23_Sub1_5.method2103(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!uc", name = "b", descriptor = "(IIIIII)V")
	public static void method3587(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		Static33.anInt571 = arg1;
		Static198.anInt4484 = arg3;
		Static211.anInt4652 = arg4;
		Static106.anInt2312 = arg0;
		Static81.anInt1738 = arg2;
		if (Static211.anInt4652 >= 100) {
			@Pc(27) int local27 = Static198.anInt4484 * 128 + 64;
			@Pc(33) int local33 = Static33.anInt571 * 128 + 64;
			@Pc(42) int local42 = Static208.method3667(local33, Static137.anInt3136, local27) - Static106.anInt2312;
			@Pc(47) int local47 = local33 - Static39.anInt727;
			@Pc(51) int local51 = local42 - Static107.anInt2348;
			@Pc(55) int local55 = local27 - Static71.anInt1394;
			@Pc(67) int local67 = (int) Math.sqrt((double) (local47 * local47 + local55 * local55));
			Static15.anInt335 = (int) (Math.atan2((double) local51, (double) local67) * 325.949D) & 0x7FF;
			Static138.anInt3181 = (int) (Math.atan2((double) local47, (double) local55) * -325.949D) & 0x7FF;
			if (Static15.anInt335 < 128) {
				Static15.anInt335 = 128;
			}
			if (Static15.anInt335 > 383) {
				Static15.anInt335 = 383;
			}
		}
		Static145.anInt3290 = 2;
	}
}
