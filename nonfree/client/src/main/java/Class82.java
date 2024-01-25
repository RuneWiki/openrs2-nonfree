import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class Class82 {

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "I")
	public int anInt7693;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
	public int anInt7695;

	@OriginalMember(owner = "client!fv", name = "j", descriptor = "I")
	public int anInt7699;

	static {
		new Class21("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!fv", name = "a", descriptor = "(I)Z")
	public final boolean method6137() {
		return (this.anInt7699 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!fv", name = "b", descriptor = "(I)Z")
	public final boolean method6138() {
		return (this.anInt7699 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!fv", name = "c", descriptor = "(I)Z")
	public final boolean method6139() {
		return (this.anInt7699 & 0x1) != 0;
	}

	@OriginalMember(owner = "client!fv", name = "e", descriptor = "(I)Z")
	public final boolean method6142() {
		return (this.anInt7699 & 0x2) != 0;
	}
}
