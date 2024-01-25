import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static233 {

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "D")
	public static double aDouble10;

	@OriginalMember(owner = "client!ie", name = "c", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_63 = new Class274(108, 6);

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZIIII)V")
	public static void method3884(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static244.anInt4841 != 1) {
			return;
		}
		@Pc(13) int local13 = arg2 / Static531.anInt8888;
		@Pc(17) int local17 = arg3 / Static531.anInt8888;
		@Pc(21) int local21 = arg1 / Static155.anInt3544;
		@Pc(25) int local25 = arg0 / Static155.anInt3544;
		if (Static466.anInt4483 <= local13 || local17 < 0 || Static207.anInt4335 <= local21 || local25 < 0) {
			return;
		}
		if (Static466.anInt4483 <= local17) {
			local17 = Static466.anInt4483 - 1;
		}
		if (local21 < 0) {
			local21 = 0;
		}
		if (local13 < 0) {
			local13 = 0;
		}
		if (Static207.anInt4335 <= local25) {
			local25 = Static207.anInt4335 - 1;
		}
		for (@Pc(81) int local81 = local21; local81 <= local25; local81++) {
			@Pc(91) int local91 = Static438.method6516(local81 + Static260.anInt5098, Static207.anInt4335) * Static466.anInt4483;
			for (@Pc(93) int local93 = local13; local93 <= local17; local93++) {
				@Pc(103) int local103 = Static438.method6516(local93 + Static78.anInt1695, Static466.anInt4483) + local91;
				Static315.anIntArray429[local103] = Static250.anInt8281;
			}
		}
	}

	@OriginalMember(owner = "client!ie", name = "a", descriptor = "(ZI)V")
	public static void method3886(@OriginalArg(1) int arg0) {
		if (Static164.method3053(arg0)) {
			Static162.method3035(Static399.aClass78ArrayArray1[arg0], -1);
		}
	}
}
