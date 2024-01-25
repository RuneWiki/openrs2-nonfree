import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public final class Class23_Sub1 extends Class23 {

	@OriginalMember(owner = "client!bd", name = "s", descriptor = "Ljava/lang/String;")
	public String aString3;

	@OriginalMember(owner = "client!bd", name = "t", descriptor = "Ljava/lang/String;")
	public String aString4;

	@OriginalMember(owner = "client!bd", name = "v", descriptor = "I")
	public int anInt333;

	@OriginalMember(owner = "client!bd", name = "x", descriptor = "I")
	public int anInt335 = -1;

	static {
		new Class57("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!bd", name = "b", descriptor = "(B)Lclient!ka;")
	public Class129 method310() {
		return Static26.aClass129Array1[super.anInt328];
	}
}
