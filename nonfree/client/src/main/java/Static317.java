import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static317 {

	@OriginalMember(owner = "client!q", name = "f", descriptor = "F")
	public static float aFloat71;

	@OriginalMember(owner = "client!q", name = "b", descriptor = "Lclient!hb;")
	public static final Class92 aClass92_190 = new Class92(41, 4);

	@OriginalMember(owner = "client!q", name = "c", descriptor = "I")
	public static int anInt5757 = 0;

	@OriginalMember(owner = "client!q", name = "e", descriptor = "I")
	public static int anInt5759 = 0;

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
	public static boolean method4623() {
		try {
			if (Static347.anInt6319 == 2) {
				if (Static24.aClass3_Sub29_1 == null) {
					Static24.aClass3_Sub29_1 = Static459.method3798(Static27.aClass56_11, Static290.anInt5320, Static76.anInt1664);
					if (Static24.aClass3_Sub29_1 == null) {
						return false;
					}
				}
				if (Static185.aClass261_1 == null) {
					Static185.aClass261_1 = new Class261(Static446.aClass56_100, Static385.aClass56_78);
				}
				if (Static408.aClass3_Sub5_Sub1_118.method3616(Static24.aClass3_Sub29_1, Static185.aClass261_1, Static398.aClass56_83)) {
					Static408.aClass3_Sub5_Sub1_118.method3633();
					Static408.aClass3_Sub5_Sub1_118.method3610(Static454.anInt7690);
					Static408.aClass3_Sub5_Sub1_118.method3635(Static437.aBoolean516, Static24.aClass3_Sub29_1);
					Static24.aClass3_Sub29_1 = null;
					Static347.anInt6319 = 0;
					Static185.aClass261_1 = null;
					Static27.aClass56_11 = null;
					return true;
				}
			}
		} catch (@Pc(62) Exception local62) {
			local62.printStackTrace();
			Static408.aClass3_Sub5_Sub1_118.method3621();
			Static24.aClass3_Sub29_1 = null;
			Static27.aClass56_11 = null;
			Static185.aClass261_1 = null;
			Static347.anInt6319 = 0;
		}
		return false;
	}

	@OriginalMember(owner = "client!q", name = "a", descriptor = "(FFIFF[BIIIZILclient!qi;F)V")
	public static void method4624(@OriginalArg(0) float arg0, @OriginalArg(1) float arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) byte[] arg4, @OriginalArg(6) int arg5, @OriginalArg(11) Class10 arg6, @OriginalArg(12) float arg7) {
		for (@Pc(1) int local1 = 0; local1 < 16; local1++) {
			Static444.method5914(arg0, arg7, arg3, arg4, arg5, arg1, arg6, arg2, local1);
			arg5 += 16384;
		}
	}
}
