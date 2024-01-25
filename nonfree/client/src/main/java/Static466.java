import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static466 {

	@OriginalMember(owner = "client!si", name = "d", descriptor = "Lclient!pq;")
	public static Class251 aClass251_130;

	@OriginalMember(owner = "client!si", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray27;

	@OriginalMember(owner = "client!si", name = "n", descriptor = "[S")
	public static short[] aShortArray135;

	@OriginalMember(owner = "client!si", name = "p", descriptor = "I")
	public static int anInt7907;

	@OriginalMember(owner = "client!si", name = "c", descriptor = "Lclient!rh;")
	public static final Class275 aClass275_168 = new Class275();

	@OriginalMember(owner = "client!si", name = "g", descriptor = "Z")
	public static boolean aBoolean539 = false;

	@OriginalMember(owner = "client!si", name = "h", descriptor = "I")
	public static final int anInt7902 = 4;

	@OriginalMember(owner = "client!si", name = "o", descriptor = "Lclient!nl;")
	public static final Class214 aClass214_13 = new Class214(1);

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(Lclient!pq;I)V")
	public static void method6529(@OriginalArg(0) Class251 arg0) {
		Static553.anInt9290 = 0;
		Static199.anInt3446 = 0;
		Static430.aClass249_5 = new Class249();
		Static326.aClass102_Sub1_Sub1_Sub1Array1 = new Class102_Sub1_Sub1_Sub1[1024];
		Static450.aClass102_Sub6Array1 = new Class102_Sub6[Static25.anIntArray37[Static353.anInt6214] + 1];
		Static303.anInt4926 = 0;
		Static58.anInt957 = 0;
		Static52.method687(arg0);
		Static187.method2781(arg0);
	}

	@OriginalMember(owner = "client!si", name = "a", descriptor = "(BJ)V")
	public static void method6530(@OriginalArg(1) long arg0) {
		@Pc(15) int local15 = Static343.anInt6094 + Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9222;
		@Pc(20) int local20 = Static316.anInt5715 + Static426.aClass29_Sub2_Sub1_Sub2_2.anInt9218;
		if (Static141.anInt2539 - local15 < -2000 || Static141.anInt2539 - local15 > 2000 || Static285.anInt4695 - local20 < -2000 || Static285.anInt4695 - local20 > 2000) {
			Static141.anInt2539 = local15;
			Static285.anInt4695 = local20;
		}
		@Pc(63) int local63;
		@Pc(71) int local71;
		if (Static141.anInt2539 != local15) {
			local63 = local15 - Static141.anInt2539;
			local71 = (int) (arg0 * (long) local63 / 320L);
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
			Static141.anInt2539 += local71;
		}
		if (Static285.anInt4695 != local20) {
			local63 = local20 - Static285.anInt4695;
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
			Static285.anInt4695 += local71;
		}
		if (!Static480.aClass6_Sub37_Sub1_1.aBoolean412) {
			Static399.aFloat167 += (float) arg0 * Static274.aFloat47 / 6.0F;
			Static475.aFloat174 += Static212.aFloat48 * (float) arg0 / 6.0F;
		}
		Static318.method4939();
	}
}
