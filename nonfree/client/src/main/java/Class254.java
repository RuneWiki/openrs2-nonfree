import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ve")
public final class Class254 {

	@OriginalMember(owner = "client!ve", name = "g", descriptor = "Lclient!ie;")
	private Class3 aClass3_252;

	@OriginalMember(owner = "client!ve", name = "d", descriptor = "I")
	private int anInt7244 = 0;

	@OriginalMember(owner = "client!ve", name = "e", descriptor = "Lclient!lp;")
	private final Class140 aClass140_40;

	static {
		new Class174("Login to a members' server to use this object.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Connectez-vous à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
	}

	@OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lclient!lp;)V")
	public Class254(@OriginalArg(0) Class140 arg0) {
		this.aClass140_40 = arg0;
	}

	@OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)Lclient!ie;")
	public Class3 method5859() {
		this.anInt7244 = 0;
		return this.method5863();
	}

	@OriginalMember(owner = "client!ve", name = "b", descriptor = "(I)Lclient!ie;")
	public Class3 method5863() {
		@Pc(27) Class3 local27;
		if (this.anInt7244 > 0 && this.aClass3_252 != this.aClass140_40.aClass3Array1[this.anInt7244 - 1]) {
			local27 = this.aClass3_252;
			this.aClass3_252 = local27.aClass3_268;
			return local27;
		}
		while (this.anInt7244 < this.aClass140_40.anInt4111) {
			local27 = this.aClass140_40.aClass3Array1[this.anInt7244++].aClass3_268;
			if (this.aClass140_40.aClass3Array1[this.anInt7244 - 1] != local27) {
				this.aClass3_252 = local27.aClass3_268;
				return local27;
			}
		}
		return null;
	}
}
