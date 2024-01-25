import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static319 {

	@OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
	public static int anInt5798;

	@OriginalMember(owner = "client!mp", name = "d", descriptor = "Lclient!ta;")
	public static Class92 aClass92_11;

	@OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
	public static int[] anIntArray434 = new int[2];

	@OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lclient!ji;B)Lclient!qg;")
	public static Class230_Sub1 method4961(@OriginalArg(0) Class6_Sub21 arg0) {
		@Pc(7) Class230 local7 = Static175.method3224(arg0);
		@Pc(11) int local11 = arg0.method6043();
		return new Class230_Sub1(local7.anInt7385, local7.aClass319_13, local7.aClass247_13, local7.anInt7384, local7.anInt7381, local11);
	}
}
