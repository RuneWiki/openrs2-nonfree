import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static49 {

	@OriginalMember(owner = "client!ch", name = "b", descriptor = "I")
	public static int anInt873;

	@OriginalMember(owner = "client!ch", name = "g", descriptor = "I")
	public static int anInt878;

	@OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
	public static int anInt881 = 0;

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILclient!wk;IZ)V")
	public static void method920(@OriginalArg(0) int arg0, @OriginalArg(1) Class1_Sub2_Sub6_Sub2 arg1, @OriginalArg(2) int arg2) {
		if (arg0 == arg1.anInt7612 && arg0 != -1) {
			@Pc(85) Class261 local85 = Static444.aClass59_3.method1552(arg0);
			@Pc(88) int local88 = local85.anInt7421;
			if (local88 == 1) {
				arg1.anInt7597 = 0;
				arg1.anInt7588 = 0;
				arg1.anInt7617 = 1;
				arg1.anInt7624 = arg2;
				arg1.anInt7620 = 0;
				Static192.method3007(local85, arg1.aByte101, arg1.anInt7588, arg1.anInt7560, arg1.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg1);
			}
			if (local88 == 2) {
				arg1.anInt7597 = 0;
			}
		} else if (arg0 == -1 || arg1.anInt7612 == -1 || Static444.aClass59_3.method1552(arg0).anInt7419 >= Static444.aClass59_3.method1552(arg1.anInt7612).anInt7419) {
			arg1.anInt7597 = 0;
			arg1.anInt7620 = 0;
			arg1.anInt7617 = 1;
			arg1.anInt7612 = arg0;
			arg1.anInt7624 = arg2;
			arg1.anInt7588 = 0;
			arg1.anInt7641 = arg1.anInt7644;
			if (arg1.anInt7612 != -1) {
				Static192.method3007(Static444.aClass59_3.method1552(arg1.anInt7612), arg1.aByte101, arg1.anInt7588, arg1.anInt7560, arg1.anInt7557, Static203.aClass1_Sub2_Sub6_Sub2_1 == arg1);
			}
		}
	}

	@OriginalMember(owner = "client!ch", name = "a", descriptor = "(BJ)V")
	public static void method921(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static193.anInt3509 + Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7560;
		@Pc(15) int local15 = Static203.aClass1_Sub2_Sub6_Sub2_1.anInt7557 + Static353.anInt7448;
		if (Static43.anInt5650 - local10 < -500 || Static43.anInt5650 - local10 > 500 || Static32.anInt603 - local15 < -500 || Static32.anInt603 - local15 > 500) {
			Static43.anInt5650 = local10;
			Static32.anInt603 = local15;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (Static43.anInt5650 != local10) {
			local63 = local10 - Static43.anInt5650;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local71 > local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local63 > local71) {
				local71 = local63;
			}
			Static43.anInt5650 += local71;
		}
		if (local15 != Static32.anInt603) {
			local63 = local15 - Static32.anInt603;
			local71 = (int) ((long) local63 * arg0 / 320L);
			if (local63 <= 0) {
				if (local71 == 0) {
					local71 = -1;
				} else if (local71 < local63) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = 1;
			} else if (local71 > local63) {
				local71 = local63;
			}
			Static32.anInt603 += local71;
		}
		if (!Static39.aClass79_Sub1_1.aBoolean160) {
			Static19.aFloat6 += Static292.aFloat84 * (float) arg0 / 6.0F;
			Static275.aFloat61 += Static313.aFloat87 * (float) arg0 / 6.0F;
		}
		Static252.method3554();
	}
}
