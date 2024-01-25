import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static324 {

	@OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
	public static int anInt5805;

	@OriginalMember(owner = "client!mg", name = "g", descriptor = "Lclient!ng;")
	public static final Class225 aClass225_6 = new Class225();

	@OriginalMember(owner = "client!mg", name = "m", descriptor = "[I")
	public static final int[] anIntArray370 = new int[13];

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method4895(@OriginalArg(1) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static317.method4820(arg0);
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method4898(@OriginalArg(1) String arg0) {
		if (!Static22.aBoolean43 || (Static434.anInt7646 & 0x18) == 0) {
			return;
		}
		@Pc(25) boolean local25 = false;
		@Pc(27) int local27 = Static60.anInt1505;
		@Pc(29) int[] local29 = Static346.anIntArray413;
		for (@Pc(31) int local31 = 0; local31 < local27; local31++) {
			@Pc(39) Class20_Sub2_Sub4_Sub1_Sub1 local39 = Static230.aClass20_Sub2_Sub4_Sub1_Sub1Array6[local29[local31]];
			if (local39.aString49 != null && local39.aString49.equalsIgnoreCase(arg0) && (local39 == Static465.aClass20_Sub2_Sub4_Sub1_Sub1_2 && (Static434.anInt7646 & 0x10) != 0 || local39 != null && (Static434.anInt7646 & 0x8) != 0)) {
				@Pc(69) Class1_Sub48 local69 = Static320.method4867(Static442.aClass170_2, Static8.aClass319_4);
				local69.aClass1_Sub20_Sub1_2.method4409(Static141.anInt2722);
				local69.aClass1_Sub20_Sub1_2.method4377(0);
				local69.aClass1_Sub20_Sub1_2.method4402(Static39.anInt1026);
				local69.aClass1_Sub20_Sub1_2.method4409(local29[local31]);
				local69.aClass1_Sub20_Sub1_2.method4420(Static365.anInt6484);
				Static34.method813(local69);
				Static493.method6900(local39.method5349(), 0, local39.anIntArray437[0], true, 0, -2, local39.anIntArray436[0], local39.method5349());
				local25 = true;
				break;
			}
		}
		if (!local25) {
			Static172.method2626(Static103.aClass77_23.method1864(Static562.anInt9127) + arg0);
		}
		if (Static22.aBoolean43) {
			Static130.method6495();
		}
	}

	@OriginalMember(owner = "client!mg", name = "a", descriptor = "(BIIII)V")
	public static void method4900(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class1_Sub3_Sub1 local16 = Static374.method5445(4, arg2);
		local16.method491();
		local16.anInt545 = arg3;
		local16.anInt548 = arg0;
		local16.anInt549 = arg1;
	}
}
