import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public final class Class2_Sub23 extends Class2 {

	@OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
	public int anInt3818;

	static {
		new Class140("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
		new Class140("To interact with this please login to a members' server.", "Logg dich auf einer Mitglieder-Welt ein, um damit zu interagieren.", "Veuillez vous connecter à un serveur d'abonnés pour cette interaction.", "Para interagir, acesse um servidor para membros.");
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "()V")
	private Class2_Sub23() {
	}

	@OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(I)V")
	public Class2_Sub23(@OriginalArg(0) int arg0) {
		this.anInt3818 = arg0;
	}
}
