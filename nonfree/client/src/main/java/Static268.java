import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static268 {

	@OriginalMember(owner = "client!qp", name = "d", descriptor = "Lclient!ci;")
	public static Class36 aClass36_8;

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "Lclient!hc;")
	public static final Class85 aClass85_118 = new Class85("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!qp", name = "c", descriptor = "[I")
	public static final int[] anIntArray507 = new int[14];

	@OriginalMember(owner = "client!qp", name = "a", descriptor = "(III)V")
	public static void method4710(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class74 local9 = Static25.method4630(arg0);
		@Pc(12) int local12 = local9.anInt1872;
		@Pc(15) int local15 = local9.anInt1876;
		@Pc(18) int local18 = local9.anInt1873;
		@Pc(24) int local24 = Class5_Sub3_Sub6.anIntArray84[local18 - local15];
		if (arg1 < 0 || arg1 > local24) {
			arg1 = 0;
		}
		local24 <<= local15;
		Static111.method1962(local12, arg1 << local15 & local24 | ~local24 & Static134.anIntArray205[local12]);
	}
}
