import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iq")
public final class Class1_Sub2_Sub10 extends Class1_Sub2 {

	@OriginalMember(owner = "client!iq", name = "B", descriptor = "[B")
	public final byte[] aByteArray51;

	static {
		new Class45("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!iq", name = "<init>", descriptor = "([B)V")
	public Class1_Sub2_Sub10(@OriginalArg(0) byte[] arg0) {
		this.aByteArray51 = arg0;
	}
}
