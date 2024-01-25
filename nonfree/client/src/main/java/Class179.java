import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pf")
public final class Class179 {

	@OriginalMember(owner = "client!pf", name = "j", descriptor = "Lclient!rj;")
	private Class2_Sub7 aClass2_Sub7_44;

	@OriginalMember(owner = "client!pf", name = "f", descriptor = "Lclient!rj;")
	private final Class2_Sub7 aClass2_Sub7_43 = new Class2_Sub7();

	static {
		new Class136("", 73);
		new Class62("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
	}

	@OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
	public Class179() {
		this.aClass2_Sub7_43.aClass2_Sub7_54 = this.aClass2_Sub7_43;
		this.aClass2_Sub7_43.aClass2_Sub7_53 = this.aClass2_Sub7_43;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)Lclient!rj;")
	public Class2_Sub7 method4487() {
		@Pc(12) Class2_Sub7 local12 = this.aClass2_Sub7_43.aClass2_Sub7_53;
		if (local12 == this.aClass2_Sub7_43) {
			this.aClass2_Sub7_44 = null;
			return null;
		} else {
			this.aClass2_Sub7_44 = local12.aClass2_Sub7_53;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pf", name = "b", descriptor = "(I)V")
	public void method4489() {
		while (true) {
			@Pc(9) Class2_Sub7 local9 = this.aClass2_Sub7_43.aClass2_Sub7_53;
			if (local9 == this.aClass2_Sub7_43) {
				this.aClass2_Sub7_44 = null;
				return;
			}
			local9.method6085();
		}
	}

	@OriginalMember(owner = "client!pf", name = "c", descriptor = "(I)Lclient!rj;")
	public Class2_Sub7 method4490() {
		@Pc(7) Class2_Sub7 local7 = this.aClass2_Sub7_43.aClass2_Sub7_53;
		if (this.aClass2_Sub7_43 == local7) {
			return null;
		} else {
			local7.method6085();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Lclient!rj;I)V")
	public void method4491(@OriginalArg(0) Class2_Sub7 arg0) {
		if (arg0.aClass2_Sub7_54 != null) {
			arg0.method6085();
		}
		arg0.aClass2_Sub7_53 = this.aClass2_Sub7_43;
		arg0.aClass2_Sub7_54 = this.aClass2_Sub7_43.aClass2_Sub7_54;
		arg0.aClass2_Sub7_54.aClass2_Sub7_53 = arg0;
		arg0.aClass2_Sub7_53.aClass2_Sub7_54 = arg0;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)I")
	public int method4493() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class2_Sub7 local17 = this.aClass2_Sub7_43.aClass2_Sub7_53;
		while (this.aClass2_Sub7_43 != local17) {
			local17 = local17.aClass2_Sub7_53;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pf", name = "a", descriptor = "(Z)Lclient!rj;")
	public Class2_Sub7 method4494() {
		@Pc(12) Class2_Sub7 local12 = this.aClass2_Sub7_44;
		if (this.aClass2_Sub7_43 == local12) {
			this.aClass2_Sub7_44 = null;
			return null;
		} else {
			this.aClass2_Sub7_44 = local12.aClass2_Sub7_53;
			return local12;
		}
	}
}
