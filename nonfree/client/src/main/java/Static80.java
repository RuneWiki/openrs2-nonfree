import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static80 {

	@OriginalMember(owner = "client!er", name = "E", descriptor = "Lclient!ct;")
	public static Class30 aClass30_20;

	@OriginalMember(owner = "client!er", name = "Z", descriptor = "Z")
	public static boolean aBoolean128 = true;

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(IIIIIIBIII)V")
	public static void method1711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8) {
		if (arg1 == arg2 && arg5 == arg4 && arg6 == arg3 && arg0 == arg8) {
			Static324.method5526(arg5, arg2, arg7, arg8, arg6);
			return;
		}
		@Pc(53) int local53 = arg2;
		@Pc(55) int local55 = arg5;
		@Pc(59) int local59 = arg2 * 3;
		@Pc(63) int local63 = arg5 * 3;
		@Pc(67) int local67 = arg1 * 3;
		@Pc(71) int local71 = arg4 * 3;
		@Pc(75) int local75 = arg3 * 3;
		@Pc(79) int local79 = arg0 * 3;
		@Pc(89) int local89 = arg6 + local67 - arg2 - local75;
		@Pc(98) int local98 = local71 + arg8 - arg5 - local79;
		@Pc(108) int local108 = local75 + local59 - local67 - local67;
		@Pc(118) int local118 = local79 + local63 - local71 - local71;
		@Pc(123) int local123 = local67 - local59;
		@Pc(128) int local128 = local71 - local63;
		for (@Pc(130) int local130 = 128; local130 <= 4096; local130 += 128) {
			@Pc(138) int local138 = local130 * local130 >> 12;
			@Pc(144) int local144 = local138 * local130 >> 12;
			@Pc(148) int local148 = local89 * local144;
			@Pc(152) int local152 = local98 * local144;
			@Pc(156) int local156 = local138 * local108;
			@Pc(160) int local160 = local138 * local118;
			@Pc(164) int local164 = local130 * local123;
			@Pc(168) int local168 = local130 * local128;
			@Pc(180) int local180 = arg2 + (local148 + local156 + local164 >> 12);
			@Pc(191) int local191 = (local168 + local152 + local160 >> 12) + arg5;
			Static324.method5526(local55, local53, arg7, local191, local180);
			local53 = local180;
			local55 = local191;
		}
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(II)V")
	public static void method1713() {
		Static258.aClass21_42.method844(5);
		Static239.aClass21_128.method844(5);
	}

	@OriginalMember(owner = "client!er", name = "a", descriptor = "(III)V")
	public static void method1717(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(15) Class9 local15 = Static147.method2867(arg1);
		@Pc(18) int local18 = local15.anInt284;
		@Pc(21) int local21 = local15.anInt286;
		@Pc(24) int local24 = local15.anInt285;
		@Pc(31) int local31 = Class79.anIntArray189[local24 - local21];
		if (arg0 < 0 || local31 < arg0) {
			arg0 = 0;
		}
		local31 <<= local21;
		Static257.method1019(local18, local31 & arg0 << local21 | Static87.anIntArray147[local18] & ~local31);
	}
}
