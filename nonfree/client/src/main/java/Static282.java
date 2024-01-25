import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static282 {

	@OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
	public static int anInt4677;

	@OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
	public static int anInt4679 = 765;

	@OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIII)V")
	public static void method4032(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(8) Class6_Sub1_Sub5 local8 = Static77.method1176(arg1, 9);
		local8.method776();
		local8.anInt972 = arg2;
		local8.anInt974 = arg0;
	}
}
