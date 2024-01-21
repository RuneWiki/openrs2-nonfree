import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
	public static int anInt775;

	@OriginalMember(owner = "client!cj", name = "p", descriptor = "I")
	public static int anInt777;

	@OriginalMember(owner = "client!cj", name = "b", descriptor = "Lclient!dj;")
	private static final Class24 aClass24_198 = Static81.method1507("flash1:");

	@OriginalMember(owner = "client!cj", name = "c", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_199 = Static81.method1507("underlay)3dat");

	@OriginalMember(owner = "client!cj", name = "e", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_200 = aClass24_198;

	@OriginalMember(owner = "client!cj", name = "f", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_201 = Static81.method1507("labels)3dat");

	@OriginalMember(owner = "client!cj", name = "n", descriptor = "Z")
	public static boolean aBoolean35 = false;

	@OriginalMember(owner = "client!cj", name = "o", descriptor = "[I")
	public static final int[] anIntArray75 = new int[25];

	@OriginalMember(owner = "client!cj", name = "r", descriptor = "Lclient!dj;")
	public static Class24 aClass24_202 = aClass24_198;

	@OriginalMember(owner = "client!cj", name = "s", descriptor = "Lclient!dj;")
	public static final Class24 aClass24_203 = Static81.method1507("; version=1; path=)4; domain=");

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!ve;Lclient!ve;)V")
	public static void method577(@OriginalArg(1) Class69 arg0, @OriginalArg(2) Class69 arg1) {
		Static186.aClass69_6 = arg0;
		Static26.aClass69_4 = arg1;
		Static57.anInt1421 = Static26.aClass69_4.method2216(3);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLclient!ve;Lclient!ve;Ljava/awt/Component;)V")
	public static void method579(@OriginalArg(1) Class69 arg0, @OriginalArg(2) Class69 arg1, @OriginalArg(3) Component arg2) {
		if (Static158.aBoolean163) {
			return;
		}
		Static90.method3486();
		@Pc(13) byte[] local13 = arg0.method2208(Static140.anInt3138, 0);
		Static185.aClass1_Sub2_Sub8_Sub3_7 = new Class1_Sub2_Sub8_Sub3(local13, arg2);
		Static57.aClass1_Sub2_Sub8_Sub3_1 = Static185.aClass1_Sub2_Sub8_Sub3_7.method2344();
		Static64.aClass1_Sub2_Sub8_Sub2_1 = Static100.method1736(Static126.anInt2768, arg1);
		Static93.aClass1_Sub2_Sub8_Sub2_2 = Static100.method1736(Static55.anInt1378, arg1);
		Static172.aClass1_Sub2_Sub8_Sub2_4 = Static100.method1736(Static114.anInt2567, arg1);
		Static65.aClass1_Sub2_Sub8_Sub2Array8 = Static2.method83(arg1, Static111.anInt2531);
		Static48.aClass1_Sub2_Sub8_Sub2Array5 = Static2.method83(arg1, Static195.anInt4329);
		Static158.anIntArray298 = new int[256];
		for (@Pc(52) int local52 = 0; local52 < 64; local52++) {
			Static158.anIntArray298[local52] = local52 * 262144;
		}
		for (@Pc(65) int local65 = 0; local65 < 64; local65++) {
			Static158.anIntArray298[local65 + 64] = local65 * 1024 + 16711680;
		}
		for (@Pc(82) int local82 = 0; local82 < 64; local82++) {
			Static158.anIntArray298[local82 + 128] = local82 * 4 + 16776960;
		}
		for (@Pc(99) int local99 = 0; local99 < 64; local99++) {
			Static158.anIntArray298[local99 + 192] = 16777215;
		}
		Static132.anIntArray241 = new int[256];
		for (@Pc(117) int local117 = 0; local117 < 64; local117++) {
			Static132.anIntArray241[local117] = local117 * 1024;
		}
		for (@Pc(130) int local130 = 0; local130 < 64; local130++) {
			Static132.anIntArray241[local130 + 64] = local130 * 4 + 65280;
		}
		for (@Pc(147) int local147 = 0; local147 < 64; local147++) {
			Static132.anIntArray241[local147 + 128] = local147 * 262144 + 65535;
		}
		for (@Pc(171) int local171 = 0; local171 < 64; local171++) {
			Static132.anIntArray241[local171 + 192] = 16777215;
		}
		Static133.anIntArray242 = new int[256];
		for (@Pc(187) int local187 = 0; local187 < 64; local187++) {
			Static133.anIntArray242[local187] = local187 * 4;
		}
		for (@Pc(200) int local200 = 0; local200 < 64; local200++) {
			Static133.anIntArray242[local200 + 64] = local200 * 262144 + 255;
		}
		for (@Pc(217) int local217 = 0; local217 < 64; local217++) {
			Static133.anIntArray242[local217 + 128] = local217 * 1024 + 16711935;
		}
		for (@Pc(236) int local236 = 0; local236 < 64; local236++) {
			Static133.anIntArray242[local236 + 192] = 16777215;
		}
		Static145.anIntArray272 = new int[32768];
		Static52.anIntArray114 = new int[256];
		Static77.anIntArray160 = new int[32768];
		Static163.method2733(null);
		Static122.aBoolean123 = false;
		Static159.aClass24_1036 = Static159.aClass24_1035;
		Static159.aClass24_1031 = Static159.aClass24_1035;
		if (Static79.anInt1892 == 0) {
			Static92.aBoolean104 = true;
		} else {
			Static92.aBoolean104 = false;
		}
		Static85.anIntArray286 = new int[32768];
		Static106.anInt2402 = 0;
		Static63.anIntArray139 = new int[32768];
		if (Static92.aBoolean104) {
			Static122.method2067();
		} else {
			Static119.method2026(Static186.aClass69_Sub1_26, Static157.anInt3468, 255);
		}
		Static151.method2594(false);
		Static158.aBoolean163 = true;
		Static13.method304();
		Static183.aClass1_Sub2_Sub8_Sub3_6 = new Class1_Sub2_Sub8_Sub3(128, 254);
		Static73.aClass1_Sub2_Sub8_Sub3_2 = new Class1_Sub2_Sub8_Sub3(128, 254);
	}

	@OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIII)Lclient!jf;")
	public static Class1_Sub11 method580(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class1_Sub11 local7 = new Class1_Sub11();
		local7.anInt2169 = arg2;
		local7.anInt2168 = arg1;
		Static115.aClass57_25.method1874(local7, (long) arg0);
		Static25.method509(arg2);
		@Pc(26) Class98 local26 = Static188.method3229(arg0);
		if (local26 != null) {
			Static199.method2199(local26);
		}
		if (Static10.aClass98_10 != null) {
			Static199.method2199(Static10.aClass98_10);
			Static10.aClass98_10 = null;
		}
		Static53.aBoolean73 = false;
		Static156.anInt3437 = 0;
		Static39.method726(Static7.anInt173, Static110.anInt2525, Static10.anInt1519, Static109.anInt2509);
		if (local26 != null) {
			Static104.method1814(local26);
		}
		Static144.method2514(arg2);
		if (Static177.anInt3924 != -1) {
			Static5.method108(Static177.anInt3924, 1);
		}
		return local7;
	}
}
