import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ok")
public final class Class262 {

	@OriginalMember(owner = "client!ok", name = "p", descriptor = "Lclient!lq;")
	private Class14 aClass14_231;

	@OriginalMember(owner = "client!ok", name = "e", descriptor = "Lclient!lq;")
	public final Class14 aClass14_230 = new Class14();

	@OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V")
	public Class262() {
		this.aClass14_230.aClass14_337 = this.aClass14_230;
		this.aClass14_230.aClass14_338 = this.aClass14_230;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(I)Lclient!lq;")
	public Class14 method6311() {
		@Pc(10) Class14 local10 = this.aClass14_231;
		if (local10 == this.aClass14_230) {
			this.aClass14_231 = null;
			return null;
		} else {
			this.aClass14_231 = local10.aClass14_338;
			return local10;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!lq;ILclient!ok;)V")
	private void method6313(@OriginalArg(0) Class14 arg0, @OriginalArg(2) Class262 arg1) {
		@Pc(14) Class14 local14 = this.aClass14_230.aClass14_337;
		this.aClass14_230.aClass14_337 = arg0.aClass14_337;
		arg0.aClass14_337.aClass14_338 = this.aClass14_230;
		if (arg0 != this.aClass14_230) {
			arg0.aClass14_337 = arg1.aClass14_230.aClass14_337;
			arg0.aClass14_337.aClass14_338 = arg0;
			local14.aClass14_338 = arg1.aClass14_230;
			arg1.aClass14_230.aClass14_337 = local14;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!lq;B)V")
	public void method6314(@OriginalArg(0) Class14 arg0) {
		if (arg0.aClass14_337 != null) {
			arg0.method9315();
		}
		arg0.aClass14_337 = this.aClass14_230.aClass14_337;
		arg0.aClass14_338 = this.aClass14_230;
		arg0.aClass14_337.aClass14_338 = arg0;
		arg0.aClass14_338.aClass14_337 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(ILclient!lq;)V")
	public void method6315(@OriginalArg(1) Class14 arg0) {
		if (arg0.aClass14_337 != null) {
			arg0.method9315();
		}
		arg0.aClass14_338 = this.aClass14_230.aClass14_338;
		arg0.aClass14_337 = this.aClass14_230;
		arg0.aClass14_337.aClass14_338 = arg0;
		arg0.aClass14_338.aClass14_337 = arg0;
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(B)V")
	public void method6316() {
		while (true) {
			@Pc(13) Class14 local13 = this.aClass14_230.aClass14_338;
			if (this.aClass14_230 == local13) {
				this.aClass14_231 = null;
				return;
			}
			local13.method9315();
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Lclient!ok;B)V")
	public void method6317(@OriginalArg(0) Class262 arg0) {
		this.method6313(this.aClass14_230.aClass14_338, arg0);
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(B)Lclient!lq;")
	public Class14 method6318() {
		@Pc(7) Class14 local7 = this.aClass14_230.aClass14_338;
		if (this.aClass14_230 == local7) {
			this.aClass14_231 = null;
			return null;
		} else {
			this.aClass14_231 = local7.aClass14_338;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ok", name = "a", descriptor = "(Z)Lclient!lq;")
	public Class14 method6319() {
		@Pc(11) Class14 local11 = this.aClass14_231;
		if (this.aClass14_230 == local11) {
			this.aClass14_231 = null;
			return null;
		} else {
			this.aClass14_231 = local11.aClass14_337;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(B)Lclient!lq;")
	public Class14 method6320() {
		@Pc(7) Class14 local7 = this.aClass14_230.aClass14_337;
		if (local7 == this.aClass14_230) {
			this.aClass14_231 = null;
			return null;
		} else {
			this.aClass14_231 = local7.aClass14_337;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ok", name = "b", descriptor = "(I)I")
	public int method6322() {
		@Pc(13) int local13 = 0;
		@Pc(17) Class14 local17 = this.aClass14_230.aClass14_338;
		while (local17 != this.aClass14_230) {
			local17 = local17.aClass14_338;
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!ok", name = "c", descriptor = "(I)Lclient!lq;")
	public Class14 method6323() {
		@Pc(7) Class14 local7 = this.aClass14_230.aClass14_338;
		if (this.aClass14_230 == local7) {
			return null;
		} else {
			local7.method9315();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)Z")
	public boolean method6324() {
		return this.aClass14_230 == this.aClass14_230.aClass14_338;
	}
}
