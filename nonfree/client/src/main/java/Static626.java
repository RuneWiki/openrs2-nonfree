import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static626 {

	@OriginalMember(owner = "client!wga", name = "Jc", descriptor = "I")
	public static int anInt1466 = -1;

	@OriginalMember(owner = "client!wga", name = "bd", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray8 = new String[5];

	@OriginalMember(owner = "client!wga", name = "Bd", descriptor = "I")
	public static int anInt1506 = 0;

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(IIIIIIII)V")
	public static void method1458(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg3 < 0 || arg0 < 0 || Static47.anInt1794 - 1 <= arg3 || Static209.anInt4742 - 1 <= arg0) {
			return;
		}
		if (Static395.aClass100ArrayArrayArray3 == null) {
			return;
		}
		@Pc(37) Interface21 local37;
		if (arg6 == 0) {
			local37 = (Interface21) Static563.method8458(arg5, arg3, arg0);
			@Pc(43) Interface21 local43 = (Interface21) Static313.method5482(arg5, arg3, arg0);
			if (local37 != null && arg2 != 2) {
				if (local37 instanceof Class3_Sub1_Sub5_Sub2) {
					((Class3_Sub1_Sub5_Sub2) local37).aClass45_2.method1812(arg1);
				} else {
					Static501.method7740(arg3, arg6, arg1, local37.method8625(), arg2, arg0, arg4, arg5);
				}
			}
			if (local43 != null) {
				if (local43 instanceof Class3_Sub1_Sub5_Sub2) {
					((Class3_Sub1_Sub5_Sub2) local43).aClass45_2.method1812(arg1);
				} else {
					Static501.method7740(arg3, arg6, arg1, local43.method8625(), arg2, arg0, arg4, arg5);
				}
			}
		} else if (arg6 == 1) {
			local37 = (Interface21) Static629.method9130(arg5, arg3, arg0);
			if (local37 != null) {
				if (local37 instanceof Class3_Sub1_Sub2_Sub2) {
					((Class3_Sub1_Sub2_Sub2) local37).aClass45_3.method1812(arg1);
				} else {
					@Pc(215) int local215 = local37.method8625();
					if (arg2 == 4 || arg2 == 5) {
						Static501.method7740(arg3, arg6, arg1, local215, 4, arg0, arg4, arg5);
					} else if (arg2 == 6) {
						Static501.method7740(arg3, arg6, arg1, local215, 4, arg0, arg4 + 4, arg5);
					} else if (arg2 == 7) {
						Static501.method7740(arg3, arg6, arg1, local215, 4, arg0, (arg4 + 2 & 0x3) + 4, arg5);
					} else if (arg2 == 8) {
						Static501.method7740(arg3, arg6, arg1, local215, 4, arg0, arg4 + 4, arg5);
						Static501.method7740(arg3, arg6, arg1, local215, 4, arg0, (arg4 + 2 & 0x3) + 4, arg5);
					}
				}
			}
		} else if (arg6 == 2) {
			local37 = (Interface21) Static440.method6961(arg5, arg3, arg0, se.class);
			if (local37 != null) {
				if (arg2 == 11) {
					arg2 = 10;
				}
				if (local37 instanceof Class3_Sub1_Sub3_Sub2) {
					((Class3_Sub1_Sub3_Sub2) local37).aClass45_1.method1812(arg1);
				} else {
					Static501.method7740(arg3, arg6, arg1, local37.method8625(), arg2, arg0, arg4, arg5);
				}
			}
		} else if (arg6 == 3) {
			local37 = (Interface21) Static336.method5820(arg5, arg3, arg0);
			if (local37 != null) {
				if (local37 instanceof Class3_Sub1_Sub1_Sub1) {
					((Class3_Sub1_Sub1_Sub1) local37).aClass45_4.method1812(arg1);
				} else {
					Static501.method7740(arg3, arg6, arg1, local37.method8625(), arg2, arg0, arg4, arg5);
				}
			}
		}
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "([BI)[B")
	public static byte[] method1507(@OriginalArg(0) byte[] arg0) {
		@Pc(6) int local6 = arg0.length;
		@Pc(9) byte[] local9 = new byte[local6];
		Static653.method7723(arg0, 0, local9, 0, local6);
		return local9;
	}

	@OriginalMember(owner = "client!wga", name = "v", descriptor = "(I)V")
	public static void method1520() {
		Static121.aClass169_57.method5009();
	}

	@OriginalMember(owner = "client!wga", name = "a", descriptor = "(Lclient!wda;B)V")
	public static void method1530(@OriginalArg(0) Class369 arg0) {
		Static279.aClass369_5 = arg0;
	}

	@OriginalMember(owner = "client!wga", name = "L", descriptor = "(I)V")
	public static void method1570() {
		if (Static571.aClass41ArrayArray1 == null) {
			return;
		}
		for (@Pc(9) int local9 = 0; local9 < Static571.aClass41ArrayArray1.length; local9++) {
			for (@Pc(13) int local13 = 0; local13 < Static571.aClass41ArrayArray1[local9].length; local13++) {
				Static571.aClass41ArrayArray1[local9][local13] = Static588.aClass41_2;
			}
		}
	}
}
