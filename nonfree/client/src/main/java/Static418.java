import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static418 {

	@OriginalMember(owner = "client!ut", name = "e", descriptor = "I")
	public static int anInt7456;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "[J")
	public static long[] aLongArray8;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "Z")
	public static boolean aBoolean477 = false;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_168 = new Class263(103, 3);

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "[I")
	public static final int[] anIntArray705 = new int[13];

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(Lclient!nv;I)[Lclient!me;")
	public static Class167[] method5681(@OriginalArg(0) Class183 arg0) {
		if (!arg0.method4138()) {
			return new Class167[0];
		}
		@Pc(14) Class157 local14 = arg0.method4145();
		while (local14.anInt4667 == 0) {
			Static289.method4249(10L);
		}
		if (local14.anInt4667 == 2) {
			return new Class167[0];
		}
		@Pc(40) int[] local40 = (int[]) local14.anObject13;
		@Pc(46) Class167[] local46 = new Class167[local40.length >> 2];
		for (@Pc(48) int local48 = 0; local48 < local46.length; local48++) {
			@Pc(53) Class167 local53 = new Class167();
			local46[local48] = local53;
			local53.anInt4759 = local40[local48 << 2];
			local53.anInt4757 = local40[(local48 << 2) + 1];
			local53.anInt4758 = local40[(local48 << 2) + 2];
			local53.anInt4760 = local40[(local48 << 2) + 3];
		}
		return local46;
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(ZI)V")
	public static void method5682() {
		Static81.aClass91_25.method1998(50);
		Static89.aClass91_104.method1998(50);
		Static96.aClass91_29.method1998(50);
		Static458.aClass91_103.method1998(50);
		Static135.aClass91_42.method1998(50);
	}

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBLclient!ch;ILclient!p;ILclient!bl;I)V")
	public static void method5683(@OriginalArg(0) int arg0, @OriginalArg(2) Class30_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class192 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class30_Sub1_Sub1_Sub1 arg5, @OriginalArg(7) int arg6) {
		@Pc(7) Class1_Sub22 local7 = new Class1_Sub22();
		local7.anInt3803 = arg6 << 7;
		local7.anInt3790 = arg4 << 7;
		local7.anInt3796 = arg0;
		if (arg3 != null) {
			local7.aClass192_1 = arg3;
			@Pc(28) int local28 = arg3.anInt5661;
			@Pc(31) int local31 = arg3.anInt5679;
			if (arg2 == 1 || arg2 == 3) {
				local28 = arg3.anInt5679;
				local31 = arg3.anInt5661;
			}
			local7.anInt3800 = arg4 + local28 << 7;
			local7.anIntArray367 = arg3.anIntArray536;
			local7.anInt3792 = arg3.anInt5682;
			local7.anInt3791 = arg3.anInt5669;
			local7.anInt3798 = arg3.anInt5685;
			local7.anInt3795 = arg3.anInt5670 << 7;
			local7.anInt3797 = arg3.anInt5674;
			local7.anInt3793 = arg6 + local31 << 7;
			if (arg3.anIntArray532 != null) {
				local7.aBoolean237 = true;
				local7.method2938();
			}
			if (local7.anIntArray367 != null) {
				local7.anInt3794 = local7.anInt3791 + (int) ((double) (local7.anInt3792 - local7.anInt3791) * Math.random());
			}
			Static30.aClass203_4.method4551(local7);
		} else if (arg5 != null) {
			local7.aClass30_Sub1_Sub1_Sub1_1 = arg5;
			@Pc(177) Class11 local177 = arg5.aClass11_1;
			if (local177.anIntArray12 != null) {
				local7.aBoolean237 = true;
				local177 = local177.method136(Static366.aClass190_1);
			}
			if (local177 != null) {
				local7.anInt3793 = arg6 + local177.anInt162 << 7;
				local7.anInt3800 = local177.anInt162 + arg4 << 7;
				local7.anInt3798 = Static145.method2320(arg5);
				local7.anInt3795 = local177.anInt179 << 7;
				local7.anInt3797 = local177.anInt161;
			}
			Static262.aClass203_17.method4551(local7);
		} else if (arg1 != null) {
			local7.aClass30_Sub1_Sub1_Sub2_1 = arg1;
			local7.anInt3800 = arg1.method944() + arg4 << 7;
			local7.anInt3793 = arg6 + arg1.method944() << 7;
			local7.anInt3798 = Static458.method6182(arg1);
			local7.anInt3797 = arg1.anInt1324;
			local7.anInt3795 = arg1.anInt1329 << 7;
			Static155.aClass38_15.method766(local7, (long) arg1.anInt1299);
		}
	}
}
