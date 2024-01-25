import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static590 {

	@OriginalMember(owner = "client!uw", name = "x", descriptor = "I")
	public static int anInt9656;

	@OriginalMember(owner = "client!uw", name = "y", descriptor = "Z")
	public static boolean aBoolean775 = false;

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(ZII)V")
	public static void method8288(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		Static23.method494(arg1, Static76.aClass58_13.method1237(Static321.anInt5554), arg0);
	}

	@OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)V")
	public static void method8289() {
		@Pc(14) int local14 = Static512.anInt9960 * 512 + 256;
		@Pc(20) int local20 = Static148.anInt4148 * 512 + 256;
		@Pc(28) int local28 = Static600.method8378(local20, local14, Static299.anInt4751) - Static636.anInt10317;
		if (Static178.anInt3172 < 100) {
			if (Static70.anInt9231 < local14) {
				Static70.anInt9231 += (local14 - Static70.anInt9231) * Static178.anInt3172 / 1000 + Static576.anInt9475;
				if (Static70.anInt9231 > local14) {
					Static70.anInt9231 = local14;
				}
			}
			if (local14 < Static70.anInt9231) {
				Static70.anInt9231 -= (Static70.anInt9231 - local14) * Static178.anInt3172 / 1000 + Static576.anInt9475;
				if (local14 > Static70.anInt9231) {
					Static70.anInt9231 = local14;
				}
			}
			if (Static216.anInt3726 < local28) {
				Static216.anInt3726 += (local28 - Static216.anInt3726) * Static178.anInt3172 / 1000 + Static576.anInt9475;
				if (local28 < Static216.anInt3726) {
					Static216.anInt3726 = local28;
				}
			}
			if (Static216.anInt3726 > local28) {
				Static216.anInt3726 -= Static178.anInt3172 * (Static216.anInt3726 - local28) / 1000 + Static576.anInt9475;
				if (local28 > Static216.anInt3726) {
					Static216.anInt3726 = local28;
				}
			}
			if (Static646.anInt10445 < local20) {
				Static646.anInt10445 += Static576.anInt9475 + Static178.anInt3172 * (local20 - Static646.anInt10445) / 1000;
				if (local20 < Static646.anInt10445) {
					Static646.anInt10445 = local20;
				}
			}
			if (Static646.anInt10445 > local20) {
				Static646.anInt10445 -= (Static646.anInt10445 - local20) * Static178.anInt3172 / 1000 + Static576.anInt9475;
				if (Static646.anInt10445 < local20) {
					Static646.anInt10445 = local20;
				}
			}
		} else {
			Static70.anInt9231 = Static512.anInt9960 * 512 + 256;
			Static646.anInt10445 = Static148.anInt4148 * 512 + 256;
			Static216.anInt3726 = Static600.method8378(Static646.anInt10445, Static70.anInt9231, Static299.anInt4751) - Static636.anInt10317;
		}
		local14 = Static2.anInt7 * 512 + 256;
		local20 = Static477.anInt7975 * 512 + 256;
		local28 = Static600.method8378(local20, local14, Static299.anInt4751) - Static193.anInt3440;
		@Pc(240) int local240 = local14 - Static70.anInt9231;
		@Pc(244) int local244 = local28 - Static216.anInt3726;
		@Pc(249) int local249 = local20 - Static646.anInt10445;
		@Pc(260) int local260 = (int) Math.sqrt((double) (local249 * local249 + local240 * local240));
		@Pc(271) int local271 = (int) (Math.atan2((double) local244, (double) local260) * 2607.5945876176133D) & 0x3FFF;
		if (local271 < 1024) {
			local271 = 1024;
		}
		@Pc(289) int local289 = (int) (-2607.5945876176133D * Math.atan2((double) local240, (double) local249)) & 0x3FFF;
		if (local271 > 3072) {
			local271 = 3072;
		}
		if (Static218.anInt3744 < local271) {
			Static218.anInt3744 += Static315.anInt5510 * (local271 - Static218.anInt3744 >> 3) / 1000 + Static87.anInt1434 << 3;
			if (Static218.anInt3744 > local271) {
				Static218.anInt3744 = local271;
			}
		}
		if (local271 < Static218.anInt3744) {
			Static218.anInt3744 -= Static87.anInt1434 + Static315.anInt5510 * (Static218.anInt3744 - local271 >> 3) / 1000 << 3;
			if (local271 > Static218.anInt3744) {
				Static218.anInt3744 = local271;
			}
		}
		@Pc(354) int local354 = local289 - Static608.anInt9971;
		if (local354 > 8192) {
			local354 -= 16384;
		}
		if (local354 < -8192) {
			local354 += 16384;
		}
		local354 >>= 0x3;
		if (local354 > 0) {
			Static608.anInt9971 += Static87.anInt1434 + local354 * Static315.anInt5510 / 1000 << 3;
			Static608.anInt9971 &= 0x3FFF;
		}
		if (local354 < 0) {
			Static608.anInt9971 -= Static87.anInt1434 + -local354 * Static315.anInt5510 / 1000 << 3;
			Static608.anInt9971 &= 0x3FFF;
		}
		@Pc(414) int local414 = local289 - Static608.anInt9971;
		if (local414 > 8192) {
			local414 -= 16384;
		}
		if (local414 < -8192) {
			local414 += 16384;
		}
		Static21.anInt457 = 0;
		if (local414 < 0 && local354 > 0 || local414 > 0 && local354 < 0) {
			Static608.anInt9971 = local289;
		}
	}

	@OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)V")
	public static void method8295(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(20) boolean local20 = Static535.aClass156ArrayArrayArray2[0][arg1][arg2] != null && Static535.aClass156ArrayArrayArray2[0][arg1][arg2].aClass156_1 != null;
		for (@Pc(22) int local22 = arg0; local22 >= 0; local22--) {
			if (Static535.aClass156ArrayArrayArray2[local22][arg1][arg2] == null) {
				@Pc(44) Class156 local44 = Static535.aClass156ArrayArrayArray2[local22][arg1][arg2] = new Class156(local22);
				if (local20) {
					local44.aByte78++;
				}
			}
		}
	}
}
