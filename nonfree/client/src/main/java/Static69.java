import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static69 {

	@OriginalMember(owner = "client!cl", name = "f", descriptor = "[Lclient!rk;")
	public static Class299[] aClass299Array3;

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "I")
	public static int anInt5062 = 0;

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "Lclient!mea;")
	public static final Class222 aClass222_9 = new Class222("", 10);

	@OriginalMember(owner = "client!cl", name = "e", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_85 = new Class349(88, 8);

	@OriginalMember(owner = "client!cl", name = "i", descriptor = "[I")
	public static final int[] anIntArray352 = new int[] { 3500, 200 };

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII)V")
	public static void method4389(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(100) Class228 local100 = Static469.aClass228ArrayArrayArray6[arg3][arg2][arg1];
		if (local100 != null) {
			if (arg0 == 1) {
				local100.aShort80 = 0;
			} else if (arg0 == 2) {
				local100.aShort83 = 0;
			}
		}
		Static201.method2518();
	}

	@OriginalMember(owner = "client!cl", name = "b", descriptor = "(IIIII)V")
	public static void method4391(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(9) float local9 = (float) Static476.anInt7586 / (float) Static476.anInt7576;
		@Pc(11) int local11 = arg0;
		@Pc(18) int local18 = arg2;
		if (local9 < 1.0F) {
			local18 = (int) (local9 * (float) arg0);
		} else {
			local11 = (int) ((float) arg2 / local9);
		}
		@Pc(44) int local44 = arg1 - (arg0 - local11) / 2;
		@Pc(52) int local52 = arg3 - (arg2 - local18) / 2;
		Static187.anInt8961 = -1;
		Static366.anInt6166 = Static476.anInt7586 - Static476.anInt7586 * local52 / local18;
		Static317.anInt5332 = -1;
		Static26.anInt449 = Static476.anInt7576 * local44 / local11;
		Static170.method2217();
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(IZI)Z")
	public static boolean method4392(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static19.method290(arg0, arg1) | (arg1 & 0x70000) != 0 || Static347.method5021(arg0, arg1);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!mv;IZIIIZ)V")
	public static void method4393(@OriginalArg(0) Class229 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(5) int arg3) {
		if (arg2 <= 0) {
			Static228.method2769(arg1, arg0, arg3);
			return;
		}
		Static25.anInt442 = 1;
		Static488.aClass2_Sub3_Sub2_5 = null;
		Static467.aClass229_108 = arg0;
		Static90.anInt1607 = 0;
		Static268.anInt4384 = arg3;
		Static518.anInt8283 = arg1;
		Static431.aBoolean568 = false;
		Static338.anInt5808 = Static84.aClass2_Sub3_Sub2_7.method2066() / arg2;
		if (Static338.anInt5808 < 1) {
			Static338.anInt5808 = 1;
		}
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(I[S[Ljava/lang/String;II)V")
	public static void method4394(@OriginalArg(1) short[] arg0, @OriginalArg(2) String[] arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		if (arg2 >= arg3) {
			return;
		}
		@Pc(14) int local14 = (arg2 + arg3) / 2;
		@Pc(16) int local16 = arg2;
		@Pc(20) String local20 = arg1[local14];
		arg1[local14] = arg1[arg3];
		arg1[arg3] = local20;
		@Pc(34) short local34 = arg0[local14];
		arg0[local14] = arg0[arg3];
		arg0[arg3] = local34;
		for (@Pc(46) int local46 = arg2; local46 < arg3; local46++) {
			if (local20 == null || arg1[local46] != null && arg1[local46].compareTo(local20) < (local46 & 0x1)) {
				@Pc(67) String local67 = arg1[local46];
				arg1[local46] = arg1[local16];
				arg1[local16] = local67;
				@Pc(81) short local81 = arg0[local46];
				arg0[local46] = arg0[local16];
				arg0[local16++] = local81;
			}
		}
		arg1[arg3] = arg1[local16];
		arg1[local16] = local20;
		arg0[arg3] = arg0[local16];
		arg0[local16] = local34;
		method4394(arg0, arg1, arg2, local16 - 1);
		method4394(arg0, arg1, local16 + 1, arg3);
	}

	@OriginalMember(owner = "client!cl", name = "a", descriptor = "(Lclient!r;I)V")
	public static void method4395(@OriginalArg(0) Class162 arg0) {
		if (Static484.anInt7715 < 2 && !Static355.aBoolean473 || Class12_Sub2_Sub1_Sub3.lb != null) {
			return;
		}
		@Pc(41) String local41;
		if (Static355.aBoolean473 && Static484.anInt7715 < 2) {
			local41 = Static434.aString105 + Static229.aClass159_34.method2776(Static261.anInt4297) + Static196.aString39 + " ->";
		} else if (Static418.aBoolean542 && Static106.aClass150_3.method2632(81) && Static484.anInt7715 > 2) {
			local41 = Static491.method6283((Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285.aClass2_285);
		} else {
			@Pc(37) Class2_Sub27 local37 = (Class2_Sub27) Static411.aClass70_43.aClass2_39.aClass2_285;
			local41 = Static491.method6283(local37);
			@Pc(43) int[] local43 = null;
			if (Static427.method5678(local37.anInt4323)) {
				local43 = Static466.aClass130_2.method2311((int) local37.aLong113).anIntArray282;
			} else if (local37.anInt4325 != -1) {
				local43 = Static466.aClass130_2.method2311(local37.anInt4325).anIntArray282;
			} else if (Static577.method7485(local37.anInt4323)) {
				@Pc(66) Class2_Sub5 local66 = (Class2_Sub5) Static436.aClass90_26.method1685((long) local37.aLong113);
				if (local66 != null) {
					@Pc(71) Class12_Sub2_Sub1_Sub4_Sub2 local71 = local66.aClass12_Sub2_Sub1_Sub4_Sub2_1;
					@Pc(74) Class295 local74 = local71.aClass295_1;
					if (local74.anIntArray493 != null) {
						local74 = local74.method5942(Static426.aClass160_1);
					}
					if (local74 != null) {
						local43 = local74.anIntArray491;
					}
				}
			} else if (Static219.method2681(local37.anInt4323)) {
				@Pc(112) Class216 local112;
				if (local37.anInt4323 == 1007) {
					local112 = Static362.aClass290_2.method5799((int) local37.aLong113);
				} else {
					local112 = Static362.aClass290_2.method5799((int) (local37.aLong113 >>> 32 & 0x7FFFFFFFL));
				}
				if (local112.anIntArray362 != null) {
					local112 = local112.method4560(Static426.aClass160_1);
				}
				if (local112 != null) {
					local43 = local112.anIntArray364;
				}
			}
			if (local43 != null) {
				local41 = local41 + Static88.method1301(local43);
			}
		}
		if (Static484.anInt7715 > 2) {
			local41 = local41 + "<col=ffffff> / " + (Static484.anInt7715 - 2) + Static229.aClass159_27.method2776(Static261.anInt4297);
		}
		if (Static70.aClass273_2 != null) {
			@Pc(266) Class37 local266 = Static70.aClass273_2.method5649(arg0);
			if (local266 == null) {
				local266 = Static81.aClass37_16;
			}
			local266.method7711(Static70.aClass273_2.anInt6841, Static427.anInt6928, local41, Static117.anInt2048, Static70.aClass273_2.anInt6854, Static309.anIntArray355, Static70.aClass273_2.anInt6814, Static389.aClass38Array21, Static366.aRandom1, Static70.aClass273_2.anInt6867, Static558.anIntArray592, Static70.aClass273_2.anInt6883, Static70.aClass273_2.anInt6865, Static287.anInt4869);
			Static359.method2627(Static558.anIntArray592[3], Static558.anIntArray592[0], Static558.anIntArray592[2], Static558.anIntArray592[1]);
		} else if (Static238.aClass273_6 != null && Static18.aClass308_7 == Static278.aClass308_6) {
			@Pc(242) int local242 = Static81.aClass37_16.method7712(Static389.aClass38Array21, local41, Static309.anIntArray355, Static366.aRandom1, Static63.anInt1139 + 4, Static287.anInt4869, Static151.anInt2435 + 16);
			Static359.method2627(16, Static63.anInt1139 + 4, Static537.aClass112_11.method2078(local41) + local242, Static151.anInt2435);
		}
	}
}
