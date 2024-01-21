import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nd")
public final class Class53 {

	@OriginalMember(owner = "client!nd", name = "t", descriptor = "Lclient!te;")
	private Class1 aClass1_86;

	@OriginalMember(owner = "client!nd", name = "h", descriptor = "Lclient!te;")
	public final Class1 aClass1_85 = new Class1();

	@OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
	public Class53() {
		this.aClass1_85.aClass1_123 = this.aClass1_85;
		this.aClass1_85.aClass1_124 = this.aClass1_85;
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)Lclient!te;")
	public Class1 method1442() {
		@Pc(13) Class1 local13 = this.aClass1_85.aClass1_124;
		if (local13 == this.aClass1_85) {
			this.aClass1_86 = null;
			return null;
		} else {
			this.aClass1_86 = local13.aClass1_124;
			return local13;
		}
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)Lclient!te;")
	public Class1 method1443() {
		@Pc(13) Class1 local13 = this.aClass1_86;
		if (this.aClass1_85 == local13) {
			this.aClass1_86 = null;
			return null;
		} else {
			this.aClass1_86 = local13.aClass1_123;
			return local13;
		}
	}

	@OriginalMember(owner = "client!nd", name = "c", descriptor = "(I)Lclient!te;")
	public Class1 method1444() {
		@Pc(14) Class1 local14 = this.aClass1_85.aClass1_123;
		if (this.aClass1_85 == local14) {
			this.aClass1_86 = null;
			return null;
		} else {
			this.aClass1_86 = local14.aClass1_123;
			return local14;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)Lclient!te;")
	public Class1 method1445() {
		@Pc(3) Class1 local3 = this.aClass1_85.aClass1_123;
		if (local3 == this.aClass1_85) {
			return null;
		} else {
			local3.method2220();
			return local3;
		}
	}

	@OriginalMember(owner = "client!nd", name = "d", descriptor = "(I)V")
	public void method1446() {
		while (true) {
			@Pc(11) Class1 local11 = this.aClass1_85.aClass1_124;
			if (local11 == this.aClass1_85) {
				return;
			}
			local11.method2220();
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!te;I)V")
	public void method1449(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_123 != null) {
			arg0.method2220();
		}
		arg0.aClass1_124 = this.aClass1_85;
		arg0.aClass1_123 = this.aClass1_85.aClass1_123;
		arg0.aClass1_123.aClass1_124 = arg0;
		arg0.aClass1_124.aClass1_123 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "f", descriptor = "(I)Lclient!te;")
	public Class1 method1450() {
		@Pc(6) Class1 local6 = this.aClass1_86;
		if (this.aClass1_85 == local6) {
			this.aClass1_86 = null;
			return null;
		} else {
			this.aClass1_86 = local6.aClass1_124;
			return local6;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!te;Z)V")
	public void method1451(@OriginalArg(0) Class1 arg0) {
		if (arg0.aClass1_123 != null) {
			arg0.method2220();
		}
		arg0.aClass1_123 = this.aClass1_85;
		arg0.aClass1_124 = this.aClass1_85.aClass1_124;
		arg0.aClass1_123.aClass1_124 = arg0;
		arg0.aClass1_124.aClass1_123 = arg0;
	}

	@OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)Lclient!te;")
	public Class1 method1452() {
		@Pc(7) Class1 local7 = this.aClass1_85.aClass1_124;
		if (local7 == this.aClass1_85) {
			return null;
		} else {
			local7.method2220();
			return local7;
		}
	}

	@OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lclient!te;Lclient!te;I)V")
	public void method1453(@OriginalArg(0) Class1 arg0, @OriginalArg(1) Class1 arg1) {
		if (arg1.aClass1_123 != null) {
			arg1.method2220();
		}
		arg1.aClass1_123 = arg0.aClass1_123;
		arg1.aClass1_124 = arg0;
		arg1.aClass1_123.aClass1_124 = arg1;
		arg1.aClass1_124.aClass1_123 = arg1;
	}
}
