import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public abstract class Class7_Sub12 extends Class7 {

	static {
		new Class55("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!kn", name = "a", descriptor = "(Z)J")
	public abstract long method939();

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(B)I")
	public abstract int method940();

	@OriginalMember(owner = "client!kn", name = "c", descriptor = "(I)I")
	public abstract int method942();

	@OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)I")
	public abstract int method943();
}
