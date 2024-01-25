import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!lk")
public final class Class147 {

	@OriginalMember(owner = "client!lk", name = "f", descriptor = "C")
	public char aChar4;

	@OriginalMember(owner = "client!lk", name = "d", descriptor = "I")
	public int anInt4158 = 1;

	static {
		new Class84("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(BLclient!lh;)V")
	public void method3432(@OriginalArg(1) Class1_Sub1 arg0) {
		while (true) {
			@Pc(13) int local13 = arg0.method4130();
			if (local13 == 0) {
				return;
			}
			this.method3434(local13, arg0);
		}
	}

	@OriginalMember(owner = "client!lk", name = "a", descriptor = "(IILclient!lh;)V")
	private void method3434(@OriginalArg(0) int arg0, @OriginalArg(2) Class1_Sub1 arg1) {
		if (arg0 == 1) {
			this.aChar4 = Static423.method5682(arg1.method4112());
		} else if (arg0 == 2) {
			this.anInt4158 = 0;
		}
	}
}
