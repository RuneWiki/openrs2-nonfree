import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static351 {

	@OriginalMember(owner = "client!rr", name = "k", descriptor = "[[[J")
	public static long[][][] aLongArrayArrayArray2;

	@OriginalMember(owner = "client!rr", name = "j", descriptor = "Lclient!di;")
	public static final Class54 aClass54_95 = new Class54(45, -1);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(BLclient!ya;)V")
	public static void method5159(@OriginalArg(1) Class49 arg0) {
		if (Static373.anInt4900 < 2 && !Static385.aBoolean441 || Static182.aClass68_7 != null) {
			return;
		}
		@Pc(38) String local38;
		if (Static385.aBoolean441 && Static373.anInt4900 < 2) {
			local38 = Static118.aString34 + Static267.aClass209_164.method4562(Static388.anInt6533) + Static254.aString46 + " ->";
		} else if (Static424.aBoolean472 && Static334.aClass226_1.method4977(81) && Static373.anInt4900 > 2) {
			local38 = Static398.method5260((Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262.aClass2_262);
		} else {
			@Pc(57) Class2_Sub22 local57 = (Class2_Sub22) Static248.aClass14_35.aClass2_17.aClass2_262;
			local38 = Static398.method5260(local57);
			@Pc(63) int[] local63 = null;
			if (Static16.method324(local57.anInt3716)) {
				local63 = Static318.aClass144_6.method3265((int) local57.aLong114).anIntArray81;
			} else if (local57.anInt3720 != -1) {
				local63 = Static318.aClass144_6.method3265(local57.anInt3720).anIntArray81;
			} else if (Static387.method5124(local57.anInt3716)) {
				@Pc(132) Class3_Sub2_Sub1_Sub1 local132 = Static174.aClass3_Sub2_Sub1_Sub1Array1[(int) local57.aLong114];
				if (local132 != null) {
					@Pc(137) Class65 local137 = local132.aClass65_1;
					if (local137.anIntArray155 != null) {
						local137 = local137.method1710(Static344.aClass108_1);
					}
					if (local137 != null) {
						local63 = local137.anIntArray158;
					}
				}
			} else if (Static429.method5145(local57.anInt3716)) {
				@Pc(100) Class134 local100;
				if (local57.anInt3716 == 1006) {
					local100 = Static118.aClass165_2.method3799((int) local57.aLong114);
				} else {
					local100 = Static118.aClass165_2.method3799((int) (local57.aLong114 >>> 32 & 0x7FFFFFFFL));
				}
				if (local100.anIntArray322 != null) {
					local100 = local100.method2969(Static344.aClass108_1);
				}
				if (local100 != null) {
					local63 = local100.anIntArray323;
				}
			}
			if (local63 != null) {
				local38 = local38 + Static336.method4687(local63);
			}
		}
		if (Static373.anInt4900 > 2) {
			local38 = local38 + "<col=ffffff> / " + (Static373.anInt4900 - 2) + Static100.aClass209_55.method4562(Static388.anInt6533);
		}
		if (Static266.aClass68_11 != null) {
			@Pc(256) Class116 local256 = Static266.aClass68_11.method1750(arg0);
			if (local256 == null) {
				local256 = Static114.aClass116_1;
			}
			local256.method4811(Static37.anInt717, Static89.anIntArray160, Static261.anInt4884, Static407.anIntArray577, local38, Static266.aClass68_11.anInt2170, Static90.aClass17Array3, Static266.aClass68_11.anInt2188, Static365.aRandom1, Static266.aClass68_11.anInt2252, Static266.aClass68_11.anInt2223, Static361.anInt6115, Static266.aClass68_11.anInt2200, Static266.aClass68_11.anInt2235);
			Static444.method5713(Static407.anIntArray577[3], Static407.anIntArray577[2], Static407.anIntArray577[0], Static407.anIntArray577[1]);
		} else if (Static131.aClass68_4 != null && Static199.aClass10_22 == Static320.aClass10_28) {
			@Pc(235) int local235 = Static114.aClass116_1.method4810(Static249.anInt4713 + 4, Static90.aClass17Array3, Static365.aRandom1, local38, Static89.anIntArray160, Static37.anInt717, Static150.anInt4216 + 16);
			Static444.method5713(16, local235 + Static172.aClass58_5.method1340(local38), Static249.anInt4713 - -4, Static150.anInt4216);
			return;
		}
	}

	@OriginalMember(owner = "client!rr", name = "c", descriptor = "(B)V")
	public static void method5163() {
		@Pc(15) int local15 = Static337.anInt5822;
		@Pc(17) int[] local17 = Static203.anIntArray384;
		for (@Pc(19) int local19 = 0; local19 < local15; local19++) {
			@Pc(27) Class3_Sub2_Sub1_Sub2 local27 = Static74.aClass3_Sub2_Sub1_Sub2Array1[local17[local19]];
			if (local27 != null) {
				Static19.method4250(local27.method4935(), local27);
			}
		}
	}
}
