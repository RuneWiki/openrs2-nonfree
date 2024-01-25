import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public final class Class4_Sub4_Sub6 extends Class4_Sub4 {

	static {
		new Class15("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
		new Class15(null, "Mitglieder können 200 Freunde hinzufügen, freie Spieler nur 100.", null, null);
	}

	@OriginalMember(owner = "client!eq", name = "<init>", descriptor = "()V")
	public Class4_Sub4_Sub6() {
		super(0, true);
	}

	@OriginalMember(owner = "client!eq", name = "a", descriptor = "(II)[I")
	@Override
	public int[] method6037(@OriginalArg(0) int arg0) {
		return Static226.anIntArray284;
	}
}
