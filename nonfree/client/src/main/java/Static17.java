import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static17 {

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "Lclient!ri;")
	public static Class284 aClass284_145;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "Lclient!rl;")
	public static final Class287 aClass287_139 = new Class287(69, 3);

	@OriginalMember(owner = "client!ak", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!ak", name = "i", descriptor = "I")
	public static int anInt8860 = 1;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIB)V")
	public static void method6924(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(14, arg1);
		local8.method7363();
		local8.anInt9381 = arg0;
	}

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(II)Ljava/lang/String;")
	public static String method6928(@OriginalArg(1) int arg0) {
		return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
	}
}
