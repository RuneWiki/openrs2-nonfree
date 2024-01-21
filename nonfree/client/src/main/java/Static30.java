import java.awt.Component;
import java.awt.FontMetrics;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static30 {

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "Lclient!ig;")
	public static Class5_Sub2_Sub8 aClass5_Sub2_Sub8_1;

	@OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
	public static int anInt578;

	@OriginalMember(owner = "client!ci", name = "p", descriptor = "Lclient!jc;")
	public static Class47 aClass47_1;

	@OriginalMember(owner = "client!ci", name = "r", descriptor = "Z")
	public static boolean aBoolean37;

	@OriginalMember(owner = "client!ci", name = "s", descriptor = "[Lclient!jc;")
	public static Class47[] aClass47Array2;

	@OriginalMember(owner = "client!ci", name = "z", descriptor = "Lclient!wa;")
	public static Class23 aClass23_17;

	@OriginalMember(owner = "client!ci", name = "B", descriptor = "Ljava/awt/FontMetrics;")
	public static FontMetrics aFontMetrics1;

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_224 = Static161.method2452("Please reload this page)3");

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_225 = Static161.method2452("Invalid loginserver requested)3");

	@OriginalMember(owner = "client!ci", name = "g", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_226 = Static161.method2452("Unexpected loginserver response)3");

	@OriginalMember(owner = "client!ci", name = "h", descriptor = "Lclient!dc;")
	public static Class20 aClass20_227 = aClass20_225;

	@OriginalMember(owner = "client!ci", name = "i", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_228 = Static161.method2452("Benutzen");

	@OriginalMember(owner = "client!ci", name = "w", descriptor = "Lclient!dc;")
	private static final Class20 aClass20_232 = Static161.method2452("scroll:");

	@OriginalMember(owner = "client!ci", name = "l", descriptor = "Lclient!dc;")
	public static Class20 aClass20_229 = aClass20_232;

	@OriginalMember(owner = "client!ci", name = "t", descriptor = "Lclient!dc;")
	public static Class20 aClass20_230 = aClass20_224;

	@OriginalMember(owner = "client!ci", name = "v", descriptor = "Lclient!dc;")
	public static final Class20 aClass20_231 = aClass20_232;

	@OriginalMember(owner = "client!ci", name = "x", descriptor = "Lclient!dc;")
	public static Class20 aClass20_233 = aClass20_226;

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "Lclient!cc;")
	public static Class15 aClass15_1 = new Class15();

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(II)Z")
	public static boolean method455(@OriginalArg(0) int arg0) {
		return (arg0 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILjava/awt/Component;)V")
	public static void method459(@OriginalArg(1) Component arg0) {
		arg0.removeMouseListener(aClass15_1);
		arg0.removeMouseMotionListener(aClass15_1);
		arg0.removeFocusListener(aClass15_1);
		Static40.anInt846 = 0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ILclient!dc;)Z")
	public static boolean method460(@OriginalArg(1) Class20 arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(16) int local16 = 0; local16 < Static50.anInt1082; local16++) {
			if (arg0.method551(Static114.aClass20Array4[local16])) {
				return true;
			}
		}
		return false;
	}
}
