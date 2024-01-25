import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ni")
public final class Class4_Sub31 extends Class4 {

	@OriginalMember(owner = "client!ni", name = "n", descriptor = "S")
	public short aShort62;

	static {
		new Class83("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "()V")
	private Class4_Sub31() {
	}

	@OriginalMember(owner = "client!ni", name = "<init>", descriptor = "(S)V")
	public Class4_Sub31(@OriginalArg(0) short arg0) {
		this.aShort62 = arg0;
	}
}
