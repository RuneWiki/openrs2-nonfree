import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bh")
public abstract class Class1_Sub7 extends Class1 {

	static {
		new Class7("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(I)I")
	public abstract int method3628();

	@OriginalMember(owner = "client!bh", name = "g", descriptor = "(I)J")
	public abstract long method3630();

	@OriginalMember(owner = "client!bh", name = "h", descriptor = "(I)I")
	public abstract int method3632();

	@OriginalMember(owner = "client!bh", name = "a", descriptor = "(B)I")
	public abstract int method3633();
}
