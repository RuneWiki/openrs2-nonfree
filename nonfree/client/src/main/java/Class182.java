import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public final class Class182 {

	@OriginalMember(owner = "client!op", name = "a", descriptor = "I")
	public final int anInt5274;

	static {
		new Class189("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class182(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.anInt5274 = arg1;
	}

	@OriginalMember(owner = "client!op", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
