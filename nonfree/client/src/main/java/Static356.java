import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static356 {

	@OriginalMember(owner = "client!np", name = "m", descriptor = "I")
	public static int anInt6930 = 0;

	@OriginalMember(owner = "client!np", name = "z", descriptor = "[[Z")
	public static final boolean[][] aBooleanArrayArray9 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(IIZBI)V")
	public static void method5759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(4) int arg3) {
		if (Static495.anInt9000 == 0) {
			Static136.method2695(false);
		} else {
			Static546.anInt9681 = Static495.anInt9000;
			Static547.method7956(0);
		}
		Static204.aBoolean623 = arg2;
		Static56.anInt915 = arg3;
		Static368.anInt7165 = arg0;
		Static455.method3071(arg1);
	}

	@OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Z")
	public static boolean method5763(@OriginalArg(1) int arg0) {
		return arg0 == 0 || arg0 == 2;
	}
}
