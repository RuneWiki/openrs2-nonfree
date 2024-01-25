import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public final class Class2_Sub16 extends Class2 {

	@OriginalMember(owner = "client!ho", name = "l", descriptor = "I")
	public int anInt2879;

	@OriginalMember(owner = "client!ho", name = "o", descriptor = "I")
	public int anInt2881;

	@OriginalMember(owner = "client!ho", name = "q", descriptor = "I")
	public int anInt2882;

	@OriginalMember(owner = "client!ho", name = "r", descriptor = "I")
	public int anInt2883;

	@OriginalMember(owner = "client!ho", name = "s", descriptor = "I")
	public int anInt2884;

	@OriginalMember(owner = "client!ho", name = "p", descriptor = "Z")
	public boolean aBoolean181 = false;

	@OriginalMember(owner = "client!ho", name = "m", descriptor = "I")
	public int anInt2880 = -1;

	static {
		new Class231("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!ho", name = "<init>", descriptor = "(I)V")
	public Class2_Sub16(@OriginalArg(0) int arg0) {
		this.anInt2880 = arg0;
	}
}
