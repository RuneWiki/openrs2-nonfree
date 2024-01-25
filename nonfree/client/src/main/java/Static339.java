import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static339 {

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "Lclient!cv;")
	public static Class7 aClass7_2;

	@OriginalMember(owner = "client!ms", name = "b", descriptor = "I")
	public static int anInt5844 = 0;

	@OriginalMember(owner = "client!ms", name = "d", descriptor = "Lclient!vg;")
	public static final Class349 aClass349_95 = new Class349(78, -2);

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(ILjava/lang/String;)V")
	public static void method4919(@OriginalArg(1) String arg0) {
		System.exit(1);
	}

	@OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjava/awt/Canvas;)Lclient!nca;")
	public static Class2_Sub24 method4920(@OriginalArg(1) Canvas arg0) {
		try {
			@Pc(11) Class local11 = Class.forName("Class2_Sub24_Sub2");
			@Pc(15) Class2_Sub24 local15 = (Class2_Sub24) local11.getDeclaredConstructor().newInstance();
			local15.method5586(arg0);
			return local15;
		} catch (@Pc(22) Throwable local22) {
			@Pc(26) Class2_Sub24_Sub1 local26 = new Class2_Sub24_Sub1();
			local26.method5586(arg0);
			return local26;
		}
	}
}
