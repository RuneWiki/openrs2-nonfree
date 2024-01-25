import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public final class Class6_Sub36 extends Class6 {

	@OriginalMember(owner = "client!sa", name = "p", descriptor = "I")
	public final int anInt6327;

	@OriginalMember(owner = "client!sa", name = "r", descriptor = "I")
	public final int anInt6328;

	static {
		new Class267("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!sa", name = "<init>", descriptor = "(II)V")
	public Class6_Sub36(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt6327 = arg1;
		this.anInt6328 = arg0;
	}
}
