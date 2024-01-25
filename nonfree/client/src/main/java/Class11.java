import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public abstract class Class11 {

	static {
		new Class142("Chat disabled", "Deaktiviert", "Messagerie désactivée", "Bate-papo desativado");
	}

	@OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V")
	public abstract void method5177();

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILclient!za;ILclient!ge;IZI)V")
	public abstract void method5179(@OriginalArg(1) Class117 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class11 arg2, @OriginalArg(4) int arg3, @OriginalArg(5) boolean arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(IILclient!za;I)Z")
	public abstract boolean method5180(@OriginalArg(1) int arg0, @OriginalArg(2) Class117 arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(Lclient!za;B)Lclient!kf;")
	public abstract Class111_Sub3 method5181(@OriginalArg(0) Class117 arg0);

	@OriginalMember(owner = "client!ge", name = "a", descriptor = "(Lclient!za;I)V")
	public abstract void method5182(@OriginalArg(0) Class117 arg0);

	@OriginalMember(owner = "client!ge", name = "b", descriptor = "(B)Z")
	public abstract boolean method5183();
}
