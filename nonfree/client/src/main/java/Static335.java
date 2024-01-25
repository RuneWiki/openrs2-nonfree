import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!mi", name = "k", descriptor = "Z")
	public static boolean aBoolean491 = true;

	@OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)V")
	public static void method5131(@OriginalArg(1) int arg0) {
		if (!Static168.method2918(arg0)) {
			return;
		}
		@Pc(14) Class196[] local14 = Static2.aClass196ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local14.length; local22++) {
			@Pc(28) Class196 local28 = local14[local22];
			if (local28 != null) {
				local28.anInt5101 = 0;
				local28.anInt5147 = 1;
				local28.anInt5087 = 0;
			}
		}
	}
}
