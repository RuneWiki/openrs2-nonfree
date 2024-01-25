import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static432 {

	@OriginalMember(owner = "client!oo", name = "j", descriptor = "I")
	public static int anInt7142;

	@OriginalMember(owner = "client!oo", name = "f", descriptor = "Lclient!ch;")
	public static Class58 aClass58_1;

	@OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
	public static int anInt7144;

	@OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI[Ljava/awt/Rectangle;)V")
	public static void method6220(@OriginalArg(1) int arg0, @OriginalArg(2) Rectangle[] arg1) throws Exception_Sub1 {
		if (Static181.anInt3401 == 1) {
			Static548.aClass100_13.method8583(arg1, arg0, Static208.anInt3698, Static251.anInt4580);
		} else {
			Static548.aClass100_13.method8583(arg1, arg0, 0, 0);
		}
	}
}
