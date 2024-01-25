import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static511 {

	@OriginalMember(owner = "client!saa", name = "f", descriptor = "Lclient!wf;")
	public static Class374 aClass374_3;

	@OriginalMember(owner = "client!saa", name = "m", descriptor = "I")
	public static int anInt8817;

	@OriginalMember(owner = "client!saa", name = "a", descriptor = "(IILjava/awt/Canvas;B)Lclient!nca;")
	public static Class6_Sub19 method7318(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Canvas arg2) {
		try {
			@Pc(6) Class local6 = Class.forName("Class6_Sub19_Sub2");
			@Pc(10) Class6_Sub19 local10 = (Class6_Sub19) local6.getDeclaredConstructor().newInstance();
			local10.method7659(arg0, arg1, arg2);
			return local10;
		} catch (@Pc(24) Throwable local24) {
			@Pc(28) Class6_Sub19_Sub1 local28 = new Class6_Sub19_Sub1();
			local28.method7659(arg0, arg1, arg2);
			return local28;
		}
	}
}
