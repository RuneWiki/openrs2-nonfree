import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static105 {

	@OriginalMember(owner = "client!hg", name = "I", descriptor = "[Lclient!hi;")
	public static Class66[] aClass66Array2;

	@OriginalMember(owner = "client!hg", name = "Q", descriptor = "[[[Lclient!wk;")
	public static Class1_Sub33[][][] aClass1_Sub33ArrayArrayArray2;

	@OriginalMember(owner = "client!hg", name = "U", descriptor = "I")
	public static int anInt1295 = 0;

	@OriginalMember(owner = "client!hg", name = "e", descriptor = "(B)V")
	public static void method1206() {
		Static11.aClass187_7.method4525();
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(I)V")
	public static void method1208() {
		for (@Pc(14) Class1_Sub2_Sub24 local14 = (Class1_Sub2_Sub24) Static35.aClass59_31.method1704(); local14 != null; local14 = (Class1_Sub2_Sub24) Static35.aClass59_31.method1701()) {
			@Pc(19) Class15_Sub7 local19 = local14.aClass15_Sub7_1;
			if (local19.anInt4682 != Static65.anInt1300 || local19.anInt4679 < Static313.anInt2966) {
				local14.method4779();
			} else if (local19.anInt4697 <= Static313.anInt2966) {
				if (local19.anInt4692 > 0) {
					@Pc(57) Class15_Sub5_Sub1 local57 = Static83.aClass15_Sub5_Sub1Array1[local19.anInt4692 - 1];
					if (local57 != null && local57.anInt5559 >= 0 && local57.anInt5559 < 13312 && local57.anInt5557 >= 0 && local57.anInt5557 < 13312) {
						local19.method4071(local57.anInt5559, Static313.anInt2966, Static69.method4275(local57.anInt5557, local19.anInt4682, local57.anInt5559) - local19.anInt4668, local57.anInt5557);
					}
				}
				if (local19.anInt4692 < 0) {
					@Pc(107) int local107 = -local19.anInt4692 - 1;
					@Pc(114) Class15_Sub5_Sub2 local114;
					if (Static35.anInt3966 == local107) {
						local114 = Static90.aClass15_Sub5_Sub2_2;
					} else {
						local114 = Static17.aClass15_Sub5_Sub2Array1[local107];
					}
					if (local114 != null && local114.anInt5559 >= 0 && local114.anInt5559 < 13312 && local114.anInt5557 >= 0 && local114.anInt5557 < 13312) {
						local19.method4071(local114.anInt5559, Static313.anInt2966, Static69.method4275(local114.anInt5557, local19.anInt4682, local114.anInt5559) - local19.anInt4668, local114.anInt5557);
					}
				}
				local19.method4077(Static81.anInt1635);
				Static95.method1737(Static65.anInt1300, (int) local19.aDouble9, (int) local19.aDouble4, (int) local19.aDouble3, 60, local19, local19.anInt4673, -1L, false);
			}
		}
	}

	@OriginalMember(owner = "client!hg", name = "f", descriptor = "(B)V")
	public static void method1209() {
		if (Static35.aBoolean269) {
			return;
		}
		if (Static73.aBoolean87) {
			Static49.aFloat32 = (int) Static49.aFloat32 - 65 & 0xFFFFFF80;
		} else {
			Static85.aFloat56 += (-24.0F - Static85.aFloat56) / 2.0F;
		}
		Static35.aBoolean269 = true;
		Static114.aBoolean142 = true;
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(I)V")
	public static void method1210() {
		if (!Static156.aBoolean211 || Static140.aBoolean355) {
			return;
		}
		@Pc(15) Class1_Sub33[][][] local15 = aClass1_Sub33ArrayArrayArray2;
		for (@Pc(17) int local17 = 0; local17 < local15.length; local17++) {
			@Pc(25) Class1_Sub33[][] local25 = local15[local17];
			for (@Pc(27) int local27 = 0; local27 < local25.length; local27++) {
				for (@Pc(33) int local33 = 0; local33 < local25[local27].length; local33++) {
					@Pc(45) Class1_Sub33 local45 = local25[local27][local33];
					if (local45 != null) {
						@Pc(63) Class15_Sub2_Sub1 local63;
						if (local45.aClass36_1 != null && local45.aClass36_1.aClass15_1 instanceof Class15_Sub2_Sub1) {
							local63 = (Class15_Sub2_Sub1) local45.aClass36_1.aClass15_1;
							if ((Long.MIN_VALUE & local45.aClass36_1.aLong44) == 0L) {
								local63.method856(false, true, true, false, true, true);
							} else {
								local63.method856(true, true, true, true, true, true);
							}
						}
						if (local45.aClass52_1 != null) {
							if (local45.aClass52_1.aClass15_2 instanceof Class15_Sub2_Sub1) {
								local63 = (Class15_Sub2_Sub1) local45.aClass52_1.aClass15_2;
								if ((local45.aClass52_1.aLong63 & Long.MIN_VALUE) == 0L) {
									local63.method856(false, true, true, false, true, true);
								} else {
									local63.method856(true, true, true, true, true, true);
								}
							}
							if (local45.aClass52_1.aClass15_3 instanceof Class15_Sub2_Sub1) {
								local63 = (Class15_Sub2_Sub1) local45.aClass52_1.aClass15_3;
								if ((local45.aClass52_1.aLong63 & Long.MIN_VALUE) == 0L) {
									local63.method856(false, true, true, false, true, true);
								} else {
									local63.method856(true, true, true, true, true, true);
								}
							}
						}
						if (local45.aClass160_1 != null) {
							if (local45.aClass160_1.aClass15_7 instanceof Class15_Sub2_Sub1) {
								local63 = (Class15_Sub2_Sub1) local45.aClass160_1.aClass15_7;
								if ((Long.MIN_VALUE & local45.aClass160_1.aLong170) == 0L) {
									local63.method856(false, true, true, false, true, true);
								} else {
									local63.method856(true, true, true, true, true, true);
								}
							}
							if (local45.aClass160_1.aClass15_8 instanceof Class15_Sub2_Sub1) {
								local63 = (Class15_Sub2_Sub1) local45.aClass160_1.aClass15_8;
								if ((Long.MIN_VALUE & local45.aClass160_1.aLong170) == 0L) {
									local63.method856(false, true, true, false, true, true);
								} else {
									local63.method856(true, true, true, true, true, true);
								}
							}
						}
						for (@Pc(261) int local261 = 0; local261 < local45.anInt5733; local261++) {
							if (local45.aClass161Array3[local261].aClass15_9 instanceof Class15_Sub2_Sub1) {
								@Pc(280) Class15_Sub2_Sub1 local280 = (Class15_Sub2_Sub1) local45.aClass161Array3[local261].aClass15_9;
								if ((local45.aClass161Array3[local261].aLong171 & Long.MIN_VALUE) == 0L) {
									local280.method856(false, true, true, false, true, true);
								} else {
									local280.method856(true, true, true, true, true, true);
								}
							}
						}
					}
				}
			}
		}
		Static140.aBoolean355 = true;
	}

	@OriginalMember(owner = "client!hg", name = "g", descriptor = "(B)V")
	public static void method1211() {
		if (Static57.anInt1090 > 0) {
			Static74.method1467();
		} else {
			Static179.aClass97_3 = Static5.aClass97_1;
			Static5.aClass97_1 = null;
			Static65.method1215(40);
		}
	}

	@OriginalMember(owner = "client!hg", name = "c", descriptor = "(II)V")
	public static void method1213() {
		Static46.aClass187_25.method4534(5);
	}
}
