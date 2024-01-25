import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public final class Class231 {

	@OriginalMember(owner = "client!sk", name = "c", descriptor = "[Ljava/lang/String;")
	private final String[] aStringArray42;

	static {
		new Class231("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V")
	public Class231(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) String arg2, @OriginalArg(3) String arg3) {
		this.aStringArray42 = new String[] { arg0, arg1, arg2, arg3 };
	}

	@OriginalMember(owner = "client!sk", name = "a", descriptor = "(II)Ljava/lang/String;")
	public String method5138(@OriginalArg(0) int arg0) {
		return this.aStringArray42[arg0];
	}

	@OriginalMember(owner = "client!sk", name = "toString", descriptor = "()Ljava/lang/String;")
	@Override
	public String toString() {
		throw new IllegalStateException();
	}
}
