import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static323 {

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
	public static int anInt4857;

	@OriginalMember(owner = "client!ui", name = "e", descriptor = "Lclient!kg;")
	public static Class112 aClass112_13 = null;

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ct;BII)Lclient!hi;")
	public static Class80 method4438(@OriginalArg(0) Class30 arg0, @OriginalArg(3) int arg1) {
		@Pc(9) byte[] local9 = arg0.method1161(0, arg1);
		return local9 == null ? null : new Class80(local9);
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!on;")
	public static Class60 method4446(@OriginalArg(0) Component arg0) {
		return new Class60_Sub1(arg0);
	}
}
