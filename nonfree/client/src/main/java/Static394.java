import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static394 {

	@OriginalMember(owner = "client!ni", name = "o", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_96 = new Class289(20, -1);

	@OriginalMember(owner = "client!ni", name = "t", descriptor = "Lclient!qk;")
	public static final Class289 aClass289_97 = new Class289(88, -1);

	@OriginalMember(owner = "client!ni", name = "u", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[128][128];

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(BII)V")
	public static void method5589(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(14) Class6_Sub4_Sub18 local14 = Static565.method7924((long) arg1 | (long) arg0 << 32, 19);
		local14.method7979();
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "([[BLclient!tf;I)V")
	public static void method5590(@OriginalArg(0) byte[][] arg0, @OriginalArg(1) Class310_Sub1 arg1) {
		for (@Pc(7) int local7 = 0; local7 < arg1.anInt9399; local7++) {
			Static35.method857();
			for (@Pc(13) int local13 = 0; local13 < Static491.anInt9856 >> 3; local13++) {
				for (@Pc(17) int local17 = 0; local17 < Static393.anInt6574 >> 3; local17++) {
					@Pc(27) int local27 = Static149.anIntArrayArrayArray14[local7][local13][local17];
					if (local27 != -1) {
						@Pc(36) int local36 = local27 >> 24 & 0x3;
						if (!arg1.aBoolean682 || local36 == 0) {
							@Pc(47) int local47 = local27 >> 1 & 0x3;
							@Pc(53) int local53 = local27 >> 14 & 0x3FF;
							@Pc(59) int local59 = local27 >> 3 & 0x7FF;
							@Pc(69) int local69 = local59 / 8 + (local53 / 8 << 8);
							for (@Pc(71) int local71 = 0; local71 < Static300.anIntArray289.length; local71++) {
								if (local69 == Static300.anIntArray289[local71] && arg0[local71] != null) {
									arg1.method7932((local59 & 0x7) * 8, local47, Static546.aClass132_13, (local53 & 0x7) * 8, local13 * 8, local17 * 8, arg0[local71], local36, Static83.aClass324Array1, local7);
									break;
								}
							}
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!ni", name = "a", descriptor = "(III)Z")
	public static boolean method5591(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg1 & 0x8000) != 0;
	}
}
