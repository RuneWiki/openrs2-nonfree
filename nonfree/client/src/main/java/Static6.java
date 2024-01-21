import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static6 {

	@OriginalMember(owner = "client!ae", name = "f", descriptor = "[I")
	public static int[] anIntArray42;

	@OriginalMember(owner = "client!ae", name = "p", descriptor = "I")
	public static int anInt412;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "Z")
	public static boolean aBoolean11 = false;

	@OriginalMember(owner = "client!ae", name = "b", descriptor = "J")
	public static volatile long aLong9 = 0L;

	@OriginalMember(owner = "client!ae", name = "c", descriptor = "I")
	public static int anInt406 = 0;

	@OriginalMember(owner = "client!ae", name = "d", descriptor = "Lclient!a;")
	private static Class1 aClass1_290 = Static94.method1596("wishes to trade with you)3");

	@OriginalMember(owner = "client!ae", name = "e", descriptor = "Lclient!a;")
	public static Class1 aClass1_291 = Static94.method1596("::hiddenbuttontest");

	@OriginalMember(owner = "client!ae", name = "g", descriptor = "Lclient!kd;")
	public static Applet_Sub1 anApplet_Sub1_1 = null;

	@OriginalMember(owner = "client!ae", name = "h", descriptor = "Lclient!a;")
	public static Class1 aClass1_292 = aClass1_290;

	@OriginalMember(owner = "client!ae", name = "i", descriptor = "Lclient!a;")
	public static Class1 aClass1_293 = Static94.method1596("Einloggen");

	@OriginalMember(owner = "client!ae", name = "j", descriptor = "I")
	public static int anInt407 = 0;

	@OriginalMember(owner = "client!ae", name = "k", descriptor = "Lclient!a;")
	public static Class1 aClass1_294 = Static94.method1596("mapdots");

	@OriginalMember(owner = "client!ae", name = "m", descriptor = "I")
	public static int anInt409 = 0;

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(B)V")
	public static void method211() {
		aClass1_291 = null;
		aClass1_292 = null;
		aClass1_294 = null;
		anIntArray42 = null;
		aClass1_290 = null;
		aClass1_293 = null;
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(IIII)I")
	public static int method212(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(9) int local9 = arg0 & arg1 - 1;
		@Pc(13) int local13 = arg2 / arg1;
		@Pc(19) int local19 = arg1 - 1 & arg2;
		@Pc(23) int local23 = arg0 / arg1;
		@Pc(30) int local30 = Static5.method209(local23, local13);
		@Pc(39) int local39 = Static5.method209(local23 + 1, local13);
		@Pc(46) int local46 = Static5.method209(local23, local13 + 1);
		@Pc(55) int local55 = Static5.method209(local23 + 1, local13 + 1);
		@Pc(62) int local62 = Static55.method492(local30, arg1, local39, local9);
		@Pc(69) int local69 = Static55.method492(local46, arg1, local55, local9);
		return Static55.method492(local62, arg1, local69, local19);
	}

	@OriginalMember(owner = "client!ae", name = "a", descriptor = "(I)V")
	public static void method213() {
		for (@Pc(12) int local12 = 0; local12 < Static31.anInt1216; local12++) {
			@Pc(18) int local18 = Static20.anIntArray90[local12]--;
			if (Static20.anIntArray90[local12] >= -10) {
				@Pc(89) Class39 local89 = Static31.aClass39Array1[local12];
				if (local89 == null) {
					local89 = Static121.method1337(Static67.aClass8_Sub1_24, Static79.anIntArray271[local12]);
					if (local89 == null) {
						continue;
					}
					Static20.anIntArray90[local12] += local89.method1335();
					Static31.aClass39Array1[local12] = local89;
				}
				if (Static20.anIntArray90[local12] < 0) {
					@Pc(212) int local212;
					if (Static52.anIntArray179[local12] == 0) {
						local212 = Static8.anInt510;
					} else {
						@Pc(136) int local136 = (Static52.anIntArray179[local12] & 0xFF) * 128;
						@Pc(144) int local144 = Static52.anIntArray179[local12] >> 16 & 0xFF;
						@Pc(152) int local152 = Static52.anIntArray179[local12] >> 8 & 0xFF;
						@Pc(162) int local162 = local152 * 128 + 64 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2717;
						@Pc(171) int local171 = local144 * 128 + 64 - Static86.aClass2_Sub1_Sub1_Sub1_Sub1_1.anInt2724;
						if (local171 < 0) {
							local171 = -local171;
						}
						if (local162 < 0) {
							local162 = -local162;
						}
						@Pc(190) int local190 = local171 + local162 - 128;
						if (local190 > local136) {
							Static20.anIntArray90[local12] = -100;
							continue;
						}
						if (local190 < 0) {
							local190 = 0;
						}
						local212 = (local136 - local190) * Static53.anInt1756 / local136;
					}
					@Pc(221) Class2_Sub12_Sub1 local221 = local89.method1336().method1823(Static90.aClass49_1);
					@Pc(226) Class2_Sub2_Sub2 local226 = Static118.method1210(local221, local212);
					local226.method1206(Static96.anIntArray301[local12] - 1);
					Static82.aClass2_Sub2_Sub1_1.method232(local226);
					Static20.anIntArray90[local12] = -100;
				}
			} else {
				Static31.anInt1216--;
				for (@Pc(32) int local32 = local12; local32 < Static31.anInt1216; local32++) {
					Static79.anIntArray271[local32] = Static79.anIntArray271[local32 + 1];
					Static31.aClass39Array1[local32] = Static31.aClass39Array1[local32 + 1];
					Static96.anIntArray301[local32] = Static96.anIntArray301[local32 + 1];
					Static20.anIntArray90[local32] = Static20.anIntArray90[local32 + 1];
					Static52.anIntArray179[local32] = Static52.anIntArray179[local32 + 1];
				}
				local12--;
			}
		}
		if (Static63.anInt1888 <= 0) {
			return;
		}
		Static63.anInt1888 -= 20;
		if (Static63.anInt1888 < 0) {
			Static63.anInt1888 = 0;
		}
		if (Static63.anInt1888 == 0 && Static53.anInt1755 != 0 && Static103.anInt2610 != -1) {
			Static60.method1287(0, Static103.anInt2610, Static53.anInt1755, Static90.aClass8_Sub1_20);
			return;
		}
	}
}
