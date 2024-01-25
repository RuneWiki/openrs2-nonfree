import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static350 {

	@OriginalMember(owner = "client!la", name = "d", descriptor = "Lclient!d;")
	public static Interface2 anInterface2_8;

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(IIILclient!d;ILclient!ha;I)V")
	public static void method5058(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Interface2 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class67 arg4, @OriginalArg(6) int arg5) {
		if (Static193.anInt3390 < 100) {
			Static720.method9403(arg2, arg4);
		}
		arg4.KA(arg0, arg1, arg0 + arg3, arg1 - -arg5);
		@Pc(39) int local39;
		@Pc(49) int local49;
		if (Static193.anInt3390 < 100) {
			local39 = arg3 / 2 + arg0;
			local49 = arg5 / 2 + arg1 - 38;
			arg4.aa(arg0, arg1, arg3, arg5, -16777216, 0);
			arg4.method7700(local39 - 152, local49, 304, 34, Static294.aColorArray2[Static48.anInt821].getRGB(), 0);
			arg4.aa(local39 - 150, local49 - -2, Static193.anInt3390 * 3, 30, Static15.aColorArray1[Static48.anInt821].getRGB(), 0);
			Static427.aClass44_34.method8119(Static476.aClass279_18.method6992(Static141.anInt2658), -9902, Static601.aColorArray3[Static48.anInt821].getRGB(), local39, -1, local49 + 20);
			return;
		}
		@Pc(115) int local115 = Static481.anInt8380 - (int) ((float) arg3 / Static654.aFloat160);
		local39 = Static442.anInt10084 + (int) ((float) arg5 / Static654.aFloat160);
		local49 = (int) ((float) arg3 / Static654.aFloat160) + Static481.anInt8380;
		Static716.anInt11194 = (int) ((float) (arg5 * 2) / Static654.aFloat160);
		@Pc(149) int local149 = Static442.anInt10084 - (int) ((float) arg5 / Static654.aFloat160);
		Static104.anInt1668 = (int) ((float) (arg3 * 2) / Static654.aFloat160);
		Static653.anInt10489 = Static481.anInt8380 - (int) ((float) arg3 / Static654.aFloat160);
		Static69.anInt1062 = Static442.anInt10084 - (int) ((float) arg5 / Static654.aFloat160);
		Static654.method6879(local115 + Static654.anInt8153, local39 + Static654.anInt8150, Static654.anInt8153 + local49, Static654.anInt8150 + local149, arg0, arg1, arg3 + arg0, arg1 - -arg5 + 1);
		Static654.method6892(arg4);
		@Pc(204) Class357 local204 = Static654.method6890(arg4);
		Static304.method4642(local204, arg4);
		if (Static148.anInt2790 > 0) {
			Static608.anInt9862--;
			if (Static608.anInt9862 == 0) {
				Static148.anInt2790--;
				Static608.anInt9862 = 20;
			}
		}
		if (!Static226.aBoolean354) {
			return;
		}
		@Pc(239) int local239 = arg0 + arg3 - 5;
		@Pc(245) int local245 = arg1 + arg5 - 8;
		Static418.aClass44_32.method8117(-1, "Fps:" + Static482.anInt8392, 16776960, local245, local239);
		@Pc(262) int local262 = local245 - 15;
		@Pc(264) Runtime local264 = Runtime.getRuntime();
		@Pc(273) int local273 = (int) ((local264.totalMemory() - local264.freeMemory()) / 1024L);
		@Pc(275) int local275 = 16776960;
		if (local273 > 65536) {
			local275 = 16711680;
		}
		Static418.aClass44_32.method8117(-1, "Mem:" + local273 + "k", local275, local262, local239);
		local245 = local262 - 15;
	}

	@OriginalMember(owner = "client!la", name = "a", descriptor = "(ZBI)Ljava/lang/String;")
	public static String method5060(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		return arg0 && arg1 >= 0 ? Static210.method3120(arg0, arg1) : Integer.toString(arg1);
	}
}
