import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static596 {

	@OriginalMember(owner = "client!uda", name = "l", descriptor = "Lclient!eu;")
	public static Class98 aClass98_1;

	@OriginalMember(owner = "client!uda", name = "m", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray76;

	@OriginalMember(owner = "client!uda", name = "n", descriptor = "[Lclient!pda;")
	public static Class277[] aClass277Array1;

	@OriginalMember(owner = "client!uda", name = "a", descriptor = "(JI)V")
	public static void method8960(@OriginalArg(0) long arg0) {
		if (Static193.aClass291ArrayArrayArray2 != null) {
			if (Static484.anInt8685 == 1 || Static484.anInt8685 == 5) {
				Static375.method5845(arg0);
			} else if (Static484.anInt8685 == 4) {
				Static225.method4156(arg0);
			}
		}
		Static498.method7844((long) Static62.anInt1184, Static607.aClass101_15);
		if (Static567.anInt9844 != -1) {
			Static254.method4443(Static567.anInt9844);
		}
		for (@Pc(38) int local38 = 0; local38 < Static254.anInt4901; local38++) {
			if (Static561.aBooleanArray58[local38]) {
				Static531.aBooleanArray54[local38] = true;
			}
			Static520.aBooleanArray52[local38] = Static561.aBooleanArray58[local38];
			Static561.aBooleanArray58[local38] = false;
		}
		Static317.anInt7576 = Static62.anInt1184;
		Static76.method1365(-1, (Class357) null, -1);
		Static500.method7872(-1, (Class357) null, -1);
		if (Static567.anInt9844 != -1) {
			Static254.anInt4901 = 0;
			Static9.method139();
		}
		Static607.aClass101_15.la();
		Static369.method9408(Static607.aClass101_15);
		@Pc(98) int local98 = Static470.method4887();
		if (local98 == -1) {
			local98 = Static113.anInt2045;
		}
		if (local98 == -1) {
			local98 = Static303.anInt5522;
		}
		Static626.method9302(local98);
		@Pc(117) int local117 = Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.method3690() << 8;
		Static318.method5258(local117 + Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11024, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.aByte142, Static211.aClass15_Sub3_Sub3_Sub1_Sub1_2.anInt11022 + local117, Static87.anInt1634);
		Static87.anInt1634 = 0;
	}
}
