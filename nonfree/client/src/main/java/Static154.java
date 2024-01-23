import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static154 {

	@OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
	public static int anInt3284;

	@OriginalMember(owner = "client!m", name = "R", descriptor = "J")
	public static long aLong161 = 0L;

	@OriginalMember(owner = "client!m", name = "T", descriptor = "Ljava/lang/String;")
	public static String aString157 = "glow1:";

	@OriginalMember(owner = "client!m", name = "X", descriptor = "[I")
	public static int[] anIntArray233 = new int[256];

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString158 = "red:";

	@OriginalMember(owner = "client!m", name = "e", descriptor = "(B)V")
	public static void method2677() {
		@Pc(4) Class128 local4 = Static165.aClass128_1;
		synchronized (Static165.aClass128_1) {
			Static17.anInt419++;
			Static242.anInt4899 = Static13.anInt336;
			@Pc(23) int local23;
			if (Static70.anInt1540 >= 0) {
				while (Static110.anInt2379 != Static70.anInt1540) {
					local23 = Static271.anIntArray496[Static110.anInt2379];
					Static110.anInt2379 = Static110.anInt2379 + 1 & 0x7F;
					if (local23 >= 0) {
						Static79.aBooleanArray8[local23] = true;
					} else {
						Static79.aBooleanArray8[~local23] = false;
					}
				}
			} else {
				for (local23 = 0; local23 < 112; local23++) {
					Static79.aBooleanArray8[local23] = false;
				}
				Static70.anInt1540 = Static110.anInt2379;
			}
			Static13.anInt336 = Static196.anInt4105;
		}
	}
}
