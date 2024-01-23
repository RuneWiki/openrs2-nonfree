import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static220 {

	@OriginalMember(owner = "client!qb", name = "m", descriptor = "Lclient!qj;")
	public static Applet_Sub1 anApplet_Sub1_41 = null;

	@OriginalMember(owner = "client!qb", name = "q", descriptor = "[Z")
	public static boolean[] aBooleanArray66 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!qb", name = "s", descriptor = "I")
	public static int anInt5820 = 0;

	@OriginalMember(owner = "client!qb", name = "x", descriptor = "I")
	public static int anInt5825 = 1;

	@OriginalMember(owner = "client!qb", name = "E", descriptor = "Z")
	public static boolean aBoolean425 = false;

	@OriginalMember(owner = "client!qb", name = "G", descriptor = "[I")
	public static int[] anIntArray527 = new int[100];

	@OriginalMember(owner = "client!qb", name = "J", descriptor = "I")
	public static int anInt5831 = -1;

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(Lclient!sb;I)Lclient!qb;")
	public static Class1_Sub2 method4571(@OriginalArg(0) Class1_Sub14 arg0) {
		arg0.method2595();
		@Pc(13) int local13 = arg0.method2595();
		@Pc(17) Class1_Sub2 local17 = Static54.method939(local13);
		local17.anInt5822 = arg0.method2595();
		@Pc(31) int local31 = arg0.method2595();
		for (@Pc(33) int local33 = 0; local33 < local31; local33++) {
			@Pc(40) int local40 = arg0.method2595();
			local17.method4582(arg0, local40);
		}
		local17.method4578();
		return local17;
	}

	@OriginalMember(owner = "client!qb", name = "d", descriptor = "(I)V")
	public static void method4573() {
		try {
			if (Static78.anInt1449 == 1) {
				@Pc(12) int local12 = Static183.aClass1_Sub4_Sub3_3.method1473();
				if (local12 > 0 && Static183.aClass1_Sub4_Sub3_3.method1471()) {
					local12 -= Static177.anInt2083;
					if (local12 < 0) {
						local12 = 0;
					}
					Static183.aClass1_Sub4_Sub3_3.method1499(local12);
					return;
				}
				Static183.aClass1_Sub4_Sub3_3.method1494();
				Static183.aClass1_Sub4_Sub3_3.method1483();
				Static178.aClass1_Sub16_3 = null;
				Static243.aClass131_3 = null;
				if (Static75.aClass138_21 == null) {
					Static78.anInt1449 = 0;
				} else {
					Static78.anInt1449 = 2;
				}
			}
		} catch (@Pc(64) Exception local64) {
			local64.printStackTrace();
			Static183.aClass1_Sub4_Sub3_3.method1494();
			Static75.aClass138_21 = null;
			Static78.anInt1449 = 0;
			Static243.aClass131_3 = null;
			Static178.aClass1_Sub16_3 = null;
		}
	}

	@OriginalMember(owner = "client!qb", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method4574(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg3 == arg7 && arg0 == arg1 && arg5 == arg8 && arg6 == arg2) {
			Static88.method1303(arg3, arg5, arg4, arg0, arg2);
			return;
		}
		@Pc(40) int local40 = arg3;
		@Pc(42) int local42 = arg0;
		@Pc(46) int local46 = arg3 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg1 * 3;
		@Pc(62) int local62 = arg6 * 3;
		@Pc(66) int local66 = arg8 * 3;
		@Pc(77) int local77 = local66 + local46 - local54 - local54;
		@Pc(88) int local88 = arg2 + local58 - local62 - arg0;
		@Pc(98) int local98 = local50 + local62 - local58 - local58;
		@Pc(108) int local108 = local54 + arg5 - local66 - arg3;
		@Pc(112) int local112 = local54 - local46;
		@Pc(117) int local117 = local58 - local50;
		for (@Pc(119) int local119 = 128; local119 <= 4096; local119 += 128) {
			@Pc(130) int local130 = local119 * local119 >> 12;
			@Pc(136) int local136 = local119 * local130 >> 12;
			@Pc(140) int local140 = local88 * local136;
			@Pc(144) int local144 = local136 * local108;
			@Pc(148) int local148 = local130 * local77;
			@Pc(152) int local152 = local119 * local112;
			@Pc(156) int local156 = local98 * local130;
			@Pc(160) int local160 = local119 * local117;
			@Pc(172) int local172 = arg3 + (local144 + local148 + local152 >> 12);
			@Pc(184) int local184 = arg0 + (local156 + local140 + local160 >> 12);
			Static88.method1303(local40, local172, arg4, local42, local184);
			local42 = local184;
			local40 = local172;
		}
	}
}
