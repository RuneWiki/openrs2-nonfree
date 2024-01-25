import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!nia", name = "l", descriptor = "I")
	public static int anInt6613;

	@OriginalMember(owner = "client!nia", name = "m", descriptor = "[I")
	public static final int[] anIntArray517 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IB)I")
	public static int method5854(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!nia", name = "a", descriptor = "(IIIIIIIILclient!ha;)V")
	public static void method5855(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) Class126 arg7) {
		@Pc(11) Interface20 local11 = (Interface20) Static601.method8388(arg0, arg2, arg3);
		@Pc(20) Class283 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(45) int local45;
		if (local11 != null) {
			local20 = Static525.aClass371_4.method8554(local11.method8009());
			local26 = local11.method8012() & 0x3;
			local30 = local11.method8015();
			if (local20.anInt7804 == -1) {
				local45 = arg5;
				if (local20.anInt7843 > 0) {
					local45 = arg1;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg7.method7059(local45, 4, arg6, arg4);
					} else if (local26 == 1) {
						arg7.method7033(arg6, 4, arg4, local45);
					} else if (local26 == 2) {
						arg7.method7059(local45, 4, arg6, arg4 + 3);
					} else if (local26 == 3) {
						arg7.method7033(arg6 + 3, 4, arg4, local45);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg7.method7045(1, 1, arg6, arg4, local45);
					} else if (local26 == 1) {
						arg7.method7045(1, 1, arg6, arg4 + 3, local45);
					} else if (local26 == 2) {
						arg7.method7045(1, 1, arg6 + 3, arg4 + 3, local45);
					} else if (local26 == 3) {
						arg7.method7045(1, 1, arg6 + 3, arg4, local45);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg7.method7033(arg6, 4, arg4, local45);
					} else if (local26 == 1) {
						arg7.method7059(local45, 4, arg6, arg4 + 3);
					} else if (local26 == 2) {
						arg7.method7033(arg6 + 3, 4, arg4, local45);
					} else if (local26 == 3) {
						arg7.method7059(local45, 4, arg6, arg4);
					}
				}
			} else {
				Static474.method6924(arg7, arg4, arg6, local26, local20);
			}
		}
		local11 = (Interface20) Static1.method5727(arg0, arg2, arg3, paa.class);
		if (local11 != null) {
			local20 = Static525.aClass371_4.method8554(local11.method8009());
			local26 = local11.method8012() & 0x3;
			local30 = local11.method8015();
			if (local20.anInt7804 != -1) {
				Static474.method6924(arg7, arg4, arg6, local26, local20);
			} else if (local30 == 9) {
				local45 = -1118482;
				if (local20.anInt7843 > 0) {
					local45 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg7.method7002(arg4 + 3, arg6, arg6 + 3, local45, arg4);
				} else {
					arg7.method7002(arg4 + 3, arg6 - -3, arg6, local45, arg4);
				}
			}
		}
		local11 = (Interface20) Static70.method7879(arg0, arg2, arg3);
		if (local11 == null) {
			return;
		}
		local20 = Static525.aClass371_4.method8554(local11.method8009());
		local26 = local11.method8012() & 0x3;
		if (local20.anInt7804 != -1) {
			Static474.method6924(arg7, arg4, arg6, local26, local20);
			return;
		}
	}
}
