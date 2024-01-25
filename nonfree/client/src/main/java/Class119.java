import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public final class Class119 {

	@OriginalMember(owner = "client!jc", name = "f", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray15;

	static {
		new Class119("Unable to add name - unknown player.", "Name konnte nicht hinzugefügt werden - Spieler unbekannt.", "Impossible d'ajouter le nom - joueur inconnu.", "Não foi possível adicionar um nome - jogador desconhecido.");
	}

	@OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class119(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray15 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!jc", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}

	@OriginalMember(owner = "client!jc", name = "a", descriptor = "(IB)Ljava/lang/String;")
	public String method2673(@OriginalArg(0) int arg0) {
		return this.aStringArray15[arg0];
	}
}
