import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ta")
public final class Class328 {

	@OriginalMember(owner = "client!ta", name = "c", descriptor = "Lclient!dn;")
	private Class5 aClass5_286;

	@OriginalMember(owner = "client!ta", name = "d", descriptor = "Lclient!ga;")
	private Class124 aClass124_91;

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "()V")
	public Class328() {
	}

	@OriginalMember(owner = "client!ta", name = "<init>", descriptor = "(Lclient!ga;)V")
	public Class328(@OriginalArg(0) Class124 arg0) {
		this.aClass124_91 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "b", descriptor = "(I)Lclient!dn;")
	public Class5 method7631() {
		@Pc(13) Class5 local13 = this.aClass5_286;
		if (this.aClass124_91.aClass5_123 == local13) {
			this.aClass5_286 = null;
			return null;
		} else {
			this.aClass5_286 = local13.aClass5_337;
			return local13;
		}
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lclient!ga;B)V")
	public void method7632(@OriginalArg(0) Class124 arg0) {
		this.aClass124_91 = arg0;
	}

	@OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)Lclient!dn;")
	public Class5 method7633() {
		@Pc(8) Class5 local8 = this.aClass124_91.aClass5_123.aClass5_337;
		if (local8 == this.aClass124_91.aClass5_123) {
			this.aClass5_286 = null;
			return null;
		} else {
			this.aClass5_286 = local8.aClass5_337;
			return local8;
		}
	}
}
