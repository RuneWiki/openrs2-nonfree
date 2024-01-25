import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static267 {

	@OriginalMember(owner = "client!jp", name = "E", descriptor = "Lclient!qe;")
	public static final Class268 aClass268_89 = new Class268(90, -1);

	@OriginalMember(owner = "client!jp", name = "F", descriptor = "I")
	public static int anInt5319 = 0;

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Lclient!ha;I)V")
	public static void method4759(@OriginalArg(0) Class100 arg0) {
		if (Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131 != Static281.anInt5609 && (Static272.aClass97ArrayArrayArray3 != null && Static262.method4657(arg0, Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131))) {
			Static281.anInt5609 = Static210.aClass20_Sub2_Sub2_Sub1_Sub1_1.aByte131;
		}
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "()V")
	public static void method4761() {
		for (@Pc(1) int local1 = 0; local1 < Static205.anInt4091; local1++) {
			@Pc(6) Class20_Sub2_Sub2 local6 = Static61.aClass20_Sub2_Sub2Array1[local1];
			Static466.method6567(local6, true);
			Static61.aClass20_Sub2_Sub2Array1[local1] = null;
		}
		Static205.anInt4091 = 0;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(Ljava/lang/String;Lclient!rg;Z)I")
	public static int method4762(@OriginalArg(0) String arg0, @OriginalArg(1) Class6_Sub40 arg1) {
		@Pc(6) int local6 = arg1.anInt10169;
		@Pc(10) byte[] local10 = Static627.method8750(arg0);
		arg1.method8612(local10.length);
		arg1.anInt10169 += Static517.aClass169_1.method4855(0, local10.length, arg1.aByteArray113, arg1.anInt10169, local10);
		return arg1.anInt10169 - local6;
	}

	@OriginalMember(owner = "client!jp", name = "a", descriptor = "(ZZ)Z")
	public static boolean method4763(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		return arg0 | arg1;
	}
}
