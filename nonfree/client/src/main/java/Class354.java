import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!th")
public final class Class354 {

	@OriginalMember(owner = "client!th", name = "i", descriptor = "Lclient!vka;")
	private Class387 aClass387_2;

	@OriginalMember(owner = "client!th", name = "b", descriptor = "Lclient!nca;")
	private final Class254 aClass254_154;

	@OriginalMember(owner = "client!th", name = "e", descriptor = "Lclient!nca;")
	private final Class254 aClass254_155;

	@OriginalMember(owner = "client!th", name = "<init>", descriptor = "(Lclient!nca;Lclient!nca;)V")
	public Class354(@OriginalArg(0) Class254 arg0, @OriginalArg(1) Class254 arg1) {
		this.aClass254_154 = arg1;
		this.aClass254_155 = arg0;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)Lclient!vka;")
	private Class387 method8342() {
		if (this.aClass387_2 == null) {
			this.aClass387_2 = new Class387();
		}
		return this.aClass387_2;
	}

	@OriginalMember(owner = "client!th", name = "a", descriptor = "(ZLclient!oe;)Lclient!jla;")
	public Interface10 method8344(@OriginalArg(1) Interface17 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(12) Class152 local12 = arg0.method9627();
		if (local12 == Static450.aClass152_4) {
			return new Class360((Class71) arg0);
		} else if (local12 == Static600.aClass152_6) {
			return new Class165(this.method8342(), (Class36) arg0);
		} else if (Static661.aClass152_8 == local12) {
			return new Class20(this.aClass254_155, (Class321) arg0);
		} else if (local12 == Static203.aClass152_3) {
			return new Class20_Sub1(this.aClass254_155, (Class321_Sub1) arg0);
		} else if (Static683.aClass152_9 == local12) {
			return new Class93_Sub2(this.aClass254_155, this.aClass254_154, (Class33_Sub1) arg0);
		} else if (local12 == Static468.aClass152_5) {
			return new Class93_Sub3(this.aClass254_155, this.aClass254_154, (Class33_Sub3) arg0);
		} else if (Static639.aClass152_7 == local12) {
			return new Class93_Sub1(this.aClass254_155, this.aClass254_154, (Class33_Sub2) arg0);
		} else if (local12 == Static53.aClass152_1) {
			return new Class383(this.aClass254_155, this.aClass254_154, (Class407) arg0);
		} else if (Static199.aClass152_2 == local12) {
			return new Class228(this.aClass254_155, (Class136) arg0);
		} else if (local12 == Static711.aClass152_10) {
			return new Class93_Sub1_Sub1(this.aClass254_155, this.aClass254_154, (Class33_Sub2_Sub1) arg0);
		} else {
			return null;
		}
	}
}
