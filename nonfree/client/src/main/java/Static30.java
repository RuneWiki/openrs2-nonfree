import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bp", name = "z", descriptor = "I")
	public static int anInt1224;

	@OriginalMember(owner = "client!bp", name = "D", descriptor = "Lclient!cq;")
	public static final Class34 aClass34_25 = new Class34("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!bp", name = "E", descriptor = "[I")
	public static final int[] anIntArray104 = new int[2500];

	@OriginalMember(owner = "client!bp", name = "G", descriptor = "I")
	public static int anInt1228 = 0;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(IZIIZ)V")
	public static void method888(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3) {
		Static334.aLong200 = 0L;
		@Pc(8) int local8 = Static44.method1024();
		if (arg2 == 3 || local8 == 3) {
			arg3 = true;
		}
		if (!Static208.aClass32_11.method2222()) {
			arg3 = true;
		}
		Static36.method874(arg3, arg2, local8, arg0, arg1);
	}
}
