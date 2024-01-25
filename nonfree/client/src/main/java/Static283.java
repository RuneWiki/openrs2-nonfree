import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static283 {

	@OriginalMember(owner = "client!og", name = "d", descriptor = "Lclient!la;")
	public static Class123 aClass123_6;

	@OriginalMember(owner = "client!og", name = "h", descriptor = "[I")
	public static final int[] anIntArray375 = new int[1];

	@OriginalMember(owner = "client!og", name = "i", descriptor = "[I")
	public static final int[] anIntArray376 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(III)Z")
	public static boolean method3702(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static295.method3842(arg0, arg1) | (arg1 & 0x70000) != 0 || Static293.method3831(arg1, arg0);
	}

	@OriginalMember(owner = "client!og", name = "a", descriptor = "(ILclient!qn;)V")
	public static void method3704(@OriginalArg(1) Class211 arg0) {
		Static186.anInt3435 = arg0.method4384("p11_full");
		Static433.anInt7157 = arg0.method4384("p12_full");
		Static278.anInt4621 = arg0.method4384("b12_full");
		Static208.anInt6830 = arg0.method4384("hitmarks");
		Static28.anInt7409 = arg0.method4384("hitbar_default");
		Static198.anInt5152 = arg0.method4384("timerbar_default");
		Static84.anInt5161 = arg0.method4384("headicons_pk");
		Static60.anInt1089 = arg0.method4384("headicons_prayer");
		Static31.anInt529 = arg0.method4384("hint_headicons");
		Static390.anInt7647 = arg0.method4384("hint_mapmarkers");
		Static140.anInt2516 = arg0.method4384("mapflag");
		Static389.anInt6347 = arg0.method4384("cross");
		Static175.anInt3188 = arg0.method4384("mapdots");
		Static151.anInt2739 = arg0.method4384("scrollbar");
		Static194.anInt7190 = arg0.method4384("name_icons");
		Static445.anInt7464 = arg0.method4384("floorshadows");
		Static216.anInt3706 = arg0.method4384("compass");
		Static327.anInt5282 = arg0.method4384("otherlevel");
		Static133.anInt2433 = arg0.method4384("hint_mapedge");
	}

	@OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
	public static void method3705() {
		if (Static276.aFrame5 != null) {
			return;
		}
		@Pc(18) Container local18;
		if (Static43.aFrame4 == null) {
			local18 = Static24.aClass196_1.anApplet1;
		} else {
			local18 = Static43.aFrame4;
		}
		Static298.anInt4896 = local18.getSize().width;
		Static75.anInt1525 = local18.getSize().height;
		@Pc(36) Insets local36;
		if (Static43.aFrame4 == local18) {
			local36 = Static43.aFrame4.getInsets();
			Static298.anInt4896 -= local36.right + local36.left;
			Static75.anInt1525 -= local36.bottom + local36.top;
		}
		if (Static37.method500() == 1) {
			Static456.anInt7657 = 0;
			Static345.anInt5723 = Static81.anInt1607;
			Static111.anInt2080 = (Static298.anInt4896 - Static81.anInt1607) / 2;
			Static120.anInt2134 = Static421.anInt7076;
		} else if (Static18.anInt296 < 96 && Static341.anInt5549 == 0) {
			@Pc(82) int local82 = Static298.anInt4896 <= 1024 ? Static298.anInt4896 : 1024;
			@Pc(91) int local91 = Static75.anInt1525 <= 768 ? Static75.anInt1525 : 768;
			Static111.anInt2080 = (Static298.anInt4896 - local82) / 2;
			Static345.anInt5723 = local82;
			Static120.anInt2134 = local91;
			Static456.anInt7657 = 0;
		} else {
			Static456.anInt7657 = 0;
			Static111.anInt2080 = 0;
			Static120.anInt2134 = Static75.anInt1525;
			Static345.anInt5723 = Static298.anInt4896;
		}
		if (Static193.aClass178_9 != Static324.aClass178_18) {
			@Pc(132) boolean local132;
			if (Static345.anInt5723 < 1024 && Static120.anInt2134 < 768) {
				local132 = true;
			} else {
				local132 = false;
			}
		}
		Static391.aCanvas5.setSize(Static345.anInt5723, Static120.anInt2134);
		if (Static39.aClass135_1 != null) {
			Static39.aClass135_1.method5363(Static391.aCanvas5);
		}
		if (local18 == Static43.aFrame4) {
			local36 = Static43.aFrame4.getInsets();
			Static391.aCanvas5.setLocation(Static111.anInt2080 + local36.left, Static456.anInt7657 + local36.top);
		} else {
			Static391.aCanvas5.setLocation(Static111.anInt2080, Static456.anInt7657);
		}
		if (Static182.anInt3346 != -1) {
			Static31.method434(true);
		}
		Static79.method1276();
	}
}
