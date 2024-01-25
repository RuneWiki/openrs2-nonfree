import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lb")
public final class Class171 {

	@OriginalMember(owner = "client!lb", name = "f", descriptor = "Lclient!hp;")
	private final Class125 aClass125_37 = new Class125(256);

	@OriginalMember(owner = "client!lb", name = "l", descriptor = "Lclient!e;")
	private final Interface4 anInterface4_11;

	@OriginalMember(owner = "client!lb", name = "j", descriptor = "Lclient!ad;")
	private final Class5_Sub1 aClass5_Sub1_21;

	static {
		new Class67("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");
		new Class67("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
	}

	@OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(Lclient!ad;Lclient!e;)V")
	public Class171(@OriginalArg(0) Class5_Sub1 arg0, @OriginalArg(1) Interface4 arg1) {
		this.anInterface4_11 = arg1;
		this.aClass5_Sub1_21 = arg0;
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(I)V")
	public void method4638() {
		this.aClass125_37.method3522(5);
	}

	@OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)Lclient!cs;")
	public Class11_Sub1 method4642(@OriginalArg(1) int arg0) {
		@Pc(18) Object local18 = this.aClass125_37.method3512((long) arg0);
		if (local18 != null) {
			return (Class11_Sub1) local18;
		} else if (this.anInterface4_11.method6708(arg0)) {
			@Pc(37) Class238 local37 = this.anInterface4_11.method6712(arg0);
			@Pc(46) int local46 = local37.aBoolean466 ? 64 : this.aClass5_Sub1_21.anInt365;
			@Pc(98) Class11_Sub1 local98;
			if (local37.aBoolean463 && this.aClass5_Sub1_21.method7441()) {
				@Pc(110) float[] local110 = this.anInterface4_11.method6709(local46, local46, 0.7F, arg0);
				local98 = new Class11_Sub1(this.aClass5_Sub1_21, 3553, 34842, local46, local46, local37.aByte72 != 0, local110, 6408);
			} else {
				@Pc(66) int[] local66;
				if (local37.aBoolean465) {
					local66 = this.anInterface4_11.method6707(local46, arg0, local46, 0.7F);
				} else {
					local66 = this.anInterface4_11.method6711(local46, 0.7F, arg0, local46, true);
				}
				local98 = new Class11_Sub1(this.aClass5_Sub1_21, 3553, 6408, local46, local46, local37.aByte72 != 0, local66, false);
			}
			local98.method605(local37.aBoolean462, local37.aBoolean469);
			this.aClass125_37.method3519((long) arg0, local98);
			return local98;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!lb", name = "b", descriptor = "(I)V")
	public void method4643() {
		this.aClass125_37.method3521();
	}
}
