import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static505 {

	@OriginalMember(owner = "client!te", name = "e", descriptor = "I")
	public static int anInt8442;

	@OriginalMember(owner = "client!te", name = "a", descriptor = "[[[I")
	public static final int[][][] anIntArrayArrayArray18 = new int[2][][];

	@OriginalMember(owner = "client!te", name = "b", descriptor = "[I")
	public static final int[] anIntArray579 = new int[32];

	@OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V")
	public static void method7001(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(8) Class1_Sub3_Sub1 local8 = Static374.method5445(1, arg0);
		local8.method491();
		local8.anInt548 = arg1;
	}
}
