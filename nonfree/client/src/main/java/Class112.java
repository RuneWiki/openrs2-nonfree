import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gk")
public final class Class112 {

	@OriginalMember(owner = "client!gk", name = "v", descriptor = "Lclient!gga;")
	private Class3 aClass3_112;

	@OriginalMember(owner = "client!gk", name = "h", descriptor = "Lclient!gga;")
	public final Class3 aClass3_111 = new Class3();

	@OriginalMember(owner = "client!gk", name = "<init>", descriptor = "()V")
	public Class112() {
		this.aClass3_111.aClass3_286 = this.aClass3_111;
		this.aClass3_111.aClass3_285 = this.aClass3_111;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!gga;Z)V")
	public void method3079(@OriginalArg(0) Class3 arg0) {
		if (arg0.aClass3_285 != null) {
			arg0.method7825();
		}
		arg0.aClass3_285 = this.aClass3_111.aClass3_285;
		arg0.aClass3_286 = this.aClass3_111;
		arg0.aClass3_285.aClass3_286 = arg0;
		arg0.aClass3_286.aClass3_285 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Lclient!gga;")
	public Class3 method3080() {
		@Pc(6) Class3 local6 = this.aClass3_112;
		if (local6 == this.aClass3_111) {
			this.aClass3_112 = null;
			return null;
		} else {
			this.aClass3_112 = local6.aClass3_285;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lclient!gk;I)V")
	public void method3082(@OriginalArg(0) Class112 arg0) {
		this.method3089(this.aClass3_111.aClass3_286, arg0);
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(B)I")
	public int method3083() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class3 local16 = this.aClass3_111.aClass3_286;
		while (this.aClass3_111 != local16) {
			local16 = local16.aClass3_286;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(Z)Lclient!gga;")
	public Class3 method3084() {
		@Pc(6) Class3 local6 = this.aClass3_112;
		if (this.aClass3_111 == local6) {
			this.aClass3_112 = null;
			return null;
		} else {
			this.aClass3_112 = local6.aClass3_286;
			return local6;
		}
	}

	@OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)Lclient!gga;")
	public Class3 method3086() {
		@Pc(7) Class3 local7 = this.aClass3_111.aClass3_285;
		if (local7 == this.aClass3_111) {
			this.aClass3_112 = null;
			return null;
		} else {
			this.aClass3_112 = local7.aClass3_285;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gk", name = "d", descriptor = "(B)Lclient!gga;")
	public Class3 method3088() {
		@Pc(7) Class3 local7 = this.aClass3_111.aClass3_286;
		if (local7 == this.aClass3_111) {
			this.aClass3_112 = null;
			return null;
		} else {
			this.aClass3_112 = local7.aClass3_286;
			return local7;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILclient!gga;Lclient!gk;)V")
	private void method3089(@OriginalArg(1) Class3 arg0, @OriginalArg(2) Class112 arg1) {
		@Pc(7) Class3 local7 = this.aClass3_111.aClass3_285;
		this.aClass3_111.aClass3_285 = arg0.aClass3_285;
		arg0.aClass3_285.aClass3_286 = this.aClass3_111;
		if (arg0 != this.aClass3_111) {
			arg0.aClass3_285 = arg1.aClass3_111.aClass3_285;
			arg0.aClass3_285.aClass3_286 = arg0;
			local7.aClass3_286 = arg1.aClass3_111;
			arg1.aClass3_111.aClass3_285 = local7;
		}
	}

	@OriginalMember(owner = "client!gk", name = "a", descriptor = "(BLclient!gga;)V")
	public void method3091(@OriginalArg(1) Class3 arg0) {
		if (arg0.aClass3_285 != null) {
			arg0.method7825();
		}
		arg0.aClass3_286 = this.aClass3_111.aClass3_286;
		arg0.aClass3_285 = this.aClass3_111;
		arg0.aClass3_285.aClass3_286 = arg0;
		arg0.aClass3_286.aClass3_285 = arg0;
	}

	@OriginalMember(owner = "client!gk", name = "c", descriptor = "(I)V")
	public void method3092() {
		while (true) {
			@Pc(5) Class3 local5 = this.aClass3_111.aClass3_286;
			if (this.aClass3_111 == local5) {
				this.aClass3_112 = null;
				return;
			}
			local5.method7825();
		}
	}

	@OriginalMember(owner = "client!gk", name = "e", descriptor = "(B)Z")
	public boolean method3093() {
		return this.aClass3_111.aClass3_286 == this.aClass3_111;
	}

	@OriginalMember(owner = "client!gk", name = "f", descriptor = "(B)Lclient!gga;")
	public Class3 method3094() {
		@Pc(15) Class3 local15 = this.aClass3_111.aClass3_286;
		if (this.aClass3_111 == local15) {
			return null;
		} else {
			local15.method7825();
			return local15;
		}
	}
}
