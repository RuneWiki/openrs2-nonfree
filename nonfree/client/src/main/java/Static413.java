import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static413 {

	@OriginalMember(owner = "client!v", name = "d", descriptor = "I")
	public static int anInt7421;

	@OriginalMember(owner = "client!v", name = "f", descriptor = "I")
	public static int anInt7423;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "[I")
	public static final int[] anIntArray510 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!v", name = "b", descriptor = "Lclient!wt;")
	public static final Class267 aClass267_101 = new Class267("Your ignore list is full, max of 100.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O máx. é 100.");

	@OriginalMember(owner = "client!v", name = "c", descriptor = "Z")
	public static boolean aBoolean468 = false;

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)I")
	public static int method6087() {
		@Pc(7) Class66 local7 = Static126.aClass66_5;
		@Pc(9) boolean local9 = false;
		if (Static294.anInt5208 != 0) {
			@Pc(18) Canvas local18 = new Canvas();
			local18.setSize(100, 100);
			local7 = Static96.method5011(local18, 0, null, null, 0);
			local9 = true;
		}
		@Pc(42) long local42 = Static449.method6552();
		for (@Pc(44) int local44 = 0; local44 < 10000; local44++) {
			local7.method5061();
		}
		@Pc(68) int local68 = (int) (Static449.method6552() - local42);
		local7.method5035(100, 0, -16777216, 0, 100);
		if (local9) {
			local7.method5069();
		}
		return local68;
	}
}
