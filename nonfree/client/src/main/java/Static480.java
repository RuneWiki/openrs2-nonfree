import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static480 {

	@OriginalMember(owner = "client!uda", name = "d", descriptor = "Lclient!qp;")
	public static final Class239 aClass239_173 = new Class239(74, 4);

	@OriginalMember(owner = "client!uda", name = "e", descriptor = "Lclient!nj;")
	public static final Class202 aClass202_242 = new Class202("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

	@OriginalMember(owner = "client!uda", name = "f", descriptor = "[F")
	public static final float[] aFloatArray71 = new float[16];

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(B)V")
	public static void method7150() {
		Static308.aClass310Array1 = null;
		Static289.method4599(0, 0, Static461.anInt8348, 0, Static387.anInt7341, 0, -1, Static223.anInt3996);
		if (Static308.aClass310Array1 != null) {
			Static218.method3455(0, Static461.anInt8348, Static194.anInt1960, Static325.aClass310_15.anInt9211, Static8.anInt213, Static308.aClass310Array1, Static223.anInt3996, -1412584499, 0);
			Static308.aClass310Array1 = null;
		}
	}

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(IBII)I")
	public static int method7151(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(3) int local3 = arg0 & 0x3;
		if (local3 == 0) {
			return arg1;
		} else if (local3 == 1) {
			return 1023 - arg2;
		} else if (local3 == 2) {
			return 1023 - arg1;
		} else {
			return arg2;
		}
	}
}
