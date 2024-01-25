import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static442 {

	@OriginalMember(owner = "client!pq", name = "x", descriptor = "Lclient!jj;")
	public static Class6_Sub2_Sub11 aClass6_Sub2_Sub11_3;

	@OriginalMember(owner = "client!pq", name = "y", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray55;

	@OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
	public static int anInt7976;

	@OriginalMember(owner = "client!pq", name = "u", descriptor = "I")
	public static int anInt7972 = -1;

	@OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
	public static int anInt7975 = 104;

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[I[IB)V")
	public static void method6836(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		if (arg1 >= arg0) {
			return;
		}
		@Pc(15) int local15 = (arg1 + arg0) / 2;
		@Pc(17) int local17 = arg1;
		@Pc(21) int local21 = arg2[local15];
		arg2[local15] = arg2[arg0];
		arg2[arg0] = local21;
		@Pc(35) int local35 = arg3[local15];
		arg3[local15] = arg3[arg0];
		arg3[arg0] = local35;
		@Pc(54) int local54 = ~local21 == Integer.MIN_VALUE ? 0 : 1;
		for (@Pc(56) int local56 = arg1; local56 < arg0; local56++) {
			if ((local54 & local56) + local21 > arg2[local56]) {
				@Pc(71) int local71 = arg2[local56];
				arg2[local56] = arg2[local17];
				arg2[local17] = local71;
				@Pc(85) int local85 = arg3[local56];
				arg3[local56] = arg3[local17];
				arg3[local17++] = local85;
			}
		}
		arg2[arg0] = arg2[local17];
		arg2[local17] = local21;
		arg3[arg0] = arg3[local17];
		arg3[local17] = local35;
		method6836(local17 - 1, arg1, arg2, arg3);
		method6836(arg0, local17 + 1, arg2, arg3);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method6838(@OriginalArg(0) Class100 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static565.aClass100_15 = arg0;
		Static253.anInt5086 = arg1;
		Static101.aBoolean145 = Static253.anInt5086 > 1 && Static565.aClass100_15.method8825();
		Static643.anInt10682 = 9;
		Static246.anInt4917 = 0x1 << Static643.anInt10682;
		Static557.anInt9470 = Static246.anInt4917 >> 1;
		Math.sqrt((double) (Static557.anInt9470 * Static557.anInt9470 + Static557.anInt9470 * Static557.anInt9470));
		Static535.anInt9275 = 4;
		Static544.anInt9353 = arg2;
		Static608.anInt10072 = arg3;
		Static197.anInt10372 = arg4;
		Static34.aClass137_2 = Static562.method8096();
		Static80.method1403();
		Static360.aClass97ArrayArrayArray4 = new Class97[4][Static544.anInt9353][Static608.anInt10072];
		Static228.aClass199Array2 = new Class199[4];
		if (arg5) {
			Static400.anIntArrayArray31 = new int[Static544.anInt9353][Static608.anInt10072];
			Static393.aByteArrayArray114 = new byte[Static544.anInt9353][Static608.anInt10072];
			Static464.aShortArrayArray16 = new short[Static544.anInt9353][Static608.anInt10072];
			Static179.aClass97ArrayArrayArray1 = new Class97[1][Static544.anInt9353][Static608.anInt10072];
			Static510.aClass199Array3 = new Class199[1];
		} else {
			Static400.anIntArrayArray31 = null;
			Static393.aByteArrayArray114 = null;
			Static464.aShortArrayArray16 = null;
			Static179.aClass97ArrayArrayArray1 = null;
			Static510.aClass199Array3 = null;
		}
		if (arg6) {
			Static85.aLongArrayArrayArray1 = new long[4][arg2][arg3];
			Static105.aClass68Array1 = new Class68[65535];
			Static612.aBooleanArray48 = new boolean[65535];
			Static523.anInt9117 = 0;
		} else {
			Static85.aLongArrayArrayArray1 = null;
			Static105.aClass68Array1 = null;
			Static612.aBooleanArray48 = null;
			Static523.anInt9117 = 0;
		}
		Static134.method2182(false);
		Static158.aClass20_Sub2Array7 = new Class20_Sub2[2];
		Static311.aClass20_Sub2Array11 = new Class20_Sub2[2];
		Static411.aClass20_Sub2Array12 = new Class20_Sub2[2];
		Static109.aClass20_Sub2Array13 = new Class20_Sub2[10000];
		Static242.anInt4833 = 0;
		Static626.aClass20_Sub2Array14 = new Class20_Sub2[5000];
		Static189.anInt3797 = 0;
		Static61.aClass20_Sub2_Sub2Array1 = new Class20_Sub2_Sub2[5000];
		Static205.anInt4091 = 0;
		Static460.aBooleanArrayArray6 = new boolean[Static197.anInt10372 + Static197.anInt10372 + 1][Static197.anInt10372 + Static197.anInt10372 + 1];
		Static195.aBooleanArrayArray4 = new boolean[Static197.anInt10372 + Static197.anInt10372 + 2][Static197.anInt10372 + Static197.anInt10372 + 2];
		Static580.anIntArray588 = new int[Static197.anInt10372 + Static197.anInt10372 + 2];
		Static94.aClass65_1 = Static94.aClass65_2;
		if (Static101.aBoolean145) {
			Static431.aBooleanArrayArrayArray2 = new boolean[4][Static197.anInt10372 + Static197.anInt10372 + 1][Static197.anInt10372 + Static197.anInt10372 + 1];
			Static120.aBooleanArrayArrayArray1 = new boolean[4][][];
			if (Static574.aClass334Array1 != null) {
				Static621.method8660();
			}
			Static574.aClass334Array1 = new Class334[Static253.anInt5086];
			Static565.aClass100_15.method8817(Static574.aClass334Array1.length + 1);
			Static565.aClass100_15.method8805(0);
			for (@Pc(205) int local205 = 0; local205 < Static574.aClass334Array1.length; local205++) {
				Static574.aClass334Array1[local205] = new Class334(local205 + 1, Static565.aClass100_15);
				(new Thread(Static574.aClass334Array1[local205], "wr" + local205)).start();
			}
			@Pc(240) byte local240;
			if (Static253.anInt5086 == 2) {
				local240 = 4;
				Static167.anInt3476 = 2;
			} else if (Static253.anInt5086 == 3) {
				local240 = 6;
				Static167.anInt3476 = 3;
			} else {
				local240 = 8;
				Static167.anInt3476 = 4;
			}
			Static322.aClass352Array1 = new Class352[local240];
			for (@Pc(260) int local260 = 0; local260 < local240; local260++) {
				Static322.aClass352Array1[local260] = new Class352(Static239.aStringArrayArray1[Static253.anInt5086 - 2][local260]);
			}
		} else {
			Static167.anInt3476 = 1;
		}
		Static83.anIntArray115 = new int[Static167.anInt3476 - 1];
		Static332.anIntArray561 = new int[Static167.anInt3476 - 1];
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(BLjava/lang/String;Lclient!ha;IIIII)V")
	public static void method6839(@OriginalArg(1) String arg0, @OriginalArg(2) Class100 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(7) int arg5) {
		if (Static412.aClass32_12 == null || Static286.aClass32_13 == null) {
			if (Static540.aClass353_110.method8401(Static159.anInt3350) && Static540.aClass353_110.method8401(Static640.anInt10660)) {
				Static412.aClass32_12 = arg1.method8773(Static651.method2404(Static540.aClass353_110, Static159.anInt3350, 0), true);
				@Pc(28) Class98 local28 = Static651.method2404(Static540.aClass353_110, Static640.anInt10660, 0);
				Static286.aClass32_13 = arg1.method8773(local28, true);
				local28.method2399();
				Static493.aClass32_38 = arg1.method8773(local28, true);
			} else {
				arg1.aa(arg3, arg2, arg5, 20, 255 - Static228.anInt4473 << 24 | Static614.anInt10096, 1);
			}
		}
		if (Static412.aClass32_12 != null && Static286.aClass32_13 != null) {
			@Pc(76) int local76 = (arg5 - Static286.aClass32_13.method5072() * 2) / Static412.aClass32_12.method5072();
			for (@Pc(78) int local78 = 0; local78 < local76; local78++) {
				Static412.aClass32_12.method5071(arg3 + Static286.aClass32_13.method5072() + local78 * Static412.aClass32_12.method5072(), arg2);
			}
			Static286.aClass32_13.method5071(arg3, arg2);
			Static493.aClass32_38.method5071(arg5 + arg3 - Static493.aClass32_38.method5072(), arg2);
		}
		Static173.aClass50_5.method5736(-1, arg3 + 3, arg0, arg2 + 14, Static12.anInt226 | 0xFF000000);
		arg1.aa(arg3, arg2 + 20, arg5, arg4 - 20, -Static228.anInt4473 + 255 << 24 | Static614.anInt10096, 1);
	}

	@OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lclient!rg;I)Lclient!hha;")
	public static Class22_Sub1_Sub1 method6840(@OriginalArg(0) Class6_Sub40 arg0) {
		@Pc(7) Class22_Sub1 local7 = Static617.method8629(arg0);
		@Pc(23) int local23 = arg0.method8615();
		return new Class22_Sub1_Sub1(local7.aClass238_9, local7.aClass79_14, local7.anInt5439, local7.anInt5436, local7.anInt5441, local7.anInt5435, local7.anInt5432, local7.anInt5438, local7.anInt5431, local7.anInt4155, local7.anInt4150, local7.anInt4154, local7.anInt4151, local7.anInt4147, local7.anInt4145, local23);
	}
}
