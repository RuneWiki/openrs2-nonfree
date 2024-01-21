import java.awt.Font;
import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!nh", name = "fb", descriptor = "Z")
	public static boolean aBoolean112;

	@OriginalMember(owner = "client!nh", name = "hb", descriptor = "Ljava/awt/Font;")
	public static Font aFont1;

	@OriginalMember(owner = "client!nh", name = "lb", descriptor = "Lclient!qd;")
	public static Class43_Sub1 aClass43_Sub1_13;

	@OriginalMember(owner = "client!nh", name = "ob", descriptor = "I")
	public static int anInt2711;

	@OriginalMember(owner = "client!nh", name = "pb", descriptor = "[I")
	public static int[] anIntArray424;

	@OriginalMember(owner = "client!nh", name = "qb", descriptor = "Ljava/awt/Image;")
	public static Image anImage3;

	@OriginalMember(owner = "client!nh", name = "bb", descriptor = "Lclient!sg;")
	private static Class77 aClass77_1038 = Static146.method2172("wishes to duel with you)3");

	@OriginalMember(owner = "client!nh", name = "cb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1039 = aClass77_1038;

	@OriginalMember(owner = "client!nh", name = "mb", descriptor = "[J")
	public static long[] aLongArray5 = new long[32];

	@OriginalMember(owner = "client!nh", name = "rb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1040 = Static146.method2172("scrollen:");

	@OriginalMember(owner = "client!nh", name = "sb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1041 = Static146.method2172("(U5");

	@OriginalMember(owner = "client!nh", name = "ub", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1042 = Static146.method2172("auf einer freien Welt zu spielen)3");

	@OriginalMember(owner = "client!nh", name = "wb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1043 = Static146.method2172("Bitte versuchen Sie)1");

	@OriginalMember(owner = "client!nh", name = "yb", descriptor = "Lclient!sg;")
	public static Class77 aClass77_1044 = Static146.method2172("gelb:");

	@OriginalMember(owner = "client!nh", name = "c", descriptor = "(Z)V")
	public static void method1922() {
		anIntArray424 = null;
		aLongArray5 = null;
		aClass77_1042 = null;
		aClass77_1040 = null;
		aClass77_1038 = null;
		aFont1 = null;
		aClass77_1041 = null;
		aClass77_1039 = null;
		aClass43_Sub1_13 = null;
		anImage3 = null;
		aClass77_1043 = null;
		aClass77_1044 = null;
	}

	@OriginalMember(owner = "client!nh", name = "b", descriptor = "(ILclient!qf;)Lclient!qf;")
	public static Class66 method1923(@OriginalArg(1) Class66 arg0) {
		@Pc(13) int local13 = Static37.method745(Static63.method1160(arg0));
		if (local13 == 0) {
			return null;
		}
		for (@Pc(27) int local27 = 0; local27 < local13; local27++) {
			arg0 = Static55.method1034(arg0.anInt3237);
			if (arg0 == null) {
				return null;
			}
		}
		return arg0;
	}

	@OriginalMember(owner = "client!nh", name = "a", descriptor = "(IIIBIIII)V")
	public static void method1924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) int arg6) {
		if (Static40.method798(arg3)) {
			Static24.method520(Static125.aClass66ArrayArray1[arg3], arg2, arg1, -1, arg5, arg6, arg4, arg0);
		}
	}

	@OriginalMember(owner = "client!nh", name = "h", descriptor = "(I)V")
	public static void method1925() {
		@Pc(9) int local9 = Static145.anInt3534 * 128 + 64;
		@Pc(15) int local15 = Static121.anInt2970 * 128 + 64;
		@Pc(24) int local24 = Static161.method2725(local9, Static54.anInt1472, local15) - Static126.anInt2296;
		if (Static7.anInt215 < local9) {
			Static7.anInt215 += Static167.anInt4136 + Static106.anInt2609 * (local9 - Static7.anInt215) / 1000;
			if (Static7.anInt215 > local9) {
				Static7.anInt215 = local9;
			}
		}
		if (local15 > Static121.anInt2979) {
			Static121.anInt2979 += Static106.anInt2609 * (local15 - Static121.anInt2979) / 1000 + Static167.anInt4136;
			if (local15 < Static121.anInt2979) {
				Static121.anInt2979 = local15;
			}
		}
		if (local15 < Static121.anInt2979) {
			Static121.anInt2979 -= (Static121.anInt2979 - local15) * Static106.anInt2609 / 1000 + Static167.anInt4136;
			if (Static121.anInt2979 < local15) {
				Static121.anInt2979 = local15;
			}
		}
		if (Static160.anInt4578 < local24) {
			Static160.anInt4578 += Static167.anInt4136 + Static106.anInt2609 * (local24 - Static160.anInt4578) / 1000;
			if (local24 < Static160.anInt4578) {
				Static160.anInt4578 = local24;
			}
		}
		if (local24 < Static160.anInt4578) {
			Static160.anInt4578 -= Static106.anInt2609 * (Static160.anInt4578 - local24) / 1000 + Static167.anInt4136;
			if (Static160.anInt4578 < local24) {
				Static160.anInt4578 = local24;
			}
		}
		local15 = Static172.anInt4335 * 128 + 64;
		if (local9 < Static7.anInt215) {
			Static7.anInt215 -= Static167.anInt4136 + Static106.anInt2609 * (Static7.anInt215 - local9) / 1000;
			if (local9 > Static7.anInt215) {
				Static7.anInt215 = local9;
			}
		}
		local9 = Static46.anInt1219 * 128 + 64;
		local24 = Static161.method2725(local9, Static54.anInt1472, local15) - Static153.anInt3782;
		@Pc(202) int local202 = local9 - Static7.anInt215;
		@Pc(212) int local212 = local15 - Static121.anInt2979;
		@Pc(216) int local216 = local24 - Static160.anInt4578;
		@Pc(227) int local227 = (int) Math.sqrt((double) (local202 * local202 + local212 * local212));
		@Pc(238) int local238 = (int) (Math.atan2((double) local216, (double) local227) * 325.949D) & 0x7FF;
		if (local238 < 128) {
			local238 = 128;
		}
		@Pc(254) int local254 = (int) (Math.atan2((double) local202, (double) local212) * -325.949D) & 0x7FF;
		if (local238 > 383) {
			local238 = 383;
		}
		if (local238 > Static130.anInt3165) {
			Static130.anInt3165 += Static137.anInt3304 + Static98.anInt2480 * (local238 - Static130.anInt3165) / 1000;
			if (local238 < Static130.anInt3165) {
				Static130.anInt3165 = local238;
			}
		}
		if (local238 < Static130.anInt3165) {
			Static130.anInt3165 -= Static137.anInt3304 + (Static130.anInt3165 - local238) * Static98.anInt2480 / 1000;
			if (Static130.anInt3165 < local238) {
				Static130.anInt3165 = local238;
			}
		}
		@Pc(307) int local307 = local254 - Static155.anInt3844;
		if (local307 > 1024) {
			local307 -= 2048;
		}
		if (local307 < -1024) {
			local307 += 2048;
		}
		if (local307 > 0) {
			Static155.anInt3844 += Static98.anInt2480 * local307 / 1000 + Static137.anInt3304;
			Static155.anInt3844 &= 0x7FF;
		}
		if (local307 < 0) {
			Static155.anInt3844 -= Static137.anInt3304 + Static98.anInt2480 * -local307 / 1000;
			Static155.anInt3844 &= 0x7FF;
		}
		@Pc(361) int local361 = local254 - Static155.anInt3844;
		if (local361 > 1024) {
			local361 -= 2048;
		}
		if (local361 < -1024) {
			local361 += 2048;
		}
		if (local361 < 0 && local307 > 0 || local361 > 0 && local307 < 0) {
			Static155.anInt3844 = local254;
		}
	}
}
