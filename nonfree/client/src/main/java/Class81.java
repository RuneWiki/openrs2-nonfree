import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eia")
public final class Class81 {

	@OriginalMember(owner = "client!eia", name = "q", descriptor = "Lclient!gda;")
	private Class20 aClass20_30;

	@OriginalMember(owner = "client!eia", name = "n", descriptor = "Lclient!gda;")
	private final Class20 aClass20_29 = new Class20();

	@OriginalMember(owner = "client!eia", name = "<init>", descriptor = "()V")
	public Class81() {
		this.aClass20_29.aClass20_68 = this.aClass20_29;
		this.aClass20_29.aClass20_67 = this.aClass20_29;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(B)Lclient!gda;")
	public Class20 method2118() {
		@Pc(19) Class20 local19 = this.aClass20_29.aClass20_67;
		if (local19 == this.aClass20_29) {
			this.aClass20_30 = null;
			return null;
		} else {
			this.aClass20_30 = local19.aClass20_67;
			return local19;
		}
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(ILclient!gda;)V")
	public void method2119(@OriginalArg(1) Class20 arg0) {
		if (arg0.aClass20_68 != null) {
			arg0.method9004();
		}
		arg0.aClass20_68 = this.aClass20_29.aClass20_68;
		arg0.aClass20_67 = this.aClass20_29;
		arg0.aClass20_68.aClass20_67 = arg0;
		arg0.aClass20_67.aClass20_68 = arg0;
	}

	@OriginalMember(owner = "client!eia", name = "a", descriptor = "(Z)Lclient!gda;")
	public Class20 method2120() {
		@Pc(14) Class20 local14 = this.aClass20_29.aClass20_68;
		if (local14 == this.aClass20_29) {
			this.aClass20_30 = null;
			return null;
		} else {
			this.aClass20_30 = local14.aClass20_68;
			return local14;
		}
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(B)V")
	public void method2122() {
		while (true) {
			@Pc(5) Class20 local5 = this.aClass20_29.aClass20_67;
			if (this.aClass20_29 == local5) {
				this.aClass20_30 = null;
				return;
			}
			local5.method9004();
		}
	}

	@OriginalMember(owner = "client!eia", name = "b", descriptor = "(I)I")
	public int method2125() {
		@Pc(7) int local7 = 0;
		for (@Pc(11) Class20 local11 = this.aClass20_29.aClass20_67; local11 != this.aClass20_29; local11 = local11.aClass20_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!eia", name = "c", descriptor = "(I)Lclient!gda;")
	public Class20 method2127() {
		@Pc(7) Class20 local7 = this.aClass20_29.aClass20_67;
		if (local7 == this.aClass20_29) {
			return null;
		} else {
			local7.method9004();
			return local7;
		}
	}

	@OriginalMember(owner = "client!eia", name = "d", descriptor = "(I)Lclient!gda;")
	public Class20 method2128() {
		@Pc(11) Class20 local11 = this.aClass20_30;
		if (this.aClass20_29 == local11) {
			this.aClass20_30 = null;
			return null;
		} else {
			this.aClass20_30 = local11.aClass20_67;
			return local11;
		}
	}

	@OriginalMember(owner = "client!eia", name = "e", descriptor = "(I)Z")
	public boolean method2130() {
		return this.aClass20_29 == this.aClass20_29.aClass20_67;
	}
}
