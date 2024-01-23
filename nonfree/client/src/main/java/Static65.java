import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static65 {

	@OriginalMember(owner = "client!eh", name = "F", descriptor = "[[B")
	public static byte[][] aByteArrayArray4;

	@OriginalMember(owner = "client!eh", name = "N", descriptor = "Lclient!ek;")
	public static Class1_Sub2_Sub2_Sub1 aClass1_Sub2_Sub2_Sub1_2;

	@OriginalMember(owner = "client!eh", name = "Q", descriptor = "C")
	public static char aChar1;

	@OriginalMember(owner = "client!eh", name = "T", descriptor = "Lclient!gf;")
	public static Class62 aClass62_3;

	@OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
	public static int anInt1318 = 0;

	@OriginalMember(owner = "client!eh", name = "R", descriptor = "Z")
	public static boolean aBoolean104 = false;

	@OriginalMember(owner = "client!eh", name = "S", descriptor = "[J")
	public static long[] aLongArray5 = new long[100];

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)V")
	public static void method1075() {
		Static214.aClass31_34.method850();
		Static185.aClass31_27.method850();
		Static212.aClass31_38.method850();
		Static100.aClass31_16.method850();
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIII)I")
	public static int method1076(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		if (arg0 == arg1) {
			return arg0;
		} else {
			@Pc(23) int local23 = 128 - arg2;
			@Pc(41) int local41 = (arg1 >>> 7 & 0x1FE01FE) * arg2 + local23 * (arg0 >>> 7 & 0x1FE01FE) & 0xFF00FF00;
			@Pc(55) int local55 = local23 * (arg0 & 0xFF00FF) + arg2 * (arg1 & 0xFF00FF) & 0xFF00FF00;
			return local41 + (local55 >> 7);
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIIIIIIIIIIIIIIIIII)V")
	public static void method1077(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14, @OriginalArg(15) int arg15, @OriginalArg(16) int arg16, @OriginalArg(17) int arg17, @OriginalArg(18) int arg18, @OriginalArg(19) int arg19) {
		@Pc(12) Class74 local12;
		@Pc(14) int local14;
		if (arg3 == 0) {
			local12 = new Class74(arg10, arg11, arg12, arg13, -1, arg18, false);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static130.aClass1_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static130.aClass1_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub19(local14, arg1, arg2);
				}
			}
			Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass74_1 = local12;
		} else if (arg3 == 1) {
			local12 = new Class74(arg14, arg15, arg16, arg17, arg5, arg19, arg6 == arg7 && arg6 == arg8 && arg6 == arg9);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static130.aClass1_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static130.aClass1_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub19(local14, arg1, arg2);
				}
			}
			Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass74_1 = local12;
		} else {
			@Pc(134) Class59 local134 = new Class59(arg3, arg4, arg5, arg1, arg2, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14, arg15, arg16, arg17, arg18, arg19);
			for (local14 = arg0; local14 >= 0; local14--) {
				if (Static130.aClass1_Sub19ArrayArrayArray1[local14][arg1][arg2] == null) {
					Static130.aClass1_Sub19ArrayArrayArray1[local14][arg1][arg2] = new Class1_Sub19(local14, arg1, arg2);
				}
			}
			Static130.aClass1_Sub19ArrayArrayArray1[arg0][arg1][arg2].aClass59_1 = local134;
		}
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(BI)[F")
	public static float[] method1078(@OriginalArg(1) int arg0) {
		@Pc(7) float local7 = Static34.method622() + Static34.method626();
		@Pc(9) int local9 = Static34.method627();
		@Pc(16) float local16 = (float) (local9 & 0xFF) / 255.0F;
		Static270.aFloatArray31[3] = 1.0F;
		@Pc(29) float local29 = (float) (local9 >> 8 & 0xFF) / 255.0F;
		@Pc(38) float local38 = (float) (local9 >> 16 & 0xFF) / 255.0F;
		@Pc(40) float local40 = 0.58823526F;
		Static270.aFloatArray31[2] = local7 * local40 * (float) (arg0 & 0xFF) / 255.0F * local16;
		Static270.aFloatArray31[0] = local40 * (float) (arg0 >> 16 & 0xFF) / 255.0F * local38 * local7;
		Static270.aFloatArray31[1] = local7 * local29 * ((float) (arg0 >> 8 & 0xFF) / 255.0F) * local40;
		return Static270.aFloatArray31;
	}

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "(B)Lclient!jj;")
	public static Class1_Sub18 method1079() {
		@Pc(4) Class1_Sub18 local4 = new Class1_Sub18(34);
		local4.method3093(11);
		local4.method3093(Static176.anInt3254);
		local4.method3093(Static13.aBoolean247 ? 1 : 0);
		local4.method3093(Static16.aBoolean33 ? 1 : 0);
		local4.method3093(Static287.aBoolean429 ? 1 : 0);
		local4.method3093(Static160.aBoolean222 ? 1 : 0);
		local4.method3093(Static294.aBoolean443 ? 1 : 0);
		local4.method3093(Static51.aBoolean91 ? 1 : 0);
		local4.method3093(Static282.aBoolean446 ? 1 : 0);
		local4.method3093(Static97.aBoolean136 ? 1 : 0);
		local4.method3093(Static235.anInt4896);
		local4.method3093(Static294.aBoolean445 ? 1 : 0);
		local4.method3093(Static160.aBoolean223 ? 1 : 0);
		local4.method3093(Static57.aBoolean97 ? 1 : 0);
		local4.method3093(Static286.anInt5079);
		local4.method3093(Static99.aBoolean138 ? 1 : 0);
		local4.method3093(Static73.anInt1433);
		local4.method3093(Static259.anInt5233);
		local4.method3093(Static267.anInt5346);
		local4.method3123(Static224.anInt4699);
		local4.method3123(Static44.anInt997);
		local4.method3093(Static200.method3050());
		local4.method3119(Static152.anInt2837);
		local4.method3093(Static8.anInt239);
		local4.method3093(Static203.aBoolean299 ? 1 : 0);
		local4.method3093(Static290.aBoolean436 ? 1 : 0);
		local4.method3093(Static207.anInt4118);
		local4.method3093(Static41.aBoolean82 ? 1 : 0);
		local4.method3093(Static273.aBoolean417 ? 1 : 0);
		return local4;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(II)V")
	public static void method1081() {
		Static257.aClass31_39.method856(5);
		Static18.aClass31_4.method856(5);
	}
}
