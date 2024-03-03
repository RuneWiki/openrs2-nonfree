import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!bp", name = "s", descriptor = "[I")
	public static int[] anIntArray38;

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZI)V", line = 3)
	public static void method944() {
		@Pc(5) Class98 local5 = Class68.aClass98_9;
		synchronized (Class68.aClass98_9) {
			Class68.aClass98_9.method2617(5);
		}
		local5 = Class230.aClass98_58;
		synchronized (Class230.aClass98_58) {
			Class230.aClass98_58.method2617(5);
		}
	}

	@OriginalMember(owner = "client!bp", name = "a", descriptor = "(ZLjava/awt/Component;I)Lclient!lh;", line = 137)
	public static Class119 method948(@OriginalArg(1) Component arg0) {
		return new Class119_Sub1(arg0, true);
	}
}
