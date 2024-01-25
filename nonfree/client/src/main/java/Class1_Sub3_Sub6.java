import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public abstract class Class1_Sub3_Sub6 extends Class1_Sub3 {

	@OriginalMember(owner = "client!ef", name = "B", descriptor = "Lclient!go;")
	public final Interface2 anInterface2_3;

	@OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
	public final int anInt4209;

	static {
		new Class142("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Lclient!go;I)V")
	protected Class1_Sub3_Sub6(@OriginalArg(0) Interface2 arg0, @OriginalArg(1) int arg1) {
		this.anInterface2_3 = arg0;
		this.anInt4209 = arg1;
	}

	@OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)Z")
	public abstract boolean method3327();

	@OriginalMember(owner = "client!ef", name = "b", descriptor = "(Z)Ljava/lang/Object;")
	public abstract Object method3329();
}
