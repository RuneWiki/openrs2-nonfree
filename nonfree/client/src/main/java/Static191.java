import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static191 {

	@OriginalMember(owner = "client!mc", name = "z", descriptor = "Lclient!ij;")
	public static Class93 aClass93_75;

	@OriginalMember(owner = "client!mc", name = "H", descriptor = "I")
	public static int anInt3783;

	@OriginalMember(owner = "client!mc", name = "a", descriptor = "(IILjava/awt/Canvas;Lclient!gf;)Lclient!ea;")
	public static Class55 method3415(@OriginalArg(0) int arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) Interface3 arg2) {
		return new Class55_Sub2(arg1, arg2, arg0);
	}
}
