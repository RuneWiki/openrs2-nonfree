import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static277 {

	@OriginalMember(owner = "client!rs", name = "i", descriptor = "[I")
	public static int[] anIntArray774;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "Lclient!sj;")
	public static final Class1_Sub35 aClass1_Sub35_12 = new Class1_Sub35(0, -1);

	@OriginalMember(owner = "client!rs", name = "e", descriptor = "I")
	public static int anInt6204 = 1;

	@OriginalMember(owner = "client!rs", name = "f", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray13 = new Color[] { new Color(16777215), new Color(16777215) };

	@OriginalMember(owner = "client!rs", name = "h", descriptor = "I")
	public static int anInt6206 = 0;

	@OriginalMember(owner = "client!rs", name = "j", descriptor = "Ljava/lang/String;")
	public static String aString249 = "cyan:";

	@OriginalMember(owner = "client!rs", name = "k", descriptor = "I")
	public static int anInt6207 = 0;

	@OriginalMember(owner = "client!rs", name = "a", descriptor = "(Lclient!qj;B)V")
	public static void method5442(@OriginalArg(0) Class165 arg0) {
		Static311.anInt5989 = arg0.method4502("titlebg");
		Static81.anInt1604 = arg0.method4502("logo");
	}
}
