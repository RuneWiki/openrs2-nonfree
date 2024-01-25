import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qw")
public final class Class302 {

	@OriginalMember(owner = "client!qw", name = "p", descriptor = "Lclient!mg;")
	private Class3 aClass3_242;

	@OriginalMember(owner = "client!qw", name = "h", descriptor = "Lclient!mg;")
	public final Class3 aClass3_241 = new Class3();

	@OriginalMember(owner = "client!qw", name = "<init>", descriptor = "()V")
	public Class302() {
		this.aClass3_241.aClass3_338 = this.aClass3_241;
		this.aClass3_241.aClass3_337 = this.aClass3_241;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(BLclient!mg;Lclient!qw;)V")
	private void method6601(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class302 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_241.aClass3_338;
		this.aClass3_241.aClass3_338 = arg0.aClass3_338;
		arg0.aClass3_338.aClass3_337 = this.aClass3_241;
		if (arg0 != this.aClass3_241) {
			arg0.aClass3_338 = arg1.aClass3_241.aClass3_338;
			arg0.aClass3_338.aClass3_337 = arg0;
			local7.aClass3_337 = arg1.aClass3_241;
			arg1.aClass3_241.aClass3_338 = local7;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Z)Lclient!mg;")
	public Class3 method6602() {
		@Pc(14) Class3 local14 = this.aClass3_241.aClass3_338;
		if (this.aClass3_241 == local14) {
			this.aClass3_242 = null;
			return null;
		} else {
			this.aClass3_242 = local14.aClass3_338;
			return local14;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(B)Lclient!mg;")
	public Class3 method6603() {
		@Pc(7) Class3 local7 = this.aClass3_241.aClass3_337;
		if (local7 == this.aClass3_241) {
			this.aClass3_242 = null;
			return null;
		} else {
			this.aClass3_242 = local7.aClass3_337;
			return local7;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(I)Lclient!mg;")
	public Class3 method6605() {
		@Pc(13) Class3 local13 = this.aClass3_242;
		if (local13 == this.aClass3_241) {
			this.aClass3_242 = null;
			return null;
		} else {
			this.aClass3_242 = local13.aClass3_337;
			return local13;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!qw;I)V")
	public void method6606(@OriginalArg(0) Class302 arg0) {
		this.method6601(this.aClass3_241.aClass3_337, arg0);
	}

	@OriginalMember(owner = "client!qw", name = "b", descriptor = "(I)I")
	public int method6608() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class3 local16 = this.aClass3_241.aClass3_337;
		while (this.aClass3_241 != local16) {
			local16 = local16.aClass3_337;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(I)Lclient!mg;")
	public Class3 method6609() {
		@Pc(6) Class3 local6 = this.aClass3_242;
		if (this.aClass3_241 == local6) {
			this.aClass3_242 = null;
			return null;
		} else {
			this.aClass3_242 = local6.aClass3_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(ILclient!mg;)V")
	public void method6610(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_338 != null) {
			arg0.method9034();
		}
		arg0.aClass3_338 = this.aClass3_241;
		arg0.aClass3_337 = this.aClass3_241.aClass3_337;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "c", descriptor = "(B)Lclient!mg;")
	public Class3 method6611() {
		@Pc(14) Class3 local14 = this.aClass3_241.aClass3_337;
		if (this.aClass3_241 == local14) {
			return null;
		} else {
			local14.method9034();
			return local14;
		}
	}

	@OriginalMember(owner = "client!qw", name = "d", descriptor = "(I)Z")
	public boolean method6612() {
		return this.aClass3_241 == this.aClass3_241.aClass3_337;
	}

	@OriginalMember(owner = "client!qw", name = "a", descriptor = "(Lclient!mg;I)V")
	public void method6613(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_338 != null) {
			arg0.method9034();
		}
		arg0.aClass3_338 = this.aClass3_241.aClass3_338;
		arg0.aClass3_337 = this.aClass3_241;
		arg0.aClass3_338.aClass3_337 = arg0;
		arg0.aClass3_337.aClass3_338 = arg0;
	}

	@OriginalMember(owner = "client!qw", name = "e", descriptor = "(I)V")
	public void method6614() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_241.aClass3_337;
			if (this.aClass3_241 == local5) {
				this.aClass3_242 = null;
				return;
			}
			local5.method9034();
		}
	}
}
