import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!fj", name = "B", descriptor = "Z")
	public static boolean aBoolean758 = false;

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)V")
	public static void method9169(@OriginalArg(0) int arg0) {
		Static496.anInt8830 = arg0;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(IIII)Z")
	public static boolean method9170(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static153.aClass26_2.method6461(arg0, arg1, arg2, Static366.anIntArray490);
		@Pc(13) int local13 = Static366.anIntArray490[2];
		if (local13 < 50) {
			return false;
		} else {
			Static366.anIntArray490[2] = local13;
			Static366.anIntArray490[0] = Static104.anInt2176 + Static366.anIntArray490[0] * Static651.anInt10890 / local13;
			Static366.anIntArray490[1] = Static283.anInt4862 + Static366.anIntArray490[1] * Static493.anInt8807 / local13;
			return true;
		}
	}
}
