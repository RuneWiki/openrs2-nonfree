import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static412 {

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
	public static int anInt7312;

	@OriginalMember(owner = "client!nba", name = "c", descriptor = "Lclient!lb;")
	public static Class221 aClass221_119;

	@OriginalMember(owner = "client!nba", name = "b", descriptor = "J")
	public static long aLong247;

	@OriginalMember(owner = "client!nba", name = "f", descriptor = "Lclient!jia;")
	public static final Class186 aClass186_129 = new Class186(12, 2);

	@OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
	public static int anInt7313 = 0;

	@OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method6127(@OriginalArg(1) String arg0) {
		@Pc(6) Class3_Sub48 local6 = Static649.method8732();
		local6.aClass3_Sub28_Sub2_1.method5329(Static504.aClass309_11.anInt8976);
		local6.aClass3_Sub28_Sub2_1.method5282(0);
		@Pc(21) int local21 = local6.aClass3_Sub28_Sub2_1.anInt6241;
		local6.aClass3_Sub28_Sub2_1.method5282(663);
		@Pc(35) int[] local35 = Static707.method9222(local6);
		@Pc(39) int local39 = local6.aClass3_Sub28_Sub2_1.anInt6241;
		local6.aClass3_Sub28_Sub2_1.method5283(arg0);
		local6.aClass3_Sub28_Sub2_1.method5329(Static141.anInt2658);
		local6.aClass3_Sub28_Sub2_1.anInt6241 += 7;
		local6.aClass3_Sub28_Sub2_1.method5320(local6.aClass3_Sub28_Sub2_1.anInt6241, local39, local35);
		local6.aClass3_Sub28_Sub2_1.method5335(local6.aClass3_Sub28_Sub2_1.anInt6241 - local21);
		Static532.aClass400_2.method9223(local6);
		Static89.anInt1480 = 0;
		Static556.anInt9262 = 1;
		Static605.anInt9840 = -3;
		Static209.anInt3622 = 0;
	}
}
