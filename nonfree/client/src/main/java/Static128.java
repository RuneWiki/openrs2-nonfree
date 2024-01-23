import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!jg", name = "X", descriptor = "[Lclient!lj;")
	public static Class1_Sub5_Sub6[] aClass1_Sub5_Sub6Array3;

	@OriginalMember(owner = "client!jg", name = "S", descriptor = "Lclient!jo;")
	public static Class96 aClass96_7 = new Class96();

	@OriginalMember(owner = "client!jg", name = "V", descriptor = "I")
	public static int anInt2547 = -1;

	@OriginalMember(owner = "client!jg", name = "W", descriptor = "Ljava/lang/String;")
	public static String aString87 = "Loading config - ";

	@OriginalMember(owner = "client!jg", name = "Y", descriptor = "Lclient!ui;")
	public static Class175 aClass175_21 = new Class175(64);

	@OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
	public static int anInt2548 = 0;

	@OriginalMember(owner = "client!jg", name = "ab", descriptor = "[F")
	public static float[] aFloatArray21 = new float[] { 0.073F, 0.169F, 0.24F, 1.0F };

	@OriginalMember(owner = "client!jg", name = "bb", descriptor = "Z")
	public static boolean aBoolean222 = false;

	@OriginalMember(owner = "client!jg", name = "cb", descriptor = "Lclient!ei;")
	public static Class1_Sub11 aClass1_Sub11_1 = new Class1_Sub11(0, -1);

	@OriginalMember(owner = "client!jg", name = "db", descriptor = "I")
	public static int anInt2549 = 0;

	@OriginalMember(owner = "client!jg", name = "eb", descriptor = "Z")
	public static boolean aBoolean223 = true;

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(IIIII)V")
	public static void method2261(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) int local14;
		if (arg1 > arg3) {
			for (local14 = arg3; local14 < arg1; local14++) {
				Static40.anIntArrayArray6[local14][arg2] = arg0;
			}
		} else {
			for (local14 = arg1; local14 < arg3; local14++) {
				Static40.anIntArrayArray6[local14][arg2] = arg0;
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "b", descriptor = "(II)V")
	public static void method2264(@OriginalArg(0) int arg0) {
		if (arg0 > 256) {
			arg0 = 256;
		}
		if (arg0 > 10) {
			arg0 = 10;
		}
		Static171.anInt3357 += arg0 * 128;
		@Pc(40) int local40;
		if (Static265.anIntArray550.length < Static171.anInt3357) {
			local40 = (int) (Math.random() * 12.0D);
			Static171.anInt3357 -= Static265.anIntArray550.length;
			Static88.method1725(Static132.aClass57_Sub1Array2[local40]);
		}
		local40 = 0;
		@Pc(56) int local56 = arg0 * 128;
		@Pc(63) int local63 = (256 - arg0) * 128;
		@Pc(65) int local65;
		@Pc(90) int local90;
		for (local65 = 0; local65 < local63; local65++) {
			local90 = Static23.anIntArray52[local56 + local40] - arg0 * Static265.anIntArray550[Static265.anIntArray550.length - 1 & Static171.anInt3357 + local40] / 6;
			if (local90 < 0) {
				local90 = 0;
			}
			Static23.anIntArray52[local40++] = local90;
		}
		@Pc(116) int local116;
		@Pc(126) int local126;
		for (local65 = 256 - arg0; local65 < 256; local65++) {
			local90 = local65 * 128;
			for (local116 = 0; local116 < 128; local116++) {
				local126 = (int) (Math.random() * 100.0D);
				if (local126 < 50 && local116 > 10 && local116 < 118) {
					Static23.anIntArray52[local90 + local116] = 255;
				} else {
					Static23.anIntArray52[local90 + local116] = 0;
				}
			}
		}
		for (local65 = 0; local65 < 256 - arg0; local65++) {
			Static199.anIntArray414[local65] = Static199.anIntArray414[local65 + arg0];
		}
		for (local65 = 256 - arg0; local65 < 256; local65++) {
			Static199.anIntArray414[local65] = (int) (Math.sin((double) Static225.anInt4219 / 14.0D) * 16.0D + Math.sin((double) Static225.anInt4219 / 15.0D) * 14.0D + Math.sin((double) Static225.anInt4219 / 16.0D) * 12.0D);
			Static225.anInt4219++;
		}
		Static103.anInt2205 += arg0;
		local65 = (arg0 + (Static167.anInt637 & 0x1)) / 2;
		if (local65 <= 0) {
			return;
		}
		for (local90 = 0; local90 < Static103.anInt2205; local90++) {
			local116 = (int) (Math.random() * 124.0D) + 2;
			local126 = (int) (Math.random() * 128.0D) + 128;
			Static23.anIntArray52[local116 + (local126 << 7)] = 192;
		}
		Static103.anInt2205 = 0;
		@Pc(294) int local294;
		for (local90 = 0; local90 < 256; local90++) {
			local116 = 0;
			local126 = local90 * 128;
			for (local294 = -local65; local294 < 128; local294++) {
				if (local294 + local65 < 128) {
					local116 += Static23.anIntArray52[local126 + local294 + local65];
				}
				if (local294 - local65 - 1 >= 0) {
					local116 -= Static23.anIntArray52[local294 + local126 - local65 - 1];
				}
				if (local294 >= 0) {
					Static132.anIntArray202[local294 + local126] = local116 / (local65 * 2 + 1);
				}
			}
		}
		for (local90 = 0; local90 < 128; local90++) {
			local116 = 0;
			for (local126 = -local65; local126 < 256; local126++) {
				local294 = local126 * 128;
				if (local126 + local65 < 256) {
					local116 += Static132.anIntArray202[local294 + local90 + local65 * 128];
				}
				if (local126 - local65 - 1 >= 0) {
					local116 -= Static132.anIntArray202[local90 + local294 - (local65 - -1) * 128];
				}
				if (local126 >= 0) {
					Static23.anIntArray52[local90 + local294] = local116 / (local65 * 2 + 1);
				}
			}
		}
	}

	@OriginalMember(owner = "client!jg", name = "c", descriptor = "(II)I")
	public static int method2265(@OriginalArg(0) int arg0) {
		@Pc(7) int local7 = arg0 & 0x3F;
		@Pc(18) int local18 = arg0 >> 6 & 0x3;
		if (local7 == 18) {
			if (local18 == 0) {
				return 1;
			}
			if (local18 == 1) {
				return 2;
			}
			if (local18 == 2) {
				return 4;
			}
			if (local18 == 3) {
				return 8;
			}
		} else if (local7 == 19 || local7 == 21) {
			if (local18 == 0) {
				return 16;
			}
			if (local18 == 1) {
				return 32;
			}
			if (local18 == 2) {
				return 64;
			}
			if (local18 == 3) {
				return 128;
			}
		}
		return 0;
	}
}
