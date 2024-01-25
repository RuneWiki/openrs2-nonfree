import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static28 {

	@OriginalMember(owner = "client!as", name = "r", descriptor = "I")
	public static int anInt695;

	@OriginalMember(owner = "client!as", name = "x", descriptor = "I")
	public static int anInt699;

	@OriginalMember(owner = "client!as", name = "m", descriptor = "I")
	public static int anInt691 = -1;

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(Ljava/awt/Frame;Lclient!ec;I)V")
	public static void method626(@OriginalArg(0) Frame arg0, @OriginalArg(1) Class92 arg1) {
		while (true) {
			@Pc(14) Class338 local14 = arg1.method1884(arg0);
			while (local14.anInt9321 == 0) {
				Static26.method592(10L);
			}
			if (local14.anInt9321 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static26.method592(100L);
		}
	}

	@OriginalMember(owner = "client!as", name = "a", descriptor = "(ILclient!pp;)V")
	public static void method627(@OriginalArg(1) Class3_Sub12 arg0) {
		if (arg0.aClass3_Sub39_6 != null) {
			arg0.aClass3_Sub39_6.anInt7566 = 0;
		}
		arg0.aBoolean751 = false;
		for (@Pc(23) Class3_Sub12 local23 = arg0.method8946(); local23 != null; local23 = arg0.method8945()) {
			method627(local23);
		}
	}
}
