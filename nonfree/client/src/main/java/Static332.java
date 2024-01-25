import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static332 {

	@OriginalMember(owner = "client!mo", name = "W", descriptor = "Lclient!pu;")
	public static Class270 aClass270_88;

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(JI)V")
	public static void method5753(@OriginalArg(0) long arg0) {
		@Pc(12) int local12 = Static177.anInt3135;
		@Pc(14) int local14 = Static308.anInt5286;
		@Pc(26) int local26;
		@Pc(34) int local34;
		if (local12 != Static417.anInt7669) {
			local26 = local12 - Static417.anInt7669;
			local34 = (int) (arg0 * (long) local26 / 320L);
			if (local26 <= 0) {
				if (local34 == 0) {
					local34 = -1;
				} else if (local26 > local34) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = 1;
			} else if (local34 > local26) {
				local34 = local26;
			}
			Static417.anInt7669 += local34;
		}
		if (!Static348.aClass1_Sub30_Sub1_1.aBoolean383) {
			Static287.aFloat117 += Static85.aFloat17 * (float) arg0 / 40.0F * 8.0F;
			Static167.aFloat59 += Static333.aFloat127 * (float) arg0 / 40.0F * 8.0F;
		}
		if (Static301.anInt5198 != local14) {
			local26 = local14 - Static301.anInt5198;
			local34 = (int) ((long) local26 * arg0 / 320L);
			if (local26 > 0) {
				if (local34 == 0) {
					local34 = 1;
				} else if (local34 > local26) {
					local34 = local26;
				}
			} else if (local34 == 0) {
				local34 = -1;
			} else if (local34 < local26) {
				local34 = local26;
			}
			Static301.anInt5198 += local34;
		}
		Static25.method281();
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lclient!r;IZI)Lclient!la;")
	public static Class64 method5788(@OriginalArg(0) Class134 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(9) Class110 local9 = Static410.method5649(arg0, arg2, arg1);
		return local9 == null ? null : local9.aClass64_5;
	}

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)Z")
	public static boolean method5799(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x100) != 0;
	}
}
