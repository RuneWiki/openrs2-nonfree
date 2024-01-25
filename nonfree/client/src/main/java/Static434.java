import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static434 {

	@OriginalMember(owner = "client!pha", name = "yb", descriptor = "I")
	public static int anInt7350;

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(BLclient!wu;)V")
	public static void method6480(@OriginalArg(1) Class384 arg0) {
		Static617.anInt10038 = arg0.method8890("hitmarks");
		Static553.anInt9153 = arg0.method8890("hitbar_default");
		Static4.anInt35 = arg0.method8890("timerbar_default");
		Static145.anInt6896 = arg0.method8890("headicons_pk");
		Static431.anInt772 = arg0.method8890("headicons_prayer");
		Static428.anInt7271 = arg0.method8890("hint_headicons");
		Static137.anInt2275 = arg0.method8890("hint_mapmarkers");
		Static134.anInt2213 = arg0.method8890("mapflag");
		Static420.anInt7197 = arg0.method8890("cross");
		Static506.anInt3275 = arg0.method8890("mapdots");
		Static414.anInt7098 = arg0.method8890("scrollbar");
		Static150.anInt2401 = arg0.method8890("name_icons");
		Static507.anInt9922 = arg0.method8890("floorshadows");
		Static506.anInt3268 = arg0.method8890("compass");
		Static393.anInt6851 = arg0.method8890("otherlevel");
		Static556.anInt9160 = arg0.method8890("hint_mapedge");
	}

	@OriginalMember(owner = "client!pha", name = "a", descriptor = "(Z[BB)Ljava/lang/Object;")
	public static Object method6481(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		}
		if (arg0.length > 136 && !Static22.aBoolean37) {
			try {
				@Pc(23) Class225 local23 = (Class225) Class.forName("Class225_Sub1").getDeclaredConstructor().newInstance();
				local23.method8144(arg0);
				return local23;
			} catch (@Pc(30) Throwable local30) {
				Static22.aBoolean37 = true;
			}
		}
		return arg0;
	}
}
