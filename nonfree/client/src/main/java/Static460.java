import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static460 {

	@OriginalMember(owner = "client!qk", name = "g", descriptor = "I")
	public static int anInt8416;

	@OriginalMember(owner = "client!qk", name = "m", descriptor = "Z")
	public static boolean aBoolean600 = false;

	@OriginalMember(owner = "client!qk", name = "a", descriptor = "(IBIII)V")
	public static void method6945(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (Static105.anInt2774 != 1) {
			return;
		}
		@Pc(23) int local23 = arg2 / Static266.anInt5676;
		@Pc(27) int local27 = arg3 / Static266.anInt5676;
		@Pc(31) int local31 = arg0 / Static332.anInt6574;
		@Pc(35) int local35 = arg1 / Static332.anInt6574;
		if (Static362.anInt6930 <= local23 || local27 < 0 || local31 >= Static121.anInt3161 || local35 < 0) {
			return;
		}
		if (Static362.anInt6930 <= local27) {
			local27 = Static362.anInt6930 - 1;
		}
		if (Static121.anInt3161 <= local35) {
			local35 = Static121.anInt3161 - 1;
		}
		if (local31 < 0) {
			local31 = 0;
		}
		if (local23 < 0) {
			local23 = 0;
		}
		for (@Pc(77) int local77 = local31; local77 <= local35; local77++) {
			@Pc(88) int local88 = Static196.method3669(Static121.anInt3161, Static104.anInt2768 + local77) * Static362.anInt6930;
			for (@Pc(90) int local90 = local23; local90 <= local27; local90++) {
				@Pc(101) int local101 = Static196.method3669(Static362.anInt6930, Static384.anInt7468 + local90) + local88;
				Static86.anIntArray105[local101] = Static480.anInt8593;
			}
		}
	}
}
