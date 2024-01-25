import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!gw", name = "f", descriptor = "Lclient!jn;")
	public static Class176 aClass176_48;

	@OriginalMember(owner = "client!gw", name = "i", descriptor = "[I")
	public static final int[] anIntArray179 = new int[6];

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lclient!r;IIIIIIII)V")
	public static void method3191(@OriginalArg(0) Class44 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(8) int arg7) {
		@Pc(11) Interface19 local11 = (Interface19) Static353.method5714(arg7, arg2, arg5);
		@Pc(20) Class101 local20;
		@Pc(26) int local26;
		@Pc(30) int local30;
		@Pc(36) int local36;
		if (local11 != null) {
			local20 = Static204.aClass139_8.method3309(local11.method7827());
			local26 = local11.method7829() & 0x3;
			local30 = local11.method7825();
			if (local20.anInt2955 == -1) {
				local36 = arg3;
				if (local20.anInt2924 > 0) {
					local36 = arg4;
				}
				if (local30 == 0 || local30 == 2) {
					if (local26 == 0) {
						arg0.method5021(arg6, 4, local36, arg1);
					} else if (local26 == 1) {
						arg0.method4974(4, local36, arg1, arg6);
					} else if (local26 == 2) {
						arg0.method5021(arg6 + 3, 4, local36, arg1);
					} else if (local26 == 3) {
						arg0.method4974(4, local36, arg1 + 3, arg6);
					}
				}
				if (local30 == 3) {
					if (local26 == 0) {
						arg0.method5006(arg6, 1, arg1, local36, 1);
					} else if (local26 == 1) {
						arg0.method5006(arg6 + 3, 1, arg1, local36, 1);
					} else if (local26 == 2) {
						arg0.method5006(arg6 + 3, 1, arg1 + 3, local36, 1);
					} else if (local26 == 3) {
						arg0.method5006(arg6, 1, arg1 + 3, local36, 1);
					}
				}
				if (local30 == 2) {
					if (local26 == 0) {
						arg0.method4974(4, local36, arg1, arg6);
					} else if (local26 == 1) {
						arg0.method5021(arg6 + 3, 4, local36, arg1);
					} else if (local26 == 2) {
						arg0.method4974(4, local36, arg1 + 3, arg6);
					} else if (local26 == 3) {
						arg0.method5021(arg6, 4, local36, arg1);
					}
				}
			} else {
				Static153.method2845(local20, arg6, arg1, arg0, local26);
			}
		}
		local11 = (Interface19) Static397.method6277(arg7, arg2, arg5, pn.class);
		if (local11 != null) {
			local20 = Static204.aClass139_8.method3309(local11.method7827());
			local26 = local11.method7829() & 0x3;
			local30 = local11.method7825();
			if (local20.anInt2955 != -1) {
				Static153.method2845(local20, arg6, arg1, arg0, local26);
			} else if (local30 == 9) {
				local36 = -1118482;
				if (local20.anInt2924 > 0) {
					local36 = -1179648;
				}
				if (local26 == 0 || local26 == 2) {
					arg0.method5040(local36, arg6 + 3, arg1 + 3, arg6, arg1);
				} else {
					arg0.method5040(local36, arg6 + 3, arg1, arg6, arg1 + 3);
				}
			}
		}
		local11 = (Interface19) Static460.method7015(arg7, arg2, arg5);
		if (local11 == null) {
			return;
		}
		local20 = Static204.aClass139_8.method3309(local11.method7827());
		local26 = local11.method7829() & 0x3;
		if (local20.anInt2955 != -1) {
			Static153.method2845(local20, arg6, arg1, arg0, local26);
			return;
		}
	}

	@OriginalMember(owner = "client!gw", name = "a", descriptor = "(BILclient!wd;III)Ljava/awt/Frame;")
	public static Frame method3192(@OriginalArg(2) Class354 arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3) {
		if (!arg0.method8226()) {
			return null;
		}
		@Pc(17) Class257[] local17 = Static175.method3183(arg0);
		if (local17 == null) {
			return null;
		}
		@Pc(23) boolean local23 = false;
		for (@Pc(25) int local25 = 0; local25 < local17.length; local25++) {
			if (arg3 == local17[local25].anInt7525 && arg1 == local17[local25].anInt7527 && (!local23 || local17[local25].anInt7528 > arg2)) {
				arg2 = local17[local25].anInt7528;
				local23 = true;
			}
		}
		if (!local23) {
			return null;
		}
		@Pc(103) Class234 local103 = arg0.method8214(arg2, arg1, arg3);
		while (local103.anInt6717 == 0) {
			Static63.method1019(10L);
		}
		@Pc(115) Frame local115 = (Frame) local103.anObject16;
		if (local115 == null) {
			return null;
		} else if (local103.anInt6717 == 2) {
			Static200.method3419(local115, arg0);
			return null;
		} else {
			return local115;
		}
	}
}
