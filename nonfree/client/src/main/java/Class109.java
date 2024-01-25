import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jl")
public final class Class109 {

	@OriginalMember(owner = "client!jl", name = "q", descriptor = "Lclient!kc;")
	private Class20 aClass20_18;

	@OriginalMember(owner = "client!jl", name = "p", descriptor = "Lclient!kc;")
	private final Class20 aClass20_17 = new Class20();

	@OriginalMember(owner = "client!jl", name = "<init>", descriptor = "()V")
	public Class109() {
		this.aClass20_17.aClass20_24 = this.aClass20_17;
		this.aClass20_17.aClass20_23 = this.aClass20_17;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(ILclient!kc;)V")
	public void method2935(@OriginalArg(1) Class20 arg0) {
		if (arg0.aClass20_23 != null) {
			arg0.method5103();
		}
		arg0.aClass20_23 = this.aClass20_17.aClass20_23;
		arg0.aClass20_24 = this.aClass20_17;
		arg0.aClass20_23.aClass20_24 = arg0;
		arg0.aClass20_24.aClass20_23 = arg0;
	}

	@OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)Z")
	public boolean method2937() {
		return this.aClass20_17 == this.aClass20_17.aClass20_24;
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(I)Lclient!kc;")
	public Class20 method2939() {
		@Pc(10) Class20 local10 = this.aClass20_18;
		if (local10 == this.aClass20_17) {
			this.aClass20_18 = null;
			return null;
		} else {
			this.aClass20_18 = local10.aClass20_24;
			return local10;
		}
	}

	@OriginalMember(owner = "client!jl", name = "c", descriptor = "(I)Lclient!kc;")
	public Class20 method2940() {
		@Pc(7) Class20 local7 = this.aClass20_17.aClass20_24;
		if (this.aClass20_17 == local7) {
			return null;
		} else {
			local7.method5103();
			return local7;
		}
	}

	@OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)Lclient!kc;")
	public Class20 method2941() {
		@Pc(15) Class20 local15 = this.aClass20_17.aClass20_23;
		if (local15 == this.aClass20_17) {
			this.aClass20_18 = null;
			return null;
		} else {
			this.aClass20_18 = local15.aClass20_23;
			return local15;
		}
	}

	@OriginalMember(owner = "client!jl", name = "d", descriptor = "(I)V")
	public void method2946() {
		while (true) {
			@Pc(13) Class20 local13 = this.aClass20_17.aClass20_24;
			if (local13 == this.aClass20_17) {
				this.aClass20_18 = null;
				return;
			}
			local13.method5103();
		}
	}

	@OriginalMember(owner = "client!jl", name = "e", descriptor = "(I)I")
	public int method2947() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class20 local16 = this.aClass20_17.aClass20_24; local16 != this.aClass20_17; local16 = local16.aClass20_24) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!jl", name = "f", descriptor = "(I)Lclient!kc;")
	public Class20 method2948() {
		@Pc(7) Class20 local7 = this.aClass20_17.aClass20_24;
		if (local7 == this.aClass20_17) {
			this.aClass20_18 = null;
			return null;
		} else {
			this.aClass20_18 = local7.aClass20_24;
			return local7;
		}
	}
}
