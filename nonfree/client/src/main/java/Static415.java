import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static415 {

	@OriginalMember(owner = "client!oda", name = "j", descriptor = "I")
	public static int anInt9653;

	@OriginalMember(owner = "client!oda", name = "g", descriptor = "Lclient!dv;")
	public static final Class96 aClass96_24 = new Class96(8, 0, 4, 1);

	@OriginalMember(owner = "client!oda", name = "h", descriptor = "Z")
	public static boolean aBoolean741 = false;

	@OriginalMember(owner = "client!oda", name = "m", descriptor = "Lclient!el;")
	public static final Class109 aClass109_204 = new Class109(39, 3);

	@OriginalMember(owner = "client!oda", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method8265(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		if (arg0.startsWith("*")) {
			arg0 = arg0.substring(1);
		}
		@Pc(21) String local21 = Static250.method3679(arg0);
		if (local21 == null) {
			return;
		}
		for (@Pc(32) int local32 = 0; local32 < Static463.anInt7895; local32++) {
			@Pc(38) String local38 = Static444.aStringArray54[local32];
			if (local38.startsWith("*")) {
				local38 = local38.substring(1);
			}
			local38 = Static250.method3679(local38);
			if (local38 != null && local38.equals(local21)) {
				Static463.anInt7895--;
				for (@Pc(64) int local64 = local32; local64 < Static463.anInt7895; local64++) {
					Static444.aStringArray54[local64] = Static444.aStringArray54[local64 + 1];
					Static446.aStringArray57[local64] = Static446.aStringArray57[local64 + 1];
					Static279.anIntArray271[local64] = Static279.anIntArray271[local64 + 1];
					Static95.aStringArray9[local64] = Static95.aStringArray9[local64 + 1];
					Static105.anIntArray91[local64] = Static105.anIntArray91[local64 + 1];
					Static514.aBooleanArray20[local64] = Static514.aBooleanArray20[local64 + 1];
				}
				Static148.anInt2385 = Static261.anInt4525;
				@Pc(131) Class5_Sub50 local131 = Static457.method6722(Static223.aClass387_41, Static80.aClass313_1);
				local131.aClass5_Sub23_Sub2_2.method8502(Static228.method3239(arg0));
				local131.aClass5_Sub23_Sub2_2.method8538(arg0);
				Static494.method7120(local131);
				return;
			}
		}
	}

	@OriginalMember(owner = "client!oda", name = "b", descriptor = "(I)V")
	public static void method8271() {
		Static323.method4945((long) Static44.anInt740, Static457.aClass57_11);
		if (Static390.anInt6669 != -1) {
			Static91.method1356(Static390.anInt6669);
		}
		for (@Pc(22) int local22 = 0; local22 < Static449.anInt7746; local22++) {
			if (Static386.aBooleanArray13[local22]) {
				Static587.aBooleanArray26[local22] = true;
			}
			Static559.aBooleanArray25[local22] = Static386.aBooleanArray13[local22];
			Static386.aBooleanArray13[local22] = false;
		}
		Static140.anInt2267 = Static44.anInt740;
		if (Static390.anInt6669 != -1) {
			Static449.anInt7746 = 0;
			Static643.method8969();
		}
		Static457.aClass57_11.la();
		Static38.method661(Static457.aClass57_11);
		@Pc(77) int local77 = Static291.method4317();
		if (local77 == -1) {
			local77 = Static446.anInt7686;
		}
		if (local77 == -1) {
			local77 = Static273.anInt4776;
		}
		Static106.method1540(local77);
		Static315.anInt5591 = 0;
	}
}
