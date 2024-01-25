import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
	public static int anInt4220;

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
	public static int anInt4214 = 0;

	@OriginalMember(owner = "client!hp", name = "c", descriptor = "Lclient!lc;")
	public static final Class200 aClass200_56 = new Class200(22, 10);

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(I[S)[S")
	public static short[] method3708(@OriginalArg(1) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(16) short[] local16 = new short[arg0.length];
			Static653.method6857(arg0, 0, local16, 0, arg0.length);
			return local16;
		}
	}

	@OriginalMember(owner = "client!hp", name = "a", descriptor = "(ILclient!la;)V")
	public static void method3710(@OriginalArg(1) Class196 arg0) {
		Static75.anInt1784 = arg0.method5104("hitmarks");
		Static626.anInt10074 = arg0.method5104("hitbar_default");
		Static470.anInt8243 = arg0.method5104("timerbar_default");
		Static417.anInt7578 = arg0.method5104("headicons_pk");
		Static445.anInt7955 = arg0.method5104("headicons_prayer");
		Static613.anInt9932 = arg0.method5104("hint_headicons");
		Static202.anInt3188 = arg0.method5104("hint_mapmarkers");
		Static509.anInt8813 = arg0.method5104("mapflag");
		Static643.anInt10223 = arg0.method5104("cross");
		Static596.anInt9746 = arg0.method5104("mapdots");
		Static103.anInt2270 = arg0.method5104("scrollbar");
		Static379.anInt7091 = arg0.method5104("name_icons");
		Static635.anInt10140 = arg0.method5104("floorshadows");
		Static609.anInt9881 = arg0.method5104("compass");
		Static252.anInt4623 = arg0.method5104("otherlevel");
		Static166.anInt3242 = arg0.method5104("hint_mapedge");
	}
}
