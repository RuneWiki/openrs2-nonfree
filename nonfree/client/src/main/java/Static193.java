import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static193 {

	@OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
	public static int anInt4254;

	@OriginalMember(owner = "client!m", name = "H", descriptor = "Lclient!cm;")
	public static final Class41 aClass41_20 = new Class41(32);

	@OriginalMember(owner = "client!m", name = "bb", descriptor = "Z")
	public static boolean aBoolean354 = false;

	@OriginalMember(owner = "client!m", name = "db", descriptor = "I")
	public static int anInt4255 = 0;

	@OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
	public static final int anInt4256 = 1406;

	@OriginalMember(owner = "client!m", name = "hb", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray29 = new String[100];

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIIII)I")
	public static int method3606(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		@Pc(7) int local7 = arg1 & 0x3;
		if ((arg3 & 0x1) == 1) {
			@Pc(16) int local16 = arg4;
			arg4 = arg2;
			arg2 = local16;
		}
		if (local7 == 0) {
			return arg5;
		} else if (local7 == 1) {
			return 1 + 7 - arg4 - arg0;
		} else if (local7 == 2) {
			return 1 + 7 - arg2 - arg5;
		} else {
			return arg0;
		}
	}

	@OriginalMember(owner = "client!m", name = "d", descriptor = "(B)V")
	public static void method3607() {
		for (@Pc(10) Class2_Sub25 local10 = (Class2_Sub25) Static358.aClass180_43.method4919(); local10 != null; local10 = (Class2_Sub25) Static358.aClass180_43.method4916()) {
			if (Static196.aClass51ArrayArrayArray3 == null) {
				local10.method5723();
			} else {
				@Pc(28) int local28;
				@Pc(172) Class1_Sub1 local172;
				@Pc(185) Class1_Sub1_Sub3 local185;
				@Pc(90) Class1_Sub4 local90;
				@Pc(133) Class1_Sub2 local133;
				@Pc(46) Class1_Sub3 local46;
				@Pc(103) Class1_Sub4_Sub3 local103;
				@Pc(59) Class1_Sub3_Sub1 local59;
				if (local10.anInt4103 <= Static6.anInt91) {
					local28 = Static148.anIntArray254[local10.anInt4089];
					if (local28 == 0) {
						local172 = Static356.method5687(local10.anInt4102, local10.anInt4104, local10.anInt4087);
						if (local172 instanceof Class1_Sub1_Sub3) {
							Static187.method3506(local10.anInt4102, local10.anInt4104, local10.anInt4087);
							local185 = (Class1_Sub1_Sub3) local172;
							if (local185.aClass1_Sub1_3 != null) {
								Static321.method1019(local10.anInt4102, local10.anInt4104, local10.anInt4087, local185.aClass1_Sub1_3, null);
							}
						}
					} else if (local28 == 1) {
						local46 = Static346.method5010(local10.anInt4102, local10.anInt4104, local10.anInt4087);
						if (local46 instanceof Class1_Sub3_Sub1) {
							Static230.method4869(local10.anInt4102, local10.anInt4104, local10.anInt4087);
							local59 = (Class1_Sub3_Sub1) local46;
							if (local59.aClass1_Sub3_3 != null) {
								Static279.method3545(local10.anInt4102, local10.anInt4104, local10.anInt4087, local59.aClass1_Sub3_3, null);
							}
						}
					} else if (local28 == 2) {
						local133 = Static109.method2112(local10.anInt4102, local10.anInt4104, local10.anInt4087, rc.class);
						if (local133 instanceof Class1_Sub2_Sub2) {
							Static351.method5657(local10.anInt4102, local10.anInt4104, local10.anInt4087, rc.class);
							@Pc(154) Class1_Sub2_Sub2 local154 = (Class1_Sub2_Sub2) local133;
							if (local154.aClass1_Sub2_2 != null) {
								Static342.method5581(local154.aClass1_Sub2_2, false);
							}
						}
					} else if (local28 == 3) {
						local90 = Static217.method4135(local10.anInt4102, local10.anInt4104, local10.anInt4087);
						if (local90 instanceof Class1_Sub4_Sub3) {
							Static71.method1443(local10.anInt4102, local10.anInt4104, local10.anInt4087);
							local103 = (Class1_Sub4_Sub3) local90;
							if (local103.aClass1_Sub4_2 != null) {
								Static129.method2511(local10.anInt4102, local10.anInt4104, local10.anInt4087, local103.aClass1_Sub4_2);
							}
						}
					}
					local10.method5723();
				} else if (Static6.anInt91 == local10.anInt4099) {
					local28 = Static148.anIntArray254[local10.anInt4089];
					if (local28 == 0) {
						local172 = Static356.method5687(local10.anInt4102, local10.anInt4104, local10.anInt4087);
						if (local172 instanceof Class1_Sub1_Sub3) {
							local10.method5723();
						} else if (Static66.method1358(local10.anInt4102, local10.anInt4104, local10.anInt4087) == null) {
							local185 = new Class1_Sub1_Sub3(local10.anInt4089, local10.anInt4088, local10.anInt4097, local10.anInt4094, local10.anInt4105, local172);
							Static321.method1019(local10.anInt4102, local10.anInt4104, local10.anInt4087, local185, null);
						} else {
							local10.method5723();
						}
					} else if (local28 == 1) {
						local46 = Static346.method5010(local10.anInt4102, local10.anInt4104, local10.anInt4087);
						if (local46 instanceof Class1_Sub3_Sub1) {
							local10.method5723();
						} else if (Static72.method1481(local10.anInt4102, local10.anInt4104, local10.anInt4087) == null) {
							local59 = new Class1_Sub3_Sub1(local10.anInt4089, local10.anInt4088, local10.anInt4097, local10.anInt4094, local10.anInt4105, local46);
							Static279.method3545(local10.anInt4102, local10.anInt4104, local10.anInt4087, local59, null);
						} else {
							local10.method5723();
						}
					} else if (local28 == 2) {
						local133 = Static109.method2112(local10.anInt4102, local10.anInt4104, local10.anInt4087, rc.class);
						if (local133 instanceof Class1_Sub2_Sub2) {
							local10.method5723();
						} else {
							Static351.method5657(local10.anInt4102, local10.anInt4104, local10.anInt4087, rc.class);
							@Pc(266) Class74 local266 = Static228.method4210(local10.anInt4095);
							@Pc(284) int local284;
							@Pc(281) int local281;
							if (local10.anInt4088 == 1 || local10.anInt4088 == 3) {
								local284 = local266.anInt2048;
								local281 = local266.anInt2094;
							} else {
								local281 = local266.anInt2048;
								local284 = local266.anInt2094;
							}
							@Pc(327) Class1_Sub2_Sub2 local327 = new Class1_Sub2_Sub2(local10.anInt4089, local10.anInt4088, local10.anInt4102, local10.anInt4097, local10.anInt4094, local10.anInt4105, local10.anInt4104, local10.anInt4104 + local284 - 1, local10.anInt4087, local10.anInt4087 + local281 - 1, local133);
							Static342.method5581(local327, false);
						}
					} else if (local28 == 3) {
						local90 = Static217.method4135(local10.anInt4102, local10.anInt4104, local10.anInt4087);
						if (local90 instanceof Class1_Sub4_Sub3) {
							local10.method5723();
						} else {
							local103 = new Class1_Sub4_Sub3(local10.anInt4097, local10.anInt4094, local10.anInt4105, local90);
							Static129.method2511(local10.anInt4102, local10.anInt4104, local10.anInt4087, local103);
						}
					}
				}
			}
		}
	}

	@OriginalMember(owner = "client!m", name = "b", descriptor = "(IIIIIII)V")
	public static void method3608(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(5) int arg3) {
		for (@Pc(10) Class57_Sub2 local10 = (Class57_Sub2) Static8.aClass193_1.method5224(); local10 != null; local10 = (Class57_Sub2) Static8.aClass193_1.method5223()) {
			if (local10.anInt1269 <= Static6.anInt91) {
				local10.method5452();
			} else {
				Static243.method4369(local10.anInt1274 * 2, (local10.anInt1266 << 7) + 64, arg1 >> 1, (local10.anInt1271 << 7) + 64, arg0 >> 1, local10.anInt1267);
				Static25.aClass71_1.method5233(local10.anInt1270 | 0xFF000000, 0, arg2 + Static311.anIntArray474[1], arg3 - -Static311.anIntArray474[0], local10.aString11);
			}
		}
	}
}
