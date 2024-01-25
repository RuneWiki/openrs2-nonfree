import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static408 {

	@OriginalMember(owner = "client!qv", name = "c", descriptor = "Lclient!dn;")
	public static Class69 aClass69_78;

	@OriginalMember(owner = "client!qv", name = "g", descriptor = "Lclient!cea;")
	public static final Class45 aClass45_109 = new Class45("Loaded config", "Konfig geladen.", "Fichiers config chargés", "Config carregada");

	@OriginalMember(owner = "client!qv", name = "h", descriptor = "Lclient!vj;")
	public static final Class305 aClass305_377 = new Class305(97, -2);

	@OriginalMember(owner = "client!qv", name = "a", descriptor = "(IZI)V")
	public static void method6498(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		Static434.anInt7518 = 3;
		Static361.anInt6516 = arg1;
		Static360.method5866(Static101.aClass210_1.aString150, Static101.aClass210_1.anInt6291);
		if (arg0) {
			Static212.method3940(false, "", "");
		} else {
			Static453.method6979();
			Static212.method3940(false, Static260.aString112, Static429.aString183);
		}
	}
}
