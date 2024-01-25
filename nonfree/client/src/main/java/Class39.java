import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!co")
public final class Class39 {

	@OriginalMember(owner = "client!co", name = "h", descriptor = "[Lclient!os;")
	public static final Class184[] aClass184Array1;

	@OriginalMember(owner = "client!co", name = "c", descriptor = "I")
	public int anInt1559;

	@OriginalMember(owner = "client!co", name = "d", descriptor = "I")
	public int anInt1560;

	@OriginalMember(owner = "client!co", name = "e", descriptor = "I")
	public int anInt1561;

	static {
		new Class256("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
		aClass184Array1 = new Class184[5];
		for (@Pc(16) int local16 = 0; local16 < aClass184Array1.length; local16++) {
			aClass184Array1[local16] = new Class184();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!md;BI)V")
	private void method1138(@OriginalArg(0) Class2_Sub20 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1561 = arg0.method3711();
			this.anInt1559 = arg0.method3737();
			this.anInt1560 = arg0.method3737();
		}
	}

	@OriginalMember(owner = "client!co", name = "a", descriptor = "(Lclient!md;I)V")
	public void method1139(@OriginalArg(0) Class2_Sub20 arg0) {
		while (true) {
			@Pc(14) int local14 = arg0.method3737();
			if (local14 == 0) {
				return;
			}
			this.method1138(arg0, local14);
		}
	}
}
