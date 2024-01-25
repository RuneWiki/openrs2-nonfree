import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static281 {

	@OriginalMember(owner = "client!jh", name = "J", descriptor = "Lclient!rd;")
	public static Class263 aClass263_4;

	@OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
	public static int anInt5188 = 100;

	@OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V")
	public static void method4722() {
		Static314.aClass106Array1 = new Class106[50];
		Static208.anInt7849 = 0;
	}

	@OriginalMember(owner = "client!jh", name = "a", descriptor = "(BILclient!d;ILjava/awt/Canvas;)Lclient!ha;")
	public static Class144 method4723(@OriginalArg(1) int arg0, @OriginalArg(2) Interface4 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Canvas arg3) {
		return new Class144_Sub2(arg3, arg1, arg0, arg2);
	}
}
