import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oq")
public final class Class185 {

	@OriginalMember(owner = "client!oq", name = "c", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!oq", name = "f", descriptor = "I")
	public int anInt5127 = 1;

	static {
		new Class7("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(Lclient!hp;II)V")
	private void method4251(@OriginalArg(0) Class1_Sub5 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.aChar4 = Static246.method4274(arg0.method5416());
		} else if (arg1 == 2) {
			this.anInt5127 = 0;
		}
	}

	@OriginalMember(owner = "client!oq", name = "a", descriptor = "(ZLclient!hp;)V")
	public void method4252(@OriginalArg(1) Class1_Sub5 arg0) {
		while (true) {
			@Pc(7) int local7 = arg0.method5366();
			if (local7 == 0) {
				return;
			}
			this.method4251(arg0, local7);
		}
	}
}
