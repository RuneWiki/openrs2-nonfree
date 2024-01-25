import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static546 {

	@OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
	public static int anInt9319;

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "Lclient!oo;")
	public static final Class264 aClass264_55 = new Class264(8);

	@OriginalMember(owner = "client!sj", name = "j", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray20 = new int[2][][];

	@OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIB)V")
	public static void method7698(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		Static503.anInt8861 = arg0;
		Static496.anInt8827 = arg1;
		if (Static453.anInt7941 == 0) {
			Static608.anInt10279 = Static496.anInt8827 + Static599.anInt6159 * 2;
			Static497.anInt10443 = Static568.anInt9807 * 2 + Static503.anInt8861;
		} else if (Static453.anInt7941 == 1) {
			Static347.anInt6424 = Static323.anInt6125 + Static503.anInt8861 / Static465.anInt8179 + 2;
			Static174.anInt10833 = Static496.anInt8827 / Static309.anInt1943 + Static539.anInt9255 + 2;
			Static497.anInt10443 = Static347.anInt6424 * Static465.anInt8179;
			Static608.anInt10279 = Static174.anInt10833 * Static309.anInt1943;
			Static599.anInt6159 = Static608.anInt10279 - Static496.anInt8827 >> 1;
			Static568.anInt9807 = Static497.anInt10443 - Static503.anInt8861 >> 1;
		} else if (Static453.anInt7941 == 2) {
			Static497.anInt10443 = Static503.anInt8861;
			Static608.anInt10279 = Static496.anInt8827;
			return;
		}
	}
}
