import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ne")
public final class Class230 {

	@OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lclient!wba;")
	public Interface23[] anInterface23Array1;

	@OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
	public int anInt6658;

	@OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
	public int anInt6661;

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lclient!un;Lclient!sq;I)Lclient!wba;")
	private Interface23 method5583(@OriginalArg(0) Class4_Sub11 arg0, @OriginalArg(1) Class307 arg1) {
		if (arg1 == Static134.aClass307_4) {
			return Static431.method6745(arg0);
		} else if (Static115.aClass307_3 == arg1) {
			return Static371.method5956(arg0);
		} else if (Static31.aClass307_1 == arg1) {
			return Static585.method7996(arg0);
		} else if (arg1 == Static479.aClass307_13) {
			return Static55.method6495(arg0);
		} else if (Static196.aClass307_5 == arg1) {
			return Static372.method5972(arg0);
		} else if (Static325.aClass307_14 == arg1) {
			return Static542.method7872(arg0);
		} else if (Static283.aClass307_15 == arg1) {
			return Static243.method3889(arg0);
		} else if (Static268.aClass307_6 == arg1) {
			return Static57.method966(arg0);
		} else if (arg1 == Static397.aClass307_11) {
			return Static89.method2081(arg0);
		} else if (arg1 == Static74.aClass307_2) {
			return Static312.method5277(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLclient!un;)V")
	public void method5584(@OriginalArg(1) Class4_Sub11 arg0) {
		this.anInt6661 = arg0.method4934();
		this.anInt6658 = arg0.method4936();
		this.anInterface23Array1 = new Interface23[arg0.method4905()];
		@Pc(29) Class307[] local29 = Static6.method138();
		for (@Pc(31) int local31 = 0; local31 < this.anInterface23Array1.length; local31++) {
			this.anInterface23Array1[local31] = this.method5583(arg0, local29[arg0.method4905()]);
		}
	}
}
