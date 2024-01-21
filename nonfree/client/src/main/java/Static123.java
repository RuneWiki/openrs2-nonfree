import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static123 {

	@OriginalMember(owner = "client!mf", name = "c", descriptor = "Lclient!vc;")
	public static Class102 aClass102_11;

	@OriginalMember(owner = "client!mf", name = "k", descriptor = "[Lclient!sf;")
	public static Class2_Sub22[] aClass2_Sub22Array11;

	@OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
	public static int anInt4488;

	@OriginalMember(owner = "client!mf", name = "n", descriptor = "I")
	public static int anInt4489;

	@OriginalMember(owner = "client!mf", name = "p", descriptor = "Lclient!la;")
	public static Class56 aClass56_19;

	@OriginalMember(owner = "client!mf", name = "e", descriptor = "I")
	public static final int anInt4484 = 4;

	@OriginalMember(owner = "client!mf", name = "g", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_1531 = Static151.method2243("This world is full)3");

	@OriginalMember(owner = "client!mf", name = "h", descriptor = "[[Lclient!qi;")
	public static final Class84[][] aClass84ArrayArray11 = new Class84[anInt4484][500];

	@OriginalMember(owner = "client!mf", name = "j", descriptor = "Lclient!mb;")
	public static final Class62 aClass62_1532 = Static151.method2243("<br>(X100(U(Y");

	@OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
	public static final int[] anIntArray402 = new int[anInt4484];

	@OriginalMember(owner = "client!mf", name = "q", descriptor = "Lclient!mb;")
	public static Class62 aClass62_1533 = aClass62_1531;

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(Ljava/awt/Component;I)V")
	public static void method3145(@OriginalArg(0) Component arg0) {
		@Pc(1) Method local1 = Static75.aMethod1;
		if (local1 != null) {
			try {
				local1.invoke(arg0, Boolean.FALSE);
			} catch (@Pc(19) Throwable local19) {
			}
		}
		arg0.addKeyListener(Static51.aClass37_1);
		arg0.addFocusListener(Static51.aClass37_1);
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "(BII)Lclient!mb;")
	public static Class62 method3146(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) int local8 = arg1 - arg0;
		if (local8 < -9) {
			return Static147.aClass62_1086;
		} else if (local8 < -6) {
			return Static113.aClass62_862;
		} else if (local8 < -3) {
			return Static181.aClass62_1339;
		} else if (local8 < 0) {
			return Static199.aClass62_1448;
		} else if (local8 > 9) {
			return Static176.aClass62_1311;
		} else if (local8 > 6) {
			return Static176.aClass62_1312;
		} else if (local8 > 3) {
			return Static48.aClass62_329;
		} else if (local8 > 0) {
			return Static184.aClass62_714;
		} else {
			return Static118.aClass62_911;
		}
	}

	@OriginalMember(owner = "client!mf", name = "b", descriptor = "(III)Z")
	public static boolean method3147(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static115.anInt2531; local1++) {
			@Pc(6) Class84 local6 = Static164.aClass84Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3481 == 1) {
				local15 = local6.anInt3484 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3482 + (local6.anInt3472 * local15 >> 8);
					local37 = local6.anInt3470 + (local6.anInt3480 * local15 >> 8);
					local47 = local6.anInt3483 + (local6.anInt3485 * local15 >> 8);
					local57 = local6.anInt3479 + (local6.anInt3469 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3481 == 2) {
				local15 = arg0 - local6.anInt3484;
				if (local15 > 0) {
					local27 = local6.anInt3482 + (local6.anInt3472 * local15 >> 8);
					local37 = local6.anInt3470 + (local6.anInt3480 * local15 >> 8);
					local47 = local6.anInt3483 + (local6.anInt3485 * local15 >> 8);
					local57 = local6.anInt3479 + (local6.anInt3469 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3481 == 3) {
				local15 = local6.anInt3482 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3484 + (local6.anInt3487 * local15 >> 8);
					local37 = local6.anInt3474 + (local6.anInt3471 * local15 >> 8);
					local47 = local6.anInt3483 + (local6.anInt3485 * local15 >> 8);
					local57 = local6.anInt3479 + (local6.anInt3469 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3481 == 4) {
				local15 = arg2 - local6.anInt3482;
				if (local15 > 0) {
					local27 = local6.anInt3484 + (local6.anInt3487 * local15 >> 8);
					local37 = local6.anInt3474 + (local6.anInt3471 * local15 >> 8);
					local47 = local6.anInt3483 + (local6.anInt3485 * local15 >> 8);
					local57 = local6.anInt3479 + (local6.anInt3469 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3481 == 5) {
				local15 = arg1 - local6.anInt3483;
				if (local15 > 0) {
					local27 = local6.anInt3484 + (local6.anInt3487 * local15 >> 8);
					local37 = local6.anInt3474 + (local6.anInt3471 * local15 >> 8);
					local47 = local6.anInt3482 + (local6.anInt3472 * local15 >> 8);
					local57 = local6.anInt3470 + (local6.anInt3480 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!mf", name = "a", descriptor = "([BI)V")
	public static void method3149(@OriginalArg(0) byte[] arg0) {
		@Pc(7) int local7 = Static111.anInt2426 >> 2 << 10;
		@Pc(18) int local18 = 0;
		@Pc(22) int local22 = Static41.anInt4503 >> 1;
		@Pc(26) byte[][] local26 = new byte[Static173.anInt3686][Static104.anInt2340];
		while (true) {
			@Pc(40) int local40;
			@Pc(52) int local52;
			while (local18 < arg0.length) {
				local40 = (arg0[local18++] & 0xFF) * 64 - Static24.anInt573;
				local52 = (arg0[local18++] & 0xFF) * 64 - Static128.anInt142;
				if (local40 > 0 && local52 > 0 && local40 + 64 < Static173.anInt3686 && local52 + 64 < Static104.anInt2340) {
					for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
						@Pc(90) byte[] local90 = local26[local82 + local40];
						@Pc(97) int local97 = Static104.anInt2340 - local52 - 1;
						for (@Pc(99) int local99 = -64; local99 < 0; local99++) {
							local90[local97--] = arg0[local18++];
						}
					}
				} else {
					local18 += 4096;
				}
			}
			local40 = Static173.anInt3686;
			local52 = Static104.anInt2340;
			@Pc(130) int[] local130 = new int[local52];
			@Pc(133) int[] local133 = new int[local52];
			@Pc(136) int[] local136 = new int[local52];
			@Pc(139) int[] local139 = new int[local52];
			@Pc(142) int[] local142 = new int[local52];
			for (@Pc(144) int local144 = -5; local144 < local40; local144++) {
				@Pc(169) int local169;
				@Pc(236) int local236;
				for (@Pc(148) int local148 = 0; local148 < local52; local148++) {
					@Pc(154) int local154 = local144 + 5;
					@Pc(216) int local216;
					if (local154 < local40) {
						local169 = local26[local154][local148] & 0xFF;
						if (local169 > 0) {
							@Pc(180) Class2_Sub1_Sub1 local180 = Static19.method344(local169 - 1);
							local130[local148] += local180.anInt76;
							local133[local148] += local180.anInt73;
							local142[local148] += local180.anInt66;
							local136[local148] += local180.anInt82;
							local216 = local139[local148]++;
						}
					}
					local169 = local144 - 5;
					if (local169 >= 0) {
						local236 = local26[local169][local148] & 0xFF;
						if (local236 > 0) {
							@Pc(244) Class2_Sub1_Sub1 local244 = Static19.method344(local236 - 1);
							local130[local148] -= local244.anInt76;
							local133[local148] -= local244.anInt73;
							local142[local148] -= local244.anInt66;
							local136[local148] -= local244.anInt82;
							local216 = local139[local148]--;
						}
					}
				}
				if (local144 >= 0) {
					@Pc(299) int[][] local299 = Static46.anIntArrayArrayArray2[local144 >> 6];
					local169 = 0;
					local236 = 0;
					@Pc(305) int local305 = 0;
					@Pc(307) int local307 = 0;
					@Pc(309) int local309 = 0;
					for (@Pc(311) int local311 = -5; local311 < local52; local311++) {
						@Pc(317) int local317 = local311 + 5;
						@Pc(321) int local321 = local311 - 5;
						if (local317 < local52) {
							local305 += local142[local317];
							local236 += local133[local317];
							local307 += local136[local317];
							local169 += local130[local317];
							local309 += local139[local317];
						}
						if (local321 >= 0) {
							local236 -= local133[local321];
							local169 -= local130[local321];
							local309 -= local139[local321];
							local305 -= local142[local321];
							local307 -= local136[local321];
						}
						if (local311 >= 0 && local309 > 0) {
							@Pc(404) int local404 = local311 >> 6;
							@Pc(425) int local425 = local307 == 0 ? 0 : Static122.method1926(local169 * 256 / local307, local305 / local309, local236 / local309);
							if (local26[local144][local311] != 0) {
								@Pc(441) int local441 = (local425 & 0x7F) + local22;
								if (local299[local404] == null) {
									local299[local404] = Static46.anIntArrayArrayArray2[local144 >> 6][local404] = new int[4096];
								}
								if (local441 < 0) {
									local441 = 0;
								} else if (local441 > 127) {
									local441 = 127;
								}
								@Pc(484) int local484 = local441 + (local425 & 0x380) + (local425 + local7 & 0xFC00);
								local299[local404][(local144 & 0x3F) + ((local311 & 0x3F) << 6)] = Static45.anIntArray79[Static205.method2996(local484, 96)];
							} else if (local299[local404] != null) {
								local299[local404][(local144 & 0x3F) + ((local311 & 0x3F) << 6)] = 0;
							}
						}
					}
				}
			}
			return;
		}
	}
}
