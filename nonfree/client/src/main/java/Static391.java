import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static391 {

	@OriginalMember(owner = "client!to", name = "f", descriptor = "Lclient!f;")
	public static Class49 aClass49_20;

	@OriginalMember(owner = "client!to", name = "i", descriptor = "Lclient!ic;")
	public static Class113 aClass113_119;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "J")
	public static long aLong202 = 0L;

	@OriginalMember(owner = "client!to", name = "b", descriptor = "Lclient!go;")
	public static final Class97 aClass97_14 = new Class97(9, 0, 4, 1);

	@OriginalMember(owner = "client!to", name = "e", descriptor = "I")
	public static final int anInt6421 = 0;

	@OriginalMember(owner = "client!to", name = "h", descriptor = "Z")
	public static boolean aBoolean527 = true;

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(B)V")
	public static void method4946() {
		for (@Pc(17) Class1_Sub30 local17 = (Class1_Sub30) Static204.aClass254_22.method5437(); local17 != null; local17 = (Class1_Sub30) Static204.aClass254_22.method5433()) {
			if (local17.anInt4693 == -1) {
				local17.anInt4694 = 0;
				if (local17.anInt4697 >= 0 && local17.anInt4691 >= 0 && local17.anInt4697 < Static425.anInt6922 && local17.anInt4691 < Static251.anInt4072) {
					Static12.method187(local17);
				}
			} else {
				local17.method5617();
			}
		}
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(I)V")
	public static void method4947() {
		Static108.anInt1918 = Static154.aClass1_Sub11_Sub1_3.method4504();
		@Pc(17) int local17 = Static154.aClass1_Sub11_Sub1_3.method4500();
		@Pc(26) boolean local26 = Static154.aClass1_Sub11_Sub1_3.method4463() == 1;
		@Pc(30) int local30 = Static154.aClass1_Sub11_Sub1_3.method4486();
		@Pc(34) int local34 = Static154.aClass1_Sub11_Sub1_3.method4504();
		Static381.method4865(local34);
		Static154.aClass1_Sub11_Sub1_3.method3352();
		@Pc(46) int local46;
		@Pc(50) int local50;
		@Pc(57) int local57;
		for (@Pc(42) int local42 = 0; local42 < 4; local42++) {
			for (local46 = 0; local46 < Static425.anInt6922 >> 3; local46++) {
				for (local50 = 0; local50 < Static251.anInt4072 >> 3; local50++) {
					local57 = Static154.aClass1_Sub11_Sub1_3.method3347(1);
					if (local57 == 1) {
						Static303.anIntArrayArrayArray13[local42][local46][local50] = Static154.aClass1_Sub11_Sub1_3.method3347(26);
					} else {
						Static303.anIntArrayArrayArray13[local42][local46][local50] = -1;
					}
				}
			}
		}
		Static154.aClass1_Sub11_Sub1_3.method3348();
		local46 = (Static329.anInt5393 - Static154.aClass1_Sub11_Sub1_3.anInt5766) / 16;
		Static148.anIntArrayArray62 = new int[local46][4];
		for (local50 = 0; local50 < local46; local50++) {
			for (local57 = 0; local57 < 4; local57++) {
				Static148.anIntArrayArray62[local50][local57] = Static154.aClass1_Sub11_Sub1_3.method4487();
			}
		}
		Static342.aByteArrayArray41 = new byte[local46][];
		Static288.anIntArray250 = new int[local46];
		Static59.aByteArrayArray9 = null;
		Static137.anIntArray112 = new int[local46];
		Static334.anIntArray331 = new int[local46];
		Static207.aByteArrayArray28 = new byte[local46][];
		Static7.anIntArray394 = new int[local46];
		Static346.anIntArray341 = new int[local46];
		Static356.anIntArray348 = null;
		Static109.aByteArrayArray15 = new byte[local46][];
		Static383.aByteArrayArray44 = new byte[local46][];
		local46 = 0;
		for (local57 = 0; local57 < 4; local57++) {
			for (@Pc(181) int local181 = 0; local181 < Static425.anInt6922 >> 3; local181++) {
				for (@Pc(185) int local185 = 0; local185 < Static251.anInt4072 >> 3; local185++) {
					@Pc(195) int local195 = Static303.anIntArrayArrayArray13[local57][local181][local185];
					if (local195 != -1) {
						@Pc(205) int local205 = local195 >> 14 & 0x3FF;
						@Pc(211) int local211 = local195 >> 3 & 0x7FF;
						@Pc(221) int local221 = local211 / 8 + (local205 / 8 << 8);
						for (@Pc(223) int local223 = 0; local223 < local46; local223++) {
							if (local221 == Static334.anIntArray331[local223]) {
								local221 = -1;
								break;
							}
						}
						if (local221 != -1) {
							Static334.anIntArray331[local46] = local221;
							@Pc(256) int local256 = local221 >> 8 & 0xFF;
							@Pc(260) int local260 = local221 & 0xFF;
							Static346.anIntArray341[local46] = Static310.aClass113_97.method2269("m" + local256 + "_" + local260);
							Static137.anIntArray112[local46] = Static310.aClass113_97.method2269("l" + local256 + "_" + local260);
							Static7.anIntArray394[local46] = Static310.aClass113_97.method2269("um" + local256 + "_" + local260);
							Static288.anIntArray250[local46] = Static310.aClass113_97.method2269("ul" + local256 + "_" + local260);
							local46++;
						}
					}
				}
			}
		}
		Static369.method3951(local30, local17, false, local26);
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(ILclient!dr;)V")
	public static void method4948(@OriginalArg(1) Class54 arg0) {
		Static225.aClass54_1 = arg0;
	}

	@OriginalMember(owner = "client!to", name = "a", descriptor = "(III)V")
	public static void method4950(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(10) Class1_Sub3_Sub13 local10 = Static397.method4998(5, arg0);
		local10.method3459();
		local10.anInt4301 = arg1;
	}

	@OriginalMember(owner = "client!to", name = "c", descriptor = "(B)V")
	public static void method4951() {
		if (Static213.aClass128_22 == null) {
			return;
		}
		Static449.aClass227_8.method4835();
		Static34.method589();
		Static390.method4942();
		Static236.method3113();
		Static108.method1522();
		Static77.method1212();
		if (Static25.aClass256_1 != null) {
			Static25.aClass256_1.method5473();
		}
		Static384.method4910();
		Static336.method4290();
		Static111.method4276();
		Static240.method3130(false);
		Static316.method4090();
		for (@Pc(45) int local45 = 0; local45 < 2048; local45++) {
			@Pc(51) Class20_Sub3_Sub3_Sub1 local51 = Static73.aClass20_Sub3_Sub3_Sub1Array1[local45];
			if (local51 != null) {
				local51.aClass1_Sub38_3 = null;
				for (@Pc(58) int local58 = 0; local58 < local51.aClass33Array3.length; local58++) {
					local51.aClass33Array3[local58] = null;
				}
			}
		}
		for (@Pc(79) int local79 = 0; local79 < Static98.aClass20_Sub3_Sub3_Sub2Array1.length; local79++) {
			@Pc(85) Class20_Sub3_Sub3_Sub2 local85 = Static98.aClass20_Sub3_Sub3_Sub2Array1[local79];
			if (local85 != null) {
				for (@Pc(89) int local89 = 0; local89 < local85.aClass33Array3.length; local89++) {
					local85.aClass33Array3[local89] = null;
				}
			}
		}
		Static213.aClass128_22.method3596();
		Static213.aClass128_22 = null;
	}
}
