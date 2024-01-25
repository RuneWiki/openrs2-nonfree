import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static381 {

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(ZIII)V")
	public static void method5311(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(11, arg0);
		local8.method7363();
		local8.anInt9381 = arg2;
		local8.anInt9377 = arg1;
	}

	@OriginalMember(owner = "client!od", name = "a", descriptor = "(IIII)Z")
	public static boolean method5312(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Static362.aClass42_3.method7518(arg0, arg2, arg1, Static552.anIntArray558);
		@Pc(13) int local13 = Static552.anIntArray558[2];
		if (local13 < 50) {
			return false;
		} else {
			Static552.anIntArray558[0] = Static437.anInt7748 * Static552.anIntArray558[0] / local13 + Static176.anInt3895;
			Static552.anIntArray558[1] = Static219.anInt4579 * Static552.anIntArray558[1] / local13 + Static459.anInt8016;
			Static552.anIntArray558[2] = local13;
			return true;
		}
	}
}
