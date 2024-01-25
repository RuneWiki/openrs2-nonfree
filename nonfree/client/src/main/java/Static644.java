import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static644 {

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "Z")
	public static boolean aBoolean777 = false;

	@OriginalMember(owner = "client!ws", name = "e", descriptor = "[[Ljava/lang/String;")
	public static final String[][] aStringArrayArray2 = new String[][] { { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" }, { "Jan", "Feb", "Mär", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" }, { "jan", "fév", "mars", "avr", "mai", "juin", "juil", "août", "sept", "oct", "nov", "déc" }, { "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" }, { "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" } };

	@OriginalMember(owner = "client!ws", name = "a", descriptor = "(Lclient!um;)V")
	public static void method8651(@OriginalArg(0) Class339 arg0) {
		if (Static162.anInt3228 >= 65535) {
			return;
		}
		@Pc(6) Class3_Sub22 local6 = arg0.aClass3_Sub22_3;
		Static209.aClass339Array1[Static162.anInt3228] = arg0;
		Static79.aBooleanArray2[Static162.anInt3228] = false;
		Static162.anInt3228++;
		@Pc(21) int local21 = arg0.anInt9470;
		if (arg0.aBoolean711) {
			local21 = 0;
		}
		@Pc(29) int local29 = arg0.anInt9470;
		if (arg0.aBoolean713) {
			local29 = Static603.anInt9778 - 1;
		}
		for (@Pc(38) int local38 = local21; local38 <= local29; local38++) {
			@Pc(41) int local41 = 0;
			@Pc(53) int local53 = local6.method8386() + Static493.anInt8365 - local6.method8382() >> Static485.anInt8241;
			if (local53 < 0) {
				local41 = -local53;
				local53 = 0;
			}
			@Pc(73) int local73 = local6.method8386() + local6.method8382() - Static493.anInt8365 >> Static485.anInt8241;
			if (local73 >= Static547.anInt9143) {
				local73 = Static547.anInt9143 - 1;
			}
			for (@Pc(82) int local82 = local53; local82 <= local73; local82++) {
				@Pc(89) short local89 = arg0.aShortArray137[local41++];
				@Pc(105) int local105 = (local6.method8391() + Static493.anInt8365 - local6.method8382() >> Static485.anInt8241) + (local89 >>> 8);
				@Pc(113) int local113 = local105 + (local89 & 0xFF) - 1;
				if (local105 < 0) {
					local105 = 0;
				}
				if (local113 >= Static573.anInt6750) {
					local113 = Static573.anInt6750 - 1;
				}
				for (@Pc(126) int local126 = local105; local126 <= local113; local126++) {
					@Pc(135) long local135 = Static387.aLongArrayArrayArray1[local38][local126][local82];
					if ((local135 & 0xFFFFL) == 0L) {
						Static387.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static162.anInt3228;
					} else if ((local135 & 0xFFFF0000L) == 0L) {
						Static387.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static162.anInt3228 << 16;
					} else if ((local135 & 0xFFFF00000000L) == 0L) {
						Static387.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static162.anInt3228 << 32;
					} else if ((local135 & 0xFFFF000000000000L) == 0L) {
						Static387.aLongArrayArrayArray1[local38][local126][local82] = local135 | (long) Static162.anInt3228 << 48;
					}
				}
			}
		}
	}
}
