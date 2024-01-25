import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public abstract class Class1 {

	static {
		new Class32("Please wait until you are logged out of your previous channel.", "Bitte warte, bis du den vorherigen Chatraum verlassen hast.", "Veuillez attendre d'être déconnecté(e) de votre canal précédent.", "Aguarde até se desconectar do canal anterior.");
	}

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ZILclient!vc;IILclient!uq;I)V")
	public abstract void method5637(@OriginalArg(0) boolean arg0, @OriginalArg(2) Class63 arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3, @OriginalArg(5) Class1 arg4, @OriginalArg(6) int arg5);

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(Lclient!vc;I)Lclient!ep;")
	public abstract Class10_Sub3 method5640(@OriginalArg(0) Class63 arg0);

	@OriginalMember(owner = "client!uq", name = "c", descriptor = "(I)Z")
	public abstract boolean method5641();

	@OriginalMember(owner = "client!uq", name = "a", descriptor = "(ILclient!vc;II)Z")
	public abstract boolean method5642(@OriginalArg(1) Class63 arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2);

	@OriginalMember(owner = "client!uq", name = "d", descriptor = "(B)V")
	public abstract void method5643();

	@OriginalMember(owner = "client!uq", name = "b", descriptor = "(ZLclient!vc;)V")
	public abstract void method5644(@OriginalArg(1) Class63 arg0);
}
