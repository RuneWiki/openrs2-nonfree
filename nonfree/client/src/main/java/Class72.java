import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public abstract class Class72 {

	static {
		new Class221("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
		new Class221("Use", "Benutzen", "Utiliser", "Usar");
	}

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B[B)V")
	public abstract void method4861(@OriginalArg(1) byte[] arg0);

	@OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)[B")
	public abstract byte[] method4862();
}
