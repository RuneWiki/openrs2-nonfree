import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static212 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "Lclient!kf;")
	public static final Class178 aClass178_7 = new Class178();

	@OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
	public static int anInt3826 = 0;

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "[Lclient!dda;")
	public static Class66[] aClass66Array1 = null;

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IJ)V")
	public static void method3417(@OriginalArg(1) long arg0) {
		@Pc(18) int local18 = Static51.anInt993 + Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9444;
		@Pc(24) int local24 = Static480.aClass41_Sub2_Sub1_Sub4_Sub2_2.anInt9442 + Static159.anInt3275;
		if (Static205.anInt3767 - local18 < -2000 || Static205.anInt3767 - local18 > 2000 || Static18.anInt315 - local24 < -2000 || Static18.anInt315 - local24 > 2000) {
			Static18.anInt315 = local24;
			Static205.anInt3767 = local18;
		}
		@Pc(66) int local66;
		@Pc(74) int local74;
		if (local18 != Static205.anInt3767) {
			local66 = local18 - Static205.anInt3767;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local74 < local66) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local66 < local74) {
				local74 = local66;
			}
			Static205.anInt3767 += local74;
		}
		if (!Static405.aClass3_Sub3_Sub1_1.aBoolean577) {
			Static126.aFloat84 += Static63.aFloat30 * (float) arg0 / 6.0F;
			Static43.aFloat20 += (float) arg0 * Static311.aFloat117 / 6.0F;
		}
		if (Static18.anInt315 != local24) {
			local66 = local24 - Static18.anInt315;
			local74 = (int) ((long) local66 * arg0 / 320L);
			if (local66 <= 0) {
				if (local74 == 0) {
					local74 = -1;
				} else if (local66 > local74) {
					local74 = local66;
				}
			} else if (local74 == 0) {
				local74 = 1;
			} else if (local66 < local74) {
				local74 = local66;
			}
			Static18.anInt315 += local74;
		}
		Static336.method4787();
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ILclient!f;Lclient!ua;ILclient!wp;III)V")
	public static void method3418(@OriginalArg(0) int arg0, @OriginalArg(1) Class14 arg1, @OriginalArg(2) Class81 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class361 arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (arg1 == null) {
			return;
		}
		@Pc(14) int local14;
		if (Static379.anInt6482 == 4) {
			local14 = (int) Static43.aFloat20 & 0x3FFF;
		} else {
			local14 = (int) Static43.aFloat20 + Static244.anInt4328 & 0x3FFF;
		}
		@Pc(35) int local35 = Math.max(arg4.anInt9668 / 2, arg4.anInt9650 / 2) + 10;
		@Pc(43) int local43 = arg5 * arg5 + arg0 * arg0;
		if (local43 > local35 * local35) {
			return;
		}
		@Pc(53) int local53 = Class356.anIntArray597[local14];
		@Pc(65) int local65 = Class356.anIntArray598[local14];
		if (Static379.anInt6482 != 4) {
			local65 = local65 * 256 / (Static41.anInt765 + 256);
			local53 = local53 * 256 / (Static41.anInt765 + 256);
		}
		@Pc(96) int local96 = local65 * arg5 + local53 * arg0 >> 14;
		@Pc(107) int local107 = arg0 * local65 - local53 * arg5 >> 14;
		arg1.method7683(arg3 + arg4.anInt9668 / 2 + local96 - arg1.A() / 2, arg4.anInt9650 / 2 + arg6 + -local107 + -(arg1.ca() / 2), arg2, arg3, arg6);
	}
}
