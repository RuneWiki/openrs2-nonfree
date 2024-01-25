import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public abstract class Class38 {

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "Lclient!nq;")
	protected final Class167_Sub1 aClass167_Sub1_42;

	static {
		new Class174("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!nq;)V")
	public Class38(@OriginalArg(0) Class167_Sub1 arg0) {
		this.aClass167_Sub1_42 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IBI)V")
	public abstract void method5703(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!hw", name = "b", descriptor = "(B)Z")
	public abstract boolean method5704();

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(I)V")
	public abstract void method5706();

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ)V")
	public abstract void method5707(@OriginalArg(1) boolean arg0);

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZB)V")
	public abstract void method5708(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(ZLclient!lr;I)V")
	public abstract void method5710(@OriginalArg(1) Class137 arg0, @OriginalArg(2) int arg1);
}
