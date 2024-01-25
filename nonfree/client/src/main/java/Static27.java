import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static27 {

	@OriginalMember(owner = "client!bba", name = "l", descriptor = "Z")
	public static boolean aBoolean62 = false;

	@OriginalMember(owner = "client!bba", name = "v", descriptor = "I")
	public static int anInt767 = 0;

	@OriginalMember(owner = "client!bba", name = "x", descriptor = "Lclient!db;")
	public static final Class1_Sub9 aClass1_Sub9_1 = new Class1_Sub9(0, -1);

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;)V")
	public static void method787(@OriginalArg(1) String arg0, @OriginalArg(2) String arg1) {
		Static434.anInt7518 = 1;
		Static361.anInt6516 = -1;
		Static212.method3940(false, arg1, arg0);
	}

	@OriginalMember(owner = "client!bba", name = "a", descriptor = "(IIIIIIZIII)V")
	public static void method789(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg0 == arg6 && arg8 == arg7 && arg4 == arg1 && arg3 == arg2) {
			Static36.method1111(arg6, arg3, arg5, arg8, arg1);
			return;
		}
		@Pc(36) int local36 = arg6;
		@Pc(38) int local38 = arg8;
		@Pc(42) int local42 = arg6 * 3;
		@Pc(46) int local46 = arg8 * 3;
		@Pc(50) int local50 = arg0 * 3;
		@Pc(54) int local54 = arg7 * 3;
		@Pc(58) int local58 = arg4 * 3;
		@Pc(62) int local62 = arg2 * 3;
		@Pc(72) int local72 = arg1 + local50 - arg6 - local58;
		@Pc(82) int local82 = arg3 + local54 - local62 - arg8;
		@Pc(93) int local93 = local58 + local42 - local50 - local50;
		@Pc(104) int local104 = local62 + local46 - local54 - local54;
		@Pc(109) int local109 = local50 - local42;
		@Pc(114) int local114 = local54 - local46;
		for (@Pc(116) int local116 = 128; local116 <= 4096; local116 += 128) {
			@Pc(124) int local124 = local116 * local116 >> 12;
			@Pc(130) int local130 = local116 * local124 >> 12;
			@Pc(134) int local134 = local72 * local130;
			@Pc(138) int local138 = local82 * local130;
			@Pc(142) int local142 = local93 * local124;
			@Pc(146) int local146 = local104 * local124;
			@Pc(150) int local150 = local116 * local109;
			@Pc(154) int local154 = local116 * local114;
			@Pc(165) int local165 = (local142 + local134 + local150 >> 12) + arg6;
			@Pc(177) int local177 = arg8 + (local154 + local138 + local146 >> 12);
			Static36.method1111(local36, local177, arg5, local38, local165);
			local38 = local177;
			local36 = local165;
		}
	}

	@OriginalMember(owner = "client!bba", name = "e", descriptor = "(B)Lclient!oda;")
	public static Class1_Sub2_Sub12 method796() {
		return Static335.aClass1_Sub2_Sub12_3;
	}
}
