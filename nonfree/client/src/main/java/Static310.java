import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static310 {

	@OriginalMember(owner = "client!to", name = "f", descriptor = "[Lclient!lg;")
	public static Class60[] aClass60Array17;

	@OriginalMember(owner = "client!to", name = "j", descriptor = "I")
	public static int anInt6221;

	@OriginalMember(owner = "client!to", name = "k", descriptor = "[Lclient!bl;")
	public static Class26[] aClass26Array4;

	@OriginalMember(owner = "client!to", name = "l", descriptor = "Lclient!am;")
	public static Class11 aClass11_139;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "Lclient!ph;")
	public static final Class154 aClass154_95 = new Class154(5);

	@OriginalMember(owner = "client!to", name = "c", descriptor = "[I")
	public static final int[] anIntArray502 = new int[14];

	@OriginalMember(owner = "client!to", name = "g", descriptor = "I")
	public static int anInt6218 = -1;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "I")
	public static int anInt6220 = -1;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(IIIIIII)V")
	public static void method5204(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static203.method3613(arg0);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg0 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg0;
		@Pc(27) int local27 = -arg0;
		@Pc(40) int local40 = local15;
		@Pc(43) int local43 = -local15;
		@Pc(45) int local45 = -1;
		@Pc(47) int local47 = -1;
		@Pc(70) int local70;
		@Pc(78) int local78;
		@Pc(87) int local87;
		@Pc(95) int local95;
		if (Static229.anInt4777 <= arg3 && arg3 <= Static165.anInt3366) {
			@Pc(61) int[] local61 = Static30.anIntArrayArray10[arg3];
			local70 = Static181.method3367(Static338.anInt5369, arg1 - arg0, Static295.anInt5964);
			local78 = Static181.method3367(Static338.anInt5369, arg0 + arg1, Static295.anInt5964);
			local87 = Static181.method3367(Static338.anInt5369, arg1 - local15, Static295.anInt5964);
			local95 = Static181.method3367(Static338.anInt5369, local15 + arg1, Static295.anInt5964);
			Static182.method3394(local70, local61, arg5, local87);
			Static182.method3394(local87, local61, arg4, local95);
			Static182.method3394(local95, local61, arg5, local78);
		}
		while (local10 < local24) {
			local47 += 2;
			local45 += 2;
			local27 += local45;
			local43 += local47;
			if (local43 >= 0 && local40 >= 1) {
				local40--;
				Static110.anIntArray234[local40] = local10;
				local43 -= local40 << 1;
			}
			local10++;
			@Pc(212) int local212;
			@Pc(223) int local223;
			@Pc(230) int[] local230;
			@Pc(159) int local159;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				local159 = arg3 - local24;
				local70 = arg3 + local24;
				if (Static229.anInt4777 <= local70 && Static165.anInt3366 >= local159) {
					if (local15 > local24) {
						local78 = Static110.anIntArray234[local24];
						local87 = Static181.method3367(Static338.anInt5369, local10 + arg1, Static295.anInt5964);
						local95 = Static181.method3367(Static338.anInt5369, arg1 - local10, Static295.anInt5964);
						local212 = Static181.method3367(Static338.anInt5369, arg1 + local78, Static295.anInt5964);
						local223 = Static181.method3367(Static338.anInt5369, arg1 - local78, Static295.anInt5964);
						if (Static165.anInt3366 >= local70) {
							local230 = Static30.anIntArrayArray10[local70];
							Static182.method3394(local95, local230, arg5, local223);
							Static182.method3394(local223, local230, arg4, local212);
							Static182.method3394(local212, local230, arg5, local87);
						}
						if (local159 >= Static229.anInt4777) {
							local230 = Static30.anIntArrayArray10[local159];
							Static182.method3394(local95, local230, arg5, local223);
							Static182.method3394(local223, local230, arg4, local212);
							Static182.method3394(local212, local230, arg5, local87);
						}
					} else {
						local78 = Static181.method3367(Static338.anInt5369, local10 + arg1, Static295.anInt5964);
						local87 = Static181.method3367(Static338.anInt5369, arg1 - local10, Static295.anInt5964);
						if (Static165.anInt3366 >= local70) {
							Static182.method3394(local87, Static30.anIntArrayArray10[local70], arg5, local78);
						}
						if (local159 >= Static229.anInt4777) {
							Static182.method3394(local87, Static30.anIntArrayArray10[local159], arg5, local78);
						}
					}
				}
			}
			local159 = arg3 - local10;
			local70 = arg3 + local10;
			if (Static229.anInt4777 <= local70 && Static165.anInt3366 >= local159) {
				local78 = arg1 + local24;
				local87 = arg1 - local24;
				if (local78 >= Static338.anInt5369 && Static295.anInt5964 >= local87) {
					local78 = Static181.method3367(Static338.anInt5369, local78, Static295.anInt5964);
					local87 = Static181.method3367(Static338.anInt5369, local87, Static295.anInt5964);
					if (local15 <= local10) {
						if (Static165.anInt3366 >= local70) {
							Static182.method3394(local87, Static30.anIntArrayArray10[local70], arg5, local78);
						}
						if (local159 >= Static229.anInt4777) {
							Static182.method3394(local87, Static30.anIntArrayArray10[local159], arg5, local78);
						}
					} else {
						local95 = local40 >= local10 ? local40 : Static110.anIntArray234[local10];
						local212 = Static181.method3367(Static338.anInt5369, arg1 + local95, Static295.anInt5964);
						local223 = Static181.method3367(Static338.anInt5369, arg1 - local95, Static295.anInt5964);
						if (local70 <= Static165.anInt3366) {
							local230 = Static30.anIntArrayArray10[local70];
							Static182.method3394(local87, local230, arg5, local223);
							Static182.method3394(local223, local230, arg4, local212);
							Static182.method3394(local212, local230, arg5, local78);
						}
						if (Static229.anInt4777 <= local159) {
							local230 = Static30.anIntArrayArray10[local159];
							Static182.method3394(local87, local230, arg5, local223);
							Static182.method3394(local223, local230, arg4, local212);
							Static182.method3394(local212, local230, arg5, local78);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)Lclient!jj;")
	public static Class83_Sub1 method5205() {
		Static345.anInt6751 = 0;
		return Static153.method2974();
	}
}
