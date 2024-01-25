import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public final class Class2_Sub39 extends Class2 {

	@OriginalMember(owner = "client!tv", name = "n", descriptor = "Ljava/lang/String;")
	public String aString59;

	static {
		new Class256("You do not have a high enough rank to join this clan channel.", "Dein Rang reicht nicht aus, um diesen Chatraum zu betreten.", "Votre rang n'est pas assez élevé pour rejoindre ce canal de clan.", "Sua posição não é alta o suficiente para você entrar nesse canal de clã.");
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "()V")
	private Class2_Sub39() {
	}

	@OriginalMember(owner = "client!tv", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class2_Sub39(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString59 = arg0;
	}
}
