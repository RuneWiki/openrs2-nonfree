import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static245 {

	@OriginalMember(owner = "client!rm", name = "v", descriptor = "Lclient!of;")
	public static Class1_Sub1_Sub16 aClass1_Sub1_Sub16_3;

	@OriginalMember(owner = "client!rm", name = "w", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray11;

	@OriginalMember(owner = "client!rm", name = "z", descriptor = "I")
	public static int anInt2367;

	@OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
	public static int anInt2378;

	@OriginalMember(owner = "client!rm", name = "R", descriptor = "Lclient!kc;")
	public static Class1_Sub1_Sub12 aClass1_Sub1_Sub12_2;

	@OriginalMember(owner = "client!rm", name = "D", descriptor = "Lclient!th;")
	public static Class169 aClass169_67 = new Class169(64);

	@OriginalMember(owner = "client!rm", name = "E", descriptor = "Z")
	public static boolean aBoolean177 = false;

	@OriginalMember(owner = "client!rm", name = "O", descriptor = "[I")
	public static int[] anIntArray195 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIILclient!h;Lclient!h;IIJ)V")
	public static void method1895(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class22 arg4, @OriginalArg(5) Class22 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) long arg8) {
		if (arg4 == null && arg5 == null) {
			return;
		}
		@Pc(8) Class61 local8 = new Class61();
		local8.aLong65 = arg8;
		local8.anInt1545 = arg1 * 128 + 64;
		local8.anInt1539 = arg2 * 128 + 64;
		local8.anInt1544 = arg3;
		local8.aClass22_2 = arg4;
		local8.aClass22_3 = arg5;
		local8.anInt1541 = arg6;
		local8.anInt1538 = arg7;
		for (@Pc(42) int local42 = arg0; local42 >= 0; local42--) {
			if (Static122.aClass1_Sub17ArrayArrayArray3[local42][arg1][arg2] == null) {
				Static122.aClass1_Sub17ArrayArrayArray3[local42][arg1][arg2] = new Class1_Sub17(local42, arg1, arg2);
			}
		}
		Static122.aClass1_Sub17ArrayArrayArray3[arg0][arg1][arg2].aClass61_1 = local8;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!ph;ILclient!ph;)V")
	public static void method1896(@OriginalArg(0) Class138 arg0, @OriginalArg(2) Class138 arg1) {
		Static290.aClass138_80 = arg1;
		Static195.aClass138_52 = arg0;
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BIIIII)V")
	public static void method1899(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4) {
		if (arg1 == arg0) {
			Static140.method2231(arg4, arg2, arg0, arg3);
		} else if (arg2 - arg0 >= Static312.anInt5850 && Static214.anInt4216 >= arg0 + arg2 && Static240.anInt1319 <= arg4 - arg1 && arg1 + arg4 <= Static59.anInt1155) {
			Static73.method1181(arg3, arg0, arg2, arg1, arg4);
		} else {
			Static273.method4045(arg4, arg3, arg2, arg0, arg1);
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
	public static void method1900(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte[][][] arg5, @OriginalArg(6) int[] arg6, @OriginalArg(7) int[] arg7, @OriginalArg(8) int[] arg8, @OriginalArg(9) int[] arg9, @OriginalArg(10) int[] arg10, @OriginalArg(11) int arg11, @OriginalArg(12) byte arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		if (arg0 < 0) {
			arg0 = 0;
		} else if (arg0 >= Static6.anInt118 * 128) {
			arg0 = Static6.anInt118 * 128 - 1;
		}
		if (arg2 < 0) {
			arg2 = 0;
		} else if (arg2 >= Static178.anInt3591 * 128) {
			arg2 = Static178.anInt3591 * 128 - 1;
		}
		Static138.anInt2726 = Class17.anIntArray22[arg3];
		Static91.anInt1749 = Class17.anIntArray24[arg3];
		Static257.anInt5010 = Class17.anIntArray22[arg4];
		Static172.anInt155 = Class17.anIntArray24[arg4];
		Static16.anInt247 = arg0;
		Static273.anInt5205 = arg1;
		anInt2378 = arg2;
		Static257.anInt5014 = arg0 / 128;
		Static198.anInt3993 = arg2 / 128;
		Static233.anInt4690 = Static257.anInt5014 - Static59.anInt1196;
		if (Static233.anInt4690 < 0) {
			Static233.anInt4690 = 0;
		}
		Static137.anInt2713 = Static198.anInt3993 - Static59.anInt1196;
		if (Static137.anInt2713 < 0) {
			Static137.anInt2713 = 0;
		}
		Static10.anInt187 = Static257.anInt5014 + Static59.anInt1196;
		if (Static10.anInt187 > Static6.anInt118) {
			Static10.anInt187 = Static6.anInt118;
		}
		Static315.anInt5923 = Static198.anInt3993 + Static59.anInt1196;
		if (Static315.anInt5923 > Static178.anInt3591) {
			Static315.anInt5923 = Static178.anInt3591;
		}
		@Pc(99) short local99;
		if (Static291.aBoolean404) {
			local99 = 3584;
		} else {
			local99 = 3500;
		}
		@Pc(104) int local104;
		@Pc(113) int local113;
		for (local104 = 0; local104 < Static59.anInt1196 + Static59.anInt1196 + 2; local104++) {
			for (local113 = 0; local113 < Static59.anInt1196 + Static59.anInt1196 + 2; local113++) {
				@Pc(130) int local130 = (local104 - Static59.anInt1196 << 7) - (Static16.anInt247 & 0x7F);
				@Pc(140) int local140 = (local113 - Static59.anInt1196 << 7) - (anInt2378 & 0x7F);
				@Pc(146) int local146 = Static257.anInt5014 + local104 - Static59.anInt1196;
				@Pc(152) int local152 = Static198.anInt3993 + local113 - Static59.anInt1196;
				if (local146 >= 0 && local152 >= 0 && local146 < Static6.anInt118 && local152 < Static178.anInt3591) {
					@Pc(176) int local176;
					if (Static61.anIntArrayArrayArray5 == null) {
						local176 = Static89.anIntArrayArrayArray6[0][local146][local152] + 128 - Static273.anInt5205;
					} else {
						local176 = Static61.anIntArrayArrayArray5[0][local146][local152] + 128 - Static273.anInt5205;
					}
					@Pc(201) int local201 = Static89.anIntArrayArrayArray6[3][local146][local152] - Static273.anInt5205 - 1000;
					Static171.aBooleanArrayArray3[local104][local113] = Static121.method1948(local130, local201, local176, local140, local99);
				} else {
					Static171.aBooleanArrayArray3[local104][local113] = false;
				}
			}
		}
		for (local104 = 0; local104 < Static59.anInt1196 + Static59.anInt1196 + 1; local104++) {
			for (local113 = 0; local113 < Static59.anInt1196 + Static59.anInt1196 + 1; local113++) {
				Static48.aBooleanArrayArray1[local104][local113] = Static171.aBooleanArrayArray3[local104][local113] || Static171.aBooleanArrayArray3[local104 + 1][local113] || Static171.aBooleanArrayArray3[local104][local113 + 1] || Static171.aBooleanArrayArray3[local104 + 1][local113 + 1];
			}
		}
		Static66.anIntArray104 = arg6;
		Static261.anIntArray454 = arg7;
		Static286.anIntArray497 = arg8;
		Static309.anIntArray528 = arg9;
		Static141.anIntArray225 = arg10;
		Static130.method2052();
		if (Static141.aClass1_Sub17ArrayArrayArray4 != null) {
			Static313.method4647(true);
			Static142.method2264(arg0, arg1, arg2, null, 0, (byte) 0, arg13, arg14);
			if (Static291.aBoolean404) {
				Static12.aBoolean10 = false;
				Static207.method3280(0, 0);
				Static96.method1395(null);
				Static294.method4365();
			}
			Static313.method4647(false);
		}
		Static142.method2264(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
	}
}
