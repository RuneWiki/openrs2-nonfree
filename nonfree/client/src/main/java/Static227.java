import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static227 {

	@OriginalMember(owner = "client!qi", name = "j", descriptor = "I")
	public static int anInt2803;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(I)V")
	public static void method2498() {
		Static215.aClass3_Sub26_Sub1_2.method3958(255);
		Static215.aClass3_Sub26_Sub1_2.method3907(0);
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(IZ)V")
	public static void method2500(@OriginalArg(1) boolean arg0) {
		Static174.method2872();
		if (Static10.anInt190 != 30 && Static10.anInt190 != 25) {
			return;
		}
		Static314.anInt6133++;
		if (Static314.anInt6133 < 50 && !arg0) {
			return;
		}
		Static314.anInt6133 = 0;
		if (!Static305.aBoolean427 && Static150.aClass139_3 != null) {
			Static215.aClass3_Sub26_Sub1_2.method3958(5);
			try {
				Static150.aClass139_3.method3556(Static215.aClass3_Sub26_Sub1_2.aByteArray64, Static215.aClass3_Sub26_Sub1_2.anInt4615);
				Static215.aClass3_Sub26_Sub1_2.anInt4615 = 0;
			} catch (@Pc(62) IOException local62) {
				Static305.aBoolean427 = true;
			}
		}
		Static174.method2872();
	}

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(ZI)Z")
	public static boolean method2502(@OriginalArg(1) int arg0) {
		@Pc(35) int local35;
		@Pc(37) int local37;
		@Pc(71) int local71;
		@Pc(75) int local75;
		if (Static233.aClass3_Sub4_Sub12_Sub2_4 == null) {
			if (Static283.aBoolean393 || Static98.aClass3_Sub4_Sub12_1 == null) {
				Static233.aClass3_Sub4_Sub12_Sub2_4 = new Class3_Sub4_Sub12_Sub2(512, 512);
			} else {
				Static233.aClass3_Sub4_Sub12_Sub2_4 = (Class3_Sub4_Sub12_Sub2) Static98.aClass3_Sub4_Sub12_1;
			}
			@Pc(32) int[] local32 = Static233.aClass3_Sub4_Sub12_Sub2_4.anIntArray596;
			local35 = local32.length;
			for (local37 = 0; local37 < local35; local37++) {
				local32[local37] = 1;
			}
			for (local37 = 1; local37 < 103; local37++) {
				local71 = (103 - local37) * 512 * 4 + 24628;
				for (local75 = 1; local75 < 103; local75++) {
					if ((Static41.aByteArrayArrayArray2[arg0][local75][local37] & 0x18) == 0) {
						Static233.method3953(local32, local71, arg0, local75, local37);
					}
					if (arg0 < 3 && (Static41.aByteArrayArrayArray2[arg0 + 1][local75][local37] & 0x8) != 0) {
						Static233.method3953(local32, local71, arg0 + 1, local75, local37);
					}
					local71 += 4;
				}
			}
			Static7.anInt166 = 0;
			for (local37 = 0; local37 < 104; local37++) {
				for (local71 = 0; local71 < 104; local71++) {
					@Pc(161) long local161 = Static56.method917(arg0, local37 + 0, local71);
					if (local161 == 0L) {
						local161 = Static75.method1163(arg0, local37 + 0, local71);
					}
					if (local161 == 0L) {
						local161 = Static148.method2517(arg0, local37 + 0, local71);
					}
					if (local161 == 0L) {
						local161 = Static272.method2771(arg0, local37 + 0, local71);
					}
					if (local161 != 0L) {
						@Pc(221) Class49 local221 = Static175.method2874((int) (local161 >>> 32) & Integer.MAX_VALUE);
						if (!local221.aBoolean115 || Static94.aBoolean140) {
							@Pc(229) int local229 = local221.anInt1377;
							if (local221.anIntArray131 != null) {
								for (@Pc(235) int local235 = 0; local235 < local221.anIntArray131.length; local235++) {
									if (local221.anIntArray131[local235] != -1) {
										@Pc(255) Class49 local255 = Static175.method2874(local221.anIntArray131[local235]);
										if (local255.anInt1377 >= 0) {
											local229 = local255.anInt1377;
										}
									}
								}
							}
							if (local229 >= 0) {
								@Pc(277) Class40 local277 = Static96.method1438(local229);
								@Pc(279) boolean local279 = false;
								@Pc(283) int local283 = local71;
								if (local277 != null && local277.aBoolean90) {
									local279 = true;
								}
								@Pc(295) int local295 = local37;
								if (local279) {
									@Pc(303) int[][] local303 = Static138.aClass153Array1[arg0].anIntArrayArray69;
									for (@Pc(305) int local305 = 0; local305 < 10; local305++) {
										@Pc(313) int local313 = (int) (Math.random() * 4.0D);
										if (local313 == 0 && local295 > 0 && local295 > local37 - 3 && (local303[local295 - 1][local283] & 0x2C0108) == 0) {
											local295--;
										}
										if (local313 == 1 && local295 < 103 && local37 + 3 > local295 && (local303[local295 + 1][local283] & 0x2C0180) == 0) {
											local295++;
										}
										if (local313 == 2 && local283 > 0 && local283 > local71 - 3 && (local303[local295][local283 - 1] & 0x2C0102) == 0) {
											local283--;
										}
										if (local313 == 3 && local283 < 103 && local71 + 3 > local283 && (local303[local295][local283 + 1] & 0x2C0120) == 0) {
											local283++;
										}
									}
								}
								Static209.anIntArray625[Static7.anInt166] = local221.anInt1376;
								Static235.anIntArray506[Static7.anInt166] = local295;
								Static134.anIntArray481[Static7.anInt166] = local283;
								Static7.anInt166++;
							}
						}
					}
				}
			}
		}
		Static233.aClass3_Sub4_Sub12_Sub2_4.method4710();
		local35 = (int) (Math.random() * 20.0D) + 228 << 16;
		@Pc(495) int local495 = ((int) (Math.random() * 20.0D) + 238 - 10 << 8) + (((int) (Math.random() * 20.0D) + 228 << 16) + (int) (Math.random() * 20.0D) + 238 - 10);
		for (local37 = 1; local37 < 103; local37++) {
			for (local71 = 1; local71 < 103; local71++) {
				if ((Static41.aByteArrayArrayArray2[arg0][local71][local37] & 0x18) == 0 && !Static307.method4931(local35, local495, local37, local71, arg0)) {
					if (Static283.aBoolean393) {
						Static143.anIntArray316 = null;
					} else {
						Static94.aClass128_1.method4293();
					}
					return false;
				}
				if (arg0 < 3 && (Static41.aByteArrayArrayArray2[arg0 + 1][local71][local37] & 0x8) != 0 && !Static307.method4931(local35, local495, local37, local71, arg0 + 1)) {
					if (Static283.aBoolean393) {
						Static143.anIntArray316 = null;
					} else {
						Static94.aClass128_1.method4293();
					}
					return false;
				}
			}
		}
		if (Static283.aBoolean393) {
			@Pc(607) int[] local607 = Static233.aClass3_Sub4_Sub12_Sub2_4.anIntArray596;
			local71 = local607.length;
			for (local75 = 0; local75 < local71; local75++) {
				if (local607[local75] == 0) {
					local607[local75] = 1;
				}
			}
			Static98.aClass3_Sub4_Sub12_1 = new Class3_Sub4_Sub12_Sub1(Static233.aClass3_Sub4_Sub12_Sub2_4);
		} else {
			Static98.aClass3_Sub4_Sub12_1 = Static233.aClass3_Sub4_Sub12_Sub2_4;
		}
		if (Static283.aBoolean393) {
			Static143.anIntArray316 = null;
		} else {
			Static94.aClass128_1.method4293();
		}
		Static233.aClass3_Sub4_Sub12_Sub2_4 = null;
		return true;
	}
}
