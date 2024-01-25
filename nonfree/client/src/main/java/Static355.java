import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static355 {

	@OriginalMember(owner = "client!no", name = "G", descriptor = "I")
	public static int anInt6917;

	@OriginalMember(owner = "client!no", name = "J", descriptor = "[I")
	public static final int[] anIntArray358 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

	@OriginalMember(owner = "client!no", name = "a", descriptor = "(IIIII)V")
	public static void method5747(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = arg1;
		@Pc(12) int local12 = -arg1;
		Static306.method5239(Static46.anIntArrayArray4[arg3], arg0 + arg1, arg2, arg0 - arg1);
		@Pc(33) int local33 = -1;
		while (local7 < local9) {
			local33 += 2;
			local7++;
			local12 += local33;
			if (local12 >= 0) {
				local9--;
				local12 -= local9 << 1;
				@Pc(56) int[] local56 = Static46.anIntArrayArray4[local9 + arg3];
				@Pc(63) int[] local63 = Static46.anIntArrayArray4[arg3 - local9];
				@Pc(68) int local68 = arg0 + local7;
				@Pc(72) int local72 = arg0 - local7;
				Static306.method5239(local56, local68, arg2, local72);
				Static306.method5239(local63, local68, arg2, local72);
			}
			@Pc(90) int local90 = local9 + arg0;
			@Pc(94) int local94 = arg0 - local9;
			@Pc(100) int[] local100 = Static46.anIntArrayArray4[local7 + arg3];
			@Pc(107) int[] local107 = Static46.anIntArrayArray4[arg3 - local7];
			Static306.method5239(local100, local90, arg2, local94);
			Static306.method5239(local107, local90, arg2, local94);
		}
	}

	@OriginalMember(owner = "client!no", name = "e", descriptor = "(B)V")
	public static void method5748() {
		@Pc(7) Class337 local7 = null;
		try {
			local7 = Static576.method8228("2");
			@Pc(21) Class4_Sub11 local21 = new Class4_Sub11(Static198.anInt3921 * 6 + 3);
			local21.method4957(1);
			local21.method4937(Static198.anInt3921);
			for (@Pc(35) int local35 = 0; local35 < Static419.anIntArray414.length; local35++) {
				if (Static225.aBooleanArray11[local35]) {
					local21.method4937(local35);
					local21.method4909(Static419.anIntArray414[local35]);
				}
			}
			local7.method7965(0, local21.aByteArray68, local21.anInt5831);
		} catch (@Pc(66) Exception local66) {
		}
		try {
			if (local7 != null) {
				local7.method7966();
			}
		} catch (@Pc(73) Exception local73) {
		}
		Static543.aLong252 = Static574.method8210();
		Static478.aBoolean619 = false;
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(B)V")
	public static void method5750() {
		Static413.anInt8212 = 0;
		for (@Pc(13) int local13 = 0; local13 < 2048; local13++) {
			Static275.aClass4_Sub11Array1[local13] = null;
			Static278.aByteArray67[local13] = 1;
			Static61.aClass41Array1[local13] = null;
		}
	}

	@OriginalMember(owner = "client!no", name = "f", descriptor = "(I)V")
	public static void method5751() {
		if (Static213.aFloat141 < 1024.0F) {
			Static213.aFloat141 = 1024.0F;
		}
		if (Static213.aFloat141 > 3072.0F) {
			Static213.aFloat141 = 3072.0F;
		}
		while (Static201.aFloat128 >= 16384.0F) {
			Static201.aFloat128 -= 16384.0F;
		}
		while (Static201.aFloat128 < 0.0F) {
			Static201.aFloat128 += 16384.0F;
		}
		@Pc(41) int local41 = Static60.anInt983 >> 9;
		@Pc(45) int local45 = Static557.anInt1156 >> 9;
		@Pc(51) int local51 = Static501.method5641(Static60.anInt983, Static13.anInt231, Static557.anInt1156);
		@Pc(53) int local53 = 0;
		@Pc(87) int local87;
		if (local41 > 3 && local45 > 3 && local41 < Static428.anInt8046 - 4 && local45 < Static119.anInt2717 - 4) {
			for (local87 = local41 - 4; local87 <= local41 + 4; local87++) {
				for (@Pc(93) int local93 = local45 - 4; local93 <= local45 + 4; local93++) {
					@Pc(97) int local97 = Static13.anInt231;
					if (local97 < 3 && Static310.method5267(local87, local93)) {
						local97++;
					}
					@Pc(108) int local108 = 0;
					if (Static130.aClass179_Sub1_3.aByteArrayArrayArray12 != null && Static130.aClass179_Sub1_3.aByteArrayArrayArray12[local97] != null) {
						local108 = (Static130.aClass179_Sub1_3.aByteArrayArrayArray12[local97][local87][local93] & 0xFF) * 8;
					}
					if (Static499.aClass83Array3 != null && Static499.aClass83Array3[local97] != null) {
						@Pc(148) int local148 = local51 + local108 - Static499.aClass83Array3[local97].method7217(local93, local87);
						if (local148 > local53) {
							local53 = local148;
						}
					}
				}
			}
		}
		local87 = (local53 >> 2) * 1536;
		if (local87 > 786432) {
			local87 = 786432;
		}
		if (local87 < 262144) {
			local87 = 262144;
		}
		if (local87 > Static445.anInt8282) {
			Static445.anInt8282 += (local87 - Static445.anInt8282) / 24;
		} else if (local87 < Static445.anInt8282) {
			Static445.anInt8282 += (local87 - Static445.anInt8282) / 80;
			return;
		}
	}
}
