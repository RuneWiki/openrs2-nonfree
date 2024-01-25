import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static446 {

	@OriginalMember(owner = "client!rca", name = "j", descriptor = "I")
	public static int anInt7363;

	@OriginalMember(owner = "client!rca", name = "d", descriptor = "I")
	public static int anInt7361 = 0;

	@OriginalMember(owner = "client!rca", name = "h", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_227 = new Class272(46, 0);

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(B)V")
	public static void method6255() {
		Static294.method4659();
		Static187.aClass3_Sub11_Sub1_1.anInt3520 = 0;
		Static428.aClass272_46 = null;
		Static230.aClass272_135 = null;
		Static210.aClass272_125 = null;
		Static20.anInt529 = 0;
		Static196.aClass272_118 = null;
		Static208.anInt4195 = 0;
		Static178.anInt8249 = 0;
		Static91.method2047();
		Static489.method6650();
		for (@Pc(32) int local32 = 0; local32 < 2048; local32++) {
			Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local32] = null;
		}
		Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 = null;
		for (@Pc(53) int local53 = 0; local53 < Static568.anInt9131; local53++) {
			@Pc(60) Class9_Sub1_Sub1_Sub2_Sub1 local60 = Static341.aClass3_Sub39Array1[local53].aClass9_Sub1_Sub1_Sub2_Sub1_2;
			if (local60 != null) {
				local60.anInt6463 = -1;
			}
		}
		Static133.method2591();
		anInt7363 = 1;
		Static205.anInt4130 = -1;
		Static471.anInt7695 = -1;
		Static113.method2374(10);
		for (@Pc(88) int local88 = 0; local88 < 100; local88++) {
			Static253.aBooleanArray17[local88] = true;
		}
		Static209.method6886();
		Static549.aClass3_Sub5_2 = null;
		Static73.aLong48 = 0L;
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(III)Lclient!ps;")
	public static Class9_Sub1_Sub5 method6256(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class63 local7 = Static554.aClass63ArrayArrayArray4[arg0][arg1][arg2];
		if (local7 == null) {
			return null;
		} else {
			@Pc(14) Class9_Sub1_Sub5 local14 = local7.aClass9_Sub1_Sub5_1;
			local7.aClass9_Sub1_Sub5_1 = null;
			Static251.method4061(local14);
			return local14;
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "(Z[[BLclient!dw;)V")
	public static void method6257(@OriginalArg(1) byte[][] arg0, @OriginalArg(2) Class70_Sub1 arg1) {
		@Pc(12) int[] local12 = new int[] { -1, 0, 0, 0, 0 };
		@Pc(15) int local15 = arg0.length;
		@Pc(41) int local41;
		for (@Pc(22) int local22 = 0; local22 < local15; local22++) {
			@Pc(28) byte[] local28 = arg0[local22];
			if (local28 != null) {
				@Pc(35) Class3_Sub11 local35 = new Class3_Sub11(local28);
				local41 = Static548.anIntArray650[local22] >> 8;
				@Pc(47) int local47 = Static548.anIntArray650[local22] & 0xFF;
				@Pc(54) int local54 = local41 * 64 - Static529.anInt8344;
				@Pc(61) int local61 = local47 * 64 - Static463.anInt7588;
				Static66.method1526();
				arg1.method2203(local35, local54, Static529.anInt8344, Static221.aClass95Array2, Static463.anInt7588, local61);
				arg1.method2212(local35, local61, local54, Static4.aClass43_1, local12);
				if (!arg1.aBoolean202 && local41 == Static16.anInt248 / 8 && Static596.anInt9431 / 8 == local47 && local12[0] != -1) {
					Static461.aClass242_1 = Static257.aClass182_1.method4391(local12[3], local12[2], local12[1], local12[0], Static125.aClass349_1);
					Static150.anInt3121 = local12[4];
				}
			}
		}
		for (@Pc(130) int local130 = 0; local130 < local15; local130++) {
			@Pc(143) int local143 = (Static548.anIntArray650[local130] >> 8) * 64 - Static529.anInt8344;
			local41 = (Static548.anIntArray650[local130] & 0xFF) * 64 - Static463.anInt7588;
			@Pc(157) byte[] local157 = arg0[local130];
			if (local157 == null && Static596.anInt9431 < 800) {
				Static66.method1526();
				arg1.method2205(local143, local41);
			}
		}
	}

	@OriginalMember(owner = "client!rca", name = "a", descriptor = "([[[BIIIIIIIIILclient!r;II)V")
	public static void method6258(@OriginalArg(0) byte[][][] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) Class43 arg10, @OriginalArg(12) int arg11) {
		if (arg8 == 0 || arg11 == 0) {
			return;
		}
		if (arg8 == 9) {
			arg5 = arg5 + 1 & 0x3;
			arg8 = 1;
		}
		if (arg8 == 10) {
			arg8 = 1;
			arg5 = arg5 + 3 & 0x3;
		}
		if (arg8 == 11) {
			arg8 = 8;
			arg5 = arg5 + 3 & 0x3;
		}
		arg10.IA(arg2, arg1, arg4, arg3, arg6, arg7, arg0[arg8 - 1][arg5], arg11, arg9);
	}
}
