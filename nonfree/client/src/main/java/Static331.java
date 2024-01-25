import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static331 {

	@OriginalMember(owner = "client!lb", name = "t", descriptor = "[I")
	public static int[] anIntArray346 = new int[1];

	@OriginalMember(owner = "client!lb", name = "A", descriptor = "I")
	public static int anInt6125 = -60;

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(II)V")
	public static void method5103(@OriginalArg(0) int arg0) {
		@Pc(9) Class5_Sub3_Sub17 local9 = Static358.method5408(8, (long) arg0);
		local9.method7288();
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lclient!wm;II)Lclient!ne;")
	public static Class247 method5104(@OriginalArg(0) Class390 arg0, @OriginalArg(1) int arg1) {
		@Pc(16) byte[] local16 = arg0.method8923(arg1);
		return local16 == null ? null : new Class247(local16);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILclient!jha;ILclient!ft;ILclient!ih;)V")
	public static void method5106(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class28_Sub1_Sub4_Sub2_Sub2 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class28_Sub1_Sub4_Sub2_Sub1 arg5, @OriginalArg(7) Class164 arg6) {
		@Pc(7) Class5_Sub52 local7 = new Class5_Sub52();
		local7.anInt9157 = arg4;
		local7.anInt9160 = arg1 << 9;
		local7.anInt9154 = arg2 << 9;
		if (arg6 != null) {
			local7.aClass164_1 = arg6;
			@Pc(168) int local168 = arg6.anInt4634;
			@Pc(171) int local171 = arg6.anInt4645;
			if (arg0 == 1 || arg0 == 3) {
				local171 = arg6.anInt4634;
				local168 = arg6.anInt4645;
			}
			local7.anInt9163 = arg6.anInt4649 << 9;
			local7.aBoolean783 = arg6.aBoolean388;
			local7.aBoolean782 = arg6.aBoolean385;
			local7.anInt9151 = arg6.anInt4646;
			local7.anInt9155 = arg6.anInt4644;
			local7.anInt9158 = arg2 + local168 << 9;
			local7.anInt9161 = arg6.anInt4626 << 9;
			local7.anInt9165 = arg6.anInt4658;
			local7.anIntArray512 = arg6.anIntArray243;
			local7.anInt9166 = arg6.anInt4641;
			local7.anInt9162 = arg6.anInt4638;
			local7.anInt9153 = arg6.anInt4650;
			local7.anInt9164 = arg1 + local171 << 9;
			if (arg6.anIntArray247 != null) {
				local7.aBoolean784 = true;
				local7.method7757();
			}
			if (local7.anIntArray512 != null) {
				local7.anInt9167 = (int) ((double) (local7.anInt9151 - local7.anInt9153) * Math.random()) + local7.anInt9153;
			}
			Static573.aClass114_64.method2807(local7);
			return;
		}
		if (arg5 != null) {
			local7.aClass28_Sub1_Sub4_Sub2_Sub1_2 = arg5;
			@Pc(34) Class134 local34 = arg5.aClass134_1;
			if (local34.anIntArray191 != null) {
				local7.aBoolean784 = true;
				local34 = local34.method3276(Static161.aClass237_3);
			}
			if (local34 != null) {
				local7.anInt9164 = arg1 + local34.anInt3851 << 9;
				local7.anInt9158 = arg2 + local34.anInt3851 << 9;
				local7.anInt9166 = Static258.method4028(arg5);
				local7.anInt9162 = local34.anInt3842;
				local7.anInt9163 = local34.anInt3813 << 9;
				local7.anInt9165 = local34.anInt3837;
				local7.anInt9155 = local34.anInt3814;
				local7.anInt9161 = local34.anInt3830 << 9;
				local7.aBoolean782 = local34.aBoolean299;
			}
			Static195.aClass114_21.method2807(local7);
			return;
		}
		if (arg3 == null) {
			return;
		}
		local7.aClass28_Sub1_Sub4_Sub2_Sub2_2 = arg3;
		local7.anInt9158 = arg2 + arg3.method4599() << 9;
		local7.anInt9164 = arg3.method4599() + arg1 << 9;
		local7.anInt9166 = Static258.method4024(arg3);
		local7.anInt9155 = arg3.anInt5542;
		local7.anInt9165 = 256;
		local7.anInt9161 = 0;
		local7.anInt9162 = 256;
		local7.aBoolean782 = arg3.aBoolean477;
		local7.anInt9163 = arg3.anInt5536 << 9;
		Static520.aClass300_40.method7191(local7, (long) arg3.anInt5512);
		return;
	}
}
