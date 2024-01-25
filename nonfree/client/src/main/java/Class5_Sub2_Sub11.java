import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ow")
public abstract class Class5_Sub2_Sub11 extends Class5_Sub2 {

	@OriginalMember(owner = "client!ow", name = "w", descriptor = "I")
	public final int anInt6040;

	static {
		new Class40("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!ow", name = "<init>", descriptor = "(I)V")
	protected Class5_Sub2_Sub11(@OriginalArg(0) int arg0) {
		this.anInt6040 = arg0;
	}

	@OriginalMember(owner = "client!ow", name = "a", descriptor = "(I)Ljava/lang/Object;")
	public abstract Object method5022();

	@OriginalMember(owner = "client!ow", name = "b", descriptor = "(B)Z")
	public abstract boolean method5024();
}
