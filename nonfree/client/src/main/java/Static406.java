import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!ul", name = "f", descriptor = "Lclient!lm;")
	public static Class150 aClass150_3;

	@OriginalMember(owner = "client!ul", name = "l", descriptor = "I")
	public static int anInt7052;

	@OriginalMember(owner = "client!ul", name = "m", descriptor = "F")
	public static float aFloat208;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
	public static int anInt7045 = 0;

	@OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
	public static int anInt7049 = 0;

	@OriginalMember(owner = "client!ul", name = "j", descriptor = "I")
	public static int anInt7051 = -1;

	@OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)V")
	public static void method5505(@OriginalArg(1) int arg0) {
		@Pc(1) Class2_Sub2_Sub9 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class106 local8 = Static72.aClass106Array4[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static360.anInt6340; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static86.anInt2009; local15++) {
						local1 = local8.O(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static250.anInt4056;
							@Pc(32) int local32 = local12 << Static250.anInt4056;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class106 local41 = Static72.aClass106Array4[local36];
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

	@OriginalMember(owner = "client!ul", name = "b", descriptor = "(ZI)Lclient!wv;")
	public static Class269 method5506(@OriginalArg(1) int arg0) {
		@Pc(8) Class269[] local8 = Static114.method1702();
		for (@Pc(15) int local15 = 0; local15 < local8.length; local15++) {
			@Pc(21) Class269 local21 = local8[local15];
			if (arg0 == local21.anInt7852) {
				return local21;
			}
		}
		return null;
	}
}
