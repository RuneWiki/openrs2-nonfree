import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static199 {

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "Lclient!jp;")
	public static Class134 aClass134_1;

	@OriginalMember(owner = "client!jn", name = "z", descriptor = "[Lclient!f;")
	public static Class80[] aClass80Array5;

	@OriginalMember(owner = "client!jn", name = "A", descriptor = "Lclient!hm;")
	public static Class106 aClass106_2;

	@OriginalMember(owner = "client!jn", name = "s", descriptor = "Lclient!fg;")
	public static final Class84 aClass84_50 = new Class84("purple:", "lila:", "violet:", "roxo:");

	@OriginalMember(owner = "client!jn", name = "u", descriptor = "Lclient!ff;")
	public static final Class83 aClass83_32 = new Class83(4);

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "Lclient!jm;")
	public static final Class131 aClass131_96 = new Class131(47, 15);

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "[I")
	public static int[] anIntArray300 = new int[2];

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "[I")
	public static final int[] anIntArray301 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!jn", name = "C", descriptor = "I")
	public static int anInt3620 = 0;

	@OriginalMember(owner = "client!jn", name = "b", descriptor = "(I)V")
	public static void method3015() {
		Static55.method989(Static254.aClass131_120);
		Static232.aClass1_Sub1_Sub1_2.method4101(Static303.anInt5383);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Z)V")
	public static void method3016() {
		@Pc(9) int local9 = Static91.anInt1741 * 128 + 64;
		@Pc(15) int local15 = Static139.anInt2356 * 128 + 64;
		@Pc(23) int local23 = Static289.method4078(local9, local15, Static152.anInt2600) - Static113.anInt5757;
		if (Static208.anInt3851 < 100) {
			if (local9 > Static306.anInt5497) {
				Static306.anInt5497 += Static265.anInt4783 + (local9 - Static306.anInt5497) * Static208.anInt3851 / 1000;
				if (local9 < Static306.anInt5497) {
					Static306.anInt5497 = local9;
				}
			}
			if (local9 < Static306.anInt5497) {
				Static306.anInt5497 -= Static208.anInt3851 * (Static306.anInt5497 - local9) / 1000 + Static265.anInt4783;
				if (local9 > Static306.anInt5497) {
					Static306.anInt5497 = local9;
				}
			}
			if (Static254.anInt4567 < local23) {
				Static254.anInt4567 += Static208.anInt3851 * (local23 - Static254.anInt4567) / 1000 + Static265.anInt4783;
				if (local23 < Static254.anInt4567) {
					Static254.anInt4567 = local23;
				}
			}
			if (Static254.anInt4567 > local23) {
				Static254.anInt4567 -= Static208.anInt3851 * (Static254.anInt4567 - local23) / 1000 + Static265.anInt4783;
				if (Static254.anInt4567 < local23) {
					Static254.anInt4567 = local23;
				}
			}
			if (Static402.anInt6941 < local15) {
				Static402.anInt6941 += Static265.anInt4783 + Static208.anInt3851 * (local15 - Static402.anInt6941) / 1000;
				if (local15 < Static402.anInt6941) {
					Static402.anInt6941 = local15;
				}
			}
			if (Static402.anInt6941 > local15) {
				Static402.anInt6941 -= Static208.anInt3851 * (Static402.anInt6941 - local15) / 1000 + Static265.anInt4783;
				if (Static402.anInt6941 < local15) {
					Static402.anInt6941 = local15;
				}
			}
		} else {
			Static306.anInt5497 = Static91.anInt1741 * 128 + 64;
			Static402.anInt6941 = Static139.anInt2356 * 128 + 64;
			Static254.anInt4567 = Static289.method4078(Static306.anInt5497, Static402.anInt6941, Static152.anInt2600) - Static113.anInt5757;
		}
		local9 = Static307.anInt5523 * 128 + 64;
		local15 = Static282.anInt4980 * 128 + 64;
		local23 = Static289.method4078(local9, local15, Static152.anInt2600) - Static86.anInt1676;
		@Pc(218) int local218 = local9 - Static306.anInt5497;
		@Pc(223) int local223 = local23 - Static254.anInt4567;
		@Pc(228) int local228 = local15 - Static402.anInt6941;
		@Pc(239) int local239 = (int) Math.sqrt((double) (local228 * local228 + local218 * local218));
		@Pc(250) int local250 = (int) (Math.atan2((double) local223, (double) local239) * 2607.5945876176133D) & 0x3FFF;
		if (local250 < 1024) {
			local250 = 1024;
		}
		@Pc(266) int local266 = (int) (-2607.5945876176133D * Math.atan2((double) local218, (double) local228)) & 0x3FFF;
		if (local250 > 3072) {
			local250 = 3072;
		}
		if (local250 > Static239.anInt4284) {
			Static239.anInt4284 += Static198.anInt3609 + (local250 - Static239.anInt4284 >> 3) * Static132.anInt2279 / 1000 << 3;
			if (local250 < Static239.anInt4284) {
				Static239.anInt4284 = local250;
			}
		}
		if (Static239.anInt4284 > local250) {
			Static239.anInt4284 -= Static132.anInt2279 * (Static239.anInt4284 - local250 >> 3) / 1000 + Static198.anInt3609 << 3;
			if (local250 > Static239.anInt4284) {
				Static239.anInt4284 = local250;
			}
		}
		@Pc(330) int local330 = local266 - Static94.anInt1775;
		if (local330 > 8192) {
			local330 -= 16384;
		}
		if (local330 < -8192) {
			local330 += 16384;
		}
		local330 >>= 0x3;
		if (local330 > 0) {
			Static94.anInt1775 += Static198.anInt3609 + local330 * Static132.anInt2279 / 1000 << 3;
			Static94.anInt1775 &= 0x3FFF;
		}
		if (local330 < 0) {
			Static94.anInt1775 -= Static132.anInt2279 * -local330 / 1000 + Static198.anInt3609 << 3;
			Static94.anInt1775 &= 0x3FFF;
		}
		@Pc(389) int local389 = local266 - Static94.anInt1775;
		if (local389 > 8192) {
			local389 -= 16384;
		}
		if (local389 < -8192) {
			local389 += 16384;
		}
		Static454.anInt7852 = 0;
		if (local389 < 0 && local330 > 0 || local389 > 0 && local330 < 0) {
			Static94.anInt1775 = local266;
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ZIBIZII)V")
	public static void method3017(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg4 >= arg2) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg4) / 2;
		@Pc(16) int local16 = arg4;
		@Pc(20) Class196_Sub1 local20 = Static412.aClass196_Sub1Array2[local14];
		Static412.aClass196_Sub1Array2[local14] = Static412.aClass196_Sub1Array2[arg2];
		Static412.aClass196_Sub1Array2[arg2] = local20;
		for (@Pc(32) int local32 = arg4; local32 < arg2; local32++) {
			if (Static120.method1768(local20, Static412.aClass196_Sub1Array2[local32], arg3, arg0, arg5, arg1) <= 0) {
				@Pc(52) Class196_Sub1 local52 = Static412.aClass196_Sub1Array2[local32];
				Static412.aClass196_Sub1Array2[local32] = Static412.aClass196_Sub1Array2[local16];
				Static412.aClass196_Sub1Array2[local16++] = local52;
			}
		}
		Static412.aClass196_Sub1Array2[arg2] = Static412.aClass196_Sub1Array2[local16];
		Static412.aClass196_Sub1Array2[local16] = local20;
		method3017(arg0, arg1, local16 - 1, arg3, arg4, arg5);
		method3017(arg0, arg1, arg2, arg3, local16 + 1, arg5);
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(IILclient!kj;)I")
	public static int method3018(@OriginalArg(2) Class138 arg0) {
		return -1;
	}
}
