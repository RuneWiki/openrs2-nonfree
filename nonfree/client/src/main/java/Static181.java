import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static181 {

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(II)V")
	public static void method3554(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub4_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class53 local8 = Static190.aClass53Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static315.anInt6124; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static242.anInt6744; local15++) {
						local1 = local8.method2784(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << 7;
							@Pc(32) int local32 = local12 << 7;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class53 local41 = Static190.aClass53Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.method2785(local15, local12) - local41.method2785(local15, local12);
									@Pc(67) int local67 = local8.method2785(local15 + 1, local12) - local41.method2785(local15 + 1, local12);
									@Pc(85) int local85 = local8.method2785(local15 + 1, local12 + 1) - local41.method2785(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.method2785(local15, local12 + 1) - local41.method2785(local15, local12 + 1);
									local41.method2788(local1, local28, (local53 + local67 + local85 + local99) / 4, local32);
								}
							}
						}
					}
				}
			}
		}
	}
}
