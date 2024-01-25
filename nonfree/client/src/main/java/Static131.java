import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static131 {

	@OriginalMember(owner = "client!et", name = "b", descriptor = "Z")
	public static boolean aBoolean237 = false;

	@OriginalMember(owner = "client!et", name = "h", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray3 = new Rectangle[100];

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(III)Z")
	public static boolean method2742(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return Static349.method5195(arg0, arg1) | (arg1 & 0x800) != 0 || Static270.method4371(arg0, arg1);
	}

	@OriginalMember(owner = "client!et", name = "a", descriptor = "(ILclient!ha;)V")
	public static void method2743(@OriginalArg(1) Class133 arg0) {
		Static261.aClass133_1 = arg0;
	}
}
