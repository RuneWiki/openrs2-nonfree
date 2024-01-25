import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ks")
public final class Class4_Sub1_Sub1 extends Class4_Sub1 {

	@OriginalMember(owner = "client!ks", name = "G", descriptor = "I")
	public final int anInt3922 = (int) (Static27.method359() / 1000L);

	@OriginalMember(owner = "client!ks", name = "D", descriptor = "Ljava/lang/String;")
	public final String aString46;

	@OriginalMember(owner = "client!ks", name = "K", descriptor = "S")
	public final short aShort57;

	static {
		new Class119("Unable to send abuse report - system busy.", "Meldung konnte nicht gesendet werden - Systeme überlastet", "Impossible de signaler un abus - Erreur système", "Sistema ocupado. Não foi possível enviar sua denúncia de abuso.");
	}

	@OriginalMember(owner = "client!ks", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
	public Class4_Sub1_Sub1(@OriginalArg(0) String arg0, @OriginalArg(1) int arg1) {
		this.aString46 = arg0;
		this.aShort57 = (short) arg1;
	}
}
