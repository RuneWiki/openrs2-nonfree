import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static231 {

	@OriginalMember(owner = "client!jm", name = "C", descriptor = "Lclient!km;")
	public static Class167 aClass167_1;

	@OriginalMember(owner = "client!jm", name = "z", descriptor = "[Lclient!na;")
	public static final Class199[] aClass199Array2 = new Class199[14];

	@OriginalMember(owner = "client!jm", name = "D", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray2 = new Rectangle[100];

	@OriginalMember(owner = "client!jm", name = "b", descriptor = "(III)Z")
	public static boolean method4009(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1) {
		return Static300.method4753(arg1, arg0) & Static241.method4171(arg0, arg1);
	}
}
