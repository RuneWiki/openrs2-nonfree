import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "I")
	public static int anInt5342;

	@OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
	public static int anInt5346;

	@OriginalMember(owner = "client!qg", name = "m", descriptor = "F")
	public static float aFloat154 = 0.0F;

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IBIIIILclient!ya;II)V")
	public static void method4283(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) Class51 arg5, @OriginalArg(7) int arg6, @OriginalArg(8) int arg7) {
		@Pc(19) Interface5 local19 = (Interface5) Static184.method2673(arg2, arg4, arg1);
		@Pc(28) Class189 local28;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(53) int local53;
		if (local19 != null) {
			local28 = Static411.aClass142_4.method3148(local19.method5731());
			local34 = local19.method5729() & 0x3;
			local38 = local19.method5732();
			if (local28.anInt5066 == -1) {
				local53 = arg6;
				if (local28.anInt5106 > 0) {
					local53 = arg7;
				}
				if (local38 == 0 || local38 == 2) {
					if (local34 == 0) {
						arg5.method5324(arg0, 4, local53, arg3);
					} else if (local34 == 1) {
						arg5.method5313(arg3, local53, arg0, 4);
					} else if (local34 == 2) {
						arg5.method5324(arg0, 4, local53, arg3 + 3);
					} else if (local34 == 3) {
						arg5.method5313(arg3, local53, arg0 + 3, 4);
					}
				}
				if (local38 == 3) {
					if (local34 == 0) {
						arg5.method5286(1, local53, arg3, 1, arg0);
					} else if (local34 == 1) {
						arg5.method5286(1, local53, arg3 + 3, 1, arg0);
					} else if (local34 == 2) {
						arg5.method5286(1, local53, arg3 + 3, 1, arg0 + 3);
					} else if (local34 == 3) {
						arg5.method5286(1, local53, arg3, 1, arg0 + 3);
					}
				}
				if (local38 == 2) {
					if (local34 == 0) {
						arg5.method5313(arg3, local53, arg0, 4);
					} else if (local34 == 1) {
						arg5.method5324(arg0, 4, local53, arg3 + 3);
					} else if (local34 == 2) {
						arg5.method5313(arg3, local53, arg0 + 3, 4);
					} else if (local34 == 3) {
						arg5.method5324(arg0, 4, local53, arg3);
					}
				}
			} else {
				Static121.method1998(arg0, arg5, local34, arg3, local28);
			}
		}
		local19 = (Interface5) Static14.method152(arg2, arg4, arg1, gf.class);
		if (local19 != null) {
			local28 = Static411.aClass142_4.method3148(local19.method5731());
			local34 = local19.method5729() & 0x3;
			local38 = local19.method5732();
			if (local28.anInt5066 != -1) {
				Static121.method1998(arg0, arg5, local34, arg3, local28);
			} else if (local38 == 9) {
				local53 = -1118482;
				if (local28.anInt5106 > 0) {
					local53 = -1179648;
				}
				if (local34 == 0 || local34 == 2) {
					arg5.method5304(arg3 + 3, arg3, arg0 + 3, local53, arg0);
				} else {
					arg5.method5304(arg3 + 3, arg3, arg0, local53, arg0 + 3);
				}
			}
		}
		local19 = (Interface5) Static339.method4422(arg2, arg4, arg1);
		if (local19 == null) {
			return;
		}
		local28 = Static411.aClass142_4.method3148(local19.method5731());
		local34 = local19.method5729() & 0x3;
		if (local28.anInt5066 != -1) {
			Static121.method1998(arg0, arg5, local34, arg3, local28);
			return;
		}
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(IB)I")
	public static int method4284(@OriginalArg(0) int arg0) {
		@Pc(18) int local18 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
		@Pc(28) int local28 = (local18 >>> 2 & 0x33333333) + (local18 & 0x33333333);
		@Pc(36) int local36 = local28 + (local28 >>> 4) & 0xF0F0F0F;
		@Pc(42) int local42 = local36 + (local36 >>> 8);
		@Pc(48) int local48 = local42 + (local42 >>> 16);
		return local48 & 0xFF;
	}

	@OriginalMember(owner = "client!qg", name = "a", descriptor = "(BLclient!gf;)Z")
	public static boolean method4285(@OriginalArg(1) Interface5 arg0) {
		@Pc(10) Class189 local10 = Static411.aClass142_4.method3148(arg0.method5731());
		if (local10.anInt5066 == -1) {
			return true;
		} else {
			@Pc(31) Class125 local31 = Static351.aClass176_4.method3720(local10.anInt5066);
			return local31.anInt3466 == -1 ? true : local31.method2813();
		}
	}
}
