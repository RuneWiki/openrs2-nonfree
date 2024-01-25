import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static447 {

	@OriginalMember(owner = "client!paa", name = "m", descriptor = "Lclient!sb;")
	public static final Class322 aClass322_138 = new Class322(130, 2);

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method6915(@OriginalArg(1) String arg0) {
		if (!Static162.aBoolean266 || (Static109.anInt2151 & 0x18) == 0) {
			return;
		}
		@Pc(20) boolean local20 = false;
		@Pc(22) int local22 = Static661.anInt10532;
		@Pc(29) int[] local29 = Static591.anIntArray611;
		for (@Pc(31) int local31 = 0; local31 < local22; local31++) {
			@Pc(39) Class60_Sub1_Sub1_Sub3_Sub1 local39 = Static171.aClass60_Sub1_Sub1_Sub3_Sub1Array1[local29[local31]];
			if (local39.aString23 != null && local39.aString23.equalsIgnoreCase(arg0) && (local39 == Static194.aClass60_Sub1_Sub1_Sub3_Sub1_1 && (Static109.anInt2151 & 0x10) != 0 || (Static109.anInt2151 & 0x8) != 0)) {
				@Pc(76) Class6_Sub13 local76 = Static30.method353(Static219.aClass241_60, Static525.aClass260_4.aClass270_2);
				local76.aClass6_Sub15_Sub1_1.method3040(Static270.anInt5047);
				local76.aClass6_Sub15_Sub1_1.method3029(Static227.anInt4416);
				local76.aClass6_Sub15_Sub1_1.method3040(local29[local31]);
				local76.aClass6_Sub15_Sub1_1.method2984(Static607.anInt9574);
				local76.aClass6_Sub15_Sub1_1.method3010(0);
				Static525.aClass260_4.method6404(local76);
				Static223.method4038(0, -2, true, local39.method4424((byte) -28), local39.anIntArray263[0], local39.anIntArray264[0], 0, local39.method4424((byte) -28));
				local20 = true;
				break;
			}
		}
		if (!local20) {
			Static298.method4814(Static50.aClass43_21.method596(Static601.anInt9518) + arg0);
		}
		if (Static162.aBoolean266) {
			Static565.method7967();
		}
	}

	@OriginalMember(owner = "client!paa", name = "a", descriptor = "(IIB)Z")
	public static boolean method6916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (arg0 & 0x34) != 0;
	}
}
