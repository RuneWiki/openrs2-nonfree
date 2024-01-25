import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!oi", name = "q", descriptor = "Ljava/lang/String;")
	public String aString60;

	static {
		new Class119("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
	private Class1_Sub33() {
	}

	@OriginalMember(owner = "client!oi", name = "<init>", descriptor = "(Ljava/lang/String;)V")
	public Class1_Sub33(@OriginalArg(0) String arg0) {
		this.aString60 = arg0;
	}
}
