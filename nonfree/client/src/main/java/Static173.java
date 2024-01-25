import java.awt.Image;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static173 {

	@OriginalMember(owner = "client!ih", name = "m", descriptor = "Ljava/awt/Image;")
	public static Image anImage1;

	@OriginalMember(owner = "client!ih", name = "i", descriptor = "I")
	public static int anInt2946 = 0;

	@OriginalMember(owner = "client!ih", name = "n", descriptor = "Lclient!pu;")
	public static final Class198 aClass198_53 = new Class198("Please wait - attempting to reestablish.", "Bitte warte - es wird versucht, die Verbindung wiederherzustellen.", "Veuillez patienter - tentative de rétablissement.", "Tentando reestabelecer conexão. Aguarde.");

	@OriginalMember(owner = "client!ih", name = "c", descriptor = "(II)Z")
	public static boolean method2389(@OriginalArg(1) int arg0) {
		return arg0 == 2 || arg0 == 4 || arg0 == 5;
	}

	@OriginalMember(owner = "client!ih", name = "a", descriptor = "(III)Lclient!so;")
	public static Class2_Sub2 method2392(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(7) Class258 local7 = Static319.aClass258ArrayArrayArray3[arg0][arg1][arg2];
		return local7 == null ? null : local7.aClass2_Sub2_2;
	}
}
