import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!jba", name = "l", descriptor = "Lclient!rca;")
	public static Class322 aClass322_1;

	@OriginalMember(owner = "client!jba", name = "p", descriptor = "I")
	public static int anInt4559;

	@OriginalMember(owner = "client!jba", name = "s", descriptor = "[Lclient!jia;")
	public static Class192[] aClass192Array1;

	@OriginalMember(owner = "client!jba", name = "n", descriptor = "Z")
	public static boolean aBoolean294 = false;

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(BIIJ)V")
	public static void method4187(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) long arg2) {
		@Pc(10) int local10 = (int) arg2 >> 14 & 0x1F;
		@Pc(28) int local28 = (int) arg2 >> 20 & 0x3;
		@Pc(35) int local35 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static671.method8997(0, 0, 0, arg0, local28, local10, true, arg1);
			return;
		}
		@Pc(68) Class247 local68 = Static216.aClass53_3.method1523(local35);
		@Pc(78) int local78;
		@Pc(81) int local81;
		if (local28 == 0 || local28 == 2) {
			local78 = local68.anInt6246;
			local81 = local68.anInt6242;
		} else {
			local78 = local68.anInt6242;
			local81 = local68.anInt6246;
		}
		@Pc(92) int local92 = local68.anInt6263;
		if (local28 != 0) {
			local92 = (local92 << local28 & 0xF) + (local92 >> 4 - local28);
		}
		Static671.method8997(local92, local81, local78, arg0, 0, 0, true, arg1);
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIILclient!oaa;)V")
	public static void method4188(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class9_Sub1_Sub5 arg4) {
		@Pc(4) Class364 local4 = Static309.method4578(arg0, arg1, arg2);
		if (local4 == null) {
			return;
		}
		arg4.anInt10694 = (arg1 << Static626.anInt9669) + Static434.anInt10639;
		arg4.anInt10690 = arg3;
		arg4.anInt10695 = (arg2 << Static626.anInt9669) + Static434.anInt10639;
		local4.aClass9_Sub1_Sub5_1 = arg4;
		@Pc(36) int local36 = Static477.aClass259Array3 == Static378.aClass259Array2 ? 1 : 0;
		if (arg4.method9093()) {
			if (arg4.method9084()) {
				arg4.aClass9_Sub1_24 = Static120.aClass9_Sub1Array2[local36];
				Static120.aClass9_Sub1Array2[local36] = arg4;
				return;
			}
			arg4.aClass9_Sub1_24 = Static356.aClass9_Sub1Array4[local36];
			Static356.aClass9_Sub1Array4[local36] = arg4;
			Static632.aBoolean653 = true;
			return;
		}
		arg4.aClass9_Sub1_24 = Static52.aClass9_Sub1Array1[local36];
		Static52.aClass9_Sub1Array1[local36] = arg4;
	}

	@OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIII)V")
	public static void method4189(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static327.anInt1079 / (float) Static327.anInt1080;
		@Pc(11) int local11 = arg3;
		@Pc(20) int local20 = arg1;
		if (local9 < 1.0F) {
			local20 = (int) ((float) arg3 * local9);
		} else {
			local11 = (int) ((float) arg1 / local9);
		}
		@Pc(46) int local46 = arg2 - (arg3 - local11) / 2;
		@Pc(55) int local55 = arg0 - (arg1 - local20) / 2;
		Static90.anInt4562 = Static327.anInt1079 - local55 * Static327.anInt1079 / local20;
		Static614.anInt9290 = -1;
		Static531.anInt8269 = -1;
		Static550.anInt8467 = Static327.anInt1080 * local46 / local11;
		Static400.method5406();
	}
}
