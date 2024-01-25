import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!lj", name = "u", descriptor = "Lclient!bw;")
	public static Class31 aClass31_2;

	@OriginalMember(owner = "client!lj", name = "y", descriptor = "I")
	public static int anInt4205;

	@OriginalMember(owner = "client!lj", name = "F", descriptor = "[I")
	public static int[] anIntArray340;

	@OriginalMember(owner = "client!lj", name = "L", descriptor = "[[I")
	public static final int[][] anIntArrayArray35 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZII)Z")
	public static boolean method3192(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg0 & 0x800) != 0;
	}

	@OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
	public static void method3193(@OriginalArg(0) int arg0) {
		@Pc(8) Class4_Sub1_Sub8 local8 = Static416.method5456(arg0, 10);
		local8.method2761();
	}
}
