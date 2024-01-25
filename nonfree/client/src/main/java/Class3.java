import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cc")
public abstract class Class3 {

	static {
		new Class198("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!cc", name = "<init>", descriptor = "()V")
	protected Class3() {
	}

	@OriginalMember(owner = "client!cc", name = "a", descriptor = "(F[FBFFFIIIII)V")
	public abstract void method36(@OriginalArg(0) float arg0, @OriginalArg(1) float[] arg1, @OriginalArg(3) float arg2, @OriginalArg(4) float arg3, @OriginalArg(5) float arg4, @OriginalArg(7) int arg5, @OriginalArg(8) int arg6);
}
