import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static39 {

	@OriginalMember(owner = "client!cg", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString4;

	@OriginalMember(owner = "client!cg", name = "e", descriptor = "Ljava/awt/Frame;")
	public static Frame aFrame2;

	@OriginalMember(owner = "client!cg", name = "b", descriptor = "Lclient!jn;")
	public static final Class106 aClass106_39 = new Class106("Loading textures - ", "Lade Texturen - ", "Chargement des textures - ", "Carregando texturas - ");

	@OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lclient!kg;I)Lclient!kg;")
	public static Class112 method934(@OriginalArg(0) Class112 arg0) {
		@Pc(6) Class112 local6 = Static44.method1081(arg0);
		if (local6 == null) {
			local6 = arg0.aClass112_12;
		}
		return local6;
	}
}
