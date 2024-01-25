import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static349 {

	@OriginalMember(owner = "client!nga", name = "f", descriptor = "Lclient!jn;")
	public static final Class167 aClass167_33 = new Class167(4);

	@OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)Z")
	public static boolean method5313() {
		try {
			if (Static491.anInt9287 == 2) {
				if (Static156.aClass4_Sub5_5 == null) {
					Static156.aClass4_Sub5_5 = Static596.method1122(Static221.aClass348_16, Static575.anInt10386, Static563.anInt10263);
					if (Static156.aClass4_Sub5_5 == null) {
						return false;
					}
				}
				if (Static128.aClass17_1 == null) {
					Static128.aClass17_1 = new Class17(Static53.aClass348_129, Static550.aClass348_125);
				}
				@Pc(29) Class4_Sub21_Sub4 local29 = Static365.aClass4_Sub21_Sub4_6;
				if (Static132.aClass4_Sub21_Sub4_1 != null) {
					local29 = Static132.aClass4_Sub21_Sub4_1;
				}
				if (local29.method6167(Static156.aClass4_Sub5_5, Static478.aClass348_112, Static128.aClass17_1)) {
					Static365.aClass4_Sub21_Sub4_6 = local29;
					Static365.aClass4_Sub21_Sub4_6.method6163();
					@Pc(65) int local65;
					if (Static364.anInt7019 > 0) {
						Static491.anInt9287 = 3;
						Static365.aClass4_Sub21_Sub4_6.method6165(Static419.anInt7992 < Static364.anInt7019 ? Static419.anInt7992 : Static364.anInt7019);
						for (local65 = 0; local65 < Static364.anIntArray391.length; local65++) {
							Static365.aClass4_Sub21_Sub4_6.method6164(Static364.anIntArray391[local65], local65);
							Static364.anIntArray391[local65] = 255;
						}
					} else {
						Static491.anInt9287 = 0;
						Static365.aClass4_Sub21_Sub4_6.method6165(Static419.anInt7992);
						for (local65 = 0; local65 < Static364.anIntArray391.length; local65++) {
							Static365.aClass4_Sub21_Sub4_6.method6164(Static364.anIntArray391[local65], local65);
							Static364.anIntArray391[local65] = 255;
						}
					}
					if (Static132.aClass4_Sub21_Sub4_1 == null) {
						if (Static301.aLong158 <= 0L) {
							Static365.aClass4_Sub21_Sub4_6.method6168(Static139.aBoolean230, Static156.aClass4_Sub5_5);
						} else {
							Static365.aClass4_Sub21_Sub4_6.method6182(Static156.aClass4_Sub5_5, Static301.aLong158, Static139.aBoolean230);
						}
					}
					if (Static197.aClass15_1 != null) {
						Static197.aClass15_1.method5346(Static365.aClass4_Sub21_Sub4_6);
					}
					Static221.aClass348_16 = null;
					Static156.aClass4_Sub5_5 = null;
					Static301.aLong158 = 0L;
					Static128.aClass17_1 = null;
					Static132.aClass4_Sub21_Sub4_1 = null;
					return true;
				}
			}
		} catch (@Pc(160) Exception local160) {
			local160.printStackTrace();
			Static365.aClass4_Sub21_Sub4_6.method6175();
			Static128.aClass17_1 = null;
			Static491.anInt9287 = 0;
			Static132.aClass4_Sub21_Sub4_1 = null;
			Static221.aClass348_16 = null;
			Static156.aClass4_Sub5_5 = null;
		}
		return false;
	}
}
