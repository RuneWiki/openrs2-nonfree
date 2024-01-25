import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!sr")
public final class Class227 {

	@OriginalMember(owner = "client!sr", name = "p", descriptor = "Lclient!pe;")
	private Class1 aClass1_226;

	@OriginalMember(owner = "client!sr", name = "m", descriptor = "Lclient!pe;")
	public final Class1 aClass1_225 = new Class1();

	static {
		new Class119("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
	}

	@OriginalMember(owner = "client!sr", name = "<init>", descriptor = "()V")
	public Class227() {
		this.aClass1_225.aClass1_262 = this.aClass1_225;
		this.aClass1_225.aClass1_261 = this.aClass1_225;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(I)Lclient!pe;")
	public Class1 method4967() {
		@Pc(7) Class1 local7 = this.aClass1_225.aClass1_261;
		if (this.aClass1_225 == local7) {
			this.aClass1_226 = null;
			return null;
		} else {
			this.aClass1_226 = local7.aClass1_261;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(ILclient!pe;)V")
	public void method4968(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_262 != null) {
			arg0.method5915();
		}
		arg0.aClass1_261 = this.aClass1_225.aClass1_261;
		arg0.aClass1_262 = this.aClass1_225;
		arg0.aClass1_262.aClass1_261 = arg0;
		arg0.aClass1_261.aClass1_262 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(I)Lclient!pe;")
	public Class1 method4969() {
		@Pc(6) Class1 local6 = this.aClass1_226;
		if (local6 == this.aClass1_225) {
			this.aClass1_226 = null;
			return null;
		} else {
			this.aClass1_226 = local6.aClass1_262;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!sr;I)V")
	public void method4971(@OriginalArg(0) Class227 arg0) {
		this.method4980(arg0, this.aClass1_225.aClass1_261);
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(ILclient!pe;)V")
	public void method4972(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_262 != null) {
			arg0.method5915();
		}
		arg0.aClass1_261 = this.aClass1_225;
		arg0.aClass1_262 = this.aClass1_225.aClass1_262;
		arg0.aClass1_262.aClass1_261 = arg0;
		arg0.aClass1_261.aClass1_262 = arg0;
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(B)Lclient!pe;")
	public Class1 method4973() {
		@Pc(6) Class1 local6 = this.aClass1_226;
		if (this.aClass1_225 == local6) {
			this.aClass1_226 = null;
			return null;
		} else {
			this.aClass1_226 = local6.aClass1_261;
			return local6;
		}
	}

	@OriginalMember(owner = "client!sr", name = "b", descriptor = "(B)Lclient!pe;")
	public Class1 method4974() {
		@Pc(15) Class1 local15 = this.aClass1_225.aClass1_261;
		if (local15 == this.aClass1_225) {
			return null;
		} else {
			local15.method5915();
			return local15;
		}
	}

	@OriginalMember(owner = "client!sr", name = "d", descriptor = "(I)I")
	public int method4975() {
		@Pc(14) int local14 = 0;
		@Pc(18) Class1 local18 = this.aClass1_225.aClass1_261;
		while (this.aClass1_225 != local18) {
			local18 = local18.aClass1_261;
			local14++;
		}
		return local14;
	}

	@OriginalMember(owner = "client!sr", name = "e", descriptor = "(I)Z")
	public boolean method4976() {
		return this.aClass1_225 == this.aClass1_225.aClass1_261;
	}

	@OriginalMember(owner = "client!sr", name = "f", descriptor = "(I)Lclient!pe;")
	public Class1 method4978() {
		@Pc(7) Class1 local7 = this.aClass1_225.aClass1_262;
		if (local7 == this.aClass1_225) {
			this.aClass1_226 = null;
			return null;
		} else {
			this.aClass1_226 = local7.aClass1_262;
			return local7;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Lclient!sr;Lclient!pe;I)V")
	private void method4980(@OriginalArg(0) Class227 arg0, @OriginalArg(1) Class1 arg1) {
		@Pc(14) Class1 local14 = this.aClass1_225.aClass1_262;
		this.aClass1_225.aClass1_262 = arg1.aClass1_262;
		arg1.aClass1_262.aClass1_261 = this.aClass1_225;
		if (arg1 != this.aClass1_225) {
			arg1.aClass1_262 = arg0.aClass1_225.aClass1_262;
			arg1.aClass1_262.aClass1_261 = arg1;
			arg0.aClass1_225.aClass1_262 = local14;
			local14.aClass1_261 = arg0.aClass1_225;
		}
	}

	@OriginalMember(owner = "client!sr", name = "a", descriptor = "(Z)V")
	public void method4981() {
		while (true) {
			@Pc(9) Class1 local9 = this.aClass1_225.aClass1_261;
			if (this.aClass1_225 == local9) {
				this.aClass1_226 = null;
				return;
			}
			local9.method5915();
		}
	}
}
