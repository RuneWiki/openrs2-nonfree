import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public final class Class5_Sub50 extends Class5 {

	@OriginalMember(owner = "client!wb", name = "n", descriptor = "Ljava/lang/String;")
	public String aString83;

	static {
		new Class40("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V")
	private Class5_Sub50() {
	}

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class5_Sub50(@OriginalArg(0) String arg0) {
		this.aString83 = arg0;
	}
}
