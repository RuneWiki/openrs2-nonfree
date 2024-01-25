import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static517 {

	@OriginalMember(owner = "client!rl", name = "k", descriptor = "I")
	public static int anInt9046;

	@OriginalMember(owner = "client!rl", name = "n", descriptor = "Lclient!uh;")
	public static final Class352 aClass352_13 = new Class352(13, 0, 1, 0);

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(B[Ljava/lang/String;)V")
	public static void method7485(@OriginalArg(1) String[] arg0) {
		if (arg0.length <= 1) {
			Static76.aString15 = Static76.aString15 + arg0[0];
			Static283.anInt4865 += arg0[0].length();
			return;
		}
		for (@Pc(31) int local31 = 0; local31 < arg0.length; local31++) {
			if (arg0[local31].startsWith("pause")) {
				@Pc(41) int local41 = 5;
				try {
					local41 = Integer.parseInt(arg0[local31].substring(6));
				} catch (@Pc(50) Exception local50) {
				}
				Static466.method6830("Pausing for " + local41 + " seconds...");
				Static332.anInt6279 = local31 + 1;
				Static56.aStringArray6 = arg0;
				Static94.aLong53 = (long) (local41 * 1000) + Static521.method7499();
				return;
			}
			Static76.aString15 = arg0[local31];
			Static37.method841(false);
		}
	}

	@OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIIIIIII)V")
	public static void method7486(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(7) Class14_Sub9 local7 = null;
		for (@Pc(12) Class14_Sub9 local12 = (Class14_Sub9) Static605.aClass262_69.method6318(); local12 != null; local12 = (Class14_Sub9) Static605.aClass262_69.method6311()) {
			if (arg6 == local12.anInt1592 && local12.anInt1584 == arg4 && local12.anInt1586 == arg5 && local12.anInt1591 == arg3) {
				local7 = local12;
				break;
			}
		}
		if (local7 == null) {
			local7 = new Class14_Sub9();
			local7.anInt1591 = arg3;
			local7.anInt1586 = arg5;
			local7.anInt1592 = arg6;
			local7.anInt1584 = arg4;
			if (arg4 >= 0 && arg5 >= 0 && arg4 < Static26.anInt462 && Static445.anInt6140 > arg5) {
				Static199.method3037(local7);
			}
			Static605.aClass262_69.method6314(local7);
		}
		local7.anInt1590 = arg1;
		local7.aBoolean122 = false;
		local7.anInt1593 = arg0;
		local7.anInt1585 = arg2;
		local7.aBoolean123 = true;
	}
}
