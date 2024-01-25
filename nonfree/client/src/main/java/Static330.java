import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static330 {

	@OriginalMember(owner = "client!sq", name = "r", descriptor = "Lclient!fc;")
	public static Class71 aClass71_79;

	@OriginalMember(owner = "client!sq", name = "h", descriptor = "Lclient!cs;")
	public static final Class41 aClass41_173 = new Class41(20, 8);

	@OriginalMember(owner = "client!sq", name = "p", descriptor = "Z")
	public static boolean aBoolean447 = false;

	@OriginalMember(owner = "client!sq", name = "t", descriptor = "Lclient!fn;")
	public static final Class77 aClass77_149 = new Class77(67, 0);

	@OriginalMember(owner = "client!sq", name = "u", descriptor = "[I")
	public static final int[] anIntArray704 = new int[250];

	@OriginalMember(owner = "client!sq", name = "a", descriptor = "(IBI)V")
	public static void method5067(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		@Pc(12) Class2_Sub1_Sub2 local12 = Static323.method4982(arg1, 16);
		local12.method410();
		local12.anInt348 = arg0;
	}
}
