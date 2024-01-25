import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static58 {

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "I")
	public static int anInt7090;

	@OriginalMember(owner = "client!cca", name = "a", descriptor = "(I[IIIIIII)Z")
	public static boolean method6166(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3 < 0) {
			arg3 = 0;
		}
		if (Static504.anInt8078 < arg5) {
			arg5 = Static504.anInt8078;
		}
		if (arg5 <= arg3) {
			return true;
		}
		arg4 += arg3 - 1;
		arg0 += arg2 * arg3;
		@Pc(43) int local43 = arg5 - arg3 >> 2;
		@Pc(73) int local73;
		@Pc(59) int local59;
		if (Static278.anInt4947 == 1) {
			Static547.anInt8693 += local43;
			while (true) {
				local43--;
				if (local43 < 0) {
					local43 = arg5 - arg3 & 0x3;
					while (true) {
						local43--;
						if (local43 < 0) {
							return true;
						}
						arg4++;
						if (arg1[arg4] > arg0) {
							arg1[arg4] = arg0;
						}
						arg0 += arg2;
					}
				}
				local59 = arg4 + 1;
				if (arg1[local59] > arg0) {
					arg1[local59] = arg0;
				}
				local73 = arg0 + arg2;
				local59++;
				if (arg1[local59] > local73) {
					arg1[local59] = local73;
				}
				local73 += arg2;
				local59++;
				if (local73 < arg1[local59]) {
					arg1[local59] = local73;
				}
				local73 += arg2;
				arg4 = local59 + 1;
				if (arg1[arg4] > local73) {
					arg1[arg4] = local73;
				}
				arg0 = local73 + arg2;
			}
		} else {
			arg0 -= 38400;
			while (true) {
				local43--;
				if (local43 < 0) {
					local43 = arg5 - arg3 & 0x3;
					while (true) {
						local43--;
						if (local43 < 0) {
							return true;
						}
						arg4++;
						if (arg1[arg4] > arg0) {
							return false;
						}
						arg0 += arg2;
					}
				}
				@Pc(57) int local57 = ~arg0;
				local59 = arg4 + 1;
				if (local57 > ~arg1[local59]) {
					return false;
				}
				local73 = arg0 + arg2;
				local59++;
				if (arg1[local59] > local73) {
					return false;
				}
				local73 += arg2;
				local57 = ~local73;
				local59++;
				if (local57 > ~arg1[local59]) {
					return false;
				}
				local73 += arg2;
				local57 = ~local73;
				arg4 = local59 + 1;
				if (local57 > ~arg1[arg4]) {
					return false;
				}
				arg0 = local73 + arg2;
			}
		}
	}
}
