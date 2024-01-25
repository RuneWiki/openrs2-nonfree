import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static618 {

	@OriginalMember(owner = "client!wc", name = "B", descriptor = "D")
	public static double aDouble29;

	@OriginalMember(owner = "client!wc", name = "F", descriptor = "I")
	public static int anInt10390;

	@OriginalMember(owner = "client!wc", name = "z", descriptor = "Lclient!uh;")
	public static final Class342 aClass342_6 = new Class342();

	@OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
	public static int anInt10388 = 13156520;

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!gh;Ljava/awt/Frame;)V")
	public static void method8387(@OriginalArg(1) Class118 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(10) Class301 local10 = arg0.method3405(arg1);
			while (local10.anInt8915 == 0) {
				Static214.method4061(10L);
			}
			if (local10.anInt8915 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static214.method4061(100L);
		}
	}
}
