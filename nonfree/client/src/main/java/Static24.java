import java.net.URL;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static24 {

	@OriginalMember(owner = "client!be", name = "h", descriptor = "[I")
	public static int[] anIntArray75;

	@OriginalMember(owner = "client!be", name = "e", descriptor = "Lclient!o;")
	public static final Class169 aClass169_19 = new Class169("Loading defaults - ", "Lade Standardeinstellungen - ", "Chargement des paramètres par défaut - ", "Carregando padrões - ");

	@OriginalMember(owner = "client!be", name = "g", descriptor = "[I")
	public static final int[] anIntArray74 = new int[100];

	@OriginalMember(owner = "client!be", name = "i", descriptor = "I")
	public static int anInt386 = 2;

	@OriginalMember(owner = "client!be", name = "j", descriptor = "I")
	public static int anInt387 = 0;

	@OriginalMember(owner = "client!be", name = "k", descriptor = "Lclient!sh;")
	public static final Class211 aClass211_7 = new Class211(58, 7);

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(BI)I")
	public static int method368(@OriginalArg(1) int arg0) {
		return arg0 & 0xFF;
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Lclient!je;I)Ljava/lang/String;")
	public static String method369(@OriginalArg(0) Class117 arg0) {
		if (Static50.method810(arg0).method2807() == 0) {
			return null;
		} else if (arg0.aString29 == null || arg0.aString29.trim().length() == 0) {
			return Static274.aBoolean463 ? "Hidden-use" : null;
		} else {
			return arg0.aString29;
		}
	}

	@OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;Lclient!ng;BI)Lclient!iu;")
	public static Class112 method370(@OriginalArg(0) String arg0, @OriginalArg(1) Class162 arg1, @OriginalArg(3) int arg2) {
		if (arg2 == 0) {
			return arg1.method3284(arg0);
		}
		@Pc(41) Class112 local41;
		if (arg2 == 1) {
			try {
				Static396.method1250("openjs", new Object[] { (new URL(arg1.anApplet1.getCodeBase(), arg0)).toString() }, arg1.anApplet1);
				local41 = new Class112();
				local41.anInt2969 = 1;
				return local41;
			} catch (@Pc(47) Throwable local47) {
				local41 = new Class112();
				local41.anInt2969 = 2;
				return local41;
			}
		} else if (arg2 == 2) {
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_blank");
				local41 = new Class112();
				local41.anInt2969 = 1;
				return local41;
			} catch (@Pc(81) Exception local81) {
				local41 = new Class112();
				local41.anInt2969 = 2;
				return local41;
			}
		} else if (arg2 == 3) {
			try {
				Static396.method1248(arg1.anApplet1, "loggedout");
			} catch (@Pc(108) Throwable local108) {
			}
			try {
				arg1.anApplet1.getAppletContext().showDocument(new URL(arg1.anApplet1.getCodeBase(), arg0), "_top");
				local41 = new Class112();
				local41.anInt2969 = 1;
				return local41;
			} catch (@Pc(130) Exception local130) {
				local41 = new Class112();
				local41.anInt2969 = 2;
				return local41;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}
}
