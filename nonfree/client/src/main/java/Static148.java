import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static148 {

	@OriginalMember(owner = "client!gb", name = "c", descriptor = "I")
	public static int anInt2727;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_87 = new Class202("Examine", "Untersuchen", "Examiner", "Examinar");

	@OriginalMember(owner = "client!gb", name = "d", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_88 = new Class202("Started 3D Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(Lclient!lk;I)I")
	public static int method2582(@OriginalArg(0) Class1_Sub1_Sub2_Sub2 arg0) {
		@Pc(8) Class12 local8 = arg0.aClass12_1;
		if (local8.anIntArray21 != null) {
			local8 = local8.method455(Static84.aClass302_1);
			if (local8 == null) {
				return -1;
			}
		}
		@Pc(23) int local23 = local8.anInt319;
		@Pc(27) Class24 local27 = arg0.method4393();
		if (arg0.aBoolean385) {
			local23 = local8.anInt338;
		} else if (local27.anInt667 == arg0.anInt5063 || local27.anInt685 == arg0.anInt5063 || arg0.anInt5063 == local27.anInt686 || arg0.anInt5063 == local27.anInt656) {
			local23 = local8.anInt323;
		} else if (arg0.anInt5063 == local27.anInt665 || local27.anInt659 == arg0.anInt5063 || local27.anInt653 == arg0.anInt5063 || arg0.anInt5063 == local27.anInt661) {
			local23 = local8.anInt348;
		}
		return local23;
	}
}
