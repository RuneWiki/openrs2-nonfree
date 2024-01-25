import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!v")
public final class Class362 {

	@OriginalMember(owner = "client!v", name = "o", descriptor = "Lclient!sja;")
	private Class6 aClass6_313;

	@OriginalMember(owner = "client!v", name = "e", descriptor = "Lclient!sja;")
	public final Class6 aClass6_312 = new Class6();

	@OriginalMember(owner = "client!v", name = "<init>", descriptor = "()V")
	public Class362() {
		this.aClass6_312.aClass6_338 = this.aClass6_312;
		this.aClass6_312.aClass6_337 = this.aClass6_312;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(I)Lclient!sja;")
	public Class6 method8530() {
		@Pc(11) Class6 local11 = this.aClass6_313;
		if (local11 == this.aClass6_312) {
			this.aClass6_313 = null;
			return null;
		} else {
			this.aClass6_313 = local11.aClass6_338;
			return local11;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(I)Lclient!sja;")
	public Class6 method8531() {
		@Pc(7) Class6 local7 = this.aClass6_312.aClass6_338;
		if (this.aClass6_312 == local7) {
			return null;
		} else {
			local7.method9174();
			return local7;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(B)Lclient!sja;")
	public Class6 method8532() {
		@Pc(6) Class6 local6 = this.aClass6_313;
		if (this.aClass6_312 == local6) {
			this.aClass6_313 = null;
			return null;
		} else {
			this.aClass6_313 = local6.aClass6_337;
			return local6;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(B)I")
	public int method8533() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class6 local11 = this.aClass6_312.aClass6_338;
		while (local11 != this.aClass6_312) {
			local11 = local11.aClass6_338;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;ILclient!sja;)V")
	private void method8535(@OriginalArg(0) Class362 arg0, @OriginalArg(2) Class6 arg1) {
		@Pc(7) Class6 local7 = this.aClass6_312.aClass6_337;
		this.aClass6_312.aClass6_337 = arg1.aClass6_337;
		arg1.aClass6_337.aClass6_338 = this.aClass6_312;
		if (arg1 != this.aClass6_312) {
			arg1.aClass6_337 = arg0.aClass6_312.aClass6_337;
			arg1.aClass6_337.aClass6_338 = arg1;
			arg0.aClass6_312.aClass6_337 = local7;
			local7.aClass6_338 = arg0.aClass6_312;
		}
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!sja;I)V")
	public void method8536(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_337 != null) {
			arg0.method9174();
		}
		arg0.aClass6_338 = this.aClass6_312;
		arg0.aClass6_337 = this.aClass6_312.aClass6_337;
		arg0.aClass6_337.aClass6_338 = arg0;
		arg0.aClass6_338.aClass6_337 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "a", descriptor = "(Lclient!v;I)V")
	public void method8537(@OriginalArg(0) Class362 arg0) {
		this.method8535(arg0, this.aClass6_312.aClass6_338);
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(I)Lclient!sja;")
	public Class6 method8538() {
		@Pc(7) Class6 local7 = this.aClass6_312.aClass6_338;
		if (this.aClass6_312 == local7) {
			this.aClass6_313 = null;
			return null;
		} else {
			this.aClass6_313 = local7.aClass6_338;
			return local7;
		}
	}

	@OriginalMember(owner = "client!v", name = "b", descriptor = "(Lclient!sja;I)V")
	public void method8539(@OriginalArg(0) Class6 arg0) {
		if (arg0.aClass6_337 != null) {
			arg0.method9174();
		}
		arg0.aClass6_337 = this.aClass6_312;
		arg0.aClass6_338 = this.aClass6_312.aClass6_338;
		arg0.aClass6_337.aClass6_338 = arg0;
		arg0.aClass6_338.aClass6_337 = arg0;
	}

	@OriginalMember(owner = "client!v", name = "e", descriptor = "(I)Z")
	public boolean method8541() {
		return this.aClass6_312.aClass6_338 == this.aClass6_312;
	}

	@OriginalMember(owner = "client!v", name = "c", descriptor = "(B)Lclient!sja;")
	public Class6 method8542() {
		@Pc(7) Class6 local7 = this.aClass6_312.aClass6_337;
		if (this.aClass6_312 == local7) {
			this.aClass6_313 = null;
			return null;
		} else {
			this.aClass6_313 = local7.aClass6_337;
			return local7;
		}
	}

	@OriginalMember(owner = "client!v", name = "d", descriptor = "(B)V")
	public void method8543() {
		while (true) {
			@Pc(5) Class6 local5 = this.aClass6_312.aClass6_338;
			if (this.aClass6_312 == local5) {
				this.aClass6_313 = null;
				return;
			}
			local5.method9174();
		}
	}
}
