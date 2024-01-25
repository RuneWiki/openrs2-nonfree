import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static196 {

	@OriginalMember(owner = "client!jv", name = "u", descriptor = "I")
	public static int anInt3536;

	@OriginalMember(owner = "client!jv", name = "x", descriptor = "Lclient!ap;")
	public static final Class15 aClass15_54 = new Class15("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!jv", name = "y", descriptor = "Z")
	public static boolean aBoolean269 = false;

	@OriginalMember(owner = "client!jv", name = "a", descriptor = "(ILclient!hd;I)I")
	public static int method2805(@OriginalArg(0) int arg0, @OriginalArg(1) Class110 arg1) {
		if (!Static55.method752(arg1).method2794(arg0) && arg1.anObjectArray6 == null) {
			return -1;
		} else if (arg1.anIntArray218 == null || arg0 >= arg1.anIntArray218.length) {
			return -1;
		} else {
			return arg1.anIntArray218[arg0];
		}
	}
}
