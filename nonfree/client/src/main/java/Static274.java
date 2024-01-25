import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
	public static final int anInt4727 = 0;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(IB)I")
	public static int method3734(@OriginalArg(0) int arg0) {
		@Pc(13) int local13 = arg0 & 0x3F;
		@Pc(19) int local19 = arg0 >> 6 & 0x3;
		if (local13 == 18) {
			if (local19 == 0) {
				return 1;
			}
			if (local19 == 1) {
				return 2;
			}
			if (local19 == 2) {
				return 4;
			}
			if (local19 == 3) {
				return 8;
			}
		} else if (local13 == 19 || local13 == 21) {
			if (local19 == 0) {
				return 16;
			}
			if (local19 == 1) {
				return 32;
			}
			if (local19 == 2) {
				return 64;
			}
			if (local19 == 3) {
				return 128;
			}
		}
		return 0;
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)V")
	public static void method3735(@OriginalArg(1) int arg0) {
		@Pc(1) Class1_Sub3_Sub11 local1 = null;
		for (@Pc(3) int local3 = 1; local3 < arg0; local3++) {
			@Pc(8) Class139 local8 = Static157.aClass139Array1[local3];
			if (local8 != null) {
				for (@Pc(12) int local12 = 0; local12 < Static325.anInt5351; local12++) {
					for (@Pc(15) int local15 = 0; local15 < Static174.anInt2873; local15++) {
						local1 = local8.OA(local15, local12, local1);
						if (local1 != null) {
							@Pc(28) int local28 = local15 << Static41.anInt612;
							@Pc(32) int local32 = local12 << Static41.anInt612;
							for (@Pc(36) int local36 = local3 - 1; local36 >= 0; local36--) {
								@Pc(41) Class139 local41 = Static157.aClass139Array1[local36];
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
}
