import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static302 {

	@OriginalMember(owner = "client!lj", name = "m", descriptor = "Lclient!pe;")
	public static Class254 aClass254_86;

	@OriginalMember(owner = "client!lj", name = "l", descriptor = "Lclient!lj;")
	public static final Class200 aClass200_15 = new Class200(4);

	@OriginalMember(owner = "client!lj", name = "h", descriptor = "Lclient!lj;")
	public static final Class200 aClass200_11 = new Class200(1);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "Lclient!lj;")
	public static final Class200 aClass200_8 = new Class200(1);

	@OriginalMember(owner = "client!lj", name = "f", descriptor = "Lclient!lj;")
	public static final Class200 aClass200_9 = new Class200(2);

	@OriginalMember(owner = "client!lj", name = "g", descriptor = "Lclient!lj;")
	public static final Class200 aClass200_10 = new Class200(4);

	@OriginalMember(owner = "client!lj", name = "i", descriptor = "Lclient!lj;")
	public static final Class200 aClass200_12 = new Class200(2);

	@OriginalMember(owner = "client!lj", name = "j", descriptor = "Lclient!lj;")
	public static final Class200 aClass200_13 = new Class200(4);

	@OriginalMember(owner = "client!lj", name = "k", descriptor = "Lclient!lj;")
	public static final Class200 aClass200_14 = new Class200(2);

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lclient!pe;I)V")
	public static void method5016(@OriginalArg(0) Class254 arg0) {
		Static159.anInt3430 = 0;
		Static101.anInt2415 = 0;
		Static388.aClass134_7 = new Class134();
		Static136.aClass55_Sub2_Sub1_Sub1Array1 = new Class55_Sub2_Sub1_Sub1[1024];
		Static550.aClass55_Sub8Array7 = new Class55_Sub8[Static223.anIntArray288[Static95.anInt2313] + 1];
		Static406.anInt8003 = 0;
		Static502.anInt9330 = 0;
		Static133.method2781(arg0);
		Static96.method2107(arg0);
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(JI)V")
	public static void method5017(@OriginalArg(0) long arg0) {
		@Pc(11) int local11 = Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9398 + Static519.anInt9512;
		@Pc(16) int local16 = Static519.anInt9508 + Static443.aClass2_Sub2_Sub1_Sub1_2.anInt9396;
		if (Static189.anInt3761 - local11 < -2000 || Static189.anInt3761 - local11 > 2000 || Static65.anInt1699 - local16 < -2000 || Static65.anInt1699 - local16 > 2000) {
			Static65.anInt1699 = local16;
			Static189.anInt3761 = local11;
		}
		@Pc(62) int local62;
		@Pc(70) int local70;
		if (local11 != Static189.anInt3761) {
			local62 = local11 - Static189.anInt3761;
			local70 = (int) ((long) local62 * arg0 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local62 > local70) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local70 > local62) {
				local70 = local62;
			}
			Static189.anInt3761 += local70;
		}
		if (Static65.anInt1699 != local16) {
			local62 = local16 - Static65.anInt1699;
			local70 = (int) ((long) local62 * arg0 / 320L);
			if (local62 <= 0) {
				if (local70 == 0) {
					local70 = -1;
				} else if (local70 < local62) {
					local70 = local62;
				}
			} else if (local70 == 0) {
				local70 = 1;
			} else if (local62 < local70) {
				local70 = local62;
			}
			Static65.anInt1699 += local70;
		}
		if (!Static455.aClass3_Sub27_Sub1_1.aBoolean390) {
			Static533.aFloat188 += Static297.aFloat119 * (float) arg0 / 6.0F;
			Static170.aFloat181 += Static149.aFloat31 * (float) arg0 / 6.0F;
		}
		Static109.method2281();
	}
}
