import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static383 {

	@OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
	public static int anInt7041;

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIZIIIII)V")
	public static void method5697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		@Pc(14) int local14 = arg2 - arg5;
		@Pc(18) int local18 = arg5 + arg3;
		for (@Pc(20) int local20 = arg3; local20 < local18; local20++) {
			Static679.method9323(Static274.anIntArrayArray34[local20], arg1, arg4, arg6);
		}
		@Pc(42) int local42 = arg5 + arg1;
		@Pc(47) int local47 = arg6 - arg5;
		for (@Pc(49) int local49 = arg2; local49 > local14; local49--) {
			Static679.method9323(Static274.anIntArrayArray34[local49], arg1, arg4, arg6);
		}
		for (@Pc(69) int local69 = local18; local69 <= local14; local69++) {
			@Pc(75) int[] local75 = Static274.anIntArrayArray34[local69];
			Static679.method9323(local75, arg1, arg4, local42);
			Static679.method9323(local75, local42, arg0, local47);
			Static679.method9323(local75, local47, arg4, arg6);
		}
	}

	@OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;")
	public static String method5698(@OriginalArg(1) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			@Pc(23) char local23 = arg0.charAt(local12);
			if (local23 == '<' || local23 == '>') {
				local10 += 3;
			}
		}
		@Pc(47) StringBuffer local47 = new StringBuffer(local10 + local8);
		for (@Pc(49) int local49 = 0; local49 < local8; local49++) {
			@Pc(55) char local55 = arg0.charAt(local49);
			if (local55 == '<') {
				local47.append("<lt>");
			} else if (local55 == '>') {
				local47.append("<gt>");
			} else {
				local47.append(local55);
			}
		}
		return local47.toString();
	}
}
