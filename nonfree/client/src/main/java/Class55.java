import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dl")
public final class Class55 {

	@OriginalMember(owner = "client!dl", name = "j", descriptor = "Lclient!dp;")
	private Class57_Sub1 aClass57_Sub1_2;

	@OriginalMember(owner = "client!dl", name = "f", descriptor = "Lclient!dp;")
	public final Class57_Sub1 aClass57_Sub1_1 = new Class57_Sub1();

	static {
		new Class140("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V")
	public Class55() {
		this.aClass57_Sub1_1.aClass57_Sub1_7 = this.aClass57_Sub1_1;
		this.aClass57_Sub1_1.aClass57_Sub1_8 = this.aClass57_Sub1_1;
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)Lclient!dp;")
	public Class57_Sub1 method1296() {
		@Pc(7) Class57_Sub1 local7 = this.aClass57_Sub1_1.aClass57_Sub1_7;
		if (local7 == this.aClass57_Sub1_1) {
			this.aClass57_Sub1_2 = null;
			return null;
		} else {
			this.aClass57_Sub1_2 = local7.aClass57_Sub1_7;
			return local7;
		}
	}

	@OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lclient!dp;I)V")
	public void method1297(@OriginalArg(0) Class57_Sub1 arg0) {
		if (arg0.aClass57_Sub1_8 != null) {
			arg0.method2539();
		}
		arg0.aClass57_Sub1_8 = this.aClass57_Sub1_1.aClass57_Sub1_8;
		arg0.aClass57_Sub1_7 = this.aClass57_Sub1_1;
		arg0.aClass57_Sub1_8.aClass57_Sub1_7 = arg0;
		arg0.aClass57_Sub1_7.aClass57_Sub1_8 = arg0;
	}

	@OriginalMember(owner = "client!dl", name = "b", descriptor = "(B)V")
	public void method1298() {
		while (true) {
			@Pc(9) Class57_Sub1 local9 = this.aClass57_Sub1_1.aClass57_Sub1_7;
			if (this.aClass57_Sub1_1 == local9) {
				this.aClass57_Sub1_2 = null;
				return;
			}
			local9.method2539();
		}
	}

	@OriginalMember(owner = "client!dl", name = "c", descriptor = "(B)Lclient!dp;")
	public Class57_Sub1 method1299() {
		@Pc(15) Class57_Sub1 local15 = this.aClass57_Sub1_2;
		if (this.aClass57_Sub1_1 == local15) {
			this.aClass57_Sub1_2 = null;
			return null;
		} else {
			this.aClass57_Sub1_2 = local15.aClass57_Sub1_7;
			return local15;
		}
	}
}
