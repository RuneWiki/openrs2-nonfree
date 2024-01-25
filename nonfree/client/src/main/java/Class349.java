import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vu")
public final class Class349 {

	@OriginalMember(owner = "client!vu", name = "p", descriptor = "Lclient!cv;")
	private Class20 aClass20_66;

	@OriginalMember(owner = "client!vu", name = "n", descriptor = "Lclient!cv;")
	private final Class20 aClass20_65 = new Class20();

	@OriginalMember(owner = "client!vu", name = "<init>", descriptor = "()V")
	public Class349() {
		this.aClass20_65.aClass20_67 = this.aClass20_65;
		this.aClass20_65.aClass20_68 = this.aClass20_65;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(B)Lclient!cv;")
	public Class20 method7653() {
		@Pc(7) Class20 local7 = this.aClass20_65.aClass20_67;
		if (this.aClass20_65 == local7) {
			this.aClass20_66 = null;
			return null;
		} else {
			this.aClass20_66 = local7.aClass20_67;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(I)I")
	public int method7654() {
		@Pc(7) int local7 = 0;
		for (@Pc(16) Class20 local16 = this.aClass20_65.aClass20_67; local16 != this.aClass20_65; local16 = local16.aClass20_67) {
			local7++;
		}
		return local7;
	}

	@OriginalMember(owner = "client!vu", name = "a", descriptor = "(Lclient!cv;I)V")
	public void method7655(@OriginalArg(0) Class20 arg0) {
		if (arg0.aClass20_68 != null) {
			arg0.method7704();
		}
		arg0.aClass20_67 = this.aClass20_65;
		arg0.aClass20_68 = this.aClass20_65.aClass20_68;
		arg0.aClass20_68.aClass20_67 = arg0;
		arg0.aClass20_67.aClass20_68 = arg0;
	}

	@OriginalMember(owner = "client!vu", name = "b", descriptor = "(B)Z")
	public boolean method7656() {
		return this.aClass20_65.aClass20_67 == this.aClass20_65;
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(I)Lclient!cv;")
	public Class20 method7658() {
		@Pc(11) Class20 local11 = this.aClass20_65.aClass20_67;
		if (this.aClass20_65 == local11) {
			return null;
		} else {
			local11.method7704();
			return local11;
		}
	}

	@OriginalMember(owner = "client!vu", name = "c", descriptor = "(B)Lclient!cv;")
	public Class20 method7659() {
		@Pc(12) Class20 local12 = this.aClass20_65.aClass20_68;
		if (this.aClass20_65 == local12) {
			this.aClass20_66 = null;
			return null;
		} else {
			this.aClass20_66 = local12.aClass20_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vu", name = "d", descriptor = "(B)Lclient!cv;")
	public Class20 method7660() {
		@Pc(11) Class20 local11 = this.aClass20_66;
		if (local11 == this.aClass20_65) {
			this.aClass20_66 = null;
			return null;
		} else {
			this.aClass20_66 = local11.aClass20_67;
			return local11;
		}
	}

	@OriginalMember(owner = "client!vu", name = "e", descriptor = "(B)V")
	public void method7661() {
		while (true) {
			@Pc(5) Class20 local5 = this.aClass20_65.aClass20_67;
			if (this.aClass20_65 == local5) {
				this.aClass20_66 = null;
				return;
			}
			local5.method7704();
		}
	}
}
