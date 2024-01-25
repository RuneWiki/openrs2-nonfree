import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static328 {

	@OriginalMember(owner = "client!va", name = "R", descriptor = "Lclient!mo;")
	public static Class143 aClass143_110;

	@OriginalMember(owner = "client!va", name = "L", descriptor = "Lclient!al;")
	public static final Class11 aClass11_139 = new Class11(50);

	@OriginalMember(owner = "client!va", name = "O", descriptor = "I")
	public static int anInt6333 = 0;

	@OriginalMember(owner = "client!va", name = "P", descriptor = "[I")
	public static final int[] anIntArray606 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0 };

	@OriginalMember(owner = "client!va", name = "Q", descriptor = "Ljava/lang/String;")
	public static String aString237 = null;

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(ZZ)V")
	public static void method5649(@OriginalArg(0) boolean arg0) {
		Static54.aBoolean88 = arg0;
		@Pc(17) int local17;
		@Pc(21) int local21;
		@Pc(34) int local34;
		@Pc(38) int local38;
		@Pc(42) int local42;
		@Pc(46) int local46;
		@Pc(54) int local54;
		@Pc(58) int local58;
		@Pc(69) int local69;
		@Pc(199) int local199;
		@Pc(203) int local203;
		if (!Static54.aBoolean88) {
			local17 = Static30.aClass14_Sub4_Sub2_1.method2513();
			local21 = (Static327.anInt6307 - Static30.aClass14_Sub4_Sub2_1.anInt2637) / 16;
			Static169.anIntArrayArray55 = new int[local21][4];
			for (@Pc(390) int local390 = 0; local390 < local21; local390++) {
				for (local34 = 0; local34 < 4; local34++) {
					Static169.anIntArrayArray55[local390][local34] = Static30.aClass14_Sub4_Sub2_1.method2554();
				}
			}
			@Pc(425) boolean local425 = Static30.aClass14_Sub4_Sub2_1.method2513() == 1;
			local38 = Static30.aClass14_Sub4_Sub2_1.method2539();
			local42 = Static30.aClass14_Sub4_Sub2_1.method2499();
			local46 = Static30.aClass14_Sub4_Sub2_1.method2499();
			local54 = Static30.aClass14_Sub4_Sub2_1.method2499();
			local58 = Static30.aClass14_Sub4_Sub2_1.method2505();
			Static145.method5367(local38);
			Static243.anIntArray430 = new int[local21];
			Static113.aByteArrayArray6 = new byte[local21][];
			Static88.anIntArray193 = new int[local21];
			Static334.aByteArrayArray26 = new byte[local21][];
			Static196.aByteArrayArray14 = new byte[local21][];
			Static179.aByteArrayArray9 = null;
			Static54.anIntArray80 = new int[local21];
			Static196.aByteArrayArray13 = new byte[local21][];
			Static37.anIntArray55 = null;
			Static8.anIntArray9 = new int[local21];
			Static167.anIntArray485 = new int[local21];
			@Pc(481) boolean local481 = false;
			if ((local54 / 8 == 48 || local54 / 8 == 49) && local42 / 8 == 48) {
				local481 = true;
			}
			if (local54 / 8 == 48 && local42 / 8 == 148) {
				local481 = true;
			}
			local21 = 0;
			for (local69 = (local54 - (Static195.anInt3965 >> 4)) / 8; local69 <= ((Static195.anInt3965 >> 4) + local54) / 8; local69++) {
				for (local199 = (local42 - (Static298.anInt5716 >> 4)) / 8; local199 <= ((Static298.anInt5716 >> 4) + local42) / 8; local199++) {
					local203 = local199 + (local69 << 8);
					if (local481 && (local199 == 49 || local199 == 149 || local199 == 147 || local69 == 50 || local69 == 49 && local199 == 47)) {
						Static8.anIntArray9[local21] = local203;
						Static243.anIntArray430[local21] = -1;
						Static88.anIntArray193[local21] = -1;
						Static167.anIntArray485[local21] = -1;
						Static54.anIntArray80[local21] = -1;
					} else {
						Static8.anIntArray9[local21] = local203;
						Static243.anIntArray430[local21] = Static231.aClass143_85.method3765("m" + local69 + "_" + local199);
						Static88.anIntArray193[local21] = Static231.aClass143_85.method3765("l" + local69 + "_" + local199);
						Static167.anIntArray485[local21] = Static231.aClass143_85.method3765("um" + local69 + "_" + local199);
						Static54.anIntArray80[local21] = Static231.aClass143_85.method3765("ul" + local69 + "_" + local199);
					}
					local21++;
				}
			}
			Static63.method1496(false, local17, local54, local425, local58, local46, local42);
			return;
		}
		local17 = Static30.aClass14_Sub4_Sub2_1.method2505();
		local21 = Static30.aClass14_Sub4_Sub2_1.method2499();
		@Pc(30) boolean local30 = Static30.aClass14_Sub4_Sub2_1.method2511() == 1;
		local34 = Static30.aClass14_Sub4_Sub2_1.method2539();
		local38 = Static30.aClass14_Sub4_Sub2_1.method2499();
		local42 = Static30.aClass14_Sub4_Sub2_1.method2511();
		local46 = Static30.aClass14_Sub4_Sub2_1.method2499();
		Static145.method5367(local34);
		Static30.aClass14_Sub4_Sub2_1.method2556();
		@Pc(62) int local62;
		for (local54 = 0; local54 < 4; local54++) {
			for (local58 = 0; local58 < Static195.anInt3965 >> 3; local58++) {
				for (local62 = 0; local62 < Static298.anInt5716 >> 3; local62++) {
					local69 = Static30.aClass14_Sub4_Sub2_1.method2558(1);
					if (local69 == 1) {
						Static221.anIntArrayArrayArray11[local54][local58][local62] = Static30.aClass14_Sub4_Sub2_1.method2558(26);
					} else {
						Static221.anIntArrayArrayArray11[local54][local58][local62] = -1;
					}
				}
			}
		}
		Static30.aClass14_Sub4_Sub2_1.method2559();
		local58 = (Static327.anInt6307 - Static30.aClass14_Sub4_Sub2_1.anInt2637) / 16;
		Static169.anIntArrayArray55 = new int[local58][4];
		for (local62 = 0; local62 < local58; local62++) {
			for (local69 = 0; local69 < 4; local69++) {
				Static169.anIntArrayArray55[local62][local69] = Static30.aClass14_Sub4_Sub2_1.method2510();
			}
		}
		Static88.anIntArray193 = new int[local58];
		Static167.anIntArray485 = new int[local58];
		Static37.anIntArray55 = null;
		Static196.aByteArrayArray13 = new byte[local58][];
		Static196.aByteArrayArray14 = new byte[local58][];
		Static54.anIntArray80 = new int[local58];
		Static8.anIntArray9 = new int[local58];
		Static334.aByteArrayArray26 = new byte[local58][];
		Static243.anIntArray430 = new int[local58];
		Static179.aByteArrayArray9 = null;
		Static113.aByteArrayArray6 = new byte[local58][];
		local58 = 0;
		for (local69 = 0; local69 < 4; local69++) {
			for (local199 = 0; local199 < Static195.anInt3965 >> 3; local199++) {
				for (local203 = 0; local203 < Static298.anInt5716 >> 3; local203++) {
					@Pc(213) int local213 = Static221.anIntArrayArrayArray11[local69][local199][local203];
					if (local213 != -1) {
						@Pc(223) int local223 = local213 >> 14 & 0x3FF;
						@Pc(229) int local229 = local213 >> 3 & 0x7FF;
						@Pc(240) int local240 = (local223 / 8 << 8) + (local229 / 8);
						for (@Pc(242) int local242 = 0; local242 < local58; local242++) {
							if (local240 == Static8.anIntArray9[local242]) {
								local240 = -1;
								break;
							}
						}
						if (local240 != -1) {
							Static8.anIntArray9[local58] = local240;
							@Pc(271) int local271 = local240 >> 8 & 0xFF;
							@Pc(275) int local275 = local240 & 0xFF;
							Static243.anIntArray430[local58] = Static231.aClass143_85.method3765("m" + local271 + "_" + local275);
							Static88.anIntArray193[local58] = Static231.aClass143_85.method3765("l" + local271 + "_" + local275);
							Static167.anIntArray485[local58] = Static231.aClass143_85.method3765("um" + local271 + "_" + local275);
							Static54.anIntArray80[local58] = Static231.aClass143_85.method3765("ul" + local271 + "_" + local275);
							local58++;
						}
					}
				}
			}
		}
		Static63.method1496(false, local42, local38, local30, local46, local17, local21);
	}

	@OriginalMember(owner = "client!va", name = "a", descriptor = "(Lclient!e;ILclient!mo;Lclient!mo;)V")
	public static void method5650(@OriginalArg(0) Class46 arg0, @OriginalArg(2) Class143 arg1, @OriginalArg(3) Class143 arg2) {
		Static205.aClass76_6 = Static307.method2744(Static291.anInt5610, arg2);
		Static170.aClass30_6 = arg0.method5093(Static205.aClass76_6, Static368.method5805(arg1, Static291.anInt5610));
		Static108.aClass76_5 = Static307.method2744(Static97.anInt2234, arg2);
		Static245.aClass30_7 = arg0.method5093(Static108.aClass76_5, Static368.method5805(arg1, Static97.anInt2234));
		Static223.aClass76_9 = Static307.method2744(Static181.anInt3757, arg2);
		Static164.aClass30_5 = arg0.method5093(Static223.aClass76_9, Static368.method5805(arg1, Static181.anInt3757));
	}
}
