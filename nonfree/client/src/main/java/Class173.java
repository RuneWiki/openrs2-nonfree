import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public final class Class173 {

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public int anInt4252;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "[Lclient!gca;")
	public Interface10[] anInterface10Array1;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(Lclient!dga;Lclient!jv;I)Lclient!gca;")
	private Interface10 method3650(@OriginalArg(0) Class6_Sub14 arg0, @OriginalArg(1) Class165 arg1) {
		if (arg1 == Static91.aClass165_13) {
			return Static87.method1419(arg0);
		} else if (Static343.aClass165_14 == arg1) {
			return Static298.method4142(arg0);
		} else if (Static227.aClass165_8 == arg1) {
			return Static231.method3387(arg0);
		} else if (arg1 == Static500.aClass165_17) {
			return Static388.method5782(arg0);
		} else if (arg1 == Static153.aClass165_4) {
			return Static533.method7410(arg0);
		} else if (arg1 == Static245.aClass165_9) {
			return Static479.method7873(arg0);
		} else if (Static188.aClass165_7 == arg1) {
			return Static507.method6969(arg0);
		} else if (arg1 == Static348.aClass165_18) {
			return Static429.method6254(arg0);
		} else if (Static471.aClass165_16 == arg1) {
			return Static34.method6071(arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(BLclient!dga;)V")
	public void method3652(@OriginalArg(1) Class6_Sub14 arg0) {
		this.anInt4252 = arg0.method6041();
		this.anInterface10Array1 = new Interface10[arg0.method6041()];
		@Pc(23) Class165[] local23 = Static382.method5562();
		for (@Pc(25) int local25 = 0; local25 < this.anInterface10Array1.length; local25++) {
			this.anInterface10Array1[local25] = this.method3650(arg0, local23[arg0.method6041()]);
		}
	}
}
