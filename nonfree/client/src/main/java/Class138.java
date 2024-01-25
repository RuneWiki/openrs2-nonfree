import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public abstract class Class138 {

	static {
		new Class117("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!pa", name = "<init>", descriptor = "()V")
	protected Class138() {
	}

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(II)V")
	public abstract void method3682(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pa", name = "c", descriptor = "(I)Lclient!vk;")
	public abstract Class206 method3685();

	@OriginalMember(owner = "client!pa", name = "b", descriptor = "(II)[B")
	public abstract byte[] method3686(@OriginalArg(1) int arg0);

	@OriginalMember(owner = "client!pa", name = "a", descriptor = "(IZ)I")
	public abstract int method3688(@OriginalArg(0) int arg0);
}
