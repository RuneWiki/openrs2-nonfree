import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!lm", name = "b", descriptor = "I")
	public static int anInt3151;

	@OriginalMember(owner = "client!lm", name = "e", descriptor = "S")
	public static short aShort16 = 32767;

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(I)V")
	public static void method2483() {
		@Pc(5) int local5 = Static246.anInt5549 * 128 + 64;
		@Pc(15) int local15 = Static27.anInt1300 * 128 + 64;
		@Pc(24) int local24 = Static96.method1559(Static210.anInt4103, local15, local5) - Static120.anInt2636;
		if (Static261.anInt4962 >= 100) {
			Static211.anInt4210 = Static27.anInt1300 * 128 + 64;
			Static149.anInt3032 = Static246.anInt5549 * 128 + 64;
			Static160.anInt3185 = Static96.method1559(Static210.anInt4103, Static211.anInt4210, Static149.anInt3032) - Static120.anInt2636;
		} else {
			if (Static149.anInt3032 < local5) {
				Static149.anInt3032 += (local5 - Static149.anInt3032) * Static261.anInt4962 / 1000 + Static57.anInt1128;
				if (Static149.anInt3032 > local5) {
					Static149.anInt3032 = local5;
				}
			}
			if (local24 > Static160.anInt3185) {
				Static160.anInt3185 += (local24 - Static160.anInt3185) * Static261.anInt4962 / 1000 + Static57.anInt1128;
				if (local24 < Static160.anInt3185) {
					Static160.anInt3185 = local24;
				}
			}
			if (Static149.anInt3032 > local5) {
				Static149.anInt3032 -= Static57.anInt1128 + Static261.anInt4962 * (Static149.anInt3032 - local5) / 1000;
				if (local5 > Static149.anInt3032) {
					Static149.anInt3032 = local5;
				}
			}
			if (Static160.anInt3185 > local24) {
				Static160.anInt3185 -= Static57.anInt1128 + (Static160.anInt3185 - local24) * Static261.anInt4962 / 1000;
				if (Static160.anInt3185 < local24) {
					Static160.anInt3185 = local24;
				}
			}
			if (local15 > Static211.anInt4210) {
				Static211.anInt4210 += (local15 - Static211.anInt4210) * Static261.anInt4962 / 1000 + Static57.anInt1128;
				if (Static211.anInt4210 > local15) {
					Static211.anInt4210 = local15;
				}
			}
			if (Static211.anInt4210 > local15) {
				Static211.anInt4210 -= (Static211.anInt4210 - local15) * Static261.anInt4962 / 1000 + Static57.anInt1128;
				if (Static211.anInt4210 < local15) {
					Static211.anInt4210 = local15;
				}
			}
		}
		local5 = Static266.anInt5000 * 128 + 64;
		local15 = Static18.anInt383 * 128 + 64;
		local24 = Static96.method1559(Static210.anInt4103, local15, local5) - Static274.anInt5109;
		@Pc(220) int local220 = local24 - Static160.anInt3185;
		@Pc(225) int local225 = local15 - Static211.anInt4210;
		@Pc(229) int local229 = local5 - Static149.anInt3032;
		@Pc(241) int local241 = (int) Math.sqrt((double) (local229 * local229 + local225 * local225));
		@Pc(252) int local252 = (int) (Math.atan2((double) local220, (double) local241) * 325.949D) & 0x7FF;
		if (local252 < 128) {
			local252 = 128;
		}
		if (local252 > 383) {
			local252 = 383;
		}
		@Pc(276) int local276 = (int) (-325.949D * Math.atan2((double) local229, (double) local225)) & 0x7FF;
		if (local252 > Static299.anInt5560) {
			Static299.anInt5560 += (local252 - Static299.anInt5560) * Static121.anInt2644 / 1000 + Static47.anInt951;
			if (Static299.anInt5560 > local252) {
				Static299.anInt5560 = local252;
			}
		}
		@Pc(312) int local312 = local276 - Static279.anInt5259;
		if (local252 < Static299.anInt5560) {
			Static299.anInt5560 -= Static47.anInt951 + (Static299.anInt5560 - local252) * Static121.anInt2644 / 1000;
			if (Static299.anInt5560 < local252) {
				Static299.anInt5560 = local252;
			}
		}
		if (local312 > 1024) {
			local312 -= 2048;
		}
		if (local312 < -1024) {
			local312 += 2048;
		}
		if (local312 > 0) {
			Static279.anInt5259 += local312 * Static121.anInt2644 / 1000 + Static47.anInt951;
			Static279.anInt5259 &= 0x7FF;
		}
		if (local312 < 0) {
			Static279.anInt5259 -= Static47.anInt951 + Static121.anInt2644 * -local312 / 1000;
			Static279.anInt5259 &= 0x7FF;
		}
		@Pc(394) int local394 = local276 - Static279.anInt5259;
		if (local394 > 1024) {
			local394 -= 2048;
		}
		if (local394 < -1024) {
			local394 += 2048;
		}
		if (local394 < 0 && local312 > 0 || local394 > 0 && local312 < 0) {
			Static279.anInt5259 = local276;
		}
	}

	@OriginalMember(owner = "client!lm", name = "a", descriptor = "(Z)V")
	public static void method2484() {
		for (@Pc(6) Class4_Sub10 local6 = (Class4_Sub10) Static227.aClass97_16.method2363(); local6 != null; local6 = (Class4_Sub10) Static227.aClass97_16.method2367()) {
			@Pc(12) int local12 = local6.anInt1032;
			if (Static222.method3559(local12)) {
				@Pc(19) boolean local19 = true;
				@Pc(23) Class22[] local23 = Static148.aClass22ArrayArray1[local12];
				@Pc(25) int local25;
				for (local25 = 0; local25 < local23.length; local25++) {
					if (local23[local25] != null) {
						local19 = local23[local25].aBoolean33;
						break;
					}
				}
				if (!local19) {
					local25 = (int) local6.aLong200;
					@Pc(55) Class22 local55 = Static21.method3453(local25);
					if (local55 != null) {
						Static81.method3274(local55);
					}
				}
			}
		}
	}
}
