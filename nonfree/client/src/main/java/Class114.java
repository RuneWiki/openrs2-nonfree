import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fca")
public final class Class114 {

	@OriginalMember(owner = "client!fca", name = "m", descriptor = "Lclient!ko;")
	private Class5 aClass5_85;

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "Lclient!ko;")
	public final Class5 aClass5_84 = new Class5();

	@OriginalMember(owner = "client!fca", name = "<init>", descriptor = "()V")
	public Class114() {
		this.aClass5_84.aClass5_337 = this.aClass5_84;
		this.aClass5_84.aClass5_338 = this.aClass5_84;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(I)Lclient!ko;")
	public Class5 method2805() {
		@Pc(11) Class5 local11 = this.aClass5_84.aClass5_338;
		if (local11 == this.aClass5_84) {
			this.aClass5_85 = null;
			return null;
		} else {
			this.aClass5_85 = local11.aClass5_338;
			return local11;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!ko;I)V")
	public void method2807(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_337 != null) {
			arg0.method9052();
		}
		arg0.aClass5_337 = this.aClass5_84.aClass5_337;
		arg0.aClass5_338 = this.aClass5_84;
		arg0.aClass5_337.aClass5_338 = arg0;
		arg0.aClass5_338.aClass5_337 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)V")
	public void method2808() {
		while (true) {
			@Pc(3) Class5 local3 = this.aClass5_84.aClass5_338;
			if (this.aClass5_84 == local3) {
				this.aClass5_85 = null;
				return;
			}
			local3.method9052();
		}
	}

	@OriginalMember(owner = "client!fca", name = "e", descriptor = "(I)Z")
	public boolean method2810() {
		return this.aClass5_84 == this.aClass5_84.aClass5_338;
	}

	@OriginalMember(owner = "client!fca", name = "f", descriptor = "(I)I")
	public int method2811() {
		@Pc(10) int local10 = 0;
		@Pc(14) Class5 local14 = this.aClass5_84.aClass5_338;
		while (local14 != this.aClass5_84) {
			local14 = local14.aClass5_338;
			local10++;
		}
		return local10;
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(Lclient!ko;Z)V")
	public void method2812(@OriginalArg(0) Class5 arg0) {
		if (arg0.aClass5_337 != null) {
			arg0.method9052();
		}
		arg0.aClass5_337 = this.aClass5_84;
		arg0.aClass5_338 = this.aClass5_84.aClass5_338;
		arg0.aClass5_337.aClass5_338 = arg0;
		arg0.aClass5_338.aClass5_337 = arg0;
	}

	@OriginalMember(owner = "client!fca", name = "g", descriptor = "(I)Lclient!ko;")
	public Class5 method2813() {
		@Pc(7) Class5 local7 = this.aClass5_84.aClass5_338;
		if (this.aClass5_84 == local7) {
			return null;
		} else {
			local7.method9052();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(B)Lclient!ko;")
	public Class5 method2814() {
		@Pc(6) Class5 local6 = this.aClass5_85;
		if (local6 == this.aClass5_84) {
			this.aClass5_85 = null;
			return null;
		} else {
			this.aClass5_85 = local6.aClass5_338;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(BLclient!fca;Lclient!ko;)V")
	private void method2815(@OriginalArg(1) Class114 arg0, @OriginalArg(2) Class5 arg1) {
		@Pc(7) Class5 local7 = this.aClass5_84.aClass5_337;
		this.aClass5_84.aClass5_337 = arg1.aClass5_337;
		arg1.aClass5_337.aClass5_338 = this.aClass5_84;
		if (arg1 != this.aClass5_84) {
			arg1.aClass5_337 = arg0.aClass5_84.aClass5_337;
			arg1.aClass5_337.aClass5_338 = arg1;
			local7.aClass5_338 = arg0.aClass5_84;
			arg0.aClass5_84.aClass5_337 = local7;
		}
	}

	@OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLclient!fca;)V")
	public void method2816(@OriginalArg(1) Class114 arg0) {
		this.method2815(arg0, this.aClass5_84.aClass5_338);
	}

	@OriginalMember(owner = "client!fca", name = "b", descriptor = "(B)Lclient!ko;")
	public Class5 method2817() {
		@Pc(11) Class5 local11 = this.aClass5_85;
		if (this.aClass5_84 == local11) {
			this.aClass5_85 = null;
			return null;
		} else {
			this.aClass5_85 = local11.aClass5_337;
			return local11;
		}
	}

	@OriginalMember(owner = "client!fca", name = "h", descriptor = "(I)Lclient!ko;")
	public Class5 method2818() {
		@Pc(12) Class5 local12 = this.aClass5_84.aClass5_337;
		if (local12 == this.aClass5_84) {
			this.aClass5_85 = null;
			return null;
		} else {
			this.aClass5_85 = local12.aClass5_337;
			return local12;
		}
	}
}
