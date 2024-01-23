import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static280 {

	@OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
	public static int anInt5827;

	@OriginalMember(owner = "client!vj", name = "d", descriptor = "F")
	public static float aFloat55;

	@OriginalMember(owner = "client!vj", name = "f", descriptor = "[Lclient!jn;")
	public static Class71[] aClass71Array5;

	@OriginalMember(owner = "client!vj", name = "g", descriptor = "Z")
	public static boolean aBoolean469 = false;

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(IILjava/awt/Component;I)Lclient!jb;")
	public static Class14 method4660(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Component arg2) {
		try {
			@Pc(12) Class local12 = Class.forName("Class14_Sub1");
			@Pc(16) Class14 local16 = (Class14) local12.getDeclaredConstructor().newInstance();
			local16.method1195(arg0, arg2, arg1);
			return local16;
		} catch (@Pc(25) Throwable local25) {
			@Pc(29) Class14_Sub2 local29 = new Class14_Sub2();
			local29.method1195(arg0, arg2, arg1);
			return local29;
		}
	}

	@OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
	public static void method4661() {
		Static108.aClass46_16.method1077();
		Static279.aClass46_40.method1077();
	}
}
