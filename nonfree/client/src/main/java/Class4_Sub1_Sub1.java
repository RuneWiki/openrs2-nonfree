import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ac", name = "n", descriptor = "I")
	public int anInt75;

	@OriginalMember(owner = "client!ac", name = "o", descriptor = "J")
	public long aLong4;

	@OriginalMember(owner = "client!ac", name = "u", descriptor = "I")
	public int anInt80;

	@OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
	public int anInt87;

	static {
		new Class15("That user is not in this channel.", "Dieser Benutzer befindet sich nicht in diesem Chatraum.", "Cet utilisateur n'est pas dans ce canal.", "Esse usuário não está no canal.");
		new Class15("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
		new Class15("Nothing interesting happens.", "Nichts Interessantes passiert.", "Il ne se passe rien d'intéressant.", "Nada de interessante acontece.");
	}

	@OriginalMember(owner = "client!ac", name = "e", descriptor = "(I)I")
	@Override
	public int method65() {
		return this.anInt80;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(Z)I")
	@Override
	public int method67() {
		return this.anInt87;
	}

	@OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)J")
	@Override
	public long method63() {
		return this.aLong4;
	}

	@OriginalMember(owner = "client!ac", name = "b", descriptor = "(B)I")
	@Override
	public int method64() {
		return this.anInt75;
	}
}
