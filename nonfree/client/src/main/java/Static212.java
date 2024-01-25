import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
	public static final int anInt3631 = 1338;

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(BII)Z")
	public static boolean method3105(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static590.method8953(arg1, arg0) | (arg1 & 0x70000) != 0 || Static293.method4213(arg0, arg1);
	}

	@OriginalMember(owner = "client!hg", name = "a", descriptor = "(III[BIZ)V")
	public static void method3106(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) byte[] arg2, @OriginalArg(4) int arg3) {
		if (arg1 >= arg3) {
			return;
		}
		arg0 += arg1;
		@Pc(24) int local24 = arg3 - arg1 >> 2;
		while (true) {
			local24--;
			if (local24 < 0) {
				local24 = arg3 - arg1 & 0x3;
				while (true) {
					local24--;
					if (local24 < 0) {
						return;
					}
					arg2[arg0++] = 1;
				}
			}
			@Pc(29) int local29 = arg0 + 1;
			arg2[arg0] = 1;
			@Pc(34) int local34 = local29 + 1;
			arg2[local29] = 1;
			@Pc(39) int local39 = local34 + 1;
			arg2[local34] = 1;
			arg0 = local39 + 1;
			arg2[local39] = 1;
		}
	}
}
