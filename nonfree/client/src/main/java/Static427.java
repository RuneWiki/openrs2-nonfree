import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!om", name = "l", descriptor = "Lclient!jk;")
	public static final Class176 aClass176_5 = new Class176("stellardawn", 1);

	@OriginalMember(owner = "client!om", name = "a", descriptor = "(BLclient!vs;I)Z")
	public static boolean method6317(@OriginalArg(1) Class379 arg0, @OriginalArg(2) int arg1) {
		Static7.aClass207_1.method8195(arg0.anIntArray697[arg1], arg0.anIntArray696[arg1], arg0.anIntArray695[arg1], Static631.anIntArray680);
		@Pc(22) int local22 = Static631.anIntArray680[2];
		if (local22 < 50) {
			return false;
		} else {
			arg0.aShortArray159[arg1] = (short) (Static153.anInt2553 * Static631.anIntArray680[0] / local22 + Static613.anInt10037);
			arg0.aShortArray158[arg1] = (short) (Static492.anInt6134 + Static631.anIntArray680[1] * Static399.anInt6714 / local22);
			arg0.aShortArray157[arg1] = (short) local22;
			return true;
		}
	}
}
