import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static113 {

	@OriginalMember(owner = "client!gd", name = "B", descriptor = "I")
	public static int anInt2186;

	@OriginalMember(owner = "client!gd", name = "C", descriptor = "Z")
	public static boolean aBoolean163;

	@OriginalMember(owner = "client!gd", name = "D", descriptor = "I")
	public static int anInt2187;

	@OriginalMember(owner = "client!gd", name = "w", descriptor = "Lclient!us;")
	public static final Class234 aClass234_46 = new Class234(63, 2);

	@OriginalMember(owner = "client!gd", name = "F", descriptor = "Lclient!bg;")
	public static Class3_Sub2 aClass3_Sub2_1 = null;

	@OriginalMember(owner = "client!gd", name = "G", descriptor = "Lclient!us;")
	public static final Class234 aClass234_47 = new Class234(33, 6);

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IIII)V")
	public static void method1829(@OriginalArg(2) int arg0, @OriginalArg(3) int arg1) {
		@Pc(3) int local3 = arg1 << 3;
		@Pc(15) int local15 = arg0 << 3;
		Static352.aFloat68 = local15;
		if (Static88.anInt1815 == 2) {
			Static327.anInt5556 = local3;
			Static331.anInt5600 = 0;
			Static145.anInt2716 = local15;
		}
		Static279.aFloat67 = local3;
		Static251.method4080();
		Static55.aBoolean64 = true;
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(I[[[BIBII)V")
	public static void method1830(@OriginalArg(0) int arg0, @OriginalArg(1) byte[][][] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) byte arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		Static389.anInt6446++;
		Static373.anInt6224 = 0;
		@Pc(14) int local14;
		for (@Pc(7) int local7 = Static294.anInt5083; local7 < Static164.anInt2901; local7++) {
			@Pc(12) Class48[][] local12 = Static69.aClass48ArrayArrayArray1[local7];
			for (local14 = Static264.anInt4700; local14 < Static70.anInt1378; local14++) {
				for (@Pc(17) int local17 = Static270.anInt5903; local17 < Static72.anInt1458; local17++) {
					@Pc(24) Class48 local24 = local12[local14][local17];
					if (local24 != null) {
						if (Static191.aBooleanArrayArray3[local14 + Static68.anInt1339 - Static12.anInt167][local17 + Static68.anInt1339 - Static327.anInt5555] && (arg1 == null || local7 < arg2 || arg1[local7][local14][local17] != arg3)) {
							local24.aBoolean61 = true;
							local24.aBoolean62 = true;
							if (local24.aClass50_1 == null) {
								local24.aBoolean60 = false;
							} else {
								local24.aBoolean60 = true;
							}
							Static373.anInt6224++;
						} else {
							local24.aBoolean61 = false;
							local24.aBoolean62 = false;
							local24.aByte15 = 0;
							if (local14 >= Static12.anInt167 - 16 && local14 <= Static12.anInt167 + 16 && local17 >= Static327.anInt5555 - 16 && local17 <= Static327.anInt5555 + 16 && (local24.aClass28_Sub3_1 != null || local24.aClass28_Sub3_2 != null || local24.aClass28_Sub4_2 != null || local24.aClass28_Sub4_1 != null || local24.aClass28_Sub2_2 != null || local24.aClass50_1 != null)) {
								Static317.aClass137_4.method4822(local24);
							}
						}
					}
				}
			}
		}
		@Pc(145) boolean local145 = Static25.aClass7Array1 == Static337.aClass7Array3;
		for (local14 = Static294.anInt5083; local14 < Static164.anInt2901; local14++) {
			@Pc(161) float local161 = local145 ? 251.5F : 201.5F - (float) local14 * 50.0F - 0.5F;
			if (Static121.aClass155_1.method4882() && local14 >= arg2 && arg1 != null) {
				@Pc(172) int local172 = Static191.aBooleanArrayArray3.length;
				if (Static264.anInt4700 + Static191.aBooleanArrayArray3.length > Static44.anInt791) {
					local172 -= Static264.anInt4700 + Static191.aBooleanArrayArray3.length - Static44.anInt791;
				}
				@Pc(192) int local192 = Static191.aBooleanArrayArray3[0].length;
				if (Static270.anInt5903 + Static191.aBooleanArrayArray3[0].length > Static103.anInt2050) {
					local192 -= Static270.anInt5903 + Static191.aBooleanArrayArray3[0].length - Static103.anInt2050;
				}
				@Pc(213) int local213 = Static107.anInt4790;
				while (true) {
					if (local213 >= local172) {
						Static317.aClass137_4.method4816(local14, local161, Static337.aClass7Array3[local14], true);
						break;
					}
					@Pc(220) int local220 = local213 + Static264.anInt4700 - Static107.anInt4790;
					for (@Pc(222) int local222 = Static270.anInt5907; local222 < local192; local222++) {
						Static202.aBooleanArrayArray4[local213][local222] = false;
						if (Static191.aBooleanArrayArray3[local213][local222]) {
							@Pc(241) int local241 = local222 + Static270.anInt5903 - Static270.anInt5907;
							for (@Pc(243) int local243 = local14; local243 >= 0; local243--) {
								if (Static69.aClass48ArrayArrayArray1[local243][local220][local241] != null && Static69.aClass48ArrayArrayArray1[local243][local220][local241].aByte14 == local14) {
									Static202.aBooleanArrayArray4[local213][local222] = Static69.aClass48ArrayArrayArray1[local243][local220][local241].aBoolean61;
									break;
								}
							}
						}
					}
					local213++;
				}
			} else {
				Static317.aClass137_4.method4816(local14, local161, Static337.aClass7Array3[local14], false);
			}
			Static317.aClass137_4.method4820();
		}
		if (!Static372.method5556(true)) {
			Static372.method5556(false);
		}
	}

	@OriginalMember(owner = "client!gd", name = "a", descriptor = "(IB)V")
	public static void method1833(@OriginalArg(0) int arg0) {
		Static156.anInt2793 = arg0;
		@Pc(12) Class139 local12 = Static59.aClass139_8;
		synchronized (Static59.aClass139_8) {
			Static59.aClass139_8.method3075();
		}
	}
}
