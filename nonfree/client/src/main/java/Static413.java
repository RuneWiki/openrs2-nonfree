import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!uk", name = "R", descriptor = "Lclient!l;")
	public static Interface7 anInterface7_7;

	@OriginalMember(owner = "client!uk", name = "U", descriptor = "F")
	public static float aFloat118;

	@OriginalMember(owner = "client!uk", name = "K", descriptor = "Lclient!os;")
	public static final Class182 aClass182_239 = new Class182("Starting 3D Library", "Starte 3D-Softwarebibliothek.", "Démarrage de la librairie 3D", "Iniciando biblioteca 3D");

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(ILclient!ha;)I")
	public static int method5437(@OriginalArg(1) Class10_Sub8_Sub2 arg0) {
		@Pc(10) int local10 = arg0.method2525(2);
		@Pc(17) int local17;
		if (local10 == 0) {
			local17 = 0;
		} else if (local10 == 1) {
			local17 = arg0.method2525(5);
		} else if (local10 == 2) {
			local17 = arg0.method2525(8);
		} else {
			local17 = arg0.method2525(11);
		}
		return local17;
	}

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(Lclient!gh;B)V")
	public static void method5439(@OriginalArg(0) Class89 arg0) {
		@Pc(7) Class89 local7 = Static159.method2690(arg0);
		@Pc(12) int local12;
		@Pc(15) int local15;
		if (local7 == null) {
			local15 = Static340.anInt5756;
			local12 = Static90.anInt1891;
		} else {
			local12 = local7.anInt2703;
			local15 = local7.anInt2682;
		}
		Static396.method5261(false, local12, local15, arg0);
		Static429.method5681(local12, arg0, local15);
	}
}
