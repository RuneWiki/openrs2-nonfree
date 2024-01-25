import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class74 {

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "I")
	public int anInt1872;

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "I")
	public int anInt1873;

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "I")
	public int anInt1876;

	static {
		new Class85("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(BLclient!rg;)V")
	public void method1778(@OriginalArg(1) Class5_Sub12 arg0) {
		while (true) {
			@Pc(11) int local11 = arg0.method5115();
			if (local11 == 0) {
				return;
			}
			this.method1781(arg0, local11);
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!rg;II)V")
	private void method1781(@OriginalArg(0) Class5_Sub12 arg0, @OriginalArg(2) int arg1) {
		if (arg1 == 1) {
			this.anInt1872 = arg0.method5106();
			this.anInt1876 = arg0.method5115();
			this.anInt1873 = arg0.method5115();
		}
	}
}
