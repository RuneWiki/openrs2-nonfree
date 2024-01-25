import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ifa")
public final class Class163 {

	@OriginalMember(owner = "client!ifa", name = "r", descriptor = "Lclient!oq;")
	private Class4 aClass4_128;

	@OriginalMember(owner = "client!ifa", name = "p", descriptor = "Lclient!oq;")
	public final Class4 aClass4_127 = new Class4();

	@OriginalMember(owner = "client!ifa", name = "<init>", descriptor = "()V")
	public Class163() {
		this.aClass4_127.aClass4_337 = this.aClass4_127;
		this.aClass4_127.aClass4_338 = this.aClass4_127;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(B)Z")
	public boolean method3638() {
		return this.aClass4_127.aClass4_337 == this.aClass4_127;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(I)Lclient!oq;")
	public Class4 method3639() {
		@Pc(12) Class4 local12 = this.aClass4_127.aClass4_337;
		if (this.aClass4_127 == local12) {
			this.aClass4_128 = null;
			return null;
		} else {
			this.aClass4_128 = local12.aClass4_337;
			return local12;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(I)Lclient!oq;")
	public Class4 method3640() {
		@Pc(6) Class4 local6 = this.aClass4_128;
		if (local6 == this.aClass4_127) {
			this.aClass4_128 = null;
			return null;
		} else {
			this.aClass4_128 = local6.aClass4_337;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!oq;I)V")
	public void method3641(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_338 != null) {
			arg0.method9000();
		}
		arg0.aClass4_338 = this.aClass4_127;
		arg0.aClass4_337 = this.aClass4_127.aClass4_337;
		arg0.aClass4_338.aClass4_337 = arg0;
		arg0.aClass4_337.aClass4_338 = arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "c", descriptor = "(I)V")
	public void method3643() {
		while (true) {
			@Pc(5) Class4 local5 = this.aClass4_127.aClass4_337;
			if (this.aClass4_127 == local5) {
				this.aClass4_128 = null;
				return;
			}
			local5.method9000();
		}
	}

	@OriginalMember(owner = "client!ifa", name = "d", descriptor = "(I)Lclient!oq;")
	public Class4 method3644() {
		@Pc(7) Class4 local7 = this.aClass4_127.aClass4_337;
		if (this.aClass4_127 == local7) {
			return null;
		} else {
			local7.method9000();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(Lclient!oq;I)V")
	public void method3646(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_338 != null) {
			arg0.method9000();
		}
		arg0.aClass4_338 = this.aClass4_127.aClass4_338;
		arg0.aClass4_337 = this.aClass4_127;
		arg0.aClass4_338.aClass4_337 = arg0;
		arg0.aClass4_337.aClass4_338 = arg0;
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(Lclient!ifa;I)V")
	public void method3647(@OriginalArg(0) Class163 arg0) {
		this.method3652(arg0, this.aClass4_127.aClass4_337);
	}

	@OriginalMember(owner = "client!ifa", name = "f", descriptor = "(I)Lclient!oq;")
	public Class4 method3648() {
		@Pc(7) Class4 local7 = this.aClass4_127.aClass4_338;
		if (local7 == this.aClass4_127) {
			this.aClass4_128 = null;
			return null;
		} else {
			this.aClass4_128 = local7.aClass4_338;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "g", descriptor = "(I)I")
	public int method3650() {
		@Pc(7) int local7 = 0;
		@Pc(16) Class4 local16 = this.aClass4_127.aClass4_337;
		while (local16 != this.aClass4_127) {
			local16 = local16.aClass4_337;
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ifa", name = "b", descriptor = "(B)Lclient!oq;")
	public Class4 method3651() {
		@Pc(11) Class4 local11 = this.aClass4_128;
		if (local11 == this.aClass4_127) {
			this.aClass4_128 = null;
			return null;
		} else {
			this.aClass4_128 = local11.aClass4_338;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ifa", name = "a", descriptor = "(ILclient!ifa;Lclient!oq;)V")
	private void method3652(@OriginalArg(1) Class163 arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_127.aClass4_338;
		this.aClass4_127.aClass4_338 = arg1.aClass4_338;
		arg1.aClass4_338.aClass4_337 = this.aClass4_127;
		if (arg1 != this.aClass4_127) {
			arg1.aClass4_338 = arg0.aClass4_127.aClass4_338;
			arg1.aClass4_338.aClass4_337 = arg1;
			local7.aClass4_337 = arg0.aClass4_127;
			arg0.aClass4_127.aClass4_338 = local7;
		}
	}
}
