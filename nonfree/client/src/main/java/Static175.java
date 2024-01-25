import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static175 {

	@OriginalMember(owner = "client!it", name = "l", descriptor = "I")
	public static int anInt3393;

	@OriginalMember(owner = "client!it", name = "q", descriptor = "[I")
	public static int[] anIntArray222;

	@OriginalMember(owner = "client!it", name = "a", descriptor = "[Lclient!sd;")
	public static final Class213[] aClass213Array1 = new Class213[4];

	@OriginalMember(owner = "client!it", name = "g", descriptor = "Lclient!ho;")
	public static final Class98 aClass98_7 = new Class98(4, 1, 1, 1);

	@OriginalMember(owner = "client!it", name = "r", descriptor = "I")
	public static int anInt3398 = 0;

	@OriginalMember(owner = "client!it", name = "s", descriptor = "I")
	public static int anInt3399 = 0;

	@OriginalMember(owner = "client!it", name = "b", descriptor = "(I)V")
	public static void method2833() {
		Static57.aClass19_7.method4257(Static231.aFloat138, Static54.aFloat31, Static374.aFloat194);
	}

	@OriginalMember(owner = "client!it", name = "a", descriptor = "(IZI)Lclient!jh;")
	public static Class4_Sub25 method2834(@OriginalArg(1) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(17) long local17 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class4_Sub25) Static208.aClass102_11.method2700(local17);
	}
}
