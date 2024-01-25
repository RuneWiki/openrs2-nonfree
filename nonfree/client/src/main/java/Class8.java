import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class Class8 {

	static {
		new Class15("You are not allowed to talk in this clan channel.", "Du darfst in diesem Chatraum nicht reden.", "Vous n'êtes pas autorisé à parler dans ce canal de clan.", "Você não tem permissão para conversar neste canal de clã.");
	}

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)Z")
	public abstract boolean method5873();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!gg;IZIIILclient!ya;)V")
	public abstract void method5875(@OriginalArg(0) Class8 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(6) Class135 arg5);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(Lclient!ya;I)V")
	public abstract void method5877(@OriginalArg(0) Class135 arg0);

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ILclient!ya;II)Z")
	public abstract boolean method5878(@OriginalArg(1) Class135 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!gg", name = "b", descriptor = "(B)V")
	public abstract void method5879();

	@OriginalMember(owner = "client!gg", name = "a", descriptor = "(ZLclient!ya;)Lclient!lo;")
	public abstract Class20_Sub5 method5880(@OriginalArg(1) Class135 arg0);
}
