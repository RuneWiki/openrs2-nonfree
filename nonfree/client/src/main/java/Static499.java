import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static499 {

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "I")
	public static int anInt8831;

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "I")
	public static int anInt8832 = 0;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BF)F")
	public static float method7330(@OriginalArg(1) float arg0) {
		return ((arg0 * 6.0F - 15.0F) * arg0 + 10.0F) * arg0 * arg0 * arg0;
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(III)Z")
	public static boolean method7331(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x40000) != 0 | Static532.method7628(arg0, arg1) || Static226.method5385(arg1, arg0);
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(ZII)I")
	public static int method7332(@OriginalArg(1) int arg0) {
		@Pc(16) Class14_Sub50 local16 = Static250.method3683(arg0, false);
		if (local16 == null) {
			return Static548.aClass41_1.method1102(arg0).anInt7037;
		}
		@Pc(26) int local26 = 0;
		for (@Pc(28) int local28 = 0; local28 < local16.anIntArray699.length; local28++) {
			if (local16.anIntArray699[local28] == -1) {
				local26++;
			}
		}
		return local26 + Static548.aClass41_1.method1102(arg0).anInt7037 - local16.anIntArray699.length;
	}
}
