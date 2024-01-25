import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static36 {

	@OriginalMember(owner = "client!bb", name = "b", descriptor = "Lclient!tda;")
	public static final Class349 aClass349_11 = new Class349(50, 3);

	@OriginalMember(owner = "client!bb", name = "c", descriptor = "[I")
	public static final int[] anIntArray48 = new int[32];

	@OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)V")
	public static void method512(@OriginalArg(0) int arg0) {
		@Pc(16) Class2_Sub6_Sub12 local16 = Static636.method8647(16, (long) arg0);
		local16.method6245();
	}
}
