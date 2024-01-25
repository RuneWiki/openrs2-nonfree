import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public final class Class6_Sub33_Sub1 extends Class6_Sub33 {

	@OriginalMember(owner = "client!se", name = "w", descriptor = "I")
	public int anInt6361;

	@OriginalMember(owner = "client!se", name = "x", descriptor = "I")
	public int anInt6362;

	@OriginalMember(owner = "client!se", name = "A", descriptor = "I")
	public int anInt6365;

	@OriginalMember(owner = "client!se", name = "C", descriptor = "J")
	public long aLong185;

	static {
		new Class267("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(B)J")
	@Override
	public long method5294() {
		return this.aLong185;
	}

	@OriginalMember(owner = "client!se", name = "f", descriptor = "(I)I")
	@Override
	public int method5293() {
		return this.anInt6362;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(I)I")
	@Override
	public int method5290() {
		return this.anInt6365;
	}

	@OriginalMember(owner = "client!se", name = "d", descriptor = "(B)I")
	@Override
	public int method5287() {
		return this.anInt6361;
	}
}
