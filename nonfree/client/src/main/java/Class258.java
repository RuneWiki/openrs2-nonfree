import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vr")
public final class Class258 {

	@OriginalMember(owner = "client!vr", name = "r", descriptor = "Lclient!vg;")
	private Class4 aClass4_241;

	@OriginalMember(owner = "client!vr", name = "o", descriptor = "Lclient!vg;")
	public final Class4 aClass4_240 = new Class4();

	@OriginalMember(owner = "client!vr", name = "<init>", descriptor = "()V")
	public Class258() {
		this.aClass4_240.aClass4_262 = this.aClass4_240;
		this.aClass4_240.aClass4_261 = this.aClass4_240;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!vr;BLclient!vg;)V")
	private void method5525(@OriginalArg(0) Class258 arg0, @OriginalArg(2) Class4 arg1) {
		@Pc(7) Class4 local7 = this.aClass4_240.aClass4_262;
		this.aClass4_240.aClass4_262 = arg1.aClass4_262;
		arg1.aClass4_262.aClass4_261 = this.aClass4_240;
		if (this.aClass4_240 != arg1) {
			arg1.aClass4_262 = arg0.aClass4_240.aClass4_262;
			arg1.aClass4_262.aClass4_261 = arg1;
			local7.aClass4_261 = arg0.aClass4_240;
			arg0.aClass4_240.aClass4_262 = local7;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!vg;I)V")
	public void method5526(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_262 != null) {
			arg0.method5854();
		}
		arg0.aClass4_262 = this.aClass4_240.aClass4_262;
		arg0.aClass4_261 = this.aClass4_240;
		arg0.aClass4_262.aClass4_261 = arg0;
		arg0.aClass4_261.aClass4_262 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)V")
	public void method5527() {
		while (true) {
			@Pc(9) Class4 local9 = this.aClass4_240.aClass4_261;
			if (this.aClass4_240 == local9) {
				this.aClass4_241 = null;
				return;
			}
			local9.method5854();
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)Lclient!vg;")
	public Class4 method5528() {
		@Pc(13) Class4 local13 = this.aClass4_241;
		if (this.aClass4_240 == local13) {
			this.aClass4_241 = null;
			return null;
		} else {
			this.aClass4_241 = local13.aClass4_261;
			return local13;
		}
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(Lclient!vg;I)V")
	public void method5529(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_262 != null) {
			arg0.method5854();
		}
		arg0.aClass4_261 = this.aClass4_240.aClass4_261;
		arg0.aClass4_262 = this.aClass4_240;
		arg0.aClass4_262.aClass4_261 = arg0;
		arg0.aClass4_261.aClass4_262 = arg0;
	}

	@OriginalMember(owner = "client!vr", name = "b", descriptor = "(I)Lclient!vg;")
	public Class4 method5530() {
		@Pc(11) Class4 local11 = this.aClass4_240.aClass4_261;
		if (local11 == this.aClass4_240) {
			return null;
		} else {
			local11.method5854();
			return local11;
		}
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Z)Lclient!vg;")
	public Class4 method5532() {
		@Pc(12) Class4 local12 = this.aClass4_241;
		if (local12 == this.aClass4_240) {
			this.aClass4_241 = null;
			return null;
		} else {
			this.aClass4_241 = local12.aClass4_262;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)Z")
	public boolean method5533() {
		return this.aClass4_240 == this.aClass4_240.aClass4_261;
	}

	@OriginalMember(owner = "client!vr", name = "a", descriptor = "(Lclient!vr;I)V")
	public void method5534(@OriginalArg(0) Class258 arg0) {
		this.method5525(arg0, this.aClass4_240.aClass4_261);
	}

	@OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)I")
	public int method5535() {
		@Pc(15) int local15 = 0;
		for (@Pc(19) Class4 local19 = this.aClass4_240.aClass4_261; local19 != this.aClass4_240; local19 = local19.aClass4_261) {
			local15++;
		}
		return local15;
	}

	@OriginalMember(owner = "client!vr", name = "e", descriptor = "(I)Lclient!vg;")
	public Class4 method5536() {
		@Pc(13) Class4 local13 = this.aClass4_240.aClass4_262;
		if (this.aClass4_240 == local13) {
			this.aClass4_241 = null;
			return null;
		} else {
			this.aClass4_241 = local13.aClass4_262;
			return local13;
		}
	}

	@OriginalMember(owner = "client!vr", name = "f", descriptor = "(I)Lclient!vg;")
	public Class4 method5538() {
		@Pc(7) Class4 local7 = this.aClass4_240.aClass4_261;
		if (local7 == this.aClass4_240) {
			this.aClass4_241 = null;
			return null;
		} else {
			this.aClass4_241 = local7.aClass4_261;
			return local7;
		}
	}
}
