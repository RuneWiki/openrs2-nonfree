import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public final class Class31 {

	@OriginalMember(owner = "client!bn", name = "e", descriptor = "I")
	public final int anInt903;

	@OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
	public final int anInt906;

	@OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
	public final int anInt904;

	@OriginalMember(owner = "client!bn", name = "h", descriptor = "I")
	public final int anInt905;

	static {
		new Class306("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!bn", name = "<init>", descriptor = "(IIII)V")
	public Class31(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt903 = arg1;
		this.anInt906 = arg2;
		this.anInt904 = arg3;
		this.anInt905 = arg0;
	}

	@OriginalMember(owner = "client!bn", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
