import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public final class Class1_Sub27_Sub1 extends Class1_Sub27 {

	@OriginalMember(owner = "client!ql", name = "u", descriptor = "J")
	public long aLong175;

	@OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
	public int anInt5696;

	@OriginalMember(owner = "client!ql", name = "B", descriptor = "I")
	public int anInt5699;

	@OriginalMember(owner = "client!ql", name = "G", descriptor = "I")
	public int anInt5703;

	static {
		new Class84("You are not currently in a channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes dans aucun canal à l'heure actuelle.", "No momento você não está em um canal.");
	}

	@OriginalMember(owner = "client!ql", name = "d", descriptor = "(I)J")
	@Override
	public long method4580() {
		return this.aLong175;
	}

	@OriginalMember(owner = "client!ql", name = "f", descriptor = "(I)I")
	@Override
	public int method4582() {
		return this.anInt5696;
	}

	@OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)I")
	@Override
	public int method4578() {
		return this.anInt5703;
	}

	@OriginalMember(owner = "client!ql", name = "e", descriptor = "(I)I")
	@Override
	public int method4581() {
		return this.anInt5699;
	}
}
