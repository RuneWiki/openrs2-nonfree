import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!mfa")
public final class Class211 {

	@OriginalMember(owner = "client!mfa", name = "p", descriptor = "Lclient!mu;")
	private Class6 aClass6_155;

	@OriginalMember(owner = "client!mfa", name = "k", descriptor = "Lclient!mu;")
	public final Class6 aClass6_154 = new Class6();

	@OriginalMember(owner = "client!mfa", name = "<init>", descriptor = "()V")
	public Class211() {
		this.aClass6_154.aClass6_284 = this.aClass6_154;
		this.aClass6_154.aClass6_283 = this.aClass6_154;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(B)Z")
	public boolean method5170() {
		return this.aClass6_154.aClass6_283 == this.aClass6_154;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!mfa;B)V")
	public void method5171(@OriginalArg(0) Class211 arg0) {
		this.method5176(this.aClass6_154.aClass6_283, arg0);
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(I)Lclient!mu;")
	public Class6 method5172() {
		@Pc(6) Class6 local6 = this.aClass6_155;
		if (local6 == this.aClass6_154) {
			this.aClass6_155 = null;
			return null;
		} else {
			this.aClass6_155 = local6.aClass6_284;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!mu;I)V")
	public void method5173(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_284 != null) {
			arg0.method8151();
		}
		arg0.aClass6_283 = this.aClass6_154;
		arg0.aClass6_284 = this.aClass6_154.aClass6_284;
		arg0.aClass6_284.aClass6_283 = arg0;
		arg0.aClass6_283.aClass6_284 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(B)I")
	public int method5174() {
		@Pc(7) int local7 = 0;
		for (@Pc(17) Class6 local17 = this.aClass6_154.aClass6_283; local17 != this.aClass6_154; local17 = local17.aClass6_283) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Lclient!mu;ILclient!mfa;)V")
	private void method5176(@OriginalArg(0) Class6 arg0, @OriginalArg(2) Class211 arg1) {
		@Pc(7) Class6 local7 = this.aClass6_154.aClass6_284;
		this.aClass6_154.aClass6_284 = arg0.aClass6_284;
		arg0.aClass6_284.aClass6_283 = this.aClass6_154;
		if (arg0 != this.aClass6_154) {
			arg0.aClass6_284 = arg1.aClass6_154.aClass6_284;
			arg0.aClass6_284.aClass6_283 = arg0;
			local7.aClass6_283 = arg1.aClass6_154;
			arg1.aClass6_154.aClass6_284 = local7;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(Z)Lclient!mu;")
	public Class6 method5177() {
		@Pc(6) Class6 local6 = this.aClass6_155;
		if (this.aClass6_154 == local6) {
			this.aClass6_155 = null;
			return null;
		} else {
			this.aClass6_155 = local6.aClass6_283;
			return local6;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "a", descriptor = "(ILclient!mu;)V")
	public void method5178(@OriginalArg(1) Class6 arg0) {
		if (arg0.aClass6_284 != null) {
			arg0.method8151();
		}
		arg0.aClass6_283 = this.aClass6_154.aClass6_283;
		arg0.aClass6_284 = this.aClass6_154;
		arg0.aClass6_284.aClass6_283 = arg0;
		arg0.aClass6_283.aClass6_284 = arg0;
	}

	@OriginalMember(owner = "client!mfa", name = "c", descriptor = "(B)V")
	public void method5179() {
		while (true) {
			@Pc(17) Class6 local17 = this.aClass6_154.aClass6_283;
			if (this.aClass6_154 == local17) {
				this.aClass6_155 = null;
				return;
			}
			local17.method8151();
		}
	}

	@OriginalMember(owner = "client!mfa", name = "b", descriptor = "(I)Lclient!mu;")
	public Class6 method5180() {
		@Pc(15) Class6 local15 = this.aClass6_154.aClass6_283;
		if (local15 == this.aClass6_154) {
			return null;
		} else {
			local15.method8151();
			return local15;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "d", descriptor = "(B)Lclient!mu;")
	public Class6 method5183() {
		@Pc(7) Class6 local7 = this.aClass6_154.aClass6_283;
		if (this.aClass6_154 == local7) {
			this.aClass6_155 = null;
			return null;
		} else {
			this.aClass6_155 = local7.aClass6_283;
			return local7;
		}
	}

	@OriginalMember(owner = "client!mfa", name = "e", descriptor = "(B)Lclient!mu;")
	public Class6 method5184() {
		@Pc(7) Class6 local7 = this.aClass6_154.aClass6_284;
		if (this.aClass6_154 == local7) {
			this.aClass6_155 = null;
			return null;
		} else {
			this.aClass6_155 = local7.aClass6_284;
			return local7;
		}
	}
}
