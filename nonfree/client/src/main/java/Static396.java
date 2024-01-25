import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static396 {

	@OriginalMember(owner = "client!qi", name = "Lb", descriptor = "Lclient!kca;")
	public static Class157 aClass157_2;

	@OriginalMember(owner = "client!qi", name = "Rb", descriptor = "F")
	public static float aFloat205;

	@OriginalMember(owner = "client!qi", name = "T", descriptor = "Lclient!gl;")
	public static Class101 aClass101_1 = new Class101();

	@OriginalMember(owner = "client!qi", name = "Bb", descriptor = "I")
	public static int anInt7539 = 0;

	@OriginalMember(owner = "client!qi", name = "a", descriptor = "(Lclient!uf;Ljava/awt/Frame;I)V")
	public static void method6325(@OriginalArg(0) Class283 arg0, @OriginalArg(1) Frame arg1) {
		while (true) {
			@Pc(10) Class20 local10 = arg0.method7160(arg1);
			while (local10.anInt593 == 0) {
				Static379.method5233(10L);
			}
			if (local10.anInt593 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static379.method5233(100L);
		}
	}
}
