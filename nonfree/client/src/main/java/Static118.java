import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static118 {

	@OriginalMember(owner = "client!fl", name = "M", descriptor = "Lclient!ki;")
	public static Class145 aClass145_3;

	@OriginalMember(owner = "client!fl", name = "l", descriptor = "Lclient!vv;")
	public static final Class263 aClass263_69 = new Class263(67, 7);

	@OriginalMember(owner = "client!fl", name = "J", descriptor = "Lclient!nk;")
	public static final Class177 aClass177_39 = new Class177(8, 3);

	@OriginalMember(owner = "client!fl", name = "L", descriptor = "I")
	public static int anInt2743 = -1;

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(IB)V")
	public static void method2001(@OriginalArg(0) int arg0) {
		Static135.anInt3020 = -1;
		Static332.anInt6412 = -1;
		Static226.anInt4474 = arg0;
		Static376.method5225();
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(Ljava/lang/String;IZLjava/lang/String;Ljava/lang/String;IILjava/lang/String;)V")
	public static void method2011(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(3) String arg2, @OriginalArg(4) String arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5, @OriginalArg(7) String arg6) {
		for (@Pc(5) int local5 = 99; local5 > 0; local5--) {
			Static180.anIntArray377[local5] = Static180.anIntArray377[local5 - 1];
			Static295.anIntArray516[local5] = Static295.anIntArray516[local5 - 1];
			Static27.aStringArray5[local5] = Static27.aStringArray5[local5 - 1];
			Static432.aStringArray45[local5] = Static432.aStringArray45[local5 - 1];
			Static119.aStringArray21[local5] = Static119.aStringArray21[local5 - 1];
			Static410.aStringArray43[local5] = Static410.aStringArray43[local5 - 1];
			Static210.anIntArray408[local5] = Static210.anIntArray408[local5 - 1];
		}
		Static180.anIntArray377[0] = arg4;
		Static27.aStringArray5[0] = arg6;
		Static295.anIntArray516[0] = arg1;
		Static432.aStringArray45[0] = arg3;
		Static119.aStringArray21[0] = arg2;
		Static410.aStringArray43[0] = arg0;
		Static225.anInt4469 = Static175.anInt3842;
		Static210.anIntArray408[0] = arg5;
		Static414.anInt7372++;
	}

	@OriginalMember(owner = "client!fl", name = "d", descriptor = "(I)I")
	public static int method2012() {
		return 6;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(II)V")
	public static void method2017(@OriginalArg(1) int arg0) {
		if (arg0 == Static170.anInt3494) {
			return;
		}
		if (Static170.anInt3494 == 0) {
			Static21.method5155();
		}
		if (arg0 == 12) {
			Static327.method4636(Static194.aString35, Static92.aString19, Static39.anInt1015);
		}
		if (arg0 != 12 && Static389.aClass236_14 != null) {
			Static389.aClass236_14.method5236();
			Static389.aClass236_14 = null;
		}
		if (arg0 == 2) {
			Static147.method2351(Static456.anInt1594 != Static97.anInt2326);
		}
		if (arg0 == 6) {
			Static171.method2738(Static456.anInt1594 != Static128.anInt2852);
		}
		if (arg0 == 4) {
			Static423.method5736(Static194.aString35, Static92.aString19);
		} else if (arg0 == 5) {
			Static327.method4636(Static194.aString35, Static92.aString19, Static39.anInt1015);
		} else if (arg0 == 8) {
			Static327.method4636(Static194.aString35, Static92.aString19, Static39.anInt1015);
		} else if (arg0 == 11) {
			Static423.method5736(Static194.aString35, Static92.aString19);
		}
		if (Static198.method6177(Static170.anInt3494)) {
			Static37.aClass211_13.anInt6207 = 2;
			Static140.aClass211_37.anInt6207 = 2;
			Static386.aClass211_80.anInt6207 = 2;
			Static65.aClass211_19.anInt6207 = 2;
			Static355.aClass211_74.anInt6207 = 2;
			Static136.aClass211_35.anInt6207 = 2;
			Static437.aClass211_88.anInt6207 = 2;
		}
		if (Static198.method6177(arg0)) {
			Static16.anInt376 = 1;
			Static169.anInt3489 = 0;
			Static26.anInt653 = 0;
			Static368.anInt6726 = 0;
			Static291.anInt7491 = 1;
			Static347.method4917(true);
			Static37.aClass211_13.anInt6207 = 1;
			Static140.aClass211_37.anInt6207 = 1;
			Static386.aClass211_80.anInt6207 = 1;
			Static65.aClass211_19.anInt6207 = 1;
			Static355.aClass211_74.anInt6207 = 1;
			Static136.aClass211_35.anInt6207 = 1;
			Static437.aClass211_88.anInt6207 = 1;
		}
		if (arg0 == 10 || arg0 == 2) {
			Static260.method3875();
		}
		if (arg0 == 1) {
			Static197.method3164(Static140.aClass211_38, Static30.aClass106_3);
		} else {
			Static67.method1306();
		}
		@Pc(201) boolean local201 = arg0 == 1 || Static129.method2126(arg0) || Static91.method1566(arg0);
		@Pc(216) boolean local216 = Static170.anInt3494 == 1 || Static129.method2126(Static170.anInt3494) || Static91.method1566(Static170.anInt3494);
		if (local216 != local201) {
			if (local201) {
				Static71.anInt1878 = Static85.anInt2043;
				if (Static12.aClass34_Sub1_1.anInt7157 == 0) {
					Static328.method4659();
				} else {
					Static63.method1230(Static12.aClass34_Sub1_1.anInt7157, Static85.anInt2043, Static362.aClass211_75);
				}
				Static175.aClass159_2.method3615(false);
			} else {
				Static328.method4659();
				Static175.aClass159_2.method3615(true);
			}
		}
		if (Static198.method6177(arg0) || arg0 == 12) {
			Static30.aClass106_3.method5935();
		}
		Static170.anInt3494 = arg0;
	}

	@OriginalMember(owner = "client!fl", name = "a", descriptor = "(I[ILclient!ch;[I[I)V")
	public static void method2019(@OriginalArg(1) int[] arg0, @OriginalArg(2) Class30_Sub1_Sub1_Sub2 arg1, @OriginalArg(3) int[] arg2, @OriginalArg(4) int[] arg3) {
		for (@Pc(3) int local3 = 0; local3 < arg2.length; local3++) {
			@Pc(9) int local9 = arg2[local3];
			@Pc(13) int local13 = arg3[local3];
			@Pc(17) int local17 = arg0[local3];
			for (@Pc(19) int local19 = 0; local13 != 0 && local19 < arg1.aClass232Array3.length; local19++) {
				if ((local13 & 0x1) != 0) {
					if (local9 == -1) {
						arg1.aClass232Array3[local19] = null;
					} else {
						@Pc(43) Class235 local43 = Static107.aClass239_1.method5420(local9);
						@Pc(46) int local46 = local43.anInt6852;
						@Pc(51) Class232 local51 = arg1.aClass232Array3[local19];
						if (local51 != null) {
							if (local51.anInt6764 == local9) {
								if (local46 == 0) {
									local51 = arg1.aClass232Array3[local19] = null;
								} else if (local46 == 1) {
									local51.anInt6772 = 0;
									local51.anInt6768 = local17;
									local51.anInt6767 = 0;
									local51.anInt6765 = 0;
									local51.anInt6770 = 1;
									Static290.method4258(arg1.anInt7488, 0, arg1.aByte102, arg1.anInt7490, arg1 == Static429.aClass30_Sub1_Sub1_Sub2_2, local43);
								} else if (local46 == 2) {
									local51.anInt6772 = 0;
								}
							} else if (local43.anInt6856 >= Static107.aClass239_1.method5420(local51.anInt6764).anInt6856) {
								local51 = arg1.aClass232Array3[local19] = null;
							}
						}
						if (local51 == null) {
							local51 = arg1.aClass232Array3[local19] = new Class232();
							local51.anInt6765 = 0;
							local51.anInt6767 = 0;
							local51.anInt6772 = 0;
							local51.anInt6764 = local9;
							local51.anInt6770 = 1;
							local51.anInt6768 = local17;
							Static290.method4258(arg1.anInt7488, 0, arg1.aByte102, arg1.anInt7490, arg1 == Static429.aClass30_Sub1_Sub1_Sub2_2, local43);
						}
					}
				}
				local13 >>>= 0x1;
			}
		}
	}
}
