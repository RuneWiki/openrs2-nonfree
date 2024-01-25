import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lt")
public abstract class Class147 {

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "I")
	public int anInt6653;

	@OriginalMember(owner = "client!lt", name = "h", descriptor = "I")
	public int anInt6657;

	@OriginalMember(owner = "client!lt", name = "l", descriptor = "I")
	public int anInt6661;

	static {
		new Class119("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!lt", name = "b", descriptor = "(I)Z")
	public final boolean method5209() {
		return (this.anInt6657 & 0x4) != 0;
	}

	@OriginalMember(owner = "client!lt", name = "a", descriptor = "(B)Z")
	public final boolean method5211() {
		return (this.anInt6657 & 0x8) != 0;
	}

	@OriginalMember(owner = "client!lt", name = "c", descriptor = "(I)Z")
	public final boolean method5212() {
		return (this.anInt6657 & 0x2) != 0;
	}

	@OriginalMember(owner = "client!lt", name = "d", descriptor = "(I)Z")
	public final boolean method5213() {
		return (this.anInt6657 & 0x1) != 0;
	}
}
