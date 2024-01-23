import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static138 {

	@OriginalMember(owner = "client!mj", name = "Vb", descriptor = "I")
	public static int anInt3057;

	@OriginalMember(owner = "client!mj", name = "Tb", descriptor = "I")
	public static int anInt3055 = 0;

	@OriginalMember(owner = "client!mj", name = "Wb", descriptor = "Lclient!sc;")
	public static Class107 aClass107_828 = Static231.method3737(":chalreq:");

	@OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILclient!jb;)I")
	public static int method2313(@OriginalArg(1) Class28 arg0) {
		@Pc(10) int local10 = 0;
		if (arg0.method824(Static185.anInt4914)) {
			local10++;
		}
		if (arg0.method824(Static20.anInt2216)) {
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!mj", name = "b", descriptor = "(Z)V")
	public static void method2315() {
		Static189.anInt4167 = 0;
		Static8.anInt258 = 0;
		Static7.method238();
		Static1.method58();
		Static233.method3742();
		Static70.method1251();
		@Pc(25) int local25;
		for (@Pc(19) int local19 = 0; local19 < Static8.anInt258; local19++) {
			local25 = Static179.anIntArray340[local19];
			if (Static128.anInt2802 != Static198.aClass5_Sub5_Sub1Array1[local25].anInt3009) {
				if (Static198.aClass5_Sub5_Sub1Array1[local25].anInt1291 > 0) {
					Static116.method2006(Static198.aClass5_Sub5_Sub1Array1[local25]);
				}
				Static198.aClass5_Sub5_Sub1Array1[local25] = null;
			}
		}
		if (Static194.aClass1_Sub26_Sub1_3.anInt4021 != Static24.anInt450) {
			throw new RuntimeException("gpp1 pos:" + Static194.aClass1_Sub26_Sub1_3.anInt4021 + " psize:" + Static24.anInt450);
		}
		for (local25 = 0; local25 < Static10.anInt285; local25++) {
			if (Static198.aClass5_Sub5_Sub1Array1[Static16.anIntArray38[local25]] == null) {
				throw new RuntimeException("gpp2 pos:" + local25 + " size:" + Static10.anInt285);
			}
		}
	}

	@OriginalMember(owner = "client!mj", name = "d", descriptor = "(I)V")
	public static void method2316() {
		@Pc(9) int local9 = Static105.anInt2299 * 128 + 64;
		@Pc(15) int local15 = Static122.anInt2672 * 128 + 64;
		@Pc(23) int local23 = Static130.method2174(Static191.anInt4237, local9, local15) - Static179.anInt3924;
		if (Static130.anInt2832 >= 100) {
			Static22.anInt435 = Static122.anInt2672 * 128 + 64;
			Static29.anInt577 = Static105.anInt2299 * 128 + 64;
			Static69.anInt1578 = Static130.method2174(Static191.anInt4237, Static29.anInt577, Static22.anInt435) - Static179.anInt3924;
		} else {
			if (local23 > Static69.anInt1578) {
				Static69.anInt1578 += Static159.anInt3503 + Static130.anInt2832 * (local23 - Static69.anInt1578) / 1000;
				if (local23 < Static69.anInt1578) {
					Static69.anInt1578 = local23;
				}
			}
			if (local15 > Static22.anInt435) {
				Static22.anInt435 += Static159.anInt3503 + (local15 - Static22.anInt435) * Static130.anInt2832 / 1000;
				if (Static22.anInt435 > local15) {
					Static22.anInt435 = local15;
				}
			}
			if (local9 > Static29.anInt577) {
				Static29.anInt577 += Static159.anInt3503 + (local9 - Static29.anInt577) * Static130.anInt2832 / 1000;
				if (local9 < Static29.anInt577) {
					Static29.anInt577 = local9;
				}
			}
			if (Static69.anInt1578 > local23) {
				Static69.anInt1578 -= Static130.anInt2832 * (Static69.anInt1578 - local23) / 1000 + Static159.anInt3503;
				if (local23 > Static69.anInt1578) {
					Static69.anInt1578 = local23;
				}
			}
			if (local9 < Static29.anInt577) {
				Static29.anInt577 -= Static130.anInt2832 * (Static29.anInt577 - local9) / 1000 + Static159.anInt3503;
				if (Static29.anInt577 < local9) {
					Static29.anInt577 = local9;
				}
			}
			if (local15 < Static22.anInt435) {
				Static22.anInt435 -= Static130.anInt2832 * (Static22.anInt435 - local15) / 1000 + Static159.anInt3503;
				if (Static22.anInt435 < local15) {
					Static22.anInt435 = local15;
				}
			}
		}
		local15 = Static31.anInt2865 * 128 + 64;
		local9 = Static73.anInt1679 * 128 + 64;
		local23 = Static130.method2174(Static191.anInt4237, local9, local15) - Static40.anInt854;
		@Pc(231) int local231 = local9 - Static29.anInt577;
		@Pc(236) int local236 = local23 - Static69.anInt1578;
		@Pc(241) int local241 = local15 - Static22.anInt435;
		@Pc(252) int local252 = (int) Math.sqrt((double) (local241 * local241 + local231 * local231));
		@Pc(263) int local263 = (int) (Math.atan2((double) local236, (double) local252) * 325.949D) & 0x7FF;
		if (local263 < 128) {
			local263 = 128;
		}
		@Pc(279) int local279 = (int) (Math.atan2((double) local241, (double) local231) * -325.949D) & 0x7FF;
		@Pc(284) int local284 = local279 - Static122.anInt2671;
		if (local284 > 1024) {
			local284 -= 2048;
		}
		if (local263 > 383) {
			local263 = 383;
		}
		if (local284 < -1024) {
			local284 += 2048;
		}
		if (local284 > 0) {
			Static122.anInt2671 += Static171.anInt3717 + Static194.anInt4293 * local284 / 1000;
			Static122.anInt2671 &= 0x7FF;
		}
		if (Static6.anInt2981 < local263) {
			Static6.anInt2981 += (local263 - Static6.anInt2981) * Static194.anInt4293 / 1000 + Static171.anInt3717;
			if (local263 < Static6.anInt2981) {
				Static6.anInt2981 = local263;
			}
		}
		if (local263 < Static6.anInt2981) {
			Static6.anInt2981 -= Static171.anInt3717 + Static194.anInt4293 * (Static6.anInt2981 - local263) / 1000;
			if (local263 > Static6.anInt2981) {
				Static6.anInt2981 = local263;
			}
		}
		if (local284 < 0) {
			Static122.anInt2671 -= -local284 * Static194.anInt4293 / 1000 + Static171.anInt3717;
			Static122.anInt2671 &= 0x7FF;
		}
		@Pc(393) int local393 = local279 - Static122.anInt2671;
		if (local393 > 1024) {
			local393 -= 2048;
		}
		if (local393 < -1024) {
			local393 += 2048;
		}
		if (local393 < 0 && local284 > 0 || local393 > 0 && local284 < 0) {
			Static122.anInt2671 = local279;
		}
	}
}
