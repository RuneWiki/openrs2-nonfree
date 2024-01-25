import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hu")
public final class Class114 {

	@OriginalMember(owner = "client!hu", name = "j", descriptor = "Lclient!jn;")
	private Class38_Sub2 aClass38_Sub2_8;

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "Lclient!jn;")
	public final Class38_Sub2 aClass38_Sub2_7 = new Class38_Sub2();

	@OriginalMember(owner = "client!hu", name = "<init>", descriptor = "()V")
	public Class114() {
		this.aClass38_Sub2_7.aClass38_Sub2_5 = this.aClass38_Sub2_7;
		this.aClass38_Sub2_7.aClass38_Sub2_6 = this.aClass38_Sub2_7;
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Lclient!jn;")
	public Class38_Sub2 method2569() {
		@Pc(6) Class38_Sub2 local6 = this.aClass38_Sub2_8;
		if (this.aClass38_Sub2_7 == local6) {
			this.aClass38_Sub2_8 = null;
			return null;
		} else {
			this.aClass38_Sub2_8 = local6.aClass38_Sub2_5;
			return local6;
		}
	}

	@OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)Lclient!jn;")
	public Class38_Sub2 method2570() {
		@Pc(7) Class38_Sub2 local7 = this.aClass38_Sub2_7.aClass38_Sub2_5;
		if (this.aClass38_Sub2_7 == local7) {
			this.aClass38_Sub2_8 = null;
			return null;
		} else {
			this.aClass38_Sub2_8 = local7.aClass38_Sub2_5;
			return local7;
		}
	}

	@OriginalMember(owner = "client!hu", name = "a", descriptor = "(ZLclient!jn;)V")
	public void method2571(@OriginalArg(1) Class38_Sub2 arg0) {
		if (arg0.aClass38_Sub2_6 != null) {
			arg0.method1237();
		}
		arg0.aClass38_Sub2_6 = this.aClass38_Sub2_7.aClass38_Sub2_6;
		arg0.aClass38_Sub2_5 = this.aClass38_Sub2_7;
		arg0.aClass38_Sub2_6.aClass38_Sub2_5 = arg0;
		arg0.aClass38_Sub2_5.aClass38_Sub2_6 = arg0;
	}

	@OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I")
	public int method2572() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class38_Sub2 local16 = this.aClass38_Sub2_7.aClass38_Sub2_5;
		while (this.aClass38_Sub2_7 != local16) {
			local16 = local16.aClass38_Sub2_5;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)V")
	public void method2573() {
		while (true) {
			@Pc(10) Class38_Sub2 local10 = this.aClass38_Sub2_7.aClass38_Sub2_5;
			if (this.aClass38_Sub2_7 == local10) {
				this.aClass38_Sub2_8 = null;
				return;
			}
			local10.method1237();
		}
	}
}
