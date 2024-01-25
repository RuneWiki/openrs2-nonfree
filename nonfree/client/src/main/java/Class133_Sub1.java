import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public final class Class133_Sub1 extends Class133 {

	@OriginalMember(owner = "client!kg", name = "i", descriptor = "[I")
	public final int[] anIntArray320;

	@OriginalMember(owner = "client!kg", name = "o", descriptor = "[I")
	public final int[] anIntArray321;

	static {
		new Class7("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
		new Class7(null, "der Spieler ist momentan nicht verfügbar.", null, null);
	}

	@OriginalMember(owner = "client!kg", name = "<init>", descriptor = "(II[I[I)V")
	public Class133_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray320 = arg3;
		this.anIntArray321 = arg2;
	}
}
