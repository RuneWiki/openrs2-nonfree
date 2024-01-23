import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static186 {

	@OriginalMember(owner = "client!tc", name = "D", descriptor = "Lclient!i;")
	public static Class41 aClass41_1129 = Static184.method2923("http:)4)4www)3runescape)3com)4l=");

	@OriginalMember(owner = "client!tc", name = "J", descriptor = "Lclient!id;")
	public static Class43 aClass43_20 = new Class43(100);

	@OriginalMember(owner = "client!tc", name = "K", descriptor = "I")
	public static int anInt4273 = 0;

	@OriginalMember(owner = "client!tc", name = "M", descriptor = "Lclient!i;")
	private static Class41 aClass41_1131 = Static184.method2923("Please subscribe)1 or use a different world)3");

	@OriginalMember(owner = "client!tc", name = "L", descriptor = "Lclient!i;")
	public static Class41 aClass41_1130 = aClass41_1131;

	@OriginalMember(owner = "client!tc", name = "e", descriptor = "(I)V")
	public static void method2947() {
		for (@Pc(15) Class2_Sub20 local15 = (Class2_Sub20) Static56.aClass108_4.method3322(); local15 != null; local15 = (Class2_Sub20) Static56.aClass108_4.method3331()) {
			if (local15.anInt3291 == -1) {
				local15.anInt3284 = 0;
				Static154.method2516(local15);
			} else {
				local15.method3314();
			}
		}
	}

	@OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIII)V")
	public static void method2948(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(13) int local13 = arg4 * arg4;
		@Pc(17) int local17 = arg1 * arg1;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg1 << 1;
		@Pc(38) int local38 = local21 + local13 * (1 - local29);
		@Pc(47) int local47 = local17 - local25 * (local29 - 1);
		@Pc(51) int local51 = local13 << 2;
		@Pc(55) int local55 = local17 << 2;
		@Pc(63) int local63 = local21 * 3;
		@Pc(71) int local71 = local25 * ((arg1 << 1) - 3);
		@Pc(77) int local77 = local55;
		@Pc(83) int local83 = (arg1 - 1) * local51;
		@Pc(101) int local101;
		@Pc(110) int local110;
		if (Static45.anInt1337 <= arg2 && arg2 <= Static17.anInt457) {
			local101 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg4 + arg0);
			local110 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg0 - arg4);
			Static204.method3147(local110, arg3, local101, Static3.anIntArrayArray1[arg2]);
		}
		while (local9 > 0) {
			local9--;
			local101 = arg2 - local9;
			local110 = local9 + arg2;
			if (local38 < 0) {
				while (local38 < 0) {
					local47 += local77;
					local7++;
					local77 += local55;
					local38 += local63;
					local63 += local55;
				}
			}
			if (local47 < 0) {
				local7++;
				local47 += local77;
				local38 += local63;
				local63 += local55;
				local77 += local55;
			}
			local47 += -local71;
			if (local110 >= Static45.anInt1337 && Static17.anInt457 >= local101) {
				@Pc(201) int local201 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg0 + local7);
				@Pc(210) int local210 = Static141.method2224(Static60.anInt4779, Static11.anInt385, arg0 - local7);
				if (local101 >= Static45.anInt1337) {
					Static204.method3147(local210, arg3, local201, Static3.anIntArrayArray1[local101]);
				}
				if (Static17.anInt457 >= local110) {
					Static204.method3147(local210, arg3, local201, Static3.anIntArrayArray1[local110]);
				}
			}
			local71 -= local51;
			local38 += -local83;
			local83 -= local51;
		}
	}
}
