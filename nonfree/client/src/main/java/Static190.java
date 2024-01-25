import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static190 {

	@OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
	public static int anInt3764 = 1;

	@OriginalMember(owner = "client!hga", name = "a", descriptor = "(IIBLclient!dg;)V")
	public static void method3298(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) Class2_Sub2_Sub1_Sub1 arg2) {
		@Pc(14) int[] local14 = new int[4];
		Static602.method4663(local14, 0, local14.length, arg1);
		Static36.method1098(local14, arg2, arg0);
	}
}
