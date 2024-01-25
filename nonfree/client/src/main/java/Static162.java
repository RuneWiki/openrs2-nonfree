import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!kg", name = "m", descriptor = "[[Lclient!ec;")
	public static Class50[][] aClass50ArrayArray1;

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "Z")
	public static boolean aBoolean273 = false;

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZIB)I")
	public static int method3166(@OriginalArg(1) int arg0) {
		@Pc(14) Class4_Sub44 local14 = Static92.method531(false, arg0);
		if (local14 == null) {
			return Static112.method2376(arg0).anInt243;
		}
		@Pc(23) int local23 = 0;
		for (@Pc(25) int local25 = 0; local25 < local14.anIntArray502.length; local25++) {
			if (local14.anIntArray502[local25] == -1) {
				local23++;
			}
		}
		return local23 + Static112.method2376(arg0).anInt243 - local14.anIntArray502.length;
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(IB)S")
	public static short method3167(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = arg0 >> 10 & 0x3F;
		@Pc(15) int local15 = arg0 >> 3 & 0x70;
		@Pc(25) int local25 = arg0 & 0x7F;
		@Pc(45) int local45 = local25 <= 64 ? local15 * local25 >> 7 : (127 - local25) * local15 >> 7;
		@Pc(49) int local49 = local45 + local25;
		@Pc(58) int local58;
		if (local49 == 0) {
			local58 = local45 << 1;
		} else {
			local58 = (local45 << 8) / local49;
		}
		return (short) (local49 | local9 << 10 | local58 >> 4 << 7);
	}

	@OriginalMember(owner = "client!kg", name = "a", descriptor = "(Lclient!tj;Z)V")
	public static void method3169(@OriginalArg(0) Class193 arg0) {
		Static340.aClass193_107 = arg0;
		Static300.anInt5748 = Static340.aClass193_107.method5055(4);
	}
}
