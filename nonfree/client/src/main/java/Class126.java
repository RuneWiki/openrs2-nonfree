import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class126 {

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
	public int anInt3226;

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "I")
	public int anInt3231;

	@OriginalMember(owner = "client!gk", name = "g", descriptor = "[Lclient!vb;")
	public Interface24[] anInterface24Array1;

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!ag;ILclient!vj;)Lclient!vb;")
	private Interface24 method2730(@OriginalArg(0) Class8 arg0, @OriginalArg(2) Class2_Sub22 arg1) {
		if (arg0 == Static498.aClass8_7) {
			return Static640.method8596(arg1);
		} else if (Static512.aClass8_8 == arg0) {
			return Static114.method1710(arg1);
		} else if (arg0 == Static132.aClass8_4) {
			return Static243.method3362(arg1);
		} else if (Static67.aClass8_3 == arg0) {
			return Static424.method5662(arg1);
		} else if (Static559.aClass8_10 == arg0) {
			return Static455.method6237(arg1);
		} else if (arg0 == Static37.aClass8_2) {
			return Static408.method5482(arg1);
		} else if (Static31.aClass8_1 == arg0) {
			return Static162.method2433(arg1);
		} else if (arg0 == Static488.aClass8_6) {
			return Static66.method8418(arg1);
		} else if (Static515.aClass8_9 == arg0) {
			return Static26.method474(arg1);
		} else if (arg0 == Static139.aClass8_5) {
			return Static248.method3412(arg1);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!vj;I)V")
	public void method2731(@OriginalArg(0) Class2_Sub22 arg0) {
		this.anInt3231 = arg0.method8539();
		this.anInt3226 = arg0.method8546();
		this.anInterface24Array1 = new Interface24[arg0.method8547()];
		@Pc(24) Class8[] local24 = Static120.method1759();
		for (@Pc(26) int local26 = 0; local26 < this.anInterface24Array1.length; local26++) {
			this.anInterface24Array1[local26] = this.method2730(local24[arg0.method8547()], arg0);
		}
	}
}
