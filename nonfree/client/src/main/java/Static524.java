import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static524 {

	@OriginalMember(owner = "client!uca", name = "h", descriptor = "F")
	public static float aFloat187;

	@OriginalMember(owner = "client!uca", name = "k", descriptor = "I")
	public static int anInt9583;

	@OriginalMember(owner = "client!uca", name = "d", descriptor = "I")
	public static int anInt9578 = 0;

	@OriginalMember(owner = "client!uca", name = "f", descriptor = "I")
	public static int anInt9579 = 0;

	@OriginalMember(owner = "client!uca", name = "s", descriptor = "Lclient!nj;")
	public static final Class230 aClass230_99 = new Class230(30, 3);

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZB)V")
	public static void method7760(@OriginalArg(0) boolean arg0) {
		if (Static387.aString90.length() == 0) {
			return;
		}
		Static454.method7045("--> " + Static387.aString90);
		Static150.method2949(Static387.aString90, false, arg0);
		Static427.anInt9474 = 0;
		Static387.aString90 = "";
		Static333.anInt6934 = 0;
	}

	@OriginalMember(owner = "client!uca", name = "a", descriptor = "(ZLclient!oa;IIIIIII)V")
	public static void method7766(@OriginalArg(1) Class15 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(22) Interface22 local22 = (Interface22) Static496.method7511(arg6, arg7, arg5);
		@Pc(31) Class292 local31;
		@Pc(41) int local41;
		@Pc(45) int local45;
		@Pc(60) int local60;
		if (local22 != null) {
			local31 = Static253.aClass146_2.method3356(local22.method8398());
			local41 = local22.method8402() & 0x3;
			local45 = local22.method8399();
			if (local31.anInt8755 == -1) {
				local60 = arg2;
				if (local31.anInt8778 > 0) {
					local60 = arg4;
				}
				if (local45 == 0 || local45 == 2) {
					if (local41 == 0) {
						arg0.method5316(4, local60, arg3, arg1);
					} else if (local41 == 1) {
						arg0.method5281(arg3, 4, local60, arg1);
					} else if (local41 == 2) {
						arg0.method5316(4, local60, arg3, arg1 + 3);
					} else if (local41 == 3) {
						arg0.method5281(arg3 + 3, 4, local60, arg1);
					}
				}
				if (local45 == 3) {
					if (local41 == 0) {
						arg0.method5341(local60, arg1, 1, 1, arg3);
					} else if (local41 == 1) {
						arg0.method5341(local60, arg1 + 3, 1, 1, arg3);
					} else if (local41 == 2) {
						arg0.method5341(local60, arg1 + 3, 1, 1, arg3 + 3);
					} else if (local41 == 3) {
						arg0.method5341(local60, arg1, 1, 1, arg3 + 3);
					}
				}
				if (local45 == 2) {
					if (local41 == 0) {
						arg0.method5281(arg3, 4, local60, arg1);
					} else if (local41 == 1) {
						arg0.method5316(4, local60, arg3, arg1 + 3);
					} else if (local41 == 2) {
						arg0.method5281(arg3 + 3, 4, local60, arg1);
					} else if (local41 == 3) {
						arg0.method5316(4, local60, arg3, arg1);
					}
				}
			} else {
				Static118.method7556(arg1, local31, arg0, arg3, local41);
			}
		}
		local22 = (Interface22) Static200.method3364(arg6, arg7, arg5, ut.class);
		if (local22 != null) {
			local31 = Static253.aClass146_2.method3356(local22.method8398());
			local41 = local22.method8402() & 0x3;
			local45 = local22.method8399();
			if (local31.anInt8755 != -1) {
				Static118.method7556(arg1, local31, arg0, arg3, local41);
			} else if (local45 == 9) {
				local60 = -1118482;
				if (local31.anInt8778 > 0) {
					local60 = -1179648;
				}
				if (local41 == 0 || local41 == 2) {
					arg0.method5287(arg1, arg1 + 3, arg3, local60, arg3 + 3);
				} else {
					arg0.method5287(arg1, arg1 + 3, arg3 + 3, local60, arg3);
				}
			}
		}
		local22 = (Interface22) Static86.method1922(arg6, arg7, arg5);
		if (local22 == null) {
			return;
		}
		local31 = Static253.aClass146_2.method3356(local22.method8398());
		local41 = local22.method8402() & 0x3;
		if (local31.anInt8755 != -1) {
			Static118.method7556(arg1, local31, arg0, arg3, local41);
			return;
		}
	}
}
