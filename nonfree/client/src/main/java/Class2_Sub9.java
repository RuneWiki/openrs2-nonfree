import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public final class Class2_Sub9 extends Class2 {

	@OriginalMember(owner = "client!ds", name = "r", descriptor = "J")
	public long aLong31;

	static {
		new Class62("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "()V")
	private Class2_Sub9() {
	}

	@OriginalMember(owner = "client!ds", name = "<init>", descriptor = "(J)V")
	public Class2_Sub9(@OriginalArg(0) long arg0) {
		this.aLong31 = arg0;
	}
}
