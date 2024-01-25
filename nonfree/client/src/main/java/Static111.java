import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!dq", name = "c", descriptor = "I")
	public static int anInt2388;

	@OriginalMember(owner = "client!dq", name = "g", descriptor = "I")
	public static int anInt2390 = 0;

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "([IIILclient!bi;ZIZI)Lclient!baa;")
	public static Class10_Sub2_Sub1 method2004(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class13_Sub2 arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (arg3.aBoolean93 || Static608.method8539(arg5) && Static608.method8539(arg4)) {
			return new Class10_Sub2_Sub1(arg3, 3553, arg5, arg4, false, arg0, arg2, 0);
		} else if (arg3.aBoolean95) {
			return new Class10_Sub2_Sub1(arg3, 34037, arg5, arg4, false, arg0, arg2, 0);
		} else {
			return new Class10_Sub2_Sub1(arg3, arg5, arg4, Static613.method8565(arg5), Static613.method8565(arg4), arg0);
		}
	}

	@OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Lclient!ds;")
	public static Class84 method2006(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2] == null) {
			@Pc(28) boolean local28 = Static348.aClass84ArrayArrayArray5[0][arg1][arg2] != null && Static348.aClass84ArrayArrayArray5[0][arg1][arg2].aClass84_1 != null;
			if (local28 && arg0 >= Static395.anInt6810 - 1) {
				return null;
			}
			Static10.method114(arg0, arg1, arg2);
		}
		return Static348.aClass84ArrayArrayArray5[arg0][arg1][arg2];
	}
}
