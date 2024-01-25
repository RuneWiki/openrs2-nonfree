import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public final class Class118 {

	@OriginalMember(owner = "client!jf", name = "d", descriptor = "I")
	public int anInt3450;

	@OriginalMember(owner = "client!jf", name = "a", descriptor = "[I")
	public final int[] anIntArray215;

	@OriginalMember(owner = "client!jf", name = "h", descriptor = "[I")
	public final int[] anIntArray216;

	static {
		new Class174("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(I)V")
	public Class118(@OriginalArg(0) int arg0) {
		this.anInt3450 = arg0;
		this.anIntArray215 = new int[this.anInt3450];
		this.anIntArray216 = new int[this.anInt3450];
	}
}
