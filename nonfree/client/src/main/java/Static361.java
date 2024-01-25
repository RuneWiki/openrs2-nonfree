import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static361 {

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "[I")
	public static int[] anIntArray355;

	@OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
	public static int anInt6364;

	@OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
	public static int anInt6365;

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "[I")
	public static final int[] anIntArray354 = new int[25];

	@OriginalMember(owner = "client!nga", name = "d", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_107 = new Class287(0, 8);

	@OriginalMember(owner = "client!nga", name = "e", descriptor = "Lclient!hga;")
	public static final Class123 aClass123_212 = new Class123(3, 8);

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(II[BI)I")
	public static int method5137(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) byte[] arg2) {
		@Pc(7) int local7 = -1;
		for (@Pc(14) int local14 = arg0; local14 < arg1; local14++) {
			local7 = local7 >>> 8 ^ Class90.anIntArray100[(local7 ^ arg2[local14]) & 0xFF];
		}
		return ~local7;
	}

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(B[BIIIII)Z")
	public static boolean method5138(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		@Pc(14) int local14 = arg4 % 8;
		@Pc(21) int local21;
		if (local14 == 0) {
			local21 = 0;
		} else {
			local21 = 8 - local14;
		}
		@Pc(35) int local35 = -((arg2 + 8 - 1) / 8);
		@Pc(45) int local45 = -((arg4 + 7) / 8);
		for (@Pc(47) int local47 = local35; local47 < 0; local47++) {
			for (@Pc(51) int local51 = local45; local51 < 0; local51++) {
				if (arg0[arg3] == 0) {
					return true;
				}
				arg3 += 8;
			}
			arg3 -= local21;
			if (arg0[arg3 - 1] == 0) {
				return true;
			}
			arg3 += arg1;
		}
		return false;
	}
}
