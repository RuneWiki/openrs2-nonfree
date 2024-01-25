import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public abstract class Class78 {

	static {
		new Class40("That player is offline, or has privacy mode enabled.", "Dieser Spieler ist offline oder hat den Privatsphären-Modus aktiviert.", "Ce joueur est déconnecté ou en mode privé.", "O jogador está offline ou está com o modo de privacidade ativado.");
	}

	@OriginalMember(owner = "client!m", name = "ma", descriptor = "(I)V")
	public abstract void ma(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "ta", descriptor = "(I)V")
	public abstract void ta(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "TA", descriptor = "(III)V")
	public abstract void TA(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!m", name = "EA", descriptor = "(Lclient!m;)V")
	public abstract void EA(@OriginalArg(0) Class78 arg0);

	@OriginalMember(owner = "client!m", name = "a", descriptor = "()Lclient!m;")
	public abstract Class78 method5707();

	@OriginalMember(owner = "client!m", name = "a", descriptor = "(III[I)V")
	public abstract void method5708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!m", name = "KA", descriptor = "(I)V")
	public abstract void KA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "XA", descriptor = "(I)V")
	public abstract void XA(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "ha", descriptor = "()V")
	public abstract void ha();

	@OriginalMember(owner = "client!m", name = "oa", descriptor = "(III)V")
	public abstract void oa(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!m", name = "I", descriptor = "(III[I)V")
	public abstract void I(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int[] arg3);

	@OriginalMember(owner = "client!m", name = "k", descriptor = "(I)V")
	public abstract void k(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!m", name = "B", descriptor = "(IIIIII)V")
	public abstract void B(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5);

	@OriginalMember(owner = "client!m", name = "va", descriptor = "([I)V")
	public abstract void va(@OriginalArg(0) int[] arg0);
}
