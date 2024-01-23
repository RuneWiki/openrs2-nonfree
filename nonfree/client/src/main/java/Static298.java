import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static298 {

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "Lclient!kb;")
	public static Class83 aClass83_204;

	@OriginalMember(owner = "client!wm", name = "b", descriptor = "[I")
	public static int[] anIntArray622;

	@OriginalMember(owner = "client!wm", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray19;

	@OriginalMember(owner = "client!wm", name = "d", descriptor = "[I")
	public static int[] anIntArray623;

	@OriginalMember(owner = "client!wm", name = "f", descriptor = "I")
	public static int anInt6232;

	@OriginalMember(owner = "client!wm", name = "g", descriptor = "Lclient!kb;")
	public static Class83 aClass83_205;

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(Z)Lclient!ag;")
	public static Class7_Sub1 method4851() {
		@Pc(30) Class7_Sub1 local30 = new Class7_Sub1(anInt6232, Static158.anInt3659, anIntArray623[0], Static121.anIntArray257[0], Static166.anIntArray343[0], Static81.anIntArray204[0], Static200.aByteArrayArray83[0], Static167.anIntArray346);
		Static265.method4490();
		return local30;
	}

	@OriginalMember(owner = "client!wm", name = "a", descriptor = "(JB)V")
	public static void method4852(@OriginalArg(0) long arg0) {
		if (!Static205.aBoolean243) {
			Static25.aFloat19 += Static18.aFloat18 * (float) arg0 / 40.0F;
			Static125.aFloat97 += (float) arg0 * Static279.aFloat196 / 40.0F;
		}
		@Pc(32) int local32 = Static239.aClass25_Sub1_Sub1_2.anInt1635 + Static52.anInt1393;
		@Pc(38) int local38 = Static239.aClass25_Sub1_Sub1_2.anInt1604 + Static23.anInt483;
		if (Static148.anInt3505 - local32 < -500 || Static148.anInt3505 - local32 > 500 || Static251.anInt5460 - local38 < -500 || Static251.anInt5460 - local38 > 500) {
			Static148.anInt3505 = local32;
			Static251.anInt5460 = local38;
		}
		@Pc(77) int local77;
		@Pc(85) int local85;
		if (Static148.anInt3505 != local32) {
			local77 = local32 - Static148.anInt3505;
			local85 = (int) (arg0 * (long) local77 / 320L);
			if (local77 > 0) {
				if (local85 == 0) {
					local85 = 1;
				} else if (local85 > local77) {
					local85 = local77;
				}
			} else if (local85 == 0) {
				local85 = -1;
			} else if (local77 > local85) {
				local85 = local77;
			}
			Static148.anInt3505 += local85;
		}
		if (local38 != Static251.anInt5460) {
			local77 = local38 - Static251.anInt5460;
			local85 = (int) (arg0 * (long) local77 / 320L);
			if (local77 > 0) {
				if (local85 == 0) {
					local85 = 1;
				} else if (local85 > local77) {
					local85 = local77;
				}
			} else if (local85 == 0) {
				local85 = -1;
			} else if (local77 > local85) {
				local85 = local77;
			}
			Static251.anInt5460 += local85;
		}
		Static192.method3415();
	}
}
