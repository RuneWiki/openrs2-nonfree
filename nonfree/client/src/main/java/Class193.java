import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jia")
public final class Class193 {

	@OriginalMember(owner = "client!jia", name = "q", descriptor = "Lclient!wk;")
	private Class3 aClass3_156;

	@OriginalMember(owner = "client!jia", name = "n", descriptor = "Lclient!wk;")
	public final Class3 aClass3_155 = new Class3();

	@OriginalMember(owner = "client!jia", name = "<init>", descriptor = "()V")
	public Class193() {
		this.aClass3_155.aClass3_337 = this.aClass3_155;
		this.aClass3_155.aClass3_338 = this.aClass3_155;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(I)Lclient!wk;")
	public Class3 method4452() {
		@Pc(7) Class3 local7 = this.aClass3_155.aClass3_337;
		if (this.aClass3_155 == local7) {
			return null;
		} else {
			local7.method8770();
			return local7;
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(Lclient!jia;ILclient!wk;)V")
	private void method4453(@OriginalArg(0) Class193 arg0, @OriginalArg(2) Class3 arg1) {
		@Pc(12) Class3 local12 = this.aClass3_155.aClass3_338;
		this.aClass3_155.aClass3_338 = arg1.aClass3_338;
		arg1.aClass3_338.aClass3_337 = this.aClass3_155;
		if (arg1 != this.aClass3_155) {
			arg1.aClass3_338 = arg0.aClass3_155.aClass3_338;
			arg1.aClass3_338.aClass3_337 = arg1;
			arg0.aClass3_155.aClass3_338 = local12;
			local12.aClass3_337 = arg0.aClass3_155;
		}
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(I)Z")
	public boolean method4454() {
		return this.aClass3_155 == this.aClass3_155.aClass3_337;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILclient!wk;)V")
	public void method4455(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_338 != null) {
			arg0.method8770();
		}
		arg0.aClass3_337 = this.aClass3_155.aClass3_337;
		arg0.aClass3_338 = this.aClass3_155;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(B)Lclient!wk;")
	public Class3 method4456() {
		@Pc(7) Class3 local7 = this.aClass3_155.aClass3_338;
		if (this.aClass3_155 == local7) {
			this.aClass3_156 = null;
			return null;
		} else {
			this.aClass3_156 = local7.aClass3_338;
			return local7;
		}
	}

	@OriginalMember(owner = "client!jia", name = "b", descriptor = "(B)Lclient!wk;")
	public Class3 method4457() {
		@Pc(14) Class3 local14 = this.aClass3_155.aClass3_337;
		if (local14 == this.aClass3_155) {
			this.aClass3_156 = null;
			return null;
		} else {
			this.aClass3_156 = local14.aClass3_337;
			return local14;
		}
	}

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "(B)V")
	public void method4458() {
		while (true) {
			@Pc(9) Class3 local9 = this.aClass3_155.aClass3_337;
			if (local9 == this.aClass3_155) {
				this.aClass3_156 = null;
				return;
			}
			local9.method8770();
		}
	}

	@OriginalMember(owner = "client!jia", name = "c", descriptor = "(I)Lclient!wk;")
	public Class3 method4459() {
		@Pc(12) Class3 local12 = this.aClass3_156;
		if (local12 == this.aClass3_155) {
			this.aClass3_156 = null;
			return null;
		} else {
			this.aClass3_156 = local12.aClass3_337;
			return local12;
		}
	}

	@OriginalMember(owner = "client!jia", name = "d", descriptor = "(I)Lclient!wk;")
	public Class3 method4460() {
		@Pc(6) Class3 local6 = this.aClass3_156;
		if (this.aClass3_155 == local6) {
			this.aClass3_156 = null;
			return null;
		} else {
			this.aClass3_156 = local6.aClass3_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(BLclient!wk;)V")
	public void method4462(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_338 != null) {
			arg0.method8770();
		}
		arg0.aClass3_337 = this.aClass3_155;
		arg0.aClass3_338 = this.aClass3_155.aClass3_338;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!jia", name = "d", descriptor = "(B)I")
	public int method4463() {
		@Pc(5) int local5 = 0;
		@Pc(9) Class3 local9 = this.aClass3_155.aClass3_337;
		while (this.aClass3_155 != local9) {
			local9 = local9.aClass3_337;
			local5++;
		}
		return local5;
	}

	@OriginalMember(owner = "client!jia", name = "a", descriptor = "(ILclient!jia;)V")
	public void method4464(@OriginalArg(1) Class193 arg0) {
		this.method4453(arg0, this.aClass3_155.aClass3_337);
	}
}
