import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ar")
public final class Class14 {

	@OriginalMember(owner = "client!ar", name = "r", descriptor = "Lclient!uj;")
	private Class2 aClass2_18;

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "Lclient!uj;")
	public final Class2 aClass2_17 = new Class2();

	@OriginalMember(owner = "client!ar", name = "<init>", descriptor = "()V")
	public Class14() {
		this.aClass2_17.aClass2_261 = this.aClass2_17;
		this.aClass2_17.aClass2_262 = this.aClass2_17;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)I")
	public int method297() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class2 local11 = this.aClass2_17.aClass2_261; local11 != this.aClass2_17; local11 = local11.aClass2_261) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(I)Z")
	public boolean method298() {
		return this.aClass2_17 == this.aClass2_17.aClass2_261;
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ar;I)V")
	public void method299(@OriginalArg(0) Class14 arg0) {
		this.method303(arg0, this.aClass2_17.aClass2_261);
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!uj;I)V")
	public void method300(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_262 != null) {
			arg0.method5866();
		}
		arg0.aClass2_262 = this.aClass2_17.aClass2_262;
		arg0.aClass2_261 = this.aClass2_17;
		arg0.aClass2_262.aClass2_261 = arg0;
		arg0.aClass2_261.aClass2_262 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(I)Lclient!uj;")
	public Class2 method302() {
		@Pc(7) Class2 local7 = this.aClass2_17.aClass2_262;
		if (local7 == this.aClass2_17) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local7.aClass2_262;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!ar;Lclient!uj;I)V")
	private void method303(@OriginalArg(0) Class14 arg0, @OriginalArg(1) Class2 arg1) {
		@Pc(15) Class2 local15 = this.aClass2_17.aClass2_262;
		this.aClass2_17.aClass2_262 = arg1.aClass2_262;
		arg1.aClass2_262.aClass2_261 = this.aClass2_17;
		if (arg1 != this.aClass2_17) {
			arg1.aClass2_262 = arg0.aClass2_17.aClass2_262;
			arg1.aClass2_262.aClass2_261 = arg1;
			arg0.aClass2_17.aClass2_262 = local15;
			local15.aClass2_261 = arg0.aClass2_17;
		}
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(I)Lclient!uj;")
	public Class2 method304() {
		@Pc(6) Class2 local6 = this.aClass2_18;
		if (local6 == this.aClass2_17) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local6.aClass2_262;
			return local6;
		}
	}

	@OriginalMember(owner = "client!ar", name = "b", descriptor = "(B)V")
	public void method305() {
		while (true) {
			@Pc(9) Class2 local9 = this.aClass2_17.aClass2_261;
			if (local9 == this.aClass2_17) {
				this.aClass2_18 = null;
				return;
			}
			local9.method5866();
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Z)Lclient!uj;")
	public Class2 method307() {
		@Pc(7) Class2 local7 = this.aClass2_17.aClass2_261;
		if (this.aClass2_17 == local7) {
			return null;
		} else {
			local7.method5866();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ar", name = "a", descriptor = "(Lclient!uj;Z)V")
	public void method308(@OriginalArg(0) Class2 arg0) {
		if (arg0.aClass2_262 != null) {
			arg0.method5866();
		}
		arg0.aClass2_262 = this.aClass2_17;
		arg0.aClass2_261 = this.aClass2_17.aClass2_261;
		arg0.aClass2_262.aClass2_261 = arg0;
		arg0.aClass2_261.aClass2_262 = arg0;
	}

	@OriginalMember(owner = "client!ar", name = "c", descriptor = "(B)Lclient!uj;")
	public Class2 method309() {
		@Pc(7) Class2 local7 = this.aClass2_17.aClass2_261;
		if (this.aClass2_17 == local7) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local7.aClass2_261;
			return local7;
		}
	}

	@OriginalMember(owner = "client!ar", name = "d", descriptor = "(B)Lclient!uj;")
	public Class2 method311() {
		@Pc(6) Class2 local6 = this.aClass2_18;
		if (local6 == this.aClass2_17) {
			this.aClass2_18 = null;
			return null;
		} else {
			this.aClass2_18 = local6.aClass2_261;
			return local6;
		}
	}
}
