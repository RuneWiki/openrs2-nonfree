import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static353 {

	@OriginalMember(owner = "client!nh", name = "m", descriptor = "I")
	public static int anInt6196;

	@OriginalMember(owner = "client!nh", name = "k", descriptor = "Lclient!nq;")
	public static final Class230 aClass230_3 = new Class230("stellardawn", 1);

	@OriginalMember(owner = "client!nh", name = "l", descriptor = "Lclient!tt;")
	public static final Class319 aClass319_112 = new Class319(32, 8);

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(III[IIIII)Z")
	public static boolean method5182(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) int arg5) {
		if (Static126.anInt6657 < arg0) {
			arg0 = Static126.anInt6657;
		}
		if (arg4 < 0) {
			arg4 = 0;
		}
		if (arg0 <= arg4) {
			return true;
		}
		arg1 += arg5 * arg4;
		arg3 += arg4 - 1;
		@Pc(51) int local51 = arg0 - arg4 >> 2;
		@Pc(60) int local60;
		@Pc(73) int local73;
		@Pc(62) int local62;
		if (Static343.anInt6063 == 1) {
			Static13.anInt359 += local51;
			while (true) {
				local51--;
				if (local51 < 0) {
					local51 = arg0 - arg4 & 0x3;
					while (true) {
						local51--;
						if (local51 < 0) {
							return true;
						}
						local60 = ~arg1;
						arg3++;
						if (local60 > ~arg2[arg3]) {
							arg2[arg3] = arg1;
						}
						arg1 += arg5;
					}
				}
				local62 = arg3 + 1;
				if (arg2[local62] > arg1) {
					arg2[local62] = arg1;
				}
				local73 = arg1 + arg5;
				local62++;
				if (local73 < arg2[local62]) {
					arg2[local62] = local73;
				}
				local73 += arg5;
				local62++;
				if (arg2[local62] > local73) {
					arg2[local62] = local73;
				}
				local73 += arg5;
				local60 = ~local73;
				arg3 = local62 + 1;
				if (local60 > ~arg2[arg3]) {
					arg2[arg3] = local73;
				}
				arg1 = local73 + arg5;
			}
		} else {
			arg1 -= 15360;
			while (true) {
				local51--;
				if (local51 < 0) {
					local51 = arg0 - arg4 & 0x3;
					while (true) {
						local51--;
						if (local51 < 0) {
							return true;
						}
						local60 = ~arg1;
						arg3++;
						if (local60 > ~arg2[arg3]) {
							return false;
						}
						arg1 += arg5;
					}
				}
				local60 = ~arg1;
				local62 = arg3 + 1;
				if (local60 > ~arg2[local62]) {
					return false;
				}
				local73 = arg1 + arg5;
				local62++;
				if (arg2[local62] > local73) {
					return false;
				}
				local73 += arg5;
				local62++;
				if (local73 < arg2[local62]) {
					return false;
				}
				local73 += arg5;
				arg3 = local62 + 1;
				if (arg2[arg3] > local73) {
					return false;
				}
				arg1 = local73 + arg5;
			}
		}
	}
}
