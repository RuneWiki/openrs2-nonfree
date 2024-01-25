import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jfa")
public final class Class178 {

	@OriginalMember(owner = "client!jfa", name = "c", descriptor = "Lclient!qw;")
	private Class302 aClass302_25;

	@OriginalMember(owner = "client!jfa", name = "k", descriptor = "Lclient!mg;")
	private Class3 aClass3_146;

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "()V")
	public Class178() {
	}

	@OriginalMember(owner = "client!jfa", name = "<init>", descriptor = "(Lclient!qw;)V")
	public Class178(@OriginalArg(0) Class302 arg0) {
		this.aClass302_25 = arg0;
	}

	@OriginalMember(owner = "client!jfa", name = "b", descriptor = "(Z)Lclient!mg;")
	public Class3 method4057() {
		@Pc(8) Class3 local8 = this.aClass302_25.aClass3_241.aClass3_337;
		if (local8 == this.aClass302_25.aClass3_241) {
			this.aClass3_146 = null;
			return null;
		} else {
			this.aClass3_146 = local8.aClass3_337;
			return local8;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(I)Lclient!mg;")
	public Class3 method4058() {
		@Pc(6) Class3 local6 = this.aClass3_146;
		if (this.aClass302_25.aClass3_241 == local6) {
			this.aClass3_146 = null;
			return null;
		} else {
			this.aClass3_146 = local6.aClass3_337;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jfa", name = "a", descriptor = "(ILclient!qw;)V")
	public void method4059(@OriginalArg(1) Class302 arg0) {
		this.aClass302_25 = arg0;
	}
}
