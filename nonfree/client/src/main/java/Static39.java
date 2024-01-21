import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!gf", name = "f", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!gf", name = "k", descriptor = "I")
	public static int anInt839;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "Lclient!pe;")
	public static Class65 aClass65_404 = Static119.method1462("<col=ffffff>");

	@OriginalMember(owner = "client!gf", name = "b", descriptor = "I")
	public static int anInt835 = -1;

	@OriginalMember(owner = "client!gf", name = "d", descriptor = "Lclient!pe;")
	public static Class65 aClass65_405 = Static119.method1462(" )2> ");

	@OriginalMember(owner = "client!gf", name = "e", descriptor = "I")
	public static int anInt837 = 0;

	@OriginalMember(owner = "client!gf", name = "g", descriptor = "Lclient!pe;")
	public static Class65 aClass65_406 = Static119.method1462("huffman");

	@OriginalMember(owner = "client!gf", name = "h", descriptor = "Lclient!pe;")
	public static Class65 aClass65_407 = Static119.method1462("und loggen sich dann erneut ein)3");

	@OriginalMember(owner = "client!gf", name = "j", descriptor = "Lclient!tc;")
	public static Class74 aClass74_2 = new Class74();

	@OriginalMember(owner = "client!gf", name = "l", descriptor = "I")
	public static int anInt840 = 255;

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(II)V")
	public static void method671(@OriginalArg(1) int arg0) {
		@Pc(10) Class2_Sub20 local10 = (Class2_Sub20) Static22.aClass40_6.method851((long) arg0);
		if (local10 != null) {
			local10.method2053();
		}
	}

	@OriginalMember(owner = "client!gf", name = "a", descriptor = "(B)V")
	public static void method672() {
		aClass65_407 = null;
		aClass65_405 = null;
		aFontMetrics1 = null;
		aClass65_406 = null;
		aClass74_2 = null;
		aClass65_404 = null;
	}
}
