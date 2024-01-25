import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static389 {

	@OriginalMember(owner = "client!oe", name = "I", descriptor = "I")
	public static int anInt7547;

	@OriginalMember(owner = "client!oe", name = "M", descriptor = "[I")
	public static int[] anIntArray409 = new int[2];

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIIBII)V")
	public static void method6229(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static64.method1712(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(24) int local24 = arg1;
		@Pc(27) int local27 = -arg1;
		@Pc(29) int local29 = local15;
		@Pc(32) int local32 = -local15;
		@Pc(34) int local34 = -1;
		@Pc(36) int local36 = -1;
		@Pc(40) int[] local40 = Static632.anIntArrayArray65[arg0];
		@Pc(50) int local50 = arg5 - local15;
		@Pc(54) int local54 = arg5 + local15;
		Static36.method1264(local40, arg5 - arg1, arg3, local50);
		Static36.method1264(local40, local50, arg4, local54);
		Static36.method1264(local40, local54, arg3, arg5 + arg1);
		while (local10 < local24) {
			local36 += 2;
			local34 += 2;
			local27 += local34;
			local32 += local36;
			if (local32 >= 0 && local29 >= 1) {
				Static209.anIntArray264[local29] = local10;
				local29--;
				local32 -= local29 << 1;
			}
			local10++;
			@Pc(130) int[] local130;
			@Pc(137) int[] local137;
			@Pc(141) int local141;
			@Pc(146) int local146;
			@Pc(151) int local151;
			@Pc(155) int local155;
			@Pc(159) int local159;
			if (local27 >= 0) {
				local24--;
				local27 -= local24 << 1;
				if (local24 < local15) {
					local130 = Static632.anIntArrayArray65[local24 + arg0];
					local137 = Static632.anIntArrayArray65[arg0 - local24];
					local141 = Static209.anIntArray264[local24];
					local146 = arg5 + local10;
					local151 = arg5 - local10;
					local155 = local141 + arg5;
					local159 = arg5 - local141;
					Static36.method1264(local130, local151, arg3, local159);
					Static36.method1264(local130, local159, arg4, local155);
					Static36.method1264(local130, local155, arg3, local146);
					Static36.method1264(local137, local151, arg3, local159);
					Static36.method1264(local137, local159, arg4, local155);
					Static36.method1264(local137, local155, arg3, local146);
				} else {
					local130 = Static632.anIntArrayArray65[local24 + arg0];
					local137 = Static632.anIntArrayArray65[arg0 - local24];
					local141 = local10 + arg5;
					local146 = arg5 - local10;
					Static36.method1264(local130, local146, arg3, local141);
					Static36.method1264(local137, local146, arg3, local141);
				}
			}
			local130 = Static632.anIntArrayArray65[local10 + arg0];
			local137 = Static632.anIntArrayArray65[arg0 - local10];
			local141 = arg5 + local24;
			local146 = arg5 - local24;
			if (local10 < local15) {
				local151 = local29 < local10 ? Static209.anIntArray264[local10] : local29;
				local155 = arg5 + local151;
				local159 = arg5 - local151;
				Static36.method1264(local130, local146, arg3, local159);
				Static36.method1264(local130, local159, arg4, local155);
				Static36.method1264(local130, local155, arg3, local141);
				Static36.method1264(local137, local146, arg3, local159);
				Static36.method1264(local137, local159, arg4, local155);
				Static36.method1264(local137, local155, arg3, local141);
			} else {
				Static36.method1264(local130, local146, arg3, local141);
				Static36.method1264(local137, local146, arg3, local141);
			}
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(II)V")
	public static void method6230(@OriginalArg(1) int arg0) {
		Static185.anInt4348 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ)Lclient!sn;")
	public static Class313 method6231(@OriginalArg(0) int arg0) {
		@Pc(8) Class313[] local8 = Static112.method2536();
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			@Pc(21) Class313 local21 = local8[local10];
			if (arg0 == local21.anInt9080) {
				return local21;
			}
		}
		return null;
	}
}
