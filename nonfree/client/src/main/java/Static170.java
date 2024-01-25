import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!jk", name = "T", descriptor = "Lclient!pc;")
	public static Class176 aClass176_7;

	@OriginalMember(owner = "client!jk", name = "Z", descriptor = "Ljava/awt/Canvas;")
	public static Canvas aCanvas4;

	@OriginalMember(owner = "client!jk", name = "O", descriptor = "Z")
	public static boolean aBoolean225 = false;

	@OriginalMember(owner = "client!jk", name = "W", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_85 = new Class41(60, 4);

	@OriginalMember(owner = "client!jk", name = "X", descriptor = "Lclient!bd;")
	public static final Class17 aClass17_13 = new Class17(6, 3);

	@OriginalMember(owner = "client!jk", name = "Y", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_86 = new Class41(25, -1);

	@OriginalMember(owner = "client!jk", name = "ab", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_87 = new Class41(58, 7);

	@OriginalMember(owner = "client!jk", name = "bb", descriptor = "S")
	public static short aShort23 = 205;

	@OriginalMember(owner = "client!jk", name = "a", descriptor = "(II)I")
	public static int method2760(@OriginalArg(1) int arg0) {
		@Pc(5) int local5 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			local5 += 16;
			arg0 >>>= 0x10;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local5 += 8;
		}
		if (arg0 >= 16) {
			local5 += 4;
			arg0 >>>= 0x4;
		}
		if (arg0 >= 4) {
			local5 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			arg0 >>>= 0x1;
			local5++;
		}
		return arg0 + local5;
	}

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "(B)V")
	public static void method2762() {
		Static98.aStringArray12 = new String[500];
		Static282.anInt4981 = Static60.aClass216_3.anInt5799 + Static60.aClass216_3.anInt5794 + 2;
		Static108.anInt2141 = Static62.aClass216_4.anInt5799 + Static62.aClass216_4.anInt5794 + 2;
		for (@Pc(32) int local32 = 0; local32 < Static98.aStringArray12.length; local32++) {
			Static98.aStringArray12[local32] = "";
		}
	}

	@OriginalMember(owner = "client!jk", name = "f", descriptor = "(I)V")
	public static void method2763() {
		@Pc(9) int local9 = Static239.anInt4366 * 128 + 64;
		@Pc(15) int local15 = Static250.anInt4500 * 128 + 64;
		@Pc(23) int local23 = Static18.method508(local15, Static331.anInt5804, local9) - Static22.anInt539;
		if (Static76.anInt1484 < 100) {
			if (Static160.anInt2915 < local9) {
				Static160.anInt2915 += Static356.anInt6270 + (local9 - Static160.anInt2915) * Static76.anInt1484 / 1000;
				if (local9 < Static160.anInt2915) {
					Static160.anInt2915 = local9;
				}
			}
			if (local23 > Static71.anInt1354) {
				Static71.anInt1354 += Static356.anInt6270 + Static76.anInt1484 * (local23 - Static71.anInt1354) / 1000;
				if (local23 < Static71.anInt1354) {
					Static71.anInt1354 = local23;
				}
			}
			if (Static160.anInt2915 > local9) {
				Static160.anInt2915 -= (Static160.anInt2915 - local9) * Static76.anInt1484 / 1000 + Static356.anInt6270;
				if (local9 > Static160.anInt2915) {
					Static160.anInt2915 = local9;
				}
			}
			if (Static71.anInt1354 > local23) {
				Static71.anInt1354 -= Static76.anInt1484 * (Static71.anInt1354 - local23) / 1000 + Static356.anInt6270;
				if (local23 > Static71.anInt1354) {
					Static71.anInt1354 = local23;
				}
			}
			if (Static22.anInt547 < local15) {
				Static22.anInt547 += Static356.anInt6270 + Static76.anInt1484 * (local15 - Static22.anInt547) / 1000;
				if (Static22.anInt547 > local15) {
					Static22.anInt547 = local15;
				}
			}
			if (Static22.anInt547 > local15) {
				Static22.anInt547 -= Static356.anInt6270 + Static76.anInt1484 * (Static22.anInt547 - local15) / 1000;
				if (local15 > Static22.anInt547) {
					Static22.anInt547 = local15;
				}
			}
		} else {
			Static22.anInt547 = Static250.anInt4500 * 128 + 64;
			Static160.anInt2915 = Static239.anInt4366 * 128 + 64;
			Static71.anInt1354 = Static18.method508(Static22.anInt547, Static331.anInt5804, Static160.anInt2915) - Static22.anInt539;
		}
		local9 = Static276.anInt4908 * 128 + 64;
		local15 = Static215.anInt3982 * 128 + 64;
		local23 = Static18.method508(local15, Static331.anInt5804, local9) - Static327.anInt5766;
		@Pc(237) int local237 = local9 - Static160.anInt2915;
		@Pc(242) int local242 = local23 - Static71.anInt1354;
		@Pc(247) int local247 = local15 - Static22.anInt547;
		@Pc(258) int local258 = (int) Math.sqrt((double) (local247 * local247 + local237 * local237));
		@Pc(269) int local269 = (int) (Math.atan2((double) local242, (double) local258) * 2607.5945876176133D) & 0x3FFF;
		if (local269 < 1024) {
			local269 = 1024;
		}
		@Pc(285) int local285 = (int) (Math.atan2((double) local237, (double) local247) * -2607.5945876176133D) & 0x3FFF;
		if (local269 > 3072) {
			local269 = 3072;
		}
		if (local269 > Static278.anInt1556) {
			Static278.anInt1556 += Static368.anInt6428 * (local269 - Static278.anInt1556 >> 3) / 1000 + Static213.anInt3924 << 3;
			if (local269 < Static278.anInt1556) {
				Static278.anInt1556 = local269;
			}
		}
		if (local269 < Static278.anInt1556) {
			Static278.anInt1556 -= Static368.anInt6428 * (Static278.anInt1556 - local269 >> 3) / 1000 + Static213.anInt3924 << 3;
			if (Static278.anInt1556 < local269) {
				Static278.anInt1556 = local269;
			}
		}
		@Pc(353) int local353 = local285 - Static392.anInt6749;
		if (local353 > 8192) {
			local353 -= 16384;
		}
		if (local353 < -8192) {
			local353 += 16384;
		}
		local353 >>= 0x3;
		if (local353 > 0) {
			Static392.anInt6749 += local353 * Static368.anInt6428 / 1000 + Static213.anInt3924 << 3;
			Static392.anInt6749 &= 0x3FFF;
		}
		if (local353 < 0) {
			Static392.anInt6749 -= Static368.anInt6428 * -local353 / 1000 + Static213.anInt3924 << 3;
			Static392.anInt6749 &= 0x3FFF;
		}
		@Pc(412) int local412 = local285 - Static392.anInt6749;
		if (local412 > 8192) {
			local412 -= 16384;
		}
		if (local412 < -8192) {
			local412 += 16384;
		}
		if (local412 < 0 && local353 > 0 || local412 > 0 && local353 < 0) {
			Static392.anInt6749 = local285;
		}
		Static315.anInt5585 = 0;
	}
}
