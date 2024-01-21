import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fa")
public final class Class22 {

	@OriginalMember(owner = "client!fa", name = "x", descriptor = "Lclient!lc;")
	private Class1 aClass1_22;

	@OriginalMember(owner = "client!fa", name = "s", descriptor = "Lclient!lc;")
	public final Class1 aClass1_21 = new Class1();

	@OriginalMember(owner = "client!fa", name = "<init>", descriptor = "()V")
	public Class22() {
		this.aClass1_21.aClass1_95 = this.aClass1_21;
		this.aClass1_21.aClass1_96 = this.aClass1_21;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!lc;I)V")
	public void method512(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_96 != null) {
			arg0.method1825();
		}
		arg0.aClass1_96 = this.aClass1_21.aClass1_96;
		arg0.aClass1_95 = this.aClass1_21;
		arg0.aClass1_96.aClass1_95 = arg0;
		arg0.aClass1_95.aClass1_96 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Lclient!lc;I)V")
	public void method513(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_96 != null) {
			arg0.method1825();
		}
		arg0.aClass1_95 = this.aClass1_21.aClass1_95;
		arg0.aClass1_96 = this.aClass1_21;
		arg0.aClass1_96.aClass1_95 = arg0;
		arg0.aClass1_95.aClass1_96 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)Lclient!lc;")
	public Class1 method514() {
		@Pc(7) Class1 local7 = this.aClass1_21.aClass1_96;
		if (this.aClass1_21 == local7) {
			this.aClass1_22 = null;
			return null;
		} else {
			this.aClass1_22 = local7.aClass1_96;
			return local7;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)Lclient!lc;")
	public Class1 method515() {
		@Pc(3) Class1 local3 = this.aClass1_21.aClass1_95;
		if (this.aClass1_21 == local3) {
			this.aClass1_22 = null;
			return null;
		} else {
			this.aClass1_22 = local3.aClass1_95;
			return local3;
		}
	}

	@OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)Lclient!lc;")
	public Class1 method517() {
		@Pc(7) Class1 local7 = this.aClass1_21.aClass1_95;
		if (this.aClass1_21 == local7) {
			return null;
		} else {
			local7.method1825();
			return local7;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Z)Lclient!lc;")
	public Class1 method518() {
		@Pc(6) Class1 local6 = this.aClass1_22;
		if (this.aClass1_21 == local6) {
			this.aClass1_22 = null;
			return null;
		} else {
			this.aClass1_22 = local6.aClass1_96;
			return local6;
		}
	}

	@OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)Lclient!lc;")
	public Class1 method519() {
		@Pc(2) Class1 local2 = this.aClass1_22;
		if (local2 == this.aClass1_21) {
			this.aClass1_22 = null;
			return null;
		} else {
			this.aClass1_22 = local2.aClass1_95;
			return local2;
		}
	}

	@OriginalMember(owner = "client!fa", name = "a", descriptor = "(Lclient!lc;ZLclient!lc;)V")
	public void method520(@OriginalArg(0) Class1 arg0, @OriginalArg(2) Class1 arg1) {
		if (arg0.aClass1_96 != null) {
			arg0.method1825();
		}
		arg0.aClass1_95 = arg1;
		arg0.aClass1_96 = arg1.aClass1_96;
		arg0.aClass1_96.aClass1_95 = arg0;
		arg0.aClass1_95.aClass1_96 = arg0;
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(B)Lclient!lc;")
	public Class1 method521() {
		@Pc(3) Class1 local3 = this.aClass1_21.aClass1_96;
		if (local3 == this.aClass1_21) {
			return null;
		} else {
			local3.method1825();
			return local3;
		}
	}

	@OriginalMember(owner = "client!fa", name = "b", descriptor = "(Z)V")
	public void method523() {
		while (true) {
			@Pc(15) Class1 local15 = this.aClass1_21.aClass1_95;
			if (this.aClass1_21 == local15) {
				return;
			}
			local15.method1825();
		}
	}
}
