import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static367 {

	@OriginalMember(owner = "client!nc", name = "l", descriptor = "Z")
	public static boolean aBoolean487;

	@OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
	public static int anInt6583;

	@OriginalMember(owner = "client!nc", name = "h", descriptor = "Lclient!qe;")
	public static final Class274 aClass274_106 = new Class274(103, 0);

	@OriginalMember(owner = "client!nc", name = "j", descriptor = "Lclient!qaa;")
	public static final Class269 aClass269_66 = new Class269(65, 8);

	@OriginalMember(owner = "client!nc", name = "a", descriptor = "(IZIILclient!lda;Lclient!lda;Z)I")
	public static int method5562(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class202_Sub1 arg3, @OriginalArg(5) Class202_Sub1 arg4, @OriginalArg(6) boolean arg5) {
		@Pc(15) int local15 = Static104.method1768(arg3, arg4, arg2, arg5);
		if (local15 != 0) {
			return arg5 ? -local15 : local15;
		} else if (arg1 == -1) {
			return 0;
		} else {
			@Pc(39) int local39 = Static104.method1768(arg3, arg4, arg1, arg0);
			return arg0 ? -local39 : local39;
		}
	}
}
