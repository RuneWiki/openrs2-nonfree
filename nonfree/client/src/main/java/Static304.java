import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static304 {

	@OriginalMember(owner = "client!on", name = "H", descriptor = "Lclient!jp;")
	public static Class129 aClass129_129;

	@OriginalMember(owner = "client!on", name = "A", descriptor = "Lclient!d;")
	public static final Class44 aClass44_48 = new Class44(20);

	@OriginalMember(owner = "client!on", name = "I", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_89 = new Class198("Connected to update server", "Verbindung zum Update-Server hergestellt.", "Connecté au serveur de mise à jour", "Conectado ao servidor de atualização");

	@OriginalMember(owner = "client!on", name = "J", descriptor = "I")
	public static int anInt4779 = -1;

	@OriginalMember(owner = "client!on", name = "K", descriptor = "I")
	public static int anInt4780 = 0;

	@OriginalMember(owner = "client!on", name = "a", descriptor = "(IFFF)I")
	public static int method3791(@OriginalArg(1) float arg0, @OriginalArg(2) float arg1, @OriginalArg(3) float arg2) {
		@Pc(12) float local12 = arg2 < 0.0F ? -arg2 : arg2;
		@Pc(21) float local21 = arg1 < 0.0F ? -arg1 : arg1;
		@Pc(35) float local35 = arg0 < 0.0F ? -arg0 : arg0;
		if (local12 < local21 && local35 < local21) {
			return arg1 > 0.0F ? 0 : 1;
		} else if (local12 < local35 && local35 > local21) {
			return arg0 > 0.0F ? 2 : 3;
		} else if (arg2 > 0.0F) {
			return 4;
		} else {
			return 5;
		}
	}
}
