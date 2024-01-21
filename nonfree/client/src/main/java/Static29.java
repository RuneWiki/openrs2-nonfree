import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static29 {

	@OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
	public static int anInt907;

	@OriginalMember(owner = "client!dd", name = "h", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame1;

	@OriginalMember(owner = "client!dd", name = "p", descriptor = "Z")
	public static boolean aBoolean49 = false;

	@OriginalMember(owner = "client!dd", name = "t", descriptor = "Lclient!eh;")
	public static Class28 aClass28_304 = Static170.method3101("<col=ff9040>");

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
	public static void method749() {
		aFrame1 = null;
		aClass28_304 = null;
	}

	@OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lclient!hd;I)V")
	public static void method750(@OriginalArg(0) Class3_Sub8 arg0) {
		if (Static110.aClass19_3 != null) {
			try {
				Static110.aClass19_3.method754(0L);
				Static110.aClass19_3.method751(arg0.aByteArray19, arg0.anInt1948, 24);
			} catch (@Pc(22) Exception local22) {
			}
		}
		arg0.anInt1948 += 24;
	}
}
