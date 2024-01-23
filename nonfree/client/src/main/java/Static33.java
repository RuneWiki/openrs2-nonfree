import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static33 {

	@OriginalMember(owner = "client!cj", name = "W", descriptor = "Lclient!ed;")
	public static Class26 aClass26_2;

	@OriginalMember(owner = "client!cj", name = "Y", descriptor = "Lclient!qf;")
	public static Class92 aClass92_1;

	@OriginalMember(owner = "client!cj", name = "S", descriptor = "Lclient!hh;")
	private static Class50 aClass50_245 = Static186.method3527("Loading)3)3)3");

	@OriginalMember(owner = "client!cj", name = "bb", descriptor = "Lclient!hh;")
	private static Class50 aClass50_249 = Static186.method3527("green:");

	@OriginalMember(owner = "client!cj", name = "T", descriptor = "Lclient!hh;")
	public static Class50 aClass50_246 = aClass50_249;

	@OriginalMember(owner = "client!cj", name = "V", descriptor = "Lclient!hh;")
	public static Class50 aClass50_247 = aClass50_249;

	@OriginalMember(owner = "client!cj", name = "Z", descriptor = "Lclient!hh;")
	public static Class50 aClass50_248 = aClass50_245;

	@OriginalMember(owner = "client!cj", name = "cb", descriptor = "I")
	public static int anInt627 = -1;

	@OriginalMember(owner = "client!cj", name = "eb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_250 = Static186.method3527("; Max)2Age=");

	@OriginalMember(owner = "client!cj", name = "fb", descriptor = "Lclient!hh;")
	public static Class50 aClass50_251 = Static186.method3527("null");

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "(B)V")
	public static void method485() {
		Static144.aClass84_24.method2576();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!sh;)V")
	public static void method486(@OriginalArg(1) Class20_Sub3 arg0) {
		arg0.anInt3051 = arg0.anInt3057;
		if (arg0.anInt3041 == 0) {
			arg0.anInt3029 = 0;
			return;
		}
		if (arg0.anInt3060 != -1 && arg0.anInt3014 == 0) {
			@Pc(32) Class110 local32 = Static200.method3204(arg0.anInt3060);
			if (arg0.anInt3009 > 0 && local32.anInt4013 == 0) {
				arg0.anInt3029++;
				return;
			}
			if (arg0.anInt3009 <= 0 && local32.anInt4005 == 0) {
				arg0.anInt3029++;
				return;
			}
		}
		@Pc(67) int local67 = arg0.anInt3008;
		@Pc(70) int local70 = arg0.anInt3022;
		@Pc(85) int local85 = arg0.anInt3034 * 64 + arg0.anIntArray311[arg0.anInt3041 - 1] * 128;
		@Pc(100) int local100 = arg0.anInt3034 * 64 + arg0.anIntArray313[arg0.anInt3041 - 1] * 128;
		if (local85 - local70 > 256 || local85 - local70 < -256 || local100 - local67 > 256 || local100 - local67 < -256) {
			arg0.anInt3022 = local85;
			arg0.anInt3008 = local100;
			return;
		}
		if (local70 >= local85) {
			if (local85 < local70) {
				if (local100 > local67) {
					arg0.anInt3042 = 768;
				} else if (local67 <= local100) {
					arg0.anInt3042 = 512;
				} else {
					arg0.anInt3042 = 256;
				}
			} else if (local67 < local100) {
				arg0.anInt3042 = 1024;
			} else if (local67 > local100) {
				arg0.anInt3042 = 0;
			}
		} else if (local100 > local67) {
			arg0.anInt3042 = 1280;
		} else if (local100 >= local67) {
			arg0.anInt3042 = 1536;
		} else {
			arg0.anInt3042 = 1792;
		}
		@Pc(227) int local227 = arg0.anInt3042 - arg0.anInt3054 & 0x7FF;
		@Pc(230) int local230 = arg0.anInt3039;
		@Pc(240) boolean local240 = true;
		@Pc(242) int local242 = 4;
		if (local227 > 1024) {
			local227 -= 2048;
		}
		if (local227 >= -256 && local227 <= 256) {
			local230 = arg0.anInt3040;
		} else if (local227 >= 256 && local227 < 768) {
			local230 = arg0.anInt3050;
		} else if (local227 >= -768 && local227 <= -256) {
			local230 = arg0.anInt3044;
		}
		if (local230 == -1) {
			local230 = arg0.anInt3040;
		}
		arg0.anInt3051 = local230;
		if (arg0 instanceof Class20_Sub3_Sub2) {
			local240 = ((Class20_Sub3_Sub2) arg0).aClass105_1.aBoolean183;
		}
		if (local240) {
			if (arg0.anInt3054 != arg0.anInt3042 && arg0.anInt3010 == -1 && arg0.anInt3036 != 0) {
				local242 = 2;
			}
			if (arg0.anInt3041 > 2) {
				local242 = 6;
			}
			if (arg0.anInt3041 > 3) {
				local242 = 8;
			}
			if (arg0.anInt3029 > 0 && arg0.anInt3041 > 1) {
				arg0.anInt3029--;
				local242 = 8;
			}
		} else {
			if (arg0.anInt3041 > 1) {
				local242 = 6;
			}
			if (arg0.anInt3041 > 2) {
				local242 = 8;
			}
			if (arg0.anInt3029 > 0 && arg0.anInt3041 > 1) {
				arg0.anInt3029--;
				local242 = 8;
			}
		}
		if (arg0.aBooleanArray13[arg0.anInt3041 - 1]) {
			local242 <<= 0x1;
		}
		if (local67 < local100) {
			arg0.anInt3008 += local242;
			if (local100 < arg0.anInt3008) {
				arg0.anInt3008 = local100;
			}
		} else if (local100 < local67) {
			arg0.anInt3008 -= local242;
			if (local100 > arg0.anInt3008) {
				arg0.anInt3008 = local100;
			}
		}
		if (local70 < local85) {
			arg0.anInt3022 += local242;
			if (arg0.anInt3022 > local85) {
				arg0.anInt3022 = local85;
			}
		} else if (local70 > local85) {
			arg0.anInt3022 -= local242;
			if (arg0.anInt3022 < local85) {
				arg0.anInt3022 = local85;
			}
		}
		if (arg0.anInt3022 == local85 && arg0.anInt3008 == local100) {
			arg0.anInt3041--;
			if (arg0.anInt3009 > 0) {
				arg0.anInt3009--;
			}
		}
		if (local242 >= 8 && arg0.anInt3051 == arg0.anInt3040 && arg0.anInt3027 != -1) {
			arg0.anInt3051 = arg0.anInt3027;
		}
	}
}
