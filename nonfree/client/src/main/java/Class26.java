import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ci")
public final class Class26 {

	@OriginalMember(owner = "client!ci", name = "y", descriptor = "Lclient!ec;")
	private Class1 aClass1_24;

	@OriginalMember(owner = "client!ci", name = "j", descriptor = "Lclient!ec;")
	public Class1 aClass1_23 = new Class1();

	@OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
	public Class26() {
		this.aClass1_23.aClass1_233 = this.aClass1_23;
		this.aClass1_23.aClass1_232 = this.aClass1_23;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZLclient!ec;)V")
	public void method665(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_232 != null) {
			arg0.method4767();
		}
		arg0.aClass1_233 = this.aClass1_23.aClass1_233;
		arg0.aClass1_232 = this.aClass1_23;
		arg0.aClass1_232.aClass1_233 = arg0;
		arg0.aClass1_233.aClass1_232 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)Lclient!ec;")
	public Class1 method666() {
		@Pc(9) Class1 local9 = this.aClass1_23.aClass1_233;
		if (this.aClass1_23 == local9) {
			this.aClass1_24 = null;
			return null;
		} else {
			this.aClass1_24 = local9.aClass1_233;
			return local9;
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
	public void method667() {
		while (true) {
			@Pc(5) Class1 local5 = this.aClass1_23.aClass1_233;
			if (this.aClass1_23 == local5) {
				this.aClass1_24 = null;
				return;
			}
			local5.method4767();
		}
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(BLclient!ec;)V")
	public void method668(@OriginalArg(1) Class1 arg0) {
		if (arg0.aClass1_232 != null) {
			arg0.method4767();
		}
		arg0.aClass1_233 = this.aClass1_23;
		arg0.aClass1_232 = this.aClass1_23.aClass1_232;
		arg0.aClass1_232.aClass1_233 = arg0;
		arg0.aClass1_233.aClass1_232 = arg0;
	}

	@OriginalMember(owner = "client!ci", name = "c", descriptor = "(I)Lclient!ec;")
	public Class1 method670() {
		@Pc(2) Class1 local2 = this.aClass1_24;
		if (local2 == this.aClass1_23) {
			this.aClass1_24 = null;
			return null;
		} else {
			this.aClass1_24 = local2.aClass1_232;
			return local2;
		}
	}

	@OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)Lclient!ec;")
	public Class1 method672() {
		@Pc(11) Class1 local11 = this.aClass1_24;
		if (local11 == this.aClass1_23) {
			this.aClass1_24 = null;
			return null;
		} else {
			this.aClass1_24 = local11.aClass1_233;
			return local11;
		}
	}

	@OriginalMember(owner = "client!ci", name = "b", descriptor = "(B)Lclient!ec;")
	public Class1 method673() {
		@Pc(7) Class1 local7 = this.aClass1_23.aClass1_233;
		if (local7 == this.aClass1_23) {
			return null;
		} else {
			local7.method4767();
			return local7;
		}
	}

	@OriginalMember(owner = "client!ci", name = "e", descriptor = "(I)Z")
	public boolean method674() {
		return this.aClass1_23.aClass1_233 == this.aClass1_23;
	}

	@OriginalMember(owner = "client!ci", name = "a", descriptor = "(Z)Lclient!ec;")
	public Class1 method677() {
		@Pc(3) Class1 local3 = this.aClass1_23.aClass1_232;
		if (this.aClass1_23 == local3) {
			this.aClass1_24 = null;
			return null;
		} else {
			this.aClass1_24 = local3.aClass1_232;
			return local3;
		}
	}
}
