import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static56 {

	@OriginalMember(owner = "client!ca", name = "F", descriptor = "F")
	public static float aFloat22;

	@OriginalMember(owner = "client!ca", name = "N", descriptor = "I")
	public static int anInt1068;

	@OriginalMember(owner = "client!ca", name = "M", descriptor = "Lclient!maa;")
	public static final Class215 aClass215_2 = new Class215(13, -1);

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ILclient!dw;IIII)Lclient!gv;")
	public static Class94_Sub2_Sub1 method1013(@OriginalArg(1) Class82_Sub1 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0.aBoolean180 || Static112.method1840(arg2) && Static112.method1840(arg4)) {
			return new Class94_Sub2_Sub1(arg0, 3553, arg1, arg3, arg2, arg4, true);
		} else if (arg0.aBoolean176) {
			return new Class94_Sub2_Sub1(arg0, 34037, arg1, arg3, arg2, arg4, true);
		} else {
			return new Class94_Sub2_Sub1(arg0, arg1, arg3, arg2, arg4, Static533.method1203(arg2), Static533.method1203(arg4), true);
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IBIZII)V")
	public static void method1014(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) boolean arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg0 < 1) {
			arg0 = 1;
		}
		if (arg1 < 1) {
			arg1 = 1;
		}
		@Pc(21) int local21 = arg0 - 334;
		if (local21 < 0) {
			local21 = 0;
		} else if (local21 > 100) {
			local21 = 100;
		}
		@Pc(48) int local48 = Static428.aShort84 + (Static548.aShort123 - Static428.aShort84) * local21 / 100;
		if (local48 < Static554.aShort107) {
			local48 = Static554.aShort107;
		} else if (Static68.aShort21 < local48) {
			local48 = Static68.aShort21;
		}
		@Pc(70) int local70 = arg0 * 512 * local48 / (arg1 * 334);
		@Pc(104) int local104;
		@Pc(111) int local111;
		@Pc(75) short local75;
		if (Static397.aShort82 > local70) {
			local75 = Static397.aShort82;
			local48 = arg1 * local75 * 334 / (arg0 * 512);
			if (Static68.aShort21 < local48) {
				local48 = Static68.aShort21;
				local104 = local48 * arg0 * 512 / (local75 * 334);
				local111 = (arg1 - local104) / 2;
				if (arg2) {
					Static266.aClass82_8.la();
					Static266.aClass82_8.method6134(arg3, arg0, local111, -16777216, arg4);
					Static266.aClass82_8.method6134(arg1 + arg3 - local111, arg0, local111, -16777216, arg4);
				}
				arg3 += local111;
				arg1 -= local111 * 2;
			}
		} else if (Static605.aShort121 < local70) {
			local75 = Static605.aShort121;
			local48 = local75 * 334 * arg1 / (arg0 * 512);
			if (local48 < Static554.aShort107) {
				local48 = Static554.aShort107;
				local104 = local75 * 334 * arg1 / (local48 * 512);
				local111 = (arg0 - local104) / 2;
				if (arg2) {
					Static266.aClass82_8.la();
					Static266.aClass82_8.method6134(arg3, local111, arg1, -16777216, arg4);
					Static266.aClass82_8.method6134(arg3, local111, arg1, -16777216, arg0 + arg4 - local111);
				}
				arg0 -= local111 * 2;
				arg4 += local111;
			}
		}
		Static274.anInt5297 = (short) arg0;
		Static59.anInt1084 = arg3;
		Static33.anInt503 = arg4;
		Static556.anInt9246 = (short) arg1;
		Static631.anInt10059 = local48 * arg0 / 334;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZZB)V")
	public static void method1015(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (arg1) {
			Static485.anInt8240++;
			Static301.method5123();
		}
		if (arg0) {
			Static456.anInt7762++;
			Static585.method8126();
		}
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "()V")
	public static void method1016() {
		@Pc(3) int local3;
		@Pc(6) int local6;
		@Pc(9) int local9;
		if (Static303.aClass351ArrayArrayArray3 != null) {
			for (local3 = 0; local3 < Static303.aClass351ArrayArrayArray3.length; local3++) {
				for (local6 = 0; local6 < Static573.anInt6750; local6++) {
					for (local9 = 0; local9 < Static547.anInt9143; local9++) {
						if (Static303.aClass351ArrayArrayArray3[local3][local6][local9] != null) {
							Static303.aClass351ArrayArrayArray3[local3][local6][local9].method8235();
						}
						Static303.aClass351ArrayArrayArray3[local3][local6][local9] = null;
					}
				}
			}
		}
		Static303.aClass351ArrayArrayArray3 = null;
		Static518.aClass91Array2 = null;
		if (Static126.aClass351ArrayArrayArray1 != null) {
			for (local3 = 0; local3 < Static126.aClass351ArrayArrayArray1.length; local3++) {
				for (local6 = 0; local6 < Static573.anInt6750; local6++) {
					for (local9 = 0; local9 < Static547.anInt9143; local9++) {
						if (Static126.aClass351ArrayArrayArray1[local3][local6][local9] != null) {
							Static126.aClass351ArrayArrayArray1[local3][local6][local9].method8235();
						}
						Static126.aClass351ArrayArrayArray1[local3][local6][local9] = null;
					}
				}
			}
		}
		Static126.aClass351ArrayArrayArray1 = null;
		Static485.aClass91Array1 = null;
		Static567.aClass351ArrayArrayArray4 = null;
		Static637.aClass91Array4 = null;
		Static140.aBooleanArrayArray2 = null;
		Static642.aBooleanArrayArray7 = null;
		Static549.anIntArray573 = null;
		Static38.aBooleanArrayArrayArray1 = null;
		Static412.aBooleanArrayArrayArray2 = null;
		Static39.method1678();
		if (Static513.aClass9_Sub2_Sub1Array1 != null) {
			for (local3 = 0; local3 < Static135.anInt2825; local3++) {
				Static513.aClass9_Sub2_Sub1Array1[local3] = null;
			}
			Static135.anInt2825 = 0;
		}
		Static463.aClass9_Sub2Array6 = null;
		Static250.aClass9_Sub2Array5 = null;
		Static164.aClass9_Sub2Array1 = null;
		if (Static275.aClass9_Sub2Array3 != null) {
			for (local3 = 0; local3 < Static275.aClass9_Sub2Array3.length; local3++) {
				Static275.aClass9_Sub2Array3[local3] = null;
			}
			Static141.anInt2883 = 0;
		}
		if (Static578.aClass9_Sub2Array7 != null) {
			for (local3 = 0; local3 < Static578.aClass9_Sub2Array7.length; local3++) {
				Static578.aClass9_Sub2Array7[local3] = null;
			}
			Static521.anInt8817 = 0;
		}
		if (Static209.aClass339Array1 != null) {
			for (local3 = 0; local3 < Static162.anInt3228; local3++) {
				Static209.aClass339Array1[local3] = null;
			}
			for (local6 = 0; local6 < Static603.anInt9778; local6++) {
				for (local9 = 0; local9 < Static573.anInt6750; local9++) {
					for (@Pc(195) int local195 = 0; local195 < Static547.anInt9143; local195++) {
						Static387.aLongArrayArrayArray1[local6][local9][local195] = 0L;
					}
				}
			}
			Static162.anInt3228 = 0;
		}
		Static474.method7011();
		Static460.aClass47_3 = Static460.aClass47_2;
		Static460.aClass47_3.method1162();
		Static52.aByteArrayArray4 = null;
		Static411.anIntArrayArray48 = null;
		Static616.aShortArrayArray20 = null;
		if (Static70.aClass301Array1 != null) {
			Static636.method8571();
			Static568.aClass82_14.method6165(1);
			Static568.aClass82_14.method6098(0);
		}
		if (Static197.aClass250Array1 != null) {
			Static197.aClass250Array1 = null;
		}
		Static568.aClass82_14 = null;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(BII)V")
	public static void method1017(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class3_Sub7_Sub5 local12 = Static138.method2377(14, arg0);
		local12.method1474();
		local12.anInt1728 = arg1;
	}

	@OriginalMember(owner = "client!ca", name = "a", descriptor = "(IIZ)V")
	public static void method1019(@OriginalArg(0) int arg0, @OriginalArg(2) boolean arg1) {
		if (arg1) {
			@Pc(16) Class3_Sub27 local16 = Static59.method1040(Static325.aClass20_2, Static218.aClass314_70);
			local16.aClass3_Sub9_Sub2_2.method5620(arg0);
			Static148.method2572(local16);
		} else {
			Static400.method6281(Static536.aClass379_9, arg0, -1);
		}
	}
}
