import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!dha", name = "t", descriptor = "Ljava/lang/Class;")
	private static Class aClass7;

	@OriginalMember(owner = "client!dha", name = "q", descriptor = "[I")
	public static final int[] anIntArray110 = new int[8];

	@OriginalMember(owner = "client!dha", name = "n", descriptor = "I")
	public static int anInt2265 = -2;

	@OriginalMember(owner = "client!dha", name = "a", descriptor = "(IIILclient!ha;IIIII)V")
	public static void method2018(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class67 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface19 local11 = (Interface19) Static32.method476(arg4, arg0, arg5);
		@Pc(20) Class144 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			local20 = Static70.aClass323_1.method7792(local11.method9384());
			local26 = local11.method9385() & 0x3;
			local30 = local11.method9381();
			if (local20.anInt4403 == -1) {
				local37 = arg7;
				if (local20.anInt4425 > 0) {
					local37 = arg2;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg3.method7690(4, local37, arg1, arg6);
					} else if (local26 == 1) {
						arg3.method7701(arg1, arg6, 4, local37);
					} else if (local26 == 2) {
						arg3.method7690(4, local37, arg1 + 3, arg6);
					} else if (local26 == 3) {
						arg3.method7701(arg1, arg6 + 3, 4, local37);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg3.method7696(arg1, 1, 1, arg6, local37);
					} else if (local26 == 1) {
						arg3.method7696(arg1 + 3, 1, 1, arg6, local37);
					} else if (local26 == 2) {
						arg3.method7696(arg1 + 3, 1, 1, arg6 + 3, local37);
					} else if (local26 == 3) {
						arg3.method7696(arg1, 1, 1, arg6 + 3, local37);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg3.method7701(arg1, arg6, 4, local37);
					} else if (local26 == 1) {
						arg3.method7690(4, local37, arg1 + 3, arg6);
					} else if (local26 == 2) {
						arg3.method7701(arg1, arg6 + 3, 4, local37);
					} else if (local26 == 3) {
						arg3.method7690(4, local37, arg1, arg6);
					}
				}
			} else {
				Static2.method9130(local20, arg3, local26, arg1, arg6);
			}
		}
		local11 = (Interface19) Static89.method1199(arg4, arg0, arg5, aClass7 == null ? (aClass7 = Class2_Sub1.a("pe")) : aClass7);
		if (local11 != null) {
			local20 = Static70.aClass323_1.method7792(local11.method9384());
			local26 = local11.method9385() & 0x3;
			local30 = local11.method9381();
			if (local20.anInt4403 != -1) {
				Static2.method9130(local20, arg3, local26, arg1, arg6);
			} else if (local30 == 9) {
				local37 = -1118482;
				if (local20.anInt4425 > 0) {
					local37 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg3.method7640(arg1, arg6 + 3, local37, arg6, arg1 + 3);
				} else {
					arg3.method7640(arg1, arg6, local37, arg6 + 3, arg1 - -3);
				}
			}
		}
		local11 = (Interface19) Static724.method9433(arg4, arg0, arg5);
		if (local11 == null) {
			return;
		}
		local20 = Static70.aClass323_1.method7792(local11.method9384());
		local26 = local11.method9385() & 0x3;
		if (local20.anInt4403 != -1) {
			Static2.method9130(local20, arg3, local26, arg1, arg6);
			return;
		}
	}
}
