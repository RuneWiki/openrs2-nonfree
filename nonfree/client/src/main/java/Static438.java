import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static438 {

	@OriginalMember(owner = "client!vr", name = "q", descriptor = "Lclient!cg;")
	public static final Class37 aClass37_19 = new Class37(12, 0, 1, 0);

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!za;I)V")
	public static void method5919(@OriginalArg(0) Class75 arg0) {
		if (Static336.aClass181_31.method3963() == 0) {
			return;
		}
		@Pc(20) Class2_Sub25 local20;
		if (Static404.anInt2752 == 0) {
			for (local20 = (Class2_Sub25) Static336.aClass181_31.method3972(); local20 != null; local20 = (Class2_Sub25) Static336.aClass181_31.method3975()) {
				Static413.aClass271_2.method6197(local20.aBoolean256 ? Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1 : null, local20.anInt3823, Static352.aClass14_3, local20.anInt3822, arg0, false, arg0, local20.anInt3820, false, local20.anInt3825, local20.anInt3826);
				local20.method6260();
			}
			Static323.method4576();
			return;
		}
		if (Static147.aClass75_7 == null) {
			@Pc(67) Canvas local67 = new Canvas();
			local67.setSize(36, 32);
			Static147.aClass75_7 = Static465.method6008(Static396.anInterface7_6, local67, 0, 0, Static138.aClass194_2);
			Static417.aClass14_4 = Static147.aClass75_7.method5977(Static457.method6198(Static336.aClass171_71, Static139.anInt2567), Static470.method4237(Static446.aClass171_101, Static139.anInt2567));
		}
		for (local20 = (Class2_Sub25) Static336.aClass181_31.method3972(); local20 != null; local20 = (Class2_Sub25) Static336.aClass181_31.method3975()) {
			Static413.aClass271_2.method6197(local20.aBoolean256 ? Static127.aClass11_Sub5_Sub2_Sub1_2.aClass26_1 : null, local20.anInt3823, Static417.aClass14_4, local20.anInt3822, Static147.aClass75_7, false, arg0, local20.anInt3820, false, local20.anInt3825, local20.anInt3826);
			local20.method6260();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(IJ)V")
	public static void method5920(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static255.anInt4459 + Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7626;
		@Pc(15) int local15 = Static127.aClass11_Sub5_Sub2_Sub1_2.anInt7622 + Static113.anInt1913;
		if (Static82.anInt3899 - local10 < -500 || Static82.anInt3899 - local10 > 500 || Static184.anInt3246 - local15 < -500 || Static184.anInt3246 - local15 > 500) {
			Static82.anInt3899 = local10;
			Static184.anInt3246 = local15;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (Static82.anInt3899 != local10) {
			local63 = local10 - Static82.anInt3899;
			local71 = (int) (arg0 * (long) local63 / 320L);
			if (local63 > 0) {
				if (local71 == 0) {
					local71 = 1;
				} else if (local63 < local71) {
					local71 = local63;
				}
			} else if (local71 == 0) {
				local71 = -1;
			} else if (local63 > local71) {
				local71 = local63;
			}
			Static82.anInt3899 += local71;
		}
		if (!Static434.aClass165_Sub1_1.aBoolean290) {
			Static37.aFloat9 += Static417.aFloat93 * (float) arg0 / 6.0F;
			Static234.aFloat30 += Static104.aFloat13 * (float) arg0 / 6.0F;
		}
		if (Static184.anInt3246 != local15) {
			local63 = local15 - Static184.anInt3246;
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
			Static184.anInt3246 += local71;
		}
		Static193.method2765();
	}
}
