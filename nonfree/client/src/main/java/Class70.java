import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tb")
public final class Class70 {

	@OriginalMember(owner = "client!tb", name = "u", descriptor = "Lclient!cb;")
	private Class4 aClass4_110;

	@OriginalMember(owner = "client!tb", name = "r", descriptor = "Lclient!cb;")
	public final Class4 aClass4_109 = new Class4();

	@OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V")
	public Class70() {
		this.aClass4_109.aClass4_123 = this.aClass4_109;
		this.aClass4_109.aClass4_124 = this.aClass4_109;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Lclient!cb;I)V")
	public void method1927(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_124 != null) {
			arg0.method2124();
		}
		arg0.aClass4_123 = this.aClass4_109.aClass4_123;
		arg0.aClass4_124 = this.aClass4_109;
		arg0.aClass4_124.aClass4_123 = arg0;
		arg0.aClass4_123.aClass4_124 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!cb;Lclient!cb;)V")
	public void method1929(@OriginalArg(1) Class4 arg0, @OriginalArg(2) Class4 arg1) {
		if (arg0.aClass4_124 != null) {
			arg0.method2124();
		}
		arg0.aClass4_124 = arg1.aClass4_124;
		arg0.aClass4_123 = arg1;
		arg0.aClass4_124.aClass4_123 = arg0;
		arg0.aClass4_123.aClass4_124 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)Lclient!cb;")
	public Class4 method1930() {
		@Pc(7) Class4 local7 = this.aClass4_109.aClass4_124;
		if (local7 == this.aClass4_109) {
			this.aClass4_110 = null;
			return null;
		} else {
			this.aClass4_110 = local7.aClass4_124;
			return local7;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(ILclient!cb;)V")
	public void method1931(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_124 != null) {
			arg0.method2124();
		}
		arg0.aClass4_124 = this.aClass4_109.aClass4_124;
		arg0.aClass4_123 = this.aClass4_109;
		arg0.aClass4_124.aClass4_123 = arg0;
		arg0.aClass4_123.aClass4_124 = arg0;
	}

	@OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)Lclient!cb;")
	public Class4 method1932() {
		@Pc(15) Class4 local15 = this.aClass4_109.aClass4_123;
		if (this.aClass4_109 == local15) {
			return null;
		} else {
			local15.method2124();
			return local15;
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V")
	public void method1933() {
		while (true) {
			@Pc(12) Class4 local12 = this.aClass4_109.aClass4_123;
			if (this.aClass4_109 == local12) {
				return;
			}
			local12.method2124();
		}
	}

	@OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)Lclient!cb;")
	public Class4 method1936() {
		@Pc(11) Class4 local11 = this.aClass4_110;
		if (local11 == this.aClass4_109) {
			this.aClass4_110 = null;
			return null;
		} else {
			this.aClass4_110 = local11.aClass4_123;
			return local11;
		}
	}

	@OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)Lclient!cb;")
	public Class4 method1937() {
		@Pc(6) Class4 local6 = this.aClass4_110;
		if (local6 == this.aClass4_109) {
			this.aClass4_110 = null;
			return null;
		} else {
			this.aClass4_110 = local6.aClass4_124;
			return local6;
		}
	}

	@OriginalMember(owner = "client!tb", name = "e", descriptor = "(I)Lclient!cb;")
	public Class4 method1938() {
		@Pc(3) Class4 local3 = this.aClass4_109.aClass4_124;
		if (this.aClass4_109 == local3) {
			return null;
		} else {
			local3.method2124();
			return local3;
		}
	}

	@OriginalMember(owner = "client!tb", name = "f", descriptor = "(I)Lclient!cb;")
	public Class4 method1939() {
		@Pc(7) Class4 local7 = this.aClass4_109.aClass4_123;
		if (local7 == this.aClass4_109) {
			this.aClass4_110 = null;
			return null;
		} else {
			this.aClass4_110 = local7.aClass4_123;
			return local7;
		}
	}
}
