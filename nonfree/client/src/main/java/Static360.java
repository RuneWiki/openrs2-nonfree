import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static360 {

	@OriginalMember(owner = "client!sg", name = "H", descriptor = "Lclient!hh;")
	public static Class109 aClass109_80;

	@OriginalMember(owner = "client!sg", name = "K", descriptor = "I")
	public static int anInt6588 = -1;

	@OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
	public static int anInt6590 = 0;

	@OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)V")
	public static void method5151(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub1_Sub3 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class70 local8 = Static60.aClass70Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static219.anInt3872; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static251.anInt4344; local15++) {
						local1 = local8.O(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static58.anInt1051;
							@Pc(32) int local32 = local12 << Static58.anInt1051;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class70 local41 = Static60.aClass70Array1[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.I(local15, local12) - local41.I(local15, local12);
									@Pc(67) int local67 = local8.I(local15 + 1, local12) - local41.I(local15 + 1, local12);
									@Pc(85) int local85 = local8.I(local15 + 1, local12 + 1) - local41.I(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.I(local15, local12 + 1) - local41.I(local15, local12 + 1);
									local41.SA(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}
}
