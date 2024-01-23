import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static170 {

	@OriginalMember(owner = "client!me", name = "b", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray9;

	@OriginalMember(owner = "client!me", name = "c", descriptor = "I")
	public static int anInt3309;

	@OriginalMember(owner = "client!me", name = "d", descriptor = "Lclient!kk;")
	public static Class108 aClass108_4;

	@OriginalMember(owner = "client!me", name = "i", descriptor = "Lclient!jm;")
	public static Class100 aClass100_1;

	@OriginalMember(owner = "client!me", name = "g", descriptor = "Lclient!on;")
	public static Class4_Sub21 aClass4_Sub21_1 = new Class4_Sub21(0, -1);

	@OriginalMember(owner = "client!me", name = "h", descriptor = "Z")
	public static boolean aBoolean231 = false;

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(I)V")
	public static void method2710() {
		Static252.method3993();
		Static281.method4350();
		Static298.method4485();
		Static227.method3636();
		Static54.method884();
		Static179.method2822();
		Static197.method3193();
		Static242.method3782();
		Static181.method2937();
		Static268.method4237();
		Static228.method3638();
		Static205.method3294();
		Static181.method2938();
		Static55.method941();
		Static303.method4686();
		Static236.method3690();
		Static277.method4307();
		Static21.method898();
		Static239.method3725();
		if (Static298.anInt5544 != 0) {
			for (@Pc(54) int local54 = 0; local54 < Static227.aByteArrayArray35.length; local54++) {
				Static227.aByteArrayArray35[local54] = null;
			}
			Static290.anInt5426 = 0;
		}
		Static22.method301();
		Static226.method420();
		Static13.method201();
		Static224.method3592();
		Static18.aClass26_3.method511();
		if (!Static94.aBoolean138) {
			((Class24_Sub1) Static158.anInterface5_1).method460();
		}
		Static207.aClass40_13.method893();
		Static99.aClass58_46.method1349();
		Static150.aClass58_66.method1349();
		Static51.aClass58_27.method1349();
		Static258.aClass58_92.method1349();
		Static102.aClass58_47.method1349();
		Static278.aClass58_98.method1349();
		Static161.aClass58_69.method1349();
		Static7.aClass58_4.method1349();
		Static233.aClass58_71.method1349();
		Static127.aClass58_57.method1349();
		Static165.aClass58_73.method1349();
		Static25.aClass26_5.method511();
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ZLjava/lang/String;I)V")
	public static void method2712(@OriginalArg(0) boolean arg0, @OriginalArg(1) String arg1) {
		@Pc(8) short[] local8 = new short[16];
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(17) int local17 = arg0 ? 32768 : 0;
		@Pc(19) int local19 = 0;
		@Pc(27) int local27 = (arg0 ? Static313.anInt6050 : Static48.anInt912) + local17;
		for (@Pc(29) int local29 = local17; local29 < local27; local29++) {
			@Pc(40) Class4_Sub3_Sub11 local40 = Static190.method3004(local29);
			if (local40.aBoolean163 && local40.method1914().toLowerCase().indexOf(local11) != -1) {
				if (local19 >= 50) {
					Static76.anInt5738 = -1;
					Static293.aShortArray114 = null;
					return;
				}
				if (local8.length <= local19) {
					@Pc(82) short[] local82 = new short[local8.length * 2];
					for (@Pc(84) int local84 = 0; local84 < local19; local84++) {
						local82[local84] = local8[local84];
					}
					local8 = local82;
				}
				local8[local19++] = (short) local29;
			}
		}
		Static167.anInt3497 = 0;
		Static76.anInt5738 = local19;
		@Pc(118) String[] local118 = new String[Static76.anInt5738];
		Static293.aShortArray114 = local8;
		for (@Pc(122) int local122 = 0; local122 < Static76.anInt5738; local122++) {
			local118[local122] = Static190.method3004(local8[local122]).method1914();
		}
		Static44.method714(Static293.aShortArray114, local118);
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(II)I")
	public static int method2713(@OriginalArg(0) int arg0) {
		@Pc(1) int local1 = 0;
		if (arg0 < 0 || arg0 >= 65536) {
			arg0 >>>= 0x10;
			local1 += 16;
		}
		if (arg0 >= 256) {
			arg0 >>>= 0x8;
			local1 += 8;
		}
		if (arg0 >= 16) {
			arg0 >>>= 0x4;
			local1 += 4;
		}
		if (arg0 >= 4) {
			local1 += 2;
			arg0 >>>= 0x2;
		}
		if (arg0 >= 1) {
			local1++;
			arg0 >>>= 0x1;
		}
		return local1 + arg0;
	}

	@OriginalMember(owner = "client!me", name = "a", descriptor = "(ILclient!fd;)Lclient!cd;")
	public static Class27 method2714(@OriginalArg(1) Class4_Sub10 arg0) {
		@Pc(7) Class27 local7 = new Class27();
		local7.anInt540 = arg0.method4653();
		local7.aClass4_Sub3_Sub11_1 = Static190.method3004(local7.anInt540);
		return local7;
	}
}
