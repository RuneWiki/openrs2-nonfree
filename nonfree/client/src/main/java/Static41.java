import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static41 {

	@OriginalMember(owner = "client!bv", name = "B", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_3 = new Class98(11, 0, 1, 2);

	@OriginalMember(owner = "client!bv", name = "L", descriptor = "Z")
	public static boolean aBoolean74 = true;

	@OriginalMember(owner = "client!bv", name = "M", descriptor = "Lclient!bg;")
	public static final Class22 aClass22_45 = new Class22(69, -1);

	@OriginalMember(owner = "client!bv", name = "N", descriptor = "I")
	public static int anInt759 = 0;

	@OriginalMember(owner = "client!bv", name = "O", descriptor = "[I")
	public static final int[] anIntArray46 = new int[5];

	@OriginalMember(owner = "client!bv", name = "P", descriptor = "Z")
	public static boolean aBoolean75 = false;

	@OriginalMember(owner = "client!bv", name = "Q", descriptor = "Z")
	public static boolean aBoolean76 = true;

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(Lclient!fk;I)V")
	public static void method727(@OriginalArg(0) Class3_Sub3 arg0) {
		arg0.aClass16_1 = null;
		@Pc(12) int local12 = arg0.aClass3_Sub5Array1.length;
		for (@Pc(18) int local18 = 0; local18 < local12; local18++) {
			arg0.aClass3_Sub5Array1[local18].aBoolean419 = false;
		}
		@Pc(36) Class84[] local36 = Class147.aClass84Array1;
		synchronized (Class147.aClass84Array1) {
			if (local12 < Class147.aClass84Array1.length && Static95.anIntArray154[local12] < 200) {
				Class147.aClass84Array1[local12].method2305(arg0);
				@Pc(65) int local65 = Static95.anIntArray154[local12]++;
			}
		}
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(ILclient!cw;IILclient!lh;)V")
	public static void method729(@OriginalArg(0) int arg0, @OriginalArg(1) Class4_Sub12_Sub1 arg1, @OriginalArg(2) int arg2, @OriginalArg(4) Class16_Sub1_Sub5_Sub1 arg3) {
		@Pc(7) byte local7 = -1;
		if ((arg0 & 0x40) != 0) {
			arg3.anInt4323 = arg1.method2536();
			if (arg3.anInt6086 == 0) {
				arg3.method4743(arg3.anInt4323);
				arg3.anInt4323 = -1;
			}
		}
		if ((arg0 & 0x400) != 0) {
			arg3.aString60 = arg1.method2537();
			if (arg3.aString60.charAt(0) == '~') {
				arg3.aString60 = arg3.aString60.substring(1);
				Static128.method2268(0, 2, arg3.aString60, arg3.method3428(), arg3.method3432());
			} else if (Static1.aClass16_Sub1_Sub5_Sub1_1 == arg3) {
				Static128.method2268(0, 2, arg3.aString60, arg3.method3428(), arg3.method3432());
			}
			arg3.anInt6064 = 0;
			arg3.anInt6077 = 150;
			arg3.anInt6084 = 0;
		}
		if ((arg0 & 0x8000) != 0) {
			arg3.anInt6043 = arg1.method2534();
			arg3.anInt6052 = arg1.method2542();
			arg3.anInt6044 = arg1.method2534();
			arg3.anInt6074 = arg1.method2542();
			arg3.anInt6018 = arg1.method2536() + Static24.anInt5323;
			arg3.anInt6023 = arg1.method2548() + Static24.anInt5323;
			arg3.lb = arg1.method2520();
			arg3.anInt6087 = 0;
			if (arg3.aBoolean401) {
				arg3.anInt6086 = 0;
				arg3.anInt6043 += arg3.anInt4335;
				arg3.anInt6052 += arg3.anInt4317;
				arg3.anInt6074 += arg3.anInt4317;
				arg3.anInt6044 += arg3.anInt4335;
			} else {
				arg3.anInt6044 += arg3.anIntArray426[0];
				arg3.anInt6043 += arg3.anIntArray426[0];
				arg3.anInt6074 += arg3.anIntArray427[0];
				arg3.anInt6086 = 1;
				arg3.anInt6052 += arg3.anIntArray427[0];
			}
		}
		@Pc(243) int local243;
		if ((arg0 & 0x800) != 0) {
			local243 = arg1.method2548();
			arg3.anInt6051 = arg1.method2490();
			arg3.anInt6054 = arg1.method2520();
			arg3.aBoolean559 = (local243 & 0x8000) != 0;
			arg3.anInt6041 = local243 & 0x7FFF;
			arg3.anInt6035 = Static24.anInt5323 + arg3.anInt6041 + arg3.anInt6051;
		}
		if ((arg0 & 0x10000) != 0) {
			local243 = arg1.method2490();
			@Pc(297) int[] local297 = new int[local243];
			@Pc(300) int[] local300 = new int[local243];
			@Pc(303) int[] local303 = new int[local243];
			for (@Pc(305) int local305 = 0; local305 < local243; local305++) {
				@Pc(311) int local311 = arg1.method2536();
				if (local311 == 65535) {
					local311 = -1;
				}
				local297[local305] = local311;
				local300[local305] = arg1.method2489();
				local303[local305] = arg1.method2538();
			}
			Static375.method5000(local303, local300, arg3, local297);
		}
		@Pc(363) int local363;
		@Pc(367) int local367;
		if ((arg0 & 0x40000) != 0) {
			local243 = arg1.method2538();
			if (local243 == 65535) {
				local243 = -1;
			}
			local363 = arg1.method2510();
			local367 = arg1.method2523();
			arg3.method4748(local367, local363, true, local243);
		}
		if ((arg0 & 0x1) != 0) {
			Static411.aByteArray95[arg2] = arg1.method2507();
		}
		if ((arg0 & 0x2) != 0) {
			local243 = arg1.method2515();
			if (local243 == 65535) {
				local243 = -1;
			}
			arg3.anInt6034 = local243;
		}
		if ((arg0 & 0x80) != 0) {
			local243 = arg1.method2548();
			local363 = arg1.method2520();
			local367 = arg1.method2520();
			@Pc(427) int local427 = arg1.anInt2997;
			@Pc(435) boolean local435 = (local243 & 0x8000) != 0;
			if (arg3.aString44 != null && arg3.aClass37_1 != null) {
				@Pc(443) boolean local443 = false;
				if (local363 <= 1) {
					if (!local435 && (Static109.aBoolean628 && !Static396.aBoolean443 || Static308.aBoolean486)) {
						local443 = true;
					} else if (Static239.method3549(arg3.aString44)) {
						local443 = true;
					}
				}
				if (!local443 && Static65.anInt1373 == 0) {
					Static154.aClass4_Sub12_2.anInt2997 = 0;
					arg1.method2508(local367, Static154.aClass4_Sub12_2.aByteArray36);
					Static154.aClass4_Sub12_2.anInt2997 = 0;
					@Pc(489) int local489 = -1;
					@Pc(508) String local508;
					if (local435) {
						local243 &= 0x7FFF;
						@Pc(499) Class257 local499 = Static419.method5378(Static154.aClass4_Sub12_2);
						local489 = local499.anInt7070;
						local508 = local499.aClass4_Sub1_Sub3_1.method234(Static154.aClass4_Sub12_2);
					} else {
						local508 = Static22.method297(Static261.method3776(Static154.aClass4_Sub12_2));
					}
					arg3.aString60 = local508.trim();
					arg3.anInt6077 = 150;
					arg3.anInt6064 = local243 & 0xFF;
					arg3.anInt6084 = local243 >> 8;
					@Pc(549) int local549;
					if (local363 == 1 || local363 == 2) {
						local549 = local435 ? 17 : 1;
					} else {
						local549 = local435 ? 17 : 2;
					}
					if (local363 == 2) {
						Static426.method5438(local489, "<img=1>" + arg3.method3432(), local508, null, 0, "<img=1>" + arg3.method3428(), local549);
					} else if (local363 == 1) {
						Static426.method5438(local489, "<img=0>" + arg3.method3432(), local508, null, 0, "<img=0>" + arg3.method3428(), local549);
					} else {
						Static426.method5438(local489, arg3.method3432(), local508, null, 0, arg3.method3428(), local549);
					}
				}
			}
			arg1.anInt2997 = local367 + local427;
		}
		if ((arg0 & 0x1000) != 0) {
			local243 = arg1.method2538();
			if (local243 == 65535) {
				local243 = -1;
			}
			local363 = arg1.method2529();
			local367 = arg1.method2489();
			arg3.method4748(local367, local363, false, local243);
		}
		if ((arg0 & 0x8) != 0) {
			local243 = arg1.method2536();
			if (local243 == 65535) {
				local243 = -1;
			}
			local363 = arg1.method2490();
			Static18.method185(local363, arg3, local243);
		}
		if ((arg0 & 0x20000) != 0) {
			arg3.aByte71 = arg1.method2507();
			arg3.aByte69 = arg1.method2534();
			arg3.aByte70 = arg1.method2542();
			arg3.aByte68 = (byte) arg1.method2489();
			arg3.anInt6020 = Static24.anInt5323 + arg1.method2548();
			arg3.anInt6068 = Static24.anInt5323 + arg1.method2538();
		}
		if ((arg0 & 0x200) != 0) {
			local7 = arg1.method2507();
		}
		if ((arg0 & 0x10) != 0) {
			local243 = arg1.method2506();
			local363 = arg1.method2520();
			arg3.method4746(local243, Static24.anInt5323, local363);
			arg3.anInt6072 = Static24.anInt5323 + 300;
			arg3.anInt6026 = arg1.method2520();
		}
		if ((arg0 & 0x4000) != 0) {
			arg3.aBoolean400 = arg1.method2520() == 1;
		}
		if ((arg0 & 0x20) != 0) {
			local243 = arg1.method2490();
			@Pc(818) byte[] local818 = new byte[local243];
			@Pc(823) Class4_Sub12 local823 = new Class4_Sub12(local818);
			arg1.method2508(local243, local818);
			Static354.aClass4_Sub12Array1[arg2] = local823;
			arg3.method3422(local823);
		}
		if ((arg0 & 0x100) != 0) {
			local243 = Static24.anInt5323;
			local363 = arg1.method2506();
			local367 = arg1.method2489();
			arg3.method4746(local363, local243, local367);
		}
		if (!arg3.aBoolean401) {
			return;
		}
		if (local7 == 127) {
			arg3.method3426(arg3.anInt4317, arg3.anInt4335);
			return;
		}
		@Pc(884) byte local884;
		if (local7 == -1) {
			local884 = Static411.aByteArray95[arg2];
		} else {
			local884 = local7;
		}
		arg3.method3423(local884, arg3.anInt4317, arg3.anInt4335);
	}

	@OriginalMember(owner = "client!bv", name = "a", descriptor = "(I)V")
	public static void method730() {
		Static304.aClass183_39.method4138();
		for (@Pc(15) Class4_Sub39 local15 = (Class4_Sub39) Static206.aClass183_28.method4140(); local15 != null; local15 = (Class4_Sub39) Static206.aClass183_28.method4144()) {
			if (local15.anInt5699 < 1000) {
				local15.method5684();
				Static304.aClass183_39.method4137(local15);
			}
		}
		Static304.aClass183_39.method4149(Static206.aClass183_28);
		@Pc(43) int local43 = -1;
		@Pc(48) Class4_Sub5 local48 = (Class4_Sub5) Static413.aClass183_47.method4140();
		if (local48 != null) {
			local43 = local48.method515();
		}
		if (!Static234.aBoolean411) {
			if (local43 == 0 && (Static64.anInt1361 == 1 && Static407.anInt6710 > 2 || Static158.method2677())) {
				local43 = 2;
			}
			if (local43 == 2 && Static407.anInt6710 > 0 && local48 != null) {
				if (Static281.aClass247_12 == null && Static64.anInt1367 == 0) {
					Static344.method4658(local48.method519(), local48.method518());
				} else {
					Static194.anInt3685 = 2;
				}
			}
			if (local43 == 0 && Static407.anInt6710 > 0) {
				Static231.method3475();
			}
			if (Static281.aClass247_12 == null && Static64.anInt1367 == 0) {
				Static194.anInt3685 = 0;
				Static413.aClass4_Sub39_2 = null;
				return;
			}
			return;
		}
		@Pc(133) int local133;
		@Pc(137) int local137;
		if (local43 == -1) {
			local133 = Static420.aClass80_1.method2234();
			local137 = Static420.aClass80_1.method2230();
			if (Static310.anInt5424 - 10 > local133 || local133 > Static173.anInt3370 + Static310.anInt5424 + 10 || Static172.anInt3367 - 10 > local137 || local137 > Static112.anInt2392 + Static172.anInt3367 + 10) {
				Static234.aBoolean411 = false;
				Static302.method4103(Static310.anInt5424, Static112.anInt2392, Static173.anInt3370, Static172.anInt3367);
			}
		}
		if (local43 != 0) {
			return;
		}
		local133 = Static310.anInt5424;
		local137 = Static172.anInt3367;
		@Pc(188) int local188 = Static173.anInt3370;
		@Pc(194) int local194 = local48.method518();
		@Pc(198) int local198 = local48.method519();
		@Pc(200) int local200 = -1;
		@Pc(219) int local219;
		for (@Pc(202) int local202 = 0; local202 < Static407.anInt6710; local202++) {
			if (Static299.aBoolean481) {
				local219 = local137 + (-local202 + -1 + Static407.anInt6710) * 16 + 33;
				if (local194 > local133 && local194 < local133 + local188 && local198 > local219 - 13 && local198 < local219 + 4) {
					local200 = local202;
				}
			} else {
				local219 = local137 + (Static407.anInt6710 - local202 - 1) * 16 + 31;
				if (local133 < local194 && local188 + local133 > local194 && local219 - 13 < local198 && local219 + 3 > local198) {
					local200 = local202;
				}
			}
		}
		if (local200 != -1) {
			local219 = 0;
			@Pc(301) Class63 local301 = new Class63(Static206.aClass183_28);
			for (@Pc(306) Class4_Sub39 local306 = (Class4_Sub39) local301.method1611(); local306 != null; local306 = (Class4_Sub39) local301.method1612()) {
				if (local219 == local200) {
					Static247.method3617(local198, local306, local194);
				}
				local219++;
			}
		}
		Static234.aBoolean411 = false;
		Static302.method4103(Static310.anInt5424, Static112.anInt2392, Static173.anInt3370, Static172.anInt3367);
	}
}
