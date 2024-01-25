import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wc")
public final class Class262 {

	@OriginalMember(owner = "client!wc", name = "n", descriptor = "Lclient!mu;")
	private Class4 aClass4_26;

	@OriginalMember(owner = "client!wc", name = "g", descriptor = "Lclient!mu;")
	private final Class4 aClass4_25 = new Class4();

	@OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
	public Class262() {
		this.aClass4_25.aClass4_24 = this.aClass4_25;
		this.aClass4_25.aClass4_23 = this.aClass4_25;
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)Lclient!mu;")
	public Class4 method5811() {
		@Pc(7) Class4 local7 = this.aClass4_25.aClass4_23;
		if (this.aClass4_25 == local7) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local7.aClass4_23;
			return local7;
		}
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(I)V")
	public void method5812() {
		while (true) {
			@Pc(5) Class4 local5 = this.aClass4_25.aClass4_24;
			if (local5 == this.aClass4_25) {
				this.aClass4_26 = null;
				return;
			}
			local5.method5572();
		}
	}

	@OriginalMember(owner = "client!wc", name = "c", descriptor = "(I)Lclient!mu;")
	public Class4 method5813() {
		@Pc(6) Class4 local6 = this.aClass4_26;
		if (this.aClass4_25 == local6) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local6.aClass4_24;
			return local6;
		}
	}

	@OriginalMember(owner = "client!wc", name = "d", descriptor = "(I)Lclient!mu;")
	public Class4 method5814() {
		@Pc(14) Class4 local14 = this.aClass4_25.aClass4_24;
		if (local14 == this.aClass4_25) {
			return null;
		} else {
			local14.method5572();
			return local14;
		}
	}

	@OriginalMember(owner = "client!wc", name = "a", descriptor = "(BLclient!mu;)V")
	public void method5815(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_23 != null) {
			arg0.method5572();
		}
		arg0.aClass4_23 = this.aClass4_25.aClass4_23;
		arg0.aClass4_24 = this.aClass4_25;
		arg0.aClass4_23.aClass4_24 = arg0;
		arg0.aClass4_24.aClass4_23 = arg0;
	}

	@OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)Z")
	public boolean method5817() {
		return this.aClass4_25.aClass4_24 == this.aClass4_25;
	}

	@OriginalMember(owner = "client!wc", name = "b", descriptor = "(Z)I")
	public int method5818() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class4 local11 = this.aClass4_25.aClass4_24; local11 != this.aClass4_25; local11 = local11.aClass4_24) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)Lclient!mu;")
	public Class4 method5819() {
		@Pc(14) Class4 local14 = this.aClass4_25.aClass4_24;
		if (this.aClass4_25 == local14) {
			this.aClass4_26 = null;
			return null;
		} else {
			this.aClass4_26 = local14.aClass4_24;
			return local14;
		}
	}
}
