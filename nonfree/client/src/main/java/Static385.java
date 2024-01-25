import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static385 {

	@OriginalMember(owner = "client!tg", name = "rb", descriptor = "Ljava/lang/String;")
	public static String aString52;

	@OriginalMember(owner = "client!tg", name = "K", descriptor = "Z")
	public static boolean aBoolean439 = false;

	@OriginalMember(owner = "client!tg", name = "ab", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray4 = new Color[] { new Color(9179409), new Color(16777215) };

	@OriginalMember(owner = "client!tg", name = "nb", descriptor = "Lclient!fm;")
	public static final Class87 aClass87_12 = new Class87(2);

	@OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZI)V")
	public static void method5268(@OriginalArg(1) int arg0) {
		@Pc(13) Class1_Sub2_Sub1 local13 = Static258.method5559(arg0, 16);
		local13.method195();
	}
}
