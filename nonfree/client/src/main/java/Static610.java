import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static610 {

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "[I")
	public static final int[] anIntArray603 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

	@OriginalMember(owner = "client!vr", name = "l", descriptor = "Z")
	public static boolean aBoolean739 = false;

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(III)V")
	public static void method8301(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(12) Class8_Sub5_Sub8 local12 = Static509.method7344(12, arg0);
		local12.method3509();
		local12.anInt4321 = arg1;
	}
}
