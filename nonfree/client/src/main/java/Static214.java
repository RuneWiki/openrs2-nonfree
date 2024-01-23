import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static214 {

	@OriginalMember(owner = "client!qh", name = "c", descriptor = "Lclient!vi;")
	public static Class52 aClass52_2;

	@OriginalMember(owner = "client!qh", name = "n", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!qh", name = "e", descriptor = "Lclient!dd;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!qh", name = "i", descriptor = "I")
	public static int anInt4259 = 0;

	@OriginalMember(owner = "client!qh", name = "l", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray6 = new boolean[][] { { true, true, true }, { false, false }, { false, true }, { true, false }, { false, true, true }, { true, false, true }, { false, true, false }, { true, false, false } };

	@OriginalMember(owner = "client!qh", name = "m", descriptor = "I")
	public static int anInt4262 = 0;

	@OriginalMember(owner = "client!qh", name = "s", descriptor = "J")
	public static volatile long aLong154 = 0L;

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIIIB)V")
	public static void method3394(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static168.method2914(arg0);
		@Pc(10) int local10 = 0;
		@Pc(12) int local12 = arg0;
		@Pc(15) int local15 = -arg0;
		@Pc(19) int local19 = arg0 - arg2;
		if (local19 < 0) {
			local19 = 0;
		}
		@Pc(36) int local36 = local19;
		@Pc(39) int local39 = -local19;
		@Pc(43) int[] local43 = Static22.anIntArrayArray3[arg3];
		@Pc(45) int local45 = -1;
		@Pc(47) int local47 = -1;
		@Pc(52) int local52 = arg5 + local19;
		@Pc(56) int local56 = arg5 - local19;
		Static126.method1523(local43, local56, arg4, arg5 - arg0);
		Static126.method1523(local43, local52, arg1, local56);
		Static126.method1523(local43, arg0 + arg5, arg4, local52);
		while (local10 < local12) {
			local47 += 2;
			local39 += local47;
			local45 += 2;
			local15 += local45;
			if (local39 >= 0 && local36 >= 1) {
				Static21.anIntArray47[local36] = local10;
				local36--;
				local39 -= local36 << 1;
			}
			local10++;
			@Pc(132) int[] local132;
			@Pc(142) int[] local142;
			@Pc(136) int local136;
			@Pc(147) int local147;
			@Pc(186) int local186;
			@Pc(202) int local202;
			@Pc(191) int local191;
			if (local15 >= 0) {
				local12--;
				if (local19 <= local12) {
					local132 = Static22.anIntArrayArray3[arg3 + local12];
					local136 = local10 + arg5;
					local142 = Static22.anIntArrayArray3[arg3 - local12];
					local147 = arg5 - local10;
					Static126.method1523(local132, local136, arg4, local147);
					Static126.method1523(local142, local136, arg4, local147);
				} else {
					local142 = Static22.anIntArrayArray3[arg3 - local12];
					local132 = Static22.anIntArrayArray3[local12 + arg3];
					local136 = Static21.anIntArray47[local12];
					local147 = local10 + arg5;
					local186 = arg5 - local10;
					local191 = arg5 - local136;
					Static126.method1523(local132, local191, arg4, local186);
					local202 = arg5 + local136;
					Static126.method1523(local132, local202, arg1, local191);
					Static126.method1523(local132, local147, arg4, local202);
					Static126.method1523(local142, local191, arg4, local186);
					Static126.method1523(local142, local202, arg1, local191);
					Static126.method1523(local142, local147, arg4, local202);
				}
				local15 -= local12 << 1;
			}
			local142 = Static22.anIntArrayArray3[arg3 - local10];
			local147 = arg5 - local12;
			local132 = Static22.anIntArrayArray3[arg3 + local10];
			local136 = local12 + arg5;
			if (local10 >= local19) {
				Static126.method1523(local132, local136, arg4, local147);
				Static126.method1523(local142, local136, arg4, local147);
			} else {
				local186 = local10 <= local36 ? local36 : Static21.anIntArray47[local10];
				local191 = arg5 - local186;
				local202 = arg5 + local186;
				Static126.method1523(local132, local191, arg4, local147);
				Static126.method1523(local132, local202, arg1, local191);
				Static126.method1523(local132, local136, arg4, local202);
				Static126.method1523(local142, local191, arg4, local147);
				Static126.method1523(local142, local202, arg1, local191);
				Static126.method1523(local142, local136, arg4, local202);
			}
		}
	}

	@OriginalMember(owner = "client!qh", name = "a", descriptor = "(BII)V")
	public static void method3395(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(11) Class1_Sub2_Sub18 local11 = Static130.method2227(arg0, 5);
		local11.method3905();
		local11.anInt5005 = arg1;
	}

	@OriginalMember(owner = "client!qh", name = "b", descriptor = "(I)V")
	public static void method3397() {
		Static183.aClass1_Sub2_Sub7_8 = null;
		Static123.aClass1_Sub2_Sub7_5 = null;
		Static60.aClass1_Sub2_Sub7_3 = null;
		Static56.aClass1_Sub2_Sub7_2 = null;
	}
}
