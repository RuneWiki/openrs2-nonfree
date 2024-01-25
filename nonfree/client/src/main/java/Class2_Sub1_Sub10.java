import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lu")
public final class Class2_Sub1_Sub10 extends Class2_Sub1 {

	@OriginalMember(owner = "client!lu", name = "u", descriptor = "I")
	public int anInt4234 = 0;

	static {
		new Class231("Invalid channel name entered!", "Ungültiger Chatraum-Name angegeben.", "Nom de canal incorrect !", "Nome de canal inválido!");
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(ZLclient!hw;)V")
	public void method3410(@OriginalArg(1) Class2_Sub17 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method6138();
			if (local11 == 0) {
				return;
			}
			this.method3412(local11, arg0);
		}
	}

	@OriginalMember(owner = "client!lu", name = "a", descriptor = "(IILclient!hw;)V")
	private void method3412(@OriginalArg(1) int arg0, @OriginalArg(2) Class2_Sub17 arg1) {
		if (arg0 == 2) {
			this.anInt4234 = arg1.method6148();
		}
	}
}
