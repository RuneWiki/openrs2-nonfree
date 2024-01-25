import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!ng", name = "G", descriptor = "[Lclient!ol;")
	public static Class30_Sub1[] aClass30_Sub1Array3;

	@OriginalMember(owner = "client!ng", name = "K", descriptor = "Lclient!wv;")
	public static Class272 aClass272_4 = null;

	@OriginalMember(owner = "client!ng", name = "M", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_74 = new Class177(33, 7);

	@OriginalMember(owner = "client!ng", name = "Q", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_123 = new Class263(77, 2);

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(IB)V")
	public static void method3977(@OriginalArg(0) int arg0) {
		@Pc(8) Class1_Sub1_Sub11 local8 = Static248.method3707(arg0, 3);
		local8.method2954();
	}

	@OriginalMember(owner = "client!ng", name = "b", descriptor = "(III)Lclient!f;")
	public static Class30_Sub2 method3979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class252 local7 = Static67.aClass252ArrayArrayArray2[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass30_Sub2_3;
	}

	@OriginalMember(owner = "client!ng", name = "a", descriptor = "(IJIB)V")
	public static void method3980(@OriginalArg(0) int arg0, @OriginalArg(1) long arg1, @OriginalArg(2) int arg2) {
		@Pc(10) int local10 = (int) arg1 >> 14 & 0x1F;
		@Pc(22) int local22 = (int) arg1 >> 20 & 0x3;
		@Pc(29) int local29 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
		if (local10 != 10 && local10 != 11 && local10 != 22) {
			Static56.method1067(local22, local10, arg0, arg2, 0, true, 0, 0);
			return;
		}
		@Pc(43) Class192 local43 = Static455.aClass161_4.method3628(local29);
		@Pc(54) int local54;
		@Pc(57) int local57;
		if (local22 == 0 || local22 == 2) {
			local54 = local43.anInt5661;
			local57 = local43.anInt5679;
		} else {
			local54 = local43.anInt5679;
			local57 = local43.anInt5661;
		}
		@Pc(68) int local68 = local43.anInt5636;
		if (local22 != 0) {
			local68 = (local68 << local22 & 0xF) + (local68 >> 4 - local22);
		}
		Static56.method1067(0, 0, arg0, arg2, local68, true, local57, local54);
	}
}
