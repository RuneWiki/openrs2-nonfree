import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!jb", name = "e", descriptor = "Lclient!c;")
	public static Class6 aClass6_3;

	@OriginalMember(owner = "client!jb", name = "b", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_79 = new Class25(94, -2);

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(I)V")
	public static void method2746() {
		if (Static257.aClass75_8 == null) {
			return;
		}
		Static393.aClass97_8.method2147();
		Static433.method5875();
		Static388.method5383();
		Static86.method1340();
		Static268.method3718();
		Static235.method3219();
		if (Static454.aClass247_1 != null) {
			Static454.aClass247_1.method5667();
		}
		Static51.method804();
		Static262.method3688();
		Static41.method624();
		Static428.method5826(false);
		Static256.method4479();
		for (@Pc(33) int local33 = 0; local33 < 2048; local33++) {
			@Pc(39) Class11_Sub5_Sub2_Sub1 local39 = Static435.aClass11_Sub5_Sub2_Sub1Array1[local33];
			if (local39 != null) {
				local39.aClass2_Sub28_3 = null;
				for (@Pc(46) int local46 = 0; local46 < local39.aClass63Array3.length; local46++) {
					local39.aClass63Array3[local46] = null;
				}
			}
		}
		for (@Pc(71) int local71 = 0; local71 < Static30.anInt548; local71++) {
			@Pc(78) Class11_Sub5_Sub2_Sub2 local78 = Static226.aClass2_Sub34Array1[local71].aClass11_Sub5_Sub2_Sub2_2;
			if (local78 != null) {
				for (@Pc(82) int local82 = 0; local82 < local78.aClass63Array3.length; local82++) {
					local78.aClass63Array3[local82] = null;
				}
			}
		}
		aClass6_3 = null;
		Static186.aClass6_2 = null;
		Static257.aClass75_8.method5989();
		Static257.aClass75_8 = null;
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(IIIZI)V")
	public static void method2747(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(6) int local6;
		if (arg1 >= arg0) {
			for (local6 = arg0; local6 < arg1; local6++) {
				Static46.anIntArrayArray24[local6][arg2] = arg3;
			}
		} else {
			for (local6 = arg1; local6 < arg0; local6++) {
				Static46.anIntArrayArray24[local6][arg2] = arg3;
			}
		}
	}

	@OriginalMember(owner = "client!jb", name = "a", descriptor = "(III)V")
	public static void method2748(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		if (Static5.aFloat87 > Static5.aFloat88) {
			Static5.aFloat88 = (float) ((double) Static5.aFloat88 + (double) Static5.aFloat88 / 30.0D);
			if (Static5.aFloat87 < Static5.aFloat88) {
				Static5.aFloat88 = Static5.aFloat87;
			}
			Static423.method5788();
			Static5.anInt6717 = (int) Static5.aFloat88 >> 1;
			Static5.aByteArrayArrayArray16 = Static424.method5816(Static5.anInt6717);
		} else if (Static5.aFloat87 < Static5.aFloat88) {
			Static5.aFloat88 = (float) ((double) Static5.aFloat88 - (double) Static5.aFloat88 / 30.0D);
			if (Static5.aFloat88 < Static5.aFloat87) {
				Static5.aFloat88 = Static5.aFloat87;
			}
			Static423.method5788();
			Static5.anInt6717 = (int) Static5.aFloat88 >> 1;
			Static5.aByteArrayArrayArray16 = Static424.method5816(Static5.anInt6717);
		}
		if (Static32.anInt7619 != -1 && Static227.anInt3810 != -1) {
			@Pc(83) int local83 = Static32.anInt7619 - Static204.anInt3501;
			if (local83 < 2 || local83 > 2) {
				local83 /= 8;
			}
			@Pc(100) int local100 = Static227.anInt3810 - Static180.anInt3183;
			Static204.anInt3501 += local83;
			if (local100 < 2 || local100 > 2) {
				local100 /= 8;
			}
			Static180.anInt3183 += local100;
			if (local83 == 0 && local100 == 0) {
				Static32.anInt7619 = -1;
				Static227.anInt3810 = -1;
			}
			Static423.method5788();
		}
		if (Static340.anInt6086 <= 0) {
			Static139.anInt2570 = -1;
			Static377.anInt6587 = -1;
		} else {
			Static37.anInt611--;
			if (Static37.anInt611 == 0) {
				Static340.anInt6086--;
				Static37.anInt611 = 100;
			}
		}
		if (!Static86.aBoolean87 || Static463.aClass181_53 == null) {
			return;
		}
		for (@Pc(165) Class2_Sub32 local165 = (Class2_Sub32) Static463.aClass181_53.method3972(); local165 != null; local165 = (Class2_Sub32) Static463.aClass181_53.method3975()) {
			@Pc(174) Class203 local174 = Static5.aClass84_4.method1953(local165.aClass2_Sub16_1.anInt2880);
			if (local165.method4378(arg0, arg1)) {
				if (local174.aStringArray55 != null) {
					if (local174.aStringArray55[4] != null) {
						Static202.method2833((long) local165.aClass2_Sub16_1.anInt2880, 0, true, false, local174.aString63, -1, local174.anInt5975, local174.aStringArray55[4], 1003, -1);
					}
					if (local174.aStringArray55[3] != null) {
						Static202.method2833((long) local165.aClass2_Sub16_1.anInt2880, 0, true, false, local174.aString63, -1, local174.anInt5975, local174.aStringArray55[3], 1010, -1);
					}
					if (local174.aStringArray55[2] != null) {
						Static202.method2833((long) local165.aClass2_Sub16_1.anInt2880, 0, true, false, local174.aString63, -1, local174.anInt5975, local174.aStringArray55[2], 1001, -1);
					}
					if (local174.aStringArray55[1] != null) {
						Static202.method2833((long) local165.aClass2_Sub16_1.anInt2880, 0, true, false, local174.aString63, -1, local174.anInt5975, local174.aStringArray55[1], 1008, -1);
					}
					if (local174.aStringArray55[0] != null) {
						Static202.method2833((long) local165.aClass2_Sub16_1.anInt2880, 0, true, false, local174.aString63, -1, local174.anInt5975, local174.aStringArray55[0], 1009, -1);
					}
				}
				if (!local165.aClass2_Sub16_1.aBoolean181) {
					local165.aClass2_Sub16_1.aBoolean181 = true;
					Static76.method1146(Static86.aClass91_3, local165.aClass2_Sub16_1.anInt2880, local174.anInt5975);
				}
				if (local165.aClass2_Sub16_1.aBoolean181) {
					Static76.method1146(Static94.aClass91_13, local165.aClass2_Sub16_1.anInt2880, local174.anInt5975);
				}
			} else if (local165.aClass2_Sub16_1.aBoolean181) {
				local165.aClass2_Sub16_1.aBoolean181 = false;
				Static76.method1146(Static265.aClass91_10, local165.aClass2_Sub16_1.anInt2880, local174.anInt5975);
			}
		}
	}
}
