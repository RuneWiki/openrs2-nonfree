import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public final class Class1_Sub33 extends Class1 {

	@OriginalMember(owner = "client!og", name = "l", descriptor = "I")
	public int anInt6397;

	static {
		new Class114("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
	private Class1_Sub33() {
	}

	@OriginalMember(owner = "client!og", name = "<init>", descriptor = "(I)V")
	public Class1_Sub33(@OriginalArg(0) int arg0) {
		this.anInt6397 = arg0;
	}
}
