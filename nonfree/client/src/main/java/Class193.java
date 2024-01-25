import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ps")
public final class Class193 {

	@OriginalMember(owner = "client!ps", name = "r", descriptor = "Lclient!ie;")
	private Class3 aClass3_199;

	@OriginalMember(owner = "client!ps", name = "p", descriptor = "Lclient!ie;")
	public final Class3 aClass3_198 = new Class3();

	@OriginalMember(owner = "client!ps", name = "<init>", descriptor = "()V")
	public Class193() {
		this.aClass3_198.aClass3_268 = this.aClass3_198;
		this.aClass3_198.aClass3_267 = this.aClass3_198;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)Lclient!ie;")
	public Class3 method4519() {
		@Pc(15) Class3 local15 = this.aClass3_198.aClass3_268;
		if (local15 == this.aClass3_198) {
			this.aClass3_199 = null;
			return null;
		} else {
			this.aClass3_199 = local15.aClass3_268;
			return local15;
		}
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(I)I")
	public int method4520() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class3 local11 = this.aClass3_198.aClass3_268;
		while (this.aClass3_198 != local11) {
			local11 = local11.aClass3_268;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(I)Lclient!ie;")
	public Class3 method4521() {
		@Pc(14) Class3 local14 = this.aClass3_198.aClass3_268;
		if (this.aClass3_198 == local14) {
			return null;
		} else {
			local14.method6288();
			return local14;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(ILclient!ie;)V")
	public void method4522(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_267 != null) {
			arg0.method6288();
		}
		arg0.aClass3_268 = this.aClass3_198.aClass3_268;
		arg0.aClass3_267 = this.aClass3_198;
		arg0.aClass3_267.aClass3_268 = arg0;
		arg0.aClass3_268.aClass3_267 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(B)V")
	public void method4524() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_198.aClass3_268;
			if (local5 == this.aClass3_198) {
				this.aClass3_199 = null;
				return;
			}
			local5.method6288();
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)Lclient!ie;")
	public Class3 method4525() {
		@Pc(6) Class3 local6 = this.aClass3_199;
		if (local6 == this.aClass3_198) {
			this.aClass3_199 = null;
			return null;
		} else {
			this.aClass3_199 = local6.aClass3_268;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!ps;B)V")
	public void method4526(@OriginalArg(0) Class193 arg0) {
		this.method4530(this.aClass3_198.aClass3_268, arg0);
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(BLclient!ie;)V")
	public void method4527(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_267 != null) {
			arg0.method6288();
		}
		arg0.aClass3_267 = this.aClass3_198.aClass3_267;
		arg0.aClass3_268 = this.aClass3_198;
		arg0.aClass3_267.aClass3_268 = arg0;
		arg0.aClass3_268.aClass3_267 = arg0;
	}

	@OriginalMember(owner = "client!ps", name = "b", descriptor = "(Z)Z")
	public boolean method4529() {
		return this.aClass3_198 == this.aClass3_198.aClass3_268;
	}

	@OriginalMember(owner = "client!ps", name = "a", descriptor = "(Lclient!ie;ILclient!ps;)V")
	private void method4530(@OriginalArg(0) Class3 arg0, @OriginalArg(2) Class193 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_198.aClass3_267;
		this.aClass3_198.aClass3_267 = arg0.aClass3_267;
		arg0.aClass3_267.aClass3_268 = this.aClass3_198;
		if (arg0 != this.aClass3_198) {
			arg0.aClass3_267 = arg1.aClass3_198.aClass3_267;
			arg0.aClass3_267.aClass3_268 = arg0;
			arg1.aClass3_198.aClass3_267 = local7;
			local7.aClass3_268 = arg1.aClass3_198;
		}
	}

	@OriginalMember(owner = "client!ps", name = "d", descriptor = "(I)Lclient!ie;")
	public Class3 method4531() {
		@Pc(7) Class3 local7 = this.aClass3_198.aClass3_267;
		if (local7 == this.aClass3_198) {
			this.aClass3_199 = null;
			return null;
		} else {
			this.aClass3_199 = local7.aClass3_267;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ps", name = "c", descriptor = "(B)Lclient!ie;")
	public Class3 method4532() {
		@Pc(14) Class3 local14 = this.aClass3_199;
		if (this.aClass3_198 == local14) {
			this.aClass3_199 = null;
			return null;
		} else {
			this.aClass3_199 = local14.aClass3_267;
			return local14;
		}
	}
}
