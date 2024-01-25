import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static111 {

	@OriginalMember(owner = "client!fg", name = "y", descriptor = "I")
	public static int anInt5896;

	@OriginalMember(owner = "client!fg", name = "p", descriptor = "Lclient!os;")
	public static final Class182 aClass182_209 = new Class182("Opened title screen", "Titelbild geöffnet.", "Écran-titre ouvert", "Tela título aberta");

	@OriginalMember(owner = "client!fg", name = "q", descriptor = "Z")
	public static boolean aBoolean380 = false;

	@OriginalMember(owner = "client!fg", name = "w", descriptor = "I")
	public static int anInt5894 = -1;

	@OriginalMember(owner = "client!fg", name = "b", descriptor = "(Z)V")
	public static void method4688() {
		Static392.aClass89Array2 = null;
		Static425.method5652(0, -1, 0, 0, Static90.anInt1891, 0, Static189.anInt3826, Static340.anInt5756);
		if (Static392.aClass89Array2 != null) {
			Static218.method3307(Static355.anInt6049, Static67.aClass89_2.anInt2723, 0, Static345.anInt5877, Static392.aClass89Array2, Static340.anInt5756, -1412584499, 0, Static90.anInt1891);
			Static392.aClass89Array2 = null;
		}
	}

	@OriginalMember(owner = "client!fg", name = "a", descriptor = "(BI)V")
	public static void method4689(@OriginalArg(1) int arg0) {
		@Pc(16) Class10_Sub1_Sub17 local16 = Static154.method2630(9, arg0);
		local16.method5346();
	}
}
