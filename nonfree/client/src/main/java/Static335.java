import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static335 {

	@OriginalMember(owner = "client!oaa", name = "f", descriptor = "Lclient!ada;")
	public static final Class6 aClass6_102 = new Class6(59, -2);

	@OriginalMember(owner = "client!oaa", name = "g", descriptor = "Lclient!gf;")
	public static final Class102 aClass102_3 = new Class102();

	@OriginalMember(owner = "client!oaa", name = "a", descriptor = "(IJ)V")
	public static void method5458(@OriginalArg(1) long arg0) {
		@Pc(8) int local8 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8189 + Static186.anInt3940;
		@Pc(14) int local14 = Static16.aClass47_Sub2_Sub3_Sub2_1.anInt8191 + Static403.anInt8578;
		if (Static126.anInt3030 - local8 < -500 || Static126.anInt3030 - local8 > 500 || Static180.anInt3880 - local14 < -500 || Static180.anInt3880 - local14 > 500) {
			Static126.anInt3030 = local8;
			Static180.anInt3880 = local14;
		}
		@Pc(52) int local52;
		@Pc(60) int local60;
		if (Static126.anInt3030 != local8) {
			local52 = local8 - Static126.anInt3030;
			local60 = (int) ((long) local52 * arg0 / 320L);
			if (local52 > 0) {
				if (local60 == 0) {
					local60 = 1;
				} else if (local52 < local60) {
					local60 = local52;
				}
			} else if (local60 == 0) {
				local60 = -1;
			} else if (local60 < local52) {
				local60 = local52;
			}
			Static126.anInt3030 += local60;
		}
		if (!Static89.aClass1_Sub28_Sub1_1.aBoolean324) {
			Static443.aFloat151 += (float) arg0 * Static28.aFloat50 / 6.0F;
			Static362.aFloat128 += Static404.aFloat203 * (float) arg0 / 6.0F;
		}
		if (Static180.anInt3880 != local14) {
			local52 = local14 - Static180.anInt3880;
			local60 = (int) (arg0 * (long) local52 / 320L);
			if (local52 <= 0) {
				if (local60 == 0) {
					local60 = -1;
				} else if (local52 > local60) {
					local60 = local52;
				}
			} else if (local60 == 0) {
				local60 = 1;
			} else if (local60 > local52) {
				local60 = local52;
			}
			Static180.anInt3880 += local60;
		}
		Static15.method801();
	}
}
