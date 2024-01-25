import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public abstract class Class65 {

	@OriginalMember(owner = "client!eh", name = "d", descriptor = "I")
	public int anInt2397;

	@OriginalMember(owner = "client!eh", name = "g", descriptor = "I")
	public int anInt2400;

	@OriginalMember(owner = "client!eh", name = "h", descriptor = "I")
	public int anInt2401;

	static {
		new Class134("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(Z)Z")
	public final boolean method1987() {
		return (this.anInt2397 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "b", descriptor = "(I)Z")
	public final boolean method1988() {
		return (this.anInt2397 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "c", descriptor = "(I)Z")
	public final boolean method1989() {
		return (this.anInt2397 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!eh", name = "a", descriptor = "(B)Z")
	public final boolean method1990() {
		return (this.anInt2397 & 0x2) != 0;
	}
}
