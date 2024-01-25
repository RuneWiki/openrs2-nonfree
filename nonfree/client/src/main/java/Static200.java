import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static200 {

	@OriginalMember(owner = "client!kf", name = "l", descriptor = "I")
	public static int anInt3936;

	@OriginalMember(owner = "client!kf", name = "e", descriptor = "Lclient!bd;")
	public static final Class21 aClass21_50 = new Class21("glow3:", "leuchten3:", "brillant3:", "brilho3:");

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(BLjava/lang/String;)V")
	public static void method3529(@OriginalArg(1) String arg0) {
		Static238.method4006("", 0, arg0, "", 0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(ILclient!l;Ljava/awt/Canvas;I)Lclient!qa;")
	public static Class30 method3530(@OriginalArg(1) Interface4 arg0, @OriginalArg(2) Canvas arg1, @OriginalArg(3) int arg2) {
		return new Class30_Sub2(arg2, arg1, arg0);
	}

	@OriginalMember(owner = "client!kf", name = "a", descriptor = "(II)Z")
	public static boolean method3531(@OriginalArg(0) int arg0) {
		return arg0 == 9 || arg0 == 10 || arg0 == 11;
	}
}
