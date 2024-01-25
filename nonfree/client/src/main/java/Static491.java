import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static491 {

	@OriginalMember(owner = "client!qja", name = "S", descriptor = "Lclient!lia;")
	public static final Class216 aClass216_1 = new Class216();

	@OriginalMember(owner = "client!qja", name = "V", descriptor = "I")
	public static int anInt8810 = 0;

	@OriginalMember(owner = "client!qja", name = "b", descriptor = "(II)V")
	public static void method7781(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(7) Class291 local7 = Static193.aClass291ArrayArrayArray2[0][arg0][arg1];
		for (@Pc(9) int local9 = 0; local9 < 3; local9++) {
			@Pc(28) Class291 local28 = Static193.aClass291ArrayArrayArray2[local9][arg0][arg1] = Static193.aClass291ArrayArrayArray2[local9 + 1][arg0][arg1];
			if (local28 != null) {
				for (@Pc(33) Class27 local33 = local28.aClass27_3; local33 != null; local33 = local33.aClass27_1) {
					@Pc(37) Class15_Sub3_Sub3 local37 = local33.aClass15_Sub3_Sub3_1;
					if (local37.aShort62 == arg0 && local37.aShort64 == arg1) {
						local37.aByte142--;
					}
				}
				if (local28.aClass15_Sub3_Sub5_1 != null) {
					local28.aClass15_Sub3_Sub5_1.aByte142--;
				}
				if (local28.aClass15_Sub3_Sub4_1 != null) {
					local28.aClass15_Sub3_Sub4_1.aByte142--;
				}
				if (local28.aClass15_Sub3_Sub4_2 != null) {
					local28.aClass15_Sub3_Sub4_2.aByte142--;
				}
				if (local28.aClass15_Sub3_Sub1_1 != null) {
					local28.aClass15_Sub3_Sub1_1.aByte142--;
				}
				if (local28.aClass15_Sub3_Sub1_2 != null) {
					local28.aClass15_Sub3_Sub1_2.aByte142--;
				}
			}
		}
		if (Static193.aClass291ArrayArrayArray2[0][arg0][arg1] == null) {
			Static193.aClass291ArrayArrayArray2[0][arg0][arg1] = new Class291(0);
			Static193.aClass291ArrayArrayArray2[0][arg0][arg1].aByte112 = 1;
		}
		Static193.aClass291ArrayArrayArray2[0][arg0][arg1].aClass291_1 = local7;
		Static193.aClass291ArrayArrayArray2[3][arg0][arg1] = null;
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(B[B)[B")
	public static byte[] method7784(@OriginalArg(1) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(11) byte[] local11 = new byte[arg0.length];
			Static679.method4129(arg0, 0, local11, 0, arg0.length);
			return local11;
		}
	}

	@OriginalMember(owner = "client!qja", name = "a", descriptor = "(ZBILjava/lang/String;)V")
	public static void method7785(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) String arg2) {
		Static157.method3191();
		if (arg1 == 0) {
			Static607.aClass101_15 = Static502.method7892(Static560.aClass124_118, Static230.aClass2_Sub54_15.aClass4_Sub19_1.method6178() * 2, Static641.aCanvas13, 0, Static117.anInterface3_2);
			if (arg2 != null) {
				Static607.aClass101_15.GA(0);
				@Pc(188) Class324 local188 = Static266.method4575(Static227.aClass124_49, Static366.anInt6933);
				@Pc(197) Class59 local197 = Static607.aClass101_15.method8146(local188, Static676.method1697(Static409.aClass124_84, Static366.anInt6933));
				Static510.method7943();
				Static543.method8319(arg2, Static607.aClass101_15, local188, local197, true);
			}
		} else {
			@Pc(11) Class101 local11 = null;
			@Pc(41) Class59 local41;
			if (arg2 != null) {
				local11 = Static502.method7892(Static560.aClass124_118, 0, Static641.aCanvas13, 0, Static117.anInterface3_2);
				local11.GA(0);
				@Pc(32) Class324 local32 = Static266.method4575(Static227.aClass124_49, Static366.anInt6933);
				local41 = local11.method8146(local32, Static676.method1697(Static409.aClass124_84, Static366.anInt6933));
				Static510.method7943();
				Static543.method8319(arg2, local11, local32, local41, true);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static607.aClass101_15 = Static502.method7892(Static560.aClass124_118, Static230.aClass2_Sub54_15.aClass4_Sub19_1.method6178() * 2, Static641.aCanvas13, arg1, Static117.anInterface3_2);
					if (arg2 != null) {
						local11.GA(0);
						@Pc(78) Class324 local78 = Static266.method4575(Static227.aClass124_49, Static366.anInt6933);
						@Pc(87) Class59 local87 = local11.method8146(local78, Static676.method1697(Static409.aClass124_84, Static366.anInt6933));
						Static510.method7943();
						Static543.method8319(arg2, local11, local78, local87, true);
					}
					if (Static607.aClass101_15.method8128()) {
						@Pc(101) boolean local101 = true;
						try {
							local101 = Static466.aClass2_Sub55_1.anInt11444 > 256;
						} catch (@Pc(111) Throwable local111) {
						}
						@Pc(117) Class2_Sub5 local117;
						if (local101) {
							local117 = Static607.aClass101_15.method8100(146800640);
						} else {
							local117 = Static607.aClass101_15.method8100(104857600);
						}
						Static607.aClass101_15.method8082(local117);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(128) Throwable local128) {
					@Pc(135) int local135 = Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4907();
					if (local135 == 2) {
						Static377.aBoolean540 = true;
					}
					Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_2, 0);
					method7785(arg0, local135, arg2);
					@Pc(154) Object local154 = null;
					var14 = false;
				} finally {
					if (var14) {
						local41 = null;
						if (local11 != null) {
							try {
								local11.method8148();
							} catch (@Pc(346) Throwable local346) {
							}
						}
					}
				}
				if (local11 != null) {
					try {
						local11.method8148();
					} catch (@Pc(326) Throwable local326) {
					}
				}
				return;
			}
			local41 = null;
			if (local11 != null) {
				try {
					local11.method8148();
				} catch (@Pc(336) Throwable local336) {
				}
			}
		}
		Static230.aClass2_Sub54_15.aClass4_Sub16_2.method4905(!arg0);
		Static230.aClass2_Sub54_15.method9550(Static230.aClass2_Sub54_15.aClass4_Sub16_2, arg1);
		Static384.method6481();
		Static607.aClass101_15.method8098();
		Static607.aClass101_15.X(32);
		Static435.aClass76_13 = Static607.aClass101_15.method8141();
		Static92.aClass76_16 = Static607.aClass101_15.method8141();
		Static359.method6153();
		Static607.aClass101_15.method8121(Static230.aClass2_Sub54_15.aClass4_Sub26_1.method8523() == 1);
		if (Static607.aClass101_15.method8136()) {
			Static640.method9474(Static230.aClass2_Sub54_15.aClass4_Sub15_1.method4882() == 1);
		}
		Static311.method5095(Static668.anInt11370 >> 3, Static222.anInt4533 >> 3, Static607.aClass101_15);
		Static593.method7276();
		Static596.aClass277Array1 = null;
		Static388.aBoolean551 = false;
		Static101.aBoolean127 = true;
		Static654.method9605();
	}
}
