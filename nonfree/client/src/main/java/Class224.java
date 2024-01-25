import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sd")
public final class Class224 {

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
	public int anInt6133;

	@OriginalMember(owner = "client!sd", name = "c", descriptor = "C")
	private char aChar5;

	@OriginalMember(owner = "client!sd", name = "d", descriptor = "Ljava/lang/String;")
	public String aString56;

	@OriginalMember(owner = "client!sd", name = "g", descriptor = "Z")
	public boolean aBoolean533 = true;

	static {
		new Class189("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(Lclient!cu;I)V")
	public void method4787(@OriginalArg(0) Class3_Sub7 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method2582();
			if (local3 == 0) {
				return;
			}
			this.method4788(local3, arg0);
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(IILclient!cu;)V")
	private void method4788(@OriginalArg(0) int arg0, @OriginalArg(2) Class3_Sub7 arg1) {
		if (arg0 == 1) {
			this.aChar5 = Static35.method718(arg1.method2612());
		} else if (arg0 == 2) {
			this.anInt6133 = arg1.method2589();
		} else if (arg0 == 4) {
			this.aBoolean533 = false;
		} else if (arg0 == 5) {
			this.aString56 = arg1.method2620();
			return;
		}
	}

	@OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)Z")
	public boolean method4789() {
		return this.aChar5 == 's';
	}
}
