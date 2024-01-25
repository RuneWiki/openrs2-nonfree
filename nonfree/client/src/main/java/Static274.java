import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static274 {

	@OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
	public static int anInt4913;

	@OriginalMember(owner = "client!kb", name = "i", descriptor = "I")
	public static int anInt4914;

	@OriginalMember(owner = "client!kb", name = "l", descriptor = "Z")
	public static boolean aBoolean371;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "[[I")
	public static final int[][] anIntArrayArray29 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
	public static int anInt4912 = -1;

	@OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4423(@OriginalArg(1) String arg0) {
		@Pc(6) Class5_Sub48 local6 = Static65.method1093();
		local6.aClass5_Sub22_Sub1_2.method5905(Static374.aClass293_14.anInt7773);
		local6.aClass5_Sub22_Sub1_2.method5918(0);
		@Pc(23) int local23 = local6.aClass5_Sub22_Sub1_2.anInt6629;
		local6.aClass5_Sub22_Sub1_2.method5918(635);
		@Pc(34) int[] local34 = Static263.method4273(local6);
		@Pc(38) int local38 = local6.aClass5_Sub22_Sub1_2.anInt6629;
		local6.aClass5_Sub22_Sub1_2.method5910(arg0);
		local6.aClass5_Sub22_Sub1_2.method5905(Static266.anInt4796);
		local6.aClass5_Sub22_Sub1_2.anInt6629 += 7;
		local6.aClass5_Sub22_Sub1_2.method5919(local6.aClass5_Sub22_Sub1_2.anInt6629, local38, local34);
		local6.aClass5_Sub22_Sub1_2.method5952(local6.aClass5_Sub22_Sub1_2.anInt6629 - local23);
		Static277.method4436(local6);
		Static275.anInt4921 = 0;
		Static199.anInt3910 = 1;
		Static581.anInt9774 = -3;
		Static36.anInt573 = 0;
	}
}
