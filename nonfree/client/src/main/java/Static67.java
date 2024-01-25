import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static67 {

	@OriginalMember(owner = "client!cfa", name = "s", descriptor = "Lclient!ufa;")
	public static final Class337 aClass337_4 = new Class337(1, 4);

	@OriginalMember(owner = "client!cfa", name = "w", descriptor = "Lclient!rf;")
	public static final Class292 aClass292_2 = new Class292();

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lclient!jf;Z)Z")
	public static boolean method1693(@OriginalArg(0) Class4_Sub1_Sub2 arg0, @OriginalArg(1) boolean arg1) {
		@Pc(6) boolean local6 = Static364.aClass51Array3 == Static2.aClass51Array1;
		@Pc(8) int local8 = 0;
		@Pc(10) short local10 = 0;
		@Pc(12) byte local12 = 0;
		arg0.method7707();
		if (arg0.aShort118 < 0 || arg0.aShort116 < 0 || arg0.aShort117 >= Static569.anInt9425 || arg0.aShort119 >= Static293.anInt5181) {
			return false;
		}
		@Pc(33) short local33 = 0;
		@Pc(40) int local40;
		for (@Pc(36) int local36 = arg0.aShort118; local36 <= arg0.aShort117; local36++) {
			for (local40 = arg0.aShort116; local40 <= arg0.aShort119; local40++) {
				@Pc(47) Class77 local47 = Static323.method5276(arg0.aByte123, local36, local40);
				if (local47 != null) {
					@Pc(53) Class128 local53 = Static177.method3081(arg0);
					@Pc(56) Class128 local56 = local47.aClass128_1;
					if (local56 == null) {
						local47.aClass128_1 = local53;
					} else {
						while (local56.aClass128_2 != null) {
							local56 = local56.aClass128_2;
						}
						local56.aClass128_2 = local53;
					}
					if (local6 && (Static307.anIntArrayArray38[local36][local40] & 0xFF000000) != 0) {
						local8 = Static307.anIntArrayArray38[local36][local40];
						local10 = Static503.aShortArrayArray15[local36][local40];
						local12 = Static241.aByteArrayArray12[local36][local40];
					}
					if (!arg1 && local47.aClass4_Sub1_Sub5_1 != null && local47.aClass4_Sub1_Sub5_1.aShort115 > local33) {
						local33 = local47.aClass4_Sub1_Sub5_1.aShort115;
					}
				}
			}
		}
		if (local6 && (local8 & 0xFF000000) != 0) {
			for (local40 = arg0.aShort118; local40 <= arg0.aShort117; local40++) {
				for (@Pc(136) int local136 = arg0.aShort116; local136 <= arg0.aShort119; local136++) {
					if ((Static307.anIntArrayArray38[local40][local136] & 0xFF000000) == 0) {
						Static307.anIntArrayArray38[local40][local136] = local8;
						Static503.aShortArrayArray15[local40][local136] = local10;
						Static241.aByteArrayArray12[local40][local136] = local12;
					}
				}
			}
		}
		if (arg1) {
			Static290.aClass4_Sub1_Sub2Array1[Static270.anInt4932++] = arg0;
		} else {
			local40 = Static364.aClass51Array3 == Static2.aClass51Array1 ? 1 : 0;
			if (!arg0.method7693()) {
				Static491.aClass4_Sub1ArrayArray3[local40][Static582.anIntArray612[local40]++] = arg0;
			} else if (arg0.method7702()) {
				Static368.aClass4_Sub1ArrayArray2[local40][Static62.anIntArray650[local40]++] = arg0;
			} else {
				Static276.aClass4_Sub1ArrayArray1[local40][Static93.anIntArray83[local40]++] = arg0;
				Static585.aBoolean690 = true;
			}
		}
		if (arg1) {
			arg0.anInt8915 -= local33;
		}
		return true;
	}

	@OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IIIII[ILclient!kw;Z)Lclient!of;")
	public static Class76_Sub3_Sub1 method1695(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int[] arg4, @OriginalArg(6) Class5_Sub2 arg5) {
		if (arg5.aBoolean379 || Static323.method5278(arg0) && Static323.method5278(arg2)) {
			return new Class76_Sub3_Sub1(arg5, 3553, arg0, arg2, false, arg4, arg1, 0);
		} else if (arg5.aBoolean384) {
			return new Class76_Sub3_Sub1(arg5, 34037, arg0, arg2, false, arg4, arg1, 0);
		} else {
			return new Class76_Sub3_Sub1(arg5, arg0, arg2, Static109.method2234(arg0), Static109.method2234(arg2), arg4);
		}
	}

	@OriginalMember(owner = "client!cfa", name = "c", descriptor = "(I)V")
	public static void method1696() {
		Static161.aClass223_16 = new Class223();
	}

	@OriginalMember(owner = "client!cfa", name = "d", descriptor = "(I)Ljava/lang/String;")
	public static String method1697() {
		if (Static447.aBoolean555 || Static203.aClass3_Sub4_Sub13_1 == null) {
			return "";
		} else if ((Static203.aClass3_Sub4_Sub13_1.aString55 == null || Static203.aClass3_Sub4_Sub13_1.aString55.length() == 0) && Static203.aClass3_Sub4_Sub13_1.aString56 != null && Static203.aClass3_Sub4_Sub13_1.aString56.length() > 0) {
			return Static203.aClass3_Sub4_Sub13_1.aString56;
		} else {
			return Static203.aClass3_Sub4_Sub13_1.aString55;
		}
	}
}
