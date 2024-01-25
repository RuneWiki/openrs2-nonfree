import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static220 {

	@OriginalMember(owner = "client!hca", name = "q", descriptor = "I")
	public static int anInt4457;

	@OriginalMember(owner = "client!hca", name = "s", descriptor = "[[B")
	public static byte[][] aByteArrayArray13;

	@OriginalMember(owner = "client!hca", name = "o", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_84 = new Class359(21, -1);

	@OriginalMember(owner = "client!hca", name = "r", descriptor = "Lclient!uw;")
	public static final Class359 aClass359_85 = new Class359(10, -1);

	@OriginalMember(owner = "client!hca", name = "t", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };

	@OriginalMember(owner = "client!hca", name = "a", descriptor = "(III)Z")
	public static boolean method3766(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return (arg1 & 0x40000) != 0 | Static438.method6518(arg0, arg1) || Static135.method2404(arg1, arg0);
	}
}
