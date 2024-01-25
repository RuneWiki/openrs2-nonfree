import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!ji", name = "B", descriptor = "Lclient!kr;")
	public static Class204 aClass204_3;

	@OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
	public static int anInt5012 = 0;

	@OriginalMember(owner = "client!ji", name = "a", descriptor = "(BII)V")
	public static void method4404(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(15) int local15;
		if (arg1 != Static395.anInt6816) {
			Static20.anIntArray40 = new int[arg1];
			for (local15 = 0; local15 < arg1; local15++) {
				Static20.anIntArray40[local15] = (local15 << 12) / arg1;
			}
			Static276.anInt8845 = arg1 * 32;
			Static104.anInt2340 = arg1 - 1;
			Static395.anInt6816 = arg1;
		}
		if (arg0 == Static118.anInt2485) {
			return;
		}
		if (arg0 == Static395.anInt6816) {
			Static415.anIntArray482 = Static20.anIntArray40;
		} else {
			Static415.anIntArray482 = new int[arg0];
			for (local15 = 0; local15 < arg0; local15++) {
				Static415.anIntArray482[local15] = (local15 << 12) / arg0;
			}
		}
		Static463.anInt7489 = arg0 - 1;
		Static118.anInt2485 = arg0;
	}
}
