import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class150 {

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "Lclient!sm;")
	private Class210 aClass210_29;

	@OriginalMember(owner = "client!mk", name = "g", descriptor = "Lclient!ag;")
	private Class2 aClass2_143;

	static {
		new Class221("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "()V")
	public Class150() {
	}

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!sm;)V")
	public Class150(@OriginalArg(0) Class210 arg0) {
		this.aClass210_29 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lclient!ag;")
	public Class2 method3698() {
		@Pc(13) Class2 local13 = this.aClass2_143;
		if (this.aClass210_29.aClass2_199 == local13) {
			this.aClass2_143 = null;
			return null;
		} else {
			this.aClass2_143 = local13.aClass2_244;
			return local13;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(BLclient!sm;)V")
	public void method3699(@OriginalArg(1) Class210 arg0) {
		this.aClass210_29 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "b", descriptor = "(Z)Lclient!ag;")
	public Class2 method3700() {
		@Pc(8) Class2 local8 = this.aClass210_29.aClass2_199.aClass2_244;
		if (local8 == this.aClass210_29.aClass2_199) {
			this.aClass2_143 = null;
			return null;
		} else {
			this.aClass2_143 = local8.aClass2_244;
			return local8;
		}
	}
}
