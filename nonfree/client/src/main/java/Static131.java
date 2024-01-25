import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static131 {

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "Z")
	public static boolean aBoolean469 = false;

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(B)I")
	public static int method5612() {
		if (Static421.aFrame2 == null) {
			return Static123.aBoolean119 ? 2 : 1;
		} else {
			return 3;
		}
	}

	@OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V")
	public static void method5613() {
		Static269.aClass109_9.V(Static187.anInt4911, Static389.aClass128_Sub1_1.aBoolean229 ? Static452.anInt7813 + 256 << 0 : -1, 256);
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(JI)V")
	public static void method5614(@OriginalArg(0) long arg0) {
		@Pc(7) int local7 = Static356.anInt6062;
		@Pc(9) int local9 = Static57.anInt1180;
		@Pc(21) int local21;
		@Pc(29) int local29;
		if (local7 != Static220.anInt3977) {
			local21 = local7 - Static220.anInt3977;
			local29 = (int) (arg0 * (long) local21 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local29 < local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local21 < local29) {
				local29 = local21;
			}
			Static220.anInt3977 += local29;
		}
		if (Static202.anInt3669 != local9) {
			local21 = local9 - Static202.anInt3669;
			local29 = (int) ((long) local21 * arg0 / 320L);
			if (local21 <= 0) {
				if (local29 == 0) {
					local29 = -1;
				} else if (local29 < local21) {
					local29 = local21;
				}
			} else if (local29 == 0) {
				local29 = 1;
			} else if (local21 < local29) {
				local29 = local21;
			}
			Static202.anInt3669 += local29;
		}
		if (!Static389.aClass128_Sub1_1.aBoolean233) {
			Static144.aFloat36 += (float) arg0 * Static8.aFloat3 / 40.0F * 8.0F;
			Static274.aFloat78 += Static107.aFloat33 * (float) arg0 / 40.0F * 8.0F;
		}
		Static449.method6007();
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(Lclient!qa;IZI)V")
	public static void method5615(@OriginalArg(0) Class109 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		Static150.aClass33ArrayArray1 = new Class33[arg2][arg1];
		Static269.aClass109_9 = arg0;
		if (Static227.anIntArray332 != null) {
			Static33.aClass78_1 = Static77.method1345(Static227.anIntArray332[5], Static227.anIntArray332[4], Static227.anIntArray332[1], Static227.anIntArray332[0], Static227.anIntArray332[2], Static227.anIntArray332[3]);
		}
		Static303.aClass33_2 = new Class33();
		Static336.method4677();
	}
}
