import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static407 {

	@OriginalMember(owner = "client!rb", name = "C", descriptor = "Lclient!vt;")
	public static final Class306 aClass306_103 = new Class306("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

	@OriginalMember(owner = "client!rb", name = "G", descriptor = "Z")
	public static boolean aBoolean520 = false;

	@OriginalMember(owner = "client!rb", name = "M", descriptor = "I")
	public static int anInt7234 = 0;

	@OriginalMember(owner = "client!rb", name = "a", descriptor = "(IZII)I")
	public static int method6054(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		@Pc(16) Class1_Sub18 local16 = Static7.method282(arg1, arg0);
		if (local16 == null) {
			return -1;
		} else if (arg2 >= 0 && local16.anIntArray254.length > arg2) {
			return local16.anIntArray254[arg2];
		} else {
			return -1;
		}
	}
}
