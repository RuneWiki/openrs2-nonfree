import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ea", name = "q", descriptor = "[[[B")
	public static byte[][][] aByteArrayArrayArray3;

	@OriginalMember(owner = "client!ea", name = "u", descriptor = "Lclient!jj;")
	public static Class98 aClass98_5;

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;)V")
	public static void method1501(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) String arg3, @OriginalArg(5) String arg4) {
		Static320.method5406(-1, arg4, arg3, arg1, arg0, arg2, null);
	}

	@OriginalMember(owner = "client!ea", name = "a", descriptor = "(Ljava/awt/Canvas;B)Lclient!ve;")
	public static Class56 method1502(@OriginalArg(0) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class56_Sub2");
			@Pc(15) Class56 local15 = (Class56) local11.getDeclaredConstructor().newInstance();
			local15.method2990(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class56_Sub1 local26 = new Class56_Sub1();
			local26.method2990(arg0);
			return local26;
		}
	}
}
