import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!oe")
public final class Class181 {

	@OriginalMember(owner = "client!oe", name = "e", descriptor = "Lclient!cf;")
	private Class1 aClass1_180;

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "Lclient!cf;")
	public final Class1 aClass1_179 = new Class1();

	@OriginalMember(owner = "client!oe", name = "<init>", descriptor = "()V")
	public Class181() {
		this.aClass1_179.aClass1_262 = this.aClass1_179;
		this.aClass1_179.aClass1_261 = this.aClass1_179;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
	public void method4101() {
		while (true) {
			@Pc(11) Class1 local11 = this.aClass1_179.aClass1_261;
			if (this.aClass1_179 == local11) {
				this.aClass1_180 = null;
				return;
			}
			local11.method6020();
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!cf;I)V")
	public void method4102(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_262 != null) {
			arg0.method6020();
		}
		arg0.aClass1_261 = this.aClass1_179;
		arg0.aClass1_262 = this.aClass1_179.aClass1_262;
		arg0.aClass1_262.aClass1_261 = arg0;
		arg0.aClass1_261.aClass1_262 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLclient!oe;)V")
	public void method4103(@OriginalArg(1) Class181 arg0) {
		this.method4107(arg0, this.aClass1_179.aClass1_261);
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)Lclient!cf;")
	public Class1 method4104() {
		@Pc(6) Class1 local6 = this.aClass1_180;
		if (this.aClass1_179 == local6) {
			this.aClass1_180 = null;
			return null;
		} else {
			this.aClass1_180 = local6.aClass1_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Lclient!cf;I)V")
	public void method4106(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_262 != null) {
			arg0.method6020();
		}
		arg0.aClass1_262 = this.aClass1_179;
		arg0.aClass1_261 = this.aClass1_179.aClass1_261;
		arg0.aClass1_262.aClass1_261 = arg0;
		arg0.aClass1_261.aClass1_262 = arg0;
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lclient!oe;BLclient!cf;)V")
	private void method4107(@OriginalArg(0) Class181 arg0, @OriginalArg(2) Class1 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_179.aClass1_262;
		this.aClass1_179.aClass1_262 = arg1.aClass1_262;
		arg1.aClass1_262.aClass1_261 = this.aClass1_179;
		if (arg1 != this.aClass1_179) {
			arg1.aClass1_262 = arg0.aClass1_179.aClass1_262;
			arg1.aClass1_262.aClass1_261 = arg1;
			arg0.aClass1_179.aClass1_262 = local7;
			local7.aClass1_261 = arg0.aClass1_179;
		}
	}

	@OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)I")
	public int method4108() {
		@Pc(12) int local12 = 0;
		for (@Pc(16) Class1 local16 = this.aClass1_179.aClass1_261; local16 != this.aClass1_179; local16 = local16.aClass1_261) {
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(I)Lclient!cf;")
	public Class1 method4109() {
		@Pc(14) Class1 local14 = this.aClass1_179.aClass1_261;
		if (this.aClass1_179 == local14) {
			return null;
		} else {
			local14.method6020();
			return local14;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(B)Lclient!cf;")
	public Class1 method4110() {
		@Pc(13) Class1 local13 = this.aClass1_179.aClass1_262;
		if (local13 == this.aClass1_179) {
			this.aClass1_180 = null;
			return null;
		} else {
			this.aClass1_180 = local13.aClass1_262;
			return local13;
		}
	}

	@OriginalMember(owner = "client!oe", name = "b", descriptor = "(Z)Lclient!cf;")
	public Class1 method4111() {
		@Pc(11) Class1 local11 = this.aClass1_180;
		if (this.aClass1_179 == local11) {
			this.aClass1_180 = null;
			return null;
		} else {
			this.aClass1_180 = local11.aClass1_262;
			return local11;
		}
	}

	@OriginalMember(owner = "client!oe", name = "c", descriptor = "(B)Lclient!cf;")
	public Class1 method4112() {
		@Pc(12) Class1 local12 = this.aClass1_179.aClass1_261;
		if (this.aClass1_179 == local12) {
			this.aClass1_180 = null;
			return null;
		} else {
			this.aClass1_180 = local12.aClass1_261;
			return local12;
		}
	}

	@OriginalMember(owner = "client!oe", name = "d", descriptor = "(B)Z")
	public boolean method4113() {
		return this.aClass1_179 == this.aClass1_179.aClass1_261;
	}
}
