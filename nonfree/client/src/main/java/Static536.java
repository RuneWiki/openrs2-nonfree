import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static536 {

	@OriginalMember(owner = "client!uk", name = "c", descriptor = "[[[I")
	public static int[][][] anIntArrayArrayArray22;

	@OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
	public static int anInt9062 = 1;

	@OriginalMember(owner = "client!uk", name = "a", descriptor = "(IIB)V")
	public static void method7439(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(10) Class4_Sub7_Sub5 local10 = Static218.method3780(7, arg1);
		local10.method3066();
		local10.anInt3348 = arg0;
	}
}
