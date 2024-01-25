import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public abstract class Class138 {

	static {
		new Class140("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!rr", name = "<init>", descriptor = "()V")
	protected Class138() {
	}

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(IZ)V")
	public abstract void method4064(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(II)[B")
	public abstract byte[] method4065(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!rr", name = "b", descriptor = "(II)I")
	public abstract int method4067(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)Lclient!at;")
	public abstract Class16 method4068();
}
