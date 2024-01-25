import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static187 {

	@OriginalMember(owner = "client!gia", name = "b", descriptor = "D")
	public static double aDouble8;

	@OriginalMember(owner = "client!gia", name = "a", descriptor = "(IIIII)V")
	public static void method2944(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class14_Sub3_Sub9 local14 = Static142.method2219((long) arg1 << 32 | (long) arg0, 19);
		local14.method2817();
		local14.anInt3413 = arg2;
		local14.anInt3419 = arg3;
	}
}
