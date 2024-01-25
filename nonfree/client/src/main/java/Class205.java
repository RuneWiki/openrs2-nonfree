import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rt")
public final class Class205 {

	@OriginalMember(owner = "client!rt", name = "e", descriptor = "I")
	public final int anInt5344;

	static {
		new Class169("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!rt", name = "<init>", descriptor = "(I)V")
	public Class205(@OriginalArg(0) int arg0) {
		this.anInt5344 = arg0;
	}

	@OriginalMember(owner = "client!rt", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
