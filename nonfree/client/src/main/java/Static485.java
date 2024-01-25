import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static485 {

	@OriginalMember(owner = "client!qf", name = "q", descriptor = "I")
	public static int anInt7631;

	@OriginalMember(owner = "client!qf", name = "x", descriptor = "I")
	public static int anInt7635;

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZLjava/lang/String;II)V")
	public static void method6635(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2) {
		Static650.method8677();
		if (arg2 == 0) {
			Static582.aClass33_13 = Static356.method4761(Static57.anInterface9_4, 0, Static124.aClass4_Sub20_4.aClass8_Sub27_2.method7983() * 2, Static143.aClass34_31, Static17.aCanvas1);
			if (arg1 != null) {
				Static582.aClass33_13.GA(0);
				@Pc(36) Class31 local36 = Static464.method6458(Static371.anInt5580, Static305.aClass34_68);
				@Pc(45) Class56 local45 = Static582.aClass33_13.method8081(local36, Static682.method1651(Static368.aClass34_80, Static371.anInt5580));
				Static271.method3929();
				Static460.method6416(arg1, local36, Static582.aClass33_13, true, local45);
			}
		} else {
			@Pc(58) Class33 local58 = null;
			@Pc(86) Class56 local86;
			if (arg1 != null) {
				local58 = Static356.method4761(Static57.anInterface9_4, 0, 0, Static143.aClass34_31, Static17.aCanvas1);
				local58.GA(0);
				@Pc(77) Class31 local77 = Static464.method6458(Static371.anInt5580, Static305.aClass34_68);
				local86 = local58.method8081(local77, Static682.method1651(Static368.aClass34_80, Static371.anInt5580));
				Static271.method3929();
				Static460.method6416(arg1, local77, local58, true, local86);
			}
			boolean var14 = false;
			label216: {
				try {
					var14 = true;
					Static582.aClass33_13 = Static356.method4761(Static57.anInterface9_4, arg2, Static124.aClass4_Sub20_4.aClass8_Sub27_2.method7983() * 2, Static143.aClass34_31, Static17.aCanvas1);
					if (arg1 != null) {
						local58.GA(0);
						@Pc(123) Class31 local123 = Static464.method6458(Static371.anInt5580, Static305.aClass34_68);
						@Pc(132) Class56 local132 = local58.method8081(local123, Static682.method1651(Static368.aClass34_80, Static371.anInt5580));
						Static271.method3929();
						Static460.method6416(arg1, local123, local58, true, local132);
					}
					if (Static582.aClass33_13.method8101()) {
						@Pc(146) boolean local146 = true;
						try {
							local146 = Static566.aClass4_Sub41_1.anInt7533 > 256;
						} catch (@Pc(156) Throwable local156) {
						}
						@Pc(162) Class4_Sub13 local162;
						if (local146) {
							local162 = Static582.aClass33_13.method8088(146800640);
						} else {
							local162 = Static582.aClass33_13.method8088(104857600);
						}
						Static582.aClass33_13.method8083(local162);
						var14 = false;
					} else {
						var14 = false;
					}
					break label216;
				} catch (@Pc(173) Throwable local173) {
					@Pc(178) int local178 = Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5052();
					if (local178 == 2) {
						Static436.aBoolean593 = true;
					}
					Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_2, 0);
					method6635(arg0, arg1, local178);
					@Pc(195) Object local195 = null;
					var14 = false;
				} finally {
					if (var14) {
						local86 = null;
						if (local58 != null) {
							try {
								local58.method8070();
							} catch (@Pc(345) Throwable local345) {
							}
						}
					}
				}
				if (local58 != null) {
					try {
						local58.method8070();
					} catch (@Pc(325) Throwable local325) {
					}
				}
				return;
			}
			local86 = null;
			if (local58 != null) {
				try {
					local58.method8070();
				} catch (@Pc(335) Throwable local335) {
				}
			}
		}
		Static124.aClass4_Sub20_4.aClass8_Sub13_2.method5056(!arg0);
		Static124.aClass4_Sub20_4.method3147(Static124.aClass4_Sub20_4.aClass8_Sub13_2, arg2);
		Static567.method7513();
		Static582.aClass33_13.method8121();
		Static582.aClass33_13.X(32);
		Static149.aClass92_2 = Static582.aClass33_13.method8118();
		Static440.aClass92_7 = Static582.aClass33_13.method8118();
		Static591.method7777();
		Static582.aClass33_13.method8089(Static124.aClass4_Sub20_4.aClass8_Sub7_1.method3344() == 1);
		if (Static582.aClass33_13.method8107()) {
			Static253.method3680(Static124.aClass4_Sub20_4.aClass8_Sub29_1.method8390() == 1);
		}
		Static65.method1432(Static582.aClass33_13, Static267.anInt4309 >> 3, Static224.anInt3557 >> 3);
		Static568.method7522();
		Static391.aBoolean438 = false;
		Static70.aBoolean93 = true;
		Static566.aClass249Array1 = null;
		Static620.method7581();
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!qh;)I")
	public static int method6637(@OriginalArg(1) Class4_Sub5_Sub17 arg0) {
		@Pc(7) String local7 = Static624.method8379(arg0);
		@Pc(9) int[] local9 = null;
		if (Static566.method7494(arg0.anInt7673)) {
			local9 = Static532.aClass255_2.method5210((int) arg0.aLong226).anIntArray199;
		} else if (arg0.anInt7675 != -1) {
			local9 = Static532.aClass255_2.method5210(arg0.anInt7675).anIntArray199;
		} else if (Static98.method1982(arg0.anInt7673)) {
			@Pc(87) Class4_Sub45 local87 = (Class4_Sub45) Static597.aClass66_41.method1994((long) (int) arg0.aLong226);
			if (local87 != null) {
				@Pc(92) Class3_Sub1_Sub2_Sub2_Sub2 local92 = local87.aClass3_Sub1_Sub2_Sub2_Sub2_2;
				@Pc(95) Class345 local95 = local92.aClass345_1;
				if (local95.anIntArray624 != null) {
					local95 = local95.method7529(Static526.aClass293_1);
				}
				if (local95 != null) {
					local9 = local95.anIntArray626;
				}
			}
		} else if (Static193.method3007(arg0.anInt7673)) {
			@Pc(56) Class342 local56;
			if (arg0.anInt7673 == 1011) {
				local56 = Static441.aClass74_169.method2075((int) arg0.aLong226);
			} else {
				local56 = Static441.aClass74_169.method2075((int) (arg0.aLong226 >>> 32 & 0x7FFFFFFFL));
			}
			if (local56.anIntArray620 != null) {
				local56 = local56.method7495(Static526.aClass293_1);
			}
			if (local56 != null) {
				local9 = local56.anIntArray619;
			}
		}
		if (local9 != null) {
			local7 = local7 + Static314.method4357(local9);
		}
		@Pc(136) int local136 = Static641.aClass31_10.method1022(local7, Static128.aClass17Array3);
		if (arg0.aBoolean601) {
			local136 += Static93.aClass17_14.method5268() + 4;
		}
		return local136;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(BLclient!ar;)Lclient!hba;")
	public static Class144 method6639(@OriginalArg(1) Class3_Sub1_Sub2 arg0) {
		@Pc(14) Class144 local14;
		if (Static215.aClass144_3 == null) {
			local14 = new Class144();
		} else {
			local14 = Static215.aClass144_3;
			Static215.aClass144_3 = Static215.aClass144_3.aClass144_2;
			local14.aClass144_2 = null;
			Static71.anInt1496--;
		}
		local14.aClass3_Sub1_Sub2_1 = arg0;
		return local14;
	}

	@OriginalMember(owner = "client!qf", name = "a", descriptor = "(Lclient!es;I)Lclient!ns;")
	public static Class256_Sub1 method6641(@OriginalArg(0) Class4_Sub11 arg0) {
		@Pc(15) Class256 local15 = Static366.method4838(arg0);
		@Pc(19) int local19 = arg0.method8856();
		return new Class256_Sub1(local15.anInt5984, local15.aClass291_8, local15.aClass125_12, local15.anInt5986, local15.anInt5985, local19);
	}
}
