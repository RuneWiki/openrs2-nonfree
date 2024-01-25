import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!baa", name = "b", descriptor = "I")
	public static int anInt879 = 0;

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(III[BII)V")
	public static void method779(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(5) int arg3) {
		if (arg0 >= arg1) {
			return;
		}
		arg3 += arg0;
		@Pc(24) int local24 = arg1 - arg0 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg1 - arg0 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg2[arg3++] = 1;
				}
			}
			@Pc(29) int local29 = arg3 + 1;
			arg2[arg3] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg3 = local39 + 1;
			arg2[local39] = 1;
		}
	}

	@OriginalMember(owner = "client!baa", name = "a", descriptor = "(BC)I")
	public static int method780(@OriginalArg(1) char arg0) {
		return arg0 >= '\u0000' && Class25.anIntArray25.length > arg0 ? Class25.anIntArray25[arg0] : -1;
	}
}
