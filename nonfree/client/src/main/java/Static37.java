import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static37 {

	@OriginalMember(owner = "client!bda", name = "c", descriptor = "I")
	public static int anInt617 = 0;

	@OriginalMember(owner = "client!bda", name = "d", descriptor = "Z")
	public static boolean aBoolean43 = true;

	@OriginalMember(owner = "client!bda", name = "a", descriptor = "(IIIIZ)V")
	public static void method539(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(14) Class5_Sub3_Sub17 local14 = Static358.method5408(19, (long) arg0 << 32 | (long) arg2);
		local14.method7286();
		local14.anInt8546 = arg1;
		local14.anInt8549 = arg3;
	}
}
