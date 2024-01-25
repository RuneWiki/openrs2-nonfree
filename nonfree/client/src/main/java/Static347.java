import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static347 {

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "I")
	public static int anInt6404;

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "I")
	public static int anInt6402 = 765;

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "I")
	public static int anInt6403 = 0;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_108 = new Class6(10, 5);

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZIIIIII)I")
	public static int method5550(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if ((arg0 & 0x1) == 1) {
			@Pc(6) int local6 = arg1;
			arg1 = arg2;
			arg2 = local6;
		}
		@Pc(18) int local18 = arg5 & 0x3;
		if (local18 == 0) {
			return arg3;
		} else if (local18 == 1) {
			return arg4;
		} else if (local18 == 2) {
			return 1 + 7 - arg1 - arg3;
		} else {
			return 1 + 7 - arg2 - arg4;
		}
	}
}
