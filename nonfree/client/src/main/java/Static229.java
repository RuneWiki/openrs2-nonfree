import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static229 {

	@OriginalMember(owner = "client!ic", name = "ic", descriptor = "I")
	public static int anInt4546;

	@OriginalMember(owner = "client!ic", name = "Qb", descriptor = "Z")
	public static boolean aBoolean323 = false;

	@OriginalMember(owner = "client!ic", name = "Sb", descriptor = "I")
	public static int anInt4538 = 0;

	@OriginalMember(owner = "client!ic", name = "Dc", descriptor = "I")
	public static int anInt4561 = -1;

	@OriginalMember(owner = "client!ic", name = "b", descriptor = "(III)V")
	public static void method3933(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		@Pc(13) Class6_Sub2_Sub9 local13 = Static144.method2332(5, arg1);
		local13.method3723();
		local13.anInt4294 = arg0;
	}
}
