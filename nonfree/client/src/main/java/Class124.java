import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public final class Class124 {

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!dn;")
	private Class5 aClass5_124;

	@OriginalMember(owner = "client!ga", name = "j", descriptor = "Lclient!dn;")
	public final Class5 aClass5_123 = new Class5();

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
	public Class124() {
		this.aClass5_123.aClass5_338 = this.aClass5_123;
		this.aClass5_123.aClass5_337 = this.aClass5_123;
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(I)V")
	public void method2567() {
		while (true) {
			@Pc(3) Class5 local3 = this.aClass5_123.aClass5_337;
			if (local3 == this.aClass5_123) {
				this.aClass5_124 = null;
				return;
			}
			local3.method8829();
		}
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(I)I")
	public int method2568() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class5 local9 = this.aClass5_123.aClass5_337;
		while (this.aClass5_123 != local9) {
			local9 = local9.aClass5_337;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)Lclient!dn;")
	public Class5 method2569() {
		@Pc(6) Class5 local6 = this.aClass5_124;
		if (local6 == this.aClass5_123) {
			this.aClass5_124 = null;
			return null;
		} else {
			this.aClass5_124 = local6.aClass5_337;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!dn;B)V")
	public void method2570(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_338 != null) {
			arg0.method8829();
		}
		arg0.aClass5_338 = this.aClass5_123;
		arg0.aClass5_337 = this.aClass5_123.aClass5_337;
		arg0.aClass5_338.aClass5_337 = arg0;
		arg0.aClass5_337.aClass5_338 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)Lclient!dn;")
	public Class5 method2571() {
		@Pc(13) Class5 local13 = this.aClass5_123.aClass5_337;
		if (local13 == this.aClass5_123) {
			return null;
		} else {
			local13.method8829();
			return local13;
		}
	}

	@OriginalMember(owner = "client!ga", name = "b", descriptor = "(B)Lclient!dn;")
	public Class5 method2572() {
		@Pc(15) Class5 local15 = this.aClass5_123.aClass5_337;
		if (local15 == this.aClass5_123) {
			this.aClass5_124 = null;
			return null;
		} else {
			this.aClass5_124 = local15.aClass5_337;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Z)Lclient!dn;")
	public Class5 method2573() {
		@Pc(7) Class5 local7 = this.aClass5_123.aClass5_338;
		if (this.aClass5_123 == local7) {
			this.aClass5_124 = null;
			return null;
		} else {
			this.aClass5_124 = local7.aClass5_338;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!dn;Z)V")
	public void method2574(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_338 != null) {
			arg0.method8829();
		}
		arg0.aClass5_338 = this.aClass5_123.aClass5_338;
		arg0.aClass5_337 = this.aClass5_123;
		arg0.aClass5_338.aClass5_337 = arg0;
		arg0.aClass5_337.aClass5_338 = arg0;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(Lclient!ga;Z)V")
	public void method2575(@OriginalArg(0) Class124 arg0) {
		this.method2578(arg0, this.aClass5_123.aClass5_337);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(B)Z")
	public boolean method2577() {
		return this.aClass5_123 == this.aClass5_123.aClass5_337;
	}

	@OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILclient!ga;Lclient!dn;)V")
	private void method2578(@OriginalArg(1) Class124 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(7) Class5 local7 = this.aClass5_123.aClass5_338;
		this.aClass5_123.aClass5_338 = arg1.aClass5_338;
		arg1.aClass5_338.aClass5_337 = this.aClass5_123;
		if (this.aClass5_123 != arg1) {
			arg1.aClass5_338 = arg0.aClass5_123.aClass5_338;
			arg1.aClass5_338.aClass5_337 = arg1;
			arg0.aClass5_123.aClass5_338 = local7;
			local7.aClass5_337 = arg0.aClass5_123;
		}
	}

	@OriginalMember(owner = "client!ga", name = "e", descriptor = "(I)Lclient!dn;")
	public Class5 method2579() {
		@Pc(6) Class5 local6 = this.aClass5_124;
		if (local6 == this.aClass5_123) {
			this.aClass5_124 = null;
			return null;
		} else {
			this.aClass5_124 = local6.aClass5_338;
			return local6;
		}
	}
}
