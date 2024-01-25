import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public final class Class11_Sub8 extends Class11 {

	@OriginalMember(owner = "client!co", name = "j", descriptor = "I")
	public int anInt861;

	@OriginalMember(owner = "client!co", name = "k", descriptor = "I")
	public int anInt862;

	@OriginalMember(owner = "client!co", name = "n", descriptor = "I")
	public int anInt864;

	@OriginalMember(owner = "client!co", name = "p", descriptor = "I")
	public int anInt866;

	@OriginalMember(owner = "client!co", name = "t", descriptor = "I")
	public int anInt868;

	@OriginalMember(owner = "client!co", name = "m", descriptor = "I")
	public int anInt863 = -1;

	@OriginalMember(owner = "client!co", name = "l", descriptor = "Z")
	public boolean aBoolean53 = false;

	static {
		new Class117("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!co", name = "<init>", descriptor = "(I)V")
	public Class11_Sub8(@OriginalArg(0) int arg0) {
		this.anInt863 = arg0;
	}
}
