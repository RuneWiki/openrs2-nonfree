import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static521 {

	@OriginalMember(owner = "client!ua", name = "f", descriptor = "Lclient!sa;")
	public static Class299 aClass299_8;

	@OriginalMember(owner = "client!ua", name = "h", descriptor = "Lclient!gt;")
	public static final Class129 aClass129_6 = new Class129();

	@OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
	public static int anInt8882 = -2;

	@OriginalMember(owner = "client!ua", name = "j", descriptor = "Lclient!ql;")
	public static Class4_Sub39 aClass4_Sub39_2 = null;

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lclient!bi;I)V")
	public static void method7301(@OriginalArg(0) Class31 arg0) {
		Static484.anInt9501 = arg0.method653("hitmarks");
		Static100.anInt9639 = arg0.method653("hitbar_default");
		Static212.anInt4331 = arg0.method653("timerbar_default");
		Static28.anInt552 = arg0.method653("headicons_pk");
		Static497.anInt8603 = arg0.method653("headicons_prayer");
		Static415.anInt7174 = arg0.method653("hint_headicons");
		Static105.anInt2570 = arg0.method653("hint_mapmarkers");
		Static554.anInt9319 = arg0.method653("mapflag");
		Static504.anInt8725 = arg0.method653("cross");
		Static250.anInt4948 = arg0.method653("mapdots");
		Static350.anInt6116 = arg0.method653("scrollbar");
		Static482.anInt8138 = arg0.method653("name_icons");
		Static28.anInt549 = arg0.method653("floorshadows");
		Static400.anInt6961 = arg0.method653("compass");
		Static283.anInt5296 = arg0.method653("otherlevel");
		Static10.anInt215 = arg0.method653("hint_mapedge");
	}

	@OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)Z")
	public static boolean method7302(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x800) != 0;
	}
}
