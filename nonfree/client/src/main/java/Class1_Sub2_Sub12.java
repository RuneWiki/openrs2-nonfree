import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qt")
public final class Class1_Sub2_Sub12 extends Class1_Sub2 {

	@OriginalMember(owner = "client!qt", name = "v", descriptor = "Lclient!dc;")
	public final Class31_Sub2_Sub2 aClass31_Sub2_Sub2_1;

	static {
		new Class7("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!qt", name = "<init>", descriptor = "(Lclient!dc;)V")
	public Class1_Sub2_Sub12(@OriginalArg(0) Class31_Sub2_Sub2 arg0) {
		this.aClass31_Sub2_Sub2_1 = arg0;
	}
}
