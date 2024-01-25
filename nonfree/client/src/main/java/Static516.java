import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static516 {

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "Ljava/lang/Thread;")
	public static Thread aThread7;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
	public static int anInt8174 = 0;

	@OriginalMember(owner = "client!tq", name = "f", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_249 = new Class272(110, 8);

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V")
	public static void method6878() {
		Static567.aClass232Array1 = new Class232[50];
		Static407.anInt6912 = 0;
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)Lclient!bk;")
	public static Class27 method6879() {
		try {
			return (Class27) Class.forName("Class27_Sub1").getDeclaredConstructor().newInstance();
		} catch (@Pc(14) Throwable local14) {
			return null;
		}
	}

	@OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILclient!om;)V")
	public static void method6880(@OriginalArg(1) Class246 arg0) {
		Static410.anInt6920 = arg0.method5665("hitmarks");
		Static376.anInt6363 = arg0.method5665("hitbar_default");
		Static160.anInt3217 = arg0.method5665("timerbar_default");
		Static243.anInt4530 = arg0.method5665("headicons_pk");
		Static233.anInt4433 = arg0.method5665("headicons_prayer");
		Static416.anInt6986 = arg0.method5665("hint_headicons");
		Static451.anInt7398 = arg0.method5665("hint_mapmarkers");
		Static2.anInt17 = arg0.method5665("mapflag");
		Static225.anInt4392 = arg0.method5665("cross");
		Static193.anInt3726 = arg0.method5665("mapdots");
		Static536.anInt8406 = arg0.method5665("scrollbar");
		Static597.anInt9434 = arg0.method5665("name_icons");
		Static569.anInt9141 = arg0.method5665("floorshadows");
		Static409.anInt6458 = arg0.method5665("compass");
		Static193.anInt3724 = arg0.method5665("otherlevel");
		Static462.anInt7556 = arg0.method5665("hint_mapedge");
	}
}
