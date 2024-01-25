import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mk")
public final class Class203 {

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "Lclient!fd;")
	private Class100 aClass100_1;

	@OriginalMember(owner = "client!mk", name = "c", descriptor = "Lclient!pj;")
	private final Class248 aClass248_50;

	@OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lclient!pj;)V")
	public Class203(@OriginalArg(0) Class248 arg0) {
		this.aClass248_50 = arg0;
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lclient!ms;I)Lclient!qt;")
	public Interface19 method4980(@OriginalArg(0) Interface12 arg0) {
		if (arg0 == null) {
			return null;
		}
		@Pc(11) Class136 local11 = arg0.method5811();
		if (Static364.aClass136_98 == local11) {
			return new Class31((Class250) arg0);
		} else if (local11 == Static300.aClass136_80) {
			return new Class295(this.method4981(), (Class18) arg0);
		} else if (Static310.aClass136_85 == local11) {
			return new Class111(this.aClass248_50, (Class210) arg0);
		} else if (local11 == Static335.aClass136_35) {
			return new Class111_Sub1(this.aClass248_50, (Class210_Sub1) arg0);
		} else if (local11 == Static270.aClass136_68) {
			return new Class40_Sub1((Class65_Sub2) arg0);
		} else if (Static572.aClass136_145 == local11) {
			return new Class40_Sub3(this.aClass248_50, (Class65_Sub1) arg0);
		} else if (Static303.aClass136_84 == local11) {
			return new Class40_Sub2(this.aClass248_50, (Class65_Sub3) arg0);
		} else if (Static212.aClass136_148 == local11) {
			return new Class201((Class233) arg0);
		} else if (Static20.aClass136_11 == local11) {
			return new Class267(this.aClass248_50, (Class240) arg0);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lclient!fd;")
	private Class100 method4981() {
		if (this.aClass100_1 == null) {
			this.aClass100_1 = new Class100();
		}
		return this.aClass100_1;
	}
}
