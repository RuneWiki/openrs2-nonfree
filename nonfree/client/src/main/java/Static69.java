import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
	public static int anInt1430;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "I")
	public static int anInt1423 = 0;

	@OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
	public static int anInt1431 = 1;

	@OriginalMember(owner = "client!hf", name = "q", descriptor = "Lclient!lf;")
	public static Class49 aClass49_759 = Static32.method683("Bitte versuchen Sie es erneut)3");

	@OriginalMember(owner = "client!hf", name = "x", descriptor = "[Lclient!lf;")
	public static Class49[] aClass49Array9 = new Class49[100];

	@OriginalMember(owner = "client!hf", name = "A", descriptor = "B")
	public static byte aByte4 = 0;

	@OriginalMember(owner = "client!hf", name = "b", descriptor = "(B)V")
	public static void method1148() {
		aClass49Array9 = null;
		aClass49_759 = null;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)Z")
	public static boolean method1151(@OriginalArg(1) int arg0) {
		return arg0 >= 48 && arg0 <= 57;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "([IIIIII)V")
	public static void method1154(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		@Pc(7) Class2_Sub1 local7 = Static72.aClass2_Sub1ArrayArrayArray1[arg2][arg3][arg4];
		if (local7 == null) {
			return;
		}
		@Pc(13) Class59 local13 = local7.aClass59_1;
		@Pc(23) int local23;
		if (local13 != null) {
			@Pc(18) int local18 = local13.anInt2321;
			if (local18 != 0) {
				for (local23 = 0; local23 < 4; local23++) {
					arg0[arg1] = local18;
					arg0[arg1 + 1] = local18;
					arg0[arg1 + 2] = local18;
					arg0[arg1 + 3] = local18;
					arg1 += 512;
				}
			}
			return;
		}
		@Pc(58) Class21 local58 = local7.aClass21_1;
		if (local58 == null) {
			return;
		}
		local23 = local58.anInt949;
		@Pc(67) int local67 = local58.anInt947;
		@Pc(70) int local70 = local58.anInt946;
		@Pc(73) int local73 = local58.anInt948;
		@Pc(77) int[] local77 = Static87.anIntArrayArray31[local23];
		@Pc(81) int[] local81 = Static85.anIntArrayArray19[local67];
		@Pc(83) int local83 = 0;
		@Pc(87) int local87;
		if (local70 != 0) {
			for (local87 = 0; local87 < 4; local87++) {
				arg0[arg1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 1] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 2] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg0[arg1 + 3] = local77[local81[local83++]] == 0 ? local70 : local73;
				arg1 += 512;
			}
			return;
		}
		for (local87 = 0; local87 < 4; local87++) {
			if (local77[local81[local83++]] != 0) {
				arg0[arg1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 1] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 2] = local73;
			}
			if (local77[local81[local83++]] != 0) {
				arg0[arg1 + 3] = local73;
			}
			arg1 += 512;
		}
	}

	@OriginalMember(owner = "client!hf", name = "d", descriptor = "(B)Z")
	public static boolean method1156() {
		return Static78.anInt1631 == 0 ? Static61.aClass2_Sub14_Sub3_1.method2558() : true;
	}

	@OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIIII)V")
	public static void method1159(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static91.anInt1931 * 128) {
			arg0 = Static91.anInt1931 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static59.anInt1256 * 128) {
			arg2 = Static59.anInt1256 * 128 - 1;
		}
		Static90.anInt1923++;
		Static126.anInt2751 = Class2_Sub2_Sub2_Sub4.anIntArray217[arg3];
		Static105.anInt2201 = Class2_Sub2_Sub2_Sub4.anIntArray218[arg3];
		Static163.anInt695 = Class2_Sub2_Sub2_Sub4.anIntArray217[arg4];
		Static46.anInt1062 = Class2_Sub2_Sub2_Sub4.anIntArray218[arg4];
		Static120.aBooleanArrayArray1 = Static22.aBooleanArrayArrayArrayArray1[(arg3 - 128) / 32][arg4 / 64];
		Static17.anInt2522 = arg0;
		Static156.anInt3422 = arg1;
		Static128.anInt2775 = arg2;
		Static140.anInt3001 = arg0 / 128;
		Static30.anInt743 = arg2 / 128;
		Static184.anInt4072 = arg5;
		Static4.anInt67 = Static140.anInt3001 - Static24.anInt539;
		if (Static4.anInt67 < 0) {
			Static4.anInt67 = 0;
		}
		Static23.anInt501 = Static30.anInt743 - Static24.anInt539;
		if (Static23.anInt501 < 0) {
			Static23.anInt501 = 0;
		}
		Static124.anInt2736 = Static140.anInt3001 + Static24.anInt539;
		if (Static124.anInt2736 > Static91.anInt1931) {
			Static124.anInt2736 = Static91.anInt1931;
		}
		Static30.anInt741 = Static30.anInt743 + Static24.anInt539;
		if (Static30.anInt741 > Static59.anInt1256) {
			Static30.anInt741 = Static59.anInt1256;
		}
		Static162.method2745();
		Static33.anInt858 = 0;
		@Pc(125) int local125;
		@Pc(128) int local128;
		for (@Pc(118) int local118 = Static170.anInt3723; local118 < Static40.anInt978; local118++) {
			@Pc(123) Class2_Sub1[][] local123 = Static72.aClass2_Sub1ArrayArrayArray1[local118];
			for (local125 = Static4.anInt67; local125 < Static124.anInt2736; local125++) {
				for (local128 = Static23.anInt501; local128 < Static30.anInt741; local128++) {
					@Pc(135) Class2_Sub1 local135 = local123[local125][local128];
					if (local135 != null) {
						if (local135.anInt22 <= arg5 && (Static120.aBooleanArrayArray1[local125 + Static24.anInt539 - Static140.anInt3001][local128 + Static24.anInt539 - Static30.anInt743] || Static27.anIntArrayArrayArray2[local118][local125][local128] - arg1 >= 2000)) {
							local135.aBoolean2 = true;
							local135.aBoolean3 = true;
							if (local135.anInt15 > 0) {
								local135.aBoolean1 = true;
							} else {
								local135.aBoolean1 = false;
							}
							Static33.anInt858++;
						} else {
							local135.aBoolean2 = false;
							local135.aBoolean3 = false;
							local135.anInt21 = 0;
						}
					}
				}
			}
		}
		@Pc(227) int local227;
		@Pc(236) int local236;
		@Pc(241) int local241;
		@Pc(245) int local245;
		@Pc(223) int local223;
		for (@Pc(210) int local210 = Static170.anInt3723; local210 < Static40.anInt978; local210++) {
			@Pc(215) Class2_Sub1[][] local215 = Static72.aClass2_Sub1ArrayArrayArray1[local210];
			for (local128 = -Static24.anInt539; local128 <= 0; local128++) {
				local223 = Static140.anInt3001 + local128;
				local227 = Static140.anInt3001 - local128;
				if (local223 >= Static4.anInt67 || local227 < Static124.anInt2736) {
					for (local236 = -Static24.anInt539; local236 <= 0; local236++) {
						local241 = Static30.anInt743 + local236;
						local245 = Static30.anInt743 - local236;
						@Pc(257) Class2_Sub1 local257;
						if (local223 >= Static4.anInt67) {
							if (local241 >= Static23.anInt501) {
								local257 = local215[local223][local241];
								if (local257 != null && local257.aBoolean2) {
									Static145.method2393(local257, true);
								}
							}
							if (local245 < Static30.anInt741) {
								local257 = local215[local223][local245];
								if (local257 != null && local257.aBoolean2) {
									Static145.method2393(local257, true);
								}
							}
						}
						if (local227 < Static124.anInt2736) {
							if (local241 >= Static23.anInt501) {
								local257 = local215[local227][local241];
								if (local257 != null && local257.aBoolean2) {
									Static145.method2393(local257, true);
								}
							}
							if (local245 < Static30.anInt741) {
								local257 = local215[local227][local245];
								if (local257 != null && local257.aBoolean2) {
									Static145.method2393(local257, true);
								}
							}
						}
						if (Static33.anInt858 == 0) {
							Static113.aBoolean102 = false;
							return;
						}
					}
				}
			}
		}
		for (local125 = Static170.anInt3723; local125 < Static40.anInt978; local125++) {
			@Pc(341) Class2_Sub1[][] local341 = Static72.aClass2_Sub1ArrayArrayArray1[local125];
			for (local223 = -Static24.anInt539; local223 <= 0; local223++) {
				local227 = Static140.anInt3001 + local223;
				local236 = Static140.anInt3001 - local223;
				if (local227 >= Static4.anInt67 || local236 < Static124.anInt2736) {
					for (local241 = -Static24.anInt539; local241 <= 0; local241++) {
						local245 = Static30.anInt743 + local241;
						@Pc(371) int local371 = Static30.anInt743 - local241;
						@Pc(383) Class2_Sub1 local383;
						if (local227 >= Static4.anInt67) {
							if (local245 >= Static23.anInt501) {
								local383 = local341[local227][local245];
								if (local383 != null && local383.aBoolean2) {
									Static145.method2393(local383, false);
								}
							}
							if (local371 < Static30.anInt741) {
								local383 = local341[local227][local371];
								if (local383 != null && local383.aBoolean2) {
									Static145.method2393(local383, false);
								}
							}
						}
						if (local236 < Static124.anInt2736) {
							if (local245 >= Static23.anInt501) {
								local383 = local341[local236][local245];
								if (local383 != null && local383.aBoolean2) {
									Static145.method2393(local383, false);
								}
							}
							if (local371 < Static30.anInt741) {
								local383 = local341[local236][local371];
								if (local383 != null && local383.aBoolean2) {
									Static145.method2393(local383, false);
								}
							}
						}
						if (Static33.anInt858 == 0) {
							Static113.aBoolean102 = false;
							return;
						}
					}
				}
			}
		}
		Static113.aBoolean102 = false;
	}
}
