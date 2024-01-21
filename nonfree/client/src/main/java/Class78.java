import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!vf")
public final class Class78 {

	@OriginalMember(owner = "client!vf", name = "v", descriptor = "Lclient!ec;")
	private Class4 aClass4_124;

	@OriginalMember(owner = "client!vf", name = "n", descriptor = "Lclient!ec;")
	public final Class4 aClass4_123 = new Class4();

	@OriginalMember(owner = "client!vf", name = "<init>", descriptor = "()V")
	public Class78() {
		this.aClass4_123.aClass4_127 = this.aClass4_123;
		this.aClass4_123.aClass4_128 = this.aClass4_123;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ec;Z)V")
	public void method1914(@OriginalArg(0) Class4 arg0) {
		if (arg0.aClass4_128 != null) {
			arg0.method2004();
		}
		arg0.aClass4_128 = this.aClass4_123.aClass4_128;
		arg0.aClass4_127 = this.aClass4_123;
		arg0.aClass4_128.aClass4_127 = arg0;
		arg0.aClass4_127.aClass4_128 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(ILclient!ec;)V")
	public void method1915(@OriginalArg(1) Class4 arg0) {
		if (arg0.aClass4_128 != null) {
			arg0.method2004();
		}
		arg0.aClass4_128 = this.aClass4_123;
		arg0.aClass4_127 = this.aClass4_123.aClass4_127;
		arg0.aClass4_128.aClass4_127 = arg0;
		arg0.aClass4_127.aClass4_128 = arg0;
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(I)Lclient!ec;")
	public Class4 method1916() {
		@Pc(12) Class4 local12 = this.aClass4_123.aClass4_127;
		if (this.aClass4_123 == local12) {
			this.aClass4_124 = null;
			return null;
		} else {
			this.aClass4_124 = local12.aClass4_127;
			return local12;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(I)Lclient!ec;")
	public Class4 method1919() {
		@Pc(13) Class4 local13 = this.aClass4_123.aClass4_127;
		if (local13 == this.aClass4_123) {
			return null;
		} else {
			local13.method2004();
			return local13;
		}
	}

	@OriginalMember(owner = "client!vf", name = "c", descriptor = "(I)Lclient!ec;")
	public Class4 method1920() {
		@Pc(6) Class4 local6 = this.aClass4_124;
		if (this.aClass4_123 == local6) {
			this.aClass4_124 = null;
			return null;
		} else {
			this.aClass4_124 = local6.aClass4_127;
			return local6;
		}
	}

	@OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)Lclient!ec;")
	public Class4 method1921() {
		@Pc(3) Class4 local3 = this.aClass4_123.aClass4_128;
		if (this.aClass4_123 == local3) {
			return null;
		} else {
			local3.method2004();
			return local3;
		}
	}

	@OriginalMember(owner = "client!vf", name = "b", descriptor = "(B)V")
	public void method1923() {
		while (true) {
			@Pc(11) Class4 local11 = this.aClass4_123.aClass4_127;
			if (this.aClass4_123 == local11) {
				return;
			}
			local11.method2004();
		}
	}

	@OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)Lclient!ec;")
	public Class4 method1924() {
		@Pc(7) Class4 local7 = this.aClass4_123.aClass4_128;
		if (this.aClass4_123 == local7) {
			this.aClass4_124 = null;
			return null;
		} else {
			this.aClass4_124 = local7.aClass4_128;
			return local7;
		}
	}

	@OriginalMember(owner = "client!vf", name = "a", descriptor = "(Lclient!ec;Lclient!ec;B)V")
	public void method1925(@OriginalArg(0) Class4 arg0, @OriginalArg(1) Class4 arg1) {
		if (arg1.aClass4_128 != null) {
			arg1.method2004();
		}
		arg1.aClass4_127 = arg0;
		arg1.aClass4_128 = arg0.aClass4_128;
		arg1.aClass4_128.aClass4_127 = arg1;
		arg1.aClass4_127.aClass4_128 = arg1;
	}

	@OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)Lclient!ec;")
	public Class4 method1927() {
		@Pc(10) Class4 local10 = this.aClass4_124;
		if (this.aClass4_123 == local10) {
			this.aClass4_124 = null;
			return null;
		} else {
			this.aClass4_124 = local10.aClass4_128;
			return local10;
		}
	}
}
