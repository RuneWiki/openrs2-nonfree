import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static128 {

	@OriginalMember(owner = "client!ge", name = "h", descriptor = "Lclient!qu;")
	public static final Class208 aClass208_28 = new Class208(9, 0);

	@OriginalMember(owner = "client!ge", name = "k", descriptor = "Lclient!bi;")
	public static final Class25 aClass25_61 = new Class25(60, -2);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
	public static void method2035(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(14) Class226 local14 = Static57.aClass226ArrayArray1[arg2][arg0];
		Static142.method2199(local14 == null ? Static433.aClass226_2 : local14, arg1);
	}
}
