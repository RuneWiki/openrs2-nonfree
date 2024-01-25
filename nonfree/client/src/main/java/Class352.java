import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wq")
public final class Class352 {

	@OriginalMember(owner = "client!wq", name = "e", descriptor = "[Lclient!ms;")
	public Interface12[] anInterface12Array1;

	@OriginalMember(owner = "client!wq", name = "f", descriptor = "I")
	public int anInt9933;

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(ILclient!jr;)V")
	public void method7913(@OriginalArg(1) Class6_Sub12 arg0) {
		this.anInt9933 = arg0.method6019();
		this.anInterface12Array1 = new Interface12[arg0.method6019()];
		@Pc(21) Class136[] local21 = Static443.method6266();
		for (@Pc(23) int local23 = 0; local23 < this.anInterface12Array1.length; local23++) {
			this.anInterface12Array1[local23] = this.method7915(local21[arg0.method6019()], arg0);
		}
	}

	@OriginalMember(owner = "client!wq", name = "a", descriptor = "(Lclient!hs;Lclient!jr;I)Lclient!ms;")
	private Interface12 method7915(@OriginalArg(0) Class136 arg0, @OriginalArg(1) Class6_Sub12 arg1) {
		if (Static364.aClass136_98 == arg0) {
			return Static349.method5300(arg1);
		} else if (arg0 == Static270.aClass136_68) {
			return Static283.method4313(arg1);
		} else if (Static300.aClass136_80 == arg0) {
			return Static178.method2971(arg1);
		} else if (Static335.aClass136_35 == arg0) {
			return Static193.method3261(arg1);
		} else if (arg0 == Static310.aClass136_85) {
			return Static536.method7300(arg1);
		} else if (Static572.aClass136_145 == arg0) {
			return Static21.method320(arg1);
		} else if (arg0 == Static303.aClass136_84) {
			return Static111.method1703(arg1);
		} else if (arg0 == Static212.aClass136_148) {
			return Static416.method5923(arg1);
		} else if (arg0 == Static20.aClass136_11) {
			return Static526.method7222(arg1);
		} else {
			return null;
		}
	}
}
