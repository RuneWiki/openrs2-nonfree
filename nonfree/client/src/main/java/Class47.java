import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public abstract class Class47 {

	static {
		new Class96("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
	}

	@OriginalMember(owner = "client!ha", name = "d", descriptor = "(I)V")
	public abstract void method5723();

	@OriginalMember(owner = "client!ha", name = "e", descriptor = "(I)Z")
	public abstract boolean method5725();

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIILclient!qa;)Z")
	public abstract boolean method5727(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) Class121 arg2);

	@OriginalMember(owner = "client!ha", name = "c", descriptor = "(Lclient!qa;I)V")
	public abstract void method5732(@OriginalArg(0) Class121 arg0);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(IILclient!qa;IZLclient!ha;I)V")
	public abstract void method5733(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) Class121 arg2, @OriginalArg(4) boolean arg3, @OriginalArg(5) Class47 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILclient!qa;)Lclient!bw;")
	public abstract Class36_Sub1 method5734(@OriginalArg(1) Class121 arg0);
}
