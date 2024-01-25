import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static157 {

	@OriginalMember(owner = "client!fga", name = "h", descriptor = "Z")
	public static boolean aBoolean213;

	@OriginalMember(owner = "client!fga", name = "c", descriptor = "Lclient!lja;")
	public static final Class216 aClass216_58 = new Class216(9, 3);

	@OriginalMember(owner = "client!fga", name = "e", descriptor = "[I")
	public static final int[] anIntArray207 = new int[32];

	@OriginalMember(owner = "client!fga", name = "j", descriptor = "Lclient!hj;")
	public static final Class151 aClass151_65 = new Class151(38, -1);

	@OriginalMember(owner = "client!fga", name = "a", descriptor = "(ZII)V")
	public static void method2711(@OriginalArg(0) boolean arg0, @OriginalArg(1) int arg1) {
		@Pc(13) Class4_Sub54 local13 = Static473.method6525(arg1, arg0);
		if (local13 != null) {
			local13.method9000();
		}
	}
}
