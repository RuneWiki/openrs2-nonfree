import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public final class Class143 {

	@OriginalMember(owner = "client!ll", name = "e", descriptor = "I")
	public final int anInt3718;

	static {
		new Class221("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class143(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt3718 = arg1;
	}

	@OriginalMember(owner = "client!ll", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
