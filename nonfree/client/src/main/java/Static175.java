import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "Lclient!ho;")
	public static final Class160 aClass160_82 = new Class160(102, 17);

	@OriginalMember(owner = "client!ft", name = "e", descriptor = "I")
	public static int anInt2848 = 0;

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(BI)V")
	public static void method2582(@OriginalArg(1) int arg0) {
		for (@Pc(7) Class14 local7 = Static574.aClass125_40.method2633(); local7 != null; local7 = Static574.aClass125_40.method2627()) {
			if ((long) arg0 == (local7.aLong324 >> 48 & 0xFFFFL)) {
				local7.method9513();
			}
		}
	}

	@OriginalMember(owner = "client!ft", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method2583(@OriginalArg(0) Class144 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static656.aBoolean741) {
			local7 = Static532.method7876();
			local9 = Static276.method4674();
		}
		@Pc(21) int local21 = local7 + Static189.anInt3199;
		@Pc(26) int local26 = Static78.anInt1261 + local9;
		@Pc(28) int local28 = Static501.anInt8738;
		@Pc(32) int local32 = Static252.anInt4767 - 3;
		Static673.method9334(Static252.anInt4767, local9 + Static78.anInt1261, arg0, Static21.aClass21_23.method324(Static26.anInt352), Static189.anInt3199 + local7, Static501.anInt8738);
		@Pc(57) int local57 = Static656.aClass118_1.method7586() + local7;
		@Pc(70) int local70 = local9 + Static656.aClass118_1.method7590();
		@Pc(74) int local74;
		@Pc(79) Class14_Sub2_Sub20 local79;
		@Pc(95) int local95;
		@Pc(304) int local304;
		@Pc(179) Class14_Sub2_Sub17 local179;
		@Pc(290) Class14_Sub2_Sub20 local290;
		if (Static35.aBoolean45) {
			local74 = 0;
			for (local179 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6494(); local179 != null; local179 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6491()) {
				local95 = local74 * 16 + local26 + 33;
				local74++;
				if (local57 > local7 + Static189.anInt3199 && Static501.anInt8738 + Static189.anInt3199 + local7 > local57 && local70 > local95 - 13 && local70 < local95 + 4 && (local179.anInt9298 > 1 || ((Class14_Sub2_Sub20) local179.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67).aBoolean691)) {
					arg0.aa(Static189.anInt3199 + local7, local95 - 12, Static501.anInt8738, 16, 255 - Static308.anInt5463 << 24 | Static331.anInt5679, 1);
				}
			}
			if (Static52.aClass14_Sub2_Sub17_1 != null) {
				Static673.method9334(Static345.anInt5864, Static381.anInt6705, arg0, Static52.aClass14_Sub2_Sub17_1.aString104, Static406.anInt7035, Static91.anInt1595);
				local74 = 0;
				for (local290 = (Class14_Sub2_Sub20) Static52.aClass14_Sub2_Sub17_1.aClass269_142.method6494(); local290 != null; local290 = (Class14_Sub2_Sub20) Static52.aClass14_Sub2_Sub17_1.aClass269_142.method6491()) {
					local304 = local74 * 16 + Static381.anInt6705 + 20 + 13;
					local74++;
					if (local57 > Static406.anInt7035 && Static91.anInt1595 + Static406.anInt7035 > local57 && local70 > local304 - 13 && local70 < local304 + 4 && local290.aBoolean691) {
						arg0.aa(Static406.anInt7035, local304 - 12, Static91.anInt1595, 16, Static331.anInt5679 | 255 - Static308.anInt5463 << 24, 1);
					}
				}
				Static486.method7343(Static381.anInt6705, Static406.anInt7035, Static345.anInt5864, Static91.anInt1595, arg0);
			}
		} else {
			local74 = 0;
			for (local79 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local79 != null; local79 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
				local95 = local26 + (Static638.anInt10454 + -1 - local74) * 16 + 13 + 20;
				local74++;
				if (Static189.anInt3199 + local7 < local57 && Static501.anInt8738 + Static189.anInt3199 + local7 > local57 && local70 > local95 - 13 && local95 + 4 > local70 && local79.aBoolean691) {
					arg0.aa(Static189.anInt3199 + local7, local95 + -12, Static501.anInt8738, 16, Static331.anInt5679 | 255 - Static308.anInt5463 << 24, 1);
				}
			}
		}
		Static486.method7343(local9 + Static78.anInt1261, Static189.anInt3199 + local7, Static252.anInt4767, Static501.anInt8738, arg0);
		if (Static35.aBoolean45) {
			local74 = 0;
			for (local179 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6494(); local179 != null; local179 = (Class14_Sub2_Sub17) Static440.aClass269_60.method6491()) {
				local95 = local74 * 16 + local9 + Static78.anInt1261 + 13 + 20;
				local74++;
				if (local179.anInt9298 == 1) {
					Static23.method346(Static501.anInt8738, Static220.anInt4304 | 0xFF000000, local57, local95, local70, (Class14_Sub2_Sub20) local179.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67, Static252.anInt4767, arg0, Static338.anInt5748 | 0xFF000000, local9 + Static78.anInt1261, Static189.anInt3199 - -local7);
				} else {
					Static321.method5056(Static501.anInt8738, 23448, Static220.anInt4304 | 0xFF000000, local9 + Static78.anInt1261, arg0, local57, local179, local95, Static252.anInt4767, local70, local7 + Static189.anInt3199, Static338.anInt5748 | 0xFF000000);
				}
			}
			if (Static52.aClass14_Sub2_Sub17_1 != null) {
				local74 = 0;
				for (local290 = (Class14_Sub2_Sub20) Static52.aClass14_Sub2_Sub17_1.aClass269_142.method6494(); local290 != null; local290 = (Class14_Sub2_Sub20) Static52.aClass14_Sub2_Sub17_1.aClass269_142.method6491()) {
					local304 = local74 * 16 + Static381.anInt6705 + 20 + 13;
					Static23.method346(Static91.anInt1595, Static220.anInt4304 | 0xFF000000, local57, local304, local70, local290, Static345.anInt5864, arg0, Static338.anInt5748 | 0xFF000000, Static381.anInt6705, Static406.anInt7035);
					local74++;
				}
				Static317.method5021(Static381.anInt6705, Static345.anInt5864, Static406.anInt7035, Static91.anInt1595);
			}
		} else {
			local74 = 0;
			for (local79 = (Class14_Sub2_Sub20) Static111.aClass32_7.method584(); local79 != null; local79 = (Class14_Sub2_Sub20) Static111.aClass32_7.method577()) {
				local95 = local26 + (-1 + Static638.anInt10454 + -local74) * 16 + 20 + 13;
				local74++;
				Static23.method346(local28, Static220.anInt4304 | 0xFF000000, local57, local95, local70, local79, local32, arg0, Static338.anInt5748 | 0xFF000000, local26, local21);
			}
		}
		Static317.method5021(local9 + Static78.anInt1261, Static252.anInt4767, Static189.anInt3199 + local7, Static501.anInt8738);
	}

	@OriginalMember(owner = "client!ft", name = "b", descriptor = "(I)V")
	public static void method2584() {
		@Pc(8) Class14_Sub29 local8 = (Class14_Sub29) Static477.aClass32_54.method584();
		@Pc(19) boolean local19 = Static649.aClass299_12 != null || Static563.anInt4937 > 0;
		@Pc(28) int local28 = local8.method7858();
		@Pc(32) int local32 = local8.method7859();
		if (local19) {
			Static223.anInt4348 = 1;
		}
		if (local19) {
			Static594.aClass14_Sub2_Sub20_4 = Static379.aClass14_Sub2_Sub20_3;
		} else {
			Static131.method2013(Static379.aClass14_Sub2_Sub20_3, local28, local32);
		}
	}
}
