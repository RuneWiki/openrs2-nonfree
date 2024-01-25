import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static344 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "Lclient!sw;")
	public static final Class277 aClass277_49 = new Class277(200);

	@OriginalMember(owner = "client!of", name = "d", descriptor = "Lclient!ug;")
	public static final Class294 aClass294_9 = new Class294();

	@OriginalMember(owner = "client!of", name = "e", descriptor = "I")
	public static int anInt6329 = -1;

	@OriginalMember(owner = "client!of", name = "f", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_97 = new Class45("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!of", name = "g", descriptor = "Lclient!pt;")
	public static final Class230 aClass230_36 = new Class230(8);

	@OriginalMember(owner = "client!of", name = "h", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_321 = new Class305(59, 3);

	@OriginalMember(owner = "client!of", name = "i", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_322 = new Class305(78, 7);

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(I)V")
	public static void method5745() {
		if (Static486.aClass15_2 != null) {
			Static486.aClass15_2.method3559();
		}
		if (Static51.aClass15_1 != null) {
			Static51.aClass15_1.method3559();
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z")
	public static boolean method5746() {
		return Static283.anInt5391 == 0 ? Static518.aClass1_Sub4_Sub4_3.method8011() : true;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)Z")
	public static boolean method5747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		if (Static529.method8238(arg0, arg1, arg2)) {
			@Pc(10) int local10 = arg1 << Static275.anInt5260;
			@Pc(14) int local14 = arg2 << Static275.anInt5260;
			return Static188.method3617(local10 + 1, Static296.aClass7Array11[arg0].ba(arg1, arg2) + arg3, local14 + 1) && Static188.method3617(local10 + Static382.anInt6794 - 1, Static296.aClass7Array11[arg0].ba(arg1 + 1, arg2) + arg3, local14 + 1) && Static188.method3617(local10 + Static382.anInt6794 - 1, Static296.aClass7Array11[arg0].ba(arg1 + 1, arg2 + 1) + arg3, local14 + Static382.anInt6794 - 1) && Static188.method3617(local10 + 1, Static296.aClass7Array11[arg0].ba(arg1, arg2 + 1) + arg3, local14 + Static382.anInt6794 - 1);
		} else {
			return false;
		}
	}
}
