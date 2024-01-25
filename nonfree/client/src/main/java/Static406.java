import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static406 {

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "Lclient!qia;")
	public static final Class276 aClass276_47 = new Class276();

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(IIILclient!pg;)V")
	public static void method6409(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class260 arg2) {
		Static165.aClass260ArrayArray1[arg0][arg1] = arg2;
	}

	@OriginalMember(owner = "client!oj", name = "a", descriptor = "(JI)V")
	public static void method6411(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10428 + Static183.anInt4350;
		@Pc(18) int local18 = Static64.anInt9910 + Static336.aClass2_Sub3_Sub1_Sub2_Sub2_2.anInt10424;
		if (Static242.anInt5467 - local10 < -2000 || Static242.anInt5467 - local10 > 2000 || Static77.anInt3996 - local18 < -2000 || Static77.anInt3996 - local18 > 2000) {
			Static77.anInt3996 = local18;
			Static242.anInt5467 = local10;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (local10 != Static242.anInt5467) {
			local63 = local10 - Static242.anInt5467;
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
			Static242.anInt5467 += local71;
		}
		if (Static77.anInt3996 != local18) {
			local63 = local18 - Static77.anInt3996;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local63 < local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local71 < local63) {
				local71 = local63;
			}
			Static77.anInt3996 += local71;
		}
		Static103.aFloat96 += Static550.aFloat251 * (float) arg0 / 6.0F;
		Static502.aFloat230 += Static611.aFloat276 * (float) arg0 / 6.0F;
		Static522.method7469();
	}
}
