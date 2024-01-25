import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public final class Class2_Sub21 extends Class2 {

	@OriginalMember(owner = "client!jk", name = "n", descriptor = "J")
	public long aLong159;

	static {
		new Class231("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
	private Class2_Sub21() {
	}

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(J)V")
	public Class2_Sub21(@OriginalArg(0) long arg0) {
		this.aLong159 = arg0;
	}
}
