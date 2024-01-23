import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static244 {

	@OriginalMember(owner = "client!rg", name = "z", descriptor = "I")
	public static int anInt4426;

	@OriginalMember(owner = "client!rg", name = "L", descriptor = "[I")
	public static int[] anIntArray389;

	@OriginalMember(owner = "client!rg", name = "M", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray18;

	@OriginalMember(owner = "client!rg", name = "C", descriptor = "[I")
	public static int[] anIntArray388 = new int[5];

	@OriginalMember(owner = "client!rg", name = "F", descriptor = "Ljava/lang/String;")
	public static String aString255 = "Choose Option";

	@OriginalMember(owner = "client!rg", name = "J", descriptor = "Lclient!vh;")
	public static Class187 aClass187_124 = new Class187(4);

	@OriginalMember(owner = "client!rg", name = "K", descriptor = "I")
	public static int anInt4432 = 0;

	@OriginalMember(owner = "client!rg", name = "N", descriptor = "[[I")
	public static int[][] anIntArrayArray36 = new int[][] { new int[0], { 128, 0, 128, 128, 0, 128 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 64, 0, 128, 0, 128, 128, 64, 128 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 128, 0, 0, 32, 32, 96, 32, 128, 0, 128, 128 } };

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIZLclient!ua;Lclient!sj;ILclient!ng;I)V")
	public static void method3819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) Class175 arg3, @OriginalArg(4) Class1_Sub27 arg4, @OriginalArg(6) Class1_Sub2_Sub12 arg5, @OriginalArg(7) int arg6) {
		@Pc(3) Class90 local3 = null;
		if (arg3.anInt5020 == 0) {
			if ((double) Static109.aFloat132 == 3.0D) {
				local3 = Static51.aClass90_1;
			}
			if ((double) Static109.aFloat132 == 4.0D) {
				local3 = Static186.aClass90_6;
			}
			if ((double) Static109.aFloat132 == 6.0D) {
				local3 = Static172.aClass90_5;
			}
			if ((double) Static109.aFloat132 >= 8.0D) {
				local3 = Static189.aClass90_7;
			}
		} else if (arg3.anInt5020 == 1) {
			if ((double) Static109.aFloat132 == 3.0D) {
				local3 = Static172.aClass90_5;
			}
			if ((double) Static109.aFloat132 == 4.0D) {
				local3 = Static189.aClass90_7;
			}
			if ((double) Static109.aFloat132 == 6.0D) {
				local3 = Static285.aClass90_8;
			}
			if ((double) Static109.aFloat132 >= 8.0D) {
				local3 = Static159.aClass90_4;
			}
		} else if (arg3.anInt5020 == 2) {
			if ((double) Static109.aFloat132 == 3.0D) {
				local3 = Static285.aClass90_8;
			}
			if ((double) Static109.aFloat132 == 4.0D) {
				local3 = Static159.aClass90_4;
			}
			if ((double) Static109.aFloat132 == 6.0D) {
				local3 = Static103.aClass90_3;
			}
			if ((double) Static109.aFloat132 >= 8.0D) {
				local3 = Static84.aClass90_2;
			}
		}
		if (local3 == null) {
			return;
		}
		@Pc(129) int local129 = arg3.anInt5009;
		if (arg5.aBoolean245 && arg3.anInt5028 != -1) {
			local129 = arg3.anInt5028;
		}
		@Pc(148) int local148 = Static11.aClass1_Sub2_Sub6_1.method4012(arg3.aString291, null, Static280.aStringArray38);
		@Pc(151) int local151 = arg5.anInt3600;
		if (arg2) {
			local151 -= local148 * local3.method2476() / 2;
		} else {
			local151 -= arg1 + (local148 - 1) * local3.method2474() + local3.method2476() / 2;
		}
		@Pc(186) int local186 = local151 - local3.method2476();
		local151 += local3.method2476() / 2;
		@Pc(195) int local195 = 0;
		@Pc(197) int local197;
		@Pc(226) int local226;
		for (local197 = 0; local197 < local148; local197++) {
			@Pc(204) String local204 = Static280.aStringArray38[local197];
			if (local197 < local148 - 1) {
				local204 = local204.substring(0, local204.length() - 4);
			}
			local226 = local3.method2479(local204);
			if (local195 < local226) {
				local195 = local226;
			}
		}
		arg4.anInt4708 = arg6 + arg5.anInt3599 - local195 / 2;
		arg4.anInt4705 = arg6 + local195 / 2 + arg5.anInt3599;
		arg4.anInt4713 = arg0 + local186;
		arg4.anInt4711 = arg0 + local186 + local148 * local3.method2474();
		@Pc(279) int local279 = local186 + 2;
		local197 = arg5.anInt3599 - local195 / 2 - 5;
		if (arg3.anInt5004 != 0) {
			Static25.method397(local197, local279, local195 + 10, -local279 + local3.method2474() * local148 + local186 + 1, arg3.anInt5004, arg3.anInt5004 >>> 24);
		}
		if (arg3.anInt5021 != 0) {
			Static25.method394(local197, local279, local195 + 10, -local279 + 1 + local186 + local148 * local3.method2474(), arg3.anInt5021, arg3.anInt5021 >>> 24);
		}
		for (local226 = 0; local226 < local148; local226++) {
			@Pc(358) String local358 = Static280.aStringArray38[local226];
			if (local148 - 1 > local226) {
				local358 = local358.substring(0, local358.length() - 4);
			}
			@Pc(376) int local376 = local3.method2479(local358);
			if (local195 < local376) {
				local195 = local376;
			}
			local3.method2477(local358, arg5.anInt3599, local151, local129);
			local151 += local3.method2474();
		}
	}

	@OriginalMember(owner = "client!rg", name = "c", descriptor = "(II)I")
	public static int method3820(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		arg1 = arg1 * (arg0 & 0x7F) >> 7;
		if (arg1 < 2) {
			arg1 = 2;
		} else if (arg1 > 126) {
			arg1 = 126;
		}
		return (arg0 & 0xFF80) + arg1;
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(IZ)V")
	public static void method3822(@OriginalArg(0) int arg0) {
		if (arg0 == -1 || !Static85.method1597(arg0)) {
			return;
		}
		@Pc(20) Class66[] local20 = Static274.aClass66ArrayArray1[arg0];
		for (@Pc(22) int local22 = 0; local22 < local20.length; local22++) {
			@Pc(38) Class66 local38 = local20[local22];
			if (local38.anObjectArray22 != null) {
				@Pc(46) Class1_Sub10 local46 = new Class1_Sub10();
				local46.aClass66_10 = local38;
				local46.anObjectArray1 = local38.anObjectArray22;
				Static173.method2912(local46, 2000000);
			}
		}
	}

	@OriginalMember(owner = "client!rg", name = "d", descriptor = "(II)V")
	public static void method3823(@OriginalArg(0) int arg0) {
		@Pc(15) Class1_Sub2_Sub11 local15 = Static5.method35(arg0, 12);
		local15.method2873();
	}

	@OriginalMember(owner = "client!rg", name = "a", descriptor = "(Lclient!o;III)V")
	public static void method3824(@OriginalArg(0) Class15_Sub5_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		if (arg1 == arg0.anInt5594 && arg1 != -1) {
			@Pc(81) Class157 local81 = Static80.method1561(arg1);
			@Pc(84) int local84 = local81.anInt4524;
			if (local84 == 1) {
				arg0.anInt5585 = arg2;
				arg0.anInt5522 = 1;
				arg0.anInt5537 = 0;
				arg0.anInt5538 = 0;
				arg0.anInt5539 = 0;
				Static31.method503(local81, arg0.anInt5537, arg0.anInt5557, false, arg0.anInt5559);
			}
			if (local84 == 2) {
				arg0.anInt5538 = 0;
			}
		} else if (arg1 == -1 || arg0.anInt5594 == -1 || Static80.method1561(arg1).anInt4512 >= Static80.method1561(arg0.anInt5594).anInt4512) {
			arg0.anInt5538 = 0;
			arg0.anInt5537 = 0;
			arg0.anInt5522 = 1;
			arg0.anInt5594 = arg1;
			arg0.anInt5589 = arg0.anInt5578;
			arg0.anInt5585 = arg2;
			arg0.anInt5539 = 0;
			if (arg0.anInt5594 != -1) {
				Static31.method503(Static80.method1561(arg0.anInt5594), arg0.anInt5537, arg0.anInt5557, false, arg0.anInt5559);
			}
		}
	}
}
