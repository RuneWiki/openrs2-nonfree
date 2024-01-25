import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static66 {

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Lclient!sba;")
	public static final Class297 aClass297_3 = new Class297(16);

	@OriginalMember(owner = "client!ci", name = "A", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZII)Ljava/lang/String;")
	public static String method1638(@OriginalArg(2) int arg0) {
		return arg0 < 0 ? Integer.toString(arg0) : Static550.method7539(arg0);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
	public static void method1639() {
		@Pc(17) int local17 = (int) ((double) Static345.anInt6228 * 34.46D);
		local17 <<= 0x2;
		if (Static319.aClass31_11.method8063()) {
			local17 += 512;
		}
		Static319.aClass31_11.GA(200, local17);
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)V")
	public static void method1641(@OriginalArg(1) int arg0) {
		@Pc(8) Class3_Sub7_Sub19 local8 = Static73.method5992(1, arg0);
		local8.method7364();
	}
}
