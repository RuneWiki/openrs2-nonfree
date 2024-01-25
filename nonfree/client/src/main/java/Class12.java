import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public abstract class Class12 {

	static {
		new Class221("Unable to add friend - unknown player.", "Spieler konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter l'ami - joueur inconnu.", "Não foi possível adicionar um amigo - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!kj", name = "c", descriptor = "(Lclient!km;I)V")
	public abstract void method5449(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(Lclient!km;BII)Z")
	public abstract boolean method5450(@OriginalArg(0) Class82 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!kj", name = "d", descriptor = "(Lclient!km;I)Lclient!to;")
	public abstract Class22_Sub8 method5451(@OriginalArg(0) Class82 arg0);

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILclient!km;IZILclient!kj;B)V")
	public abstract void method5454(@OriginalArg(0) int arg0, @OriginalArg(1) Class82 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) int arg4, @OriginalArg(5) Class12 arg5);

	@OriginalMember(owner = "client!kj", name = "e", descriptor = "(I)Z")
	public abstract boolean method5455();

	@OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V")
	public abstract void method5456();
}
