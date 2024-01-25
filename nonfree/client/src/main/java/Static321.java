import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static321 {

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "Lclient!ea;")
	public static final Class67 aClass67_98 = new Class67("Loaded sprites", "Sprites geladen.", "Sprites chargés", "Sprites carregados");

	@OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
	public static int anInt6160 = 0;

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "([[BILclient!fda;)V")
	public static void method5156(@OriginalArg(0) byte[][] arg0, @OriginalArg(2) Class85_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		for (@Pc(18) int local18 = 0; local18 < arg1.anInt2722; local18++) {
			Static442.method6680();
			for (@Pc(24) int local24 = 0; local24 < Static118.anInt2527 >> 3; local24++) {
				for (@Pc(28) int local28 = 0; local28 < Static549.anInt9482 >> 3; local28++) {
					@Pc(38) int local38 = Static109.anIntArrayArrayArray4[local18][local24][local28];
					if (local38 != -1) {
						@Pc(47) int local47 = local38 >> 24 & 0x3;
						if (!arg1.aBoolean202 || local47 == 0) {
							@Pc(58) int local58 = local38 >> 1 & 0x3;
							@Pc(64) int local64 = local38 >> 14 & 0x3FF;
							@Pc(70) int local70 = local38 >> 3 & 0x7FF;
							@Pc(80) int local80 = local70 / 8 + (local64 / 8 << 8);
							for (@Pc(82) int local82 = 0; local82 < Static467.anIntArray715.length; local82++) {
								if (Static467.anIntArray715[local82] == local80 && arg0[local82] != null) {
									@Pc(100) Class3_Sub27 local100 = new Class3_Sub27(arg0[local82]);
									arg1.method2287(local18, local64, local100, local28 * 8, local58, local47, Static95.aClass306Array1, local70, local24 * 8);
									arg1.method2292(local24 * 8, local12[0] == -1 ? local12 : null, Static121.aClass5_7, local47, local18, local100, local70, local58, local28 * 8, local64);
									break;
								}
							}
						}
					}
				}
			}
		}
		if (local12[0] != -1) {
			Static87.aClass178_1 = Static443.aClass72_1.method2107(local12[0], Static144.aClass274_1, local12[1], local12[3], local12[2]);
			Static500.anInt8793 = local12[4];
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ZI)V")
	public static void method5157(@OriginalArg(0) boolean arg0) {
		while (true) {
			if (Static90.aClass3_Sub27_Sub1_1.method4546(Static35.anInt921) >= 15) {
				@Pc(22) int local22 = Static90.aClass3_Sub27_Sub1_1.method4536(15);
				if (local22 != 32767) {
					@Pc(29) boolean local29 = false;
					@Pc(36) Class3_Sub3 local36 = (Class3_Sub3) Static240.aClass267_20.method6644((long) local22);
					@Pc(42) Class6_Sub1_Sub2_Sub2 local42;
					if (local36 == null) {
						local42 = new Class6_Sub1_Sub2_Sub2();
						local42.anInt8587 = local22;
						local36 = new Class3_Sub3(local42);
						Static240.aClass267_20.method6640(local36, (long) local22);
						local29 = true;
						Static47.aClass3_Sub3Array4[Static183.anInt5938++] = local36;
					}
					local42 = local36.aClass6_Sub1_Sub2_Sub2_1;
					Static3.anIntArray80[Static221.anInt4798++] = local22;
					local42.lb = Static223.anInt4829;
					if (local42.aClass230_1 != null && local42.aClass230_1.method5894()) {
						Static299.method4967(local42);
					}
					@Pc(100) int local100;
					if (arg0) {
						local100 = Static90.aClass3_Sub27_Sub1_1.method4536(8);
						if (local100 > 127) {
							local100 -= 256;
						}
					} else {
						local100 = Static90.aClass3_Sub27_Sub1_1.method4536(5);
						if (local100 > 15) {
							local100 -= 32;
						}
					}
					@Pc(126) int local126;
					if (arg0) {
						local126 = Static90.aClass3_Sub27_Sub1_1.method4536(8);
						if (local126 > 127) {
							local126 -= 256;
						}
					} else {
						local126 = Static90.aClass3_Sub27_Sub1_1.method4536(5);
						if (local126 > 15) {
							local126 -= 32;
						}
					}
					@Pc(150) int local150 = Static90.aClass3_Sub27_Sub1_1.method4536(1);
					if (local150 == 1) {
						Static102.anIntArray528[Static329.anInt6289++] = local22;
					}
					@Pc(172) int local172 = (Static90.aClass3_Sub27_Sub1_1.method4536(3) + 4 & 0xD0200007) << 11;
					local42.method7096(Static345.aClass154_1.method4157(Static90.aClass3_Sub27_Sub1_1.method4536(14)));
					@Pc(187) int local187 = Static90.aClass3_Sub27_Sub1_1.method4536(2);
					@Pc(192) int local192 = Static90.aClass3_Sub27_Sub1_1.method4536(1);
					local42.method7087(local42.aClass230_1.anInt7040);
					local42.anInt8594 = local42.aClass230_1.anInt7057 << 3;
					if (local29) {
						local42.method7079(local172, true);
					}
					local42.method7092(local100 + Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray733[0], local192 == 1, local42.method7083(), local126 + Static111.aClass6_Sub1_Sub2_Sub1_3.anIntArray734[0], local187);
					if (local42.aClass230_1.method5894()) {
						Static100.method1935(local42.aByte100, null, local42.anIntArray733[0], local42.anIntArray734[0], 0, local42, null);
					}
					continue;
				}
			}
			Static90.aClass3_Sub27_Sub1_1.method4535();
			return;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZI)I")
	public static int method5158(@OriginalArg(0) int arg0) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			return 96;
		} else {
			@Pc(37) int local37 = (arg0 & 0x7F) * 96 >> 7;
			if (local37 < 2) {
				local37 = 2;
			} else if (local37 > 126) {
				local37 = 126;
			}
			return (arg0 & 0xFF80) + local37;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILclient!rt;)Lclient!na;")
	public static Class30_Sub3 method5159(@OriginalArg(1) Class3_Sub27 arg0) {
		return new Class30_Sub3(arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7604(), arg0.method7551(), arg0.method7551(), arg0.method7548());
	}
}
