import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "Lclient!ed;")
	public static Class23 aClass23_109 = Static169.method2903("m-Ochte mit Ihnen handeln)3");

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!ed;")
	public static Class23 aClass23_110 = Static169.method2903("Ein kostenloses Spielkonto erstellen)3");

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "Lclient!ed;")
	public static Class23 aClass23_111 = Static169.method2903("Passwort: ");

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIIIIII)I")
	public static int method163(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		@Pc(7) int local7 = arg3 & 0x3;
		if ((arg0 & 0x1) == 1) {
			@Pc(14) int local14 = arg2;
			arg2 = arg1;
			arg1 = local14;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 7 + 1 - arg4 - arg2;
		} else if (local7 == 2) {
			return 1 + 7 - arg1 - arg5;
		} else {
			return arg4;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(III)I")
	public static int method164(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(3) int local3 = 1;
		while (arg0 > 1) {
			if ((arg0 & 0x1) != 0) {
				local3 *= arg1;
			}
			arg1 *= arg1;
			arg0 >>= 0x1;
		}
		if (arg0 == 1) {
			return arg1 * local3;
		} else {
			return local3;
		}
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method165() {
		aClass23_110 = null;
		aClass23_109 = null;
		aClass23_111 = null;
	}
}
