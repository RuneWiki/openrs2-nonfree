import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static553 {

	@OriginalMember(owner = "client!vc", name = "h", descriptor = "I")
	public static int anInt8886;

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray47 = new String[100];

	@OriginalMember(owner = "client!vc", name = "c", descriptor = "Lclient!qfa;")
	public static final Class272 aClass272_262 = new Class272(115, 6);

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!lk;III)V")
	public static void method7388(@OriginalArg(0) Class203 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		Static400.anInt6817 = arg1;
		Static372.anInt6335 = arg2;
		Static87.aClass203_34 = arg0;
	}

	@OriginalMember(owner = "client!vc", name = "a", descriptor = "(Lclient!n;BLjava/awt/Frame;)V")
	public static void method7390(@OriginalArg(0) Class221 arg0, @OriginalArg(2) Frame arg1) {
		while (true) {
			@Pc(6) Class192 local6 = arg0.method5196(arg1);
			while (local6.anInt5186 == 0) {
				Static374.method5521(10L);
			}
			if (local6.anInt5186 == 1) {
				arg1.setVisible(false);
				arg1.dispose();
				return;
			}
			Static374.method5521(100L);
		}
	}
}
