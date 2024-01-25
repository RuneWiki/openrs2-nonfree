import java.awt.Color;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;

public final class Static76 {

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "Lclient!ki;")
	public static final Class137 aClass137_70 = new Class137(71, 18);

	@OriginalMember(owner = "client!dp", name = "f", descriptor = "[Ljava/lang/String;")
	public static final String[] aStringArray10 = new String[100];

	@OriginalMember(owner = "client!dp", name = "h", descriptor = "Z")
	public static boolean aBoolean113 = false;

	@OriginalMember(owner = "client!dp", name = "i", descriptor = "Lclient!lt;")
	public static final Class151 aClass151_48 = new Class151("RuneScape is loading - please wait...", "RuneScape wird geladen - bitte warten...", "Chargement de RuneScape en cours - veuillez patienter...", "RuneScape carregando. Aguarde...");

	@OriginalMember(owner = "client!dp", name = "j", descriptor = "[Ljava/awt/Color;")
	public static final Color[] aColorArray3 = new Color[] { new Color(9179409), new Color(3289650) };

	@OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)I")
	public static int method1199(@OriginalArg(0) int arg0) {
		return arg0 & 0x7F;
	}
}
