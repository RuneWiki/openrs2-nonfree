import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static255 {

	@OriginalMember(owner = "client!jo", name = "F", descriptor = "J")
	public static long aLong136;

	@OriginalMember(owner = "client!jo", name = "B", descriptor = "Lclient!sb;")
	public static final Class298 aClass298_96 = new Class298(44, 3);

	@OriginalMember(owner = "client!jo", name = "C", descriptor = "Z")
	public static boolean aBoolean352 = false;

	@OriginalMember(owner = "client!jo", name = "E", descriptor = "[I")
	public static int[] anIntArray371 = new int[1];

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(Ljava/lang/String;I)V")
	public static void method4085(@OriginalArg(0) String arg0) {
		if (!Static380.aBoolean537 || (Static301.anInt5410 & 0x18) == 0) {
			return;
		}
		@Pc(17) boolean local17 = false;
		@Pc(19) int local19 = Static476.anInt8277;
		@Pc(21) int[] local21 = Static10.anIntArray19;
		for (@Pc(23) int local23 = 0; local23 < local19; local23++) {
			@Pc(31) Class9_Sub1_Sub1_Sub2_Sub2 local31 = Static438.aClass9_Sub1_Sub1_Sub2_Sub2Array2[local21[local23]];
			if (local31.aString94 != null && local31.aString94.equalsIgnoreCase(arg0) && (Static226.aClass9_Sub1_Sub1_Sub2_Sub2_2 == local31 && (Static301.anInt5410 & 0x10) != 0 || local31 != null && (Static301.anInt5410 & 0x8) != 0)) {
				@Pc(64) Class3_Sub34 local64 = Static374.method5522(Static318.aClass298_117, Static220.aClass287_2);
				local64.aClass3_Sub11_Sub1_2.method3132(Static63.anInt1712);
				local64.aClass3_Sub11_Sub1_2.method3130(0);
				local64.aClass3_Sub11_Sub1_2.method3101(Static550.anInt7639);
				local64.aClass3_Sub11_Sub1_2.method3095(local21[local23]);
				local64.aClass3_Sub11_Sub1_2.method3131(Static345.anInt6055);
				Static131.method2572(local64);
				local17 = true;
				Static436.method6152(local31.anIntArray518[0], 0, -2, local31.method5569(), true, 0, local31.anIntArray517[0], local31.method5569());
				break;
			}
		}
		if (!local17) {
			Static118.method2471(Static48.aClass33_23.method797(Static131.anInt2839) + arg0);
		}
		if (Static380.aBoolean537) {
			Static103.method2177();
		}
	}
}
