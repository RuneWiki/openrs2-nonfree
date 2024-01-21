import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static38 {

	@OriginalMember(owner = "client!ed", name = "N", descriptor = "I")
	public static int anInt3122;

	@OriginalMember(owner = "client!ed", name = "O", descriptor = "Lclient!kf;")
	public static Class3_Sub1_Sub3_Sub3 aClass3_Sub1_Sub3_Sub3_13;

	@OriginalMember(owner = "client!ed", name = "S", descriptor = "J")
	public static long aLong148;

	@OriginalMember(owner = "client!ed", name = "M", descriptor = "I")
	public static int anInt3121 = 0;

	@OriginalMember(owner = "client!ed", name = "Q", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1739 = Static122.method531("Connection lost)3");

	@OriginalMember(owner = "client!ed", name = "P", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1738 = aClass73_1739;

	@OriginalMember(owner = "client!ed", name = "T", descriptor = "I")
	public static int anInt3124 = 0;

	@OriginalMember(owner = "client!ed", name = "W", descriptor = "Lclient!sd;")
	private static Class73 aClass73_1741 = Static122.method531("Press (Wchange your password(W on front page)3");

	@OriginalMember(owner = "client!ed", name = "V", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1740 = aClass73_1741;

	@OriginalMember(owner = "client!ed", name = "ab", descriptor = "Lclient!sd;")
	public static Class73 aClass73_1742 = Static122.method531("<br>");

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(ILclient!ud;)V")
	public static void method2259(@OriginalArg(1) Class3_Sub1_Sub4_Sub7 arg0) {
		arg0.anInt3141 = arg0.anInt3154;
		if (arg0.anInt3160 == 0) {
			arg0.anInt3181 = 0;
			return;
		}
		if (arg0.anInt3184 != -1 && arg0.anInt3173 == 0) {
			@Pc(28) Class3_Sub1_Sub8 local28 = Static98.method1697(arg0.anInt3184);
			if (arg0.anInt3135 > 0 && local28.anInt1318 == 0) {
				arg0.anInt3181++;
				return;
			}
			if (arg0.anInt3135 <= 0 && local28.anInt1332 == 0) {
				arg0.anInt3181++;
				return;
			}
		}
		@Pc(66) int local66 = arg0.anInt3169;
		@Pc(82) int local82 = arg0.anIntArray329[arg0.anInt3160 - 1] * 128 + arg0.anInt3140 * 64;
		@Pc(85) int local85 = arg0.anInt3159;
		@Pc(100) int local100 = arg0.anInt3140 * 64 + arg0.anIntArray326[arg0.anInt3160 - 1] * 128;
		if (local82 - local66 > 256 || local82 - local66 < -256 || local100 - local85 > 256 || local100 - local85 < -256) {
			arg0.anInt3169 = local82;
			arg0.anInt3159 = local100;
			return;
		}
		@Pc(138) int local138 = arg0.anInt3161;
		if (local66 >= local82) {
			if (local82 >= local66) {
				if (local100 > local85) {
					arg0.anInt3139 = 1024;
				} else if (local85 > local100) {
					arg0.anInt3139 = 0;
				}
			} else if (local85 < local100) {
				arg0.anInt3139 = 768;
			} else if (local85 > local100) {
				arg0.anInt3139 = 256;
			} else {
				arg0.anInt3139 = 512;
			}
		} else if (local85 < local100) {
			arg0.anInt3139 = 1280;
		} else if (local100 < local85) {
			arg0.anInt3139 = 1792;
		} else {
			arg0.anInt3139 = 1536;
		}
		@Pc(233) int local233 = arg0.anInt3139 - arg0.anInt3138 & 0x7FF;
		@Pc(235) int local235 = 4;
		if (local233 > 1024) {
			local233 -= 2048;
		}
		if (local233 >= -256 && local233 <= 256) {
			local138 = arg0.anInt3155;
		} else if (local233 >= 256 && local233 < 768) {
			local138 = arg0.anInt3180;
		} else if (local233 >= -768 && local233 <= -256) {
			local138 = arg0.anInt3144;
		}
		if (local138 == -1) {
			local138 = arg0.anInt3155;
		}
		arg0.anInt3141 = local138;
		@Pc(290) boolean local290 = true;
		if (arg0 instanceof Class3_Sub1_Sub4_Sub7_Sub2) {
			local290 = ((Class3_Sub1_Sub4_Sub7_Sub2) arg0).aClass3_Sub1_Sub10_1.aBoolean102;
		}
		if (local290) {
			if (arg0.anInt3138 != arg0.anInt3139 && arg0.anInt3145 == -1 && arg0.anInt3171 != 0) {
				local235 = 2;
			}
			if (arg0.anInt3160 > 2) {
				local235 = 6;
			}
			if (arg0.anInt3160 > 3) {
				local235 = 8;
			}
			if (arg0.anInt3181 > 0 && arg0.anInt3160 > 1) {
				local235 = 8;
				arg0.anInt3181--;
			}
		} else {
			if (arg0.anInt3160 > 1) {
				local235 = 6;
			}
			if (arg0.anInt3160 > 2) {
				local235 = 8;
			}
			if (arg0.anInt3181 > 0 && arg0.anInt3160 > 1) {
				local235 = 8;
				arg0.anInt3181--;
			}
		}
		if (arg0.aBooleanArray15[arg0.anInt3160 - 1]) {
			local235 <<= 0x1;
		}
		if (local100 > local85) {
			arg0.anInt3159 += local235;
			if (local100 < arg0.anInt3159) {
				arg0.anInt3159 = local100;
			}
		} else if (local85 > local100) {
			arg0.anInt3159 -= local235;
			if (local100 > arg0.anInt3159) {
				arg0.anInt3159 = local100;
			}
		}
		if (local235 >= 8 && arg0.anInt3141 == arg0.anInt3155 && arg0.anInt3183 != -1) {
			arg0.anInt3141 = arg0.anInt3183;
		}
		if (local82 > local66) {
			arg0.anInt3169 += local235;
			if (local82 < arg0.anInt3169) {
				arg0.anInt3169 = local82;
			}
		} else if (local66 > local82) {
			arg0.anInt3169 -= local235;
			if (arg0.anInt3169 < local82) {
				arg0.anInt3169 = local82;
			}
		}
		if (arg0.anInt3169 == local82 && local100 == arg0.anInt3159) {
			arg0.anInt3160--;
			if (arg0.anInt3135 > 0) {
				arg0.anInt3135--;
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "j", descriptor = "(I)V")
	public static void method2262() {
		@Pc(11) int local11;
		for (@Pc(3) int local3 = -1; local3 < Static6.anInt158; local3++) {
			if (local3 == -1) {
				local11 = 2047;
			} else {
				local11 = Static47.anIntArray184[local3];
			}
			@Pc(21) Class3_Sub1_Sub4_Sub7_Sub1 local21 = Static162.aClass3_Sub1_Sub4_Sub7_Sub1Array1[local11];
			if (local21 != null && local21.anInt3170 > 0) {
				local21.anInt3170--;
				if (local21.anInt3170 == 0) {
					local21.aClass73_1747 = null;
				}
			}
		}
		for (local11 = 0; local11 < Static86.anInt1943; local11++) {
			@Pc(53) int local53 = Static52.anIntArray132[local11];
			@Pc(57) Class3_Sub1_Sub4_Sub7_Sub2 local57 = Static112.aClass3_Sub1_Sub4_Sub7_Sub2Array1[local53];
			if (local57 != null && local57.anInt3170 > 0) {
				local57.anInt3170--;
				if (local57.anInt3170 == 0) {
					local57.aClass73_1747 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!ed", name = "a", descriptor = "(B)V")
	public static void method2263() {
		aClass73_1741 = null;
		aClass73_1740 = null;
		aClass73_1739 = null;
		aClass73_1738 = null;
		aClass3_Sub1_Sub3_Sub3_13 = null;
		aClass73_1742 = null;
	}
}
