import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public final class Class46_Sub1 extends Class46 {

	@OriginalMember(owner = "client!oe", name = "p", descriptor = "[I")
	public final int[] anIntArray403;

	@OriginalMember(owner = "client!oe", name = "o", descriptor = "[I")
	public final int[] anIntArray402;

	static {
		new Class85("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "(II[I[I)V")
	public Class46_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3) {
		this.anIntArray403 = arg2;
		this.anIntArray402 = arg3;
	}
}
