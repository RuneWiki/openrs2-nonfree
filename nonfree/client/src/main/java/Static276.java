import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static276 {

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "I")
	public static int anInt5350 = 0;

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!oa;IILclient!q;III[[[B[I[I[I[I[IIBIIZ)V")
	public static void method4586(@OriginalArg(0) Class9 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Class8 arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) byte[][][] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int[] arg11, @OriginalArg(12) int[] arg12, @OriginalArg(13) int arg13, @OriginalArg(14) byte arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) boolean arg17) {
		Static114.aClass9_5 = arg0;
		Static300.anInt5686 = arg1;
		Static258.aClass8_6 = arg3;
		Static311.aBoolean405 = Static114.aClass9_5.method5427() > 0;
		Static579.anInt7897 = arg4 >> Static494.anInt8859;
		Static266.anInt4817 = arg6 >> Static494.anInt8859;
		Static279.anInt5385 = arg4;
		Static325.anInt6147 = arg6;
		Static561.anInt2407 = arg5;
		Static118.anInt2585 = Static579.anInt7897 - Static203.anInt4358;
		if (Static118.anInt2585 < 0) {
			Static113.anInt2545 = -Static118.anInt2585;
			Static118.anInt2585 = 0;
		} else {
			Static113.anInt2545 = 0;
		}
		Static17.anInt874 = Static266.anInt4817 - Static203.anInt4358;
		if (Static17.anInt874 < 0) {
			Static37.anInt1206 = -Static17.anInt874;
			Static17.anInt874 = 0;
		} else {
			Static37.anInt1206 = 0;
		}
		Static275.anInt5345 = Static579.anInt7897 + Static203.anInt4358;
		if (Static275.anInt5345 > Static396.anInt7505) {
			Static275.anInt5345 = Static396.anInt7505;
		}
		Static67.anInt1577 = Static266.anInt4817 + Static203.anInt4358;
		if (Static67.anInt1577 > Static54.anInt1441) {
			Static67.anInt1577 = Static54.anInt1441;
		}
		@Pc(77) int local77;
		@Pc(84) int local84;
		@Pc(90) int local90;
		for (@Pc(74) int local74 = 0; local74 < Static203.anInt4358 + Static203.anInt4358 + 2; local74++) {
			for (local77 = 0; local77 < Static203.anInt4358 + Static203.anInt4358 + 2; local77++) {
				local84 = Static579.anInt7897 + local74 - Static203.anInt4358;
				local90 = Static266.anInt4817 + local77 - Static203.anInt4358;
				if (local84 >= 0 && local90 >= 0 && local84 < Static396.anInt7505 && local90 < Static54.anInt1441) {
					@Pc(104) int local104 = local84 << Static494.anInt8859;
					@Pc(108) int local108 = local90 << Static494.anInt8859;
					@Pc(124) int local124 = Static53.aClass62Array2[Static53.aClass62Array2.length - 1].JA(local84, local90) - (0x3E8 << Static494.anInt8859 - 7);
					@Pc(144) int local144 = Static369.aClass62Array3 == null ? Static53.aClass62Array2[0].JA(local84, local90) + Static364.anInt7313 : Static369.aClass62Array3[0].JA(local84, local90) + Static364.anInt7313;
					Static277.aBooleanArrayArray3[local74][local77] = Static114.aClass9_5.FA(local104, local124, local108, local104, local144, local108);
				} else {
					Static277.aBooleanArrayArray3[local74][local77] = false;
				}
			}
		}
		for (local77 = 0; local77 < Static203.anInt4358 + Static203.anInt4358 + 1; local77++) {
			for (local84 = 0; local84 < Static203.anInt4358 + Static203.anInt4358 + 1; local84++) {
				Static487.aBooleanArrayArray9[local77][local84] = Static277.aBooleanArrayArray3[local77][local84] || Static277.aBooleanArrayArray3[local77 + 1][local84] || Static277.aBooleanArrayArray3[local77][local84 + 1] || Static277.aBooleanArrayArray3[local77 + 1][local84 + 1];
			}
		}
		Static400.anIntArray530 = arg8;
		Static384.anIntArray506 = arg9;
		Static393.anIntArray519 = arg10;
		Static22.anIntArray59 = arg11;
		Static538.anIntArray807 = arg12;
		Static111.method2284();
		Static268.method7570(Static114.aClass9_5);
		for (@Pc(261) Class5_Sub5 local261 = (Class5_Sub5) Static16.aClass267_1.method6544(); local261 != null; local261 = (Class5_Sub5) Static16.aClass267_1.method6543()) {
			local261.method7282();
			Static223.method4017(local261);
		}
		if (Static311.aBoolean405) {
			for (local90 = 0; local90 < Static258.anInt5217; local90++) {
				Static470.aClass342Array1[local90].method7989(arg17, arg1);
			}
		}
		if (arg2 > 1) {
			Static114.aClass9_5.method5426(0);
			if (Static83.aClass58_2 == null || Static83.aClass58_2 instanceof Class58_Sub1) {
				Static83.aClass58_2 = new Class58_Sub2();
			}
		} else if (Static83.aClass58_2 == null || Static83.aClass58_2 instanceof Class58_Sub2) {
			Static83.aClass58_2 = new Class58_Sub1();
		}
		Static83.aClass58_2.method5090(arg2);
		Static83.aClass58_2.method5095();
		if (Static263.aClass224ArrayArrayArray2 != null) {
			Static498.method7455(true);
			Static83.aClass58_2.method5096(22);
			Static189.method3620(arg2, null, 0, (byte) 0, arg15, arg16);
			Static83.aClass58_2.method5095();
			Static83.aClass58_2.method5096(23);
			Static498.method7455(false);
		}
		Static189.method3620(arg2, arg7, arg13, arg14, arg15, arg16);
		Static83.aClass58_2.method5095();
		Static83.aClass58_2.method5088();
		Static83.aClass58_2.method5095();
		if (arg2 > 1) {
			Static114.aClass9_5.method5459(0);
		}
		Static114.aClass9_5.method5401(0, null);
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(BLclient!rs;)V")
	public static void method4587(@OriginalArg(1) Class6_Sub41 arg0) {
		if (Static256.aClass224ArrayArrayArray1 == null) {
			return;
		}
		@Pc(18) Interface17 local18 = null;
		if (arg0.anInt8274 == 0) {
			local18 = (Interface17) Static298.method4853(arg0.anInt8271, arg0.anInt8273, arg0.anInt8275);
		}
		if (arg0.anInt8274 == 1) {
			local18 = (Interface17) Static541.method7782(arg0.anInt8271, arg0.anInt8273, arg0.anInt8275);
		}
		if (arg0.anInt8274 == 2) {
			local18 = (Interface17) Static178.method3532(arg0.anInt8271, arg0.anInt8273, arg0.anInt8275, ql.class);
		}
		if (arg0.anInt8274 == 3) {
			local18 = (Interface17) Static216.method3980(arg0.anInt8271, arg0.anInt8273, arg0.anInt8275);
		}
		if (local18 == null) {
			arg0.anInt8269 = -1;
			arg0.anInt8270 = 0;
			arg0.anInt8264 = 0;
		} else {
			arg0.anInt8269 = local18.method8114();
			arg0.anInt8270 = local18.method8119();
			arg0.anInt8264 = local18.method8121();
		}
	}

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZLclient!gi;ILclient!gi;)I")
	public static int method4588(@OriginalArg(1) boolean arg0, @OriginalArg(2) Class116_Sub1 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class116_Sub1 arg3) {
		@Pc(11) int local11;
		@Pc(14) int local14;
		if (arg2 == 1) {
			local11 = arg1.anInt3893;
			local14 = arg3.anInt3893;
			if (!arg0) {
				if (local11 == -1) {
					local11 = 2001;
				}
				if (local14 == -1) {
					local14 = 2001;
				}
			}
			return local11 - local14;
		} else if (arg2 == 2) {
			return Static85.method1891(arg1.method3475().aString99, arg3.method3475().aString99, Static286.anInt5468);
		} else if (arg2 == 3) {
			if (arg1.aString40.equals("-")) {
				if (arg3.aString40.equals("-")) {
					return 0;
				} else if (arg0) {
					return -1;
				} else {
					return 1;
				}
			} else if (arg3.aString40.equals("-")) {
				return arg0 ? 1 : -1;
			} else {
				return Static85.method1891(arg1.aString40, arg3.aString40, Static286.anInt5468);
			}
		} else if (arg2 == 4) {
			if (arg1.method3470()) {
				return arg3.method3470() ? 0 : 1;
			} else if (arg3.method3470()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 5) {
			if (arg1.method3469()) {
				return arg3.method3469() ? 0 : 1;
			} else if (arg3.method3469()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 6) {
			if (arg1.method3467()) {
				return arg3.method3467() ? 0 : 1;
			} else if (arg3.method3467()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 7) {
			if (arg1.method3471()) {
				return arg3.method3471() ? 0 : 1;
			} else if (arg3.method3471()) {
				return -1;
			} else {
				return 0;
			}
		} else if (arg2 == 8) {
			local11 = arg1.anInt3900;
			local14 = arg3.anInt3900;
			if (arg0) {
				if (local11 == 1000) {
					local11 = -1;
				}
				if (local14 == 1000) {
					local14 = -1;
				}
			} else {
				if (local11 == -1) {
					local11 = 1000;
				}
				if (local14 == -1) {
					local14 = 1000;
				}
			}
			return local11 - local14;
		} else {
			return arg1.anInt3901 - arg3.anInt3901;
		}
	}
}
