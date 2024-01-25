import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!at")
public final class Class20 {

	@OriginalMember(owner = "client!at", name = "h", descriptor = "Lclient!ac;")
	private Class5 aClass5_20;

	@OriginalMember(owner = "client!at", name = "u", descriptor = "Lclient!ac;")
	public final Class5 aClass5_19 = new Class5();

	@OriginalMember(owner = "client!at", name = "<init>", descriptor = "()V")
	public Class20() {
		this.aClass5_19.aClass5_338 = this.aClass5_19;
		this.aClass5_19.aClass5_337 = this.aClass5_19;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Z)Lclient!ac;")
	public Class5 method366() {
		@Pc(13) Class5 local13 = this.aClass5_20;
		if (local13 == this.aClass5_19) {
			this.aClass5_20 = null;
			return null;
		} else {
			this.aClass5_20 = local13.aClass5_338;
			return local13;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(B)Z")
	public boolean method367() {
		return this.aClass5_19 == this.aClass5_19.aClass5_338;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!at;I)V")
	public void method368(@OriginalArg(0) Class20 arg0) {
		this.method376(arg0, this.aClass5_19.aClass5_338);
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(I)Lclient!ac;")
	public Class5 method369() {
		@Pc(7) Class5 local7 = this.aClass5_19.aClass5_338;
		if (local7 == this.aClass5_19) {
			return null;
		} else {
			local7.method9222();
			return local7;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ac;I)V")
	public void method370(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_337 != null) {
			arg0.method9222();
		}
		arg0.aClass5_337 = this.aClass5_19.aClass5_337;
		arg0.aClass5_338 = this.aClass5_19;
		arg0.aClass5_337.aClass5_338 = arg0;
		arg0.aClass5_338.aClass5_337 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!ac;B)V")
	public void method371(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_337 != null) {
			arg0.method9222();
		}
		arg0.aClass5_337 = this.aClass5_19;
		arg0.aClass5_338 = this.aClass5_19.aClass5_338;
		arg0.aClass5_337.aClass5_338 = arg0;
		arg0.aClass5_338.aClass5_337 = arg0;
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(Z)I")
	public int method372() {
		@Pc(14) int local14 = 0;
		for (@Pc(18) Class5 local18 = this.aClass5_19.aClass5_338; local18 != this.aClass5_19; local18 = local18.aClass5_338) {
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)V")
	public void method374() {
		while (true) {
			@Pc(5) Class5 local5 = this.aClass5_19.aClass5_338;
			if (this.aClass5_19 == local5) {
				this.aClass5_20 = null;
				return;
			}
			local5.method9222();
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(Lclient!at;BLclient!ac;)V")
	private void method376(@OriginalArg(0) Class20 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(15) Class5 local15 = this.aClass5_19.aClass5_337;
		this.aClass5_19.aClass5_337 = arg1.aClass5_337;
		arg1.aClass5_337.aClass5_338 = this.aClass5_19;
		if (arg1 != this.aClass5_19) {
			arg1.aClass5_337 = arg0.aClass5_19.aClass5_337;
			arg1.aClass5_337.aClass5_338 = arg1;
			local15.aClass5_338 = arg0.aClass5_19;
			arg0.aClass5_19.aClass5_337 = local15;
		}
	}

	@OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Lclient!ac;")
	public Class5 method377() {
		@Pc(6) Class5 local6 = this.aClass5_20;
		if (local6 == this.aClass5_19) {
			this.aClass5_20 = null;
			return null;
		} else {
			this.aClass5_20 = local6.aClass5_337;
			return local6;
		}
	}

	@OriginalMember(owner = "client!at", name = "c", descriptor = "(I)Lclient!ac;")
	public Class5 method378() {
		@Pc(14) Class5 local14 = this.aClass5_19.aClass5_338;
		if (this.aClass5_19 == local14) {
			this.aClass5_20 = null;
			return null;
		} else {
			this.aClass5_20 = local14.aClass5_338;
			return local14;
		}
	}

	@OriginalMember(owner = "client!at", name = "d", descriptor = "(I)Lclient!ac;")
	public Class5 method379() {
		@Pc(7) Class5 local7 = this.aClass5_19.aClass5_337;
		if (local7 == this.aClass5_19) {
			this.aClass5_20 = null;
			return null;
		} else {
			this.aClass5_20 = local7.aClass5_337;
			return local7;
		}
	}
}
