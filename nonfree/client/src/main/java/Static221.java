import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static221 {

	@OriginalMember(owner = "client!kt", name = "d", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!kt", name = "c", descriptor = "[I")
	public static final int[] anIntArray339 = new int[14];

	@OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
	public static int anInt3902 = 0;

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)Z")
	public static boolean method3101() {
		@Pc(12) Class7 local12 = Static237.aClass85_26.aClass7_81.aClass7_261;
		if (local12 == null || local12 == Static237.aClass85_26.aClass7_81) {
			return false;
		}
		@Pc(23) Class7_Sub39 local23 = (Class7_Sub39) local12;
		if (local23.anInt5893 >= 2000) {
			local23.anInt5893 -= 2000;
		}
		return local23.anInt5893 == 1008;
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(II)V")
	public static void method3102(@OriginalArg(0) int arg0) {
		if (Static267.anInt4536 == 1) {
			Static250.anInt4247 = arg0;
		} else if (Static267.anInt4536 == 2 || Static267.anInt4536 == 3) {
			Static445.anInt1109 = arg0;
		}
	}
}
