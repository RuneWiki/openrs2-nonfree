import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static329 {

	@OriginalMember(owner = "client!kf", name = "f", descriptor = "I")
	public static int anInt5742 = 0;

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "([JB[I)V")
	public static void method4894(@OriginalArg(0) long[] arg0, @OriginalArg(2) int[] arg1) {
		Static69.method852(0, arg0.length - 1, arg1, arg0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!oba;ZI)V")
	public static void method4895(@OriginalArg(0) int arg0, @OriginalArg(1) Class19_Sub1_Sub3_Sub2_Sub2 arg1, @OriginalArg(3) int arg2) {
		@Pc(6) int[] local6 = new int[4];
		Static735.method9184(local6, 0, local6.length, arg0);
		Static192.method2903(arg1, false, arg2, local6);
	}
}
