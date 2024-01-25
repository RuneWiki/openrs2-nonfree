import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!iu")
public final class Class159 {

	@OriginalMember(owner = "client!iu", name = "b", descriptor = "[Lclient!mc;")
	public Interface12[] anInterface12Array1;

	@OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
	public int anInt4804;

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!iaa;BLclient!qv;)Lclient!mc;")
	private Interface12 method4122(@OriginalArg(0) Class6_Sub26 arg0, @OriginalArg(2) Class271 arg1) {
		if (Static125.aClass271_2 == arg1) {
			return Static378.method5983(arg0);
		} else if (Static511.aClass271_9 == arg1) {
			return Static305.method4919(arg0);
		} else if (Static508.aClass271_8 == arg1) {
			return Static246.method4283(arg0);
		} else if (arg1 == Static502.aClass271_7) {
			return Static342.method5388(arg0);
		} else if (arg1 == Static249.aClass271_4) {
			return Static206.method3813(arg0);
		} else if (arg1 == Static260.aClass271_5) {
			return Static489.method7369(arg0);
		} else if (Static47.aClass271_1 == arg1) {
			return Static90.method2004(arg0);
		} else if (arg1 == Static451.aClass271_6) {
			return Static540.method8013(arg0);
		} else if (arg1 == Static224.aClass271_3) {
			return Static203.method3793(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!iu", name = "a", descriptor = "(Lclient!iaa;I)V")
	public void method4123(@OriginalArg(0) Class6_Sub26 arg0) {
		this.anInt4804 = arg0.method4966();
		this.anInterface12Array1 = new Interface12[arg0.method4966()];
		@Pc(23) Class271[] local23 = Static152.method2946();
		for (@Pc(25) int local25 = 0; local25 < this.anInterface12Array1.length; local25++) {
			this.anInterface12Array1[local25] = this.method4122(arg0, local23[arg0.method4966()]);
		}
	}
}
