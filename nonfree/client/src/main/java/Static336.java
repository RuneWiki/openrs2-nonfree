import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static336 {

	@OriginalMember(owner = "client!vg", name = "b", descriptor = "(Lclient!rg;I)V")
	public static void method5810(@OriginalArg(0) Class5_Sub12 arg0) {
		if (arg0.aByteArray90.length - arg0.anInt5731 < 1) {
			return;
		}
		@Pc(21) int local21 = arg0.method5115();
		if (local21 < 0 || local21 > 1 || arg0.aByteArray90.length - arg0.anInt5731 < 2) {
			return;
		}
		@Pc(45) int local45 = arg0.method5106();
		if (local45 * 6 != arg0.aByteArray90.length - arg0.anInt5731) {
			return;
		}
		while (true) {
			@Pc(65) int local65;
			@Pc(69) int local69;
			do {
				do {
					do {
						if (arg0.anInt5731 >= arg0.aByteArray90.length) {
							return;
						}
						local65 = arg0.method5106();
						local69 = arg0.method5067();
					} while (local65 >= Static234.anIntArray427.length);
				} while (!Static346.aBooleanArray25[local65]);
			} while (Static238.method4230(local65).aChar4 == '1' && (local69 < -1 || local69 > 1));
			Static234.anIntArray427[local65] = local69;
		}
	}
}
