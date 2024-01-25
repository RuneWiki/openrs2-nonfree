import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static465 {

	@OriginalMember(owner = "client!po", name = "G", descriptor = "Lclient!jea;")
	public static Class2_Sub1_Sub9 aClass2_Sub1_Sub9_2;

	@OriginalMember(owner = "client!po", name = "H", descriptor = "[I")
	public static int[] anIntArray421;

	@OriginalMember(owner = "client!po", name = "D", descriptor = "Lclient!in;")
	public static final Class169 aClass169_201 = new Class169(81, 2);

	@OriginalMember(owner = "client!po", name = "a", descriptor = "(ILclient!uf;ZI)V")
	public static void method7460(@OriginalArg(0) int arg0, @OriginalArg(1) Class357 arg1, @OriginalArg(3) int arg2) {
		if (Static267.aClass357_180 != null || Static183.aBoolean305 || (arg1 == null || Static418.method6900(arg1) == null)) {
			return;
		}
		Static267.aClass357_180 = arg1;
		Static539.aClass357_140 = Static418.method6900(arg1);
		Static407.anInt7587 = 0;
		Static598.anInt10390 = arg0;
		Static36.aBoolean34 = false;
		Static605.anInt10578 = arg2;
	}
}
