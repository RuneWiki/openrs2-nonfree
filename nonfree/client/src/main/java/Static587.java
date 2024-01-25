import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static587 {

	@OriginalMember(owner = "client!wh", name = "i", descriptor = "I")
	public static int anInt2342 = 0;

	@OriginalMember(owner = "client!wh", name = "a", descriptor = "(IBIII)V")
	public static void method2114(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(16) Class4_Sub7_Sub5 local16 = Static218.method3780(8, arg3);
		local16.method3066();
		local16.anInt3351 = arg2;
		local16.anInt3348 = arg1;
		local16.anInt3353 = arg0;
	}
}
