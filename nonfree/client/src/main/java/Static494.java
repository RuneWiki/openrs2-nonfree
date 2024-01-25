import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static494 {

	@OriginalMember(owner = "client!rh", name = "r", descriptor = "[Lclient!di;")
	public static Interface7[] anInterface7Array1;

	@OriginalMember(owner = "client!rh", name = "c", descriptor = "Lclient!gw;")
	public static final Class136 aClass136_56 = new Class136(64);

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)V")
	public static void method7222(@OriginalArg(1) int arg0) {
		if (arg0 != -1 && Static397.aBooleanArray25[arg0]) {
			Static5.aClass343_8.method8148(arg0);
			Static319.aClass344ArrayArray2[arg0] = null;
			Static69.aClass344ArrayArray1[arg0] = null;
			Static397.aBooleanArray25[arg0] = false;
		}
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(I)V")
	public static void method7224() {
		for (@Pc(3) int local3 = 0; local3 < 5; local3++) {
			Static186.aBooleanArray12[local3] = false;
		}
		Static189.anInt3565 = -1;
		Static68.anInt1361 = -1;
		Static138.anInt2851 = -1;
		Static481.anInt8219 = 0;
		Static164.anInt3252 = 0;
		Static471.anInt8064 = 1;
		Static300.anInt9743 = -1;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lclient!uv;I)Lclient!uv;")
	public static Class344 method7226(@OriginalArg(0) Class344 arg0) {
		@Pc(11) Class344 local11 = Static76.method1321(arg0);
		if (local11 == null) {
			local11 = arg0.aClass344_14;
		}
		return local11;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIB)I")
	public static int method7228(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) byte local12;
		if (arg0 > 20000) {
			local12 = 4;
			Static303.method7244();
		} else if (arg0 > 10000) {
			Static407.method6323();
			local12 = 3;
		} else if (arg0 > 5000) {
			local12 = 2;
			Static339.method915();
		} else {
			local12 = 1;
			Static499.method7252();
		}
		if (Static32.aClass3_Sub41_3.aClass7_Sub9_2.method4181() != arg1) {
			Static32.aClass3_Sub41_3.method6773(arg1, Static32.aClass3_Sub41_3.aClass7_Sub9_1);
			Static230.method3973(arg1, false);
		}
		Static124.method2223();
		return local12;
	}

	@OriginalMember(owner = "client!rh", name = "a", descriptor = "(Z)V")
	public static void method7229() {
		@Pc(12) int local12 = Static606.aByteArrayArray28.length;
		for (@Pc(14) int local14 = 0; local14 < local12; local14++) {
			if (Static606.aByteArrayArray28[local14] != null) {
				@Pc(22) int local22 = -1;
				for (@Pc(24) int local24 = 0; local24 < Static175.anInt3371; local24++) {
					if (Static454.anIntArray476[local14] == Static198.anIntArray408[local24]) {
						local22 = local24;
						break;
					}
				}
				if (local22 == -1) {
					Static198.anIntArray408[Static175.anInt3371] = Static454.anIntArray476[local14];
					local22 = Static175.anInt3371++;
				}
				@Pc(64) Class3_Sub9 local64 = new Class3_Sub9(Static606.aByteArrayArray28[local14]);
				@Pc(66) int local66 = 0;
				while (local64.anInt6453 < Static606.aByteArrayArray28[local14].length && local66 < 511 && Static596.anInt9702 < 1023) {
					@Pc(83) int local83 = local66++ << 6 | local22;
					@Pc(87) int local87 = local64.method5610();
					@Pc(91) int local91 = local87 >> 14;
					@Pc(97) int local97 = local87 >> 7 & 0x3F;
					@Pc(101) int local101 = local87 & 0x3F;
					@Pc(114) int local114 = local97 + (Static454.anIntArray476[local14] >> 8) * 64 - Static427.anInt7462;
					@Pc(127) int local127 = (Static454.anIntArray476[local14] & 0xFF) * 64 + local101 - Static22.anInt329;
					@Pc(134) Class309 local134 = Static153.aClass2_1.method23(local64.method5610());
					@Pc(141) Class3_Sub43 local141 = (Class3_Sub43) Static545.aClass25_40.method426((long) local83);
					if (local141 == null && (local134.aByte102 & 0x1) > 0 && local91 == Static282.anInt5422 && local114 >= 0 && Static399.anInt7121 > local134.anInt8833 + local114 && local127 >= 0 && local127 + local134.anInt8833 < Static24.anInt345) {
						@Pc(183) Class9_Sub2_Sub1_Sub2_Sub2 local183 = new Class9_Sub2_Sub1_Sub2_Sub2();
						local183.anInt10204 = local83;
						@Pc(191) Class3_Sub43 local191 = new Class3_Sub43(local183);
						Static545.aClass25_40.method434((long) local83, local191);
						Static179.aClass3_Sub43Array1[Static73.anInt1445++] = local191;
						Static43.anIntArray50[Static596.anInt9702++] = local83;
						local183.anInt10198 = Static304.anInt8391;
						local183.method8644(local134);
						local183.method8630(local183.aClass309_1.anInt8833);
						local183.anInt10196 = local183.aClass309_1.anInt8862 << 3;
						local183.method8621(true, local183.aClass309_1.aByte104 + 4 << 11 & 0x3C7C);
						local183.method8643(local91, local183.method8619(), local127, true, local114);
					}
				}
			}
		}
	}
}
