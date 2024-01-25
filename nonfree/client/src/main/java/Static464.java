import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static464 {

	@OriginalMember(owner = "client!qo", name = "d", descriptor = "Lclient!hu;")
	public static Class21 aClass21_28;

	@OriginalMember(owner = "client!qo", name = "g", descriptor = "[B")
	public static byte[] aByteArray78;

	@OriginalMember(owner = "client!qo", name = "h", descriptor = "I")
	public static int anInt8444;

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
	public static int anInt8440 = -1;

	@OriginalMember(owner = "client!qo", name = "b", descriptor = "[I")
	public static final int[] anIntArray453 = new int[32];

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
	public static void method6970() {
		for (@Pc(10) Class8_Sub44 local10 = (Class8_Sub44) Static41.aClass43_12.method1422(); local10 != null; local10 = (Class8_Sub44) Static41.aClass43_12.method1426()) {
			if (local10.anInt9151 > 0) {
				local10.anInt9151--;
			}
			if (local10.anInt9151 != 0) {
				if (local10.anInt9143 > 0) {
					local10.anInt9143--;
				}
				if (local10.anInt9143 == 0 && local10.anInt9146 >= 1 && local10.anInt9150 >= 1 && Static372.anInt7082 - 2 >= local10.anInt9146 && Static218.anInt5023 - 2 >= local10.anInt9150 && (local10.anInt9155 < 0 || Static465.method6984(local10.anInt9155, local10.anInt9152))) {
					Static528.method7472(local10.anInt9146, local10.anInt9150, local10.anInt9149, local10.anInt9152, local10.anInt9154, -1, local10.anInt9148, local10.anInt9155);
					local10.anInt9143 = -1;
					if (local10.anInt9155 == local10.anInt9144 && local10.anInt9144 == -1) {
						local10.method8640();
					} else if (local10.anInt9155 == local10.anInt9144 && local10.anInt9153 == local10.anInt9154 && local10.anInt9156 == local10.anInt9152) {
						local10.method8640();
					}
				}
			} else if (local10.anInt9144 < 0 || Static465.method6984(local10.anInt9144, local10.anInt9156)) {
				Static528.method7472(local10.anInt9146, local10.anInt9150, local10.anInt9149, local10.anInt9156, local10.anInt9153, -1, local10.anInt9148, local10.anInt9144);
				local10.method8640();
			}
		}
	}

	@OriginalMember(owner = "client!qo", name = "a", descriptor = "(IIIIII)V")
	public static void method6971(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg4;
		@Pc(13) int local13 = arg3 * arg3;
		@Pc(17) int local17 = arg4 * arg4;
		@Pc(21) int local21 = local17 << 1;
		@Pc(25) int local25 = local13 << 1;
		@Pc(29) int local29 = arg4 << 1;
		@Pc(37) int local37 = local21 + (1 - local29) * local13;
		@Pc(45) int local45 = local17 - local25 * (local29 - 1);
		@Pc(49) int local49 = local13 << 2;
		@Pc(53) int local53 = local17 << 2;
		@Pc(61) int local61 = local21 * 3;
		@Pc(69) int local69 = ((arg4 << 1) - 3) * local25;
		@Pc(75) int local75 = local53;
		Static36.method1264(Static632.anIntArrayArray65[arg1], arg2 - arg3, arg0, arg2 + arg3);
		@Pc(93) int local93 = (arg4 - 1) * local49;
		while (local9 > 0) {
			if (local37 < 0) {
				while (local37 < 0) {
					local45 += local75;
					local37 += local61;
					local75 += local53;
					local7++;
					local61 += local53;
				}
			}
			if (local45 < 0) {
				local45 += local75;
				local37 += local61;
				local7++;
				local75 += local53;
				local61 += local53;
			}
			local37 += -local93;
			local45 += -local69;
			local93 -= local49;
			local9--;
			local69 -= local49;
			@Pc(172) int local172 = arg1 - local9;
			@Pc(176) int local176 = local9 + arg1;
			@Pc(180) int local180 = local7 + arg2;
			@Pc(185) int local185 = arg2 - local7;
			Static36.method1264(Static632.anIntArrayArray65[local172], local185, arg0, local180);
			Static36.method1264(Static632.anIntArrayArray65[local176], local185, arg0, local180);
		}
	}
}
