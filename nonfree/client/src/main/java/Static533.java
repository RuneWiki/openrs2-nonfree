import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static533 {

	@OriginalMember(owner = "client!tb", name = "m", descriptor = "J")
	public static long aLong240;

	@OriginalMember(owner = "client!tb", name = "o", descriptor = "Lclient!oh;")
	public static Class237 aClass237_129;

	@OriginalMember(owner = "client!tb", name = "g", descriptor = "Lclient!dh;")
	public static final Class71 aClass71_128 = new Class71(92, 8);

	@OriginalMember(owner = "client!tb", name = "h", descriptor = "[I")
	public static final int[] anIntArray506 = new int[2048];

	@OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
	public static int anInt9188 = 0;

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(BJ)V")
	public static void method7513(@OriginalArg(1) long arg0) {
		@Pc(10) int local10 = Static291.anInt5939 + Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10301;
		@Pc(15) int local15 = Static598.anInt2012 + Static233.aClass15_Sub1_Sub2_Sub2_Sub1_2.anInt10298;
		if (Static427.anInt8006 - local10 < -2000 || Static427.anInt8006 - local10 > 2000 || Static572.anInt9826 - local15 < -2000 || Static572.anInt9826 - local15 > 2000) {
			Static572.anInt9826 = local15;
			Static427.anInt8006 = local10;
		}
		@Pc(59) int local59;
		@Pc(67) int local67;
		if (Static427.anInt8006 != local10) {
			local59 = local10 - Static427.anInt8006;
			local67 = (int) ((long) local59 * arg0 / 320L);
			if (local59 <= 0) {
				if (local67 == 0) {
					local67 = -1;
				} else if (local67 < local59) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = 1;
			} else if (local67 > local59) {
				local67 = local59;
			}
			Static427.anInt8006 += local67;
		}
		Static64.aFloat44 += Static146.aFloat76 * (float) arg0 / 6.0F;
		if (local15 != Static572.anInt9826) {
			local59 = local15 - Static572.anInt9826;
			local67 = (int) ((long) local59 * arg0 / 320L);
			if (local59 > 0) {
				if (local67 == 0) {
					local67 = 1;
				} else if (local59 < local67) {
					local67 = local59;
				}
			} else if (local67 == 0) {
				local67 = -1;
			} else if (local67 < local59) {
				local67 = local59;
			}
			Static572.anInt9826 += local67;
		}
		Static499.aFloat185 += (float) arg0 * Static462.aFloat183 / 6.0F;
		Static394.method6291();
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!bda;B)V")
	public static void method7515(@OriginalArg(0) Class15_Sub1_Sub2_Sub2 arg0) {
		@Pc(9) boolean local9 = false;
		if (arg0.anInt8124 == Static435.anInt8192 || arg0.anInt8105 == -1 || arg0.anInt8094 != 0) {
			local9 = true;
		} else {
			@Pc(29) Class97 local29 = Static28.aClass220_1.method5670(arg0.anInt8105);
			if (local29.aBoolean263 || local29.anIntArray180[arg0.anInt8063] < arg0.anInt8080 + 1) {
				local9 = true;
			}
		}
		if (local9) {
			@Pc(61) int local61 = arg0.anInt8124 - arg0.anInt8101;
			@Pc(67) int local67 = Static435.anInt8192 - arg0.anInt8101;
			@Pc(78) int local78 = arg0.anInt8128 * 512 + arg0.method6692() * 256;
			@Pc(89) int local89 = arg0.anInt8132 * 512 + arg0.method6692() * 256;
			@Pc(101) int local101 = arg0.anInt8066 * 512 + arg0.method6692() * 256;
			@Pc(113) int local113 = arg0.anInt8048 * 512 + arg0.method6692() * 256;
			arg0.anInt10298 = (local113 * local67 + (local61 - local67) * local89) / local61;
			arg0.anInt10301 = (local78 * (local61 - local67) + local67 * local101) / local61;
		}
		arg0.anInt8138 = 0;
		if (arg0.anInt8084 == 0) {
			arg0.method6683(8192, false);
		}
		if (arg0.anInt8084 == 1) {
			arg0.method6683(12288, false);
		}
		if (arg0.anInt8084 == 2) {
			arg0.method6683(0, false);
		}
		if (arg0.anInt8084 == 3) {
			arg0.method6683(4096, false);
		}
	}
}
