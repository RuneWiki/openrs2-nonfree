import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static201 {

	@OriginalMember(owner = "client!hba", name = "b", descriptor = "I")
	public static int anInt4635;

	@OriginalMember(owner = "client!hba", name = "d", descriptor = "Lclient!sk;")
	public static Class317 aClass317_2;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "I")
	public static int anInt4634 = 0;

	@OriginalMember(owner = "client!hba", name = "e", descriptor = "I")
	public static int anInt4637 = 0;

	@OriginalMember(owner = "client!hba", name = "a", descriptor = "(Lclient!ke;IBI)V")
	public static void method4058(@OriginalArg(0) Class3_Sub1_Sub3_Sub3_Sub2 arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2) {
		@Pc(11) int[] local11 = new int[4];
		Static653.method7725(local11, 0, local11.length, arg1);
		Static506.method7810(local11, arg2, arg0);
	}
}
