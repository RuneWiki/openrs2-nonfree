import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static441 {

	@OriginalMember(owner = "client!we", name = "G", descriptor = "Lclient!ic;")
	public static Class113 aClass113_132;

	@OriginalMember(owner = "client!we", name = "K", descriptor = "I")
	public static int anInt7348;

	@OriginalMember(owner = "client!we", name = "M", descriptor = "F")
	public static float aFloat99;

	@OriginalMember(owner = "client!we", name = "a", descriptor = "(ZLjava/awt/Canvas;)Lclient!ab;")
	public static Class1_Sub2 method5548(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(6) Class local6 = Class.forName("Class1_Sub2_Sub2");
			@Pc(10) Class1_Sub2 local10 = (Class1_Sub2) local6.getDeclaredConstructor().newInstance();
			local10.method5565(arg0);
			return local10;
		} catch (@Pc(17) Throwable local17) {
			@Pc(21) Class1_Sub2_Sub1 local21 = new Class1_Sub2_Sub1();
			local21.method5565(arg0);
			return local21;
		}
	}
}
