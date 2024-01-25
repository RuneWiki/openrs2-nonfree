import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!ru", name = "s", descriptor = "Lclient!qa;")
	public static Class75 aClass75_10;

	@OriginalMember(owner = "client!ru", name = "t", descriptor = "[I")
	public static final int[] anIntArray460 = new int[5];

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIII)V")
	public static void method5027(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(24) int local24;
		if (arg2 < arg0) {
			for (local24 = arg2; local24 < arg0; local24++) {
				Static376.anIntArrayArray64[local24][arg1] = arg3;
			}
		} else {
			for (local24 = arg0; local24 < arg2; local24++) {
				Static376.anIntArrayArray64[local24][arg1] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIIIIIIIII)V")
	public static void method5028(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(9) int arg6) {
		@Pc(5) Class3_Sub15 local5 = null;
		for (@Pc(10) Class3_Sub15 local10 = (Class3_Sub15) Static342.aClass229_39.method5328(); local10 != null; local10 = (Class3_Sub15) Static342.aClass229_39.method5325()) {
			if (arg2 == local10.anInt2020 && local10.anInt2022 == arg6 && arg5 == local10.anInt2014 && local10.anInt2010 == arg4) {
				local5 = local10;
				break;
			}
		}
		if (local5 == null) {
			local5 = new Class3_Sub15();
			local5.anInt2022 = arg6;
			local5.anInt2010 = arg4;
			local5.anInt2014 = arg5;
			local5.anInt2020 = arg2;
			if (arg6 >= 0 && arg5 >= 0 && Static399.anInt6923 > arg6 && arg5 < Static127.anInt2696) {
				Static84.method1459(local5);
			}
			Static342.aClass229_39.method5321(local5);
		}
		local5.anInt2015 = arg3;
		local5.anInt2021 = -1;
		local5.anInt2018 = arg0;
		local5.anInt2016 = 0;
		local5.anInt2011 = arg1;
	}
}
