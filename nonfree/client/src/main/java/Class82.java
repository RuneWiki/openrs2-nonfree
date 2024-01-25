import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class Class82 {

	static {
		new Class142("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
	}

	@OriginalMember(owner = "client!fi", name = "<init>", descriptor = "()V")
	protected Class82() {
	}

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IZ)[B")
	public abstract byte[] method2263(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(I)Lclient!vv;")
	public abstract Class268 method2265();

	@OriginalMember(owner = "client!fi", name = "a", descriptor = "(IB)V")
	public abstract void method2266(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!fi", name = "b", descriptor = "(IB)I")
	public abstract int method2267(@OriginalArg(0) int arg0);
}
