import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!or")
public abstract class Class31 {

	static {
		new Class7("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(BLclient!ya;II)Z")
	public abstract boolean method5968(@OriginalArg(1) Class39 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ya;Z)V")
	public abstract void method5969(@OriginalArg(0) Class39 arg0);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Z)V")
	public abstract void method5970();

	@OriginalMember(owner = "client!or", name = "f", descriptor = "(I)Z")
	public abstract boolean method5971();

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(IILclient!ya;ILclient!or;IZ)V")
	public abstract void method5972(@OriginalArg(1) int arg0, @OriginalArg(2) Class39 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) Class31 arg3, @OriginalArg(5) int arg4, @OriginalArg(6) boolean arg5);

	@OriginalMember(owner = "client!or", name = "a", descriptor = "(Lclient!ya;I)Lclient!ag;")
	public abstract Class4_Sub1 method5973(@OriginalArg(0) Class39 arg0);
}
