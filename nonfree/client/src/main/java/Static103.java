import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static103 {

	@OriginalMember(owner = "client!eca", name = "Gc", descriptor = "Lclient!fo;")
	public static Class94 aClass94_1;

	@OriginalMember(owner = "client!eca", name = "Fc", descriptor = "Lclient!hp;")
	public static final Class125 aClass125_14 = new Class125(4);

	@OriginalMember(owner = "client!eca", name = "Hc", descriptor = "I")
	public static int anInt2281 = 0;

	@OriginalMember(owner = "client!eca", name = "ed", descriptor = "[Lclient!gea;")
	public static final Class3_Sub10_Sub6[] aClass3_Sub10_Sub6Array3 = new Class3_Sub10_Sub6[14];

	@OriginalMember(owner = "client!eca", name = "Dd", descriptor = "[I")
	public static final int[] anIntArray242 = new int[1000];

	@OriginalMember(owner = "client!eca", name = "a", descriptor = "(II)I")
	public static int method2046(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static63.anIntArrayArray20 == null ? 0 : Static63.anIntArrayArray20[arg0][arg1] & 0xFFFFFF;
	}

	@OriginalMember(owner = "client!eca", name = "b", descriptor = "(Z)V")
	public static void method2054() {
		if (Static121.aClass5_7 == null) {
			return;
		}
		Static210.aClass90_9.method2324();
		Static460.method3562();
		Static370.method5843();
		Static484.method7143();
		Static288.method4871();
		Static402.method7152();
		if (Static87.aClass178_1 != null) {
			Static87.aClass178_1.method4790();
		}
		Static465.method6937();
		Static130.method2265();
		Static277.method4787();
		Static308.method5029(false);
		Static397.method6050();
		for (@Pc(42) int local42 = 0; local42 < 2048; local42++) {
			@Pc(48) Class6_Sub1_Sub2_Sub1 local48 = Static498.aClass6_Sub1_Sub2_Sub1Array1[local42];
			if (local48 != null) {
				local48.aClass3_Sub38_3 = null;
				for (@Pc(55) int local55 = 0; local55 < local48.aClass2Array3.length; local55++) {
					local48.aClass2Array3[local55] = null;
				}
			}
		}
		for (@Pc(80) int local80 = 0; local80 < Static183.anInt5938; local80++) {
			@Pc(87) Class6_Sub1_Sub2_Sub2 local87 = Static47.aClass3_Sub3Array4[local80].aClass6_Sub1_Sub2_Sub2_1;
			if (local87 != null) {
				for (@Pc(91) int local91 = 0; local91 < local87.aClass2Array3.length; local91++) {
					local87.aClass2Array3[local91] = null;
				}
			}
		}
		Static181.aClass205_5 = null;
		Static131.aClass205_3 = null;
		Static121.aClass5_7.method7437();
		Static121.aClass5_7 = null;
	}
}
