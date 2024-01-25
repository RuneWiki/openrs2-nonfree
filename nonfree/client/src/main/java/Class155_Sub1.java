import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public abstract class Class155_Sub1 extends Class155 {

	static {
		new Class209("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	protected Class155_Sub1() {
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Lclient!vg;")
	public abstract Class55_Sub4 method3951();
}
