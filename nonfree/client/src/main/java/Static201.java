import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "Lclient!oi;")
	public static Class3_Sub40 aClass3_Sub40_3;

	@OriginalMember(owner = "client!hr", name = "r", descriptor = "I")
	public static int anInt3913;

	@OriginalMember(owner = "client!hr", name = "i", descriptor = "[I")
	public static final int[] anIntArray273 = new int[14];

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(Lclient!pe;B)V")
	public static void method3369(@OriginalArg(0) Class254 arg0) {
		Static370.anInt7270 = arg0.method6414("hitmarks");
		Static260.anInt5555 = arg0.method6414("hitbar_default");
		Static312.anInt6270 = arg0.method6414("timerbar_default");
		Static506.anInt9835 = arg0.method6414("headicons_pk");
		Static545.anInt9831 = arg0.method6414("headicons_prayer");
		Static459.anInt8633 = arg0.method6414("hint_headicons");
		Static560.anInt9971 = arg0.method6414("hint_mapmarkers");
		Static486.anInt9076 = arg0.method6414("mapflag");
		Static525.anInt9590 = arg0.method6414("cross");
		Static374.anInt7300 = arg0.method6414("mapdots");
		Static186.anInt3735 = arg0.method6414("scrollbar");
		Static337.anInt6959 = arg0.method6414("name_icons");
		Static399.anInt7790 = arg0.method6414("floorshadows");
		Static287.anInt5958 = arg0.method6414("compass");
		Static150.anInt3338 = arg0.method6414("otherlevel");
		Static125.anInt2898 = arg0.method6414("hint_mapedge");
	}

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "(I)V")
	public static void method3374() {
		if (Static578.aFrame2 != null) {
			return;
		}
		@Pc(19) Container local19;
		if (Static531.aFrame1 != null) {
			local19 = Static531.aFrame1;
		} else if (Static253.anApplet3 == null) {
			local19 = Static329.anApplet_Sub1_1;
		} else {
			local19 = Static253.anApplet3;
		}
		Static3.anInt172 = local19.getSize().width;
		Static232.anInt4725 = local19.getSize().height;
		@Pc(41) Insets local41;
		if (Static531.aFrame1 == local19) {
			local41 = Static531.aFrame1.getInsets();
			Static232.anInt4725 -= local41.top + local41.bottom;
			Static3.anInt172 -= local41.left + local41.right;
		}
		if (Static216.method3759() == 1) {
			Static294.anInt10217 = Static227.anInt4616;
			Static426.anInt8255 = 0;
			Static524.anInt9579 = (Static3.anInt172 - Static507.anInt9382) / 2;
			Static582.anInt10234 = Static507.anInt9382;
		} else {
			Static185.method3274();
		}
		if (Static508.aClass109_7 != Static51.aClass109_2) {
			@Pc(94) boolean local94;
			if (Static582.anInt10234 < 1024 && Static294.anInt10217 < 768) {
				local94 = true;
			} else {
				local94 = false;
			}
		}
		Static545.aCanvas14.setSize(Static582.anInt10234, Static294.anInt10217);
		if (Static546.aClass15_16 != null) {
			Static546.aClass15_16.method5311(Static545.aCanvas14);
		}
		if (local19 == Static531.aFrame1) {
			local41 = Static531.aFrame1.getInsets();
			Static545.aCanvas14.setLocation(local41.left + Static524.anInt9579, Static426.anInt8255 + local41.top);
		} else {
			Static545.aCanvas14.setLocation(Static524.anInt9579, Static426.anInt8255);
		}
		if (Static25.anInt779 != -1) {
			Static48.method1238(true);
		}
		Static251.method4499();
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(II)V")
	public static void method3375(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub4_Sub6 local8 = Static367.method6025(11, arg0);
		local8.method1896();
	}
}
