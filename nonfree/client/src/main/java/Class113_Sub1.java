import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public final class Class113_Sub1 extends Class113 {

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "J")
	public long aLong188;

	@OriginalMember(owner = "client!rv", name = "h", descriptor = "I")
	public int anInt6601;

	@OriginalMember(owner = "client!rv", name = "m", descriptor = "Z")
	public boolean aBoolean419;

	@OriginalMember(owner = "client!rv", name = "n", descriptor = "I")
	public int anInt6605;

	@OriginalMember(owner = "client!rv", name = "o", descriptor = "Lclient!rv;")
	public Class113_Sub1 aClass113_Sub1_4;

	@OriginalMember(owner = "client!rv", name = "r", descriptor = "C")
	public char aChar5;

	static {
		new Class158("Your ignore list is full. Max of 100 users.", "Deine Ignorieren-Liste ist voll, du kannst nur 100 Spieler darauf eintragen.", "Votre liste noire est pleine (100 noms maximum).", "Sua lista de ignorados está cheia. O limite é 100 usuários.");
	}

	@OriginalMember(owner = "client!rv", name = "d", descriptor = "(I)J")
	@Override
	public long method5052() {
		return this.aLong188;
	}

	@OriginalMember(owner = "client!rv", name = "e", descriptor = "(I)I")
	@Override
	public int method5054() {
		return this.anInt6601;
	}

	@OriginalMember(owner = "client!rv", name = "b", descriptor = "(I)C")
	@Override
	public char method5049() {
		return this.aChar5;
	}

	@OriginalMember(owner = "client!rv", name = "c", descriptor = "(I)I")
	@Override
	public int method5051() {
		return this.anInt6605;
	}

	@OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)Z")
	@Override
	public boolean method5048() {
		return this.aBoolean419;
	}
}
