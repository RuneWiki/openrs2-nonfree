import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static191 {

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "Lclient!uv;")
	public static final Class296 aClass296_170 = new Class296(48, 1);

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "I")
	public static int anInt3394 = 0;

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "Lclient!bv;")
	public static Class37 aClass37_41 = new Class37();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IB)I")
	public static int method2964(@OriginalArg(0) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "(IZI)V")
	public static void method2966(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		@Pc(8) Class1_Sub18 local8 = Static7.method282(arg1, arg0);
		if (local8 != null) {
			local8.method7525();
		}
	}
}
