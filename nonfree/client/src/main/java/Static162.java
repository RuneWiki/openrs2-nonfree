import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static162 {

	@OriginalMember(owner = "client!pd", name = "u", descriptor = "F")
	public static float aFloat4;

	@OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
	public static int anInt3362;

	@OriginalMember(owner = "client!pd", name = "y", descriptor = "Lclient!hh;")
	private static Class50 aClass50_1086 = Static186.method3527("Ok");

	@OriginalMember(owner = "client!pd", name = "A", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1087 = aClass50_1086;

	@OriginalMember(owner = "client!pd", name = "D", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1088 = null;

	@OriginalMember(owner = "client!pd", name = "I", descriptor = "Lclient!hh;")
	public static Class50 aClass50_1089 = Static186.method3527("(Y<)4col>");

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
	public static void method2709(@OriginalArg(0) Component arg0) {
		arg0.addMouseListener(Static158.aClass22_1);
		arg0.addMouseMotionListener(Static158.aClass22_1);
		arg0.addFocusListener(Static158.aClass22_1);
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(IZ)Lclient!se;")
	public static Class105 method2710(@OriginalArg(0) int arg0) {
		@Pc(10) Class105 local10 = (Class105) Static166.aClass84_29.method2579((long) arg0);
		if (local10 != null) {
			return local10;
		}
		@Pc(24) byte[] local24 = Static222.aClass86_82.method3325(Static43.method678(arg0), Static43.method680(arg0));
		local10 = new Class105();
		local10.anInt3917 = arg0;
		if (local24 != null) {
			local10.method3128(new Class1_Sub17(local24));
		}
		local10.method3132();
		Static166.aClass84_29.method2582(local10, (long) arg0);
		return local10;
	}

	@OriginalMember(owner = "client!pd", name = "a", descriptor = "(ZI)I")
	public static int method2711(@OriginalArg(1) int arg0) {
		return arg0 >>> 8;
	}
}
