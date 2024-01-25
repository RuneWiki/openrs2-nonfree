import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static425 {

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "Lclient!h;")
	public static final Class114 aClass114_144 = new Class114("Please wait...", "Bitte warte...", "Veuillez patienter...", "Aguarde...");

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_121 = new Class6(11, 3);

	@OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
	public static int anInt7380 = 16777215;

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(ZIIII)V")
	public static void method6301(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg0 >= arg1) {
			Static227.method7421(arg1, arg2, arg0, Static81.anIntArrayArray25[arg3]);
		} else {
			Static227.method7421(arg0, arg2, arg1, Static81.anIntArrayArray25[arg3]);
		}
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(Z)Z")
	public static boolean method6302() {
		@Pc(7) Class1 local7 = Static475.aClass38_69.aClass1_27.aClass1_284;
		if (local7 == null || local7 == Static475.aClass38_69.aClass1_27) {
			return false;
		}
		@Pc(23) Class1_Sub50 local23 = (Class1_Sub50) local7;
		if (local23.anInt8983 >= 2000) {
			local23.anInt8983 -= 2000;
		}
		return local23.anInt8983 == 1002;
	}
}
