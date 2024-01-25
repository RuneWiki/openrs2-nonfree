import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!um")
public final class Class248 {

	@OriginalMember(owner = "client!um", name = "n", descriptor = "Lclient!jt;")
	private Class20 aClass20_22;

	@OriginalMember(owner = "client!um", name = "l", descriptor = "Lclient!jt;")
	private final Class20 aClass20_21 = new Class20();

	static {
		new Class15("Unable to join clan chat at this time - please try again later!", "Chatraum kann nicht betreten werden - bitte versuch es später erneut.", "Impossible de participer à une discussion de clan pour le moment - veuillez réessayer ultérieurement.", "Não foi possível entrar no bate-papo do clã dessa vez. Tente de novo depois!");
	}

	@OriginalMember(owner = "client!um", name = "<init>", descriptor = "()V")
	public Class248() {
		this.aClass20_21.aClass20_23 = this.aClass20_21;
		this.aClass20_21.aClass20_24 = this.aClass20_21;
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(I)Z")
	public boolean method5575() {
		return this.aClass20_21 == this.aClass20_21.aClass20_24;
	}

	@OriginalMember(owner = "client!um", name = "b", descriptor = "(I)Lclient!jt;")
	public Class20 method5576() {
		@Pc(11) Class20 local11 = this.aClass20_21.aClass20_23;
		if (local11 == this.aClass20_21) {
			this.aClass20_22 = null;
			return null;
		} else {
			this.aClass20_22 = local11.aClass20_23;
			return local11;
		}
	}

	@OriginalMember(owner = "client!um", name = "c", descriptor = "(I)Lclient!jt;")
	public Class20 method5577() {
		@Pc(11) Class20 local11 = this.aClass20_22;
		if (this.aClass20_21 == local11) {
			this.aClass20_22 = null;
			return null;
		} else {
			this.aClass20_22 = local11.aClass20_24;
			return local11;
		}
	}

	@OriginalMember(owner = "client!um", name = "d", descriptor = "(I)I")
	public int method5580() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class20 local16 = this.aClass20_21.aClass20_24;
		while (local16 != this.aClass20_21) {
			local16 = local16.aClass20_24;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
	public void method5581() {
		while (true) {
			@Pc(5) Class20 local5 = this.aClass20_21.aClass20_24;
			if (this.aClass20_21 == local5) {
				this.aClass20_22 = null;
				return;
			}
			local5.method5771();
		}
	}

	@OriginalMember(owner = "client!um", name = "f", descriptor = "(I)Lclient!jt;")
	public Class20 method5582() {
		@Pc(7) Class20 local7 = this.aClass20_21.aClass20_24;
		if (local7 == this.aClass20_21) {
			return null;
		} else {
			local7.method5771();
			return local7;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(B)Lclient!jt;")
	public Class20 method5583() {
		@Pc(7) Class20 local7 = this.aClass20_21.aClass20_24;
		if (this.aClass20_21 == local7) {
			this.aClass20_22 = null;
			return null;
		} else {
			this.aClass20_22 = local7.aClass20_24;
			return local7;
		}
	}

	@OriginalMember(owner = "client!um", name = "a", descriptor = "(Lclient!jt;I)V")
	public void method5585(@OriginalArg(0) Class20 arg0) {
		if (arg0.aClass20_23 != null) {
			arg0.method5771();
		}
		arg0.aClass20_24 = this.aClass20_21;
		arg0.aClass20_23 = this.aClass20_21.aClass20_23;
		arg0.aClass20_23.aClass20_24 = arg0;
		arg0.aClass20_24.aClass20_23 = arg0;
	}
}
