import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static81 {

	@OriginalMember(owner = "client!ds", name = "k", descriptor = "Lclient!rj;")
	public static Class209 aClass209_1;

	@OriginalMember(owner = "client!ds", name = "b", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_42 = new Class7("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!ds", name = "w", descriptor = "J")
	public static volatile long aLong54 = 0L;

	@OriginalMember(owner = "client!ds", name = "z", descriptor = "Lclient!ak;")
	public static final Class7 aClass7_43 = new Class7("K", "T", "K", "K");

	@OriginalMember(owner = "client!ds", name = "a", descriptor = "(DI)V")
	public static void method1567(@OriginalArg(0) double arg0) {
		if (arg0 == Static325.aDouble1) {
			return;
		}
		for (@Pc(15) int local15 = 0; local15 < 256; local15++) {
			@Pc(27) int local27 = (int) (Math.pow((double) local15 / 255.0D, arg0) * 255.0D);
			Static155.anIntArray268[local15] = local27 > 255 ? 255 : local27;
		}
		Static325.aDouble1 = arg0;
	}
}
