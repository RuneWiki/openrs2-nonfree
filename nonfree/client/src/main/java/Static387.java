import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static387 {

	@OriginalMember(owner = "client!th", name = "l", descriptor = "I")
	public static int anInt6433;

	@OriginalMember(owner = "client!th", name = "s", descriptor = "I")
	public static int anInt6440;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "(II)V")
	public static void method5068(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub5_Sub10 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class157 local8 = Static330.aClass157Array2[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static408.anInt6716; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static37.anInt666; local15++) {
						local1 = local8.OA(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static215.anInt4460;
							@Pc(32) int local32 = local12 << Static215.anInt4460;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class157 local41 = Static330.aClass157Array2[local36];
								if (local41 != null) {
									@Pc(53) int local53 = local8.ua(local15, local12) - local41.ua(local15, local12);
									@Pc(67) int local67 = local8.ua(local15 + 1, local12) - local41.ua(local15 + 1, local12);
									@Pc(85) int local85 = local8.ua(local15 + 1, local12 + 1) - local41.ua(local15 + 1, local12 + 1);
									@Pc(99) int local99 = local8.ua(local15, local12 + 1) - local41.ua(local15, local12 + 1);
									local41.H(local1, local28, (local53 + local67 + local85 + local99) / 4, local32, 0, false);
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!th", name = "c", descriptor = "(II)I")
	public static int method5069(@OriginalArg(1) int arg0) {
		@Pc(9) int local9 = (arg0 & 0x55555555) + (arg0 >>> 1 & 0xD5555555);
		@Pc(23) int local23 = (local9 >>> 2 & 0x33333333) + (local9 & 0x33333333);
		@Pc(31) int local31 = (local23 >>> 4) + local23 & 0xF0F0F0F;
		@Pc(37) int local37 = local31 + (local31 >>> 8);
		@Pc(48) int local48 = local37 + (local37 >>> 16);
		return local48 & 0xFF;
	}
}
