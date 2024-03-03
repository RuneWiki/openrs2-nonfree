import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class3_Sub1 extends Class3 {

	@OriginalMember(owner = "client!ac", name = "x", descriptor = "Lclient!mc;")
	public static final Class145 aClass145_8 = new Class145(70, 3);

	@OriginalMember(owner = "client!ac", name = "B", descriptor = "I")
	public static int anInt88;

	@OriginalMember(owner = "client!ac", name = "D", descriptor = "I")
	public static int anInt90;

	@OriginalMember(owner = "client!ac", name = "z", descriptor = "Lclient!nl;")
	public static Class162 aClass162_1;

	@OriginalMember(owner = "client!ac", name = "q", descriptor = "I")
	public int anInt81;

	@OriginalMember(owner = "client!ac", name = "s", descriptor = "Ljava/lang/String;")
	public String aString1;

	@OriginalMember(owner = "client!ac", name = "v", descriptor = "Ljava/lang/String;")
	public String aString2;

	@OriginalMember(owner = "client!ac", name = "t", descriptor = "I")
	public int anInt83 = -1;

	static {
		new Class79("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
		anInt88 = -1;
		anInt90 = 0;
		aClass162_1 = new Class162();
	}

	@OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)Lclient!kh;", line = 106)
	public Class124 method75() {
		return Static338.aClass124Array1[super.anInt76];
	}
}
