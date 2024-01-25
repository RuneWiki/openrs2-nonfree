import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!qs", name = "n", descriptor = "[I")
	public static int[] anIntArray378 = new int[2];

	@OriginalMember(owner = "client!qs", name = "p", descriptor = "F")
	public static float aFloat179 = 1024.0F;

	@OriginalMember(owner = "client!qs", name = "s", descriptor = "I")
	public static int anInt5877 = -1;

	@OriginalMember(owner = "client!qs", name = "x", descriptor = "Lclient!cu;")
	public static final Class44 aClass44_79 = new Class44(0, 0);

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(ZIIIIII)V")
	public static void method4697(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static374.method5252(arg4);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg4 - arg2;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(25) int local25 = arg4;
		@Pc(28) int local28 = -arg4;
		@Pc(30) int local30 = local15;
		@Pc(33) int local33 = -local15;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(41) int[] local41 = Static277.anIntArrayArray40[arg3];
		@Pc(45) int local45 = arg0 - local15;
		@Pc(49) int local49 = arg0 + local15;
		Static49.method990(local41, local45, arg0 - arg4, arg1);
		Static49.method990(local41, local49, local45, arg5);
		Static49.method990(local41, arg4 + arg0, local49, arg1);
		while (local25 > local10) {
			local35 += 2;
			local37 += 2;
			local33 += local37;
			local28 += local35;
			if (local33 >= 0 && local30 >= 1) {
				Static447.anIntArray321[local30] = local10;
				local30--;
				local33 -= local30 << 1;
			}
			local10++;
			@Pc(124) int[] local124;
			@Pc(131) int[] local131;
			@Pc(135) int local135;
			@Pc(140) int local140;
			@Pc(145) int local145;
			@Pc(150) int local150;
			@Pc(155) int local155;
			if (local28 >= 0) {
				local25--;
				local28 -= local25 << 1;
				if (local25 < local15) {
					local124 = Static277.anIntArrayArray40[local25 + arg3];
					local131 = Static277.anIntArrayArray40[arg3 - local25];
					local135 = Static447.anIntArray321[local25];
					local140 = arg0 + local10;
					local145 = arg0 - local10;
					local150 = arg0 + local135;
					local155 = arg0 - local135;
					Static49.method990(local124, local155, local145, arg1);
					Static49.method990(local124, local150, local155, arg5);
					Static49.method990(local124, local140, local150, arg1);
					Static49.method990(local131, local155, local145, arg1);
					Static49.method990(local131, local150, local155, arg5);
					Static49.method990(local131, local140, local150, arg1);
				} else {
					local124 = Static277.anIntArrayArray40[local25 + arg3];
					local131 = Static277.anIntArrayArray40[arg3 - local25];
					local135 = local10 + arg0;
					local140 = arg0 - local10;
					Static49.method990(local124, local135, local140, arg1);
					Static49.method990(local131, local135, local140, arg1);
				}
			}
			local124 = Static277.anIntArrayArray40[local10 + arg3];
			local131 = Static277.anIntArrayArray40[arg3 - local10];
			local135 = arg0 + local25;
			local140 = arg0 - local25;
			if (local10 < local15) {
				local145 = local30 >= local10 ? local30 : Static447.anIntArray321[local10];
				local150 = arg0 + local145;
				local155 = arg0 - local145;
				Static49.method990(local124, local155, local140, arg1);
				Static49.method990(local124, local150, local155, arg5);
				Static49.method990(local124, local135, local150, arg1);
				Static49.method990(local131, local155, local140, arg1);
				Static49.method990(local131, local150, local155, arg5);
				Static49.method990(local131, local135, local150, arg1);
			} else {
				Static49.method990(local124, local135, local140, arg1);
				Static49.method990(local131, local135, local140, arg1);
			}
		}
	}

	@OriginalMember(owner = "client!qs", name = "a", descriptor = "(III)Z")
	public static boolean method4699(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
