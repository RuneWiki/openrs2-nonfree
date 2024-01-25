import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public abstract class Class23 {

	static {
		new Class231("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!bd", name = "a", descriptor = "(Lclient!hl;B)Lclient!hl;")
	public abstract Class6_Sub1_Sub11 method5895(@OriginalArg(0) Class6_Sub1_Sub11 arg0);
}
