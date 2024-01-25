import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ag")
public final class Class7 {

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
	public int anInt105 = 0;

	static {
		new Class231("Unable to delete name - system busy.", "Name konnte nicht gelöscht werden - Systemfehler.", "Impossible d'effacer le nom - système occupé.", "Não foi possível deletar o nome - sistema ocupado.");
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(Lclient!hw;II)V")
	private void method89(@OriginalArg(0) Class2_Sub17 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 5) {
			this.anInt105 = arg0.method6148();
		}
	}

	@OriginalMember(owner = "client!ag", name = "a", descriptor = "(ILclient!hw;)V")
	public void method91(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(9) int local9 = arg0.method6138();
			if (local9 == 0) {
				return;
			}
			this.method89(arg0, local9);
		}
	}
}
