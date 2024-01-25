import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eu")
public final class Class96 {

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
	public int anInt2437;

	@OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
	public int anInt2438;

	@OriginalMember(owner = "client!eu", name = "c", descriptor = "[Lclient!is;")
	public Interface13[] anInterface13Array1;

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(ILclient!gga;)V")
	public void method2092(@OriginalArg(1) Class6_Sub23 arg0) {
		this.anInt2438 = arg0.method8344();
		this.anInt2437 = arg0.method8363();
		this.anInterface13Array1 = new Interface13[arg0.method8374()];
		@Pc(32) Class251[] local32 = Static482.method7039();
		for (@Pc(34) int local34 = 0; local34 < this.anInterface13Array1.length; local34++) {
			this.anInterface13Array1[local34] = this.method2093(local32[arg0.method8374()], arg0);
		}
	}

	@OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lclient!of;ILclient!gga;)Lclient!is;")
	private Interface13 method2093(@OriginalArg(0) Class251 arg0, @OriginalArg(2) Class6_Sub23 arg1) {
		if (arg0 == Static499.aClass251_5) {
			return Static175.method2475(arg1);
		} else if (Static568.aClass251_6 == arg0) {
			return Static652.method5478(arg1);
		} else if (Static658.aClass251_9 == arg0) {
			return Static192.method2709(arg1);
		} else if (arg0 == Static395.aClass251_4) {
			return Static351.method5108(arg1);
		} else if (arg0 == Static202.aClass251_2) {
			return Static489.method7091(arg1);
		} else if (Static257.aClass251_3 == arg0) {
			return Static383.method5443(arg1);
		} else if (arg0 == Static200.aClass251_1) {
			return Static104.method1705(arg1);
		} else if (Static656.aClass251_8 == arg0) {
			return Static496.method8136(arg1);
		} else if (arg0 == Static662.aClass251_10) {
			return Static343.method5019(arg1);
		} else if (arg0 == Static610.aClass251_7) {
			return Static242.method3608(arg1);
		} else {
			return null;
		}
	}
}
