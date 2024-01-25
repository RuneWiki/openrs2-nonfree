import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static569 {

	@OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
	public static int anInt9430;

	@OriginalMember(owner = "client!sp", name = "c", descriptor = "[I")
	public static final int[] anIntArray492 = new int[4];

	@OriginalMember(owner = "client!sp", name = "a", descriptor = "(III)V")
	public static void method8142(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(16) Class14_Sub2_Sub9 local16 = Static499.method7527((long) arg0, 16);
		local16.method4004();
		local16.anInt4595 = arg1;
	}
}
