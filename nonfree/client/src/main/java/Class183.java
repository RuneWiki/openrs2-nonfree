import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pk")
public final class Class183 {

	@OriginalMember(owner = "client!pk", name = "r", descriptor = "Lclient!vu;")
	private Class4 aClass4_208;

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "Lclient!vu;")
	public final Class4 aClass4_207 = new Class4();

	@OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V")
	public Class183() {
		this.aClass4_207.aClass4_261 = this.aClass4_207;
		this.aClass4_207.aClass4_262 = this.aClass4_207;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ILclient!vu;)V")
	public void method4133(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_261 != null) {
			arg0.method5684();
		}
		arg0.aClass4_262 = this.aClass4_207.aClass4_262;
		arg0.aClass4_261 = this.aClass4_207;
		arg0.aClass4_261.aClass4_262 = arg0;
		arg0.aClass4_262.aClass4_261 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)Lclient!vu;")
	public Class4 method4136() {
		@Pc(7) Class4 local7 = this.aClass4_207.aClass4_262;
		if (this.aClass4_207 == local7) {
			return null;
		} else {
			local7.method5684();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLclient!vu;)V")
	public void method4137(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_261 != null) {
			arg0.method5684();
		}
		arg0.aClass4_262 = this.aClass4_207;
		arg0.aClass4_261 = this.aClass4_207.aClass4_261;
		arg0.aClass4_261.aClass4_262 = arg0;
		arg0.aClass4_262.aClass4_261 = arg0;
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)V")
	public void method4138() {
		while (true) {
			@Pc(5) Class4 local5 = this.aClass4_207.aClass4_262;
			if (this.aClass4_207 == local5) {
				this.aClass4_208 = null;
				return;
			}
			local5.method5684();
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Lclient!vu;")
	public Class4 method4139() {
		@Pc(12) Class4 local12 = this.aClass4_207.aClass4_261;
		if (this.aClass4_207 == local12) {
			this.aClass4_208 = null;
			return null;
		} else {
			this.aClass4_208 = local12.aClass4_261;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(I)Lclient!vu;")
	public Class4 method4140() {
		@Pc(12) Class4 local12 = this.aClass4_207.aClass4_262;
		if (this.aClass4_207 == local12) {
			this.aClass4_208 = null;
			return null;
		} else {
			this.aClass4_208 = local12.aClass4_262;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!vu;ZLclient!pk;)V")
	private void method4141(@OriginalArg(0) Class4 arg0, @OriginalArg(2) Class183 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_207.aClass4_261;
		this.aClass4_207.aClass4_261 = arg0.aClass4_261;
		arg0.aClass4_261.aClass4_262 = this.aClass4_207;
		if (arg0 != this.aClass4_207) {
			arg0.aClass4_261 = arg1.aClass4_207.aClass4_261;
			arg0.aClass4_261.aClass4_262 = arg0;
			arg1.aClass4_207.aClass4_261 = local7;
			local7.aClass4_262 = arg1.aClass4_207;
		}
	}

	@OriginalMember(owner = "client!pk", name = "b", descriptor = "(B)Lclient!vu;")
	public Class4 method4144() {
		@Pc(6) Class4 local6 = this.aClass4_208;
		if (this.aClass4_207 == local6) {
			this.aClass4_208 = null;
			return null;
		} else {
			this.aClass4_208 = local6.aClass4_262;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pk", name = "c", descriptor = "(B)Lclient!vu;")
	public Class4 method4145() {
		@Pc(6) Class4 local6 = this.aClass4_208;
		if (this.aClass4_207 == local6) {
			this.aClass4_208 = null;
			return null;
		} else {
			this.aClass4_208 = local6.aClass4_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)Z")
	public boolean method4147() {
		return this.aClass4_207.aClass4_262 == this.aClass4_207;
	}

	@OriginalMember(owner = "client!pk", name = "e", descriptor = "(I)I")
	public int method4148() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class4 local11 = this.aClass4_207.aClass4_262; local11 != this.aClass4_207; local11 = local11.aClass4_262) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lclient!pk;B)V")
	public void method4149(@OriginalArg(0) Class183 arg0) {
		this.method4141(this.aClass4_207.aClass4_262, arg0);
	}
}
