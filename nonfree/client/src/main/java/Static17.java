import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!aja", name = "D", descriptor = "Lclient!hda;")
	public static final Class129 aClass129_2 = new Class129(6, 1);

	@OriginalMember(owner = "client!aja", name = "a", descriptor = "(Lclient!ha;B)V")
	public static void method579(@OriginalArg(0) Class5 arg0) {
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		if (Static238.aBoolean425) {
			local7 = Static352.method5739();
			local9 = Static573.method7997();
		}
		arg0.KA(local7, local9, Static294.anInt6026 + local7, 350 - -local9);
		arg0.aa(local7, local9, Static294.anInt6026, 350, Static234.anInt5224 << 24 | 0x332277, 1);
		Static215.method3836(local9 + 350, local9, local7, local7 + Static294.anInt6026);
		@Pc(61) int local61 = 350 / Static446.anInt8097;
		@Pc(70) int local70;
		if (Static310.anInt1854 > 0) {
			local70 = 346 - Static446.anInt8097 - 4;
			@Pc(80) int local80 = local61 * local70 / (Static310.anInt1854 + local61 - 1);
			@Pc(82) int local82 = 4;
			if (Static310.anInt1854 > 1) {
				local82 = (local70 - local80) * (-Static107.anInt2893 + Static310.anInt1854 + -1) / (Static310.anInt1854 - 1) + 4;
			}
			arg0.aa(local7 + Static294.anInt6026 - 16, local9 - -local82, 12, local80, Static234.anInt5224 << 24 | 0x332277, 2);
			for (@Pc(124) int local124 = Static107.anInt2893; local124 < local61 + Static107.anInt2893 && local124 < Static310.anInt1854; local124++) {
				@Pc(133) String[] local133 = Static206.method3730(Static363.aStringArray36[local124], '\b');
				@Pc(142) int local142 = (Static294.anInt6026 - 16 - 8) / local133.length;
				for (@Pc(144) int local144 = 0; local144 < local133.length; local144++) {
					@Pc(153) int local153 = local142 * local144 + 8;
					arg0.KA(local7 + local153, local9, local142 + local153 + local7 - 8, local9 + 350);
					Static359.aClass34_7.method8598(local9 + 348 - Static446.anInt8097 * (local124 - Static107.anInt2893) - Static184.aClass213_5.anInt6972 - Static195.anInt4214, Static85.method2223(local133[local144]), -1, -16777216, local7 + local153);
				}
			}
		}
		Static588.aClass34_14.method8584(-1, local7 + Static294.anInt6026 - 25, -16777216, "Build: 637", local9 + 350 - 20);
		arg0.KA(local7, local9, local7 + Static294.anInt6026, local9 + 350);
		arg0.method6116(Static294.anInt6026, -1, local9 + 350 - Static195.anInt4214, local7);
		Static537.aClass34_12.method8598(local9 + 349 - Static2.aClass213_9.anInt6972, "--> " + Static85.method2223(Static91.aString16), -1, -16777216, local7 + 10);
		if (!Static8.aBoolean55) {
			return;
		}
		local70 = -1;
		if (Static384.anInt7234 % 30 > 15) {
			local70 = 16777215;
		}
		arg0.method6118(local9 + 350 - Static2.aClass213_9.anInt6972 - 11, Static2.aClass213_9.method5831("--> " + Static85.method2223(Static91.aString16).substring(0, Static364.anInt7027)) + 10 + local7, local70, 12);
	}
}
