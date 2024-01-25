import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static31 {

	@OriginalMember(owner = "client!bd", name = "h", descriptor = "I")
	public static int anInt4658;

	@OriginalMember(owner = "client!bd", name = "f", descriptor = "[Z")
	public static final boolean[] aBooleanArray17 = new boolean[100];

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIIBIILclient!oa;I)V")
	public static void method4022(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) Class14 arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface18 local11 = (Interface18) Static162.method2962(arg5, arg7, arg3);
		@Pc(20) Class252 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static412.aClass307_4.method6636(local11.method6265());
			local26 = local11.method6272() & 0x3;
			local30 = local11.method6268();
			if (local20.anInt6886 == -1) {
				local37 = arg1;
				if (local20.anInt6889 > 0) {
					local37 = arg4;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg6.method6845(4, local37, arg2, arg0);
					} else if (local26 == 1) {
						arg6.method6899(local37, 4, arg2, arg0);
					} else if (local26 == 2) {
						arg6.method6845(4, local37, arg2 + 3, arg0);
					} else if (local26 == 3) {
						arg6.method6899(local37, 4, arg2, arg0 + 3);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg6.method6859(1, arg0, arg2, local37, 1);
					} else if (local26 == 1) {
						arg6.method6859(1, arg0, arg2 + 3, local37, 1);
					} else if (local26 == 2) {
						arg6.method6859(1, arg0 + 3, arg2 + 3, local37, 1);
					} else if (local26 == 3) {
						arg6.method6859(1, arg0 + 3, arg2, local37, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg6.method6899(local37, 4, arg2, arg0);
					} else if (local26 == 1) {
						arg6.method6845(4, local37, arg2 + 3, arg0);
					} else if (local26 == 2) {
						arg6.method6899(local37, 4, arg2, arg0 + 3);
					} else if (local26 == 3) {
						arg6.method6845(4, local37, arg2, arg0);
					}
				}
			} else {
				Static211.method3736(local26, arg2, local20, arg0, arg6);
			}
		}
		local11 = (Interface18) Static117.method2480(arg5, arg7, arg3, pba.class);
		if (local11 != null) {
			local20 = Static412.aClass307_4.method6636(local11.method6265());
			local26 = local11.method6272() & 0x3;
			local30 = local11.method6268();
			if (local20.anInt6886 != -1) {
				Static211.method3736(local26, arg2, local20, arg0, arg6);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt6889 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg6.method6866(arg2, arg0 + 3, arg2 - -3, local37, arg0);
				} else {
					arg6.method6866(arg2, arg0, arg2 + 3, local37, arg0 + 3);
				}
			}
		}
		local11 = (Interface18) Static300.method4758(arg5, arg7, arg3);
		if (local11 == null) {
			return;
		}
		local20 = Static412.aClass307_4.method6636(local11.method6265());
		local26 = local11.method6272() & 0x3;
		if (local20.anInt6886 != -1) {
			Static211.method3736(local26, arg2, local20, arg0, arg6);
			return;
		}
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIB)Z")
	public static boolean method4023(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x800) != 0;
	}
}
