import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static3 {

	@OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
	public static int anInt5987;

	@OriginalMember(owner = "client!ab", name = "s", descriptor = "Lclient!pb;")
	public static final Class180 aClass180_8 = new Class180("", 15);

	@OriginalMember(owner = "client!ab", name = "e", descriptor = "(I)V")
	public static void method4776() {
		Static386.method5261(Static266.aClass75_7, (long) Static290.anInt5325);
		if (Static337.anInt6221 != -1) {
			Static83.method1452(Static337.anInt6221);
		}
		for (@Pc(18) int local18 = 0; local18 < Static54.anInt1292; local18++) {
			if (Static308.aBooleanArray18[local18]) {
				Static290.aBooleanArray16[local18] = true;
			}
			Static406.aBooleanArray24[local18] = Static308.aBooleanArray18[local18];
			Static308.aBooleanArray18[local18] = false;
		}
		Static183.anInt4104 = Static290.anInt5325;
		if (Static266.aClass75_7.method2617()) {
			Static329.aBoolean423 = true;
		}
		if (Static337.anInt6221 != -1) {
			Static54.anInt1292 = 0;
			Static369.method5155();
		}
		Static266.aClass75_7.va();
		Static166.method2898(Static287.anInt5247);
		Static429.anInt7317 = 0;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(ZILclient!lk;Lclient!lk;Z)I")
	public static int method4778(@OriginalArg(1) int arg0, @OriginalArg(2) Class145_Sub1 arg1, @OriginalArg(3) Class145_Sub1 arg2, @OriginalArg(4) boolean arg3) {
		@Pc(9) int local9;
		@Pc(12) int local12;
		if (arg0 == 1) {
			local9 = arg1.anInt4478;
			local12 = arg2.anInt4478;
			if (!arg3) {
				if (local9 == -1) {
					local9 = 2001;
				}
				if (local12 == -1) {
					local12 = 2001;
				}
			}
			return local9 - local12;
		} else if (arg0 == 2) {
			return Static441.method5894(arg2.method3662().aString66, Static216.anInt4257, arg1.method3662().aString66);
		} else if (arg0 == 3) {
			if (arg1.aString43.equals("-")) {
				if (arg2.aString43.equals("-")) {
					return 0;
				} else if (arg3) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg2.aString43.equals("-")) {
				return arg3 ? 1 : -1;
			} else {
				return Static441.method5894(arg2.aString43, Static216.anInt4257, arg1.aString43);
			}
		} else if (arg0 == 4) {
			if (arg1.method3659()) {
				return arg2.method3659() ? 0 : 1;
			} else if (arg2.method3659()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 5) {
			if (arg1.method3656()) {
				return arg2.method3656() ? 0 : 1;
			} else if (arg2.method3656()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 6) {
			if (arg1.method3655()) {
				return arg2.method3655() ? 0 : 1;
			} else if (arg2.method3655()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 7) {
			if (arg1.method3657()) {
				return arg2.method3657() ? 0 : 1;
			} else if (arg2.method3657()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg0 == 8) {
			local9 = arg1.anInt4488;
			local12 = arg2.anInt4488;
			if (arg3) {
				if (local12 == 1000) {
					local12 = -1;
				}
				if (local9 == 1000) {
					local9 = -1;
				}
			} else {
				if (local9 == -1) {
					local9 = 1000;
				}
				if (local12 == -1) {
					local12 = 1000;
				}
			}
			return local9 - local12;
		} else {
			return arg1.anInt4487 - arg2.anInt4487;
		}
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IZ)V")
	public static void method4779(@OriginalArg(1) boolean arg0) {
		while (true) {
			if (Static110.aClass3_Sub2_Sub2_1.method6060(Static113.anInt6862) >= 15) {
				@Pc(17) int local17 = Static110.aClass3_Sub2_Sub2_1.method6057(15);
				if (local17 != 32767) {
					@Pc(24) boolean local24 = false;
					if (Static451.aClass1_Sub3_Sub3_Sub2Array1[local17] == null) {
						Static451.aClass1_Sub3_Sub3_Sub2Array1[local17] = new Class1_Sub3_Sub3_Sub2();
						Static451.aClass1_Sub3_Sub3_Sub2Array1[local17].anInt6066 = local17;
						local24 = true;
					}
					@Pc(45) Class1_Sub3_Sub3_Sub2 local45 = Static451.aClass1_Sub3_Sub3_Sub2Array1[local17];
					Static29.anIntArray56[Static453.anInt7682++] = local17;
					local45.anInt6126 = Static290.anInt5325;
					if (local45.aClass47_1 != null && local45.aClass47_1.method1305()) {
						Static5.method107(local45);
					}
					@Pc(72) int local72 = Static110.aClass3_Sub2_Sub2_1.method6057(2);
					@Pc(83) int local83 = Static110.aClass3_Sub2_Sub2_1.method6057(3) + 4 << 11 & 0x3974;
					@Pc(90) int local90;
					if (arg0) {
						local90 = Static110.aClass3_Sub2_Sub2_1.method6057(8);
						if (local90 > 127) {
							local90 -= 256;
						}
					} else {
						local90 = Static110.aClass3_Sub2_Sub2_1.method6057(5);
						if (local90 > 15) {
							local90 -= 32;
						}
					}
					local45.method4854(Static154.aClass251_2.method5684(Static110.aClass3_Sub2_Sub2_1.method6057(14)));
					@Pc(121) int local121 = Static110.aClass3_Sub2_Sub2_1.method6057(1);
					if (local121 == 1) {
						Static168.anIntArray263[Static229.anInt4389++] = local17;
					}
					@Pc(139) int local139;
					if (arg0) {
						local139 = Static110.aClass3_Sub2_Sub2_1.method6057(8);
						if (local139 > 127) {
							local139 -= 256;
						}
					} else {
						local139 = Static110.aClass3_Sub2_Sub2_1.method6057(5);
						if (local139 > 15) {
							local139 -= 32;
						}
					}
					@Pc(158) int local158 = Static110.aClass3_Sub2_Sub2_1.method6057(1);
					local45.method4844(local45.aClass47_1.anInt1578);
					local45.anInt6100 = local45.aClass47_1.anInt1585 << 3;
					if (local45.anInt6100 == 0) {
						local45.method4833(0);
					} else if (local24) {
						local45.method4833(local83);
					}
					local45.method4849(local45.method4831(), local90 + Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray453[0], local139 + Static113.aClass1_Sub3_Sub3_Sub1_4.anIntArray454[0], local72, local158 == 1);
					if (local45.aClass47_1.method1305()) {
						Static301.method4446(null, local45, null, local45.anIntArray453[0], 0, local45.aByte77, local45.anIntArray454[0]);
					}
					continue;
				}
			}
			Static110.aClass3_Sub2_Sub2_1.method6059();
			return;
		}
	}
}
