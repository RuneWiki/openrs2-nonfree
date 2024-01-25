import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static369 {

	@OriginalMember(owner = "client!mia", name = "w", descriptor = "I")
	public static int anInt6462;

	@OriginalMember(owner = "client!mia", name = "e", descriptor = "Lclient!ke;")
	public static final Class196 aClass196_196 = new Class196(110, 7);

	@OriginalMember(owner = "client!mia", name = "a", descriptor = "(IIIII)V")
	public static void method5413(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		@Pc(14) Class5_Sub2_Sub4 local14 = Static257.method3597(10, (long) arg2);
		local14.method2438();
		local14.anInt2751 = arg3;
		local14.anInt2749 = arg1;
		local14.anInt2740 = arg0;
	}
}
