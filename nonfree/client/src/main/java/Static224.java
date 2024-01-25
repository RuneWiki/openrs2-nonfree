import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static224 {

	@OriginalMember(owner = "client!kt", name = "s", descriptor = "Lclient!ss;")
	public static final Class231 aClass231_70 = new Class231("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

	@OriginalMember(owner = "client!kt", name = "y", descriptor = "[I")
	public static final int[] anIntArray346 = new int[5];

	@OriginalMember(owner = "client!kt", name = "z", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_86 = new Class25(22, -2);

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(ZZLjava/lang/String;)V")
	public static void method3091(@OriginalArg(1) boolean arg0, @OriginalArg(2) String arg1) {
		if (arg1 == null) {
			return;
		}
		if (Static127.anInt2142 >= 100) {
			Static172.method2536(Static11.aClass231_3.method5261(Static80.anInt6195));
			return;
		}
		@Pc(22) String local22 = Static155.method2318(arg1);
		if (local22 == null) {
			return;
		}
		@Pc(65) String local65;
		for (@Pc(27) int local27 = 0; local27 < Static127.anInt2142; local27++) {
			@Pc(35) String local35 = Static155.method2318(Static268.aStringArray47[local27]);
			if (local35 != null && local35.equals(local22)) {
				Static172.method2536(arg1 + Static299.aClass231_92.method5261(Static80.anInt6195));
				return;
			}
			if (Static80.aStringArray58[local27] != null) {
				local65 = Static155.method2318(Static80.aStringArray58[local27]);
				if (local65 != null && local65.equals(local22)) {
					Static172.method2536(arg1 + Static299.aClass231_92.method5261(Static80.anInt6195));
					return;
				}
			}
		}
		for (@Pc(91) int local91 = 0; local91 < Static259.anInt4591; local91++) {
			local65 = Static155.method2318(Static449.aStringArray67[local91]);
			if (local65 != null && local65.equals(local22)) {
				Static172.method2536(Static22.aClass231_10.method5261(Static80.anInt6195) + arg1 + Static302.aClass231_95.method5261(Static80.anInt6195));
				return;
			}
			if (Static197.aStringArray41[local91] != null) {
				@Pc(134) String local134 = Static155.method2318(Static197.aStringArray41[local91]);
				if (local134 != null && local134.equals(local22)) {
					Static172.method2536(Static22.aClass231_10.method5261(Static80.anInt6195) + arg1 + Static302.aClass231_95.method5261(Static80.anInt6195));
					return;
				}
			}
		}
		if (Static155.method2318(Static127.aClass11_Sub5_Sub2_Sub1_2.aString20).equals(local22)) {
			Static172.method2536(Static97.aClass231_31.method5261(Static80.anInt6195));
		} else {
			Static164.method2403(Static179.aClass208_46);
			Static389.aClass2_Sub17_Sub1_2.method6172(Static380.method5246(arg1) + 1);
			Static389.aClass2_Sub17_Sub1_2.method6151(arg1);
			Static389.aClass2_Sub17_Sub1_2.method6172(arg0 ? 1 : 0);
		}
	}

	@OriginalMember(owner = "client!kt", name = "a", descriptor = "(IIII)I")
	public static int method3092(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(15) int local15 = 255 - arg0;
		@Pc(33) int local33 = ((arg2 & 0xFF00FF) * arg0 & 0xFF00FF00 | arg0 * (arg2 & 0xFF00) & 0xFF0000) >>> 8;
		return local33 + ((local15 * (arg1 & 0xFF00FF) & 0xFF00FF00 | local15 * (arg1 & 0xFF00) & 0xFF0000) >>> 8);
	}
}
