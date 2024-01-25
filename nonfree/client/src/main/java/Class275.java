import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!raa")
public final class Class275 {

	@OriginalMember(owner = "client!raa", name = "b", descriptor = "[Lclient!dba;")
	public Interface2[] anInterface2Array1;

	@OriginalMember(owner = "client!raa", name = "e", descriptor = "I")
	public int anInt7736;

	@OriginalMember(owner = "client!raa", name = "h", descriptor = "I")
	public int anInt7738;

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(BLclient!io;)V")
	public void method6366(@OriginalArg(1) Class1_Sub20 arg0) {
		this.anInt7738 = arg0.method4396();
		this.anInt7736 = arg0.method4426();
		this.anInterface2Array1 = new Interface2[arg0.method4393()];
		@Pc(31) Class307[] local31 = Static73.method1592();
		for (@Pc(33) int local33 = 0; local33 < this.anInterface2Array1.length; local33++) {
			this.anInterface2Array1[local33] = this.method6367(arg0, local31[arg0.method4393()]);
		}
	}

	@OriginalMember(owner = "client!raa", name = "a", descriptor = "(Lclient!io;ILclient!tca;)Lclient!dba;")
	private Interface2 method6367(@OriginalArg(0) Class1_Sub20 arg0, @OriginalArg(2) Class307 arg1) {
		if (Static116.aClass307_4 == arg1) {
			return Static399.method5659(arg0);
		} else if (Static445.aClass307_9 == arg1) {
			return Static17.method510(arg0);
		} else if (arg1 == Static305.aClass307_11) {
			return Static517.method7093(arg0);
		} else if (Static279.aClass307_10 == arg1) {
			return Static124.method2124(arg0);
		} else if (arg1 == Static40.aClass307_14) {
			return Static480.method6743(arg0);
		} else if (arg1 == Static128.aClass307_5) {
			return Static262.method4099(arg0);
		} else if (arg1 == Static478.aClass307_15) {
			return Static126.method5474(arg0);
		} else if (arg1 == Static558.aClass307_17) {
			return Static595.method7934(arg0);
		} else if (arg1 == Static160.aClass307_16) {
			return Static454.method6384(arg0);
		} else if (Static474.aClass307_3 == arg1) {
			return Static355.method5195(arg0);
		} else {
			return null;
		}
	}
}
