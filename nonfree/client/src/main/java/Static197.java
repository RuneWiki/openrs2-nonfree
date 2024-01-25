import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static197 {

	@OriginalMember(owner = "client!hn", name = "f", descriptor = "I")
	public static int anInt6246;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
	public static int anInt6253;

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "[[I")
	public static int[][] anIntArrayArray146;

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Z")
	public static boolean aBoolean491 = false;

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Lclient!nea;")
	public static final Class235 aClass235_203 = new Class235(114, 7);

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "J")
	public static long aLong203 = -1L;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(IIB)Z")
	public static boolean method5024(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!Static554.aBoolean708) {
			return false;
		}
		@Pc(13) int local13 = arg1 >> 16;
		@Pc(17) int local17 = arg1 & 0xFFFF;
		if (Static578.aClass341ArrayArray2[local13] == null || Static578.aClass341ArrayArray2[local13][local17] == null) {
			return false;
		}
		@Pc(43) Class341 local43 = Static578.aClass341ArrayArray2[local13][local17];
		@Pc(57) Class1_Sub51 local57;
		if (arg0 == -1 && local43.anInt9309 == 0) {
			for (local57 = (Class1_Sub51) Static310.aClass353_32.method7677(); local57 != null; local57 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
				if (local57.anInt9638 == 21 || local57.anInt9638 == 1010 || local57.anInt9638 == 23 || local57.anInt9638 == 9 || local57.anInt9638 == 50) {
					for (@Pc(147) Class341 local147 = Static350.method4758(local57.anInt9640); local147 != null; local147 = Static157.method2282(local147)) {
						if (local43.anInt9306 == local147.anInt9306) {
							return true;
						}
					}
				}
			}
		} else {
			for (local57 = (Class1_Sub51) Static310.aClass353_32.method7677(); local57 != null; local57 = (Class1_Sub51) Static310.aClass353_32.method7687()) {
				if (arg0 == local57.anInt9641 && local57.anInt9640 == local43.anInt9306 && (local57.anInt9638 == 21 || local57.anInt9638 == 1010 || local57.anInt9638 == 23 || local57.anInt9638 == 9 || local57.anInt9638 == 50)) {
					return true;
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(IIIII)V")
	public static void method5027(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static432.anInt7582 = arg2;
		Static356.anInt5939 = arg0;
		Static342.anInt5722 = arg1;
		Static3.anInt53 = arg3;
	}
}
