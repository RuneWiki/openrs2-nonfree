import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static474 {

	@OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
	public static int anInt8293 = 0;

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(BIIIII)V")
	public static void method7153(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(11) int local11 = arg1; local11 <= arg2; local11++) {
			Static312.method5228(arg3, Static484.anIntArrayArray41[local11], arg0, arg4);
		}
	}

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lclient!bs;IIILclient!kd;ILclient!su;I)V")
	public static void method7154(@OriginalArg(0) Class20_Sub2_Sub2_Sub1_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class20_Sub2_Sub2_Sub1_Sub2 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class312 arg6) {
		@Pc(7) Class6_Sub49 local7 = new Class6_Sub49();
		local7.anInt9625 = arg1 << 9;
		local7.anInt9626 = arg2 << 9;
		local7.anInt9627 = arg5;
		if (arg6 != null) {
			local7.aClass312_1 = arg6;
			@Pc(167) int local167 = arg6.anInt9244;
			@Pc(170) int local170 = arg6.anInt9235;
			if (arg3 == 1 || arg3 == 3) {
				local167 = arg6.anInt9235;
				local170 = arg6.anInt9244;
			}
			local7.anInt9624 = arg6.anInt9192;
			local7.anIntArray582 = arg6.anIntArray564;
			local7.anInt9622 = arg6.anInt9217 << 9;
			local7.anInt9633 = arg6.anInt9223;
			local7.anInt9632 = arg6.anInt9206 << 9;
			local7.anInt9629 = arg6.anInt9242;
			local7.aBoolean662 = arg6.aBoolean618;
			local7.aBoolean664 = arg6.aBoolean623;
			local7.anInt9638 = local170 + arg2 << 9;
			local7.anInt9630 = arg6.anInt9248;
			local7.anInt9636 = arg6.anInt9239;
			local7.anInt9634 = arg1 + local167 << 9;
			local7.anInt9635 = arg6.anInt9238;
			if (arg6.anIntArray565 != null) {
				local7.aBoolean663 = true;
				local7.method8168();
			}
			if (local7.anIntArray582 != null) {
				local7.anInt9631 = local7.anInt9630 + (int) ((double) (local7.anInt9636 - local7.anInt9630) * Math.random());
			}
			Static550.aClass8_63.method157(local7);
			return;
		}
		if (arg4 != null) {
			local7.aClass20_Sub2_Sub2_Sub1_Sub2_2 = arg4;
			@Pc(34) Class247 local34 = arg4.aClass247_1;
			if (local34.anIntArray467 != null) {
				local7.aBoolean663 = true;
				local34 = local34.method6613(Static279.aClass294_1);
			}
			if (local34 != null) {
				local7.anInt9638 = local34.anInt7681 + arg2 << 9;
				local7.anInt9634 = arg1 + local34.anInt7681 << 9;
				local7.anInt9629 = Static525.method7809(arg4);
				local7.anInt9635 = local34.anInt7686;
				local7.anInt9633 = local34.anInt7706;
				local7.anInt9624 = local34.anInt7677;
				local7.anInt9632 = local34.anInt7698 << 9;
				local7.aBoolean662 = local34.aBoolean513;
				local7.anInt9622 = local34.anInt7702 << 9;
			}
			Static23.aClass8_21.method157(local7);
			return;
		}
		if (arg0 == null) {
			return;
		}
		local7.aClass20_Sub2_Sub2_Sub1_Sub1_2 = arg0;
		local7.anInt9634 = arg0.method4913() + arg1 << 9;
		local7.anInt9638 = arg2 + arg0.method4913() << 9;
		local7.anInt9629 = Static281.method4932(arg0);
		local7.anInt9622 = arg0.anInt1213 << 9;
		local7.aBoolean662 = arg0.aBoolean73;
		local7.anInt9624 = 256;
		local7.anInt9632 = 0;
		local7.anInt9633 = 256;
		local7.anInt9635 = arg0.anInt1197;
		Static554.aClass128_8.method3551((long) arg0.anInt5567, local7);
		return;
	}
}
