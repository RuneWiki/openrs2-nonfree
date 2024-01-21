import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static106 {

	@OriginalMember(owner = "client!kh", name = "D", descriptor = "Lclient!ve;")
	public static Class3_Sub1 aClass3_Sub1_15;

	@OriginalMember(owner = "client!kh", name = "G", descriptor = "I")
	public static int anInt2307;

	@OriginalMember(owner = "client!kh", name = "I", descriptor = "Lclient!ab;")
	public static Class3 aClass3_19;

	@OriginalMember(owner = "client!kh", name = "u", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_5 = new Class77(30);

	@OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
	public static int anInt2299 = 0;

	@OriginalMember(owner = "client!kh", name = "w", descriptor = "[J")
	public static final long[] aLongArray7 = new long[200];

	@OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
	public static int anInt2304 = 0;

	@OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
	public static int anInt2305 = 0;

	@OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
	public static int anInt2306 = 0;

	@OriginalMember(owner = "client!kh", name = "F", descriptor = "Lclient!ig;")
	public static final Class47 aClass47_17 = new Class47(100);

	@OriginalMember(owner = "client!kh", name = "H", descriptor = "Lclient!ph;")
	public static final Class77 aClass77_6 = new Class77(50);

	@OriginalMember(owner = "client!kh", name = "J", descriptor = "Lclient!vd;")
	public static final Class92 aClass92_1022 = Static187.method3089(")2");

	@OriginalMember(owner = "client!kh", name = "K", descriptor = "Lclient!wd;")
	public static final Class97 aClass97_12 = new Class97(4096);

	@OriginalMember(owner = "client!kh", name = "b", descriptor = "(I)V")
	public static void method1592() {
		@Pc(9) int local9 = Static98.anInt2070 * 128 + 64;
		@Pc(15) int local15 = Static74.anInt1647 * 128 + 64;
		@Pc(23) int local23 = Static64.method1027(local15, local9, Static192.anInt4180) - Static199.anInt4344;
		if (local9 > Static186.anInt4074) {
			Static186.anInt4074 += Static146.anInt2959 * (local9 - Static186.anInt4074) / 1000 + Static17.anInt3483;
			if (local9 < Static186.anInt4074) {
				Static186.anInt4074 = local9;
			}
		}
		if (Static100.anInt2140 < local15) {
			Static100.anInt2140 += Static17.anInt3483 + Static146.anInt2959 * (local15 - Static100.anInt2140) / 1000;
			if (Static100.anInt2140 > local15) {
				Static100.anInt2140 = local15;
			}
		}
		if (Static186.anInt4074 > local9) {
			Static186.anInt4074 -= Static17.anInt3483 + (Static186.anInt4074 - local9) * Static146.anInt2959 / 1000;
			if (Static186.anInt4074 < local9) {
				Static186.anInt4074 = local9;
			}
		}
		if (local15 < Static100.anInt2140) {
			Static100.anInt2140 -= Static17.anInt3483 + (Static100.anInt2140 - local15) * Static146.anInt2959 / 1000;
			if (Static100.anInt2140 < local15) {
				Static100.anInt2140 = local15;
			}
		}
		local15 = Static187.anInt4098 * 128 + 64;
		local9 = anInt2307 * 128 + 64;
		if (Static107.anInt2320 < local23) {
			Static107.anInt2320 += (local23 - Static107.anInt2320) * Static146.anInt2959 / 1000 + Static17.anInt3483;
			if (local23 < Static107.anInt2320) {
				Static107.anInt2320 = local23;
			}
		}
		if (Static107.anInt2320 > local23) {
			Static107.anInt2320 -= (Static107.anInt2320 - local23) * Static146.anInt2959 / 1000 + Static17.anInt3483;
			if (local23 > Static107.anInt2320) {
				Static107.anInt2320 = local23;
			}
		}
		local23 = Static64.method1027(local15, local9, Static192.anInt4180) - Static178.anInt3840;
		@Pc(203) int local203 = local23 - Static107.anInt2320;
		@Pc(208) int local208 = local15 - Static100.anInt2140;
		@Pc(213) int local213 = local9 - Static186.anInt4074;
		@Pc(224) int local224 = (int) Math.sqrt((double) (local208 * local208 + local213 * local213));
		@Pc(235) int local235 = (int) (Math.atan2((double) local203, (double) local224) * 325.949D) & 0x7FF;
		@Pc(246) int local246 = (int) (-325.949D * Math.atan2((double) local213, (double) local208)) & 0x7FF;
		@Pc(251) int local251 = local246 - Static47.anInt1197;
		if (local251 > 1024) {
			local251 -= 2048;
		}
		if (local251 < -1024) {
			local251 += 2048;
		}
		if (local235 < 128) {
			local235 = 128;
		}
		if (local251 > 0) {
			Static47.anInt1197 += Static207.anInt4461 + local251 * Static188.anInt4443 / 1000;
			Static47.anInt1197 &= 0x7FF;
		}
		if (local251 < 0) {
			Static47.anInt1197 -= Static207.anInt4461 + Static188.anInt4443 * -local251 / 1000;
			Static47.anInt1197 &= 0x7FF;
		}
		if (local235 > 383) {
			local235 = 383;
		}
		if (Static10.anInt243 < local235) {
			Static10.anInt243 += Static207.anInt4461 + (local235 - Static10.anInt243) * Static188.anInt4443 / 1000;
			if (local235 < Static10.anInt243) {
				Static10.anInt243 = local235;
			}
		}
		@Pc(347) int local347 = local246 - Static47.anInt1197;
		if (local347 > 1024) {
			local347 -= 2048;
		}
		if (Static10.anInt243 > local235) {
			Static10.anInt243 -= Static207.anInt4461 + Static188.anInt4443 * (Static10.anInt243 - local235) / 1000;
			if (Static10.anInt243 < local235) {
				Static10.anInt243 = local235;
			}
		}
		if (local347 < -1024) {
			local347 += 2048;
		}
		if (local347 < 0 && local251 > 0 || local347 > 0 && local251 < 0) {
			Static47.anInt1197 = local246;
		}
	}
}
