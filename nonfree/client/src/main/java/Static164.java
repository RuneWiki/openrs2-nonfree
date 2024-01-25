import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static164 {

	@OriginalMember(owner = "client!hw", name = "o", descriptor = "[[B")
	public static byte[][] aByteArrayArray27;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "Lclient!o;")
	public static Class80 aClass80_9;

	@OriginalMember(owner = "client!hw", name = "r", descriptor = "F")
	public static float aFloat67;

	@OriginalMember(owner = "client!hw", name = "n", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray5 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!hw", name = "q", descriptor = "[I")
	public static final int[] anIntArray417 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

	@OriginalMember(owner = "client!hw", name = "c", descriptor = "(I)V")
	public static void method3360() {
		@Pc(9) int local9 = Static125.anInt2573 * 128 + 64;
		@Pc(15) int local15 = Static200.anInt3979 * 128 + 64;
		@Pc(24) int local24 = Static326.method4459(Static96.anInt1983, local9, local15) - Static387.anInt6600;
		if (Static281.anInt6554 < 100) {
			if (local9 > Static80.anInt1679) {
				Static80.anInt1679 += Static300.anInt5179 + (local9 - Static80.anInt1679) * Static281.anInt6554 / 1000;
				if (Static80.anInt1679 > local9) {
					Static80.anInt1679 = local9;
				}
			}
			if (Static80.anInt1679 > local9) {
				Static80.anInt1679 -= (Static80.anInt1679 - local9) * Static281.anInt6554 / 1000 + Static300.anInt5179;
				if (Static80.anInt1679 < local9) {
					Static80.anInt1679 = local9;
				}
			}
			if (Static8.anInt121 < local24) {
				Static8.anInt121 += Static281.anInt6554 * (local24 - Static8.anInt121) / 1000 + Static300.anInt5179;
				if (local24 < Static8.anInt121) {
					Static8.anInt121 = local24;
				}
			}
			if (Static50.anInt906 < local15) {
				Static50.anInt906 += Static281.anInt6554 * (local15 - Static50.anInt906) / 1000 + Static300.anInt5179;
				if (local15 < Static50.anInt906) {
					Static50.anInt906 = local15;
				}
			}
			if (Static8.anInt121 > local24) {
				Static8.anInt121 -= Static300.anInt5179 + (Static8.anInt121 - local24) * Static281.anInt6554 / 1000;
				if (local24 > Static8.anInt121) {
					Static8.anInt121 = local24;
				}
			}
			if (local15 < Static50.anInt906) {
				Static50.anInt906 -= Static281.anInt6554 * (Static50.anInt906 - local15) / 1000 + Static300.anInt5179;
				if (Static50.anInt906 < local15) {
					Static50.anInt906 = local15;
				}
			}
		} else {
			Static80.anInt1679 = Static125.anInt2573 * 128 + 64;
			Static50.anInt906 = Static200.anInt3979 * 128 + 64;
			Static8.anInt121 = Static326.method4459(Static96.anInt1983, Static80.anInt1679, Static50.anInt906) - Static387.anInt6600;
		}
		local15 = Static284.anInt4989 * 128 + 64;
		local9 = Static55.anInt1001 * 128 + 64;
		local24 = Static326.method4459(Static96.anInt1983, local9, local15) - Static448.anInt6973;
		@Pc(221) int local221 = local9 - Static80.anInt1679;
		@Pc(231) int local231 = local24 - Static8.anInt121;
		@Pc(236) int local236 = local15 - Static50.anInt906;
		@Pc(248) int local248 = (int) Math.sqrt((double) (local221 * local221 + local236 * local236));
		@Pc(259) int local259 = (int) (Math.atan2((double) local231, (double) local248) * 2607.5945876176133D) & 0x3FFF;
		@Pc(270) int local270 = (int) (Math.atan2((double) local221, (double) local236) * -2607.5945876176133D) & 0x3FFF;
		if (local259 < 1024) {
			local259 = 1024;
		}
		if (local259 > 3072) {
			local259 = 3072;
		}
		if (Static127.anInt2604 < local259) {
			Static127.anInt2604 += (local259 - Static127.anInt2604 >> 3) * Static336.anInt5676 / 1000 + Static169.anInt3383 << 3;
			if (local259 < Static127.anInt2604) {
				Static127.anInt2604 = local259;
			}
		}
		if (local259 < Static127.anInt2604) {
			Static127.anInt2604 -= Static336.anInt5676 * (Static127.anInt2604 - local259 >> 3) / 1000 + Static169.anInt3383 << 3;
			if (Static127.anInt2604 < local259) {
				Static127.anInt2604 = local259;
			}
		}
		@Pc(351) int local351 = local270 - Static362.anInt6155;
		if (local351 > 8192) {
			local351 -= 16384;
		}
		if (local351 < -8192) {
			local351 += 16384;
		}
		local351 >>= 0x3;
		if (local351 > 0) {
			Static362.anInt6155 += Static169.anInt3383 + local351 * Static336.anInt5676 / 1000 << 3;
			Static362.anInt6155 &= 0x3FFF;
		}
		if (local351 < 0) {
			Static362.anInt6155 -= Static169.anInt3383 + -local351 * Static336.anInt5676 / 1000 << 3;
			Static362.anInt6155 &= 0x3FFF;
		}
		@Pc(406) int local406 = local270 - Static362.anInt6155;
		if (local406 > 8192) {
			local406 -= 16384;
		}
		if (local406 < -8192) {
			local406 += 16384;
		}
		if (local406 < 0 && local351 > 0 || local406 > 0 && local351 < 0) {
			Static362.anInt6155 = local270;
		}
		Static242.anInt5735 = 0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IIIIIII)V")
	public static void method3362(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		if (arg5 - arg3 >= Static115.anInt2362 && arg5 + arg3 <= Static146.anInt3034 && Static319.anInt5496 <= arg4 - arg3 && arg4 + arg3 <= Static160.anInt3220) {
			Static10.method120(arg0, arg4, arg5, arg3, arg2, arg1);
		} else {
			Static387.method5176(arg5, arg4, arg2, arg0, arg1, arg3);
		}
	}
}
