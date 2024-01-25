import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static416 {

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "D")
	public static double aDouble38;

	@OriginalMember(owner = "client!ot", name = "e", descriptor = "Lclient!jm;")
	public static Class2_Sub2_Sub11 aClass2_Sub2_Sub11_1;

	@OriginalMember(owner = "client!ot", name = "h", descriptor = "Lclient!wu;")
	public static Class380 aClass380_99;

	@OriginalMember(owner = "client!ot", name = "j", descriptor = "[I")
	public static int[] anIntArray474;

	@OriginalMember(owner = "client!ot", name = "g", descriptor = "Z")
	public static boolean aBoolean461 = false;

	@OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lclient!wu;III)Lclient!oq;")
	public static Class256 method5569(@OriginalArg(0) Class380 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method8620(arg1, 0);
		return local9 == null ? null : new Class256(local9);
	}
}
