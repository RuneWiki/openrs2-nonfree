import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static144 {

	@OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
	public static int anInt3368;

	@OriginalMember(owner = "client!fea", name = "c", descriptor = "I")
	public static int anInt3369 = 0;

	@OriginalMember(owner = "client!fea", name = "a", descriptor = "(II)V")
	public static void method2749(@OriginalArg(1) int arg0) {
		@Pc(1) Class3_Sub7_Sub3 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class127 local8 = Static420.aClass127Array6[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static414.anInt7451; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static349.anInt6237; local15++) {
						local1 = local8.v(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static385.anInt6657;
							@Pc(32) int local32 = local12 << Static385.anInt6657;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class127 local41 = Static420.aClass127Array6[local36];
								if (local41 != null) {
									@Pc(55) int local55 = local8.method7862(local12, local15) - local41.method7862(local12, local15);
									@Pc(71) int local71 = local8.method7862(local12, local15 + 1) - local41.method7862(local12, local15 + 1);
									@Pc(91) int local91 = local8.method7862(local12 + 1, local15 + 1) - local41.method7862(local12 + 1, local15 + 1);
									@Pc(107) int local107 = local8.method7862(local12 + 1, local15) - local41.method7862(local12 + 1, local15);
									local41.E(local1, local28, (local55 + local71 + local91 + local107) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
