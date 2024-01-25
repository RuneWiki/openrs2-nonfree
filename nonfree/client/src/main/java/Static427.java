import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static427 {

	@OriginalMember(owner = "client!pe", name = "C", descriptor = "[I")
	public static final int[] anIntArray582 = new int[8];

	@OriginalMember(owner = "client!pe", name = "a", descriptor = "(IIIIIII)V")
	public static void method6422(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static237.anInt4011 = arg4;
		Static451.anInt7592 = arg1;
		Static339.anInt5858 = arg2;
		Static72.anInt1131 = arg0;
		Static430.anInt7289 = arg3;
		Static200.anInt3569 = arg5;
	}

	@OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)I")
	public static int method6424() {
		@Pc(7) int local7 = Static154.aClass291_2.method6904();
		if (local7 < Static593.aClass291Array1.length - 1) {
			Static154.aClass291_2 = Static593.aClass291Array1[local7 + 1];
		}
		return 100;
	}

	@OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
	public static void method6425() {
		if (Static214.aClass192_1.aBoolean389 && Static526.aClass109_5.anInt2756 != -1) {
			Static245.method3744(Static526.aClass109_5.aString44, Static526.aClass109_5.anInt2756);
		}
	}
}
