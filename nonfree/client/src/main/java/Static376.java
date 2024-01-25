import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static376 {

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(I)V")
	public static void method5110() {
		if (!Static558.aBoolean576) {
			Static96.aBoolean732 = true;
			Static558.aBoolean576 = true;
			Static522.aFloat127 += (-12.0F - Static522.aFloat127) / 2.0F;
		}
	}

	@OriginalMember(owner = "client!li", name = "a", descriptor = "(IZZIIII)V")
	public static void method5111(@OriginalArg(0) int arg0, @OriginalArg(3) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4) {
		if (arg2 < 512 || arg4 < 512 || arg2 > (Static497.anInt7926 - 2) * 512 || arg4 > Static646.anInt9979 * 512 - 1024) {
			Static143.anIntArray165[0] = Static143.anIntArray165[1] = -1;
			return;
		}
		@Pc(54) int local54 = Static77.method1633(arg4, arg2, arg3) - arg0;
		if (Static347.aBoolean360) {
			Static304.method4501(true);
		} else {
			Static158.aClass58_1.method9509(arg1, 0, 0);
			Static153.aClass22_4.method9405(Static158.aClass58_1);
		}
		if (Static444.aBoolean451) {
			Static153.aClass22_4.HA(arg2, local54, arg4, Static668.anInt10260, Static143.anIntArray165);
		} else {
			Static153.aClass22_4.da(arg2, local54, arg4, Static143.anIntArray165);
		}
		if (Static347.aBoolean360) {
			Static440.method5852();
		} else {
			Static158.aClass58_1.method9509(-arg1, 0, 0);
			Static153.aClass22_4.method9405(Static158.aClass58_1);
		}
	}
}
