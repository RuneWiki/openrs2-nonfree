import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static127 {

	@OriginalMember(owner = "client!me", name = "hc", descriptor = "I")
	public static int anInt2831;

	@OriginalMember(owner = "client!me", name = "nd", descriptor = "I")
	public static int anInt2863;

	@OriginalMember(owner = "client!me", name = "M", descriptor = "Lclient!ia;")
	private static Class51 aClass51_982 = Static64.method1101("Created gameworld");

	@OriginalMember(owner = "client!me", name = "Db", descriptor = "I")
	public static int anInt2811 = 0;

	@OriginalMember(owner = "client!me", name = "oc", descriptor = "Lclient!ia;")
	public static Class51 aClass51_986 = aClass51_982;

	@OriginalMember(owner = "client!me", name = "Cc", descriptor = "Lclient!ie;")
	public static Class53 aClass53_20 = new Class53(64);

	@OriginalMember(owner = "client!me", name = "ld", descriptor = "[I")
	public static int[] anIntArray188 = new int[] { 1, 1, 1, 1 };

	@OriginalMember(owner = "client!me", name = "md", descriptor = "I")
	public static int anInt2862 = 0;

	@OriginalMember(owner = "client!me", name = "od", descriptor = "Lclient!ia;")
	private static Class51 aClass51_989 = Static64.method1101("Checking for updates )2 ");

	@OriginalMember(owner = "client!me", name = "pd", descriptor = "Lclient!ia;")
	public static Class51 aClass51_990 = Static64.method1101("");

	@OriginalMember(owner = "client!me", name = "qd", descriptor = "I")
	public static int anInt2864 = 0;

	@OriginalMember(owner = "client!me", name = "rd", descriptor = "Lclient!ia;")
	public static Class51 aClass51_991 = aClass51_989;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)V")
	public static void method2201(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub1_Sub1 local13;
		if (Static21.aClass1_Sub2_Sub1_2 == null) {
			local13 = new Class1_Sub2_Sub1_Sub1(512, 512);
		} else {
			local13 = (Class1_Sub2_Sub1_Sub1) Static21.aClass1_Sub2_Sub1_2;
		}
		@Pc(21) int[] local21 = local13.anIntArray157;
		@Pc(24) int local24 = local21.length;
		for (@Pc(26) int local26 = 0; local26 < local24; local26++) {
			local21[local26] = 1;
		}
		@Pc(51) int local51;
		@Pc(53) int local53;
		for (@Pc(38) int local38 = 1; local38 < 103; local38++) {
			local51 = (103 - local38) * 4 * 512 + 24628;
			for (local53 = 1; local53 < 103; local53++) {
				if ((Static150.aByteArrayArrayArray9[arg0][local53][local38] & 0x18) == 0) {
					Static158.method2686(local21, local51, arg0, local53, local38);
				}
				if (arg0 < 3 && (Static150.aByteArrayArrayArray9[arg0 + 1][local53][local38] & 0x8) != 0) {
					Static158.method2686(local21, local51, arg0 + 1, local53, local38);
				}
				local51 += 4;
			}
		}
		local13.method2082();
		local51 = ((int) (Math.random() * 20.0D) + 238 - 10 << 16) - (-((int) (Math.random() * 20.0D) + 238 - 10 << 8) - 238) + (int) (Math.random() * 20.0D) - 10;
		local53 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
		@Pc(167) int local167;
		for (@Pc(163) int local163 = 1; local163 < 103; local163++) {
			for (local167 = 1; local167 < 103; local167++) {
				if ((Static150.aByteArrayArrayArray9[arg0][local167][local163] & 0x18) == 0) {
					Static211.method3501(arg0, local163, local167, local53, local51);
				}
				if (arg0 < 3 && (Static150.aByteArrayArrayArray9[arg0 + 1][local167][local163] & 0x8) != 0) {
					Static211.method3501(arg0 + 1, local163, local167, local53, local51);
				}
			}
		}
		Static81.anInt1806 = 0;
		for (local167 = 0; local167 < 104; local167++) {
			for (@Pc(235) int local235 = 0; local235 < 104; local235++) {
				@Pc(242) long local242 = Static224.method3674(Static197.anInt2422, local167, local235);
				if (local242 != 0L) {
					@Pc(257) Class82 local257 = Static9.method132((int) (local242 >>> 32) & Integer.MAX_VALUE);
					@Pc(260) int local260 = local257.anInt3274;
					@Pc(265) int local265;
					if (local257.anIntArray221 != null) {
						for (local265 = 0; local265 < local257.anIntArray221.length; local265++) {
							if (local257.anIntArray221[local265] != -1) {
								@Pc(281) Class82 local281 = Static9.method132(local257.anIntArray221[local265]);
								if (local281.anInt3274 >= 0) {
									local260 = local281.anInt3274;
									break;
								}
							}
						}
					}
					if (local260 >= 0) {
						local265 = local167;
						@Pc(304) int local304 = local235;
						if (local260 != 22 && local260 != 29 && local260 != 34 && local260 != 36 && local260 != 46 && local260 != 47 && local260 != 48) {
							@Pc(340) int[][] local340 = Static228.aClass90Array1[Static197.anInt2422].anIntArrayArray22;
							for (@Pc(342) int local342 = 0; local342 < 10; local342++) {
								@Pc(349) int local349 = (int) (Math.random() * 4.0D);
								if (local349 == 0 && local265 > 0 && local167 - 3 < local265 && (local340[local265 - 1][local304] & 0x12C0108) == 0) {
									local265--;
								}
								if (local349 == 1 && local265 < 103 && local167 + 3 > local265 && (local340[local265 + 1][local304] & 0x12C0180) == 0) {
									local265++;
								}
								if (local349 == 2 && local304 > 0 && local304 > local235 - 3 && (local340[local265][local304 - 1] & 0x12C0102) == 0) {
									local304--;
								}
								if (local349 == 3 && local304 < 103 && local235 + 3 > local304 && (local340[local265][local304 + 1] & 0x12C0120) == 0) {
									local304++;
								}
							}
						}
						Static110.anIntArray90[Static81.anInt1806] = local257.anInt3296;
						Static38.anIntArray54[Static81.anInt1806] = local265;
						Static126.anIntArray171[Static81.anInt1806] = local304;
						Static81.anInt1806++;
					}
				}
			}
		}
		Static21.aClass1_Sub2_Sub1_2 = local13;
		Static210.aClass19_1.method885();
	}

	@OriginalMember(owner = "client!me", name = "b", descriptor = "(I)V")
	public static void method2209() {
		if (Static116.anInt1292 > 0) {
			Static59.method1033();
		} else {
			Static142.method2482(40);
			Static128.aClass11_43 = Static192.aClass11_36;
			Static192.aClass11_36 = null;
		}
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(BIILclient!mb;)Lclient!ak;")
	public static Class1_Sub2_Sub1_Sub1 method2214(@OriginalArg(2) int arg0, @OriginalArg(3) Class70 arg1) {
		return Static36.method640(arg0, arg1) ? Static106.method1808() : null;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(IBIII)V")
	public static void method2215(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		Static165.method2812();
		Static167.aClass1_Sub16_Sub1_2.anInt4860 = 0;
		Static167.aClass1_Sub16_Sub1_2.method3765(175);
		Static167.aClass1_Sub16_Sub1_2.method3765(arg1);
		Static167.aClass1_Sub16_Sub1_2.method3765(arg2);
		Static167.aClass1_Sub16_Sub1_2.method3807(arg0);
		Static167.aClass1_Sub16_Sub1_2.method3807(arg3);
		Static201.anInt4264 = 1;
		Static176.anInt3867 = 1;
	}
}
