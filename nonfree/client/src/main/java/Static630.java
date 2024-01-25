import org.openrs2.deob.annotation.OriginalMember;

public final class Static630 {

	@OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
	public static int anInt10099 = 0;

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)I")
	public static int method8653() {
		if ((double) Static110.aFloat80 == 3.0D) {
			return 37;
		} else if ((double) Static110.aFloat80 == 4.0D) {
			return 50;
		} else if ((double) Static110.aFloat80 == 6.0D) {
			return 75;
		} else if ((double) Static110.aFloat80 == 8.0D) {
			return 100;
		} else {
			return 200;
		}
	}

	@OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
	public static void method8654() {
		Static566.anInt9413 = (int) ((double) Static634.anInt10129 * 34.46D);
		Static55.anInt1555 = 200;
		Static566.anInt9413 <<= 0x2;
		if (Static323.aClass5_9.method7568()) {
			Static566.anInt9413 += 512;
		}
		Static511.method7629(false);
	}

	@OriginalMember(owner = "client!wi", name = "b", descriptor = "(Z)Z")
	public static boolean method8655() {
		Static591.anInt9687++;
		Static146.aBoolean188 = true;
		return true;
	}
}
