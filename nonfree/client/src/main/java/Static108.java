import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static108 {

	@OriginalMember(owner = "client!fr", name = "e", descriptor = "I")
	public static int anInt1883;

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(Lclient!ui;B)V")
	public static void method1518(@OriginalArg(0) Class230 arg0) {
		Static162.aClass230_45 = arg0;
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(I)V")
	public static void method1519() {
		for (@Pc(3) int local3 = 0; local3 < Static382.anInt6197; local3++) {
			@Pc(11) int local11 = Static200.anIntArray420[local3];
			@Pc(15) Class25_Sub1_Sub1_Sub2 local15 = Static171.aClass25_Sub1_Sub1_Sub2Array1[local11];
			@Pc(19) int local19 = Static139.aClass1_Sub33_Sub2_1.method5174();
			if ((local19 & 0x8) != 0) {
				local19 += Static139.aClass1_Sub33_Sub2_1.method5174() << 8;
			}
			@Pc(39) int local39;
			@Pc(56) int local56;
			if ((local19 & 0x400) != 0) {
				local39 = Static139.aClass1_Sub33_Sub2_1.method5174();
				@Pc(42) int[] local42 = new int[local39];
				@Pc(45) int[] local45 = new int[local39];
				@Pc(48) int[] local48 = new int[local39];
				for (@Pc(50) int local50 = 0; local50 < local39; local50++) {
					local56 = Static139.aClass1_Sub33_Sub2_1.method5144();
					if (local56 == 65535) {
						local56 = -1;
					}
					local42[local50] = local56;
					local45[local50] = Static139.aClass1_Sub33_Sub2_1.method5162();
					local48[local50] = Static139.aClass1_Sub33_Sub2_1.method5144();
				}
				Static191.method2736(local45, local42, local15, local48);
			}
			if ((local19 & 0x100) != 0) {
				local15.anInt2396 = Static139.aClass1_Sub33_Sub2_1.method5144();
				local15.anInt2391 = Static139.aClass1_Sub33_Sub2_1.method5183();
			}
			@Pc(113) int local113;
			if ((local19 & 0x4) != 0) {
				local39 = Static139.aClass1_Sub33_Sub2_1.method5181();
				local113 = Static139.aClass1_Sub33_Sub2_1.method5174();
				local15.method1890(local39, Static366.anInt5883, local113);
				local15.anInt2348 = Static366.anInt5883 + 300;
				local15.anInt2360 = Static139.aClass1_Sub33_Sub2_1.method5172();
			}
			if ((local19 & 0x2) != 0) {
				local15.anInt2353 = Static139.aClass1_Sub33_Sub2_1.method5131();
				if (local15.anInt2353 == 65535) {
					local15.anInt2353 = -1;
				}
			}
			if ((local19 & 0x20) != 0) {
				local39 = Static139.aClass1_Sub33_Sub2_1.method5183();
				if (local39 == 65535) {
					local39 = -1;
				}
				local113 = Static139.aClass1_Sub33_Sub2_1.method5166();
				Static357.method5243(local39, local15, local113);
			}
			if ((local19 & 0x40) != 0) {
				local39 = Static139.aClass1_Sub33_Sub2_1.method5181();
				local113 = Static139.aClass1_Sub33_Sub2_1.method5162();
				local15.method1890(local39, Static366.anInt5883, local113);
			}
			if ((local19 & 0x1) != 0) {
				local39 = Static139.aClass1_Sub33_Sub2_1.method5183();
				local113 = Static139.aClass1_Sub33_Sub2_1.method5163();
				if (local39 == 65535) {
					local39 = -1;
				}
				@Pc(208) boolean local208 = true;
				@Pc(242) Class185 local242;
				if (local39 != -1 && local15.anInt2338 != -1) {
					@Pc(229) Class134 local229;
					if (local39 == local15.anInt2338) {
						local229 = Static10.aClass246_1.method5429(local39);
						if (local229.aBoolean297 && local229.anInt3346 != -1) {
							local242 = Static25.aClass67_1.method1227(local229.anInt3346);
							local56 = local242.anInt4802;
							if (local56 == 0) {
								local208 = false;
							} else if (local56 == 1) {
								local208 = true;
							} else if (local56 == 2) {
								local15.anInt2359 = 0;
								local208 = false;
							}
						}
					} else {
						local229 = Static10.aClass246_1.method5429(local39);
						@Pc(282) Class134 local282 = Static10.aClass246_1.method5429(local15.anInt2338);
						if (local229.anInt3346 != -1 && local282.anInt3346 != -1) {
							@Pc(296) Class185 local296 = Static25.aClass67_1.method1227(local229.anInt3346);
							@Pc(302) Class185 local302 = Static25.aClass67_1.method1227(local282.anInt3346);
							if (local302.anInt4805 > local296.anInt4805) {
								local208 = false;
							}
						}
					}
				}
				if (local208) {
					local15.anInt2373 = 0;
					local15.anInt2372 = 0;
					local15.anInt2355 = (local113 & 0xFFFF) + Static366.anInt5883;
					local15.anInt2351 = local113 >> 16;
					local15.anInt2338 = local39;
					local15.anInt2330 = 1;
					if (Static366.anInt5883 < local15.anInt2355) {
						local15.anInt2373 = -1;
					}
					if (local15.anInt2338 != -1 && local15.anInt2355 == Static366.anInt5883) {
						@Pc(362) int local362 = Static10.aClass246_1.method5429(local15.anInt2338).anInt3346;
						if (local362 != -1) {
							local242 = Static25.aClass67_1.method1227(local362);
							if (local242 != null && local242.anIntArray579 != null) {
								Static4.method52(0, local15.anInt6080, false, local15.aByte70, local242, local15.anInt6077);
							}
						}
					}
				}
			}
			if ((local19 & 0x200) != 0) {
				local39 = Static139.aClass1_Sub33_Sub2_1.method5131();
				local15.anInt2377 = Static139.aClass1_Sub33_Sub2_1.method5172();
				local15.anInt2357 = Static139.aClass1_Sub33_Sub2_1.method5172();
				local15.aBoolean188 = (local39 & 0x8000) != 0;
				local15.anInt2376 = local39 & 0x7FFF;
				local15.anInt2343 = local15.anInt2377 + local15.anInt2376 + Static366.anInt5883;
			}
			if ((local19 & 0x80) != 0) {
				local15.aString23 = Static139.aClass1_Sub33_Sub2_1.method5128();
				local15.anInt2327 = 100;
			}
			if ((local19 & 0x10) != 0) {
				if (local15.aClass59_1.method1148()) {
					Static135.method2029(local15);
				}
				local15.method1899(Static168.aClass196_2.method4452(Static139.aClass1_Sub33_Sub2_1.method5131()));
				local15.method1882(local15.aClass59_1.anInt1420);
				local15.anInt2341 = local15.aClass59_1.anInt1414 << 3;
				if (local15.aClass59_1.method1148()) {
					Static275.method4229(null, null, local15.aByte70, local15, 0, local15.anIntArray295[0], local15.anIntArray296[0]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fr", name = "a", descriptor = "(B)V")
	public static void method1520() {
		Static45.aClass227_5.method4871();
	}
}
