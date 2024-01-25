import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static71 {

	@OriginalMember(owner = "client!df", name = "K", descriptor = "[I")
	public static final int[] anIntArray119 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

	@OriginalMember(owner = "client!df", name = "M", descriptor = "[B")
	public static final byte[] aByteArray8 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!df", name = "X", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_22 = new Class134("Unable to find ", "Spieler kann nicht gefunden werden: ", "Impossible de trouver ", "Não é possível encontrar ");

	@OriginalMember(owner = "client!df", name = "a", descriptor = "(IBIIII)Z")
	public static boolean method1075(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		for (@Pc(15) int local15 = arg0; local15 <= arg2; local15++) {
			for (@Pc(19) int local19 = arg1; local19 <= arg3; local19++) {
				if (arg4 == Static353.anIntArrayArray49[local15][local19] && Static202.anIntArrayArray18[local15][local19] <= 1) {
					return true;
				}
			}
		}
		return false;
	}
}
