import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!uea", name = "m", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!uea", name = "q", descriptor = "[Lclient!fia;")
	public static Class45[] aClass45Array31;

	@OriginalMember(owner = "client!uea", name = "o", descriptor = "[I")
	public static final int[] anIntArray546 = new int[1];

	@OriginalMember(owner = "client!uea", name = "p", descriptor = "Z")
	public static boolean aBoolean693 = false;

	@OriginalMember(owner = "client!uea", name = "e", descriptor = "(I)I")
	public static int method8615() {
		if (Static649.aClass299_12 == null) {
			if (!Static455.aBoolean533 && Static379.aClass14_Sub2_Sub20_3 != null) {
				return Static379.aClass14_Sub2_Sub20_3.anInt9999;
			}
			@Pc(26) int local26 = Static656.aClass118_1.method7586();
			@Pc(32) int local32 = Static656.aClass118_1.method7590();
			@Pc(52) int local52;
			@Pc(54) int local54;
			@Pc(73) int local73;
			@Pc(149) Class14_Sub2_Sub20 local149;
			if (Static35.aBoolean45) {
				@Pc(277) Class44 local277;
				if (local26 > Static189.anInt3199 && local26 < Static189.anInt3199 + Static501.anInt8738) {
					local52 = -1;
					for (local54 = 0; local54 < Static164.anInt2537; local54++) {
						if (Static575.aBoolean661) {
							local73 = local54 * 16 + Static78.anInt1261 + 33;
							if (local32 > local73 - 13 && local73 + 3 >= local32) {
								local52 = local54;
							}
						} else {
							local73 = Static78.anInt1261 + local54 * 16 + 31;
							if (local32 > local73 - 13 && local73 + 3 >= local32) {
								local52 = local54;
							}
						}
					}
					if (local52 != -1) {
						local73 = 0;
						local277 = new Class44(Static440.aClass269_60);
						for (@Pc(282) Class14_Sub2_Sub17 local282 = (Class14_Sub2_Sub17) local277.method805(); local282 != null; local282 = (Class14_Sub2_Sub17) local277.method808()) {
							if (local52 == local73++) {
								return ((Class14_Sub2_Sub20) local282.aClass269_142.aClass14_Sub2_42.aClass14_Sub2_67).anInt9999;
							}
						}
					}
				} else if (Static52.aClass14_Sub2_Sub17_1 != null && Static406.anInt7035 < local26 && local26 < Static406.anInt7035 + Static91.anInt1595) {
					local52 = -1;
					for (local54 = 0; local54 < Static52.aClass14_Sub2_Sub17_1.anInt9298; local54++) {
						if (Static575.aBoolean661) {
							local73 = local54 * 16 + Static381.anInt6705 + 33;
							if (local32 > local73 - 13 && local32 <= local73 + 3) {
								local52 = local54;
							}
						} else {
							local73 = local54 * 16 + Static381.anInt6705 + 31;
							if (local32 > local73 - 13 && local73 + 3 >= local32) {
								local52 = local54;
							}
						}
					}
					if (local52 != -1) {
						local73 = 0;
						local277 = new Class44(Static52.aClass14_Sub2_Sub17_1.aClass269_142);
						for (local149 = (Class14_Sub2_Sub20) local277.method805(); local149 != null; local149 = (Class14_Sub2_Sub20) local277.method808()) {
							if (local52 == local73++) {
								return local149.anInt9999;
							}
						}
					}
				}
			} else if (local26 > Static189.anInt3199 && local26 < Static501.anInt8738 + Static189.anInt3199) {
				local52 = -1;
				for (local54 = 0; local54 < Static638.anInt10454; local54++) {
					if (Static575.aBoolean661) {
						local73 = (Static638.anInt10454 - local54 - 1) * 16 + Static78.anInt1261 + 33;
						if (local32 > local73 - 13 && local73 + 3 >= local32) {
							local52 = local54;
						}
					} else {
						local73 = (Static638.anInt10454 - local54 - 1) * 16 + Static78.anInt1261 + 31;
						if (local32 > local73 - 13 && local73 + 3 >= local32) {
							local52 = local54;
						}
					}
				}
				if (local52 != -1) {
					local73 = 0;
					@Pc(144) Class140 local144 = new Class140(Static111.aClass32_7);
					for (local149 = (Class14_Sub2_Sub20) local144.method3019(); local149 != null; local149 = (Class14_Sub2_Sub20) local144.method3016()) {
						if (local52 == local73++) {
							return local149.anInt9999;
						}
					}
				}
			}
		}
		return -1;
	}
}
