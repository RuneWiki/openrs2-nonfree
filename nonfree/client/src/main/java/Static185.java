import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static185 {

	@OriginalMember(owner = "client!gb", name = "j", descriptor = "Lclient!hp;")
	public static Class5_Sub21 aClass5_Sub21_1;

	@OriginalMember(owner = "client!gb", name = "g", descriptor = "Lclient!wia;")
	public static final Class387 aClass387_35 = new Class387(60, 2);

	@OriginalMember(owner = "client!gb", name = "o", descriptor = "[I")
	public static int[] anIntArray168 = null;

	@OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILclient!la;I)Lclient!wfa;")
	public static Class5_Sub54 method2697(@OriginalArg(1) Class208 arg0, @OriginalArg(2) int arg1) {
		@Pc(10) byte[] local10 = arg0.method4997(arg1);
		return local10 == null ? null : new Class5_Sub54(local10);
	}
}
