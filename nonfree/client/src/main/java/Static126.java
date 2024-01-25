import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static126 {

	@OriginalMember(owner = "client!eia", name = "L", descriptor = "I")
	public static int anInt2113 = 0;

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "(II)Z")
	public static boolean method1893(@OriginalArg(1) int arg0) {
		if (arg0 == 50 || arg0 == 23 || arg0 == 44 || arg0 == 25 || arg0 == 1009) {
			return true;
		} else {
			return arg0 == 45 || arg0 == 1001;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(IIIIIILclient!ha;)V")
	public static void method1894(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(6) Class100 arg4) {
		if ((Static550.aClass155_12 == null || Static147.aClass155_8 == null || Static340.aClass155_15 == null) && Static27.aClass126_18.method3077(Static398.anInt6727) && Static27.aClass126_18.method3077(Static93.anInt1564) && Static27.aClass126_18.method3077(Static66.anInt1115)) {
			@Pc(37) Class362 local37 = Static692.method8275(Static27.aClass126_18, Static93.anInt1564, 0);
			Static147.aClass155_8 = arg4.method8640(local37, true);
			local37.method8273();
			Static526.aClass155_30 = arg4.method8640(local37, true);
			Static550.aClass155_12 = arg4.method8640(Static692.method8275(Static27.aClass126_18, Static398.anInt6727, 0), true);
			@Pc(62) Class362 local62 = Static692.method8275(Static27.aClass126_18, Static66.anInt1115, 0);
			Static340.aClass155_15 = arg4.method8640(local62, true);
			local62.method8273();
			Static196.aClass155_10 = arg4.method8640(local62, true);
		}
		if (Static550.aClass155_12 == null || Static147.aClass155_8 == null || Static340.aClass155_15 == null) {
			return;
		}
		@Pc(107) int local107 = (arg1 - Static340.aClass155_15.method7213() * 2) / Static550.aClass155_12.method7213();
		for (@Pc(109) int local109 = 0; local109 < local107; local109++) {
			Static550.aClass155_12.method7202(Static340.aClass155_15.method7213() + arg3 + Static550.aClass155_12.method7213() * local109, -Static550.aClass155_12.method7198() + arg2 + arg0);
		}
		@Pc(150) int local150 = (arg2 - Static340.aClass155_15.method7198() - 20) / Static147.aClass155_8.method7198();
		for (@Pc(152) int local152 = 0; local152 < local150; local152++) {
			Static147.aClass155_8.method7202(arg3, arg0 + Static147.aClass155_8.method7198() * local152 + 20);
			Static526.aClass155_30.method7202(arg3 + arg1 - Static526.aClass155_30.method7213(), arg0 - (-20 - local152 * Static147.aClass155_8.method7198()));
		}
		Static340.aClass155_15.method7202(arg3, arg0 + arg2 - Static340.aClass155_15.method7198());
		Static196.aClass155_10.method7202(arg3 + arg1 - Static340.aClass155_15.method7213(), -Static340.aClass155_15.method7198() + (arg0 - -arg2));
	}

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "(II)V")
	public static void method1895(@OriginalArg(0) int arg0) {
		if (Static120.anInt1966 == 1) {
			Static62.anInt1051 = arg0;
		} else if (Static120.anInt1966 == 2) {
			Static438.anInt7237 = arg0;
		}
	}
}
