import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
public final class Class66 {

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "[I")
	public int[] anIntArray218;

	@OriginalMember(owner = "client!eb", name = "g", descriptor = "I")
	public int anInt1982 = -1;

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "I")
	public int anInt1979 = -1;

	static {
		new Class202("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ps;B)V")
	public void method1925(@OriginalArg(0) Class2_Sub29 arg0) {
		while (true) {
			@Pc(5) int local5 = arg0.method5170();
			if (local5 == 0) {
				return;
			}
			this.method1926(arg0, local5);
		}
	}

	@OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lclient!ps;IB)V")
	private void method1926(@OriginalArg(0) Class2_Sub29 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.anInt1979 = arg0.method5229();
		} else if (arg1 == 2) {
			this.anIntArray218 = new int[arg0.method5170()];
			for (@Pc(40) int local40 = 0; local40 < this.anIntArray218.length; local40++) {
				this.anIntArray218[local40] = arg0.method5229();
			}
		} else if (arg1 == 3) {
			this.anInt1982 = arg0.method5170();
		}
	}
}
