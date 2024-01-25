import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static182 {

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "J")
	public static long aLong85 = 0L;

	@OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
	public static int anInt3207 = 0;

	@OriginalMember(owner = "client!hda", name = "a", descriptor = "(IILclient!oa;Lclient!lb;Lclient!maa;ILclient!ek;Z)V")
	public static void method2732(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(3) Class179 arg3, @OriginalArg(4) Class6_Sub34 arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class85 arg6) {
		@Pc(18) int local18 = arg4.anInt4908 - arg0 / 2 - 5;
		@Pc(22) int local22 = arg5 + 2;
		if (arg3.anInt4590 != 0) {
			arg2.method7109(local22, arg0 + 10, -local22 + 1 + arg5 + arg1 * arg6.method1783(), local18, arg3.anInt4590);
		}
		if (arg3.anInt4589 != 0) {
			arg2.method7160(arg0 + 10, local22, arg3.anInt4589, local18, arg6.method1783() * arg1 + arg5 + 1 - local22);
		}
		@Pc(75) int local75 = arg3.anInt4575;
		if (arg4.aBoolean294 && arg3.anInt4579 != -1) {
			local75 = arg3.anInt4579;
		}
		for (@Pc(87) int local87 = 0; local87 < arg1; local87++) {
			@Pc(93) String local93 = Static533.aStringArray35[local87];
			if (arg1 - 1 > local87) {
				local93 = local93.substring(0, local93.length() - 4);
			}
			arg6.method1784(arg2, local93, arg4.anInt4908, arg5, local75);
			arg5 += arg6.method1783();
		}
	}
}
