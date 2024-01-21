import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static176 {

	@OriginalMember(owner = "client!wa", name = "e", descriptor = "Lclient!ga;")
	public static Class30 aClass30_62;

	@OriginalMember(owner = "client!wa", name = "b", descriptor = "Lclient!ed;")
	private static Class23 aClass23_1597 = Static169.method2903("Use");

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1596 = aClass23_1597;

	@OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
	public static int anInt4186 = (int) (Math.random() * 33.0D) - 16;

	@OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
	public static int anInt4187 = -1;

	@OriginalMember(owner = "client!wa", name = "f", descriptor = "Lclient!ed;")
	public static Class23 aClass23_1598 = Static169.method2903("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!wa", name = "i", descriptor = "Z")
	public static boolean aBoolean209 = false;

	@OriginalMember(owner = "client!wa", name = "k", descriptor = "I")
	public static int anInt4191 = 1;

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
	public static void method2990() {
		@Pc(1) Class51 local1 = Static93.aClass51_1;
		synchronized (Static93.aClass51_1) {
			Static18.anInt568 = Static139.anInt3553;
			Static163.anInt4014 = Static170.anInt814;
			Static96.anInt2484 = Static9.anInt376;
			Static163.anInt4012 = Static39.anInt1073;
			Static38.anInt1049 = Static105.anInt2707;
			Static165.anInt4054 = Static86.anInt2300;
			Static94.aLong75 = Static13.aLong15;
			Static39.anInt1073 = 0;
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(IIIII)V")
	public static void method2991(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		for (@Pc(7) int local7 = 0; local7 < Static112.anInt2869; local7++) {
			if (arg0 < Static23.anIntArray97[local7] + Static87.anIntArray121[local7] && arg0 + arg3 > Static87.anIntArray121[local7] && arg2 < Static103.anIntArray345[local7] + Static18.anIntArray79[local7] && arg2 + arg1 > Static103.anIntArray345[local7]) {
				Static98.aBooleanArray12[local7] = true;
			}
		}
	}

	@OriginalMember(owner = "client!wa", name = "a", descriptor = "(Z)V")
	public static void method2992() {
		aClass23_1597 = null;
		aClass23_1596 = null;
		aClass23_1598 = null;
		aClass30_62 = null;
	}
}
