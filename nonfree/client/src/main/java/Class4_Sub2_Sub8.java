import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cv")
public abstract class Class4_Sub2_Sub8 extends Class4_Sub2 {

	@OriginalMember(owner = "client!cv", name = "s", descriptor = "I")
	public final int anInt5741;

	static {
		new Class15("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!cv", name = "<init>", descriptor = "(I)V")
	protected Class4_Sub2_Sub8(@OriginalArg(0) int arg0) {
		this.anInt5741 = arg0;
	}

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(B)Z")
	public abstract boolean method4595();

	@OriginalMember(owner = "client!cv", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method4596();
}
