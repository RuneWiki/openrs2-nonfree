import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static670 {

	@OriginalMember(owner = "client!vb", name = "g", descriptor = "Ljava/lang/Object;")
	public static Object anObject23;

	@OriginalMember(owner = "client!vb", name = "i", descriptor = "Lclient!qaa;")
	public static Class298 aClass298_1 = new Class298(8);

	@OriginalMember(owner = "client!vb", name = "e", descriptor = "[Z")
	public static final boolean[] aBooleanArray29 = new boolean[8];

	@OriginalMember(owner = "client!vb", name = "d", descriptor = "Lclient!si;")
	public static final Class338 aClass338_61 = new Class338(4);

	@OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIII)V")
	public static void method8880(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(5) int arg4) {
		@Pc(10) int local10 = arg0 + 1;
		Static482.method7040(arg2, arg4, Static384.anIntArrayArray38[arg0], arg3);
		@Pc(19) int local19 = arg1 - 1;
		Static482.method7040(arg2, arg4, Static384.anIntArrayArray38[arg1], arg3);
		for (@Pc(32) int local32 = local10; local32 <= local19; local32++) {
			@Pc(38) int[] local38 = Static384.anIntArrayArray38[local32];
			local38[arg4] = local38[arg3] = arg2;
		}
	}
}
