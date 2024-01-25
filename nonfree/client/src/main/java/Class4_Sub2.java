import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public final class Class4_Sub2 extends Class4 {

	@OriginalMember(owner = "client!ai", name = "q", descriptor = "I")
	public final int anInt188;

	@OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
	public final int anInt186;

	static {
		new Class159("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(II)V")
	public Class4_Sub2(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt188 = arg1;
		this.anInt186 = arg0;
	}
}
