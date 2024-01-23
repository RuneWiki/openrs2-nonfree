import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static165 {

	@OriginalMember(owner = "client!ra", name = "R", descriptor = "Lclient!tc;")
	public static Class2_Sub2_Sub21 aClass2_Sub2_Sub21_1 = new Class2_Sub2_Sub21();

	@OriginalMember(owner = "client!ra", name = "V", descriptor = "Lclient!i;")
	public static Class41 aClass41_1027 = Static184.method2923("sch-Utteln:");

	@OriginalMember(owner = "client!ra", name = "Z", descriptor = "J")
	public static volatile long aLong121 = 0L;

	@OriginalMember(owner = "client!ra", name = "eb", descriptor = "Lclient!i;")
	public static Class41 aClass41_1028 = Static184.method2923("<col=ff3000>");

	@OriginalMember(owner = "client!ra", name = "gb", descriptor = "I")
	public static int anInt3866 = 0;

	@OriginalMember(owner = "client!ra", name = "d", descriptor = "(Z)V")
	public static void method2687() {
		@Pc(11) int local11;
		if (Static139.anInt3213 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static139.anInt3213 > 768) {
					Static142.anIntArray339[local11] = Static202.method1220(Static14.anIntArray24[local11], 1024 - Static139.anInt3213, Static3.anIntArray4[local11]);
				} else if (Static139.anInt3213 <= 256) {
					Static142.anIntArray339[local11] = Static202.method1220(Static3.anIntArray4[local11], 256 - Static139.anInt3213, Static14.anIntArray24[local11]);
				} else {
					Static142.anIntArray339[local11] = Static14.anIntArray24[local11];
				}
			}
		} else if (Static146.anInt3312 > 0) {
			for (local11 = 0; local11 < 256; local11++) {
				if (Static146.anInt3312 > 768) {
					Static142.anIntArray339[local11] = Static202.method1220(Static141.anIntArray338[local11], 1024 - Static146.anInt3312, Static3.anIntArray4[local11]);
				} else if (Static146.anInt3312 <= 256) {
					Static142.anIntArray339[local11] = Static202.method1220(Static3.anIntArray4[local11], 256 - Static146.anInt3312, Static141.anIntArray338[local11]);
				} else {
					Static142.anIntArray339[local11] = Static141.anIntArray338[local11];
				}
			}
		} else {
			for (local11 = 0; local11 < 256; local11++) {
				Static142.anIntArray339[local11] = Static3.anIntArray4[local11];
			}
		}
		@Pc(152) int local152 = Static77.aClass2_Sub2_Sub16_Sub1_2.anInt3493 * 9;
		local11 = 0;
		@Pc(156) int local156 = 0;
		@Pc(173) int local173;
		@Pc(186) int local186;
		@Pc(193) int local193;
		@Pc(199) int local199;
		@Pc(214) int local214;
		@Pc(218) int local218;
		for (@Pc(158) int local158 = 1; local158 < 255; local158++) {
			local173 = Static213.anIntArray487[local158] * (256 - local158) / 256 + 22;
			if (local173 < 0) {
				local173 = 0;
			}
			local11 += local173;
			for (local186 = local173; local186 < 128; local186++) {
				local193 = Static168.anIntArray407[local11++];
				local199 = Static77.aClass2_Sub2_Sub16_Sub1_2.anIntArray354[local152++];
				if (local193 == 0) {
					Static32.aClass2_Sub2_Sub16_Sub1_1.anIntArray354[local156++] = local199;
				} else {
					local214 = local193;
					local218 = 256 - local193;
					local193 = Static142.anIntArray339[local193];
					Static32.aClass2_Sub2_Sub16_Sub1_1.anIntArray354[local156++] = ((local193 & 0xFF00FF) * local214 + local218 * (local199 & 0xFF00FF) & 0xFF00FF00) + (local218 * (local199 & 0xFF00) + (local193 & 0xFF00) * local214 & 0xFF0000) >> 8;
				}
			}
			for (local193 = 0; local193 < local173; local193++) {
				Static32.aClass2_Sub2_Sub16_Sub1_1.anIntArray354[local156++] = Static77.aClass2_Sub2_Sub16_Sub1_2.anIntArray354[local152++];
			}
			local152 += Static77.aClass2_Sub2_Sub16_Sub1_2.anInt3493 - 128;
		}
		local156 = 0;
		local11 = 0;
		Static32.aClass2_Sub2_Sub16_Sub1_1.method2396(0, 9);
		local152 = Static77.aClass2_Sub2_Sub16_Sub1_2.anInt3493 * 9 + 128;
		for (local173 = 1; local173 < 255; local173++) {
			local186 = Static213.anIntArray487[local173] * (256 - local173) / 256 + 22;
			if (local186 < 0) {
				local186 = 0;
			}
			for (local193 = 0; local193 < local186; local193++) {
				@Pc(340) int local340 = local156++;
				local152--;
				Static78.aClass2_Sub2_Sub16_Sub1_3.anIntArray354[local340] = Static77.aClass2_Sub2_Sub16_Sub1_2.anIntArray354[local152];
			}
			for (local199 = local186; local199 < 128; local199++) {
				local214 = Static168.anIntArray407[local11++];
				local152--;
				local218 = Static77.aClass2_Sub2_Sub16_Sub1_2.anIntArray354[local152];
				if (local214 == 0) {
					Static78.aClass2_Sub2_Sub16_Sub1_3.anIntArray354[local156++] = local218;
				} else {
					@Pc(374) int local374 = local214;
					@Pc(379) int local379 = 256 - local214;
					local214 = Static142.anIntArray339[local214];
					Static78.aClass2_Sub2_Sub16_Sub1_3.anIntArray354[local156++] = ((local218 & 0xFF00) * local379 + local374 * (local214 & 0xFF00) & 0xFF0000) + ((local218 & 0xFF00FF) * local379 + (local214 & 0xFF00FF) * local374 & 0xFF00FF00) >> 8;
				}
			}
			local152 += Static77.aClass2_Sub2_Sub16_Sub1_2.anInt3493 + 128;
			local11 += local186;
		}
		Static78.aClass2_Sub2_Sub16_Sub1_3.method2396(637, 9);
	}
}
