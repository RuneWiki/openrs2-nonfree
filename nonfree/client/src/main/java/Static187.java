import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!go", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray1 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!go", name = "g", descriptor = "Z")
	public static boolean aBoolean232 = true;

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(ILclient!la;)V")
	public static void method2847(@OriginalArg(1) Class207 arg0) {
		Static57.anInt1136 = arg0.method4686("hitmarks");
		Static395.anInt6578 = arg0.method4686("hitbar_default");
		Static400.anInt6696 = arg0.method4686("timerbar_default");
		Static411.anInt7150 = arg0.method4686("headicons_pk");
		Static193.anInt8325 = arg0.method4686("headicons_prayer");
		Static139.anInt2427 = arg0.method4686("hint_headicons");
		Static119.anInt2202 = arg0.method4686("hint_mapmarkers");
		Static70.anInt1419 = arg0.method4686("mapflag");
		Static325.anInt5510 = arg0.method4686("cross");
		Static540.anInt9191 = arg0.method4686("mapdots");
		Static343.anInt5776 = arg0.method4686("scrollbar");
		Static60.anInt1159 = arg0.method4686("name_icons");
		Static116.anInt5368 = arg0.method4686("floorshadows");
		Static36.anInt577 = arg0.method4686("compass");
		Static124.anInt2268 = arg0.method4686("otherlevel");
		Static409.anInt3104 = arg0.method4686("hint_mapedge");
	}

	@OriginalMember(owner = "client!go", name = "a", descriptor = "(BI)Z")
	public static boolean method2848(@OriginalArg(1) int arg0) {
		for (@Pc(10) Class5_Sub5_Sub15 local10 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7908(); local10 != null; local10 = (Class5_Sub5_Sub15) Static84.aClass330_6.method7914()) {
			if (Static390.method5792(local10.anInt6765) && local10.aLong172 == (long) arg0) {
				return true;
			}
		}
		return false;
	}
}
