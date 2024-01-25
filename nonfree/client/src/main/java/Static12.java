import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static12 {

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "Lclient!tu;")
	public static Class34_Sub1 aClass34_Sub1_1;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	public static int anInt164;

	@OriginalMember(owner = "client!ak", name = "cb", descriptor = "Lclient!jo;")
	public static Class1_Sub19_Sub2 aClass1_Sub19_Sub2_1;

	@OriginalMember(owner = "client!ak", name = "Bb", descriptor = "[Lclient!o;")
	public static Class137[] aClass137Array2;

	@OriginalMember(owner = "client!ak", name = "r", descriptor = "[Ljava/awt/Rectangle;")
	public static final Rectangle[] aRectangleArray1 = new Rectangle[100];

	@OriginalMember(owner = "client!ak", name = "ab", descriptor = "I")
	public static int anInt184 = 0;

	@OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lclient!pl;I)V")
	public static void method137(@OriginalArg(0) Class1_Sub35 arg0) {
		if (!Static96.aBoolean151) {
			arg0.method6178();
			Static126.anInt2794--;
		}
	}

	@OriginalMember(owner = "client!ak", name = "d", descriptor = "(I)V")
	public static void method141() {
		Static449.method6106();
	}
}
