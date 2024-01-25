import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static21 {

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "Ljava/util/Hashtable;")
	public static Hashtable aHashtable2 = new Hashtable();

	@OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
	public static int anInt646 = 0;

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIIII)V")
	public static void method611(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static411.method6450(arg1);
		@Pc(10) int local10 = 0;
		@Pc(15) int local15 = arg1 - arg4;
		if (local15 < 0) {
			local15 = 0;
		}
		@Pc(21) int local21 = arg1;
		@Pc(24) int local24 = -arg1;
		@Pc(26) int local26 = local15;
		@Pc(33) int local33 = -local15;
		@Pc(35) int local35 = -1;
		@Pc(37) int local37 = -1;
		@Pc(41) int[] local41 = Static173.anIntArrayArray15[arg5];
		@Pc(46) int local46 = arg2 - local15;
		@Pc(50) int local50 = local15 + arg2;
		Static571.method7990(arg3, local41, arg2 - arg1, local46);
		Static571.method7990(arg0, local41, local46, local50);
		Static571.method7990(arg3, local41, local50, arg2 + arg1);
		while (local21 > local10) {
			local35 += 2;
			local37 += 2;
			local33 += local37;
			local24 += local35;
			if (local33 >= 0 && local26 >= 1) {
				Static569.anIntArray521[local26] = local10;
				local26--;
				local33 -= local26 << 1;
			}
			local10++;
			@Pc(128) int[] local128;
			@Pc(135) int[] local135;
			@Pc(139) int local139;
			@Pc(144) int local144;
			@Pc(184) int local184;
			@Pc(188) int local188;
			@Pc(193) int local193;
			if (local24 >= 0) {
				local21--;
				local24 -= local21 << 1;
				if (local21 >= local15) {
					local128 = Static173.anIntArrayArray15[local21 + arg5];
					local135 = Static173.anIntArrayArray15[arg5 - local21];
					local139 = arg2 + local10;
					local144 = arg2 - local10;
					Static571.method7990(arg3, local128, local144, local139);
					Static571.method7990(arg3, local135, local144, local139);
				} else {
					local128 = Static173.anIntArrayArray15[local21 + arg5];
					local135 = Static173.anIntArrayArray15[arg5 - local21];
					local139 = Static569.anIntArray521[local21];
					local144 = arg2 + local10;
					local184 = arg2 - local10;
					local188 = local139 + arg2;
					local193 = arg2 - local139;
					Static571.method7990(arg3, local128, local184, local193);
					Static571.method7990(arg0, local128, local193, local188);
					Static571.method7990(arg3, local128, local188, local144);
					Static571.method7990(arg3, local135, local184, local193);
					Static571.method7990(arg0, local135, local193, local188);
					Static571.method7990(arg3, local135, local188, local144);
				}
			}
			local128 = Static173.anIntArrayArray15[arg5 + local10];
			local135 = Static173.anIntArrayArray15[arg5 - local10];
			local139 = local21 + arg2;
			local144 = arg2 - local21;
			if (local15 <= local10) {
				Static571.method7990(arg3, local128, local144, local139);
				Static571.method7990(arg3, local135, local144, local139);
			} else {
				local184 = local26 >= local10 ? local26 : Static569.anIntArray521[local10];
				local188 = local184 + arg2;
				local193 = arg2 - local184;
				Static571.method7990(arg3, local128, local144, local193);
				Static571.method7990(arg0, local128, local193, local188);
				Static571.method7990(arg3, local128, local188, local139);
				Static571.method7990(arg3, local135, local144, local193);
				Static571.method7990(arg0, local135, local193, local188);
				Static571.method7990(arg3, local135, local188, local139);
			}
		}
	}

	@OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIIII)V")
	public static void method612(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		for (@Pc(11) int local11 = arg2; local11 <= arg3; local11++) {
			Static571.method7990(arg0, Static173.anIntArrayArray15[local11], arg4, arg1);
		}
	}
}
