import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static100 {

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Lclient!wm;")
	public static Class390 aClass390_20;

	@OriginalMember(owner = "client!dd", name = "s", descriptor = "Lclient!pu;")
	public static Class50 aClass50_4;

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)I")
	public static int method1973(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIIZI)V")
	public static void method1974(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		if (Static496.anInt8305 < arg1 || Static639.anInt10384 > arg2) {
			return;
		}
		@Pc(34) boolean local34;
		if (Static106.anInt2266 > arg4) {
			local34 = false;
			arg4 = Static106.anInt2266;
		} else if (arg4 > Static669.anInt10712) {
			arg4 = Static669.anInt10712;
			local34 = false;
		} else {
			local34 = true;
		}
		@Pc(58) boolean local58;
		if (Static106.anInt2266 > arg3) {
			local58 = false;
			arg3 = Static106.anInt2266;
		} else if (Static669.anInt10712 < arg3) {
			arg3 = Static669.anInt10712;
			local58 = false;
		} else {
			local58 = true;
		}
		if (Static639.anInt10384 > arg1) {
			arg1 = Static639.anInt10384;
		} else {
			Static197.method3240(arg3, Static16.anIntArrayArray2[arg1++], arg4, arg0);
		}
		if (Static496.anInt8305 >= arg2) {
			Static197.method3240(arg3, Static16.anIntArrayArray2[arg2--], arg4, arg0);
		} else {
			arg2 = Static496.anInt8305;
		}
		@Pc(117) int local117;
		if (local34 && local58) {
			for (local117 = arg1; local117 <= arg2; local117++) {
				@Pc(155) int[] local155 = Static16.anIntArrayArray2[local117];
				local155[arg4] = local155[arg3] = arg0;
			}
			return;
		}
		if (local34) {
			for (local117 = arg1; local117 <= arg2; local117++) {
				Static16.anIntArrayArray2[local117][arg4] = arg0;
			}
			return;
		}
		if (local58) {
			for (local117 = arg1; local117 <= arg2; local117++) {
				Static16.anIntArrayArray2[local117][arg3] = arg0;
			}
			return;
		}
	}
}
