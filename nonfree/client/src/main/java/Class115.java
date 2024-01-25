import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ff")
public final class Class115 {

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "I")
	public int anInt2411;

	@OriginalMember(owner = "client!ff", name = "h", descriptor = "[Lclient!nfa;")
	public Interface14[] anInterface14Array1;

	@OriginalMember(owner = "client!ff", name = "e", descriptor = "I")
	public int anInt2413;

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!c;ILclient!jc;)Lclient!nfa;")
	private Interface14 method2264(@OriginalArg(0) Class51 arg0, @OriginalArg(2) Class14_Sub21 arg1) {
		if (arg0 == Static410.aClass51_24) {
			return Static615.method8659(arg1);
		} else if (Static650.aClass51_34 == arg0) {
			return Static508.method7611(arg1);
		} else if (arg0 == Static410.aClass51_23) {
			return Static165.method2381(arg1);
		} else if (Static92.aClass51_35 == arg0) {
			return Static685.method4081(arg1);
		} else if (Static191.aClass51_13 == arg0) {
			return Static297.method4856(arg1);
		} else if (arg0 == Static210.aClass51_16) {
			return Static592.method8407(arg1);
		} else if (Static209.aClass51_36 == arg0) {
			return Static576.method8248(arg1);
		} else if (Static378.aClass51_20 == arg0) {
			return Static477.method7146(arg1);
		} else if (Static370.aClass51_19 == arg0) {
			return Static81.method1381(arg1);
		} else if (Static129.aClass51_6 == arg0) {
			return Static623.method8971(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ff", name = "a", descriptor = "(Lclient!jc;I)V")
	public void method2266(@OriginalArg(0) Class14_Sub21 arg0) {
		this.anInt2411 = arg0.method7719();
		this.anInt2413 = arg0.method7717(-1978450544);
		this.anInterface14Array1 = new Interface14[arg0.method7695(105)];
		@Pc(29) Class51[] local29 = Static195.method2933();
		for (@Pc(31) int local31 = 0; local31 < this.anInterface14Array1.length; local31++) {
			this.anInterface14Array1[local31] = this.method2264(local29[arg0.method7695(103)], arg0);
		}
	}
}
