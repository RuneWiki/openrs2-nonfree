import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static521 {

	@OriginalMember(owner = "client!sm", name = "i", descriptor = "I")
	public static int anInt9499;

	@OriginalMember(owner = "client!sm", name = "q", descriptor = "[I")
	public static int[] anIntArray617 = new int[1];

	@OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)V")
	public static void method7895(@OriginalArg(1) int arg0) {
		@Pc(13) Class2_Sub6_Sub6 local13 = Static139.method3119(arg0, 1);
		local13.method3093();
	}
}
