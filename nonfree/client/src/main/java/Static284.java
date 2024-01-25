import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static284 {

	@OriginalMember(owner = "client!kia", name = "i", descriptor = "I")
	public static int anInt5885;

	@OriginalMember(owner = "client!kia", name = "b", descriptor = "Z")
	public static boolean aBoolean423 = false;

	@OriginalMember(owner = "client!kia", name = "g", descriptor = "[I")
	public static final int[] anIntArray342 = new int[3];

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(ZII)Z")
	public static boolean method4804(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
	}

	@OriginalMember(owner = "client!kia", name = "a", descriptor = "(BIIIII)V")
	public static void method4806(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg2 - arg4;
		@Pc(15) int local15 = arg3 - arg0;
		if (local15 == 0) {
			if (local10 != 0) {
				Static231.method4278(arg0, arg1, arg4, arg2);
			}
		} else if (local10 == 0) {
			Static258.method4552(arg0, arg1, arg3, arg4);
		} else {
			if (local15 < 0) {
				local15 = -local15;
			}
			if (local10 < 0) {
				local10 = -local10;
			}
			@Pc(58) boolean local58 = local10 > local15;
			@Pc(62) int local62;
			@Pc(66) int local66;
			if (local58) {
				local62 = arg0;
				arg0 = arg4;
				local66 = arg3;
				arg3 = arg2;
				arg4 = local62;
				arg2 = local66;
			}
			if (arg3 < arg0) {
				local62 = arg0;
				arg0 = arg3;
				local66 = arg4;
				arg4 = arg2;
				arg3 = local62;
				arg2 = local66;
			}
			local62 = arg4;
			local66 = arg3 - arg0;
			@Pc(99) int local99 = arg2 - arg4;
			@Pc(104) int local104 = -(local66 >> 1);
			@Pc(119) int local119 = arg4 < arg2 ? 1 : -1;
			if (local99 < 0) {
				local99 = -local99;
			}
			@Pc(131) int local131;
			if (local58) {
				for (local131 = arg0; local131 <= arg3; local131++) {
					Static632.anIntArrayArray65[local131][local62] = arg1;
					local104 += local99;
					if (local104 > 0) {
						local62 += local119;
						local104 -= local66;
					}
				}
			} else {
				for (local131 = arg0; local131 <= arg3; local131++) {
					Static632.anIntArrayArray65[local62][local131] = arg1;
					local104 += local99;
					if (local104 > 0) {
						local62 += local119;
						local104 -= local66;
					}
				}
			}
		}
	}
}
