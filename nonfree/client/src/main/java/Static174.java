import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static174 {

	@OriginalMember(owner = "client!iq", name = "o", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_72 = new Class254(79, -1);

	@OriginalMember(owner = "client!iq", name = "u", descriptor = "[Lclient!je;")
	public static final Class124[] aClass124Array1 = new Class124[30];

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(ILclient!kh;IBLclient!bo;ILclient!ps;I)V")
	public static void method2767(@OriginalArg(0) int arg0, @OriginalArg(1) Class47_Sub1_Sub5_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class29 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class47_Sub1_Sub5_Sub2 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class1_Sub25 local7 = new Class1_Sub25();
		local7.anInt3562 = arg2 << 7;
		local7.anInt3566 = arg0;
		local7.anInt3568 = arg6 << 7;
		if (arg3 != null) {
			local7.aClass29_1 = arg3;
			@Pc(143) int local143 = arg3.anInt532;
			@Pc(146) int local146 = arg3.anInt542;
			if (arg4 == 1 || arg4 == 3) {
				local143 = arg3.anInt542;
				local146 = arg3.anInt532;
			}
			local7.anInt3575 = arg3.anInt538;
			local7.anInt3570 = arg3.anInt548;
			local7.anInt3561 = arg3.anInt553;
			local7.anInt3565 = local143 + arg2 << 7;
			local7.anInt3571 = local146 + arg6 << 7;
			local7.anInt3563 = arg3.anInt530 << 7;
			local7.anInt3567 = arg3.anInt554;
			local7.anIntArray290 = arg3.anIntArray32;
			if (arg3.anIntArray36 != null) {
				local7.aBoolean288 = true;
				local7.method3052();
			}
			if (local7.anIntArray290 != null) {
				local7.anInt3573 = (int) (Math.random() * (double) (local7.anInt3575 - local7.anInt3561)) + local7.anInt3561;
			}
			Static285.aClass142_2.method3212(local7);
		} else if (arg1 != null) {
			local7.aClass47_Sub1_Sub5_Sub1_1 = arg1;
			@Pc(88) Class196 local88 = arg1.aClass196_1;
			if (local88.anIntArray419 != null) {
				local7.aBoolean288 = true;
				local88 = local88.method4412(Static237.aClass80_1);
			}
			if (local88 != null) {
				local7.anInt3571 = local88.anInt5550 + arg6 << 7;
				local7.anInt3565 = local88.anInt5550 + arg2 << 7;
				local7.anInt3567 = Static277.method3835(arg1);
				local7.anInt3563 = local88.anInt5546 << 7;
				local7.anInt3570 = local88.anInt5536;
			}
			Static427.aClass142_49.method3212(local7);
		} else if (arg5 != null) {
			local7.aClass47_Sub1_Sub5_Sub2_1 = arg5;
			local7.anInt3565 = arg5.method4317() + arg2 << 7;
			local7.anInt3571 = arg5.method4317() + arg6 << 7;
			local7.anInt3567 = Static43.method575(arg5);
			local7.anInt3563 = arg5.anInt5441 << 7;
			local7.anInt3570 = arg5.anInt5427;
			Static254.aClass51_14.method931(local7, (long) arg5.anInt5358);
			return;
		}
	}

	@OriginalMember(owner = "client!iq", name = "d", descriptor = "(I)I")
	public static int method2768() {
		if (Static432.aFrame2 == null) {
			return Static208.aBoolean303 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!iq", name = "a", descriptor = "(IIIII)I")
	public static int method2769(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = arg0 & 0xF;
		@Pc(16) int local16 = local7 >= 8 ? arg3 : arg1;
		@Pc(35) int local35 = local7 < 4 ? arg3 : local7 == 12 || local7 == 14 ? arg1 : arg2;
		return ((local7 & 0x2) == 0 ? local35 : -local35) + ((local7 & 0x1) == 0 ? local16 : -local16);
	}
}
