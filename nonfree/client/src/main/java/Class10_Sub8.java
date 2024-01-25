import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class Class10_Sub8 extends Class10 {

	@OriginalMember(owner = "client!wb", name = "i", descriptor = "Lclient!wb;")
	public Class10_Sub8 aClass10_Sub8_7;

	@OriginalMember(owner = "client!wb", name = "j", descriptor = "Lclient!wb;")
	public Class10_Sub8 aClass10_Sub8_8;

	static {
		new Class32("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!wb", name = "c", descriptor = "(I)V")
	public final void method4608() {
		if (this.aClass10_Sub8_7 != null) {
			this.aClass10_Sub8_7.aClass10_Sub8_8 = this.aClass10_Sub8_8;
			this.aClass10_Sub8_8.aClass10_Sub8_7 = this.aClass10_Sub8_7;
			this.aClass10_Sub8_7 = null;
			this.aClass10_Sub8_8 = null;
		}
	}
}
