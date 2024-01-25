import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static266 {

	@OriginalMember(owner = "client!iu", name = "n", descriptor = "[Lclient!hh;")
	public static Class6[] aClass6Array8;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(BII)V")
	public static void method3927(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class3_Sub5_Sub20 local9 = Static447.method6065((long) arg1, 17);
		local9.method8832();
		local9.anInt10754 = arg0;
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(IILclient!lp;IILclient!ub;ILclient!cm;)V")
	public static void method3928(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class216 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class34_Sub1_Sub1_Sub2_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class34_Sub1_Sub1_Sub2_Sub1 arg6) {
		@Pc(19) Class3_Sub30 local19 = new Class3_Sub30();
		local19.anInt4804 = arg1;
		local19.anInt4790 = arg5 << 9;
		local19.anInt4789 = arg3 << 9;
		if (arg2 != null) {
			local19.aClass216_1 = arg2;
			@Pc(179) int local179 = arg2.anInt5947;
			@Pc(182) int local182 = arg2.anInt5949;
			if (arg0 == 1 || arg0 == 3) {
				local179 = arg2.anInt5949;
				local182 = arg2.anInt5947;
			}
			local19.anInt4795 = arg2.anInt5967;
			local19.anInt4800 = arg2.anInt5964 << 9;
			local19.anInt4805 = arg2.anInt5958;
			local19.anInt4794 = arg3 + local179 << 9;
			local19.aBoolean317 = arg2.aBoolean413;
			local19.anInt4801 = arg2.anInt5983;
			local19.anInt4806 = arg2.anInt5997 << 9;
			local19.anInt4802 = arg2.anInt5977;
			local19.anInt4791 = arg2.anInt5989;
			local19.anIntArray276 = arg2.anIntArray323;
			local19.anInt4793 = arg5 + local182 << 9;
			local19.anInt4797 = arg2.anInt5963;
			local19.aBoolean316 = arg2.aBoolean414;
			if (arg2.anIntArray325 != null) {
				local19.aBoolean318 = true;
				local19.method4116();
			}
			if (local19.anIntArray276 != null) {
				local19.anInt4798 = (int) (Math.random() * (double) (local19.anInt4797 - local19.anInt4805)) + local19.anInt4805;
			}
			Static488.aClass302_50.method6613(local19);
		} else if (arg4 != null) {
			local19.aClass34_Sub1_Sub1_Sub2_Sub2_1 = arg4;
			@Pc(104) Class261 local104 = arg4.aClass261_1;
			if (local104.anIntArray364 != null) {
				local19.aBoolean318 = true;
				local104 = local104.method5772(Static210.aClass262_1);
			}
			if (local104 != null) {
				local19.anInt4793 = local104.anInt6807 + arg5 << 9;
				local19.anInt4794 = arg3 + local104.anInt6807 << 9;
				local19.anInt4791 = Static44.method791(arg4);
				local19.anInt4801 = local104.anInt6821;
				local19.anInt4795 = local104.anInt6823;
				local19.anInt4802 = local104.anInt6829;
				local19.anInt4806 = local104.anInt6825 << 9;
				local19.anInt4800 = local104.anInt6818 << 9;
				local19.aBoolean317 = local104.aBoolean482;
			}
			Static533.aClass302_48.method6613(local19);
		} else if (arg6 != null) {
			local19.aClass34_Sub1_Sub1_Sub2_Sub1_2 = arg6;
			local19.anInt4794 = arg3 + arg6.method7866() << 9;
			local19.anInt4793 = arg6.method7866() + arg5 << 9;
			local19.anInt4791 = Static553.method7313(arg6);
			local19.anInt4802 = 256;
			local19.aBoolean317 = arg6.aBoolean141;
			local19.anInt4806 = arg6.anInt1787 << 9;
			local19.anInt4801 = 256;
			local19.anInt4800 = 0;
			local19.anInt4795 = arg6.anInt1802;
			Static588.aClass333_42.method7488((long) arg6.anInt9671, local19);
			return;
		}
	}
}
