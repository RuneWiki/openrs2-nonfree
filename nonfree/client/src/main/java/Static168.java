import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static168 {

	@OriginalMember(owner = "client!i", name = "C", descriptor = "I")
	public static int anInt4861 = 0;

	@OriginalMember(owner = "client!i", name = "E", descriptor = "Lclient!jh;")
	public static final Class123 aClass123_9 = new Class123();

	@OriginalMember(owner = "client!i", name = "F", descriptor = "[I")
	public static final int[] anIntArray365 = new int[4096];

	@OriginalMember(owner = "client!i", name = "G", descriptor = "S")
	public static short aShort55 = 1;

	@OriginalMember(owner = "client!i", name = "H", descriptor = "[I")
	public static final int[] anIntArray366 = new int[4096];

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(Lclient!pv;ILclient!ii;IBLclient!sj;II)V")
	public static void method3851(@OriginalArg(0) Class2_Sub1_Sub3_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class114 arg2, @OriginalArg(3) int arg3, @OriginalArg(5) Class2_Sub1_Sub3_Sub2 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(12) Class5_Sub31 local12 = new Class5_Sub31();
		local12.anInt4924 = arg3;
		local12.anInt4918 = arg5 << 7;
		local12.anInt4921 = arg1 << 7;
		if (arg2 != null) {
			local12.aClass114_1 = arg2;
			@Pc(33) int local33 = arg2.anInt2990;
			@Pc(36) int local36 = arg2.anInt2993;
			if (arg6 == 1 || arg6 == 3) {
				local33 = arg2.anInt2993;
				local36 = arg2.anInt2990;
			}
			local12.anInt4923 = arg2.anInt2985;
			local12.anInt4920 = arg2.anInt2956 << 7;
			local12.anInt4930 = local36 + arg5 << 7;
			local12.anIntArray371 = arg2.anIntArray172;
			local12.anInt4925 = local33 + arg1 << 7;
			local12.anInt4919 = arg2.anInt2977;
			local12.anInt4931 = arg2.anInt3000;
			local12.anInt4927 = arg2.anInt2984;
			if (arg2.anIntArray170 != null) {
				local12.aBoolean341 = true;
				local12.method3901();
			}
			if (local12.anIntArray371 != null) {
				local12.anInt4926 = local12.anInt4931 + (int) ((double) (local12.anInt4919 - local12.anInt4931) * Math.random());
			}
			Static207.aClass177_20.method3615(local12);
		} else if (arg0 != null) {
			local12.aClass2_Sub1_Sub3_Sub1_2 = arg0;
			@Pc(176) Class131 local176 = arg0.aClass131_1;
			if (local176.anIntArray209 != null) {
				local12.aBoolean341 = true;
				local176 = local176.method2781(Static408.aClass39_1);
			}
			if (local176 != null) {
				local12.anInt4925 = arg1 + local176.anInt3463 << 7;
				local12.anInt4930 = local176.anInt3463 + arg5 << 7;
				local12.anInt4923 = Static166.method2331(arg0);
				local12.anInt4927 = local176.anInt3491;
				local12.anInt4920 = local176.anInt3454 << 7;
			}
			Static45.aClass177_2.method3615(local12);
		} else if (arg4 != null) {
			local12.aClass2_Sub1_Sub3_Sub2_2 = arg4;
			local12.anInt4925 = arg4.method4913() + arg1 << 7;
			local12.anInt4930 = arg4.method4913() + arg5 << 7;
			local12.anInt4923 = Static132.method454(arg4);
			local12.anInt4927 = arg4.anInt6201;
			local12.anInt4920 = arg4.anInt6204 << 7;
			Static464.aClass252_39.method5658(local12, (long) arg4.anInt6126);
			return;
		}
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(II)Lclient!nj;")
	public static Class172 method3852(@OriginalArg(0) int arg0) {
		@Pc(8) Class172[] local8 = Static429.method5668();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(16) Class172 local16 = local8[local10];
			if (local16.anInt4367 == arg0) {
				return local16;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)V")
	public static void method3853(@OriginalArg(0) int arg0) {
		Static115.anInt1964 = arg0;
		Static222.aClass44_33.method1031();
	}
}
