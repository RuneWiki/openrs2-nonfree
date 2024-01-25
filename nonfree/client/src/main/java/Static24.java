import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "[I")
	public static final int[] anIntArray30 = new int[14];

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(III)V")
	public static void method963(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class8_Sub5_Sub8 local12 = Static509.method7344(7, arg1);
		local12.method3509();
		local12.anInt4321 = arg0;
	}
}
