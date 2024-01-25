import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static196 {

	@OriginalMember(owner = "client!mo", name = "n", descriptor = "[I")
	public static final int[] anIntArray361 = new int[128];

	@OriginalMember(owner = "client!mo", name = "o", descriptor = "I")
	public static final int anInt4219 = 50;

	@OriginalMember(owner = "client!mo", name = "q", descriptor = "[I")
	public static final int[] anIntArray362 = new int[50];

	@OriginalMember(owner = "client!mo", name = "t", descriptor = "Ljava/lang/String;")
	public static String aString147 = "Connecting to update server";

	@OriginalMember(owner = "client!mo", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!up;")
	public static Class94 method3543(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class94_Sub2");
			@Pc(15) Class94 local15 = (Class94) local11.getDeclaredConstructor().newInstance();
			local15.method5464(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class94_Sub1 local26 = new Class94_Sub1();
			local26.method5464(arg0);
			return local26;
		}
	}

	@OriginalMember(owner = "client!mo", name = "b", descriptor = "(B)V")
	public static void method3545() {
		Static256.aClass154_80.method4219();
	}
}
