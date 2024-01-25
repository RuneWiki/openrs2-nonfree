import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!rm")
public final class Class311 {

	@OriginalMember(owner = "client!rm", name = "d", descriptor = "[Lclient!ev;")
	public Interface9[] anInterface9Array1;

	@OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
	public int anInt8694;

	@OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
	public int anInt8696;

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(BLclient!fca;Lclient!aca;)Lclient!ev;")
	private Interface9 method7354(@OriginalArg(1) Class3_Sub17 arg0, @OriginalArg(2) Class6 arg1) {
		if (Static332.aClass6_19 == arg1) {
			return Static411.method5828(arg0);
		} else if (arg1 == Static109.aClass6_8) {
			return Static388.method5654(arg0);
		} else if (arg1 == Static492.aClass6_32) {
			return Static538.method7477(arg0);
		} else if (arg1 == Static397.aClass6_23) {
			return Static335.method5129(arg0);
		} else if (Static404.aClass6_25 == arg1) {
			return Static546.method7556(arg0);
		} else if (arg1 == Static140.aClass6_10) {
			return Static195.method3091(arg0);
		} else if (Static387.aClass6_22 == arg1) {
			return Static571.method7725(arg0);
		} else if (Static199.aClass6_39 == arg1) {
			return Static532.method7414(arg0);
		} else if (arg1 == Static402.aClass6_24) {
			return Static57.method6340(arg0);
		} else if (Static41.aClass6_5 == arg1) {
			return Static248.method3938(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lclient!fca;I)V")
	public void method7357(@OriginalArg(0) Class3_Sub17 arg0) {
		this.anInt8694 = arg0.method4862();
		this.anInt8696 = arg0.method4858();
		this.anInterface9Array1 = new Interface9[arg0.method4888()];
		@Pc(29) Class6[] local29 = Static510.method7232();
		for (@Pc(31) int local31 = 0; local31 < this.anInterface9Array1.length; local31++) {
			this.anInterface9Array1[local31] = this.method7354(arg0, local29[arg0.method4888()]);
		}
	}
}
