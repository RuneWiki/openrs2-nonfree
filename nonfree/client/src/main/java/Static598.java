import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static598 {

	@OriginalMember(owner = "client!vfa", name = "h", descriptor = "Lclient!mu;")
	public static final Class215 aClass215_241 = new Class215(14, 2);

	@OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IIIB)V")
	public static void method8788(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(9) Class41 local9 = Static571.aClass41ArrayArray1[arg1][arg2];
		Static418.method6755(arg0, local9 == null ? Static588.aClass41_2 : local9);
	}
}
