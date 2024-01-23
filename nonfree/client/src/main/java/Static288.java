import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static288 {

	@OriginalMember(owner = "client!um", name = "f", descriptor = "I")
	public static int anInt5154;

	@OriginalMember(owner = "client!um", name = "m", descriptor = "I")
	public static int anInt5161;

	@OriginalMember(owner = "client!um", name = "c", descriptor = "[I")
	public static int[] anIntArray458 = new int[32];

	@OriginalMember(owner = "client!um", name = "n", descriptor = "[I")
	public static int[] anIntArray459 = new int[25];

	@OriginalMember(owner = "client!um", name = "o", descriptor = "[I")
	public static int[] anIntArray460 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(IIZLclient!nk;III)V")
	public static void method4408(@OriginalArg(3) Class121 arg0, @OriginalArg(5) int arg1, @OriginalArg(6) int arg2) {
		Static209.anInt3978 = arg1;
		Static13.aClass121_11 = arg0;
		Static213.anInt4453 = arg2;
		Static190.anInt3615 = 1;
		Static282.anInt5096 = 0;
		Static168.aBoolean223 = false;
		Static111.anInt2293 = 2;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(JZ)V")
	public static void method4409(@OriginalArg(0) long arg0) {
		if (!Static73.aBoolean87) {
			Static278.aFloat154 += (float) arg0 * Static168.aFloat100 / 40.0F;
			Static49.aFloat32 += (float) arg0 * Static85.aFloat56 / 40.0F;
		}
		@Pc(32) int local32 = Static90.aClass15_Sub5_Sub2_2.anInt5559 + Static94.anInt3442;
		@Pc(38) int local38 = Static90.aClass15_Sub5_Sub2_2.anInt5557 + Static95.anInt1922;
		if (Static31.anInt551 - local32 < -500 || Static31.anInt551 - local32 > 500 || Static183.anInt3495 - local38 < -500 || Static183.anInt3495 - local38 > 500) {
			Static31.anInt551 = local32;
			Static183.anInt3495 = local38;
		}
		@Pc(85) int local85;
		@Pc(93) int local93;
		if (Static31.anInt551 != local32) {
			local85 = local32 - Static31.anInt551;
			local93 = (int) ((long) local85 * arg0 / 320L);
			if (local85 > 0) {
				if (local93 == 0) {
					local93 = 1;
				} else if (local85 < local93) {
					local93 = local85;
				}
			} else if (local93 == 0) {
				local93 = -1;
			} else if (local93 < local85) {
				local93 = local85;
			}
			Static31.anInt551 += local93;
		}
		if (Static183.anInt3495 != local38) {
			local85 = local38 - Static183.anInt3495;
			local93 = (int) ((long) local85 * arg0 / 320L);
			if (local85 <= 0) {
				if (local93 == 0) {
					local93 = -1;
				} else if (local93 < local85) {
					local93 = local85;
				}
			} else if (local93 == 0) {
				local93 = 1;
			} else if (local93 > local85) {
				local93 = local85;
			}
			Static183.anInt3495 += local93;
		}
		Static37.method677();
	}
}
