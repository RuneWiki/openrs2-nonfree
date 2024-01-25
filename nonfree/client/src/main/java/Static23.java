import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static23 {

	@OriginalMember(owner = "client!bi", name = "x", descriptor = "Lclient!tq;")
	public static Class191 aClass191_14;

	@OriginalMember(owner = "client!bi", name = "v", descriptor = "Lclient!se;")
	public static final Class179 aClass179_1 = new Class179(64);

	@OriginalMember(owner = "client!bi", name = "B", descriptor = "Lclient!iq;")
	public static final Class93 aClass93_8 = new Class93("Cancel", "Abbrechen", "Annuler", "Cancelar");

	@OriginalMember(owner = "client!bi", name = "C", descriptor = "Lclient!va;")
	public static Class199 aClass199_2 = new Class199(128);

	@OriginalMember(owner = "client!bi", name = "D", descriptor = "Lclient!wq;")
	public static final Class216 aClass216_16 = new Class216();

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(Lclient!on;II)Ljava/lang/String;")
	public static String method712(@OriginalArg(0) Class146 arg0, @OriginalArg(2) int arg1) {
		if (!Static43.method1056(arg0).method708(arg1) && arg0.anObjectArray17 == null) {
			return null;
		} else if (arg0.aStringArray39 == null || arg0.aStringArray39.length <= arg1 || arg0.aStringArray39[arg1] == null || arg0.aStringArray39[arg1].trim().length() == 0) {
			return Static300.aBoolean520 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray39[arg1];
		}
	}

	@OriginalMember(owner = "client!bi", name = "a", descriptor = "(IB)V")
	public static void method713() {
		@Pc(1) Class119 local1 = Static295.aClass119_179;
		synchronized (Static295.aClass119_179) {
			Static295.aClass119_179.method3315(5);
		}
	}
}
