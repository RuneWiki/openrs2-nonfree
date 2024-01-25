import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static47 {

	@OriginalMember(owner = "client!bka", name = "t", descriptor = "[[I")
	public static int[][] anIntArrayArray8;

	@OriginalMember(owner = "client!bka", name = "g", descriptor = "I")
	public static int anInt779;

	@OriginalMember(owner = "client!bka", name = "r", descriptor = "[I")
	public static int[] anIntArray50;

	@OriginalMember(owner = "client!bka", name = "o", descriptor = "I")
	public static int anInt784 = 0;

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(IIB)Z")
	public static boolean method798(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static317.method5020(arg0, arg1) & (Static238.method3986(arg1, arg0) | (arg1 & 0x2000) != 0 | Static218.method3766(arg1, arg0));
	}

	@OriginalMember(owner = "client!bka", name = "b", descriptor = "(Z)V")
	public static void method799() {
		Static258.anInt4846 = 0;
		for (@Pc(14) int local14 = 0; local14 < 2048; local14++) {
			Static260.aClass14_Sub21Array1[local14] = null;
			Static98.aByteArray25[local14] = 1;
			Static671.aClass245Array1[local14] = null;
		}
	}

	@OriginalMember(owner = "client!bka", name = "a", descriptor = "(Lclient!jc;I)Lclient!je;")
	public static Class184 method800(@OriginalArg(0) Class14_Sub21 arg0) {
		@Pc(7) Class184 local7 = new Class184();
		local7.anInt5127 = arg0.method7717(-1978450544);
		local7.aClass14_Sub2_Sub8_1 = Static592.aClass46_2.method897(local7.anInt5127);
		return local7;
	}
}
