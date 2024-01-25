import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ui")
public final class Class295 {

	@OriginalMember(owner = "client!ui", name = "r", descriptor = "Lclient!wda;")
	private Class1 aClass1_261;

	@OriginalMember(owner = "client!ui", name = "g", descriptor = "Lclient!wda;")
	public final Class1 aClass1_260 = new Class1();

	@OriginalMember(owner = "client!ui", name = "<init>", descriptor = "()V")
	public Class295() {
		this.aClass1_260.aClass1_284 = this.aClass1_260;
		this.aClass1_260.aClass1_283 = this.aClass1_260;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!wda;I)V")
	public void method7533(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_284 != null) {
			arg0.method8239();
		}
		arg0.aClass1_284 = this.aClass1_260.aClass1_284;
		arg0.aClass1_283 = this.aClass1_260;
		arg0.aClass1_284.aClass1_283 = arg0;
		arg0.aClass1_283.aClass1_284 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!wda;ILclient!ui;)V")
	private void method7534(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class295 arg1) {
		@Pc(15) Class1 local15 = this.aClass1_260.aClass1_284;
		this.aClass1_260.aClass1_284 = arg0.aClass1_284;
		arg0.aClass1_284.aClass1_283 = this.aClass1_260;
		if (arg0 != this.aClass1_260) {
			arg0.aClass1_284 = arg1.aClass1_260.aClass1_284;
			arg0.aClass1_284.aClass1_283 = arg0;
			arg1.aClass1_260.aClass1_284 = local15;
			local15.aClass1_283 = arg1.aClass1_260;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)Lclient!wda;")
	public Class1 method7535() {
		@Pc(7) Class1 local7 = this.aClass1_260.aClass1_284;
		if (local7 == this.aClass1_260) {
			this.aClass1_261 = null;
			return null;
		} else {
			this.aClass1_261 = local7.aClass1_284;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Z)Z")
	public boolean method7536() {
		return this.aClass1_260.aClass1_283 == this.aClass1_260;
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lclient!ui;I)V")
	public void method7537(@OriginalArg(0) Class295 arg0) {
		this.method7534(this.aClass1_260.aClass1_283, arg0);
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)Lclient!wda;")
	public Class1 method7540() {
		@Pc(6) Class1 local6 = this.aClass1_261;
		if (this.aClass1_260 == local6) {
			this.aClass1_261 = null;
			return null;
		} else {
			this.aClass1_261 = local6.aClass1_283;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)V")
	public void method7541() {
		while (true) {
			@Pc(13) Class1 local13 = this.aClass1_260.aClass1_283;
			if (local13 == this.aClass1_260) {
				this.aClass1_261 = null;
				return;
			}
			local13.method8239();
		}
	}

	@OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Lclient!wda;")
	public Class1 method7543() {
		@Pc(7) Class1 local7 = this.aClass1_260.aClass1_283;
		if (local7 == this.aClass1_260) {
			this.aClass1_261 = null;
			return null;
		} else {
			this.aClass1_261 = local7.aClass1_283;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)Lclient!wda;")
	public Class1 method7544() {
		@Pc(6) Class1 local6 = this.aClass1_261;
		if (local6 == this.aClass1_260) {
			this.aClass1_261 = null;
			return null;
		} else {
			this.aClass1_261 = local6.aClass1_284;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(Lclient!wda;I)V")
	public void method7546(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_284 != null) {
			arg0.method8239();
		}
		arg0.aClass1_283 = this.aClass1_260.aClass1_283;
		arg0.aClass1_284 = this.aClass1_260;
		arg0.aClass1_284.aClass1_283 = arg0;
		arg0.aClass1_283.aClass1_284 = arg0;
	}

	@OriginalMember(owner = "client!ui", name = "b", descriptor = "(B)Lclient!wda;")
	public Class1 method7547() {
		@Pc(13) Class1 local13 = this.aClass1_260.aClass1_283;
		if (this.aClass1_260 == local13) {
			return null;
		} else {
			local13.method8239();
			return local13;
		}
	}

	@OriginalMember(owner = "client!ui", name = "f", descriptor = "(I)I")
	public int method7548() {
		@Pc(7) int local7 = 0;
		@Pc(11) Class1 local11 = this.aClass1_260.aClass1_283;
		while (local11 != this.aClass1_260) {
			local11 = local11.aClass1_283;
			local7++;
		}
		return local7;
	}
}
