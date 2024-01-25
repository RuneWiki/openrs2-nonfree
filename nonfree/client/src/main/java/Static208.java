import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static208 {

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "Ljava/lang/String;")
	public static String aString45;

	@OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
	public static int anInt3637;

	@OriginalMember(owner = "client!gr", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString46 = null;

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)V")
	public static void method3102(@OriginalArg(0) int arg0) {
		Static403.anInt10576 = arg0;
		for (@Pc(3) int local3 = 0; local3 < Static133.anInt2551; local3++) {
			for (@Pc(6) int local6 = 0; local6 < Static155.anInt2874; local6++) {
				if (Static254.aClass368ArrayArrayArray2[arg0][local3][local6] == null) {
					Static254.aClass368ArrayArrayArray2[arg0][local3][local6] = new Class368(arg0);
				}
			}
		}
	}

	@OriginalMember(owner = "client!gr", name = "a", descriptor = "(III)V")
	public static void method3104(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(9) Class382 local9 = Static26.aClass382ArrayArray1[arg1][arg0];
		if (local9 != null) {
			Static349.anInt6010 = local9.anInt10675;
			Static372.anInt6288 = local9.anInt10674;
			Static639.anInt10531 = local9.anInt10673;
		}
		Static1.method8754();
	}
}
