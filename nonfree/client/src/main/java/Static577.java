import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static577 {

	@OriginalMember(owner = "client!tha", name = "d", descriptor = "[Lclient!tf;")
	public static Class17[] aClass17Array17;

	@OriginalMember(owner = "client!tha", name = "b", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_128 = new Class216(36, 2);

	@OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIBII[III)Z")
	public static boolean method6921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) int arg5) {
		if (arg1 > Static491.anInt7688) {
			arg1 = Static491.anInt7688;
		}
		if (arg2 < 0) {
			arg2 = 0;
		}
		if (arg1 <= arg2) {
			return true;
		}
		@Pc(30) int local30 = arg1 - arg2 >> 2;
		arg0 += arg3 * arg2;
		arg5 += arg2 - 1;
		@Pc(73) int local73;
		@Pc(61) int local61;
		if (Static509.anInt7969 == 1) {
			Static267.anInt4311 += local30;
			while (true) {
				local30--;
				if (local30 < 0) {
					local30 = arg1 - arg2 & 0x3;
					while (true) {
						local30--;
						if (local30 < 0) {
							return true;
						}
						arg5++;
						if (arg4[arg5] > arg0) {
							arg4[arg5] = arg0;
						}
						arg0 += arg3;
					}
				}
				local61 = arg5 + 1;
				if (arg4[local61] > arg0) {
					arg4[local61] = arg0;
				}
				local73 = arg0 + arg3;
				local61++;
				if (local73 < arg4[local61]) {
					arg4[local61] = local73;
				}
				local73 += arg3;
				local61++;
				if (arg4[local61] > local73) {
					arg4[local61] = local73;
				}
				local73 += arg3;
				arg5 = local61 + 1;
				if (local73 < arg4[arg5]) {
					arg4[arg5] = local73;
				}
				arg0 = local73 + arg3;
			}
		} else {
			arg0 -= 38400;
			while (true) {
				local30--;
				if (local30 < 0) {
					local30 = arg1 - arg2 & 0x3;
					while (true) {
						local30--;
						if (local30 < 0) {
							return true;
						}
						arg5++;
						if (arg4[arg5] > arg0) {
							return false;
						}
						arg0 += arg3;
					}
				}
				@Pc(162) int local162 = ~arg0;
				local61 = arg5 + 1;
				if (local162 > ~arg4[local61]) {
					return false;
				}
				local73 = arg0 + arg3;
				local61++;
				if (local73 < arg4[local61]) {
					return false;
				}
				local73 += arg3;
				local61++;
				if (local73 < arg4[local61]) {
					return false;
				}
				local73 += arg3;
				arg5 = local61 + 1;
				if (arg4[arg5] > local73) {
					return false;
				}
				arg0 = local73 + arg3;
			}
		}
	}
}
