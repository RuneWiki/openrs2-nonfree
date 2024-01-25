import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public final class Class7_Sub4_Sub17 extends Class7_Sub4 {

	@OriginalMember(owner = "client!wb", name = "q", descriptor = "I")
	public int anInt7334 = 0;

	static {
		new Class55("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
		new Class55(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(IILclient!gk;)V")
	private void method5636(@OriginalArg(1) int arg0, @OriginalArg(2) Class7_Sub14 arg1) {
		if (arg0 == 2) {
			this.anInt7334 = arg1.method3943();
		}
	}

	@OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method5637(@OriginalArg(0) Class7_Sub14 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method3981();
			if (local13 == 0) {
				return;
			}
			this.method5636(local13, arg0);
		}
	}
}
