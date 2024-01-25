import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static215 {

	@OriginalMember(owner = "client!ir", name = "f", descriptor = "[I")
	public static final int[] anIntArray271 = new int[5];

	@OriginalMember(owner = "client!ir", name = "a", descriptor = "(BILjava/lang/String;)V")
	public static void method3762(@OriginalArg(1) int arg0, @OriginalArg(2) String arg1) {
		@Pc(13) Class6_Sub2_Sub7 local13 = Static401.method5861(arg0, 2);
		local13.method2582();
		local13.aString24 = arg1;
	}
}
