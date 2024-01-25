import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static363 {

	@OriginalMember(owner = "client!nw", name = "e", descriptor = "J")
	public static long aLong187;

	@OriginalMember(owner = "client!nw", name = "b", descriptor = "[I")
	public static final int[] anIntArray390 = new int[2];

	@OriginalMember(owner = "client!nw", name = "d", descriptor = "Lclient!so;")
	public static Class4_Sub46 aClass4_Sub46_2 = null;

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "()V")
	public static void method5476() {
		for (@Pc(1) int local1 = 0; local1 < Static574.aClass180Array1.length; local1++) {
			Static574.aClass180Array1[local1].method4446();
		}
		Static574.aClass180Array1 = null;
	}

	@OriginalMember(owner = "client!nw", name = "a", descriptor = "(III)Z")
	public static boolean method5477(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return (Static345.method5260(arg1, arg0) | Static305.method4819(arg1, arg0) | Static195.method6871(arg1, arg0)) & Static290.method4715(arg0, arg1);
	}
}
