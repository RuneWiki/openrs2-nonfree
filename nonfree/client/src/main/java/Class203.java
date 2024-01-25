import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pu")
public final class Class203 {

	@OriginalMember(owner = "client!pu", name = "r", descriptor = "Lclient!jp;")
	private Class1 aClass1_196;

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "Lclient!jp;")
	public final Class1 aClass1_195 = new Class1();

	@OriginalMember(owner = "client!pu", name = "<init>", descriptor = "()V")
	public Class203() {
		this.aClass1_195.aClass1_263 = this.aClass1_195;
		this.aClass1_195.aClass1_264 = this.aClass1_195;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(I)Lclient!jp;")
	public Class1 method4544() {
		@Pc(6) Class1 local6 = this.aClass1_196;
		if (local6 == this.aClass1_195) {
			this.aClass1_196 = null;
			return null;
		} else {
			this.aClass1_196 = local6.aClass1_263;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(B)Lclient!jp;")
	public Class1 method4545() {
		@Pc(6) Class1 local6 = this.aClass1_196;
		if (local6 == this.aClass1_195) {
			this.aClass1_196 = null;
			return null;
		} else {
			this.aClass1_196 = local6.aClass1_264;
			return local6;
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(I)Lclient!jp;")
	public Class1 method4548() {
		@Pc(12) Class1 local12 = this.aClass1_195.aClass1_264;
		if (this.aClass1_195 == local12) {
			this.aClass1_196 = null;
			return null;
		} else {
			this.aClass1_196 = local12.aClass1_264;
			return local12;
		}
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(I)Lclient!jp;")
	public Class1 method4549() {
		@Pc(7) Class1 local7 = this.aClass1_195.aClass1_264;
		if (local7 == this.aClass1_195) {
			return null;
		} else {
			local7.method6178();
			return local7;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!jp;Lclient!pu;I)V")
	private void method4550(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class203 arg1) {
		@Pc(7) Class1 local7 = this.aClass1_195.aClass1_263;
		this.aClass1_195.aClass1_263 = arg0.aClass1_263;
		arg0.aClass1_263.aClass1_264 = this.aClass1_195;
		if (arg0 != this.aClass1_195) {
			arg0.aClass1_263 = arg1.aClass1_195.aClass1_263;
			arg0.aClass1_263.aClass1_264 = arg0;
			local7.aClass1_264 = arg1.aClass1_195;
			arg1.aClass1_195.aClass1_263 = local7;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(ILclient!jp;)V")
	public void method4551(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_263 != null) {
			arg0.method6178();
		}
		arg0.aClass1_263 = this.aClass1_195.aClass1_263;
		arg0.aClass1_264 = this.aClass1_195;
		arg0.aClass1_263.aClass1_264 = arg0;
		arg0.aClass1_264.aClass1_263 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "d", descriptor = "(I)I")
	public int method4552() {
		@Pc(13) int local13 = 0;
		for (@Pc(17) Class1 local17 = this.aClass1_195.aClass1_264; local17 != this.aClass1_195; local17 = local17.aClass1_264) {
			local13++;
		}
		return local13;
	}

	@OriginalMember(owner = "client!pu", name = "e", descriptor = "(I)V")
	public void method4553() {
		while (true) {
			@Pc(11) Class1 local11 = this.aClass1_195.aClass1_264;
			if (local11 == this.aClass1_195) {
				this.aClass1_196 = null;
				return;
			}
			local11.method6178();
		}
	}

	@OriginalMember(owner = "client!pu", name = "b", descriptor = "(B)Z")
	public boolean method4554() {
		return this.aClass1_195 == this.aClass1_195.aClass1_264;
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!jp;I)V")
	public void method4555(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_263 != null) {
			arg0.method6178();
		}
		arg0.aClass1_264 = this.aClass1_195.aClass1_264;
		arg0.aClass1_263 = this.aClass1_195;
		arg0.aClass1_263.aClass1_264 = arg0;
		arg0.aClass1_264.aClass1_263 = arg0;
	}

	@OriginalMember(owner = "client!pu", name = "c", descriptor = "(B)Lclient!jp;")
	public Class1 method4556() {
		@Pc(7) Class1 local7 = this.aClass1_195.aClass1_263;
		if (this.aClass1_195 == local7) {
			this.aClass1_196 = null;
			return null;
		} else {
			this.aClass1_196 = local7.aClass1_263;
			return local7;
		}
	}

	@OriginalMember(owner = "client!pu", name = "a", descriptor = "(Lclient!pu;I)V")
	public void method4558(@OriginalArg(0) Class203 arg0) {
		this.method4550(this.aClass1_195.aClass1_264, arg0);
	}
}
