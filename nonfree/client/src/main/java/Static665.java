import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static665 {

	@OriginalMember(owner = "client!wc", name = "q", descriptor = "I")
	public static int anInt10253;

	@OriginalMember(owner = "client!wc", name = "u", descriptor = "Lclient!eb;")
	public static Class88 aClass88_1 = new Class88(8);

	@OriginalMember(owner = "client!wc", name = "s", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray45 = new String[200];

	@OriginalMember(owner = "client!wc", name = "t", descriptor = "[Z")
	public static final boolean[] aBooleanArray31 = new boolean[200];

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(Ljava/awt/Frame;ILclient!ft;)V")
	public static void method8842(@OriginalArg(0) Frame arg0, @OriginalArg(2) Class122 arg1) {
		while (true) {
			@Pc(19) Class380 local19 = arg1.method3362(arg0);
			while (local19.anInt10067 == 0) {
				Static255.method4444(10L);
			}
			if (local19.anInt10067 == 1) {
				arg0.setVisible(false);
				arg0.dispose();
				return;
			}
			Static255.method4444(100L);
		}
	}
}
