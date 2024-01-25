import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public abstract class Class1_Sub6_Sub3 extends Class1_Sub6 {

	@OriginalMember(owner = "client!in", name = "s", descriptor = "I")
	public final int anInt2655;

	static {
		new Class169("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!in", name = "<init>", descriptor = "(I)V")
	protected Class1_Sub6_Sub3(@OriginalArg(0) int arg0) {
		this.anInt2655 = arg0;
	}

	@OriginalMember(owner = "client!in", name = "a", descriptor = "(B)Z")
	public abstract boolean method2160();

	@OriginalMember(owner = "client!in", name = "b", descriptor = "(B)Ljava/lang/Object;")
	public abstract Object method2161();
}
