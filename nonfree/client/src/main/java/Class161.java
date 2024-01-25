import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jaa")
public final class Class161 {

	@OriginalMember(owner = "client!jaa", name = "e", descriptor = "Lclient!up;")
	private Class355 aClass355_1;

	@OriginalMember(owner = "client!jaa", name = "g", descriptor = "Lclient!aj;")
	private final Class15 aClass15_74;

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "Lclient!aj;")
	private final Class15 aClass15_73;

	@OriginalMember(owner = "client!jaa", name = "<init>", descriptor = "(Lclient!aj;Lclient!aj;)V")
	public Class161(@OriginalArg(0) Class15 arg0, @OriginalArg(1) Class15 arg1) {
		this.aClass15_74 = arg0;
		this.aClass15_73 = arg1;
	}

	@OriginalMember(owner = "client!jaa", name = "a", descriptor = "(Lclient!nba;B)Lclient!ww;")
	public Interface27 method4355(@OriginalArg(0) Interface18 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class146 local11 = arg0.method5444();
		if (local11 == Static198.aClass146_43) {
			return new Class313((Class14) arg0);
		} else if (local11 == Static150.aClass146_21) {
			return new Class274(this.method4358(), (Class196) arg0);
		} else if (Static237.aClass146_17 == local11) {
			return new Class103(this.aClass15_74, (Class222) arg0);
		} else if (local11 == Static633.aClass146_39) {
			return new Class103_Sub1(this.aClass15_74, (Class222_Sub1) arg0);
		} else if (Static89.aClass146_9 == local11) {
			return new Class78_Sub2(this.aClass15_74, this.aClass15_73, (Class106_Sub3) arg0);
		} else if (local11 == Static69.aClass146_6) {
			return new Class78_Sub1(this.aClass15_74, this.aClass15_73, (Class106_Sub2) arg0);
		} else if (Static215.aClass146_16 == local11) {
			return new Class78_Sub3(this.aClass15_74, this.aClass15_73, (Class106_Sub1) arg0);
		} else if (Static492.aClass146_28 == local11) {
			return new Class295(this.aClass15_74, this.aClass15_73, (Class170) arg0);
		} else if (local11 == Static204.aClass146_15) {
			return new Class151(this.aClass15_74, (Class166) arg0);
		} else if (Static47.aClass146_5 == local11) {
			return new Class78_Sub3_Sub1(this.aClass15_74, this.aClass15_73, (Class106_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!jaa", name = "b", descriptor = "(I)Lclient!up;")
	private Class355 method4358() {
		if (this.aClass355_1 == null) {
			this.aClass355_1 = new Class355();
		}
		return this.aClass355_1;
	}
}
