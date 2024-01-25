import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "S")
	public static short aShort13 = 205;

	@OriginalMember(owner = "client!dr", name = "b", descriptor = "F")
	public static float aFloat96 = 1024.0F;

	@OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lclient!ha;IIIBIIII)V")
	public static void method2561(@OriginalArg(0) Class33 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface18 local11 = (Interface18) Static639.method8624(arg3, arg4, arg5);
		@Pc(30) int local30;
		@Pc(37) int local37;
		if (local11 != null) {
			@Pc(20) Class272 local20 = Static541.aClass349_4.method8123(local11.method8587());
			@Pc(26) int local26 = local11.method8586() & 0x3;
			local30 = local11.method8588();
			if (local20.anInt8268 == -1) {
				local37 = arg6;
				if (local20.anInt8270 > 0) {
					local37 = arg2;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg0.method6208(arg7, arg1, local37, 4);
					} else if (local26 == 1) {
						arg0.method6162(4, arg1, local37, arg7);
					} else if (local26 == 2) {
						arg0.method6208(arg7 + 3, arg1, local37, 4);
					} else if (local26 == 3) {
						arg0.method6162(4, arg1 + 3, local37, arg7);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg0.method6209(arg1, 1, 1, arg7, local37);
					} else if (local26 == 1) {
						arg0.method6209(arg1, 1, 1, arg7 + 3, local37);
					} else if (local26 == 2) {
						arg0.method6209(arg1 + 3, 1, 1, arg7 + 3, local37);
					} else if (local26 == 3) {
						arg0.method6209(arg1 + 3, 1, 1, arg7, local37);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg0.method6162(4, arg1, local37, arg7);
					} else if (local26 == 1) {
						arg0.method6208(arg7 + 3, arg1, local37, 4);
					} else if (local26 == 2) {
						arg0.method6162(4, arg1 + 3, local37, arg7);
					} else if (local26 == 3) {
						arg0.method6208(arg7, arg1, local37, 4);
					}
				}
			} else {
				Static206.method5560(arg7, arg1, arg0, local26, local20);
			}
		}
		local11 = (Interface18) Static17.method258(arg3, arg4, arg5, op.class);
		@Pc(264) Class272 local264;
		if (local11 != null) {
			local264 = Static541.aClass349_4.method8123(local11.method8587());
			local30 = local11.method8586() & 0x3;
			local37 = local11.method8588();
			if (local264.anInt8268 != -1) {
				Static206.method5560(arg7, arg1, arg0, local30, local264);
			} else if (local37 == 9) {
				@Pc(293) int local293 = -1118482;
				if (local264.anInt8270 > 0) {
					local293 = -1179648;
				}
				if (local30 == 0 || local30 == 2) {
					arg0.method6236(arg1, arg7 + 3, arg1 + 3, local293, arg7);
				} else {
					arg0.method6236(arg1 + 3, arg7 + 3, arg1, local293, arg7);
				}
			}
		}
		local11 = (Interface18) Static439.method6676(arg3, arg4, arg5);
		if (local11 == null) {
			return;
		}
		local264 = Static541.aClass349_4.method8123(local11.method8587());
		local30 = local11.method8586() & 0x3;
		if (local264.anInt8268 != -1) {
			Static206.method5560(arg7, arg1, arg0, local30, local264);
			return;
		}
	}
}
