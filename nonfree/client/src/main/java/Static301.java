import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static301 {

	@OriginalMember(owner = "client!kq", name = "f", descriptor = "I")
	public static int anInt5347;

	@OriginalMember(owner = "client!kq", name = "b", descriptor = "Z")
	public static boolean aBoolean357 = false;

	@OriginalMember(owner = "client!kq", name = "d", descriptor = "[Z")
	public static final boolean[] aBooleanArray15 = new boolean[200];

	@OriginalMember(owner = "client!kq", name = "l", descriptor = "S")
	public static short aShort78 = 205;

	@OriginalMember(owner = "client!kq", name = "m", descriptor = "[I")
	public static final int[] anIntArray289 = new int[2];

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!qk;II)Ljava/lang/String;")
	public static String method4796(@OriginalArg(0) Class279 arg0, @OriginalArg(2) int arg1) {
		if (!Static76.method1833(arg0).method2318(arg1) && arg0.anObjectArray27 == null) {
			return null;
		} else if (arg0.aStringArray30 == null || arg1 >= arg0.aStringArray30.length || arg0.aStringArray30[arg1] == null || arg0.aStringArray30[arg1].trim().length() == 0) {
			return Static351.aBoolean491 ? "Hidden-" + arg1 : null;
		} else {
			return arg0.aStringArray30[arg1];
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(Lclient!qt;Lclient!ha;Lclient!da;BZLjava/lang/String;)V")
	public static void method4799(@OriginalArg(0) Class282 arg0, @OriginalArg(1) Class5 arg1, @OriginalArg(2) Class62 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) String arg4) {
		@Pc(14) boolean local14 = !Static403.aBoolean502 || Static332.method5443();
		if (!local14) {
			return;
		}
		@Pc(28) int local28;
		@Pc(37) int local37;
		if (Static403.aBoolean502 && local14) {
			@Pc(135) Class282 local135 = Static275.aClass282_8;
			@Pc(141) Class62 local141 = arg1.method7515(local135, Static118.aClass107Array1);
			local28 = local135.method7139(250, arg4, null);
			local37 = local135.method7137(250, null, arg4, local135.anInt8309);
			@Pc(162) int local162 = Static628.aClass107_6.anInt3006;
			@Pc(166) int local166 = local162 + 4;
			local28 += local166 * 2;
			local37 += local166 * 2;
			if (Static519.anInt8027 > local28) {
				local28 = Static519.anInt8027;
			}
			if (local37 < Static453.anInt4354) {
				local37 = Static453.anInt4354;
			}
			@Pc(200) int local200 = Static570.aClass83_13.method2416(Static612.anInt9912, local28) + Static49.anInt1400;
			@Pc(208) int local208 = Static575.aClass50_15.method1701(local37, Static90.anInt2181) + Static253.anInt4637;
			if (Static219.aBoolean285) {
				local200 += Static30.method1089();
				local208 += Static166.method2921();
			}
			arg1.method7525(Static47.aClass107_2, false).method8572(local200 + Static44.aClass107_1.anInt3006, Static44.aClass107_1.anInt3008 + local208, local28 - Static44.aClass107_1.anInt3006 * 2, local37 - Static44.aClass107_1.anInt3008 * 2, 1, 0, 0);
			arg1.method7525(Static44.aClass107_1, true).method8559(local200, local208);
			Static44.aClass107_1.method2763();
			arg1.method7525(Static44.aClass107_1, true).method8559(local200 + local28 - local162, local208);
			Static44.aClass107_1.method2759();
			arg1.method7525(Static44.aClass107_1, true).method8559(local28 + local200 - local162, local37 + local208 - local162);
			Static44.aClass107_1.method2763();
			arg1.method7525(Static44.aClass107_1, true).method8559(local200, local37 + local208 - local162);
			Static44.aClass107_1.method2759();
			arg1.method7525(Static628.aClass107_6, true).method8571(local200, local208 + Static44.aClass107_1.anInt3008, local162, local37 - Static44.aClass107_1.anInt3008 * 2);
			Static628.aClass107_6.method2765();
			arg1.method7525(Static628.aClass107_6, true).method8571(local200 + Static44.aClass107_1.anInt3006, local208, local28 - Static44.aClass107_1.anInt3006 * 2, local162);
			Static628.aClass107_6.method2765();
			arg1.method7525(Static628.aClass107_6, true).method8571(local200 + local28 - local162, Static44.aClass107_1.anInt3008 + local208, local162, local37 - Static44.aClass107_1.anInt3008 * 2);
			Static628.aClass107_6.method2765();
			arg1.method7525(Static628.aClass107_6, true).method8571(Static44.aClass107_1.anInt3006 + local200, -local162 + local208 + local37, local28 - Static44.aClass107_1.anInt3006 * 2, local162);
			Static628.aClass107_6.method2765();
			local141.method8375(-1, arg4, 1, null, Static326.anInt6109 | 0xFF000000, null, local208 + local166, 0, 0, local37 - local166 * 2, 0, local28 - local166 * 2, local200 - -local166, null, 1);
			Static423.method6625(local208, local37, local28, local200);
		} else {
			local28 = arg0.method7139(250, arg4, null);
			local37 = arg0.method7131(250, arg4, null) * 13;
			arg1.aa(6, 6, local28 + 8, local37 + 4 + 4, -16777216, 0);
			arg1.method7506(6, 6, local28 + 4 + 4, local37 - -4 + 4, -1, 0);
			arg2.method8375(-1, arg4, 1, null, -1, null, 10, 0, 0, local37, 0, local28, 10, null, 1);
			Static423.method6625(6, local37 + 4 + 4, local28 + 4 + 4, 6);
		}
		if (!arg3) {
			return;
		}
		try {
			if (Static219.aBoolean285) {
				Static413.method6519();
			} else {
				arg1.method7557();
			}
		} catch (@Pc(449) Exception_Sub1 local449) {
		}
	}

	@OriginalMember(owner = "client!kq", name = "a", descriptor = "(IILclient!sl;)Ljava/lang/String;")
	public static String method4801(@OriginalArg(2) Class3_Sub3 arg0) {
		try {
			@Pc(7) int local7 = arg0.method4228();
			if (local7 > 32767) {
				local7 = 32767;
			}
			@Pc(19) byte[] local19 = new byte[local7];
			arg0.anInt4736 += Static151.aClass303_1.method7628(local7, arg0.anInt4736, 0, local19, arg0.aByteArray54);
			return Static89.method2004(local19, local7, 0);
		} catch (@Pc(43) Exception local43) {
			return "Cabbage";
		}
	}
}
