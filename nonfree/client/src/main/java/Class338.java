import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public final class Class338 {

	@OriginalMember(owner = "client!tm", name = "s", descriptor = "Lclient!dba;")
	private Class3 aClass3_303;

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "Lclient!dba;")
	public final Class3 aClass3_302 = new Class3();

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "()V")
	public Class338() {
		this.aClass3_302.aClass3_337 = this.aClass3_302;
		this.aClass3_302.aClass3_338 = this.aClass3_302;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)I")
	public int method8164() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class3 local19 = this.aClass3_302.aClass3_337; local19 != this.aClass3_302; local19 = local19.aClass3_337) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Z)Z")
	public boolean method8166() {
		return this.aClass3_302 == this.aClass3_302.aClass3_337;
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(I)Lclient!dba;")
	public Class3 method8167() {
		@Pc(7) Class3 local7 = this.aClass3_302.aClass3_338;
		if (local7 == this.aClass3_302) {
			this.aClass3_303 = null;
			return null;
		} else {
			this.aClass3_303 = local7.aClass3_338;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tm", name = "d", descriptor = "(I)Lclient!dba;")
	public Class3 method8168() {
		@Pc(6) Class3 local6 = this.aClass3_303;
		if (this.aClass3_302 == local6) {
			this.aClass3_303 = null;
			return null;
		} else {
			this.aClass3_303 = local6.aClass3_337;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "e", descriptor = "(I)Lclient!dba;")
	public Class3 method8169() {
		@Pc(7) Class3 local7 = this.aClass3_302.aClass3_337;
		if (this.aClass3_302 == local7) {
			return null;
		} else {
			local7.method9380();
			return local7;
		}
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(ILclient!dba;)V")
	public void method8171(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_338 != null) {
			arg0.method9380();
		}
		arg0.aClass3_337 = this.aClass3_302;
		arg0.aClass3_338 = this.aClass3_302.aClass3_338;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!tm;I)V")
	public void method8172(@OriginalArg(0) Class338 arg0) {
		this.method8173(this.aClass3_302.aClass3_337, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(Lclient!dba;Lclient!tm;I)V")
	private void method8173(@OriginalArg(0) Class3 arg0, @OriginalArg(1) Class338 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_302.aClass3_338;
		this.aClass3_302.aClass3_338 = arg0.aClass3_338;
		arg0.aClass3_338.aClass3_337 = this.aClass3_302;
		if (arg0 != this.aClass3_302) {
			arg0.aClass3_338 = arg1.aClass3_302.aClass3_338;
			arg0.aClass3_338.aClass3_337 = arg0;
			arg1.aClass3_302.aClass3_338 = local7;
			local7.aClass3_337 = arg1.aClass3_302;
		}
	}

	@OriginalMember(owner = "client!tm", name = "f", descriptor = "(I)Lclient!dba;")
	public Class3 method8174() {
		@Pc(6) Class3 local6 = this.aClass3_303;
		if (this.aClass3_302 == local6) {
			this.aClass3_303 = null;
			return null;
		} else {
			this.aClass3_303 = local6.aClass3_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tm", name = "g", descriptor = "(I)V")
	public void method8175() {
		while (true) {
			@Pc(9) Class3 local9 = this.aClass3_302.aClass3_337;
			if (local9 == this.aClass3_302) {
				this.aClass3_303 = null;
				return;
			}
			local9.method9380();
		}
	}

	@OriginalMember(owner = "client!tm", name = "b", descriptor = "(ILclient!dba;)V")
	public void method8176(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_338 != null) {
			arg0.method9380();
		}
		arg0.aClass3_338 = this.aClass3_302;
		arg0.aClass3_337 = this.aClass3_302.aClass3_337;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "a", descriptor = "(B)Lclient!dba;")
	public Class3 method8177() {
		@Pc(14) Class3 local14 = this.aClass3_302.aClass3_337;
		if (local14 == this.aClass3_302) {
			this.aClass3_303 = null;
			return null;
		} else {
			this.aClass3_303 = local14.aClass3_337;
			return local14;
		}
	}
}
