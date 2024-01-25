import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public abstract class Class11_Sub1 extends Class11 {

	@OriginalMember(owner = "client!fv", name = "g", descriptor = "I")
	protected int anInt3192;

	@OriginalMember(owner = "client!fv", name = "h", descriptor = "I")
	protected final int anInt3193;

	@OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
	protected int anInt3189;

	@OriginalMember(owner = "client!fv", name = "f", descriptor = "I")
	public final int anInt3191;

	static {
		new Class231("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!fv", name = "<init>", descriptor = "(IIII)V")
	protected Class11_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		this.anInt3192 = arg2;
		this.anInt3193 = arg1;
		this.anInt3189 = arg0;
		this.anInt3191 = arg3;
	}
}
