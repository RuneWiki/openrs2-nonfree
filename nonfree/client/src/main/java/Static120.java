import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static120 {

	@OriginalMember(owner = "client!io", name = "f", descriptor = "Lclient!hn;")
	public static Class69 aClass69_5;

	@OriginalMember(owner = "client!io", name = "j", descriptor = "Lclient!nb;")
	public static Class111 aClass111_14 = new Class111(64);

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
	public static void method2490() {
		@Pc(7) boolean local7 = false;
		while (!local7) {
			local7 = true;
			for (@Pc(13) int local13 = 0; local13 < Static286.anInt5602 - 1; local13++) {
				if (Static256.aShortArray81[local13] < 1000 && Static256.aShortArray81[local13 + 1] > 1000) {
					local7 = false;
					@Pc(36) String local36 = Static156.aStringArray21[local13];
					Static156.aStringArray21[local13] = Static156.aStringArray21[local13 + 1];
					Static156.aStringArray21[local13 + 1] = local36;
					@Pc(54) String local54 = Static52.aStringArray6[local13];
					Static52.aStringArray6[local13] = Static52.aStringArray6[local13 + 1];
					Static52.aStringArray6[local13 + 1] = local54;
					@Pc(72) int local72 = Static282.anIntArray439[local13];
					Static282.anIntArray439[local13] = Static282.anIntArray439[local13 + 1];
					Static282.anIntArray439[local13 + 1] = local72;
					@Pc(90) int local90 = Static49.anIntArray117[local13];
					Static49.anIntArray117[local13] = Static49.anIntArray117[local13 + 1];
					Static49.anIntArray117[local13 + 1] = local90;
					@Pc(108) int local108 = Static102.anIntArray167[local13];
					Static102.anIntArray167[local13] = Static102.anIntArray167[local13 + 1];
					Static102.anIntArray167[local13 + 1] = local108;
					@Pc(126) short local126 = Static256.aShortArray81[local13];
					Static256.aShortArray81[local13] = Static256.aShortArray81[local13 + 1];
					Static256.aShortArray81[local13 + 1] = local126;
					@Pc(144) long local144 = Static30.aLongArray2[local13];
					Static30.aLongArray2[local13] = Static30.aLongArray2[local13 + 1];
					Static30.aLongArray2[local13 + 1] = local144;
				}
			}
		}
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(Lclient!cg;II)[Lclient!ta;")
	public static Class58_Sub2[] method2495(@OriginalArg(0) Class22 arg0, @OriginalArg(1) int arg1) {
		return Static176.method4458(arg1, arg0) ? Static76.method1290() : null;
	}

	@OriginalMember(owner = "client!io", name = "c", descriptor = "(B)V")
	public static void method2498() {
		for (@Pc(7) int local7 = 0; local7 < 5; local7++) {
			Static278.aBooleanArray35[local7] = false;
		}
		Static237.anInt4705 = 0;
		Static13.anInt287 = -1;
		Static288.anInt5628 = 0;
		Static242.anInt4773 = -1;
		Static99.anInt1946 = 5;
	}

	@OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIIIII)V")
	public static void method2501(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(6) int local6 = arg5 + arg2;
		@Pc(11) int local11 = arg3 - arg2;
		@Pc(15) int local15 = arg2 + arg4;
		@Pc(17) int local17;
		for (local17 = arg5; local17 < local6; local17++) {
			Static190.method3151(arg0, Static253.anIntArrayArray34[local17], arg1, arg4);
		}
		for (local17 = arg3; local17 > local11; local17--) {
			Static190.method3151(arg0, Static253.anIntArrayArray34[local17], arg1, arg4);
		}
		@Pc(59) int local59 = arg0 - arg2;
		for (local17 = local6; local17 <= local11; local17++) {
			@Pc(72) int[] local72 = Static253.anIntArrayArray34[local17];
			Static190.method3151(local15, local72, arg1, arg4);
			Static190.method3151(arg0, local72, arg1, local59);
		}
	}

	@OriginalMember(owner = "client!io", name = "b", descriptor = "(Z)I")
	public static int method2502() {
		return 6;
	}
}
