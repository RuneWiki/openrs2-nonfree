import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jn")
public final class Class172 {

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
	public int anInt4898;

	@OriginalMember(owner = "client!jn", name = "f", descriptor = "I")
	public int anInt4900;

	@OriginalMember(owner = "client!jn", name = "h", descriptor = "[Lclient!nba;")
	public Interface18[] anInterface18Array1;

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(Lclient!jp;B)V")
	public void method4525(@OriginalArg(0) Class3_Sub25 arg0) {
		this.anInt4898 = arg0.method8607();
		this.anInt4900 = arg0.method8593();
		this.anInterface18Array1 = new Interface18[arg0.method8632()];
		@Pc(30) Class146[] local30 = Static204.method3650();
		for (@Pc(32) int local32 = 0; local32 < this.anInterface18Array1.length; local32++) {
			this.anInterface18Array1[local32] = this.method4527(arg0, local30[arg0.method8632()]);
		}
	}

	@OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILclient!jp;Lclient!hv;)Lclient!nba;")
	private Interface18 method4527(@OriginalArg(1) Class3_Sub25 arg0, @OriginalArg(2) Class146 arg1) {
		if (arg1 == Static198.aClass146_43) {
			return Static293.method4571(arg0);
		} else if (arg1 == Static89.aClass146_9) {
			return Static492.method7093(arg0);
		} else if (Static150.aClass146_21 == arg1) {
			return Static290.method4556(arg0);
		} else if (Static633.aClass146_39 == arg1) {
			return Static297.method4580(arg0);
		} else if (arg1 == Static237.aClass146_17) {
			return Static337.method5084(arg0);
		} else if (Static69.aClass146_6 == arg1) {
			return Static538.method7739(arg0);
		} else if (arg1 == Static215.aClass146_16) {
			return Static416.method5925(arg0);
		} else if (Static492.aClass146_28 == arg1) {
			return Static662.method9140(arg0);
		} else if (Static204.aClass146_15 == arg1) {
			return Static45.method1121(arg0);
		} else if (arg1 == Static47.aClass146_5) {
			return Static456.method8148(arg0);
		} else {
			return null;
		}
	}
}
