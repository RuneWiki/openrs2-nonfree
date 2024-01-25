import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ju")
public abstract class Class71 {

	static {
		new Class169("System update in: ", "System-Update in: ", "Mise à jour système dans : ", "Atualização do sistema em: ");
	}

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(I)[B")
	public abstract byte[] method1327();

	@OriginalMember(owner = "client!ju", name = "a", descriptor = "(B[B)V")
	public abstract void method1328(@OriginalArg(1) byte[] arg0);
}
