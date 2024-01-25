import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public abstract class Class162 {

	static {
		new Class32("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!mq", name = "a", descriptor = "(I)J")
	public abstract long method4026();

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(I)I")
	public abstract int method4027();

	@OriginalMember(owner = "client!mq", name = "b", descriptor = "(B)I")
	public abstract int method4028();

	@OriginalMember(owner = "client!mq", name = "c", descriptor = "(I)Z")
	public abstract boolean method4031();

	@OriginalMember(owner = "client!mq", name = "d", descriptor = "(I)C")
	public abstract char method4033();
}
