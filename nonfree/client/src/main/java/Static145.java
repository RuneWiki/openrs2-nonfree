import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static145 {

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "I")
	public static int anInt2832;

	@OriginalMember(owner = "client!kf", name = "t", descriptor = "I")
	public static int anInt2842;

	@OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
	public static int anInt2853;

	@OriginalMember(owner = "client!kf", name = "u", descriptor = "Lclient!dj;")
	public static Class40 aClass40_12 = new Class40(64);

	@OriginalMember(owner = "client!kf", name = "K", descriptor = "Ljava/lang/String;")
	public static String aString170 = "shake:";

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ZIZ[[F[[FLclient!ih;B[[IIIBIZI[[FII[Z[[II[IZ)V")
	public static void method2290(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) float[][] arg3, @OriginalArg(4) float[][] arg4, @OriginalArg(5) Class4_Sub12 arg5, @OriginalArg(7) int[][] arg6, @OriginalArg(8) int arg7, @OriginalArg(9) int arg8, @OriginalArg(10) byte arg9, @OriginalArg(11) int arg10, @OriginalArg(12) boolean arg11, @OriginalArg(13) int arg12, @OriginalArg(14) float[][] arg13, @OriginalArg(15) int arg14, @OriginalArg(16) int arg15, @OriginalArg(17) boolean[] arg16, @OriginalArg(18) int[][] arg17, @OriginalArg(19) int arg18, @OriginalArg(20) int[] arg19, @OriginalArg(21) boolean arg20) {
		@Pc(12) int local12 = (arg18 << 8) + (arg20 ? 255 : 0);
		@Pc(22) int local22 = (arg14 << 8) + (arg2 ? 255 : 0);
		@Pc(32) int local32 = (arg11 ? 255 : 0) + (arg8 << 8);
		@Pc(46) int local46 = (arg7 << 8) + (arg0 ? 255 : 0);
		@Pc(52) int[] local52 = new int[arg19.length / 2];
		for (@Pc(58) int local58 = 0; local58 < local52.length; local58++) {
			@Pc(72) int local72 = arg19[local58 + local58];
			@Pc(80) int local80 = arg19[local58 + local58 + 1];
			@Pc(92) int[][] local92 = arg17 == null || arg16 == null || !arg16[local58] ? arg6 : arg17;
			local52[local58] = Static309.method4794(arg13, local80, arg1, local92, arg3, arg17, arg5, local22, arg15, false, (float) arg12, arg4, arg9, local72, local46, local32, local12);
		}
		arg5.method1871(arg10, arg15, arg1, local52, null, false);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!fe;)V")
	public static void method2291(@OriginalArg(1) Class56_Sub1 arg0) {
		@Pc(7) int local7;
		for (local7 = 0; local7 < Static86.anIntArray159.length; local7++) {
			Static86.anIntArray159[local7] = 0;
		}
		@Pc(41) int local41;
		for (local7 = 0; local7 < 5000; local7++) {
			local41 = (int) (Math.random() * 128.0D * (double) 256);
			Static86.anIntArray159[local41] = (int) (Math.random() * 284.0D);
		}
		@Pc(58) int local58;
		@Pc(78) int local78;
		for (local7 = 0; local7 < 20; local7++) {
			for (local58 = 1; local58 < 255; local58++) {
				for (local41 = 1; local41 < 127; local41++) {
					local78 = (local58 << 7) + local41;
					Static263.anIntArray544[local78] = (Static86.anIntArray159[local78 + 128] + Static86.anIntArray159[local78 + 1] + Static86.anIntArray159[local78 + -1] + Static86.anIntArray159[local78 - 128]) / 4;
				}
			}
			@Pc(115) int[] local115 = Static86.anIntArray159;
			Static86.anIntArray159 = Static263.anIntArray544;
			Static263.anIntArray544 = local115;
		}
		if (arg0 == null) {
			return;
		}
		local7 = 0;
		for (local58 = 0; local58 < arg0.anInt3413; local58++) {
			for (local41 = 0; local41 < arg0.anInt3408; local41++) {
				if (arg0.aByteArray15[local7++] != 0) {
					local78 = local41 + arg0.anInt3404 + 16;
					@Pc(168) int local168 = local58 + arg0.anInt3405 + 16;
					@Pc(174) int local174 = (local168 << 7) + local78;
					Static86.anIntArray159[local174] = 0;
				}
			}
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(I)I")
	public static int method2292() {
		try {
			if (Static279.anInt5320 == 0) {
				if (Static101.method1677() - 5000L < Static256.aLong174) {
					return 0;
				}
				Static304.aClass185_8 = Static276.aClass139_4.method3505(Static251.aString298, Static177.anInt3358);
				Static280.aLong35 = Static101.method1677();
				Static279.anInt5320 = 1;
			}
			if (Static101.method1677() > Static280.aLong35 + 30000L) {
				return Static202.method3248(1000);
			}
			@Pc(117) int local117;
			if (Static279.anInt5320 == 1) {
				if (Static304.aClass185_8.anInt5623 == 2) {
					return Static202.method3248(1001);
				}
				if (Static304.aClass185_8.anInt5623 != 1) {
					return -1;
				}
				Static134.aClass52_7 = new Class52((Socket) Static304.aClass185_8.anObject7, Static276.aClass139_4);
				Static304.aClass185_8 = null;
				@Pc(79) int local79 = 0;
				if (Static258.aBoolean339) {
					local79 = anInt2842;
				}
				Static110.aClass4_Sub10_Sub1_1.anInt5713 = 0;
				Static110.aClass4_Sub10_Sub1_1.method4618(23);
				Static110.aClass4_Sub10_Sub1_1.method4654(local79);
				Static134.aClass52_7.method1107(Static110.aClass4_Sub10_Sub1_1.aByteArray71, Static110.aClass4_Sub10_Sub1_1.anInt5713);
				if (Static30.aClass103_1 != null) {
					Static30.aClass103_1.method3009();
				}
				if (Static249.aClass103_2 != null) {
					Static249.aClass103_2.method3009();
				}
				local117 = Static134.aClass52_7.method1105();
				if (Static30.aClass103_1 != null) {
					Static30.aClass103_1.method3009();
				}
				if (Static249.aClass103_2 != null) {
					Static249.aClass103_2.method3009();
				}
				if (local117 != 0) {
					return Static202.method3248(local117);
				}
				Static279.anInt5320 = 2;
			}
			if (Static279.anInt5320 == 2) {
				if (Static134.aClass52_7.method1101() < 2) {
					return -1;
				}
				Static243.anInt4618 = Static134.aClass52_7.method1105();
				Static243.anInt4618 <<= 0x8;
				Static243.anInt4618 += Static134.aClass52_7.method1105();
				Static62.aByteArray10 = new byte[Static243.anInt4618];
				Static58.anInt1123 = 0;
				Static279.anInt5320 = 3;
			}
			if (Static279.anInt5320 != 3) {
				return -1;
			}
			local117 = Static134.aClass52_7.method1101();
			if (local117 < 1) {
				return -1;
			}
			if (local117 > Static243.anInt4618 - Static58.anInt1123) {
				local117 = Static243.anInt4618 - Static58.anInt1123;
			}
			Static134.aClass52_7.method1099(Static58.anInt1123, Static62.aByteArray10, local117);
			Static58.anInt1123 += local117;
			if (Static58.anInt1123 < Static243.anInt4618) {
				return -1;
			} else if (Static89.method1554(Static62.aByteArray10)) {
				@Pc(233) int local233 = 0;
				Static133.aClass63_Sub1Array2 = new Class63_Sub1[Static93.anInt2580];
				for (@Pc(238) int local238 = Static243.anInt4616; local238 <= Static39.anInt645; local238++) {
					@Pc(249) Class63_Sub1 local249 = Static125.method1928(local238);
					if (local249 != null) {
						Static133.aClass63_Sub1Array2[local233++] = local249;
					}
				}
				Static134.aClass52_7.method1103();
				Static62.aByteArray10 = null;
				Static279.anInt5320 = 0;
				Static243.anInt4619 = 0;
				Static134.aClass52_7 = null;
				Static256.aLong174 = Static101.method1677();
				return 0;
			} else {
				return Static202.method3248(1002);
			}
		} catch (@Pc(278) IOException local278) {
			return Static202.method3248(1003);
		}
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BII)I")
	public static int method2293(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		if (arg0 == -2) {
			return 12345678;
		} else if (arg0 == -1) {
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return arg1;
		} else {
			arg1 = arg1 * (arg0 & 0x7F) >> 7;
			if (arg1 < 2) {
				arg1 = 2;
			} else if (arg1 > 126) {
				arg1 = 126;
			}
			return (arg0 & 0xFF80) + arg1;
		}
	}
}
