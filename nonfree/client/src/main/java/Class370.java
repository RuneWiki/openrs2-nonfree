import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vd")
public final class Class370 {

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "Lclient!it;")
	private Class2 aClass2_310;

	@OriginalMember(owner = "client!vd", name = "c", descriptor = "Lclient!ow;")
	private Class271 aClass271_66;

	static {
		new Class340("", 73);
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "()V")
	public Class370() {
	}

	@OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lclient!ow;)V")
	public Class370(@OriginalArg(0) Class271 arg0) {
		this.aClass271_66 = arg0;
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)Lclient!it;")
	public Class2 method9305() {
		@Pc(6) Class2 local6 = this.aClass2_310;
		if (this.aClass271_66.aClass2_230 == local6) {
			this.aClass2_310 = null;
			return null;
		} else {
			this.aClass2_310 = local6.aClass2_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)Lclient!it;")
	public Class2 method9306() {
		@Pc(8) Class2 local8 = this.aClass271_66.aClass2_230.aClass2_338;
		if (local8 == this.aClass271_66.aClass2_230) {
			this.aClass2_310 = null;
			return null;
		} else {
			this.aClass2_310 = local8.aClass2_338;
			return local8;
		}
	}

	@OriginalMember(owner = "client!vd", name = "a", descriptor = "(ILclient!ow;)V")
	public void method9307(@OriginalArg(1) Class271 arg0) {
		this.aClass271_66 = arg0;
	}
}
