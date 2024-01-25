import java.awt.Component;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static311 {

	@OriginalMember(owner = "client!ps", name = "w", descriptor = "[Ljava/lang/String;")
	public static String[] aStringArray39;

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BIIIIII)V")
	public static void method4387(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) int arg4, @OriginalArg(6) int arg5) {
		Static289.anInt5203 = arg5;
		Static64.anInt1451 = arg0;
		Static454.anInt7447 = arg1;
		Static291.anInt5226 = arg2;
		Static233.anInt4503 = arg4;
		Static373.anInt4899 = arg3;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Ljava/awt/Component;I)Lclient!tj;")
	public static Class226 method4389(@OriginalArg(0) Component arg0) {
		return new Class226_Sub1(arg0);
	}
}
