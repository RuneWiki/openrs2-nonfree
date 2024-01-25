import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tda")
public final class Class319 {

	@OriginalMember(owner = "client!tda", name = "c", descriptor = "Lclient!cp;")
	private Class59 aClass59_1;

	@OriginalMember(owner = "client!tda", name = "e", descriptor = "Lclient!uu;")
	private final Class343 aClass343_244;

	@OriginalMember(owner = "client!tda", name = "b", descriptor = "Lclient!uu;")
	private final Class343 aClass343_243;

	@OriginalMember(owner = "client!tda", name = "<init>", descriptor = "(Lclient!uu;Lclient!uu;)V")
	public Class319(@OriginalArg(0) Class343 arg0, @OriginalArg(1) Class343 arg1) {
		this.aClass343_244 = arg0;
		this.aClass343_243 = arg1;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Z)Lclient!cp;")
	private Class59 method7784() {
		if (this.aClass59_1 == null) {
			this.aClass59_1 = new Class59();
		}
		return this.aClass59_1;
	}

	@OriginalMember(owner = "client!tda", name = "a", descriptor = "(Lclient!sa;I)Lclient!vd;")
	public Interface27 method7785(@OriginalArg(0) Interface23 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class384 local11 = arg0.method8182();
		if (local11 == Static429.aClass384_57) {
			return new Class289((Class335) arg0);
		} else if (local11 == Static179.aClass384_28) {
			return new Class340(this.method7784(), (Class345) arg0);
		} else if (Static518.aClass384_65 == local11) {
			return new Class36(this.aClass343_244, (Class66) arg0);
		} else if (local11 == Static548.aClass384_70) {
			return new Class36_Sub1(this.aClass343_244, (Class66_Sub1) arg0);
		} else if (Static349.aClass384_71 == local11) {
			return new Class124_Sub1(this.aClass343_244, this.aClass343_243, (Class35_Sub3) arg0);
		} else if (Static556.aClass384_68 == local11) {
			return new Class124_Sub3(this.aClass343_244, this.aClass343_243, (Class35_Sub2) arg0);
		} else if (Static89.aClass384_50 == local11) {
			return new Class124_Sub2(this.aClass343_244, this.aClass343_243, (Class35_Sub1) arg0);
		} else if (Static200.aClass384_32 == local11) {
			return new Class129(this.aClass343_244, this.aClass343_243, (Class21) arg0);
		} else if (Static583.aClass384_72 == local11) {
			return new Class255(this.aClass343_244, (Class244) arg0);
		} else if (local11 == Static198.aClass384_54) {
			return new Class124_Sub2_Sub1(this.aClass343_244, this.aClass343_243, (Class35_Sub1_Sub1) arg0);
		} else {
			return null;
		}
	}
}
