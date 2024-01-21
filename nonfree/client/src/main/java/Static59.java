import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static59 {

	@OriginalMember(owner = "client!fi", name = "Ob", descriptor = "I")
	public static int anInt1222;

	@OriginalMember(owner = "client!fi", name = "Rb", descriptor = "Lclient!oc;")
	public static Class71_Sub1 aClass71_Sub1_4;

	@OriginalMember(owner = "client!fi", name = "Ub", descriptor = "[Lclient!rd;")
	public static Class42_Sub1[] aClass42_Sub1Array2;

	@OriginalMember(owner = "client!fi", name = "Yb", descriptor = "[[I")
	public static int[][] anIntArrayArray9;

	@OriginalMember(owner = "client!fi", name = "Sb", descriptor = "I")
	public static int anInt1225 = -1;

	@OriginalMember(owner = "client!fi", name = "Wb", descriptor = "I")
	public static int anInt1227 = -1;

	@OriginalMember(owner = "client!fi", name = "bc", descriptor = "I")
	public static int anInt1231 = 0;

	@OriginalMember(owner = "client!fi", name = "hc", descriptor = "Lclient!mb;")
	private static final Class62 aClass62_407 = Static151.method2243("Please remove ");

	@OriginalMember(owner = "client!fi", name = "cc", descriptor = "Lclient!mb;")
	public static Class62 aClass62_405 = aClass62_407;

	@OriginalMember(owner = "client!fi", name = "dc", descriptor = "I")
	public static volatile int anInt1232 = -1;

	@OriginalMember(owner = "client!fi", name = "fc", descriptor = "Lclient!mb;")
	public static Class62 aClass62_406 = aClass62_407;

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(Z)V")
	public static void method818() {
		@Pc(5) int local5;
		if (Static18.anInt450 > 0) {
			for (local5 = 0; local5 < 256; local5++) {
				if (Static18.anInt450 > 768) {
					Static142.anIntArray271[local5] = Static31.method540(1024 - Static18.anInt450, Static78.anIntArray137[local5], Static7.anIntArray227[local5]);
				} else if (Static18.anInt450 > 256) {
					Static142.anIntArray271[local5] = Static7.anIntArray227[local5];
				} else {
					Static142.anIntArray271[local5] = Static31.method540(256 - Static18.anInt450, Static7.anIntArray227[local5], Static78.anIntArray137[local5]);
				}
			}
		} else if (Static214.anInt4478 <= 0) {
			for (local5 = 0; local5 < 256; local5++) {
				Static142.anIntArray271[local5] = Static78.anIntArray137[local5];
			}
		} else {
			for (local5 = 0; local5 < 256; local5++) {
				if (Static214.anInt4478 > 768) {
					Static142.anIntArray271[local5] = Static31.method540(1024 - Static214.anInt4478, Static78.anIntArray137[local5], Static163.anIntArray302[local5]);
				} else if (Static214.anInt4478 > 256) {
					Static142.anIntArray271[local5] = Static163.anIntArray302[local5];
				} else {
					Static142.anIntArray271[local5] = Static31.method540(256 - Static214.anInt4478, Static163.anIntArray302[local5], Static78.anIntArray137[local5]);
				}
			}
		}
		local5 = 0;
		@Pc(151) int local151 = Static42.aClass2_Sub1_Sub2_Sub1_8.anInt403 * 9;
		@Pc(153) int local153 = 0;
		@Pc(170) int local170;
		@Pc(180) int local180;
		@Pc(187) int local187;
		@Pc(193) int local193;
		@Pc(202) int local202;
		@Pc(200) int local200;
		for (@Pc(155) int local155 = 1; local155 < 255; local155++) {
			local170 = Static7.anIntArray228[local155] * (256 - local155) / 256 + 22;
			if (local170 < 0) {
				local170 = 0;
			}
			local5 += local170;
			for (local180 = local170; local180 < 128; local180++) {
				local187 = Static85.anIntArray156[local5++];
				local193 = Static42.aClass2_Sub1_Sub2_Sub1_8.anIntArray32[local151++];
				if (local187 == 0) {
					Static5.aClass2_Sub1_Sub2_Sub1_1.anIntArray32[local153++] = local193;
				} else {
					local200 = 256 - local187;
					local202 = local187;
					local187 = Static142.anIntArray271[local187];
					Static5.aClass2_Sub1_Sub2_Sub1_1.anIntArray32[local153++] = (local202 * (local187 & 0xFF00FF) + (local193 & 0xFF00FF) * local200 & 0xFF00FF00) + ((local187 & 0xFF00) * local202 + (local200 * (local193 & 0xFF00)) & 0xFF0000) >> 8;
				}
			}
			for (local187 = 0; local187 < local170; local187++) {
				Static5.aClass2_Sub1_Sub2_Sub1_1.anIntArray32[local153++] = Static42.aClass2_Sub1_Sub2_Sub1_8.anIntArray32[local151++];
			}
			local151 += Static42.aClass2_Sub1_Sub2_Sub1_8.anInt403 - 128;
		}
		local153 = 0;
		local5 = 0;
		Static5.aClass2_Sub1_Sub2_Sub1_1.method271(0, 9);
		local151 = Static42.aClass2_Sub1_Sub2_Sub1_8.anInt403 * 9 + 128;
		for (local170 = 1; local170 < 255; local170++) {
			local180 = (256 - local170) * Static7.anIntArray228[local170] / 256 + 22;
			if (local180 < 0) {
				local180 = 0;
			}
			for (local187 = 0; local187 < local180; local187++) {
				@Pc(336) int local336 = local153++;
				local151--;
				Static56.aClass2_Sub1_Sub2_Sub1_5.anIntArray32[local336] = Static42.aClass2_Sub1_Sub2_Sub1_8.anIntArray32[local151];
			}
			for (local193 = local180; local193 < 128; local193++) {
				local202 = Static85.anIntArray156[local5++];
				local151--;
				local200 = Static42.aClass2_Sub1_Sub2_Sub1_8.anIntArray32[local151];
				if (local202 == 0) {
					Static56.aClass2_Sub1_Sub2_Sub1_5.anIntArray32[local153++] = local200;
				} else {
					@Pc(378) int local378 = local202;
					@Pc(382) int local382 = 256 - local202;
					local202 = Static142.anIntArray271[local202];
					Static56.aClass2_Sub1_Sub2_Sub1_5.anIntArray32[local153++] = (local378 * (local202 & 0xFF00) + local382 * (local200 & 0xFF00) & 0xFF0000) + (local378 * (local202 & 0xFF00FF) + (local200 & 0xFF00FF) * local382 & 0xFF00FF00) >> 8;
				}
			}
			local151 += Static42.aClass2_Sub1_Sub2_Sub1_8.anInt403 + 128;
			local5 += local180;
		}
		Static56.aClass2_Sub1_Sub2_Sub1_5.method271(637, 9);
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(III)J")
	public static long method819(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class2_Sub18 local7 = Static92.aClass2_Sub18ArrayArrayArray1[arg0][arg1][arg2];
		return local7 == null || local7.aClass10_1 == null ? 0L : local7.aClass10_1.aLong23;
	}

	@OriginalMember(owner = "client!fi", name = "c", descriptor = "(B)V")
	public static void method820() {
		@Pc(11) int local11 = (Static186.aClass7_Sub2_Sub2_1.anInt3085 >> 7) + Static153.anInt3278;
		Static23.anInt556 = 0;
		@Pc(20) int local20 = (Static186.aClass7_Sub2_Sub2_1.anInt3046 >> 7) + Static116.anInt2535;
		if (local20 >= 3053 && local20 <= 3156 && local11 >= 3056 && local11 <= 3136) {
			Static23.anInt556 = 1;
		}
		if (local20 >= 3072 && local20 <= 3118 && local11 >= 9492 && local11 <= 9535) {
			Static23.anInt556 = 1;
		}
		if (Static23.anInt556 == 1 && local20 >= 3139 && local20 <= 3199 && local11 >= 3008 && local11 <= 3062) {
			Static23.anInt556 = 0;
		}
	}
}
