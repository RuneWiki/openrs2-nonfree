import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static252 {

	@OriginalMember(owner = "client!qc", name = "G", descriptor = "Lclient!cc;")
	public static Class22_Sub2_Sub1_Sub1 aClass22_Sub2_Sub1_Sub1_4;

	@OriginalMember(owner = "client!qc", name = "H", descriptor = "[[[Lclient!dg;")
	public static Class49[][][] aClass49ArrayArrayArray7;

	@OriginalMember(owner = "client!qc", name = "I", descriptor = "Lclient!kb;")
	public static Class52 aClass52_28;

	@OriginalMember(owner = "client!qc", name = "M", descriptor = "I")
	public static int anInt6121;

	@OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)Z")
	public static boolean method5170() {
		return Static33.anInt735 > 0;
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "([Lclient!bi;ZI)V")
	public static void method5171(@OriginalArg(0) Class26[] arg0, @OriginalArg(2) int arg1) {
		for (@Pc(9) int local9 = 0; local9 < arg0.length; local9++) {
			@Pc(14) Class26 local14 = arg0[local9];
			if (local14 != null && local14.anInt530 == arg1 && (!local14.aBoolean36 || !Static45.method1031(local14))) {
				if (local14.anInt520 == 0) {
					if (!local14.aBoolean36 && Static45.method1031(local14) && Static337.aClass26_30 != local14) {
						continue;
					}
					method5171(arg0, local14.anInt492);
					if (local14.aClass26Array1 != null) {
						method5171(local14.aClass26Array1, local14.anInt492);
					}
					@Pc(60) Class7_Sub17 local60 = (Class7_Sub17) Static247.aClass10_40.method163((long) local14.anInt492);
					if (local60 != null) {
						Static71.method1393(local60.anInt3252);
					}
				}
				if (local14.anInt520 == 6) {
					@Pc(89) int local89;
					if (local14.anInt488 != -1 || local14.anInt542 != -1) {
						@Pc(84) boolean local84 = Static75.method1496(local14);
						if (local84) {
							local89 = local14.anInt542;
						} else {
							local89 = local14.anInt488;
						}
						if (local89 != -1) {
							@Pc(101) Class170 local101 = Static261.method4379(local89);
							if (local101 != null) {
								local14.anInt567 += Static105.anInt6011;
								while (local14.anInt567 > local101.anIntArray650[local14.anInt541]) {
									local14.anInt567 -= local101.anIntArray650[local14.anInt541];
									local14.anInt541++;
									if (local14.anInt541 >= local101.anIntArray652.length) {
										local14.anInt541 -= local101.anInt4956;
										if (local14.anInt541 < 0 || local101.anIntArray652.length <= local14.anInt541) {
											local14.anInt541 = 0;
										}
									}
									local14.anInt554 = local14.anInt541 + 1;
									if (local14.anInt554 >= local101.anIntArray652.length) {
										local14.anInt554 -= local101.anInt4956;
										if (local14.anInt554 < 0 || local14.anInt554 >= local101.anIntArray652.length) {
											local14.anInt554 = -1;
										}
									}
									Static245.method4226(local14);
								}
							}
						}
					}
					if (local14.anInt536 != 0 && !local14.aBoolean36) {
						@Pc(215) int local215 = local14.anInt536 >> 16;
						@Pc(219) int local219 = local215 * Static105.anInt6011;
						local89 = local14.anInt536 << 16 >> 16;
						local14.anInt525 = local219 + local14.anInt525 & 0x3FFF;
						local89 *= Static105.anInt6011;
						local14.anInt565 = local89 + local14.anInt565 & 0x3FFF;
						Static245.method4226(local14);
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method5174(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(16) String local16 = Static142.method2873(arg0);
		if (local16 == null) {
			return;
		}
		for (@Pc(21) int local21 = 0; local21 < Static2.anInt17; local21++) {
			@Pc(28) String local28 = Static142.method2873(Static76.aStringArray17[local21]);
			if (local28 != null && local28.equals(local16)) {
				Static2.anInt17--;
				for (@Pc(40) int local40 = local21; local40 < Static2.anInt17; local40++) {
					Static76.aStringArray17[local40] = Static76.aStringArray17[local40 + 1];
					Static94.aStringArray24[local40] = Static94.aStringArray24[local40 + 1];
					Static77.aStringArray18[local40] = Static77.aStringArray18[local40 + 1];
					Static58.aStringArray12[local40] = Static58.aStringArray12[local40 + 1];
					Static60.aBooleanArray12[local40] = Static60.aBooleanArray12[local40 + 1];
				}
				Static55.anInt1452 = Static34.anInt776;
				Static29.aClass7_Sub3_Sub2_1.method2799(239);
				Static29.aClass7_Sub3_Sub2_1.method2735(Static344.method5559(arg0));
				Static29.aClass7_Sub3_Sub2_1.method2738(arg0);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)V")
	public static void method5175() {
		@Pc(5) Class103 local5 = Static251.aClass103_67;
		synchronized (Static251.aClass103_67) {
			Static251.aClass103_67.method2679(5);
		}
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZZ)V")
	public static void method5176(@OriginalArg(0) boolean arg0) {
		Static352.aBoolean484 = arg0;
		Static69.aBoolean126 = !Static105.method5089();
	}

	@OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIILjava/lang/Class;)Lclient!fo;")
	public static Class22_Sub2 method5177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class arg3) {
		@Pc(7) Class49 local7 = Static229.aClass49ArrayArrayArray6[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		}
		for (@Pc(14) Class47 local14 = local7.aClass47_3; local14 != null; local14 = local14.aClass47_2) {
			@Pc(18) Class22_Sub2 local18 = local14.aClass22_Sub2_1;
			if (arg3.isAssignableFrom(local18.getClass()) && local18.aShort83 == arg1 && local18.aShort81 == arg2) {
				return local18;
			}
		}
		return null;
	}
}
