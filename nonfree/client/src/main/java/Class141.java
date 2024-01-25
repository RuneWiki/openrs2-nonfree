import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ku")
public abstract class Class141 {

	@OriginalMember(owner = "client!ku", name = "f", descriptor = "I")
	public int anInt6661;

	@OriginalMember(owner = "client!ku", name = "g", descriptor = "I")
	public int anInt6662;

	@OriginalMember(owner = "client!ku", name = "o", descriptor = "I")
	public int anInt6667;

	static {
		new Class221("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!ku", name = "a", descriptor = "(I)Z")
	public final boolean method5697() {
		return (this.anInt6667 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!ku", name = "b", descriptor = "(I)Z")
	public final boolean method5698() {
		return (this.anInt6667 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!ku", name = "c", descriptor = "(I)Z")
	public final boolean method5699() {
		return (this.anInt6667 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!ku", name = "d", descriptor = "(I)Z")
	public final boolean method5700() {
		return (this.anInt6667 & 0x4) != 0;
	}
}
