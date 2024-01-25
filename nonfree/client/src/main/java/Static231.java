import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static231 {

	@OriginalMember(owner = "client!lb", name = "L", descriptor = "I")
	public static int anInt3827 = 0;

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZIIII)V")
	public static void method3025(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(17) Class5_Sub2_Sub9 local17 = Static72.method1073(8, arg2);
		local17.method3026();
		local17.anInt3818 = arg1;
		local17.anInt3826 = arg0;
		local17.anInt3821 = arg3;
	}
}
