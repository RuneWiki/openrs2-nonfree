import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static243 {

	@OriginalMember(owner = "client!lv", name = "k", descriptor = "[I")
	public static int[] anIntArray443;

	@OriginalMember(owner = "client!lv", name = "n", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_107 = new Class263(112, -2);

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(B)V")
	public static void method3641() {
		Static336.anInt6157 = 0;
		Static57.anInt1519 = -1;
		Static270.anInt5251 = -1;
		Static348.anInt6432 = -1;
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(JI)V")
	public static void method3643(@OriginalArg(0) long arg0) {
		@Pc(10) int local10 = Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7490 + Static436.anInt7703;
		@Pc(15) int local15 = Static383.anInt6965 + Static429.aClass30_Sub1_Sub1_Sub2_2.anInt7488;
		if (Static162.anInt3418 - local10 < -500 || Static162.anInt3418 - local10 > 500 || Static323.anInt5976 - local15 < -500 || Static323.anInt5976 - local15 > 500) {
			Static323.anInt5976 = local15;
			Static162.anInt3418 = local10;
		}
		@Pc(60) int local60;
		@Pc(68) int local68;
		if (local10 != Static162.anInt3418) {
			local60 = local10 - Static162.anInt3418;
			local68 = (int) ((long) local60 * arg0 / 320L);
			if (local60 <= 0) {
				if (local68 == 0) {
					local68 = -1;
				} else if (local68 < local60) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = 1;
			} else if (local60 < local68) {
				local68 = local60;
			}
			Static162.anInt3418 += local68;
		}
		if (!Static12.aClass34_Sub1_1.aBoolean454) {
			Static26.aFloat5 += (float) arg0 * Static191.aFloat61 / 6.0F;
			Static267.aFloat83 += Static214.aFloat101 * (float) arg0 / 6.0F;
		}
		if (local15 != Static323.anInt5976) {
			local60 = local15 - Static323.anInt5976;
			local68 = (int) (arg0 * (long) local60 / 320L);
			if (local60 > 0) {
				if (local68 == 0) {
					local68 = 1;
				} else if (local68 > local60) {
					local68 = local60;
				}
			} else if (local68 == 0) {
				local68 = -1;
			} else if (local60 > local68) {
				local68 = local60;
			}
			Static323.anInt5976 += local68;
		}
		Static208.method3584();
	}

	@OriginalMember(owner = "client!lv", name = "a", descriptor = "(IIIB)I")
	public static int method3645(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == arg1) {
			return arg1;
		}
		@Pc(17) int local17 = 128 - arg0;
		@Pc(32) int local32 = local17 * (arg1 & 0x7F) + (arg2 & 0x7F) * arg0 >> 7;
		@Pc(46) int local46 = (arg2 & 0x380) * arg0 + local17 * (arg1 & 0x380) >> 7;
		@Pc(60) int local60 = (arg2 & 0xFC00) * arg0 + local17 * (arg1 & 0xFC00) >> 7;
		return local32 & 0x7F | local60 & 0xFC00 | local46 & 0x380;
	}
}
