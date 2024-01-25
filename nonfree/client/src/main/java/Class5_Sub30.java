import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class5_Sub30 extends Class5 {

	@OriginalMember(owner = "client!og", name = "k", descriptor = "J")
	public long aLong142;

	static {
		new Class198("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	private Class5_Sub30() {
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(J)V")
	public Class5_Sub30(@OriginalArg(0) long arg0) {
		this.aLong142 = arg0;
	}
}
