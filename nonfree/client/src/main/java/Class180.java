import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sf")
public final class Class180 {

	@OriginalMember(owner = "client!sf", name = "v", descriptor = "Lclient!nr;")
	private Class2 aClass2_208;

	@OriginalMember(owner = "client!sf", name = "m", descriptor = "Lclient!nr;")
	public final Class2 aClass2_207 = new Class2();

	@OriginalMember(owner = "client!sf", name = "<init>", descriptor = "()V")
	public Class180() {
		this.aClass2_207.aClass2_251 = this.aClass2_207;
		this.aClass2_207.aClass2_252 = this.aClass2_207;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(I)I")
	public int method4907() {
		@Pc(7) int local7 = 0;
		for (@Pc(19) Class2 local19 = this.aClass2_207.aClass2_251; local19 != this.aClass2_207; local19 = local19.aClass2_251) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILclient!nr;)V")
	public void method4909(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_252 != null) {
			arg0.method5723();
		}
		arg0.aClass2_251 = this.aClass2_207;
		arg0.aClass2_252 = this.aClass2_207.aClass2_252;
		arg0.aClass2_252.aClass2_251 = arg0;
		arg0.aClass2_251.aClass2_252 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sf;I)V")
	public void method4910(@OriginalArg(0) Class180 arg0) {
		this.method4912(arg0, this.aClass2_207.aClass2_251);
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Z)Z")
	public boolean method4911() {
		return this.aClass2_207.aClass2_251 == this.aClass2_207;
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(Lclient!sf;BLclient!nr;)V")
	private void method4912(@OriginalArg(0) Class180 arg0, @OriginalArg(2) Class2 arg1) {
		@Pc(7) Class2 local7 = this.aClass2_207.aClass2_252;
		this.aClass2_207.aClass2_252 = arg1.aClass2_252;
		arg1.aClass2_252.aClass2_251 = this.aClass2_207;
		if (this.aClass2_207 != arg1) {
			arg1.aClass2_252 = arg0.aClass2_207.aClass2_252;
			arg1.aClass2_252.aClass2_251 = arg1;
			arg0.aClass2_207.aClass2_252 = local7;
			local7.aClass2_251 = arg0.aClass2_207;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(Z)Lclient!nr;")
	public Class2 method4914() {
		@Pc(12) Class2 local12 = this.aClass2_207.aClass2_251;
		if (local12 == this.aClass2_207) {
			return null;
		} else {
			local12.method5723();
			return local12;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(I)Lclient!nr;")
	public Class2 method4916() {
		@Pc(6) Class2 local6 = this.aClass2_208;
		if (local6 == this.aClass2_207) {
			this.aClass2_208 = null;
			return null;
		} else {
			this.aClass2_208 = local6.aClass2_251;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sf", name = "b", descriptor = "(B)V")
	public void method4917() {
		while (true) {
			@Pc(9) Class2 local9 = this.aClass2_207.aClass2_251;
			if (this.aClass2_207 == local9) {
				this.aClass2_208 = null;
				return;
			}
			local9.method5723();
		}
	}

	@OriginalMember(owner = "client!sf", name = "a", descriptor = "(BLclient!nr;)V")
	public void method4918(@OriginalArg(1) Class2 arg0) {
		if (arg0.aClass2_252 != null) {
			arg0.method5723();
		}
		arg0.aClass2_252 = this.aClass2_207;
		arg0.aClass2_251 = this.aClass2_207.aClass2_251;
		arg0.aClass2_252.aClass2_251 = arg0;
		arg0.aClass2_251.aClass2_252 = arg0;
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(B)Lclient!nr;")
	public Class2 method4919() {
		@Pc(7) Class2 local7 = this.aClass2_207.aClass2_251;
		if (local7 == this.aClass2_207) {
			this.aClass2_208 = null;
			return null;
		} else {
			this.aClass2_208 = local7.aClass2_251;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)Lclient!nr;")
	public Class2 method4920() {
		@Pc(12) Class2 local12 = this.aClass2_207.aClass2_252;
		if (local12 == this.aClass2_207) {
			this.aClass2_208 = null;
			return null;
		} else {
			this.aClass2_208 = local12.aClass2_252;
			return local12;
		}
	}

	@OriginalMember(owner = "client!sf", name = "d", descriptor = "(I)Lclient!nr;")
	public Class2 method4921() {
		@Pc(11) Class2 local11 = this.aClass2_208;
		if (local11 == this.aClass2_207) {
			this.aClass2_208 = null;
			return null;
		} else {
			this.aClass2_208 = local11.aClass2_252;
			return local11;
		}
	}
}
