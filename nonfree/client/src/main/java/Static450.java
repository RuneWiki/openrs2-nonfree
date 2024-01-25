import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static450 {

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!wp", name = "g", descriptor = "Z")
	public static boolean aBoolean499 = false;

	@OriginalMember(owner = "client!wp", name = "a", descriptor = "(Lclient!ou;I)Z")
	public static boolean method5794(@OriginalArg(0) Interface11 arg0) {
		@Pc(10) Class71 local10 = Static2.aClass74_13.method1683(arg0.method5648());
		if (local10.anInt2165 == -1) {
			return true;
		} else {
			@Pc(23) Class70 local23 = Static70.aClass212_6.method4944(local10.anInt2165);
			return local23.anInt2152 == -1 ? true : local23.method1615();
		}
	}
}
