import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cj", name = "i", descriptor = "Lclient!rn;")
	public static Class155 aClass155_21;

	@OriginalMember(owner = "client!cj", name = "j", descriptor = "[I")
	public static int[] anIntArray60;

	@OriginalMember(owner = "client!cj", name = "g", descriptor = "Lclient!fk;")
	public static Class56 aClass56_4 = new Class56();

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "Z")
	public static boolean aBoolean55 = false;

	@OriginalMember(owner = "client!cj", name = "l", descriptor = "Z")
	public static boolean aBoolean56 = false;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
	public static int[] anIntArray61 = new int[256];

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
	public static int anInt680 = 50;

	@OriginalMember(owner = "client!cj", name = "q", descriptor = "I")
	public static int anInt681 = 0;

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "I")
	public static int anInt682 = 0;

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
	public static void method561() {
		Static123.aClass98_15.method2571();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)Z")
	public static boolean method562(@OriginalArg(1) int arg0) {
		if (arg0 == Static244.anInt4961) {
			return false;
		}
		Static222.anIntArrayArray62 = new int[104][104];
		Static249.anIntArrayArray70 = new int[104][104];
		Static120.anIntArrayArrayArray9 = new int[4][13][13];
		Static57.anIntArrayArray14 = new int[104][104];
		Static158.anIntArrayArray46 = new int[104][104];
		for (@Pc(34) int local34 = 0; local34 < 4; local34++) {
			Static138.aClass153Array1[local34] = new Class153(104, 104);
		}
		Static126.aByteArrayArrayArray15 = new byte[4][104][104];
		Static41.aByteArrayArrayArray2 = new byte[4][104][104];
		Static223.aClass56ArrayArrayArray1 = new Class56[4][104][104];
		if (Static283.aBoolean393) {
			Static142.method2409();
			Static193.method3202();
			Static43.aClass74ArrayArray1 = new Class74[13][13];
		}
		Static244.anInt4961 = arg0;
		return true;
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(JZ)V")
	public static void method563(@OriginalArg(0) long arg0) {
		if (!Static247.aBoolean348) {
			Static179.aFloat48 += Static258.aFloat65 * (float) arg0 / 40.0F;
			Static84.aFloat21 += (float) arg0 * Static199.aFloat53 / 40.0F;
		}
		@Pc(31) int local31 = Static224.anInt6078;
		@Pc(39) int local39;
		@Pc(47) int local47;
		if (Static308.anInt6040 != local31) {
			local39 = local31 - Static308.anInt6040;
			local47 = (int) (arg0 * (long) local39 / 320L);
			if (local39 <= 0) {
				if (local47 == 0) {
					local47 = -1;
				} else if (local47 < local39) {
					local47 = local39;
				}
			} else if (local47 == 0) {
				local47 = 1;
			} else if (local47 > local39) {
				local47 = local39;
			}
			Static308.anInt6040 += local47;
		}
		@Pc(84) int local84 = Static306.anInt6010;
		if (Static2.anInt22 != local84) {
			local39 = local84 - Static2.anInt22;
			local47 = (int) (arg0 * (long) local39 / 320L);
			if (local39 > 0) {
				if (local47 == 0) {
					local47 = 1;
				} else if (local47 > local39) {
					local47 = local39;
				}
			} else if (local47 == 0) {
				local47 = -1;
			} else if (local39 > local47) {
				local47 = local39;
			}
			Static2.anInt22 += local47;
		}
		Static197.method4292();
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILclient!rg;I)I")
	public static int method565(@OriginalArg(1) Class151 arg0, @OriginalArg(2) int arg1) {
		if (arg0.anIntArrayArray66 == null || arg0.anIntArrayArray66.length <= arg1) {
			return -2;
		}
		try {
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = 0;
			@Pc(31) int[] local31 = arg0.anIntArrayArray66[arg1];
			@Pc(33) byte local33 = 0;
			while (true) {
				@Pc(38) int local38 = local31[local24++];
				@Pc(40) int local40 = 0;
				@Pc(42) byte local42 = 0;
				if (local38 == 0) {
					return local26;
				}
				if (local38 == 1) {
					local40 = Static170.anIntArray386[local31[local24++]];
				}
				if (local38 == 2) {
					local40 = Static210.anIntArray457[local31[local24++]];
				}
				if (local38 == 3) {
					local40 = Static262.anIntArray559[local31[local24++]];
				}
				if (local38 == 15) {
					local42 = 1;
				}
				if (local38 == 16) {
					local42 = 2;
				}
				if (local38 == 17) {
					local42 = 3;
				}
				@Pc(117) int local117;
				@Pc(128) Class151 local128;
				@Pc(133) int local133;
				@Pc(146) int local146;
				if (local38 == 4) {
					local117 = local31[local24++] << 16;
					@Pc(124) int local124 = local117 + local31[local24++];
					local128 = Static243.method4115(local124);
					local133 = local31[local24++];
					if (local133 != -1 && (!Static133.method2309(local133).aBoolean44 || Static94.aBoolean140)) {
						for (local146 = 0; local146 < local128.anIntArray511.length; local146++) {
							if (local133 + 1 == local128.anIntArray511[local146]) {
								local40 += local128.anIntArray515[local146];
							}
						}
					}
				}
				if (local38 == 5) {
					local40 = Static161.anIntArray347[local31[local24++]];
				}
				if (local38 == 6) {
					local40 = Class31.anIntArray83[Static210.anIntArray457[local31[local24++]] - 1];
				}
				if (local38 == 7) {
					local40 = Static161.anIntArray347[local31[local24++]] * 100 / 46875;
				}
				if (local38 == 8) {
					local40 = Static136.aClass10_Sub5_Sub1_1.anInt3590;
				}
				if (local38 == 9) {
					for (local117 = 0; local117 < 25; local117++) {
						if (Static293.aBooleanArray130[local117]) {
							local40 += Static210.anIntArray457[local117];
						}
					}
				}
				if (local38 == 10) {
					local117 = local31[local24++] << 16;
					local117 += local31[local24++];
					local128 = Static243.method4115(local117);
					local133 = local31[local24++];
					if (local133 != -1 && (!Static133.method2309(local133).aBoolean44 || Static94.aBoolean140)) {
						for (local146 = 0; local146 < local128.anIntArray511.length; local146++) {
							if (local128.anIntArray511[local146] == local133 + 1) {
								local40 = 999999999;
								break;
							}
						}
					}
				}
				if (local38 == 11) {
					local40 = Static105.anInt1943;
				}
				if (local38 == 12) {
					local40 = Static117.anInt2182;
				}
				if (local38 == 13) {
					local117 = Static161.anIntArray347[local31[local24++]];
					@Pc(341) int local341 = local31[local24++];
					local40 = (0x1 << local341 & local117) == 0 ? 0 : 1;
				}
				if (local38 == 14) {
					local117 = local31[local24++];
					local40 = Static293.method4801(local117);
				}
				if (local38 == 18) {
					local40 = Static101.anInt1844 + (Static136.aClass10_Sub5_Sub1_1.anInt5073 >> 7);
				}
				if (local38 == 19) {
					local40 = (Static136.aClass10_Sub5_Sub1_1.anInt5016 >> 7) + Static43.anInt798;
				}
				if (local38 == 20) {
					local40 = local31[local24++];
				}
				if (local42 == 0) {
					if (local33 == 0) {
						local26 += local40;
					}
					if (local33 == 1) {
						local26 -= local40;
					}
					if (local33 == 2 && local40 != 0) {
						local26 /= local40;
					}
					if (local33 == 3) {
						local26 *= local40;
					}
					local33 = 0;
				} else {
					local33 = local42;
				}
			}
		} catch (@Pc(447) Exception local447) {
			return -1;
		}
	}
}
