import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static53 {

	@OriginalMember(owner = "client!bt", name = "R", descriptor = "I")
	public static int anInt1221;

	@OriginalMember(owner = "client!bt", name = "h", descriptor = "I")
	public static int anInt1190 = -1;

	@OriginalMember(owner = "client!bt", name = "P", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_22 = new Class151(98, 3);

	@OriginalMember(owner = "client!bt", name = "S", descriptor = "S")
	public static short aShort15 = 1;

	@OriginalMember(owner = "client!bt", name = "a", descriptor = "(IIILclient!ha;IIII)V")
	public static void method1251(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class33 arg2, @OriginalArg(4) int arg3, @OriginalArg(6) int arg4) {
		arg2.method8103(arg3, arg4, -10660793, arg1, arg0);
		arg2.method8103(arg3 + 1, arg4 - -1, -16777216, 16, arg0 - 2);
		arg2.method8100(arg0 - 2, arg4 - -18, arg3 + 1, arg1 + -19, -16777216);
	}

	@OriginalMember(owner = "client!bt", name = "f", descriptor = "(II)V")
	public static void method1256(@OriginalArg(0) int arg0) {
		if (arg0 == Static656.anInt10356) {
			return;
		}
		if (arg0 == 13) {
			Static614.method8040();
		}
		if (arg0 != 13 && Static102.aClass192_3 != null) {
			Static102.aClass192_3.method7791();
			Static102.aClass192_3 = null;
		}
		if (arg0 == 3) {
			Static587.method7741(Static77.anInt1630 != Static500.anInt7840);
		}
		if (arg0 == 7) {
			Static565.method7485(Static77.anInt1630 != Static624.anInt9781);
		}
		if (arg0 == 5 || arg0 == 12) {
			Static608.method7982();
		} else if (arg0 == 6 || arg0 == 9) {
			Static614.method8040();
		}
		if (Static560.method7433(Static656.anInt10356)) {
			Static674.aClass34_134.anInt1211 = 2;
			Static31.aClass34_124.anInt1211 = 2;
			Static194.aClass34_48.anInt1211 = 2;
			Static584.aClass34_60.anInt1211 = 2;
			Static203.aClass34_53.anInt1211 = 2;
			Static199.aClass34_50.anInt1211 = 2;
			Static363.aClass34_82.anInt1211 = 2;
		}
		if (Static560.method7433(arg0)) {
			Static668.anInt10539 = 0;
			Static225.anInt3564 = 0;
			Static162.anInt2719 = 0;
			Static645.anInt10145 = 1;
			Static653.anInt10297 = 1;
			Static90.method7669(true);
			Static674.aClass34_134.anInt1211 = 1;
			Static31.aClass34_124.anInt1211 = 1;
			Static194.aClass34_48.anInt1211 = 1;
			Static584.aClass34_60.anInt1211 = 1;
			Static203.aClass34_53.anInt1211 = 1;
			Static199.aClass34_50.anInt1211 = 1;
			Static363.aClass34_82.anInt1211 = 1;
		}
		if (arg0 == 11 || arg0 == 3) {
			Static72.method1545();
		}
		@Pc(172) boolean local172 = arg0 == 2 || Static162.method2597(arg0) || Static477.method6557(arg0);
		@Pc(189) boolean local189 = Static656.anInt10356 == 2 || Static162.method2597(Static656.anInt10356) || Static477.method6557(Static656.anInt10356);
		if (local172 != local189) {
			if (local172) {
				Static573.anInt8886 = Static431.anInt6781;
				if (Static124.aClass4_Sub20_4.aClass8_Sub22_2.method7414() == 0) {
					Static58.method1306();
				} else {
					Static669.method8919(Static611.aClass34_120, Static431.anInt6781, Static124.aClass4_Sub20_4.aClass8_Sub22_2.method7414());
					Static174.method2858();
				}
				Static334.aClass260_4.method5884(false);
			} else {
				Static58.method1306();
				Static334.aClass260_4.method5884(true);
			}
		}
		if (Static560.method7433(arg0) || arg0 == 13) {
			Static582.aClass33_13.method8093();
		}
		Static656.anInt10356 = arg0;
	}
}
