import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static313 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ks", name = "k", descriptor = "Ljava/lang/Class;")
	private static Class aClass17;

	@OriginalMember(owner = "client!ks", name = "j", descriptor = "Lclient!po;")
	public static final Class290 aClass290_3 = new Class290("game4", "Game 4", 3);

	@OriginalMember(owner = "client!ks", name = "a", descriptor = "(IIILclient!ha;IIIII)V")
	public static void method4819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class100 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface9 local11 = (Interface9) Static142.method6599(arg4, arg1, arg2);
		@Pc(20) Class354 local20;
		@Pc(26) int local26;
		@Pc(32) int local32;
		@Pc(49) int local49;
		if (local11 != null) {
			local20 = Static528.aClass243_3.method5556(local11.method8364());
			local26 = local11.method8367() & 0x3;
			local32 = local11.method8366();
			if (local20.anInt9418 == -1) {
				local49 = arg7;
				if (local20.anInt9386 > 0) {
					local49 = arg6;
				}
				if (local32 == 0 || local32 == 2) {
					if (local26 == 0) {
						arg3.method8621(local49, 4, arg0, arg5);
					} else if (local26 == 1) {
						arg3.method8615(4, arg0, arg5, local49);
					} else if (local26 == 2) {
						arg3.method8621(local49, 4, arg0 + 3, arg5);
					} else if (local26 == 3) {
						arg3.method8615(4, arg0, arg5 + 3, local49);
					}
				}
				if (local32 == 3) {
					if (local26 == 0) {
						arg3.method8644(arg5, local49, 1, arg0, 1);
					} else if (local26 == 1) {
						arg3.method8644(arg5, local49, 1, arg0 + 3, 1);
					} else if (local26 == 2) {
						arg3.method8644(arg5 + 3, local49, 1, arg0 + 3, 1);
					} else if (local26 == 3) {
						arg3.method8644(arg5 + 3, local49, 1, arg0, 1);
					}
				}
				if (local32 == 2) {
					if (local26 == 0) {
						arg3.method8615(4, arg0, arg5, local49);
					} else if (local26 == 1) {
						arg3.method8621(local49, 4, arg0 + 3, arg5);
					} else if (local26 == 2) {
						arg3.method8615(4, arg0, arg5 + 3, local49);
					} else if (local26 == 3) {
						arg3.method8621(local49, 4, arg0, arg5);
					}
				}
			} else {
				Static616.method8456(local26, arg5, arg3, arg0, local20);
			}
		}
		local11 = (Interface9) Static367.method5340(arg4, arg1, arg2, aClass17 == null ? (aClass17 = Class124_Sub1.a("dp")) : aClass17);
		if (local11 != null) {
			local20 = Static528.aClass243_3.method5556(local11.method8364());
			local26 = local11.method8367() & 0x3;
			local32 = local11.method8366();
			if (local20.anInt9418 != -1) {
				Static616.method8456(local26, arg5, arg3, arg0, local20);
			} else if (local32 == 9) {
				local49 = -1118482;
				if (local20.anInt9386 > 0) {
					local49 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg3.method8597(arg0, arg0 + 3, arg5, local49, arg5 + 3);
				} else {
					arg3.method8597(arg0, arg0 + 3, arg5 + 3, local49, arg5);
				}
			}
		}
		local11 = (Interface9) Static254.method4181(arg4, arg1, arg2);
		if (local11 == null) {
			return;
		}
		local20 = Static528.aClass243_3.method5556(local11.method8364());
		local26 = local11.method8367() & 0x3;
		if (local20.anInt9418 != -1) {
			Static616.method8456(local26, arg5, arg3, arg0, local20);
			return;
		}
	}
}
