import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class99 {

	@OriginalMember(owner = "client!fa", name = "u", descriptor = "Lclient!fu;")
	private Class4 aClass4_28;

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "Lclient!fu;")
	private final Class4 aClass4_27 = new Class4();

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class99() {
		this.aClass4_27.aClass4_68 = this.aClass4_27;
		this.aClass4_27.aClass4_67 = this.aClass4_27;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)I")
	public int method2035() {
		@Pc(12) int local12 = 0;
		@Pc(16) Class4 local16 = this.aClass4_27.aClass4_68;
		while (local16 != this.aClass4_27) {
			local16 = local16.aClass4_68;
			local12++;
		}
		return local12;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)Z")
	public boolean method2036() {
		return this.aClass4_27.aClass4_68 == this.aClass4_27;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!fu;Z)V")
	public void method2039(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_67 != null) {
			arg0.method8713();
		}
		arg0.aClass4_67 = this.aClass4_27.aClass4_67;
		arg0.aClass4_68 = this.aClass4_27;
		arg0.aClass4_67.aClass4_68 = arg0;
		arg0.aClass4_68.aClass4_67 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Lclient!fu;")
	public Class4 method2040() {
		@Pc(12) Class4 local12 = this.aClass4_27.aClass4_67;
		if (this.aClass4_27 == local12) {
			this.aClass4_28 = null;
			return null;
		} else {
			this.aClass4_28 = local12.aClass4_67;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
	public void method2042() {
		while (true) {
			@Pc(15) Class4 local15 = this.aClass4_27.aClass4_68;
			if (local15 == this.aClass4_27) {
				this.aClass4_28 = null;
				return;
			}
			local15.method8713();
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lclient!fu;")
	public Class4 method2044() {
		@Pc(7) Class4 local7 = this.aClass4_27.aClass4_68;
		if (local7 == this.aClass4_27) {
			return null;
		} else {
			local7.method8713();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fa", name = "f", descriptor = "(I)Lclient!fu;")
	public Class4 method2045() {
		@Pc(12) Class4 local12 = this.aClass4_27.aClass4_68;
		if (this.aClass4_27 == local12) {
			this.aClass4_28 = null;
			return null;
		} else {
			this.aClass4_28 = local12.aClass4_68;
			return local12;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lclient!fu;")
	public Class4 method2047() {
		@Pc(6) Class4 local6 = this.aClass4_28;
		if (local6 == this.aClass4_27) {
			this.aClass4_28 = null;
			return null;
		} else {
			this.aClass4_28 = local6.aClass4_68;
			return local6;
		}
	}
}
