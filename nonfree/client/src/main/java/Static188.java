import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static188 {

	@OriginalMember(owner = "client!of", name = "a", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!of", name = "n", descriptor = "[I")
	public static int[] anIntArray318;

	@OriginalMember(owner = "client!of", name = "A", descriptor = "F")
	public static float aFloat40;

	@OriginalMember(owner = "client!of", name = "e", descriptor = "F")
	public static float aFloat39 = 0.0F;

	@OriginalMember(owner = "client!of", name = "o", descriptor = "I")
	public static int anInt3950 = -1;

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Z)V")
	public static void method3178() {
		Static159.aClass46_27.method1079();
		Static278.aClass46_39.method1079();
		Static8.aClass46_3.method1079();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(B)V")
	public static void method3179() {
		Static299.aClass46_19.method1079();
		Static165.aClass46_28.method1079();
		Static98.aClass46_13.method1079();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(Lclient!jd;I)V")
	public static void method3180(@OriginalArg(0) Class84 arg0) {
		if (Static209.aBoolean145) {
			return;
		}
		if (Static60.aBoolean106) {
			Static94.method1762();
		} else {
			Static160.method2793();
		}
		Static286.aClass2_Sub3_Sub1_11 = Static61.method2446(arg0, Static39.anInt945);
		@Pc(20) int local20 = Static20.anInt1235;
		@Pc(30) int local30 = local20 * 956 / 503;
		Static286.aClass2_Sub3_Sub1_11.method4363((Static257.anInt5343 - local30) / 2, 0, local30, local20);
		Static268.aClass71_1 = Static203.method3424(Static277.anInt5749, arg0);
		Static268.aClass71_1.method4629(Static257.anInt5343 / 2 - Static268.aClass71_1.anInt5766 / 2, 18);
		Static209.aBoolean145 = true;
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIBI)I")
	public static int method3181(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(8) int local8 = arg1 & 0x3;
		if (local8 == 0) {
			return arg0;
		} else if (local8 == 1) {
			return arg2;
		} else if (local8 == 2) {
			return 7 - arg0;
		} else {
			return 7 - arg2;
		}
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(II)Lclient!mi;")
	public static Class112 method3183(@OriginalArg(0) int arg0) {
		@Pc(10) Class112 local10 = (Class112) Static74.aClass46_10.method1074((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(20) byte[] local20 = Static65.aClass84_30.method2127(arg0, 34);
		local10 = new Class112();
		if (local20 != null) {
			local10.method2798(arg0, new Class2_Sub26(local20));
		}
		Static74.aClass46_10.method1071(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(Z)V")
	public static void method3185() {
		@Pc(7) int local7;
		@Pc(23) int local23;
		for (local7 = -1; local7 < Static68.anInt1507; local7++) {
			if (local7 == -1) {
				local23 = 2047;
			} else {
				local23 = Static33.anIntArray50[local7];
			}
			@Pc(31) Class36_Sub3_Sub2 local31 = Static212.aClass36_Sub3_Sub2Array1[local23];
			if (local31 != null && local31.anInt5066 > 0) {
				local31.anInt5066--;
				if (local31.anInt5066 == 0) {
					local31.aString248 = null;
				}
			}
		}
		for (local7 = 0; local7 < Static71.anInt1550; local7++) {
			local23 = Static9.anIntArray12[local7];
			@Pc(79) Class36_Sub3_Sub1 local79 = Static201.aClass36_Sub3_Sub1Array1[local23];
			if (local79 != null && local79.anInt5066 > 0) {
				local79.anInt5066--;
				if (local79.anInt5066 == 0) {
					local79.aString248 = null;
				}
			}
		}
	}

	@OriginalMember(owner = "client!of", name = "b", descriptor = "(I)V")
	public static void method3186() {
		Static237.aClass46_32.method1077();
	}

	@OriginalMember(owner = "client!of", name = "a", descriptor = "(IIIILclient!fc;Lclient!fc;IIIIJ)V")
	public static void method3187(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class36 arg4, @OriginalArg(5) Class36 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) long arg10) {
		if (arg4 == null) {
			return;
		}
		@Pc(6) Class50 local6 = new Class50();
		local6.aLong65 = arg10;
		local6.anInt1316 = arg1 * 128 + 64;
		local6.anInt1327 = arg2 * 128 + 64;
		local6.anInt1328 = arg3;
		local6.aClass36_3 = arg4;
		local6.aClass36_2 = arg5;
		local6.anInt1326 = arg6;
		local6.anInt1325 = arg7;
		local6.anInt1321 = arg8;
		local6.anInt1318 = arg9;
		for (@Pc(46) int local46 = arg0; local46 >= 0; local46--) {
			if (Static180.aClass2_Sub31ArrayArrayArray2[local46][arg1][arg2] == null) {
				Static180.aClass2_Sub31ArrayArrayArray2[local46][arg1][arg2] = new Class2_Sub31(local46, arg1, arg2);
			}
		}
		Static180.aClass2_Sub31ArrayArrayArray2[arg0][arg1][arg2].aClass50_1 = local6;
	}
}
